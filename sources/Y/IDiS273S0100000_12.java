package Y;

import X.C0C3;
import X.C116894iL;
import X.C27162AlK;
import X.C69694RWw;
import X.C69696RWy;
import X.C70414RkI;
import X.C70756Rpo;
import X.C70757Rpp;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.ORZ;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.HeaderBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderBrickVO;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.GlobalHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.sa.TtfHeadVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDiS273S0100000_12 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(IDiS273S0100000_12 iDiS273S0100000_12, int i) {
    }

    public static final void onPageScrollStateChanged$1(IDiS273S0100000_12 iDiS273S0100000_12, int i) {
    }

    public static final void onPageScrollStateChanged$2(IDiS273S0100000_12 iDiS273S0100000_12, int i) {
    }

    public static final void onPageScrolled$0(IDiS273S0100000_12 iDiS273S0100000_12, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(IDiS273S0100000_12 iDiS273S0100000_12, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(IDiS273S0100000_12 iDiS273S0100000_12, int i, float f, int i2) {
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

    public IDiS273S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onPageSelected$0(IDiS273S0100000_12 iDiS273S0100000_12, int i) {
        String str;
        if (((GlobalHeaderVH) iDiS273S0100000_12.l0).M() > 0) {
            if (i != ((GlobalHeaderVH) iDiS273S0100000_12.l0).N()) {
                ((GlobalHeaderVH) iDiS273S0100000_12.l0)._$_findCachedViewById(R.id.n4s).setVisibility(8);
                ((GlobalHeaderVH) iDiS273S0100000_12.l0).P().pause();
            } else if (((GlobalHeaderVH) iDiS273S0100000_12.l0).N() == 0) {
                ((GlobalHeaderVH) iDiS273S0100000_12.l0).L().LJJIIZI();
                ((GlobalHeaderVH) iDiS273S0100000_12.l0)._$_findCachedViewById(R.id.n4s).setVisibility(0);
            }
        }
        GlobalHeaderVH globalHeaderVH = (GlobalHeaderVH) iDiS273S0100000_12.l0;
        globalHeaderVH.LJLJJL = i;
        ((C116894iL) globalHeaderVH._$_findCachedViewById(R.id.el4)).setSelectedIndex(i);
        Image image = (Image) ORZ.LJLLLLLL(i, ((C69694RWw) ((GlobalHeaderVH) iDiS273S0100000_12.l0).getItem()).LJLIL);
        if (image == null) {
            return;
        }
        ((GlobalHeaderVH) iDiS273S0100000_12.l0).getViewModel().LLIILZL = image;
        C70414RkI c70414RkI = ((GlobalHeaderVH) iDiS273S0100000_12.l0).getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJLIIIJLLLLLLLZ(image.getUri());
        }
        if (((GlobalHeaderVH) iDiS273S0100000_12.l0).getViewModel().LJZ) {
            str = "viewer";
        } else {
            str = "main";
        }
        ((GlobalHeaderVH) iDiS273S0100000_12.l0).getViewModel().Sv0("picture");
        C70414RkI c70414RkI2 = ((GlobalHeaderVH) iDiS273S0100000_12.l0).getViewModel().LLFII;
        if (c70414RkI2 != null) {
            boolean z = ((GlobalHeaderVH) iDiS273S0100000_12.l0).getViewModel().LJLJL;
            String uri = image.getUri();
            if (uri == null) {
                uri = "";
            }
            c70414RkI2.LJJJJJ(str, uri, null, z);
        }
        ((GlobalHeaderVH) iDiS273S0100000_12.l0).Q(image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onPageSelected$1(IDiS273S0100000_12 iDiS273S0100000_12, int i) {
        String str;
        if (((TtfHeadVH) iDiS273S0100000_12.l0).L() > 0) {
            if (i != ((TtfHeadVH) iDiS273S0100000_12.l0).M()) {
                ((TtfHeadVH) iDiS273S0100000_12.l0)._$_findCachedViewById(R.id.n4s).setVisibility(8);
                ((TtfHeadVH) iDiS273S0100000_12.l0).N().pause();
            } else if (((TtfHeadVH) iDiS273S0100000_12.l0).M() == 0) {
                C70756Rpo c70756Rpo = ((TtfHeadVH) iDiS273S0100000_12.l0).LJLJJL;
                if (c70756Rpo != null) {
                    c70756Rpo.LJJIIZI();
                }
                ((TtfHeadVH) iDiS273S0100000_12.l0)._$_findCachedViewById(R.id.n4s).setVisibility(0);
            }
        }
        TtfHeadVH ttfHeadVH = (TtfHeadVH) iDiS273S0100000_12.l0;
        ttfHeadVH.LJLJL = i;
        if (((C69696RWy) ttfHeadVH.getItem()).LJLJJLL == 0) {
            C116894iL indicatorDot = ((TtfHeadVH) iDiS273S0100000_12.l0).LJLJJI;
            o.LJIIIIZZ(indicatorDot, "indicatorDot");
            indicatorDot.setVisibility(8);
            TextView indicatorText = ((TtfHeadVH) iDiS273S0100000_12.l0).LJLJI;
            o.LJIIIIZZ(indicatorText, "indicatorText");
            indicatorText.setVisibility(0);
            ((TtfHeadVH) iDiS273S0100000_12.l0).LJLJI.setText(C27162AlK.LIZ(String.valueOf(i + 1), String.valueOf(((TtfHeadVH) iDiS273S0100000_12.l0).LJLJLLL)));
        } else {
            TextView indicatorText2 = ((TtfHeadVH) iDiS273S0100000_12.l0).LJLJI;
            o.LJIIIIZZ(indicatorText2, "indicatorText");
            indicatorText2.setVisibility(8);
            ((TtfHeadVH) iDiS273S0100000_12.l0).LJLJJI.setSelectedIndex(i);
            C116894iL indicatorDot2 = ((TtfHeadVH) iDiS273S0100000_12.l0).LJLJJI;
            o.LJIIIIZZ(indicatorDot2, "indicatorDot");
            indicatorDot2.setVisibility(0);
        }
        ((TtfHeadVH) iDiS273S0100000_12.l0).getClass();
        Image image = (Image) ORZ.LJLLLLLL(i, ((C69696RWy) ((TtfHeadVH) iDiS273S0100000_12.l0).getItem()).LJLIL);
        if (image == null) {
            return;
        }
        C70414RkI c70414RkI = ((TtfHeadVH) iDiS273S0100000_12.l0).getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJLIIIJLLLLLLLZ(image.getUri());
        }
        if (((TtfHeadVH) iDiS273S0100000_12.l0).getViewModel().LJZ) {
            str = "viewer";
        } else {
            str = "main";
        }
        ((TtfHeadVH) iDiS273S0100000_12.l0).getViewModel().Sv0("picture");
        C70414RkI c70414RkI2 = ((TtfHeadVH) iDiS273S0100000_12.l0).getViewModel().LLFII;
        if (c70414RkI2 != null) {
            boolean z = ((TtfHeadVH) iDiS273S0100000_12.l0).getViewModel().LJLJL;
            String uri = image.getUri();
            if (uri == null) {
                uri = "";
            }
            c70414RkI2.LJJJJJ(str, uri, null, z);
        }
        ((TtfHeadVH) iDiS273S0100000_12.l0).P(image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onPageSelected$2(IDiS273S0100000_12 iDiS273S0100000_12, int i) {
        int i2;
        int i3;
        List<Image> LJIIL;
        Image image;
        int i4;
        int i5;
        boolean z;
        EnumC70107RfL enumC70107RfL;
        int i6;
        int i7;
        List<Image> LJIIL2;
        int i8;
        int i9;
        List<Image> LJIIL3;
        List<Image> LJIIL4;
        HeaderBrickVH headerBrickVH = (HeaderBrickVH) iDiS273S0100000_12.l0;
        C70757Rpp c70757Rpp = headerBrickVH.LJLJLLL;
        if (c70757Rpp != null) {
            c70757Rpp.LJJIIJZLJL(headerBrickVH.LJLL);
        }
        HeaderBrickVH headerBrickVH2 = (HeaderBrickVH) iDiS273S0100000_12.l0;
        headerBrickVH2.LJLL = i;
        HeaderBrickVO headerBrickVO = (HeaderBrickVO) headerBrickVH2.getItem();
        int i10 = 0;
        if (headerBrickVO != null) {
            i2 = headerBrickVO.LJIILJJIL();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            View findViewById = ((HeaderBrickVH) iDiS273S0100000_12.l0).itemView.findViewById(R.id.ela);
            o.LJIIIIZZ(findViewById, "itemView.indicator_text");
            findViewById.setVisibility(8);
            return;
        }
        HeaderBrickVO headerBrickVO2 = (HeaderBrickVO) ((HeaderBrickVH) iDiS273S0100000_12.l0).getItem();
        if (headerBrickVO2 != null) {
            i3 = headerBrickVO2.LJIILJJIL();
        } else {
            i3 = 0;
        }
        int i11 = i - i3;
        if (i11 > ((HeaderBrickVH) iDiS273S0100000_12.l0).N().LJZI) {
            ((HeaderBrickVH) iDiS273S0100000_12.l0).N().LJZI = i11;
        }
        HeaderBrickVO headerBrickVO3 = (HeaderBrickVO) ((HeaderBrickVH) iDiS273S0100000_12.l0).getItem();
        if (headerBrickVO3 == null || (LJIIL = headerBrickVO3.LJIIL()) == null || (image = (Image) ORZ.LJLLLLLL(i11, LJIIL)) == null) {
            return;
        }
        HeaderBrickVO headerBrickVO4 = (HeaderBrickVO) ((HeaderBrickVH) iDiS273S0100000_12.l0).getItem();
        if (headerBrickVO4 != null && (LJIIL4 = headerBrickVO4.LJIIL()) != null) {
            i5 = LJIIL4.size();
        } else {
            HeaderBrickVO headerBrickVO5 = (HeaderBrickVO) ((HeaderBrickVH) iDiS273S0100000_12.l0).getItem();
            if (headerBrickVO5 != null) {
                i4 = headerBrickVO5.LJIILIIL();
            } else {
                i4 = 0;
            }
            i5 = -i4;
        }
        if (i11 < i5) {
            z = true;
            View findViewById2 = ((HeaderBrickVH) iDiS273S0100000_12.l0).itemView.findViewById(R.id.ela);
            o.LJIIIIZZ(findViewById2, "itemView.indicator_text");
            findViewById2.setVisibility(0);
            TextView textView = (TextView) ((HeaderBrickVH) iDiS273S0100000_12.l0).itemView.findViewById(R.id.ela);
            String valueOf = String.valueOf(i11 + 1);
            HeaderBrickVO headerBrickVO6 = (HeaderBrickVO) ((HeaderBrickVH) iDiS273S0100000_12.l0).getItem();
            if (headerBrickVO6 != null && (LJIIL3 = headerBrickVO6.LJIIL()) != null) {
                i9 = LJIIL3.size();
            } else {
                HeaderBrickVO headerBrickVO7 = (HeaderBrickVO) ((HeaderBrickVH) iDiS273S0100000_12.l0).getItem();
                if (headerBrickVO7 != null) {
                    i8 = headerBrickVO7.LJIILIIL();
                } else {
                    i8 = 0;
                }
                i9 = -i8;
            }
            textView.setText(C27162AlK.LIZ(valueOf, String.valueOf(i9)));
        } else {
            z = false;
            View findViewById3 = ((HeaderBrickVH) iDiS273S0100000_12.l0).itemView.findViewById(R.id.ela);
            o.LJIIIIZZ(findViewById3, "itemView.indicator_text");
            findViewById3.setVisibility(8);
        }
        HeaderBrickVH headerBrickVH3 = (HeaderBrickVH) iDiS273S0100000_12.l0;
        if (headerBrickVH3.LJLLI) {
            if (z) {
                enumC70107RfL = EnumC70107RfL.PRODUCT;
                i7 = -1;
            } else {
                enumC70107RfL = EnumC70107RfL.SKU;
                HeaderBrickVO headerBrickVO8 = (HeaderBrickVO) headerBrickVH3.getItem();
                if (headerBrickVO8 != null && (LJIIL2 = headerBrickVO8.LJIIL()) != null) {
                    i6 = LJIIL2.size();
                } else {
                    i6 = 0;
                }
                int i12 = i11 - i6;
                HeaderBrickVO headerBrickVO9 = (HeaderBrickVO) ((HeaderBrickVH) iDiS273S0100000_12.l0).getItem();
                if (headerBrickVO9 != null) {
                    i10 = headerBrickVO9.LJIILIIL();
                }
                i7 = i12 + i10;
            }
            PdpBodyViewModel L = ((HeaderBrickVH) iDiS273S0100000_12.l0).L();
            ImageSelectData imageSelectData = new ImageSelectData(image, EnumC70012Rdo.HEAD_PAGER, enumC70107RfL, i7);
            L.getClass();
            L.setState(new AqS170S0100000_4(imageSelectData, 1118));
        }
        ((HeaderBrickVH) iDiS273S0100000_12.l0).LJLLI = true;
    }
}
