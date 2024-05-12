package X;

import android.content.pm.ShortcutInfo;

/* renamed from: X.MzS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58614MzS extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public final /* synthetic */ N29 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58614MzS(N29 n29) {
        super(0);
        this.LJLIL = n29;
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        N29 n29 = this.LJLIL;
        N2A n2a = n29.LIZ;
        if (n2a != null) {
            return n2a.LJI;
        }
        ShortcutInfo shortcutInfo = n29.LIZIZ;
        if (shortcutInfo != null) {
            return Integer.valueOf(shortcutInfo.getRank());
        }
        return null;
    }
}
