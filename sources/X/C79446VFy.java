package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: X.VFy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79446VFy extends VG0 {
    public Surface LJZL;
    public EGLSurface LL;
    public float[] LLD;
    public float[] LLF;
    public final Vector<VG8> LLFF;
    public boolean LLFFF;
    public final J2N LLFII;
    public VG6 LLFZ;
    public VGC LLI;
    public VGC LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public float LLIIIILZ;
    public boolean LLIIIJ;
    public C79428VFg LLIIIL;
    public C79433VFl LLIIIZ;
    public J2P LLIIJI;
    public boolean LLIIJLIL;
    public final VG3 LLIIL;
    public final VG3 LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public final VG7 LLIL;
    public C79445VFx LLILII;
    public final HashMap<C79445VFx, Message> LLILIL;
    public final int LLILL;

    @Override // X.VG0
    public final void LIZJ() {
    }

    @Override // X.VG0
    public final synchronized void LJIILJJIL() {
        super.LJIILJJIL();
        LJIILL();
        this.LLIL.LIZJ();
    }

    @Override // X.VG0
    public final void LIZLLL() {
        C79428VFg c79428VFg = this.LLIIIL;
        if (c79428VFg != null) {
            c79428VFg.LJ();
            this.LLIIIL = null;
        }
        C79433VFl c79433VFl = this.LLIIIZ;
        if (c79433VFl != null) {
            c79433VFl.LJ();
            this.LLIIIZ = null;
        }
        VG6 vg6 = this.LLFZ;
        if (vg6 != null) {
            int i = vg6.LIZ;
            if (i > 0) {
                GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            }
            this.LLFZ = null;
        }
        VGC vgc = this.LLI;
        if (vgc != null) {
            vgc.LIZJ();
            this.LLI = null;
        }
        VGC vgc2 = this.LLIFFJFJJ;
        if (vgc2 != null) {
            vgc2.LIZJ();
            this.LLIFFJFJJ = null;
        }
    }

    @Override // X.VG0
    public final void LJIIJJI() {
        if (this.LJLJLLL == -1) {
            return;
        }
        try {
            C79428VFg c79428VFg = this.LLIIIL;
            if (c79428VFg != null) {
                c79428VFg.LJ();
            }
            C79428VFg c79428VFg2 = new C79428VFg(this.LLILL);
            this.LLIIIL = c79428VFg2;
            c79428VFg2.LIZIZ(null);
            C79433VFl c79433VFl = this.LLIIIZ;
            if (c79433VFl != null) {
                c79433VFl.LJ();
            }
            C79433VFl c79433VFl2 = new C79433VFl(this.LLILL, 7);
            this.LLIIIZ = c79433VFl2;
            c79433VFl2.LIZIZ(null);
            this.LLIIJI = new J2P(this.LJLJL);
        } catch (Exception e) {
            LJIILIIL(e.toString());
        }
        C48284IxE.LIZ(2, this.LLILL, "OverlayVideoTextureRenderer", "initGLComponents done render:" + this);
    }

    public final void LJIILL() {
        Iterator<VG8> it = this.LLFF.iterator();
        while (it.hasNext()) {
            VG8 next = it.next();
            int i = this.LLILL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_dropAllFrames isMain:");
            LIZ.append(LJIJJ(next.LIZ));
            C48284IxE.LIZ(2, i, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ));
            LJIIZILJ(next.LIZ);
            LJIJJLI(next.LIZ);
            it.remove();
        }
    }

    public final void LJIILLIIL() {
        if (this.LL == EGL14.EGL_NO_SURFACE) {
            C48284IxE.LIZ(6, this.LLILL, "OverlayVideoTextureRenderer", "no surface for make current");
            return;
        }
        int i = this.LLILL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" make current again");
        C48284IxE.LIZ(2, i, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ));
        GLES20.glFinish();
        EGLDisplay eGLDisplay = this.LJLJI;
        EGLSurface eGLSurface = this.LL;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.LJLILLLLZI)) {
            int i2 = this.LLILL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("make current failed = ");
            LIZ2.append(this.LL);
            C48284IxE.LIZ(6, i2, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ2));
            return;
        }
        int i3 = this.LLILL;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this);
        LIZ3.append("make current done");
        C48284IxE.LIZ(2, i3, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ3));
    }

    public final int LJIJ() {
        EGLSurface eGLSurface = this.LL;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.LJLJI, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public final long LJIJI() {
        long j;
        VG7 vg7 = this.LLIL;
        synchronized (vg7) {
            long j2 = vg7.LIZ;
            long j3 = 0;
            if (vg7.LIZIZ > 0 && vg7.LIZJ == 1) {
                j3 = SystemClock.elapsedRealtime() - vg7.LIZIZ;
            }
            j = j2 + j3;
        }
        return j;
    }

    public static void LJIIZILJ(C79445VFx c79445VFx) {
        try {
            try {
                c79445VFx.lock();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (c79445VFx.isRelease()) {
                return;
            }
            c79445VFx.updateTexImage();
        } finally {
            c79445VFx.unlock();
        }
    }

    @Override // X.VG0
    public final void LJII(Message message) {
        VGB LIZ;
        long j;
        C79445VFx c79445VFx = (C79445VFx) message.obj;
        if (LJIJJ(c79445VFx)) {
            LIZ = this.LLIIL.LIZ(c79445VFx.getTimestamp());
        } else {
            LIZ = this.LLIILII.LIZ(c79445VFx.getTimestamp());
        }
        long j2 = -1;
        if (LIZ != null) {
            j = LIZ.pts - LJIJI();
        } else {
            j = -1;
        }
        int i = this.LLILL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleFrameAvailable,st = ");
        LIZ2.append(c79445VFx);
        LIZ2.append(" isMainSurface:");
        LIZ2.append(LJIJJ(c79445VFx));
        LIZ2.append(" pts:");
        if (LIZ != null) {
            j2 = LIZ.pts;
        }
        LIZ2.append(j2);
        LIZ2.append(" master:");
        LIZ2.append(LJIJI());
        C48284IxE.LIZ(1, i, "OverlayVideoTextureRenderer", C132805Jc.LIZLLL(LIZ2, " diff:", j, LIZ2));
        if (j < 0) {
            LJIIZILJ(c79445VFx);
            LJIJJLI(c79445VFx);
        } else {
            if (!this.LLFFF) {
                this.LLFII.LIZJ(this.LLIIJI);
                this.LLFFF = true;
            }
            this.LLFF.add(new VG8(c79445VFx, LIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.VG0
    public final void LJIIIIZZ(Message message) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        VGC vgc;
        C79445VFx c79445VFx;
        C79445VFx c79445VFx2;
        int i2;
        boolean z4;
        boolean z5;
        int i3 = 2;
        int i4 = 1;
        switch (message.what) {
            case 26:
                if (!LJIJJ((C79445VFx) message.obj)) {
                    return;
                }
                int i5 = message.arg1;
                if (i5 != 1) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            return;
                        }
                        this.LLIL.LIZ();
                        return;
                    } else {
                        C48284IxE.LIZ(2, this.LLILL, "OverlayVideoTextureRenderer", "TEXTURE_STATE_STOP");
                        this.LLIIL.LIZ.clear();
                        this.LLIILII.LIZ.clear();
                        this.LLIL.LIZJ();
                        return;
                    }
                }
                this.LLIL.LIZIZ();
                return;
            case 27:
                float f = message.getData().getFloat("overlay_ratio");
                int i6 = this.LLILL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SetOverlayRatio ratio:");
                LIZ.append(f);
                C48284IxE.LIZ(2, i6, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ));
                if (f != this.LLIIIILZ) {
                    this.LLIIIILZ = f;
                    this.LLIIIJ = true;
                    if (!this.LLFFF) {
                        this.LLFII.LIZJ(this.LLIIJI);
                        this.LLFFF = true;
                        return;
                    }
                    return;
                }
                return;
            case 28:
                long LJIJI = LJIJI();
                Iterator<VG8> it = this.LLFF.iterator();
                while (it.hasNext()) {
                    VG8 next = it.next();
                    long j = next.LIZJ.pts - LJIJI;
                    if (j > LiveMaxRetainAlogMessageSizeSetting.DEFAULT) {
                        if (LJIJJ(next.LIZ)) {
                            i2 = this.LLIILZL + 1;
                            this.LLIILZL = i2;
                        } else {
                            i2 = this.LLIIZ + 1;
                            this.LLIIZ = i2;
                        }
                        if (i2 <= 3) {
                            next.LIZIZ = 3;
                        } else {
                            next.LIZIZ = i3;
                        }
                    } else {
                        long j2 = 1000000 * j;
                        if (j2 < this.LLFII.LJLJJL * (-2)) {
                            next.LIZIZ = 3;
                        } else if (j2 > this.LLFII.LJLJJL) {
                            next.LIZIZ = i3;
                        } else {
                            next.LIZIZ = i4;
                        }
                    }
                    int i7 = this.LLILL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("_avSyncByVsync pts:");
                    LIZ2.append(next.LIZJ.pts);
                    C0MT.LIZLLL(LIZ2, " master:", LJIJI, " diff:");
                    LIZ2.append(j);
                    LIZ2.append(" isMainSurface:");
                    LIZ2.append(LJIJJ(next.LIZ));
                    LIZ2.append(" status:");
                    C79062V1e.LJII(LIZ2, next.LIZIZ, LIZ2, 1, i7, "OverlayVideoTextureRenderer");
                    i3 = 2;
                    i4 = 1;
                }
                if (this.LLFZ == null) {
                    this.LLFZ = new VG6();
                }
                if (this.LLIFFJFJJ == null) {
                    this.LLIFFJFJJ = this.LJLLILLLL.LIZ(3553, this.LLILL);
                }
                if (this.LLI == null) {
                    this.LLI = this.LJLLILLLL.LIZ(3553, this.LLILL);
                }
                EGLSurface eGLSurface = this.LL;
                int i8 = -1;
                if (eGLSurface == EGL14.EGL_NO_SURFACE) {
                    i = -1;
                } else {
                    int[] iArr = new int[1];
                    EGL14.eglQuerySurface(this.LJLJI, eGLSurface, 12375, iArr, 0);
                    i = iArr[0];
                }
                int LJIJ = LJIJ();
                if (i > 0 && LJIJ > 0 && (this.LLIIII != i || this.LLII != LJIJ)) {
                    int i9 = this.LLILL;
                    StringBuilder LIZJ = C06460Ne.LIZJ("_initFBOComponents surface H:", LJIJ, " W:", i, " mFBOTexH:");
                    LIZJ.append(this.LLII);
                    LIZJ.append(" mFBOTexW:");
                    C79062V1e.LJII(LIZJ, this.LLIIII, LIZJ, 2, i9, "OverlayVideoTextureRenderer");
                    GLES20.glBindTexture(3553, this.LLIFFJFJJ.lock());
                    GLES20.glTexImage2D(3553, 0, 6408, i, LJIJ, 0, 6408, 5121, null);
                    this.LLIFFJFJJ.unlock();
                    int LJIIJ = C78966Uyw.LJIIJ("createTexture sub");
                    if (LJIIJ != 0 && (c79445VFx2 = this.LLILII) != null) {
                        c79445VFx2.notifyError(LJIIJ, 0, "createTexture sub");
                    }
                    VGC vgc2 = this.LLI;
                    if (vgc2 != null) {
                        GLES20.glBindTexture(3553, vgc2.lock());
                        GLES20.glTexImage2D(3553, 0, 6408, i, LJIJ, 0, 6408, 5121, null);
                        this.LLI.unlock();
                    }
                    int LJIIJ2 = C78966Uyw.LJIIJ("createTexture main");
                    if (LJIIJ2 != 0 && (c79445VFx = this.LLILII) != null) {
                        c79445VFx.notifyError(LJIIJ2, 0, "createTexture main");
                    }
                    this.LLII = LJIJ;
                    this.LLIIII = i;
                }
                Iterator<VG8> it2 = this.LLFF.iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    VG8 next2 = it2.next();
                    int i11 = next2.LIZIZ;
                    if (i11 == 1) {
                        i10++;
                    } else if (i11 == 3) {
                        int i12 = this.LLILL;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("_draw drop isMainSurface:");
                        LIZ3.append(LJIJJ(next2.LIZ));
                        C48284IxE.LIZ(1, i12, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ3));
                        LJIIZILJ(next2.LIZ);
                        LJIJJLI(next2.LIZ);
                        it2.remove();
                    }
                }
                if (!this.LLIIJLIL ? i10 <= 0 : i10 < 2) {
                    z = false;
                } else {
                    z = true;
                }
                EGLSurface eGLSurface2 = this.LL;
                if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                    int[] iArr2 = new int[1];
                    EGL14.eglQuerySurface(this.LJLJI, eGLSurface2, 12375, iArr2, 0);
                    i8 = iArr2[0];
                }
                int LJIJ2 = LJIJ();
                Iterator<VG8> it3 = this.LLFF.iterator();
                while (it3.hasNext()) {
                    VG8 next3 = it3.next();
                    if (next3.LIZIZ == 1) {
                        if (LJIJJ(next3.LIZ)) {
                            z3 = false;
                            this.LLIILZL = 0;
                        } else {
                            z3 = false;
                            this.LLIIZ = 0;
                        }
                        LJIIZILJ(next3.LIZ);
                        if (!z || next3.LIZ.needDrop()) {
                            LJIJJLI(next3.LIZ);
                            it3.remove();
                        } else {
                            this.LLIIJLIL = z3;
                            VGC texId = next3.LIZ.getTexId();
                            int lock = texId.lock();
                            C79428VFg c79428VFg = this.LLIIIL;
                            if (LJIJJ(next3.LIZ)) {
                                vgc = this.LLI;
                            } else {
                                vgc = this.LLIFFJFJJ;
                            }
                            this.LLFZ.LIZ(vgc.lock());
                            c79428VFg.LJIIJ(next3.LIZ);
                            c79428VFg.LJIJJ(C79433VFl.LJJJI);
                            c79428VFg.LJII(10006, i8);
                            c79428VFg.LJII(10007, LJIJ2);
                            c79428VFg.LJII(10010, 1);
                            c79428VFg.LIZLLL(new VFZ(null, lock, -1, -1, 36197), null);
                            vgc.unlock();
                            texId.unlock();
                            LJIJJLI(next3.LIZ);
                            C79445VFx c79445VFx3 = next3.LIZ;
                            c79445VFx3.notifyRenderFrame(c79445VFx3.getSerial());
                            it3.remove();
                        }
                    }
                }
                if (z || this.LLIIIJ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i13 = this.LLILL;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("_draw needDrawCount:");
                LIZ4.append(i10);
                LIZ4.append(" needDrawToFBO:");
                LIZ4.append(z);
                LIZ4.append(" needDrawToScreen");
                LIZ4.append(z2);
                LIZ4.append(" mNeedSync:");
                LIZ4.append(this.LLIIJLIL);
                C48284IxE.LIZ(1, i13, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ4));
                if (z2) {
                    GLES20.glBindFramebuffer(36160, 0);
                    float[] fArr = this.LLD;
                    float f2 = this.LLIIIILZ;
                    fArr[2] = f2;
                    fArr[6] = f2;
                    this.LLIIIZ.LJII(10008, 0);
                    float f3 = i8;
                    this.LLIIIZ.LJII(10006, (int) (this.LLIIIILZ * f3));
                    this.LLIIIZ.LJII(10007, LJIJ2);
                    this.LLIIIZ.LJIJJ(this.LLD);
                    this.LLIIIZ.LJII(10010, 1);
                    this.LLIIIZ.LIZLLL(new VFZ(null, this.LLI.lock(), -1, -1, 3553), null);
                    this.LLI.unlock();
                    float[] fArr2 = this.LLF;
                    float f4 = this.LLIIIILZ;
                    fArr2[0] = f4;
                    fArr2[4] = f4;
                    this.LLIIIZ.LJII(10008, (int) (f4 * f3));
                    this.LLIIIZ.LJII(10006, (int) ((1.0f - this.LLIIIILZ) * f3));
                    this.LLIIIZ.LJII(10007, LJIJ());
                    this.LLIIIZ.LJIJJ(this.LLF);
                    this.LLIIIZ.LJII(10010, 0);
                    this.LLIIIZ.LIZLLL(new VFZ(null, this.LLIFFJFJJ.lock(), -1, -1, 3553), null);
                    this.LLIFFJFJJ.unlock();
                    this.LLIIIJ = false;
                    EGLSurface eGLSurface3 = this.LL;
                    if (eGLSurface3 == EGL14.EGL_NO_SURFACE) {
                        C48284IxE.LIZ(6, this.LLILL, "OverlayVideoTextureRenderer", "no surface to render");
                    } else if (!EGL14.eglSwapBuffers(this.LJLJI, eGLSurface3)) {
                        int i14 = this.LLILL;
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(this);
                        LIZ5.append("swap buffer failed");
                        C48284IxE.LIZ(6, i14, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ5));
                    }
                }
                int i15 = this.LLILL;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("handleVsyncDraw end, ReadyVector size:");
                LIZ6.append(this.LLFF.size());
                C48284IxE.LIZ(1, i15, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ6));
                if (this.LLFF.isEmpty()) {
                    this.LLFII.LIZIZ(this.LLIIJI);
                    this.LLFFF = false;
                    return;
                }
                return;
            case 29:
            case 30:
            default:
                return;
            case 31:
                if (message.arg1 == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.LLIIJLIL = z5;
                int i16 = this.LLILL;
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("MSG_SET_OVERLAY_SYNC mNeedSync:");
                LIZ7.append(this.LLIIJLIL);
                C48284IxE.LIZ(2, i16, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ7));
                return;
            case 32:
                Bundle data = message.getData();
                C79445VFx c79445VFx4 = (C79445VFx) data.getSerializable("texture");
                VGB vgb = (VGB) data.getSerializable("update_frame_time");
                if (LJIJJ(c79445VFx4)) {
                    String string = data.getString("master_clock");
                    if (!TextUtils.isEmpty(string)) {
                        LJIL(CastLongProtector.parseLong(string.trim()) + (SystemClock.elapsedRealtime() - data.getLong("master_clock_diff")));
                    }
                }
                Iterator<VG8> it4 = this.LLFF.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (it4.next().LIZ == c79445VFx4) {
                        }
                    } else if (!LJIJJ(c79445VFx4) ? this.LLIILII.LIZ.size() <= 0 : this.LLIIL.LIZ.size() <= 0) {
                        z4 = true;
                        Message message2 = (Message) message.obj;
                        synchronized (message2) {
                            message2.arg1 = (int) vgb.pts;
                            message.obj.notify();
                        }
                    }
                }
                z4 = false;
                this.LLILIL.put(c79445VFx4, message.obj);
                if (LJIJJ(c79445VFx4)) {
                    this.LLIIL.LIZ.offer(vgb);
                } else {
                    this.LLIILII.LIZ.offer(vgb);
                }
                int i17 = this.LLILL;
                StringBuilder LJI = JBR.LJI("MSG_UPDATE_FRAME_TIME needNotify:", z4, " MainQueue:");
                LJI.append(this.LLIIL.LIZ.size());
                LJI.append(" SubQueue:");
                LJI.append(this.LLIILII.LIZ.size());
                C48284IxE.LIZ(2, i17, "OverlayVideoTextureRenderer", X1D.LIZIZ(LJI));
                return;
            case 33:
                this.LLILII = (C79445VFx) message.obj;
                int i18 = this.LLILL;
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("MSG_SET_MAIN_SURFACE st:");
                LIZ8.append(this.LLILII);
                C48284IxE.LIZ(2, i18, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ8));
                return;
        }
    }

    @Override // X.VG0
    public final void LJIIJ(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            C79445VFx c79445VFx = (C79445VFx) data.getSerializable("texture");
            if (c79445VFx != null) {
                Surface updateSurface = c79445VFx.getUpdateSurface();
                Surface surface = this.LJZL;
                if (surface != null && surface == updateSurface) {
                    if (updateSurface.toString().contains("SurfaceTexture")) {
                        C48284IxE.LIZ(6, this.LLILL, "OverlayVideoTextureRenderer", "set same surface, return");
                        return;
                    }
                } else if (updateSurface == null) {
                    LJIILL();
                    if (this.LJZL == null) {
                        C48284IxE.LIZ(6, this.LLILL, "OverlayVideoTextureRenderer", "reset null surface, return");
                        return;
                    }
                }
                if (this.LL != EGL14.EGL_NO_SURFACE) {
                    int i = this.LLILL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("destory previous surface = ");
                    LIZ.append(this.LL);
                    C48284IxE.LIZ(2, i, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ));
                    if (updateSurface == null) {
                        C48284IxE.LIZ(2, this.LLILL, "OverlayVideoTextureRenderer", "make current to dummy surface due to non render surface");
                        EGLDisplay eGLDisplay = this.LJLJI;
                        EGLSurface eGLSurface = this.LJLJJI;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.LJLILLLLZI);
                    }
                    boolean eglDestroySurface = EGL14.eglDestroySurface(this.LJLJI, this.LL);
                    this.LL = EGL14.EGL_NO_SURFACE;
                    int i2 = this.LLILL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("destory previous surface done = ");
                    LIZ2.append(this.LL);
                    LIZ2.append(" ret:");
                    LIZ2.append(eglDestroySurface);
                    C48284IxE.LIZ(2, i2, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ2));
                }
                if (updateSurface != null && updateSurface.isValid()) {
                    int[] iArr = {12344};
                    try {
                        int i3 = this.LLILL;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(this);
                        LIZ3.append(",create window surface from ");
                        LIZ3.append(updateSurface);
                        C48284IxE.LIZ(2, i3, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ3));
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.LJLJI, this.LJLIL, updateSurface, iArr, 0);
                        this.LL = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                            int i4 = this.LLILL;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("create window surface failed");
                            LIZ4.append(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                            C48284IxE.LIZ(2, i4, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ4));
                            return;
                        }
                        LJIILLIIL();
                        float[] fArr = C79433VFl.LJJJI;
                        float[] fArr2 = new float[8];
                        this.LLD = fArr2;
                        System.arraycopy(fArr, 0, fArr2, 0, 8);
                        float[] fArr3 = new float[8];
                        this.LLF = fArr3;
                        System.arraycopy(fArr, 0, fArr3, 0, 8);
                    } catch (Exception unused) {
                        C48284IxE.LIZ(6, this.LLILL, "OverlayVideoTextureRenderer", "create current exception failed");
                        return;
                    }
                }
                System.nanoTime();
                this.LJZL = updateSurface;
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        obj.notify();
                    }
                }
                int i5 = this.LLILL;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("set surface done, mEglSurface=");
                LIZ5.append(this.LL);
                LIZ5.append(" render:");
                LIZ5.append(this);
                C48284IxE.LIZ(2, i5, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ5));
                return;
            }
            throw new RuntimeException("OverlayVideoTextureRenderer update surface but missing texture");
        }
        throw new RuntimeException("OverlayVideoTextureRenderer update surface but missing bundle?");
    }

    public final boolean LJIJJ(C79445VFx c79445VFx) {
        if (c79445VFx == this.LLILII) {
            return true;
        }
        return false;
    }

    public final void LJIJJLI(C79445VFx c79445VFx) {
        Message message = this.LLILIL.get(c79445VFx);
        if (message != null) {
            synchronized (message) {
                int i = this.LLILL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("notify st:");
                LIZ.append(c79445VFx);
                LIZ.append(" MainQueue:");
                LIZ.append(this.LLIIL.toString());
                LIZ.append(" SubQueue:");
                LIZ.append(this.LLIILII.toString());
                C48284IxE.LIZ(2, i, "OverlayVideoTextureRenderer", X1D.LIZIZ(LIZ));
                message.arg1 = LiveLayoutPreloadThreadPriority.DEFAULT;
                message.notify();
            }
        }
    }

    public final void LJIL(long j) {
        VG7 vg7 = this.LLIL;
        synchronized (vg7) {
            int i = vg7.LJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateClock masetr:");
            LIZ.append(j);
            LIZ.append(" mIsUpdated:");
            LIZ.append(vg7.LIZLLL);
            LIZ.append(" mStatus:");
            LIZ.append(vg7.LIZJ);
            C48284IxE.LIZ(1, i, "NormalClock", X1D.LIZIZ(LIZ));
            if (!vg7.LIZLLL) {
                vg7.LIZLLL = true;
                vg7.LIZJ = 1;
            }
            if (vg7.LIZJ == 1) {
                vg7.LIZ = j;
                vg7.LIZIZ = SystemClock.elapsedRealtime();
            }
        }
    }

    public C79446VFy(C48262Iws c48262Iws, int i) {
        super(c48262Iws, i);
        this.LL = EGL14.EGL_NO_SURFACE;
        this.LLIIIILZ = 0.5f;
        this.LLILIL = new HashMap<>();
        this.LLILL = -1;
        this.LLFF = new Vector<>(2);
        this.LLFII = new J2N(C47988IsS.LIZLLL().LIZLLL, -1);
        this.LLIIL = new VG3();
        this.LLIILII = new VG3();
        this.LLILL = i;
        this.LLIL = new VG7(i);
        C48284IxE.LIZ(2, i, "OverlayVideoTextureRenderer", "OverlayVideoTextureRenderer");
    }
}
