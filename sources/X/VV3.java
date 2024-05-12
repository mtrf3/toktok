package X;

import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.LynxDragListUIView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VV3 implements C0A5 {
    public final int LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public boolean LJLJJI;
    public final /* synthetic */ LynxDragListUIView LJLJJL;

    @Override // X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
    }

    public VV3(LynxDragListUIView lynxDragListUIView) {
        this.LJLJJL = lynxDragListUIView;
        this.LJLIL = ViewConfiguration.get(lynxDragListUIView.mView.getContext()).getScaledTouchSlop();
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
        if (z) {
            this.LJLJJL.LLILL.removeMessages(0);
        }
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        float x = e.getX();
        float y = e.getY();
        if (e.getAction() == 0) {
            this.LJLILLLLZI = x;
            this.LJLJI = y;
            this.LJLJJI = false;
            View LJJIJIIJI = rv.LJJIJIIJI(x, y);
            if (LJJIJIIJI != null) {
                RecyclerView.ViewHolder LJJJJJL = rv.LJJJJJL(LJJIJIIJI);
                o.LJIIIIZZ(LJJJJJL, "rv.getChildViewHolder(viewUnder)");
                Message obtainMessage = this.LJLJJL.LLILL.obtainMessage(0);
                o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_LONG_PRESS)");
                obtainMessage.obj = LJJJJJL;
                this.LJLJJL.LLILL.sendMessageDelayed(obtainMessage, r0.LLILII);
            }
        } else if (e.getAction() == 1 || e.getAction() == 3) {
            if (this.LJLJJL.LLILL.hasMessages(0)) {
                this.LJLJJL.LLILL.removeMessages(0);
            }
        } else if (e.getAction() == 2 && !this.LJLJJI && this.LJLJJL.LLILL.hasMessages(0) && (Math.abs(x - this.LJLILLLLZI) > this.LJLIL || Math.abs(y - this.LJLJI) > this.LJLIL)) {
            this.LJLJJI = true;
            this.LJLJJL.LLILL.removeMessages(0);
        }
        return false;
    }
}
