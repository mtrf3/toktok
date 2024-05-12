package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85623Xq extends AbstractC28801Bc<String, C85633Xr> {
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLIL;

    public C85623Xq() {
        super(new AbstractC03160Am<String>() { // from class: X.3Xs
            @Override // X.AbstractC03160Am
            public final boolean LIZ(String str, String str2) {
                return true;
            }

            @Override // X.AbstractC03160Am
            public final boolean LIZIZ(String str, String str2) {
                return o.LJ(str, str2);
            }
        });
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C85633Xr holder = (C85633Xr) viewHolder;
        o.LJIIIZ(holder, "holder");
        String item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        holder.LJLILLLLZI.setText(item);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b7m, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C85633Xr c85633Xr = new C85633Xr(view, this.LJLIL);
        C0AX.LIZ(viewGroup, c85633Xr.itemView, R.id.lj7);
        View view2 = c85633Xr.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c85633Xr.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C85633Xr.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c85633Xr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c85633Xr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C85633Xr.class.getName();
        return c85633Xr;
    }
}
