package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.CommentFilterModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.keywords.KeyWordsViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SKr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71925SKr extends AbstractC029409q<C71926SKs> {
    public final CommentFilterModel LJLIL;
    public final KeyWordsViewModel LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.LJLJJI.size();
    }

    public C71925SKr(Context mContext, CommentFilterModel gVm) {
        o.LJIIIZ(mContext, "mContext");
        o.LJIIIZ(gVm, "gVm");
        this.LJLIL = gVm;
        KeyWordsViewModel keyWordsViewModel = gVm.LJLILLLLZI;
        this.LJLILLLLZI = keyWordsViewModel;
        SLL sll = new SLL(this);
        keyWordsViewModel.getClass();
        keyWordsViewModel.LJLJJL = sll;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C71926SKs c71926SKs, int i) {
        C71926SKs holder = c71926SKs;
        o.LJIIIZ(holder, "holder");
        String text = (String) ListProtector.get(this.LJLILLLLZI.LJLJJI, i);
        o.LJIIIZ(text, "text");
        holder.LJLJJI = text;
        holder.LJLJI = Integer.valueOf(i);
        holder.LJLILLLLZI.setText(text);
    }

    @Override // X.AbstractC029409q
    public final C71926SKs onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ah_, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C71926SKs c71926SKs = new C71926SKs(view, new AqS194S0100000_12(this, 267));
        C0AX.LIZ(viewGroup, c71926SKs.itemView, R.id.lj7);
        View view2 = c71926SKs.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c71926SKs.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C71926SKs.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c71926SKs.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c71926SKs.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C71926SKs.class.getName();
        return c71926SKs;
    }
}
