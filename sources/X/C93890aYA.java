package X;

import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.Error;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.ies.effectcreator.swig.Project;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.aYA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93890aYA {
    public final Project LIZ;

    public final boolean LIZ() {
        EEStdFeatureList eEStdFeatureList;
        FeatureManager featureManager;
        Model workingModel = this.LIZ.getWorkingModel();
        if (workingModel != null && (featureManager = workingModel.featureManager()) != null) {
            eEStdFeatureList = featureManager.getFeatures();
        } else {
            eEStdFeatureList = null;
        }
        if (eEStdFeatureList != null) {
            Iterator<Feature> it = eEStdFeatureList.iterator();
            while (it.hasNext()) {
                Feature next = it.next();
                Canvas canvasPtr = this.LIZ.getCanvasPtr();
                if (canvasPtr == null || !canvasPtr.isCompatibleWithFeatureID(next.id())) {
                    return false;
                }
            }
        }
        return true;
    }

    public C93890aYA(Project project) {
        this.LIZ = project;
    }

    public final boolean LIZIZ(long j) {
        FeatureManager featureManager = this.LIZ.getWorkingModel().featureManager();
        o.LJIIIIZZ(featureManager, "project.workingModel.featureManager()");
        EEStdFeatureList features = featureManager.getFeatures();
        if (features != null) {
            Iterator<Feature> it = features.iterator();
            while (it.hasNext()) {
                Feature next = it.next();
                if (next.id().objectId() == j) {
                    Error removeFeatureAndObject = this.LIZ.getWorkingModel().featureManager().removeFeatureAndObject(next);
                    o.LJIIIIZZ(removeFeatureAndObject, "project.workingModel.fea…eAndObject(effectfeature)");
                    boolean isSuccess = removeFeatureAndObject.isSuccess();
                    if (isSuccess) {
                        this.LIZ.commit();
                    }
                    return isSuccess;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean LIZJ(long j, String newName) {
        Feature feature;
        o.LJIIIZ(newName, "newName");
        FeatureManager featureManager = this.LIZ.getWorkingModel().featureManager();
        o.LJIIIIZZ(featureManager, "project.workingModel.featureManager()");
        EEStdFeatureList features = featureManager.getFeatures();
        if (features != null) {
            Iterator<Feature> it = features.iterator();
            while (true) {
                if (it.hasNext()) {
                    feature = it.next();
                    if (feature.id().objectId() == j) {
                        break;
                    }
                } else {
                    feature = null;
                    break;
                }
            }
            Feature feature2 = feature;
            if (feature2 != null) {
                feature2.setDisplayName(newName);
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(long j, boolean z) {
        FeatureManager featureManager = this.LIZ.getWorkingModel().featureManager();
        o.LJIIIIZZ(featureManager, "project.workingModel.featureManager()");
        EEStdFeatureList features = featureManager.getFeatures();
        if (features != null) {
            Iterator<Feature> it = features.iterator();
            while (it.hasNext()) {
                Feature next = it.next();
                if (next.id().objectId() == j) {
                    next.setEditable(!z);
                }
            }
        }
    }

    public final void LJ(long j, boolean z) {
        FeatureManager featureManager = this.LIZ.getWorkingModel().featureManager();
        o.LJIIIIZZ(featureManager, "project.workingModel.featureManager()");
        EEStdFeatureList features = featureManager.getFeatures();
        if (features != null) {
            Iterator<Feature> it = features.iterator();
            while (it.hasNext()) {
                Feature next = it.next();
                if (next.id().objectId() == j) {
                    next.setVisible(z);
                }
            }
        }
    }
}
