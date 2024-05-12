package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
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
import kotlin.jvm.internal.o;

/* renamed from: X.XEd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84495XEd implements InterfaceC84498XEg {
    public final /* synthetic */ InterfaceC84498XEg LJLIL;
    public final /* synthetic */ InterfaceC84498XEg LJLILLLLZI;

    @Override // X.InterfaceC84498XEg
    public final void G8(LifecycleOwner lifecycleOwner) {
        this.LJLIL.G8(lifecycleOwner);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LIZ(List<String> effectIds, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        o.LJIIIZ(effectIds, "effectIds");
        this.LJLIL.LIZ(effectIds, map, iFetchEffectListByIdsListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LIZIZ(Effect effect) {
        this.LJLIL.LIZIZ(effect);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LIZJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL.LIZJ(effect, z, z2, z3, iFetchEffectListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LIZLLL(String effectId, java.util.Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effectId, "effectId");
        this.LJLIL.LIZLLL(effectId, map, iFetchEffectListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJ(List list, boolean z, java.util.Map map, IFetchEffectListListener iFetchEffectListListener) {
        this.LJLIL.LJ(list, z, map, iFetchEffectListListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJFF(String panel, boolean z, String str, int i, int i2, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJFF(panel, z, str, i, i2, c93833mF, iFetchPanelInfoListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJI(String panel, boolean z, IFetchEffectChannelListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LJI(panel, z, listener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJII(String panel, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJII(panel, list, z, iModFavoriteList);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJIIIIZZ(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        this.LJLIL.LJIIIIZZ(str, list, str2, iIsTagNeedUpdatedListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJIIIZ(String str, String str2, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        this.LJLIL.LJIIIZ(str, str2, i, i2, iFetchProviderEffect);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void LJIIJ(ProviderEffect effect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL.LJIIJ(effect, iDownloadProviderEffectListener);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIIJJI(java.util.Map<String, Object> map) {
        this.LJLIL.LJIIJJI(map);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIIL(String str, TJR tjr) {
        this.LJLIL.LJIIL(str, tjr);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILIIL(String panel, java.util.Map map, C74434TJe c74434TJe) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJIILIIL(panel, map, c74434TJe);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIILJJIL(String str, boolean z, String str2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.LJLIL.LJIILJJIL(str, z, str2, iFetchPanelInfoListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILL(String panel, boolean z, String str, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJIILL(panel, z, str, i, i2, z2, iFetchPanelInfoListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIILLIIL(String str, String searchId, String keyword, int i, int i2, java.util.Map extraParams, TJM tjm) {
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(extraParams, "extraParams");
        this.LJLIL.LJIILLIIL(str, searchId, keyword, i, i2, extraParams, tjm);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJIIZILJ(String effectId, C43313GzF c43313GzF) {
        o.LJIIIZ(effectId, "effectId");
        this.LJLIL.LJIIZILJ(effectId, c43313GzF);
    }

    @Override // X.InterfaceC84498XEg
    public final boolean LJIJ(Effect effect) {
        return this.LJLIL.LJIJ(effect);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIJI(java.util.Map<String, String> map) {
        this.LJLIL.LJIJI(map);
    }

    @Override // X.InterfaceC84497XEf
    public final EffectConfiguration LJIJJ() {
        return this.LJLIL.LJIJJ();
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIJJLI(int i, int i2, int i3, C74582TOw c74582TOw, String p0, String p1, java.util.Map map) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.LJLIL.LJIJJLI(i, i2, i3, c74582TOw, p0, p1, map);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJIL(String panel) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJIL(panel);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJ(long j, XDR<GetCustomizedEffectIDData> xdr) {
        this.LJLIL.LJJ(j, xdr);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJI(int i, String creationId, String imageUri, Integer num, Integer num2, C74576TOq c74576TOq) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(imageUri, "imageUri");
        this.LJLIL.LJJI(i, creationId, imageUri, num, num2, c74576TOq);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJIFFI(int i, int i2, int i3, C74584TOy c74584TOy, String p0, String str, java.util.Map map) {
        o.LJIIIZ(p0, "p0");
        this.LJLIL.LJJIFFI(i, i2, i3, c74584TOy, p0, str, map);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJII(String panel, boolean z, String str, int i, int i2, TPL tpl) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJJII(panel, z, str, i, i2, tpl);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIII(Effect effect, boolean z, IFetchEffectListener iFetchEffectListener) {
        this.LJLIL.LJJIII(effect, z, iFetchEffectListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIJ(String keyWord, String str, int i, int i2, boolean z, String str2, IFetchProviderEffect iFetchProviderEffect) {
        o.LJIIIZ(keyWord, "keyWord");
        this.LJLIL.LJJIIJ(keyWord, str, i, i2, z, str2, iFetchProviderEffect);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJIIJZLJL(String p0, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        o.LJIIIZ(p0, "p0");
        this.LJLIL.LJJIIJZLJL(p0, iFetchCategoryEffectListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIZ(String panel) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJJIIZ(panel);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIIZI(Effect effect, IFetchEffectListener listener) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LJJIIZI(effect, listener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJ(String panel, String str, int i, int i2, int i3, String str2, boolean z, IFetchCategoryEffectListener listener, java.util.Map<String, String> map) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LJJIJ(panel, str, i, i2, i3, str2, z, listener, map);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJIIJI(String panel, boolean z, String str, int i, int i2, int i3, String str2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJJIJIIJI(panel, z, str, i, i2, i3, str2, z2, iFetchPanelInfoListener);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJIJIIJIL() {
        this.LJLIL.LJJIJIIJIL();
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJIL(String panel, String str, int i, int i2, int i3, String str2, TJH tjh) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJJIJIL(panel, str, i, i2, i3, str2, tjh);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJIJL(String panel, IFetchEffectChannelListener iFetchEffectChannelListener) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJJIJL(panel, iFetchEffectChannelListener);
    }

    @Override // X.InterfaceC84497XEf
    public final boolean LJJIZ(String panel) {
        o.LJIIIZ(panel, "panel");
        return this.LJLIL.LJJIZ(panel);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJ(String host, String creationId, String word, int i, int i2, java.util.Map map, TJL tjl) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(word, "word");
        o.LJIIIZ(map, "map");
        this.LJLIL.LJJJ(host, creationId, word, i, i2, map, tjl);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJI(Effect effect) {
        this.LJLIL.LJJJI(effect);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJIL(List<String> p0, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        o.LJIIIZ(p0, "p0");
        this.LJLIL.LJJJIL(p0, map, iFetchEffectListByIdsListener);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJJ(String giphyIds, HQD hqd) {
        o.LJIIIZ(giphyIds, "giphyIds");
        this.LJLIL.LJJJJ(giphyIds, hqd);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJI(String str, C93833mF c93833mF, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.LJLIL.LJJJJI(str, c93833mF, iFetchEffectChannelListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJIZL(String panel, int i, int i2, int i3, String str, C93833mF c93833mF, IFetchPanelInfoListener iFetchPanelInfoListener) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL.LJJJJIZL(panel, i, i2, i3, str, c93833mF, iFetchPanelInfoListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJJ(String panel, boolean z, String str, int i, int i2, boolean z2, boolean z3, IFetchPanelInfoListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LJJJJJ(panel, z, str, i, i2, z2, z3, listener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJJL(C74548TNo c74548TNo, InfoStickerEffect sticker) {
        o.LJIIIZ(sticker, "sticker");
        this.LJLIL.LJJJJJL(c74548TNo, sticker);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJJL(String p0, IFetchEffectChannelListener iFetchEffectChannelListener) {
        o.LJIIIZ(p0, "p0");
        this.LJLIL.LJJJJL(p0, iFetchEffectChannelListener);
    }

    @Override // X.InterfaceC84497XEf
    public final void LJJJJLI(String panel, boolean z, boolean z2, IFetchEffectChannelListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LJJJJLI(panel, z, z2, listener);
    }

    @Override // X.InterfaceC84498XEg
    public final void LJJJJLL(String p0, String p1, boolean z, I81 i81) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.LJLIL.LJJJJLL(p0, p1, z, i81);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final EffectManager LJLJJLL() {
        return this.LJLIL.LJLJJLL();
    }

    @Override // X.InterfaceC84497XEf
    public final void checkUpdate(String str, String str2, int i, java.util.Map map, ICheckChannelListener iCheckChannelListener) {
        this.LJLIL.checkUpdate(str, str2, i, map, iCheckChannelListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void destroy() {
        this.LJLIL.destroy();
    }

    @Override // X.InterfaceC84497XEf
    public final void fetchCategoryEffect(String panel, String str, int i, int i2, int i3, String str2, boolean z, IFetchCategoryEffectListener listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(listener, "listener");
        this.LJLIL.fetchCategoryEffect(panel, str, i, i2, i3, str2, z, listener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        this.LJLIL.fetchEffect(effect, iFetchEffectListener);
    }

    @Override // X.InterfaceC84498XEg
    public final void fetchList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.LJLIL.fetchList("editingeffect", false, iFetchEffectChannelListener);
    }

    @Override // X.InterfaceC84498XEg, X.InterfaceC84497XEf
    public final void updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        this.LJLIL.updateTag(str, str2, iUpdateTagListener);
    }

    public C84495XEd(InterfaceC84498XEg interfaceC84498XEg) {
        this.LJLILLLLZI = interfaceC84498XEg;
        this.LJLIL = interfaceC84498XEg;
    }

    @Override // X.InterfaceC84498XEg
    public final boolean LJJIJLIJ(Effect effect) {
        TENativeLibsLoader.loadLibrary();
        return this.LJLILLLLZI.LJJIJLIJ(effect);
    }

    @Override // X.InterfaceC84497XEf
    public final boolean LJJIL(Effect effect) {
        o.LJIIIZ(effect, "effect");
        TENativeLibsLoader.loadLibrary();
        return this.LJLILLLLZI.LJJIL(effect);
    }
}
