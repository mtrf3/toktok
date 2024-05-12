package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyData;

/* renamed from: X.EDh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36061EDh {
    public static final C36061EDh LIZ = new C36061EDh();

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaPattern>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C36063EDj
            if (r0 == 0) goto L67
            r3 = r7
            X.EDj r3 = (X.C36063EDj) r3
            int r2 = r3.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r3.LJLJI = r2
        L12:
            java.lang.Object r5 = r3.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJI
            r4 = 1
            if (r0 == 0) goto L59
            if (r0 != r4) goto L6d
            X.C141335gf.LIZJ(r5)
        L20:
            java.util.List r5 = (java.util.List) r5
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyData r1 = new com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyData
            r0 = 0
            r1.<init>(r0, r4, r0)
            if (r5 == 0) goto L2d
            r1.setData(r5)
        L2d:
            java.util.List r0 = r1.getData()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L58
        L3a:
            java.lang.String r3 = X.C75792yF.LIZJ(r1)
            java.lang.String r0 = "toJson(goofyData)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            com.bytedance.keva.Keva r2 = X.C35367DuN.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "roma_rule_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.storeString(r0, r3)
        L58:
            return r5
        L59:
            X.C141335gf.LIZJ(r5)
            X.EDg r0 = com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyApi.LIZ
            r3.LJLJI = r4
            java.lang.Object r5 = r0.LIZ(r3)
            if (r5 != r1) goto L20
            return r1
        L67:
            X.EDj r3 = new X.EDj
            r3.<init>(r6, r7)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36061EDh.LIZIZ(X.2kd):java.lang.Object");
    }

    public final Object LIZ(boolean z, C3CS c3cs) {
        RomaGoofyData romaGoofyData;
        if (z) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C35367DuN.LIZ(1), C65330PkU.LIZJ(C65352Pkq.LJI(RomaGoofyData.class)));
                if (!(fromJson instanceof RomaGoofyData)) {
                    fromJson = null;
                }
                romaGoofyData = (RomaGoofyData) fromJson;
            } catch (s unused) {
                romaGoofyData = null;
            }
            if (romaGoofyData == null) {
                return null;
            }
            return romaGoofyData.getData();
        }
        return LIZIZ(c3cs);
    }
}
