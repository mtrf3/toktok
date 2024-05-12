package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1oG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C44121oG extends C36841cW {
    public final InterfaceC88472Yns<Long, Integer> LJLLI;
    public final C47121t6 LJLLILLLL;
    public final C47121t6 LJLLJ;
    public final LiveIconView LJLLL;

    public void Q(C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
    }

    public final void T(AnonymousClass010 addStatus) {
        C279917z c279917z;
        Long valueOf;
        o.LJIIIZ(addStatus, "addStatus");
        int i = C260110j.LIZIZ[addStatus.ordinal()];
        if (i != 1) {
            int i2 = 0;
            if (i != 2) {
                if (i != 3 || (c279917z = this.LJLILLLLZI) == null || (valueOf = Long.valueOf(c279917z.LIZ)) == null) {
                    return;
                }
                Integer invoke = this.LJLLI.invoke(valueOf);
                if (invoke != null) {
                    i2 = invoke.intValue();
                }
                U(i2);
                return;
            }
            C47121t6 c47121t6 = this.LJLLJ;
            if (c47121t6 == null) {
                return;
            }
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.jvi));
            c47121t6.setSelected(false);
            return;
        }
        C47121t6 c47121t62 = this.LJLLJ;
        if (c47121t62 == null) {
            return;
        }
        c47121t62.setText(C15380j0.LJIILJJIL(R.string.jvj));
        c47121t62.setSelected(true);
    }

    public final void U(int i) {
        AnonymousClass010 anonymousClass010;
        C279917z c279917z = this.LJLILLLLZI;
        if (c279917z != null) {
            anonymousClass010 = c279917z.LJIIJJI;
        } else {
            anonymousClass010 = null;
        }
        if (anonymousClass010 == AnonymousClass010.ADDING) {
            C47121t6 c47121t6 = this.LJLLJ;
            if (c47121t6 != null && !c47121t6.isSelected()) {
                this.LJLLJ.setSelected(true);
            }
            C47121t6 c47121t62 = this.LJLLJ;
            if (c47121t62 == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append('%');
            c47121t62.setText(X1D.LIZIZ(LIZ));
        }
    }

    public final void V(boolean z) {
        if (z) {
            C47121t6 c47121t6 = this.LJLLILLLL;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.jw_));
                c47121t6.setSelected(true);
                return;
            }
            return;
        }
        C47121t6 c47121t62 = this.LJLLILLLL;
        if (c47121t62 == null) {
            return;
        }
        c47121t62.setText(C15380j0.LJIILJJIL(R.string.jw9));
        c47121t62.setSelected(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44121oG(int i, View view, InterfaceC88472Yns<? super Long, Integer> interfaceC88472Yns) {
        super(i, view);
        this.LJLLI = interfaceC88472Yns;
        this.LJLLILLLL = (C47121t6) view.findViewById(R.id.fex);
        this.LJLLJ = (C47121t6) view.findViewById(R.id.fep);
        this.LJLLL = (LiveIconView) view.findViewById(R.id.fet);
    }

    @Override // X.C36841cW
    public void M(C279917z songInfo, int i, EnumC24230xH payload) {
        o.LJIIIZ(songInfo, "songInfo");
        o.LJIIIZ(payload, "payload");
        super.M(songInfo, i, payload);
        switch (C260110j.LIZ[payload.ordinal()]) {
            case 1:
                if (this.LJLIL == 1) {
                    LiveIconView liveIconView = this.LJLLL;
                    if (liveIconView != null) {
                        if (songInfo.LJIIJ) {
                            liveIconView.setIconAttr(R.attr.aq4);
                        } else {
                            liveIconView.setIconAttr(R.attr.aq3);
                        }
                        liveIconView.setVisibility(0);
                    }
                    C29306Beo.LJJLJLI(this.LJLLJ);
                    T(songInfo.LJIIJJI);
                } else {
                    C29306Beo.LJI(this.LJLLL);
                    C29306Beo.LJI(this.LJLLJ);
                    C47121t6 c47121t6 = this.LJLLILLLL;
                    if (c47121t6 != null) {
                        c47121t6.setVisibility(0);
                        V(songInfo.LJIIL);
                    }
                }
                C47121t6 c47121t62 = this.LJLLJ;
                if (c47121t62 != null) {
                    C29306Beo.LJJJLL(c47121t62, 500L, new IDqS416S0100000(this, 331));
                }
                C47121t6 c47121t63 = this.LJLLILLLL;
                if (c47121t63 != null) {
                    C29306Beo.LJJJLL(c47121t63, 500L, new IDqS416S0100000(this, 332));
                }
                LiveIconView liveIconView2 = this.LJLLL;
                if (liveIconView2 != null) {
                    C29306Beo.LJJJLL(liveIconView2, 500L, new IDqS416S0100000(this, 333));
                }
                Q(songInfo);
                return;
            case 2:
                if (songInfo.LJIIJ) {
                    LiveIconView liveIconView3 = this.LJLLL;
                    if (liveIconView3 == null) {
                        return;
                    }
                    liveIconView3.setIconAttr(R.attr.aq4);
                    return;
                }
                LiveIconView liveIconView4 = this.LJLLL;
                if (liveIconView4 == null) {
                    return;
                }
                liveIconView4.setIconAttr(R.attr.aq3);
                return;
            case 3:
                C47121t6 c47121t64 = this.LJLLJ;
                if (c47121t64 == null) {
                    return;
                }
                c47121t64.setText("0%");
                c47121t64.setSelected(true);
                return;
            case 4:
            case 5:
                T(songInfo.LJIIJJI);
                return;
            case 6:
                V(songInfo.LJIIL);
                return;
            default:
                return;
        }
    }
}
