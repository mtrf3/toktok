package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.VvA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81280VvA extends AbstractC45801HyH<C81286VvG> {
    public ContextWrapper LJLILLLLZI;
    public final /* synthetic */ C81283VvD LJLJI;

    public C81280VvA(C81283VvD c81283VvD) {
        this.LJLJI = c81283VvD;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        if (!(viewHolder instanceof C81282VvC)) {
            viewHolder = null;
        }
        C81282VvC c81282VvC = (C81282VvC) viewHolder;
        if (c81282VvC != null) {
            c81282VvC.L((C81286VvG) ListProtector.get(this.LJLIL, i));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (this.LJLILLLLZI == null) {
            InterfaceC88472Yns<? super Context, ? extends ContextWrapper> interfaceC88472Yns = this.LJLJI.getFilterBoxViewConfigure().LIZ.LJ;
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            this.LJLILLLLZI = interfaceC88472Yns.invoke(context);
        }
        ContextWrapper contextWrapper = this.LJLILLLLZI;
        o.LJI(contextWrapper);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(contextWrapper), R.layout.iz, parent, false);
        if (LLLLIILL != null) {
            C81282VvC c81282VvC = new C81282VvC(this, (LinearLayout) LLLLIILL);
            C0AX.LIZ(parent, c81282VvC.itemView, R.id.lj7);
            View view = c81282VvC.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (c81282VvC.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C81282VvC.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) c81282VvC.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(c81282VvC.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C81282VvC.class.getName();
            return c81282VvC;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
