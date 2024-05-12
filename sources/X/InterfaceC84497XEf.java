package X;

import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
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

/* renamed from: X.XEf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC84497XEf {
    public static final XEV LJJLIIJ = XEV.LIZ;

    void LIZ(List<String> list, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void LIZIZ(Effect effect);

    void LIZJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener);

    void LIZLLL(String str, java.util.Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    void LJ(List list, boolean z, java.util.Map map, IFetchEffectListListener iFetchEffectListListener);

    void LJFF(String str, boolean z, String str2, int i, int i2, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener);

    void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    void LJII(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);

    void LJIIIIZZ(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    void LJIIIZ(String str, String str2, int i, int i2, IFetchProviderEffect iFetchProviderEffect);

    void LJIIJ(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    void LJIIL(String str, TJR tjr);

    void LJIILIIL(String str, java.util.Map map, C74434TJe c74434TJe);

    void LJIILL(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener);

    void LJIILLIIL(String str, String str2, String str3, int i, int i2, java.util.Map map, TJM tjm);

    void LJIIZILJ(String str, C43313GzF c43313GzF);

    EffectConfiguration LJIJJ();

    void LJJ(long j, XDR<GetCustomizedEffectIDData> xdr);

    void LJJI(int i, String str, String str2, Integer num, Integer num2, C74576TOq c74576TOq);

    void LJJII(String str, boolean z, String str2, int i, int i2, TPL tpl);

    void LJJIII(Effect effect, boolean z, IFetchEffectListener iFetchEffectListener);

    void LJJIIJ(String str, String str2, int i, int i2, boolean z, String str3, IFetchProviderEffect iFetchProviderEffect);

    void LJJIIZ(String str);

    void LJJIIZI(Effect effect, IFetchEffectListener iFetchEffectListener);

    void LJJIJ(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener, java.util.Map<String, String> map);

    void LJJIJIIJI(String str, boolean z, String str2, int i, int i2, int i3, String str3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener);

    void LJJIJIL(String str, String str2, int i, int i2, int i3, String str3, TJH tjh);

    void LJJIJL(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    boolean LJJIL(Effect effect);

    boolean LJJIZ(String str);

    void LJJJ(String str, String str2, String str3, int i, int i2, java.util.Map map, TJL tjl);

    void LJJJI(Effect effect);

    void LJJJJI(String str, C93833mF c93833mF, IFetchEffectChannelListener iFetchEffectChannelListener);

    void LJJJJIZL(String str, int i, int i2, int i3, String str2, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener);

    void LJJJJJ(String str, boolean z, String str2, int i, int i2, boolean z2, boolean z3, IFetchPanelInfoListener iFetchPanelInfoListener);

    void LJJJJJL(C74548TNo c74548TNo, InfoStickerEffect infoStickerEffect);

    void LJJJJLI(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener);

    EffectManager LJLJJLL();

    void checkUpdate(String str, String str2, int i, java.util.Map map, ICheckChannelListener iCheckChannelListener);

    void destroy();

    void fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener);

    void updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener);
}
