package ud2;

import X.AbstractC82618Wbe;
import X.AnonymousClass642;
import X.C143705kU;
import X.C146865pa;
import X.C147945rK;
import X.C151055wL;
import X.C157586Gk;
import X.C157646Gq;
import X.C275416g;
import X.C275516h;
import X.C60903NvH;
import X.C63C;
import X.C66D;
import X.C67O;
import X.C68322mC;
import X.C78934UyQ;
import X.C82255WPz;
import X.C82622Wbi;
import X.InterfaceC143655kP;
import X.InterfaceC1541063a;
import X.InterfaceC82231WPb;
import X.InterfaceC82236WPg;
import X.InterfaceC84498XEg;
import X.WMH;
import X.WPG;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ApS130S0300000_2 extends AbstractC82618Wbe {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractC82618Wbe
    public final Object LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            case 2:
                return LIZIZ$2(this, c82622Wbi);
            case 3:
                return LIZIZ$3(this, c82622Wbi);
            case 4:
                return LIZIZ$4(this, c82622Wbi);
            case 5:
                return LIZIZ$5(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public static final Object LIZIZ$0(ApS130S0300000_2 apS130S0300000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        View requireViewById = ((C151055wL) apS130S0300000_2.l1).requireViewById(R.id.nc2);
        o.LJIIIIZZ(requireViewById, "requireViewById(id.view_…ker_container_new_engine)");
        FrameLayout frameLayout = (FrameLayout) apS130S0300000_2.l2;
        C151055wL c151055wL = (C151055wL) apS130S0300000_2.l1;
        C157646Gq c157646Gq = new C157646Gq(container, (ViewStub) requireViewById, frameLayout, c151055wL.LJLJJL, c151055wL.LJLIL, c151055wL.LLIIIJ);
        ((C275416g) apS130S0300000_2.l0).getClass();
        c157646Gq.afterInit$als_release(uptimeMillis);
        return c157646Gq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object LIZIZ$1(ApS130S0300000_2 apS130S0300000_2, C82622Wbi container) {
        Integer maxStickerCount;
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C78934UyQ.LJLIL.getSpService().getClass();
        Integer num = (Integer) new C66D().LIZ();
        if (num == null || num.intValue() != 0) {
            C78934UyQ.LJLIL.getSpService().getClass();
            maxStickerCount = (Integer) new C66D().LIZ();
        } else {
            maxStickerCount = 30;
        }
        C63C c63c = (C63C) apS130S0300000_2.l1;
        InterfaceC1541063a LLJJIJIIJIL = c63c.LLJJIJIIJIL();
        o.LJIIIIZZ(maxStickerCount, "maxStickerCount");
        C67O c67o = new C67O(container, c63c, R.id.l5i, LLJJIJIIJIL, maxStickerCount.intValue(), ((C63C) apS130S0300000_2.l1).LLJLLL().isReverse(), new AqS152S0100000_2((C63C) apS130S0300000_2.l1, 470), (AnonymousClass642) ((C68322mC) apS130S0300000_2.l2).element, ((C63C) apS130S0300000_2.l1).LLJLLL().getTtsVoiceModel(), new C147945rK((C63C) apS130S0300000_2.l1), ((C63C) apS130S0300000_2.l1).LJLILLLLZI);
        ((C275416g) apS130S0300000_2.l0).getClass();
        c67o.afterInit$als_release(uptimeMillis);
        return c67o;
    }

    public static final Object LIZIZ$2(ApS130S0300000_2 apS130S0300000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WMH wmh = (WMH) apS130S0300000_2.l1;
        InterfaceC82236WPg LJI = C60903NvH.LJIIJJI().LJIILL().LJI();
        InterfaceC84498XEg LIZIZ = C60903NvH.LJIIJJI().LJIILL().LIZIZ();
        final C146865pa c146865pa = (C146865pa) apS130S0300000_2.l2;
        final InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) container.LJ(InterfaceC143655kP.class, null);
        c146865pa.getClass();
        WPG wpg = new WPG(container, wmh, R.id.fns, LJI, LIZIZ, new InterfaceC82231WPb() { // from class: X.5sl
            @Override // X.InterfaceC82231WPb
            public final void pg(String name) {
                o.LJIIIZ(name, "name");
            }

            @Override // X.InterfaceC82231WPb
            public final void H60(boolean z, FilterBean filterBean) {
                boolean z2 = !z;
                InterfaceC143655kP.this.U2(z2, false, z2);
            }

            @Override // X.InterfaceC82231WPb
            public final void P30(float f, boolean z) {
                FilterBean filterBean;
                C140415fB value = InterfaceC143655kP.this.Dm().getValue();
                if (value != null && (filterBean = value.LJLILLLLZI) != null) {
                    InterfaceC143655kP interfaceC143655kP2 = InterfaceC143655kP.this;
                    C146865pa c146865pa2 = c146865pa;
                    o.LJI(interfaceC143655kP2.Nm().getValue());
                    o.LJI(interfaceC143655kP2.v50().getValue());
                    c146865pa2.LIZJ.mSelectedFilterIntensity = r1.LIZ(filterBean, r0) / 100;
                }
            }

            @Override // X.InterfaceC82231WPb
            public final void nz(FilterBean filterBean, boolean z, Context context) {
                if (filterBean != null) {
                    o.LJI(InterfaceC143655kP.this.Nm().getValue());
                    o.LJI(InterfaceC143655kP.this.v50().getValue());
                    c146865pa.LIZJ.mSelectedId = TMC.LJIJ(filterBean, C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL());
                    c146865pa.LIZJ.mCurFilterLabels = filterBean.getEnName();
                    c146865pa.LIZJ.mSelectedFilterId = String.valueOf(filterBean.getId());
                    c146865pa.LIZJ.mSelectedFilterResId = filterBean.getResId();
                    c146865pa.LIZJ.mSelectedFilterIntensity = r4.LIZ(filterBean, r3) / 100;
                    C46104I7o.LJJJI(String.valueOf(filterBean.getId()), 3);
                    C46104I7o.LJJJI(String.valueOf(filterBean.getId()), 7);
                    C46104I7o.LJJJI(filterBean.getResId(), 6);
                    C5UD applicationService = C78934UyQ.LJLIL.getApplicationService();
                    String contentType = c146865pa.LIZJ.getAvetParameter().getContentType();
                    String enName = filterBean.getEnName();
                    applicationService.getClass();
                    C148855sn c148855sn = new C148855sn();
                    c148855sn.LJIILJJIL = contentType;
                    c148855sn.LJIILL = "mid_page";
                    c148855sn.LJIILLIIL = enName;
                    c148855sn.LJIILIIL();
                    if (z) {
                        H8F.LJJJI(r3, "slide", filterBean.getEnName(), filterBean.getId(), c146865pa.LIZJ.mSelectedFilterIntensity);
                        return;
                    } else {
                        H8F.LJJJI(r3, "click", filterBean.getEnName(), filterBean.getId(), c146865pa.LIZJ.mSelectedFilterIntensity);
                        return;
                    }
                }
                VideoPublishEditModel videoPublishEditModel = c146865pa.LIZJ;
                videoPublishEditModel.mSelectedId = 0;
                videoPublishEditModel.mSelectedFilterId = "";
                videoPublishEditModel.mSelectedFilterResId = "";
            }
        }, C82255WPz.LJLIL);
        ((C275416g) apS130S0300000_2.l0).getClass();
        wpg.afterInit$als_release(uptimeMillis);
        return wpg;
    }

    public static final Object LIZIZ$3(ApS130S0300000_2 apS130S0300000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewStub viewStub = (ViewStub) apS130S0300000_2.l1;
        View requireViewById = ((ImageEditRootScene) apS130S0300000_2.l2).requireViewById(R.id.nc0);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.vie…_new_engine_higher_layer)");
        ViewStub viewStub2 = (ViewStub) requireViewById;
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) apS130S0300000_2.l2).LJLLJ;
        if (videoPublishEditModel != null) {
            CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
            ImageAlbumData imageAlbumData = ((ImageEditRootScene) apS130S0300000_2.l2).LJLLI;
            if (imageAlbumData != null) {
                C157586Gk c157586Gk = new C157586Gk(container, viewStub, viewStub2, creativeInfo, imageAlbumData);
                ((C275416g) apS130S0300000_2.l0).getClass();
                c157586Gk.afterInit$als_release(uptimeMillis);
                return c157586Gk;
            }
            o.LJIJI("albumData");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object LIZIZ$4(ApS130S0300000_2 apS130S0300000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C143705kU c143705kU = new C143705kU((WMH) apS130S0300000_2.l1, container, ((DMCameraModel) apS130S0300000_2.l2).tnsNoticeRes);
        ((C275416g) apS130S0300000_2.l0).getClass();
        c143705kU.afterInit$als_release(uptimeMillis);
        return c143705kU;
    }

    public static final Object LIZIZ$5(ApS130S0300000_2 apS130S0300000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C143705kU c143705kU = new C143705kU((WMH) apS130S0300000_2.l1, container, ((DMCameraModel) apS130S0300000_2.l2).tnsNoticeRes);
        ((C275416g) apS130S0300000_2.l0).getClass();
        c143705kU.afterInit$als_release(uptimeMillis);
        return c143705kU;
    }

    public ApS130S0300000_2(C275416g c275416g, C275516h c275516h, C151055wL c151055wL, FrameLayout frameLayout, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c151055wL;
        this.l2 = frameLayout;
    }

    public ApS130S0300000_2(C275416g c275416g, C275516h c275516h, C63C c63c, C68322mC c68322mC, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = c63c;
        this.l2 = c68322mC;
    }

    public ApS130S0300000_2(C275416g c275416g, C275516h c275516h, WMH wmh, C146865pa c146865pa, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = wmh;
        this.l2 = c146865pa;
    }

    public ApS130S0300000_2(C275416g c275416g, C275516h c275516h, WMH wmh, DMCameraModel dMCameraModel, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = wmh;
        this.l2 = dMCameraModel;
    }

    public ApS130S0300000_2(C275416g c275416g, C275516h c275516h, ViewStub viewStub, ImageEditRootScene imageEditRootScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = viewStub;
        this.l2 = imageEditRootScene;
    }
}
