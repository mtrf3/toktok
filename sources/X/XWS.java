package X;

import Y.AObjectS132S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;

/* loaded from: classes16.dex */
public abstract class XWS<T> implements InterfaceC84984XWy<T> {
    public C252709vu LIZ;
    public RecyclerView LIZIZ;
    public C73305Spp LIZJ;
    public LinearLayout LIZLLL;
    public Context LJ;
    public C8HS LJFF;
    public InterfaceC157206Ey LJI;
    public InterfaceC191547fS LJII;
    public InterfaceC85019XYh<XYN> LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public final int LJIIL;

    public abstract C8HS LIZIZ();

    @Override // X.InterfaceC84984XWy
    public final void showLoadMoreError() {
    }

    @Override // X.InterfaceC84984XWy
    public final void LIZ() {
        C73305Spp c73305Spp = this.LIZJ;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C73305Spp c73305Spp2 = this.LIZJ;
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJJI(c73306Spq, new AObjectS132S0100000_2(this, 7));
            c73305Spp2.setStatus(c73306Spq);
        }
        C8HS c8hs = this.LJFF;
        if (c8hs != null) {
            c8hs.setData(null);
        }
    }

    public void LIZLLL() {
        C8HS c8hs = this.LJFF;
        if (c8hs.mShowFooter) {
            c8hs.setShowFooter(false);
            this.LJFF.setData(null);
            this.LJFF.showLoadMoreEmpty();
        }
        C73305Spp c73305Spp = this.LIZJ;
        if (c73305Spp != null && this.LJIIIZ != 0) {
            String string = c73305Spp.getContext().getString(this.LJIIIZ);
            C73305Spp c73305Spp2 = this.LIZJ;
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LIZIZ(string);
            c73305Spp2.setStatus(c73306Spq);
            this.LIZJ.setVisibility(0);
        }
    }

    @Override // X.InterfaceC84984XWy
    public final void showLoadMoreLoading() {
        C8HS c8hs = this.LJFF;
        if (c8hs != null) {
            c8hs.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC84984XWy
    public final C8HS LJJLIIIJJIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC84984XWy
    public void J5(List<T> list, boolean z) {
        C73305Spp c73305Spp = this.LIZJ;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        if (this.LJFF == null) {
            return;
        }
        if (C79004UzY.LJJIFFI(list)) {
            LIZLLL();
            return;
        }
        this.LJFF.setShowFooter(true);
        this.LJIIJJI = z;
        if (!z) {
            this.LJFF.setShowFooter(false);
        } else {
            this.LJFF.resetLoadMoreState();
        }
        this.LJFF.setData(list);
    }

    @Override // X.InterfaceC84984XWy
    public final void j0(List<T> list, boolean z) {
        C8HS c8hs = this.LJFF;
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

    public XWS(Context context, View view, InterfaceC157206Ey interfaceC157206Ey, InterfaceC191547fS interfaceC191547fS, InterfaceC85019XYh interfaceC85019XYh, int i) {
        this.LJIIL = 1;
        this.LJIIL = 0;
        LIZJ(context, view, interfaceC157206Ey, R.string.hgk, interfaceC191547fS, interfaceC85019XYh, i);
    }

    public XWS(Context context, View view, InterfaceC157206Ey interfaceC157206Ey, int i, InterfaceC191547fS interfaceC191547fS, InterfaceC85019XYh<XYN> interfaceC85019XYh, int i2) {
        this.LJIIL = 1;
        LIZJ(context, view, interfaceC157206Ey, i, interfaceC191547fS, interfaceC85019XYh, i2);
    }

    public final void LIZJ(Context context, View view, InterfaceC157206Ey interfaceC157206Ey, int i, InterfaceC191547fS interfaceC191547fS, InterfaceC85019XYh<XYN> interfaceC85019XYh, int i2) {
        C73305Spp c73305Spp;
        this.LIZ = (C252709vu) view.findViewById(R.id.l_2);
        this.LIZIZ = (RecyclerView) view.findViewById(R.id.gt6);
        this.LIZJ = (C73305Spp) view.findViewById(R.id.gtn);
        this.LIZLLL = (LinearLayout) view.findViewById(R.id.gt8);
        this.LJ = context;
        this.LJI = interfaceC157206Ey;
        this.LJII = interfaceC191547fS;
        this.LJIIIIZZ = interfaceC85019XYh;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        C252709vu c252709vu = this.LIZ;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZ = new InterfaceC252739vx() { // from class: X.6Ez
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                InterfaceC157206Ey interfaceC157206Ey2 = XWS.this.LJI;
                if (interfaceC157206Ey2 != null) {
                    interfaceC157206Ey2.LJI();
                }
            }
        };
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        if (this.LJIIL == 1 && (c73305Spp = this.LIZJ) != null) {
            c73305Spp.setVisibility(0);
            this.LIZJ.LJFF();
        }
        C8HS LIZIZ = LIZIZ();
        this.LJFF = LIZIZ;
        LIZIZ.setLoadEmptyTextColor(C79045V0n.LJI(R.attr.gv, this.LJ));
        this.LJFF.setLoadMoreListener(this.LJII);
        this.LIZIZ.setAdapter(this.LJFF);
        this.LIZIZ.setLayoutManager(new WrapLinearLayoutManager(1));
    }
}
