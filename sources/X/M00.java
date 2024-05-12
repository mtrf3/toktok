package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetResCfg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment$updateBackButton$6", f = "ShopMainFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M00 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ShopMainFragment LJLILLLLZI;
    public final /* synthetic */ DiversionTargetResCfg LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M00(ShopMainFragment shopMainFragment, DiversionTargetResCfg diversionTargetResCfg, String str, InterfaceC67352kd<? super M00> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = shopMainFragment;
        this.LJLJI = diversionTargetResCfg;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        View back_btn = this.LJLILLLLZI._$_findCachedViewById(R.id.aej);
        o.LJIIIIZZ(back_btn, "back_btn");
        back_btn.setVisibility(8);
        b.LJJIJIIJI("tiktokec_button_click", this.LJLILLLLZI.LJLLLLLL);
        Context context = view.getContext();
        String str2 = this.LJLJI.schema;
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            String str3 = this.LJLJJI;
            if (str3 != null && !ujb.o.LJJJJJL(str3)) {
                android.net.Uri replacePresent = UriProtector.parse(str3);
                o.LJIIIIZZ(replacePresent, "Uri.parse(this)");
                OSZ[] oszArr = {new OSZ("init_time", new Long(System.currentTimeMillis()))};
                if (replacePresent.isHierarchical()) {
                    java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(replacePresent);
                    o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
                    java.util.Set<String> LLJILLL = ORZ.LLJILLL(queryParameterNames);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    OSZ osz = oszArr[0];
                    Object first = osz.getFirst();
                    Object second = osz.getSecond();
                    if (second != null) {
                        str = second.toString();
                    } else {
                        str = null;
                    }
                    String LJJIFFI = C17N.LJJIFFI(str);
                    if (LJJIFFI != null && LLJILLL.remove(first)) {
                        linkedHashMap.put(first, LJJIFFI);
                    }
                    if (!linkedHashMap.isEmpty()) {
                        Uri.Builder builder = replacePresent.buildUpon().clearQuery();
                        for (String it : LLJILLL) {
                            o.LJIIIIZZ(builder, "builder");
                            o.LJIIIIZZ(it, "it");
                            o.LJIIIIZZ(builder.appendQueryParameter(it, String.valueOf(UriProtector.getQueryParameter(replacePresent, it))), "appendQueryParameter(key, \"$value\")");
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            o.LJIIIIZZ(builder, "builder");
                            String key = (String) entry.getKey();
                            Object value = entry.getValue();
                            o.LJIIIZ(key, "key");
                            o.LJIIIIZZ(builder.appendQueryParameter(key, String.valueOf(value)), "appendQueryParameter(key, \"$value\")");
                        }
                        replacePresent = builder.build();
                        o.LJIIIIZZ(replacePresent, "replacePresent");
                    }
                }
                SmartRouter.buildRoute(context, String.valueOf(replacePresent)).open();
            }
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context);
            if (LJJIFFI2 == null) {
                return C76800UCe.LIZ;
            }
            ShopMainFragment.LJZ.getClass();
            String str4 = ShopMainFragment.LLII;
            if (str4 != null) {
                com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI2).Cv0(new Bundle(), str4);
            }
            return C76800UCe.LIZ;
        }
        SmartRouter.buildRoute(context, this.LJLJI.schema).open();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        M00 m00 = new M00(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        m00.LJLIL = view;
        return m00.invokeSuspend(C76800UCe.LIZ);
    }
}
