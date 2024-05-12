package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wkx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83195Wkx {
    public final InterfaceC83142Wk6 LIZ;
    public InterfaceC83144Wk8 LIZIZ;
    public InterfaceC83233WlZ LIZJ;
    public final C50765Jw9 LIZLLL;
    public final C68249QqT LJ;

    public final boolean LIZ() {
        InterfaceC83197Wkz interfaceC83197Wkz = (InterfaceC83197Wkz) this.LIZLLL.LIZJ(InterfaceC83197Wkz.class);
        if (interfaceC83197Wkz != null) {
            return interfaceC83197Wkz.LIZIZ();
        }
        return false;
    }

    public final ComposerBeauty LIZIZ() {
        boolean z;
        InterfaceC83247Wln interfaceC83247Wln = (InterfaceC83247Wln) this.LIZLLL.LIZJ(InterfaceC83247Wln.class);
        InterfaceC83247Wln interfaceC83247Wln2 = (InterfaceC83247Wln) this.LIZLLL.LIZJ(InterfaceC83247Wln.class);
        if (interfaceC83247Wln2 != null) {
            z = interfaceC83247Wln2.LJI();
        } else {
            z = false;
        }
        if (z) {
            if (interfaceC83247Wln == null) {
                return null;
            }
            return interfaceC83247Wln.LJIIJ();
        }
        if (interfaceC83247Wln == null) {
            return null;
        }
        return interfaceC83247Wln.LJ();
    }

    public final boolean LJ() {
        InterfaceC83197Wkz interfaceC83197Wkz = (InterfaceC83197Wkz) this.LIZLLL.LIZJ(InterfaceC83197Wkz.class);
        if (interfaceC83197Wkz != null) {
            return interfaceC83197Wkz.LIZLLL();
        }
        return true;
    }

    public static List LIZJ(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(items, 10));
            Iterator<ComposerBeautyExtraBeautify.ItemsBean> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTag());
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final void LJFF(int i, C81227VuJ c81227VuJ, HashMap hashMap, ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            return;
        }
        Iterator<ComposerBeautyExtraBeautify.ItemsBean> it = items.iterator();
        while (it.hasNext()) {
            LIZLLL(composerBeauty, it.next(), c81227VuJ, i, composerBeauty);
        }
    }

    public C83195Wkx(C50765Jw9 apiManager, C68249QqT beautyBuriedHelper, InterfaceC83142Wk6 source, InterfaceC83144Wk8 interfaceC83144Wk8, InterfaceC83233WlZ interfaceC83233WlZ) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(apiManager, "apiManager");
        o.LJIIIZ(beautyBuriedHelper, "beautyBuriedHelper");
        this.LIZ = source;
        this.LIZIZ = interfaceC83144Wk8;
        this.LIZJ = interfaceC83233WlZ;
        this.LIZLLL = apiManager;
        this.LJ = beautyBuriedHelper;
    }

    public final void LIZLLL(ComposerBeauty composerBeauty, ComposerBeautyExtraBeautify.ItemsBean itemsBean, C81227VuJ c81227VuJ, int i, ComposerBeauty composerBeauty2) {
        C81017Vqv<BeautyComposerInfo> c81017Vqv;
        boolean doubleDirection = itemsBean.getDoubleDirection();
        c81227VuJ.getMaxPercent();
        float LIZ = C83168WkW.LIZ(new C83169WkX(doubleDirection, itemsBean.getMax(), itemsBean.getMin(), 0.0f, i, 0.0f, 1868));
        this.LIZ.t7(composerBeauty2, itemsBean.getTag(), LIZ);
        C81017Vqv<BeautyComposerInfo> z7 = this.LIZ.z7();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(composerBeauty.getEffect().getUnzipPath());
        LIZ2.append(':');
        LIZ2.append(itemsBean.getTag());
        LIZ2.append(':');
        float f = LIZ / 100.0f;
        LIZ2.append(f);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        String extra = composerBeauty.getEffect().getExtra();
        if (extra == null) {
            extra = "";
        }
        z7.add(new BeautyComposerInfo(LIZIZ, extra, composerBeauty.getEffect().getEffectId(), (String) null, 24));
        if (C1DH.LJIJ(composerBeauty)) {
            this.LIZ.y7(composerBeauty2);
            this.LIZ.R7(composerBeauty2);
        } else {
            this.LIZ.V7(composerBeauty2);
            this.LIZ.F7(composerBeauty2);
        }
        if (composerBeauty2.getCategoryExtra() != null && (!o.LJ(r0.getParentId(), "null")) && (c81017Vqv = this.LIZ.q7().get(composerBeauty2.getCategoryExtra().getCategoryId())) != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(composerBeauty.getEffect().getUnzipPath());
            LIZ3.append(':');
            LIZ3.append(itemsBean.getTag());
            LIZ3.append(':');
            LIZ3.append(f);
            String LIZIZ2 = X1D.LIZIZ(LIZ3);
            String extra2 = composerBeauty.getEffect().getExtra();
            if (extra2 == null) {
                extra2 = "";
            }
            c81017Vqv.add(new BeautyComposerInfo(LIZIZ2, extra2, composerBeauty.getEffect().getEffectId(), (String) null, 24));
        }
    }
}
