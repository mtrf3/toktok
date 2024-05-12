package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bp6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29944Bp6 extends AbstractC029409q<C29945Bp7> {
    public List<C29946Bp8> LJLIL;
    public InterfaceC29942Bp4 LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<C29946Bp8> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C29945Bp7 c29945Bp7, int i) {
        C29946Bp8 c29946Bp8;
        String str;
        C29945Bp7 holder = c29945Bp7;
        o.LJIIIZ(holder, "holder");
        List<C29946Bp8> list = this.LJLIL;
        ImageModel imageModel = null;
        if (list != null) {
            c29946Bp8 = (C29946Bp8) ListProtector.get(list, i);
        } else {
            c29946Bp8 = null;
        }
        C29943Bp5 c29943Bp5 = new C29943Bp5(this);
        if (c29946Bp8 != null && c29946Bp8.LIZ) {
            holder.LJLIL.setVisibility(0);
        } else {
            holder.LJLIL.setVisibility(8);
        }
        C47121t6 c47121t6 = holder.LJLJI;
        if (c29946Bp8 != null) {
            str = c29946Bp8.LIZJ;
        } else {
            str = null;
        }
        c47121t6.setText(str);
        C5D7 c5d7 = holder.LJLILLLLZI;
        if (c29946Bp8 != null) {
            imageModel = c29946Bp8.LIZIZ;
        }
        C15640jQ.LJIIIIZZ(c5d7, imageModel);
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(c29946Bp8, c29943Bp5, 53), holder.itemView);
    }

    @Override // X.AbstractC029409q
    public final C29945Bp7 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.db4, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C29945Bp7 c29945Bp7 = new C29945Bp7(view);
        C0AX.LIZ(viewGroup, c29945Bp7.itemView, R.id.lj7);
        View view2 = c29945Bp7.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c29945Bp7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C29945Bp7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c29945Bp7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c29945Bp7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C29945Bp7.class.getName();
        return c29945Bp7;
    }
}
