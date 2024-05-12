package com.ss.android.ugc.effectmanager.effect.model.template;

import X.C32I;
import X.C62850Ola;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class CategoryEffectModelTemplate extends CategoryEffectModel {
    public List<? extends Effect> bindEffects;
    public String categoryKey;
    public List<? extends Effect> collectEffects;
    public boolean hasMore;
    public final transient CategoryEffectModel kCategoryEffect;
    public int sortingPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryEffectModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public List<Effect> getBindEffects() {
        ArrayList arrayList;
        List<com.ss.ugc.effectplatform.model.Effect> bind_effects;
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null && (bind_effects = kCategoryEffect.getBind_effects()) != null) {
            arrayList = new ArrayList(C32I.LJJL(bind_effects, 10));
            Iterator<com.ss.ugc.effectplatform.model.Effect> it = bind_effects.iterator();
            while (it.hasNext()) {
                C62850Ola.LJII(it.next(), arrayList);
            }
        } else {
            List<com.ss.ugc.effectplatform.model.Effect> bind_effects2 = super.getBind_effects();
            arrayList = new ArrayList(C32I.LJJL(bind_effects2, 10));
            Iterator<com.ss.ugc.effectplatform.model.Effect> it2 = bind_effects2.iterator();
            while (it2.hasNext()) {
                C62850Ola.LJII(it2.next(), arrayList);
            }
        }
        return arrayList;
    }

    public String getCategoryKey() {
        String category_key;
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null && (category_key = kCategoryEffect.getCategory_key()) != null) {
            return category_key;
        }
        return super.getCategory_key();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.CategoryEffectModel r3 = r4.getKCategoryEffect()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getCollection()
            if (r1 == 0) goto L4d
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L2d
        L3d:
            if (r3 == 0) goto L42
            r3.setCollection(r2)
        L42:
            super.setCollection(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getCollection()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate.getCollectEffects():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.CategoryEffectModel r3 = r4.getKCategoryEffect()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getCategory_effects()
            if (r1 == 0) goto L4d
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L2d
        L3d:
            if (r3 == 0) goto L42
            r3.setCategory_effects(r2)
        L42:
            r4.setCategory_effects(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = r4.getCategory_effects()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate.getEffects():java.util.List");
    }

    public boolean getHasMore() {
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            return kCategoryEffect.getHas_more();
        }
        return super.getHas_more();
    }

    public int getSortingPosition() {
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            return kCategoryEffect.getSorting_position();
        }
        return super.getSorting_position();
    }

    public boolean hasMore() {
        return getHasMore();
    }

    public CategoryEffectModel getKCategoryEffect() {
        return this.kCategoryEffect;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CategoryEffectModelTemplate(com.ss.ugc.effectplatform.model.CategoryEffectModel r13) {
        /*
            r12 = this;
            r2 = 0
            r4 = 0
            r10 = 255(0xff, float:3.57E-43)
            r1 = r12
            r3 = r2
            r5 = r4
            r6 = r4
            r7 = r2
            r8 = r2
            r9 = r2
            r11 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.kCategoryEffect = r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.collectEffects = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.bindEffects = r0
            java.lang.String r0 = ""
            r1.categoryKey = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate.<init>(com.ss.ugc.effectplatform.model.CategoryEffectModel):void");
    }

    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.bindEffects = value;
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setBind_effects(value);
        }
        super.setBind_effects(value);
    }

    public void setCategoryKey(String value) {
        o.LJIIJ(value, "value");
        this.categoryKey = value;
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setCategory_key(value);
        }
        super.setCategory_key(value);
    }

    public void setCollectEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.collectEffects = value;
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setCollection(value);
        }
        super.setCollection(value);
    }

    public void setEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setCategory_effects(value);
        }
        setCategory_effects(value);
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public void setSortingPosition(int i) {
        this.sortingPosition = i;
        CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setSorting_position(i);
        }
        super.setSorting_position(i);
    }

    public /* synthetic */ CategoryEffectModelTemplate(CategoryEffectModel categoryEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryEffectModel);
    }
}
