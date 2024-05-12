package X;

import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.viewpager.DspViewPagerAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.ZxV, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final /* synthetic */ class C91617ZxV extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public C91617ZxV(Object obj) {
        super(1, obj, DspViewPagerAssem.class, "viewPagerIdleCallback", "viewPagerIdleCallback(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        Boolean bool;
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        AbstractC91590Zx4 HS2;
        C91605ZxJ c91605ZxJ2;
        int intValue = num.intValue();
        DspViewPagerAssem dspViewPagerAssem = (DspViewPagerAssem) this.receiver;
        C91503Zvf c91503Zvf = dspViewPagerAssem.LJLILLLLZI;
        if (c91503Zvf != null) {
            c91503Zvf.setAutoScroll(Boolean.FALSE);
            if (intValue != 1) {
                if (intValue == 0) {
                    IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(dspViewPagerAssem);
                    if (LIZJ != null && (HS2 = LIZJ.HS()) != null && (c91605ZxJ2 = HS2.LJLILLLLZI) != null) {
                        InterfaceC91459Zux interfaceC91459Zux = c91605ZxJ2.LJLJJI.LJLILLLLZI.get(C91483ZvL.class);
                        if (!(interfaceC91459Zux instanceof C91483ZvL)) {
                            interfaceC91459Zux = null;
                        }
                        C91483ZvL c91483ZvL = (C91483ZvL) interfaceC91459Zux;
                        if (c91483ZvL != null) {
                            c91483ZvL.LJIJJLI(null);
                        }
                    }
                } else {
                    C91284Zs8 c91284Zs8 = ((C91456Zuu) dspViewPagerAssem.LJLIL.getValue()).LJLILLLLZI;
                    if (c91284Zs8 != null) {
                        bool = Boolean.valueOf(c91284Zs8.LIZJ);
                    } else {
                        bool = null;
                    }
                    if (o.LJ(bool, Boolean.TRUE)) {
                        C91284Zs8 c91284Zs82 = ((C91456Zuu) dspViewPagerAssem.LJLIL.getValue()).LJLILLLLZI;
                        if (c91284Zs82 != null) {
                            c91284Zs82.LIZIZ.invoke();
                        }
                        C91284Zs8 c91284Zs83 = ((C91456Zuu) dspViewPagerAssem.LJLIL.getValue()).LJLILLLLZI;
                        if (c91284Zs83 != null) {
                            c91284Zs83.LIZJ = false;
                        }
                    } else {
                        IAudioPlayerAbility LIZJ2 = C91264Zro.LIZJ(dspViewPagerAssem);
                        if (LIZJ2 != null && (HS = LIZJ2.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null) {
                            InterfaceC91459Zux interfaceC91459Zux2 = c91605ZxJ.LJLJJI.LJLILLLLZI.get(C91483ZvL.class);
                            if (!(interfaceC91459Zux2 instanceof C91483ZvL)) {
                                interfaceC91459Zux2 = null;
                            }
                            C91483ZvL c91483ZvL2 = (C91483ZvL) interfaceC91459Zux2;
                            if (c91483ZvL2 != null) {
                                c91483ZvL2.LJIJJ(null);
                            }
                        }
                    }
                }
            } else {
                C91503Zvf c91503Zvf2 = dspViewPagerAssem.LJLILLLLZI;
                if (c91503Zvf2 != null) {
                    c91503Zvf2.LLIIJI = (int) (25 * c91503Zvf2.getResources().getDisplayMetrics().density);
                } else {
                    o.LJIJI("mdViewPager");
                    throw null;
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("mdViewPager");
        throw null;
    }
}
