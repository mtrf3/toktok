package X;

import Y.IDComparatorS344S0100000_14;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$initComposerNodes$2$list$1", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.WjX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83107WjX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C81017Vqv<BeautyComposerInfo>>, Object> {
    public final /* synthetic */ C83150WkE LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83107WjX(C83150WkE c83150WkE, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c83150WkE;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83107WjX(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C81017Vqv<BeautyComposerInfo>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        C82942Wgs c82942Wgs;
        ComposerBeauty composerBeauty;
        ComposerBeauty composerBeauty2;
        boolean z;
        ComposerBeauty composerBeauty3;
        ComposerBeauty composerBeauty4;
        Object obj5;
        C141335gf.LIZJ(obj);
        C83150WkE c83150WkE = this.LJLIL;
        C83146WkA c83146WkA = c83150WkE.LJLJI;
        ArrayList arrayList = c83150WkE.LJLJJI;
        c83146WkA.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BeautyCategory) it.next()).setSelected(false);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            for (ComposerBeauty composerBeauty5 : ((BeautyCategory) it2.next()).getBeautyList()) {
                if (composerBeauty5.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty5.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it3 = childList.iterator();
                        while (it3.hasNext()) {
                            C83108WjY.LJLIL.LIZ(it3.next());
                        }
                    }
                    C83108WjY.LJLIL.LIZ(composerBeauty5);
                } else {
                    C83108WjY.LJLIL.LIZ(composerBeauty5);
                }
            }
        }
        String LIZLLL = c83146WkA.LJJIIZ.LIZLLL(c83146WkA.LJJIFFI);
        if (LIZLLL != null) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj5 = it4.next();
                    if (o.LJ(((BeautyCategory) obj5).getCategoryResponse().getId(), LIZLLL)) {
                        break;
                    }
                } else {
                    obj5 = null;
                    break;
                }
            }
            BeautyCategory beautyCategory = (BeautyCategory) obj5;
            if (beautyCategory != null) {
                beautyCategory.setSelected(true);
            } else {
                C82920WgW.LJLIL.invoke2((List<BeautyCategory>) arrayList);
            }
        } else {
            C82920WgW.LJLIL.invoke2((List<BeautyCategory>) arrayList);
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            BeautyCategory beautyCategory2 = (BeautyCategory) it5.next();
            if (beautyCategory2.getBeautyCategoryExtra().getExclusive()) {
                String LJIIIIZZ = c83146WkA.LJJIIZ.LJIIIIZZ(c83146WkA.LJJIFFI, beautyCategory2.getCategoryResponse().getId());
                if (LJIIIIZZ == null || LJIIIIZZ.length() == 0) {
                    C83106WjW.LJLIL.invoke2(beautyCategory2.getBeautyList());
                } else {
                    Iterator<ComposerBeauty> it6 = beautyCategory2.getBeautyList().iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            composerBeauty4 = it6.next();
                            if (o.LJ(composerBeauty4.getEffect().getEffectId(), LJIIIIZZ)) {
                                break;
                            }
                        } else {
                            composerBeauty4 = null;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty6 = composerBeauty4;
                    if (composerBeauty6 != null) {
                        composerBeauty6.setSelected(true);
                    } else {
                        C83106WjW.LJLIL.invoke2(beautyCategory2.getBeautyList());
                    }
                }
            } else {
                Iterator<ComposerBeauty> it7 = beautyCategory2.getBeautyList().iterator();
                while (it7.hasNext()) {
                    c83146WkA.X7(it7.next());
                }
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            for (ComposerBeauty composerBeauty7 : ((BeautyCategory) it8.next()).getBeautyList()) {
                if (composerBeauty7.isCollectionType()) {
                    AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(c83146WkA, 316);
                    List<ComposerBeauty> childList2 = composerBeauty7.getChildList();
                    if (childList2 != null && !childList2.isEmpty()) {
                        String b8 = c83146WkA.b8(composerBeauty7);
                        if (b8 == null || b8.length() == 0) {
                            aqS180S0100000_14.invoke$29(childList2);
                        } else {
                            Iterator<ComposerBeauty> it9 = childList2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    composerBeauty3 = it9.next();
                                    if (o.LJ(composerBeauty3.getEffect().getResourceId(), b8)) {
                                        break;
                                    }
                                } else {
                                    composerBeauty3 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty8 = composerBeauty3;
                            if (composerBeauty8 != null) {
                                composerBeauty8.setSelected(true);
                                c83146WkA.X7(composerBeauty8);
                            } else {
                                aqS180S0100000_14.invoke$29(childList2);
                            }
                        }
                    }
                }
            }
        }
        C83150WkE c83150WkE2 = this.LJLIL;
        C83146WkA c83146WkA2 = c83150WkE2.LJLJI;
        ArrayList arrayList2 = c83150WkE2.LJLJJI;
        c83146WkA2.getClass();
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            for (ComposerBeauty composerBeauty9 : ((BeautyCategory) it10.next()).getBeautyList()) {
                Effect effect = composerBeauty9.getEffect();
                C83109WjZ c83109WjZ = c83146WkA2.LJIJJLI;
                String resourceId = effect.getResourceId();
                List<String> tags = effect.getTags();
                if (tags == null) {
                    tags = new ArrayList<>();
                }
                String tagsUpdatedAt = effect.getTagsUpdatedAt();
                c83109WjZ.getClass();
                o.LJIIIZ(resourceId, "resourceId");
                if (tags.contains("new") && tagsUpdatedAt != null) {
                    String string = C82944Wgu.LIZ.getString(resourceId, CardStruct.IStatusCode.DEFAULT);
                    o.LJIIIIZZ(string, "KEVA.getString(resourceId, default)");
                    if (tagsUpdatedAt.compareTo(string) > 0) {
                        z = true;
                        c83109WjZ.LIZ.add(resourceId);
                        composerBeauty9.setShowRedDot(z);
                    }
                }
                z = false;
                composerBeauty9.setShowRedDot(z);
            }
        }
        if (!C82894Wg6.LIZIZ.LJIILJJIL()) {
            C83150WkE c83150WkE3 = this.LJLIL;
            C83146WkA c83146WkA3 = c83150WkE3.LJLJI;
            ArrayList arrayList3 = c83150WkE3.LJLJJI;
            c83146WkA3.getClass();
            Iterator it11 = arrayList3.iterator();
            while (it11.hasNext()) {
                for (ComposerBeauty composerBeauty10 : ((BeautyCategory) it11.next()).getBeautyList()) {
                    if (composerBeauty10.isCollectionType()) {
                        List<ComposerBeauty> childList3 = composerBeauty10.getChildList();
                        if (childList3 != null && !childList3.isEmpty()) {
                            for (ComposerBeauty composerBeauty11 : childList3) {
                                composerBeauty11.setDownloadState(c83146WkA3.LJIIJJI.LIZIZ(composerBeauty11, false));
                            }
                        }
                    } else {
                        composerBeauty10.setDownloadState(c83146WkA3.LJIIJJI.LIZIZ(composerBeauty10, false));
                    }
                }
            }
        }
        C78966Uyw.LJJJJL(this.LJLIL.LJLJI.LIZLLL, Boolean.TRUE);
        ArrayList arrayList4 = new ArrayList();
        C83150WkE c83150WkE4 = this.LJLIL;
        C83146WkA c83146WkA4 = c83150WkE4.LJLJI;
        ArrayList arrayList5 = c83150WkE4.LJLJJI;
        c83146WkA4.getClass();
        AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14(c83146WkA4, arrayList4, 25);
        Iterator it12 = arrayList5.iterator();
        while (it12.hasNext()) {
            BeautyCategory beautyCategory3 = (BeautyCategory) it12.next();
            if (beautyCategory3.getBeautyCategoryExtra().getExclusive()) {
                Iterator<ComposerBeauty> it13 = beautyCategory3.getBeautyList().iterator();
                while (true) {
                    if (it13.hasNext()) {
                        composerBeauty = it13.next();
                        if (composerBeauty.getSelected()) {
                            break;
                        }
                    } else {
                        composerBeauty = null;
                        break;
                    }
                }
                ComposerBeauty composerBeauty12 = composerBeauty;
                if (composerBeauty12 != null) {
                    aqS145S0200000_14.LIZ$2(composerBeauty12);
                }
            } else {
                for (ComposerBeauty isCollectBeauty : beautyCategory3.getBeautyList()) {
                    o.LJIIIZ(isCollectBeauty, "$this$isCollectBeauty");
                    if (1 == isCollectBeauty.getEffect().getEffectType()) {
                        List<ComposerBeauty> childList4 = isCollectBeauty.getChildList();
                        if (childList4 != null) {
                            Iterator<ComposerBeauty> it14 = childList4.iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    composerBeauty2 = it14.next();
                                    if (composerBeauty2.getSelected()) {
                                        break;
                                    }
                                } else {
                                    composerBeauty2 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty13 = composerBeauty2;
                            if (composerBeauty13 != null) {
                                aqS145S0200000_14.LIZ$2(composerBeauty13);
                            }
                        }
                    } else if (c83146WkA4.LJI(isCollectBeauty)) {
                        aqS145S0200000_14.LIZ$2(isCollectBeauty);
                    }
                }
            }
        }
        C81017Vqv c81017Vqv = new C81017Vqv();
        C83146WkA c83146WkA5 = this.LJLIL.LJLJI;
        C83154WkI LJIIJJI = c83146WkA5.LJIIJJI();
        AqS180S0100000_14 aqS180S0100000_142 = new AqS180S0100000_14(c83146WkA5, 318);
        synchronized (LJIIJJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sort sequence: ");
            LIZ.append(LJIIJJI.LIZ);
            C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
            C40675Fxn.LJJLIIIJ(arrayList4, new IDComparatorS344S0100000_14(LJIIJJI, 1));
            Iterator it15 = arrayList4.iterator();
            while (it15.hasNext()) {
                ComposerBeauty composerBeauty14 = (ComposerBeauty) it15.next();
                if (((Boolean) aqS180S0100000_142.invoke(composerBeauty14)).booleanValue()) {
                    Iterator<C82942Wgs> it16 = LJIIJJI.LIZ.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            c82942Wgs = it16.next();
                            if (o.LJ(composerBeauty14.getEffect().getEffectId(), c82942Wgs.LJLIL)) {
                                break;
                            }
                        } else {
                            c82942Wgs = null;
                            break;
                        }
                    }
                    if (c82942Wgs == null) {
                        it15.remove();
                    }
                }
            }
            int indexOf = LJIIJJI.LIZ.indexOf(new C82942Wgs("EFFECT_ID_TYPE_FILTER", 2));
            if (indexOf >= 0 && indexOf < LJIIJJI.LIZ.size()) {
                ComposerBeauty composerBeauty15 = new ComposerBeauty(new Effect(null, 1, null), new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null), new ComposerBeautyExtraBeautify(null, null, 3, null), null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, false, 0, 0, 0, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 6291448, null);
                composerBeauty15.getEffect().setEffectId("EFFECT_ID_TYPE_FILTER");
                if (indexOf == LJIIJJI.LIZ.size() - 1) {
                    arrayList4.add(composerBeauty15);
                } else if (indexOf == 0) {
                    int size = LJIIJJI.LIZ.size();
                    int i = 1;
                    boolean z2 = false;
                    while (true) {
                        if (i < size) {
                            if (z2) {
                                break;
                            }
                            C82942Wgs c82942Wgs2 = LJIIJJI.LIZ.get(i);
                            o.LJIIIIZZ(c82942Wgs2, "beautyApplySequence[afterIndex]");
                            C82942Wgs c82942Wgs3 = c82942Wgs2;
                            Iterator it17 = arrayList4.iterator();
                            while (true) {
                                if (it17.hasNext()) {
                                    obj4 = it17.next();
                                    if (o.LJ(((ComposerBeauty) obj4).getEffect().getEffectId(), c82942Wgs3.LJLIL)) {
                                        break;
                                    }
                                } else {
                                    obj4 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty16 = (ComposerBeauty) obj4;
                            if (composerBeauty16 != null) {
                                ListProtector.add(arrayList4, arrayList4.indexOf(composerBeauty16), composerBeauty15);
                                z2 = true;
                            }
                            i++;
                        } else if (!z2) {
                            arrayList4.add(composerBeauty15);
                        }
                    }
                } else {
                    int i2 = indexOf - 1;
                    boolean z3 = false;
                    while (true) {
                        if (i2 <= 0) {
                            if (z3) {
                                break;
                            }
                            C82942Wgs c82942Wgs4 = LJIIJJI.LIZ.get(i2);
                            o.LJIIIIZZ(c82942Wgs4, "beautyApplySequence[beforeIndex]");
                            C82942Wgs c82942Wgs5 = c82942Wgs4;
                            Iterator it18 = arrayList4.iterator();
                            while (true) {
                                if (it18.hasNext()) {
                                    obj3 = it18.next();
                                    if (o.LJ(((ComposerBeauty) obj3).getEffect().getEffectId(), c82942Wgs5.LJLIL)) {
                                        break;
                                    }
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty17 = (ComposerBeauty) obj3;
                            if (composerBeauty17 != null) {
                                ListProtector.add(arrayList4, arrayList4.indexOf(composerBeauty17) + 1, composerBeauty15);
                                z3 = true;
                            }
                            i2++;
                        } else if (!z3) {
                            int i3 = indexOf + 1;
                            int size2 = LJIIJJI.LIZ.size();
                            while (true) {
                                if (i3 < size2) {
                                    if (z3) {
                                        break;
                                    }
                                    C82942Wgs c82942Wgs6 = LJIIJJI.LIZ.get(i3);
                                    o.LJIIIIZZ(c82942Wgs6, "beautyApplySequence[afterIndex]");
                                    C82942Wgs c82942Wgs7 = c82942Wgs6;
                                    Iterator it19 = arrayList4.iterator();
                                    while (true) {
                                        if (it19.hasNext()) {
                                            obj2 = it19.next();
                                            if (o.LJ(((ComposerBeauty) obj2).getEffect().getEffectId(), c82942Wgs7.LJLIL)) {
                                                break;
                                            }
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    ComposerBeauty composerBeauty18 = (ComposerBeauty) obj2;
                                    if (composerBeauty18 != null) {
                                        ListProtector.add(arrayList4, arrayList4.indexOf(composerBeauty18), composerBeauty15);
                                        z3 = true;
                                    }
                                    i3++;
                                } else if (!z3) {
                                    arrayList4.add(composerBeauty15);
                                }
                            }
                        }
                    }
                }
            }
        }
        Iterator it20 = arrayList4.iterator();
        boolean z4 = false;
        while (it20.hasNext()) {
            ComposerBeauty composerBeauty19 = (ComposerBeauty) it20.next();
            if (o.LJ(composerBeauty19.getEffect().getEffectId(), "EFFECT_ID_TYPE_FILTER")) {
                c81017Vqv.add(new BeautyComposerInfo("EFFECT_ID_TYPE_FILTER", "", "", "", ""));
                if (composerBeauty19.needFaceDetect()) {
                    z4 = true;
                }
            } else {
                ArrayList arrayList6 = (ArrayList) c83146WkA5.LJIIIZ(composerBeauty19, false, false);
                if (!arrayList6.isEmpty()) {
                    composerBeauty19.setAdd2Nodes(true);
                    c81017Vqv.addAll(arrayList6);
                    if (composerBeauty19.needFaceDetect()) {
                        z4 = true;
                    }
                }
            }
        }
        SafeMutableLiveData<C65768PrY<ComposerBeauty>> safeMutableLiveData = c83146WkA5.LJIILL;
        C65768PrY c65768PrY = new C65768PrY();
        if (true ^ arrayList4.isEmpty()) {
            Iterator it21 = arrayList4.iterator();
            while (it21.hasNext()) {
                Object next = it21.next();
                if (next != null) {
                    c65768PrY.add(next);
                }
            }
        }
        C78966Uyw.LJJJJL(safeMutableLiveData, c65768PrY);
        c83146WkA5.LJJIIZ.LJIIJ(z4);
        return c81017Vqv;
    }
}
