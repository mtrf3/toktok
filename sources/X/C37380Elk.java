package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Elk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37380Elk implements InterfaceC31943CgF {
    public final /* synthetic */ BQ6<java.util.Map<?, ?>> LIZ;
    public final /* synthetic */ BQ6<C37394Ely> LIZIZ;

    @Override // X.InterfaceC31943CgF
    public final void LIZ(java.util.Map<String, Object> data) {
        Object LIZ;
        String str;
        o.LJIIIZ(data, "data");
        BQ6<java.util.Map<?, ?>> bq6 = this.LIZ;
        BQ6<C37394Ely> bq62 = this.LIZIZ;
        try {
            Object obj = data.get("code");
            Object obj2 = data.get("msg");
            java.util.Map<?, ?> map = null;
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (o.LJ(obj, 1)) {
                Object obj3 = data.get("data");
                if (obj3 instanceof java.util.Map) {
                    map = (java.util.Map) obj3;
                }
                bq6.accept(map);
            } else {
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                bq62.accept(new C37394Ely(((Integer) obj).intValue(), str));
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        BQ6<C37394Ely> bq63 = this.LIZIZ;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            bq63.accept(new C37394Ely(m10exceptionOrNullimpl.getMessage()));
        }
    }

    public C37380Elk(C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        this.LIZ = c37399Em3;
        this.LIZIZ = c37400Em4;
    }
}
