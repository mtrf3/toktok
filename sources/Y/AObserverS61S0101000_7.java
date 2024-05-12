package Y;

import X.C15070iV;
import X.C40990G6w;
import X.C54136LMm;
import X.C5MM;
import X.C66Y;
import X.C82866Wfe;
import X.G6A;
import X.G6D;
import X.G6F;
import X.InterfaceC153045zY;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public class AObserverS61S0101000_7 implements Observer {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS61S0101000_7 aObserverS61S0101000_7, Object obj) {
        boolean z;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObserverS61S0101000_7.l0;
        int i = aObserverS61S0101000_7.i1;
        videoPublishContainerScene.getClass();
        if (((Boolean) obj).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            videoPublishContainerScene.G(bool);
            videoPublishContainerScene.z(bool);
            videoPublishContainerScene.D(Boolean.TRUE);
            return;
        }
        videoPublishContainerScene.G(Boolean.TRUE);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        videoPublishContainerScene.z(Boolean.valueOf(z));
        videoPublishContainerScene.D(Boolean.FALSE);
    }

    public static final void onChanged$1(AObserverS61S0101000_7 aObserverS61S0101000_7, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObserverS61S0101000_7.l0;
        int i = aObserverS61S0101000_7.i1;
        videoPublishContainerScene.getClass();
        boolean z = false;
        if (((Boolean) obj).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            videoPublishContainerScene.G(bool);
            videoPublishContainerScene.z(bool);
            TextView textView = videoPublishContainerScene.LLLF;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        videoPublishContainerScene.G(Boolean.TRUE);
        if (i == 0) {
            z = true;
        }
        videoPublishContainerScene.z(Boolean.valueOf(z));
        TextView textView2 = videoPublishContainerScene.LLLF;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public static final void onChanged$2(AObserverS61S0101000_7 aObserverS61S0101000_7, Object obj) {
        switch (aObserverS61S0101000_7.i1) {
            case 0:
                ((DetailFragment) aObserverS61S0101000_7.l0).LJLIL.setPagingMainValve(((Boolean) obj).booleanValue());
                return;
            case 1:
                C82866Wfe.LJJIIZI((C82866Wfe) aObserverS61S0101000_7.l0, (C15070iV) obj);
                return;
            default:
                Integer num = (Integer) obj;
                TextView textView = ((VideoPublishContainerScene) aObserverS61S0101000_7.l0).LLJZIJLIL;
                if (textView != null) {
                    textView.setText(num.intValue());
                    return;
                }
                return;
        }
    }

    public static final void onChanged$3(AObserverS61S0101000_7 aObserverS61S0101000_7, Object obj) {
        InterfaceC153045zY interfaceC153045zY;
        switch (aObserverS61S0101000_7.i1) {
            case 0:
                C66Y c66y = (C66Y) aObserverS61S0101000_7.l0;
                Long l = (Long) obj;
                if (!c66y.LLILIL || l == null || (interfaceC153045zY = c66y.LJZI) == null) {
                    return;
                }
                c66y.LJZL.DM().setValue(C5MM.LIZIZ(interfaceC153045zY.LLFZ(l.intValue())));
                return;
            default:
                G6D g6d = (G6D) obj;
                G6F g6f = ((VideoPublishContainerScene) aObserverS61S0101000_7.l0).LLILLJJLI;
                if (g6f != null) {
                    int permission = g6d.getPermission();
                    G6A g6a = g6f.LIZ;
                    if (g6a != null) {
                        ((C40990G6w) g6a).LIZ.LIZIZ(permission);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public static final void onChanged$4(AObserverS61S0101000_7 aObserverS61S0101000_7, Object obj) {
        Integer num = (Integer) obj;
        int i = aObserverS61S0101000_7.i1;
        if (num == null || i != num.intValue()) {
            return;
        }
        C54136LMm c54136LMm = (C54136LMm) aObserverS61S0101000_7.l0;
        TextView textView = c54136LMm.LJLJLLL;
        if (textView != null) {
            textView.setText(c54136LMm.LJIILL());
        }
        C54136LMm c54136LMm2 = (C54136LMm) aObserverS61S0101000_7.l0;
        c54136LMm2.LJLLILLLL = null;
        c54136LMm2.LJLLLL = false;
    }

    public AObserverS61S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
