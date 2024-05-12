package X;

import Y.ACListenerS27S0201000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ONj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61803ONj extends C61799ONf<Option> {
    public final Context LJLJJL;
    public final ArrayList<Option> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    public C61803ONj(Context context, ArrayList<Option> arrayList) {
        super(context, arrayList);
        this.LJLJJL = context;
        this.LJLJJLL = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof C61813ONt)) {
            return;
        }
        if (this.LJLILLLLZI) {
            C16880lQ.LJIIJ(new ACListenerS27S0201000_10(this, i, holder, 4), holder.itemView);
        }
        C61813ONt c61813ONt = (C61813ONt) holder;
        c61813ONt.LJLIL.setText(((Option) ListProtector.get(this.LJLJJLL, i)).getName());
        TuxTextView tuxTextView = c61813ONt.LJLIL;
        if (this.LJLIL == i) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        if (C61779OMl.LJ(this.LJLJI)) {
            if (c61813ONt.LJLIL.isSelected()) {
                c61813ONt.LJLIL.setTextColorRes(R.attr.dj);
            } else {
                c61813ONt.LJLIL.setTextColorRes(R.attr.dl);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        int i3 = C61808ONo.LIZ[this.LJLJI.ordinal()];
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                i2 = R.layout.ac2;
            } else {
                i2 = R.layout.ac0;
            }
        } else {
            i2 = R.layout.ac1;
        }
        View LIZLLL = AnonymousClass030.LIZLLL(this.LJLJJL, i2, parent, false, "from(context).inflate(resource, parent, false)");
        View findViewById = LIZLLL.findViewById(R.id.mc_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_normal_choice)");
        if (C8D3.LIZ() && this.LJLJI == EnumC61784OMq.BACKGROUND) {
            findViewById.getLayoutParams().height = C7MY.LIZIZ(28);
        }
        C61813ONt c61813ONt = new C61813ONt(LIZLLL);
        C0AX.LIZ(parent, c61813ONt.itemView, R.id.lj7);
        View view = c61813ONt.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c61813ONt.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C61813ONt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c61813ONt.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c61813ONt.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C61813ONt.class.getName();
        return c61813ONt;
    }
}
