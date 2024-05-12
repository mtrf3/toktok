package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4TB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TB extends AbstractC029409q<C4TE> {
    public final MessageRequestViewModel LJLIL;
    public final List<C4TP> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C4TB(MessageRequestViewModel vm) {
        o.LJIIIZ(vm, "vm");
        this.LJLIL = vm;
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C4TE c4te, int i) {
        int i2;
        C4TE holder = c4te;
        o.LJIIIZ(holder, "holder");
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(holder, this, 64), holder.itemView);
        C71897SJp c71897SJp = holder.LJLIL;
        o.LJIIIZ(c71897SJp, "<this>");
        C16880lQ.LJIIJ(null, c71897SJp);
        boolean z = false;
        c71897SJp.setClickable(false);
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        if (this.LJLIL.jv0()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (C1GE.LJIILIIL(this.LJLIL.getState().LJLJJL)) {
            List<C97383ry> list = this.LJLIL.getState().LJLJJL;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C97383ry> it = list.iterator();
                while (it.hasNext()) {
                    if (!it.next().LJLIL) {
                        break;
                    }
                }
            }
            z = true;
        }
        holder.LJLIL.setChecked(z);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C4TE com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b5q, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C4TE c4te = new C4TE(view);
        C0AX.LIZ(viewGroup, c4te.itemView, R.id.lj7);
        View view2 = c4te.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c4te.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C4TE.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c4te.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c4te.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C4TE.class.getName();
        return c4te;
    }
}
