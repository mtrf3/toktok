package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftAndSenders;
import com.ss.android.ugc.aweme.comment.supporterpanel.GiftSupporterPanelTopBanner;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3gO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90203gO extends AbstractC029409q<C90213gP> {
    public GiftSupporterPanelTopBanner LJLIL;
    public List<GiftAndSenders> LJLILLLLZI = C61878OQg.INSTANCE;
    public final int LJLJI = 4;
    public AqS167S0100000_1 LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (this.LJLIL == null) {
            return this.LJLILLLLZI.size();
        }
        return this.LJLILLLLZI.size() + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015a, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C90213gP r12, int r13) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90203gO.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C90213gP com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View view;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 1 && this.LJLIL != null) {
            view = C28289B8j.LIZ(parent, R.layout.r5, parent, false);
            View findViewById = view.findViewById(R.id.i1a);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "context");
            findViewById.setBackground(c110614Vt.LIZ(context));
            C78897Uxp.LJJJJJL(findViewById, C32151Nz.LJIIZILJ(2));
        } else {
            view = C28289B8j.LIZ(parent, R.layout.r4, parent, false);
        }
        o.LJIIIIZZ(view, "view");
        C90213gP c90213gP = new C90213gP(view);
        C0AX.LIZ(parent, c90213gP.itemView, R.id.lj7);
        View view2 = c90213gP.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c90213gP.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C90213gP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c90213gP.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c90213gP.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C90213gP.class.getName();
        return c90213gP;
    }
}
