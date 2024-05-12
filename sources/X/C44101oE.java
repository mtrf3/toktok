package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.1oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44101oE extends C36561c4 {
    public static final AnonymousClass103 Companion = new Object() { // from class: X.103
    };
    public final AbstractC24960yS LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C44101oE(AbstractC24960yS domError) {
        this(domError, null, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(domError, "domError");
    }

    public final AbstractC24960yS getDomError() {
        return this.LJLJJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C44101oE(X.AbstractC24960yS r3, java.lang.CharSequence r4) {
        /*
            r2 = this;
            java.lang.String r0 = "domError"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r1.append(r0)
            java.lang.String r0 = r3.LIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0, r4)
            r2.LJLJJI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44101oE.<init>(X.0yS, java.lang.CharSequence):void");
    }

    public /* synthetic */ C44101oE(AbstractC24960yS abstractC24960yS, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC24960yS, (i & 2) != 0 ? null : charSequence);
    }
}
