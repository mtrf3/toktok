package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Adq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC26698Adq implements View.OnClickListener {
    public final /* synthetic */ C26699Adr LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;
    public final /* synthetic */ int LJLJI;

    public ViewOnClickListenerC26698Adq(C26699Adr c26699Adr, int i) {
        this.LJLIL = c26699Adr;
        this.LJLJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C26695Adn initClickView;
        C26695Adn lastClickView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.view.ReviewFilterItemView");
        C26695Adn c26695Adn = (C26695Adn) view;
        if (!o.LJ(this.LJLIL.getLastClickView(), view) && (lastClickView = this.LJLIL.getLastClickView()) != null) {
            lastClickView.LIZIZ(this.LJLILLLLZI);
        }
        this.LJLIL.setLastClickView(c26695Adn);
        if (!o.LJ(this.LJLIL.getInitClickView(), view) && (initClickView = this.LJLIL.getInitClickView()) != null) {
            initClickView.LIZIZ(this.LJLILLLLZI);
        }
        boolean z = this.LJLILLLLZI;
        if (c26695Adn.LJLJJI) {
            c26695Adn.LIZIZ(z);
        } else {
            c26695Adn.LIZ(z);
        }
        if (c26695Adn.LJLJJI) {
            InterfaceC88471Ynr<Integer, ReviewFilterStruct, C76800UCe> listener = this.LJLIL.getListener();
            if (listener != 0) {
                Integer valueOf = Integer.valueOf(this.LJLJI);
                Object tag = c26695Adn.getTag();
                o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct");
                listener.invoke(valueOf, tag);
                return;
            }
            return;
        }
        InterfaceC88471Ynr<Integer, ReviewFilterStruct, C76800UCe> listener2 = this.LJLIL.getListener();
        if (listener2 == null) {
            return;
        }
        listener2.invoke(-1, null);
    }
}
