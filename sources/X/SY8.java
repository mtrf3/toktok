package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes13.dex */
public final class SY8 extends AbstractC65781Prl implements InterfaceC65784Pro<PorterDuffXfermode> {
    public static final SY8 LJLIL = new SY8();

    public SY8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PorterDuffXfermode invoke() {
        return new PorterDuffXfermode(PorterDuff.Mode.XOR);
    }
}
