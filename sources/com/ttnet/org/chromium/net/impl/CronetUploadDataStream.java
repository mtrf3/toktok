package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC66664QEi;
import X.C16880lQ;
import X.C25620zW;
import X.C66663QEh;
import X.C78939UyV;
import X.C7MY;
import X.QXX;
import X.RunnableC66665QEj;
import X.X1D;
import Y.ARunnableS47S0100000_11;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class CronetUploadDataStream extends QXX {
    public static final /* synthetic */ int LJLLL = 0;
    public final Executor LJLIL;
    public final C66663QEh LJLILLLLZI;
    public final CronetUrlRequest LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public volatile boolean LJLJL;
    public final RunnableC66665QEj LJLJLJ;
    public ByteBuffer LJLJLLL;
    public final Object LJLL;
    public long LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;

    static {
        C16880lQ.LJLLJ(CronetUploadDataStream.class);
    }

    @Override // X.QXX
    public final void LLLIZZ() {
        synchronized (this.LJLL) {
            LLLLZIL(1);
            this.LJLLILLLL = 3;
            this.LJLJJL = this.LJLJJI;
            if (this.LJLLI == 0) {
                return;
            }
            N.M3Tck9nA(this.LJLLI, this);
        }
    }

    public final void LLLLZLLIL() {
        synchronized (this.LJLL) {
            if (this.LJLLILLLL == 0) {
                this.LJLLJ = true;
            } else {
                if (this.LJLLI == 0) {
                    return;
                }
                N.Mx3T_YwB(this.LJLLI);
                this.LJLLI = 0L;
                LLLZIL(new ARunnableS47S0100000_11(this, 64));
            }
        }
    }

    public final void LLLLZLLLI() {
        synchronized (this.LJLL) {
            if (this.LJLLILLLL != 0) {
                if (this.LJLLJ) {
                    LLLLZLLIL();
                }
            } else {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
        }
    }

    public final void LLLZ() {
        synchronized (this.LJLL) {
            this.LJLLILLLL = 2;
        }
        try {
            this.LJLJI.LJIJJ();
            long LIZ = this.LJLILLLLZI.LIZ();
            this.LJLJJI = LIZ;
            this.LJLJJL = LIZ;
        } catch (Throwable th) {
            LLLZI(th);
        }
        synchronized (this.LJLL) {
            this.LJLLILLLL = 3;
        }
    }

    public void rewind() {
        LLLZIL(new ARunnableS47S0100000_11(this, 63));
    }

    public void onUploadDataStreamDestroyed() {
        LLLLZLLIL();
    }

    @Override // X.QXX
    public final void LLLIL(boolean z) {
        synchronized (this.LJLL) {
            LLLLZIL(0);
            if (this.LJLJJLL == this.LJLJLLL.limit()) {
                if (!z || this.LJLJJI < 0) {
                    int position = this.LJLJLLL.position();
                    long j = this.LJLJJL - position;
                    this.LJLJJL = j;
                    if (j >= 0 || this.LJLJJI < 0) {
                        this.LJLJLLL.position(0);
                        this.LJLJLLL = null;
                        this.LJLLILLLL = 3;
                        LLLLZLLLI();
                        if (this.LJLLI == 0) {
                            return;
                        }
                        N.MYsxiVBk(this.LJLLI, this, position, z);
                        return;
                    }
                    throw new IllegalArgumentException(C16880lQ.LLLZ("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.LJLJJI - this.LJLJJL), Long.valueOf(this.LJLJJI)}));
                }
                throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
            }
            throw new IllegalStateException("ByteBuffer limit changed");
        }
    }

    @Override // X.QXX
    public final void LLLILZLLLI(Exception exc) {
        synchronized (this.LJLL) {
            LLLLZIL(1);
            LLLZI(exc);
        }
    }

    public final void LLLLZ(long j) {
        synchronized (this.LJLL) {
            this.LJLLI = N.M89UGLMC(this, j, this.LJLJJI);
        }
    }

    public final void LLLLZIL(int i) {
        if (this.LJLLILLLL == i) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("Expected ", i, ", but was ");
        LJ.append(this.LJLLILLLL);
        throw new IllegalStateException(X1D.LIZIZ(LJ));
    }

    public final void LLLZI(Throwable th) {
        boolean z;
        synchronized (this.LJLL) {
            int i = this.LJLLILLLL;
            if (i != 3) {
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLLILLLL = 3;
                this.LJLJLLL = null;
                LLLLZLLLI();
            } else {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
        }
        if (z) {
            try {
                this.LJLILLLLZI.close();
                this.LJLJL = true;
            } catch (Exception e) {
                C78939UyV.LJII("Failure closing data provider", e);
            }
        }
        this.LJLJI.LJJIIJ(th);
    }

    public final void LLLZIL(Runnable runnable) {
        try {
            this.LJLIL.execute(runnable);
        } catch (Throwable th) {
            CronetUrlRequest cronetUrlRequest = this.LJLJI;
            if (cronetUrlRequest != null) {
                cronetUrlRequest.LJJIIJ(th);
                return;
            }
            throw new IllegalStateException(C25620zW.LIZ("Unexpected request usage, caught in CronetUploadDataStream, caused by ", th));
        }
    }

    public void readData(ByteBuffer byteBuffer) {
        this.LJLJLLL = byteBuffer;
        this.LJLJJLL = byteBuffer.limit();
        LLLZIL(this.LJLJLJ);
    }

    public CronetUploadDataStream(AbstractC66664QEi abstractC66664QEi, Executor executor, CronetUrlRequest cronetUrlRequest) {
        super((Object) null);
        this.LJLJLJ = new RunnableC66665QEj(this);
        this.LJLL = new Object();
        this.LJLLILLLL = 3;
        this.LJLIL = executor;
        this.LJLILLLLZI = new C66663QEh(abstractC66664QEi);
        this.LJLJI = cronetUrlRequest;
        this.LJLJL = false;
    }
}
