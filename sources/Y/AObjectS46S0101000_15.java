package Y;

import X.AW4;
import X.C76633U5t;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.XAM;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public class AObjectS46S0101000_15 implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS46S0101000_15 aObjectS46S0101000_15, Object obj) {
        switch (aObjectS46S0101000_15.i1) {
            case 0:
                Integer num = (Integer) obj;
                C76633U5t c76633U5t = ((GuestMediaManageFragment) aObjectS46S0101000_15.l0).LLFZ;
                if (c76633U5t != null) {
                    c76633U5t.setVolumeLevel(num.intValue());
                }
                return C76800UCe.LIZ;
            case 1:
                ((AW4) obj).LJJLL((String) aObjectS46S0101000_15.l0);
                return null;
            default:
                XAM xam = (XAM) aObjectS46S0101000_15.l0;
                ((ReentrantLock) xam.LJLIL).lock();
                try {
                    xam.LJLJI.set(obj);
                    xam.LJLILLLLZI.signalAll();
                    return null;
                } finally {
                    ((ReentrantLock) xam.LJLIL).unlock();
                }
        }
    }

    public static final Object invoke$1(AObjectS46S0101000_15 aObjectS46S0101000_15, Object obj) {
        switch (aObjectS46S0101000_15.i1) {
            case 0:
                ((GuestMediaManageFragment) aObjectS46S0101000_15.l0).Jl("LinkReceiveEnlargeMessageEvent");
                return C76800UCe.LIZ;
            default:
                XAM xam = (XAM) aObjectS46S0101000_15.l0;
                ((ReentrantLock) xam.LJLIL).lock();
                try {
                    xam.LJLJJI.set(obj);
                    xam.LJLILLLLZI.signalAll();
                    ((ReentrantLock) xam.LJLIL).unlock();
                    return null;
                } catch (Throwable th) {
                    ((ReentrantLock) xam.LJLIL).unlock();
                    throw th;
                }
        }
    }

    public AObjectS46S0101000_15(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
