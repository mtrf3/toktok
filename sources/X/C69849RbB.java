package X;

import com.ss.android.ugc.aweme.ecommerce.core.engine.module.ModuleId;

/* renamed from: X.RbB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69849RbB {
    public static final java.util.Map<Integer, C69850RbC> LIZ;

    static {
        EnumC26549AbR enumC26549AbR = EnumC26549AbR.GLOBAL_PRODUCT_DETAIL_V1;
        C69850RbC c69850RbC = new C69850RbC(new C69852RbE(enumC26549AbR.getTemplate()), C47261Igj.LJJIJIIJI(new ModuleId("header"), new ModuleId("product_info"), new ModuleId("sku"), new ModuleId("service"), new ModuleId("promotion"), new ModuleId("bundle_deal"), new ModuleId("review"), new ModuleId("buy_together"), new ModuleId("shop_profile"), new ModuleId("brick_list")));
        EnumC26549AbR enumC26549AbR2 = EnumC26549AbR.TTF_UK_PRODUCT_DETAIL;
        C69850RbC c69850RbC2 = new C69850RbC(new C69852RbE(enumC26549AbR2.getTemplate()), C47261Igj.LJJIJIIJI(new ModuleId("header"), new ModuleId("product_info"), new ModuleId("sku"), new ModuleId("service"), new ModuleId("promotion"), new ModuleId("product_prop"), new ModuleId("size_guide"), new ModuleId("review"), new ModuleId("buy_together"), new ModuleId("shop_profile"), new ModuleId("brick_list")));
        EnumC26549AbR enumC26549AbR3 = EnumC26549AbR.TTF_SA_PRODUCT_DETAIL;
        C69850RbC c69850RbC3 = new C69850RbC(new C69852RbE(enumC26549AbR3.getTemplate()), C47261Igj.LJJIJIIJI(new ModuleId("header"), new ModuleId("product_info"), new ModuleId("sku"), new ModuleId("promotion"), new ModuleId("service"), new ModuleId("product_prop"), new ModuleId("size_guide"), new ModuleId("review"), new ModuleId("buy_together"), new ModuleId("shop_profile"), new ModuleId("brick_list")));
        EnumC26549AbR enumC26549AbR4 = EnumC26549AbR.TTS_US_PRODUCT_DETAIL;
        LIZ = C113554cx.LJJL(new OSZ(Integer.valueOf(enumC26549AbR.getTemplate()), c69850RbC), new OSZ(Integer.valueOf(enumC26549AbR2.getTemplate()), c69850RbC2), new OSZ(Integer.valueOf(enumC26549AbR3.getTemplate()), c69850RbC3), new OSZ(Integer.valueOf(enumC26549AbR4.getTemplate()), new C69850RbC(new C69852RbE(enumC26549AbR4.getTemplate()), C47261Igj.LJJIJIIJI(new ModuleId("header"), new ModuleId("product_info"), new ModuleId("sku"), new ModuleId("promotion"), new ModuleId("service"), new ModuleId("product_prop"), new ModuleId("size_guide"), new ModuleId("review"), new ModuleId("buy_together"), new ModuleId("shop_profile"), new ModuleId("brick_list")))));
    }
}
