package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Aqb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27489Aqb implements GBL {
    public final /* synthetic */ C27486AqY LJLIL;

    @Override // X.GBL
    public void onExit() {
    }

    public C27489Aqb(C27486AqY c27486AqY) {
        this.LJLIL = c27486AqY;
    }

    @Override // X.GBL
    public void onChanged(String phoneCode, String shortCountryName) {
        o.LJIIIZ(phoneCode, "phoneCode");
        o.LJIIIZ(shortCountryName, "shortCountryName");
        this.LJLIL.LIZJ(phoneCode, shortCountryName);
        this.LJLIL.getOnCountryCodeChangeListener().invoke();
    }
}
