package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.gift.GiftRenderSparkOptimizeSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.IDqS435S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O95 implements O98 {
    public static final String LIZLLL;
    public final O99 LIZ;
    public ALE LIZIZ;
    public boolean LIZJ;

    static {
        String builder = UriProtector.parse("sslocal://webcast_lynxview_card").buildUpon().appendQueryParameter("url", "").appendQueryParameter("enable_canvas", "1").appendQueryParameter("key_biz", "biz_glb_live_gift_render_lynx").toString();
        o.LJIIIIZZ(builder, "parse(\"sslocal://webcast…)\n            .toString()");
        LIZLLL = builder;
    }

    public O95(O99 sparkCreator) {
        o.LJIIIZ(sparkCreator, "sparkCreator");
        this.LIZ = sparkCreator;
    }

    @Override // X.O98
    public final void LIZ(Integer num, String str) {
        synchronized (this) {
            if (!this.LIZJ) {
                ALE ale = new ALE();
                ale.LJIIIZ = true;
                ale.LIZ = "biz_glb_live_gift_render_lynx";
                ale.LJ = true;
                ale.LIZIZ(C67042k8.LJLIL);
                ale.LJIIL = new IDqS435S0100000_10(this, 7);
                C58310MuY.LIZIZ.getClass();
                C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
                this.LIZIZ = ale;
                this.LIZJ = true;
            }
        }
        ALE ale2 = this.LIZIZ;
        if (ale2 != null) {
            if (num != null && num.intValue() > 0 && ale2.LJI.size() >= num.intValue()) {
                return;
            }
            C32444CoK.LIZ(null, "preCreateSparkView");
            C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
            if (str == null || str.length() == 0) {
                str = LIZLLL;
            }
            c60827Nu3.LJII(str, "biz_glb_live_gift_render_lynx", null, null);
        }
    }

    @Override // X.O98
    public final O97 LIZIZ(Context context, String str, C60825Nu1 c60825Nu1, O93 o93) {
        SparkContext sparkContext;
        C60825Nu1 c60825Nu12;
        SparkContext sparkContext2;
        O93 o932;
        if (GiftRenderSparkOptimizeSetting.INSTANCE.isPreCreateStrategyEnable()) {
            InterfaceC60833Nu9 LIZIZ = C60827Nu3.LIZIZ(C58310MuY.LIZIZ, context, str, "biz_glb_live_gift_render_lynx");
            if (LIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZIZ;
                SparkContext originalSparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getOriginalSparkContext();
                if ((originalSparkContext != null && (c60825Nu12 = (C60825Nu1) originalSparkContext.LIZIZ(C60825Nu1.class)) != null) || ((sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null && (c60825Nu12 = (C60825Nu1) sparkContext.LIZIZ(C60825Nu1.class)) != null)) {
                    c60825Nu12.LJLILLLLZI = c60825Nu1;
                } else {
                    C32444CoK.LIZIZ(null, "callback isn't LoadCallback");
                }
                SparkContext originalSparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getOriginalSparkContext();
                if ((originalSparkContext2 != null && (o932 = (O93) originalSparkContext2.LIZIZ(O93.class)) != null) || ((sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null && (o932 = (O93) sparkContext2.LIZIZ(O93.class)) != null)) {
                    o932.LIZ = o93;
                } else {
                    C32444CoK.LIZIZ(null, "callback isn't LynxViewClientProxy");
                }
                C32444CoK.LIZ(null, "use preCreated view");
                return new O97(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, true);
            }
        }
        return new O97(this.LIZ.LIZ(context, str, new AqS141S0200000_10(c60825Nu1, o93, 81)), false);
    }
}
