package X;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.SearchUserHorizontalLoadMoreData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.JaM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC49414JaM implements Runnable {
    public final /* synthetic */ ObjectAnimator LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C68322mC<Rect> LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<List<? extends Aweme>, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ C68322mC<SearchUserHorizontalLoadMoreData> LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ View LJLJLJ;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC49414JaM(ObjectAnimator objectAnimator, View view, C68322mC<Rect> c68322mC, View view2, InterfaceC88471Ynr<? super List<? extends Aweme>, ? super Integer, C76800UCe> interfaceC88471Ynr, C68322mC<SearchUserHorizontalLoadMoreData> c68322mC2, int i, View view3) {
        this.LJLIL = objectAnimator;
        this.LJLILLLLZI = view;
        this.LJLJI = c68322mC;
        this.LJLJJI = view2;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = c68322mC2;
        this.LJLJL = i;
        this.LJLJLJ = view3;
    }

    public final void LIZ() {
        this.LJLIL.cancel();
        this.LJLILLLLZI.getLocalVisibleRect(this.LJLJI.element);
        if (this.LJLJI.element.left < 0) {
            View view = this.LJLJJI;
            view.scrollBy(-view.getScrollX(), 0);
        }
        this.LJLILLLLZI.setVisibility(8);
        this.LJLJJL.invoke(this.LJLJJLL.element.awemeList, Integer.valueOf(this.LJLJL));
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        C49421JaT.LIZJ = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
