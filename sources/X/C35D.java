package X;

import defpackage.a1;
import defpackage.q;

/* renamed from: X.35D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35D {
    public static final OJD LIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[eE][+-]?");
        LIZ2.append("(\\p{Digit}+)");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("(0[xX]", "(\\p{XDigit}+)", "(\\.)?)|(0[xX]", "(\\p{XDigit}+)", "?(\\.)");
        String LIZIZ2 = q.LIZIZ(LIZLLL, "(\\p{XDigit}+)", ')', LIZLLL);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append('(');
        LIZ3.append("(\\p{Digit}+)");
        LIZ3.append("(\\.)?(");
        LIZ3.append("(\\p{Digit}+)");
        LIZ3.append("?)(");
        YE1.LIZLLL(LIZ3, LIZIZ, ")?)|(\\.(", "(\\p{Digit}+)", ")(");
        YE1.LIZLLL(LIZ3, LIZIZ, ")?)|((", LIZIZ2, ")[pP][+-]?");
        LIZ = new OJD(a1.LJ("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", q.LIZIZ(LIZ3, "(\\p{Digit}+)", ')', LIZ3), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
