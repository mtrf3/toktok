package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import defpackage.e1;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final /* synthetic */ class Q5C implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean LIZLLL;
        String string;
        switch (this.LJLIL) {
            case 0:
                C0FS.LIZIZ(this.LJLILLLLZI);
                C66393Q3x LIZ = C66393Q3x.LJFF.LIZ();
                Q4L q4l = LIZ.LIZIZ;
                if (q4l.LIZ.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string = q4l.LIZ.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        AccessToken.Companion.getClass();
                        AccessToken LIZ2 = C66382Q3m.LIZ(jSONObject);
                        if (LIZ2 != null) {
                            LIZ.LIZJ(LIZ2, false);
                        }
                    } catch (JSONException unused) {
                    }
                }
                Q5L LIZ3 = Q5L.LIZLLL.LIZ();
                String string2 = LIZ3.LIZIZ.LIZ.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string2 != null) {
                    try {
                        LIZ3.LIZ(new Profile(new JSONObject(string2)), false);
                    } catch (JSONException unused2) {
                    }
                }
                AccessToken.Companion.getClass();
                if (C66382Q3m.LIZJ()) {
                    Profile.Companion.getClass();
                    if (Q5L.LIZLLL.LIZ().LIZJ == null) {
                        Q5M.LIZ();
                    }
                }
                u.LIZJ();
                if (!C40700FyC.LIZ(C66371Q3b.class)) {
                    try {
                        Context LIZJ = u.LIZJ();
                        ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(LIZJ.getPackageManager(), LIZJ.getPackageName(), 128);
                        if (LLLLLLLLL != null && LLLLLLLLL.metaData != null && LLLLLLLLL.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            Bundle bundle = new Bundle();
                            if (!C66373Q3d.LJIJ()) {
                                bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
                o.LJIIIIZZ(C16880lQ.LLLLL(u.LIZJ()), "getApplicationContext().applicationContext");
                return null;
            case 1:
                AwemeStatsApi.LIZ((C62684Oiu) ((Object[]) this.LJLILLLLZI)[0]);
                return null;
            case 2:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) this.LJLILLLLZI;
                videoPublishContainerScene.getClass();
                Boolean bool = Boolean.FALSE;
                C5K0.LIZ(2);
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                if (videoPublishEditModel.creativeModel.ugcTemplateData.showOriginTemplateAnchor == null && (LIZLLL = C141365gi.LIZLLL(videoPublishEditModel)) != null) {
                    videoPublishContainerScene.LLILZLL.creativeModel.ugcTemplateData.showOriginTemplateAnchor = LIZLLL;
                    bool = LIZLLL;
                }
                if (Boolean.TRUE.equals(videoPublishContainerScene.LLILZLL.creativeModel.ugcTemplateData.showOriginTemplateAnchor)) {
                    AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
                    aVUploadMiscInfoStruct.mvThemeId = videoPublishContainerScene.LLILZLL.creativeModel.ugcTemplateData.ugcTemplateId;
                    aVUploadMiscInfoStruct.mvType = EnumC43998HOo.UGC_TEMPLATE.getValue();
                    if (videoPublishContainerScene.LLILZLL.creativeModel.ugcTemplateData.isPUgcTemplateFromAnchor) {
                        aVUploadMiscInfoStruct.mvType = EnumC43998HOo.PUGC_TEMPLATE.getValue();
                    }
                    videoPublishContainerScene.LLILZLL.uploadMiscInfoStruct = aVUploadMiscInfoStruct;
                }
                if ((!G6Y.LIZ() || !C141365gi.LIZIZ(videoPublishContainerScene.LLILZLL)) && !C1DG.LJIIIIZZ() && e1.LIZ(31744, "studio_creation_enable_create_new_ugc_template", true, false) && !bool.booleanValue() && C141365gi.LIZJ(videoPublishContainerScene.LLILZLL)) {
                    videoPublishContainerScene.LLILZLL.creativeModel.ugcTemplateData.ugcTemplateZipUrl = C132435Hr.LIZIZ(C132435Hr.LIZ(videoPublishContainerScene.LLILZLL), videoPublishContainerScene.LLILZLL, null, false);
                }
                return null;
            default:
                C48188Ivg c48188Ivg = (C48188Ivg) this.LJLILLLLZI;
                c48188Ivg.getClass();
                c48188Ivg.LIZ = C48189Ivh.LJ(EF7.LIZIZ());
                return null;
        }
    }

    public /* synthetic */ Q5C(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
