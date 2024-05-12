package X;

import Y.ACListenerS28S0101000_10;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OP6 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;
    public final List<OP3> LJLILLLLZI = new ArrayList();
    public int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public OP6(AqS176S0100000_10 aqS176S0100000_10) {
        int i;
        this.LJLIL = aqS176S0100000_10;
        try {
            String LIZIZ = C9X3.LIZ.LIZIZ("tns_filter_keyword_count", CardStruct.IStatusCode.DEFAULT);
            o.LJIIIIZZ(LIZIZ, "instance().get(\"tns_filter_keyword_count\", \"0\")");
            i = CastIntegerProtector.parseInt(LIZIZ);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        this.LJLJJI = i;
        this.LJLJJL = OP4.LIZ();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        OP8 op8;
        o.LJIIIZ(holder, "holder");
        OP7 op7 = (OP7) holder;
        OP3 hashtag = (OP3) ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIZ(hashtag, "hashtag");
        op7.LJLIL.setText(hashtag.LIZ);
        C16880lQ.LJJJJI(op7.LJLIL, new ACListenerS28S0101000_10(i, op7, 2));
        if (hashtag.LIZIZ) {
            op8 = OP8.SELECTED;
        } else if (!op7.LJLILLLLZI.invoke().booleanValue()) {
            op8 = OP8.CANT_SELECT;
        } else {
            op8 = OP8.UNSELECTED;
        }
        op7.LJLJJI = op8;
        op7.L();
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.agm, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        OP7 op7 = new OP7((TuxTextView) LLLLIILL, new AqS160S0100000_10(this, 446), new AqS176S0100000_10(this, 132));
        C0AX.LIZ(parent, op7.itemView, R.id.lj7);
        View view = op7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (op7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(OP7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) op7.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(op7.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = OP7.class.getName();
        return op7;
    }
}
