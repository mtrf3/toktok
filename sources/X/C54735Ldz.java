package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54735Ldz extends AbstractViewOnClickListenerC54731Ldv {
    public final InterfaceC54736Le0 LJLLL;
    public final C51588KMm LJLLLL;

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
    public C54735Ldz(View view, InterfaceC54736Le0 callBack) {
        super(view);
        o.LJIIIZ(callBack, "callBack");
        this.LJLLL = callBack;
        View findViewById = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_cover)");
        this.LJLLLL = (C51588KMm) findViewById;
    }
}
