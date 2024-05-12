package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tp7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75809Tp7 implements InterfaceC76125TuD {
    public final CopyOnWriteArrayList<AbstractC75784Toi> LJLIL;
    public final HashMap<String, Boolean> LJLILLLLZI;
    public final HashMap<String, Integer> LJLJI;
    public final HashMap<String, Integer> LJLJJI;
    public InterfaceC75579TlP LJLJJL;
    public C75794Tos LJLJJLL;
    public FrameLayout LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public Integer LJLLILLLL;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    @Override // X.InterfaceC76125TuD
    public final void release() {
        InterfaceC75579TlP interfaceC75579TlP = this.LJLJJL;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.A9(true);
        }
        this.LJLJJL = null;
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 375));
    }

    public C75809Tp7(int i) {
        CopyOnWriteArrayList<AbstractC75784Toi> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        new ConcurrentHashMap();
        HashMap<String, Boolean> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        this.LJLIL = copyOnWriteArrayList;
        this.LJLILLLLZI = hashMap;
        this.LJLJI = hashMap2;
        this.LJLJJI = hashMap3;
        this.LJLJJL = null;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76125TuD
    public final void LJJJJZ(SeiAppData data) {
        Integer num;
        Long LJJIZ;
        o.LJIIIZ(data, "data");
        SeiDsl seiDsl = data.dsl;
        if (seiDsl != null) {
            num = Integer.valueOf(seiDsl.scene);
        } else {
            num = null;
        }
        this.LJLLILLLL = num;
        String str = data.channelId;
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            LJJIZ.longValue();
        }
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
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        Boolean bool;
        Integer num;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        FrameLayout.LayoutParams layoutParams5;
        o.LJIIIZ(layout, "layout");
        if (layout.getLayoutName() == null) {
            return;
        }
        String layoutName = layout.getLayoutName();
        ViewGroup.LayoutParams layoutParams6 = null;
        if (layoutName != null) {
            bool = Boolean.valueOf(C45804HyK.LJJJJIZL(layoutName));
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool) || (num = this.LJLLILLLL) == null || num.intValue() != 2 || (frameLayout = this.LJLJL) == null) {
            return;
        }
        Rect containerActualRange = layout.getContainerActualRange();
        if (frameLayout.getWidth() > containerActualRange.right - containerActualRange.left) {
            View view = this.LJLL;
            if (view != null) {
                layoutParams3 = view.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams5 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                layoutParams5.topMargin = containerActualRange.top;
                layoutParams5.height = containerActualRange.height();
                layoutParams5.width = containerActualRange.left;
                View view2 = this.LJLL;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams5);
                }
                View view3 = this.LJLL;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
            View view4 = this.LJLLI;
            if (view4 != null) {
                layoutParams6 = view4.getLayoutParams();
            }
            if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                layoutParams4.topMargin = containerActualRange.top;
                layoutParams4.height = containerActualRange.height();
                layoutParams4.width = frameLayout.getWidth() - containerActualRange.right;
                View view5 = this.LJLLI;
                if (view5 != null) {
                    view5.setLayoutParams(layoutParams4);
                }
                View view6 = this.LJLLI;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
            }
        }
        View view7 = this.LJLJLJ;
        if (view7 != null && (layoutParams2 = view7.getLayoutParams()) != null) {
            layoutParams2.height = containerActualRange.top;
            View view8 = this.LJLJLJ;
            if (view8 != null) {
                view8.setLayoutParams(layoutParams2);
            }
            View view9 = this.LJLJLJ;
            if (view9 != null) {
                view9.setVisibility(0);
            }
        }
        View view10 = this.LJLJLLL;
        if (view10 == null || (layoutParams = view10.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = frameLayout.getHeight() - containerActualRange.bottom;
        View view11 = this.LJLJLLL;
        if (view11 != null) {
            view11.setLayoutParams(layoutParams);
        }
        View view12 = this.LJLJLLL;
        if (view12 == null) {
            return;
        }
        view12.setVisibility(0);
    }

    @Override // X.InterfaceC76125TuD
    public final void LLILLL(FrameLayout frameLayout, OSZ<Integer, Integer> osz) {
        Integer num;
        Context context;
        if (!o.LJ(this.LJLJL, frameLayout)) {
            this.LJLJL = frameLayout;
        }
        View view = this.LJLJLJ;
        if (view != null && this.LJLJLLL != null) {
            view.bringToFront();
            View view2 = this.LJLJLLL;
            if (view2 != null) {
                view2.bringToFront();
            }
        }
        if (this.LJLL != null || this.LJLLI != null || this.LJLJLJ != null || this.LJLJLLL != null || (num = this.LJLLILLLL) == null || num.intValue() != 2) {
            return;
        }
        InterfaceC75579TlP interfaceC75579TlP = this.LJLJJL;
        ViewParent viewParent = null;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.n1(frameLayout, null, osz);
        }
        C75794Tos c75794Tos = this.LJLJJLL;
        if (c75794Tos != null) {
            context = c75794Tos.LIZJ;
        } else {
            context = null;
        }
        FrameLayout frameLayout2 = this.LJLJL;
        if ((context == null && (frameLayout2 == null || (context = frameLayout2.getContext()) == null)) || frameLayout2 == null) {
            return;
        }
        View view3 = this.LJLL;
        if (view3 != null) {
            viewParent = view3.getParent();
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
        View view4 = this.LJLJLJ;
        if (view4 != null) {
            TV3.LJIIJJI(view4);
        }
        View view5 = new View(context);
        view5.setId(R.id.lfm);
        view5.setVisibility(8);
        view5.setBackgroundColor(-16777216);
        frameLayout2.addView(view5, layoutParams2);
        this.LJLJLJ = view5;
        View view6 = this.LJLL;
        if (view6 != null) {
            TV3.LJIIJJI(view6);
        }
        View view7 = new View(context);
        view7.setId(R.id.fp2);
        view7.setVisibility(8);
        view7.setBackgroundColor(-16777216);
        frameLayout2.addView(view7, layoutParams);
        this.LJLL = view7;
        View view8 = this.LJLJLLL;
        if (view8 != null) {
            TV3.LJIIJJI(view8);
        }
        View view9 = new View(context);
        view9.setId(R.id.aqg);
        view9.setVisibility(8);
        view9.setBackgroundColor(-16777216);
        frameLayout2.addView(view9, layoutParams4);
        this.LJLJLLL = view9;
        View view10 = this.LJLLI;
        if (view10 != null) {
            TV3.LJIIJJI(view10);
        }
        View view11 = new View(context);
        view11.setId(R.id.j2o);
        view11.setVisibility(8);
        view11.setBackgroundColor(-16777216);
        frameLayout2.addView(view11, layoutParams3);
        this.LJLLI = view11;
    }

    public final void LIZ(C75794Tos c75794Tos, InterfaceC75579TlP interfaceC75579TlP, C74994Tby audienceModel, InterfaceC32199CkN interfaceC32199CkN) {
        o.LJIIIZ(audienceModel, "audienceModel");
        this.LJLJJLL = c75794Tos;
        this.LJLJJL = interfaceC75579TlP;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        C75240Tfw.LIZ(window, oldState, newState, actionType);
    }
}
