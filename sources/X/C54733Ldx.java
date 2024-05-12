package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.api.feed.FollowRecommendItem;

/* renamed from: X.Ldx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54733Ldx extends AbstractViewOnClickListenerC54731Ldv {
    public final InterfaceC54736Le0 LJLLL;
    public final C51588KMm LJLLLL;
    public final TuxIconView LJLLLLLL;
    public FollowRecommendItem LJLZ;
    public final TuxTextView LJZ;

    @Override // X.AbstractViewOnClickListenerC54731Ldv
    public final void M() {
        FollowRecommendItem followRecommendItem = this.LJLZ;
        if (followRecommendItem != null) {
            InterfaceC54736Le0 interfaceC54736Le0 = this.LJLLL;
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            interfaceC54736Le0.LIZ(itemView, followRecommendItem);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54733Ldx(View view, InterfaceC54736Le0 callBack) {
        super(view);
        o.LJIIIZ(callBack, "callBack");
        this.LJLLL = callBack;
        View findViewById = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_cover)");
        this.LJLLLL = (C51588KMm) findViewById;
        View findViewById2 = view.findViewById(R.id.ivg);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.remove)");
        this.LJLLLLLL = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.iqn);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.recommend_reason)");
        this.LJZ = (TuxTextView) findViewById3;
    }
}
