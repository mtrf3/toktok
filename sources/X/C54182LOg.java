package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: X.LOg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54182LOg extends AbstractC65781Prl implements InterfaceC65784Pro<PorterDuffXfermode> {
    public static final C54182LOg LJLIL = new C54182LOg();

    public C54182LOg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PorterDuffXfermode invoke() {
        return new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    }
}
