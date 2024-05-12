package X;

import Y.ACListenerS20S0101000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.4mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119494mX extends AbstractC029409q<C119504mY> {
    public final List<String> LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C119494mX(AqS180S0100000_14 aqS180S0100000_14, List colorList) {
        o.LJIIIZ(colorList, "colorList");
        this.LJLIL = colorList;
        this.LJLILLLLZI = aqS180S0100000_14;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C119504mY c119504mY, int i) {
        boolean z;
        C119504mY holder = c119504mY;
        o.LJIIIZ(holder, "holder");
        String color = (String) ListProtector.get(this.LJLIL, i);
        if (i == this.LJLJI) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIZ(color, "color");
        holder.LJLILLLLZI.setPaintColor(ColorProtector.parseColor(color));
        holder.LJLILLLLZI.setNeedRing(z);
        holder.LJLILLLLZI.invalidate();
        holder.LJLILLLLZI.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS20S0101000_1(this, i, 2)));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C119504mY com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ayw, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C119504mY c119504mY = new C119504mY(view);
        C0AX.LIZ(viewGroup, c119504mY.itemView, R.id.lj7);
        View view2 = c119504mY.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c119504mY.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C119504mY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c119504mY.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c119504mY.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C119504mY.class.getName();
        return c119504mY;
    }
}
