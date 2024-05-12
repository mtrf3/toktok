package X;

import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.o;

/* renamed from: X.927, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass927 implements View.OnTouchListener {
    public final C94D LJLIL;
    public final C2301091i LJLILLLLZI;
    public final AnonymousClass928 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final GestureDetector LJLJJLL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LJLJJL = false;
            this.LJLJJI = false;
            this.LJLIL.LIZ(motionEvent, this.LJLILLLLZI);
            this.LJLJJLL.onTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 2) {
            if (this.LJLJJL) {
                this.LJLIL.LIZ(motionEvent, this.LJLILLLLZI);
            } else if (!this.LJLJJI) {
                if (this.LJLIL.LIZ(motionEvent, this.LJLILLLLZI)) {
                    this.LJLJJL = true;
                } else {
                    this.LJLJJLL.onTouchEvent(motionEvent);
                }
            }
            if ((this.LJLJJL || this.LJLJJI) && view != null && (parent = view.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.LJLJJI) {
                LandscapeVideoViewCell landscapeVideoViewCell = this.LJLJI.LJLIL;
                landscapeVideoViewCell.getClass();
                if (C92A.LIZ && landscapeVideoViewCell.LJLZ()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - landscapeVideoViewCell.LLJJJJJIL;
                    Aweme aweme = landscapeVideoViewCell.LJLLL;
                    BaseFeedPageParams baseFeedPageParams = landscapeVideoViewCell.LLJJIJIL;
                    if (baseFeedPageParams != null) {
                        C3A4.LIZ(aweme, baseFeedPageParams.eventType, "long_press", 2.0f, landscapeVideoViewCell.LLJJJJ, landscapeVideoViewCell.LLIIIJ, elapsedRealtime);
                        C2313195z c2313195z = landscapeVideoViewCell.LLJILJILJ;
                        if (c2313195z != null) {
                            c2313195z.LIZLLL();
                        }
                        IWF.LJJLIIIIJ().LJFF(landscapeVideoViewCell.LLJJJJ);
                    } else {
                        o.LJIJI("baseFeedPageParams");
                        throw null;
                    }
                }
            } else if (this.LJLJJL) {
                this.LJLIL.LIZ(motionEvent, this.LJLILLLLZI);
            }
            this.LJLJJLL.onTouchEvent(motionEvent);
        }
        return true;
    }

    public AnonymousClass927(C94D c94d, C2301091i c2301091i, AnonymousClass928 anonymousClass928) {
        this.LJLIL = c94d;
        this.LJLILLLLZI = c2301091i;
        this.LJLJI = anonymousClass928;
        this.LJLJJLL = new GestureDetector(c94d.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.929
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent e) {
                o.LJIIIZ(e, "e");
                AnonymousClass927 anonymousClass927 = AnonymousClass927.this;
                if (anonymousClass927.LJLJJI || anonymousClass927.LJLJJL) {
                    return false;
                }
                return anonymousClass927.LJLJI.onDoubleTap(e);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent e) {
                o.LJIIIZ(e, "e");
                super.onLongPress(e);
                AnonymousClass927 anonymousClass927 = AnonymousClass927.this;
                if (anonymousClass927.LJLJJL) {
                    return;
                }
                anonymousClass927.LJLJJI = true;
                anonymousClass927.LJLJI.onLongPress(e);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent e) {
                o.LJIIIZ(e, "e");
                AnonymousClass927 anonymousClass927 = AnonymousClass927.this;
                if (anonymousClass927.LJLJJI || anonymousClass927.LJLJJL) {
                    return false;
                }
                return anonymousClass927.LJLJI.onSingleTapConfirmed(e);
            }
        });
    }
}
