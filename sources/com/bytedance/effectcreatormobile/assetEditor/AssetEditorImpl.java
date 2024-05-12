package com.bytedance.effectcreatormobile.assetEditor;

import X.AbstractC94369aft;
import X.C33R;
import X.C3BJ;
import X.C76800UCe;
import X.C79853Bl;
import X.C79883Bo;
import X.C93431aQl;
import X.C93709aVF;
import X.C93825aX7;
import X.C93829aXB;
import X.C93940aYy;
import X.C93976aZY;
import X.C93992aZo;
import X.C94412aga;
import X.C94515aiF;
import X.C94518aiI;
import X.EnumC58928NAu;
import X.EnumC93712aVI;
import X.EnumC93978aZa;
import X.EnumC93993aZp;
import X.InterfaceC67352kd;
import X.InterfaceC70352pT;
import X.InterfaceC71762rk;
import X.InterfaceC93980aZc;
import X.V1M;
import X.V8H;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class AssetEditorImpl implements IAssetEditor {
    public static final C93431aQl Companion = new C93431aQl();
    public final List<InterfaceC93980aZc> handlerCache = new ArrayList();
    public final C3BJ<EnumC93978aZa> _editorEvent = C79853Bl.LIZ(0, 0, null, 7);
    public final C33R<Boolean> _focusState = V8H.LIZ(Boolean.FALSE);

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor
    public InterfaceC70352pT<EnumC93978aZa> getEditorEvent() {
        return new C79883Bo(this._editorEvent);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor
    public InterfaceC71762rk<Boolean> getFocusState() {
        return V1M.LIZLLL(this._focusState);
    }

    public final void hideAllPanel() {
        EnumC93712aVI enumC93712aVI;
        IBehaviour LIZ;
        LiveData<EnumC93993aZp> panelStateLiveData;
        IEditorContext LIZ2;
        FragmentManager fragmentManager;
        ILayer LIZ3;
        LiveData<EnumC93712aVI> layerPageStatus;
        ILayer LIZ4 = C93709aVF.LIZ();
        EnumC93993aZp enumC93993aZp = null;
        if (LIZ4 != null && (layerPageStatus = LIZ4.getLayerPageStatus()) != null) {
            enumC93712aVI = layerPageStatus.getValue();
        } else {
            enumC93712aVI = null;
        }
        if (enumC93712aVI == EnumC93712aVI.SHOW && (LIZ2 = C93940aYy.LIZ()) != null && (fragmentManager = LIZ2.getFragmentManager()) != null && (LIZ3 = C93709aVF.LIZ()) != null) {
            LIZ3.hideLayerPage(fragmentManager);
        }
        IBehaviour LIZ5 = C93992aZo.LIZ();
        if (LIZ5 != null && (panelStateLiveData = LIZ5.getPanelStateLiveData()) != null) {
            enumC93993aZp = panelStateLiveData.getValue();
        }
        if (enumC93993aZp == EnumC93993aZp.Show && (LIZ = C93992aZo.LIZ()) != null) {
            LIZ.hidePanel();
        }
    }

    private final C94515aiF getFaceMeshHandler(Feature feature) {
        AbstractC94369aft abstractC94369aft = null;
        AbstractC94369aft abstractC94369aft2 = null;
        for (InterfaceC93980aZc interfaceC93980aZc : this.handlerCache) {
            if (interfaceC93980aZc instanceof C94515aiF) {
                AbstractC94369aft abstractC94369aft3 = (AbstractC94369aft) interfaceC93980aZc;
                if (C93825aX7.LIZ(abstractC94369aft3.LIZJ) == C93825aX7.LIZ(feature)) {
                    abstractC94369aft2 = abstractC94369aft3;
                } else {
                    abstractC94369aft = abstractC94369aft3;
                }
            }
        }
        if (abstractC94369aft != null) {
            this.handlerCache.remove(abstractC94369aft);
        }
        C94515aiF c94515aiF = (C94515aiF) abstractC94369aft2;
        if (c94515aiF != null) {
            return c94515aiF;
        }
        C94515aiF c94515aiF2 = new C94515aiF(feature);
        this.handlerCache.add(c94515aiF2);
        return c94515aiF2;
    }

    private final <T extends AbstractC94369aft> T getHandlerImpl(Feature feature) {
        Iterator<InterfaceC93980aZc> it = this.handlerCache.iterator();
        if (!it.hasNext()) {
            return null;
        }
        it.next();
        o.LJIJ();
        throw null;
    }

    private final C94518aiI getLiquefyHandler(Feature feature) {
        AbstractC94369aft abstractC94369aft = null;
        AbstractC94369aft abstractC94369aft2 = null;
        for (InterfaceC93980aZc interfaceC93980aZc : this.handlerCache) {
            if (interfaceC93980aZc instanceof C94518aiI) {
                AbstractC94369aft abstractC94369aft3 = (AbstractC94369aft) interfaceC93980aZc;
                if (C93825aX7.LIZ(abstractC94369aft3.LIZJ) == C93825aX7.LIZ(feature)) {
                    abstractC94369aft2 = abstractC94369aft3;
                } else {
                    abstractC94369aft = abstractC94369aft3;
                }
            }
        }
        if (abstractC94369aft != null) {
            this.handlerCache.remove(abstractC94369aft);
        }
        C94518aiI c94518aiI = (C94518aiI) abstractC94369aft2;
        if (c94518aiI != null) {
            return c94518aiI;
        }
        C94518aiI c94518aiI2 = new C94518aiI(feature);
        this.handlerCache.add(c94518aiI2);
        return c94518aiI2;
    }

    private final C94412aga getNormalHandler(Feature feature) {
        AbstractC94369aft abstractC94369aft = null;
        AbstractC94369aft abstractC94369aft2 = null;
        for (InterfaceC93980aZc interfaceC93980aZc : this.handlerCache) {
            if (interfaceC93980aZc instanceof C94412aga) {
                AbstractC94369aft abstractC94369aft3 = (AbstractC94369aft) interfaceC93980aZc;
                if (C93825aX7.LIZ(abstractC94369aft3.LIZJ) == C93825aX7.LIZ(feature)) {
                    abstractC94369aft2 = abstractC94369aft3;
                } else {
                    abstractC94369aft = abstractC94369aft3;
                }
            }
        }
        if (abstractC94369aft != null) {
            this.handlerCache.remove(abstractC94369aft);
        }
        C94412aga c94412aga = (C94412aga) abstractC94369aft2;
        if (c94412aga != null) {
            return c94412aga;
        }
        C94412aga c94412aga2 = new C94412aga(feature);
        this.handlerCache.add(c94412aga2);
        return c94412aga2;
    }

    public final <T> T getTypedHandler(Class<T> clazz) {
        o.LJIIIZ(clazz, "clazz");
        Iterator<InterfaceC93980aZc> it = this.handlerCache.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (o.LJ(t.getClass(), clazz)) {
                return t;
            }
        }
        return null;
    }

    public final void recordMainPageState(Bundle bundle) {
        boolean z;
        o.LJIIIZ(bundle, "bundle");
        ILayer LIZ = C93709aVF.LIZ();
        boolean z2 = true;
        boolean z3 = false;
        if (LIZ != null && LIZ.getLayerPageStatus().getValue() == EnumC93712aVI.SHOW) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("cke_layer_panel_status", z);
        IBehaviour LIZ2 = C93992aZo.LIZ();
        if (LIZ2 != null) {
            if (LIZ2.getPanelStateLiveData().getValue() != EnumC93993aZp.Show) {
                z2 = false;
            }
            z3 = z2;
        }
        bundle.putBoolean("cke_behaviour_panel_status", z3);
    }

    public final void restoreMainPageState(Bundle bundle) {
        FragmentManager fragmentManager;
        IEditorContext LIZ;
        Integer behaviourContainerViewId;
        IEditorContext LIZ2;
        Integer layerContainerViewId;
        o.LJIIIZ(bundle, "bundle");
        IEditorContext LIZ3 = C93940aYy.LIZ();
        if (LIZ3 != null && (fragmentManager = LIZ3.getFragmentManager()) != null) {
            if (bundle.getBoolean("cke_layer_panel_status") && (LIZ2 = C93940aYy.LIZ()) != null && (layerContainerViewId = LIZ2.getLayerContainerViewId()) != null) {
                int intValue = layerContainerViewId.intValue();
                ILayer LIZ4 = C93709aVF.LIZ();
                if (LIZ4 != null) {
                    LIZ4.open(fragmentManager, intValue);
                }
            }
            if (bundle.getBoolean("cke_behaviour_panel_status") && (LIZ = C93940aYy.LIZ()) != null && (behaviourContainerViewId = LIZ.getBehaviourContainerViewId()) != null) {
                int intValue2 = behaviourContainerViewId.intValue();
                IBehaviour LIZ5 = C93992aZo.LIZ();
                if (LIZ5 != null) {
                    LIZ5.open(fragmentManager, intValue2);
                }
            }
        }
    }

    public final Object emitEditEvent(EnumC93978aZa enumC93978aZa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object emit = this._editorEvent.emit(enumC93978aZa, interfaceC67352kd);
        if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return emit;
        }
        return C76800UCe.LIZ;
    }

    public final Object emitFocusState(boolean z, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object emit = this._focusState.emit(Boolean.valueOf(z), interfaceC67352kd);
        if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return emit;
        }
        return C76800UCe.LIZ;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor
    public InterfaceC93980aZc queryHandler(long j, String str) {
        Feature LJFF;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJFF = LJI.LJFF(j)) != null) {
            FeatureType featureType = LJFF.getFeatureType();
            if (featureType != null) {
                int i = C93976aZY.LIZ[featureType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return getFaceMeshHandler(LJFF);
                    }
                } else {
                    C94518aiI liquefyHandler = getLiquefyHandler(LJFF);
                    liquefyHandler.LJIIJ(str);
                    return liquefyHandler;
                }
            }
            return getNormalHandler(LJFF);
        }
        return null;
    }
}
