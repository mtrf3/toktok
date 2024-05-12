package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: X.FyN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40711FyN extends O44 {
    public final C36910EeA LJFF;

    @Override // X.O44
    public final InputStream LIZIZ() {
        Integer num;
        InputStream inputStream;
        TypedInput typedInput;
        String str = this.LIZJ.get("content-length");
        if (str != null) {
            num = C38350F3i.LJJIL(str);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return new ByteArrayInputStream(new byte[0]);
        }
        try {
            C36910EeA c36910EeA = this.LJFF;
            if (c36910EeA != null && (typedInput = c36910EeA.LJ) != null) {
                inputStream = typedInput.in();
            } else {
                inputStream = null;
            }
            if (inputStream == null) {
                C39930Flm.LIZJ("TTNetDepender", "response in empty when providing input stream", null, true);
            }
            return inputStream;
        } catch (Throwable th) {
            C39930Flm.LIZJ("TTNetDepender", "error occurs when getting input stream from response", th, true);
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C40711FyN(X.C36910EeA r8, X.AbstractC40713FyP r9) {
        /*
            r7 = this;
            int r6 = r8.LIZIZ
            java.util.List<X.EJ6> r1 = r8.LIZLLL
            java.lang.String r0 = "response.headers"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r4 = r1.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r3 = r4.next()
            X.EJ6 r3 = (X.EJ6) r3
            java.lang.String r2 = r3.LIZ
            java.lang.String r0 = "header.name"
            kotlin.jvm.internal.o.LJFF(r2, r0)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = "Locale.ENGLISH"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.String r0 = r3.LIZIZ
            r5.put(r1, r0)
            goto L12
        L3b:
            r7.<init>(r6, r5, r9)
            r7.LJFF = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40711FyN.<init>(X.EeA, X.FyP):void");
    }

    public C40711FyN(int i, java.util.Map<String, String> map, AbstractC40713FyP abstractC40713FyP) {
        super(i, map, abstractC40713FyP);
    }
}
