package X;

import com.ss.android.ttve.nativePort.TEBundle;

/* renamed from: X.Wzc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84104Wzc implements P4G {
    public final /* synthetic */ C84092WzQ LIZ;

    public C84104Wzc(C84092WzQ c84092WzQ) {
        this.LIZ = c84092WzQ;
    }

    @Override // X.P4G
    public final void LIZ(EnumC63837P3p enumC63837P3p) {
        boolean z;
        X0G x0g = this.LIZ.LIZ;
        if (enumC63837P3p == EnumC63837P3p.DEFAULT) {
            z = true;
        } else {
            z = false;
        }
        x0g.getClass();
        TEBundle obtain = TEBundle.obtain();
        obtain.setBool("DefaultAudioDevice", z);
        obtain.setInt("effectInterfaceName", 47);
        x0g.LJLIL.callEffectInterface(obtain);
    }
}
