package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83866Wvm implements InterfaceC83867Wvn {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final OSZ<Integer, Integer> LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final EnumC83876Wvw LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final InterfaceC83867Wvn LJLJJLL;
    public final InterfaceC83927Wwl LJLJL;

    @Override // X.InterfaceC83867Wvn
    public final void LIZ(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.LIZ(listener);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LIZIZ(AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLJJLL.LIZIZ(aqS173S0100000_7);
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83759Wu3 LIZJ() {
        return this.LJLJJLL.LIZJ();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83886Ww6 LIZLLL() {
        return this.LJLJJLL.LIZLLL();
    }

    @Override // X.InterfaceC83867Wvn
    public final VERecorder LJ() {
        return this.LJLJJLL.LJ();
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJFF(C83869Wvp c83869Wvp) {
        this.LJLJJLL.LJFF(c83869Wvp);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJI(C83870Wvq c83870Wvq) {
        this.LJLJJLL.LJI(c83870Wvq);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJII(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJLL.LJII(context);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIIIZZ(C83854Wva c83854Wva) {
        this.LJLJJLL.LJIIIIZZ(c83854Wva);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIIZ(C83869Wvp c83869Wvp) {
        this.LJLJJLL.LJIIIZ(c83869Wvp);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIJ(C83869Wvp c83869Wvp) {
        this.LJLJJLL.LJIIJ(c83869Wvp);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIJJI(IDqS456S0100000_14 callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJLL.LJIIJJI(callback);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LLLLLJIL(C83932Wwq c83932Wwq, String workSpacePath) {
        o.LJIIIZ(workSpacePath, "workSpacePath");
        this.LJLJJLL.LLLLLJIL(c83932Wwq, workSpacePath);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LLLLLJLJLL(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL.LLLLLJLJLL(listener);
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83670Wsc getAudioController() {
        return this.LJLJJLL.getAudioController();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83863Wvj getCameraController() {
        return this.LJLJJLL.getCameraController();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83727WtX getEffectController() {
        return this.LJLJJLL.getEffectController();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83865Wvl getMediaController() {
        return this.LJLJJLL.getMediaController();
    }

    public final void LJIIL() {
        String str;
        boolean z;
        LJII(C83739Wtj.LIZ());
        InterfaceC83865Wvl mediaController = getMediaController();
        int cameraPreviewWidth = getCameraController().getCameraPreviewWidth();
        int cameraPreviewHeight = getCameraController().getCameraPreviewHeight();
        String absolutePath = this.LJLJL.LLZLLLL().LIZIZ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "recorderContext.workspac….segmentPath.absolutePath");
        mediaController.I8(cameraPreviewWidth, cameraPreviewHeight, absolutePath, this.LJLIL.getSecond().intValue(), this.LJLIL.getFirst().intValue(), this.LJLJL.LLJJIJIL() ? 1 : 0, this.LJLJL.LLZZZIL());
        getMediaController().G8();
        getEffectController().da();
        if (this.LJLJJI != EnumC83876Wvw.DUET) {
            return;
        }
        C83964WxM.LIZ.LIZJ("initDuet() called");
        int LJI = this.LJLJL.LLLLZI().LJI();
        int LIZLLL = this.LJLJL.LLLLZI().LIZLLL();
        if (this.LJLJL.LLLLZI().LIZJ()) {
            str = null;
        } else {
            str = this.LJLJI;
        }
        if (LJI * 1.3333333333333333d <= LIZLLL) {
            z = false;
        } else {
            z = true;
        }
        if (!this.LJLJL.LLJL().invoke().booleanValue()) {
            getMediaController().LLZZJLIL(0L, 0L, str, false, false);
        }
        LIZLLL().LIZ(this.LJLILLLLZI, str, z);
        LIZLLL().LIZJ();
    }

    public C83866Wvm(LifecycleOwner lifecycleOwner, VERecorderImpl vERecorderImpl, InterfaceC83927Wwl interfaceC83927Wwl) {
        EnumC83876Wvw enumC83876Wvw;
        Surface surface;
        this.LJLJJL = lifecycleOwner;
        this.LJLJJLL = vERecorderImpl;
        this.LJLJL = interfaceC83927Wwl;
        this.LJLIL = interfaceC83927Wwl.h();
        String LIZ = interfaceC83927Wwl.LLLLZI().LIZ();
        this.LJLILLLLZI = LIZ;
        String LJIIIIZZ = interfaceC83927Wwl.LLLLZI().LJIIIIZZ();
        this.LJLJI = LJIIIIZZ;
        interfaceC83927Wwl.LLLLZI().LIZIZ();
        if (LIZ.length() > 0 && LJIIIIZZ.length() > 0) {
            enumC83876Wvw = EnumC83876Wvw.DUET;
        } else {
            enumC83876Wvw = EnumC83876Wvw.CUSTOM;
        }
        this.LJLJJI = enumC83876Wvw;
        if (!interfaceC83927Wwl.LLJIJIL()) {
            return;
        }
        SurfaceHolder surfaceHolder = interfaceC83927Wwl.getSurfaceHolder();
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(new SurfaceHolderCallbackC83874Wvu(this));
        }
        SurfaceHolder surfaceHolder2 = interfaceC83927Wwl.getSurfaceHolder();
        if (surfaceHolder2 == null || (surface = surfaceHolder2.getSurface()) == null || !surface.isValid()) {
            return;
        }
        LJIIL();
        vERecorderImpl.getMediaController().u8(surface, "", C34393Def.LJLIL);
    }
}
