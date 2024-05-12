package X;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;

/* renamed from: X.Yby, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87734Yby {
    public static final SparseArray<Matcher> LIZJ;
    public final InterfaceC87736Yc0 LIZ;
    public InterfaceC87738Yc2 LIZIZ;

    static {
        Matcher matcher = PatternProtector.compile("^\\s*[*+-]\\s+(.*)").matcher("");
        Matcher matcher2 = PatternProtector.compile("^\\s*\\d+\\.\\s+(.*)").matcher("");
        Matcher matcher3 = PatternProtector.compile("(<sup>)(\\d+)(</sup>)").matcher("");
        Matcher matcher4 = PatternProtector.compile("(<u><b>)([\\s\\S]+?)(</b></u>)").matcher("");
        Matcher matcher5 = PatternProtector.compile("(.*?) {2} *$").matcher("");
        Matcher matcher6 = PatternProtector.compile("^\\s*$").matcher("");
        SparseArray<Matcher> sparseArray = new SparseArray<>();
        LIZJ = sparseArray;
        sparseArray.put(9, matcher);
        sparseArray.put(10, matcher2);
        sparseArray.put(14, matcher3);
        sparseArray.put(15, matcher4);
        sparseArray.put(25, matcher6);
        sparseArray.put(26, matcher5);
    }

    public C87734Yby(C8FJ c8fj) {
        this.LIZ = c8fj;
    }

    public final boolean LIZIZ(C87735Ybz c87735Ybz) {
        c87735Ybz.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c87735Ybz.LJFF;
        Matcher LIZLLL = LIZLLL(15, spannableStringBuilder);
        if (LIZLLL == null || !LIZLLL.find()) {
            return false;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(LIZLLL.start(2), LIZLLL.end(2));
        spannableStringBuilder.delete(LIZLLL.start(0), LIZLLL.end(0));
        spannableStringBuilder.insert(LIZLLL.start(0), (CharSequence) this.LIZ.LIZ(subSequence));
        LIZIZ(c87735Ybz);
        return true;
    }

    public final boolean LIZJ(C87735Ybz c87735Ybz) {
        boolean LIZIZ = LIZIZ(c87735Ybz);
        boolean LJFF = LJFF(c87735Ybz);
        if (LIZIZ || LJFF) {
            return true;
        }
        return false;
    }

    public final boolean LJFF(C87735Ybz c87735Ybz) {
        c87735Ybz.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c87735Ybz.LJFF;
        Matcher LIZLLL = LIZLLL(14, spannableStringBuilder);
        if (LIZLLL == null || !LIZLLL.find()) {
            return false;
        }
        for (int i = 0; i <= LIZLLL.groupCount(); i++) {
            LIZLLL.start(i);
            LIZLLL.end(i);
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(LIZLLL.start(2), LIZLLL.end(2));
        spannableStringBuilder.delete(LIZLLL.start(0), LIZLLL.end(0));
        spannableStringBuilder.insert(LIZLLL.start(0), (CharSequence) this.LIZ.LIZLLL(subSequence));
        LJFF(c87735Ybz);
        return true;
    }

    public static final boolean LIZ(int i, C87735Ybz c87735Ybz) {
        String str;
        Matcher LIZLLL;
        if (c87735Ybz == null || (str = c87735Ybz.LJ) == null || (LIZLLL = LIZLLL(i, str)) == null || !LIZLLL.find()) {
            return false;
        }
        return true;
    }

    public static Matcher LIZLLL(int i, CharSequence charSequence) {
        Matcher matcher = LIZJ.get(i, null);
        if (matcher != null) {
            matcher.reset(charSequence);
        }
        return matcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(int r11, X.C87735Ybz r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.LJ
            r9 = 10
            java.util.regex.Matcher r2 = LIZLLL(r9, r0)
            r1 = 0
            if (r2 == 0) goto Lcd
            boolean r0 = r2.find()
            if (r0 == 0) goto Lcd
            r8 = 3
            r12.LJI = r8
            X.Ybz r3 = new X.Ybz
            r4 = 1
            java.lang.String r6 = r2.group(r4)
            r3.<init>(r6)
            r12.LJIIIIZZ = r1
            X.Ybz r5 = r12.LIZJ
            X.Yc2 r0 = r10.LIZIZ
            X.Ybw r2 = r0.LLLLLLL()
            X.Ybz r7 = r12.LIZ
            if (r7 == 0) goto L80
            int r1 = r7.LJI
            if (r1 == r8) goto L33
            r0 = 2
            if (r1 != r0) goto L35
        L33:
            r12.LJIIIIZZ = r11
        L35:
            int r0 = r7.LJI
            if (r0 != r8) goto L80
            int r1 = r7.LJIIIIZZ
            int r0 = r12.LJIIIIZZ
            if (r1 != r0) goto L80
            int r0 = r7.LJII
            int r0 = r0 + 1
            r12.LJII = r0
        L45:
            X.Yc0 r8 = r10.LIZ
            int r7 = r12.LJIIIIZZ
            int r1 = r12.LJII
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r8.LIZIZ(r7, r1, r0)
            r12.LJFF = r0
            r0 = 9
            boolean r0 = LIZ(r0, r3)
            if (r0 == 0) goto L83
            int r0 = r12.LJIIIIZZ
            int r1 = r0 + 1
            r3.LJII()
            if (r5 == 0) goto L72
            X.Ybz r0 = r5.LJ()
            r0.LIZ(r3)
            r2.LIZ()
            r10.LJI(r1, r3)
        L71:
            return r4
        L72:
            r12.LIZIZ(r3)
            r2.LIZ()
            java.lang.Object r0 = r2.LIZJ
            X.Ybz r0 = (X.C87735Ybz) r0
            r10.LJI(r1, r0)
            goto L71
        L80:
            r12.LJII = r4
            goto L45
        L83:
            boolean r0 = LIZ(r9, r3)
            if (r0 == 0) goto Lae
            int r0 = r12.LJIIIIZZ
            int r1 = r0 + 1
            r3.LJII()
            if (r5 == 0) goto La0
            X.Ybz r0 = r5.LJ()
            r0.LIZ(r3)
            r2.LIZ()
            r10.LJ(r1, r3)
        L9f:
            return r4
        La0:
            r12.LIZIZ(r3)
            r2.LIZ()
            java.lang.Object r0 = r2.LIZJ
            X.Ybz r0 = (X.C87735Ybz) r0
            r10.LJ(r1, r0)
            goto L9f
        Lae:
            boolean r0 = r6 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto Lc6
        Lb2:
            r12.LJFF = r6
            r10.LIZJ(r12)
            X.Yc0 r3 = r10.LIZ
            java.lang.CharSequence r2 = r12.LJFF
            int r1 = r12.LJIIIIZZ
            int r0 = r12.LJII
            android.text.SpannableStringBuilder r0 = r3.LIZIZ(r1, r0, r2)
            r12.LJFF = r0
            return r4
        Lc6:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r6)
            r6 = r0
            goto Lb2
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87734Yby.LJ(int, X.Ybz):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.text.SpannableStringBuilder] */
    public final boolean LJI(int i, C87735Ybz c87735Ybz) {
        int i2;
        Matcher LIZLLL = LIZLLL(9, c87735Ybz.LJ);
        if (LIZLLL == null || !LIZLLL.find()) {
            return false;
        }
        c87735Ybz.LJI = 2;
        String group = LIZLLL.group(1);
        C87735Ybz c87735Ybz2 = new C87735Ybz(group);
        c87735Ybz.LIZ(c87735Ybz2);
        c87735Ybz.LJIIIIZZ = 0;
        C87735Ybz c87735Ybz3 = c87735Ybz.LIZJ;
        C87732Ybw LLLLLLL = this.LIZIZ.LLLLLLL();
        C87735Ybz c87735Ybz4 = c87735Ybz.LIZ;
        if (c87735Ybz4 != null && ((i2 = c87735Ybz4.LJI) == 3 || i2 == 2)) {
            c87735Ybz.LJIIIIZZ = i;
        }
        c87735Ybz.LJFF = this.LIZ.LIZJ(c87735Ybz.LJIIIIZZ, " ");
        if (LIZ(9, c87735Ybz2)) {
            int i3 = c87735Ybz.LJIIIIZZ + 1;
            c87735Ybz2.LJII();
            if (c87735Ybz3 != null) {
                c87735Ybz3.LJ().LIZ(c87735Ybz2);
                LLLLLLL.LIZ();
                LJI(i3, c87735Ybz2);
            } else {
                c87735Ybz.LIZIZ(c87735Ybz2);
                LLLLLLL.LIZ();
                LJI(i3, (C87735Ybz) LLLLLLL.LIZJ);
            }
            return true;
        }
        if (LIZ(10, c87735Ybz2)) {
            int i4 = c87735Ybz.LJIIIIZZ + 1;
            c87735Ybz2.LJII();
            if (c87735Ybz3 != null) {
                c87735Ybz3.LJ().LIZ(c87735Ybz2);
                LLLLLLL.LIZ();
                LJ(i4, c87735Ybz2);
            } else {
                c87735Ybz.LIZIZ(c87735Ybz2);
                LLLLLLL.LIZ();
                LJ(i4, (C87735Ybz) LLLLLLL.LIZJ);
            }
            return true;
        }
        if (!(group instanceof SpannableStringBuilder)) {
            group = new SpannableStringBuilder(group);
        }
        c87735Ybz.LJFF = group;
        LIZJ(c87735Ybz);
        c87735Ybz.LJFF = this.LIZ.LIZJ(c87735Ybz.LJIIIIZZ, c87735Ybz.LJFF);
        return true;
    }
}
