package X;

import Y.IDCListenerS118S0200000_42;
import Y.IDRunnableS92S0100000_42;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationScriptTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aeX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94285aeX implements InterfaceC93865aXl {
    public final /* synthetic */ EffectLayerEditorFragment LIZ;

    @Override // X.InterfaceC93865aXl
    public final void s3() {
    }

    @Override // X.InterfaceC93865aXl
    public final void o3() {
        this.LIZ.xl().iv0();
    }

    public C94285aeX(EffectLayerEditorFragment effectLayerEditorFragment) {
        this.LIZ = effectLayerEditorFragment;
    }

    @Override // X.InterfaceC93865aXl
    public final void r3(AbstractC94471ahX item) {
        Canvas LJ;
        View view;
        int i;
        o.LJIIIZ(item, "item");
        if (!this.LIZ.xl().LJLJI.get()) {
            return;
        }
        EffectLayerEditorFragment effectLayerEditorFragment = this.LIZ;
        RecyclerView recyclerView = effectLayerEditorFragment.LJLIL;
        Long l = null;
        if (recyclerView != null) {
            RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(effectLayerEditorFragment.Al().LJLIL.indexOf(item));
            if (LJJIZ != null && (view = LJJIZ.itemView) != null) {
                if (item.LJ() == 0) {
                    i = R.id.npq;
                } else {
                    i = R.id.nq6;
                }
                View findViewById = view.findViewById(i);
                if (findViewById != null && !findViewById.isFocused()) {
                    C93736aVg.LIZ(findViewById.getContext());
                }
            }
            EffectLayerEditorFragment effectLayerEditorFragment2 = this.LIZ;
            C94220adU LJFF = item.LJFF();
            effectLayerEditorFragment2.getClass();
            if (!LJFF.LJLJL && LJFF.LJLJJLL && LJFF.LJLJJI != EnumC93711aVH.FeatureType_Body) {
                if (!item.LJIIIZ()) {
                    this.LIZ.Dl(item.LJFF().LJLIL, EnumC93638aU6.Select);
                } else {
                    if (!item.LJIIJ()) {
                        l = C38350F3i.LJJIZ(item.getId());
                    }
                    CKEffectEditorContext.LJIILJJIL(l);
                }
                C93829aXB LJI = CKEffectEditorContext.LJI();
                if (LJI != null && (LJ = LJI.LJ()) != null) {
                    LJ.stopAnimation();
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("recycleView");
        throw null;
    }

    @Override // X.InterfaceC93865aXl
    public final void q3(C94291aed popData, AbstractC94471ahX abstractC94471ahX) {
        FragmentManager fragmentManager;
        int i;
        Feature feature;
        Canvas LJ;
        FeatureManager featureManager;
        EEStdFeatureList features;
        Feature feature2;
        InterfaceC93980aZc queryHandler;
        C94363afn LJFF;
        List<C94212adM> list;
        C94212adM c94212adM;
        UIAnnotationScriptTransform2D dynamicCast;
        UIAnnotationTransform2D dynamicCast2;
        o.LJIIIZ(popData, "popData");
        EffectLayerEditorFragment effectLayerEditorFragment = this.LIZ;
        int size = effectLayerEditorFragment.getData().size();
        for (int i2 = 0; i2 < size; i2++) {
            List<AbstractC94471ahX<InterfaceC94376ag0>> data = effectLayerEditorFragment.getData();
            if (data != null) {
                if (TextUtils.equals(((InterfaceC93998aZu) ListProtector.get(data, i2)).getId(), abstractC94471ahX.getId())) {
                    if (i2 < 0) {
                        return;
                    }
                    EnumC93710aVG enumC93710aVG = popData.LIZ;
                    if (enumC93710aVG == EnumC93710aVG.DELETE) {
                        effectLayerEditorFragment.onEventObjectAction("click_delete");
                        EffectLayerEditorFragment.Gl(abstractC94471ahX.LJFF().LJLIL);
                        IDialog LIZ = C93405aQL.LIZ();
                        Context requireContext = effectLayerEditorFragment.requireContext();
                        o.LJIIIIZZ(requireContext, "requireContext()");
                        String string = effectLayerEditorFragment.getString(R.string.fv4);
                        o.LJIIIIZZ(string, "getString(com.ugc.effect…ect_tool_alert_deleteobj)");
                        String string2 = effectLayerEditorFragment.getString(R.string.fvx);
                        o.LJIIIIZZ(string2, "getString(com.ugc.effect…tring.effect_tool_delete)");
                        C93472aRQ.LIZ(LIZ, requireContext, string, "", string2, effectLayerEditorFragment.getString(R.string.fvg), new C94292aee(effectLayerEditorFragment, abstractC94471ahX, popData), null, null, null, null, 1984);
                        return;
                    }
                    EnumC93710aVG enumC93710aVG2 = EnumC93710aVG.HIDE;
                    if (enumC93710aVG == enumC93710aVG2) {
                        effectLayerEditorFragment.onEventObjectAction("hidden");
                        C93890aYA c93890aYA = CKEffectEditorContext.LJFF;
                        if (c93890aYA != null) {
                            c93890aYA.LJ(abstractC94471ahX.LJFF().LJLIL, false);
                        }
                        EffectLayerEditorFragment.Gl(abstractC94471ahX.LJFF().LJLIL);
                        EnumC93710aVG enumC93710aVG3 = EnumC93710aVG.SHOW;
                        o.LJIIIZ(enumC93710aVG3, "<set-?>");
                        popData.LIZ = enumC93710aVG3;
                        abstractC94471ahX.LJFF().LJLJJLL = false;
                        if (abstractC94471ahX.LJIIJ()) {
                            CKEffectEditorContext.LJIILJJIL(null);
                        }
                        RecyclerView recyclerView = effectLayerEditorFragment.LJLIL;
                        if (recyclerView != null) {
                            recyclerView.postDelayed(new IDRunnableS92S0100000_42(effectLayerEditorFragment, 7), 200L);
                            ILayer iLayer = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                            if (iLayer == null) {
                                return;
                            }
                            iLayer.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                            return;
                        }
                        o.LJIJI("recycleView");
                        throw null;
                    }
                    if (enumC93710aVG == EnumC93710aVG.SHOW) {
                        effectLayerEditorFragment.onEventObjectAction("unhide");
                        C93890aYA c93890aYA2 = CKEffectEditorContext.LJFF;
                        if (c93890aYA2 != null) {
                            c93890aYA2.LJ(abstractC94471ahX.LJFF().LJLIL, true);
                        }
                        o.LJIIIZ(enumC93710aVG2, "<set-?>");
                        popData.LIZ = enumC93710aVG2;
                        abstractC94471ahX.LJFF().LJLJJLL = true;
                        RecyclerView recyclerView2 = effectLayerEditorFragment.LJLIL;
                        if (recyclerView2 != null) {
                            recyclerView2.postDelayed(new IDRunnableS92S0100000_42(effectLayerEditorFragment, 8), 200L);
                            ILayer iLayer2 = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                            if (iLayer2 == null) {
                                return;
                            }
                            iLayer2.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                            return;
                        }
                        o.LJIJI("recycleView");
                        throw null;
                    }
                    if (enumC93710aVG == EnumC93710aVG.REPLACE) {
                        effectLayerEditorFragment.onEventObjectAction("click_replace");
                        C93736aVg.LIZ(effectLayerEditorFragment.getContext());
                        ILayer iLayer3 = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                        if (iLayer3 != null) {
                            iLayer3.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                        }
                        EffectLayerEditorFragment.Gl(abstractC94471ahX.LJFF().LJLIL);
                        return;
                    }
                    EnumC93710aVG enumC93710aVG4 = EnumC93710aVG.LOCK;
                    if (enumC93710aVG == enumC93710aVG4) {
                        effectLayerEditorFragment.onEventObjectAction("lock");
                        C93890aYA c93890aYA3 = CKEffectEditorContext.LJFF;
                        if (c93890aYA3 != null) {
                            c93890aYA3.LIZLLL(abstractC94471ahX.LJFF().LJLIL, true);
                        }
                        EffectLayerEditorFragment.Gl(abstractC94471ahX.LJFF().LJLIL);
                        EnumC93710aVG enumC93710aVG5 = EnumC93710aVG.UNLOCK;
                        o.LJIIIZ(enumC93710aVG5, "<set-?>");
                        popData.LIZ = enumC93710aVG5;
                        abstractC94471ahX.LJFF().LJLJL = true;
                        if (abstractC94471ahX.LJIIJ()) {
                            CKEffectEditorContext.LJIILJJIL(null);
                        }
                        RecyclerView recyclerView3 = effectLayerEditorFragment.LJLIL;
                        if (recyclerView3 != null) {
                            recyclerView3.postDelayed(new IDRunnableS92S0100000_42(effectLayerEditorFragment, 9), 200L);
                            ILayer iLayer4 = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                            if (iLayer4 == null) {
                                return;
                            }
                            iLayer4.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                            return;
                        }
                        o.LJIJI("recycleView");
                        throw null;
                    }
                    if (enumC93710aVG == EnumC93710aVG.UNLOCK) {
                        effectLayerEditorFragment.onEventObjectAction("unlock");
                        C93890aYA c93890aYA4 = CKEffectEditorContext.LJFF;
                        if (c93890aYA4 != null) {
                            c93890aYA4.LIZLLL(abstractC94471ahX.LJFF().LJLIL, false);
                        }
                        o.LJIIIZ(enumC93710aVG4, "<set-?>");
                        popData.LIZ = enumC93710aVG4;
                        abstractC94471ahX.LJFF().LJLJL = false;
                        ILayer iLayer5 = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                        if (iLayer5 != null) {
                            iLayer5.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                        }
                        RecyclerView recyclerView4 = effectLayerEditorFragment.LJLIL;
                        if (recyclerView4 != null) {
                            recyclerView4.postDelayed(new IDRunnableS92S0100000_42(effectLayerEditorFragment, 10), 200L);
                            return;
                        } else {
                            o.LJIJI("recycleView");
                            throw null;
                        }
                    }
                    if (enumC93710aVG == EnumC93710aVG.COPY) {
                        C93890aYA c93890aYA5 = CKEffectEditorContext.LJFF;
                        if (c93890aYA5 != null) {
                            long j = abstractC94471ahX.LJFF().LJLIL;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(abstractC94471ahX.LJFF().LJLILLLLZI);
                            LIZ2.append(effectLayerEditorFragment.getResources().getString(R.string.fvn));
                            String reName = X1D.LIZIZ(LIZ2);
                            o.LJIIIZ(reName, "reName");
                            Model workingModel = c93890aYA5.LIZ.getWorkingModel();
                            if (workingModel != null && (featureManager = workingModel.featureManager()) != null && (features = featureManager.getFeatures()) != null) {
                                Iterator<Feature> it = features.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        feature2 = it.next();
                                        if (feature2.id().objectId() == j) {
                                            break;
                                        }
                                    } else {
                                        feature2 = null;
                                        break;
                                    }
                                }
                                Feature feature3 = feature2;
                                if (feature3 != null) {
                                    feature = c93890aYA5.LIZ.getWorkingModel().featureManager().copyFeatureAndObject(feature3);
                                    if (feature != null) {
                                        if (reName.length() > 0) {
                                            feature.setDisplayName(reName);
                                        }
                                        IAssetEditor LIZ3 = C93979aZb.LIZ();
                                        if (LIZ3 != null && (queryHandler = LIZ3.queryHandler(C93825aX7.LIZ(feature), null)) != null && (LJFF = queryHandler.LJFF()) != null && (list = LJFF.LJLIL) != null && (c94212adM = (C94212adM) ORZ.LJLLLL(list)) != null) {
                                            FeatureType featureType = feature.getFeatureType();
                                            if (featureType == null || C93889aY9.LIZ[featureType.ordinal()] != 1) {
                                                UIAnnotationBase uiAnnotationAccordingUIType = feature.getUiAnnotationAccordingUIType(UIAnnotationUIType.UIAnnotationUIType_Transform2D);
                                                if (uiAnnotationAccordingUIType != null && (dynamicCast2 = UIAnnotationTransform2D.dynamicCast((Element) uiAnnotationAccordingUIType)) != null) {
                                                    EEPoint eEPoint = new EEPoint();
                                                    eEPoint.setX(Math.max(c94212adM.LJLIL * 0.15d, 0.1d));
                                                    eEPoint.setY(Math.max(c94212adM.LJLILLLLZI * 0.15d, 0.1d));
                                                    dynamicCast2.updateOffsetAfterClone(eEPoint);
                                                }
                                            } else {
                                                UIAnnotationBase uiAnnotationAccordingUIType2 = feature.getUiAnnotationAccordingUIType(UIAnnotationUIType.UIAnnotationUIType_ScriptTransform2D);
                                                if (uiAnnotationAccordingUIType2 != null && (dynamicCast = UIAnnotationScriptTransform2D.dynamicCast((Element) uiAnnotationAccordingUIType2)) != null) {
                                                    EEPoint eEPoint2 = new EEPoint();
                                                    eEPoint2.setX(Math.max(c94212adM.LJLIL * 0.15d, 0.1d));
                                                    eEPoint2.setY(Math.max(c94212adM.LJLILLLLZI * 0.15d, 0.1d));
                                                    dynamicCast.updateOffsetAfterClone(eEPoint2);
                                                }
                                            }
                                        }
                                    }
                                    c93890aYA5.LIZ.commit();
                                }
                            }
                            feature = null;
                            c93890aYA5.LIZ.commit();
                        } else {
                            feature = null;
                        }
                        effectLayerEditorFragment.onEventObjectAction("copy");
                        C93829aXB LJI = CKEffectEditorContext.LJI();
                        if (LJI != null && (LJ = LJI.LJ()) != null) {
                            LJ.stopAnimation();
                        }
                        if (feature == null) {
                            return;
                        }
                        if (!abstractC94471ahX.LJIIIZ()) {
                            effectLayerEditorFragment.Dl(feature.id().objectId(), EnumC93638aU6.Copy);
                            return;
                        }
                        RecyclerView recyclerView5 = effectLayerEditorFragment.LJLIL;
                        if (recyclerView5 != null) {
                            recyclerView5.postDelayed(new IDRunnableS92S0100000_42(effectLayerEditorFragment, 11), 200L);
                            if (feature.getEditable() && feature.getVisible()) {
                                CKEffectEditorContext.LJIILJJIL(Long.valueOf(feature.id().objectId()));
                            }
                            ILayer iLayer6 = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                            if (iLayer6 == null) {
                                return;
                            }
                            iLayer6.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                            return;
                        }
                        o.LJIJI("recycleView");
                        throw null;
                    }
                    if (enumC93710aVG == EnumC93710aVG.RENAME) {
                        effectLayerEditorFragment.onEventObjectAction("click_rename");
                        RecyclerView recyclerView6 = effectLayerEditorFragment.LJLIL;
                        if (recyclerView6 != null) {
                            RecyclerView.ViewHolder LJJIZ = recyclerView6.LJJIZ(i2);
                            if ((LJJIZ instanceof C94389agD) && LJJIZ != null) {
                                View view = LJJIZ.itemView;
                                if (abstractC94471ahX.LJ() == 0) {
                                    i = R.id.npq;
                                } else {
                                    i = R.id.nq6;
                                }
                                EditText editText = (EditText) view.findViewById(i);
                                o.LJIIIIZZ(editText, "editText");
                                editText.setFocusable(true);
                                editText.setFocusableInTouchMode(true);
                                editText.setActivated(true);
                                editText.setInputType(1);
                                editText.setSingleLine(true);
                                editText.setEllipsize(null);
                                C93861aXh c93861aXh = new C93861aXh(editText, abstractC94471ahX);
                                editText.addTextChangedListener(c93861aXh);
                                C94284aeW c94284aeW = new C94284aeW(effectLayerEditorFragment, editText, c93861aXh);
                                C93738aVi c93738aVi = effectLayerEditorFragment.LJLJLLL;
                                if (c93738aVi != null) {
                                    c93738aVi.LIZJ.add(c94284aeW);
                                }
                                C93738aVi c93738aVi2 = effectLayerEditorFragment.LJLJLLL;
                                if (c93738aVi2 != null) {
                                    View view2 = LJJIZ.itemView;
                                    o.LJIIIIZZ(view2, "vh.itemView");
                                    RecyclerView recyclerView7 = effectLayerEditorFragment.LJLIL;
                                    if (recyclerView7 != null) {
                                        C34K c34k = new C34K();
                                        c34k.element = false;
                                        ViewTreeObserverOnGlobalFocusChangeListenerC93740aVk viewTreeObserverOnGlobalFocusChangeListenerC93740aVk = new ViewTreeObserverOnGlobalFocusChangeListenerC93740aVk(c93738aVi2, c34k, view2, recyclerView7);
                                        view2.getViewTreeObserver().addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC93740aVk);
                                        view2.addOnAttachStateChangeListener(new IDCListenerS118S0200000_42(view2, viewTreeObserverOnGlobalFocusChangeListenerC93740aVk, 0));
                                    } else {
                                        o.LJIJI("recycleView");
                                        throw null;
                                    }
                                }
                                editText.setFocusable(true);
                                editText.setFocusableInTouchMode(true);
                                editText.requestFocus();
                                editText.setSelection(editText.getText().length());
                                LifecycleOwner viewLifecycleOwner = effectLayerEditorFragment.getViewLifecycleOwner();
                                o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94854ani(effectLayerEditorFragment, editText, null), 3);
                                effectLayerEditorFragment.Al().LLIIIJ(true);
                                effectLayerEditorFragment.Al().LLIFFJFJJ(i2, true);
                                editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC93860aXg(effectLayerEditorFragment, i2));
                                C93790aWY c93790aWY = C93792aWa.LJII;
                                ActivityC45651qj requireActivity = effectLayerEditorFragment.requireActivity();
                                o.LJIIIIZZ(requireActivity, "requireActivity()");
                                effectLayerEditorFragment.LJLL = C93790aWY.LIZ(c93790aWY, requireActivity, 1, editText, new C94472ahY(effectLayerEditorFragment, editText), null, true, 16);
                            }
                            ILayer iLayer7 = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                            if (iLayer7 == null) {
                                return;
                            }
                            iLayer7.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                            return;
                        }
                        o.LJIJI("recycleView");
                        throw null;
                    }
                    if (enumC93710aVG == EnumC93710aVG.EDIT_ASSET) {
                        effectLayerEditorFragment.onEventObjectAction("click_edit_asset");
                        ILayer iLayer8 = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
                        if (iLayer8 != null) {
                            iLayer8.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, popData.LIZ);
                        }
                        EffectLayerEditorFragment.Gl(abstractC94471ahX.LJFF().LJLIL);
                        return;
                    }
                    EnumC93710aVG enumC93710aVG6 = EnumC93710aVG.EDIT_DISTORTION;
                    if (enumC93710aVG != enumC93710aVG6) {
                        return;
                    }
                    effectLayerEditorFragment.onEventObjectAction("click_edit_asset");
                    ILayer LIZ4 = C93709aVF.LIZ();
                    if (LIZ4 != null) {
                        LIZ4.updateLayerEvent(abstractC94471ahX.LJFF().LJLIL, enumC93710aVG6);
                    }
                    IEditorContext LIZ5 = C93940aYy.LIZ();
                    if (LIZ5 == null || (fragmentManager = LIZ5.getFragmentManager()) == null) {
                        return;
                    }
                    C93939aYx.LIZ().editFaceDistortion(fragmentManager, abstractC94471ahX.LJFF().LJLIL);
                    return;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.ugc.effectcreator.foundation.expandablerecycleviewadapter.IExpandableMultiItem>");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93865aXl
    public final void p3(InterfaceC94376ag0 item, int i, int i2) {
        LiveData<C94222adW> layerOrderChangeData;
        FeatureManager featureManager;
        EEStdFeatureList features;
        FeatureManager featureManager2;
        FeatureManager featureManager3;
        EEStdFeatureList features2;
        int i3 = i2;
        o.LJIIIZ(item, "item");
        ArrayList arrayList = new ArrayList();
        if (item.LJ() == 0) {
            for (AbstractC94471ahX<InterfaceC94376ag0> abstractC94471ahX : this.LIZ.getData()) {
                if (o.LJ(item.getId(), abstractC94471ahX.getId())) {
                    arrayList.add(Long.valueOf(CastLongProtector.parseLong(abstractC94471ahX.getId())));
                }
            }
            if (item.LIZLLL()) {
                List<InterfaceC93998aZu> LIZIZ = item.LIZIZ();
                o.LJI(LIZIZ);
                for (InterfaceC93998aZu interfaceC93998aZu : LIZIZ) {
                    for (AbstractC94471ahX<InterfaceC94376ag0> abstractC94471ahX2 : this.LIZ.getData()) {
                        if (o.LJ(interfaceC93998aZu.getId(), abstractC94471ahX2.getId())) {
                            arrayList.add(Long.valueOf(CastLongProtector.parseLong(abstractC94471ahX2.getId())));
                        }
                    }
                }
                if (i < i3) {
                    i3++;
                }
            }
        } else {
            for (AbstractC94471ahX<InterfaceC94376ag0> abstractC94471ahX3 : this.LIZ.getData()) {
                if (o.LJ(item.getId(), abstractC94471ahX3.getId())) {
                    arrayList.add(Long.valueOf(CastLongProtector.parseLong(abstractC94471ahX3.getId())));
                }
            }
        }
        C93890aYA c93890aYA = CKEffectEditorContext.LJFF;
        if (c93890aYA != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("moveFeatures features = ");
            LIZ.append(arrayList);
            LIZ.append("  posFrom=");
            LIZ.append(i);
            LIZ.append(" posTarget=");
            LIZ.append(i3);
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
            if (!arrayList.isEmpty()) {
                FeatureManager featureManager4 = c93890aYA.LIZ.getWorkingModel().featureManager();
                o.LJIIIIZZ(featureManager4, "project.workingModel.featureManager()");
                EEStdFeatureList features3 = featureManager4.getFeatures();
                EEStdFeatureList eEStdFeatureList = new EEStdFeatureList();
                if (features3 != null) {
                    Iterator<Feature> it = features3.iterator();
                    while (it.hasNext()) {
                        Feature next = it.next();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (next.id().objectId() == ((Number) it2.next()).longValue()) {
                                    eEStdFeatureList.add(next);
                                    break;
                                }
                            }
                        }
                    }
                    Model workingModel = c93890aYA.LIZ.getWorkingModel();
                    if (workingModel != null && (featureManager3 = workingModel.featureManager()) != null && (features2 = featureManager3.getFeatures()) != null) {
                        Iterator<Feature> it3 = features2.iterator();
                        int i4 = 0;
                        while (it3.hasNext()) {
                            Feature next2 = it3.next();
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                Feature feature = next2;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("moveFeatures  before index = ");
                                LIZ2.append(i4);
                                LIZ2.append(" feature=");
                                o.LJIIIIZZ(feature, "feature");
                                LIZ2.append(feature.getDisplayName());
                                LIZ2.append(' ');
                                C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ2));
                                i4 = i5;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    Model workingModel2 = c93890aYA.LIZ.getWorkingModel();
                    if (workingModel2 != null && (featureManager2 = workingModel2.featureManager()) != null) {
                        featureManager2.moveFeatures(eEStdFeatureList, i3);
                    }
                    C94034aaU.LIZ("CKE-editor", "moveFeatures  ------------- ");
                    Model workingModel3 = c93890aYA.LIZ.getWorkingModel();
                    if (workingModel3 != null && (featureManager = workingModel3.featureManager()) != null && (features = featureManager.getFeatures()) != null) {
                        Iterator<Feature> it4 = features.iterator();
                        int i6 = 0;
                        while (it4.hasNext()) {
                            Feature next3 = it4.next();
                            int i7 = i6 + 1;
                            if (i6 >= 0) {
                                Feature feature2 = next3;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("moveFeatures  after  index = ");
                                LIZ3.append(i6);
                                LIZ3.append(" feature=");
                                o.LJIIIIZZ(feature2, "feature");
                                LIZ3.append(feature2.getDisplayName());
                                LIZ3.append(' ');
                                C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ3));
                                i6 = i7;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        Long l = (Long) CKEffectEditorContext.LJIIIIZZ.getValue();
        if (l != null) {
            Iterator<AbstractC94471ahX<InterfaceC94376ag0>> it5 = this.LIZ.getData().iterator();
            int i8 = 0;
            while (true) {
                if (it5.hasNext()) {
                    if (o.LJ(it5.next().getId(), String.valueOf(l.longValue()))) {
                        break;
                    } else {
                        i8++;
                    }
                } else {
                    i8 = -1;
                    break;
                }
            }
            int min = Math.min(i, i3);
            int max = Math.max(i, i3);
            if (min <= i8 && max >= i8) {
                EffectLayerEditorFragment effectLayerEditorFragment = this.LIZ;
                long longValue = l.longValue();
                effectLayerEditorFragment.getClass();
                EffectLayerEditorFragment.Gl(longValue);
            }
        }
        ILayer iLayer = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
        if (iLayer != null && (layerOrderChangeData = iLayer.getLayerOrderChangeData()) != null) {
            Object obj = ListProtector.get(arrayList, 0);
            o.LJIIIIZZ(obj, "layerFeatureList[0]");
            layerOrderChangeData.setValue(new C94222adW(((Number) obj).longValue(), i, i3));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.layer.LayerLiveData<com.bytedance.effectcreatormobile.ckeapi.api.layer.LayerOrderChangeData>");
    }
}
