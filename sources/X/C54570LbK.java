package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.vm.NearbySkylightViewModel;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.LbK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54570LbK extends FrameLayout {
    public NearbySkylightViewModel LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    public final InterfaceC65784Pro<C76800UCe> getCallBack() {
        return this.LJLILLLLZI;
    }

    public final NearbySkylightViewModel getSkylightViewModel() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(ev, "ev");
        NearbySkylightViewModel nearbySkylightViewModel = this.LJLIL;
        int i = 0;
        if (nearbySkylightViewModel != null && nearbySkylightViewModel.LJLIL && ev.getAction() == 0) {
            float y = ev.getY();
            NearbySkylightViewModel nearbySkylightViewModel2 = this.LJLIL;
            if (nearbySkylightViewModel2 != null) {
                i = nearbySkylightViewModel2.LJLILLLLZI;
            }
            if (y > i && (interfaceC65784Pro = this.LJLILLLLZI) != null) {
                interfaceC65784Pro.invoke();
            }
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void setCallBack(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    public final void setSkylightViewModel(NearbySkylightViewModel nearbySkylightViewModel) {
        this.LJLIL = nearbySkylightViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54570LbK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
