package Y;

import X.C0C3;
import X.C16880lQ;
import X.C2U8;
import X.C49615Jdb;
import X.C60877Nur;
import X.C79004UzY;
import X.C80766Vms;
import X.C80925VpR;
import X.C81449Vxt;
import X.C81947WEd;
import X.C81949WEf;
import X.C81951WEh;
import X.C82562Wak;
import X.EnumC81464Vy8;
import X.EnumC82563Wal;
import X.EnumC82565Wan;
import X.I1R;
import X.InterfaceC81454Vxy;
import X.V9Y;
import X.VNL;
import X.VNU;
import X.VNV;
import X.VWA;
import X.VWB;
import X.VWG;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.viewpager.LynxViewPager;
import com.bytedance.ies.xelement.viewpager.viewpager.LynxViewPagerNG;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.kids.commonfeed.panel.BaseFeedPanel;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDiS275S0100000_14 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$1(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
    }

    public static final void onPageScrollStateChanged$3(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
    }

    public static final void onPageScrollStateChanged$4(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
    }

    public static final void onPageScrollStateChanged$5(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
    }

    public static final void onPageScrollStateChanged$8(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
    }

    public static final void onPageScrollStateChanged$9(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
    }

    public static final void onPageScrolled$0(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
    }

    public static final void onPageScrolled$7(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
    }

    public static final void onPageScrolled$8(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
    }

    public static final void onPageScrolled$9(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            case 2:
                onPageScrollStateChanged$2(this, i);
                return;
            case 3:
                onPageScrollStateChanged$3(this, i);
                return;
            case 4:
                onPageScrollStateChanged$4(this, i);
                return;
            case 5:
                onPageScrollStateChanged$5(this, i);
                return;
            case 6:
                onPageScrollStateChanged$6(this, i);
                return;
            case 7:
                onPageScrollStateChanged$7(this, i);
                return;
            case 8:
                onPageScrollStateChanged$8(this, i);
                return;
            case 9:
                onPageScrollStateChanged$9(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                return;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                return;
            case 4:
                onPageScrolled$4(this, i, f, i2);
                return;
            case 5:
                onPageScrolled$5(this, i, f, i2);
                return;
            case 6:
                onPageScrolled$6(this, i, f, i2);
                return;
            case 7:
                onPageScrolled$7(this, i, f, i2);
                return;
            case 8:
                onPageScrolled$8(this, i, f, i2);
                return;
            case 9:
                onPageScrolled$9(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            case 2:
                onPageSelected$2(this, i);
                return;
            case 3:
                onPageSelected$3(this, i);
                return;
            case 4:
                onPageSelected$4(this, i);
                return;
            case 5:
                onPageSelected$5(this, i);
                return;
            case 6:
                onPageSelected$6(this, i);
                return;
            case 7:
                onPageSelected$7(this, i);
                return;
            case 8:
                onPageSelected$8(this, i);
                return;
            case 9:
                onPageSelected$9(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS275S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        if (i == 0) {
            VWG.LIZ = false;
        }
    }

    public static final void onPageScrollStateChanged$2(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LynxViewPagerNG lynxViewPagerNG = (LynxViewPagerNG) iDiS275S0100000_14.l0;
                if (!lynxViewPagerNG.mEnableScrollMonitor) {
                    return;
                }
                VNU lynxContext = lynxViewPagerNG.mContext;
                o.LJFF(lynxContext, "lynxContext");
                VNV vnv = lynxContext.LJLLL;
                LynxViewPagerNG lynxViewPagerNG2 = (LynxViewPagerNG) iDiS275S0100000_14.l0;
                vnv.LJIIIIZZ(new C60877Nur(lynxViewPagerNG2.mView, lynxViewPagerNG2.getTagName(), ((LynxViewPagerNG) iDiS275S0100000_14.l0).mScrollMonitorTag));
                return;
            }
            LynxViewPagerNG lynxViewPagerNG3 = (LynxViewPagerNG) iDiS275S0100000_14.l0;
            lynxViewPagerNG3.LJLL = true;
            if (!lynxViewPagerNG3.mEnableScrollMonitor) {
                return;
            }
            VNU lynxContext2 = lynxViewPagerNG3.mContext;
            o.LJFF(lynxContext2, "lynxContext");
            VNV vnv2 = lynxContext2.LJLLL;
            LynxViewPagerNG lynxViewPagerNG4 = (LynxViewPagerNG) iDiS275S0100000_14.l0;
            vnv2.LJJII(new C60877Nur(lynxViewPagerNG4.mView, lynxViewPagerNG4.getTagName(), ((LynxViewPagerNG) iDiS275S0100000_14.l0).mScrollMonitorTag));
            return;
        }
        LynxViewPagerNG lynxViewPagerNG5 = (LynxViewPagerNG) iDiS275S0100000_14.l0;
        lynxViewPagerNG5.LJLL = false;
        if (!lynxViewPagerNG5.mEnableScrollMonitor) {
            return;
        }
        VNU lynxContext3 = lynxViewPagerNG5.mContext;
        o.LJFF(lynxContext3, "lynxContext");
        VNV vnv3 = lynxContext3.LJLLL;
        LynxViewPagerNG lynxViewPagerNG6 = (LynxViewPagerNG) iDiS275S0100000_14.l0;
        vnv3.LJJIII(new C60877Nur(lynxViewPagerNG6.mView, lynxViewPagerNG6.getTagName(), ((LynxViewPagerNG) iDiS275S0100000_14.l0).mScrollMonitorTag));
    }

    public static final void onPageScrollStateChanged$6(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        if (i != 0) {
            ((LynxSwiperView) iDiS275S0100000_14.l0).recognizeGesturere();
        }
        LynxSwiperView lynxSwiperView = (LynxSwiperView) iDiS275S0100000_14.l0;
        if (lynxSwiperView.LJLJI && i == 1) {
            VNU lynxContext = lynxSwiperView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(((LynxSwiperView) iDiS275S0100000_14.l0).getSign(), "scrollstart");
            c49615Jdb.LIZJ(Integer.valueOf(((LynxSwiperView) iDiS275S0100000_14.l0).LJLJJL), "current");
            vnl.LIZIZ(c49615Jdb);
        }
        LynxSwiperView lynxSwiperView2 = (LynxSwiperView) iDiS275S0100000_14.l0;
        if (lynxSwiperView2.LJLJJI && i == 0) {
            VNU lynxContext2 = lynxSwiperView2.mContext;
            o.LJFF(lynxContext2, "lynxContext");
            VNL vnl2 = lynxContext2.LJLJJL;
            C49615Jdb c49615Jdb2 = new C49615Jdb(((LynxSwiperView) iDiS275S0100000_14.l0).getSign(), "scrollend");
            c49615Jdb2.LIZJ(Integer.valueOf(((LynxSwiperView) iDiS275S0100000_14.l0).LJLJJL), "current");
            vnl2.LIZIZ(c49615Jdb2);
        }
    }

    public static final void onPageScrollStateChanged$7(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        if (i == 0 && ((C81449Vxt) iDiS275S0100000_14.l0).LLJJI().tw()) {
            ((C81449Vxt) iDiS275S0100000_14.l0).LLJJ();
            ((C81449Vxt) iDiS275S0100000_14.l0).LLJJI().KZ(false);
        }
    }

    public static final void onPageSelected$0(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        ((VWA) iDiS275S0100000_14.l0).post(new ARunnableS50S0100000_14(iDiS275S0100000_14, 1));
    }

    public static final void onPageSelected$1(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        LynxViewPager lynxViewPager = (LynxViewPager) iDiS275S0100000_14.l0;
        if (lynxViewPager.LJLIL && lynxViewPager.LJIL().getMTabLayout() == null) {
            ((LynxViewPager) iDiS275S0100000_14.l0).LJJIFFI(i, "", "slide");
        }
    }

    public static final void onPageSelected$2(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        LynxViewPagerNG lynxViewPagerNG = (LynxViewPagerNG) iDiS275S0100000_14.l0;
        if (lynxViewPagerNG.LJLIL) {
            lynxViewPagerNG.LJJIFFI(i, "", "");
        }
    }

    public static final void onPageSelected$3(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        if (((C80925VpR) iDiS275S0100000_14.l0).LJLLLL.getAdapter() != null) {
            C80925VpR c80925VpR = (C80925VpR) iDiS275S0100000_14.l0;
            if (c80925VpR.LJLLLLLL <= 0) {
                return;
            }
            c80925VpR.setText(C16880lQ.LLLZI(Locale.getDefault(), "%s/%s", new Object[]{Integer.valueOf((i % ((C80925VpR) iDiS275S0100000_14.l0).LJLLLLLL) + 1), Integer.valueOf(((C80925VpR) iDiS275S0100000_14.l0).LJLLLLLL)}));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$4(Y.IDiS275S0100000_14 r7, int r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDiS275S0100000_14.onPageSelected$4(Y.IDiS275S0100000_14, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$5(Y.IDiS275S0100000_14 r9, int r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDiS275S0100000_14.onPageSelected$5(Y.IDiS275S0100000_14, int):void");
    }

    public static final void onPageSelected$6(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) iDiS275S0100000_14.l0;
        lynxSwiperView.LJLJJL = i;
        if (lynxSwiperView.LJLIL) {
            VNU lynxContext = lynxSwiperView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(((LynxSwiperView) iDiS275S0100000_14.l0).getSign(), "change");
            c49615Jdb.LIZJ(Integer.valueOf(i), "current");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    public static final void onPageSelected$7(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        EnumC81464Vy8 enumC81464Vy8;
        EnumC81464Vy8 enumC81464Vy82;
        if (I1R.LIZLLL()) {
            InterfaceC81454Vxy LLJJI = ((C81449Vxt) iDiS275S0100000_14.l0).LLJJI();
            if (i != 0) {
                if (i != 1) {
                    enumC81464Vy82 = EnumC81464Vy8.COMMENTSTAB;
                } else {
                    enumC81464Vy82 = EnumC81464Vy8.SUGGEST_TAB;
                }
            } else {
                enumC81464Vy82 = EnumC81464Vy8.FAVORITE_TAB;
            }
            LLJJI.Dn(enumC81464Vy82);
        } else {
            InterfaceC81454Vxy LLJJI2 = ((C81449Vxt) iDiS275S0100000_14.l0).LLJJI();
            if (i == 0) {
                enumC81464Vy8 = EnumC81464Vy8.SUGGEST_TAB;
            } else {
                enumC81464Vy8 = EnumC81464Vy8.FAVORITE_TAB;
            }
            LLJJI2.Dn(enumC81464Vy8);
        }
        C81449Vxt c81449Vxt = (C81449Vxt) iDiS275S0100000_14.l0;
        if (c81449Vxt.LJLLJ) {
            c81449Vxt.LLJJI().KZ(true);
            ((C81449Vxt) iDiS275S0100000_14.l0).LLJILJILJ(0);
            C81449Vxt c81449Vxt2 = (C81449Vxt) iDiS275S0100000_14.l0;
            if (!c81449Vxt2.LJLLILLLL) {
                InterfaceC81454Vxy LLJJI3 = c81449Vxt2.LLJJI();
                List<String> list = ((C81449Vxt) iDiS275S0100000_14.l0).LJLJI;
                if (list != null) {
                    LLJJI3.E20((String) ListProtector.get(list, i), "slide");
                } else {
                    o.LJIJI("tabTitles");
                    throw null;
                }
            }
        }
        C81449Vxt c81449Vxt3 = (C81449Vxt) iDiS275S0100000_14.l0;
        c81449Vxt3.LJLLILLLL = false;
        c81449Vxt3.LJLLJ = true;
    }

    public static final void onPageSelected$8(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        String str;
        C80766Vms c80766Vms = ((C81951WEh) iDiS275S0100000_14.l0).LIZLLL;
        if (c80766Vms == null || c80766Vms.getAdapter() == null) {
            return;
        }
        C81949WEf transferConfig = ((C81947WEd) ((C81951WEh) iDiS275S0100000_14.l0).LIZIZ).getTransferConfig();
        List<String> list = transferConfig.LJIIJJI;
        if (list == null || C79004UzY.LJJIFFI(list) || i < 0 || i >= transferConfig.LJIIJJI.size()) {
            str = "";
        } else {
            str = (String) ListProtector.get(transferConfig.LJIIJJI, i);
        }
        ((C81951WEh) iDiS275S0100000_14.l0).LIZJ.setText(str);
    }

    public static final void onPageSelected$9(IDiS275S0100000_14 iDiS275S0100000_14, int i) {
        VWB vwb = (VWB) iDiS275S0100000_14.l0;
        vwb.post(new ARunnableS50S0100000_14(vwb, 257));
    }

    public static final void onPageScrolled$1(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
        if (((LynxViewPager) iDiS275S0100000_14.l0).LJLILLLLZI) {
            String LLLZ = C16880lQ.LLLZ("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i + f)}, 1));
            o.LJFF(LLLZ, "java.lang.String.format(format, *args)");
            if (o.LJ(LLLZ, ((LynxViewPager) iDiS275S0100000_14.l0).LJLJJLL)) {
                return;
            }
            LynxViewPager lynxViewPager = (LynxViewPager) iDiS275S0100000_14.l0;
            lynxViewPager.getClass();
            lynxViewPager.LJLJJLL = LLLZ;
            LynxViewPager lynxViewPager2 = (LynxViewPager) iDiS275S0100000_14.l0;
            lynxViewPager2.getClass();
            VNU lynxContext = lynxViewPager2.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(lynxViewPager2.getSign(), "offsetchange");
            c49615Jdb.LIZJ(LLLZ, "offset");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    public static final void onPageScrolled$2(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
        LynxViewPagerNG lynxViewPagerNG = (LynxViewPagerNG) iDiS275S0100000_14.l0;
        if (lynxViewPagerNG.LJLLILLLL && lynxViewPagerNG.LJLLI != f) {
            lynxViewPagerNG.recognizeGesturere();
            lynxViewPagerNG.LJLLI = f;
        }
        if (((LynxViewPagerNG) iDiS275S0100000_14.l0).LJLILLLLZI) {
            Locale locale = Locale.ENGLISH;
            o.LJFF(locale, "Locale.ENGLISH");
            String LLLZI = C16880lQ.LLLZI(locale, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i + f)}, 1));
            o.LJFF(LLLZI, "java.lang.String.format(locale, format, *args)");
            if (o.LJ(LLLZI, ((LynxViewPagerNG) iDiS275S0100000_14.l0).LJLJJLL)) {
                return;
            }
            LynxViewPagerNG lynxViewPagerNG2 = (LynxViewPagerNG) iDiS275S0100000_14.l0;
            lynxViewPagerNG2.getClass();
            lynxViewPagerNG2.LJLJJLL = LLLZI;
            LynxViewPagerNG lynxViewPagerNG3 = (LynxViewPagerNG) iDiS275S0100000_14.l0;
            lynxViewPagerNG3.getClass();
            VNU lynxContext = lynxViewPagerNG3.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(lynxViewPagerNG3.getSign(), "offsetchange");
            c49615Jdb.LIZJ(LLLZI, "offset");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    public static final void onPageScrolled$4(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
        if (((BaseFeedPanel) iDiS275S0100000_14.l0).isFeedResume() && ((BaseFeedPanel) iDiS275S0100000_14.l0).isFirst && f == 0.0f && i2 == 0) {
            iDiS275S0100000_14.onPageSelected(i);
            ((BaseFeedPanel) iDiS275S0100000_14.l0).isFirst = false;
        }
    }

    public static final void onPageScrolled$5(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
        C2U8.LIZ(new C82562Wak(EnumC82563Wal.SCROLL, EnumC82565Wan.MAIN_TEMPLATE, i, f));
    }

    public static final void onPageScrolled$6(IDiS275S0100000_14 iDiS275S0100000_14, int i, float f, int i2) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) iDiS275S0100000_14.l0;
        if (lynxSwiperView.LJLILLLLZI) {
            VNU lynxContext = lynxSwiperView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(((LynxSwiperView) iDiS275S0100000_14.l0).getSign(), "transition");
            c49615Jdb.LIZJ(Integer.valueOf(i), "current");
            c49615Jdb.LIZJ(Float.valueOf(f), "positionOffset");
            c49615Jdb.LIZJ(Float.valueOf(V9Y.LIZIZ(i2)), "dx");
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
