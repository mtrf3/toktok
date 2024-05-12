package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NJe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59146NJe extends AbstractC029409q<C59147NJf> {
    public final Fragment LJLIL;
    public String LJLILLLLZI;
    public final boolean LJLJI;
    public final ActivityC45651qj LJLJJI;
    public C59232NMm LJLJJL;
    public final C59144NJc LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return 1;
    }

    public C59146NJe(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = null;
        this.LJLJI = false;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        o.LJI(mo49getActivity);
        this.LJLJJI = mo49getActivity;
        this.LJLJJLL = new C59144NJc();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C59147NJf holder, int i) {
        C59232NMm c59232NMm;
        o.LJIIIZ(holder, "holder");
        o.LJII(holder.itemView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.spark.CommonBizSparkWebView");
        int LIZJ = ((C60996Nwm.LIZJ(this.LJLJJI) - C63081OpJ.LJJJJLI(this.LJLJJI)) - ((int) this.LJLJJI.getResources().getDimension(R.dimen.aje))) - C17N.LJIILL(40.0d);
        if (this.LJLJI) {
            LIZJ -= (int) this.LJLJJI.getResources().getDimension(R.dimen.w4);
        }
        holder.itemView.setLayoutParams(new ViewGroup.LayoutParams(C60996Nwm.LJIIIIZZ(this.LJLJJI), LIZJ));
        String str = this.LJLILLLLZI;
        if (str != null) {
            View view = holder.itemView;
            if ((view instanceof C59232NMm) && (c59232NMm = (C59232NMm) view) != null) {
                android.net.Uri parse = UriProtector.parse(str);
                o.LJIIIIZZ(parse, "parse(url)");
                if (o.LJ(c59232NMm.LJLJJLL, parse.toString())) {
                    return;
                }
                c59232NMm.LJLJJLL = parse.toString();
                c59232NMm.LIZ(parse, null, null);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C59147NJf com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        Bundle bundle;
        o.LJIIIZ(parent, "parent");
        this.LJLJJL = new C59232NMm(this.LJLJJI, null, 6);
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
        new CommercializeWebViewHelper(this.LJLJJI, new NZQ(this.LJLJJI, null, 6), this.LJLJJLL, C59307NPj.LIZ(bundle), this.LJLIL);
        C59232NMm c59232NMm = this.LJLJJL;
        o.LJI(c59232NMm);
        C59147NJf c59147NJf = new C59147NJf(c59232NMm);
        C0AX.LIZ(parent, c59147NJf.itemView, R.id.lj7);
        View view = c59147NJf.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c59147NJf.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C59147NJf.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c59147NJf.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c59147NJf.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C59147NJf.class.getName();
        return c59147NJf;
    }
}
