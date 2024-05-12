package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.loading.IItemLoadingProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.adF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94205adF extends RecyclerView.ViewHolder {
    public InterfaceC93409aQP LJLIL;
    public C94043aad LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final ViewGroup LJLJJI;

    public final void M() {
        InterfaceC93409aQP interfaceC93409aQP = this.LJLIL;
        if (interfaceC93409aQP == null) {
            interfaceC93409aQP = ((IItemLoadingProvider) C93892aYC.LIZ(IItemLoadingProvider.class)).provideItemLoadingView();
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            interfaceC93409aQP.LIZ(C16880lQ.LLZIL(itemView.getContext()), this.LJLJJI);
        }
        this.LJLIL = interfaceC93409aQP;
        interfaceC93409aQP.LIZIZ();
    }

    public final void N() {
        InterfaceC93409aQP interfaceC93409aQP = this.LJLIL;
        if (interfaceC93409aQP != null) {
            interfaceC93409aQP.stopLoading();
        }
    }

    public final void L(boolean z) {
        FrameLayout frameLayout;
        int i = 0;
        if (z) {
            C94043aad c94043aad = this.LJLILLLLZI;
            if (c94043aad == null) {
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                LayoutInflater LLZIL = C16880lQ.LLZIL(itemView.getContext());
                ViewGroup viewGroup = this.LJLJJI;
                View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.dvh, viewGroup, false);
                viewGroup.addView(LLLLIILL);
                if (LLLLIILL != null) {
                    c94043aad = new C94043aad((FrameLayout) LLLLIILL);
                } else {
                    throw new NullPointerException("rootView");
                }
            }
            this.LJLILLLLZI = c94043aad;
        }
        C94043aad c94043aad2 = this.LJLILLLLZI;
        if (c94043aad2 != null && (frameLayout = c94043aad2.LJLIL) != null) {
            if (!z) {
                i = 8;
            }
            frameLayout.setVisibility(i);
        }
    }

    public C94205adF(FrameLayout frameLayout, ViewGroup viewGroup) {
        super(frameLayout);
        this.LJLJI = frameLayout;
        this.LJLJJI = viewGroup;
    }
}
