package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C78555UsJ;
import X.C78613UtF;
import X.C93513aS5;
import X.C93726aVW;
import X.C94428agq;
import X.C94429agr;
import X.C94778amU;
import X.C94780amW;
import X.C94781amX;
import X.C94782amY;
import X.InterfaceC67352kd;
import X.XKS;
import X.XKX;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* loaded from: classes34.dex */
public final class GifRepositoryImpl implements GifRepository {
    public static final C93513aS5 Companion = new C93513aS5();
    public final EffectManager effectManager = C93726aVW.LIZ().effectManager();
    public final String noBackgroundGifSource = "stickers";
    public final String backgroundGifSource = "gifs";

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public String getBackgroundGifSource() {
        return this.backgroundGifSource;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public String getNoBackgroundGifSource() {
        return this.noBackgroundGifSource;
    }

    public final Object fetchGiphyAvailableFromCache(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        this.effectManager.fetchCategoryEffectFromCache("effecttooldefault", "giphy_entrance", 0, 0, 0, CardStruct.IStatusCode.DEFAULT, new C94428agq(xks));
        return xks.LJIIJJI();
    }

    public final Object fetchGiphyAvailableFromRemote(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        this.effectManager.fetchCategoryEffect("effecttooldefault", "giphy_entrance", 0, 0, 0, CardStruct.IStatusCode.DEFAULT, new C94429agr(xks));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object isAvailable(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94780amW(this, null), interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object downloadGif(ProviderEffect providerEffect, InterfaceC67352kd<? super ProviderEffect> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94778amU(this, providerEffect, null), interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object trendGifs(String str, int i, int i2, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94782amY(this, i, i2, str, null), interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object searchGifs(String str, String str2, int i, int i2, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94781amX(this, str2, i, i2, str, null), interfaceC67352kd);
    }
}
