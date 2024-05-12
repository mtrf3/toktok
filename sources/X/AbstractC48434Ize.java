package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttm.player.ABRStrategy;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.MaskInfo;
import com.ss.ttm.player.SubInfo;
import com.ss.ttm.player.TraitObject;
import java.io.FileDescriptor;

/* renamed from: X.Ize, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48434Ize {
    public abstract int LIZ();

    public abstract int LIZIZ();

    public float LIZJ(int i, float f) {
        return f;
    }

    public int LIZLLL(int i, int i2) {
        return i2;
    }

    public long LJ(int i, long j) {
        return j;
    }

    public String LJFF(int i) {
        return null;
    }

    public abstract int LJI();

    public abstract int LJII();

    public int LJIIIIZZ() {
        return 0;
    }

    public abstract int LJIIIZ();

    public boolean LJIIJ() {
        return false;
    }

    public abstract boolean LJIIJJI();

    public abstract void LJIIL();

    public abstract void LJIILIIL();

    public abstract void LJIILJJIL();

    public abstract void LJIILL();

    public abstract void LJIILLIIL();

    public abstract void LJIIZILJ();

    public abstract void LJIJ(int i);

    public void LJIJI() {
    }

    public abstract void LJIJJ(Context context, android.net.Uri uri);

    public abstract void LJIJJLI(Context context, android.net.Uri uri, java.util.Map<String, String> map);

    public abstract void LJIL(IMediaDataSource iMediaDataSource);

    public abstract void LJJ(FileDescriptor fileDescriptor, long j, long j2);

    public abstract void LJJI(SurfaceHolder surfaceHolder);

    public int LJJIFFI(float f, int i) {
        return -1;
    }

    public abstract void LJJII(C47791IpH c47791IpH);

    public void LJJIII(int i, int i2) {
    }

    public void LJJIIJ(boolean z) {
    }

    public int LJJIIJZLJL(int i, long j) {
        return -1;
    }

    public abstract void LJJIIZ(boolean z);

    public abstract void LJJIIZI(C47811Ipb c47811Ipb);

    public abstract void LJJIJ(InterfaceC48414IzK interfaceC48414IzK);

    public abstract void LJJIJIIJI(InterfaceC48415IzL interfaceC48415IzL);

    public abstract void LJJIJIIJIL(VAL val);

    public abstract void LJJIJIL(InterfaceC48416IzM interfaceC48416IzM);

    public abstract void LJJIJL(InterfaceC48417IzN interfaceC48417IzN);

    public abstract void LJJIJLIJ(C47811Ipb c47811Ipb);

    public abstract void LJJIL(C47811Ipb c47811Ipb);

    public abstract void LJJIZ(InterfaceC48418IzO interfaceC48418IzO);

    public abstract void LJJJ(C46886Iag c46886Iag);

    public abstract void LJJJI();

    public void LJJJIL(int i, String str) {
    }

    public abstract void LJJJJ(Surface surface);

    public abstract void LJJJJI(float f, float f2);

    public abstract void LJJJJIZL();

    public abstract void LJJJJJ();

    public abstract void LJJJJJL(int i, int i2);

    public Object getObjectOption(int i) {
        return null;
    }

    public String getSubtitleContent(int i) {
        return null;
    }

    public void seekTo(int i, int i2) {
    }

    public void setABRStrategy(ABRStrategy aBRStrategy) {
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
    }

    public void setLoadControl(LoadControl loadControl) {
    }

    public void setMaskInfo(MaskInfo maskInfo) {
    }

    public void setSubInfo(SubInfo subInfo) {
    }

    public void setTraitObject(int i, TraitObject traitObject) {
    }
}
