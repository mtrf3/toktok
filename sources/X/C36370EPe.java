package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import ujb.o;
import ujb.s;

/* renamed from: X.EPe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36370EPe {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C36371EPf.LJLIL);

    public static String LIZLLL(String str) {
        if (s.LJJJLZIJ(str, "file://", false)) {
            return o.LJJJJZ(str, "file://", "", false);
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r4 = new com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse(-1, r0.toString(), 0, "");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequest r7, X.InterfaceC67352kd<? super com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C36369EPd
            if (r0 == 0) goto L20
            r5 = r8
            X.EPd r5 = (X.C36369EPd) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequest r7 = r5.LJLIL
            goto L46
        L20:
            X.EPd r5 = new X.EPd
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r4)
            X.Ol8 r0 = r6.LIZ     // Catch: java.lang.Exception -> L4c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L4c
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectService r1 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectService) r1     // Catch: java.lang.Exception -> L4c
            r5.LJLIL = r7     // Catch: java.lang.Exception -> L4c
            r5.LJLJJI = r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "android"
            java.lang.Object r4 = r1.createMobileEffect(r7, r0, r5)     // Catch: java.lang.Exception -> L4c
            if (r4 != r3) goto L49
            return r3
        L46:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L4c
        L49:
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse r4 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse) r4     // Catch: java.lang.Exception -> L4c
            goto L5a
        L4c:
            r0 = move-exception
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse r4 = new com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = ""
            r1 = -1
            r0 = 0
            r4.<init>(r1, r3, r0, r2)
        L5a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "create effect api finished, effectId="
            r1.<init>(r0)
            java.lang.String r0 = r7.customAppEffectId
            r1.append(r0)
            java.lang.String r0 = ", response="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "DiyProp"
            X.C15280iq.LJ(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36370EPe.LIZIZ(com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequest, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect r14, com.ss.android.ugc.aweme.publish.model.UploadImageConfig r15, com.ss.android.ugc.aweme.publish.model.UploadImageConfig r16, java.lang.String r17, java.lang.Integer r18, X.InterfaceC67352kd<? super java.lang.Boolean> r19) {
        /*
            r13 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C36367EPb
            r4 = r13
            if (r0 == 0) goto L45
            r11 = r3
            X.EPb r11 = (X.C36367EPb) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r11.LJLJI = r2
        L15:
            java.lang.Object r3 = r11.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r11.LJLJI
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L4b
            X.C141335gf.LIZJ(r3)
        L23:
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse r3 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse) r3
            boolean r0 = X.C78926UyI.LJJIJIIJIL(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2e:
            X.C141335gf.LIZJ(r3)
            r10 = 0
            r12 = 96
            r11.LJLJI = r0
            r9 = r18
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            java.lang.Object r3 = LIZJ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L23
            return r2
        L45:
            X.EPb r11 = new X.EPb
            r11.<init>(r4, r3)
            goto L15
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36370EPe.LIZ(com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect, com.ss.android.ugc.aweme.publish.model.UploadImageConfig, com.ss.android.ugc.aweme.publish.model.UploadImageConfig, java.lang.String, java.lang.Integer, X.2kd):java.lang.Object");
    }

    public static Object LIZJ(C36370EPe c36370EPe, UploadableMobileEffect uploadableMobileEffect, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, String str, Integer num, String str2, InterfaceC67352kd interfaceC67352kd, int i) {
        String str3;
        Integer num2 = num;
        String str4 = str;
        if ((i & 8) != 0) {
            str4 = "mobile_effect_template";
        }
        if ((i & 16) != 0) {
            num2 = 310;
        }
        String str5 = null;
        if ((i & 32) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i & 64) == 0) {
            str5 = str2;
        }
        c36370EPe.getClass();
        return C48841JEv.LJI(new EQQ(uploadableMobileEffect, c36370EPe, str4, num2, str5, str3, uploadImageConfig2, uploadImageConfig, null), interfaceC67352kd);
    }
}
