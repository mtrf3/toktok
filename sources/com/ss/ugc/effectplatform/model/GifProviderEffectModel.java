package com.ss.ugc.effectplatform.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class GifProviderEffectModel {
    public ProviderEffectModel gifs;
    public String search_tips;

    /* JADX WARN: Multi-variable type inference failed */
    public GifProviderEffectModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ProviderEffectModel getGifs() {
        return this.gifs;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public void setGifs(ProviderEffectModel providerEffectModel) {
        this.gifs = providerEffectModel;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public GifProviderEffectModel(String str, ProviderEffectModel providerEffectModel) {
        this.search_tips = str;
        this.gifs = providerEffectModel;
    }

    public /* synthetic */ GifProviderEffectModel(String str, ProviderEffectModel providerEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : providerEffectModel);
    }
}
