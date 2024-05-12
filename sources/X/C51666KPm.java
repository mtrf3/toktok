package X;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* renamed from: X.KPm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51666KPm extends AbstractC65781Prl implements InterfaceC65784Pro<PorterDuffColorFilter> {
    public static final C51666KPm LJLIL = new C51666KPm();

    public C51666KPm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PorterDuffColorFilter invoke() {
        return new PorterDuffColorFilter(Color.argb(128, 0, 0, 0), PorterDuff.Mode.DARKEN);
    }
}
