package X;

import Y.ACListenerS27S0201000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ON6 extends AbstractC029409q<ON7> {
    public final Context LJLIL;
    public final ArrayList<Option> LJLILLLLZI;
    public int LJLJI = -1;
    public ON3 LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public ON6(Context context, ArrayList<Option> arrayList) {
        this.LJLIL = context;
        this.LJLILLLLZI = arrayList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(ON7 on7, int i) {
        boolean z;
        ON7 holder = on7;
        o.LJIIIZ(holder, "holder");
        C16880lQ.LJIIJ(new ACListenerS27S0201000_10(this, i, holder, 2), holder.itemView);
        holder.LJLIL.setText(((Option) ListProtector.get(this.LJLILLLLZI, i)).getName());
        C63044Ooi c63044Ooi = holder.LJLILLLLZI;
        if (this.LJLJI == i) {
            z = true;
        } else {
            z = false;
        }
        c63044Ooi.setChecked(z);
    }

    @Override // X.AbstractC029409q
    public final ON7 onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ON7 on7 = new ON7(AnonymousClass030.LIZLLL(this.LJLIL, R.layout.abn, parent, false, "from(context).inflate(R.…urvey_new, parent, false)"));
        C0AX.LIZ(parent, on7.itemView, R.id.lj7);
        View view = on7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (on7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ON7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) on7.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(on7.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ON7.class.getName();
        return on7;
    }
}
