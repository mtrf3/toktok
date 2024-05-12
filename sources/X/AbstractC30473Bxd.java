package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import java.util.List;

/* renamed from: X.Bxd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC30473Bxd implements InterfaceC12610eX {
    public List<IVideoEffectProcessor.FaceDetectListener> LJLIL;
    public final ConcurrentHashSet<InterfaceC30516ByK> LJLILLLLZI = new ConcurrentHashSet<>();
    public InterfaceC30498By2 LJLJI;

    public abstract void LIZIZ(C11030bz c11030bz);

    public abstract void LIZJ(boolean z);

    public abstract EffectImageInfo LIZLLL();

    public abstract void LJ(AbstractC39330Fc6 abstractC39330Fc6);

    public abstract void LJFF();

    public abstract void LJI();

    public abstract int LJII(String str);

    public abstract int LJIIIZ(int i, int i2, int i3, String str);

    public abstract int LJIIJ(String str);

    public abstract void LJIIL(InterfaceC30497By1 interfaceC30497By1);

    public abstract void LJIILIIL(C30477Bxh c30477Bxh, boolean z, boolean z2);

    public final void LIZ(InterfaceC30516ByK interfaceC30516ByK) {
        this.LJLILLLLZI.add(interfaceC30516ByK);
    }

    public final void LJIIIIZZ(InterfaceC30516ByK interfaceC30516ByK) {
        this.LJLILLLLZI.remove(interfaceC30516ByK);
    }

    public synchronized void LJIIJJI(InterfaceC30498By2 interfaceC30498By2) {
        this.LJLJI = interfaceC30498By2;
    }
}
