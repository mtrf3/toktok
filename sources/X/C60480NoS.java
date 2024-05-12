package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHybridBottomSheetDialogFragment;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NoS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60480NoS implements InterfaceC60061Nhh {
    public final /* synthetic */ CommerceHybridBottomSheetDialogFragment LJLIL;

    public C60480NoS(CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment) {
        this.LJLIL = commerceHybridBottomSheetDialogFragment;
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String str2;
        o.LJIIIZ(eventName, "eventName");
        CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment = this.LJLIL;
        if (commerceHybridBottomSheetDialogFragment.LJLJI) {
            try {
                String it = new JSONObject(str).optString("react_id");
                CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment2 = this.LJLIL;
                C40127Fox.LIZ.getClass();
                if (C40127Fox.LIZ().enableSparkContainer) {
                    C60484NoW c60484NoW = commerceHybridBottomSheetDialogFragment2.LJLIL;
                    if (c60484NoW != null) {
                        o.LJIIIIZZ(it, "it");
                        SparkContext sparkContext = c60484NoW.getSparkView().getSparkContext();
                        if (sparkContext != null) {
                            str2 = sparkContext.containerId;
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(it, str2)) {
                            commerceHybridBottomSheetDialogFragment2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C60466NoE c60466NoE = commerceHybridBottomSheetDialogFragment2.LJLILLLLZI;
                if (c60466NoE != null) {
                    o.LJIIIIZZ(it, "it");
                    if (o.LJ(it, c60466NoE.getBulletContainerView().getReactId())) {
                        commerceHybridBottomSheetDialogFragment2.dismiss();
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                return;
            }
        }
        commerceHybridBottomSheetDialogFragment.dismiss();
    }
}
