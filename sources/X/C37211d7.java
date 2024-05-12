package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.google.gson.j;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1d7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37211d7 implements C0WM<LiveEffect> {
    public final boolean LJLIL;

    public C37211d7(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.C0WM
    public final List<C1QC> LJIIJJI(EffectChannelResponse effectChannelResponse) {
        List<EffectCategoryResponse> categoryResponseList;
        List list;
        boolean z;
        boolean z2;
        j LJJIJ;
        boolean z3;
        List<Effect> list2;
        List<? extends LiveEffect> list3;
        List<Effect> childEffects;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        C0TX.LIZ.LIZJ("SmallItemBeauty");
        C0TX.LIZLLL("perform small beauty's convert.");
        if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                if (C78880UxY.LJJJJLL(effectCategoryResponse.getExtra(), this.LJLIL)) {
                    arrayList2.add(effectCategoryResponse);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                EffectCategoryResponseTemplate effectCategoryResponseTemplate = (EffectCategoryResponseTemplate) it.next();
                String category = effectCategoryResponseTemplate.getKey();
                o.LJIIIZ(category, "category");
                C32011Nl.LJIIIIZZ.add(category);
                List<Effect> totalEffects = effectCategoryResponseTemplate.getTotalEffects();
                if (totalEffects != null) {
                    int i = 10;
                    ArrayList arrayList3 = new ArrayList(C32I.LJJL(totalEffects, 10));
                    Iterator<Effect> it2 = totalEffects.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(C0LT.LIZIZ(it2.next()));
                    }
                    ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    int i2 = 0;
                    while (true) {
                        boolean z5 = true;
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                LiveEffect liveEffect = (LiveEffect) next;
                                liveEffect.impressionPos = Integer.valueOf(i2);
                                liveEffect.effectPanelName = effectCategoryResponseTemplate.getName();
                                liveEffect.effectPanelKey = effectCategoryResponseTemplate.getKey();
                                String extra = effectCategoryResponseTemplate.getExtra();
                                if (extra != null) {
                                    try {
                                        new com.google.gson.o();
                                        LJJIJ = com.google.gson.o.LIZ(extra).LJIIZILJ().LJJIJ("exclusive");
                                    } catch (Throwable unused) {
                                    }
                                    if (LJJIJ != null) {
                                        z2 = LJJIJ.LJFF();
                                        liveEffect.isExclusive = z2;
                                    }
                                    z2 = false;
                                    liveEffect.isExclusive = z2;
                                }
                                String name = effectCategoryResponseTemplate.getName();
                                String key = effectCategoryResponseTemplate.getKey();
                                Effect effect = liveEffect.getEffect();
                                if (effect != null && effect.getEffectType() == 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    Effect effect2 = liveEffect.getEffect();
                                    if (effect2 != null) {
                                        list2 = effect2.getChildEffects();
                                    } else {
                                        list2 = null;
                                    }
                                    if (C79004UzY.LJJIFFI(list2)) {
                                        continue;
                                    } else {
                                        Effect effect3 = liveEffect.getEffect();
                                        if (effect3 != null && (childEffects = effect3.getChildEffects()) != null) {
                                            ArrayList arrayList5 = new ArrayList(C32I.LJJL(childEffects, i));
                                            int i4 = 0;
                                            for (Effect effect4 : childEffects) {
                                                int i5 = i4 + 1;
                                                if (i4 >= 0) {
                                                    LiveEffect LIZIZ = C0LT.LIZIZ(effect4);
                                                    LIZIZ.isExclusive = z5;
                                                    LIZIZ.effectPanelName = name;
                                                    LIZIZ.effectPanelKey = key;
                                                    LIZIZ.parentResId = liveEffect.getResourceId();
                                                    LIZIZ.parentResName = liveEffect.getName();
                                                    LIZIZ.parentImpressionPos = Integer.valueOf(i2);
                                                    LIZIZ.impressionPos = Integer.valueOf(i4);
                                                    arrayList5.add(LIZIZ);
                                                    i4 = i5;
                                                    z5 = true;
                                                } else {
                                                    C47261Igj.LJJJJJ();
                                                    throw null;
                                                }
                                            }
                                            ArrayList arrayList6 = new ArrayList();
                                            Iterator it4 = arrayList5.iterator();
                                            while (it4.hasNext()) {
                                                Object next2 = it4.next();
                                                LiveEffect liveEffect2 = (LiveEffect) next2;
                                                if (liveEffect2.getSmallItemConfig() != null || liveEffect2.isNone()) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    arrayList6.add(next2);
                                                }
                                            }
                                            list3 = ORZ.LLJI(arrayList6);
                                        } else {
                                            list3 = null;
                                        }
                                        liveEffect.subStickers = list3;
                                    }
                                }
                                arrayList4.add(liveEffect);
                                i2 = i3;
                                i = 10;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                Object next3 = it5.next();
                                LiveEffect liveEffect3 = (LiveEffect) next3;
                                if (liveEffect3.getSmallItemConfig() != null || !C79004UzY.LJJIFFI(liveEffect3.subStickers) || liveEffect3.isNone()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    arrayList7.add(next3);
                                }
                            }
                            list = ORZ.LLJI(arrayList7);
                            if (list != null) {
                            }
                        }
                    }
                }
                list = C61878OQg.INSTANCE;
                arrayList.add(new C1QC(effectCategoryResponseTemplate.getName(), effectCategoryResponseTemplate.getKey(), list, null, 56));
            }
        }
        return arrayList;
    }
}
