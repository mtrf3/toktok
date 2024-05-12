package Y;

import X.C0C3;
import X.C1BC;
import X.C55960Lxk;
import X.C66822jm;
import X.C86904Y8u;
import X.InterfaceC86908Y8y;
import X.T6H;
import X.X1D;
import X.XW2;
import X.XZH;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;

/* loaded from: classes16.dex */
public class IDiS167S0200000_15 implements C0C3 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrollStateChanged$0(IDiS167S0200000_15 iDiS167S0200000_15, int i) {
    }

    public static final void onPageScrolled$1(IDiS167S0200000_15 iDiS167S0200000_15, int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            default:
                return;
        }
    }

    public static final void onPageScrollStateChanged$1(IDiS167S0200000_15 iDiS167S0200000_15, int i) {
        VerticalMusicView verticalMusicView = (VerticalMusicView) iDiS167S0200000_15.l0;
        int i2 = verticalMusicView.LLILLJJLI;
        verticalMusicView.LLILLIZIL = i2;
        verticalMusicView.LLILLJJLI = i;
        if ((i2 | 2) > 0 && i == 1) {
            ((XZH) iDiS167S0200000_15.l1).LJIILL.LJIIJJI(verticalMusicView.LLJJIJIIJIL.getStringValue());
        }
    }

    public static final void onPageSelected$0(IDiS167S0200000_15 iDiS167S0200000_15, int i) {
        boolean z;
        LinearLayout linearLayout = ((C86904Y8u) iDiS167S0200000_15.l1).LJLIL;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        View view = ((C86904Y8u) iDiS167S0200000_15.l1).LJLILLLLZI;
        int i2 = 0;
        if (view != null) {
            view.setSelected(false);
        }
        if (childAt != null) {
            childAt.setSelected(true);
            C86904Y8u c86904Y8u = (C86904Y8u) iDiS167S0200000_15.l1;
            c86904Y8u.LJLILLLLZI = childAt;
            C1BC c1bc = c86904Y8u.LJLJJLL;
            if (c1bc != null && (c1bc instanceof T6H)) {
                int LJJIIZ = ((T6H) c1bc).LJJIIZ(i);
                if (LJJIIZ == 17) {
                    C86904Y8u c86904Y8u2 = (C86904Y8u) iDiS167S0200000_15.l1;
                    if (c86904Y8u2.LJLLILLLL && (childAt instanceof C55960Lxk)) {
                        c86904Y8u2.LJLLILLLL = false;
                        IProfileMusicTabService LJIJJLI = ProfileMusicTabService.LJIJJLI();
                        if (LJIJJLI != null) {
                            LJIJJLI.LJIILJJIL();
                        }
                        ((C55960Lxk) childAt).LIZ();
                    }
                }
                C86904Y8u c86904Y8u3 = (C86904Y8u) iDiS167S0200000_15.l1;
                c86904Y8u3.LJLLJ = false;
                if (c86904Y8u3.LJLLLL && c86904Y8u3.LJLLL) {
                    z = true;
                } else {
                    z = false;
                }
                c86904Y8u3.LJLLL = z;
                c86904Y8u3.LJLLLL = false;
                if (LJJIIZ == 16 && (childAt instanceof C55960Lxk)) {
                    ((C55960Lxk) childAt).LIZ();
                    Keva keva = C66822jm.LIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("profile_tab_clicked_");
                    LIZ.append(((C86904Y8u) iDiS167S0200000_15.l1).LJLL.getUid());
                    keva.storeBoolean(X1D.LIZIZ(LIZ), true);
                }
            }
        }
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) iDiS167S0200000_15.l0;
        if (interfaceC86908Y8y != null) {
            C86904Y8u c86904Y8u4 = (C86904Y8u) iDiS167S0200000_15.l1;
            C1BC c1bc2 = c86904Y8u4.LJLJJLL;
            if (c1bc2 != null && c1bc2.getCount() > i) {
                if (c86904Y8u4.LJLJJL) {
                    C1BC c1bc3 = c86904Y8u4.LJLJJLL;
                    if (c1bc3 instanceof T6H) {
                        i2 = ((T6H) c1bc3).LJJIIZ(i);
                    }
                }
                i2 = (int) c86904Y8u4.LJLJJLL.LJJIIJ(i);
            }
            interfaceC86908Y8y.onSelect(i2);
        }
    }

    public static final void onPageSelected$1(IDiS167S0200000_15 iDiS167S0200000_15, int i) {
        VerticalMusicView verticalMusicView = (VerticalMusicView) iDiS167S0200000_15.l0;
        int i2 = verticalMusicView.LLILLJJLI;
        if (i2 != 0) {
            if (i2 != 2 || verticalMusicView.LLILLIZIL != 0) {
                if (i == XW2.TAB_AI.ordinal()) {
                    ((VerticalMusicView) iDiS167S0200000_15.l0).LJJIIJZLJL(true);
                } else if (i == XW2.TAB_COLLECT.ordinal()) {
                    ((VerticalMusicView) iDiS167S0200000_15.l0).LJJIII(true);
                } else {
                    if (i != XW2.TAB_RECENT.ordinal()) {
                        return;
                    }
                    ((VerticalMusicView) iDiS167S0200000_15.l0).LJJIIJ(true);
                }
            }
        }
    }

    public IDiS167S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public static final void onPageScrolled$0(IDiS167S0200000_15 iDiS167S0200000_15, int i, float f, int i2) {
        C86904Y8u c86904Y8u = (C86904Y8u) iDiS167S0200000_15.l1;
        c86904Y8u.LIZ(f, i, c86904Y8u.LJLJI);
    }
}
