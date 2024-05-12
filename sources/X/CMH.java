package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMH extends AbstractC31219CNb implements InterfaceC40159FpT {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJI;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.NV7
    public final void refresh() {
    }

    @Override // X.AbstractC31219CNb
    public final void LIZ() {
        SparkContext sparkContext = this.LJLJJI.getSparkContext();
        if (sparkContext != null) {
            sparkContext.LJIJJ(this);
        }
        this.LJLJJI.LIZIZ();
        ViewParent parent = this.LJLJJI.getParent();
        if (parent != null) {
            try {
                if (parent instanceof ViewGroup) {
                    C16880lQ.LJLLL(this.LJLJJI, (ViewGroup) parent);
                }
            } catch (Exception e) {
                C0NB.LJI("com.bytedance.android.livesdk.container.ui.SparkCardView", e);
            }
        }
        addView(this.LJLJJI);
    }

    @Override // X.AbstractC31219CNb
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(this.LJLJJI);
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.ID, getCardContainerId());
    }

    @Override // X.AbstractC31219CNb
    public String getCardContainerId() {
        SparkContext sparkContext = this.LJLJJI.getSparkContext();
        o.LJI(sparkContext);
        return sparkContext.containerId;
    }

    @Override // X.AbstractC31219CNb
    public final void LIZJ(java.util.Map<String, ? extends Object> map) {
        InterfaceC60761Nsz kitView = this.LJLJJI.getKitView();
        if (kitView != null) {
            kitView.updateData(map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CMH(Context context, String schema, String str) {
        super(context);
        o.LJIIIZ(schema, "schema");
        new LinkedHashMap();
        this.LJLJJI = ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).cZ(context, schema, false, new AqS171S0100000_5(this, 892));
        setName(str == null ? "" : str);
    }
}
