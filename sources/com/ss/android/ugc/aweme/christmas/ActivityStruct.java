package com.ss.android.ugc.aweme.christmas;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public class ActivityStruct {

    @InterfaceC65349Pkn("activity_sticker_id_array")
    public ArrayList<String> activityStickerIdArray;

    @InterfaceC65349Pkn("comment_icon")
    public UrlModel commentIcon;

    @InterfaceC65349Pkn("digg_icon")
    public UrlModel diggIcon;

    @InterfaceC65349Pkn("hash_tags")
    public ArrayList<String> hashTags;

    @InterfaceC65349Pkn("in_activity")
    public boolean inActivity;

    @InterfaceC65349Pkn("activity_name")
    public String name;

    @InterfaceC65349Pkn("shot_icon")
    public UrlModel publishIcon;

    @InterfaceC65349Pkn("share_icon")
    public UrlModel shareIcon;

    @InterfaceC65349Pkn("share_tip_icon")
    public UrlModel shareTipIcon;

    @InterfaceC65349Pkn("watermark_struct")
    public WatermarkStruct struct;

    @InterfaceC65349Pkn("undigg_icon")
    public UrlModel undiggIcon;

    /* loaded from: classes8.dex */
    public class WatermarkStruct {

        @InterfaceC65349Pkn("end_watermark_string")
        public String endWatermarkString;

        @InterfaceC65349Pkn("end_watermark_substring")
        public String endWatermarkSubstring;

        @InterfaceC65349Pkn("fps")
        public String fps;

        @InterfaceC65349Pkn("md5")
        public String md5;

        @InterfaceC65349Pkn("resource_url")
        public UrlModel waterResource;

        public WatermarkStruct(ActivityStruct activityStruct) {
        }
    }
}
