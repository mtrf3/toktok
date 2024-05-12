package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73783SxX extends AtomicInteger implements InterfaceC73651SvP {
    public static final long serialVersionUID = -2189523197179400958L;
    public InterfaceC73651SvP LJLIL;
    public long LJLILLLLZI;
    public final AtomicReference<InterfaceC73651SvP> LJLJI = new AtomicReference<>();
    public final AtomicLong LJLJJI = new AtomicLong();
    public final AtomicLong LJLJJL = new AtomicLong();
    public final boolean LJLJJLL;
    public volatile boolean LJLJL;
    public boolean LJLJLJ;

    public final void LIZIZ() {
        int i = 1;
        long j = 0;
        InterfaceC73651SvP interfaceC73651SvP = null;
        do {
            InterfaceC73651SvP interfaceC73651SvP2 = this.LJLJI.get();
            if (interfaceC73651SvP2 != null) {
                interfaceC73651SvP2 = this.LJLJI.getAndSet(null);
            }
            long j2 = this.LJLJJI.get();
            if (j2 != 0) {
                j2 = this.LJLJJI.getAndSet(0L);
            }
            long j3 = this.LJLJJL.get();
            if (j3 != 0) {
                j3 = this.LJLJJL.getAndSet(0L);
            }
            InterfaceC73651SvP interfaceC73651SvP3 = this.LJLIL;
            if (this.LJLJL) {
                if (interfaceC73651SvP3 != null) {
                    interfaceC73651SvP3.cancel();
                    this.LJLIL = null;
                }
                if (interfaceC73651SvP2 != null) {
                    interfaceC73651SvP2.cancel();
                }
            } else {
                long j4 = this.LJLILLLLZI;
                if (j4 != Long.MAX_VALUE) {
                    j4 = V2B.LIZIZ(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            EnumC73755Sx5.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.LJLILLLLZI = j4;
                }
                if (interfaceC73651SvP2 != null) {
                    if (interfaceC73651SvP3 != null && this.LJLJJLL) {
                        interfaceC73651SvP3.cancel();
                    }
                    this.LJLIL = interfaceC73651SvP2;
                    if (j4 != 0) {
                        j = V2B.LIZIZ(j, j4);
                        interfaceC73651SvP = interfaceC73651SvP2;
                    }
                } else if (interfaceC73651SvP3 != null && j2 != 0) {
                    j = V2B.LIZIZ(j, j2);
                    interfaceC73651SvP = interfaceC73651SvP3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            interfaceC73651SvP.request(j);
        }
    }

    @Override // X.InterfaceC73651SvP
    public void cancel() {
        if (!this.LJLJL) {
            this.LJLJL = true;
            if (getAndIncrement() != 0) {
                return;
            }
            LIZIZ();
        }
    }

    public final boolean isCancelled() {
        return this.LJLJL;
    }

    public final boolean isUnbounded() {
        return this.LJLJLJ;
    }

    public C73783SxX(boolean z) {
        this.LJLJJLL = z;
    }

    public final void produced(long j) {
        if (this.LJLJLJ) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.LJLILLLLZI;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    EnumC73755Sx5.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.LJLILLLLZI = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            LIZIZ();
            return;
        }
        V2B.LIZ(this.LJLJJL, j);
        if (getAndIncrement() != 0) {
            return;
        }
        LIZIZ();
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        if (!EnumC73755Sx5.validate(j) || this.LJLJLJ) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.LJLILLLLZI;
            if (j2 != Long.MAX_VALUE) {
                long LIZIZ = V2B.LIZIZ(j2, j);
                this.LJLILLLLZI = LIZIZ;
                if (LIZIZ == Long.MAX_VALUE) {
                    this.LJLJLJ = true;
                }
            }
            InterfaceC73651SvP interfaceC73651SvP = this.LJLIL;
            if (decrementAndGet() != 0) {
                LIZIZ();
            }
            if (interfaceC73651SvP != null) {
                interfaceC73651SvP.request(j);
                return;
            }
            return;
        }
        V2B.LIZ(this.LJLJJI, j);
        if (getAndIncrement() != 0) {
            return;
        }
        LIZIZ();
    }

    public final void setSubscription(InterfaceC73651SvP interfaceC73651SvP) {
        if (this.LJLJL) {
            interfaceC73651SvP.cancel();
            return;
        }
        C73320Sq4.LIZ(interfaceC73651SvP, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            InterfaceC73651SvP interfaceC73651SvP2 = this.LJLIL;
            if (interfaceC73651SvP2 != null && this.LJLJJLL) {
                interfaceC73651SvP2.cancel();
            }
            this.LJLIL = interfaceC73651SvP;
            long j = this.LJLILLLLZI;
            if (decrementAndGet() != 0) {
                LIZIZ();
            }
            if (j != 0) {
                interfaceC73651SvP.request(j);
                return;
            }
            return;
        }
        InterfaceC73651SvP andSet = this.LJLJI.getAndSet(interfaceC73651SvP);
        if (andSet != null && this.LJLJJLL) {
            andSet.cancel();
        }
        if (getAndIncrement() != 0) {
            return;
        }
        LIZIZ();
    }
}
