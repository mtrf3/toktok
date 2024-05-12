package X;

import org.json.JSONObject;

/* renamed from: X.8aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213748aA {
    public final C213758aB LIZ;
    public final C213758aB LIZIZ;
    public final C213758aB LIZJ;
    public final C213758aB LIZLLL;
    public final C213758aB LJ;
    public final C213758aB LJFF;
    public final C213758aB LJI;

    public C213748aA() {
        C213758aB c213758aB = C213758aB.LJLJI;
        this.LIZ = c213758aB;
        this.LIZIZ = c213758aB;
        this.LIZJ = c213758aB;
        this.LIZLLL = c213758aB;
        this.LJ = c213758aB;
        this.LJFF = c213758aB;
        this.LJI = c213758aB;
    }

    public final void LIZ(JSONObject jSONObject) {
        try {
            C213758aB c213758aB = this.LIZ;
            jSONObject.put("life_attach", c213758aB.LJLILLLLZI - c213758aB.LJLIL);
            C213758aB c213758aB2 = this.LIZIZ;
            jSONObject.put("life_create", c213758aB2.LJLILLLLZI - c213758aB2.LJLIL);
            C213758aB c213758aB3 = this.LIZJ;
            jSONObject.put("life_create_view", c213758aB3.LJLILLLLZI - c213758aB3.LJLIL);
            C213758aB c213758aB4 = this.LIZLLL;
            jSONObject.put("life_view_created", c213758aB4.LJLILLLLZI - c213758aB4.LJLIL);
            C213758aB c213758aB5 = this.LJ;
            jSONObject.put("life_activity_created", c213758aB5.LJLILLLLZI - c213758aB5.LJLIL);
            C213758aB c213758aB6 = this.LJFF;
            jSONObject.put("life_start", c213758aB6.LJLILLLLZI - c213758aB6.LJLIL);
            C213758aB c213758aB7 = this.LJI;
            C3C5.m7constructorimpl(jSONObject.put("life_resume", c213758aB7.LJLILLLLZI - c213758aB7.LJLIL));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T LIZIZ(X.C8WY r5, X.InterfaceC65784Pro<? extends T> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int[] r1 = X.C8WZ.LIZ
            int r0 = r5.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L31;
                case 2: goto L2e;
                case 3: goto L2b;
                case 4: goto L28;
                case 5: goto L25;
                case 6: goto L22;
                case 7: goto L1f;
                default: goto L10;
            }
        L10:
            r3 = 0
        L11:
            java.lang.Object r2 = r6.invoke()
            if (r3 != 0) goto L18
        L17:
            return r2
        L18:
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.LJLILLLLZI = r0
            goto L17
        L1f:
            X.8aB r3 = r4.LJI
            goto L33
        L22:
            X.8aB r3 = r4.LJFF
            goto L33
        L25:
            X.8aB r3 = r4.LJ
            goto L33
        L28:
            X.8aB r3 = r4.LIZLLL
            goto L33
        L2b:
            X.8aB r3 = r4.LIZJ
            goto L33
        L2e:
            X.8aB r3 = r4.LIZIZ
            goto L33
        L31:
            X.8aB r3 = r4.LIZ
        L33:
            if (r3 != 0) goto L36
            goto L11
        L36:
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.LJLIL = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C213748aA.LIZIZ(X.8WY, X.Pro):java.lang.Object");
    }
}
