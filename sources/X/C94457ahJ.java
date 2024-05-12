package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS5S0201000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ahJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94457ahJ extends AbstractC94204adE<AssetsLibData.AssetsItemData, C94456ahI> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public int LJLJI;
    public final InterfaceC94013aa9<C93671aUd> LJLJJI;
    public final StickerViewModel LJLJJL;

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C94456ahI holder = (C94456ahI) viewHolder;
        o.LJIIIZ(holder, "holder");
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        String str = ((AssetsLibData.AssetsItemData) ListProtector.get(this.LJLIL, i)).iconUrl;
        ImageView imageView = holder.LJLJJL;
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
        c94019aaF.LJI = true;
        c94019aaF.LIZ(R.drawable.dfx);
        imageLoaderService.compatLoadBitmap(context, str, imageView, new C94020aaG(c94019aaF), null);
        View view2 = holder.itemView;
        o.LJIIIIZZ(view2, "holder.itemView");
        C93750aVu.LIZ(view2, 800L, new IDqS5S0201000_42(this, i, holder, 1));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.duq, parent, false);
        if (LLLLIILL != null) {
            FrameLayout frameLayout = (FrameLayout) LLLLIILL;
            C94456ahI c94456ahI = new C94456ahI(frameLayout, frameLayout);
            c94456ahI.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
            View view = c94456ahI.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (c94456ahI.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C94456ahI.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) c94456ahI.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(c94456ahI.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C94456ahI.class.getName();
            return c94456ahI;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public C94457ahJ(InterfaceC94013aa9 operator, StickerViewModel model, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(operator, "operator");
        o.LJIIIZ(model, "model");
        this.LJLJJI = operator;
        this.LJLJJL = model;
        this.LJLJI = -1;
    }

    public static void LJLZ(boolean z, Long l, String str) {
        String str2;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("asset_id", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        oszArr[1] = new OSZ("deliver_result", str2);
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (l != null) {
            LJJLIIIIJ.put("time_cost", String.valueOf(l.longValue()));
        }
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("server_deliver_library_asset", LJJLIIIIJ);
        }
    }
}
