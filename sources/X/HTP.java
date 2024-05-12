package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HTP implements Handler.Callback {
    public static final HTP LJLJL = new HTP();
    public final Handler LJLIL;
    public TextView LJLILLLLZI;
    public ViewGroup LJLJI;
    public volatile long LJLJJI;
    public int LJLJJL;
    public volatile boolean LJLJJLL;

    public static final void LIZIZ() {
        C6BK c6bk = new C6BK();
        c6bk.LIZJ(0L, "dalvikPss");
        c6bk.LIZJ(0L, "nativePss");
        c6bk.LIZJ(0L, "otherPss");
        c6bk.LIZJ(0L, "totalPss");
        C43882HKc.LIZIZ("av_video_memory", c6bk.LJ());
    }

    public final void LIZ() {
        if (this.LJLILLLLZI != null && this.LJLJI != null && this.LJLJJLL) {
            C16880lQ.LJLLL(this.LJLILLLLZI, this.LJLJI);
            this.LJLILLLLZI = null;
        }
        this.LJLJI = null;
    }

    public HTP() {
        new Handler(C16880lQ.LLJJJJ());
        this.LJLJJI = 2500L;
        this.LJLJJL = 0;
        this.LJLJJLL = false;
        C5L7.LIZIZ();
        this.LJLJJI = 2500L;
        this.LJLJJLL = false;
        Looper looper = IH6.LIZ.getLooper();
        o.LJIIIIZZ(looper, "thread.looper");
        this.LJLIL = new Handler(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            try {
                if (C16880lQ.LLLLIIIILLL().isInterrupted()) {
                    if (this.LJLJJL > 3) {
                        LIZIZ();
                    }
                    this.LJLJJL = 0;
                    return false;
                }
                this.LJLJJL++;
                this.LJLIL.sendEmptyMessageDelayed(0, this.LJLJJI);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                if (this.LJLJJL > 3) {
                    LIZIZ();
                }
                this.LJLJJL = 0;
            }
        }
        return false;
    }

    public final void LIZJ(Activity activity, ViewGroup viewGroup) {
        if (activity == null || activity.isFinishing() || viewGroup == null || !this.LJLJJLL) {
            return;
        }
        this.LJLJI = viewGroup;
        this.LJLILLLLZI = new TextView(C16880lQ.LLLLJ(activity));
        this.LJLILLLLZI.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.LJLILLLLZI.setTextSize(15.0f);
        TextView textView = this.LJLILLLLZI;
        textView.setTextColor(textView.getResources().getColor(R.color.b5));
        viewGroup.addView(this.LJLILLLLZI);
    }
}
