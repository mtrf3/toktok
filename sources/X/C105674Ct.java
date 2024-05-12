package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105674Ct extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C105704Cw.LJLIL);
    public ImSysEmojiModel LJLILLLLZI;
    public int LJLJI;

    public final List<C105714Cx> getData() {
        return (List) this.LJLIL.getValue();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        if (viewHolder instanceof C105694Cv) {
            C105694Cv c105694Cv = (C105694Cv) viewHolder;
            C105714Cx emoji = (C105714Cx) ListProtector.get(getData(), i);
            o.LJIIIZ(emoji, "emoji");
            c105694Cv.LJLIL.setText(emoji.LIZ);
            if (emoji.LIZIZ) {
                c105694Cv.LJLIL.setBackgroundResource(R.drawable.c7m);
            } else {
                c105694Cv.LJLIL.setBackgroundResource(R.drawable.c7l);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aty, null, false);
        o.LJIIIIZZ(itemView, "itemView");
        C105694Cv c105694Cv = new C105694Cv(itemView);
        C0AX.LIZ(parent, c105694Cv.itemView, R.id.lj7);
        View view = c105694Cv.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c105694Cv.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C105694Cv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c105694Cv.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c105694Cv.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C105694Cv.class.getName();
        return c105694Cv;
    }
}
