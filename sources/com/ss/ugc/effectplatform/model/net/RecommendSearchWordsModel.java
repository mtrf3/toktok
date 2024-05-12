package com.ss.ugc.effectplatform.model.net;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class RecommendSearchWordsModel extends F9E {
    public List<EffectNameModel> effects;
    public String search_tips;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendSearchWordsModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendSearchWordsModel copy$default(RecommendSearchWordsModel recommendSearchWordsModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendSearchWordsModel.search_tips;
        }
        if ((i & 2) != 0) {
            list = recommendSearchWordsModel.effects;
        }
        return recommendSearchWordsModel.copy(str, list);
    }

    public final RecommendSearchWordsModel copy(String str, List<EffectNameModel> list) {
        return new RecommendSearchWordsModel(str, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.search_tips, this.effects};
    }

    public final List<EffectNameModel> getEffects() {
        return this.effects;
    }

    public final String getSearch_tips() {
        return this.search_tips;
    }

    public final void setEffects(List<EffectNameModel> list) {
        this.effects = list;
    }

    public final void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public RecommendSearchWordsModel(String str, List<EffectNameModel> list) {
        this.search_tips = str;
        this.effects = list;
    }

    public /* synthetic */ RecommendSearchWordsModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
