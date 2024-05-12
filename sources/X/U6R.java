package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.bpea.basics.Cert;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6R implements InterfaceC74695TTf {
    public final /* synthetic */ U65 LIZ;

    @Override // X.InterfaceC74695TTf
    public final List<String> LIZIZ() {
        return this.LIZ.LJLJJL.LLLLZLL().LJJ;
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJI() {
        return this.LIZ.LJLJJL.LLLLZLL().LIZIZ;
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJIIIIZZ() {
        this.LIZ.LJLJJL.LLLLZLL().getClass();
        return U7U.LJJJJ;
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJIIJJI() {
        return this.LIZ.LJLJJL.LLLLZLL().LIZJ;
    }

    @Override // X.InterfaceC74695TTf
    public final boolean LJIILIIL() {
        return this.LIZ.LJLJJL.LLLLZLL().LIZ;
    }

    @Override // X.InterfaceC74695TTf
    public final void pause() {
        this.LIZ.LJLJJL.LLLLZLL().LJJJJ();
    }

    @Override // X.InterfaceC74695TTf
    public final void resume() {
        this.LIZ.LJLJJL.LLLLZLL().LJJJJLL();
    }

    public U6R(U65 u65) {
        this.LIZ = u65;
    }

    @Override // X.InterfaceC74695TTf
    public final void LIZ(C75745To5 c75745To5) {
        this.LIZ.LJLJL = c75745To5;
    }

    @Override // X.InterfaceC74695TTf
    public final void LIZJ(boolean z) {
        this.LIZ.LJLJJL.LLLLZLL().LJIIJ(z);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIIL(Cert cert) {
        this.LIZ.LJLJJL.LLLLZLL().LJJJZ(cert);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIILJJIL(Bitmap bitmap) {
        this.LIZ.LJLJJL.LLLLZLL().LJJJLL(bitmap);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJJIIZ(String str) {
        this.LIZ.LJLJJL.LLLLZLL().LJIJJ(str);
    }

    @Override // X.InterfaceC74695TTf
    public final boolean a5(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LIZ.LJLJJL.LLLLZLL().LJIJJLI(linkMicId);
    }

    @Override // X.InterfaceC74695TTf
    public final void sendRoomMessage(String str) {
        this.LIZ.LJLJJL.LLLLZLL().LJJJJZ(str);
    }

    @Override // X.InterfaceC74695TTf
    public final void switchAudio(boolean z) {
        this.LIZ.LJLJJL.LLLLZLL().LJJLIIIIJ(z);
    }

    @Override // X.InterfaceC74695TTf
    public final void LIZLLL(String source, boolean z) {
        o.LJIIIZ(source, "source");
        this.LIZ.LJLJJL.LLLLZLL().LJJIL(source, z);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJFF(String str, boolean z) {
        this.LIZ.LJLJJL.LLLLZLL().LJJLIIIJJI(str, z);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIIIZ(String source, boolean z) {
        o.LJIIIZ(source, "source");
        this.LIZ.LJLJJL.LLLLZLL().LJIIIIZZ(source, z);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJIIJ(C78862UxG c78862UxG, String str) {
        this.LIZ.LJLJJL.LLLLZLL().LJIIJJI(c78862UxG, str);
    }

    @Override // X.InterfaceC74695TTf
    public final void sendUserMessage(String targetLinkMicId, String str) {
        o.LJIIIZ(targetLinkMicId, "targetLinkMicId");
        this.LIZ.LJLJJL.LLLLZLL().LJJJJZI(targetLinkMicId, str);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJ(String linkMicId, String str, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ.LJLJJL.LLLLZLL().LJJJ(linkMicId, str, z);
    }

    @Override // X.InterfaceC74695TTf
    public final void LJII(boolean z, ImageModel imageModel, String source, boolean z2, boolean z3) {
        o.LJIIIZ(source, "source");
        this.LIZ.LJLJJL.LLLLZLL().LJJIZ(z, imageModel, source, z2, z3);
        if (z) {
            C31014CFe.LIZ(new ArrayList());
            C31014CFe.LIZIZ(new ArrayList());
            C31014CFe.LIZJ(new ArrayList());
            C31014CFe.LJFF("");
            C31014CFe.LJI("");
            C31014CFe.LJIIZILJ("");
            C31014CFe.LJII("");
            C31014CFe.LJIIIIZZ("");
            C31014CFe.LJJIIJZLJL = 4;
        }
    }
}
