package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS101S0101000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83200Wl2 implements InterfaceC81231VuN {
    public final /* synthetic */ C83198Wl0 LIZ;
    public final /* synthetic */ C81227VuJ LIZIZ;

    @Override // X.InterfaceC81231VuN
    public final void LIZJ() {
    }

    @Override // X.InterfaceC81231VuN
    public final void LIZLLL() {
        String str;
        InterfaceC83233WlZ interfaceC83233WlZ;
        C83198Wl0 c83198Wl0 = this.LIZ;
        C81227VuJ c81227VuJ = this.LIZIZ;
        C83195Wkx c83195Wkx = c83198Wl0.LJIIIZ;
        c83198Wl0.LJ();
        ComposerBeautyExtraBeautify.ItemsBean itemsBean = c83198Wl0.LJFF.get(c81227VuJ);
        if (itemsBean == null || (str = itemsBean.getTag()) == null) {
            str = "";
        }
        C47261Igj.LJJIJ(str);
        c83195Wkx.getClass();
        ComposerBeauty LIZIZ = c83195Wkx.LIZIZ();
        if (LIZIZ != null && (interfaceC83233WlZ = c83195Wkx.LIZJ) != null) {
            interfaceC83233WlZ.LJFF(LIZIZ, C83195Wkx.LIZJ(LIZIZ));
        }
        C83198Wl0 c83198Wl02 = this.LIZ;
        ComposerBeauty LIZIZ2 = c83198Wl02.LJIIIZ.LIZIZ();
        if (LIZIZ2 != null) {
            C83269Wm9.LIZ(c83198Wl02, LIZIZ2, true, 8);
        }
    }

    @Override // X.InterfaceC81231VuN
    public final void LIZ(int i) {
        String str;
        Boolean bool;
        InterfaceC83233WlZ interfaceC83233WlZ;
        C83198Wl0 c83198Wl0 = this.LIZ;
        C81227VuJ c81227VuJ = this.LIZIZ;
        C83264Wm4 c83264Wm4 = c83198Wl0.LJIIIIZZ.LJII;
        int percent = c81227VuJ.getPercent();
        c83264Wm4.getClass();
        C83198Wl0 c83198Wl02 = this.LIZ;
        C81227VuJ c81227VuJ2 = this.LIZIZ;
        C83195Wkx c83195Wkx = c83198Wl02.LJIIIZ;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean = c83198Wl02.LJFF.get(c81227VuJ2);
        if (itemsBean == null || (str = itemsBean.getTag()) == null) {
            str = "";
        }
        List LJJIJ = C47261Igj.LJJIJ(str);
        c83195Wkx.getClass();
        ComposerBeauty LIZIZ = c83195Wkx.LIZIZ();
        if (LIZIZ != null && (interfaceC83233WlZ = c83195Wkx.LIZJ) != null) {
            interfaceC83233WlZ.LJ(LIZIZ, LJJIJ);
        }
        C83195Wkx c83195Wkx2 = this.LIZ.LJIIIZ;
        int maxPercent = this.LIZIZ.getMaxPercent();
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) c83195Wkx2.LIZLLL.LIZJ(InterfaceC83247Wln.class);
        AqS101S0101000_14 aqS101S0101000_14 = new AqS101S0101000_14(c83195Wkx2, percent, maxPercent, 2);
        ComposerBeauty composerBeauty = null;
        if (interfaceC83247Wln != null) {
            bool = Boolean.valueOf(interfaceC83247Wln.LJI());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            Iterator<ComposerBeauty> it = interfaceC83247Wln.LJIIIIZZ().LJLILLLLZI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ComposerBeauty next = it.next();
                if (o.LJ(next, interfaceC83247Wln.LJIIJ())) {
                    composerBeauty = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty2 = composerBeauty;
            if (composerBeauty2 != null) {
                aqS101S0101000_14.LIZ$0(composerBeauty2);
                return;
            }
            return;
        }
        if (!o.LJ(bool, Boolean.FALSE)) {
            return;
        }
        Iterator<ComposerBeauty> it2 = interfaceC83247Wln.LIZJ().LJLILLLLZI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ComposerBeauty next2 = it2.next();
            if (o.LJ(next2, interfaceC83247Wln.LJ())) {
                composerBeauty = next2;
                break;
            }
        }
        ComposerBeauty composerBeauty3 = composerBeauty;
        if (composerBeauty3 == null) {
            return;
        }
        aqS101S0101000_14.LIZ$0(composerBeauty3);
    }

    @Override // X.InterfaceC81231VuN
    public final void LIZIZ(int i) {
        String str;
        Boolean bool;
        C83222WlO LIZJ;
        InterfaceC83233WlZ interfaceC83233WlZ;
        C83198Wl0 c83198Wl0 = this.LIZ;
        C81227VuJ c81227VuJ = this.LIZIZ;
        C83195Wkx c83195Wkx = c83198Wl0.LJIIIZ;
        c83198Wl0.LJ();
        ComposerBeautyExtraBeautify.ItemsBean itemsBean = c83198Wl0.LJFF.get(c81227VuJ);
        if (itemsBean == null || (str = itemsBean.getTag()) == null) {
            str = "";
        }
        C47261Igj.LJJIJ(str);
        c83195Wkx.getClass();
        ComposerBeauty LIZIZ = c83195Wkx.LIZIZ();
        if (LIZIZ != null && (interfaceC83233WlZ = c83195Wkx.LIZJ) != null) {
            interfaceC83233WlZ.LIZ(LIZIZ, i, C83195Wkx.LIZJ(LIZIZ));
        }
        C83198Wl0 c83198Wl02 = this.LIZ;
        C83195Wkx c83195Wkx2 = c83198Wl02.LJIIIZ;
        C81227VuJ progressBar = this.LIZIZ;
        c83198Wl02.LJ();
        HashMap<C81227VuJ, ComposerBeautyExtraBeautify.ItemsBean> seekBar2Tag = this.LIZ.LJFF;
        c83195Wkx2.getClass();
        o.LJIIIZ(progressBar, "progressBar");
        o.LJIIIZ(seekBar2Tag, "seekBar2Tag");
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) c83195Wkx2.LIZLLL.LIZJ(InterfaceC83247Wln.class);
        ComposerBeauty composerBeauty = null;
        if (interfaceC83247Wln != null) {
            bool = Boolean.valueOf(interfaceC83247Wln.LJI());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            Iterator<ComposerBeauty> it = interfaceC83247Wln.LJIIIIZZ().LJLILLLLZI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ComposerBeauty next = it.next();
                if (o.LJ(next, interfaceC83247Wln.LJIIJ())) {
                    composerBeauty = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty2 = composerBeauty;
            if (composerBeauty2 != null) {
                c83195Wkx2.LJFF(i, progressBar, seekBar2Tag, composerBeauty2);
                c83195Wkx2.LIZ.X7(composerBeauty2);
                C68249QqT c68249QqT = c83195Wkx2.LJ;
                String selectedCategoryName = c83195Wkx2.LIZ.K7();
                c68249QqT.getClass();
                o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
                InterfaceC83246Wlm interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ;
                if (interfaceC83246Wlm != null) {
                    interfaceC83246Wlm.LIZ(composerBeauty2, selectedCategoryName);
                }
            }
        } else if (o.LJ(bool, Boolean.FALSE)) {
            Iterator<ComposerBeauty> it2 = interfaceC83247Wln.LIZJ().LJLILLLLZI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ComposerBeauty next2 = it2.next();
                if (o.LJ(next2, interfaceC83247Wln.LJ())) {
                    composerBeauty = next2;
                    break;
                }
            }
            ComposerBeauty composerBeauty3 = composerBeauty;
            if (composerBeauty3 != null) {
                c83195Wkx2.LJFF(i, progressBar, seekBar2Tag, composerBeauty3);
                c83195Wkx2.LIZ.X7(composerBeauty3);
                int indexOf = interfaceC83247Wln.LIZJ().LJLILLLLZI.indexOf(composerBeauty3);
                if (indexOf >= 0 && indexOf < interfaceC83247Wln.LIZJ().LJLILLLLZI.size()) {
                    interfaceC83247Wln.LIZJ().LJLLLLLL(composerBeauty3);
                }
                C68249QqT c68249QqT2 = c83195Wkx2.LJ;
                String selectedCategoryName2 = c83195Wkx2.LIZ.K7();
                c68249QqT2.getClass();
                o.LJIIIZ(selectedCategoryName2, "selectedCategoryName");
                InterfaceC83246Wlm interfaceC83246Wlm2 = (InterfaceC83246Wlm) c68249QqT2.LIZ;
                if (interfaceC83246Wlm2 != null) {
                    interfaceC83246Wlm2.LIZ(composerBeauty3, selectedCategoryName2);
                }
            }
        }
        InterfaceC83197Wkz interfaceC83197Wkz = (InterfaceC83197Wkz) c83195Wkx2.LIZLLL.LIZJ(InterfaceC83197Wkz.class);
        if (interfaceC83197Wkz != null) {
            interfaceC83197Wkz.LIZ();
        }
        InterfaceC83256Wlw interfaceC83256Wlw = (InterfaceC83256Wlw) c83195Wkx2.LIZLLL.LIZJ(InterfaceC83256Wlw.class);
        if (interfaceC83256Wlw != null) {
            interfaceC83256Wlw.LIZIZ();
        }
        if (interfaceC83247Wln != null && (LIZJ = interfaceC83247Wln.LIZJ()) != null) {
            interfaceC83247Wln.LIZ();
            Iterator it3 = ((ArrayList) LIZJ.LJLIL).iterator();
            while (it3.hasNext()) {
                C83277WmH c83277WmH = (C83277WmH) it3.next();
                if (c83277WmH instanceof C83278WmI) {
                    ((C83278WmI) c83277WmH).LIZIZ = false;
                }
            }
            LIZJ.notifyDataSetChanged();
        }
    }

    public C83200Wl2(C83198Wl0 c83198Wl0, C81227VuJ c81227VuJ) {
        this.LIZ = c83198Wl0;
        this.LIZIZ = c81227VuJ;
    }
}
