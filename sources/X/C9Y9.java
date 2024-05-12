package X;

import Y.ACListenerS39S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.Keyword;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9Y9, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Y9 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC88472Yns<Keyword, C76800UCe> LJLIL;
    public final InterfaceC88472Yns<Keyword, C76800UCe> LJLILLLLZI;
    public final List<Keyword> LJLJI = C47261Igj.LJJIJIL(new Keyword(null, null, 3, null));

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    public C9Y9(AqS170S0100000_4 aqS170S0100000_4, AqS170S0100000_4 aqS170S0100000_42) {
        this.LJLIL = aqS170S0100000_4;
        this.LJLILLLLZI = aqS170S0100000_42;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        C9YA c9ya;
        boolean z;
        o.LJIIIZ(holder, "holder");
        if (i == 0 || !(holder instanceof C9YA) || (c9ya = (C9YA) holder) == null) {
            return;
        }
        Keyword keyword = (Keyword) ListProtector.get(this.LJLJI, i);
        if (i < this.LJLJI.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIZ(keyword, "keyword");
        Object value = c9ya.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-keywordView>(...)");
        ((TextView) value).setText(keyword.text);
        String str = "";
        int i2 = 0;
        for (Integer num : keyword.scenes) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str);
                        LIZ.append(c9ya.itemView.getContext().getString(R.string.hmu));
                        str = X1D.LIZIZ(LIZ);
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(c9ya.itemView.getContext().getString(R.string.hmv));
                    str = X1D.LIZIZ(LIZ2);
                }
                if (i2 < keyword.scenes.size() - 1) {
                    str = i0.LJFF(str, ", ");
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Object value2 = c9ya.LJLJJI.getValue();
        o.LJIIIIZZ(value2, "<get-scenesView>(...)");
        ((TextView) value2).setText(c9ya.itemView.getContext().getString(R.string.hmw, str));
        Object value3 = c9ya.LJLJJL.getValue();
        o.LJIIIIZZ(value3, "<get-deleteBtn>(...)");
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(c9ya, keyword, 74), (View) value3);
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(c9ya, keyword, 75), c9ya.itemView);
        if (z) {
            Object value4 = c9ya.LJLJJLL.getValue();
            o.LJIIIIZZ(value4, "<get-divider>(...)");
            ((View) value4).setVisibility(0);
        } else {
            Object value5 = c9ya.LJLJJLL.getValue();
            o.LJIIIIZZ(value5, "<get-divider>(...)");
            ((View) value5).setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        C9YA c9ya;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            C9YB c9yb = new C9YB(C1FL.LIZIZ(parent, R.layout.agc, parent, false, "from(parent.context)\n   …rd_header, parent, false)"));
            c9yb.LJLIL.setText(parent.getContext().getString(R.string.hmq));
            c9ya = c9yb;
        } else {
            c9ya = new C9YA(C1FL.LIZIZ(parent, R.layout.agd, parent, false, "from(parent.context)\n   …word_item, parent, false)"), this.LJLIL, this.LJLILLLLZI);
        }
        C0AX.LIZ(parent, c9ya.itemView, R.id.lj7);
        View view = c9ya.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c9ya.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c9ya.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c9ya.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c9ya.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c9ya.getClass().getName();
        return c9ya;
    }
}
