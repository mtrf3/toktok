package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.EESize;
import com.bytedance.ies.effectcreator.swig.EEStdUIAnnotationBaseList;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBool;
import com.bytedance.ies.effectcreator.swig.UIAnnotationPulse;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3DData;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS5S0201000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aiI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94518aiI extends AbstractC94369aft {
    public boolean LIZLLL;
    public final List<InterfaceC65784Pro<C76800UCe>> LJ;
    public UIAnnotationTransform3D LJFF;
    public UIAnnotationTransform3D LJI;
    public UIAnnotationBool LJII;
    public UIAnnotationBool LJIIIIZZ;
    public UIAnnotationPulse LJIIIZ;
    public boolean LJIIJ;
    public final C94410agY LJIIJJI;

    @Override // X.InterfaceC93980aZc
    public final C94362afm LJ() {
        return new C94362afm(this.LIZLLL, true);
    }

    @Override // X.InterfaceC93980aZc
    public final C94363afn LJFF() {
        UIAnnotationTransform3D uIAnnotationTransform3D;
        C94212adM LJ;
        C94212adM LJ2;
        ArrayList arrayList = new ArrayList();
        UIAnnotationTransform3D uIAnnotationTransform3D2 = this.LJFF;
        if (uIAnnotationTransform3D2 != null && (LJ2 = C94002aZy.LJ(uIAnnotationTransform3D2)) != null) {
            arrayList.add(LJ2);
        }
        UIAnnotationBool uIAnnotationBool = this.LJII;
        if (uIAnnotationBool != null && uIAnnotationBool.getCurrentValueSync() && (uIAnnotationTransform3D = this.LJI) != null && (LJ = C94002aZy.LJ(uIAnnotationTransform3D)) != null) {
            arrayList.add(LJ);
        }
        return new C94363afn(arrayList, EnumC93697aV3.OVAL);
    }

    @Override // X.AbstractC94369aft, X.InterfaceC93980aZc
    public final void LJI() {
        if (this.LJIIJ) {
            LJIILIIL("liquify_scale_nonproportion");
        }
        this.LJIIJ = false;
    }

    public final void LJIIJJI() {
        XKX.LIZLLL(this.LIZ, null, null, new C94980apk(this, null), 3);
    }

    public final void LJIIL() {
        UIAnnotationTransform3DData normalizationTransform3DDataPtr;
        EEPoint center;
        UIAnnotationTransform3DData normalizationTransform3DDataPtr2;
        EEPoint center2;
        UIAnnotationTransform3D uIAnnotationTransform3D = this.LJFF;
        if (uIAnnotationTransform3D != null && (normalizationTransform3DDataPtr2 = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr()) != null && (center2 = normalizationTransform3DDataPtr2.getCenter()) != null) {
            center2.getX();
        }
        UIAnnotationTransform3D uIAnnotationTransform3D2 = this.LJI;
        if (uIAnnotationTransform3D2 != null && (normalizationTransform3DDataPtr = uIAnnotationTransform3D2.getNormalizationTransform3DDataPtr()) != null && (center = normalizationTransform3DDataPtr.getCenter()) != null) {
            center.getX();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94518aiI(Feature liquefyFeature) {
        super(liquefyFeature);
        o.LJIIIZ(liquefyFeature, "liquefyFeature");
        this.LJ = new ArrayList();
        this.LJIIJJI = new C94410agY(this);
        C93745aVp.LIZIZ(new IDqS423S0100000_42(this, 158));
    }

    public static void LJIILIIL(String str) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("liquify_edit", C51029K0z.LJJIIZI(new OSZ("action_type", str)));
        }
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZ(boolean z) {
        FragmentManager fragmentManager;
        IEditorContext LIZ;
        Integer containerViewId;
        boolean z2;
        UIAnnotationBool uIAnnotationBool;
        IEditorContext LIZ2 = C93940aYy.LIZ();
        if (LIZ2 != null && (fragmentManager = LIZ2.getFragmentManager()) != null && (LIZ = C93940aYy.LIZ()) != null && (containerViewId = LIZ.getContainerViewId()) != null) {
            int intValue = containerViewId.intValue();
            if (fragmentManager.LJJJIL(C94518aiI.class.getName()) != null) {
                return;
            }
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null) {
                z2 = LJI.LJII();
            } else {
                z2 = false;
            }
            if (!z && (uIAnnotationBool = this.LJIIIIZZ) != null && uIAnnotationBool.getCurrentValue() && !z2) {
                IAutoChangeModel LIZ3 = C93722aVS.LIZ();
                if (LIZ3 != null) {
                    LIZ3.autoChangeModelWhenObjectEdit(C93825aX7.LIZ(this.LIZJ), new IDqS5S0201000_42(this, fragmentManager, intValue, 3));
                    return;
                } else {
                    LJIIIZ(fragmentManager, intValue, false);
                    return;
                }
            }
            LJIIIZ(fragmentManager, intValue, z);
        }
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZIZ(float f) {
        UIAnnotationTransform3D uIAnnotationTransform3D = this.LJFF;
        if (uIAnnotationTransform3D != null) {
            UIAnnotationTransform3DData normalizationTransform3DDataPtr = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr();
            o.LJIIIIZZ(normalizationTransform3DDataPtr, "normalizationTransform3DDataPtr");
            double rotationAngle = normalizationTransform3DDataPtr.getRotationAngle() + f;
            UIAnnotationTransform3D uIAnnotationTransform3D2 = this.LJFF;
            if (uIAnnotationTransform3D2 != null) {
                uIAnnotationTransform3D2.updateValue(rotationAngle);
            }
            LJIIJJI();
        }
    }

    public final void LJIIJ(String str) {
        String str2;
        String str3;
        UIAnnotationPulse uIAnnotationPulse;
        UIAnnotationTransform3D dynamicCast;
        LJIIL();
        ArrayList arrayList = new ArrayList();
        EEStdUIAnnotationBaseList uiAnnotations = this.LIZJ.getUiAnnotations();
        o.LJIIIIZZ(uiAnnotations, "feature.uiAnnotations");
        Iterator<UIAnnotationBase> it = uiAnnotations.iterator();
        while (it.hasNext()) {
            UIAnnotationBase it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (it2.getUIType() == UIAnnotationUIType.UIAnnotationUIType_Transform3D && (dynamicCast = UIAnnotationTransform3D.dynamicCast((Element) it2)) != null) {
                arrayList.add(dynamicCast);
            }
        }
        if (str == null) {
            UIAnnotationPulse uIAnnotationPulse2 = this.LJIIIZ;
            if (uIAnnotationPulse2 != null) {
                str = uIAnnotationPulse2.getCurrentValue();
            } else {
                str = null;
            }
        }
        UIAnnotationTransform3D uIAnnotationTransform3D = this.LJFF;
        if (uIAnnotationTransform3D != null) {
            str2 = uIAnnotationTransform3D.getName();
        } else {
            str2 = null;
        }
        if ((!o.LJ(str2, str)) && this.LJFF != null) {
            LJIILIIL("switch_mainball");
        }
        if (str == null) {
            if (arrayList.size() >= 2 && this.LJFF == null) {
                this.LJFF = (UIAnnotationTransform3D) ListProtector.get(arrayList, 0);
                this.LJI = (UIAnnotationTransform3D) ListProtector.get(arrayList, 1);
            } else {
                return;
            }
        } else {
            UIAnnotationTransform3D uIAnnotationTransform3D2 = this.LJFF;
            if (uIAnnotationTransform3D2 != null) {
                str3 = uIAnnotationTransform3D2.getName();
            } else {
                str3 = null;
            }
            if (!(!o.LJ(str, str3))) {
                return;
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                UIAnnotationTransform3D uIAnnotationTransform3D3 = (UIAnnotationTransform3D) it3.next();
                if (o.LJ(uIAnnotationTransform3D3.getName(), str)) {
                    this.LJFF = uIAnnotationTransform3D3;
                } else {
                    this.LJI = uIAnnotationTransform3D3;
                }
            }
        }
        UIAnnotationTransform3D uIAnnotationTransform3D4 = this.LJFF;
        if (uIAnnotationTransform3D4 != null && (uIAnnotationPulse = this.LJIIIZ) != null) {
            uIAnnotationPulse.updateValue(uIAnnotationTransform3D4.getName());
        }
        XKX.LIZLLL(this.LIZ, null, null, new C94979apj(null), 3);
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZLLL(float f, float f2) {
        UIAnnotationTransform3D uIAnnotationTransform3D = this.LJFF;
        if (uIAnnotationTransform3D != null) {
            EESize eESize = new EESize();
            UIAnnotationTransform3DData normalizationTransform3DDataPtr = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr();
            o.LJIIIIZZ(normalizationTransform3DDataPtr, "normalizationTransform3DDataPtr");
            EESize size = normalizationTransform3DDataPtr.getSize();
            o.LJIIIIZZ(size, "normalizationTransform3DDataPtr.size");
            eESize.setWidth(size.getWidth() * f);
            UIAnnotationTransform3DData normalizationTransform3DDataPtr2 = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr();
            o.LJIIIIZZ(normalizationTransform3DDataPtr2, "normalizationTransform3DDataPtr");
            EESize size2 = normalizationTransform3DDataPtr2.getSize();
            o.LJIIIIZZ(size2, "normalizationTransform3DDataPtr.size");
            eESize.setHeight(size2.getHeight() * f2);
            UIAnnotationTransform3D uIAnnotationTransform3D2 = this.LJFF;
            if (uIAnnotationTransform3D2 != null) {
                uIAnnotationTransform3D2.updateValue(eESize);
            }
            LJIIJJI();
            if (Math.abs(f - f2) > 1.0E-5f) {
                this.LJIIJ = true;
            }
        }
    }

    public static void LJIIIZ(FragmentManager fragmentManager, int i, boolean z) {
        fragmentManager.getClass();
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIJJI(R.anim.i0, R.anim.i5, R.anim.i1, R.anim.i4);
        LiquefyFragment liquefyFragment = new LiquefyFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("cke_liquefy_new_feature", z);
        liquefyFragment.setArguments(bundle);
        c1b3.LJIIJ(liquefyFragment, C94518aiI.class.getName(), i);
        c1b3.LJ(null);
        c1b3.LJI();
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZJ(float f, float f2, boolean z) {
        UIAnnotationTransform3D uIAnnotationTransform3D = this.LJFF;
        if (uIAnnotationTransform3D != null) {
            EEPoint eEPoint = new EEPoint();
            UIAnnotationTransform3DData normalizationTransform3DDataPtr = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr();
            o.LJIIIIZZ(normalizationTransform3DDataPtr, "normalizationTransform3DDataPtr");
            EEPoint center = normalizationTransform3DDataPtr.getCenter();
            o.LJIIIIZZ(center, "normalizationTransform3DDataPtr.center");
            eEPoint.setX(center.getX() + f);
            UIAnnotationTransform3DData normalizationTransform3DDataPtr2 = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr();
            o.LJIIIIZZ(normalizationTransform3DDataPtr2, "normalizationTransform3DDataPtr");
            EEPoint center2 = normalizationTransform3DDataPtr2.getCenter();
            o.LJIIIIZZ(center2, "normalizationTransform3DDataPtr.center");
            eEPoint.setY(center2.getY() + f2);
            UIAnnotationTransform3D uIAnnotationTransform3D2 = this.LJFF;
            if (uIAnnotationTransform3D2 != null) {
                uIAnnotationTransform3D2.updateValue(eEPoint);
            }
            LJIIJJI();
            Iterator<InterfaceC65784Pro<C76800UCe>> it = this.LJ.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
        }
    }
}
