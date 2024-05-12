package X;

import android.graphics.RectF;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.image.model.ImageFilterInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import kotlin.jvm.internal.o;

/* renamed from: X.5wM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151065wM {
    public final C151035wJ LIZ;
    public final SingleImageData LIZIZ;
    public final C151155wV LIZJ;
    public boolean LIZLLL;
    public FilterBean LJ;
    public boolean LJFF;
    public InterfaceC65784Pro<C76800UCe> LJI;
    public boolean LJII;

    public final RectF LJFF() {
        C151195wZ LJIIIIZZ;
        C151325wm LIZIZ = this.LIZ.LIZIZ();
        if (LIZIZ == null || (LJIIIIZZ = C151325wm.LJIIIIZZ(LIZIZ)) == null) {
            return null;
        }
        RectF rectF = new RectF();
        C151205wa c151205wa = LJIIIIZZ.LIZIZ;
        rectF.top = c151205wa.LIZIZ;
        rectF.bottom = LJIIIIZZ.LIZ.LIZIZ;
        rectF.left = c151205wa.LIZ;
        rectF.right = LJIIIIZZ.LIZJ.LIZ;
        return rectF;
    }

    public final void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        C151325wm c151325wm;
        C151035wJ c151035wJ = this.LIZ;
        C151225wc c151225wc = (C151225wc) ((InterfaceC65784Pro) c151035wJ.LIZ).invoke();
        if (c151225wc != null) {
            c151325wm = c151225wc.LIZ;
        } else {
            c151325wm = null;
        }
        if (c151325wm == null) {
            InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) c151035wJ.LIZIZ;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
        } else if (this.LJII) {
            interfaceC65784Pro.invoke();
            return;
        }
        this.LJI = interfaceC65784Pro;
    }

    public final void LJ(int i, boolean z) {
        float f;
        Float scaleAfterCrop = this.LIZIZ.getEditImageInfo().getScaleAfterCrop();
        if (scaleAfterCrop != null) {
            float floatValue = scaleAfterCrop.floatValue();
            Float initializeScaleValue = this.LIZIZ.getEditImageInfo().getInitializeScaleValue();
            o.LJI(initializeScaleValue);
            float floatValue2 = 1.0f / (floatValue / initializeScaleValue.floatValue());
            C151325wm LIZIZ = this.LIZ.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LJIIJ(i, floatValue2, floatValue2);
                C151035wJ.LIZJ(LIZIZ, z);
            }
        }
        if (this.LIZIZ.getEditImageInfo().getOffsetX() != null || this.LIZIZ.getEditImageInfo().getOffsetY() != null) {
            C151035wJ c151035wJ = this.LIZ;
            Float offsetX = this.LIZIZ.getEditImageInfo().getOffsetX();
            float f2 = 0.0f;
            if (offsetX != null) {
                f = offsetX.floatValue();
            } else {
                f = 0.0f;
            }
            float f3 = -f;
            Float offsetY = this.LIZIZ.getEditImageInfo().getOffsetY();
            if (offsetY != null) {
                f2 = offsetY.floatValue();
            }
            C151325wm LIZIZ2 = c151035wJ.LIZIZ();
            if (LIZIZ2 != null) {
                LIZIZ2.LIZJ(i, f3, -f2);
                C151035wJ.LIZJ(LIZIZ2, z);
            }
        }
    }

    public final void LJI(int i, boolean z) {
        C151325wm c151325wm;
        C151225wc c151225wc = (C151225wc) ((InterfaceC65784Pro) this.LIZ.LIZ).invoke();
        if (c151225wc != null && (c151325wm = c151225wc.LIZ) != null) {
            TEImageInterface tEImageInterface = c151325wm.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.removeInfoSticker(i);
            }
            C151035wJ.LIZJ(c151325wm, z);
        }
    }

    public C151065wM(C151035wJ c151035wJ, SingleImageData data, C151155wV c151155wV) {
        o.LJIIIZ(data, "data");
        this.LIZ = c151035wJ;
        this.LIZIZ = data;
        this.LIZJ = c151155wV;
    }

    public static void LIZLLL(C151065wM c151065wM, boolean z, int i) {
        boolean z2;
        String str;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if (c151065wM.LIZLLL) {
            C151035wJ c151035wJ = c151065wM.LIZ;
            FilterBean filterBean = c151065wM.LJ;
            if (filterBean != null) {
                str = filterBean.getFilterFolder();
            } else {
                str = null;
            }
            C151325wm LIZIZ = c151035wJ.LIZIZ();
            if (LIZIZ != null) {
                if (str == null) {
                    str = "";
                }
                TEImageInterface tEImageInterface = LIZIZ.LJII;
                if (tEImageInterface != null) {
                    tEImageInterface.removeComposerWithoutUndo("Composer_Slide_Filter", str);
                }
                C151035wJ.LIZJ(LIZIZ, z2);
            }
        } else {
            C151325wm LIZIZ2 = c151065wM.LIZ.LIZIZ();
            if (LIZIZ2 != null) {
                LIZIZ2.LJIIJJI("", "", 1.0f, 1.0f, 1.0f);
                C151035wJ.LIZJ(LIZIZ2, z2);
            }
        }
        if (z) {
            ImageFilterInfo filterInfo = c151065wM.LIZIZ.getFilterInfo();
            filterInfo.setFilterId("");
            filterInfo.setFilterLabel("");
            filterInfo.setFilterIntensityRatio(-1.0f);
            filterInfo.setCompareKey("");
        }
        c151065wM.LJ = null;
    }

    public final void LIZ(float f, FilterBean filter, boolean z) {
        o.LJIIIZ(filter, "filter");
        LJIIIZ(f, filter, true);
        if (this.LJ != null) {
            LIZLLL(this, false, 2);
        }
        C151035wJ c151035wJ = this.LIZ;
        c151035wJ.getClass();
        C151325wm LIZIZ = c151035wJ.LIZIZ();
        if (LIZIZ != null) {
            String filterFolder = filter.getFilterFolder();
            o.LJIIIIZZ(filterFolder, "filter.filterFolder");
            TEImageInterface tEImageInterface = LIZIZ.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.setComposerSlideFilter("Composer_Slide_Filter", filterFolder, "", 0.0f, f);
            }
            C151035wJ.LIZJ(LIZIZ, z);
        }
        this.LJ = filter;
        this.LIZLLL = true;
    }

    public final void LIZIZ(float f, FilterBean filterBean, boolean z) {
        LJIIIZ(f, filterBean, false);
        if (this.LJ != null) {
            LIZLLL(this, false, 2);
        }
        C151035wJ c151035wJ = this.LIZ;
        c151035wJ.getClass();
        C151325wm LIZIZ = c151035wJ.LIZIZ();
        if (LIZIZ != null) {
            String filterFolder = filterBean.getFilterFolder();
            o.LJIIIIZZ(filterFolder, "filter.filterFolder");
            LIZIZ.LJIIJJI(filterFolder, "", 0.0f, f, 1.0f);
            C151035wJ.LIZJ(LIZIZ, z);
        }
        this.LJ = filterBean;
    }

    public final void LJIIIIZZ(float f, float f2, boolean z) {
        C151325wm LIZIZ = this.LIZ.LIZIZ();
        if (LIZIZ != null) {
            TEImageInterface tEImageInterface = LIZIZ.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.translate("translate", f, f2);
            }
            if (z) {
                LIZIZ.LJ(null, true);
            }
        }
    }

    public final void LJIIIZ(float f, FilterBean filterBean, boolean z) {
        ImageFilterInfo filterInfo = this.LIZIZ.getFilterInfo();
        filterInfo.setComposer(z);
        filterInfo.setFilterId(String.valueOf(filterBean.getId()));
        filterInfo.setFilterLabel(filterBean.getEnName());
        filterInfo.setFilterIntensityRatio(f);
        filterInfo.setCompareKey(filterBean.getCompareKey());
    }

    public final void LJII(float f, float f2, float f3, boolean z) {
        C151325wm LIZIZ = this.LIZ.LIZIZ();
        if (LIZIZ != null) {
            TEImageInterface tEImageInterface = LIZIZ.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.scale("scale", f, f, f2, f3);
            }
            if (z) {
                LIZIZ.LJ(null, true);
            }
        }
    }
}
