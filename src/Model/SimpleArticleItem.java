package Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * listview 用到的简单实体类
 * 只包括 aid，标题，发布日期，阅读次数
 * 没有新闻主体内容等
 *
 * @author tomchen
 */

public class SimpleArticleItem {

    // type 是数字 1表示新闻通知 2本科教学 见 ColumnType
    private int type;
    private int id;
    private String[] imageUrls;
    // 图片资源不是必须的
    private String title;
    private String publishDate;
    private int readTimes;

    private String summary;

    public SimpleArticleItem() {

    }

    public SimpleArticleItem(int id, String[] imageUrls, String title, String publishDate, int readTimes, int type) {
        this.id = id;
        this.imageUrls = imageUrls;
        this.title = title;
        this.publishDate = publishDate;
        this.readTimes = readTimes;
        this.type = type;
    }

    public SimpleArticleItem(int id, String[] imageUrls, String title, String publishDate, int readTimes,
                             String summary, int type) {
        this.id = id;
        this.imageUrls = imageUrls;
        this.title = title;
        this.publishDate = publishDate;
        this.readTimes = readTimes;
        this.summary = summary;
        this.type = type;
    }

    /**
     * 这个的设计不是很好
     * 存储轮播图片
     */
    public SimpleArticleItem(int id, String[] imageUrls, String title, int type) {
        this.id = id;
        this.imageUrls = imageUrls;
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "type->" + type +
                ",aid->" + id +
                ",imageUrls->" + Arrays.toString(imageUrls).replace("[", "").replace("]", "") +
                ",title->" + title +
                ",publishDate->" + publishDate +
                ",readTimes->" + readTimes +
                ",summary->" + summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrls() {
        String imageUrl = Arrays.toString(imageUrls)
                .replace("[", "")
                .replace("]", "");
        return imageUrl;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = df.parse(publishDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getReadTimes() {
        return readTimes;
    }

    public void setReadTimes(int readTimes) {
        this.readTimes = readTimes;
    }

}