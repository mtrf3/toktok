package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes14.dex */
public final class V6V extends FrameLayout {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public float LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public boolean LJLJJL;

    public final boolean getCanScrollVertically$mention_video_release() {
        return this.LJLJJL;
    }

    public final InterfaceC65784Pro<C76800UCe> getLoadMoreListener$mention_video_release() {
        return this.LJLJJI;
    }

    public final boolean getWaitingToLoadMore$mention_video_release() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6V(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJJL = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LJLJI = motionEvent.getY();
            this.LJLILLLLZI = true;
        }
        if (this.LJLIL && this.LJLILLLLZI && !this.LJLJJL && this.LJLJI - motionEvent.getY() > 0) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            this.LJLIL = false;
            this.LJLILLLLZI = false;
        }
        return false;
    }

    public final void setCanScrollVertically$mention_video_release(boolean z) {
        this.LJLJJL = z;
    }

    public final void setLoadMoreListener$mention_video_release(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJI = interfaceC65784Pro;
    }

    public final void setWaitingToLoadMore$mention_video_release(boolean z) {
        this.LJLIL = z;
    }
}
