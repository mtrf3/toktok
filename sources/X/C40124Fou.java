package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Fou, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40124Fou extends AbstractC40122Fos {
    @Override // X.AbstractC40122Fos
    public final String LJI() {
        return "ecom";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    @Override // X.AbstractC40122Fos
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.hybrid.spark.SparkContext r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sparkContext"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            super.LJ(r11, r12)
            X.C40115Fol.LIZ(r11, r12)
            X.Fov r0 = X.EnumC40125Fov.LOAD_INIT
            X.C40126Fow.LIZ = r0
            X.F9u r2 = r11.extraRuntimeInfo
            r1 = 0
            if (r2 == 0) goto L1a
            java.lang.String r0 = "initTimestamp"
            java.lang.Object r1 = r2.get(r0)
        L1a:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L7a
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L7a
            long r0 = r1.longValue()
        L26:
            X.C40126Fow.LIZIZ = r0
            java.lang.String r0 = r11.url
            java.lang.String r0 = X.C115694gP.LIZ(r0)
            boolean r0 = X.O3U.LJIILL(r0)
            java.lang.String r5 = "1"
            java.lang.String r4 = "0"
            if (r0 == 0) goto L78
            r1 = r5
        L39:
            com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService r0 = com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService.v3()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L76
            boolean r0 = r0.LLJLILLLLZIIL()
            if (r0 != r2) goto L76
        L47:
            java.lang.String r0 = "offline"
            r11.LJJIIZ(r1, r0)
            java.lang.String r0 = "ec_mall_has_shop_tab"
            r11.LJJIIZ(r5, r0)
            X.FlX r4 = new X.FlX
            kotlin.jvm.internal.AqS156S0100000_6 r5 = new kotlin.jvm.internal.AqS156S0100000_6
            r0 = 118(0x76, float:1.65E-43)
            r5.<init>(r11, r0)
            kotlin.jvm.internal.AqS188S0100000_6 r6 = new kotlin.jvm.internal.AqS188S0100000_6
            r0 = 16
            r6.<init>(r11, r0)
            kotlin.jvm.internal.AqS172S0100000_6 r7 = new kotlin.jvm.internal.AqS172S0100000_6
            r0 = 106(0x6a, float:1.49E-43)
            r7.<init>(r11, r0)
            kotlin.jvm.internal.IDqS431S0100000_6 r8 = new kotlin.jvm.internal.IDqS431S0100000_6
            r0 = 0
            r8.<init>(r11, r0)
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r11.LJJI(r4)
            goto L7f
        L76:
            r5 = r4
            goto L47
        L78:
            r1 = r4
            goto L39
        L7a:
            long r0 = java.lang.System.currentTimeMillis()
            goto L26
        L7f:
            java.lang.String r0 = r11.url     // Catch: java.lang.Exception -> L92
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = r0.getAuthority()     // Catch: java.lang.Exception -> L92
            if (r1 == 0) goto L92
            java.lang.String r0 = "_popup"
            boolean r3 = ujb.o.LJJJJ(r1, r0, r3)     // Catch: java.lang.Exception -> L92
            goto L93
        L92:
            r3 = 0
        L93:
            kotlin.jvm.internal.AqS156S0100000_6 r1 = new kotlin.jvm.internal.AqS156S0100000_6
            r0 = 119(0x77, float:1.67E-43)
            r1.<init>(r11, r0)
            if (r3 == 0) goto Lb9
            X.CLY r0 = new X.CLY
            r0.<init>(r1)
            r11.LJJIJIIJIL(r0)
        La4:
            java.lang.String r1 = r11.url
            if (r1 == 0) goto Lb8
            java.lang.String r0 = "use_default_failed_view=1"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r2)
            if (r0 != r2) goto Lb8
            X.Nze r0 = new X.Nze
            r0.<init>()
            r11.LJJIJIL(r0)
        Lb8:
            return
        Lb9:
            X.FoT r0 = new X.FoT
            r0.<init>(r1)
            r11.LJJIJIIJI(r0)
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40124Fou.LJ(com.bytedance.hybrid.spark.SparkContext, java.lang.String):void");
    }

    @Override // X.AbstractC40122Fos
    public final void LJFF(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJFF(sparkContext, str);
        E99.LIZ(sparkContext, str);
    }
}
