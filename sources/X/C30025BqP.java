package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BqP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30025BqP extends AbstractC32821Qo {
    public final DataChannel LJLIL;
    public final int LJLILLLLZI;
    public final BaseFragment LJLJI;
    public final View LJLJJI;
    public final C29935Box LJLJJL;
    public long LJLJJLL;
    public final GestureDetector LJLJL;

    @Override // X.AbstractC32821Qo
    public final int LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.LJLJJLL = System.currentTimeMillis();
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        InputMethodManager inputMethodManager;
        if (C29306Beo.LJJIFFI(Boolean.valueOf(this.LJLJI.isViewValid()))) {
            try {
                ActivityC45651qj mo49getActivity = this.LJLJI.mo49getActivity();
                Object obj = null;
                if (mo49getActivity != null) {
                    obj = C16880lQ.LLILLJJLI(mo49getActivity, "input_method");
                }
                if ((obj instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) obj) != null) {
                    inputMethodManager.hideSoftInputFromWindow(this.LJLJJI.getWindowToken(), 0);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C29935Box c29935Box;
        super.onLongPress(motionEvent);
        if (C29306Beo.LJJII(this.LJLIL)) {
            BPM bpm = new BPM();
            bpm.LIZJ = R.string.mdd;
            bpm.LIZIZ = "pm_liveTryMode_tryModePage_shareToast";
            bpm.LIZLLL = true;
            bpm.LJFF = this.LJLIL;
            C30868C9o.LJII(bpm);
            return;
        }
        if (this.LJLIL.kv0(RoomChannel.class) == null) {
            return;
        }
        C73943T0h.LIZ().LIZIZ(new C28268B7o());
        if ((this.LJLIL.kv0(LiveExtendedScreenStatus.class) != null && this.LJLIL.kv0(LiveExtendedScreenStatus.class) != EnumC31158CKs.HIDE) || (c29935Box = this.LJLJJL) == null) {
            return;
        }
        c29935Box.LIZIZ();
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent == null || Math.abs(System.currentTimeMillis() - this.LJLJJLL) <= 1000) {
            return false;
        }
        this.LJLIL.qv0(BaseSingleTapEvent.class, motionEvent);
        return false;
    }

    @Override // X.AbstractC32821Qo
    public final boolean LIZLLL(MotionEvent event, C32811Qn c32811Qn) {
        o.LJIIIZ(event, "event");
        if (this.LJLIL.kv0(LiveCenterStatusChannel.class) != EnumC30738C4o.DISMISS || this.LJLIL.kv0(LiveExtendedScreenStatus.class) != EnumC31158CKs.HIDE) {
            return false;
        }
        return this.LJLJL.onTouchEvent(event);
    }

    public C30025BqP(Context context, DataChannel dataChannel, BaseFragment fragment, LayeredConstraintLayout layeredConstraintLayout) {
        C29935Box c29935Box;
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = 3;
        this.LJLJI = fragment;
        this.LJLJJI = layeredConstraintLayout;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            c29935Box = new C29935Box(room, fragment, layeredConstraintLayout, context, dataChannel);
            c29935Box.LIZ();
        } else {
            c29935Box = null;
        }
        this.LJLJJL = c29935Box;
        this.LJLJL = new GestureDetector(context, this);
    }
}
