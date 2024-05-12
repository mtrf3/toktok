package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJR extends AbstractC029409q<CJT> {
    public final ArrayList<QuickChatContent> LJLIL = new ArrayList<>();
    public CJW LJLILLLLZI;
    public final /* synthetic */ QuickCommentWidget LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public CJR(QuickCommentWidget quickCommentWidget) {
        this.LJLJI = quickCommentWidget;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (!this.LJLIL.isEmpty()) {
            return ((QuickChatContent) ListProtector.get(this.LJLIL, i)).type;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(CJT cjt, int i) {
        CJT holder = cjt;
        o.LJIIIZ(holder, "holder");
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            holder.itemView.setTag(R.id.bq7, null);
        }
        holder.L(holder, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final CJT com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        CJT cjs;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 1) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(g0.LJIILJJIL(parent.getContext())), R.layout.d94, parent, false);
            o.LJIIIIZZ(LLLLIILL, "from(ContextUtil.context…e_comment, parent, false)");
            cjs = new CJQ(this, LLLLIILL);
        } else {
            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(g0.LJIILJJIL(parent.getContext())), R.layout.d93, parent, false);
            o.LJIIIIZZ(LLLLIILL2, "from(ContextUtil.context…k_comment, parent, false)");
            cjs = new CJS(this, LLLLIILL2);
        }
        C0AX.LIZ(parent, cjs.itemView, R.id.lj7);
        View view = cjs.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (cjs.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(cjs.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) cjs.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(cjs.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = cjs.getClass().getName();
        return cjs;
    }
}
