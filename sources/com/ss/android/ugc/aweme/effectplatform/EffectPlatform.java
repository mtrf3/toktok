package com.ss.android.ugc.aweme.effectplatform;

import X.C10K;
import X.C1DG;
import X.C43313GzF;
import X.C53717L6j;
import X.C60903NvH;
import X.C74434TJe;
import X.C74548TNo;
import X.C74576TOq;
import X.C74582TOw;
import X.C74584TOy;
import X.C77413UZt;
import X.C83745Wtp;
import X.C83746Wtq;
import X.C83747Wtr;
import X.C83753Wtx;
import X.C83754Wty;
import X.C84410XAw;
import X.C84418XBe;
import X.C84467XDb;
import X.C84473XDh;
import X.C84474XDi;
import X.C84482XDq;
import X.C93833mF;
import X.EF7;
import X.EnumC35455Dvn;
import X.GXY;
import X.HQD;
import X.I81;
import X.InterfaceC84497XEf;
import X.InterfaceC84498XEg;
import X.TJH;
import X.TJL;
import X.TJM;
import X.TJR;
import X.TPL;
import X.X1D;
import X.XCT;
import X.XCU;
import X.XCX;
import X.XDR;
import X.XE0;
import X.XE1;
import X.XE3;
import X.XED;
import Y.ACallableS92S0200000_15;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectPlatform implements GenericLifecycleObserver, InterfaceC84498XEg {
    public static final File LJLJJI = new File(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJ(""));
    public static final File LJLJJL = new File(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJL(""));
    public final C84467XDb LJLIL;
    public final EffectConfiguration LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC84497XEf
    public final void LJIIL(String str, TJR tjr) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILL(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILLIIL(String str, String str2, String str3, int i, int i2, Map map, TJM tjm) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIII(Effect effect, boolean z, IFetchEffectListener iFetchEffectListener) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJIIJI(String str, boolean z, String str2, int i, int i2, int i3, String str3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJJL(C74548TNo c74548TNo, InfoStickerEffect infoStickerEffect) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJIJIIJIL() {
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            return;
        }
        c84467XDb.LIZIZ.removeListener();
    }

    public final void LJJJLL() {
        EffectConfiguration effectConfiguration = this.LJLILLLLZI;
        if (effectConfiguration != null) {
            boolean isEmpty = TextUtils.isEmpty(effectConfiguration.getDeviceId());
            String str = CardStruct.IStatusCode.DEFAULT;
            if (isEmpty || TextUtils.equals(CardStruct.IStatusCode.DEFAULT, this.LJLILLLLZI.getDeviceId())) {
                EffectConfiguration effectConfiguration2 = this.LJLILLLLZI;
                if (AppLog.getServerDeviceId() != null) {
                    str = AppLog.getServerDeviceId();
                }
                effectConfiguration2.setDeviceId(str);
            }
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final EffectManager LJLJJLL() {
        return this.LJLIL.LIZIZ;
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        if (!this.LJLJI) {
            C84467XDb c84467XDb = this.LJLIL;
            EffectManager effectManager = c84467XDb.LIZIZ;
            if (effectManager != null) {
                effectManager.destroy();
                c84467XDb.LIZIZ = null;
            }
            c84467XDb.LIZ = false;
        }
    }

    public static String LJJJJZ() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String str = EF7.LJIILIIL;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        return str;
    }

    public static String LJJJJZI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(1233);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC84497XEf
    public final EffectConfiguration LJIJJ() {
        return this.LJLILLLLZI;
    }

    public static ArrayList<String> LJJJLIIL(boolean z) {
        if (!GXY.LIZ || z) {
            GXY.LIZIZ();
        }
        return GXY.LIZJ;
    }

    @Override // X.InterfaceC84498XEg
    public final void G8(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC84497XEf
    public final void LIZIZ(Effect effect) {
        LJJJLL();
        if (effect != null) {
            C84467XDb c84467XDb = this.LJLIL;
            if (!c84467XDb.LIZ) {
                return;
            }
            c84467XDb.LIZIZ.pauseEffectTask(effect);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIIJJI(Map<String, Object> map) {
        this.LJLIL.LIZJ = map;
    }

    @Override // X.InterfaceC84498XEg
    public final boolean LJIJ(Effect effect) {
        return this.LJLIL.LIZIZ.isEffectDownloading(effect);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIJI(Map<String, String> map) {
        C84467XDb c84467XDb = this.LJLIL;
        c84467XDb.getClass();
        if (!map.isEmpty()) {
            ((HashMap) c84467XDb.LIZLLL).putAll(map);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIL(String str) {
        C84467XDb c84467XDb = this.LJLIL;
        if (c84467XDb == null || !c84467XDb.LIZ) {
            return;
        }
        c84467XDb.LIZIZ.clearCache(str);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIZ(String str) {
        C53717L6j.LIZ().LIZJ(str);
    }

    @Override // X.InterfaceC84498XEg
    public final boolean LJJIJLIJ(Effect effect) {
        C84467XDb c84467XDb = this.LJLIL;
        if (effect != null) {
            if (c84467XDb.LIZIZ != null) {
                return DownloadableModelSupport.getInstance().isEffectReady(c84467XDb.LIZIZ, effect);
            }
        } else {
            c84467XDb.getClass();
        }
        return false;
    }

    @Override // X.InterfaceC84497XEf
    public final boolean LJJIL(Effect effect) {
        return LJJIJLIJ(effect);
    }

    @Override // X.InterfaceC84497XEf
    public final boolean LJJIZ(String str) {
        return C53717L6j.LIZ().LIZIZ(str);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJI(Effect effect) {
        C10K.LIZJ(new ACallableS92S0200000_15(effect, this, 1));
    }

    public EffectPlatform(EffectConfiguration effectConfiguration, boolean z) {
        this.LJLILLLLZI = effectConfiguration;
        this.LJLJI = z;
        C84467XDb c84467XDb = new C84467XDb();
        this.LJLIL = c84467XDb;
        EffectManager effectManager = new EffectManager();
        c84467XDb.LIZIZ = effectManager;
        c84467XDb.LIZ = effectManager.init(effectConfiguration);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJIIJ(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iDownloadProviderEffectListener.onFail(providerEffect, C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.downloadProviderEffect(providerEffect, iDownloadProviderEffectListener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIIZILJ(String str, C43313GzF c43313GzF) {
        LIZLLL(str, null, c43313GzF);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJ(long j, XDR<GetCustomizedEffectIDData> xdr) {
        EffectManager effectManager;
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ || (effectManager = c84467XDb.LIZIZ) == null) {
            C84418XBe c84418XBe = new C84418XBe(new RuntimeException());
            c84418XBe.LIZ = -1;
            c84418XBe.LIZIZ = "effect sdk manager init failed";
            xdr.onFail(null, c84418XBe);
            return;
        }
        effectManager.getCustomizedEffectId(j, null, xdr);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJIIJZLJL(String str, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchCategoryEffectListener.onFail(C84467XDb.LJ());
            return;
        }
        C83747Wtr LIZ = C83747Wtr.LIZ(str, 0, 0, iFetchCategoryEffectListener);
        LIZ.LJFF = c84467XDb.LIZJ;
        c84467XDb.LIZ(str, "all", 0, 0, 0, "", false, LIZ, null);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIZI(Effect effect, IFetchEffectListener iFetchEffectListener) {
        fetchEffect(effect, iFetchEffectListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJL(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C84467XDb c84467XDb = this.LJLIL;
        c84467XDb.getClass();
        C83745Wtp c83745Wtp = new C83745Wtp(str, new C83753Wtx(str, iFetchEffectChannelListener));
        c83745Wtp.LIZLLL = c84467XDb.LIZJ;
        if (!c84467XDb.LIZ) {
            c83745Wtp.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectListFromCacheChecked(str, c83745Wtp);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJJ(String str, HQD hqd) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            C84418XBe c84418XBe = new C84418XBe(new RuntimeException());
            c84418XBe.LIZ = -1;
            c84418XBe.LIZIZ = "effect sdk manager init failed";
            hqd.LIZIZ(c84418XBe);
            return;
        }
        c84467XDb.LIZIZ.fetchProviderEffectsByGiphyIds(str, "gifs", null, true, hqd);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJJL(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchEffectChannelListener.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectListFromCache(str, iFetchEffectChannelListener);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchEffectListener.onFail(effect, C84467XDb.LJ());
            return;
        }
        if (effect == null) {
            ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
            exceptionResult.setErrorCode(-1);
            exceptionResult.setMsg("effect is null.");
            iFetchEffectListener.onFail(null, exceptionResult);
            return;
        }
        c84467XDb.LIZIZ.fetchEffect(effect, iFetchEffectListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchEffectListByIdsListener.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectList2(list, map, iFetchEffectListByIdsListener);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LIZLLL(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchEffectListener.onFail(null, C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectWithDownload(str, map, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchEffectChannelListener.onFail(C84467XDb.LJ());
            return;
        }
        if (C53717L6j.LIZ().LIZIZ(str)) {
            XE1 xe1 = new XE1(c84467XDb, str, z, iFetchEffectChannelListener);
            if (!c84467XDb.LIZ) {
                xe1.onFail(C84467XDb.LJ());
                return;
            } else {
                c84467XDb.LIZIZ.fetchEffectListFromCache(str, xe1);
                return;
            }
        }
        XE0 xe0 = new XE0(c84467XDb, str, z, iFetchEffectChannelListener);
        if (!c84467XDb.LIZ) {
            xe0.checkChannelFailed(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.checkedEffectListUpdate(str, null, new XED(xe0));
        }
        C53717L6j.LIZ().LIZJ(str);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILIIL(String str, Map map, C74434TJe c74434TJe) {
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            c74434TJe.onFailed(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchFavoriteList(str, c74434TJe);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJIL(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        C84467XDb c84467XDb = this.LJLIL;
        if (c84467XDb != null) {
            if (!c84467XDb.LIZ) {
                iFetchEffectListByIdsListener.onFail(C84467XDb.LJ());
            } else {
                c84467XDb.LIZIZ.fetchEffectList(list, map, iFetchEffectListByIdsListener);
            }
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJI(String str, C93833mF c93833mF, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C84467XDb c84467XDb = this.LJLIL;
        c84467XDb.getClass();
        C83745Wtp c83745Wtp = new C83745Wtp(str, new C83753Wtx(str, iFetchEffectChannelListener));
        c83745Wtp.LIZLLL = c84467XDb.LIZJ;
        if (!c84467XDb.LIZ) {
            c83745Wtp.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectListChecked(str, false, c93833mF, c83745Wtp);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void fetchList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        LJJJLL();
        this.LJLIL.LIZIZ(str, z, iFetchEffectChannelListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        C84467XDb c84467XDb = this.LJLIL;
        c84467XDb.getClass();
        if (str == null || str2 == null) {
            return;
        }
        if (!c84467XDb.LIZ) {
            iUpdateTagListener.onFinally();
        } else {
            c84467XDb.LIZIZ.updateTag(str, str2, iUpdateTagListener);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJ(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchEffectListListener.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectList(list, z, map, iFetchEffectListListener);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJII(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
        C84467XDb c84467XDb = this.LJLIL;
        Boolean valueOf = Boolean.valueOf(z);
        if (!c84467XDb.LIZ) {
            iModFavoriteList.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.modifyFavoriteList(str, list, valueOf, new C83754Wty(str, iModFavoriteList, list, valueOf.booleanValue()));
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJIIIIZZ(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C84467XDb c84467XDb = this.LJLIL;
        c84467XDb.getClass();
        if (str == null || C77413UZt.LJIILL(list)) {
            return;
        }
        if (!c84467XDb.LIZ) {
            iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
        } else {
            c84467XDb.LIZIZ.isTagUpdated(str, str2, iIsTagNeedUpdatedListener);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIILJJIL(String str, boolean z, String str2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchPanelInfoListener.onFail(C84467XDb.LJ());
            return;
        }
        C83746Wtq LIZ = C83746Wtq.LIZ(str, iFetchPanelInfoListener);
        LIZ.LIZLLL = c84467XDb.LIZJ;
        if (C53717L6j.LIZ().LIZIZ(str)) {
            c84467XDb.LIZLLL(str, z, str2, 0, 0, LIZ);
            return;
        }
        XE3 xe3 = new XE3(c84467XDb, str, z, str2, LIZ);
        if (!c84467XDb.LIZ) {
            xe3.checkChannelFailed(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.checkPanelIsUpdate(str, null, new XED(xe3));
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJLI(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (C53717L6j.LIZ().LIZIZ(str) || z) {
            LJJJJL(str, iFetchEffectChannelListener);
        } else {
            fetchList(str, z2, iFetchEffectChannelListener);
            C53717L6j.LIZ().LIZJ(str);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJJLL(String materialId, String str, boolean z, I81 i81) {
        EnumC35455Dvn provider;
        EffectManager effectManager = this.LJLIL.LIZIZ;
        if (effectManager == null) {
            return;
        }
        XCT effectPlatform = effectManager.getEffectPlatform();
        if (str.equals("toptiktok")) {
            provider = EnumC35455Dvn.TopTiktok;
        } else {
            provider = EnumC35455Dvn.Giphy;
        }
        effectPlatform.getClass();
        o.LJIIJ(materialId, "materialId");
        o.LJIIJ(provider, "provider");
        XCU LJIIJ = effectPlatform.LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, i81);
        C84474XDi c84474XDi = new C84474XDi(LJIIJ.LIZJ, LIZ, provider, materialId, z);
        XCX xcx = LJIIJ.LIZJ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84474XDi);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LIZJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchEffectListener.onFail(effect, C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchEffectExt(effect, z, z2, z3, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJIIIZ(String str, String str2, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchProviderEffect.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchProviderEffect(str, false, i, i2, str2, iFetchProviderEffect);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void checkUpdate(String str, String str2, int i, Map map, ICheckChannelListener iCheckChannelListener) {
        InterfaceC84497XEf.LJJLIIJ.getClass();
        if (i == 2) {
            C84467XDb c84467XDb = this.LJLIL;
            if (!c84467XDb.LIZ) {
                iCheckChannelListener.checkChannelFailed(C84467XDb.LJ());
                return;
            } else {
                c84467XDb.LIZIZ.checkPanelIsUpdate(str, null, new XED(iCheckChannelListener));
                return;
            }
        }
        if (i == 1) {
            C84467XDb c84467XDb2 = this.LJLIL;
            if (!c84467XDb2.LIZ) {
                iCheckChannelListener.checkChannelFailed(C84467XDb.LJ());
                return;
            } else {
                c84467XDb2.LIZIZ.checkCategoryIsUpdate(str, str2, null, new XED(iCheckChannelListener));
                return;
            }
        }
        LJJJLL();
        C84467XDb c84467XDb3 = this.LJLIL;
        if (!c84467XDb3.LIZ) {
            iCheckChannelListener.checkChannelFailed(C84467XDb.LJ());
        } else {
            if (map == null) {
                c84467XDb3.LIZIZ.checkedEffectListUpdate(str, null, new XED(iCheckChannelListener));
                return;
            }
            throw null;
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJI(int i, String str, String str2, Integer num, Integer num2, C74576TOq c74576TOq) {
        EffectManager effectManager = this.LJLIL.LIZIZ;
        if (effectManager == null) {
            c74576TOq.onFail(null, new C84418XBe(-1));
        } else {
            effectManager.getEffectPlatform().LJIILLIIL(i, str, str2, num, num2, null, null, c74576TOq);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJII(String str, boolean z, String str2, int i, int i2, TPL tpl) {
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            tpl.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchPanelInfoFromCacheChecked(str, z, str2, i, i2, tpl);
        }
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJFF(String str, boolean z, String str2, int i, int i2, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            iFetchPanelInfoListener.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.fetchPanelInfoChecked(str, z, str2, i, i2, c93833mF, iFetchPanelInfoListener);
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIJJLI(int i, int i2, int i3, C74582TOw c74582TOw, String keyWord, String str, Map map) {
        EffectManager effectManager = this.LJLIL.LIZIZ;
        if (effectManager == null) {
            return;
        }
        XCT effectPlatform = effectManager.getEffectPlatform();
        effectPlatform.getClass();
        o.LJIIJ(keyWord, "keyWord");
        C84482XDq LJIIIZ = effectPlatform.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, c74582TOw);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84473XDh(LJIIIZ.LIZ, LIZ, EnumC35455Dvn.Giphy, keyWord, i3, i2, i, null, map));
        }
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJIFFI(int i, int i2, int i3, C74584TOy c74584TOy, String str, String str2, Map map) {
        EnumC35455Dvn provider;
        EffectManager effectManager = this.LJLIL.LIZIZ;
        if (effectManager == null) {
            return;
        }
        XCT effectPlatform = effectManager.getEffectPlatform();
        if (str.equals("toptiktok")) {
            provider = EnumC35455Dvn.TopTiktok;
        } else {
            provider = EnumC35455Dvn.Giphy;
        }
        effectPlatform.getClass();
        o.LJIIJ(provider, "provider");
        C84482XDq LJIIIZ = effectPlatform.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, c74584TOy);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84473XDh(LJIIIZ.LIZ, LIZ, provider, null, i3, i2, i, str2, map));
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIJ(String str, String str2, int i, int i2, boolean z, String str3, IFetchProviderEffect iFetchProviderEffect) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        c84467XDb.getClass();
        if (C60903NvH.LJIIJJI().getAccountService() != null && C1DG.LJIIIIZZ()) {
            iFetchProviderEffect.onFail(C84467XDb.LJ());
        } else if (!c84467XDb.LIZ) {
            iFetchProviderEffect.onFail(C84467XDb.LJ());
        } else {
            c84467XDb.LIZIZ.searchProviderEffect(str, str2, i, i2, false, str3, iFetchProviderEffect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC84497XEf
    public final void LJJIJIL(String str, String str2, int i, int i2, int i3, String str3, TJH tjh) {
        C83747Wtr LIZ;
        C84467XDb c84467XDb = this.LJLIL;
        if (!c84467XDb.LIZ) {
            tjh.onFail(C84467XDb.LJ());
            return;
        }
        if (tjh instanceof C83747Wtr) {
            LIZ = (C83747Wtr) tjh;
        } else {
            LIZ = C83747Wtr.LIZ(str, i, i2, tjh);
        }
        LIZ.LJFF = c84467XDb.LIZJ;
        c84467XDb.LIZIZ.fetchCategoryPagingEffect(str, str2, i, i2, i3, str3, c84467XDb.LJFF(null), LIZ);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJ(String host, String searchId, String keyword, int i, int i2, Map map, TJL tjl) {
        LJJJLL();
        C84467XDb c84467XDb = this.LJLIL;
        XDR<SearchEffectResponseV2> kNListener = ListenerAdaptExtKt.toKNListener(tjl);
        if (!c84467XDb.LIZ) {
            return;
        }
        XCT effectPlatform = c84467XDb.LIZIZ.getEffectPlatform();
        effectPlatform.getClass();
        o.LJIIJ(host, "host");
        o.LJIIJ(searchId, "searchId");
        o.LJIIJ(keyword, "keyword");
        effectPlatform.LJIIJ().LJFF(i, i2, kNListener, searchId, keyword, host, map);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJIZL(String str, int i, int i2, int i3, String str2, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListener2 = iFetchPanelInfoListener;
        C84467XDb c84467XDb = this.LJLIL;
        if (c84467XDb != null) {
            if (!c84467XDb.LIZ) {
                iFetchPanelInfoListener2.onFail(C84467XDb.LJ());
                return;
            }
            if (!(iFetchPanelInfoListener2 instanceof C83746Wtq)) {
                iFetchPanelInfoListener2 = C83746Wtq.LIZ(str, iFetchPanelInfoListener2);
            }
            ((C83746Wtq) iFetchPanelInfoListener2).LIZLLL = c84467XDb.LIZJ;
            c84467XDb.LIZIZ.fetchPanelInfoPagingChecked(str, "trending", i, i2, i3, str2, c93833mF, iFetchPanelInfoListener2);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJJ(String str, boolean z, String str2, int i, int i2, boolean z2, boolean z3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        if (C53717L6j.LIZ().LIZIZ(str) || z2) {
            this.LJLIL.LIZLLL(str, z, str2, i, i2, iFetchPanelInfoListener);
        } else {
            this.LJLIL.LIZJ(str, z, str2, i, i2, iFetchPanelInfoListener);
            C53717L6j.LIZ().LIZJ(str);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        LJJIJ(str, str2, i, i2, i3, str3, z, iFetchCategoryEffectListener, null);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJ(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener, Map<String, String> map) {
        this.LJLIL.LIZ(str, str2, i, i2, i3, str3, z, iFetchCategoryEffectListener, map);
    }
}
