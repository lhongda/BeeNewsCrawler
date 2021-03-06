package Model;

/**
 * model/ItemNews.java 新闻详情页面用到的完整实体类 新闻实体类 包括标题，发布日期，阅读次数，新闻主体内容等
 *
 * @author tomchen
 */

public class ArticleItem extends SimpleArticleItem {
    // 图片资源不是必须的
    private String source;
    private String body;

    public ArticleItem() {
    }

    public ArticleItem(int id, String[] imageUrls, String title,
                       String publishDate, int readTimes, String source, String body, int type) {
        super(id, imageUrls, title, publishDate, readTimes, type);
        this.source = source;
        this.body = body;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "aid->" + getId() +
                ",\nimageUrls->" + getImageUrls() +
                ",\ntitle->" + getTitle() +
                ",\npublishDate->" + getPublishDate() +
                ",\nsource->" + source +
                ",\nreadTimes->" + getReadTimes() +
                ",\nbody->" + body;
    }
}