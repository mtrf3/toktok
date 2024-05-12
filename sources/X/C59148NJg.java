package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NJg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59148NJg extends AbstractC029409q<C59149NJh> {
    public final Fragment LJLIL;
    public String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final ActivityC45651qj LJLJJL;
    public NZQ LJLJJLL;
    public final C59143NJb LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return 1;
    }

    public C59148NJg(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = null;
        this.LJLJI = false;
        this.LJLJJI = true;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        o.LJI(mo49getActivity);
        this.LJLJJL = mo49getActivity;
        this.LJLJL = new C59143NJb();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C59149NJh holder, int i) {
        NZQ nzq;
        o.LJIIIZ(holder, "holder");
        o.LJII(holder.itemView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
        int LIZJ = ((C60996Nwm.LIZJ(this.LJLJJL) - C63081OpJ.LJJJJLI(this.LJLJJL)) - ((int) this.LJLJJL.getResources().getDimension(R.dimen.aje))) - C17N.LJIILL(40.0d);
        if (this.LJLJI) {
            LIZJ -= (int) this.LJLJJL.getResources().getDimension(R.dimen.w4);
        }
        holder.itemView.setLayoutParams(new ViewGroup.LayoutParams(C60996Nwm.LJIIIIZZ(this.LJLJJL), LIZJ));
        String str = this.LJLILLLLZI;
        if (str != null) {
            View view = holder.itemView;
            if ((view instanceof NZQ) && (nzq = (NZQ) view) != null) {
                int LJIILL = C17N.LJIILL(80.0d);
                ViewGroup.LayoutParams layoutParams = nzq.LJFF(R.id.g94).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = 0;
                layoutParams2.rightMargin = 0;
                layoutParams2.topMargin = LJIILL;
                layoutParams2.bottomMargin = 0;
                layoutParams2.gravity = 1;
                nzq.LJFF(R.id.g94).setLayoutParams(layoutParams2);
                nzq.LJIJ(str, this.LJLJJI);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C59149NJh com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        Bundle bundle;
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = new NZQ(this.LJLJJL, null, 6);
        Fragment fragment = this.LJLIL;
        if (fragment instanceof EnterpriseTabFragment) {
            fragment.getClass();
            bundle = new Bundle();
        } else {
            bundle = new Bundle();
        }
        String str = this.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        bundle.putString("url", str);
        NZQ nzq = this.LJLJJLL;
        o.LJI(nzq);
        new CommercializeWebViewHelper(this.LJLJJL, nzq, this.LJLJL, C59307NPj.LIZ(bundle), this.LJLIL);
        NZQ nzq2 = this.LJLJJLL;
        o.LJI(nzq2);
        C59149NJh c59149NJh = new C59149NJh(nzq2);
        C0AX.LIZ(parent, c59149NJh.itemView, R.id.lj7);
        View view = c59149NJh.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c59149NJh.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C59149NJh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c59149NJh.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c59149NJh.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C59149NJh.class.getName();
        return c59149NJh;
    }
}
