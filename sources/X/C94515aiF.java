package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationScriptTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2DData;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import kotlin.jvm.internal.o;

/* renamed from: X.aiF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94515aiF extends AbstractC94369aft {
    public UIAnnotationTransform2DData LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // X.InterfaceC93980aZc
    public final void LIZ(boolean z) {
    }

    @Override // X.AbstractC94369aft, X.InterfaceC93980aZc
    public final void LJI() {
        this.LJ = false;
    }

    @Override // X.InterfaceC93980aZc
    public final C94362afm LJ() {
        return new C94362afm(false, false);
    }

    public final UIAnnotationScriptTransform2D LJIIIZ() {
        UIAnnotationBase uiAnnotationAccordingUIType = this.LIZJ.getUiAnnotationAccordingUIType(UIAnnotationUIType.UIAnnotationUIType_ScriptTransform2D);
        if (uiAnnotationAccordingUIType != null) {
            return UIAnnotationScriptTransform2D.dynamicCast((Element) uiAnnotationAccordingUIType);
        }
        return null;
    }

    @Override // X.InterfaceC93980aZc
    public final C94363afn LJFF() {
        C94212adM c94212adM;
        UIAnnotationTransform2DData uIAnnotationTransform2DData;
        UIAnnotationScriptTransform2D LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            c94212adM = C94002aZy.LIZLLL(LJIIIZ, this.LIZLLL);
        } else {
            c94212adM = null;
        }
        int i = 0;
        while (LJIIJ(c94212adM) ^ this.LJFF) {
            UIAnnotationScriptTransform2D LJIIIZ2 = LJIIIZ();
            if (this.LIZLLL != null) {
                if (LJIIIZ2 != null) {
                    uIAnnotationTransform2DData = LJIIIZ2.getNormalizationTransform2DUIDataPtr();
                } else {
                    uIAnnotationTransform2DData = null;
                }
                this.LIZLLL = uIAnnotationTransform2DData;
            }
            if (LJIIIZ2 != null) {
                c94212adM = C94002aZy.LIZLLL(LJIIIZ2, this.LIZLLL);
            } else {
                c94212adM = null;
            }
            i++;
            if (i >= 2) {
                break;
            }
        }
        if (c94212adM != null) {
            this.LJFF = LJIIJ(c94212adM);
            return new C94363afn(C47261Igj.LJJIJ(c94212adM), EnumC93697aV3.RECTANGLE);
        }
        return new C94363afn(C61878OQg.INSTANCE, EnumC93697aV3.EMPTY);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94515aiF(Feature faceMeshFeature) {
        super(faceMeshFeature);
        o.LJIIIZ(faceMeshFeature, "faceMeshFeature");
        this.LJFF = true;
    }

    public static boolean LJIIJ(C94212adM c94212adM) {
        if (c94212adM != null) {
            double d = c94212adM.LJLIL;
            if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                double d2 = c94212adM.LJLILLLLZI;
                if (d2 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    double d3 = c94212adM.LJLJI;
                    double d4 = 2;
                    double d5 = d / d4;
                    if (d5 + d3 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d3 - d5 < 1.0d) {
                        double d6 = c94212adM.LJLJJI;
                        double d7 = d2 / d4;
                        if (d7 + d6 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d6 - d7 < 1.0d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZIZ(float f) {
        LJIIJJI(new C94722ala(f));
    }

    @Override // X.AbstractC94369aft
    public final Object LJIIIIZZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        UIAnnotationTransform2DData uIAnnotationTransform2DData;
        UIAnnotationScriptTransform2D LJIIIZ;
        if (this.LJ && (LJIIIZ = LJIIIZ()) != null) {
            uIAnnotationTransform2DData = LJIIIZ.getNormalizationTransform2DUIDataPtr();
        } else {
            uIAnnotationTransform2DData = null;
        }
        this.LIZLLL = uIAnnotationTransform2DData;
        Object emitEditEvent = C93977aZZ.LIZIZ().emitEditEvent(EnumC93978aZa.UPDATE, interfaceC67352kd);
        if (emitEditEvent == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return emitEditEvent;
        }
        return C76800UCe.LIZ;
    }

    public final void LJIIJJI(InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LJ = true;
        UIAnnotationScriptTransform2D LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            UIAnnotationTransform2DData uIAnnotationTransform2DData = this.LIZLLL;
            if (uIAnnotationTransform2DData == null) {
                uIAnnotationTransform2DData = LJIIIZ.getNormalizationTransform2DUIDataPtr();
                this.LIZLLL = uIAnnotationTransform2DData;
                if (uIAnnotationTransform2DData == null) {
                    return;
                }
            }
            interfaceC88471Ynr.invoke(LJIIIZ, uIAnnotationTransform2DData);
            XKX.LIZLLL(this.LIZ, null, null, new C94953apJ(this, 2, null), 3);
        }
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZLLL(float f, float f2) {
        LJIIJJI(new C94723alb(f, f2));
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZJ(float f, float f2, boolean z) {
        if (z) {
            return;
        }
        LJIIJJI(new C94721alZ(f, f2));
    }
}
