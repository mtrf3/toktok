package X;

import Y.ACallableS79S0101000_7;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAI implements HHF {
    @Override // X.HHF
    public final String LIZJ() {
        String LJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJI("");
        o.LJIIIIZZ(LJI, "getMvResDir()");
        return LJI;
    }

    @Override // X.HHF
    public final void LIZ(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        if (draft.LJJJJI.mvCreateVideoData == null) {
            return;
        }
        C10K.LIZJ(new ACallableS79S0101000_7(3, draft, 0));
    }

    @Override // X.HHF
    public final void LJ(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        MvCreateVideoData mvCreateVideoData = draft.LJJJJI.mvCreateVideoData;
        if (mvCreateVideoData == null) {
            return;
        }
        ArrayList<String> arrayList = mvCreateVideoData.photoToSave;
        String str = mvCreateVideoData.mvAutoSaveToast;
        if (C77413UZt.LJIILL(arrayList) || TextUtils.isEmpty(str)) {
            return;
        }
        C5S1 c5s1 = new C5S1(C44172HVg.LIZ);
        c5s1.LIZLLL(str);
        c5s1.LJ();
        C10K.LIZJ(new ACallableS79S0101000_7(1, arrayList, 1)).LJ(new C10I() { // from class: X.6ay
            @Override // X.C10I
            public final Object then(C10K c10k) {
                for (PhotoContext photoContext : (List) c10k.LJIIJJI()) {
                    FT5 ft5 = new FT5();
                    if (photoContext != null) {
                        C78764Uvg.LJIILIIL(C163246au.LIZ(photoContext.getPhotoUri()), photoContext.mWidth, photoContext.mHeight, new C163276ax(ft5));
                    }
                }
                return null;
            }
        }, C10K.LJI, null);
    }

    @Override // X.HHF
    public final void LJFF(ActivityC45651qj activityC45651qj) {
        new HAA(activityC45651qj, null).LIZJ(null, null, "slideshoweffect", false, new HAS(new HAM())).LIZ(null);
    }

    @Override // X.HHF
    public final void LJI(ActivityC45651qj activityC45651qj) {
        new HAA(activityC45651qj, null).LIZJ(null, null, "singlepiceffect", false, new HAV(new HAM())).LIZ(null);
    }

    @Override // X.HHF
    public final String LJII(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LJJLIIIJLJLI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJLIIIJLJLI(creativeInfo, HJC.LIZJ(".png"));
        o.LJIIIIZZ(LJJLIIIJLJLI, "createRandomPNGFilePath(creativeInfo)");
        return LJJLIIIJLJLI;
    }

    @Override // X.HHF
    public final void LIZIZ(ActivityC45651qj activity, WM7 wm7) {
        o.LJIIIZ(activity, "activity");
        HAA haa = new HAA(activity, wm7);
        HAM ham = new HAM();
        haa.LIZJ(null, null, "singlepiceffect", false, new HAT(ham)).LIZ(null);
        haa.LIZJ(null, null, "slideshoweffect", false, new HAU(ham)).LIZ(null);
    }

    @Override // X.HHF
    public final void LIZLLL(ActivityC45651qj activityC45651qj, String str, String str2) {
        String str3;
        HAA haa = new HAA(activityC45651qj, null);
        HAM ham = new HAM();
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        haa.LIZJ(null, str, str3, false, new HAR(str2, ham)).LIZ(null);
    }

    @Override // X.HHF
    public final void LJIIIIZZ(ActivityC45651qj activityC45651qj, MusicModel musicModel, C45461Hsn c45461Hsn, String str) {
        if (C5WB.LIZ()) {
            return;
        }
        new HAA(activityC45651qj, null).LIZIZ(null, musicModel, new HAW(c45461Hsn), null, str).LIZ(null);
    }
}
