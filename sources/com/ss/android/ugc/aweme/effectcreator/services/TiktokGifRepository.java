package com.ss.android.ugc.aweme.effectcreator.services;

import X.C48841JEv;
import X.C60903NvH;
import X.C78555UsJ;
import X.C78613UtF;
import X.C84488XDw;
import X.C93559aSp;
import X.C94437agz;
import X.C94438ah0;
import X.C94803amt;
import X.C94805amv;
import X.C94806amw;
import X.C94807amx;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC84498XEg;
import X.XKS;
import X.XKX;
import android.app.Application;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokGifRepository implements GifRepository {
    public static final C93559aSp Companion = new C93559aSp();
    public final String backgroundGifSource;
    public final InterfaceC84498XEg effectPlatform;
    public final String noBackgroundGifSource;
    public final String panel = "effecttooldefault";
    public final String category = "giphy_entrance";
    public final InterfaceC70422pa coroutineScope = C48841JEv.LIZ(C78613UtF.LIZJ);

    public TiktokGifRepository() {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        this.effectPlatform = C84488XDw.LIZ(application, null);
        this.noBackgroundGifSource = "stickers";
        this.backgroundGifSource = "gifs";
    }

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
        EffectManager LJLJJLL = this.effectPlatform.LJLJJLL();
        if (LJLJJLL != null) {
            LJLJJLL.fetchCategoryEffectFromCache(this.panel, this.category, 0, 0, 0, CardStruct.IStatusCode.DEFAULT, new C94437agz(xks));
        }
        return xks.LJIIJJI();
    }

    public final Object fetchGiphyAvailableFromRemote(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        this.effectPlatform.fetchCategoryEffect(this.panel, this.category, 0, 0, 0, CardStruct.IStatusCode.DEFAULT, false, new C94438ah0(xks));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object isAvailable(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94805amv(this, null), interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object downloadGif(ProviderEffect providerEffect, InterfaceC67352kd<? super ProviderEffect> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94803amt(this, providerEffect, null), interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object trendGifs(String str, int i, int i2, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94807amx(this, str, i, i2, null), interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository
    public Object searchGifs(String str, String str2, int i, int i2, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C94806amw(this, str2, str, i, i2, null), interfaceC67352kd);
    }
}
