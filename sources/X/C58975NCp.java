package X;

import Y.ACListenerS30S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.SearchAdComponentDataModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NCp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58975NCp extends AbstractC58982NCw {
    public final InterfaceC58973NCn LJLLLL;
    public final String LJLLLLLL;
    public final SearchAdComponentDataModel LJLZ;
    public final int LJZ;
    public final int LJZI;
    public ViewGroup LJZL;
    public TuxTextView LL;
    public TuxIconView LLD;
    public boolean LLF;

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LIZJ() {
        ViewGroup viewGroup = this.LJZL;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(this.LJZ);
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.dm);
        }
        LJIIIZ();
        this.LLF = false;
        super.LIZJ();
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final C58983NCx isReady() {
        return new C58983NCx(true, null);
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LIZIZ() {
        LJIIJ();
        ViewGroup viewGroup = this.LJZL;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(this.LJZ);
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.dm);
        }
        LJIIIZ();
        this.LLF = false;
    }

    @Override // X.AbstractC58982NCw
    public final String LJII() {
        return this.LJLLLLLL;
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void Q0(NCI event) {
        o.LJIIIZ(event, "event");
        if (event instanceof C58961NCb) {
            this.LJLJI.LJ(new ARunnableS46S0100000_10(this, 200), (int) (this.LJLZ.getColorChangeTime() * 1000), "search_cta_component_change_color");
        }
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void K0(ViewGroup viewGroup, InterfaceC58980NCu interfaceC58980NCu) {
        ViewGroup viewGroup2;
        TuxTextView tuxTextView;
        C018905p c018905p;
        int i;
        super.K0(viewGroup, interfaceC58980NCu);
        this.LJLJLJ = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI), R.layout.h5, this.LJLJL, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initButtonLayout   searchCTAView");
        LIZ.append(this.LJZL);
        LIZ.append("  contentView");
        LIZ.append(this.LJLJLJ);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        View view = this.LJLJLJ;
        TuxIconView tuxIconView = null;
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.a5z);
        } else {
            viewGroup2 = null;
        }
        this.LJZL = viewGroup2;
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            tuxTextView = (TuxTextView) view2.findViewById(R.id.a5y);
        } else {
            tuxTextView = null;
        }
        this.LL = tuxTextView;
        View view3 = this.LJLJLJ;
        if (view3 != null) {
            tuxIconView = (TuxIconView) view3.findViewById(R.id.a5x);
        }
        this.LLD = tuxIconView;
        ViewGroup viewGroup3 = this.LJZL;
        if (viewGroup3 != null) {
            viewGroup3.setBackgroundColor(this.LJZ);
            C16880lQ.LJIIL(viewGroup3, new ACListenerS30S0100000_10(this, 186));
            viewGroup3.setClipToOutline(true);
            viewGroup3.setOutlineProvider(new C58976NCq(this));
            C78897Uxp.LJJJJJL(viewGroup3, 0.0f);
        }
        TuxIconView tuxIconView2 = this.LLD;
        if (tuxIconView2 != null) {
            if (this.LJLZ.getHaveArrow()) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView2.setVisibility(i);
        }
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
            if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                int textMarginStart = this.LJLZ.getTextMarginStart();
                if (textMarginStart == -1) {
                    c018905p.startToStart = 0;
                    c018905p.endToEnd = 0;
                } else {
                    c018905p.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(textMarginStart))));
                }
                tuxTextView2.setLayoutParams(c018905p);
            }
            tuxTextView2.setText(this.LJLZ.getButtonText());
            tuxTextView2.setTextColorRes(R.attr.dm);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58975NCp(AnoleComponentModel anoleComponentModel, Aweme awemeModel, InterfaceC58979NCt delegate, Context context, InterfaceC58973NCn interfaceC58973NCn) {
        super(anoleComponentModel, awemeModel, delegate, context);
        Object LIZ;
        int i;
        o.LJIIIZ(awemeModel, "awemeModel");
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(context, "context");
        this.LJLLLL = interfaceC58973NCn;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SearchAdCTAComponent,type:");
        LIZ2.append(anoleComponentModel.getType());
        this.LJLLLLLL = X1D.LIZIZ(LIZ2);
        anoleComponentModel.getData();
        try {
            Gson LIZ3 = GsonHolder.LIZLLL().LIZ();
            LIZ = (SearchAdComponentDataModel) LIZ3.LJI(LIZ3.LJIILL(this.LJLIL.getData()), SearchAdComponentDataModel.class);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m13isSuccessimpl(LIZ)) {
            C242549fW.LIZ("convert SearchAdComponentDataModel success ");
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("convert SearchAdComponentDataModel failed  ");
            LIZ4.append(m10exceptionOrNullimpl.getMessage());
            C242549fW.LIZ(X1D.LIZIZ(LIZ4));
        }
        SearchAdComponentDataModel searchAdComponentDataModel = (SearchAdComponentDataModel) (C3C5.m10exceptionOrNullimpl(LIZ) != null ? new SearchAdComponentDataModel("learn More", "", 10, false, 2.5f, 0) : LIZ);
        this.LJLZ = searchAdComponentDataModel;
        Integer LJI = C79045V0n.LJI(R.attr.db, context);
        int i2 = 0;
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LJZ = i;
        String ctaBgColor = searchAdComponentDataModel.getCtaBgColor();
        if (ctaBgColor.length() > 0) {
            i2 = ColorProtector.parseColor(ctaBgColor);
        } else {
            Integer LJI2 = C79045V0n.LJI(R.attr.eb, context);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
        }
        this.LJZI = i2;
    }
}
