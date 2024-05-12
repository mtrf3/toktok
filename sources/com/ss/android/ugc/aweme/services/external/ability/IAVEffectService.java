package com.ss.android.ugc.aweme.services.external.ability;

import X.C10I;
import X.C76800UCe;
import X.InterfaceC42533Gmf;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public interface IAVEffectService {

    /* loaded from: classes8.dex */
    public interface EffectPlatformLoader {
        void load(C10I<InterfaceC84498XEg, Void> c10i);
    }

    /* loaded from: classes8.dex */
    public interface IAVEffectReadyCallback<T> {
        void finish(T t);
    }

    /* loaded from: classes8.dex */
    public interface OnFetchResult {
        void onResult(String str);
    }

    /* loaded from: classes8.dex */
    public interface ResourceFinder {
        long createNativeResourceFinder(long j);

        void release(long j);
    }

    void buildEffectPlatform(Context context, IAVEffectReadyCallback<InterfaceC84498XEg> iAVEffectReadyCallback, InterfaceC88472Yns<? super EffectPlatformBuilder, C76800UCe> interfaceC88472Yns);

    void buildEffectPlatform(Context context, boolean z, IAVEffectReadyCallback<InterfaceC84498XEg> iAVEffectReadyCallback, InterfaceC88472Yns<? super EffectPlatformBuilder, C76800UCe> interfaceC88472Yns);

    int checkUrlValid(String str);

    void clearCacheInFTC();

    void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, InterfaceC84498XEg interfaceC84498XEg, IFetchEffectListListener iFetchEffectListListener);

    void fetchEffectModel(String[] strArr, IAVEffectReadyCallback<String[]> iAVEffectReadyCallback);

    void fetchEffectResource(String str, boolean z, Map<String, String> map, InterfaceC84498XEg interfaceC84498XEg, IFetchEffectListener iFetchEffectListener);

    void fetchEffectResourcePathById(String str, OnFetchResult onFetchResult);

    InterfaceC88472Yns<EffectPlatformBuilder, C76800UCe> getEffectPlatformDefaultRegionCallback();

    String getEffectSDKVersion();

    InterfaceC42533Gmf getVideoCoverBitmapCache(LifecycleOwner lifecycleOwner, String str, int i, int i2, int i3, float f);

    boolean isEffectControlGame(Effect effect);

    void provideResourceFinder(IAVEffectReadyCallback<ResourceFinder> iAVEffectReadyCallback);
}
