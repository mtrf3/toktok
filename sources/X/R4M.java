package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class R4M extends R4N {
    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public void onSuccess(R40<R7E> r40) {
        HashMap LIZJ = C03660Ck.LIZJ("event", "on send code success");
        R4K r4k = R4K.LIZ;
        String abstractMap = LIZJ.toString();
        o.LJIIIIZZ(abstractMap, "map.toString()");
        r4k.LIZIZ(abstractMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r6 != null) goto L9;
     */
    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onError(X.R40<X.R7E> r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L44
            int r0 = r6.LIZLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L9:
            java.lang.String r3 = ""
            if (r0 != 0) goto L3a
            r2 = r3
            if (r6 == 0) goto L12
        L10:
            java.lang.String r4 = r6.LJFF
        L12:
            java.lang.String r1 = "event"
            java.lang.String r0 = "on send code error"
            java.util.HashMap r1 = X.C03660Ck.LIZJ(r1, r0)
            if (r2 != 0) goto L1d
            r2 = r3
        L1d:
            java.lang.String r0 = "errorCode"
            r1.put(r0, r2)
            if (r4 != 0) goto L38
        L24:
            java.lang.String r0 = "errorMsg"
            r1.put(r0, r3)
            X.R4K r2 = X.R4K.LIZ
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "map.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LIZIZ(r1)
            return
        L38:
            r3 = r4
            goto L24
        L3a:
            kotlin.jvm.internal.o.LJI(r6)
            int r0 = r6.LIZLLL
            java.lang.String r2 = java.lang.String.valueOf(r0)
            goto L10
        L44:
            r0 = r4
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R4M.onError(X.R40, int):void");
    }
}
