package X;

import kotlin.jvm.internal.AqS177S0100000_11;

/* renamed from: X.R7z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69047R7z extends R4N {
    public final /* synthetic */ InterfaceC88472Yns<R40<C69023R7b>, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<R40<C69023R7b>, C76800UCe> LIZIZ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<C69023R7b> r40) {
        if (r40 != null) {
            InterfaceC88472Yns<R40<C69023R7b>, C76800UCe> interfaceC88472Yns = this.LIZIZ;
            C69023R7b c69023R7b = r40.LJIIIZ;
            if (c69023R7b != null && c69023R7b.LJFF != null) {
                interfaceC88472Yns.invoke(r40);
                return;
            }
        }
        this.LIZ.invoke(r40);
    }

    public C69047R7z(AqS177S0100000_11 aqS177S0100000_11, AqS177S0100000_11 aqS177S0100000_112) {
        this.LIZ = aqS177S0100000_11;
        this.LIZIZ = aqS177S0100000_112;
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<C69023R7b> r40, int i) {
        this.LIZ.invoke(r40);
    }
}
