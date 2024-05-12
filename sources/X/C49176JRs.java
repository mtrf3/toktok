package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.util.LinkedList;

/* renamed from: X.JRs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49176JRs {
    public final VNL LIZ;
    public final Handler LIZIZ;
    public RunnableC49175JRr LIZJ;
    public LinkedList<C49174JRq> LIZLLL;
    public LinkedList<C49174JRq> LJ;

    public C49176JRs(VNL vnl) {
        this.LIZ = vnl;
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.LIZIZ = handler;
        this.LJ = new LinkedList<>();
        this.LIZLLL = new LinkedList<>();
        RunnableC49175JRr runnableC49175JRr = new RunnableC49175JRr(this);
        this.LIZJ = runnableC49175JRr;
        handler.postDelayed(runnableC49175JRr, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
    }

    public final void LIZ(C49174JRq c49174JRq) {
        UIComponent L = c49174JRq.LIZ.L();
        if (L == null) {
            return;
        }
        VUO vuo = new VUO(L.getSign(), c49174JRq.LIZIZ);
        vuo.LIZJ(Integer.valueOf(c49174JRq.LIZJ), "position");
        vuo.LIZJ(c49174JRq.LIZLLL, "key");
        this.LIZ.LIZIZ(vuo);
    }
}
