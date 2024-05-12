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

/* renamed from: X.Aaj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C26505Aaj extends AbstractC165586eg<AddressListViewModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26505Aaj(LifecycleOwner owner) {
        super(owner);
        o.LJIIIZ(owner, "owner");
    }

    public void LIZLLL(ActivityC45651qj activityC45651qj, AddressListViewModel vm) {
        o.LJIIIZ(vm, "vm");
        if (activityC45651qj == null) {
            return;
        }
        C73156SnQ.LJIIIIZZ(this, vm, new TBT() { // from class: X.AcU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((AddressListState) obj).getStatus());
            }
        }, new AqS167S0200000_4(activityC45651qj, vm, 39));
    }

    @Override // X.AbstractC165586eg, X.InterfaceC26883Agp
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public void LIZ(AddressListViewModel vm, View view) {
        o.LJIIIZ(vm, "vm");
        o.LJIIIZ(view, "view");
        ((RecyclerView) view.findViewById(R.id.isf)).LJII(new C71312Rym(KL2.LIZJ(view.getContext(), 16.0f), C1EU.LIZ(view, "view.context", R.attr.dz), 2, 0), -1);
    }

    @Override // X.AbstractC165586eg
    public /* bridge */ /* synthetic */ void LIZJ(Fragment fragment, ActivityC45651qj activityC45651qj, JediViewModel jediViewModel, List list) {
        LIZLLL(activityC45651qj, (AddressListViewModel) jediViewModel);
    }
}
