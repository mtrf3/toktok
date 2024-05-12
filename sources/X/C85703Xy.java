package X;

import Y.ACListenerS20S0101000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85703Xy extends AbstractC029409q<C85713Xz> {
    public final List<AdDislikeReasonModel> LJLIL;
    public final InterfaceC88473Ynt<String, String, Integer, C76800UCe> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C85703Xy(List list, C42996Gu8 c42996Gu8) {
        this.LJLIL = list;
        this.LJLILLLLZI = c42996Gu8;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C85713Xz holder, int i) {
        TextView textView;
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        if (!(view instanceof TextView) || (textView = (TextView) view) == null) {
            return;
        }
        textView.setText(((AdDislikeReasonModel) ListProtector.get(this.LJLIL, i)).getReason());
        C16880lQ.LJIJI(textView, new ACListenerS20S0101000_1(this, i, 3));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, X.3Xz] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C85713Xz com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        final View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.ame, parent, false).findViewById(R.id.cbs);
        o.LJIIIIZZ(view, "view");
        ?? r2 = new RecyclerView.ViewHolder(view) { // from class: X.3Xz
        };
        C0AX.LIZ(parent, r2.itemView, R.id.lj7);
        View view2 = r2.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (r2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C85713Xz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) r2.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(r2.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C85713Xz.class.getName();
        return r2;
    }
}
