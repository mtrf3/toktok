package com.ss.android.ugc.aweme.discover.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class Movie implements Serializable {

    @InterfaceC65349Pkn("challenge_id")
    public String challengeId;

    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("dtime")
    public String dtime;

    @InterfaceC65349Pkn("episodes")
    public int episodes;

    @InterfaceC65349Pkn("img")
    public String img;

    @InterfaceC65349Pkn("is_medium_anchor")
    public Boolean isMediumAnchor;
    public boolean isNewStyleCard;

    @InterfaceC65349Pkn("is_collect")
    public boolean is_collect;

    @InterfaceC65349Pkn("light_app_tickets_url")
    public String light_app_tickets_url;

    @InterfaceC65349Pkn("light_app_url")
    public String light_app_url;

    @InterfaceC65349Pkn("loc")
    public String loc;

    @InterfaceC65349Pkn("maoyan_score")
    public String maoyan_score;

    @InterfaceC65349Pkn("maoyan_score_url")
    public String maoyan_score_url;

    @InterfaceC65349Pkn("medium_type")
    public int medium_type;

    @InterfaceC65349Pkn("medium_ui_style")
    public int medium_ui_style = -1;

    @InterfaceC65349Pkn("rank")
    public String rank;

    @InterfaceC65349Pkn("rate_text")
    public String rateText;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("showurl")
    public String showurl;

    @InterfaceC65349Pkn("stat")
    public Integer stat;

    @InterfaceC65349Pkn("stat_text")
    public String statText;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("tmaid")
    public String tmaid;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("url")
    public String url;

    @InterfaceC65349Pkn("wish")
    public Integer wish;

    public final float getMaoyanScore() {
        String str = this.maoyan_score;
        if (str != null) {
            try {
                return CastFloatProtector.parseFloat(str) / 2;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final int getMedium_ui_style() {
        int i = this.medium_ui_style;
        if (i == -1) {
            int i2 = this.medium_type;
            if (i2 == 1 || i2 == 9) {
                return 1;
            }
            if (i2 == 4 || i2 == 8) {
                return 2;
            }
            return 0;
        }
        return i;
    }

    public final int getMovieRank() {
        String str = this.rank;
        if (str != null) {
            try {
                return CastIntegerProtector.parseInt(str);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return 0;
            }
        }
        return 0;
    }

    public final boolean isMovie() {
        if (this.medium_type == 3) {
            return true;
        }
        return false;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getDtime() {
        return this.dtime;
    }

    public final int getEpisodes() {
        return this.episodes;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getLight_app_tickets_url() {
        return this.light_app_tickets_url;
    }

    public final String getLight_app_url() {
        return this.light_app_url;
    }

    public final String getLoc() {
        return this.loc;
    }

    public final String getMaoyan_score() {
        return this.maoyan_score;
    }

    public final String getMaoyan_score_url() {
        return this.maoyan_score_url;
    }

    public final int getMedium_type() {
        return this.medium_type;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getRateText() {
        return this.rateText;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getShowurl() {
        return this.showurl;
    }

    public final Integer getStat() {
        return this.stat;
    }

    public final String getStatText() {
        return this.statText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTmaid() {
        return this.tmaid;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWish() {
        return this.wish;
    }

    public final Boolean isMediumAnchor() {
        return this.isMediumAnchor;
    }

    public final boolean isNewStyleCard() {
        return this.isNewStyleCard;
    }

    public final boolean is_collect() {
        return this.is_collect;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setDtime(String str) {
        this.dtime = str;
    }

    public final void setEpisodes(int i) {
        this.episodes = i;
    }

    public final void setImg(String str) {
        this.img = str;
    }

    public final void setLight_app_tickets_url(String str) {
        this.light_app_tickets_url = str;
    }

    public final void setLight_app_url(String str) {
        this.light_app_url = str;
    }

    public final void setLoc(String str) {
        this.loc = str;
    }

    public final void setMaoyan_score(String str) {
        this.maoyan_score = str;
    }

    public final void setMaoyan_score_url(String str) {
        this.maoyan_score_url = str;
    }

    public final void setMediumAnchor(Boolean bool) {
        this.isMediumAnchor = bool;
    }

    public final void setMedium_type(int i) {
        this.medium_type = i;
    }

    public final void setMedium_ui_style(int i) {
        this.medium_ui_style = i;
    }

    public final void setNewStyleCard(boolean z) {
        this.isNewStyleCard = z;
    }

    public final void setRank(String str) {
        this.rank = str;
    }

    public final void setRateText(String str) {
        this.rateText = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowurl(String str) {
        this.showurl = str;
    }

    public final void setStat(Integer num) {
        this.stat = num;
    }

    public final void setStatText(String str) {
        this.statText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTmaid(String str) {
        this.tmaid = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWish(Integer num) {
        this.wish = num;
    }

    public final void set_collect(boolean z) {
        this.is_collect = z;
    }
}
