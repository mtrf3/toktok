package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49951xf extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C08410Ur<? extends Object>, Object> {
    public static final C49951xf LJLIL = new C49951xf();

    public C49951xf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0MK c0mk, C08410Ur<? extends Object> c08410Ur) {
        EnumC08480Uy enumC08480Uy;
        Object LIZ;
        C0MK Saver = c0mk;
        C08410Ur<? extends Object> it = c08410Ur;
        o.LJIIIZ(Saver, "$this$Saver");
        o.LJIIIZ(it, "it");
        T t = it.LIZ;
        if (t instanceof C0V2) {
            enumC08480Uy = EnumC08480Uy.Paragraph;
        } else if (t instanceof C0VD) {
            enumC08480Uy = EnumC08480Uy.Span;
        } else if (t instanceof C1NA) {
            enumC08480Uy = EnumC08480Uy.VerbatimTts;
        } else if (t instanceof C08470Ux) {
            enumC08480Uy = EnumC08480Uy.Url;
        } else {
            enumC08480Uy = EnumC08480Uy.String;
        }
        int ordinal = enumC08480Uy.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            LIZ = it.LIZ;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        T t2 = it.LIZ;
                        o.LJII(t2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        LIZ = C0VC.LIZ(t2, C0VC.LJ, Saver);
                    }
                } else {
                    T t3 = it.LIZ;
                    o.LJII(t3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    LIZ = C0VC.LIZ(t3, C0VC.LIZLLL, Saver);
                }
            } else {
                T t4 = it.LIZ;
                o.LJII(t4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                LIZ = C0VC.LIZ(t4, C0VC.LJI, Saver);
            }
        } else {
            T t5 = it.LIZ;
            o.LJII(t5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            LIZ = C0VC.LIZ(t5, C0VC.LJFF, Saver);
        }
        return C47261Igj.LJII(enumC08480Uy, LIZ, Integer.valueOf(it.LIZIZ), Integer.valueOf(it.LIZJ), it.LIZLLL);
    }
}
