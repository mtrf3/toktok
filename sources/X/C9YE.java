package X;

import Y.ACListenerS23S0101000_4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.9YE, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YE extends AbstractC029409q<C9YG> {
    public final ArrayList<C9YH> LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public final void LJLLLLLL(C9YG c9yg) {
        int bottom = ((c9yg.LJLJJL.getBottom() - c9yg.LJLJJI.getBottom()) - (c9yg.LJLJJL.getBottom() - c9yg.LJLJJL.getTop())) + ((this.LJLJI - c9yg.LJLJJL.getBottom()) - C17N.LJIILL(16.0d));
        ViewGroup.LayoutParams layoutParams = c9yg.LJLJJL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, bottom, 0, C17N.LJIILL(16.0d));
        c9yg.LJLJJL.setLayoutParams(marginLayoutParams);
    }

    public C9YE(ArrayList<C9YH> mDataList, ActivityC45651qj mActivity) {
        o.LJIIIZ(mDataList, "mDataList");
        o.LJIIIZ(mActivity, "mActivity");
        this.LJLIL = mDataList;
        this.LJLILLLLZI = mActivity;
        this.LJLJI = C17N.LJIILL(150.0d);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C9YG c9yg, int i) {
        final C9YG holder = c9yg;
        o.LJIIIZ(holder, "holder");
        holder.LJLJJLL.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.9YF
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C9YG.this.LJLJJLL.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = C9YG.this.LJLJJLL.getHeight();
                C9YE c9ye = this;
                int i2 = c9ye.LJLJI;
                if (height < i2) {
                    ViewGroup.LayoutParams layoutParams = C9YG.this.LJLJJLL.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = this.LJLJI;
                    C9YG.this.LJLJJLL.setLayoutParams(marginLayoutParams);
                    this.LJLLLLLL(C9YG.this);
                    return false;
                }
                if (height > i2) {
                    c9ye.LJLJI = height;
                    c9ye.notifyDataSetChanged();
                    return false;
                }
                if (height == i2) {
                    c9ye.LJLLLLLL(C9YG.this);
                    C9YG.this.LJLJJLL.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        });
        holder.LJLIL.setIconRes(((C9YH) ListProtector.get(this.LJLIL, i)).LJLIL);
        holder.LJLJI.setText(((C9YH) ListProtector.get(this.LJLIL, i)).LJLILLLLZI);
        holder.LJLJJI.setText(((C9YH) ListProtector.get(this.LJLIL, i)).LJLJI);
        holder.LJLJJL.setText(((C9YH) ListProtector.get(this.LJLIL, i)).LJLJJI);
        if (((C9YH) ListProtector.get(this.LJLIL, i)).LJLJJL) {
            holder.LJLJJL.setButtonVariant(0);
            holder.LJLILLLLZI.setVisibility(8);
        } else {
            holder.LJLJJL.setButtonVariant(1);
            holder.LJLILLLLZI.setVisibility(0);
        }
        int i2 = ((C9YH) ListProtector.get(this.LJLIL, i)).LJLILLLLZI;
        if (i2 == R.string.hgh) {
            C16880lQ.LJJIZ(holder.LJLJJL, new ACListenerS23S0101000_4(i, this, 9));
            return;
        }
        if (i2 == R.string.hgd) {
            C16880lQ.LJJIZ(holder.LJLJJL, new ACListenerS23S0101000_4(i, this, 10));
            return;
        }
        if (i2 == R.string.c9t) {
            if (!((C9YH) ListProtector.get(this.LJLIL, i)).LJLJJL) {
                holder.LJLJJL.setEnabled(false);
                holder.LJLJJL.setButtonVariant(0);
                return;
            } else {
                C16880lQ.LJJIZ(holder.LJLJJL, new ACListenerS23S0101000_4(i, this, 11));
                return;
            }
        }
        if (i2 != R.string.hg_) {
            return;
        }
        C16880lQ.LJJIZ(holder.LJLJJL, new ACListenerS23S0101000_4(i, this, 12));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C9YG com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c5f, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C9YG c9yg = new C9YG(view);
        C0AX.LIZ(viewGroup, c9yg.itemView, R.id.lj7);
        View view2 = c9yg.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c9yg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C9YG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c9yg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c9yg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C9YG.class.getName();
        return c9yg;
    }
}
