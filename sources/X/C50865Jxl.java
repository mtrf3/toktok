package X;

import Y.AfS57S0200000_8;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jxl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50865Jxl extends SearchBaseSparkView {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJIIJ;
    public AbstractC65781Prl LJIIJJI;

    @Override // X.KFY
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ() {
        return this.LJIIJ;
    }

    public C50865Jxl(Context context, LifecycleOwner lifecycleOwner) {
        super(context, lifecycleOwner);
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        c40342FsQ.getClass();
        this.LJIIJ = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
    }

    @Override // X.KFY
    public final void LJ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        if (!list.isEmpty()) {
            C51396KFc.LIZIZ(this, ((DynamicData) ListProtector.get(list, 0)).dynamicPatch, null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView, X.KFY
    public final void LJFF(DynamicPatch dynamicData, java.util.Map<String, ? extends Object> map, boolean z) {
        VNS vns;
        o.LJIIIZ(dynamicData, "dynamicData");
        if (o.LJ(dynamicData, this.LJIIIZ)) {
            Object kitView = this.LJIIJ.getKitView();
            if ((kitView instanceof VNS) && (vns = (VNS) kitView) != null) {
                vns.onEnterForeground();
                return;
            }
            return;
        }
        LJIIJ();
        C1HQ c1hq = new C1HQ();
        if (map != null) {
            c1hq.putAll(map);
        }
        LJI(c1hq);
        this.LJIIIIZZ.add(AbstractC73745Swv.LJFF(c1hq).LJI(C50867Jxn.LJLIL).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS57S0200000_8(this, dynamicData, 4)));
    }
}
