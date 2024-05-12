package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5u4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149645u4 extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82631Wbr LJLJL;

    static {
        TBT tbt = new TBT(C149645u4.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C149645u4.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(C149645u4.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C149645u4.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        final VideoPublishEditModel LJIIJ = LJIIJ();
        return new WI1(LJIIJ) { // from class: X.5u5
            public final int LJIIIZ;
            public final C6MP LJIIJ;

            @Override // X.WI1
            public final int LJ() {
                return R.raw.icon_audio_editing_microphone;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(null, this.LJIIIZ, false, 5);
            }

            @Override // X.WI1
            public final int LJII() {
                C62A.LIZ.getClass();
                return C62A.LIZ();
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIJ;
            }

            {
                int i;
                o.LJIIIZ(LJIIJ, "model");
                if (C151975xp.LIZ(LJIIJ)) {
                    if (e1.LIZ(31744, "studio_top_right_bar_voice_edit_promote", true, false)) {
                        i = 70;
                    } else {
                        i = 130;
                    }
                } else {
                    i = 80;
                }
                this.LJIIIZ = i;
                this.LJIIJ = C6MP.AUDIO_EDITING;
            }
        };
    }

    @Override // X.WJB
    public final void LJFF() {
        final AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 679);
        if (C78934UyQ.LJLIL.LJ().LIZ(LJIIIZ()) == 0) {
            aqS152S0100000_2.invoke();
            return;
        }
        final AqS152S0100000_2 aqS152S0100000_22 = new AqS152S0100000_2(this, 678);
        final AqS152S0100000_2 aqS152S0100000_23 = new AqS152S0100000_2(this, 676);
        C61099NyR.LIZIZ.LIZIZ(LJIIIZ(), TokenCert.Companion.with("bpea-tools_request_audio_permission_audio_editing_new")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new InterfaceC61107NyZ() { // from class: X.5u6
            @Override // X.InterfaceC61107NyZ
            public final void LIZ() {
            }

            @Override // X.InterfaceC61107NyZ
            public final void LIZIZ(C164906da... results) {
                o.LJIIIZ(results, "results");
                if (results.length == 0) {
                    aqS152S0100000_22.invoke();
                } else if (results[0].LIZIZ == EnumC61598OFm.GRANTED) {
                    aqS152S0100000_2.invoke();
                } else {
                    aqS152S0100000_23.invoke();
                }
            }
        });
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        DMMediaModel dMMediaModel;
        if (((Number) C166656gP.LIZ.getValue()).intValue() == 0 || C79004UzY.LJJIII(LJIIJ().canvasVideoData) || C79004UzY.LJJIL(LJIIJ().canvasVideoData) || !C44384HbQ.LJJIII(LJIIJ())) {
            return false;
        }
        if (LJIIJ().isEnterFromDM() && (dMMediaModel = LJIIJ().creativeModel.dmMediaModel) != null && dMMediaModel.type == 2) {
            return false;
        }
        return true;
    }

    public final Activity LJIIIZ() {
        return (Activity) this.LJLJJL.LIZ(this, LJLJLJ[1]);
    }

    public final VideoPublishEditModel LJIIJ() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLJLJ[0]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public C149645u4(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = diContainer;
        this.LJLJJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJII(diContainer, InterfaceC146665pG.class, null);
    }
}
