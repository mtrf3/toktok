package X;

import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.vesdk.effect.IEffect;

/* renamed from: X.Wza, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84102Wza implements P4G {
    public final /* synthetic */ C46193IAz LIZ;

    public C84102Wza(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.P4G
    public final void LIZ(EnumC63837P3p enumC63837P3p) {
        C84094WzS c84094WzS;
        boolean z;
        IEffect LIZIZ = this.LIZ.getCameraApiComponent().rX().LJ().LIZIZ();
        if ((LIZIZ instanceof C84094WzS) && (c84094WzS = (C84094WzS) LIZIZ) != null) {
            if (enumC63837P3p == EnumC63837P3p.DEFAULT) {
                z = true;
            } else {
                z = false;
            }
            TEBundle obtain = TEBundle.obtain();
            obtain.setBool("DefaultAudioDevice", z);
            obtain.setInt("effectInterfaceName", 47);
            c84094WzS.LJLIL.callEffectInterface(obtain);
        }
    }
}
