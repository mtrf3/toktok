package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aal, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26507Aal extends C26505Aaj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26507Aal(LifecycleOwner owner) {
        super(owner);
        o.LJIIIZ(owner, "owner");
    }

    @Override // X.C26505Aaj, X.AbstractC165586eg, X.InterfaceC26883Agp
    public final /* bridge */ /* synthetic */ void LIZ(JediViewModel jediViewModel, View view) {
        LIZ((AddressListViewModel) jediViewModel, view);
    }

    @Override // X.C26505Aaj
    public final void LIZLLL(ActivityC45651qj activityC45651qj, AddressListViewModel vm) {
        o.LJIIIZ(vm, "vm");
        if (activityC45651qj == null) {
            return;
        }
        C73156SnQ.LJIIIIZZ(this, vm, new TBT() { // from class: X.AcS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((AddressListState) obj).getStatus());
            }
        }, new AqS167S0200000_4(activityC45651qj, vm, 26));
    }

    @Override // X.C26505Aaj
    /* renamed from: LJFF */
    public final void LIZ(AddressListViewModel vm, View view) {
        o.LJIIIZ(vm, "vm");
        o.LJIIIZ(view, "view");
        ((RecyclerView) view.findViewById(R.id.isf)).LJII(new C71312Rym(C32151Nz.LJIIZILJ(0), C1EU.LIZ(view, "view.context", R.attr.c9), C7MY.LIZIZ(8)), -1);
        View findViewById = view.findViewById(R.id.isf);
        o.LJIIIIZZ(findViewById, "view.recyclerView");
        C26338AVi.LJI(findViewById, 0, 0, 0, null, false, 24);
    }

    @Override // X.C26505Aaj, X.AbstractC165586eg
    public final /* bridge */ /* synthetic */ void LIZJ(Fragment fragment, ActivityC45651qj activityC45651qj, JediViewModel jediViewModel, List list) {
        LIZLLL(activityC45651qj, (AddressListViewModel) jediViewModel);
    }
}
