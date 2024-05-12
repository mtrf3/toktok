package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238759Yp extends AbstractC029409q<C9Z6> {
    public BaAutoReplyListActivity LJLIL;
    public List<C9Z3> LJLILLLLZI = C61878OQg.INSTANCE;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C9Z6 r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.List<X.9Z3> r0 = r4.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.9Z3 r0 = (X.C9Z3) r0
            int r1 = r0.LIZIZ
            r0 = 1
            if (r1 == r0) goto L1b
            r0 = 2
            if (r1 == r0) goto L6e
            r0 = 3
            if (r1 == r0) goto L6a
            r0 = 4
            if (r1 == r0) goto L66
        L1b:
            r2 = 2131820884(0x7f110154, float:1.9274496E38)
        L1e:
            android.view.View r1 = r5.itemView
            r0 = 2131379558(0x7f0a4566, float:1.837938E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            java.util.List<X.9Z3> r0 = r4.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.9Z3 r0 = (X.C9Z3) r0
            java.lang.String r3 = r0.LIZLLL
            java.lang.String r2 = ""
            if (r3 != 0) goto L3b
            r3 = r2
        L3b:
            android.view.View r1 = r5.itemView
            r0 = 2131378857(0x7f0a42a9, float:1.8377958E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r3)
            java.util.List<X.9Z3> r0 = r4.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.9Z3 r0 = (X.C9Z3) r0
            java.lang.String r0 = r0.LIZJ
            if (r0 != 0) goto L64
        L55:
            android.view.View r1 = r5.itemView
            r0 = 2131379226(0x7f0a441a, float:1.8378707E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            return
        L64:
            r2 = r0
            goto L55
        L66:
            r2 = 2131843845(0x7f115b05, float:1.9321066E38)
            goto L1e
        L6a:
            r2 = 2131823985(0x7f110d71, float:1.9280785E38)
            goto L1e
        L6e:
            r2 = 2131848240(0x7f116c30, float:1.932998E38)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238759Yp.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C9Z6 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cl1, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C9Z6 c9z6 = new C9Z6(this, view);
        C0AX.LIZ(viewGroup, c9z6.itemView, R.id.lj7);
        View view2 = c9z6.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c9z6.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C9Z6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c9z6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c9z6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C9Z6.class.getName();
        return c9z6;
    }
}
