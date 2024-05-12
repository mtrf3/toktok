package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46361rs extends AbstractC65781Prl implements InterfaceC88472Yns<C279917z, Boolean> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46361rs(long j) {
        super(1);
        this.LJLIL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C279917z c279917z) {
        boolean z;
        C279917z it = c279917z;
        o.LJIIIZ(it, "it");
        if (it.LIZ == this.LJLIL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
