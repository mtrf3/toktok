package X;

import Y.ACListenerS19S0201000_1;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4dL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113794dL extends C4RC {
    public List<? extends InterfaceC62225ObV> LJLIL;
    public final Context LJLILLLLZI;
    public final InterfaceC113814dN LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final BaseSharePackage LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.C4RC
    public final void setData(List<? extends InterfaceC62225ObV> channels) {
        o.LJIIIZ(channels, "channels");
        this.LJLIL = channels;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        C113804dM c113804dM = (C113804dM) holder;
        ((InterfaceC62225ObV) ListProtector.get(this.LJLIL, i)).LJ(c113804dM.LJLIL, this.LJLJJI);
        c113804dM.LJLJI = (InterfaceC62225ObV) ListProtector.get(this.LJLIL, i);
        c113804dM.LJLILLLLZI.setText(((InterfaceC62225ObV) ListProtector.get(this.LJLIL, i)).label());
        C16880lQ.LJIIJ(new ACListenerS19S0201000_1(this, c113804dM, i, 2), c113804dM.itemView);
        if (((InterfaceC62225ObV) ListProtector.get(this.LJLIL, i)).LJIILJJIL()) {
            View view = c113804dM.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            view.setAlpha(((InterfaceC62225ObV) ListProtector.get(this.LJLIL, i)).LJIILLIIL());
        } else {
            View view2 = c113804dM.itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            view2.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1 != null) goto L10;
     */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            java.lang.String r3 = "onCreateViewHolder getParent() != null crash hook, holder "
            java.lang.String r1 = "parent"
            r0 = 2131561536(0x7f0d0c40, float:1.8748475E38)
            r5 = 0
            android.view.View r6 = X.C06490Nh.LIZIZ(r9, r1, r0, r9, r5)
            X.4dM r2 = new X.4dM
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            r2.<init>(r6)
            boolean r0 = r8.LJLJJL
            if (r0 == 0) goto L21
            com.bytedance.tux.input.TuxTextView r1 = r2.LJLILLLLZI
            r0 = 8
            r1.setVisibility(r0)
        L21:
            boolean r0 = X.C4P2.LIZJ()
            r7 = -1
            if (r0 == 0) goto L8b
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.content.Context r0 = r8.LJLILLLLZI
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166383(0x7f0704af, float:1.794701E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r4.width = r0
            com.bytedance.tux.input.TuxTextView r0 = r2.LJLILLLLZI
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r7
        L43:
            X.4dO r0 = new X.4dO
            r0.<init>(r2)
            X.C13930gf.LIZ(r6, r0)
            com.bytedance.tux.input.TuxTextView r6 = r2.LJLILLLLZI
            int r0 = r8.LJLJJLL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            r4 = 1
            if (r0 == 0) goto L78
        L5a:
            int r5 = r1.intValue()
        L5e:
            r6.setTextColor(r5)
            android.view.View r1 = r2.itemView
            r0 = 2131378228(0x7f0a4034, float:1.8376683E38)
            X.C0AX.LIZ(r9, r1, r0)
            android.view.View r5 = r2.itemView
            if (r5 == 0) goto La7
            r1 = 2131364775(0x7f0a0ba7, float:1.8349397E38)
            androidx.fragment.app.Fragment r0 = X.C79234V7u.LJIIIZ(r9)
            r5.setTag(r1, r0)
            goto La7
        L78:
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2130968739(0x7f0400a3, float:1.754614E38)
            java.lang.Integer r1 = X.C79045V0n.LJI(r0, r1)
            if (r1 == 0) goto L5e
            goto L5a
        L8b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.content.Context r0 = r8.LJLILLLLZI
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166382(0x7f0704ae, float:1.7947008E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r4.width = r0
            com.bytedance.tux.input.TuxTextView r0 = r2.LJLILLLLZI
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r7
            goto L43
        La7:
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lfb
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> Lfb
            if (r0 == 0) goto L102
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r0 = "catch_onCreateViewHolder_crash"
            r1.getClass()     // Catch: java.lang.Exception -> Lbc
            boolean r4 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r4)     // Catch: java.lang.Exception -> Lbc
        Lbc:
            if (r4 == 0) goto L102
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Lfb
            r1.<init>(r3)     // Catch: java.lang.Exception -> Lfb
            java.lang.Class<X.4dM> r0 = X.C113804dM.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lfb
            r1.append(r0)     // Catch: java.lang.Exception -> Lfb
            java.lang.String r0 = " parent "
            r1.append(r0)     // Catch: java.lang.Exception -> Lfb
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Exception -> Lfb
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lfb
            r1.append(r0)     // Catch: java.lang.Exception -> Lfb
            java.lang.String r0 = " viewType "
            r1.append(r0)     // Catch: java.lang.Exception -> Lfb
            r1.append(r10)     // Catch: java.lang.Exception -> Lfb
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lfb
            X.C78983UzD.LJIILL(r0)     // Catch: java.lang.Exception -> Lfb
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lfb
            android.view.ViewParent r1 = r0.getParent()     // Catch: java.lang.Exception -> Lfb
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Exception -> Lfb
            if (r1 == 0) goto L102
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lfb
            X.C16880lQ.LJLLL(r0, r1)     // Catch: java.lang.Exception -> Lfb
            goto L102
        Lfb:
            r0 = move-exception
            X.C78946Uyc.LIZIZ(r0)
            X.C36922EeM.LIZ(r0)
        L102:
            java.lang.Class<X.4dM> r0 = X.C113804dM.class
            java.lang.String r0 = r0.getName()
            X.C29127Bbv.LIZ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113794dL.com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public C113794dL(Context context, InterfaceC113814dN listener, int i) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = context;
        this.LJLJI = listener;
        this.LJLJJI = false;
        this.LJLJJL = false;
        this.LJLJJLL = i;
        this.LJLJL = null;
        this.LJLIL = C61878OQg.INSTANCE;
    }
}
