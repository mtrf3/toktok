package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OXx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62077OXx<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;

    public C62077OXx(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        String res = this.LIZ;
        o.LJIIIIZZ(res, "res");
        c73516StE.onSuccess(new OYP(res, this.LIZIZ, 4));
    }
}
