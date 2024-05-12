package X;

import com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor;
import com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor;
import com.bytedance.ies.effectcreator.swig.AssetImageTexture;
import com.bytedance.ies.effectcreator.swig.AssetManager;
import com.bytedance.ies.effectcreator.swig.AssetType;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Error;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.ies.effectcreator.swig.Project;
import com.bytedance.ies.effectcreator.swig.ProjectState;
import com.bytedance.ies.effectcreator.swig.UIAnnotationAssetTexture;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aXB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93829aXB {
    public final String LIZ;
    public C94274aeM LIZIZ;
    public final Project LIZJ;

    public final void LIZIZ() {
        Project project = this.LIZJ;
        if (project != null) {
            project.commit();
        }
    }

    public final Canvas LJ() {
        return this.LIZJ.getCanvasPtr();
    }

    public final List<Feature> LJI() {
        FeatureManager featureManager;
        EEStdFeatureList features;
        Model workingModel = this.LIZJ.getWorkingModel();
        if (workingModel != null && (featureManager = workingModel.featureManager()) != null && (features = featureManager.getFeatures()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Feature> it = features.iterator();
            while (it.hasNext()) {
                Feature next = it.next();
                Feature it2 = next;
                o.LJIIIIZZ(it2, "it");
                if (it2.getFeatureType() != FeatureType.FeatureType_Body) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public final boolean LJIIIZ() {
        FeatureManager featureManager;
        EEStdFeatureList features;
        Model workingModel = this.LIZJ.getWorkingModel();
        if (workingModel == null || (featureManager = workingModel.featureManager()) == null || (features = featureManager.getFeatures()) == null || features.isEmpty()) {
            return true;
        }
        Iterator<Feature> it = features.iterator();
        while (it.hasNext()) {
            Feature it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (it2.getFeatureType() != FeatureType.FeatureType_Body && it2.getFeatureType() != FeatureType.FeatureType_Unknown) {
                return false;
            }
        }
        return true;
    }

    public final boolean LJII() {
        if (o.LJ(C93939aYx.LIZ().getRenderModeData().getValue(), C94339afP.LIZ)) {
            Canvas LJ = LJ();
            if (LJ != null) {
                return LJ.isCurrentCanvasHasHumanFace();
            }
            return false;
        }
        return true;
    }

    public C93829aXB(Project project) {
        this.LIZJ = project;
        String uuid = project.getUUID();
        o.LJIIIIZZ(uuid, "project.uuid");
        this.LIZ = uuid;
        this.LIZIZ = new C94274aeM("", "");
    }

    public static UIAnnotationAssetTexture LIZLLL(Feature feature) {
        o.LJIIIZ(feature, "feature");
        UIAnnotationAssetTexture dynamicCast = UIAnnotationAssetTexture.dynamicCast((Element) feature.getUiAnnotationAccordingUIType(UIAnnotationUIType.UIAnnotationUIType_AssetTexture));
        if (dynamicCast != null) {
            return dynamicCast;
        }
        return null;
    }

    public static int LJIIJ(Feature feature) {
        EnumC93823aX5 LIZLLL;
        UIAnnotationAssetTexture LIZLLL2 = LIZLLL(feature);
        if (feature.getFeatureType() == FeatureType.FeatureType_LegacyFeature) {
            return 65;
        }
        if (feature.getFeatureType() == FeatureType.FeatureType_FaceDistortion) {
            return 60;
        }
        if (feature.getFeatureType() == FeatureType.FeatureType_FaceLiquify) {
            return 45;
        }
        if (feature.getFeatureType() == FeatureType.FeatureType_Makeup) {
            return 40;
        }
        if (feature.getFeatureType() == FeatureType.FeatureType_Filter) {
            return 30;
        }
        if (LIZLLL2 != null) {
            AssetImageTexture assetTexture = LIZLLL2.getAssetTexture();
            if (assetTexture != null && (LIZLLL = C93825aX7.LIZLLL(assetTexture)) != null) {
                switch (C93828aXA.LIZ[LIZLLL.ordinal()]) {
                    case 1:
                        return 100;
                    case 2:
                        return 90;
                    case 3:
                    case 4:
                        return 80;
                    case 5:
                        return 70;
                    case 6:
                        return 50;
                }
            }
            return 1;
        }
        return 0;
    }

    public final C94274aeM LIZ(InterfaceC88472Yns<? super C94274aeM, C94274aeM> interfaceC88472Yns) {
        if (interfaceC88472Yns != null) {
            C94274aeM invoke = interfaceC88472Yns.invoke(this.LIZIZ);
            this.LIZIZ = invoke;
            if (invoke != null) {
                return invoke;
            }
        }
        return this.LIZIZ;
    }

    public final Feature LJFF(long j) {
        Model workingModel;
        FeatureManager featureManager;
        EEStdFeatureList features;
        Project project = this.LIZJ;
        Feature feature = null;
        if (project != null && (workingModel = project.getWorkingModel()) != null && (featureManager = workingModel.featureManager()) != null && (features = featureManager.getFeatures()) != null) {
            Iterator<Feature> it = features.iterator();
            while (it.hasNext()) {
                Feature next = it.next();
                if (next.id().objectId() == j) {
                    feature = next;
                }
            }
        }
        return feature;
    }

    public final void LJIIJJI(String draftPath) {
        Error save;
        o.LJIIIZ(draftPath, "draftPath");
        ISubmissionProccessor LIZ = C94027aaN.LIZ();
        if (LIZ != null) {
            LIZ.onSubmissionExtra(new WeakReference(this.LIZJ), draftPath);
        }
        ICapabilityProccessor LIZ2 = C94026aaM.LIZ();
        if (LIZ2 != null) {
            LIZ2.onCapability(new WeakReference(this.LIZJ), draftPath);
        }
        Project project = this.LIZJ;
        if (project != null && (save = project.save(draftPath)) != null) {
            save.getType();
        }
    }

    public final void LJIIL(ProjectState projectState) {
        o.LJIIIZ(projectState, "projectState");
        CKEffectEditorContext.LIZLLL(new IDqS179S0200000_42(this, projectState, 9));
    }

    public final boolean LJIIIIZZ(EnumC93823aX5 type, String resPath) {
        AssetManager assetManager;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(resPath, "resPath");
        Model workingModel = this.LIZJ.getWorkingModel();
        if (workingModel != null && (assetManager = workingModel.assetManager()) != null) {
            if (type == EnumC93823aX5.ResourcePackage) {
                Error checkAssetCompatibilityWithAssetPackage = assetManager.checkAssetCompatibilityWithAssetPackage(resPath);
                o.LJIIIIZZ(checkAssetCompatibilityWithAssetPackage, "assetsManager.checkAsset…WithAssetPackage(resPath)");
                return checkAssetCompatibilityWithAssetPackage.isSuccess();
            }
            if (ujb.o.LJJJJ(resPath, ".gif", true)) {
                Error checkAssetCompatibilityWithType = assetManager.checkAssetCompatibilityWithType(AssetType.AssetType_Gif);
                o.LJIIIIZZ(checkAssetCompatibilityWithType, "assetsManager.checkAsset…(AssetType.AssetType_Gif)");
                return checkAssetCompatibilityWithType.isSuccess();
            }
            if (type == EnumC93823aX5.UnKnow) {
                return true;
            }
            Error checkAssetCompatibilityWithType2 = assetManager.checkAssetCompatibilityWithType(AssetType.AssetType_ImageTexture);
            o.LJIIIIZZ(checkAssetCompatibilityWithType2, "assetsManager.checkAsset…e.AssetType_ImageTexture)");
            return checkAssetCompatibilityWithType2.isSuccess();
        }
        return false;
    }

    public final Feature LIZJ(Integer num, String resPath, String resourceName, String displayName) {
        int i;
        Model workingModel;
        FeatureManager featureManager;
        o.LJIIIZ(resPath, "resPath");
        o.LJIIIZ(resourceName, "resourceName");
        o.LJIIIZ(displayName, "displayName");
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        Project project = this.LIZJ;
        if (project != null && (workingModel = project.getWorkingModel()) != null && (featureManager = workingModel.featureManager()) != null) {
            return featureManager.createFeatureAndObject(resPath, resourceName, displayName, i);
        }
        return null;
    }
}
