package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.0wN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23670wN extends Exception {
    public final String LJLIL;
    public final CharSequence LJLILLLLZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC23670wN(String type) {
        this(type, null, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(type, "type");
    }

    public CharSequence getErrorMessage() {
        return this.LJLILLLLZI;
    }

    public String getType() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC23670wN(java.lang.String r2, java.lang.CharSequence r3) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            if (r3 == 0) goto L13
            java.lang.String r0 = r3.toString()
        Lb:
            r1.<init>(r0)
            r1.LJLIL = r2
            r1.LJLILLLLZI = r3
            return
        L13:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23670wN.<init>(java.lang.String, java.lang.CharSequence):void");
    }

    public /* synthetic */ AbstractC23670wN(String str, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }
}
