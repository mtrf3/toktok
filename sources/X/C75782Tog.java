package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tog, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75782Tog implements InterfaceC76125TuD {
    public final CopyOnWriteArrayList<AbstractC75784Toi> LJLIL;
    public final ConcurrentHashMap<String, AbstractC75784Toi> LJLILLLLZI;
    public final HashMap<String, Boolean> LJLJI;
    public final HashMap<String, Integer> LJLJJI;
    public final HashMap<String, Integer> LJLJJL;
    public InterfaceC75579TlP LJLJJLL;
    public int LJLJL;
    public final java.util.Map<String, LinkPlayerInfo> LJLJLJ;
    public long LJLJLLL;
    public String LJLL;
    public C75794Tos LJLLI;
    public FrameLayout LJLLILLLL;
    public C74994Tby LJLLJ;
    public final C62822Ol8 LJLLL;
    public EnumC74991Tbv LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public Integer LJZL;

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    public final boolean LIZ() {
        Boolean bool;
        C74994Tby c74994Tby = this.LJLLJ;
        Boolean bool2 = null;
        if (c74994Tby != null) {
            bool = Boolean.valueOf(c74994Tby.LJFF());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C74994Tby c74994Tby2 = this.LJLLJ;
            if (c74994Tby2 != null) {
                String str = c74994Tby2.LIZJ;
                if (str == null) {
                    str = "";
                }
                bool2 = Boolean.valueOf(c74994Tby2.LJI(str));
            }
            if (C29306Beo.LJIILLIIL(bool2)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZIZ() {
        View view = this.LJZ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLLLLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJZI;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.LJLZ;
        if (view4 == null) {
            return;
        }
        view4.setVisibility(8);
    }

    @Override // X.InterfaceC76125TuD
    public final void release() {
        InterfaceC75579TlP interfaceC75579TlP = this.LJLJJLL;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.A9(true);
        }
        this.LJLJJLL = null;
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 604));
    }

    public C75782Tog(int i) {
        CopyOnWriteArrayList<AbstractC75784Toi> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, AbstractC75784Toi> concurrentHashMap = new ConcurrentHashMap<>();
        HashMap<String, Boolean> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        this.LJLIL = copyOnWriteArrayList;
        this.LJLILLLLZI = concurrentHashMap;
        this.LJLJI = hashMap;
        this.LJLJJI = hashMap2;
        this.LJLJJL = hashMap3;
        this.LJLJJLL = null;
        this.LJLJL = 1;
        this.LJLJLJ = new LinkedHashMap();
        this.LJLLL = C221108m2.LIZIZ(C75788Tom.LJLIL);
        this.LJLLLL = EnumC74991Tbv.NORMAL;
    }

    public static final void LIZLLL(String str) {
        C0NB.LIZIZ("MultiGuestV3FeedMaskWindowHandler", str);
    }

    public final void LJ(InterfaceC75787Tol interfaceC75787Tol) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        FrameLayout.LayoutParams layoutParams5;
        Integer num = this.LJZL;
        if (num == null || num.intValue() != 4 || (frameLayout = this.LJLLILLLL) == null) {
            return;
        }
        Rect containerActualRange = interfaceC75787Tol.getContainerActualRange();
        if (frameLayout.getWidth() > containerActualRange.right - containerActualRange.left) {
            View view = this.LJZ;
            ViewGroup.LayoutParams layoutParams6 = null;
            if (view != null) {
                layoutParams3 = view.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams5 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                layoutParams5.topMargin = containerActualRange.top;
                layoutParams5.height = containerActualRange.height();
                layoutParams5.width = containerActualRange.left;
                View view2 = this.LJZ;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams5);
                }
                View view3 = this.LJZ;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
            View view4 = this.LJZI;
            if (view4 != null) {
                layoutParams6 = view4.getLayoutParams();
            }
            if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                layoutParams4.topMargin = containerActualRange.top;
                layoutParams4.height = containerActualRange.height();
                layoutParams4.width = frameLayout.getWidth() - containerActualRange.right;
                View view5 = this.LJZI;
                if (view5 != null) {
                    view5.setLayoutParams(layoutParams4);
                }
                View view6 = this.LJZI;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
            }
        }
        View view7 = this.LJLLLLLL;
        if (view7 != null && (layoutParams2 = view7.getLayoutParams()) != null) {
            layoutParams2.height = containerActualRange.top;
            View view8 = this.LJLLLLLL;
            if (view8 != null) {
                view8.setLayoutParams(layoutParams2);
            }
            View view9 = this.LJLLLLLL;
            if (view9 != null) {
                view9.setVisibility(0);
            }
        }
        View view10 = this.LJLZ;
        if (view10 != null && (layoutParams = view10.getLayoutParams()) != null) {
            layoutParams.height = frameLayout.getHeight() - containerActualRange.bottom;
            View view11 = this.LJLZ;
            if (view11 != null) {
                view11.setLayoutParams(layoutParams);
            }
            View view12 = this.LJLZ;
            if (view12 != null) {
                view12.setVisibility(0);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("empty view show: params=");
        LIZ.append(containerActualRange);
        LIZ.append(' ');
        LIZ.append(frameLayout.getWidth());
        LIZ.append(' ');
        LIZ.append(frameLayout.getHeight());
        LIZ.append(' ');
        LIZ.append(C81185Vtd.LIZLLL());
        LIZ.append(' ');
        LIZ.append(C81185Vtd.LIZIZ());
        LIZLLL(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        Boolean bool;
        o.LJIIIZ(layout, "layout");
        if (layout.getLayoutName() == null) {
            return;
        }
        String layoutName = layout.getLayoutName();
        if (layoutName != null) {
            bool = Boolean.valueOf(C45804HyK.LJJJJIZL(layoutName));
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            return;
        }
        String layoutName2 = layout.getLayoutName();
        if (layoutName2 == null) {
            layoutName2 = EnumC74991Tbv.NORMAL.name();
        }
        this.LJLLLL = EnumC74991Tbv.valueOf(layoutName2);
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x045a  */
    @Override // X.InterfaceC76125TuD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(com.bytedance.android.livesdk.sei.SeiAppData r21) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75782Tog.LJJJJZ(com.bytedance.android.livesdk.sei.SeiAppData):void");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76125TuD
    public final void LJJLIIIJJI(InterfaceC75804Tp2 interfaceC75804Tp2) {
        SeiAppData seiAppData;
        if ((interfaceC75804Tp2 instanceof SeiAppData) && (seiAppData = (SeiAppData) interfaceC75804Tp2) != null) {
            LJJJJZ(seiAppData);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        Boolean bool;
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutSwitch, layout ");
        LIZ.append(layout);
        LIZLLL(X1D.LIZIZ(LIZ));
        if (layout.getLayoutName() == null) {
            return;
        }
        String layoutName = layout.getLayoutName();
        if (layoutName != null) {
            bool = Boolean.valueOf(C45804HyK.LJJJJIZL(layoutName));
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            return;
        }
        String layoutName2 = layout.getLayoutName();
        if (layoutName2 == null) {
            layoutName2 = EnumC74991Tbv.NORMAL.name();
        }
        EnumC74991Tbv valueOf = EnumC74991Tbv.valueOf(layoutName2);
        this.LJLLLL = valueOf;
        switch (C75268TgO.LIZ[valueOf.ordinal()]) {
            case 1:
                LJ(layout);
                return;
            case 2:
                LJ(layout);
                return;
            case 3:
                LIZIZ();
                return;
            case 4:
                if (this.LJLLILLLL == null) {
                    return;
                }
                if (layout.getAllLayoutWindows().size() == 1) {
                    LIZIZ();
                    return;
                } else {
                    LJ(layout);
                    return;
                }
            case 5:
            case 6:
            case 7:
                LJ(layout);
                return;
            default:
                this.LJLLLL = EnumC74991Tbv.NORMAL;
                return;
        }
    }

    @Override // X.InterfaceC76125TuD
    public final void LLILLL(FrameLayout frameLayout, OSZ<Integer, Integer> osz) {
        Context context;
        this.LJLLILLLL = frameLayout;
        if (this.LJZ != null && this.LJZI != null && this.LJLLLLLL != null && this.LJLZ != null) {
            return;
        }
        InterfaceC75579TlP interfaceC75579TlP = this.LJLJJLL;
        ViewParent viewParent = null;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.n1(frameLayout, null, osz);
        }
        C75794Tos c75794Tos = this.LJLLI;
        if (c75794Tos != null) {
            context = c75794Tos.LIZJ;
        } else {
            context = null;
        }
        FrameLayout frameLayout2 = this.LJLLILLLL;
        Integer num = this.LJZL;
        if (num == null || 4 != num.intValue()) {
            return;
        }
        if ((context == null && (frameLayout2 == null || (context = frameLayout2.getContext()) == null)) || frameLayout2 == null) {
            return;
        }
        View view = this.LJZ;
        if (view != null) {
            viewParent = view.getParent();
        }
        if (o.LJ(viewParent, frameLayout2)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.gravity = 8388659;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 0);
        layoutParams2.gravity = 48;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
        layoutParams3.gravity = 8388661;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 0);
        layoutParams4.gravity = 80;
        View view2 = this.LJZ;
        if (view2 != null) {
            TV3.LJIIJJI(view2);
        }
        View view3 = new View(context);
        view3.setId(R.id.fp1);
        view3.setVisibility(8);
        view3.setBackgroundColor(-16777216);
        frameLayout2.addView(view3, layoutParams);
        this.LJZ = view3;
        View view4 = this.LJLLLLLL;
        if (view4 != null) {
            TV3.LJIIJJI(view4);
        }
        View view5 = new View(context);
        view5.setId(R.id.lfl);
        view5.setVisibility(8);
        view5.setBackgroundColor(-16777216);
        frameLayout2.addView(view5, layoutParams2);
        this.LJLLLLLL = view5;
        View view6 = this.LJZI;
        if (view6 != null) {
            TV3.LJIIJJI(view6);
        }
        View view7 = new View(context);
        view7.setId(R.id.j2n);
        view7.setVisibility(8);
        view7.setBackgroundColor(-16777216);
        frameLayout2.addView(view7, layoutParams3);
        this.LJZI = view7;
        View view8 = this.LJLZ;
        if (view8 != null) {
            TV3.LJIIJJI(view8);
        }
        View view9 = new View(context);
        view9.setId(R.id.aqf);
        view9.setVisibility(8);
        view9.setBackgroundColor(-16777216);
        frameLayout2.addView(view9, layoutParams4);
        this.LJLZ = view9;
    }

    public final void LIZJ(C75794Tos c75794Tos, InterfaceC75579TlP interfaceC75579TlP, C74994Tby audienceModel, InterfaceC32199CkN interfaceC32199CkN) {
        o.LJIIIZ(audienceModel, "audienceModel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, ");
        LIZ.append(c75794Tos);
        LIZLLL(X1D.LIZIZ(LIZ));
        this.LJLLI = c75794Tos;
        this.LJLJJLL = interfaceC75579TlP;
        this.LJLLJ = audienceModel;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        Object obj;
        List<LinkUser> LJFF;
        int i;
        List<LinkUser> LJFF2;
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowStateChange ");
        LIZ.append(window);
        LIZ.append(' ');
        LIZ.append(oldState);
        LIZ.append(' ');
        LIZ.append(newState);
        LIZLLL(X1D.LIZIZ(LIZ));
        int i2 = C75268TgO.LIZIZ[window.LJJIL().ordinal()];
        int i3 = 0;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                return;
            }
            AbstractC75784Toi abstractC75784Toi = null;
            if (c75786Tok != null && Boolean.valueOf(c75786Tok.LJLJI) != null && window.LJJ() != null) {
                String LJJ = window.LJJ();
                if (LJJ != null) {
                    this.LJLJI.put(LJJ, Boolean.valueOf(c75786Tok.LJLJI));
                }
                boolean z = c75786Tok.LJLJI;
                int i4 = c75786Tok.LJLJJI;
                boolean LIZ2 = LIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("showLinkMicWindow ");
                LIZ3.append(window);
                LIZ3.append(", ");
                LIZ3.append(z);
                LIZLLL(X1D.LIZIZ(LIZ3));
                CopyOnWriteArrayList<AbstractC75784Toi> copyOnWriteArrayList = this.LJLIL;
                ArrayList arrayList = new ArrayList();
                Iterator<AbstractC75784Toi> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    AbstractC75784Toi next = it.next();
                    if (next instanceof C75783Toh) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        C75783Toh c75783Toh = (C75783Toh) obj;
                        if (o.LJ(c75783Toh.LJI, window.LJJ()) && c75783Toh.LIZJ && o.LJ(c75783Toh.LIZIZ, window.LJJIJIL())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C75783Toh c75783Toh2 = (C75783Toh) obj;
                if (c75783Toh2 != null) {
                    if (c75783Toh2.LIZJ) {
                        c75783Toh2.LJII = (LinkPlayerInfo) ((LinkedHashMap) this.LJLJLJ).get(window.LJJ());
                        EnumC74991Tbv layoutName = this.LJLLLL;
                        o.LJIIIZ(layoutName, "layoutName");
                        c75783Toh2.LJIIIZ = layoutName;
                        c75783Toh2.LJIIIIZZ(0, this.LJLLLL, z);
                        c75783Toh2.LJII(i4);
                        InterfaceC75579TlP interfaceC75579TlP = this.LJLJJLL;
                        if (interfaceC75579TlP != null && (LJFF2 = interfaceC75579TlP.LJFF()) != null) {
                            i = LJFF2.size();
                        } else {
                            i = 0;
                        }
                        c75783Toh2.LJIIJJI(i, LIZ2);
                    }
                    LIZLLL("updateExistLinkMicWindow " + c75783Toh2.LJI);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                String LJJ2 = window.LJJ();
                if (LJJ2 == null) {
                    LJJ2 = "";
                }
                C75783Toh c75783Toh3 = new C75783Toh(LJJ2);
                window.LJJIJIL().removeAllViews();
                c75783Toh3.LJ(window.LJJIJIL());
                c75783Toh3.LJII = (LinkPlayerInfo) ((LinkedHashMap) this.LJLJLJ).get(window.LJJ());
                c75783Toh3.LJIIIIZZ = o.LJ(window.LJJ(), this.LJLL);
                EnumC74991Tbv layoutName2 = this.LJLLLL;
                o.LJIIIZ(layoutName2, "layoutName");
                c75783Toh3.LJIIIZ = layoutName2;
                c75783Toh3.LJIIIIZZ(this.LJLJL, this.LJLLLL, z);
                InterfaceC75579TlP interfaceC75579TlP2 = this.LJLJJLL;
                if (interfaceC75579TlP2 != null && (LJFF = interfaceC75579TlP2.LJFF()) != null) {
                    i3 = LJFF.size();
                }
                c75783Toh3.LJIIJJI(i3, LIZ2);
                c75783Toh3.LJII(i4);
                Iterator<AbstractC75784Toi> it3 = this.LJLIL.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    AbstractC75784Toi next2 = it3.next();
                    if (o.LJ(next2.LIZ(), window.LJJ())) {
                        abstractC75784Toi = next2;
                        break;
                    }
                }
                AbstractC75784Toi abstractC75784Toi2 = abstractC75784Toi;
                if (abstractC75784Toi2 != null) {
                    this.LJLIL.remove(abstractC75784Toi2);
                    this.LJLILLLLZI.remove(abstractC75784Toi2.LIZ());
                }
                this.LJLIL.add(c75783Toh3);
                String LJJ3 = window.LJJ();
                if (LJJ3 != null) {
                    this.LJLILLLLZI.put(LJJ3, c75783Toh3);
                }
                LIZLLL("create LinkMic window");
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("extra == null ");
            LIZ4.append(window);
            LIZ4.append(", do nothing.");
            LIZLLL(X1D.LIZIZ(LIZ4));
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("showEmpty mask condition = ");
        LIZ5.append(this.LJLJL);
        LIZLLL(X1D.LIZIZ(LIZ5));
        C75785Toj c75785Toj = new C75785Toj(0);
        window.LJJIJIL().removeAllViews();
        c75785Toj.LJ(window.LJJIJIL());
        if (this.LJLJL == 3) {
            c75785Toj.LJI();
        } else {
            c75785Toj.LJFF();
        }
        this.LJLIL.add(c75785Toj);
    }
}
