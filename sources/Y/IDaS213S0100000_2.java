package Y;

import X.C162466Ze;
import X.InterfaceC29937Boz;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget;

/* loaded from: classes3.dex */
public class IDaS213S0100000_2 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS213S0100000_2 iDaS213S0100000_2) {
        ((LiveData) ((CanvasGestureGuideWidget) iDaS213S0100000_2.l0).LIZLLL.getValue()).setValue(Boolean.FALSE);
    }

    public static final void run$1(IDaS213S0100000_2 iDaS213S0100000_2) {
        C162466Ze c162466Ze = (C162466Ze) iDaS213S0100000_2.l0;
        synchronized (c162466Ze) {
            c162466Ze.LIZ = false;
        }
    }

    public IDaS213S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
