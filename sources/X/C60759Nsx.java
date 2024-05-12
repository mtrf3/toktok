package X;

import ujb.s;

/* renamed from: X.Nsx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60759Nsx implements InterfaceC60639Nr1 {
    public final /* synthetic */ C60737Nsb LIZ;

    public C60759Nsx(C60737Nsb c60737Nsb) {
        this.LIZ = c60737Nsb;
    }

    @Override // X.InterfaceC60639Nr1
    public final void LIZ(AbstractC60629Nqr abstractC60629Nqr) {
        C60763Nt1 c60763Nt1;
        String str;
        if (!(abstractC60629Nqr instanceof C60763Nt1) || (c60763Nt1 = (C60763Nt1) abstractC60629Nqr) == null) {
            return;
        }
        C60737Nsb c60737Nsb = this.LIZ;
        boolean z = false;
        if (c60737Nsb != null && (str = c60737Nsb.url) != null && s.LJJJLZIJ(str, "not_open_album=1", false)) {
            z = true;
        }
        c60763Nt1.LJLJL = z;
    }
}
