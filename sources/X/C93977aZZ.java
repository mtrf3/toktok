package X;

import com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl;
import com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor;
import com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider;
import com.bytedance.news.common.service.manager.IService;

/* renamed from: X.aZZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93977aZZ {
    public static final IEffectDataResProvider LIZ() {
        IService iService;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(IEffectDataResProvider.class);
        } else {
            iService = null;
        }
        return (IEffectDataResProvider) iService;
    }

    public static final AssetEditorImpl LIZIZ() {
        IAssetEditor LIZ = C93979aZb.LIZ();
        if (LIZ != null) {
            return (AssetEditorImpl) LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl");
    }
}
