package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.AaY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26494AaY extends C26495AaZ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26494AaY(LifecycleOwner owner) {
        super(owner);
        o.LJIIIZ(owner, "owner");
    }

    @Override // X.C26495AaZ
    public final void LJFF(Fragment fragment) {
        View view;
        o.LJIIIZ(fragment, "fragment");
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.bs8);
        } else {
            view = null;
        }
        View findViewById = view.findViewById(R.id.jah);
        View findViewById2 = view.findViewById(R.id.hvv);
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        int indexOfChild = ((ViewGroup) view.findViewById(R.id.aoh)).indexOfChild(view.findViewById(R.id.aoh).findViewById(R.id.jah));
        int indexOfChild2 = ((ViewGroup) view.findViewById(R.id.aoh)).indexOfChild(view.findViewById(R.id.aoh).findViewById(R.id.hvv));
        if (indexOfChild < 0 || indexOfChild2 < 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.aoh);
        View findViewById3 = view.findViewById(R.id.aoh).findViewById(R.id.jah);
        if (C78996UzQ.LJJIIJZLJL(findViewById3)) {
            C78996UzQ.LJI();
        }
        viewGroup.removeView(findViewById3);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.aoh);
        View findViewById4 = view.findViewById(R.id.aoh).findViewById(R.id.hvv);
        if (C78996UzQ.LJJIIJZLJL(findViewById4)) {
            C78996UzQ.LJI();
        }
        viewGroup2.removeView(findViewById4);
        ((ViewGroup) view.findViewById(R.id.aoh)).addView(findViewById, indexOfChild2);
        ((ViewGroup) view.findViewById(R.id.aoh)).addView(findViewById2, indexOfChild);
        C26338AVi.LJI(findViewById2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), AnonymousClass391.LIZJ(0), AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(12), false, 16);
        if (findViewById instanceof SY4) {
        }
    }

    @Override // X.C26495AaZ, X.AbstractC165586eg
    public final /* bridge */ /* synthetic */ void LIZJ(Fragment fragment, ActivityC45651qj activityC45651qj, JediViewModel jediViewModel, List list) {
        LIZJ(fragment, activityC45651qj, (AddressEditViewModel) jediViewModel, list);
    }

    @Override // X.C26495AaZ
    /* renamed from: LIZLLL */
    public final void LIZJ(Fragment fragment, ActivityC45651qj activityC45651qj, AddressEditViewModel vm, List<C26501Aaf> list) {
        String title;
        View findViewById;
        C252709vu c252709vu;
        Integer LJI;
        o.LJIIIZ(vm, "vm");
        if (fragment == null || activityC45651qj == null) {
            return;
        }
        if (vm.LJLJLLL != null) {
            if (vm.LLILLJJLI == null) {
                title = C86V.LJFF(R.string.f6c);
            } else {
                title = C86V.LJFF(R.string.f66);
            }
        } else {
            title = C86V.LJFF(R.string.f5y);
        }
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        o.LJIIIIZZ(title, "title");
        c9kf.LIZJ = title;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(list, (List<C26501Aaf>) 1249));
        int i = 0;
        c235119Kp.LIZIZ(LIZJ);
        Context context = fragment.getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cr, context)) != null) {
            i = LJI.intValue();
        }
        c235119Kp.LIZJ(i);
        c235119Kp.LIZLLL = true;
        View view = fragment.getView();
        if (view == null || (findViewById = view.findViewById(R.id.bs8)) == null) {
            return;
        }
        View findViewById2 = findViewById.findViewById(R.id.l9j);
        if ((findViewById2 instanceof C252709vu) && (c252709vu = (C252709vu) findViewById2) != null) {
            c252709vu.setNavActions(c235119Kp);
        }
        LJFF(fragment);
        C73156SnQ.LJIIIIZZ(this, vm, new TBT() { // from class: X.Aae
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((AddressEditState) obj).isAllKeyItemFilled());
            }
        }, new AqS183S0100000_1(fragment, 105));
    }
}
