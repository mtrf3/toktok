package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B9g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28312B9g extends AbstractC029409q<AbstractC28313B9h> {
    public final Context LJLIL;
    public final LayoutInflater LJLILLLLZI;
    public final List<C31061Ju> LJLJI = new ArrayList();
    public C28317B9l LJLJJI;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public C28312B9g(Context context) {
        this.LJLIL = context;
        this.LJLILLLLZI = C16880lQ.LLZIL(context);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        C0RH c0rh = (C0RH) ListProtector.get(this.LJLJI, i);
        if (c0rh == null) {
            return 2;
        }
        return c0rh.type;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC28313B9h abstractC28313B9h, int i) {
        AbstractC28313B9h abstractC28313B9h2 = abstractC28313B9h;
        C31061Ju c31061Ju = (C31061Ju) ListProtector.get(this.LJLJI, i);
        if (c31061Ju == null) {
            return;
        }
        if (c31061Ju.type == 2) {
            abstractC28313B9h2.itemView.setVisibility(4);
            return;
        }
        abstractC28313B9h2.L(c31061Ju);
        C28317B9l c28317B9l = this.LJLJJI;
        if (c28317B9l == null) {
            return;
        }
        abstractC28313B9h2.M(c28317B9l);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC28313B9h com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        AbstractC28313B9h c28315B9j;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) B9K.LIZ(this.LJLIL, 52.0f));
        if (i != 0) {
            c28315B9j = new C28314B9i(C16880lQ.LLLZIIL(R.layout.d8l, this.LJLILLLLZI, null));
            c28315B9j.itemView.setLayoutParams(layoutParams);
        } else {
            c28315B9j = new C28315B9j(C16880lQ.LLLZIIL(R.layout.d8y, this.LJLILLLLZI, null));
            c28315B9j.itemView.setLayoutParams(layoutParams);
        }
        C0AX.LIZ(viewGroup, c28315B9j.itemView, R.id.lj7);
        View view = c28315B9j.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c28315B9j.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c28315B9j.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c28315B9j.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c28315B9j.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c28315B9j.getClass().getName();
        return c28315B9j;
    }
}
