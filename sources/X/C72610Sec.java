package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS46S0200000_12;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sec, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72610Sec extends AbstractC029409q<C72611Sed> {
    public final InterfaceC72613Sef LJLIL;
    public List<RTR> LJLILLLLZI;
    public final boolean LJLJI;
    public boolean LJLJJI;
    public Integer LJLJJL;

    public C72610Sec() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJLLLLLL() {
        /*
            r2 = this;
            X.Kv4 r0 = X.C53246Kv4.LIZ
            r0.getClass()
            boolean r0 = X.C53246Kv4.LIZIZ
            if (r0 == 0) goto Ld
            boolean r0 = r2.LJLJJI
            if (r0 != 0) goto L16
        Ld:
            X.Kv3 r0 = X.C53245Kv3.LIZ
            r0.getClass()
            boolean r0 = X.C53245Kv3.LIZIZ
            if (r0 == 0) goto L1f
        L16:
            r1 = 3
        L17:
            boolean r0 = r2.LJLJI
            if (r0 == 0) goto L1c
        L1b:
            return r1
        L1c:
            int r1 = r1 + (-2)
            goto L1b
        L1f:
            r1 = 2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72610Sec.LJLLLLLL():int");
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int size;
        List<RTR> list = this.LJLILLLLZI;
        if (list == null) {
            size = 20;
        } else {
            o.LJI(list);
            size = list.size();
        }
        return LJLLLLLL() + size;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < 2 && this.LJLJI) {
            return 0;
        }
        if (i != 2 ? i == 0 : this.LJLJI) {
            C53246Kv4.LIZ.getClass();
            if (!C53246Kv4.LIZIZ || !this.LJLJJI) {
                C53245Kv3.LIZ.getClass();
                if (!C53245Kv3.LIZIZ) {
                    if (o.LJ(C72604SeW.LIZ, "live_take_page") && C00F.LIZ(31744, 0, "live_navi_avatar_auto_creation", true) == 1) {
                        return 3;
                    }
                } else {
                    return 3;
                }
            } else {
                return 3;
            }
        }
        return 1;
    }

    public C72610Sec(InterfaceC72613Sef eventHandler, boolean z) {
        o.LJIIIZ(eventHandler, "eventHandler");
        this.LJLIL = eventHandler;
        this.LJLILLLLZI = null;
        this.LJLJI = z;
        this.LJLJJI = true;
        this.LJLJJL = null;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C72611Sed c72611Sed, int i) {
        RTR rtr;
        Drawable LIZIZ;
        C72611Sed holder = c72611Sed;
        o.LJIIIZ(holder, "holder");
        boolean z = true;
        if (getItemViewType(i) == 1) {
            List<RTR> list = this.LJLILLLLZI;
            if (list != null && (rtr = (RTR) ListProtector.get(list, i - LJLLLLLL())) != null) {
                InterfaceC72613Sef eventHandler = this.LJLIL;
                int LIZ = rtr.LIZ();
                Integer num = this.LJLJJL;
                if (num == null || LIZ != num.intValue()) {
                    z = false;
                }
                o.LJIIIZ(eventHandler, "eventHandler");
                View view = holder.itemView;
                if (z) {
                    LIZIZ = C04270Et.LIZIZ(view.getContext(), R.drawable.bz1);
                } else {
                    LIZIZ = C04270Et.LIZIZ(view.getContext(), R.drawable.bz0);
                }
                view.setBackground(LIZIZ);
                C16880lQ.LJIIJ(new ACListenerS46S0200000_12(eventHandler, rtr, 68), holder.itemView);
                W5F LJFF = W5U.LJFF(UriProtector.parse(rtr.LIZIZ));
                LJFF.LIZJ = holder.LJLIL.getContext();
                LJFF.LJJIIJ = holder.LJLIL;
                C16880lQ.LLJJJ(LJFF);
                return;
            }
            return;
        }
        if (getItemViewType(i) != 3) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 208), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C72611Sed com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View LIZIZ;
        o.LJIIIZ(parent, "parent");
        if (i != 0) {
            if (i != 3) {
                LIZIZ = C1FL.LIZIZ(parent, R.layout.c7f, parent, false, "from(parent.context)\n   …list_item, parent, false)");
            } else {
                LIZIZ = C1FL.LIZIZ(parent, R.layout.c7a, parent, false, "from(parent.context)\n   …lse\n                    )");
            }
        } else {
            LIZIZ = C1FL.LIZIZ(parent, R.layout.c7e, parent, false, "from(parent.context)\n   …list_item, parent, false)");
        }
        C72611Sed c72611Sed = new C72611Sed(LIZIZ);
        C0AX.LIZ(parent, c72611Sed.itemView, R.id.lj7);
        View view = c72611Sed.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c72611Sed.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C72611Sed.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c72611Sed.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c72611Sed.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C72611Sed.class.getName();
        return c72611Sed;
    }
}
