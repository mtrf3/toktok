package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C04330Ez;
import X.C16880lQ;
import X.C2068389v;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C74030T3q;
import X.C78926UyI;
import X.C8YN;
import X.KMJ;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.IDqS460S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EffectDoneAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public View LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.hx;
    }

    public EffectDoneAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(EffectDoneVM.class);
        this.LJLJLLL = new C214298b3(new AqS162S0100000_12(LIZ, 845), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C74030T3q.INSTANCE, LIZ);
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 846));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 844));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLL = view;
        Context context = getContext();
        if (context != null) {
            Object value = this.LJLLI.getValue();
            o.LJIIIIZZ(value, "<get-statusView>(...)");
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_tick_fill_small;
            c2068389v.LIZLLL = Integer.valueOf(C04330Ez.LIZIZ(context, R.color.c5));
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            String string = context.getString(R.string.fzh);
            o.LJIIIIZZ(string, "context.getString(R.stri…iteffect_submitted_title)");
            c73306Spq.LJFF = string;
            String string2 = context.getString(R.string.fzg);
            o.LJIIIIZZ(string2, "context.getString(R.stri…diteffect_submitted_desc)");
            c73306Spq.LJI = string2;
            ((C73305Spp) value).setStatus(c73306Spq);
            Object value2 = this.LJLLI.getValue();
            o.LJIIIIZZ(value2, "<get-statusView>(...)");
            ((C73305Spp) value2).setTopMargin(C32151Nz.LJIIZILJ(0));
            Object value3 = this.LJLLI.getValue();
            o.LJIIIIZZ(value3, "<get-statusView>(...)");
            ((C73305Spp) value3).setVisibility(0);
            Object value4 = this.LJLLILLLL.getValue();
            o.LJIIIIZZ(value4, "<get-doneButton>(...)");
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 0), (View) value4);
        }
        selectSubscribe(r8, new TBT() { // from class: X.T3w
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C74034T3u) obj).LJLIL;
            }
        }, new TBT() { // from class: X.T3x
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C74034T3u) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.T3r
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C74034T3u) obj).LJLJI;
            }
        }, new TBT() { // from class: X.T3s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C74034T3u) obj).LJLJJI;
            }
        }, C213688a4.LIZIZ(((AssemViewModel) this.LJLJLLL.getValue()).usedInReusedScene), null, new IDqS460S0100000_12(this, 2));
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.T3v
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C74034T3u) obj).LJLJJL;
            }
        }, null, KMJ.LJLIL, 6);
    }
}
