package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83202Wl4 {
    public final InterfaceC83142Wk6 LIZ;
    public final C83207Wl9 LIZIZ;

    public final void LIZ() {
        ComposerBeauty composerBeauty;
        ComposerBeauty composerBeauty2;
        C34K c34k = new C34K();
        c34k.element = true;
        List<BeautyCategory> M7 = this.LIZ.M7();
        ArrayList arrayList = new ArrayList();
        for (BeautyCategory beautyCategory : M7) {
            if (beautyCategory.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(beautyCategory);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (true) {
            ComposerBeauty composerBeauty3 = null;
            if (!it.hasNext()) {
                break;
            }
            BeautyCategory beautyCategory2 = (BeautyCategory) it.next();
            Iterator<ComposerBeauty> it2 = beautyCategory2.getBeautyList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ComposerBeauty next = it2.next();
                if (next.getExtra().getDefault()) {
                    composerBeauty3 = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty4 = composerBeauty3;
            if (composerBeauty4 != null) {
                if (!composerBeauty4.getSelected()) {
                    z = false;
                }
            } else if (!((ComposerBeauty) ListProtector.get(beautyCategory2.getBeautyList(), 0)).getSelected()) {
                z = false;
            }
        }
        Iterator<BeautyCategory> it3 = this.LIZ.M7().iterator();
        while (it3.hasNext()) {
            List<ComposerBeauty> beautyList = it3.next().getBeautyList();
            ArrayList arrayList2 = new ArrayList();
            for (ComposerBeauty composerBeauty5 : beautyList) {
                if (composerBeauty5.isCollectionType()) {
                    arrayList2.add(composerBeauty5);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ComposerBeauty composerBeauty6 = (ComposerBeauty) it4.next();
                List<ComposerBeauty> childList = composerBeauty6.getChildList();
                if (childList != null) {
                    Iterator<ComposerBeauty> it5 = childList.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            composerBeauty2 = it5.next();
                            if (composerBeauty2.getExtra().getDefault()) {
                                break;
                            }
                        } else {
                            composerBeauty2 = null;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty7 = composerBeauty2;
                    if (composerBeauty7 != null) {
                        if (!composerBeauty7.getSelected()) {
                            z = false;
                        }
                    }
                }
                List<ComposerBeauty> childList2 = composerBeauty6.getChildList();
                if (childList2 != null && (composerBeauty = (ComposerBeauty) ListProtector.get(childList2, 0)) != null && !composerBeauty.getSelected()) {
                    z = false;
                }
            }
        }
        AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14(this, c34k, 26);
        Iterator<BeautyCategory> it6 = this.LIZ.M7().iterator();
        while (it6.hasNext()) {
            for (ComposerBeauty composerBeauty8 : it6.next().getBeautyList()) {
                boolean isCollectionType = composerBeauty8.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList3 = composerBeauty8.getChildList();
                    if (childList3 != null) {
                        Iterator<ComposerBeauty> it7 = childList3.iterator();
                        while (it7.hasNext()) {
                            aqS145S0200000_14.LIZ$3(it7.next());
                        }
                    }
                } else if (!isCollectionType) {
                    aqS145S0200000_14.LIZ$3(composerBeauty8);
                }
            }
        }
        if (z && c34k.element) {
            this.LIZIZ.getRlClearContainer().setAlpha(0.5f);
            this.LIZIZ.getRlClearContainer().setClickable(false);
        } else {
            this.LIZIZ.getRlClearContainer().setAlpha(1.0f);
            this.LIZIZ.getRlClearContainer().setClickable(true);
        }
    }

    public final void LIZJ() {
        ComposerBeauty composerBeauty;
        ComposerBeauty composerBeauty2;
        ComposerBeauty composerBeauty3;
        boolean z;
        ComposerBeauty composerBeauty4;
        boolean z2;
        ComposerBeauty composerBeauty5;
        ComposerBeauty composerBeauty6;
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 320);
        Iterator<BeautyCategory> it = this.LIZ.M7().iterator();
        while (it.hasNext()) {
            for (ComposerBeauty composerBeauty7 : it.next().getBeautyList()) {
                boolean isCollectionType = composerBeauty7.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = composerBeauty7.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            aqS180S0100000_14.LIZ$32(it2.next());
                        }
                    }
                } else if (!isCollectionType) {
                    aqS180S0100000_14.LIZ$32(composerBeauty7);
                }
            }
        }
        C81017Vqv c81017Vqv = new C81017Vqv();
        Iterator<BeautyComposerInfo> it3 = this.LIZ.z7().iterator();
        while (it3.hasNext()) {
            c81017Vqv.add(it3.next());
        }
        AqS180S0100000_14 aqS180S0100000_142 = new AqS180S0100000_14(this, 317);
        Iterator<T> it4 = c81017Vqv.iterator();
        while (it4.hasNext()) {
            String str = ((BeautyComposerInfo) it4.next()).effectId;
            Iterator<BeautyCategory> it5 = this.LIZ.M7().iterator();
            while (it5.hasNext()) {
                Iterator<ComposerBeauty> it6 = it5.next().getBeautyList().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        composerBeauty6 = it6.next();
                        if (o.LJ(composerBeauty6.getEffect().getEffectId(), str)) {
                            break;
                        }
                    } else {
                        composerBeauty6 = null;
                        break;
                    }
                }
                ComposerBeauty composerBeauty8 = composerBeauty6;
                if (composerBeauty8 != null) {
                    aqS180S0100000_142.LIZ$30(composerBeauty8);
                }
            }
        }
        List<BeautyCategory> M7 = this.LIZ.M7();
        ArrayList arrayList = new ArrayList();
        for (BeautyCategory beautyCategory : M7) {
            if (beautyCategory.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(beautyCategory);
            }
        }
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            BeautyCategory beautyCategory2 = (BeautyCategory) it7.next();
            Iterator<ComposerBeauty> it8 = beautyCategory2.getBeautyList().iterator();
            while (true) {
                if (it8.hasNext()) {
                    composerBeauty5 = it8.next();
                    ComposerBeauty composerBeauty9 = composerBeauty5;
                    if (composerBeauty9.getExtra().getDefault() && composerBeauty9.getEnable()) {
                        break;
                    }
                } else {
                    composerBeauty5 = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty10 = composerBeauty5;
            if (composerBeauty10 != null) {
                LIZLLL(composerBeauty10, beautyCategory2.getBeautyList());
                this.LIZ.N7(composerBeauty10, new C83251Wlr(this));
            } else {
                List<ComposerBeauty> beautyList = beautyCategory2.getBeautyList();
                if (beautyList != null && !beautyList.isEmpty()) {
                    LIZLLL((ComposerBeauty) ListProtector.get(beautyList, 0), beautyCategory2.getBeautyList());
                    this.LIZ.N7((ComposerBeauty) ListProtector.get(beautyList, 0), new C83251Wlr(this));
                }
            }
        }
        Iterator<BeautyCategory> it9 = this.LIZ.M7().iterator();
        while (it9.hasNext()) {
            List<ComposerBeauty> beautyList2 = it9.next().getBeautyList();
            ArrayList arrayList2 = new ArrayList();
            for (ComposerBeauty composerBeauty11 : beautyList2) {
                if (composerBeauty11.isCollectionType()) {
                    arrayList2.add(composerBeauty11);
                }
            }
            Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                ComposerBeauty composerBeauty12 = (ComposerBeauty) it10.next();
                List<ComposerBeauty> childList2 = composerBeauty12.getChildList();
                if (childList2 != null) {
                    Iterator<ComposerBeauty> it11 = childList2.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            composerBeauty4 = it11.next();
                            ComposerBeauty composerBeauty13 = composerBeauty4;
                            if (composerBeauty13.getExtra().getDefault() && composerBeauty13.getEnable()) {
                                break;
                            }
                        } else {
                            composerBeauty4 = null;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty14 = composerBeauty4;
                    if (composerBeauty14 != null) {
                        List<ComposerBeauty> childList3 = composerBeauty12.getChildList();
                        if (childList3 != null) {
                            for (ComposerBeauty composerBeauty15 : childList3) {
                                if (o.LJ(composerBeauty14, composerBeauty15) && composerBeauty15.getEnable()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                composerBeauty15.setSelected(z2);
                            }
                        }
                        if (composerBeauty14.getSelected()) {
                            this.LIZ.y7(composerBeauty14);
                            this.LIZ.X7(composerBeauty14);
                            this.LIZIZ.setCurSelectAlbumBeauty(composerBeauty14);
                        }
                        aqS180S0100000_142.LIZ$30(composerBeauty14);
                    }
                }
                List<ComposerBeauty> childList4 = composerBeauty12.getChildList();
                if (childList4 != null && (!childList4.isEmpty())) {
                    ComposerBeauty composerBeauty16 = (ComposerBeauty) ListProtector.get(childList4, 0);
                    List<ComposerBeauty> childList5 = composerBeauty12.getChildList();
                    if (childList5 != null) {
                        for (ComposerBeauty composerBeauty17 : childList5) {
                            if (o.LJ(composerBeauty16, composerBeauty17) && composerBeauty17.getEnable()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            composerBeauty17.setSelected(z);
                        }
                    }
                    if (composerBeauty16.getSelected()) {
                        this.LIZ.y7(composerBeauty16);
                        this.LIZ.X7(composerBeauty16);
                        this.LIZIZ.setCurSelectAlbumBeauty(composerBeauty16);
                    }
                    aqS180S0100000_142.LIZ$30(composerBeauty16);
                }
            }
        }
        AqS180S0100000_14 aqS180S0100000_143 = new AqS180S0100000_14(this, 319);
        C83207Wl9 c83207Wl9 = this.LIZIZ;
        boolean z3 = c83207Wl9.LLIFFJFJJ;
        if (z3) {
            Iterator<ComposerBeauty> it12 = c83207Wl9.getAlbumAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it12.hasNext()) {
                    composerBeauty3 = it12.next();
                    if (o.LJ(composerBeauty3, this.LIZIZ.getCurSelectAlbumBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty3 = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty18 = composerBeauty3;
            if (composerBeauty18 != null) {
                aqS180S0100000_143.LIZ$31(composerBeauty18);
            }
        } else if (!z3) {
            Iterator<ComposerBeauty> it13 = c83207Wl9.getCategoryAdapter().LJLILLLLZI.iterator();
            while (true) {
                if (it13.hasNext()) {
                    composerBeauty = it13.next();
                    if (o.LJ(composerBeauty, this.LIZIZ.getCurSelectBeauty())) {
                        break;
                    }
                } else {
                    composerBeauty = null;
                    break;
                }
            }
            ComposerBeauty composerBeauty19 = composerBeauty;
            if (composerBeauty19 != null) {
                aqS180S0100000_143.LIZ$31(composerBeauty19);
                int indexOf = this.LIZIZ.getCategoryAdapter().LJLILLLLZI.indexOf(composerBeauty19);
                if (indexOf >= 0 && indexOf < this.LIZIZ.getCategoryAdapter().LJLILLLLZI.size()) {
                    this.LIZIZ.getCategoryAdapter().LJLLLLLL(composerBeauty19);
                }
            }
        }
        Iterator<BeautyCategory> it14 = this.LIZ.M7().iterator();
        while (it14.hasNext()) {
            for (ComposerBeauty composerBeauty20 : it14.next().getBeautyList()) {
                boolean isCollectionType2 = composerBeauty20.isCollectionType();
                if (isCollectionType2) {
                    List<ComposerBeauty> childList6 = composerBeauty20.getChildList();
                    if (childList6 != null) {
                        Iterator<ComposerBeauty> it15 = childList6.iterator();
                        while (true) {
                            if (it15.hasNext()) {
                                composerBeauty2 = it15.next();
                                if (composerBeauty2.getSelected()) {
                                    break;
                                }
                            } else {
                                composerBeauty2 = null;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty21 = composerBeauty2;
                        if (composerBeauty21 != null) {
                            this.LIZ.X7(composerBeauty21);
                        }
                    }
                } else if (!isCollectionType2) {
                    this.LIZ.X7(composerBeauty20);
                    this.LIZIZ.getCategoryAdapter().notifyDataSetChanged();
                }
            }
        }
        LIZ();
        C83207Wl9 c83207Wl92 = this.LIZIZ;
        if (c83207Wl92.LLIL.LIZLLL) {
            C80371VgV swEnableBeauty = c83207Wl92.LL;
            o.LJIIIIZZ(swEnableBeauty, "swEnableBeauty");
            if (!swEnableBeauty.LJLJLJ) {
                C80371VgV swEnableBeauty2 = c83207Wl92.LL;
                o.LJIIIIZZ(swEnableBeauty2, "swEnableBeauty");
                swEnableBeauty2.setChecked(true);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        ComposerBeauty composerBeauty;
        Iterator<BeautyCategory> it = this.LIZ.M7().iterator();
        while (it.hasNext()) {
            for (ComposerBeauty composerBeauty2 : it.next().getBeautyList()) {
                boolean isCollectionType = composerBeauty2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = composerBeauty2.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it2 = childList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                composerBeauty = it2.next();
                                if (composerBeauty.getSelected()) {
                                    break;
                                }
                            } else {
                                composerBeauty = null;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty3 = composerBeauty;
                        if (composerBeauty3 != null) {
                            this.LIZ.Z7(composerBeauty3, z);
                        }
                    }
                } else if (!isCollectionType) {
                    this.LIZ.Z7(composerBeauty2, z);
                    this.LIZIZ.getCategoryAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public C83202Wl4(InterfaceC83142Wk6 source, C83207Wl9 beautyViewImpl) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(beautyViewImpl, "beautyViewImpl");
        this.LIZ = source;
        this.LIZIZ = beautyViewImpl;
    }

    public final void LIZLLL(ComposerBeauty composerBeauty, List<ComposerBeauty> list) {
        String str;
        Iterator<ComposerBeauty> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ComposerBeauty next = it.next();
            if (!o.LJ(composerBeauty, next) || !composerBeauty.getEnable()) {
                z = false;
            }
            next.setSelected(z);
        }
        String categoryId = composerBeauty.getCategoryId();
        ComposerBeauty curSelectBeauty = this.LIZIZ.getCurSelectBeauty();
        if (curSelectBeauty != null) {
            str = curSelectBeauty.getCategoryId();
        } else {
            str = null;
        }
        if (o.LJ(categoryId, str)) {
            if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
                this.LIZIZ.LIZLLL(false);
            } else {
                this.LIZIZ.LIZLLL(true);
            }
            this.LIZIZ.setCurSelectBeauty(composerBeauty);
        }
        if (composerBeauty.getSelected()) {
            this.LIZ.V7(composerBeauty);
            this.LIZ.X7(composerBeauty);
            this.LIZIZ.getCategoryAdapter().notifyDataSetChanged();
        }
    }
}
