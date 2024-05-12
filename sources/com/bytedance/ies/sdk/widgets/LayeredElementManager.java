package com.bytedance.ies.sdk.widgets;

import X.AbstractC019505v;
import X.AbstractC73672Svk;
import X.C018905p;
import X.C0MB;
import X.C16880lQ;
import X.C31808Ce4;
import X.C3EO;
import X.C60903NvH;
import X.C74293TDt;
import X.C74296TDw;
import X.C76800UCe;
import X.CVQ;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.X1D;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class LayeredElementManager<T extends LayeredElementContext> implements GenericLifecycleObserver, PropertyResolver {
    public AnimationListener mAnimationListener;
    public final DataChannel mDataChannel;
    public boolean mDrawOptimization;
    public int mLayerIndex;
    public final LayeredConstraintLayout mLayeredConstraintLayout;
    public final T mLayeredElementContext;
    public final LifecycleOwner mLifecycleOwner;
    public final Ordering mOrdering = new Ordering();
    public final C0MB<GroupHolderConstraintElement> mGroupHolderConstraintElements = new C0MB<>();
    public final Map<Integer, ElementSpec> mElements = new HashMap();
    public final SparseArray<C74296TDw> mGroups = new SparseArray<>();
    public final SparseArray<List<Integer>> mGroupElements = new SparseArray<>();
    public final List<InterfaceC92693kP> mDisposables = new LinkedList();
    public final SparseArray<List<WidgetHiddenChangedSceneObserver>> mHiddenChangedObservers = new SparseArray<>();
    public final Map<WidgetHiddenChangedSceneObserver, Integer> mHiddenChangedObserverElementMap = new HashMap();
    public final Map<Integer, ChainResolver> mChainResolvers = new HashMap();
    public final Map<Integer, SpacingResolver> mSpacingResolvers = new HashMap();
    public final SparseArray<AnimationInfo> mAnimationInfoArray = new SparseArray<>();
    public final List<XmlViewHolderConstraintElement> mXmlViewHolderConstraintElements = new ArrayList();
    public final boolean isLocalTest = LayeredElementConfiguration.INSTANCE.getDebug();

    public abstract <V> AbstractC73672Svk<V> createRxObservable(Class<V> cls);

    public abstract <V> C3EO<V, V> createRxTransformer();

    public abstract T onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    private void reorder() {
        for (XmlViewHolderConstraintElement xmlViewHolderConstraintElement : this.mXmlViewHolderConstraintElements) {
            if (!(xmlViewHolderConstraintElement.getView() instanceof CVQ) && !(xmlViewHolderConstraintElement.getView() instanceof AbstractC019505v)) {
                this.mLayeredConstraintLayout.bringChildToFront(xmlViewHolderConstraintElement.getView());
            }
        }
    }

    private void resolveGuidelineIfNeeded() {
        if (LayeredElementConfiguration.INSTANCE.getGuidelineIndicatorEnabled()) {
            ArrayList arrayList = new ArrayList();
            int childCount = this.mLayeredConstraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (this.mLayeredConstraintLayout.getChildAt(i) instanceof CVQ) {
                    arrayList.add(this.mLayeredConstraintLayout.getChildAt(i));
                }
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = ((View) ListProtector.get(arrayList, i2)).getId();
            }
            C74293TDt c74293TDt = new C74293TDt(this.mLayeredConstraintLayout.getContext());
            LayeredConstraintLayout.LayoutParams layoutParams = new LayeredConstraintLayout.LayoutParams(0, 0);
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            layoutParams.setLayer(this.mLayerIndex);
            layoutParams.setOrder(this.mOrdering.requestOrder(this.mLayerIndex));
            c74293TDt.setReferencedIds(iArr);
            this.mLayeredConstraintLayout.addView(c74293TDt, layoutParams);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        for (ElementSpec elementSpec : this.mElements.values()) {
            if (!elementSpec.getSceneObservers().isEmpty()) {
                ConstraintProperty constraintPropertyById = getConstraintPropertyById(elementSpec.getId());
                for (SceneObserver sceneObserver : elementSpec.getSceneObservers()) {
                    if (constraintPropertyById != null) {
                        sceneObserver.dispose(this.mLayeredElementContext, constraintPropertyById);
                    }
                }
            }
            elementSpec.dispose();
        }
        this.mAnimationInfoArray.clear();
        for (InterfaceC92693kP interfaceC92693kP : this.mDisposables) {
            if (!interfaceC92693kP.isDisposed()) {
                interfaceC92693kP.dispose();
            }
        }
        this.mDisposables.clear();
        this.mChainResolvers.clear();
        this.mSpacingResolvers.clear();
    }

    public void finishRegistration() {
        reorder();
        resolveGuidelineIfNeeded();
        int size = this.mGroupElements.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.mGroupElements.keyAt(i);
            List<Integer> valueAt = this.mGroupElements.valueAt(i);
            int[] iArr = new int[valueAt.size()];
            for (int i2 = 0; i2 < valueAt.size(); i2++) {
                iArr[i2] = ((Integer) ListProtector.get(valueAt, i2)).intValue();
            }
            this.mGroups.get(keyAt).setReferencedIds(iArr);
        }
    }

    public T getLayeredElementContext() {
        return this.mLayeredElementContext;
    }

    public void animateHide(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.animateHide();
        } else {
            notifyHideAnimationStart(i);
            notifyHideAnimationEnd(i);
        }
    }

    public void animateShow(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.animateShow();
        } else {
            notifyShowAnimationStart(i);
            notifyShowAnimationEnd(i);
        }
    }

    public void cancelHideAnimation(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.cancelHideAnimation();
        }
    }

    public void cancelShowAnimation(int i) {
        AnimationInfo animationInfo = this.mAnimationInfoArray.get(i);
        if (animationInfo != null) {
            animationInfo.cancelShowAnimation();
        }
    }

    public boolean detachView(int i) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        if (LJ instanceof LayeredPlaceholderElement) {
            ((LayeredPlaceholderElement) LJ).onDetachView();
            return true;
        }
        return false;
    }

    public void downElement(int i) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById == null) {
            return;
        }
        constraintPropertyById.layer((constraintPropertyById.layer() - this.mLayerIndex) - 1);
        constraintPropertyById.apply();
        this.mLayeredConstraintLayout.detach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.attach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.requestLayout();
        this.mLayeredConstraintLayout.invalidate();
    }

    public ConstraintProperty getConstraintPropertyById(int i) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        if (LJ != null) {
            return LJ.getConstraintProperty();
        }
        if (!this.isLocalTest) {
            try {
                InterfaceC88472Yns<Throwable, C76800UCe> sladarReporter = LayeredElementConfiguration.INSTANCE.getSladarReporter();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("id is null");
                LIZ.append(this.mLayeredConstraintLayout.getContext().getResources().getResourceEntryName(i));
                LIZ.append(Log.getStackTraceString(new Throwable()));
                sladarReporter.invoke(new IllegalStateException(X1D.LIZIZ(LIZ)));
            } catch (Resources.NotFoundException unused) {
            }
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mGroupHolderConstraintElements.get(id) is null -- id is");
        LIZ2.append(this.mLayeredConstraintLayout.getContext().getResources().getResourceEntryName(i));
        throw new NullPointerException(X1D.LIZIZ(LIZ2));
    }

    public <E extends ElementSpec> E getElementById(int i) {
        return (E) MapCompat.getOrDefault(this.mElements, Integer.valueOf(i), null);
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public float getResolvedAlpha(int i) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        float f = LJ.getConstraintProperty().mAlpha;
        if (this.mDrawOptimization && f == 0.0f) {
            return f;
        }
        List<C74296TDw> groups = LJ.getGroups();
        if (groups != null && !groups.isEmpty()) {
            Iterator<C74296TDw> it = groups.iterator();
            while (it.hasNext()) {
                f *= it.next().getAlpha();
            }
        }
        return f;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public float getResolvedTranslationX(int i) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        List<C74296TDw> groups = LJ.getGroups();
        float f = LJ.getConstraintProperty().mTranslationX;
        if (groups != null && !groups.isEmpty()) {
            Iterator<C74296TDw> it = groups.iterator();
            while (it.hasNext()) {
                f += it.next().getTransformedTranslationX(LJ.getConstraintProperty().mView);
            }
        }
        return f;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public float getResolvedTranslationY(int i) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        List<C74296TDw> groups = LJ.getGroups();
        float f = LJ.getConstraintProperty().mTranslationY;
        if (groups != null && !groups.isEmpty()) {
            Iterator<C74296TDw> it = groups.iterator();
            while (it.hasNext()) {
                f += it.next().getTransformedTranslationY(LJ.getConstraintProperty().mView);
            }
        }
        return f;
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public int getResolvedVisibility(int i) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        int i2 = LJ.getConstraintProperty().mVisibility;
        if (this.mDrawOptimization && i2 != 0) {
            return i2;
        }
        List<C74296TDw> groups = LJ.getGroups();
        if (groups != null && !groups.isEmpty()) {
            for (C74296TDw c74296TDw : groups) {
                if (c74296TDw.getVisibility() == 8) {
                    return 8;
                }
                if (c74296TDw.getVisibility() == 4) {
                    i2 = 4;
                }
            }
        }
        return i2;
    }

    public void notifyHideAnimationEnd(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onHideAnimationEnd(i);
        }
    }

    public void notifyHideAnimationStart(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onHideAnimationStart(i);
        }
    }

    public void notifyShowAnimationEnd(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onShowAnimationEnd(i);
        }
    }

    public void notifyShowAnimationStart(int i) {
        AnimationListener animationListener = this.mAnimationListener;
        if (animationListener != null) {
            animationListener.onShowAnimationStart(i);
        }
    }

    public void registerGroup(ElementSpec elementSpec) {
        View findViewById = this.mLayeredConstraintLayout.findViewById(elementSpec.getId());
        if (findViewById != null) {
            C16880lQ.LLD(this.mLayeredConstraintLayout, findViewById);
        }
        C74296TDw c74296TDw = new C74296TDw(this.mLayeredConstraintLayout.getContext());
        c74296TDw.setId(elementSpec.getId());
        c74296TDw.setPropertyResolver(this);
        this.mLayeredConstraintLayout.addView(c74296TDw);
        this.mGroups.put(elementSpec.getId(), c74296TDw);
        LayeredElement layeredElement = new LayeredElement(c74296TDw, null);
        this.mGroupHolderConstraintElements.LJI(elementSpec.getId(), layeredElement);
        this.mElements.put(Integer.valueOf(elementSpec.getId()), elementSpec);
        Iterator<SceneObserver> it = elementSpec.getSceneObservers().iterator();
        while (it.hasNext()) {
            addSceneObserver(elementSpec.getId(), it.next());
        }
        elementSpec.attach(layeredElement.getConstraintProperty());
    }

    public void registerGroups(MultiElementSpec multiElementSpec) {
        if (multiElementSpec != null && !multiElementSpec.getElements().isEmpty()) {
            Iterator<ElementSpec> it = multiElementSpec.getElements().iterator();
            while (it.hasNext()) {
                registerGroup(it.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.bytedance.ies.sdk.widgets.LayeredElement] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.bytedance.ies.sdk.widgets.LayeredPlaceholderElement] */
    public void registerLayer(LayerSpec layerSpec) {
        LayerInfoHolderElement layerInfoHolderElement;
        LayerInfoHolderElement layerInfoHolderElement2;
        List<ElementSpec> elements = layerSpec.getElements();
        if (elements.isEmpty()) {
            return;
        }
        for (ElementSpec elementSpec : elements) {
            if (this.isLocalTest) {
                C0MB<GroupHolderConstraintElement> c0mb = this.mGroupHolderConstraintElements;
                int id = elementSpec.getId();
                if (c0mb.LJLIL) {
                    c0mb.LIZLLL();
                }
                if (C60903NvH.LIZLLL(c0mb.LJLJJI, id, c0mb.LJLILLLLZI) >= 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Duplicate element, ");
                    LIZ.append(this.mLayeredElementContext.getContext().getResources().getResourceEntryName(elementSpec.getId()));
                    LIZ.append(" already exist.");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            }
            View findViewById = this.mLayeredConstraintLayout.findViewById(elementSpec.getId());
            if (findViewById != null) {
                LayeredConstraintLayout.LayoutParams layoutParams = (LayeredConstraintLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.setLayer(this.mLayerIndex);
                layoutParams.setOrder(this.mOrdering.requestOrder(this.mLayerIndex));
                findViewById.setLayoutParams(layoutParams);
                if (findViewById instanceof C31808Ce4) {
                    layerInfoHolderElement2 = new LayeredPlaceholderElement(findViewById, this.mLayeredConstraintLayout, this, elementSpec.getConstraintWidget());
                } else {
                    layerInfoHolderElement2 = new LayeredElement(findViewById, this);
                }
                this.mXmlViewHolderConstraintElements.add(layerInfoHolderElement2);
                this.mGroupHolderConstraintElements.LJI(elementSpec.getId(), layerInfoHolderElement2);
                this.mElements.put(Integer.valueOf(elementSpec.getId()), elementSpec);
                elementSpec.attach(layerInfoHolderElement2.getConstraintProperty());
                layerInfoHolderElement = layerInfoHolderElement2;
            } else if (!this.isLocalTest) {
                LayerInfoHolderElement layerInfoHolderElement3 = new LayerInfoHolderElement(elementSpec.getId(), this.mLayeredConstraintLayout, this);
                layerInfoHolderElement3.getLayerInfo().setLayer(this.mLayerIndex);
                layerInfoHolderElement3.getLayerInfo().setOrder(this.mOrdering.requestOrder(this.mLayerIndex));
                this.mGroupHolderConstraintElements.LJI(elementSpec.getId(), layerInfoHolderElement3);
                this.mElements.put(Integer.valueOf(elementSpec.getId()), elementSpec);
                layerInfoHolderElement = layerInfoHolderElement3;
            } else {
                throw new IllegalStateException(C16880lQ.LLLZ("You mast declare id %s in xml", new Object[]{this.mLayeredConstraintLayout.getContext().getResources().getResourceEntryName(elementSpec.getId())}));
            }
            Iterator<SceneObserver> it = elementSpec.getSceneObservers().iterator();
            while (it.hasNext()) {
                addSceneObserver(elementSpec.getId(), it.next());
            }
            if (elementSpec instanceof GroupableElementSpec) {
                Iterator<Integer> it2 = ((GroupableElementSpec) elementSpec).getGroupIds().iterator();
                while (it2.hasNext()) {
                    int intValue = it2.next().intValue();
                    C74296TDw c74296TDw = this.mGroups.get(intValue);
                    if (c74296TDw != null) {
                        layerInfoHolderElement.addGroup(c74296TDw);
                    }
                    List<Integer> list = this.mGroupElements.get(intValue);
                    if (list == null) {
                        list = new ArrayList<>();
                        this.mGroupElements.put(intValue, list);
                    }
                    list.add(Integer.valueOf(elementSpec.getId()));
                }
            }
            if (elementSpec.getAnimation() != null) {
                this.mAnimationInfoArray.put(elementSpec.getId(), elementSpec.getAnimation());
            }
        }
        this.mLayerIndex++;
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    public void setDrawOptimization(boolean z) {
        this.mDrawOptimization = z;
    }

    public void upElement(int i) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById == null) {
            return;
        }
        constraintPropertyById.layer(constraintPropertyById.layer() + this.mLayerIndex + 1);
        constraintPropertyById.apply();
        this.mLayeredConstraintLayout.detach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.attach(constraintPropertyById.mView);
        this.mLayeredConstraintLayout.requestLayout();
        this.mLayeredConstraintLayout.invalidate();
    }

    private <O, V extends com.bytedance.ies.sdk.datachannel.NextLiveData<O>> void handleDataChannelSceneObserver(final int i, final DataChannelSceneObserver<O, V> dataChannelSceneObserver) {
        if (dataChannelSceneObserver.isSticky()) {
            this.mDataChannel.ov0(this.mLifecycleOwner, dataChannelSceneObserver.getType(), new InterfaceC88472Yns() { // from class: X.ULq
                @Override // X.InterfaceC88472Yns
                public final Object invoke(Object obj) {
                    C76800UCe lambda$handleDataChannelSceneObserver$0;
                    lambda$handleDataChannelSceneObserver$0 = LayeredElementManager.this.lambda$handleDataChannelSceneObserver$0(i, dataChannelSceneObserver, obj);
                    return lambda$handleDataChannelSceneObserver$0;
                }
            });
        } else {
            this.mDataChannel.lv0(this.mLifecycleOwner, dataChannelSceneObserver.getType(), new InterfaceC88472Yns() { // from class: X.ULr
                @Override // X.InterfaceC88472Yns
                public final Object invoke(Object obj) {
                    C76800UCe lambda$handleDataChannelSceneObserver$1;
                    lambda$handleDataChannelSceneObserver$1 = LayeredElementManager.this.lambda$handleDataChannelSceneObserver$1(i, dataChannelSceneObserver, obj);
                    return lambda$handleDataChannelSceneObserver$1;
                }
            });
        }
    }

    private <V> void handleRxBusSceneObserver(final int i, final RxBusSceneObserver<V> rxBusSceneObserver) {
        this.mDisposables.add(createRxObservable(rxBusSceneObserver.getType()).LJII(createRxTransformer()).LJJJJZI(new InterfaceC64592gB() { // from class: X.ULp
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                LayeredElementManager.this.lambda$handleRxBusSceneObserver$2(i, rxBusSceneObserver, obj);
            }
        }));
    }

    private void handleWidgetHiddenChangedSceneObserver(int i, WidgetHiddenChangedSceneObserver widgetHiddenChangedSceneObserver) {
        int id = widgetHiddenChangedSceneObserver.getId();
        List<WidgetHiddenChangedSceneObserver> list = this.mHiddenChangedObservers.get(id);
        if (list == null) {
            list = new LinkedList<>();
            this.mHiddenChangedObservers.put(id, list);
        }
        list.add(widgetHiddenChangedSceneObserver);
        this.mHiddenChangedObserverElementMap.put(widgetHiddenChangedSceneObserver, Integer.valueOf(i));
    }

    public void addSceneObserver(int i, SceneObserver sceneObserver) {
        if (sceneObserver instanceof DataChannelSceneObserver) {
            handleDataChannelSceneObserver(i, (DataChannelSceneObserver) sceneObserver);
        } else if (sceneObserver instanceof RxBusSceneObserver) {
            handleRxBusSceneObserver(i, (RxBusSceneObserver) sceneObserver);
        } else {
            if (!(sceneObserver instanceof WidgetHiddenChangedSceneObserver)) {
                return;
            }
            handleWidgetHiddenChangedSceneObserver(i, (WidgetHiddenChangedSceneObserver) sceneObserver);
        }
    }

    public void attachView(int i, View view) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        if (LJ instanceof LayeredPlaceholderElement) {
            ((LayeredPlaceholderElement) LJ).onAttachView(view);
        } else {
            if (!this.isLocalTest) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LayeredPlaceholderElement not found, have you registered the layer info for ");
            LIZ.append(this.mLayeredElementContext.getContext().getResources().getResourceEntryName(i));
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.PropertyResolver
    public void onHiddenChanged(int i, boolean z) {
        ChainResolver chainResolver = (ChainResolver) MapCompat.getOrDefault(this.mChainResolvers, Integer.valueOf(i), null);
        if (chainResolver != null) {
            int[] ids = chainResolver.getIds();
            ArrayList arrayList = new ArrayList();
            for (int i2 : ids) {
                ConstraintProperty constraintPropertyById = getConstraintPropertyById(i2);
                if (constraintPropertyById != null) {
                    arrayList.add(constraintPropertyById);
                }
            }
            chainResolver.resolveChain(arrayList);
        }
        SpacingResolver spacingResolver = (SpacingResolver) MapCompat.getOrDefault(this.mSpacingResolvers, Integer.valueOf(i), null);
        if (spacingResolver != null) {
            int[] ids2 = spacingResolver.getIds();
            ArrayList arrayList2 = new ArrayList();
            for (int i3 : ids2) {
                ConstraintProperty constraintPropertyById2 = getConstraintPropertyById(i3);
                if (constraintPropertyById2 != null) {
                    arrayList2.add(constraintPropertyById2);
                }
            }
            spacingResolver.resolveSpacing(arrayList2);
        }
    }

    public void onWidgetHiddenChanged(int i, boolean z) {
        List<WidgetHiddenChangedSceneObserver> list = this.mHiddenChangedObservers.get(i);
        if (list != null && !list.isEmpty()) {
            for (WidgetHiddenChangedSceneObserver widgetHiddenChangedSceneObserver : list) {
                int intValue = ((Integer) MapCompat.getOrDefault(this.mHiddenChangedObserverElementMap, widgetHiddenChangedSceneObserver, -1)).intValue();
                if (intValue != -1) {
                    widgetHiddenChangedSceneObserver.onHiddenChanged(this.mLayeredElementContext, this.mGroupHolderConstraintElements.LJ(intValue, null).getConstraintProperty(), z);
                }
            }
        }
        onHiddenChanged(i, z);
    }

    /* loaded from: classes14.dex */
    public static class MapCompat {
        public static <K, V> V getOrDefault(Map<K, V> map, K k, V v) {
            V v2 = map.get(k);
            if (v2 != null || map.containsKey(k)) {
                return v2;
            }
            return v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C76800UCe lambda$handleDataChannelSceneObserver$0(int i, DataChannelSceneObserver dataChannelSceneObserver, Object obj) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById != null) {
            dataChannelSceneObserver.onEvent(this.mLayeredElementContext, constraintPropertyById, obj);
        }
        return C76800UCe.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C76800UCe lambda$handleDataChannelSceneObserver$1(int i, DataChannelSceneObserver dataChannelSceneObserver, Object obj) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById != null) {
            dataChannelSceneObserver.onEvent(this.mLayeredElementContext, constraintPropertyById, obj);
        }
        return C76800UCe.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleRxBusSceneObserver$2(int i, RxBusSceneObserver rxBusSceneObserver, Object obj) {
        ConstraintProperty constraintPropertyById = getConstraintPropertyById(i);
        if (constraintPropertyById != null) {
            rxBusSceneObserver.onEvent(this.mLayeredElementContext, constraintPropertyById, obj);
        }
    }

    public void attachView(int i, View view, C018905p c018905p) {
        GroupHolderConstraintElement LJ = this.mGroupHolderConstraintElements.LJ(i, null);
        if (LJ instanceof LayerInfoHolderElement) {
            ((LayerInfoHolderElement) LJ).onAttachView(view, c018905p);
        }
    }

    public void registerSpacingResolver(int i, int i2, int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        SpacingResolver spacingResolver = new SpacingResolver(this.mLayeredElementContext, i, i2, iArr);
        for (int i3 : iArr) {
            this.mSpacingResolvers.put(Integer.valueOf(i3), spacingResolver);
        }
    }

    public LayeredElementManager(Context context, LifecycleOwner lifecycleOwner, LayeredConstraintLayout layeredConstraintLayout, DataChannel dataChannel) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mLayeredConstraintLayout = layeredConstraintLayout;
        this.mDataChannel = dataChannel;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.mLayeredElementContext = onCreateLayeredElementContext(context, layeredConstraintLayout, dataChannel);
    }

    public void registerHorizontalChain(int i, int i2, int i3, int i4, int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        ChainResolver chainResolver = new ChainResolver(i, i2, i3, i4, iArr);
        for (int i5 : iArr) {
            this.mChainResolvers.put(Integer.valueOf(i5), chainResolver);
        }
    }
}
