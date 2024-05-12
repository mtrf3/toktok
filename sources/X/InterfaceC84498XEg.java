package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.EffectManager;
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
import java.util.List;

/* renamed from: X.XEg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC84498XEg extends InterfaceC84497XEf {
    void G8(LifecycleOwner lifecycleOwner);

    @Override // X.InterfaceC84497XEf
    void LIZ(List<String> list, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    @Override // X.InterfaceC84497XEf
    void LIZJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener);

    @Override // X.InterfaceC84497XEf
    void LIZLLL(String str, java.util.Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    @Override // X.InterfaceC84497XEf
    void LJ(List list, boolean z, java.util.Map map, IFetchEffectListListener iFetchEffectListListener);

    @Override // X.InterfaceC84497XEf
    void LJFF(String str, boolean z, String str2, int i, int i2, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener);

    @Override // X.InterfaceC84497XEf
    void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    @Override // X.InterfaceC84497XEf
    void LJII(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);

    @Override // X.InterfaceC84497XEf
    void LJIIIIZZ(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    @Override // X.InterfaceC84497XEf
    void LJIIIZ(String str, String str2, int i, int i2, IFetchProviderEffect iFetchProviderEffect);

    @Override // X.InterfaceC84497XEf
    void LJIIJ(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    void LJIIJJI(java.util.Map<String, Object> map);

    void LJIILJJIL(String str, boolean z, String str2, IFetchPanelInfoListener iFetchPanelInfoListener);

    boolean LJIJ(Effect effect);

    void LJIJI(java.util.Map<String, String> map);

    void LJIJJLI(int i, int i2, int i3, C74582TOw c74582TOw, String str, String str2, java.util.Map map);

    void LJIL(String str);

    void LJJIFFI(int i, int i2, int i3, C74584TOy c74584TOy, String str, String str2, java.util.Map map);

    void LJJIIJZLJL(String str, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    void LJJIJIIJIL();

    boolean LJJIJLIJ(Effect effect);

    void LJJJIL(List<String> list, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void LJJJJ(String str, HQD hqd);

    void LJJJJL(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    void LJJJJLL(String str, String str2, boolean z, I81 i81);

    @Override // X.InterfaceC84497XEf
    EffectManager LJLJJLL();

    @Override // X.InterfaceC84497XEf
    void destroy();

    @Override // X.InterfaceC84497XEf
    void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener);

    void fetchList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    @Override // X.InterfaceC84497XEf
    void updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener);
}
