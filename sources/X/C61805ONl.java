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

/* renamed from: X.ONl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61805ONl extends C61799ONf<Option> {
    public final Context LJLJJL;
    public final ArrayList<Option> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    public C61805ONl(Context context, ArrayList<Option> arrayList) {
        super(context, arrayList);
        this.LJLJJL = context;
        this.LJLJJLL = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C61807ONn)) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS27S0201000_10(this, i, holder, 6), holder.itemView);
        C61807ONn c61807ONn = (C61807ONn) holder;
        c61807ONn.LJLIL.setText(((Option) ListProtector.get(this.LJLJJLL, i)).getName());
        if (this.LJLIL == i) {
            c61807ONn.LJLILLLLZI.setChecked(true);
            c61807ONn.LJLJI.setChecked(true);
            return;
        }
        c61807ONn.LJLILLLLZI.setChecked(false);
        c61807ONn.LJLJI.setChecked(false);
        if (this.LJLILLLLZI) {
            c61807ONn.LJLILLLLZI.setVisibility(0);
            c61807ONn.LJLJI.setVisibility(8);
        } else {
            c61807ONn.LJLILLLLZI.setVisibility(8);
            c61807ONn.LJLJI.setVisibility(0);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        int i3 = C61810ONq.LIZ[this.LJLJI.ordinal()];
        boolean z = true;
        if (i3 != 1) {
            if (i3 != 2) {
                i2 = R.layout.ac8;
            } else {
                i2 = R.layout.ac7;
            }
        } else {
            i2 = R.layout.ac6;
        }
        C61807ONn c61807ONn = new C61807ONn(AnonymousClass030.LIZLLL(this.LJLJJL, i2, parent, false, "from(context).inflate(resource, parent, false)"));
        C0AX.LIZ(parent, c61807ONn.itemView, R.id.lj7);
        View view = c61807ONn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c61807ONn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C61807ONn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c61807ONn.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c61807ONn.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C61807ONn.class.getName();
        return c61807ONn;
    }
}
