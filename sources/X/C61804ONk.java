package X;

import Y.ACListenerS27S0201000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ONk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61804ONk extends C61799ONf<Option> {
    public final Context LJLJJL;
    public final ArrayList<Option> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61804ONk(Context context, ArrayList<Option> arrayList) {
        super(context, arrayList);
        o.LJIIIZ(context, "context");
        this.LJLJJL = context;
        this.LJLJJLL = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C61814ONu)) {
            return;
        }
        if (this.LJLILLLLZI) {
            C16880lQ.LJIIJ(new ACListenerS27S0201000_10(this, i, holder, 5), holder.itemView);
        }
        C61814ONu c61814ONu = (C61814ONu) holder;
        c61814ONu.LJLIL.setText(((Option) ListProtector.get(this.LJLJJLL, i)).getName());
        c61814ONu.LJLIL.setSelected(((Option) ListProtector.get(this.LJLJJLL, i)).isSelected());
        if (C61779OMl.LJ(this.LJLJI)) {
            if (c61814ONu.LJLIL.isSelected()) {
                c61814ONu.LJLIL.setTextColorRes(R.attr.dj);
            } else {
                c61814ONu.LJLIL.setTextColorRes(R.attr.dl);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        int i3 = C61809ONp.LIZ[this.LJLJI.ordinal()];
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                i2 = R.layout.ac4;
            } else {
                i2 = R.layout.ac5;
            }
        } else {
            i2 = R.layout.ac3;
        }
        C61814ONu c61814ONu = new C61814ONu(AnonymousClass030.LIZLLL(this.LJLJJL, i2, parent, false, "from(context).inflate(resource, parent, false)"));
        C0AX.LIZ(parent, c61814ONu.itemView, R.id.lj7);
        View view = c61814ONu.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c61814ONu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C61814ONu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c61814ONu.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c61814ONu.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C61814ONu.class.getName();
        return c61814ONu;
    }
}
