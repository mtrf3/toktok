package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;

/* loaded from: classes8.dex */
public class PublishExtensionModel {

    @InterfaceC65349Pkn("anchor_content")
    public String anchorContent;

    @InterfaceC65349Pkn("anchor_icon")
    public UrlModel anchorIcon;

    @InterfaceC65349Pkn("anchor_tag")
    public String anchorTag;

    @InterfaceC65349Pkn("anchor_title")
    public String anchorTitle;

    @InterfaceC65349Pkn("anchors")
    public List<CreateAnchorInfo> createAnchorInfos;
    public String dataType;

    @InterfaceC65349Pkn("is_from_commercial_sound_page")
    public boolean fromCommercialSoundPage;

    @InterfaceC65349Pkn("mp_url")
    public String mpUrl;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("outer_star_atlas")
    public String outerStarAtlas;

    @InterfaceC65349Pkn("poi_data")
    public PoiData poiData;

    @InterfaceC65349Pkn("recommend_anchor")
    public List<AnchorPublishStruct> recommendAnchor;
    public String referSeedId;
    public String referSeedName;

    @InterfaceC65349Pkn("related_hot_sentence")
    public String relatedHotSentence;
    public String seedId;
    public String seedName;

    @InterfaceC65349Pkn("sentence_id")
    public String sentenceId;

    @InterfaceC65349Pkn("shop_order_share_structinfo")
    public ShopOrderShareStructInfo shopOrderShareStructInfo;

    @InterfaceC65349Pkn("source")
    public int source;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    @InterfaceC65349Pkn("zip_uri")
    public String zipUri;

    @InterfaceC65349Pkn("anchor_id")
    public String anchorId = "";

    @InterfaceC65349Pkn("anchor_business_type")
    public int anchorBusinessType = -1;

    @InterfaceC65349Pkn("subtype")
    public String anchorSubtype = "";

    public static PublishExtensionModel fromContext(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null || TextUtils.isEmpty(baseShortVideoContext.commerceData)) {
            return new PublishExtensionModel();
        }
        return (PublishExtensionModel) GsonProtectorUtils.fromJson(new Gson(), baseShortVideoContext.commerceData, PublishExtensionModel.class);
    }

    public static PublishExtensionModel fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return new PublishExtensionModel();
        }
        return (PublishExtensionModel) GsonProtectorUtils.fromJson(new Gson(), str, PublishExtensionModel.class);
    }

    public static String toString(PublishExtensionModel publishExtensionModel) {
        if (publishExtensionModel == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(new Gson(), publishExtensionModel);
    }
}
