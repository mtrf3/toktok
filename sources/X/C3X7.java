package X;

import Y.ACListenerS10S1101000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3X7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3X7 extends AbstractC029409q<C3X8> {
    public final Context LJLIL;
    public final InterfaceC88472Yns<String, C76800UCe> LJLILLLLZI;
    public List<OSZ<Integer, Boolean>> LJLJI;
    public final List<String> LJLJJI;
    public long LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    public C3X7(Context context, AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL = context;
        this.LJLILLLLZI = aqS173S0100000_7;
        Integer valueOf = Integer.valueOf(R.string.cnh);
        Boolean bool = Boolean.FALSE;
        this.LJLJI = C47261Igj.LJJIJIIJI(new OSZ(valueOf, bool), new OSZ(Integer.valueOf(R.string.cni), bool), new OSZ(Integer.valueOf(R.string.cnj), bool), new OSZ(Integer.valueOf(R.string.cnk), bool));
        this.LJLJJI = C47261Igj.LJJIJIIJI("This is harmful/unsafe", "This isn't helpful", "This isn't true", "Other");
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C3X8 c3x8, int i) {
        String str;
        C3X8 holder = c3x8;
        o.LJIIIZ(holder, "holder");
        Context context = this.LJLIL;
        if (context != null) {
            str = context.getString(((Number) ((OSZ) ListProtector.get(this.LJLJI, i)).getFirst()).intValue());
        } else {
            str = null;
        }
        String str2 = (String) ListProtector.get(this.LJLJJI, i);
        Object second = ((OSZ) ListProtector.get(this.LJLJI, i)).getSecond();
        TuxTextView tuxTextView = holder.LJLJI;
        tuxTextView.setText(str);
        tuxTextView.setSelected(o.LJ(second, Boolean.TRUE));
        C16880lQ.LJJJJI(holder.LJLJI, new ACListenerS10S1101000_1(holder, str2, i, 3));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C3X8 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.chg, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C3X8 c3x8 = new C3X8(view, new AqS183S0100000_1(this, 93));
        C0AX.LIZ(viewGroup, c3x8.itemView, R.id.lj7);
        View view2 = c3x8.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c3x8.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C3X8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c3x8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c3x8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C3X8.class.getName();
        return c3x8;
    }
}
