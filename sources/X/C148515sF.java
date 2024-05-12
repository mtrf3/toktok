package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148515sF extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C148525sG LJLJLJ;

    static {
        TBT tbt = new TBT(C148515sF.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C148515sF.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(C148515sF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
        if (C78934UyQ.LJLIL.LJ().LIZ(LJIIJ()) == 0) {
            LJIIIZ();
            return;
        }
        final AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 685);
        final AqS152S0100000_2 aqS152S0100000_22 = new AqS152S0100000_2(this, 684);
        final AqS152S0100000_2 aqS152S0100000_23 = new AqS152S0100000_2(this, 683);
        C61099NyR.LIZIZ.LIZIZ(LJIIJ(), TokenCert.Companion.with("bpea-tools_request_audio_permission_edit_audio_record_new")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new InterfaceC61107NyZ() { // from class: X.5sH
            @Override // X.InterfaceC61107NyZ
            public final void LIZ() {
            }

            @Override // X.InterfaceC61107NyZ
            public final void LIZIZ(C164906da... results) {
                o.LJIIIZ(results, "results");
                if (results.length == 0) {
                    aqS152S0100000_2.invoke();
                } else if (results[0].LIZIZ == EnumC61598OFm.GRANTED) {
                    aqS152S0100000_22.invoke();
                } else {
                    aqS152S0100000_23.invoke();
                }
            }
        });
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        C82632Wbs c82632Wbs = this.LJLJJI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJLLL;
        if (C79004UzY.LJJIIJ(((VideoPublishEditModel) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0])).canvasVideoData) || !C44384HbQ.LJJIII((VideoPublishEditModel) this.LJLJJI.LIZ(this, interfaceC74236TBoArr[0])) || ((Number) C166656gP.LIZ.getValue()).intValue() != 0) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ() {
        ((InterfaceC143655kP) this.LJLJL.LIZ(this, LJLJLLL[2])).U2(false, false, false);
        InterfaceC146665pG interfaceC146665pG = (InterfaceC146665pG) this.LJLJJLL.getValue();
        if (interfaceC146665pG != null) {
            interfaceC146665pG.LLD();
        }
    }

    public final Activity LJIIJ() {
        return (Activity) this.LJLJJL.LIZ(this, LJLJLLL[1]);
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.5sG] */
    public C148515sF(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = diContainer;
        C82632Wbs LJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJI = LJI;
        this.LJLJJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 682));
        this.LJLJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) LJI.LIZ(this, LJLJLLL[0]);
        this.LJLJLJ = new WI1(videoPublishEditModel) { // from class: X.5sG
            public final WI0 LJIIIZ;
            public final C6MP LJIIJ;

            @Override // X.WI1
            public final int LJ() {
                return R.raw.icon_audio_editing_microphone;
            }

            @Override // X.WI1
            public final int LJII() {
                return R.string.e3_;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return this.LJIIIZ;
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIJ;
            }

            {
                int i;
                o.LJIIIZ(videoPublishEditModel, "model");
                if (C151975xp.LIZ(videoPublishEditModel)) {
                    i = LiveTryModeCountDownThresholdSetting.DEFAULT;
                } else {
                    i = 70;
                }
                this.LJIIIZ = new WI0(null, i, false, 5);
                this.LJIIJ = C6MP.AUDIO_RECORD;
            }
        };
    }
}
