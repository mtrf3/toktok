package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.Iterator;
import kotlin.jvm.internal.AqS63S0201000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83201Wl3 implements InterfaceC81231VuN {
    public final /* synthetic */ C83199Wl1 LIZ;
    public final /* synthetic */ C81227VuJ LIZIZ;

    @Override // X.InterfaceC81231VuN
    public final void LIZJ() {
    }

    @Override // X.InterfaceC81231VuN
    public final void LIZLLL() {
        ComposerBeauty composerBeauty;
        InterfaceC83233WlZ beautyOnInteractListener;
        ComposerBeauty composerBeauty2;
        InterfaceC83233WlZ beautyOnInteractListener2;
        C83199Wl1 c83199Wl1 = this.LIZ;
        boolean z = c83199Wl1.LIZIZ.LLIFFJFJJ;
        ComposerBeauty composerBeauty3 = null;
        if (z) {
            c83199Wl1.LIZJ();
            Iterator<ComposerBeauty> it = c83199Wl1.LIZIZ.getAlbumAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it.hasNext()) {
                    composerBeauty2 = it.next();
                    if (o.LJ(composerBeauty2, c83199Wl1.LIZIZ.getCurSelectAlbumBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty2 = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty4 = composerBeauty2;
            if (composerBeauty4 != null && (beautyOnInteractListener2 = c83199Wl1.LIZIZ.getBeautyOnInteractListener()) != null) {
                beautyOnInteractListener2.LJFF(composerBeauty4, C83199Wl1.LIZ(composerBeauty4));
            }
        } else if (!z) {
            c83199Wl1.LIZJ();
            Iterator<ComposerBeauty> it2 = c83199Wl1.LIZIZ.getCategoryAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    composerBeauty = it2.next();
                    if (o.LJ(composerBeauty, c83199Wl1.LIZIZ.getCurSelectBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty5 = composerBeauty;
            if (composerBeauty5 != null && (beautyOnInteractListener = c83199Wl1.LIZIZ.getBeautyOnInteractListener()) != null) {
                beautyOnInteractListener.LJFF(composerBeauty5, C83199Wl1.LIZ(composerBeauty5));
            }
        }
        C83199Wl1 c83199Wl12 = this.LIZ;
        C83207Wl9 c83207Wl9 = c83199Wl12.LIZIZ;
        boolean z2 = c83207Wl9.LLIFFJFJJ;
        if (z2) {
            Iterator<ComposerBeauty> it3 = c83207Wl9.getAlbumAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ComposerBeauty next = it3.next();
                if (o.LJ(next, c83199Wl12.LIZIZ.getCurSelectAlbumBeauty())) {
                    composerBeauty3 = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty6 = composerBeauty3;
            if (composerBeauty6 != null) {
                c83199Wl12.LIZLLL(composerBeauty6, true, false);
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        Iterator<ComposerBeauty> it4 = c83207Wl9.getCategoryAdapter().LJLILLLLZI.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            ComposerBeauty next2 = it4.next();
            if (o.LJ(next2, c83199Wl12.LIZIZ.getCurSelectBeauty())) {
                composerBeauty3 = next2;
                break;
            }
        }
        ComposerBeauty composerBeauty7 = composerBeauty3;
        if (composerBeauty7 == null) {
            return;
        }
        c83199Wl12.LIZLLL(composerBeauty7, true, false);
    }

    @Override // X.InterfaceC81231VuN
    public final void LIZ(int i) {
        ComposerBeauty composerBeauty;
        InterfaceC83233WlZ beautyOnInteractListener;
        ComposerBeauty composerBeauty2;
        InterfaceC83233WlZ beautyOnInteractListener2;
        C83199Wl1 c83199Wl1 = this.LIZ;
        C81227VuJ c81227VuJ = this.LIZIZ;
        C83264Wm4 c83264Wm4 = c83199Wl1.LIZIZ.getViewConfig().LJII;
        int percent = c81227VuJ.getPercent();
        c83264Wm4.getClass();
        C83199Wl1 c83199Wl12 = this.LIZ;
        boolean z = c83199Wl12.LIZIZ.LLIFFJFJJ;
        ComposerBeauty composerBeauty3 = null;
        if (z) {
            c83199Wl12.LIZJ();
            Iterator<ComposerBeauty> it = c83199Wl12.LIZIZ.getAlbumAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it.hasNext()) {
                    composerBeauty2 = it.next();
                    if (o.LJ(composerBeauty2, c83199Wl12.LIZIZ.getCurSelectAlbumBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty2 = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty4 = composerBeauty2;
            if (composerBeauty4 != null && (beautyOnInteractListener2 = c83199Wl12.LIZIZ.getBeautyOnInteractListener()) != null) {
                beautyOnInteractListener2.LJ(composerBeauty4, C83199Wl1.LIZ(composerBeauty4));
            }
        } else if (!z) {
            c83199Wl12.LIZJ();
            Iterator<ComposerBeauty> it2 = c83199Wl12.LIZIZ.getCategoryAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    composerBeauty = it2.next();
                    if (o.LJ(composerBeauty, c83199Wl12.LIZIZ.getCurSelectBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty5 = composerBeauty;
            if (composerBeauty5 != null && (beautyOnInteractListener = c83199Wl12.LIZIZ.getBeautyOnInteractListener()) != null) {
                beautyOnInteractListener.LJ(composerBeauty5, C83199Wl1.LIZ(composerBeauty5));
            }
        }
        C83199Wl1 c83199Wl13 = this.LIZ;
        C81227VuJ c81227VuJ2 = this.LIZIZ;
        c83199Wl13.getClass();
        AqS63S0201000_14 aqS63S0201000_14 = new AqS63S0201000_14(c83199Wl13, c81227VuJ2, percent, 2);
        C83207Wl9 c83207Wl9 = c83199Wl13.LIZIZ;
        boolean z2 = c83207Wl9.LLIFFJFJJ;
        if (z2) {
            Iterator<ComposerBeauty> it3 = c83207Wl9.getAlbumAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ComposerBeauty next = it3.next();
                if (o.LJ(next, c83199Wl13.LIZIZ.getCurSelectAlbumBeauty())) {
                    composerBeauty3 = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty6 = composerBeauty3;
            if (composerBeauty6 != null) {
                aqS63S0201000_14.LIZ$0(composerBeauty6);
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        Iterator<ComposerBeauty> it4 = c83207Wl9.getCategoryAdapter().LJLILLLLZI.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            ComposerBeauty next2 = it4.next();
            if (o.LJ(next2, c83199Wl13.LIZIZ.getCurSelectBeauty())) {
                composerBeauty3 = next2;
                break;
            }
        }
        ComposerBeauty composerBeauty7 = composerBeauty3;
        if (composerBeauty7 == null) {
            return;
        }
        aqS63S0201000_14.LIZ$0(composerBeauty7);
    }

    @Override // X.InterfaceC81231VuN
    public final void LIZIZ(int i) {
        ComposerBeauty composerBeauty;
        InterfaceC83233WlZ beautyOnInteractListener;
        ComposerBeauty composerBeauty2;
        InterfaceC83233WlZ beautyOnInteractListener2;
        C83199Wl1 c83199Wl1 = this.LIZ;
        boolean z = c83199Wl1.LIZIZ.LLIFFJFJJ;
        ComposerBeauty composerBeauty3 = null;
        if (z) {
            c83199Wl1.LIZJ();
            Iterator<ComposerBeauty> it = c83199Wl1.LIZIZ.getAlbumAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it.hasNext()) {
                    composerBeauty2 = it.next();
                    if (o.LJ(composerBeauty2, c83199Wl1.LIZIZ.getCurSelectAlbumBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty2 = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty4 = composerBeauty2;
            if (composerBeauty4 != null && (beautyOnInteractListener2 = c83199Wl1.LIZIZ.getBeautyOnInteractListener()) != null) {
                beautyOnInteractListener2.LIZ(composerBeauty4, i, C83199Wl1.LIZ(composerBeauty4));
            }
        } else if (!z) {
            c83199Wl1.LIZJ();
            Iterator<ComposerBeauty> it2 = c83199Wl1.LIZIZ.getCategoryAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    composerBeauty = it2.next();
                    if (o.LJ(composerBeauty, c83199Wl1.LIZIZ.getCurSelectBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty5 = composerBeauty;
            if (composerBeauty5 != null && (beautyOnInteractListener = c83199Wl1.LIZIZ.getBeautyOnInteractListener()) != null) {
                beautyOnInteractListener.LIZ(composerBeauty5, i, C83199Wl1.LIZ(composerBeauty5));
            }
        }
        C83199Wl1 c83199Wl12 = this.LIZ;
        C81227VuJ c81227VuJ = this.LIZIZ;
        c83199Wl12.getClass();
        AqS63S0201000_14 aqS63S0201000_14 = new AqS63S0201000_14(c83199Wl12, c81227VuJ, i, 3);
        C83207Wl9 c83207Wl9 = c83199Wl12.LIZIZ;
        boolean z2 = c83207Wl9.LLIFFJFJJ;
        if (z2) {
            Iterator<ComposerBeauty> it3 = c83207Wl9.getAlbumAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ComposerBeauty next = it3.next();
                if (o.LJ(next, c83199Wl12.LIZIZ.getCurSelectAlbumBeauty())) {
                    composerBeauty3 = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty6 = composerBeauty3;
            if (composerBeauty6 != null) {
                aqS63S0201000_14.LIZ$1(composerBeauty6);
                c83199Wl12.LIZ.X7(composerBeauty6);
            }
        } else if (!z2) {
            Iterator<ComposerBeauty> it4 = c83207Wl9.getCategoryAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                ComposerBeauty next2 = it4.next();
                if (o.LJ(next2, c83199Wl12.LIZIZ.getCurSelectBeauty())) {
                    composerBeauty3 = next2;
                    break;
                }
            }
            ComposerBeauty composerBeauty7 = composerBeauty3;
            if (composerBeauty7 != null) {
                aqS63S0201000_14.LIZ$1(composerBeauty7);
                c83199Wl12.LIZ.X7(composerBeauty7);
                int indexOf = c83199Wl12.LIZIZ.getCategoryAdapter().LJLILLLLZI.indexOf(composerBeauty7);
                if (indexOf >= 0 && indexOf < c83199Wl12.LIZIZ.getCategoryAdapter().LJLILLLLZI.size()) {
                    c83199Wl12.LIZIZ.getCategoryAdapter().LJLLLLLL(composerBeauty7);
                }
            }
        }
        if (c83199Wl12.LIZIZ.getViewConfig().LIZLLL) {
            C80371VgV swEnableBeauty = c83199Wl12.LIZIZ.getSwEnableBeauty();
            o.LJIIIIZZ(swEnableBeauty, "beautyViewImpl.swEnableBeauty");
            if (!swEnableBeauty.LJLJLJ) {
                C80371VgV swEnableBeauty2 = c83199Wl12.LIZIZ.getSwEnableBeauty();
                o.LJIIIIZZ(swEnableBeauty2, "beautyViewImpl.swEnableBeauty");
                swEnableBeauty2.setChecked(true);
                InterfaceC83144Wk8 beautyViewListener = c83199Wl12.LIZIZ.getBeautyViewListener();
                if (beautyViewListener != null) {
                    beautyViewListener.LIZJ(true);
                }
            }
        }
        c83199Wl12.LIZIZ.getResetHelper().LIZ();
    }

    public C83201Wl3(C83199Wl1 c83199Wl1, C81227VuJ c81227VuJ) {
        this.LIZ = c83199Wl1;
        this.LIZIZ = c81227VuJ;
    }
}
