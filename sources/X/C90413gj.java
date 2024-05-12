package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90413gj extends AbstractC029409q<C90423gk> {
    public final InterfaceC90433gl LJLIL;
    public final List<Aweme> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C90413gj(MJC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C90423gk c90423gk, int i) {
        C90423gk viewHolder = c90423gk;
        o.LJIIIZ(viewHolder, "viewHolder");
        Aweme aweme = (Aweme) ListProtector.get(this.LJLILLLLZI, i);
        if (aweme == null || aweme.getVideo() == null) {
            return;
        }
        C78765Uvh.LJFF(viewHolder.LJLILLLLZI, aweme.getVideo().getCover());
        viewHolder.LJLJI = aweme;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C90423gk com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        InterfaceC90433gl listener = this.LJLIL;
        o.LJIIIZ(listener, "listener");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.vx, parent, false);
        o.LJIIIIZZ(view, "view");
        C90423gk c90423gk = new C90423gk(view, listener);
        C0AX.LIZ(parent, c90423gk.itemView, R.id.lj7);
        View view2 = c90423gk.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c90423gk.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C90423gk.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c90423gk.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c90423gk.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C90423gk.class.getName();
        return c90423gk;
    }
}
