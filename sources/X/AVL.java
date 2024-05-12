package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AVL extends AbstractC029409q<AVN> {
    public final WeakReference<AVH> LJLIL;
    public final AV9 LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final List<SignificantUserInfo> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AVN avn, int i) {
        String str;
        AVN holder = avn;
        o.LJIIIZ(holder, "holder");
        SignificantUserInfo significantUserInfo = (SignificantUserInfo) ListProtector.get(this.LJLJJI, i);
        if (o.LJ(significantUserInfo.uid, "-1")) {
            holder.LJLJI.setImageResource(R.drawable.b7n);
            holder.LJLJJI.setText(R.string.ia5);
            holder.LJLJJL.setVisibility(8);
        } else {
            C71799SFv.LJIIJ(holder.LJLJI, significantUserInfo.avatarUrl, null, false, null, 126);
            holder.LJLJJI.setVisibility(0);
            TextView textView = holder.LJLJJI;
            String str2 = significantUserInfo.uniqueId;
            if (str2 == null || str2.length() == 0) {
                str = significantUserInfo.shortId;
            } else {
                str = significantUserInfo.uniqueId;
            }
            textView.setText(str);
            holder.LJLJJL.setText(significantUserInfo.nickname);
        }
        holder.LJLJJLL.setVisibility(8);
        holder.LJLJL.setVisibility(8);
        View view = holder.itemView;
        WeakReference<AVH> weakReference = this.LJLIL;
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        C16880lQ.LJIIJ(new AVG(weakReference, significantUserInfo, context, this.LJLJI, this.LJLILLLLZI), view);
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

    public AVL(WeakReference<AVH> weakReference, AV9 metadata, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(metadata, "metadata");
        this.LJLIL = weakReference;
        this.LJLILLLLZI = metadata;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = new ArrayList();
    }
}
