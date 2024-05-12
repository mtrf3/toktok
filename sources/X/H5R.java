package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H5R {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (com.ss.android.ugc.aweme.service.CommonFeedApiService.LIZ().LJJ() == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02cc  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r33) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5R.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static void LIZ(List list, AVUploadMiscInfoStruct aVUploadMiscInfoStruct) {
        String str;
        String str2;
        UrlModel iconUrl;
        List<String> urlList;
        UrlModel iconUrl2;
        List<String> urlList2;
        MvModel mvModel = aVUploadMiscInfoStruct.mvInfo;
        String str3 = null;
        if (mvModel != null) {
            str = mvModel.getName();
            if (str != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("add_from", 1);
                    jSONObject.put("third_id", aVUploadMiscInfoStruct.mvThemeId);
                    MvModel mvModel2 = aVUploadMiscInfoStruct.mvInfo;
                    if (mvModel2 != null && (iconUrl = mvModel2.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        MvModel mvModel3 = aVUploadMiscInfoStruct.mvInfo;
                        if (mvModel3 != null && (iconUrl2 = mvModel3.getIconUrl()) != null && (urlList2 = iconUrl2.getUrlList()) != null) {
                            str3 = (String) ListProtector.get(urlList2, 0);
                        }
                        jSONObject.put("icon_url", str3);
                    }
                    jSONObject.put("mv_template_type", aVUploadMiscInfoStruct.mvType);
                } catch (Exception unused) {
                }
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
                if (aVUploadMiscInfoStruct.mvType == EnumC43998HOo.CUT_SAME.getValue()) {
                    str2 = "capcut";
                } else {
                    str2 = "";
                }
                ((ArrayList) list).add(new CreateAnchorInfo(29, str, "", "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", -1L, null, null, null, str2, null, false, 7040, null));
                return;
            }
        } else {
            str = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[addMiscInfoAnchors] : keyword = ");
        LIZ2.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
    }
}
