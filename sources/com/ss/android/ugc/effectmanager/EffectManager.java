package com.ss.android.ugc.effectmanager;

import X.C03660Ck;
import X.C05040Hs;
import X.C107244Iu;
import X.C10820be;
import X.C78685UuP;
import X.C84393XAf;
import X.C84408XAu;
import X.C84410XAw;
import X.C84460XCu;
import X.C84465XCz;
import X.C84466XDa;
import X.C84470XDe;
import X.C84471XDf;
import X.C84472XDg;
import X.C84475XDj;
import X.C84476XDk;
import X.C84478XDm;
import X.C84480XDo;
import X.C84482XDq;
import X.C84483XDr;
import X.C84485XDt;
import X.C84487XDv;
import X.C84490XDy;
import X.C84491XDz;
import X.InterfaceC13850gX;
import X.InterfaceC58749N3x;
import X.InterfaceC84458XCs;
import X.InterfaceC84461XCv;
import X.OSZ;
import X.X1D;
import X.XCG;
import X.XCM;
import X.XCP;
import X.XCT;
import X.XCU;
import X.XCX;
import X.XD0;
import X.XD1;
import X.XD4;
import X.XD8;
import X.XDA;
import X.XDD;
import X.XDG;
import X.XDK;
import X.XDM;
import X.XDR;
import X.XDX;
import X.XDZ;
import X.XEA;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.INothingListener;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.task.FetchCategoryPagingEffectTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectManager {
    public XCT mEffectPlatform;

    public void onEnterScene(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void clearCurrentEffectChannel() {
        ((XEA) this.mEffectPlatform.LJ.getValue()).LIZ.LIZ = new EffectChannelResponse(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public void clearEffects() {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        C84408XAu c84408XAu = new C84408XAu(xct, C84410XAw.LIZ());
        XCX xcx = xct.LJFF.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84408XAu);
        }
    }

    public void destroy() {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XCX xcx = xct.LJFF.LJJIIJ;
        if (xcx != null) {
            if (!xcx.LIZIZ.isEmpty()) {
                for (Map.Entry<String, InterfaceC13850gX> entry : xcx.LIZIZ.entrySet()) {
                    entry.getKey();
                    entry.getValue().cancel();
                }
            }
            xcx.LIZIZ.clear();
        }
        xct.LJFF.LJJIZ.getClass();
        XCM.LIZIZ.clear();
        xct.LJFF.LJJJ.LIZ.clear();
    }

    public com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse getCurrentEffectChannel() {
        return new com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse((EffectChannelResponse) ((XEA) this.mEffectPlatform.LJ.getValue()).LIZ.LIZ);
    }

    public void removeListener() {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LJFF.LJJJ.LIZ.clear();
    }

    public XCT getEffectPlatform() {
        return this.mEffectPlatform;
    }

    public XCT getKNEffectPlatform() {
        return this.mEffectPlatform;
    }

    public void cancelEffectTask(Effect effect) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            xct.LIZ(effect);
        }
    }

    public void clearCache(String str) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        if (str != null) {
            InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
            if (interfaceC84458XCs != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("effectchannel");
                LIZ.append(str);
                LIZ.append("(.*)");
                interfaceC84458XCs.removePattern(X1D.LIZIZ(LIZ));
            }
            InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
            if (interfaceC84458XCs2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(C10820be.LIZ);
                LIZ2.append("effect_version");
                LIZ2.append("(.*)");
                interfaceC84458XCs2.removePattern(X1D.LIZIZ(LIZ2));
            }
            InterfaceC84458XCs interfaceC84458XCs3 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
            if (interfaceC84458XCs3 != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append(C10820be.LIZ);
                LIZ3.append("effectchannel");
                LIZ3.append("(.*)");
                interfaceC84458XCs3.removePattern(X1D.LIZIZ(LIZ3));
            }
            InterfaceC84458XCs interfaceC84458XCs4 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
            if (interfaceC84458XCs4 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(str);
                LIZ4.append(C10820be.LIZ);
                LIZ4.append("category_version");
                LIZ4.append("(.*)");
                interfaceC84458XCs4.removePattern(X1D.LIZIZ(LIZ4));
            }
            InterfaceC84458XCs interfaceC84458XCs5 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
            if (interfaceC84458XCs5 != null) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("effectchannelinfosticker");
                LIZ5.append(str);
                LIZ5.append("(.*)");
                interfaceC84458XCs5.removePattern(X1D.LIZIZ(LIZ5));
            }
            InterfaceC84458XCs interfaceC84458XCs6 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
            if (interfaceC84458XCs6 != null) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(str);
                LIZ6.append(C10820be.LIZ);
                LIZ6.append("info_sticker_version");
                LIZ6.append("(.*)");
                interfaceC84458XCs6.removePattern(X1D.LIZIZ(LIZ6));
            }
            xct.LIZIZ(str);
            return;
        }
        xct.getClass();
    }

    public void clearVersion(String str) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LIZIZ(str);
    }

    public void deleteEffect(Effect effect) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        if (effect == null) {
            xct.getClass();
            return;
        }
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
        if (interfaceC84458XCs != null) {
            interfaceC84458XCs.remove(effect.getId());
        }
        InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(xct.LJFF.LJJIFFI);
        if (interfaceC84458XCs2 == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(effect.getId());
        LIZ.append(".zip");
        interfaceC84458XCs2.remove(X1D.LIZIZ(LIZ));
    }

    public boolean init(EffectConfiguration effectConfiguration) {
        this.mEffectPlatform = new XCT(effectConfiguration.getEffectConfig());
        return true;
    }

    public boolean isEffectDownloaded(Effect effect) {
        return this.mEffectPlatform.LJIIJJI(effect);
    }

    public boolean isEffectDownloading(Effect effect) {
        XCT xct = this.mEffectPlatform;
        xct.getClass();
        o.LJIIJ(effect, "effect");
        XDM.LIZ.getClass();
        if (XDM.LJFF(effect)) {
            XCM xcm = xct.LJFF.LJJIZ;
            String effect_id = effect.getEffect_id();
            xcm.getClass();
            if (XCM.LIZLLL(effect_id)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEffectReady(Effect effect) {
        return this.mEffectPlatform.LJIIL(effect);
    }

    public void markEffectUsed(Effect effect) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            xct.LJIILIIL(effect);
        }
    }

    public void pauseEffectTask(Effect effect) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            xct.LJIILL(effect);
        }
    }

    public void recommendSearchWords(XDR<RecommendSearchWordsResponse> xdr) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XCU LJIIJ = xct.LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XCG xcg = LJIIJ.LIZJ;
        XCX xcx = xcg.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84483XDr(xcg, LIZ));
        }
    }

    public long removeUnused(long j) {
        OSZ<Integer, Long> osz;
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return 0L;
        }
        XCU LJIIJ = xct.LJIIJ();
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) LJIIJ.LIZJ.LJJIFFI.LIZ;
        if (interfaceC84458XCs == null || (osz = interfaceC84458XCs.LIZLLL(j)) == null) {
            osz = new OSZ<>(0, 0L);
        }
        int intValue = osz.getFirst().intValue();
        long longValue = osz.getSecond().longValue();
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) LJIIJ.LIZJ.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            HashMap LIZJ = C03660Ck.LIZJ("clean_type", "effect");
            float f = 1024;
            LIZJ.put("clean_size", Float.valueOf(((((float) longValue) * 1.0f) / f) / f));
            LIZJ.put("clean_num", Integer.valueOf(intValue));
            LIZJ.put("clean_category", "effect");
            interfaceC58749N3x.monitorStatusRate("tool_performance_clean_cache", 0, LIZJ);
        }
        C84393XAf c84393XAf = (C84393XAf) xct.LIZLLL.getValue();
        OSZ<Integer, Long> LIZLLL = c84393XAf.LIZJ.LIZLLL(j);
        int intValue2 = LIZLLL.getFirst().intValue();
        long longValue2 = LIZLLL.getSecond().longValue();
        InterfaceC58749N3x interfaceC58749N3x2 = (InterfaceC58749N3x) c84393XAf.LJFF.LJIJJ.LIZ;
        if (interfaceC58749N3x2 != null) {
            HashMap LIZJ2 = C03660Ck.LIZJ("clean_type", "effect");
            float f2 = 1024;
            LIZJ2.put("clean_size", Float.valueOf(((((float) longValue2) * 1.0f) / f2) / f2));
            LIZJ2.put("clean_num", Integer.valueOf(intValue2));
            LIZJ2.put("clean_category", "algorithm");
            interfaceC58749N3x2.monitorStatusRate("tool_performance_clean_cache", 0, LIZJ2);
        }
        return longValue + longValue2;
    }

    public void checkPanelIsUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, null, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, null, iCheckChannelListener);
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
        downloadEffectList(list, iFetchEffectListListener, null);
    }

    public void downloadProviderEffect(ProviderEffect effect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        InterfaceC84461XCv kNListener = ListenerAdaptExtKt.toKNListener(iDownloadProviderEffectListener);
        o.LJIIJ(effect, "effect");
        XCU LJIIJ = xct.LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        C84460XCu c84460XCu = new C84460XCu(LJIIJ.LIZJ, effect, LIZ);
        XCX xcx = LJIIJ.LIZJ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84460XCu);
        }
    }

    public void fetchEffect(EffectQRCode effect, IScanQRCodeListener iScanQRCodeListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<com.ss.ugc.effectplatform.model.Effect> kNListener = ListenerAdaptExtKt.toKNListener(iScanQRCodeListener);
        o.LJIIJ(effect, "effect");
        C84490XDy c84490XDy = new C84490XDy(xct, kNListener);
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, c84490XDy);
        XDA xda = new XDA(LJIIIZ.LIZ, effect, LIZ);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xda);
        }
    }

    public void fetchEffectList(List<String> list, IFetchEffectListListener iFetchEffectListListener) {
        fetchEffectList(list, true, null, iFetchEffectListListener);
    }

    public void fetchEffectListFromCache(String panel, IFetchEffectChannelListener iFetchEffectChannelListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        C84487XDv c84487XDv = new C84487XDv(xct, kNListener);
        if (!C107244Iu.LIZIZ(panel)) {
            xct.LJIIIZ().LIZJ(panel, true, c84487XDv);
        } else {
            xct.LJIIIZ().LIZJ("default", true, c84487XDv);
        }
    }

    public void fetchEffectListFromCacheChecked(String panel, IFetchEffectChannelListener iFetchEffectChannelListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        C84487XDv c84487XDv = new C84487XDv(xct, kNListener);
        if (!C107244Iu.LIZIZ(panel)) {
            xct.LJIIIZ().LIZLLL(panel, true, null, c84487XDv);
        } else {
            xct.LJIIIZ().LIZLLL("default", true, null, c84487XDv);
        }
    }

    public void fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, xct.LJFF.LJJIIJ);
        if (!C107244Iu.LIZIZ(str)) {
            xct.LJIIIZ().LIZIZ(str, kNListener);
        } else {
            xct.LJIIIZ().LIZIZ("default", kNListener);
        }
    }

    public void fetchFavoriteList(String str, IFetchFavoriteList iFetchFavoriteList) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LJI(str, null, ListenerAdaptExtKt.toKNListener(iFetchFavoriteList));
    }

    public void fetchResourceList(Map<String, String> map, com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener iFetchResourceListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<ResourceListModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchResourceListener);
        XCU LJIIJ = xct.LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XCG xcg = LJIIJ.LIZJ;
        XCX xcx = xcg.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84478XDm(xcg, LIZ, map));
        }
    }

    public void queryVideoUsedStickers(Map<String, String> map, IEffectListResponseListener iEffectListResponseListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iEffectListResponseListener);
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        C84466XDa c84466XDa = new C84466XDa(LJIIIZ.LIZ, LIZ, map);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84466XDa);
        }
    }

    public void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XCP kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListener);
        o.LJIIJ(effect, "effect");
        xct.LJIIJ().LIZLLL(effect, false, kNListener);
    }

    public void fetchEffect(String str, IFetchEffectListener iFetchEffectListener) {
        fetchEffectWithDownload(str, null, iFetchEffectListener);
    }

    public void checkCategoryIsUpdate(String str, String str2, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, null, iCheckChannelListener);
    }

    public void checkPanelIsUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, map, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, map, iCheckChannelListener);
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener, DownloadEffectExtra downloadEffectExtra) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LIZJ(ListenerAdaptExtKt.toKNListener(iFetchEffectListListener), downloadEffectExtra, list);
    }

    public void fetchEffectFirst(Effect effect, boolean z, IFetchEffectListener iFetchEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            XCP kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListener);
            xct.getClass();
            o.LJIIJ(effect, "effect");
            xct.LJIIJ().LIZJ(effect, false, true, z, false, kNListener);
        }
    }

    public void fetchEffectList(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener);
        XCU LJIIJ = xct.LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XCG xcg = LJIIJ.LIZJ;
        XCX xcx = xcg.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new XDZ(xcg, list, LIZ, map, false, LJIIJ.LIZIZ));
        }
    }

    public void fetchEffectList2(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (this.mEffectPlatform == null) {
            return;
        }
        this.mEffectPlatform.LJFF(new ArrayList<>(list), map, ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener));
    }

    public void fetchEffectWithDownload(String effectId, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XCP kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListener);
        xct.getClass();
        o.LJIIJ(effectId, "effectId");
        xct.LJ(C05040Hs.LIZIZ(effectId), true, map, new C84491XDz(kNListener));
    }

    public void fetchFavoriteList(String str, Map<String, String> map, IFetchFavoriteList iFetchFavoriteList) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LJI(str, map, ListenerAdaptExtKt.toKNListener(iFetchFavoriteList));
    }

    public void fetchRecentUsedEffect(String panel, Map<String, String> map, IFetchFavoriteList iFetchFavoriteList) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<FetchFavoriteListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchFavoriteList);
        o.LJIIJ(panel, "panel");
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XDK xdk = new XDK(LJIIIZ.LIZ, panel, LIZ, map);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xdk);
        }
    }

    public void getCustomizedEffectId(long j, Map<String, String> map, XDR<GetCustomizedEffectIDData> xdr) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84475XDj(LJIIIZ.LIZ, j, LIZ, map));
        }
    }

    public void isTagUpdated(String effectId, String updateTime, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iIsTagNeedUpdatedListener);
        o.LJIIJ(effectId, "effectId");
        o.LJIIJ(updateTime, "updateTime");
        C84465XCz c84465XCz = (C84465XCz) xct.LIZJ.getValue();
        c84465XCz.getClass();
        String LIZ = C84410XAw.LIZ();
        if (c84465XCz.LIZ.LIZ == null) {
            c84465XCz.LIZIZ.LJJJ.LIZIZ(LIZ, new XD0(c84465XCz, effectId, updateTime, kNListener));
            C84485XDt c84485XDt = new C84485XDt(c84465XCz.LIZIZ, LIZ);
            XCX xcx = c84465XCz.LIZIZ.LJJIIJ;
            if (xcx != null) {
                xcx.LIZ(c84485XDt);
                return;
            }
            return;
        }
        c84465XCz.LIZ(effectId, updateTime, kNListener);
    }

    public void resumeEffectTask(Effect effect, boolean z, boolean z2) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            xct.LJIIZILJ(effect, z, z2);
        }
    }

    public void updateTag(String effectId, String updateTime, IUpdateTagListener iUpdateTagListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XD4 kNListener = ListenerAdaptExtKt.toKNListener(iUpdateTagListener);
        o.LJIIJ(effectId, "effectId");
        o.LJIIJ(updateTime, "updateTime");
        C84465XCz c84465XCz = (C84465XCz) xct.LIZJ.getValue();
        c84465XCz.getClass();
        String LIZ = C84410XAw.LIZ();
        if (c84465XCz.LIZ.LIZ == null) {
            c84465XCz.LIZIZ.LJJJ.LIZIZ(LIZ, new XD1(c84465XCz, LIZ, effectId, updateTime, kNListener));
            C84485XDt c84485XDt = new C84485XDt(c84465XCz.LIZIZ, LIZ);
            XCX xcx = c84465XCz.LIZIZ.LJJIIJ;
            if (xcx != null) {
                xcx.LIZ(c84485XDt);
                return;
            }
            return;
        }
        c84465XCz.LIZIZ(LIZ, effectId, updateTime, kNListener);
    }

    public void fetchEffectList(String panel, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        C84480XDo c84480XDo = new C84480XDo(xct, z, kNListener);
        if (!C107244Iu.LIZIZ(panel)) {
            xct.LJIIIZ().LIZJ(panel, false, c84480XDo);
        } else {
            xct.LJIIIZ().LIZJ("default", false, c84480XDo);
        }
    }

    public void fetchEffectList(List<String> list, boolean z, IFetchEffectListListener iFetchEffectListListener) {
        fetchEffectList(list, z, null, iFetchEffectListListener);
    }

    public void checkCategoryIsUpdate(String str, String str2, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, map, iCheckChannelListener);
    }

    public void fetchEffectList(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LJ(list, z, map, ListenerAdaptExtKt.toKNListener(iFetchEffectListListener));
    }

    public void fetchEffectListChecked(String panel, boolean z, Map<String, String> map, IFetchEffectChannelListener iFetchEffectChannelListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        C84480XDo c84480XDo = new C84480XDo(xct, z, kNListener);
        if (!C107244Iu.LIZIZ(panel)) {
            xct.LJIIIZ().LIZLLL(panel, false, map, c84480XDo);
        } else {
            xct.LJIIIZ().LIZLLL("default", false, map, c84480XDo);
        }
    }

    public void modifyFavoriteList(String str, String str2, Boolean bool, IModFavoriteList iModFavoriteList) {
        if (this.mEffectPlatform == null) {
            return;
        }
        this.mEffectPlatform.LJIILJJIL(str, C05040Hs.LIZIZ(str2), bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
    }

    public void modifyFavoriteList(String str, List<String> list, Boolean bool, IModFavoriteList iModFavoriteList) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LJIILJJIL(str, list, bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
    }

    private void checkUpdate(String checkKey, String str, int i, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iCheckChannelListener);
        o.LJIIJ(checkKey, "checkKey");
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XDD xdd = new XDD(LJIIIZ.LIZ, LIZ, checkKey, str, i, map);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xdd);
        }
    }

    public void fetchEffectExt(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            xct.LIZLLL(effect, z, z2, z3, ListenerAdaptExtKt.toKNListener(iFetchEffectListener));
        }
    }

    public void fetchHotEffect(int i, int i2, Map<String, String> map, boolean z, IFetchHotEffectListener iFetchHotEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<FetchHotEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchHotEffectListener);
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XDG xdg = new XDG(LJIIIZ.LIZ, i, i2, LIZ, map);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xdg);
        }
    }

    public void fetchProviderEffect(String str, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        fetchProviderEffect(str, z, i, i2, null, iFetchProviderEffect);
    }

    public void fetchProviderEffectsByGiphyIds(String giphyIds, String str, Map<String, String> map, boolean z, XDR<GifProviderEffectListResponse> xdr) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        o.LJIIJ(giphyIds, "giphyIds");
        XCU LJIIJ = xct.LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, xdr);
        }
        C84471XDf c84471XDf = new C84471XDf(LJIIJ.LIZJ, LIZ, giphyIds, str, map, z);
        XCX xcx = LJIIJ.LIZJ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84471XDf);
        }
    }

    public void fetchRewardEffects(String panel, int i, int i2, Map<String, String> map, IRewardEffectsListener iRewardEffectsListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<QueryRewardEffectsResponse> kNListener = ListenerAdaptExtKt.toKNListener(iRewardEffectsListener);
        o.LJIIJ(panel, "panel");
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new XDX(LJIIIZ.LIZ, panel, LIZ, i, i2, map));
        }
    }

    public void fetchPanelInfo(String panel, boolean z, String str, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<PanelInfoModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        xct.LJIIIZ().LJ(panel, z, str, i, i2, false, null, kNListener);
    }

    public void fetchPanelInfoFromCache(String panel, boolean z, String str, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<PanelInfoModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        xct.LJIIIZ().LJ(panel, z, str, i, i2, true, null, kNListener);
    }

    public void fetchPanelInfoFromCacheChecked(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LJII(str, z, str2, i, i2, true, null, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, xct.LJFF.LJJIIJ));
    }

    public void fetchProviderEffect(String str, boolean z, int i, int i2, String str2, IFetchProviderEffect iFetchProviderEffect) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        C84470XDe c84470XDe = new C84470XDe(i, i2, LJIIIZ.LIZ, LIZ, str, str2);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84470XDe);
        }
    }

    public void searchEffect(String panel, String keyWord, int i, int i2, Map<String, String> map, ISearchEffectListener iSearchEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<SearchEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListener);
        o.LJIIJ(panel, "panel");
        o.LJIIJ(keyWord, "keyWord");
        XCU LJIIJ = xct.LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XCG xcg = LJIIJ.LIZJ;
        XCX xcx = xcg.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84476XDk(i, i2, xcg, panel, keyWord, LIZ, map));
        }
    }

    public void searchEffects(String searchId, String keyword, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<SearchEffectResponseV2> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListenerV2);
        xct.getClass();
        o.LJIIJ(searchId, "searchId");
        o.LJIIJ(keyword, "keyword");
        xct.LJIIJ().LJFF(i, i2, kNListener, searchId, keyword, null, map);
    }

    public void searchProviderEffect(String str, String str2, int i, int i2, boolean z, IFetchProviderEffect iFetchProviderEffect) {
        searchProviderEffect(str, str2, i, i2, z, null, iFetchProviderEffect);
    }

    public void updateUsedEffect(String panel, List<String> effectIds, boolean z, long j, Map<String, String> map, INothingListener iNothingListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR kNListener = ListenerAdaptExtKt.toKNListener(iNothingListener);
        o.LJIIJ(panel, "panel");
        o.LJIIJ(effectIds, "effectIds");
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        XD8 xd8 = new XD8(LJIIIZ.LIZ, panel, LIZ, effectIds, z, j, map);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xd8);
        }
    }

    public void fetchCategoryEffect(String panel, String str, int i, int i2, int i3, String str2, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        xct.LJIIIZ().LIZ(panel, str, i, i2, i3, str2, false, null, kNListener);
    }

    public void fetchCategoryEffectFromCache(String panel, String str, int i, int i2, int i3, String str2, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        xct.LJIIIZ().LIZ(panel, str, i, i2, i3, str2, true, null, kNListener);
    }

    public void fetchPanelInfo(String panel, boolean z, String str, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<PanelInfoModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        xct.LJIIIZ().LJ(panel, z, str, i, i2, false, map, kNListener);
    }

    public void fetchPanelInfoChecked(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        xct.LJII(str, z, str2, i, i2, false, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, xct.LJFF.LJJIIJ));
    }

    public void searchProviderEffect(String keyWord, String str, int i, int i2, boolean z, String str2, IFetchProviderEffect iFetchProviderEffect) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        o.LJIIJ(keyWord, "keyWord");
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        C84472XDg c84472XDg = new C84472XDg(LJIIIZ.LIZ, LIZ, keyWord, str, i, i2, str2);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84472XDg);
        }
    }

    public void fetchCategoryEffect(String panel, String str, int i, int i2, int i3, String str2, Map<String, String> map, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        xct.LJIIIZ().LIZ(panel, str, i, i2, i3, str2, false, map, kNListener);
    }

    public void fetchCategoryPagingEffect(String panel, String str, int i, int i2, int i3, String str2, Map<String, String> map, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        XCT xct = this.mEffectPlatform;
        if (xct == null) {
            return;
        }
        XDR<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, xct.LJFF.LJJIIJ);
        o.LJIIJ(panel, "panel");
        C84482XDq LJIIIZ = xct.LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (kNListener != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, kNListener);
        }
        FetchCategoryPagingEffectTask fetchCategoryPagingEffectTask = new FetchCategoryPagingEffectTask(LJIIIZ.LIZ, panel, LIZ, str, i, i2, i3, str2, map);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(fetchCategoryPagingEffectTask);
        }
    }

    public void fetchPanelInfoPagingChecked(String str, String str2, int i, int i2, int i3, String str3, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            xct.LJIIIIZZ(str, str2, i, i2, i3, str3, false, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, xct.LJFF.LJJIIJ));
        }
    }

    public void fetchPanelInfoPagingCheckedFromCache(String str, String str2, int i, int i2, int i3, String str3, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        XCT xct = this.mEffectPlatform;
        if (xct != null) {
            xct.LJIIIIZZ(str, str2, i, i2, i3, str3, true, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, xct.LJFF.LJJIIJ));
        }
    }
}
