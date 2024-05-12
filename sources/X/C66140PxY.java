package X;

import Y.ARunnableS8S1300000_11;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.FragmentCheckModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PxY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66140PxY extends AbstractC66136PxU {
    public static Fragment LIZIZ;

    @Override // X.AbstractC66136PxU
    public final String LIZIZ() {
        return "fragment_cover";
    }

    @Override // X.AbstractC66136PxU
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC66136PxU
    public final boolean LIZJ(AnchorInfoModel model, Object obj) {
        String str;
        o.LJIIIZ(model, "model");
        Fragment fragment = LIZIZ;
        if (fragment != null) {
            List<String> list = model.resourcePages;
            o.LJI(fragment);
            if (list.contains(fragment.getClass().getName())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("---------check exempt:extra=");
                String str2 = null;
                if (obj != null) {
                    str = obj.getClass().getName();
                } else {
                    str = null;
                }
                LIZ.append(str);
                LIZ.append(" exempt=");
                LIZ.append(model.exemptFragments);
                X1D.LIZIZ(LIZ);
                List<String> list2 = model.exemptFragments;
                if (obj != null) {
                    str2 = obj.getClass().getName();
                }
                return ORZ.LJLJJI(str2, list2);
            }
        }
        return true;
    }

    public final String LJIIIIZZ(Object obj, String str) {
        if (obj != null && (obj instanceof Fragment)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key=");
            LIZ.append(str);
            LIZ.append(",extra=");
            LIZ.append(obj);
            return X1D.LIZIZ(LIZ);
        }
        return str;
    }

    @Override // X.AbstractC66136PxU
    public final void LIZ(AnchorInfoModel anchorInfoModel, Object obj, String key) {
        String str;
        String str2;
        Dialog dialog;
        Window window;
        View decorView;
        String str3;
        o.LJIIIZ(key, "key");
        String LJIIIIZZ = LJIIIIZZ(obj, key);
        List<String> list = anchorInfoModel.resourcePages;
        FragmentCheckModel fragmentCheckModel = null;
        if (obj != null) {
            str = obj.getClass().getName();
        } else {
            str = null;
        }
        if (ORZ.LJLJJI(str, list)) {
            if (obj != null) {
                LIZIZ = (Fragment) obj;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }
        LJI(LJIIIIZZ, obj, "addAnchorRunnable");
        if (LJFF(anchorInfoModel, obj, "Add")) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("---------check white:extra=");
        if (obj != null) {
            str2 = obj.getClass().getName();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" white=");
        LIZ.append(anchorInfoModel.checkFragments);
        X1D.LIZIZ(LIZ);
        Iterator<FragmentCheckModel> it = anchorInfoModel.checkFragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FragmentCheckModel next = it.next();
            List<String> list2 = next.fragments;
            if (obj != null) {
                str3 = obj.getClass().getName();
            } else {
                str3 = null;
            }
            if (ORZ.LJLJJI(str3, list2)) {
                fragmentCheckModel = next;
                break;
            }
        }
        FragmentCheckModel fragmentCheckModel2 = fragmentCheckModel;
        if (fragmentCheckModel2 != null) {
            if (fragmentCheckModel2.resource_ids.isEmpty()) {
                LJII(LJIIIIZZ, anchorInfoModel, obj, anchorInfoModel.resourceIds);
                return;
            } else {
                LJII(LJIIIIZZ, anchorInfoModel, obj, fragmentCheckModel2.resource_ids);
                return;
            }
        }
        if ((obj instanceof DialogFragment) && (dialog = ((DialogFragment) obj).getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new ARunnableS8S1300000_11(this, LJIIIIZZ, obj, anchorInfoModel, 1));
        }
    }

    @Override // X.AbstractC66136PxU
    public final List<C66120PxE> LIZLLL(List<C66120PxE> list, AnchorInfoModel model, Object obj) {
        String str;
        o.LJIIIZ(model, "model");
        if (obj != null && (obj instanceof Fragment)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C66120PxE c66120PxE = (C66120PxE) next;
                ActivityC45651qj mo49getActivity = ((Fragment) obj).mo49getActivity();
                if (mo49getActivity != null) {
                    str = mo49getActivity.getClass().getName();
                } else {
                    str = null;
                }
                if (o.LJ(str, c66120PxE.LJLLI)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.AbstractC66136PxU
    public final void LJI(String key, Object obj, String tag) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(tag, "tag");
        String LJIIIIZZ = LJIIIIZZ(obj, key);
        if (o.LJ(obj, LIZIZ)) {
            LIZIZ = null;
        }
        super.LJI(LJIIIIZZ, obj, tag);
    }
}
