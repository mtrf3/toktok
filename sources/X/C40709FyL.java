package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;

/* renamed from: X.FyL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40709FyL extends O44 {
    public final C64797Pbt<?> LJFF;

    @Override // X.O44
    public final InputStream LIZIZ() {
        Object obj;
        TypedInput typedInput;
        C64797Pbt<?> c64797Pbt = this.LJFF;
        if (c64797Pbt != null) {
            obj = c64797Pbt.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof TypedInput) || (typedInput = (TypedInput) obj) == null) {
            return null;
        }
        return typedInput.in();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C40709FyL(X.C64797Pbt<?> r9, X.AbstractC40713FyP r10) {
        /*
            r8 = this;
            X.EeA r0 = r9.LIZ
            int r7 = r0.LIZIZ
            java.util.List<X.EJ6> r1 = r0.LIZLLL
            java.lang.String r0 = "ssResponse.headers()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r5 = r1.iterator()
        L14:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r4 = r5.next()
            X.EJ6 r4 = (X.EJ6) r4
            java.lang.String r3 = r4.LIZ
            java.lang.String r0 = "header.name"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = "ENGLISH"
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r1 = X.C141415gn.LIZIZ(r2, r1, r3, r2, r0)
            java.lang.String r0 = r4.LIZIZ
            r6.put(r1, r0)
            goto L14
        L37:
            r8.<init>(r7, r6, r10)
            r8.LJFF = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40709FyL.<init>(X.Pbt, X.FyP):void");
    }

    public C40709FyL(int i, java.util.Map<String, String> map, AbstractC40713FyP abstractC40713FyP) {
        super(i, map, abstractC40713FyP);
    }
}
