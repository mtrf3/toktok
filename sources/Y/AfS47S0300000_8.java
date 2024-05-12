package Y;

import X.C113554cx;
import X.C40342FsQ;
import X.C40343FsR;
import X.C47699Inn;
import X.C50850JxW;
import X.C50855Jxb;
import X.C50856Jxc;
import X.C59958Ng2;
import X.InterfaceC60819Ntv;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.LiveTaskBarBottomBarAssem;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AfS47S0300000_8 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS47S0300000_8 afS47S0300000_8, Object obj) {
        TemplateData templateData = (TemplateData) obj;
        C50855Jxb c50855Jxb = (C50855Jxb) afS47S0300000_8.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS47S0300000_8.l1;
        c50855Jxb.LJIIIZ = dynamicPatch;
        Context context = c50855Jxb.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50855Jxb.LJIIJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        }
        String str = dynamicPatch.schema;
        o.LJIIIIZZ(str, "dynamicData.schema");
        C50850JxW c50850JxW = new C50850JxW(c50855Jxb);
        o.LJIIIZ(context, "context");
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            C50856Jxc c50856Jxc = new C50856Jxc();
            c50856Jxc.LJIILL("type", "normal_load_spark");
            c50856Jxc.LJIIZILJ(1);
            c50856Jxc.LJIILL("error", "load");
            c50856Jxc.LJIILL("schema", str);
            c50856Jxc.LJIILIIL();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(str);
            sparkContext.LJJIJ(C113554cx.LJJJLIIL());
            sparkContext.LJII(InterfaceC60819Ntv.class, new C59958Ng2(context, templateData));
            sparkContext.LJIL(c50850JxW);
            C40343FsR.LJIILJJIL.getClass();
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        } else {
            C50856Jxc c50856Jxc2 = new C50856Jxc();
            c50856Jxc2.LJIILL("type", "normal_load_spark");
            c50856Jxc2.LJIIZILJ(1);
            c50856Jxc2.LJIILL("error", "reload");
            c50856Jxc2.LJIILL("schema", str);
            c50856Jxc2.LJIILIIL();
            SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
            if (sparkContext2 != null) {
                sparkContext2.LJIL(c50850JxW);
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILL(str, templateData);
        }
        c50855Jxb.LJIIJ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS47S0300000_8.l2;
        if (interfaceC88472Yns != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = ((C50855Jxb) afS47S0300000_8.l0).LJIIJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                interfaceC88472Yns.invoke(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            } else {
                o.LJIJI("sparkView");
                throw null;
            }
        }
    }

    public static final void accept$1(AfS47S0300000_8 afS47S0300000_8, Object obj) {
        LiveTaskBarBottomBarAssem liveTaskBarBottomBarAssem = (LiveTaskBarBottomBarAssem) afS47S0300000_8.l0;
        liveTaskBarBottomBarAssem.LLIIII++;
        liveTaskBarBottomBarAssem.q4((Aweme) afS47S0300000_8.l1);
        if (((Aweme) afS47S0300000_8.l1) != null) {
            String aid = ((Aweme) afS47S0300000_8.l2).getAid();
            o.LJIIIIZZ(aid, "awemeTmp.aid");
            ((HashSet) C47699Inn.LJIIJJI).add(aid);
        }
        if (((Aweme) afS47S0300000_8.l1) != null) {
            String aid2 = ((Aweme) afS47S0300000_8.l2).getAid();
            o.LJIIIIZZ(aid2, "awemeTmp.aid");
            ((HashMap) C47699Inn.LJIIIZ).put(aid2, 1);
        }
        C47699Inn.LIZJ((Aweme) afS47S0300000_8.l2);
        C47699Inn.LJIIIIZZ = true;
    }

    public AfS47S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
