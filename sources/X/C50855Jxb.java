package X;

import Y.AfS47S0300000_8;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jxb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50855Jxb extends SearchBaseSparkView {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJIIJ;

    @Override // X.KFY
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJIIJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        }
        o.LJIJI("sparkView");
        throw null;
    }

    public C50855Jxb(Context context, LifecycleOwner lifecycleOwner) {
        super(context, lifecycleOwner);
    }

    @Override // X.KFY
    public final void LJ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        if (!list.isEmpty()) {
            LJIIL(((DynamicData) ListProtector.get(list, 0)).dynamicPatch, interfaceC88472Yns, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView, X.KFY
    public final void LJFF(DynamicPatch dynamicData, java.util.Map<String, ? extends Object> map, boolean z) {
        o.LJIIIZ(dynamicData, "dynamicData");
        LJIIL(dynamicData, null, map);
    }

    public final void LJIIL(DynamicPatch dynamicData, InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> interfaceC88472Yns, java.util.Map<String, ? extends Object> map) {
        VNS vns;
        o.LJIIIZ(dynamicData, "dynamicData");
        if (o.LJ(dynamicData, this.LJIIIZ)) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJIIJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
                if ((kitView instanceof VNS) && (vns = (VNS) kitView) != null) {
                    vns.onEnterForeground();
                    return;
                }
                return;
            }
            o.LJIJI("sparkView");
            throw null;
        }
        LJIIJ();
        C1HQ c1hq = new C1HQ();
        if (map != null) {
            c1hq.putAll(map);
        }
        LJI(c1hq);
        this.LJIIIIZZ.add(AbstractC73745Swv.LJFF(c1hq).LJI(C50860Jxg.LJLIL).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS47S0300000_8(this, dynamicData, interfaceC88472Yns, 0)));
    }
}
