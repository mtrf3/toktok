package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.IsS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47988IsS {
    public static C47988IsS LJ;
    public final List<VG0> LIZ = new ArrayList();
    public final ReentrantLock LIZIZ = new ReentrantLock();
    public String LIZJ = null;
    public Context LIZLLL;

    public final synchronized boolean LJFF() {
        boolean z = false;
        if (((ArrayList) this.LIZ).size() == 0) {
            return false;
        }
        this.LIZIZ.lock();
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VG0 vg0 = (VG0) it.next();
            if (vg0.LJZ.LIZ && vg0.LJLZ == 0) {
                z = true;
                break;
            }
        }
        this.LIZIZ.unlock();
        return z;
    }

    public final synchronized void LJI() {
        LJII();
        LJ = null;
    }

    public static synchronized C47988IsS LIZLLL() {
        C47988IsS c47988IsS;
        synchronized (C47988IsS.class) {
            if (LJ == null) {
                LJ = new C47988IsS();
            }
            c47988IsS = LJ;
        }
        return c47988IsS;
    }

    public final void LJII() {
        if (((ArrayList) this.LIZ).size() == 0) {
            return;
        }
        this.LIZIZ.lock();
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            VG0 vg0 = (VG0) it.next();
            int i = vg0.LJLZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("render = ");
            LIZ.append(vg0);
            LIZ.append(", call release");
            C48284IxE.LIZ(2, i, "TextureRenderManager", X1D.LIZIZ(LIZ));
            vg0.LJIILJJIL();
            it.remove();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("release : remove render =");
            LIZ2.append(vg0);
            LIZ2.append("size = ");
            LIZ2.append(((ArrayList) this.LIZ).size());
            C48284IxE.LIZ(2, i, "TextureRenderManager", X1D.LIZIZ(LIZ2));
        }
        this.LIZIZ.unlock();
    }

    public final boolean LIZ(Surface surface) {
        VG0 vg0;
        if (surface == null) {
            C48284IxE.LIZ(6, -1, "TextureRenderManager", "invalid parameter");
            return false;
        }
        C48262Iws c48262Iws = new C48262Iws(2);
        this.LIZIZ.lock();
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (true) {
            vg0 = null;
            if (it.hasNext()) {
                vg0 = (VG0) it.next();
                if (vg0.LJLZ == 2) {
                    if (vg0.LJLJLLL >= 1) {
                        break;
                    }
                    int i = vg0.LJLZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("remove render =");
                    LIZ.append(vg0);
                    LIZ.append(" state = ");
                    LIZ.append(vg0.LJLJLLL);
                    C48284IxE.LIZ(2, i, "TextureRenderManager", X1D.LIZIZ(LIZ));
                    vg0.LJIILJJIL();
                    it.remove();
                }
            } else {
                C79444VFw c79444VFw = new C79444VFw(c48262Iws, 2);
                if (c79444VFw.LJLJLLL != -1) {
                    ((ArrayList) this.LIZ).add(c79444VFw);
                    int i2 = c79444VFw.LJLZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("add render = ");
                    LIZ2.append(c79444VFw);
                    LIZ2.append(", effectconfig= ");
                    LIZ2.append(c48262Iws);
                    LIZ2.append(", texType =");
                    LIZ2.append(2);
                    LIZ2.append(",size = ");
                    LIZ2.append(((ArrayList) this.LIZ).size());
                    C48284IxE.LIZ(2, i2, "TextureRenderManager", X1D.LIZIZ(LIZ2));
                    vg0 = c79444VFw;
                } else {
                    this.LIZJ = c79444VFw.LJLL;
                    c79444VFw.LJIILJJIL();
                }
            }
        }
        this.LIZIZ.unlock();
        if (vg0 == null) {
            C48284IxE.LIZ(6, -1, "TextureRenderManager", "couldn't get a renderer return");
            return false;
        }
        Message obtainMessage = vg0.LJLJL.obtainMessage(13);
        Bundle bundle = new Bundle();
        bundle.putParcelable("surface", surface);
        obtainMessage.setData(bundle);
        Message message = new Message();
        obtainMessage.obj = message;
        try {
            synchronized (message) {
                C48284IxE.LIZ(2, vg0.LJLZ, "TextureRenderer", "clear surface start");
                vg0.LJLJL.sendMessage(obtainMessage);
                message.wait(1000L);
                int i3 = vg0.LJLZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("clear surface end : ret = ");
                LIZ3.append(message.arg1);
                C48284IxE.LIZ(2, i3, "TextureRenderer", X1D.LIZIZ(LIZ3));
            }
            if (message.arg1 < 1) {
                return false;
            }
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public final synchronized VideoSurface LIZIZ(C48262Iws c48262Iws, int i) {
        if (((ArrayList) this.LIZ).size() == 0) {
            return LIZJ(c48262Iws, i);
        }
        this.LIZIZ.lock();
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            VG0 vg0 = (VG0) it.next();
            C48262Iws c48262Iws2 = vg0.LJZ;
            if (!c48262Iws2.LIZIZ(c48262Iws)) {
                int i2 = vg0.LJLZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("render type is mis match = ");
                LIZ.append(c48262Iws2);
                LIZ.append(", ");
                LIZ.append(c48262Iws);
                C48284IxE.LIZ(2, i2, "TextureRenderManager", X1D.LIZIZ(LIZ));
            } else {
                int i3 = vg0.LJLZ;
                if (i3 != i) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("tex type is mis match = ");
                    LIZ2.append(vg0.LJLZ);
                    LIZ2.append(", ");
                    LIZ2.append(i);
                    C48284IxE.LIZ(2, i3, "TextureRenderManager", X1D.LIZIZ(LIZ2));
                } else if ((i & 4) == (i3 & 4)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("TextureRenderer use:");
                    LIZ3.append(vg0);
                    C48284IxE.LIZ(2, i3, "TextureRenderManager", X1D.LIZIZ(LIZ3));
                    VideoSurface LJ2 = vg0.LJ();
                    if (LJ2 == null) {
                        if (vg0.LJLJLLL < 1) {
                            int i4 = vg0.LJLZ;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("remove render =");
                            LIZ4.append(vg0);
                            LIZ4.append(" state = ");
                            LIZ4.append(vg0.LJLJLLL);
                            C48284IxE.LIZ(2, i4, "TextureRenderManager", X1D.LIZIZ(LIZ4));
                            vg0.LJIILJJIL();
                            it.remove();
                        }
                    } else {
                        this.LIZIZ.unlock();
                        return LJ2;
                    }
                }
            }
        }
        this.LIZIZ.unlock();
        return LIZJ(c48262Iws, i);
    }

    public final VideoSurface LIZJ(C48262Iws c48262Iws, int i) {
        VG0 c79444VFw;
        if ((i & 4) > 0) {
            c79444VFw = new C79446VFy(c48262Iws, i);
        } else {
            c79444VFw = new C79444VFw(c48262Iws, i);
        }
        int i2 = c79444VFw.LJLZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new TextureRenderer use:");
        LIZ.append(c79444VFw);
        C48284IxE.LIZ(2, i2, "TextureRenderManager", X1D.LIZIZ(LIZ));
        if (c79444VFw.LJLJLLL != -1) {
            VideoSurface LJ2 = c79444VFw.LJ();
            if (LJ2 == null) {
                this.LIZJ = c79444VFw.LJLL;
                c79444VFw.LJIILJJIL();
                return null;
            }
            this.LIZIZ.lock();
            ((ArrayList) this.LIZ).add(c79444VFw);
            int i3 = c79444VFw.LJLZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("add render = ");
            LIZ2.append(c79444VFw);
            LIZ2.append(", effectconfig= ");
            LIZ2.append(c48262Iws);
            LIZ2.append(", texType =");
            LIZ2.append(i);
            LIZ2.append(",size = ");
            LIZ2.append(((ArrayList) this.LIZ).size());
            C48284IxE.LIZ(2, i3, "TextureRenderManager", X1D.LIZIZ(LIZ2));
            this.LIZIZ.unlock();
            return LJ2;
        }
        this.LIZJ = c79444VFw.LJLL;
        c79444VFw.LJIILJJIL();
        return null;
    }

    public final synchronized boolean LJ(C48262Iws c48262Iws, int i) {
        int i2;
        boolean z = false;
        if (((ArrayList) this.LIZ).size() == 0) {
            return false;
        }
        this.LIZIZ.lock();
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VG0 vg0 = (VG0) it.next();
            if (vg0.LJZ.LIZIZ(c48262Iws) && (i2 = vg0.LJLZ) == i && (i2 & 4) == 0) {
                z = true;
                break;
            }
        }
        this.LIZIZ.unlock();
        return z;
    }
}
