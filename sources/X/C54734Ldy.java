package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54734Ldy extends AbstractViewOnClickListenerC54731Ldv {
    public final InterfaceC54736Le0 LJLLL;
    public final W5G LJLLLL;
    public final W5G LJLLLLLL;

    @Override // X.AbstractViewOnClickListenerC54731Ldv
    public final void M() {
        FollowingInterestUser followingInterestUser = this.LJLJJL;
        if (followingInterestUser != null) {
            InterfaceC54736Le0 interfaceC54736Le0 = this.LJLLL;
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            interfaceC54736Le0.LIZ(itemView, followingInterestUser);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54734Ldy(View view, InterfaceC54736Le0 callBack) {
        super(view);
        o.LJIIIZ(callBack, "callBack");
        this.LJLLL = callBack;
        View findViewById = view.findViewById(R.id.f1_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_cover_top)");
        this.LJLLLL = (W5G) findViewById;
        View findViewById2 = view.findViewById(R.id.f17);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover_bottom)");
        this.LJLLLLLL = (W5G) findViewById2;
    }
}
