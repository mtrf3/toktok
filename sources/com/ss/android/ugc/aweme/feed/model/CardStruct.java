package com.ss.android.ugc.aweme.feed.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class CardStruct implements Serializable {

    @InterfaceC65349Pkn("card_data")
    public Object cardData;

    @InterfaceC65349Pkn("card_style")
    public int cardStyle;

    @InterfaceC65349Pkn("card_type")
    public int cardType;

    @InterfaceC65349Pkn("card_url")
    public String cardUrl;

    @InterfaceC65349Pkn("dynamic_type")
    public int dynamicType;

    @InterfaceC65349Pkn("gecko_channel")
    public List<String> geckoChannel;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;

    @InterfaceC65349Pkn("preload_before_show")
    public int preloadBeforeVideoEnd;

    @InterfaceC65349Pkn("preload_type")
    public int preloadType;

    @InterfaceC65349Pkn("show_duration")
    public int showDuration;

    @InterfaceC65349Pkn("track_url_list")
    public UrlModel trackUrlList;

    @InterfaceC65349Pkn("show_seconds")
    public int showSeconds = -1;

    @InterfaceC65349Pkn("only_track_event_not_show")
    public Boolean onlyTrackEventNotShow = Boolean.FALSE;

    @InterfaceC65349Pkn("sub_type")
    public int subType = 0;

    /* loaded from: classes11.dex */
    public interface IStatusCode {
        public static final String DEFAULT = "0";

        /* loaded from: classes11.dex */
        public interface ICardSubType {
        }
    }

    public JSONObject getCardData() {
        try {
            return new JSONObject(new Gson().LJIILL(this.cardData));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public int getPreloadBeforeVideoEnd() {
        return this.preloadBeforeVideoEnd * 1000;
    }

    public boolean isEnablePreload() {
        if (this.preloadType == 1) {
            return true;
        }
        return false;
    }

    public int getCardStyle() {
        return this.cardStyle;
    }

    public int getCardSubType() {
        return this.subType;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public int getDynamicType() {
        return this.dynamicType;
    }

    public List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public Boolean getOnlyTrackEventNotShow() {
        return this.onlyTrackEventNotShow;
    }

    public int getShowDuration() {
        return this.showDuration;
    }

    public int getShowSeconds() {
        return this.showSeconds;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setPreloadBeforeVideoEnd(int i) {
        this.preloadBeforeVideoEnd = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }
}
