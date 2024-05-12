package X;

import Y.IDTListenerS110S0100000;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30051Fx extends AbstractC029409q<C30041Fw> {
    public final List<C0J0> LJLIL;
    public boolean LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final int LJLJJI = R.layout.cys;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C46781sY.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C46771sX.LJLIL);

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C30041Fw c30041Fw, int i) {
        boolean z;
        C30041Fw holder = c30041Fw;
        o.LJIIIZ(holder, "holder");
        final C0J0 c0j0 = (C0J0) ListProtector.get(this.LJLIL, i);
        C47121t6 c47121t6 = holder.LJLIL;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILJJIL(c0j0.LIZ));
        }
        Integer num = c0j0.LIZLLL;
        if (num != null) {
            int intValue = num.intValue();
            C47121t6 c47121t62 = holder.LJLJJI;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(intValue));
            }
            C47121t6 c47121t63 = holder.LJLJJI;
            if (c47121t63 != null) {
                C87277YNd.LJJIJ(c47121t63);
            }
        }
        if (c0j0.LJ) {
            View view = holder.LJLJJL;
            if (view != null) {
                C87277YNd.LJJIJ(view);
            }
            C29306Beo.LJJJJJL(C87277YNd.LJIIJJI(13), holder.itemView);
        }
        C41071jL c41071jL = holder.LJLILLLLZI;
        if (c41071jL != null) {
            c41071jL.setOnCheckedChangeListener(null);
            c41071jL.setOnTouchListener(null);
            Boolean LIZJ = c0j0.LIZIZ.LIZJ();
            o.LJIIIIZZ(LIZJ, "messageType.key.value");
            if (LIZJ.booleanValue() && this.LJLILLLLZI) {
                z = true;
            } else {
                z = false;
            }
            c41071jL.setChecked(z);
            if (this.LJLILLLLZI) {
                c41071jL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.0J2
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        C0J0.this.LIZIZ.LIZ(Boolean.valueOf(z2));
                        BZI LIZ = C28787BRn.LIZ(C0J0.this.LIZJ);
                        LIZ.LJIJJ(this.LJLJJLL.getValue(), "anchor_id");
                        LIZ.LJIJJ("screen_share", "live_type");
                        LIZ.LJIJJ(Long.valueOf(((Number) this.LJLJJL.getValue()).longValue()), "room_id");
                        LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "to_status");
                        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C40210FqI.LJ(C15380j0.LIZLLL()))) ? 1 : 0), "overlay_permission");
                        LIZ.LJIJJ("live_take_detail", "event_page");
                        LIZ.LJIJJ(C0J0.this.LJFF, "tab_name");
                        LIZ.LJJIIJZLJL();
                    }
                });
            } else {
                c41071jL.setOnTouchListener(new IDTListenerS110S0100000(this, 1));
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C30041Fw com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), this.LJLJJI, parent, false);
        o.LJIIIIZZ(view, "view");
        C30041Fw c30041Fw = new C30041Fw(view);
        C0AX.LIZ(parent, c30041Fw.itemView, R.id.lj7);
        View view2 = c30041Fw.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c30041Fw.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C30041Fw.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c30041Fw.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c30041Fw.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C30041Fw.class.getName();
        return c30041Fw;
    }

    public C30051Fx(List list, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = list;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC65784Pro;
    }
}
