package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxScrollView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JdZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49613JdZ extends AbstractC029409q<C49614Jda> {
    public final HashSet<Integer> LJLIL = new HashSet<>();
    public final /* synthetic */ LynxScrollView LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.mChildren.size();
    }

    public C49613JdZ(LynxScrollView lynxScrollView) {
        this.LJLILLLLZI = lynxScrollView;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ListProtector.get(this.LJLILLLLZI.mChildren, i).hashCode();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C49614Jda holder) {
        VNU vnu;
        VNL vnl;
        o.LJIIJ(holder, "holder");
        int adapterPosition = holder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < this.LJLILLLLZI.mChildren.size() && !this.LJLIL.contains(Integer.valueOf(adapterPosition))) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.LJLILLLLZI.mChildren, adapterPosition);
            if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                if (lynxImpressionView.LJLIL && (vnu = lynxImpressionView.mContext) != null && (vnl = vnu.LJLJJL) != null) {
                    vnl.LIZIZ(new VNN(lynxImpressionView.getSign(), "impression"));
                }
            }
            this.LJLIL.add(Integer.valueOf(adapterPosition));
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(C49614Jda holder) {
        VNU vnu;
        VNL vnl;
        o.LJIIJ(holder, "holder");
        int adapterPosition = holder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < this.LJLILLLLZI.mChildren.size() && this.LJLIL.contains(Integer.valueOf(adapterPosition))) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.LJLILLLLZI.mChildren, adapterPosition);
            if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                if (lynxImpressionView.LJLILLLLZI && (vnu = lynxImpressionView.mContext) != null && (vnl = vnu.LJLJJL) != null) {
                    vnl.LIZIZ(new VNN(lynxImpressionView.getSign(), "exit"));
                }
            }
            this.LJLIL.remove(Integer.valueOf(adapterPosition));
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C49614Jda viewHolder, int i) {
        o.LJIIJ(viewHolder, "viewHolder");
        LynxScrollView lynxScrollView = this.LJLILLLLZI;
        View view = viewHolder.itemView;
        o.LJFF(view, "viewHolder.itemView");
        lynxScrollView.getClass();
        Object obj = ListProtector.get(lynxScrollView.mChildren, i);
        o.LJFF(obj, "mChildren[i]");
        int width = ((LynxBaseUI) obj).getWidth();
        Object obj2 = ListProtector.get(lynxScrollView.mChildren, i);
        o.LJFF(obj2, "mChildren[i]");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(width, ((LynxBaseUI) obj2).getHeight());
        Object obj3 = ListProtector.get(lynxScrollView.mChildren, i);
        o.LJFF(obj3, "mChildren[i]");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((LynxBaseUI) obj3).mMarginLeft;
        Object obj4 = ListProtector.get(lynxScrollView.mChildren, i);
        o.LJFF(obj4, "mChildren[i]");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((LynxBaseUI) obj4).mMarginRight;
        Object obj5 = ListProtector.get(lynxScrollView.mChildren, i);
        o.LJFF(obj5, "mChildren[i]");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((LynxBaseUI) obj5).mMarginTop;
        Object obj6 = ListProtector.get(lynxScrollView.mChildren, i);
        o.LJFF(obj6, "mChildren[i]");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((LynxBaseUI) obj6).mMarginBottom;
        view.setLayoutParams(layoutParams);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C49614Jda com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C49614Jda c49614Jda;
        o.LJIIJ(viewGroup, "viewGroup");
        Iterator<LynxBaseUI> it = this.LJLILLLLZI.mChildren.iterator();
        while (true) {
            if (it.hasNext()) {
                LynxBaseUI next = it.next();
                if (next.hashCode() == i) {
                    T view = ((LynxUI) next).mView;
                    o.LJFF(view, "view");
                    c49614Jda = new C49614Jda(view);
                    break;
                }
            } else {
                VNU lynxContext = this.LJLILLLLZI.mContext;
                o.LJFF(lynxContext, "lynxContext");
                c49614Jda = new C49614Jda(new FrameLayout(lynxContext.LIZ()));
                break;
            }
        }
        C0AX.LIZ(viewGroup, c49614Jda.itemView, R.id.lj7);
        View view2 = c49614Jda.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c49614Jda.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                    stringBuffer.append(" holder ");
                    stringBuffer.append(C49614Jda.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c49614Jda.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c49614Jda.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C49614Jda.class.getName();
        return c49614Jda;
    }
}
