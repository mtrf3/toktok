package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.ElementId;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.ugc.effectcreator.canvas.CanvasFragment;
import com.ugc.effectcreator.canvas.CanvasImpl;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.adJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94209adJ implements InterfaceC93786aWU {
    public final /* synthetic */ CanvasFragment LIZ;

    public C94209adJ(CanvasFragment canvasFragment) {
        this.LIZ = canvasFragment;
    }

    @Override // X.InterfaceC93786aWU
    public final void LIZ(C94252ae0 functionItem, int i) {
        Canvas vl;
        C94613ajp c94613ajp;
        FragmentManager fragmentManager;
        C94613ajp c94613ajp2;
        o.LJIIIZ(functionItem, "functionItem");
        this.LIZ.getClass();
        if (CKEffectEditorContext.LJIIIIZZ.getValue() == 0) {
            return;
        }
        CanvasFragment canvasFragment = this.LIZ;
        int i2 = functionItem.LJLJI;
        canvasFragment.getClass();
        Feature xl = CanvasFragment.xl();
        if (xl != null) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return;
                            }
                            canvasFragment.onEventObjectAction("click_edit_asset");
                            String secondPanelType = xl.getSecondPanelType();
                            if (secondPanelType != null) {
                                int hashCode = secondPanelType.hashCode();
                                if (hashCode != -903003172) {
                                    if (hashCode != -630917003) {
                                        if (hashCode == 1539081771 && secondPanelType.equals("face_stretch_edit_panel")) {
                                            IEditorContext LIZ = C93940aYy.LIZ();
                                            if (LIZ == null || (fragmentManager = LIZ.getFragmentManager()) == null) {
                                                return;
                                            }
                                            C93939aYx.LIZ().editFaceDistortion(fragmentManager, C93825aX7.LIZ(xl));
                                            return;
                                        }
                                    } else if (secondPanelType.equals("face_liquify_edit_panel")) {
                                        Canvas vl2 = CanvasFragment.vl();
                                        if (vl2 != null) {
                                            vl2.stopAnimation();
                                        }
                                        InterfaceC93980aZc interfaceC93980aZc = canvasFragment.LJLJJI;
                                        if (interfaceC93980aZc == null) {
                                            return;
                                        }
                                        interfaceC93980aZc.LIZ(false);
                                        return;
                                    }
                                } else if (secondPanelType.equals("prefab_select_panel")) {
                                    long LIZ2 = C93825aX7.LIZ(xl);
                                    Canvas vl3 = CanvasFragment.vl();
                                    if (vl3 != null) {
                                        vl3.stopAnimation();
                                    }
                                    C94338afO c94338afO = canvasFragment.LJLILLLLZI;
                                    if (c94338afO != null && (c94613ajp = c94338afO.LJLJI) != null) {
                                        c94613ajp.setVisibility(4);
                                    }
                                    ICanvas LIZ3 = C93698aV4.LIZ();
                                    if (LIZ3 == null) {
                                        return;
                                    }
                                    LIZ3.operateFeature(LIZ2, EnumC93483aRb.EDIT_PREFAB);
                                    return;
                                }
                            }
                            Canvas vl4 = CanvasFragment.vl();
                            if (vl4 != null) {
                                vl4.stopAnimation();
                            }
                            C94338afO c94338afO2 = canvasFragment.LJLILLLLZI;
                            if (c94338afO2 != null && (c94613ajp2 = c94338afO2.LJLJI) != null) {
                                c94613ajp2.setVisibility(4);
                            }
                            ICanvas LIZ4 = C93698aV4.LIZ();
                            if (LIZ4 == null) {
                                return;
                            }
                            LIZ4.operateFeature(C93825aX7.LIZ(xl), EnumC93483aRb.EDIT_TEXT);
                            return;
                        }
                        StatisticReporter LIZ5 = C93670aUc.LIZ();
                        if (LIZ5 != null) {
                            LIZ5.onEvent("play_animation_click");
                        }
                        ElementId id = xl.id();
                        if (id == null || (vl = CanvasFragment.vl()) == null || !vl.isAnimatableWithFeatureID(id)) {
                            return;
                        }
                        if (canvasFragment.LJLIL) {
                            Canvas vl5 = CanvasFragment.vl();
                            if (vl5 != null) {
                                vl5.stopAnimationWithFeatureID(id);
                            }
                            CanvasImpl LIZIZ = C93991aZn.LIZIZ();
                            if (LIZIZ == null) {
                                return;
                            }
                            LIZIZ.operateFeature(id.objectId(), EnumC93483aRb.STOP_ANIMATION);
                            return;
                        }
                        Canvas vl6 = CanvasFragment.vl();
                        if (vl6 != null) {
                            vl6.startAnimationWithFeatureID(id);
                        }
                        CanvasImpl LIZIZ2 = C93991aZn.LIZIZ();
                        if (LIZIZ2 == null) {
                            return;
                        }
                        LIZIZ2.operateFeature(id.objectId(), EnumC93483aRb.PLAYER_ANIMATION);
                        return;
                    }
                    canvasFragment.onEventObjectAction("edit");
                    Canvas vl7 = CanvasFragment.vl();
                    if (vl7 != null) {
                        vl7.stopAnimation();
                    }
                    CanvasImpl LIZIZ3 = C93991aZn.LIZIZ();
                    if (LIZIZ3 == null) {
                        return;
                    }
                    LIZIZ3.operateFeature(C93825aX7.LIZ(xl), EnumC93483aRb.EDIT_INTERACTION_OBJECT);
                    return;
                }
                canvasFragment.onEventObjectAction("click_replace");
                Canvas vl8 = CanvasFragment.vl();
                if (vl8 != null) {
                    vl8.stopAnimation();
                }
                CanvasImpl LIZIZ4 = C93991aZn.LIZIZ();
                if (LIZIZ4 == null) {
                    return;
                }
                LIZIZ4.operateFeature(C93825aX7.LIZ(xl), EnumC93483aRb.REPLACE);
                return;
            }
            Canvas vl9 = CanvasFragment.vl();
            if (vl9 != null) {
                vl9.stopAnimation();
            }
            canvasFragment.onEventObjectAction("click_delete");
            IDialog LIZ6 = C93405aQL.LIZ();
            Context requireContext = canvasFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            String string = canvasFragment.getString(R.string.fv4);
            o.LJIIIIZZ(string, "getString(\n             …obj\n                    )");
            String string2 = canvasFragment.getString(R.string.fvx);
            o.LJIIIIZZ(string2, "getString(com.ugc.effect…tring.effect_tool_delete)");
            C93472aRQ.LIZ(LIZ6, requireContext, string, "", string2, canvasFragment.getString(R.string.fvg), new C94208adI(canvasFragment, xl), null, null, null, null, 1984);
        }
    }
}
