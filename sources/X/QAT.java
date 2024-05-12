package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes12.dex */
public final class QAT extends QAU {
    public QAT(QAX qax) {
        super(qax);
    }

    public final QAU LIZ(Long l) {
        ((ReentrantLock) this.LJLIL).lock();
        ((ReentrantLock) this.LJLIL).unlock();
        return this;
    }

    public final void LIZIZ(Long l) {
        Long valueOf;
        if (l == null) {
            valueOf = null;
        } else {
            this.LJLILLLLZI.getClass();
            valueOf = Long.valueOf((l.longValue() * 1000) + System.currentTimeMillis());
        }
        LIZ(valueOf);
    }

    public final void LIZJ(String str) {
        boolean z;
        boolean z2 = false;
        if (str != null) {
            if (this.LJLJJL != null && this.LJLJI != null && this.LJLJJI != null) {
                z = true;
            } else {
                z = false;
            }
            C77357UXp.LIZLLL("Please use the Builder and call setJsonFactory, setTransport and setClientSecrets", z);
        }
        ((ReentrantLock) this.LJLIL).lock();
        if (str != null) {
            try {
                if (this.LJLJJL != null && this.LJLJI != null && this.LJLJJI != null && this.LJLJJLL != null) {
                    z2 = true;
                }
                C77357UXp.LIZLLL("Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl", z2);
            } finally {
                ((ReentrantLock) this.LJLIL).unlock();
            }
        }
    }
}
