package X;

import kotlin.jvm.internal.AqS181S0100000_15;

/* renamed from: X.Xk2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85686Xk2 implements C2YO {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZIZ;

    @Override // X.C2YO
    public final void onUpdateFailed(String str) {
        this.LIZIZ.invoke(str);
    }

    @Override // X.C2YO
    public final void onUpdateSuccess(boolean z) {
        this.LIZ.invoke(Boolean.valueOf(z));
    }

    public C85686Xk2(AqS181S0100000_15 aqS181S0100000_15, AqS181S0100000_15 aqS181S0100000_152) {
        this.LIZ = aqS181S0100000_15;
        this.LIZIZ = aqS181S0100000_152;
    }
}
