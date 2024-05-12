package X;

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
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDU implements InterfaceC84497XEf {
    public static final ExceptionResult LJLJI;
    public boolean LJLIL;
    public EffectManager LJLILLLLZI;

    @Override // X.InterfaceC84497XEf
    public final void LIZIZ(Effect effect) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LIZJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // X.InterfaceC84497XEf
    public final void LIZLLL(String effectId, java.util.Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effectId, "effectId");
    }

    @Override // X.InterfaceC84497XEf
    public final void LJFF(String panel, boolean z, String str, int i, int i2, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILL(String panel, boolean z, String str, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.InterfaceC84497XEf
    public final EffectConfiguration LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJ(long j, XDR<GetCustomizedEffectIDData> xdr) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJII(String panel, boolean z, String str, int i, int i2, TPL tpl) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIII(Effect effect, boolean z, IFetchEffectListener iFetchEffectListener) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIZ(String panel) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJIIJI(String panel, boolean z, String str, int i, int i2, int i3, String str2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJL(String panel, IFetchEffectChannelListener iFetchEffectChannelListener) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.InterfaceC84497XEf
    public final boolean LJJIZ(String panel) {
        o.LJIIIZ(panel, "panel");
        return false;
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJ(String host, String creationId, String word, int i, int i2, java.util.Map map, TJL tjl) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(word, "word");
        o.LJIIIZ(map, "map");
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJI(Effect effect) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJI(String str, C93833mF c93833mF, IFetchEffectChannelListener iFetchEffectChannelListener) {
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJIZL(String panel, int i, int i2, int i3, String str, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.InterfaceC84497XEf
    public final void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
    }

    static {
        ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
        exceptionResult.setErrorCode(-1);
        exceptionResult.setMsg("effect sdk manager init failed");
        LJLJI = exceptionResult;
        new C84418XBe(new RuntimeException());
    }

    public final EffectManager LJJJJZ() {
        EffectManager effectManager = this.LJLILLLLZI;
        if (effectManager != null) {
            return effectManager;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC84497XEf
    public final void destroy() {
        EffectManager effectManager = this.LJLILLLLZI;
        if (effectManager != null) {
            effectManager.destroy();
        }
        this.LJLILLLLZI = null;
        this.LJLIL = false;
    }

    @Override // X.InterfaceC84497XEf
    public final EffectManager LJLJJLL() {
        return this.LJLILLLLZI;
    }

    public XDU(EffectManager effectManager) {
        boolean z;
        if (effectManager != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        this.LJLILLLLZI = effectManager;
    }

    @Override // X.InterfaceC84497XEf
    public final boolean LJJIL(Effect effect) {
        boolean isEffectDownloaded;
        o.LJIIIZ(effect, "effect");
        if (this.LJLIL) {
            if (DownloadableModelSupport.isInitialized()) {
                isEffectDownloaded = DownloadableModelSupport.getInstance().isEffectReady(LJJJJZ(), effect);
            } else {
                isEffectDownloaded = LJJJJZ().isEffectDownloaded(effect);
            }
            if (isEffectDownloaded) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIIJ(ProviderEffect effect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        o.LJIIIZ(effect, "effect");
        if (!this.LJLIL) {
            ((TO6) iDownloadProviderEffectListener).onFail(effect, LJLJI);
        } else {
            LJJJJZ().downloadProviderEffect(effect, iDownloadProviderEffectListener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIIL(String str, TJR tjr) {
        if (!this.LJLIL) {
            tjr.onFail(null, new C84418XBe(-1));
        } else {
            LJJJJZ().recommendSearchWords(tjr);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIZI(Effect effect, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effect, "effect");
        if (!this.LJLIL) {
            iFetchEffectListener.onFail(effect, LJLJI);
        } else {
            LJJJJZ().fetchEffect(effect, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJJL(C74548TNo c74548TNo, InfoStickerEffect sticker) {
        o.LJIIIZ(sticker, "sticker");
        if (!this.LJLIL) {
            c74548TNo.onFail(sticker, new C84418XBe(-1));
            return;
        }
        XCT effectPlatform = LJJJJZ().getEffectPlatform();
        effectPlatform.getClass();
        XCU LJIIJ = effectPlatform.LJIIJ();
        LJIIJ.getClass();
        Integer source = sticker.getSource();
        if (source != null) {
            if (source.intValue() == 1) {
                LJIIJ.LIZLLL(sticker.getLoki_effect(), false, new XE6(c74548TNo, sticker));
                return;
            }
            if (source.intValue() == 2) {
                com.ss.ugc.effectplatform.model.ProviderEffect sticker2 = sticker.getSticker();
                XE5 xe5 = new XE5(c74548TNo, sticker);
                String LIZ = C84410XAw.LIZ();
                LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, xe5);
                C84459XCt c84459XCt = new C84459XCt(LJIIJ.LIZJ, sticker2, LIZ);
                XCX xcx = LJIIJ.LIZJ.LJJIIJ;
                if (xcx == null) {
                    return;
                }
                xcx.LIZ(c84459XCt);
                return;
            }
        }
        c74548TNo.onFail(sticker, new C84418XBe(new IllegalArgumentException("sticker source illegal")));
    }

    @Override // X.InterfaceC84497XEf
    public final void LIZ(List<String> effectIds, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        o.LJIIIZ(effectIds, "effectIds");
        if (!this.LJLIL) {
            iFetchEffectListByIdsListener.onFail(LJLJI);
        } else {
            LJJJJZ().fetchEffectList2(effectIds, map, iFetchEffectListByIdsListener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJI(String panel, boolean z, IFetchEffectChannelListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        if (!this.LJLIL) {
            listener.onFail(LJLJI);
        } else {
            checkUpdate(panel, null, 0, null, new XF1(this, panel, z, listener));
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILIIL(String panel, java.util.Map map, C74434TJe c74434TJe) {
        o.LJIIIZ(panel, "panel");
        if (!this.LJLIL) {
            c74434TJe.onFailed(LJLJI);
        } else {
            LJJJJZ().fetchFavoriteList(panel, c74434TJe);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        if (str == null || str2 == null) {
            return;
        }
        if (!this.LJLIL) {
            iUpdateTagListener.onFinally();
        } else {
            LJJJJZ().updateTag(str, str2, iUpdateTagListener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJ(List list, boolean z, java.util.Map map, IFetchEffectListListener iFetchEffectListListener) {
        if (!this.LJLIL) {
            iFetchEffectListListener.onFail(LJLJI);
        } else {
            LJJJJZ().fetchEffectList(list, z, map, iFetchEffectListListener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJII(String panel, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
        o.LJIIIZ(panel, "panel");
        if (!this.LJLIL) {
            ((C74432TJc) iModFavoriteList).onFail(LJLJI);
        } else {
            LJJJJZ().modifyFavoriteList(panel, list, Boolean.valueOf(z), iModFavoriteList);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIIIIZZ(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (str == null || C77413UZt.LJIILL(list)) {
            return;
        }
        if (!this.LJLIL) {
            iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
        } else {
            LJJJJZ().isTagUpdated(str, str2, iIsTagNeedUpdatedListener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJLI(String panel, boolean z, boolean z2, IFetchEffectChannelListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        if (!this.LJLIL) {
            listener.onFail(LJLJI);
        } else if (z) {
            LJJJJZ().fetchEffectListFromCache(panel, listener);
        } else {
            LJJJJZ().fetchEffectList(panel, z2, listener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIIIZ(String str, String str2, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        if (!this.LJLIL) {
            ((TPD) iFetchProviderEffect).onFail(LJLJI);
        } else {
            LJJJJZ().fetchProviderEffect(str, false, i, i2, str2, iFetchProviderEffect);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void checkUpdate(String str, String str2, int i, java.util.Map map, ICheckChannelListener iCheckChannelListener) {
        if (!this.LJLIL) {
            iCheckChannelListener.checkChannelFailed(LJLJI);
            return;
        }
        InterfaceC84497XEf.LJJLIIJ.getClass();
        if (i == 2) {
            LJJJJZ().checkPanelIsUpdate(str, map, iCheckChannelListener);
            return;
        }
        if (i == 1) {
            EffectManager LJJJJZ = LJJJJZ();
            o.LJI(str);
            o.LJI(str2);
            LJJJJZ.checkCategoryIsUpdate(str, str2, map, iCheckChannelListener);
            return;
        }
        LJJJJZ().checkedEffectListUpdate(str, map, iCheckChannelListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJI(int i, String creationId, String imageUri, Integer num, Integer num2, C74576TOq c74576TOq) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(imageUri, "imageUri");
        if (!this.LJLIL) {
            c74576TOq.onFail(null, new C84418XBe(-1));
        } else {
            LJJJJZ().getEffectPlatform().LJIILLIIL(i, creationId, imageUri, num, num2, null, null, c74576TOq);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILLIIL(String str, String searchId, String keyword, int i, int i2, java.util.Map extraParams, TJM tjm) {
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(extraParams, "extraParams");
        if (!this.LJLIL) {
            tjm.onFail(LJLJI);
        } else {
            LJJJJZ().searchEffects(searchId, keyword, i, i2, extraParams, tjm);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIJ(String keyWord, String str, int i, int i2, boolean z, String str2, IFetchProviderEffect iFetchProviderEffect) {
        o.LJIIIZ(keyWord, "keyWord");
        if (!this.LJLIL) {
            ((TPE) iFetchProviderEffect).onFail(LJLJI);
        } else {
            LJJJJZ().searchProviderEffect(keyWord, str, i, i2, z, str2, iFetchProviderEffect);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJIL(String panel, String str, int i, int i2, int i3, String str2, TJH tjh) {
        o.LJIIIZ(panel, "panel");
        if (!this.LJLIL) {
            tjh.onFail(LJLJI);
        } else {
            LJJJJZ().fetchCategoryPagingEffect(panel, str, i, i2, i3, str2, null, tjh);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJJ(String panel, boolean z, String str, int i, int i2, boolean z2, boolean z3, IFetchPanelInfoListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        if (!this.LJLIL) {
            listener.onFail(LJLJI);
        } else if (z2) {
            LJJJJZ().fetchPanelInfoFromCache(panel, z, str, i, i2, listener);
        } else {
            LJJJJZ().fetchPanelInfo(panel, z, str, i, i2, listener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void fetchCategoryEffect(String panel, String str, int i, int i2, int i3, String str2, boolean z, IFetchCategoryEffectListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        if (!this.LJLIL) {
            listener.onFail(LJLJI);
        } else if (z) {
            LJJJJZ().fetchCategoryEffectFromCache(panel, str, i, i2, i3, str2, listener);
        } else {
            LJJJJZ().fetchCategoryEffect(panel, str, i, i2, i3, str2, listener);
        }
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJ(String panel, String str, int i, int i2, int i3, String str2, boolean z, IFetchCategoryEffectListener listener, java.util.Map<String, String> map) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        if (!this.LJLIL) {
            listener.onFail(LJLJI);
        } else if (z) {
            LJJJJZ().fetchCategoryEffectFromCache(panel, str, i, i2, i3, str2, listener);
        } else {
            LJJJJZ().fetchCategoryEffect(panel, str, i, i2, i3, str2, map, listener);
        }
    }
}
