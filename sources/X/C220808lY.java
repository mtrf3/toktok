package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8lY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220808lY extends FrameLayout {
    public String LJLIL;
    public String LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;

    private final TuxTextView getSwipeTextSubtitle() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-swipeTextSubtitle>(...)");
        return (TuxTextView) value;
    }

    private final TuxTextView getSwipeTextTitle() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-swipeTextTitle>(...)");
        return (TuxTextView) value;
    }

    private final int getTouchSlop() {
        return ((Number) this.LJLJJLL.getValue()).intValue();
    }

    public final C77869UhF getSwipeLottieAnim() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-swipeLottieAnim>(...)");
        return (C77869UhF) value;
    }

    public final String getCurStoryCollectionAuthor() {
        return this.LJLIL;
    }

    public final String getGroupId() {
        return this.LJLILLLLZI;
    }

    public final void LIZ(boolean z) {
        animate().alpha(0.0f).setDuration(250L).withEndAction(new ARunnableS39S0100000_3(this, 228)).start();
        if (!this.LJLL && z) {
            LIZIZ("auto", false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                requestDisallowInterceptTouchEvent(true);
            }
        } else {
            this.LJLJL = motionEvent.getX();
            this.LJLJLJ = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && ((Math.abs(motionEvent.getY() - this.LJLJLJ) >= getTouchSlop() || Math.abs(motionEvent.getX() - this.LJLJL) >= getTouchSlop()) && !this.LJLJLLL)) {
                    this.LJLJLLL = true;
                    LIZIZ("slide", false);
                }
            } else if (!this.LJLJLLL) {
                LIZIZ("click", false);
            }
        } else {
            LIZ(false);
            this.LJLL = true;
        }
        return true;
    }

    public final void setCurStoryCollectionAuthor(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setGroupId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void LIZIZ(String str, boolean z) {
        if (z) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("action_type", "show");
            c188727au.LJIIIZ("group_id", this.LJLILLLLZI);
            FMX.LJIIL("story_collection_swipe_notification", c188727au.LIZ);
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("action_type", "exit");
        c188727au2.LJIIIZ("exit_method", str);
        c188727au2.LJIIIZ("group_id", this.LJLILLLLZI);
        FMX.LJIIL("story_collection_swipe_notification", c188727au2.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C220808lY(Context context, String str, String str2) {
        super(context, null, 0);
        float f;
        String string;
        new LinkedHashMap();
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1762));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1764));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1763));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(context, 1765));
        C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_collection_swipe_guide_layout", context, R.layout.co1, null, this, true, 8);
        setBackgroundResource(R.color.b6);
        C77869UhF swipeLottieAnim = getSwipeLottieAnim();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        if (C26338AVi.LIZJ(context2)) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        swipeLottieAnim.setScaleX(f);
        TuxTextView swipeTextTitle = getSwipeTextTitle();
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        if (C26338AVi.LIZJ(context3)) {
            string = getContext().getString(R.string.rse);
        } else {
            string = getContext().getString(R.string.rsf);
        }
        swipeTextTitle.setText(string);
        getSwipeTextSubtitle().setText(getContext().getString(R.string.rsd, this.LJLIL));
    }
}
