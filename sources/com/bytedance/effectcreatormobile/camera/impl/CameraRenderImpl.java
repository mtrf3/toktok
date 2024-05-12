package com.bytedance.effectcreatormobile.camera.impl;

import X.AbstractC93937aYv;
import X.C1B3;
import X.C36636EZk;
import X.C3BJ;
import X.C48841JEv;
import X.C76732zl;
import X.C76800UCe;
import X.C78555UsJ;
import X.C79853Bl;
import X.C93466aRK;
import X.C93468aRM;
import X.C93723aVT;
import X.C93744aVo;
import X.C93940aYy;
import X.C94078abC;
import X.C94079abD;
import X.C94080abE;
import X.C94342afS;
import X.C94755am7;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.InterfaceC70352pT;
import X.InterfaceC70422pa;
import X.InterfaceC93942aZ0;
import X.T2R;
import X.XKS;
import X.XKX;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.camera.CameraPreview;
import com.bytedance.effectcreatormobile.camera.CameraRenderLiveData;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class CameraRenderImpl implements ICameraRender {
    public static final C93466aRK Companion = new C93466aRK();
    public final CameraRenderLiveData<C94342afS> modelChangeData = new CameraRenderLiveData<>();
    public final CameraRenderLiveData<AbstractC93937aYv> renderModeData = new CameraRenderLiveData<>();
    public final CopyOnWriteArrayList<InterfaceC93942aZ0> frameCallBacks = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<InterfaceC93942aZ0, InterfaceC93942aZ0> assistCallbackMap = new ConcurrentHashMap<>();
    public final C3BJ<C76800UCe> saveFaceFeatureEvent = C79853Bl.LIZ(0, 0, null, 7);
    public final C3BJ<C76800UCe> frameRefreshEvent = C79853Bl.LIZ(0, 0, null, 7);
    public boolean cameraFront = true;
    public final InterfaceC70422pa scope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));
    public final C3BJ<C76800UCe> bindTextureNotifier = C79853Bl.LIZ(0, 0, null, 7);

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public Object awaitAlgorithm(boolean z, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return awaitAlgorithm$suspendImpl(this, z, interfaceC67352kd);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public String getTag() {
        return "camera_preview";
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void init() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void onRecycle() {
    }

    public Fragment getFragment() {
        return new CameraPreview();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void manualBindTexture() {
        XKX.LIZLLL(this.scope, null, null, new C94755am7(this, null), 3);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void notifyAlgorithmFrame() {
        Iterator<InterfaceC93942aZ0> it = this.frameCallBacks.iterator();
        while (it.hasNext()) {
            C93744aVo.LIZIZ(new IDqS423S0100000_42(it.next(), 29), 0L);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public InterfaceC65462ha<C76800UCe> faceSavedEvent() {
        return this.saveFaceFeatureEvent;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public InterfaceC70352pT<C76800UCe> frameRefreshEvent() {
        return this.frameRefreshEvent;
    }

    public final ConcurrentHashMap<InterfaceC93942aZ0, InterfaceC93942aZ0> getAssistCallbackMap() {
        return this.assistCallbackMap;
    }

    public final C3BJ<C76800UCe> getBindTextureNotifier() {
        return this.bindTextureNotifier;
    }

    public final boolean getCameraFront() {
        return this.cameraFront;
    }

    public final CopyOnWriteArrayList<InterfaceC93942aZ0> getFrameCallBacks() {
        return this.frameCallBacks;
    }

    public final C3BJ<C76800UCe> getFrameRefreshEvent() {
        return this.frameRefreshEvent;
    }

    public final CameraRenderLiveData<C94342afS> getModelChangeData() {
        return this.modelChangeData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public LiveData<C94342afS> getModelPathChangeData() {
        return this.modelChangeData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public LiveData<AbstractC93937aYv> getRenderModeData() {
        return this.renderModeData;
    }

    public final C3BJ<C76800UCe> getSaveFaceFeatureEvent() {
        return this.saveFaceFeatureEvent;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public boolean isCameraFront() {
        return this.cameraFront;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public final CameraRenderLiveData<AbstractC93937aYv> getRenderModeData() {
        return this.renderModeData;
    }

    private final void addAlgorithmFrameCallBack(InterfaceC93942aZ0 interfaceC93942aZ0) {
        if (interfaceC93942aZ0 != null) {
            this.frameCallBacks.add(interfaceC93942aZ0);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void changeRenderMode(AbstractC93937aYv mode) {
        o.LJIIIZ(mode, "mode");
        this.renderModeData.setValue(mode);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void removeAlgorithmCallback(InterfaceC93942aZ0 callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.frameCallBacks.remove(callBack);
        InterfaceC93942aZ0 interfaceC93942aZ0 = this.assistCallbackMap.get(callBack);
        if (interfaceC93942aZ0 != null) {
            this.frameCallBacks.remove(interfaceC93942aZ0);
            this.assistCallbackMap.remove(callBack);
        }
    }

    public final void setCameraFront(boolean z) {
        this.cameraFront = z;
    }

    public final void unregAlgorithmFrameCallBack(InterfaceC93942aZ0 interfaceC93942aZ0) {
        if (interfaceC93942aZ0 != null) {
            this.frameCallBacks.remove(interfaceC93942aZ0);
        }
    }

    public final void updateRenderMode(AbstractC93937aYv mode) {
        o.LJIIIZ(mode, "mode");
        this.renderModeData.setValue(mode);
    }

    private final void gotoFaceDistortion(FragmentManager fragmentManager, FaceDistortionFragment faceDistortionFragment) {
        Integer containerViewId;
        IEditorContext LIZ = C93940aYy.LIZ();
        if (LIZ != null && (containerViewId = LIZ.getContainerViewId()) != null) {
            int intValue = containerViewId.intValue();
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIJ(faceDistortionFragment, null, intValue);
            c1b3.LJ(null);
            c1b3.LJI();
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void addAlgorithmCallback(int i, InterfaceC93942aZ0 callBack) {
        o.LJIIIZ(callBack, "callBack");
        C76732zl c76732zl = new C76732zl();
        if (i < 1) {
            i = 10;
        }
        c76732zl.element = i;
        this.frameCallBacks.add(callBack);
        C94078abC c94078abC = new C94078abC(this, c76732zl, callBack);
        this.assistCallbackMap.put(callBack, c94078abC);
        this.frameCallBacks.add(c94078abC);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void editFaceDistortion(FragmentManager fragmentManager, long j) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        Bundle bundle = new Bundle();
        bundle.putLong("key_feature_id", j);
        FaceDistortionFragment faceDistortionFragment = new FaceDistortionFragment();
        faceDistortionFragment.setArguments(bundle);
        gotoFaceDistortion(fragmentManager, faceDistortionFragment);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void open(FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIIIZZ(i, 1, getFragment(), getTag());
        c1b3.LJI();
    }

    public static Object awaitAlgorithm$suspendImpl(CameraRenderImpl cameraRenderImpl, boolean z, InterfaceC67352kd interfaceC67352kd) {
        IMain LIZ;
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        if (z && (LIZ = C93723aVT.LIZ()) != null) {
            LIZ.mainLoading(true);
        }
        C93468aRM.LIZ(cameraRenderImpl, new C94079abD(xks, z), 10, 4);
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void onAlgorithmReady(InterfaceC93942aZ0 interfaceC93942aZ0, int i, Lifecycle lifecycle) {
        if (i <= 1) {
            i = 10;
        }
        final C94080abE c94080abE = new C94080abE(this, i, new AtomicInteger(0), interfaceC93942aZ0);
        addAlgorithmFrameCallBack(c94080abE);
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl$onAlgorithmReady$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        CameraRenderImpl.this.unregAlgorithmFrameCallBack(c94080abE);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender
    public void createFaceDistortion(FragmentManager fragmentManager, String effectPath, String effectId, String displayName, String resourceName, String capabilities) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(effectPath, "effectPath");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(displayName, "displayName");
        o.LJIIIZ(resourceName, "resourceName");
        o.LJIIIZ(capabilities, "capabilities");
        Bundle bundle = new Bundle();
        bundle.putString("key_effect_path", effectPath);
        bundle.putString("key_effect_id", effectId);
        bundle.putString("key_effect_name", displayName);
        bundle.putString("key_resource_name", resourceName);
        bundle.putString("key_capabilities", capabilities);
        FaceDistortionFragment faceDistortionFragment = new FaceDistortionFragment();
        faceDistortionFragment.setArguments(bundle);
        gotoFaceDistortion(fragmentManager, faceDistortionFragment);
    }
}
