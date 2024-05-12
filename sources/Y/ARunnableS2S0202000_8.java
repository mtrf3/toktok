package Y;

import X.AbstractC66014PvW;
import X.C47261Igj;
import X.C78765Uvh;
import X.InterfaceC15040iS;
import X.InterfaceC2302291u;
import X.JVP;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.SubscribeMaskLayerWidget;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioCatcher;

/* loaded from: classes9.dex */
public class ARunnableS2S0202000_8 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS2S0202000_8 aRunnableS2S0202000_8) {
        boolean LIZ;
        try {
            int i = aRunnableS2S0202000_8.i2;
            int i2 = aRunnableS2S0202000_8.i3;
            C78765Uvh.LJI(((SubscribeMaskLayerWidget) aRunnableS2S0202000_8.l0).LJLJJL, (UrlModel) aRunnableS2S0202000_8.l1, i, i2, C47261Igj.LJIILIIL((i * 1.0f) / i2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0202000_8 aRunnableS2S0202000_8) {
        switch (aRunnableS2S0202000_8.i2) {
            case 0:
                int i = aRunnableS2S0202000_8.i3;
                String str = (String) aRunnableS2S0202000_8.l0;
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aRunnableS2S0202000_8.l1;
                if (AbstractC66014PvW.LIZ == null) {
                    return;
                }
                ALog.stacktrace(i, str, stackTraceElementArr);
                return;
            case 1:
                ((InterfaceC2302291u) ServiceManager.get().getService(InterfaceC2302291u.class)).LJJJIL();
                return;
            default:
                ((AudioCatcher) aRunnableS2S0202000_8.l0).lambda$onError$2(aRunnableS2S0202000_8.i3, (Exception) aRunnableS2S0202000_8.l1);
                return;
        }
    }

    public static final void run$2(ARunnableS2S0202000_8 aRunnableS2S0202000_8) {
        boolean LIZ;
        try {
            RecyclerView.ViewHolder LJJIZ = ((JVP) aRunnableS2S0202000_8.l0).LJLIL.LJJIZ(aRunnableS2S0202000_8.i2);
            if (LJJIZ == null) {
                int i = aRunnableS2S0202000_8.i3;
                if (i < 10) {
                    JVP jvp = (JVP) aRunnableS2S0202000_8.l0;
                    jvp.LJLIL.postDelayed(new ARunnableS2S0202000_8(i + 1, aRunnableS2S0202000_8.i2, jvp, (InterfaceC15040iS) aRunnableS2S0202000_8.l1, 2), r4 * 10);
                }
            } else {
                ((InterfaceC15040iS) aRunnableS2S0202000_8.l1).accept(LJJIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0202000_8(int i, String str, StackTraceElement[] stackTraceElementArr, int i2) {
        this.$t = i2;
        this.i2 = 0;
        this.i3 = i;
        this.l0 = str;
        this.l1 = stackTraceElementArr;
    }

    public ARunnableS2S0202000_8(int i, int i2, Object obj, Object obj2, int i3) {
        this.$t = i3;
        this.i2 = i2;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj2;
    }
}
