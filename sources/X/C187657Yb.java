package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187657Yb extends AbstractC029409q<C187667Yc> {
    public final Context LJLIL;
    public final List<String> LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<String> list = this.LJLILLLLZI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C187657Yb(Context context, List<String> dataList) {
        o.LJIIIZ(dataList, "dataList");
        this.LJLIL = context;
        this.LJLILLLLZI = dataList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C187667Yc c187667Yc, int i) {
        Drawable background;
        TuxTextView tuxTextView;
        C187667Yc holder = c187667Yc;
        o.LJIIIZ(holder, "holder");
        List<String> list = this.LJLILLLLZI;
        if (list != null && i >= 0 && i < list.size() && (tuxTextView = holder.LJLIL) != null) {
            tuxTextView.setText((CharSequence) ListProtector.get(list, i));
        }
        if (i == this.LJLJI) {
            TuxTextView tuxTextView2 = holder.LJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.go);
            }
            TuxTextView tuxTextView3 = holder.LJLIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setBackgroundResource(R.drawable.c4k);
            }
            TuxTextView tuxTextView4 = holder.LJLIL;
            if (tuxTextView4 != null && (background = tuxTextView4.getBackground()) != null) {
                background.setAlpha(20);
            }
        } else {
            TuxTextView tuxTextView5 = holder.LJLIL;
            if (tuxTextView5 != null) {
                tuxTextView5.setTextColorRes(R.attr.gx);
            }
            TuxTextView tuxTextView6 = holder.LJLIL;
            if (tuxTextView6 != null) {
                tuxTextView6.setBackgroundResource(R.drawable.c4j);
            }
        }
        TuxTextView tuxTextView7 = holder.LJLIL;
        if (tuxTextView7 != null) {
            C16880lQ.LJJJJI(tuxTextView7, new ACListenerS38S0200000_3(this, holder, 85));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C187667Yc com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C187667Yc c187667Yc = new C187667Yc(AnonymousClass030.LIZLLL(this.LJLIL, R.layout.dsh, parent, false, "from(context).inflate(R.…topic_tag, parent, false)"));
        C0AX.LIZ(parent, c187667Yc.itemView, R.id.lj7);
        View view = c187667Yc.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c187667Yc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C187667Yc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c187667Yc.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c187667Yc.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C187667Yc.class.getName();
        return c187667Yc;
    }
}
