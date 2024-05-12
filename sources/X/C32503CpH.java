package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.CpH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32503CpH extends AbstractC029409q<AbstractC32520CpY> implements InterfaceC32530Cpi {
    public final LinkedList<C32522Cpa> LJLIL = new LinkedList<>();
    public long LJLILLLLZI;
    public long LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.InterfaceC32530Cpi
    public final void LJLI(long j) {
        if (j == this.LJLJI) {
            return;
        }
        Iterator<C32522Cpa> it = this.LJLIL.iterator();
        int i = -1;
        boolean z = false;
        C32522Cpa c32522Cpa = null;
        C32522Cpa c32522Cpa2 = null;
        int i2 = -1;
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = i3 + 1;
            C32522Cpa next = it.next();
            if (next.LIZJ) {
                next.LIZJ = false;
                i2 = i3;
                i3 = i4;
                c32522Cpa = next;
            } else {
                Long l = next.LIZ.colorId;
                if (l == null || j != l.longValue()) {
                    i3 = i4;
                } else {
                    next.LIZJ = true;
                    i = i3;
                    i3 = i4;
                    c32522Cpa2 = next;
                }
            }
        }
        this.LJLJI = j;
        C73943T0h LIZ = C73943T0h.LIZ();
        Long valueOf = Long.valueOf(j);
        if (i > i2) {
            z = true;
        }
        LIZ.LIZIZ(new C32525Cpd(valueOf, z));
        Long valueOf2 = Long.valueOf(this.LJLILLLLZI);
        Long valueOf3 = Long.valueOf(j);
        BZI LIZ2 = C28787BRn.LIZ("gift_color_tab_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(valueOf3, "color_id");
        LIZ2.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        LIZ2.LJIJJ(valueOf2, "gift_id");
        LIZ2.LJIJJ(C32129CjF.LIZ.LIZ, "guide_from");
        LIZ2.LJJIIJZLJL();
        notifyItemChanged(i2, c32522Cpa);
        notifyItemChanged(i, c32522Cpa2);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return this.LJLIL.get(i).LIZIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC32520CpY abstractC32520CpY, int i) {
        AbstractC32520CpY holder = abstractC32520CpY;
        o.LJIIIZ(holder, "holder");
        C32522Cpa c32522Cpa = this.LJLIL.get(i);
        o.LJIIIIZZ(c32522Cpa, "mData[position]");
        holder.L(c32522Cpa, this);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC32520CpY com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC32520CpY c32531Cpj;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            View view = C28289B8j.LIZ(parent, R.layout.db2, parent, false);
            o.LJIIIIZZ(view, "view");
            c32531Cpj = new C32526Cpe(view);
        } else {
            View view2 = C28289B8j.LIZ(parent, R.layout.db1, parent, false);
            o.LJIIIIZZ(view2, "view");
            c32531Cpj = new C32531Cpj(view2);
        }
        C0AX.LIZ(parent, c32531Cpj.itemView, R.id.lj7);
        View view3 = c32531Cpj.itemView;
        if (view3 != null) {
            view3.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c32531Cpj.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c32531Cpj.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c32531Cpj.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c32531Cpj.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c32531Cpj.getClass().getName();
        return c32531Cpj;
    }
}
