package X;

import android.view.View;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit.DefaultStreamEditSubPanelHelper;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.65z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1548765z {
    public final /* synthetic */ C1548165t LIZ;

    public C1548765z(C1548165t c1548165t) {
        this.LIZ = c1548165t;
    }

    public final void LIZ(boolean z) {
        Integer num;
        InterfaceC1549366f interfaceC1549366f;
        InterfaceC1549466g interfaceC1549466g;
        View view;
        C67P c67p;
        AnonymousClass667 lT;
        C1NS<C6R1> LJI;
        C6R1 c6r1;
        this.LIZ.LJZL = z;
        float LLJJI = C1548165t.LLJJI(z);
        WM7 wm7 = this.LIZ.mParentScene;
        o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C63K c63k = (C63K) C44384HbQ.LJJJI((WMH) wm7).LJ(C63K.class);
        if (c63k != null) {
            c63k.LJIL(C1548165t.LLJJI(z));
        }
        this.LIZ.LLJJIJIL().Wd0(C1548165t.LLJJI(z));
        InterfaceC139535dl LLJJJ = this.LIZ.LLJJJ();
        InterfaceC1549266e interfaceC1549266e = null;
        if (LLJJJ != null && (lT = LLJJJ.lT()) != null && (LJI = lT.LJI()) != null && (c6r1 = LJI.LJ) != null) {
            num = Integer.valueOf(c6r1.LIZ);
        } else {
            num = null;
        }
        this.LIZ.LLJJL().FC(C1548165t.LLJJI(z), false, new AqS168S0100000_2(num, 270));
        this.LIZ.LLJLIL(LLJJI);
        if (!z) {
            InterfaceC1549166d interfaceC1549166d = this.LIZ.LLJJJJ().LLIL;
            if ((interfaceC1549166d instanceof C67P) && (c67p = (C67P) interfaceC1549166d) != null) {
                c67p.LJJ(C1548165t.LLJJI(true), false);
            }
            Object obj = this.LIZ.LLJJJJ().LLIL;
            if ((obj instanceof C156086Aq) && (view = (View) obj) != null) {
                view.setAlpha(C1548165t.LLJJI(true));
            }
            InterfaceC1549166d interfaceC1549166d2 = this.LIZ.LLJJJJ().LLIL;
            if ((interfaceC1549166d2 instanceof InterfaceC1549466g) && (interfaceC1549466g = (InterfaceC1549466g) interfaceC1549166d2) != null) {
                this.LIZ.getClass();
                interfaceC1549466g.LIZIZ();
            }
            InterfaceC1549166d interfaceC1549166d3 = this.LIZ.LLJJJJ().LLIL;
            if ((interfaceC1549166d3 instanceof InterfaceC1549366f) && (interfaceC1549366f = (InterfaceC1549366f) interfaceC1549166d3) != null) {
                interfaceC1549366f.LJIIIZ(C1548165t.LLJJI(true), false);
            }
        }
        InterfaceC1549166d interfaceC1549166d4 = this.LIZ.LLJJJJ().LLIL;
        if (interfaceC1549166d4 instanceof InterfaceC1549266e) {
            interfaceC1549266e = (InterfaceC1549266e) interfaceC1549166d4;
        }
        if (!z) {
            if (interfaceC1549266e != null) {
                interfaceC1549266e.LJIIIZ(C1548165t.LLJJI(true), false);
                return;
            }
            float LLJJI2 = C1548165t.LLJJI(false);
            WM7 wm72 = this.LIZ.mParentScene;
            o.LJII(wm72, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            C63K c63k2 = (C63K) C44384HbQ.LJJJI((WMH) wm72).LJ(C63K.class);
            if (c63k2 != null) {
                c63k2.LJIL(LLJJI2);
            }
            this.LIZ.LLJLIL(LLJJI2);
            return;
        }
        float LLJJI3 = C1548165t.LLJJI(true);
        WM7 wm73 = this.LIZ.mParentScene;
        o.LJII(wm73, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C63K c63k3 = (C63K) C44384HbQ.LJJJI((WMH) wm73).LJ(C63K.class);
        if (c63k3 != null) {
            c63k3.LJIL(LLJJI3);
        }
        this.LIZ.LLJLIL(LLJJI3);
    }

    public final void LIZIZ(boolean z, boolean z2) {
        Integer num;
        float LLJJI;
        View view;
        InterfaceC1549366f interfaceC1549366f;
        InterfaceC1549466g interfaceC1549466g;
        View view2;
        C67P c67p;
        AnonymousClass667 lT;
        C1NS<C6R1> LJI;
        C6R1 c6r1;
        if (z) {
            ((DefaultStreamEditSubPanelHelper) this.LIZ.LLFF.getValue()).LIZJ();
            if (z2) {
                DefaultStreamEditSubPanelHelper defaultStreamEditSubPanelHelper = (DefaultStreamEditSubPanelHelper) this.LIZ.LLFF.getValue();
                C1548966b c1548966b = this.LIZ.LLJJJJ().LLJIJIL;
                o.LJIIIIZZ(c1548966b, "stickerHelper.pinModeStreamDownloadStatusView");
                defaultStreamEditSubPanelHelper.LIZ(c1548966b);
            }
        } else {
            ((DefaultStreamEditSubPanelHelper) this.LIZ.LLFF.getValue()).LIZIZ();
        }
        boolean z3 = !z;
        this.LIZ.LLJJIJIL().Wd0(C1548165t.LLJJI(z3));
        this.LIZ.LLJJIJIL().rf(z3);
        if (!((Boolean) this.LIZ.LLD.getValue()).booleanValue()) {
            InterfaceC139535dl LLJJJ = this.LIZ.LLJJJ();
            if (LLJJJ != null) {
                LLJJJ.gs(C1548165t.LLJJI(z3));
            }
            InterfaceC139535dl LLJJJ2 = this.LIZ.LLJJJ();
            if (LLJJJ2 != null) {
                LLJJJ2.G70(z3);
            }
        }
        InterfaceC139535dl LLJJJ3 = this.LIZ.LLJJJ();
        InterfaceC1549266e interfaceC1549266e = null;
        if (LLJJJ3 != null && (lT = LLJJJ3.lT()) != null && (LJI = lT.LJI()) != null && (c6r1 = LJI.LJ) != null) {
            num = Integer.valueOf(c6r1.LIZ);
        } else {
            num = null;
        }
        this.LIZ.LLJJL().FC(C1548165t.LLJJI(z3), false, new AqS168S0100000_2(num, 271));
        if (z) {
            InterfaceC1549166d interfaceC1549166d = this.LIZ.LLJJJJ().LLIL;
            if ((interfaceC1549166d instanceof C67P) && (c67p = (C67P) interfaceC1549166d) != null) {
                c67p.LJJ(C1548165t.LLJJI(true), false);
            }
            Object obj = this.LIZ.LLJJJJ().LLIL;
            if ((obj instanceof C156086Aq) && (view2 = (View) obj) != null) {
                view2.setAlpha(C1548165t.LLJJI(true));
            }
            InterfaceC1549166d interfaceC1549166d2 = this.LIZ.LLJJJJ().LLIL;
            if ((interfaceC1549166d2 instanceof InterfaceC1549466g) && (interfaceC1549466g = (InterfaceC1549466g) interfaceC1549166d2) != null) {
                this.LIZ.getClass();
                interfaceC1549466g.LIZIZ();
            }
            InterfaceC1549166d interfaceC1549166d3 = this.LIZ.LLJJJJ().LLIL;
            if ((interfaceC1549166d3 instanceof InterfaceC1549366f) && (interfaceC1549366f = (InterfaceC1549366f) interfaceC1549166d3) != null) {
                interfaceC1549366f.LJIIIZ(C1548165t.LLJJI(true), false);
            }
            Object obj2 = this.LIZ.LLJJJJ().LLIL;
            if ((obj2 instanceof C156636Ct) && (view = (View) obj2) != null) {
                view.setAlpha(C1548165t.LLJJI(true));
            }
        }
        InterfaceC1549166d interfaceC1549166d4 = this.LIZ.LLJJJJ().LLIL;
        if (interfaceC1549166d4 instanceof InterfaceC1549266e) {
            interfaceC1549266e = (InterfaceC1549266e) interfaceC1549166d4;
        }
        if (z) {
            if (interfaceC1549266e != null) {
                LLJJI = C1548165t.LLJJI(false);
            } else {
                LLJJI = C1548165t.LLJJI(false);
            }
        } else {
            LLJJI = C1548165t.LLJJI(true);
        }
        WM7 wm7 = this.LIZ.mParentScene;
        o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C63K c63k = (C63K) C44384HbQ.LJJJI((WMH) wm7).LJ(C63K.class);
        if (c63k != null) {
            c63k.LJIL(LLJJI);
        }
        this.LIZ.LLJLIL(LLJJI);
        if (z && interfaceC1549266e != null) {
            interfaceC1549266e.LJIIIZ(C1548165t.LLJJI(true), false);
        }
        WM7 wm72 = this.LIZ.mParentScene;
        o.LJII(wm72, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C63K c63k2 = (C63K) C44384HbQ.LJJJI((WMH) wm72).LJ(C63K.class);
        if (c63k2 != null) {
            c63k2.LJJI(true);
        }
        this.LIZ.LLJLILLLLZIIL();
    }
}
