package X;

import android.view.MotionEvent;
import com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor;
import com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.ElementId;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureAndTransform;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.ugc.effectcreator.canvas.CanvasFragment;
import com.ugc.effectcreator.canvas.CanvasImpl;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ahK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94458ahK extends AbstractC94143acF {
    public final /* synthetic */ CanvasFragment LIZ;

    public final C94211adL LIZLLL() {
        C93603aTX c93603aTX;
        InterfaceC93980aZc interfaceC93980aZc;
        C94363afn LJFF;
        List<C94212adM> list;
        C94212adM c94212adM;
        CanvasFragment canvasFragment = this.LIZ;
        C94338afO c94338afO = canvasFragment.LJLILLLLZI;
        if (c94338afO == null || (c93603aTX = c94338afO.LJLJJI) == null || (interfaceC93980aZc = canvasFragment.LJLJJI) == null || (LJFF = interfaceC93980aZc.LJFF()) == null || (list = LJFF.LJLIL) == null || (c94212adM = (C94212adM) ORZ.LJLLLL(list)) == null) {
            return null;
        }
        return C94002aZy.LIZJ(c94212adM, c93603aTX);
    }

    public C94458ahK(CanvasFragment canvasFragment) {
        this.LIZ = canvasFragment;
    }

    public final FeatureAndTransform LIZJ(MotionEvent motionEvent) {
        C93603aTX c93603aTX;
        C94338afO c94338afO = this.LIZ.LJLILLLLZI;
        if (c94338afO != null && (c93603aTX = c94338afO.LJLJJI) != null && motionEvent != null) {
            float x = motionEvent.getX() / c93603aTX.getWidth();
            float y = motionEvent.getY() / c93603aTX.getHeight();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("relative coordinate ");
            LIZ.append(x);
            LIZ.append(' ');
            LIZ.append(y);
            LIZ.append(' ');
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null) {
                double d = x;
                double d2 = y;
                Canvas canvasPtr = LJI.LIZJ.getCanvasPtr();
                if (canvasPtr != null) {
                    EEPoint eEPoint = new EEPoint();
                    eEPoint.setX(d);
                    eEPoint.setY(d2);
                    return canvasPtr.getFeatureAndTransformPtrViaPoint(eEPoint);
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC94143acF, X.InterfaceC93699aV5
    public final void LJJIIZI(MotionEvent event) {
        C93601aTV c93601aTV;
        o.LJIIIZ(event, "event");
        this.LIZ.getClass();
        Canvas vl = CanvasFragment.vl();
        if (vl != null) {
            vl.stopAnimation();
        }
        CanvasFragment canvasFragment = this.LIZ;
        canvasFragment.LJLJI.LIZ(EnumC93715aVL.NONE);
        C94338afO c94338afO = canvasFragment.LJLILLLLZI;
        if (c94338afO != null && (c93601aTV = c94338afO.LJLILLLLZI) != null) {
            c93601aTV.postInvalidate();
        }
        this.LIZ.Il();
        InterfaceC93980aZc interfaceC93980aZc = this.LIZ.LJLJJI;
        if (interfaceC93980aZc != null) {
            interfaceC93980aZc.LJI();
        }
    }

    @Override // X.InterfaceC93699aV5
    public final void LJJIZ(float f) {
        InterfaceC93980aZc interfaceC93980aZc;
        C94211adL LIZLLL = LIZLLL();
        if (LIZLLL != null && !this.LIZ.Gl(LIZLLL, C94211adL.L(LIZLLL, 0.0f, 0.0f, 0.0f, 0.0f, LIZLLL.LJLJJL + f, 15)) && (interfaceC93980aZc = this.LIZ.LJLJJI) != null) {
            interfaceC93980aZc.LIZIZ(f);
        }
    }

    @Override // X.InterfaceC93699aV5
    public final boolean LJJJ(MotionEvent motionEvent) {
        Feature featrure;
        FeatureAndTransform LIZJ = LIZJ(motionEvent);
        if (LIZJ != null && (featrure = LIZJ.getFeatrure()) != null && C93825aX7.LJ(featrure) == EnumC93823aX5.Text && CKEffectEditorContext.LIZ(featrure)) {
            this.LIZ.getClass();
            if (CanvasFragment.Al()) {
                this.LIZ.onEventObjectAction("double_click_edit_text");
                ICanvas LIZ = C93698aV4.LIZ();
                if (LIZ != null) {
                    LIZ.operateFeature(C93825aX7.LIZ(featrure), EnumC93483aRb.EDIT_TEXT);
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC93699aV5
    public final void onScale(float f) {
        InterfaceC93980aZc interfaceC93980aZc;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feature scale ");
        LIZ.append(f);
        LIZ.append(", ");
        LIZ.append(f);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        C94211adL LIZLLL = LIZLLL();
        if (LIZLLL == null || this.LIZ.Hl(f, f, LIZLLL) || this.LIZ.Gl(LIZLLL, C94211adL.L(LIZLLL, LIZLLL.LJLIL * f, LIZLLL.LJLILLLLZI * f, 0.0f, 0.0f, 0.0f, 28)) || (interfaceC93980aZc = this.LIZ.LJLJJI) == null) {
            return;
        }
        interfaceC93980aZc.LIZLLL(f, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93699aV5
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Float f;
        Float f2;
        Float f3;
        FeatureAndTransform LIZJ;
        Feature featrure;
        ElementId id;
        Long valueOf;
        UIAnnotationBase transform;
        C94362afm LJ;
        CanvasImpl LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("click ");
        Float f4 = null;
        if (motionEvent != null) {
            f = Float.valueOf(motionEvent.getX());
        } else {
            f = null;
        }
        LIZ.append(f);
        LIZ.append("  ");
        if (motionEvent != null) {
            f2 = Float.valueOf(motionEvent.getY());
        } else {
            f2 = null;
        }
        LIZ.append(f2);
        LIZ.append(' ');
        if (motionEvent != null) {
            f3 = Float.valueOf(motionEvent.getRawX());
        } else {
            f3 = null;
        }
        LIZ.append(f3);
        LIZ.append("  ");
        if (motionEvent != null) {
            f4 = Float.valueOf(motionEvent.getRawY());
        }
        LIZ.append(f4);
        LIZ.append(' ');
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        if (motionEvent != null && (LIZIZ = C93991aZn.LIZIZ()) != null) {
            LIZIZ.updateGestureEvent(new C93485aRd(EnumC93486aRe.SINGLE_TAP, motionEvent));
        }
        this.LIZ.getClass();
        if (CanvasFragment.Al() && (LIZJ = LIZJ(motionEvent)) != null && (featrure = LIZJ.getFeatrure()) != null && (id = featrure.id()) != null && (valueOf = Long.valueOf(id.objectId())) != null) {
            long longValue = valueOf.longValue();
            this.LIZ.getClass();
            Long l = (Long) CKEffectEditorContext.LJIIIIZZ.getValue();
            InterfaceC93980aZc interfaceC93980aZc = this.LIZ.LJLJJI;
            if (interfaceC93980aZc != null && (LJ = interfaceC93980aZc.LJ()) != null && LJ.LJLIL && (l == null || longValue != l.longValue())) {
                return false;
            }
            if (LIZJ != null && (transform = LIZJ.getTransform()) != null) {
                IAssetEditor LIZ2 = C93979aZb.LIZ();
                if (LIZ2 != null) {
                    LIZ2.queryHandler(longValue, transform.getName());
                }
                Object value = this.LIZ.LJLJJLL.getValue();
                Long valueOf2 = Long.valueOf(longValue);
                value.getClass();
                if (!(!o.LJ(r5.getValue(), valueOf2))) {
                    return false;
                }
                CKEffectEditorContext.LJIILJJIL(valueOf2);
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC93699aV5
    public final void onSingleTapUp(MotionEvent e) {
        C94362afm LJ;
        o.LJIIIZ(e, "e");
        FeatureAndTransform LIZJ = LIZJ(e);
        if (LIZJ == null || LIZJ.getFeatrure() == null) {
            InterfaceC93980aZc interfaceC93980aZc = this.LIZ.LJLJJI;
            if (interfaceC93980aZc == null || (LJ = interfaceC93980aZc.LJ()) == null || !LJ.LJLIL) {
                this.LIZ.getClass();
                CKEffectEditorContext.LJIILJJIL(null);
            }
            this.LIZ.getClass();
            Canvas vl = CanvasFragment.vl();
            if (vl != null) {
                vl.stopAnimation();
            }
        }
    }

    @Override // X.InterfaceC93699aV5
    public final void LIZ(float f, float f2) {
        CanvasFragment canvasFragment;
        C94338afO c94338afO;
        C93603aTX c93603aTX;
        C94363afn LJFF;
        C94211adL LIZLLL = LIZLLL();
        if (LIZLLL != null && !this.LIZ.Gl(LIZLLL, C94211adL.L(LIZLLL, 0.0f, 0.0f, LIZLLL.LJLJI + f, LIZLLL.LJLJJI + f2, 0.0f, 19)) && (c94338afO = (canvasFragment = this.LIZ).LJLILLLLZI) != null && (c93603aTX = c94338afO.LJLJJI) != null) {
            InterfaceC93980aZc interfaceC93980aZc = canvasFragment.LJLJJI;
            if (interfaceC93980aZc != null) {
                int width = c93603aTX.getWidth();
                int i = 1;
                if (width < 1) {
                    width = 1;
                }
                float f3 = f / width;
                int height = c93603aTX.getHeight();
                if (height >= 1) {
                    i = height;
                }
                interfaceC93980aZc.LIZJ(f3, f2 / i, false);
            }
            InterfaceC93980aZc interfaceC93980aZc2 = this.LIZ.LJLJJI;
            if (interfaceC93980aZc2 != null && (LJFF = interfaceC93980aZc2.LJFF()) != null) {
                this.LIZ.getClass();
                Canvas vl = CanvasFragment.vl();
                if (vl != null) {
                    vl.stopAnimation();
                }
                C94212adM c94212adM = (C94212adM) ORZ.LJLLLL(LJFF.LJLIL);
                if (c94212adM != null) {
                    this.LIZ.Ll(c94212adM.LJLJI, c94212adM.LJLJJI);
                }
            }
        }
    }

    @Override // X.AbstractC94143acF
    public final void LIZIZ(float f, float f2, float f3, float f4) {
        CanvasFragment canvasFragment;
        C94338afO c94338afO;
        C93603aTX c93603aTX;
        C94363afn LJFF;
        C94211adL LIZLLL = LIZLLL();
        if (LIZLLL == null || this.LIZ.Hl(f3, f4, LIZLLL) || this.LIZ.Gl(LIZLLL, C94211adL.L(LIZLLL, LIZLLL.LJLIL * f3, LIZLLL.LJLILLLLZI * f4, LIZLLL.LJLJI + f, LIZLLL.LJLJJI + f2, 0.0f, 16)) || (c94338afO = (canvasFragment = this.LIZ).LJLILLLLZI) == null || (c93603aTX = c94338afO.LJLJJI) == null) {
            return;
        }
        InterfaceC93980aZc interfaceC93980aZc = canvasFragment.LJLJJI;
        if (interfaceC93980aZc != null) {
            int width = c93603aTX.getWidth();
            if (width < 1) {
                width = 1;
            }
            float f5 = f / width;
            int height = c93603aTX.getHeight();
            if (height < 1) {
                height = 1;
            }
            interfaceC93980aZc.LIZJ(f5, f2 / height, true);
        }
        InterfaceC93980aZc interfaceC93980aZc2 = this.LIZ.LJLJJI;
        if (interfaceC93980aZc2 != null) {
            interfaceC93980aZc2.LIZLLL(f3, f4);
        }
        InterfaceC93980aZc interfaceC93980aZc3 = this.LIZ.LJLJJI;
        if (interfaceC93980aZc3 == null || (LJFF = interfaceC93980aZc3.LJFF()) == null) {
            return;
        }
        this.LIZ.getClass();
        Canvas vl = CanvasFragment.vl();
        if (vl != null) {
            vl.stopAnimation();
        }
        C94212adM c94212adM = (C94212adM) ORZ.LJLLLL(LJFF.LJLIL);
        if (c94212adM == null) {
            return;
        }
        this.LIZ.Ll(c94212adM.LJLJI, c94212adM.LJLJJI);
    }
}
