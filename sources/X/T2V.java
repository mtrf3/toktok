package X;

import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.emoji.BadgeIcon;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T2V extends AbstractC029409q<T2Z> {
    public final Context LJLIL;
    public final T2Y LJLILLLLZI;
    public BadgeIconTab LJLJI;
    public final List<BadgeIcon> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((BadgeIcon) ListProtector.get(this.LJLJJI, i)).iconType;
    }

    public T2V(Context context, T2Y emojiInputListener) {
        o.LJIIIZ(emojiInputListener, "emojiInputListener");
        this.LJLIL = context;
        this.LJLILLLLZI = emojiInputListener;
        this.LJLJJI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(T2Z t2z, int i) {
        T2Z holder = t2z;
        o.LJIIIZ(holder, "holder");
        BadgeIcon badgeIcon = (BadgeIcon) ListProtector.get(this.LJLJJI, i);
        if (holder instanceof T2W) {
            ((T2W) holder).LJLIL.setText(badgeIcon.iconStr);
        } else if (holder instanceof T2X) {
            C15650jR.LIZ().setUrl(badgeIcon.iconUrl).LJIIJJI(((T2X) holder).LJLIL);
        }
        holder.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) B9K.LIZ(this.LJLIL, 62.0f)));
        C16880lQ.LJIIJ(new ACListenerS46S0200000_12(this, badgeIcon, 7), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final T2Z com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        T2Z t2w;
        o.LJIIIZ(parent, "parent");
        if (i == 2) {
            t2w = new T2X(C1FL.LIZIZ(parent, R.layout.dd4, parent, false, "from(parent.context)\n   …list_item, parent, false)"));
        } else {
            t2w = new T2W(C1FL.LIZIZ(parent, R.layout.dd1, parent, false, "from(parent.context)\n   …list_item, parent, false)"));
        }
        C0AX.LIZ(parent, t2w.itemView, R.id.lj7);
        View view = t2w.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (t2w.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(t2w.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) t2w.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(t2w.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = t2w.getClass().getName();
        return t2w;
    }
}
