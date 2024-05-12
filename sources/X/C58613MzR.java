package X;

import android.content.pm.ShortcutInfo;

/* renamed from: X.MzR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58613MzR extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ N29 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58613MzR(N29 n29) {
        super(0);
        this.LJLIL = n29;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String id;
        String str;
        N29 n29 = this.LJLIL;
        N2A n2a = n29.LIZ;
        if (n2a == null || (str = n2a.LIZIZ) == null) {
            ShortcutInfo shortcutInfo = n29.LIZIZ;
            if (shortcutInfo == null || (id = shortcutInfo.getId()) == null) {
                return "";
            }
            return id;
        }
        return str;
    }
}
