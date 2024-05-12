package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AaX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26493AaX extends C26495AaZ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26493AaX(LifecycleOwner owner) {
        super(owner);
        o.LJIIIZ(owner, "owner");
    }

    @Override // X.C26495AaZ
    public final void LJI(Fragment fragment, ActivityC45651qj activity, AddressEditViewModel vm) {
        View view;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(vm, "vm");
        super.LJI(fragment, activity, vm);
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.isf);
        } else {
            view = null;
        }
        o.LJIIIIZZ(view, "fragment.recyclerView");
        C26338AVi.LJIIIZ(view, 0, 0, 0, 0, 16);
    }
}
