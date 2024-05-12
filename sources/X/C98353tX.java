package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.3tX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98353tX extends AbstractC65781Prl implements InterfaceC65784Pro<float[]> {
    public static final C98353tX LJLIL = new C98353tX();

    public C98353tX() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final float[] invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        float[] fArr = C98343tW.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("large_tablet_feed_resize_opt_v3_threshold", float[].class, fArr);
        if (LJIIIIZZ == 0) {
            C98343tW.LIZ.getClass();
        } else {
            fArr = LJIIIIZZ;
        }
        o.LJIIIIZZ(fArr, "SettingsManager.getInsta…ngs::class.java) ?: VALUE");
        return fArr;
    }
}
