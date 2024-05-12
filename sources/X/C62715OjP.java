package X;

import Y.ARunnableS29S0200000_10;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import java.util.LinkedHashMap;

/* renamed from: X.OjP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62715OjP extends FrameLayout {
    public final /* synthetic */ C62811Okx LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C62811Okx c62811Okx = this.LJLIL;
        ViewGroup viewGroup = this.LJLILLLLZI;
        ARunnableS29S0200000_10 aRunnableS29S0200000_10 = c62811Okx.LIZLLL;
        if (aRunnableS29S0200000_10 != null) {
            viewGroup.removeCallbacks(aRunnableS29S0200000_10);
        }
        C16880lQ.LJLLL(this, viewGroup);
        ScreenShotService.LJIIIZ().LIZIZ(false);
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62715OjP(ActivityC45651qj activityC45651qj, C62811Okx c62811Okx, ViewGroup viewGroup) {
        super(activityC45651qj);
        this.LJLIL = c62811Okx;
        this.LJLILLLLZI = viewGroup;
        new LinkedHashMap();
    }
}
