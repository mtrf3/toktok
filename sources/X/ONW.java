package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.utils.Au2S2S0201000_10;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONW extends C61799ONf<Option> {
    public final Context LJLJJL;
    public final ArrayList<Option> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    public ONW(Context context, ArrayList<Option> arrayList) {
        super(context, arrayList);
        this.LJLJJL = context;
        this.LJLJJLL = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof ONX)) {
            return;
        }
        if (this.LJLILLLLZI) {
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            C16880lQ.LJIIJ(new Au2S2S0201000_10(this, holder, i, 0), view);
        }
        Object obj = ListProtector.get(this.LJLJJLL, i);
        o.LJIIIIZZ(obj, "data[position]");
        Option option = (Option) obj;
        ONX onx = (ONX) holder;
        onx.LJLILLLLZI.setText(option.getName());
        int type = option.getType();
        if (type != 0) {
            if (type != 2) {
                return;
            }
            onx.LJLJJI.setVisibility(0);
            onx.LJLJI.setVisibility(8);
            ConstraintLayout constraintLayout = onx.LJLIL;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.h0);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            c110614Vt.LJFF = Integer.valueOf(R.attr.dl);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
            constraintLayout.setBackground(c110614Vt.LIZ(this.LJLJJL));
            onx.LJLILLLLZI.setTextColorRes(R.attr.dl);
            return;
        }
        onx.LJLJJI.setVisibility(8);
        if (option.isSelected()) {
            onx.LJLILLLLZI.setTextColorRes(R.attr.dj);
            onx.LJLIL.setAlpha(0.55f);
            onx.LJLJI.setVisibility(0);
        } else {
            onx.LJLILLLLZI.setTextColorRes(R.attr.dl);
            onx.LJLIL.setAlpha(1.0f);
            onx.LJLJI.setVisibility(8);
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LIZLLL = AnonymousClass030.LIZLLL(this.LJLJJL, R.layout.abz, parent, false, "from(context).inflate(resource, parent, false)");
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
        LIZLLL.setBackground(c110614Vt.LIZ(this.LJLJJL));
        ONX onx = new ONX(LIZLLL);
        C0AX.LIZ(parent, onx.itemView, R.id.lj7);
        View view = onx.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (onx.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ONX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) onx.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(onx.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ONX.class.getName();
        return onx;
    }
}
