package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89823fm extends AbstractC029409q<C89843fo<IMUser>> {
    public final C89853fp LJLIL;
    public List<? extends IMUser> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C89823fm(C89853fp c89853fp) {
        C61878OQg data = C61878OQg.INSTANCE;
        o.LJIIIZ(data, "data");
        this.LJLIL = c89853fp;
        this.LJLILLLLZI = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C89843fo<IMUser> c89843fo, int i) {
        C89843fo<IMUser> holder = c89843fo;
        o.LJIIIZ(holder, "holder");
        holder.L(ListProtector.get(this.LJLILLLLZI, i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C89843fo<IMUser> com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C89833fn c89833fn = new C89833fn(C1FL.LIZIZ(parent, R.layout.c_q, parent, false, "from(parent.context).inf…m_contact, parent, false)"), new AqS167S0100000_1(this, 327));
        C0AX.LIZ(parent, c89833fn.itemView, R.id.lj7);
        View view = c89833fn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c89833fn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C89833fn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c89833fn.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c89833fn.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C89833fn.class.getName();
        return c89833fn;
    }
}
