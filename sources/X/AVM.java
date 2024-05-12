package X;

import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.IDaS467S0100000_4;
import o3.h0;

/* loaded from: classes5.dex */
public final class AVM extends AbstractC029409q<AVN> {
    public final WeakReference<AVA> LJLIL;
    public final AV9 LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final Bundle LJLJJI;
    public final List<SignificantUserInfo> LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJL).size();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(AVN avn) {
        AVN holder = avn;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.L("account_list_show");
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AVN avn, int i) {
        String str;
        int i2;
        TuxTextView tuxTextView;
        AVN holder = avn;
        o.LJIIIZ(holder, "holder");
        SignificantUserInfo significantUserInfo = (SignificantUserInfo) ListProtector.get(this.LJLJJL, i);
        if (o.LJ(significantUserInfo.uid, "-1")) {
            holder.LJLJJI.setText(R.string.bf1);
            holder.LJLJJL.setVisibility(8);
            C71799SFv c71799SFv = holder.LJLJI;
            Context it = c71799SFv.getContext();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_plus;
            c2068389v.LIZIZ = C7MY.LIZIZ(25);
            c2068389v.LIZJ = C7MY.LIZIZ(25);
            c2068389v.LJ = Integer.valueOf(R.attr.gx);
            o.LJIIIIZZ(it, "it");
            SY9 LIZ = c2068389v.LIZ(it);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = C61328O5c.LIZJ(28);
            c110614Vt.LJII = C7MY.LIZIZ(56);
            c110614Vt.LJI = C7MY.LIZIZ(56);
            c71799SFv.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(it)));
        } else {
            C71799SFv.LJIIJ(holder.LJLJI, significantUserInfo.avatarUrl, null, false, null, 126);
            TextView textView = holder.LJLJJI;
            String str2 = significantUserInfo.uniqueId;
            if (str2 == null || str2.length() == 0) {
                str = significantUserInfo.shortId;
            } else {
                str = significantUserInfo.uniqueId;
            }
            textView.setText(str);
            holder.LJLJJL.setVisibility(8);
            C45804HyK.LJJLIIIJ(0, holder.LJLJL);
        }
        TextView textView2 = holder.LJLJJI;
        if ((textView2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView2) != null) {
            tuxTextView.setTuxFont(102);
        }
        C27570Aru.LJII((int) KL2.LIZJ(holder.itemView.getContext(), 72.0f), holder.LJLILLLLZI);
        String str3 = significantUserInfo.uid;
        holder.LJLIL = str3;
        TuxIconView tuxIconView = holder.LJLJJLL;
        if (o.LJ(str3, ((RBX) HG3.LJIILL()).getCurUserId())) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
        holder.LJLJL.setVisibility(8);
        if (!o.LJ(significantUserInfo.uid, ((RBX) HG3.LJIILL()).getCurUserId())) {
            int LJIILLIIL = C54362LVe.LJIILLIIL(significantUserInfo.uid);
            if (LJIILLIIL > 0) {
                holder.LJLJL.setVisibility(0);
                holder.LJLJL.setCount(LJIILLIIL);
                holder.LJLJL.setMaxCount(99);
                if (!C54305LSz.LIZJ()) {
                    holder.LJLJL.setMaxCount(1);
                }
            }
        } else {
            holder.LJLILLLLZI.setSelected(true);
        }
        WeakReference<AVA> weakReference = this.LJLIL;
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(new AVB(weakReference, significantUserInfo, context, this.LJLJI, this.LJLILLLLZI, this.LJLJJI), holder, 96), holder.itemView);
        h0.LJIJI(holder.LJLILLLLZI, new IDaS467S0100000_4(holder, 2));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AVN com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        AVN avn = new AVN(C1FL.LIZIZ(parent, R.layout.c5_, parent, false, "from(parent.context)\n   …account_m, parent, false)"));
        C0AX.LIZ(parent, avn.itemView, R.id.lj7);
        View view = avn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (avn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(AVN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) avn.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(avn.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = AVN.class.getName();
        return avn;
    }

    public AVM(WeakReference<AVA> weakReference, AV9 metadata, ActivityC45651qj activityC45651qj, Bundle bundle) {
        o.LJIIIZ(metadata, "metadata");
        this.LJLIL = weakReference;
        this.LJLILLLLZI = metadata;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = bundle;
        this.LJLJJL = new ArrayList();
    }
}
