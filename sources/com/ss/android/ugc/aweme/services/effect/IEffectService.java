package com.ss.android.ugc.aweme.services.effect;

import X.InterfaceC84498XEg;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public interface IEffectService {

    /* loaded from: classes8.dex */
    public interface OnVideoCoverCallback {
        void onGetVideoCoverFailed(int i);

        void onGetVideoCoverSuccess(Bitmap bitmap);
    }

    InterfaceC84498XEg createEffectPlatform(Context context, String str);

    InterfaceC84498XEg createFontEffectPlatform(Context context);

    InterfaceC84498XEg createMvEffectPlatform(Context context);

    InterfaceC84498XEg createMvEffectPlatform(Context context, String str);

    void fetchEffectWithMusicBind(InterfaceC84498XEg interfaceC84498XEg, String str, String str2, IFetchEffectListener iFetchEffectListener);

    void fetchEffectWithMusicBind(InterfaceC84498XEg interfaceC84498XEg, String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    String getCacheDir();

    ArrayList<String> getDraftEffectList();

    String getLiveStickerPannel();

    String getModelCacheDir();

    void getVideoCoverByCallback(List<? extends EffectPointModel> list, FilterBean filterBean, float f, int i, boolean z, AwemeDraft awemeDraft, OnVideoCoverCallback onVideoCoverCallback);

    void getVideoCoverByCallback(List<? extends EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback);
}
