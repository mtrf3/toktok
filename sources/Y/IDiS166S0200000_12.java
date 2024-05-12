package Y;

import X.C0C3;
import X.C188727au;
import X.C70414RkI;
import X.C70617RnZ;
import X.C70625Rnh;
import X.C70756Rpo;
import X.C74110T6s;
import X.FMX;
import X.HG3;
import X.IQ9;
import X.InterfaceC70636Rns;
import X.InterfaceC72761Sh3;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.T7F;
import X.TH0;
import X.TH1;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.qna.assem.QnaTabsContainerAssem;
import com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDiS166S0200000_12 implements C0C3 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrollStateChanged$0(IDiS166S0200000_12 iDiS166S0200000_12, int i) {
    }

    public static final void onPageScrollStateChanged$1(IDiS166S0200000_12 iDiS166S0200000_12, int i) {
    }

    public static final void onPageScrolled$0(IDiS166S0200000_12 iDiS166S0200000_12, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(IDiS166S0200000_12 iDiS166S0200000_12, int i, float f, int i2) {
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
            default:
                return;
        }
    }

    public static final void onPageScrollStateChanged$2(IDiS166S0200000_12 iDiS166S0200000_12, int i) {
        ((C0C3) iDiS166S0200000_12.l1).onPageScrollStateChanged(i);
    }

    public static final void onPageSelected$0(IDiS166S0200000_12 iDiS166S0200000_12, int i) {
        String str;
        String wl = ((C74110T6s) iDiS166S0200000_12.l0).LJJIIJ(i).wl();
        if (wl != null) {
            QnaTabsContainerAssem qnaTabsContainerAssem = (QnaTabsContainerAssem) iDiS166S0200000_12.l1;
            T7F t7f = InterfaceC72761Sh3.LIZ;
            String str2 = qnaTabsContainerAssem.v3().LJLJI;
            o.LJIIIZ(str2, "<this>");
            boolean equals = TextUtils.equals(str2, ((RBX) HG3.LJIILL()).getCurUserId());
            t7f.getClass();
            C188727au c188727au = new C188727au();
            if (equals) {
                str = "qa_personal_profile";
            } else {
                str = "qa_others_profile";
            }
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("tab_name", wl);
            FMX.LJIIL("change_qa_profile_tab", c188727au.LIZ);
        }
        QnaTabsContainerAssem qnaTabsContainerAssem2 = (QnaTabsContainerAssem) iDiS166S0200000_12.l1;
        C74110T6s c74110T6s = (C74110T6s) iDiS166S0200000_12.l0;
        qnaTabsContainerAssem2.getClass();
        BaseQnaTabFragment currentFragment = c74110T6s.LJJIIJ(i);
        AssemViewModel assemViewModel = (AssemViewModel) qnaTabsContainerAssem2.LJLJI.getValue();
        o.LJIIIZ(currentFragment, "currentFragment");
        assemViewModel.setState(new AqS170S0100000_4(currentFragment, 1057));
    }

    public static final void onPageSelected$1(IDiS166S0200000_12 iDiS166S0200000_12, int i) {
        String str;
        C70756Rpo headerPagerAdapter;
        if (((C70617RnZ) iDiS166S0200000_12.l0).getNumVideos() > 0) {
            if (i != ((C70617RnZ) iDiS166S0200000_12.l0).getVideoIndex()) {
                IQ9 iq9 = ((C70617RnZ) iDiS166S0200000_12.l0).LJLJLLL;
                if (iq9 != null) {
                    iq9.pause();
                } else {
                    o.LJIJI("videoPlayerController");
                    throw null;
                }
            } else if (((C70617RnZ) iDiS166S0200000_12.l0).getVideoIndex() == 0 && (headerPagerAdapter = ((C70617RnZ) iDiS166S0200000_12.l0).getHeaderPagerAdapter()) != null) {
                headerPagerAdapter.LJJIIZI();
            }
        }
        C70617RnZ c70617RnZ = (C70617RnZ) iDiS166S0200000_12.l0;
        c70617RnZ.LJLILLLLZI = i;
        InterfaceC70636Rns interfaceC70636Rns = c70617RnZ.LJLJLJ;
        if (interfaceC70636Rns != null) {
            interfaceC70636Rns.onPageSelected(i);
        }
        Image image = (Image) ORZ.LJLLLLLL(i, ((C70625Rnh) iDiS166S0200000_12.l1).LIZ);
        if (image == null) {
            return;
        }
        PdpViewModel pdpViewModel = ((C70617RnZ) iDiS166S0200000_12.l0).LJLIL;
        if (pdpViewModel != null) {
            pdpViewModel.LLIILZL = image;
            C70414RkI c70414RkI = pdpViewModel.LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJLIIIJLLLLLLLZ(image.getUri());
            }
            PdpViewModel pdpViewModel2 = ((C70617RnZ) iDiS166S0200000_12.l0).LJLIL;
            if (pdpViewModel2 != null) {
                if (pdpViewModel2.LJZ) {
                    str = "viewer";
                } else {
                    str = "main";
                }
                pdpViewModel2.Sv0("picture");
                PdpViewModel pdpViewModel3 = ((C70617RnZ) iDiS166S0200000_12.l0).LJLIL;
                if (pdpViewModel3 != null) {
                    C70414RkI c70414RkI2 = pdpViewModel3.LLFII;
                    if (c70414RkI2 != null) {
                        boolean z = pdpViewModel3.LJLJL;
                        String uri = image.getUri();
                        if (uri == null) {
                            uri = "";
                        }
                        c70414RkI2.LJJJJJ(str, uri, null, z);
                    }
                    ((C70617RnZ) iDiS166S0200000_12.l0).LJJLJLI(image);
                    return;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public static final void onPageSelected$2(IDiS166S0200000_12 iDiS166S0200000_12, int i) {
        TH1 th1 = (TH1) iDiS166S0200000_12.l0;
        th1.LJLJJLL.onNext(new OSZ<>(Integer.valueOf(th1.LJLJJI), Integer.valueOf(i)));
        TH1 th12 = (TH1) iDiS166S0200000_12.l0;
        th12.LJLJJI = i;
        ((TH0) th12.LJLJI.getValue()).LJLLI.LJFF = Integer.valueOf(((TH1) iDiS166S0200000_12.l0).LJLJJI);
        ((C0C3) iDiS166S0200000_12.l1).onPageSelected(i);
    }

    public IDiS166S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onPageScrolled$2(IDiS166S0200000_12 iDiS166S0200000_12, int i, float f, int i2) {
        ((C0C3) iDiS166S0200000_12.l1).onPageScrolled(i, f, i2);
    }
}
