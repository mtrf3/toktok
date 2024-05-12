package X;

import android.view.ViewGroup;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.DeS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34380DeS {
    public final InterfaceC65784Pro<Boolean> LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;
    public final InterfaceC65784Pro<Boolean> LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final InterfaceC65784Pro<Boolean> LJFF;
    public final InterfaceC65784Pro<Boolean> LJI;
    public final InterfaceC65784Pro<Boolean> LJII;
    public final InterfaceC65784Pro<Boolean> LJIIIIZZ;
    public final InterfaceC65784Pro<Boolean> LJIIIZ;
    public final InterfaceC65784Pro<Boolean> LJIIJ;
    public final InterfaceC65784Pro<Integer> LJIIJJI;
    public final InterfaceC65784Pro<Boolean> LJIIL;
    public final InterfaceC65784Pro<Boolean> LJIILIIL;
    public final InterfaceC65784Pro<Boolean> LJIILJJIL;
    public final InterfaceC65784Pro<Boolean> LJIILL;
    public final InterfaceC65784Pro<Boolean> LJIILLIIL;
    public final InterfaceC65784Pro<Boolean> LJIIZILJ;
    public final InterfaceC65784Pro<Boolean> LJIJ;
    public final InterfaceC65784Pro<Boolean> LJIJI;
    public final InterfaceC65784Pro<Boolean> LJIJJ;
    public final InterfaceC88472Yns<Boolean, Integer> LJIJJLI;
    public final InterfaceC88472Yns<ViewGroup, C76800UCe> LJIL;
    public final InterfaceC65784Pro<Boolean> LJJ;

    public C34380DeS() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34380DeS)) {
            return false;
        }
        C34380DeS c34380DeS = (C34380DeS) obj;
        return o.LJ(this.LIZ, c34380DeS.LIZ) && o.LJ(this.LIZIZ, c34380DeS.LIZIZ) && o.LJ(this.LIZJ, c34380DeS.LIZJ) && o.LJ(this.LIZLLL, c34380DeS.LIZLLL) && o.LJ(this.LJ, c34380DeS.LJ) && o.LJ(this.LJFF, c34380DeS.LJFF) && o.LJ(this.LJI, c34380DeS.LJI) && o.LJ(this.LJII, c34380DeS.LJII) && o.LJ(this.LJIIIIZZ, c34380DeS.LJIIIIZZ) && o.LJ(this.LJIIIZ, c34380DeS.LJIIIZ) && o.LJ(this.LJIIJ, c34380DeS.LJIIJ) && o.LJ(this.LJIIJJI, c34380DeS.LJIIJJI) && o.LJ(this.LJIIL, c34380DeS.LJIIL) && o.LJ(this.LJIILIIL, c34380DeS.LJIILIIL) && o.LJ(this.LJIILJJIL, c34380DeS.LJIILJJIL) && o.LJ(this.LJIILL, c34380DeS.LJIILL) && o.LJ(this.LJIILLIIL, c34380DeS.LJIILLIIL) && o.LJ(this.LJIIZILJ, c34380DeS.LJIIZILJ) && o.LJ(this.LJIJ, c34380DeS.LJIJ) && o.LJ(this.LJIJI, c34380DeS.LJIJI) && o.LJ(this.LJIJJ, c34380DeS.LJIJJ) && o.LJ(this.LJIJJLI, c34380DeS.LJIJJLI) && o.LJ(this.LJIL, c34380DeS.LJIL) && o.LJ(this.LJJ, c34380DeS.LJJ);
    }

    public final String toString() {
        return "UIConfig(showStickerName=" + this.LIZ + ", showMoreText=" + this.LIZIZ + ", cancelOptimize=" + this.LIZJ + ", scrollHideTools=" + this.LIZLLL + ", multiStickerOptimize=" + this.LJ + ", shootOptimize=" + this.LJFF + ", uploadStickerListOnShow=" + this.LJI + ", showFavouriteEffectList=" + this.LJII + ", supportCancel=" + this.LJIIIIZZ + ", cancelDownloading=" + this.LJIIIZ + ", fetchFirst=" + this.LJIIJ + ", categoryCount=" + this.LJIIJJI + ", supportLoadMore=" + this.LJIIL + ", optimizeForbidIcon=" + this.LJIILIIL + ", supportExploreIcon=" + this.LJIILJJIL + ", showLeftCancelView=" + this.LJIILL + ", showCenterCancelView=" + this.LJIILLIIL + ", backgroundTransparent=" + this.LJIIZILJ + ", hideFakeShadow=" + this.LJIJ + ", hideFavoriteAndMoreBtn=" + this.LJIJI + ", hideRecentUsedEffects=" + this.LJIJJ + ", favoriteIconRes=" + this.LJIJJLI + ", modifySlideSlipView=" + this.LJIL + ", disableSmoothScrollOnLoad=" + this.LJJ + ')';
    }

    public final int hashCode() {
        int hashCode;
        int LIZLLL = C1JX.LIZLLL(this.LJIJJ, C1JX.LIZLLL(this.LJIJI, C1JX.LIZLLL(this.LJIJ, C1JX.LIZLLL(this.LJIIZILJ, C1JX.LIZLLL(this.LJIILLIIL, C1JX.LIZLLL(this.LJIILL, C1JX.LIZLLL(this.LJIILJJIL, C1JX.LIZLLL(this.LJIILIIL, C1JX.LIZLLL(this.LJIIL, C1JX.LIZLLL(this.LJIIJJI, C1JX.LIZLLL(this.LJIIJ, C1JX.LIZLLL(this.LJIIIZ, C1JX.LIZLLL(this.LJIIIIZZ, C1JX.LIZLLL(this.LJII, C1JX.LIZLLL(this.LJI, C1JX.LIZLLL(this.LJFF, C1JX.LIZLLL(this.LJ, C1JX.LIZLLL(this.LIZLLL, C1JX.LIZLLL(this.LIZJ, C1JX.LIZLLL(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        InterfaceC88472Yns<Boolean, Integer> interfaceC88472Yns = this.LJIJJLI;
        int i = 0;
        if (interfaceC88472Yns == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88472Yns.hashCode();
        }
        int i2 = (LIZLLL + hashCode) * 31;
        InterfaceC88472Yns<ViewGroup, C76800UCe> interfaceC88472Yns2 = this.LJIL;
        if (interfaceC88472Yns2 != null) {
            i = interfaceC88472Yns2.hashCode();
        }
        return this.LJJ.hashCode() + ((i2 + i) * 31);
    }

    public C34380DeS(WWC wwc, WWD wwd, WWE wwe, WWF wwf, C34419Df5 c34419Df5, AqS164S0100000_14 aqS164S0100000_14, WWG wwg, WWH wwh, WWI wwi, WW9 ww9, WWA wwa, WWB wwb, AqS172S0100000_6 aqS172S0100000_6, AqS172S0100000_6 aqS172S0100000_62, C34418Df4 c34418Df4, int i) {
        C34379DeR cancelOptimize;
        C34367DeF cancelDownloading;
        C34368DeG fetchFirst;
        C34387DeZ showLeftCancelView;
        C34372DeK showCenterCancelView;
        C34373DeL backgroundTransparent;
        C34374DeM hideFakeShadow;
        C34376DeO hideFavoriteAndMoreBtn;
        C34388Dea hideRecentUsedEffects;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = c34419Df5;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = wwf;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro3 = wwe;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro4 = wwd;
        AqS172S0100000_6 aqS172S0100000_63 = aqS172S0100000_62;
        AqS172S0100000_6 aqS172S0100000_64 = aqS172S0100000_6;
        InterfaceC65784Pro<Boolean> supportExploreIcon = wwb;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro5 = wwg;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro6 = aqS164S0100000_14;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro7 = wwh;
        InterfaceC65784Pro<Integer> categoryCount = wwi;
        InterfaceC65784Pro<Boolean> supportLoadMore = ww9;
        InterfaceC65784Pro<Boolean> disableSmoothScrollOnLoad = c34418Df4;
        InterfaceC65784Pro<Boolean> optimizeForbidIcon = wwa;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro8 = (i & 1) != 0 ? C34375DeN.LJLIL : wwc;
        interfaceC65784Pro4 = (i & 2) != 0 ? C34378DeQ.LJLIL : interfaceC65784Pro4;
        if ((i & 4) != 0) {
            cancelOptimize = C34379DeR.LJLIL;
        } else {
            cancelOptimize = null;
        }
        interfaceC65784Pro3 = (i & 8) != 0 ? C34381DeT.LJLIL : interfaceC65784Pro3;
        interfaceC65784Pro2 = (i & 16) != 0 ? C34382DeU.LJLIL : interfaceC65784Pro2;
        interfaceC65784Pro = (i & 32) != 0 ? C34383DeV.LJLIL : interfaceC65784Pro;
        interfaceC65784Pro6 = (i & 64) != 0 ? C34384DeW.LJLIL : interfaceC65784Pro6;
        interfaceC65784Pro5 = (i & 128) != 0 ? C34385DeX.LJLIL : interfaceC65784Pro5;
        interfaceC65784Pro7 = (i & 256) != 0 ? C34386DeY.LJLIL : interfaceC65784Pro7;
        if ((i & 512) != 0) {
            cancelDownloading = C34367DeF.LJLIL;
        } else {
            cancelDownloading = null;
        }
        if ((i & 1024) != 0) {
            fetchFirst = C34368DeG.LJLIL;
        } else {
            fetchFirst = null;
        }
        categoryCount = (i & 2048) != 0 ? DII.LJLIL : categoryCount;
        supportLoadMore = (i & 4096) != 0 ? C34369DeH.LJLIL : supportLoadMore;
        optimizeForbidIcon = (i & FileUtils.BUFFER_SIZE) != 0 ? C34370DeI.LJLIL : optimizeForbidIcon;
        supportExploreIcon = (i & 16384) != 0 ? C34371DeJ.LJLIL : supportExploreIcon;
        if ((32768 & i) != 0) {
            showLeftCancelView = C34387DeZ.LJLIL;
        } else {
            showLeftCancelView = null;
        }
        if ((65536 & i) != 0) {
            showCenterCancelView = C34372DeK.LJLIL;
        } else {
            showCenterCancelView = null;
        }
        if ((131072 & i) != 0) {
            backgroundTransparent = C34373DeL.LJLIL;
        } else {
            backgroundTransparent = null;
        }
        if ((262144 & i) != 0) {
            hideFakeShadow = C34374DeM.LJLIL;
        } else {
            hideFakeShadow = null;
        }
        if ((524288 & i) != 0) {
            hideFavoriteAndMoreBtn = C34376DeO.LJLIL;
        } else {
            hideFavoriteAndMoreBtn = null;
        }
        if ((1048576 & i) != 0) {
            hideRecentUsedEffects = C34388Dea.LJLIL;
        } else {
            hideRecentUsedEffects = null;
        }
        aqS172S0100000_64 = (2097152 & i) != 0 ? null : aqS172S0100000_64;
        aqS172S0100000_63 = (4194304 & i) != 0 ? null : aqS172S0100000_63;
        disableSmoothScrollOnLoad = (i & 8388608) != 0 ? C34377DeP.LJLIL : disableSmoothScrollOnLoad;
        InterfaceC65784Pro<Boolean> showStickerName = interfaceC65784Pro8;
        o.LJIIIZ(showStickerName, "showStickerName");
        InterfaceC65784Pro<Boolean> showMoreText = interfaceC65784Pro4;
        o.LJIIIZ(showMoreText, "showMoreText");
        o.LJIIIZ(cancelOptimize, "cancelOptimize");
        InterfaceC65784Pro<Boolean> scrollHideTools = interfaceC65784Pro3;
        o.LJIIIZ(scrollHideTools, "scrollHideTools");
        InterfaceC65784Pro<Boolean> multiStickerOptimize = interfaceC65784Pro2;
        o.LJIIIZ(multiStickerOptimize, "multiStickerOptimize");
        InterfaceC65784Pro<Boolean> shootOptimize = interfaceC65784Pro;
        o.LJIIIZ(shootOptimize, "shootOptimize");
        InterfaceC65784Pro<Boolean> uploadStickerListOnShow = interfaceC65784Pro6;
        o.LJIIIZ(uploadStickerListOnShow, "uploadStickerListOnShow");
        InterfaceC65784Pro<Boolean> showFavouriteEffectList = interfaceC65784Pro5;
        o.LJIIIZ(showFavouriteEffectList, "showFavouriteEffectList");
        InterfaceC65784Pro<Boolean> supportCancel = interfaceC65784Pro7;
        o.LJIIIZ(supportCancel, "supportCancel");
        o.LJIIIZ(cancelDownloading, "cancelDownloading");
        o.LJIIIZ(fetchFirst, "fetchFirst");
        o.LJIIIZ(categoryCount, "categoryCount");
        o.LJIIIZ(supportLoadMore, "supportLoadMore");
        o.LJIIIZ(optimizeForbidIcon, "optimizeForbidIcon");
        o.LJIIIZ(supportExploreIcon, "supportExploreIcon");
        o.LJIIIZ(showLeftCancelView, "showLeftCancelView");
        o.LJIIIZ(showCenterCancelView, "showCenterCancelView");
        o.LJIIIZ(backgroundTransparent, "backgroundTransparent");
        o.LJIIIZ(hideFakeShadow, "hideFakeShadow");
        o.LJIIIZ(hideFavoriteAndMoreBtn, "hideFavoriteAndMoreBtn");
        o.LJIIIZ(hideRecentUsedEffects, "hideRecentUsedEffects");
        o.LJIIIZ(disableSmoothScrollOnLoad, "disableSmoothScrollOnLoad");
        this.LIZ = interfaceC65784Pro8;
        this.LIZIZ = interfaceC65784Pro4;
        this.LIZJ = cancelOptimize;
        this.LIZLLL = interfaceC65784Pro3;
        this.LJ = interfaceC65784Pro2;
        this.LJFF = interfaceC65784Pro;
        this.LJI = interfaceC65784Pro6;
        this.LJII = interfaceC65784Pro5;
        this.LJIIIIZZ = interfaceC65784Pro7;
        this.LJIIIZ = cancelDownloading;
        this.LJIIJ = fetchFirst;
        this.LJIIJJI = categoryCount;
        this.LJIIL = supportLoadMore;
        this.LJIILIIL = optimizeForbidIcon;
        this.LJIILJJIL = supportExploreIcon;
        this.LJIILL = showLeftCancelView;
        this.LJIILLIIL = showCenterCancelView;
        this.LJIIZILJ = backgroundTransparent;
        this.LJIJ = hideFakeShadow;
        this.LJIJI = hideFavoriteAndMoreBtn;
        this.LJIJJ = hideRecentUsedEffects;
        this.LJIJJLI = aqS172S0100000_64;
        this.LJIL = aqS172S0100000_63;
        this.LJJ = disableSmoothScrollOnLoad;
    }
}
