package com.ss.android.ugc.aweme.shortvideo;

import X.C16880lQ;
import X.C69432nz;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.ScmLabelInfo;
import com.ss.android.ugc.aweme.feed.model.ShareWarnInfo;
import com.ss.android.ugc.aweme.feed.model.ShareWarnModule;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class AVUploadMiscInfoStruct implements Serializable {

    @InterfaceC65349Pkn("autocut_template_group_id")
    public String autoCutTemplateGroupId;

    @InterfaceC65349Pkn("diamond_game_id")
    public String diamondGameId;

    @InterfaceC65349Pkn("hproject_info")
    public F2ProjectInfo f2ProjectInfo;

    @InterfaceC65349Pkn("green_screen")
    public int greenScreen;

    @InterfaceC65349Pkn("koi_fish")
    public int koiFish;

    @InterfaceC65349Pkn("ktf_info")
    public KtfInfo ktfInfo;

    @InterfaceC65349Pkn("status_template_id")
    public String mStatusId;

    @InterfaceC65349Pkn("video_tag")
    public int mVideoTag;

    @InterfaceC65349Pkn("mv_info")
    public MvModel mvInfo;

    @InterfaceC65349Pkn("mv_id")
    public String mvThemeId;

    @InterfaceC65349Pkn("mv_template_type")
    public int mvType;

    @InterfaceC65349Pkn("ocr_location")
    public String ocrLocation;

    @InterfaceC65349Pkn("share_warn_info")
    public ShareWarnInfo samShareWarnInfo;

    @InterfaceC65349Pkn("scm_tag_info")
    public ScmLabelInfo scmLabelInfo;

    @InterfaceC65349Pkn("share_warn_module")
    public ShareWarnModule shareWarnModule;

    @InterfaceC65349Pkn("source_id")
    public int sourceId = 1;

    /* loaded from: classes4.dex */
    public static class F2ProjectInfo implements Serializable {

        @InterfaceC65349Pkn("icon_url")
        public UrlModel iconUrl;

        @InterfaceC65349Pkn("schema_url")
        public String schemaUrl;

        @InterfaceC65349Pkn("title")
        public String title;
    }

    public OcrLocation getOcrLocation() {
        OcrLocation ocrLocation = null;
        if (TextUtils.isEmpty(this.ocrLocation)) {
            return null;
        }
        try {
            ocrLocation = (OcrLocation) new Gson().LJI(this.ocrLocation, OcrLocation.class);
            return ocrLocation;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return ocrLocation;
        }
    }

    public static AVUploadMiscInfoStruct createStruct(String str) {
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        if (TextUtils.isEmpty(str)) {
            return aVUploadMiscInfoStruct;
        }
        try {
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct2 = (AVUploadMiscInfoStruct) C69432nz.LIZ().LJI(str, AVUploadMiscInfoStruct.class);
            if (aVUploadMiscInfoStruct2 != null) {
                return aVUploadMiscInfoStruct2;
            }
            return aVUploadMiscInfoStruct;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return aVUploadMiscInfoStruct;
        }
    }
}
