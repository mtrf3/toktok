package X;

import com.ss.android.ugc.tiktok.addyours.api.IAddYoursApiDefinition;

/* renamed from: X.8k6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219908k6 {
    public static final C219908k6 LIZ = new C219908k6();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C30O.LJLIL);

    public static IAddYoursApiDefinition LIZ() {
        return (IAddYoursApiDefinition) LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r6, X.InterfaceC67352kd<? super com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C219918k7
            if (r0 == 0) goto L3b
            r4 = r8
            X.8k7 r4 = (X.C219918k7) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.C141335gf.LIZJ(r3)
        L20:
            X.Ee8 r3 = (X.AbstractC36908Ee8) r3
            r3.checkValid()
            java.lang.String r0 = "api.getTopicSticker(topicId).checkValid()"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            return r3
        L2b:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.tiktok.addyours.api.IAddYoursApiDefinition r0 = LIZ()
            r4.LJLJI = r1
            java.lang.Object r3 = r0.getTopicSticker(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L3b:
            X.8k7 r4 = new X.8k7
            r4.<init>(r5, r8)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219908k6.LIZIZ(long, X.2kd):java.lang.Object");
    }

    public static InterfaceC37276Ek4 LIZJ(int i, String str, long j, long j2, boolean z, int i2) {
        int i3;
        IAddYoursApiDefinition LIZ2 = LIZ();
        if (((Boolean) C219928k8.LIZ.getValue()).booleanValue()) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        return LIZ2.getTopicDetail(j, z, i, j2, 30, i2, i3, str);
    }
}
