package X;

import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import com.ugc.effectcreator.layer.LayerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.acn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94177acn implements InterfaceC93942aZ0 {
    public final /* synthetic */ IDqS423S0100000_42 LIZ;

    @Override // X.InterfaceC93942aZ0
    public final void LIZ() {
        ArrayList arrayList;
        EnumC93711aVH enumC93711aVH;
        EnumC93710aVG enumC93710aVG;
        EnumC93710aVG enumC93710aVG2;
        EnumC93710aVG enumC93710aVG3;
        EnumC93710aVG enumC93710aVG4;
        EnumC93710aVG enumC93710aVG5;
        EnumC93710aVG enumC93710aVG6;
        EnumC93710aVG enumC93710aVG7;
        EnumC93710aVG enumC93710aVG8;
        LayerViewModel layerViewModel = (LayerViewModel) this.LIZ.l0;
        layerViewModel.getClass();
        String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
        o.LJIIIIZZ(stackTraceString, "Log.getStackTraceString(Throwable())");
        C94034aaU.LIZ("CKE-editor", stackTraceString);
        C93890aYA c93890aYA = CKEffectEditorContext.LJFF;
        if (c93890aYA != null) {
            arrayList = new ArrayList();
            FeatureManager featureManager = c93890aYA.LIZ.getWorkingModel().featureManager();
            o.LJIIIIZZ(featureManager, "project.workingModel.featureManager()");
            EEStdFeatureList features = featureManager.getFeatures();
            if (features != null) {
                Iterator<Feature> it = features.iterator();
                while (it.hasNext()) {
                    Feature next = it.next();
                    long objectId = next.id().objectId();
                    String displayName = next.getDisplayName();
                    o.LJIIIIZZ(displayName, "feature.displayName");
                    String resourceName = next.getResourceName();
                    o.LJIIIIZZ(resourceName, "feature.resourceName");
                    FeatureType type = next.getType();
                    o.LJIIIIZZ(type, "feature.type");
                    switch (C93889aY9.LIZIZ[type.ordinal()]) {
                        case 1:
                            enumC93711aVH = EnumC93711aVH.FeatureType_Background2D;
                            break;
                        case 2:
                            enumC93711aVH = EnumC93711aVH.FeatureType_Foreground2D;
                            break;
                        case 3:
                            enumC93711aVH = EnumC93711aVH.FeatureType_FaceInset;
                            break;
                        case 4:
                            enumC93711aVH = EnumC93711aVH.FeatureType_Filter;
                            break;
                        case 5:
                            enumC93711aVH = EnumC93711aVH.FeatureType_FaceDistortion;
                            break;
                        case 6:
                            enumC93711aVH = EnumC93711aVH.FeatureType_FaceLiquify;
                            break;
                        case 7:
                            enumC93711aVH = EnumC93711aVH.FeatureType_Body;
                            break;
                        case 8:
                            enumC93711aVH = EnumC93711aVH.FeatureType_HairColor;
                            break;
                        case 9:
                            enumC93711aVH = EnumC93711aVH.FeatureType_Makeup;
                            break;
                        case 10:
                            enumC93711aVH = EnumC93711aVH.FeatureType_Gan;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            enumC93711aVH = EnumC93711aVH.FeatureType_3DFaceSticker;
                            break;
                        case 12:
                            enumC93711aVH = EnumC93711aVH.FeatureType_Unknown;
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            enumC93711aVH = EnumC93711aVH.FeatureType_PostProcess;
                            break;
                        case 14:
                            enumC93711aVH = EnumC93711aVH.FeatureType_LegacyFeature;
                            break;
                        default:
                            throw new C162476Zf();
                    }
                    String iconPath = next.getIconPath();
                    o.LJIIIIZZ(iconPath, "feature.iconPath");
                    boolean visible = next.getVisible();
                    boolean z = !next.getEditable();
                    boolean editable = next.getEditable();
                    boolean z2 = !next.getVisible();
                    ArrayList arrayList2 = new ArrayList();
                    String secondPanelType = next.getSecondPanelType();
                    if (secondPanelType != null) {
                        switch (secondPanelType.hashCode()) {
                            case -983356013:
                                if (!secondPanelType.equals("face_inset_edit_panel")) {
                                    break;
                                } else {
                                    arrayList2.add(EnumC93710aVG.RENAME);
                                    arrayList2.add(EnumC93710aVG.COPY);
                                    if (z2) {
                                        enumC93710aVG = EnumC93710aVG.SHOW;
                                    } else {
                                        enumC93710aVG = EnumC93710aVG.HIDE;
                                    }
                                    arrayList2.add(enumC93710aVG);
                                    if (editable) {
                                        enumC93710aVG2 = EnumC93710aVG.LOCK;
                                    } else {
                                        enumC93710aVG2 = EnumC93710aVG.UNLOCK;
                                    }
                                    arrayList2.add(enumC93710aVG2);
                                    arrayList2.add(EnumC93710aVG.DELETE);
                                    break;
                                }
                            case -903003172:
                                if (!secondPanelType.equals("prefab_select_panel")) {
                                    break;
                                } else {
                                    arrayList2.add(EnumC93710aVG.RENAME);
                                    arrayList2.add(EnumC93710aVG.EDIT_ASSET);
                                    arrayList2.add(EnumC93710aVG.COPY);
                                    if (z2) {
                                        enumC93710aVG3 = EnumC93710aVG.SHOW;
                                    } else {
                                        enumC93710aVG3 = EnumC93710aVG.HIDE;
                                    }
                                    arrayList2.add(enumC93710aVG3);
                                    arrayList2.add(EnumC93710aVG.DELETE);
                                    break;
                                }
                            case -630917003:
                                if (!secondPanelType.equals("face_liquify_edit_panel")) {
                                    break;
                                } else {
                                    arrayList2.add(EnumC93710aVG.RENAME);
                                    arrayList2.add(EnumC93710aVG.COPY);
                                    arrayList2.add(EnumC93710aVG.EDIT_ASSET);
                                    if (z2) {
                                        enumC93710aVG4 = EnumC93710aVG.SHOW;
                                    } else {
                                        enumC93710aVG4 = EnumC93710aVG.HIDE;
                                    }
                                    arrayList2.add(enumC93710aVG4);
                                    if (editable) {
                                        enumC93710aVG5 = EnumC93710aVG.LOCK;
                                    } else {
                                        enumC93710aVG5 = EnumC93710aVG.UNLOCK;
                                    }
                                    arrayList2.add(enumC93710aVG5);
                                    arrayList2.add(EnumC93710aVG.DELETE);
                                    break;
                                }
                            case 323415461:
                                if (!secondPanelType.equals("texture_select_panel")) {
                                    break;
                                } else {
                                    arrayList2.add(EnumC93710aVG.RENAME);
                                    if (CKEffectEditorContext.LIZ(next)) {
                                        arrayList2.add(EnumC93710aVG.EDIT_ASSET);
                                    }
                                    arrayList2.add(EnumC93710aVG.REPLACE);
                                    arrayList2.add(EnumC93710aVG.COPY);
                                    if (z2) {
                                        enumC93710aVG6 = EnumC93710aVG.SHOW;
                                    } else {
                                        enumC93710aVG6 = EnumC93710aVG.HIDE;
                                    }
                                    arrayList2.add(enumC93710aVG6);
                                    if (editable) {
                                        enumC93710aVG7 = EnumC93710aVG.LOCK;
                                    } else {
                                        enumC93710aVG7 = EnumC93710aVG.UNLOCK;
                                    }
                                    arrayList2.add(enumC93710aVG7);
                                    arrayList2.add(EnumC93710aVG.DELETE);
                                    break;
                                }
                            case 1539081771:
                                if (!secondPanelType.equals("face_stretch_edit_panel")) {
                                    break;
                                } else {
                                    arrayList2.add(EnumC93710aVG.RENAME);
                                    arrayList2.add(EnumC93710aVG.EDIT_DISTORTION);
                                    arrayList2.add(EnumC93710aVG.COPY);
                                    if (z2) {
                                        enumC93710aVG8 = EnumC93710aVG.SHOW;
                                    } else {
                                        enumC93710aVG8 = EnumC93710aVG.HIDE;
                                    }
                                    arrayList2.add(enumC93710aVG8);
                                    arrayList2.add(EnumC93710aVG.DELETE);
                                    break;
                                }
                        }
                    }
                    arrayList.add(new C94220adU(objectId, displayName, resourceName, enumC93711aVH, iconPath, visible, z, arrayList2));
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList == null) {
            StateViewModel.hv0(layerViewModel.LJLILLLLZI, arrayList3);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C94220adU c94220adU = (C94220adU) it2.next();
            if (!ORY.LJJIJIIJIL(c94220adU.LJLJJI, layerViewModel.LJLJJI)) {
                arrayList3.add(new C94669akj(c94220adU, LayerViewModel.jv0(c94220adU)));
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            if (it3.hasNext()) {
                AbstractC94471ahX abstractC94471ahX = (AbstractC94471ahX) it3.next();
                if (abstractC94471ahX.LJFF().LJLJJI == EnumC93711aVH.FeatureType_Body) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        C94220adU c94220adU2 = (C94220adU) it4.next();
                        if (ORY.LJJIJIIJIL(c94220adU2.LJLJJI, layerViewModel.LJLJJI)) {
                            C94670akk c94670akk = new C94670akk(c94220adU2, abstractC94471ahX.getId(), 1, false, false, false, LayerViewModel.jv0(c94220adU2));
                            if (abstractC94471ahX.LIZIZ == null) {
                                abstractC94471ahX.LIZIZ = new ArrayList();
                            }
                            List<Object> list = abstractC94471ahX.LIZIZ;
                            o.LJI(list);
                            ((ArrayList) list).add(c94670akk);
                        }
                    }
                }
            }
        }
        StateViewModel.hv0(layerViewModel.LJLILLLLZI, arrayList3);
    }

    public C94177acn(IDqS423S0100000_42 iDqS423S0100000_42) {
        this.LIZ = iDqS423S0100000_42;
    }
}
