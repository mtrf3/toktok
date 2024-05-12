package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC172246pQ extends BinderC172046p6 {
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC172246pQ(String str, String templateId, int i) {
        super(str);
        o.LJIIIZ(templateId, "templateId");
        this.LJLILLLLZI = str;
        this.LJLJI = templateId;
        this.LJLJJI = i;
    }

    public final void LIZ(int i, int i2, String str, String str2, String str3) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("template_id", this.LJLJI);
        c145995oB.LJI("template_url", str2);
        c145995oB.LIZ(i, "duration");
        c145995oB.LIZ(i2, "error_code");
        c145995oB.LJI("error_msg", str3);
        c145995oB.LIZ(this.LJLJJI, WM7.SCENE_SERVICE);
        FMX.LJIIL(str, c145995oB.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    @Override // com.ss.android.ugc.cut_reportor_interface.ICutReporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void report(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r11 = this;
            r5 = r11
            java.lang.String r4 = r5.LJLILLLLZI
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r2.append(r12)
            java.lang.String r0 = " : "
            r2.append(r0)
            r9 = r13
            r2.append(r9)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r14)
            r10 = r16
            X.YE1.LIZLLL(r2, r0, r15, r0, r10)
            r1 = r18
            r3 = r17
            X.YE1.LIZLLL(r2, r0, r3, r0, r1)
            java.lang.String r2 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.6qZ r0 = X.C172946qY.LIZ
            if (r0 != 0) goto L3c
        L39:
            if (r14 == 0) goto Lb5
            goto L40
        L3c:
            r0.LJ(r4, r2)
            goto L39
        L40:
            int r0 = r14.length()     // Catch: java.lang.NumberFormatException -> L69
            if (r0 != 0) goto L47
            goto Lb5
        L47:
            int r6 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r14)     // Catch: java.lang.NumberFormatException -> L69
            if (r6 >= 0) goto L4e
            return
        L4e:
            if (r15 == 0) goto L5c
            int r0 = r15.length()     // Catch: java.lang.NumberFormatException -> L69
            if (r0 != 0) goto L57
            goto L5c
        L57:
            int r7 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r15)     // Catch: java.lang.NumberFormatException -> L69
            goto L5d
        L5c:
            r7 = 0
        L5d:
            r0 = 3
            if (r12 == r0) goto Laf
            r0 = 4
            if (r12 == r0) goto La9
            r0 = 5
            if (r12 == r0) goto La3
            r0 = 6
            if (r12 == r0) goto L6a
        L69:
            return
        L6a:
            X.5oB r2 = new X.5oB
            r2.<init>()
            java.lang.String r4 = r5.LJLJI
            java.lang.String r0 = "template_id"
            r2.LJI(r0, r4)
            java.lang.String r0 = "template_url"
            r2.LJI(r0, r9)
            java.lang.String r0 = "duration"
            r2.LIZ(r6, r0)
            java.lang.String r0 = "error_code"
            r2.LIZ(r7, r0)
            java.lang.String r0 = "error_msg"
            r2.LJI(r0, r10)
            java.lang.String r0 = "fetch_count"
            r2.LJI(r0, r3)
            java.lang.String r0 = "failed_count"
            r2.LJI(r0, r1)
            java.lang.String r1 = "scene"
            int r0 = r5.LJLJJI
            r2.LIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "cutsame_fetch_effect"
            X.FMX.LJIIL(r0, r1)
            goto L69
        La3:
            java.lang.String r8 = "cutsame_decode_template"
            r5.LIZ(r6, r7, r8, r9, r10)
            goto L69
        La9:
            java.lang.String r8 = "cutsame_unzip_template"
            r5.LIZ(r6, r7, r8, r9, r10)
            goto L69
        Laf:
            java.lang.String r8 = "cutsame_download_zip"
            r5.LIZ(r6, r7, r8, r9, r10)
            goto L69
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BinderC172246pQ.report(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
