package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C32I;
import X.C60903NvH;
import X.C76800UCe;
import X.C77372UYe;
import X.C81581W0b;
import X.C81633W2b;
import X.C81648W2q;
import X.C82150WLy;
import X.C83498Wpq;
import X.C83499Wpr;
import X.InterfaceC88473Ynt;
import X.OSJ;
import X.OUP;
import X.UYG;
import X.ViewOnTouchListenerC82148WLw;
import X.W0F;
import X.W0G;
import X.W0P;
import X.W0Q;
import X.W0R;
import X.W0S;
import X.W0T;
import X.W0U;
import X.W0V;
import X.WG0;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public class IDqS438S0100000_14 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS438S0100000_14(W0U w0u, int i) {
        super(3);
        this.$t = i;
        this.l0 = w0u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS438S0100000_14(W0V w0v, int i) {
        super(3);
        this.$t = i;
        this.l0 = w0v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS438S0100000_14(C81633W2b c81633W2b, int i) {
        super(3);
        this.$t = i;
        this.l0 = c81633W2b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS438S0100000_14(C81648W2q c81648W2q, int i) {
        super(3);
        this.$t = i;
        this.l0 = c81648W2q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS438S0100000_14(ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw, int i) {
        super(3);
        this.$t = i;
        this.l0 = viewOnTouchListenerC82148WLw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS438S0100000_14(AqS81S1100000_14 aqS81S1100000_14, int i) {
        super(3);
        this.$t = i;
        this.l0 = aqS81S1100000_14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0276, code lost:
    
        if (r0.AO() == true) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.IDqS438S0100000_14 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS438S0100000_14.invoke$0(kotlin.jvm.internal.IDqS438S0100000_14, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        ExtraParams extraParams = (ExtraParams) obj2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        if (extraParams == null || !extraParams.isGifValid()) {
            return null;
        }
        UYG uyg = new UYG(effect, extraParams, new W0S(iDqS438S0100000_14));
        ((W0U) iDqS438S0100000_14.l0).getClass();
        uyg.LJLL = null;
        return uyg;
    }

    public static final Object invoke$10(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        C81581W0b c81581W0b = new C81581W0b(C60903NvH.LJI(effect), ((W0V) iDqS438S0100000_14.l0).LIZIZ);
        ((W0V) iDqS438S0100000_14.l0).getClass();
        c81581W0b.LJLJLLL = null;
        return c81581W0b;
    }

    public static final Object invoke$2(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        ExtraParams extraParams = (ExtraParams) obj2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        if (extraParams != null && extraParams.isLottieValid()) {
            return new W0G(effect, extraParams, new W0T(iDqS438S0100000_14));
        }
        return null;
    }

    public static final Object invoke$3(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (OUP.LJJJLZIJ((Effect) obj4).length() > 0) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C77372UYe((Effect) it.next()));
            }
            C81648W2q c81648W2q = (C81648W2q) iDqS438S0100000_14.l0;
            ((ArrayList) c81648W2q.LIZIZ).clear();
            ((ArrayList) c81648W2q.LIZIZ).addAll(arrayList2);
            c81648W2q.LIZJ.LJ(c81648W2q.LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        ((BackgroundVideoStickerPresenter) ((AqS81S1100000_14) iDqS438S0100000_14.l0).l1).LJIILL(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3, new C83498Wpq(((BackgroundVideoStickerPresenter) ((AqS81S1100000_14) iDqS438S0100000_14.l0).l1).LL));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        ((DiyPropVideoStickerHandler) ((AqS81S1100000_14) iDqS438S0100000_14.l0).l1).LJIILIIL(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3, new C83499Wpr(((DiyPropVideoStickerHandler) ((AqS81S1100000_14) iDqS438S0100000_14.l0).l1).LJZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS438S0100000_14 iDqS438S0100000_14, Object selectSubscribe, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        OSJ osj = (OSJ) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (num != null) {
            ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw = (ViewOnTouchListenerC82148WLw) iDqS438S0100000_14.l0;
            viewOnTouchListenerC82148WLw.LJLLJ = num.intValue();
            WG0.LJI.LJ = viewOnTouchListenerC82148WLw.LJLLJ;
        }
        if (osj != null) {
            ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw2 = (ViewOnTouchListenerC82148WLw) iDqS438S0100000_14.l0;
            viewOnTouchListenerC82148WLw2.LLJJIJIL((AVMusicWaveBean) osj.getFirst(), ((Number) osj.getSecond()).intValue(), ((Number) osj.getThird()).intValue());
            int intValue = ((Number) osj.getThird()).intValue();
            viewOnTouchListenerC82148WLw2.LJLLL = intValue;
            viewOnTouchListenerC82148WLw2.LJLLLL = intValue;
            viewOnTouchListenerC82148WLw2.LLJJ().setMMusicStart(viewOnTouchListenerC82148WLw2.LJLLL);
            viewOnTouchListenerC82148WLw2.LJLLLLLL = false;
            viewOnTouchListenerC82148WLw2.LJLZ = false;
            viewOnTouchListenerC82148WLw2.LLJJ().setIsSoundLoop(Boolean.valueOf(viewOnTouchListenerC82148WLw2.LJLLLLLL));
            C82150WLy c82150WLy = viewOnTouchListenerC82148WLw2.LLFFF;
            if (c82150WLy != null) {
                c82150WLy.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        ExtraParams extraParams = (ExtraParams) obj2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        if (extraParams == null || !extraParams.isGifValid()) {
            return null;
        }
        UYG uyg = new UYG(effect, extraParams, new W0Q((W0V) iDqS438S0100000_14.l0));
        ((W0V) iDqS438S0100000_14.l0).getClass();
        uyg.LJLL = null;
        return uyg;
    }

    public static final Object invoke$8(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        ExtraParams extraParams = (ExtraParams) obj2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        if (extraParams != null && extraParams.isLottieValid()) {
            return new W0G(effect, extraParams, new W0R((W0V) iDqS438S0100000_14.l0));
        }
        return null;
    }

    public static final Object invoke$9(IDqS438S0100000_14 iDqS438S0100000_14, Object obj, Object obj2, Object obj3) {
        Effect effect = (Effect) obj;
        ExtraParams extraParams = (ExtraParams) obj2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        if (extraParams != null && extraParams.isLottieValid()) {
            W0V w0v = (W0V) iDqS438S0100000_14.l0;
            return new W0F(effect, extraParams, new W0P(w0v), w0v.LIZIZ);
        }
        return null;
    }
}
