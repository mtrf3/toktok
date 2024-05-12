package X;

import android.view.View;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSW extends C56906MVa {
    public final InterfaceC56830MSc LJLIL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        ((C73305Spp) view).setVisibility(0);
        View view2 = this.itemView;
        o.LJII(view2, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        ((C73305Spp) view2).LJFF();
        this.LJLIL.LJIIJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSW(View view, CreatorNoticeResultVM loadMoreListener) {
        super(view);
        o.LJIIIZ(loadMoreListener, "loadMoreListener");
        this.LJLIL = loadMoreListener;
    }
}
