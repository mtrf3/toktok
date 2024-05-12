package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W2l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81643W2l implements IFetchEffectListByIdsListener {
    public final /* synthetic */ OptionSceneViewModel LIZ;
    public final /* synthetic */ InterfaceC84498XEg LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        List<Effect> data;
        UrlModel trans_file_url;
        List<String> url_list;
        List<String> url_prefix;
        UrlModel trans_file_url2;
        UrlModel trans_file_url3;
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
            String str = null;
            if (!data.isEmpty()) {
                OptionSceneViewModel optionSceneViewModel = this.LIZ;
                InterfaceC84498XEg interfaceC84498XEg = this.LIZIZ;
                Effect effect = (Effect) ListProtector.get(data, 0);
                optionSceneViewModel.LJLJLLL = effect;
                if (effect != null && (trans_file_url = effect.getTrans_file_url()) != null && (url_list = trans_file_url.getUrl_list()) != null && url_list.isEmpty() && (url_prefix = effectListResponse2.getUrl_prefix()) != null && !url_prefix.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Effect effect2 = optionSceneViewModel.LJLJLLL;
                    if (effect2 != null && (trans_file_url3 = effect2.getTrans_file_url()) != null) {
                        str = trans_file_url3.getUri();
                    }
                    List<String> url_prefix2 = effectListResponse2.getUrl_prefix();
                    if (url_prefix2 != null) {
                        for (String str2 : url_prefix2) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(str2);
                            LIZ.append(str);
                            arrayList.add(X1D.LIZIZ(LIZ));
                        }
                    }
                    Effect effect3 = optionSceneViewModel.LJLJLLL;
                    if (effect3 != null && (trans_file_url2 = effect3.getTrans_file_url()) != null) {
                        trans_file_url2.setUrl_list(arrayList);
                    }
                }
                optionSceneViewModel.Kv0(interfaceC84498XEg);
            }
        }
    }

    public C81643W2l(OptionSceneViewModel optionSceneViewModel, InterfaceC84498XEg interfaceC84498XEg) {
        this.LIZ = optionSceneViewModel;
        this.LIZIZ = interfaceC84498XEg;
    }
}
