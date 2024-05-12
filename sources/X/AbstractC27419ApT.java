package X;

import Y.ARunnableS8S0101000_4;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ApT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27419ApT<T> extends AbstractC28801Bc<T, C27422ApW> {
    public final InterfaceC88471Ynr<? super Integer, ? super T, C76800UCe> LJLIL;
    public final boolean LJLILLLLZI;
    public final Handler LJLJI;
    public int LJLJJI;
    public RecyclerView LJLJJL;

    public AbstractC27419ApT() {
        this((InterfaceC88471Ynr) null, 3);
    }

    public View LJLLLLLL(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return null;
    }

    @Override // X.AbstractC029409q
    public long getItemId(int i) {
        return i;
    }

    public final void LJZ(int i) {
        int i2 = this.LJLJJI;
        if (i2 != i) {
            if (i2 >= 0) {
                notifyItemChanged(i2);
            }
            this.LJLJJI = i;
            notifyItemChanged(i);
        }
        if (i >= 0) {
            this.LJLJI.post(new ARunnableS8S0101000_4(i, this, 7));
        }
    }

    @Override // X.AbstractC029409q
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (o.LJ(this.LJLJJL, recyclerView)) {
            this.LJLJJL = null;
        }
    }

    public AbstractC27419ApT(boolean z, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(new C27421ApV());
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = z;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
        this.LJLJJI = -1;
    }

    @Override // X.AbstractC029409q
    /* renamed from: LJLZ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C27422ApW holder, int i) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        if (i == this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        view.setSelected(z);
        C16880lQ.LJIIJ(new Au2S14S0200000_4(holder, this, 22), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LJLLLLLL = LJLLLLLL(parent);
        if (LJLLLLLL == null) {
            LJLLLLLL = OUP.LJIL(i, parent, false);
        }
        C27422ApW c27422ApW = new C27422ApW(LJLLLLLL);
        C0AX.LIZ(parent, c27422ApW.itemView, R.id.lj7);
        View view = c27422ApW.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c27422ApW.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C27422ApW.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c27422ApW.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c27422ApW.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C27422ApW.class.getName();
        return c27422ApW;
    }

    public /* synthetic */ AbstractC27419ApT(InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        this(false, (i & 1) != 0 ? null : interfaceC88471Ynr);
    }
}
