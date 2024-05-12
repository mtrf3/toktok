package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SHb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71831SHb extends AbstractC28801Bc<String, C71832SHc> {
    public boolean LJLIL;
    public final /* synthetic */ C81066Vri LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71831SHb(C81066Vri c81066Vri) {
        super(new C71833SHd());
        this.LJLILLLLZI = c81066Vri;
        this.LJLIL = true;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C71832SHc viewHolder2 = (C71832SHc) viewHolder;
        o.LJIIIZ(viewHolder2, "viewHolder");
        viewHolder2.LJLIL.setText(getItem(i));
        String item = getItem(i);
        C16880lQ.LJIIJ(new ViewOnClickListenerC81067Vrj(this.LJLILLLLZI, item, this), viewHolder2.LJLILLLLZI);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "viewGroup", R.layout.b0a, viewGroup, false);
        if (C99W.LIZ) {
            view.setBackground(this.LJLILLLLZI.getContext().getDrawable(R.drawable.a_w));
        }
        o.LJIIIIZZ(view, "view");
        C71832SHc c71832SHc = new C71832SHc(view);
        C0AX.LIZ(viewGroup, c71832SHc.itemView, R.id.lj7);
        View view2 = c71832SHc.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c71832SHc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C71832SHc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c71832SHc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c71832SHc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C71832SHc.class.getName();
        return c71832SHc;
    }
}
