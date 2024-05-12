package X;

import Y.ACListenerS30S0300000_4;
import Y.IDCListenerS142S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AJq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26034AJq extends AbstractC029409q<C26035AJr> {
    public final Context LJLIL;
    public final List<PushOffReason> LJLILLLLZI;
    public PushOffReasonBottomSheetFragment LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C26034AJq(Context context, List<PushOffReason> list) {
        this.LJLIL = context;
        this.LJLILLLLZI = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C26035AJr c26035AJr, int i) {
        C26035AJr holder = c26035AJr;
        o.LJIIIZ(holder, "holder");
        PushOffReason pushOffReason = (PushOffReason) ListProtector.get(this.LJLILLLLZI, i);
        holder.LJLILLLLZI.setText(pushOffReason.reason);
        C16880lQ.LJIIJ(new ACListenerS30S0300000_4(holder, this, pushOffReason, 11), holder.LJLIL);
        holder.LJLJI.setOnCheckedChangeListener(new IDCListenerS142S0200000_4(this, pushOffReason, 5));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C26035AJr com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C26035AJr c26035AJr = new C26035AJr(AnonymousClass030.LIZLLL(this.LJLIL, R.layout.clh, parent, false, "from(context).inflate(R.…check_box, parent, false)"));
        C0AX.LIZ(parent, c26035AJr.itemView, R.id.lj7);
        View view = c26035AJr.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c26035AJr.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C26035AJr.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c26035AJr.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c26035AJr.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C26035AJr.class.getName();
        return c26035AJr;
    }
}
