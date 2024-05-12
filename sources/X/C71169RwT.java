package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* renamed from: X.RwT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71169RwT extends AbstractC60811Ntn {
    public final /* synthetic */ C40135Fp5 LJLILLLLZI;

    public C71169RwT(C40135Fp5 c40135Fp5) {
        this.LJLILLLLZI = c40135Fp5;
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLZIJ(SparkContext sparkContext, C0D5 c0d5) {
        JSONObject jSONObject;
        if (c0d5.LIZ == 4 && (jSONObject = C71166RwQ.LJIIIZ) != null) {
            C40135Fp5 c40135Fp5 = this.LJLILLLLZI;
            long j = JSONObjectProtectorUtils.getLong(jSONObject, "start_click_time");
            if (j != c40135Fp5.LJLJI) {
                c40135Fp5.LJLJI = j;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) c0d5.LIZIZ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    java.util.Map<String, ? extends Object> LJJIIZI = C51029K0z.LJJIIZI(new OSZ("shopping_list_datas", jSONObject));
                    InterfaceC60761Nsz interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLIL;
                    if (interfaceC60761Nsz != null) {
                        interfaceC60761Nsz.LIZ(LJJIIZI);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    @Override // X.AbstractC60673NrZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(X.InterfaceC60761Nsz r8, java.lang.String r9, X.C60704Ns4 r10) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r6 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r9, r6)
            boolean r0 = X.C71150RwA.LIZJ
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            java.lang.Integer r0 = r10.LIZ
            if (r0 == 0) goto L55
            int r1 = r0.intValue()
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 != r0) goto L51
            r0 = 1010(0x3f2, float:1.415E-42)
        L1d:
            X.L3i r5 = X.EnumC53638L3i.SHOP_BAG_LIST
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = r10.LIZIZ
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = X.C71150RwA.LIZIZ
            if (r1 != 0) goto L30
            java.lang.String r1 = ""
        L30:
            java.lang.String r0 = "room_id"
            r2.put(r0, r1)
            java.lang.Integer r0 = r10.LIZ
            if (r0 == 0) goto L4f
            int r0 = r0.intValue()
        L3d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sub_error_code"
            r2.put(r0, r1)
            r2.put(r6, r9)
            java.lang.String r0 = "rd_tiktokec_shop_bag_list_exception"
            X.C66832jn.LIZIZ(r0, r5, r4, r3, r2)
            goto Le
        L4f:
            r0 = -1
            goto L3d
        L51:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 >= r0) goto L58
        L55:
            r0 = 1001(0x3e9, float:1.403E-42)
            goto L1d
        L58:
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71169RwT.LJJJJIZL(X.Nsz, java.lang.String, X.Ns4):void");
    }
}
