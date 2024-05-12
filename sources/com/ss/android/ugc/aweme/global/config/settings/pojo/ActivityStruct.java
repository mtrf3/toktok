package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class ActivityStruct {

    @InterfaceC65349Pkn("activity_name")
    public String activityName;

    @InterfaceC65349Pkn("comment_icon")
    public UrlModel commentIcon;

    @InterfaceC65349Pkn("digg_icon")
    public UrlModel diggIcon;

    @InterfaceC65349Pkn("in_activity")
    public Boolean inActivity;

    @InterfaceC65349Pkn("share_icon")
    public UrlModel shareIcon;

    @InterfaceC65349Pkn("share_tip_icon")
    public UrlModel shareTipIcon;

    @InterfaceC65349Pkn("shot_icon")
    public UrlModel shotIcon;

    @InterfaceC65349Pkn("undigg_icon")
    public UrlModel undiggIcon;

    @InterfaceC65349Pkn("watermark_struct")
    public WatermarkStruct watermarkStruct;

    @InterfaceC65349Pkn("hash_tags")
    public List<String> hashTags = new ArrayList();

    @InterfaceC65349Pkn("activity_sticker_id_array")
    public List<String> activityStickerIdArray = new ArrayList();

    public String getActivityName() {
        String str = this.activityName;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public UrlModel getCommentIcon() {
        UrlModel urlModel = this.commentIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public UrlModel getDiggIcon() {
        UrlModel urlModel = this.diggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public Boolean getInActivity() {
        Boolean bool = this.inActivity;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public UrlModel getShareIcon() {
        UrlModel urlModel = this.shareIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public UrlModel getShareTipIcon() {
        UrlModel urlModel = this.shareTipIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public UrlModel getShotIcon() {
        UrlModel urlModel = this.shotIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public UrlModel getUndiggIcon() {
        UrlModel urlModel = this.undiggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public WatermarkStruct getWatermarkStruct() {
        WatermarkStruct watermarkStruct = this.watermarkStruct;
        if (watermarkStruct != null) {
            return watermarkStruct;
        }
        throw new C158056If();
    }

    public List<String> getActivityStickerIdArray() {
        return this.activityStickerIdArray;
    }

    public List<String> getHashTags() {
        return this.hashTags;
    }
}
