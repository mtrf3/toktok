package X;

import Y.AObserverS70S0100000_2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6HZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HZ implements InterfaceC135635Tz, LifecycleOwner, I7R {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final LifecycleOwner LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public InterfaceC153045zY LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public C6HJ LJLJJLL;

    static {
        TBT tbt = new TBT(C6HZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6HZ.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0, c65351Pkp)};
    }

    public final VEVideoCutterViewModel LIZLLL() {
        return (VEVideoCutterViewModel) this.LJLJJL.LIZ(this, LJLJL[1]);
    }

    public final C6HY LJFF() {
        if (this.LJLJJLL == null) {
            InterfaceC153045zY interfaceC153045zY = this.LJLJI;
            VEEditorAutoStartStopArbiter value = ((InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLJL[0])).wz().getValue();
            if (interfaceC153045zY != null && value != null) {
                this.LJLJJLL = new C6HJ(interfaceC153045zY, new AqS152S0100000_2(value, 252));
            }
        }
        return this.LJLJJLL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    @Override // X.I7R
    public final boolean LIZIZ() {
        C6HY LJFF = LJFF();
        if (LJFF != null && ((C6HJ) LJFF).LIZLLL()) {
            LIZLLL().hv0(new C6HV(2, true));
            return false;
        }
        LIZLLL().hv0(new C6HV(1, true));
        return true;
    }

    @Override // X.I7R
    public final long LIZJ() {
        C6HY LJFF = LJFF();
        if (LJFF != null) {
            return ((C6HJ) LJFF).LIZ();
        }
        return 0L;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public C6HZ(AbstractC46064I6a lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = diContainer;
        C82632Wbs LJI = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJJI = LJI;
        this.LJLJJL = UCI.LJI(diContainer, VEVideoCutterViewModel.class, null);
        ((InterfaceC143655kP) LJI.LIZ(this, LJLJL[0])).Kh().observe(this, new AObserverS70S0100000_2(this, 61));
        LIZLLL().gv0().observe(this, new AObserverS70S0100000_2(this, 62));
    }

    @Override // X.I7R
    public final void LIZ(long j, VEEditor.SEEK_MODE seekMode, boolean z) {
        InterfaceC133865Ne interfaceC133865Ne;
        o.LJIIIZ(seekMode, "seekMode");
        if (j >= 0) {
            VEVideoCutterViewModel LIZLLL = LIZLLL();
            if (seekMode == VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing || !z) {
                interfaceC133865Ne = null;
            } else {
                interfaceC133865Ne = new InterfaceC133865Ne() { // from class: X.6Ha
                    @Override // X.InterfaceC133865Ne
                    public final void LIZ(int i) {
                        C6QQ.LIZ(new AqS152S0100000_2(C6HZ.this, 251));
                    }
                };
            }
            LIZLLL.hv0(new C6HV(j, seekMode, interfaceC133865Ne));
            return;
        }
        LIZLLL().hv0(new C6HV(1, false));
    }
}
