package X;

import Y.ACListenerS40S0200000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BiL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29525BiL extends AbstractC029409q<C29526BiM> {
    public List<BadgeStruct> LJLIL;
    public final C29518BiE LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C29525BiL(List<BadgeStruct> badgeList, C29518BiE c29518BiE) {
        o.LJIIIZ(badgeList, "badgeList");
        this.LJLIL = badgeList;
        this.LJLILLLLZI = c29518BiE;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C29526BiM c29526BiM, int i) {
        C31644CbQ c31644CbQ;
        C29526BiM holder = c29526BiM;
        o.LJIIIZ(holder, "holder");
        BadgeStruct badge = (BadgeStruct) ListProtector.get(this.LJLIL, i);
        C29518BiE c29518BiE = this.LJLILLLLZI;
        o.LJIIIZ(badge, "badge");
        View view = holder.itemView;
        if ((view instanceof C31644CbQ) && (c31644CbQ = (C31644CbQ) view) != null) {
            c31644CbQ.LJJLJLI(badge);
            c31644CbQ.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS40S0200000_5(badge, c29518BiE, 93)));
            if (holder.LJLIL) {
                holder.LJLIL = false;
                if (c29518BiE != null) {
                    c29518BiE.LIZIZ(badge);
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C29526BiM com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C29526BiM c29526BiM = new C29526BiM(new C31644CbQ(context, null, 0));
        C0AX.LIZ(parent, c29526BiM.itemView, R.id.lj7);
        View view = c29526BiM.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c29526BiM.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C29526BiM.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c29526BiM.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c29526BiM.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C29526BiM.class.getName();
        return c29526BiM;
    }
}
