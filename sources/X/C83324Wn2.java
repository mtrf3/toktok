package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wn2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83324Wn2 extends AbstractC029409q<AbstractC83322Wn0> {
    public final Context LJLIL;
    public final InterfaceC83334WnC LJLILLLLZI;
    public final List<AbstractC83320Wmy> LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public C83351WnT LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (((ArrayList) this.LJLJI).size() >= i && (ListProtector.get(this.LJLJI, i) instanceof C83319Wmx)) {
            return EnumC83323Wn1.COVER.getType();
        }
        return EnumC83323Wn1.TEXT.getType();
    }

    public C83324Wn2(Context context, InterfaceC83334WnC onItemClickListener) {
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = context;
        this.LJLILLLLZI = onItemClickListener;
        this.LJLJI = new ArrayList();
        this.LJLJJI = -1;
        this.LJLJJL = -1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC83322Wn0 abstractC83322Wn0, int i) {
        boolean z;
        boolean z2;
        int i2;
        AbstractC83322Wn0 holder = abstractC83322Wn0;
        o.LJIIIZ(holder, "holder");
        boolean z3 = true;
        if (holder instanceof C83325Wn3) {
            C83325Wn3 c83325Wn3 = (C83325Wn3) holder;
            AbstractC83320Wmy option = (AbstractC83320Wmy) ListProtector.get(this.LJLJI, i);
            if (i == this.LJLJJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!this.LJLJJLL || this.LJLJJL != i) {
                z3 = false;
            }
            C83351WnT c83351WnT = this.LJLJL;
            if (c83351WnT != null) {
                i2 = c83351WnT.LJIIIZ;
            } else {
                i2 = -1;
            }
            o.LJIIIZ(option, "option");
            if (i2 > 0) {
                c83325Wn3.LJLJI.setMinHeight(i2);
            }
            c83325Wn3.L(option, z2, z3, i);
            return;
        }
        AbstractC83320Wmy abstractC83320Wmy = (AbstractC83320Wmy) ListProtector.get(this.LJLJI, i);
        if (i == this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LJLJJLL || this.LJLJJL != i) {
            z3 = false;
        }
        holder.L(abstractC83320Wmy, z, z3, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC83322Wn0 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC83322Wn0 c83325Wn3;
        o.LJIIIZ(parent, "parent");
        if (i == EnumC83323Wn1.COVER.getType()) {
            View itemView = C28289B8j.LIZ(parent, R.layout.cb7, parent, false);
            o.LJIIIIZZ(itemView, "itemView");
            c83325Wn3 = new C83318Wmw(itemView, this.LJLILLLLZI);
        } else if (i == EnumC83323Wn1.TEXT.getType()) {
            View itemView2 = C28289B8j.LIZ(parent, R.layout.cbd, parent, false);
            o.LJIIIIZZ(itemView2, "itemView");
            c83325Wn3 = new C83325Wn3(itemView2, this.LJLILLLLZI);
        } else {
            throw new RuntimeException("Unknown options type");
        }
        C0AX.LIZ(parent, c83325Wn3.itemView, R.id.lj7);
        View view = c83325Wn3.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c83325Wn3.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c83325Wn3.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c83325Wn3.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c83325Wn3.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c83325Wn3.getClass().getName();
        return c83325Wn3;
    }
}
