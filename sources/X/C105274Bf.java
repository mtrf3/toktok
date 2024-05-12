package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105274Bf extends AbstractC029409q<C105364Bo<InterfaceC105334Bl>> {
    public final C105244Bc LJLIL;
    public final InterfaceC88471Ynr<View, Integer, Boolean> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.LJLJJLL.LIZJ();
    }

    public C105274Bf(C105244Bc mEmojiTypeView) {
        o.LJIIIZ(mEmojiTypeView, "mEmojiTypeView");
        this.LJLIL = mEmojiTypeView;
        this.LJLILLLLZI = null;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return this.LJLIL.LJLJJLL.LIZIZ(i).LJ();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C105364Bo<InterfaceC105334Bl> c105364Bo, int i) {
        C105364Bo<InterfaceC105334Bl> holder = c105364Bo;
        o.LJIIIZ(holder, "holder");
        holder.bind(this.LJLIL.LJLJJLL.LIZIZ(i), i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C105364Bo<InterfaceC105334Bl> com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        C105364Bo<InterfaceC105334Bl> c105284Bg;
        o.LJIIIZ(parent, "parent");
        if (i == 5) {
            c105284Bg = new C105294Bh(this, C28289B8j.LIZ(parent, R.layout.atp, parent, false));
        } else {
            c105284Bg = new C105284Bg(this, C28289B8j.LIZ(parent, R.layout.ato, parent, false));
        }
        C0AX.LIZ(parent, c105284Bg.itemView, R.id.lj7);
        View view = c105284Bg.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c105284Bg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c105284Bg.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c105284Bg.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c105284Bg.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c105284Bg.getClass().getName();
        return c105284Bg;
    }
}
