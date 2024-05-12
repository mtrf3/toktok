package com.bytedance.effectcreatormobile.modelselect.impl;

import X.C1B3;
import X.C68322mC;
import X.C76800UCe;
import X.C93497aRp;
import X.C93745aVp;
import X.C93950aZ8;
import X.C94087abL;
import X.C94088abM;
import X.C94089abN;
import X.C94255ae3;
import X.C94256ae4;
import X.C94355aff;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC93796aWe;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect;
import com.bytedance.effectcreatormobile.modelselect.ModelSelectFragment;
import com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider;
import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS31S0300000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class ModelSelectImpl implements IModelSelect, InterfaceC93796aWe {
    public static final C93497aRp Companion = new C93497aRp();
    public final LiveData<C94256ae4> modelPath = new MutableLiveData();
    public CopyOnWriteArrayList<InterfaceC88472Yns<Bitmap, C76800UCe>> selectBitmapCallbacks = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<InterfaceC88472Yns<C94256ae4, C76800UCe>> selectPicPathCallbacks = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<InterfaceC88472Yns<Boolean, C76800UCe>> autoChangeModelCallbacks = new CopyOnWriteArrayList<>();

    /* loaded from: classes34.dex */
    public final class AutoSwitchModelCallbackCleaner implements GenericLifecycleObserver {
        public final InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;
        public final /* synthetic */ ModelSelectImpl LJLILLLLZI;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                destroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        private final void destroy() {
            this.LJLILLLLZI.unregisterAutoSwitchModelCallback(this.LJLIL);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoSwitchModelCallbackCleaner(ModelSelectImpl modelSelectImpl, InterfaceC88472Yns<? super Boolean, C76800UCe> callback) {
            o.LJIIIZ(callback, "callback");
            this.LJLILLLLZI = modelSelectImpl;
            this.LJLIL = callback;
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public Object fetchFaceModel(InterfaceC67352kd<? super C94255ae3> interfaceC67352kd) {
        return fetchFaceModel$suspendImpl(this, interfaceC67352kd);
    }

    public final InterfaceC93796aWe getModelResultManager() {
        return this;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void init() {
    }

    @Override // X.InterfaceC93796aWe
    public boolean needBitmap() {
        return false;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void onRecycle() {
    }

    public Fragment getFragment() {
        return new ModelSelectFragment();
    }

    public ModelSelectImpl() {
        this.selectPicPathCallbacks.add(new IDqS419S0100000_42(this, 8));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public String getSelectedModel() {
        return C93950aZ8.LIZ();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public String getTag() {
        return getClass().getName();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public LiveData<C94256ae4> getModelPathLiveData() {
        return this.modelPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.jvm.internal.IDqS31S0300000_42, java.lang.Object] */
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void fetchDefaultModel(InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        ?? iDqS31S0300000_42 = new IDqS31S0300000_42(this, interfaceC88471Ynr, c68322mC, 0);
        c68322mC.element = iDqS31S0300000_42;
        this.selectPicPathCallbacks.add(iDqS31S0300000_42);
        ((IModelResProvider) C93745aVp.LIZ(IModelResProvider.class)).getResourceList(new C94087abL(this, c68322mC));
    }

    @Override // X.InterfaceC93796aWe
    public void onAutoChange(boolean z) {
        Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = this.autoChangeModelCallbacks.iterator();
        while (it.hasNext()) {
            it.next().invoke(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC93796aWe
    public void onBitmapResult(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        Iterator<InterfaceC88472Yns<Bitmap, C76800UCe>> it = this.selectBitmapCallbacks.iterator();
        while (it.hasNext()) {
            it.next().invoke(bitmap);
        }
    }

    @Override // X.InterfaceC93796aWe
    public void onPathResult(C94256ae4 modelPicture) {
        o.LJIIIZ(modelPicture, "modelPicture");
        Iterator<InterfaceC88472Yns<C94256ae4, C76800UCe>> it = this.selectPicPathCallbacks.iterator();
        while (it.hasNext()) {
            it.next().invoke(modelPicture);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void setSelectedModel(String resId) {
        o.LJIIIZ(resId, "resId");
        Keva.getRepo("ck_model_select_repo").storeString("ck_model_select_id", resId);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void unregisterAutoSwitchModelCallback(InterfaceC88472Yns<? super Boolean, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.autoChangeModelCallbacks.remove(callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r8
      0x0023: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0072, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object fetchFaceModel$suspendImpl(com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.C94540aie
            if (r0 == 0) goto L75
            r3 = r8
            X.aie r3 = (X.C94540aie) r3
            int r2 = r3.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r3.LJLILLLLZI = r2
        L12:
            java.lang.Object r8 = r3.LJLIL
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLILLLLZI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L38
            if (r0 != r2) goto L7b
            X.C141335gf.LIZJ(r8)
        L23:
            return r8
        L24:
            X.C141335gf.LIZJ(r8)
            java.lang.Class<com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider> r0 = com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider.class
            com.bytedance.news.common.service.manager.IService r0 = X.C93745aVp.LIZ(r0)
            com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider r0 = (com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider) r0
            r3.LJLILLLLZI = r1
            java.lang.Object r8 = r0.getFaceModel(r3)
            if (r8 != r7) goto L3b
            return r7
        L38:
            X.C141335gf.LIZJ(r8)
        L3b:
            X.ae3 r8 = (X.C94255ae3) r8
            r3.LJLJJI = r8
            r3.LJLILLLLZI = r2
            X.XKS r6 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r3)
            r6.<init>(r1, r0)
            r6.LJIIL()
            com.ugc.effectcreator.foundation.image.ImageLoaderService r5 = com.ugc.effectcreator.foundation.image.ImageLoaderService.INSTANCE
            java.lang.String r4 = r8.LJLILLLLZI
            X.aaF r3 = new X.aaF
            r3.<init>()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444
            java.lang.String r0 = "format"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r3.LIZJ = r1
            X.aaG r2 = new X.aaG
            r2.<init>(r3)
            kotlin.jvm.internal.IDqS175S0200000_42 r1 = new kotlin.jvm.internal.IDqS175S0200000_42
            r0 = 2
            r1.<init>(r6, r8, r0)
            r0 = 0
            r5.downloadImageFile(r0, r4, r2, r1)
            java.lang.Object r8 = r6.LJIIJJI()
            if (r8 != r7) goto L23
            return r7
        L75:
            X.aie r3 = new X.aie
            r3.<init>(r7, r8)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl.fetchFaceModel$suspendImpl(com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void fetchModelByCategoryKey(String key, InterfaceC88472Yns<? super Boolean, C76800UCe> callBack) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(callBack, "callBack");
        ((IModelResProvider) C93745aVp.LIZ(IModelResProvider.class)).getResourceList(new C94088abM(this, callBack, key));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void fetchModelByResourceId(String resId, InterfaceC88472Yns<? super Boolean, C76800UCe> callBack) {
        o.LJIIIZ(resId, "resId");
        o.LJIIIZ(callBack, "callBack");
        ((IModelResProvider) C93745aVp.LIZ(IModelResProvider.class)).getResourceList(new C94089abN(this, callBack, resId));
    }

    public final C94256ae4 findCachedModel(String str, C94355aff c94355aff) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Iterator<Map.Entry<String, List<C94256ae4>>> it = c94355aff.LJLIL.entrySet().iterator();
        while (it.hasNext()) {
            for (C94256ae4 c94256ae4 : it.next().getValue()) {
                if (o.LJ(c94256ae4.LJLJJLL, str)) {
                    return c94256ae4;
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void open(FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIIIZZ(i, 1, getFragment(), getTag());
        c1b3.LJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect
    public void registerAutoSwitchModelCallback(Lifecycle lifecycle, InterfaceC88472Yns<? super Boolean, C76800UCe> callback) {
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(callback, "callback");
        this.autoChangeModelCallbacks.add(callback);
        lifecycle.addObserver(new AutoSwitchModelCallbackCleaner(this, callback));
    }
}
