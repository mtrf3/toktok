package ms.bd.o;

import X.C64735Pat;
import X.InterfaceC39184FZk;

/* loaded from: classes7.dex */
public final class h2 extends g2 {
    public long LIZ;

    public final void finalize() {
        k.a(50331650, 0, this.LIZ, null, null);
        k.a(100663298, 0, this.LIZ, null, null);
        this.LIZ = -1L;
        super.finalize();
    }

    @Override // ms.bd.o.g2
    public final Object LIZJ(long j) {
        this.LIZ = j;
        a aVar = new a();
        synchronized (this) {
            C64735Pat.LJIILL = aVar;
        }
        return Boolean.TRUE;
    }

    /* loaded from: classes7.dex */
    public class a implements InterfaceC39184FZk {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0149 A[RETURN] */
        @Override // X.InterfaceC39184FZk
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map<java.lang.String, java.lang.String> onCallToAddSecurityFactor(java.lang.String r19, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r20) {
            /*
                Method dump skipped, instructions count: 413
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.h2.a.onCallToAddSecurityFactor(java.lang.String, java.util.Map):java.util.Map");
        }
    }
}
