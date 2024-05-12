package X;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LzI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56056LzI extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C56056LzI LJLIL = new C56056LzI();

    public C56056LzI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View view2 = null;
        if (containerView != null) {
            view = containerView.findViewById(R.id.itq);
        } else {
            view = null;
        }
        if (((SwipeRefreshLayout) view).LJLJI && !booleanValue) {
            View containerView2 = selectSubscribe.getContainerView();
            if (containerView2 != null) {
                view2 = containerView2.findViewById(R.id.itq);
            }
            ((SwipeRefreshLayout) view2).setRefreshing(false);
            FCG fcg = FCH.LIZIZ;
            EnumC56057LzJ refreshType = EnumC56057LzJ.COMPLETE;
            o.LJIIIZ(refreshType, "refreshType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventType", refreshType.getValue());
            fcg.getClass();
            FCG.LIZ("ec_mall_refresh", jSONObject);
        }
        return C76800UCe.LIZ;
    }
}
