package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Li2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54986Li2 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C54986Li2(String platformName) {
        o.LJIIIZ(platformName, "platformName");
        this.LJLIL = platformName;
        this.LJLILLLLZI = i0.LJFF(platformName, "_dialog_bind_phone_or_email");
        this.LJLJI = i0.LJFF(platformName, "_dialog_last_time_appear");
        this.LJLJJI = i0.LJFF(platformName, "_dialog_has_bind");
    }
}
