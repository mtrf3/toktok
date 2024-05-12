package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ProviderEffectModelTemplate extends ProviderEffectModel {
    public boolean hasMore;
    public final transient ProviderEffectModel kProviderEffect;
    public String searchTips;
    public List<ProviderEffect> stickerList;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffectModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean getHasMore() {
        ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            return kProviderEffect.getHas_more();
        }
        return super.getHas_more();
    }

    public String getSearchTips() {
        String search_tips;
        ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (search_tips = kProviderEffect.getSearch_tips()) != null) {
            return search_tips;
        }
        return super.getSearch_tips();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> getStickerList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.ProviderEffectModel r4 = r5.getKProviderEffect()
            if (r4 == 0) goto L52
            java.util.List r1 = r4.getSticker_list()
            if (r1 == 0) goto L52
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4c
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.ProviderEffect
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.ProviderEffect r1 = (com.ss.ugc.effectplatform.model.ProviderEffect) r1
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r0 = new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect
            r0.<init>(r1)
            r3.add(r0)
            goto L2d
        L42:
            if (r4 == 0) goto L47
            r4.setSticker_list(r3)
        L47:
            super.setSticker_list(r3)
            r1 = r3
            goto L1d
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L52:
            java.util.List r1 = super.getSticker_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate.getStickerList():java.util.List");
    }

    public boolean hasMore() {
        return getHasMore();
    }

    public ProviderEffectModel getKProviderEffect() {
        return this.kProviderEffect;
    }

    public ProviderEffectModelTemplate(ProviderEffectModel providerEffectModel) {
        super(null, 0, false, null, null, null, null, null, null, null, null, null, 4095, null);
        this.kProviderEffect = providerEffectModel;
        this.stickerList = new ArrayList();
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public void setSearchTips(String str) {
        this.searchTips = str;
        ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    public void setStickerList(List<ProviderEffect> value) {
        o.LJIIJ(value, "value");
        this.stickerList = value;
        ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setSticker_list(value);
        }
        super.setSticker_list(value);
    }

    public /* synthetic */ ProviderEffectModelTemplate(ProviderEffectModel providerEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffectModel);
    }
}
