package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83203Wl5 {
    public final InterfaceC83142Wk6 LIZ;
    public InterfaceC83144Wk8 LIZIZ;
    public InterfaceC83233WlZ LIZJ;
    public final C68249QqT LIZLLL;
    public final C50765Jw9 LJ;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83203Wl5.LIZIZ():boolean");
    }

    public final void LIZLLL() {
        InterfaceC83233WlZ interfaceC83233WlZ = this.LIZJ;
        if (interfaceC83233WlZ != null) {
            interfaceC83233WlZ.LJIIIIZZ();
        }
        C68249QqT c68249QqT = this.LIZLLL;
        String selectedCategoryName = this.LIZ.K7();
        c68249QqT.getClass();
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
        InterfaceC83246Wlm interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ;
        if (interfaceC83246Wlm != null) {
            interfaceC83246Wlm.LJIIJJI("confirm", selectedCategoryName);
        }
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) this.LJ.LIZJ(InterfaceC83247Wln.class);
        if (interfaceC83247Wln != null) {
            interfaceC83247Wln.LJIIIZ();
        }
    }

    public final boolean LIZ(ComposerBeauty composerBeauty) {
        C34K c34k = new C34K();
        c34k.element = true;
        AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14(this, c34k, 23);
        boolean isCollectionType = composerBeauty.isCollectionType();
        if (isCollectionType) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it = childList.iterator();
                while (it.hasNext()) {
                    aqS145S0200000_14.LIZ$1(it.next());
                }
            }
        } else if (!isCollectionType) {
            aqS145S0200000_14.LIZ$1(composerBeauty);
        }
        return c34k.element;
    }

    public final void LJ(ComposerBeauty composerBeauty, Float f) {
        float floatValue;
        o.LJIIIZ(composerBeauty, "composerBeauty");
        this.LIZ.N7(composerBeauty, new C83257Wlx(this));
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            return;
        }
        for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
            if (this.LIZ.E7().LIZLLL(composerBeauty, false) && C1DH.LJIJI(composerBeauty)) {
                if (f != null) {
                    floatValue = f.floatValue();
                } else {
                    floatValue = Integer.valueOf(itemsBean.getValue()).floatValue();
                }
                InterfaceC83144Wk8 interfaceC83144Wk8 = this.LIZIZ;
                if (interfaceC83144Wk8 != null) {
                    interfaceC83144Wk8.LLLFF(composerBeauty.getEffect().getUnzipPath(), itemsBean.getTag(), floatValue / 100.0f);
                }
            }
        }
    }

    public static void LIZJ(C83203Wl5 c83203Wl5, ComposerBeauty it, List list) {
        String str;
        C83222WlO LIZJ;
        ComposerBeauty LJ;
        o.LJIIIZ(it, "it");
        o.LJIIIZ(list, "list");
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) c83203Wl5.LJ.LIZJ(InterfaceC83247Wln.class);
        InterfaceC83268Wm8 interfaceC83268Wm8 = (InterfaceC83268Wm8) c83203Wl5.LJ.LIZJ(InterfaceC83268Wm8.class);
        Iterator it2 = list.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            ComposerBeauty composerBeauty = (ComposerBeauty) it2.next();
            if (o.LJ(it, composerBeauty) && it.getEnable()) {
                z = true;
            }
            composerBeauty.setSelected(z);
        }
        String categoryId = it.getCategoryId();
        if (interfaceC83247Wln != null && (LJ = interfaceC83247Wln.LJ()) != null) {
            str = LJ.getCategoryId();
        } else {
            str = null;
        }
        if (o.LJ(categoryId, str)) {
            if (!it.getExtra().isNone() && it.getEnable()) {
                if (interfaceC83268Wm8 != null) {
                    interfaceC83268Wm8.LIZIZ(true);
                }
            } else if (interfaceC83268Wm8 != null) {
                interfaceC83268Wm8.LIZIZ(false);
            }
            if (interfaceC83247Wln != null) {
                interfaceC83247Wln.LJFF(it);
            }
        }
        if (it.getSelected()) {
            c83203Wl5.LIZ.V7(it);
            c83203Wl5.LIZ.F7(it);
            c83203Wl5.LIZ.X7(it);
            if (interfaceC83247Wln != null && (LIZJ = interfaceC83247Wln.LIZJ()) != null) {
                LIZJ.notifyDataSetChanged();
            }
        }
    }

    public C83203Wl5(InterfaceC83142Wk6 source, InterfaceC83144Wk8 interfaceC83144Wk8, InterfaceC83233WlZ interfaceC83233WlZ, C68249QqT c68249QqT, C50765Jw9 c50765Jw9, C83232WlY c83232WlY) {
        o.LJIIIZ(source, "source");
        this.LIZ = source;
        this.LIZIZ = interfaceC83144Wk8;
        this.LIZJ = interfaceC83233WlZ;
        this.LIZLLL = c68249QqT;
        this.LJ = c50765Jw9;
    }
}
