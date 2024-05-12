package X;

import java.io.BufferedReader;
import java.io.StringReader;

/* renamed from: X.Ybx, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87733Ybx {
    public final C87734Yby LIZ;
    public final BufferedReader LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        if (r2.LIZLLL != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        if (r5.LIZ.LJ(0, (X.C87735Ybz) r2.LIZJ) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        if (r5.LIZ.LJI(0, (X.C87735Ybz) r2.LIZJ) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        r1 = (X.C87735Ybz) r2.LIZJ;
        r1.LJFF = android.text.SpannableStringBuilder.valueOf(r1.LJ);
        r5.LIZ.LIZJ((X.C87735Ybz) r2.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        if (r2.LIZ() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        r2.LIZJ = r2.LIZIZ;
        r4 = new android.text.SpannableStringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        r0 = (X.C87735Ybz) r2.LIZJ;
        r1 = r0.LIZIZ;
        r4.append(r0.LJFF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ab, code lost:
    
        r4.append('\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        if (r2.LIZ() != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Spannable LIZ() {
        /*
            r5 = this;
            java.io.BufferedReader r0 = r5.LIZIZ
            java.lang.String r0 = r0.readLine()
            r4 = 0
            r2 = r4
            r3 = r4
        L9:
            if (r0 == 0) goto L2b
            X.Ybz r1 = new X.Ybz
            r1.<init>(r0)
            if (r3 != 0) goto L1f
            X.Ybw r2 = new X.Ybw
            r2.<init>(r1)
            r3 = r1
        L18:
            java.io.BufferedReader r0 = r5.LIZIZ
            java.lang.String r0 = r0.readLine()
            goto L9
        L1f:
            if (r2 == 0) goto L18
            java.lang.Object r0 = r2.LIZLLL
            X.Ybz r0 = (X.C87735Ybz) r0
            r0.LIZIZ(r1)
            r2.LIZLLL = r1
            goto L18
        L2b:
            if (r2 != 0) goto L2e
        L2d:
            return r4
        L2e:
            X.Yby r1 = r5.LIZ
            X.Yc1 r0 = new X.Yc1
            r0.<init>(r2)
            r1.LIZIZ = r0
        L37:
            java.lang.Object r1 = r2.LIZJ
            X.Ybz r1 = (X.C87735Ybz) r1
            if (r1 == 0) goto L68
            r0 = 25
            boolean r0 = X.C87734Yby.LIZ(r0, r1)
            if (r0 == 0) goto L68
            java.lang.Object r3 = r2.LIZJ
            X.Ybz r3 = (X.C87735Ybz) r3
            java.lang.Object r0 = r2.LIZLLL
            X.Ybz r0 = (X.C87735Ybz) r0
            if (r3 != r0) goto L5f
            X.Ybz r1 = r0.LIZ
        L51:
            X.Ybz r0 = r3.LIZJ
            if (r0 != 0) goto L5b
            r3.LJI()
        L58:
            r2.LIZJ = r1
            goto L37
        L5b:
            r3.LJFF()
            goto L58
        L5f:
            X.Ybz r1 = r3.LIZIZ
            java.lang.Object r0 = r2.LIZIZ
            if (r3 != r0) goto L51
            r2.LIZIZ = r1
            goto L51
        L68:
            java.lang.Object r0 = r2.LIZJ
            r3 = 0
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.LIZIZ
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.LIZLLL
            if (r0 != 0) goto L76
            goto L2d
        L76:
            X.Yby r1 = r5.LIZ
            java.lang.Object r0 = r2.LIZJ
            X.Ybz r0 = (X.C87735Ybz) r0
            boolean r0 = r1.LJ(r3, r0)
            if (r0 != 0) goto L8e
            X.Yby r1 = r5.LIZ
            java.lang.Object r0 = r2.LIZJ
            X.Ybz r0 = (X.C87735Ybz) r0
            boolean r0 = r1.LJI(r3, r0)
            if (r0 == 0) goto Lb8
        L8e:
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L76
            java.lang.Object r0 = r2.LIZIZ
            r2.LIZJ = r0
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
        L9d:
            java.lang.Object r0 = r2.LIZJ
            X.Ybz r0 = (X.C87735Ybz) r0
            X.Ybz r1 = r0.LIZIZ
            java.lang.CharSequence r0 = r0.LJFF
            r4.append(r0)
            if (r1 != 0) goto Lab
            goto L2d
        Lab:
            r0 = 10
            r4.append(r0)
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L9d
            goto L2d
        Lb8:
            java.lang.Object r1 = r2.LIZJ
            X.Ybz r1 = (X.C87735Ybz) r1
            java.lang.String r0 = r1.LJ
            android.text.SpannableStringBuilder r0 = android.text.SpannableStringBuilder.valueOf(r0)
            r1.LJFF = r0
            X.Yby r1 = r5.LIZ
            java.lang.Object r0 = r2.LIZJ
            X.Ybz r0 = (X.C87735Ybz) r0
            r1.LIZJ(r0)
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87733Ybx.LIZ():android.text.Spannable");
    }

    public C87733Ybx(String str, C8FJ c8fj) {
        this.LIZ = new C87734Yby(c8fj);
        this.LIZIZ = new BufferedReader(new StringReader(str == null ? "" : str));
    }
}
