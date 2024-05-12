package X;

import Y.ACListenerS25S0201000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.JtR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50597JtR extends C61799ONf<FeelgoodOptionData> {
    public final Context LJLJJL;
    public final ArrayList<FeelgoodOptionData> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    public C50597JtR(Context context, ArrayList<FeelgoodOptionData> arrayList) {
        super(context, arrayList);
        this.LJLJJL = context;
        this.LJLJJLL = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C50598JtS)) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS25S0201000_8(i, this, holder, 6), holder.itemView);
        C50598JtS c50598JtS = (C50598JtS) holder;
        TuxTextView tuxTextView = c50598JtS.LJLIL;
        String text = ((FeelgoodOptionData) ListProtector.get(this.LJLJJLL, i)).getText();
        if (text == null) {
            text = "";
        }
        tuxTextView.setText(text);
        TuxTextView tuxTextView2 = c50598JtS.LJLIL;
        if (this.LJLIL == i) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView2.setSelected(z);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C50598JtS c50598JtS = new C50598JtS(AnonymousClass030.LIZLLL(this.LJLJJL, R.layout.cgf, parent, false, "from(context).inflate(resource, parent, false)"));
        C0AX.LIZ(parent, c50598JtS.itemView, R.id.lj7);
        View view = c50598JtS.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c50598JtS.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C50598JtS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c50598JtS.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c50598JtS.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C50598JtS.class.getName();
        return c50598JtS;
    }
}
