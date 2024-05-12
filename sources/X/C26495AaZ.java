package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AaZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C26495AaZ extends AbstractC165586eg<AddressEditViewModel> {
    public void LJFF(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26495AaZ(LifecycleOwner owner) {
        super(owner);
        o.LJIIIZ(owner, "owner");
    }

    public void LJI(Fragment fragment, ActivityC45651qj activity, AddressEditViewModel vm) {
        View view;
        View findViewById;
        View findViewById2;
        View findViewById3;
        View view2;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(vm, "vm");
        C61713OJx LIZIZ = C61712OJw.LIZIZ(fragment);
        LIZIZ.LJII(R.attr.c9);
        LIZIZ.LIZJ();
        Integer LJ = C79045V0n.LJ(R.attr.c9, activity);
        View view3 = null;
        if (LJ != null) {
            int intValue = LJ.intValue();
            View view4 = fragment.getView();
            if (view4 != null) {
                view4.setBackgroundColor(intValue);
            }
            View view5 = fragment.getView();
            if (view5 != null) {
                view2 = view5.findViewById(R.id.l9j);
            } else {
                view2 = null;
            }
            C252709vu c252709vu = (C252709vu) view2;
            if (c252709vu != null) {
                c252709vu.setNavBackground(intValue);
            }
        }
        View view6 = fragment.getView();
        if (view6 != null) {
            view = view6.findViewById(R.id.isf);
        } else {
            view = null;
        }
        if (view != null) {
            C26338AVi.LJIIIZ(view, AnonymousClass391.LIZJ(8), 0, AnonymousClass391.LIZJ(8), 0, 16);
        }
        Integer LJ2 = C79045V0n.LJ(R.attr.cr, activity);
        if (LJ2 != null) {
            int intValue2 = LJ2.intValue();
            View view7 = fragment.getView();
            if (view7 != null && (findViewById3 = view7.findViewById(R.id.aoh)) != null) {
                findViewById3.setBackgroundColor(intValue2);
            }
        }
        View view8 = fragment.getView();
        if (view8 != null && (findViewById2 = view8.findViewById(R.id.aoh)) != null) {
            C26338AVi.LJI(findViewById2, 0, AnonymousClass391.LIZJ(18), 0, 0, false, 16);
        }
        View view9 = fragment.getView();
        if (view9 != null && (findViewById = view9.findViewById(R.id.jai)) != null) {
            findViewById.setVisibility(8);
        }
        View view10 = fragment.getView();
        if (view10 != null) {
            view3 = view10.findViewById(R.id.l9j);
        }
        C252709vu c252709vu2 = (C252709vu) view3;
        if (c252709vu2 != null) {
            c252709vu2.LJIILJJIL(false);
        }
    }

    public void LJII(C235119Kp c235119Kp, AddressEditViewModel vm, ActivityC45651qj activity) {
        o.LJIIIZ(vm, "vm");
        o.LJIIIZ(activity, "activity");
        if (vm.LJLJLLL != null) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_trash_bin;
            LIZJ.LIZIZ(new AqS151S0200000_4(activity, vm, 49));
            c235119Kp.LIZIZ(LIZJ);
        }
    }

    @Override // X.AbstractC165586eg
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public void LIZJ(Fragment fragment, ActivityC45651qj activityC45651qj, AddressEditViewModel vm, List<C26501Aaf> list) {
        String string;
        o.LJIIIZ(vm, "vm");
        if (fragment == null || activityC45651qj == null) {
            return;
        }
        LJI(fragment, activityC45651qj, vm);
        C235119Kp c235119Kp = new C235119Kp();
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = vm.LJZ;
        if (addressEditEnterParams != null && addressEditEnterParams.address != null) {
            string = activityC45651qj.getString(R.string.f6c);
        } else {
            string = activityC45651qj.getString(R.string.f6j);
        }
        o.LJIIIIZZ(string, "if (vm.enterParams?.addr…om_address_list_page_add)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(list, (List<C26501Aaf>) 1204));
        LJII(c235119Kp, vm, activityC45651qj);
        C252709vu c252709vu = (C252709vu) activityC45651qj.findViewById(R.id.l9j);
        if (c252709vu != null) {
            c252709vu.setNavActions(c235119Kp);
        }
        LJFF(fragment);
    }
}
