package X;

import java.util.LinkedHashMap;

/* renamed from: X.Y8n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86897Y8n implements C0C3 {
    public final /* synthetic */ C86894Y8k LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC86908Y8y LJLJI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        for (C79236V7w c79236V7w : ((LinkedHashMap) this.LJLIL.LJLJI).values()) {
            if (c79236V7w != null) {
                c79236V7w.LIZ();
            }
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C86898Y8o LIZ;
        C78856UxA tabAt = this.LJLIL.getTabAt(i);
        int LIZ2 = C86894Y8k.LIZ(i, this.LJLILLLLZI, this.LJLIL.LJLILLLLZI);
        this.LJLJI.onSelect(LIZ2);
        for (C79236V7w c79236V7w : ((LinkedHashMap) this.LJLIL.LJLJI).values()) {
            if (c79236V7w != null && (LIZ = c79236V7w.LIZ()) != null) {
                LIZ.LIZJ(tabAt, LIZ2);
            }
        }
    }

    public C86897Y8n(C86894Y8k c86894Y8k, boolean z, InterfaceC86908Y8y interfaceC86908Y8y) {
        this.LJLIL = c86894Y8k;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC86908Y8y;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        for (C79236V7w c79236V7w : ((LinkedHashMap) this.LJLIL.LJLJI).values()) {
            if (c79236V7w != null) {
                c79236V7w.LIZ();
            }
        }
    }
}
