package X;

import Y.ACListenerS24S0101000_5;
import Y.AObjectS52S0101000_7;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;

/* loaded from: classes16.dex */
public abstract class XWR<T> implements InterfaceC84984XWy<T> {
    public C252709vu LIZ;
    public RecyclerView LIZIZ;
    public C73305Spp LIZJ;
    public LinearLayout LIZLLL;
    public Context LJ;
    public C8HS<T> LJFF;
    public XYV LJI;
    public InterfaceC191547fS LJII;
    public C72H<XYM> LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public C73306Spq LJIIL;
    public final int LJIILIIL;
    public final EnumC84975XWp LJIILJJIL;
    public final int LJIILL;

    public abstract C8HS LIZIZ();

    @Override // X.InterfaceC84984XWy
    public final void showLoadMoreError() {
    }

    @Override // X.InterfaceC84984XWy
    public final void LIZ() {
        C73306Spq c73306Spq;
        C73305Spp c73305Spp = this.LIZJ;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            if (C52908Kpc.LIZ()) {
                OSZ LJJI = C78596Usy.LJJI(this.LIZJ.getContext());
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_refresh;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                c73306Spq = new C73306Spq();
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZIZ = c2068389v;
                int LJIILL = C17N.LJIILL(72.0d);
                int LJIILL2 = C17N.LJIILL(72.0d);
                c73306Spq.LIZLLL = LJIILL;
                c73306Spq.LJ = LJIILL2;
                c73306Spq.LIZJ((String) LJJI.getFirst());
                c73306Spq.LIZIZ((CharSequence) LJJI.getSecond());
                C16880lQ.LJIIJJI(new ACListenerS24S0101000_5(1, this, 12), this.LIZJ);
            } else {
                c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new AObjectS52S0101000_7(0, this, 26));
            }
            this.LIZJ.setStatus(c73306Spq);
        }
        C8HS<T> c8hs = this.LJFF;
        if (c8hs != null) {
            c8hs.setData(null);
        }
    }

    public void LJFF() {
        C8HS<T> c8hs = this.LJFF;
        if (c8hs.mShowFooter) {
            c8hs.setShowFooter(false);
            this.LJFF.setData(null);
            this.LJFF.showLoadMoreEmpty();
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        C73305Spp c73305Spp = this.LIZJ;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = this.LJIIL;
            if (c73306Spq != null) {
                c73305Spp.setStatus(c73306Spq);
                this.LIZJ.setVisibility(0);
                return;
            }
            if (this.LJIIIZ == 0) {
                return;
            }
            String string = c73305Spp.getContext().getString(this.LJIIIZ);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_error_robot;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            C73306Spq c73306Spq2 = new C73306Spq();
            c73306Spq2.LIZJ = 0;
            c73306Spq2.LIZIZ = c2068389v;
            c73306Spq2.LIZJ(this.LJ.getString(R.string.dhv));
            c73306Spq2.LIZIZ(string);
            this.LIZJ.setStatus(c73306Spq2);
            this.LIZJ.setVisibility(0);
        }
    }

    public final void LJI() {
        if (this.LIZJ != null) {
            if (C52908Kpc.LIZ()) {
                this.LIZJ.setTranslationY(KL2.LIZJ(this.LJ, 20.0f));
            }
            this.LIZJ.setVisibility(0);
            this.LIZJ.LJFF();
        }
    }

    @Override // X.InterfaceC84984XWy
    public final void showLoadMoreLoading() {
        C8HS<T> c8hs = this.LJFF;
        if (c8hs != null) {
            c8hs.showLoadMoreLoading();
        }
    }

    public final C76800UCe LIZLLL() {
        C73305Spp c73305Spp;
        if (C52908Kpc.LIZ() && (c73305Spp = this.LIZJ) != null) {
            c73305Spp.setClickable(false);
            C16880lQ.LJIIJJI(null, this.LIZJ);
        }
        LJI();
        XYV xyv = this.LJI;
        if (xyv != null) {
            xyv.refreshData();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC84984XWy
    public final C8HS<T> LJJLIIIJJIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC84984XWy
    public void J5(List<T> list, boolean z) {
        if (this.LIZJ != null) {
            if (C52908Kpc.LIZ()) {
                this.LIZJ.setTranslationY(0.0f);
            }
            this.LIZJ.setVisibility(8);
        }
        if (this.LJFF == null) {
            return;
        }
        if (C79004UzY.LJJIFFI(list)) {
            LJFF();
            return;
        }
        this.LJFF.setShowFooter(true);
        this.LJIIJJI = z;
        if (!z) {
            C8HS<T> c8hs = this.LJFF;
            if (c8hs != null) {
                c8hs.setShowFooter(false);
            }
        } else {
            this.LJFF.resetLoadMoreState();
        }
        this.LJFF.setData(list);
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    public final void LJ(InterfaceC85024XYm interfaceC85024XYm, int i) {
        new C84972XWm(interfaceC85024XYm, i).LIZ(this.LIZIZ);
    }

    @Override // X.InterfaceC84984XWy
    public final void j0(List<T> list, boolean z) {
        C8HS<T> c8hs = this.LJFF;
        if (c8hs == null) {
            return;
        }
        this.LJIIJJI = z;
        if (!z) {
            c8hs.setShowFooter(false);
        } else {
            c8hs.resetLoadMoreState();
        }
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        this.LJFF.setDataAfterLoadMore(list);
    }

    public final void LIZJ(Context context, View view, XYV xyv, int i, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i2) {
        this.LIZ = (C252709vu) view.findViewById(R.id.l_2);
        this.LIZIZ = (RecyclerView) view.findViewById(R.id.gt6);
        this.LIZJ = (C73305Spp) view.findViewById(R.id.gtn);
        this.LIZLLL = (LinearLayout) view.findViewById(R.id.gt8);
        this.LJ = context;
        this.LJI = xyv;
        this.LJII = interfaceC191547fS;
        this.LJIIIIZZ = c72h;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        C252709vu c252709vu = this.LIZ;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZ = new InterfaceC252739vx() { // from class: X.XYT
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                XYV xyv2 = XWR.this.LJI;
                if (xyv2 != null) {
                    xyv2.LJI();
                }
            }
        };
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_arrow_turn_up_right;
        LIZJ2.LIZ = new InterfaceC252739vx() { // from class: X.XYU
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                XYV xyv2 = XWR.this.LJI;
                if (xyv2 != null) {
                    xyv2.pk();
                }
            }
        };
        LIZJ2.LIZIZ = "share";
        LIZJ2.LJI = false;
        c235119Kp.LIZIZ(LIZJ2);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        if (this.LJIILIIL == 1) {
            LJI();
        }
        C8HS<T> LIZIZ = LIZIZ();
        this.LJFF = LIZIZ;
        LIZIZ.setLoadMoreListener(this.LJII);
        this.LIZIZ.setAdapter(this.LJFF);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        wrapLinearLayoutManager.LLFZ = C43985HOb.LIZ();
        this.LIZIZ.setLayoutManager(wrapLinearLayoutManager);
        this.LIZIZ.setRecycledViewPool(MusicRecyclerViewPoolViewModel.gv0(this.LJ));
    }

    public XWR(Context context, View view, XYV xyv, int i, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i2, int i3) {
        this.LJIILIIL = 1;
        this.LJIILJJIL = EnumC84975XWp.UNSET;
        this.LJIILL = i3;
        LIZJ(context, view, xyv, i, interfaceC191547fS, c72h, i2);
    }

    public XWR(Context context, View view, XYV xyv, int i, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i2, int i3, int i4) {
        this.LJIILIIL = 1;
        this.LJIILJJIL = EnumC84975XWp.UNSET;
        this.LJIILIIL = i3;
        this.LJIILL = i4;
        LIZJ(context, view, xyv, i, interfaceC191547fS, c72h, i2);
    }

    public XWR(Context context, View view, XYV xyv, int i, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i2, EnumC84975XWp enumC84975XWp, int i3) {
        this.LJIILIIL = 1;
        this.LJIILJJIL = EnumC84975XWp.UNSET;
        this.LJIILJJIL = enumC84975XWp;
        this.LJIILL = i3;
        LIZJ(context, view, xyv, i, interfaceC191547fS, c72h, i2);
    }
}
