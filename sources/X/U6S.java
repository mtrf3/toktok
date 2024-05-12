package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.bpea.basics.Cert;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6S implements InterfaceC74695TTf {
    public final /* synthetic */ U64 LIZ;

    @Override // X.InterfaceC74695TTf
    public final List<String> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC74695TTf
    public final void LIZJ(boolean z) {
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIIIZ(String source, boolean z) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIIJ(C78862UxG c78862UxG, String str) {
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIILJJIL(Bitmap bitmap) {
    }

    @Override // X.InterfaceC74695TTf
    public final void switchAudio(boolean z) {
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJI() {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            return LLLLZLL.LIZIZ;
        }
        return false;
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJIIIIZZ() {
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && u66.LLLLZLL() != null) {
            return U7U.LJJJJ;
        }
        return false;
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJIIJJI() {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            return LLLLZLL.LIZJ;
        }
        return false;
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJIILIIL() {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            return LLLLZLL.LIZ;
        }
        return false;
    }

    @Override // X.InterfaceC74695TTf
    public final void pause() {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJJJ();
        }
    }

    @Override // X.InterfaceC74695TTf
    public final void resume() {
        U7U LLLLZLL;
        this.LIZ.LLJILJILJ().LLZLLLL(Boolean.TRUE);
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJJJLL();
        }
    }

    public U6S(U64 u64) {
        this.LIZ = u64;
    }

    @Override // X.InterfaceC74695TTf
    public final void LIZ(C75745To5 c75745To5) {
        this.LIZ.LJLL = c75745To5;
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIIL(Cert cert) {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJJZ(cert);
        }
    }

    @Override // X.InterfaceC74695TTf
    public final void LJJIIZ(String str) {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJIJJ(str);
        }
    }

    @Override // X.InterfaceC74695TTf
    public final boolean a5(String linkMicId) {
        U7U LLLLZLL;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            return LLLLZLL.LJIJJLI(linkMicId);
        }
        return false;
    }

    @Override // X.InterfaceC74695TTf
    public final void sendRoomMessage(String str) {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJJJZ(str);
        }
    }

    @Override // X.InterfaceC74695TTf
    public final void LIZLLL(String source, boolean z) {
        U7U LLLLZLL;
        o.LJIIIZ(source, "source");
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJIL(source, z);
        }
    }

    @Override // X.InterfaceC74695TTf
    public final void LJFF(String str, boolean z) {
        U7U LLLLZLL;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJLIIIJJI(str, z);
        }
    }

    @Override // X.InterfaceC74695TTf
    public final void sendUserMessage(String linkMicId, String str) {
        U7U LLLLZLL;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJJJZI(linkMicId, str);
        }
    }

    @Override // X.InterfaceC74695TTf
    public final void LJ(String linkMicId, String str, boolean z) {
        U7U LLLLZLL;
        o.LJIIIZ(linkMicId, "linkMicId");
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJJ(linkMicId, "business_mute_remote_host", z);
        }
    }

    @Override // X.InterfaceC74695TTf
    public final void LJII(boolean z, ImageModel imageModel, String source, boolean z2, boolean z3) {
        U7U LLLLZLL;
        o.LJIIIZ(source, "source");
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLLLZLL = u66.LLLLZLL()) != null) {
            LLLLZLL.LJJIZ(z, imageModel, source, z2, z3);
        }
    }
}
