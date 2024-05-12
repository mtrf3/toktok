package Y;

import X.C225248si;
import X.C26045AKb;
import X.C68322mC;
import X.C78857UxB;
import X.InterfaceC82683Wch;
import X.OHT;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p005new.PoiDetailContentHeaderNewRegionalAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class ACListenerS1S2300000_3 implements View.OnClickListener {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS1S2300000_3 aCListenerS1S2300000_3, View view) {
        String str = aCListenerS1S2300000_3.s0;
        if (str != null && str.length() != 0) {
            C26045AKb c26045AKb = new C26045AKb((View) aCListenerS1S2300000_3.l2);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIIIZZ(R.string.dwa);
            c26045AKb.LJIIJ();
            OHT.LIZ("label", aCListenerS1S2300000_3.s0, view.getContext(), C78857UxB.LJJIIJ(1476399105, "bpea-poi_detail_copy_address"));
            C225248si.LJIIIIZZ(((PoiDetailContentHeaderBaseAssemV3) aCListenerS1S2300000_3.l3).LJLJI, "long_press_copy", aCListenerS1S2300000_3.s1);
        }
        InterfaceC82683Wch interfaceC82683Wch = (InterfaceC82683Wch) ((C68322mC) aCListenerS1S2300000_3.l4).element;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public static final void onClick$1(ACListenerS1S2300000_3 aCListenerS1S2300000_3, View view) {
        String str = aCListenerS1S2300000_3.s0;
        if (str != null && str.length() != 0) {
            C26045AKb c26045AKb = new C26045AKb((View) aCListenerS1S2300000_3.l2);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIIIZZ(R.string.dwa);
            c26045AKb.LJIIJ();
            OHT.LIZ("label", aCListenerS1S2300000_3.s0, view.getContext(), C78857UxB.LJJIIJ(1476399105, "bpea-poi_detail_copy_address"));
            C225248si.LJIIIIZZ(((PoiDetailContentHeaderNewRegionalAssem) aCListenerS1S2300000_3.l3).LJLJJI, "long_press_copy", aCListenerS1S2300000_3.s1);
        }
        InterfaceC82683Wch interfaceC82683Wch = (InterfaceC82683Wch) ((C68322mC) aCListenerS1S2300000_3.l4).element;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public static final void onClick$2(ACListenerS1S2300000_3 aCListenerS1S2300000_3, View view) {
        String str = aCListenerS1S2300000_3.s0;
        if (str != null && str.length() != 0) {
            C26045AKb c26045AKb = new C26045AKb((View) aCListenerS1S2300000_3.l2);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIIIZZ(R.string.dwa);
            c26045AKb.LJIIJ();
            OHT.LIZ("label", aCListenerS1S2300000_3.s0, view.getContext(), C78857UxB.LJJIIJ(1476399105, "bpea-poi_detail_copy_address"));
            C225248si.LJIIIIZZ(((PoiDetailContentHeaderBaseAssem) aCListenerS1S2300000_3.l3).LJLJI, "long_press_copy", aCListenerS1S2300000_3.s1);
        }
        InterfaceC82683Wch interfaceC82683Wch = (InterfaceC82683Wch) ((C68322mC) aCListenerS1S2300000_3.l4).element;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1 A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #1 {Exception -> 0x007c, blocks: (B:25:0x00d2, B:27:0x00e1), top: B:24:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$3(Y.ACListenerS1S2300000_3 r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS1S2300000_3.onClick$3(Y.ACListenerS1S2300000_3, android.view.View):void");
    }

    public ACListenerS1S2300000_3(Object obj, String str, Object obj2, String str2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
        this.s1 = str2;
        this.l4 = obj3;
    }
}
