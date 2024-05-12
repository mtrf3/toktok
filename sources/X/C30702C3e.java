package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.C3e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30702C3e extends SurfaceView implements InterfaceC24140x8, InterfaceC74605TPt {
    public final C30699C3b LJLIL;

    @Override // X.InterfaceC74605TPt
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC74605TPt
    public final /* synthetic */ void LJI() {
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC24140x8
    public final /* synthetic */ void LJIIL(String str, String str2) {
    }

    public void setDataChannel(DataChannel dataChannel) {
    }

    public /* bridge */ /* synthetic */ void setLinkMicLiveEffectCallback(InterfaceC17140lq interfaceC17140lq) {
    }

    @Override // X.InterfaceC24140x8
    public /* bridge */ /* synthetic */ void setStreamCallback(InterfaceC21030s7 interfaceC21030s7) {
    }

    @Override // X.InterfaceC74605TPt
    public final void LJII() {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LJII();
        }
    }

    @Override // X.InterfaceC24140x8
    public final boolean LJIILIIL() {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            return c30699C3b.LJLJJLL;
        }
        return true;
    }

    @Override // X.InterfaceC24140x8
    public Object getAttachedComposerManager() {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            return c30699C3b.LJLLLLLL;
        }
        return null;
    }

    @Override // X.InterfaceC24140x8
    public InterfaceC75217TfZ getEffectWrapperProxy() {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            return c30699C3b.getEffectWrapperProxy();
        }
        return null;
    }

    @Override // X.InterfaceC24140x8
    public InterfaceC21020s6 getLiveStream() {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            return c30699C3b.LJLJLLL;
        }
        return null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        CKO cko;
        super.onAttachedToWindow();
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null && (cko = c30699C3b.LJLJLLL) != null) {
            cko.LJIIJJI(C78857UxB.LJJIIJ(1476788234, "bpea-multiguest_livestream_resume_inpreview_panel"));
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LJIILJJIL();
        }
    }

    @Override // X.InterfaceC74605TPt
    public final Boolean LJ() {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC24140x8
    public final void LIZ(boolean z) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LIZ(z);
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LIZIZ(C78862UxG c78862UxG) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LIZIZ(c78862UxG);
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LIZJ(Cert cert) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LIZJ(cert);
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIIZ(int i) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LJIIIZ(i);
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIJ(Cert cert) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LJIIJ(cert);
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void release(Cert cert) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.release(cert);
        }
    }

    @Override // X.InterfaceC24140x8
    public void setCurrentLayoutParam(ViewGroup.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC24140x8
    public void setReleaseMode(boolean z) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LJLLLL = z;
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LJFF(boolean z, Cert cert) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LJFF(z, cert);
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIJJI(Cert cert, boolean z) {
        C30699C3b c30699C3b = this.LJLIL;
        if (c30699C3b != null) {
            c30699C3b.LJIIJJI(cert, z);
        }
    }

    public C30702C3e(Context context, C24130x7 c24130x7, Object obj) {
        super(context, null);
        this.LJLIL = new C30699C3b("LinkMicPreviewView", context, this, null, c24130x7, obj);
    }
}
