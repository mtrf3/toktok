package com.ugc.effectcreator.effectcore.sdk;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C68322mC;
import X.C76800UCe;
import X.C93733aVd;
import X.C93744aVo;
import X.C93825aX7;
import X.C93829aXB;
import X.C93844aXQ;
import X.C93845aXR;
import X.C93890aYA;
import X.C93965aZN;
import X.C93970aZS;
import X.C93971aZT;
import X.C94027aaN;
import X.C94034aaU;
import X.C94146acI;
import X.C94147acJ;
import X.C94276aeO;
import X.C94277aeP;
import X.C94279aeR;
import X.C94607ajj;
import X.EnumC93799aWh;
import X.EnumC93823aX5;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC93604aTY;
import X.InterfaceC93605aTZ;
import X.InterfaceC93801aWj;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.ies.effectcreator.swig.EEEffectHandle;
import com.bytedance.ies.effectcreator.swig.EEStdElementSet;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.EffectCreatorJniJNI;
import com.bytedance.ies.effectcreator.swig.EffectType;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.ElementId;
import com.bytedance.ies.effectcreator.swig.Error;
import com.bytedance.ies.effectcreator.swig.ErrorType;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.ies.effectcreator.swig.Project;
import com.bytedance.ies.effectcreator.swig.ProjectCreateFrom;
import com.bytedance.news.common.service.manager.IService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class CKEffectEditorContext {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static Project LIZIZ;
    public static C94279aeR LIZJ;
    public static ProjectCreateFrom LIZLLL;
    public static EffectType LJ;
    public static C93890aYA LJFF;
    public static final MutableLiveData<Long> LJI;
    public static final MutableLiveData<Boolean> LJII;
    public static final MutableLiveData LJIIIIZZ;
    public static final MutableLiveData LJIIIZ;
    public static final C93844aXQ LJIIJ;
    public static final ArrayList<InterfaceC93801aWj> LJIIJJI;
    public static final C94146acI LJIIL;
    public static final CopyOnWriteArrayList<InterfaceC93604aTY> LJIILIIL;
    public static final IStore LJIILJJIL;
    public static C93829aXB LJIILL;
    public static final C62822Ol8 LJIILLIIL;
    public static final MessageCenter.Listener LJIIZILJ;

    public static ICKDraftManager LJ() {
        return (ICKDraftManager) LJIILLIIL.getValue();
    }

    static {
        IService iService;
        LJIIIIZZ(false);
        LIZLLL = ProjectCreateFrom.ProjectCreateFrom_EmptyDraft;
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        LJI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        LJII = mutableLiveData2;
        LJIIIIZZ = mutableLiveData;
        LJIIIZ = mutableLiveData2;
        LJIIJ = new C93844aXQ();
        LJIIJJI = new ArrayList<>();
        LJIIL = new C94146acI();
        LJIILIIL = new CopyOnWriteArrayList<>();
        C93970aZS LIZ2 = C93971aZT.LIZ();
        if (LIZ2 != null) {
            iService = (IService) LIZ2.LIZ(IStore.class);
        } else {
            iService = null;
        }
        LJIILJJIL = (IStore) iService;
        LJIILLIIL = C221108m2.LIZIZ(C94607ajj.LJLIL);
        LJIIZILJ = C94147acJ.LJLIL;
    }

    public static C93829aXB LJI() {
        C93829aXB c93829aXB = LJIILL;
        if (c93829aXB != null) {
            return c93829aXB;
        }
        Project project = LIZIZ;
        if (project != null) {
            LJIILL = new C93829aXB(project);
        }
        return LJIILL;
    }

    public static void LJIIJJI() {
        C94034aaU.LIZ("CKEffectEditorContext", "project release");
        Project project = LIZIZ;
        if (project != null) {
            project.removeDataChangeObserver(LJIIL);
        }
        MessageCenter.removeListener(LJIIZILJ);
        Project project2 = LIZIZ;
        if (project2 != null) {
            project2.unload();
        }
        LIZIZ = null;
        EEEffectHandle.Instance().setAMEEffectHandleGetterPtr(null);
        LIZJ = null;
        LJII.postValue(Boolean.FALSE);
        C93844aXQ c93844aXQ = LJIIJ;
        Iterator<Map.Entry<InterfaceC65784Pro<C76800UCe>, Observer<Boolean>>> it = c93844aXQ.LIZIZ.entrySet().iterator();
        while (it.hasNext()) {
            c93844aXQ.LIZ.removeObserver(it.next().getValue());
        }
        c93844aXQ.LIZIZ.clear();
        c93844aXQ.LIZ.setValue(Boolean.FALSE);
        LJIILL = null;
        ISubmissionProccessor LIZ2 = C94027aaN.LIZ();
        if (LIZ2 != null) {
            LIZ2.removeAll();
        }
        LJFF = null;
    }

    public static boolean LIZ(Feature canEdit) {
        o.LJIIIZ(canEdit, "$this$canEdit");
        if (o.LJ(canEdit.getSecondPanelType(), "face_stretch_edit_panel") || o.LJ(canEdit.getSecondPanelType(), "prefab_select_panel") || o.LJ(canEdit.getSecondPanelType(), "face_liquify_edit_panel") || (C93825aX7.LJ(canEdit) == EnumC93823aX5.Text && C93825aX7.LJI(canEdit).length() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.jvm.internal.IDqS419S0100000_42] */
    public static void LIZIZ(InterfaceC88472Yns interfaceC88472Yns) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new IDqS419S0100000_42(interfaceC88472Yns, 78);
        C94277aeP c94277aeP = new C94277aeP(c68322mC);
        MessageCenter.addListener(c94277aeP);
        C93744aVo.LIZIZ(new IDqS179S0200000_42(c94277aeP, c68322mC, 10), 1000L);
    }

    public static void LIZLLL(InterfaceC65784Pro block) {
        o.LJIIIZ(block, "block");
        C93844aXQ c93844aXQ = LJIIJ;
        c93844aXQ.getClass();
        C94276aeO c94276aeO = new C94276aeO(c93844aXQ, block);
        c93844aXQ.LIZIZ.put(block, c94276aeO);
        c93844aXQ.LIZ.observeForever(c94276aeO);
    }

    public static String LJFF(EffectType effectType) {
        boolean z;
        o.LJIIIZ(effectType, "effectType");
        if (LJ == effectType) {
            z = true;
        } else {
            z = false;
        }
        LJ = effectType;
        Project project = LIZIZ;
        if (project != null) {
            return project.askForEffectSticker(effectType, z);
        }
        return null;
    }

    public static void LJIIIIZZ(boolean z) {
        try {
            AtomicBoolean atomicBoolean = LIZ;
            if (!atomicBoolean.get() || z) {
                C16880lQ.LLJJJIL("EffectCreatorJni");
                EffectCreatorJniJNI.initLibrary();
                atomicBoolean.set(true);
            }
        } catch (Exception unused) {
            C94034aaU.LIZJ("CKE-editor", "load EffectCreatorJni.so library failed ");
        }
    }

    public static int LJIIJ(FeatureType type) {
        Model workingModel;
        FeatureManager featureManager;
        Integer valueOf;
        o.LJIIIZ(type, "type");
        Project project = LIZIZ;
        if (project == null || (workingModel = project.getWorkingModel()) == null || (featureManager = workingModel.featureManager()) == null || (valueOf = Integer.valueOf(featureManager.recommendOrderForCreate(type))) == null || valueOf.intValue() < 0) {
            return -1;
        }
        return valueOf.intValue();
    }

    public static void LJIIL(InterfaceC93604aTY onDataChange) {
        o.LJIIIZ(onDataChange, "onDataChange");
        LJIILIIL.remove(onDataChange);
    }

    public static void LJIILIIL(Feature feature) {
        Model workingModel;
        FeatureManager featureManager;
        Project project;
        Project project2 = LIZIZ;
        if (project2 != null && (workingModel = project2.getWorkingModel()) != null && (featureManager = workingModel.featureManager()) != null) {
            Error removeFeatureAndObject = featureManager.removeFeatureAndObject(feature);
            o.LJIIIIZZ(removeFeatureAndObject, "featureManager.removeFeatureAndObject(feature)");
            if (removeFeatureAndObject.isSuccess() && (project = LIZIZ) != null) {
                project.commit();
            }
        }
    }

    public static void LJIILJJIL(Long l) {
        Model workingModel;
        FeatureManager featureManager;
        EEStdFeatureList features;
        Long l2;
        if (l == null) {
            LJI.postValue(null);
            return;
        }
        Project project = LIZIZ;
        if (project == null || (workingModel = project.getWorkingModel()) == null || (featureManager = workingModel.featureManager()) == null || (features = featureManager.getFeatures()) == null || features.isEmpty()) {
            return;
        }
        Iterator<Feature> it = features.iterator();
        while (it.hasNext()) {
            Feature next = it.next();
            ElementId id = next.id();
            if (id != null) {
                l2 = Long.valueOf(id.objectId());
            } else {
                l2 = null;
            }
            if (o.LJ(l2, l)) {
                if (next != null) {
                    next.willBeSelected();
                }
                LJI.postValue(l);
                return;
            }
        }
    }

    public static void LIZJ(LifecycleOwner lifecycleOwner, final InterfaceC65784Pro block) {
        o.LJIIIZ(block, "block");
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext$doOnEffectEnvReady$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C93844aXQ c93844aXQ = CKEffectEditorContext.LJIIJ;
                    InterfaceC65784Pro block2 = InterfaceC65784Pro.this;
                    c93844aXQ.getClass();
                    o.LJIIIZ(block2, "block");
                    if (c93844aXQ.LIZIZ.containsKey(block2)) {
                        Observer<Boolean> observer = c93844aXQ.LIZIZ.get(block2);
                        if (observer != null) {
                            c93844aXQ.LIZ.removeObserver(observer);
                        }
                        c93844aXQ.LIZIZ.remove(block2);
                    }
                }
            }
        });
        C93844aXQ c93844aXQ = LJIIJ;
        c93844aXQ.getClass();
        C94276aeO c94276aeO = new C94276aeO(c93844aXQ, block);
        c93844aXQ.LIZIZ.put(block, c94276aeO);
        c93844aXQ.LIZ.observeForever(c94276aeO);
    }

    public static void LJIIIZ(EEStdElementSet eEStdElementSet, EnumC93799aWh enumC93799aWh) {
        Iterator<Element> it = eEStdElementSet.iterator();
        while (it.hasNext()) {
            Element it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (o.LJ(it2.getClassName(), EffectCreatorJniJNI.Feature_className())) {
                Feature dynamicCast = Feature.dynamicCast(it2);
                o.LJIIIIZZ(dynamicCast, "Feature.dynamicCast(it)");
                C93825aX7.LIZ(dynamicCast);
                Iterator<InterfaceC93801aWj> it3 = LJIIJJI.iterator();
                while (it3.hasNext()) {
                    InterfaceC93801aWj next = it3.next();
                    int i = C93845aXR.LIZ[enumC93799aWh.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            next.LIZIZ();
                        } else {
                            next.LIZJ();
                        }
                    } else {
                        next.LIZ();
                    }
                }
            }
        }
    }

    public static boolean LJII(String draftDirPath, boolean z, ProjectCreateFrom createFrom, InterfaceC93605aTZ interfaceC93605aTZ) {
        String str;
        o.LJIIIZ(draftDirPath, "draftDirPath");
        o.LJIIIZ(createFrom, "createFrom");
        if (!z) {
            try {
                if (LIZIZ != null) {
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        C94034aaU.LIZ("CKEffectEditorContext", "create");
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "UUID.randomUUID().toString()");
        Error error = new Error();
        String str2 = C93965aZN.LJ;
        Project project = null;
        if (str2 != null) {
            String LIZIZ2 = C93965aZN.LIZIZ(str2, uuid);
            if (createFrom == ProjectCreateFrom.ProjectCreateFrom_UserDraft) {
                uuid = "";
            }
            IStore iStore = LJIILJJIL;
            if (iStore == null || (str = iStore.getMainDraft()) == null || str.length() == 0 || !C93733aVd.LIZIZ(str)) {
                str = "";
            }
            Project create = Project.create(LIZIZ2, draftDirPath, uuid, createFrom, error, str);
            if (create != null) {
                LIZIZ = create;
                LIZLLL = createFrom;
                LJIILL = null;
                LJ = null;
                LJFF = new C93890aYA(create);
                LJI.setValue(null);
                create.addDataChangeObserver(LJIIL);
                LJII.postValue(Boolean.TRUE);
                project = create;
            }
            if (error.getType() == ErrorType.ErrorType_OpenOldDraftWithInteractionUnsupported) {
                interfaceC93605aTZ.LIZ();
            }
            if (project != null) {
                return true;
            }
            return false;
        }
        o.LJIJI("PROJECT_WORKING_PATH");
        throw null;
    }
}
