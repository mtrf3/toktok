package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BqQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30026BqQ extends AbstractC32821Qo {
    public final DataChannel LJLIL;
    public final GestureDetector LJLILLLLZI;
    public long LJLJI;

    @Override // X.AbstractC32821Qo
    public final int LIZ() {
        return 3;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.LJLJI = System.currentTimeMillis();
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent == null || Math.abs(System.currentTimeMillis() - this.LJLJI) <= 1000) {
            return false;
        }
        this.LJLIL.qv0(BaseSingleTapEvent.class, motionEvent);
        return false;
    }

    public C30026BqQ(Context context, DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = new GestureDetector(context, this);
    }

    @Override // X.AbstractC32821Qo
    public final boolean LIZLLL(MotionEvent event, C32811Qn c32811Qn) {
        o.LJIIIZ(event, "event");
        return this.LJLILLLLZI.onTouchEvent(event);
    }
}
