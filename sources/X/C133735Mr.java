package X;

import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133735Mr extends AbstractC29891Fh<InterfaceC133755Mt> implements InterfaceC133755Mt, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJL;
    public final InterfaceC115514g7 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C82622Wbi LJLJJI;

    static {
        TBT tbt = new TBT(C133735Mr.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    private final InterfaceC143655kP LJJLIIIIJ() {
        return (InterfaceC143655kP) this.LJLIL.LIZ(this, LJLJJL[0]);
    }

    private final C124454uX LJJLIIIJILLIZJL() {
        return (C124454uX) this.LJLILLLLZI.getValue();
    }

    @Override // X.AbstractC29891Fh
    /* renamed from: LJJLI, reason: merged with bridge method [inline-methods] */
    public InterfaceC133755Mt getApiComponent() {
        return (InterfaceC133755Mt) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC133755Mt
    public void Io0() {
        VEEditor.VEState vEState;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        C5MG WS;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2;
        LJJLIIIJILLIZJL().getClass();
        C124454uX.LIZLLL();
        C5MG WS2 = LJJLIIIIJ().WS();
        if (WS2 != null) {
            vEState = ((C133765Mu) WS2.LJJ()).getState();
        } else {
            vEState = null;
        }
        if (vEState != VEEditor.VEState.IDLE && (WS = LJJLIIIIJ().WS()) != null && (vEEditorAutoStartStopArbiter2 = WS.LJFF) != null && vEEditorAutoStartStopArbiter2.LJLL) {
            C5MG WS3 = LJJLIIIIJ().WS();
            if (WS3 != null) {
                ((C133765Mu) WS3.LJJ()).LLIIIJ();
            }
            LJJLIIIIJ().PS(true);
        }
        C5MG WS4 = LJJLIIIIJ().WS();
        if (WS4 != null && (vEEditorAutoStartStopArbiter = WS4.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LJLL = false;
        }
    }

    @Override // X.InterfaceC133755Mt
    public void Sf() {
        InterfaceC153045zY interfaceC153045zY;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        C5MG WS = LJJLIIIIJ().WS();
        if (WS != null && (vEEditorAutoStartStopArbiter = WS.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LJLL = true;
        }
        C124454uX LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        C5MG WS2 = LJJLIIIIJ().WS();
        if (WS2 != null) {
            interfaceC153045zY = WS2.LJJ();
        } else {
            interfaceC153045zY = null;
        }
        EnumC124444uW action = EnumC124444uW.AUDIO_LOOP;
        LJJLIIIJILLIZJL.getClass();
        o.LJIIIZ(action, "action");
        C124454uX.LJ = interfaceC153045zY;
        C124454uX.LIZ = action;
        C124454uX.LIZIZ().clear();
        C124454uX.LIZJ(EnumC124504uc.INITIALIZED);
        C124454uX.LJ(1000);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIJILLIZJL().getClass();
        EnumC124504uc enumC124504uc = C124454uX.LJFF;
        EnumC124504uc enumC124504uc2 = EnumC124504uc.UNINITIALIZED;
        if (enumC124504uc != enumC124504uc2) {
            C124454uX.LJ = null;
            C124454uX.LIZIZ().clear();
        }
        C124454uX.LIZJ(enumC124504uc2);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        Io0();
        C5MG WS = LJJLIIIIJ().WS();
        if (WS != null) {
            WS.LJJIII(true);
        }
        LJJLIIIIJ().PS(false);
        LJJLIIIJILLIZJL().getClass();
        C124454uX.LIZJ(EnumC124504uc.IDLE);
        super.onResume();
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C133735Mr(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJJI = diContainer;
        this.LJLIL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(C133745Ms.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 147));
    }
}
