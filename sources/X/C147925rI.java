package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147925rI extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C148135rd LJLJLJ;

    static {
        TBT tbt = new TBT(C147925rI.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C147925rI.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(C147925rI.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    public final VideoPublishEditModel LJIIIZ() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLJLLL[0]);
    }

    public final void LJIIJ() {
        InterfaceC145875nz interfaceC145875nz = (InterfaceC145875nz) this.LJLJJLL.getValue();
        if (interfaceC145875nz != null) {
            interfaceC145875nz.LLD();
        }
        ((InterfaceC143655kP) this.LJLJL.LIZ(this, LJLJLLL[2])).U2(false, false, false);
        C1536161d.LIZ("voice");
        H8F.LJIJJ(LJIIIZ());
    }

    @Override // X.WJB
    public final void LJFF() {
        if (C44384HbQ.LJJII(LJIIIZ()) && LJIIIZ().mOrigin == 2) {
            LJIIJ();
            return;
        }
        if ((C44384HbQ.LJLLLL(LJIIIZ()) || C44384HbQ.LJZ(LJIIIZ())) && (LJIIIZ().veAudioRecorderParam == null || !LJIIIZ().veAudioRecorderParam.hasRecord())) {
            C5S1 c5s1 = new C5S1((Context) this.LJLJJL.LIZ(this, LJLJLLL[1]));
            c5s1.LIZJ(R.string.e2r);
            c5s1.LJ();
            return;
        }
        LJIIJ();
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        if (C79004UzY.LJJIIJ(LJIIIZ().canvasVideoData) || !C44384HbQ.LJJII(LJIIIZ()) || ((Number) C166656gP.LIZ.getValue()).intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.WI1, X.5rd] */
    public C147925rI(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = diContainer;
        this.LJLJJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 690));
        this.LJLJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        final VideoPublishEditModel LJIIIZ = LJIIIZ();
        ?? r2 = new WI1(LJIIIZ) { // from class: X.5rd
            public final WI0 LJIIIZ;
            public final C6MP LJIIJ;

            @Override // X.WI1
            public final int LJ() {
                return R.raw.icon_audio_editing;
            }

            @Override // X.WI1
            public final int LJII() {
                return R.string.bzk;
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
                o.LJIIIZ(LJIIIZ, "model");
                if (C151975xp.LIZ(LJIIIZ)) {
                    i = 110;
                } else {
                    i = 60;
                }
                this.LJIIIZ = new WI0(null, i, false, 5);
                this.LJIIJ = C6MP.VOICE;
            }
        };
        if (C44384HbQ.LJIILIIL(LJIIIZ())) {
            if (LJIIIZ().veAudioRecorderParam != null && LJIIIZ().veAudioRecorderParam.hasRecord()) {
                r2.LJIIJ(EnumC147935rJ.ENABLE_CLICK);
            } else {
                r2.LJIIJ(EnumC147935rJ.DISABLE_CLICK);
            }
        }
        if (C44384HbQ.LJJII(LJIIIZ()) && LJIIIZ().mOrigin == 2) {
            r2.LJIIJ(EnumC147935rJ.ENABLE_CLICK);
        }
        this.LJLJLJ = r2;
    }
}
