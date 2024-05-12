package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttm.player.IMediaDataSource;
import java.io.FileDescriptor;

/* renamed from: X.Izg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48436Izg implements InterfaceC47775Ip1 {
    public AbstractC48434Ize LIZ;

    @Override // X.InterfaceC47775Ip1
    public final void LIZ(FileDescriptor fileDescriptor, long j, long j2) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJII(IMediaDataSource iMediaDataSource) {
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIL(int i, int i2) {
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean LJI() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize == null || (abstractC48434Ize instanceof C48408IzE)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIIIZZ() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJI();
        }
    }

    public final int LJJ() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJIIIIZZ();
        }
        return 0;
    }

    public final void LJJI() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIILJJIL();
        }
    }

    public final void LJJIFFI() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIILLIIL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final int getCurrentPosition() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getDuration() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getPlayerType() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJI();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getVideoHeight() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJII();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getVideoWidth() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJIIIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean isMute() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJIIJ();
        }
        return false;
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean isPlaying() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJIIJJI();
        }
        return false;
    }

    @Override // X.InterfaceC47775Ip1
    public final void pause() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIIL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void prepareAsync() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIILIIL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void release() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIILL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void reset() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIIZILJ();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void start() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJJIZL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void stop() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJJJ();
        }
    }

    public C48436Izg() {
        C16880lQ.LJLLJ(C48436Izg.class);
    }

    @Override // X.InterfaceC47775Ip1
    public final String LIZIZ(int i) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJFF(i);
        }
        return null;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIJ(boolean z) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIIJ(z);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILIIL(C47811Ipb c47811Ipb) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJLIJ(c47811Ipb);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILJJIL(InterfaceC48415IzL interfaceC48415IzL) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJIIJI(interfaceC48415IzL);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILL(C47811Ipb c47811Ipb) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIL(c47811Ipb);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILLIIL(InterfaceC48418IzO interfaceC48418IzO) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIZ(interfaceC48418IzO);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIZILJ(InterfaceC48417IzN interfaceC48417IzN) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJL(interfaceC48417IzN);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJI(C47811Ipb c47811Ipb) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIIZI(c47811Ipb);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJJ(String str) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJI();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJJLI(InterfaceC48414IzK interfaceC48414IzK) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJ(interfaceC48414IzK);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIL(InterfaceC48416IzM interfaceC48416IzM) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJIL(interfaceC48416IzM);
        }
    }

    public final void LJJII(VAL val) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJIIJIL(val);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void seekTo(int i) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJ(i);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJI(surfaceHolder);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setLooping(boolean z) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIIZ(z);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setPlaybackParams(C46886Iag c46886Iag) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJ(c46886Iag);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setSurface(Surface surface) {
        if (this.LIZ != null) {
            if (surface != null && !surface.isValid()) {
                return;
            }
            this.LIZ.LJJJJ(surface);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final int LIZJ(float f, int i) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJJIFFI(f, i);
        }
        return -1;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LIZLLL(int i, String str) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJIL(i, str);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJ(int i, int i2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIII(i, i2);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final long LJFF(int i, long j) {
        if (this.LIZ != null) {
            return r0.LJJIIJZLJL(i, j);
        }
        return -1L;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIIZ(Context context, android.net.Uri uri) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJJ(context, uri);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final int LJIIJJI(int i, int i2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZLLL(i, i2);
        }
        return i2;
    }

    @Override // X.InterfaceC47775Ip1
    public final float getFloatOption(int i, float f) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZJ(i, f);
        }
        return f;
    }

    @Override // X.InterfaceC47775Ip1
    public final long getLongOption(int i, long j) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJ(i, j);
        }
        return j;
    }

    @Override // X.InterfaceC47775Ip1
    public final void setVolume(float f, float f2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJJI(f, f2);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJ(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJJLI(context, uri, map);
        }
    }
}
