package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AB8 extends AbstractC029409q<AB9> {
    public final Context LJLIL;
    public final AB6 LJLILLLLZI;
    public ArrayList<ABA> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        ArrayList<ABA> arrayList = this.LJLJI;
        if (arrayList != null) {
            o.LJI(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    public AB8(Context context, AB6 ab6) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = ab6;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AB9 ab9, int i) {
        AB9 holder = ab9;
        o.LJIIIZ(holder, "holder");
        if (getItemCount() == 0) {
            return;
        }
        ArrayList<ABA> arrayList = this.LJLJI;
        o.LJI(arrayList);
        Object obj = ListProtector.get(arrayList, i);
        o.LJIIIIZZ(obj, "data!![position]");
        ABA aba = (ABA) obj;
        holder.LJLIL.setTitle(aba.LIZIZ.LIZIZ());
        C25991AHz c25991AHz = holder.LJLILLLLZI;
        if (c25991AHz != null) {
            c25991AHz.LJIILIIL(aba.LIZ);
            c25991AHz.LJIILL(new AB7(this, i));
        }
        if (i == 0) {
            holder.LJLIL.LJ(true, false);
            C26338AVi.LJI(holder.LJLIL, null, AnonymousClass391.LIZJ(8), null, 0, false, 21);
        } else if (i == getItemCount() - 1) {
            holder.LJLIL.LJ(false, true);
            C26338AVi.LJI(holder.LJLIL, null, 0, null, AnonymousClass391.LIZJ(16), false, 21);
        } else {
            holder.LJLIL.LJ(false, false);
            C26338AVi.LJI(holder.LJLIL, null, 0, null, 0, false, 21);
        }
    }

    @Override // X.AbstractC029409q
    public final AB9 onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        AB9 ab9 = new AB9(AnonymousClass030.LIZLLL(this.LJLIL, R.layout.cl2, parent, false, "from(context)\n          …_language, parent, false)"));
        C0AX.LIZ(parent, ab9.itemView, R.id.lj7);
        View view = ab9.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (ab9.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(AB9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) ab9.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(ab9.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = AB9.class.getName();
        return ab9;
    }
}
