package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VI3 extends AbstractC88147Yid implements InterfaceC48472J0q {
    public boolean LIZIZ;

    @Override // X.AbstractC88147Yid
    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        C66684QFc<InterfaceC48472J0q> c66684QFc = ApplicationStatus.LIZJ;
        if (c66684QFc != null) {
            if (c66684QFc.LJLJJL) {
                c66684QFc.LJLILLLLZI.getClass();
            }
            int indexOf = ((ArrayList) c66684QFc.LJLIL).indexOf(this);
            if (indexOf != -1) {
                if (c66684QFc.LJLJI == 0) {
                    ListProtector.remove(c66684QFc.LJLIL, indexOf);
                } else {
                    c66684QFc.LJLJJI = true;
                    ListProtector.set(c66684QFc.LJLIL, indexOf, null);
                }
            }
        }
        this.LIZIZ = true;
    }

    @Override // X.AbstractC88147Yid
    public final void LIZIZ(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.LIZ = networkChangeNotifierAutoDetect;
        ApplicationStatus.LIZIZ(this);
        if (ApplicationStatus.hasVisibleActivities()) {
            LIZJ();
        } else {
            this.LIZ.LJI();
        }
    }
}
