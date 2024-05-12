package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.model.recharge.ExtraActivityDetail;
import com.bytedance.android.livesdk.wallet.model.recharge.ExtraActivityInfo;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77597Ucr extends AbstractC77652Udk {
    public final ViewGroup LJLIL;
    public final java.util.Map<String, AbstractC77653Udl> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77597Ucr(ViewGroup parent) {
        super(R.layout.d6k, parent);
        o.LJIIIZ(parent, "parent");
        this.LJLIL = parent;
        this.LJLILLLLZI = new LinkedHashMap();
    }

    @Override // X.AbstractC77652Udk
    public final void L(C77596Ucq adapter, Diamond itemData) {
        ExtraActivityInfo extraActivityInfo;
        ExtraActivityDetail extraActivityDetail;
        List<ExtraActivityDetail> list;
        ExtraActivityDetail extraActivityDetail2;
        o.LJIIIZ(itemData, "itemData");
        o.LJIIIZ(adapter, "adapter");
        DiamondPackageExtra diamondPackageExtra = adapter.LJLJI.LJLJL;
        if (diamondPackageExtra != null) {
            extraActivityInfo = diamondPackageExtra.activityInfo;
        } else {
            extraActivityInfo = null;
        }
        if (extraActivityInfo != null && (list = extraActivityInfo.activityDetail) != null) {
            Iterator<ExtraActivityDetail> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    extraActivityDetail2 = it.next();
                    if (o.LJ(extraActivityDetail2.activityId, "kyc_incentive_001")) {
                        break;
                    }
                } else {
                    extraActivityDetail2 = null;
                    break;
                }
            }
            extraActivityDetail = extraActivityDetail2;
        } else {
            extraActivityDetail = null;
        }
        if (extraActivityDetail == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C87277YNd.LJJIIZ(itemView);
            return;
        }
        AbstractC77653Udl abstractC77653Udl = (AbstractC77653Udl) ((LinkedHashMap) this.LJLILLLLZI).get(extraActivityDetail.activityId);
        if (abstractC77653Udl == null) {
            String str = extraActivityDetail.activityId;
            ViewGroup viewGroup = this.LJLIL;
            if (!o.LJ(str, "kyc_incentive_001") || (abstractC77653Udl = new C77615Ud9(viewGroup)) == null) {
                View itemView2 = this.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                C87277YNd.LJJIIZ(itemView2);
                return;
            }
        }
        this.LJLILLLLZI.put(extraActivityDetail.activityId, abstractC77653Udl);
        View itemView3 = this.itemView;
        o.LJIIIIZZ(itemView3, "itemView");
        C87277YNd.LJJIJ(itemView3);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).removeAllViews();
        View view2 = this.itemView;
        o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(abstractC77653Udl.itemView);
        abstractC77653Udl.L(extraActivityDetail);
    }
}
