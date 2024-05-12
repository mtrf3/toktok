package X;

import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Message;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.VFw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79444VFw extends VG0 {
    public final C79423VFb LJZL;
    public VG6 LL;
    public final Queue<Integer> LLD;
    public C79428VFg LLF;
    public C79433VFl LLFF;
    public C79433VFl LLFFF;
    public ByteBuffer LLFII;
    public ByteBuffer LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;

    @Override // X.VG0
    public final synchronized void LJIILJJIL() {
        super.LJIILJJIL();
    }

    @Override // X.VG0
    public final void LIZJ() {
        C79423VFb c79423VFb = this.LJZL;
        c79423VFb.LJFF();
        for (AbstractC79424VFc abstractC79424VFc = c79423VFb.LJIIIIZZ; abstractC79424VFc != null; abstractC79424VFc = abstractC79424VFc.LJ()) {
            this.LJZ.LIZJ(abstractC79424VFc.LIZ(10005), 0);
        }
    }

    @Override // X.VG0
    public final void LIZLLL() {
        C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", "delete program");
        this.LLFFF = null;
        C79428VFg c79428VFg = this.LLF;
        if (c79428VFg != null) {
            c79428VFg.LJ();
            this.LLF = null;
        }
        C79433VFl c79433VFl = this.LLFF;
        if (c79433VFl != null) {
            c79433VFl.LJ();
            this.LLFF = null;
        }
        VG6 vg6 = this.LL;
        if (vg6 != null) {
            int i = vg6.LIZ;
            if (i > 0) {
                GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            }
            this.LL = null;
        }
        C79422VFa c79422VFa = this.LJLLJ;
        if (c79422VFa != null) {
            while (!c79422VFa.LIZ.isEmpty()) {
                VFZ poll = c79422VFa.LIZ.poll();
                C78966Uyw.LJIJ(poll.LIZ);
                int i2 = c79422VFa.LIZJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("release delTex:");
                LIZ.append(poll);
                C48284IxE.LIZ(2, i2, "TR_EffectTextureManager", X1D.LIZIZ(LIZ));
            }
            this.LJLLJ = null;
        }
    }

    @Override // X.VG0
    public final void LJIIJJI() {
        if (this.LJLJLLL == -1) {
            return;
        }
        try {
            C79428VFg c79428VFg = this.LLF;
            if (c79428VFg != null) {
                c79428VFg.LJ();
            }
            C79428VFg c79428VFg2 = (C79428VFg) C44384HbQ.LJIL(this.LJLZ, 3);
            this.LLF = c79428VFg2;
            if (c79428VFg2 == null) {
                C48284IxE.LIZ(6, this.LJLZ, "TextureRenderer", "create effect failed");
            } else {
                c79428VFg2.LIZIZ(null);
                this.LLF.LJI = this;
            }
        } catch (Exception e) {
            LJIILIIL(e.toString());
        }
        if (this.LJZ.LIZ) {
            LJIJJ();
        }
    }

    public final void LJIJ() {
        if (this.LL == null) {
            this.LL = new VG6();
        }
        if (this.LJLLJ == null) {
            this.LJLLJ = new C79422VFa(this.LJLZ);
        }
    }

    public final void LJIJJ() {
        try {
            C79433VFl c79433VFl = this.LLFF;
            if (c79433VFl != null) {
                c79433VFl.LJ();
            }
            C79433VFl c79433VFl2 = (C79433VFl) C44384HbQ.LJIL(this.LJLZ, 7);
            this.LLFF = c79433VFl2;
            if (c79433VFl2 == null) {
                C48284IxE.LIZ(6, this.LJLZ, "TextureRenderer", "create effect failed");
            } else {
                c79433VFl2.LIZIZ(null);
                this.LLFF.LJI = this;
            }
        } catch (Exception e) {
            LJIILIIL(e.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0302, code lost:
    
        if (r2 == 0) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x062d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x067b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0492  */
    @Override // X.VG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(android.os.Message r24) {
        /*
            Method dump skipped, instructions count: 1665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79444VFw.LJII(android.os.Message):void");
    }

    @Override // X.VG0
    public final void LJIIIIZZ(Message message) {
        int i = message.what;
        if (i != 12) {
            if (i != 25) {
                if (i != 26) {
                    switch (i) {
                        case 34:
                            this.LJZL.LJII(message.arg1, message.arg2);
                            return;
                        case 35:
                            Bundle data = message.getData();
                            if (data == null) {
                                return;
                            }
                            int i2 = message.arg1;
                            float f = data.getFloat("float_value");
                            int i3 = this.LJLZ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("_setValueToElement key:");
                            LIZ.append(i2);
                            LIZ.append(", value:");
                            LIZ.append(f);
                            C48284IxE.LIZ(2, i3, "TextureRenderer", X1D.LIZIZ(LIZ));
                            this.LJZL.LJI(i2, f);
                            return;
                        case 36:
                            break;
                        default:
                            switch (i) {
                                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                    C79428VFg c79428VFg = this.LLF;
                                    if (c79428VFg != null) {
                                        c79428VFg.LJIIZILJ();
                                    }
                                    C79433VFl c79433VFl = this.LLFF;
                                    if (c79433VFl == null) {
                                        return;
                                    }
                                    c79433VFl.LJIIZILJ();
                                    return;
                                case 41:
                                    this.LJZL.LJIIIIZZ(message.arg1, message.obj);
                                    return;
                                case 42:
                                    C79428VFg c79428VFg2 = this.LLF;
                                    if (c79428VFg2 != null) {
                                        c79428VFg2.LJII(30, 0);
                                        this.LLF.LJII(31, 0);
                                        this.LLF.LJII(29, 0);
                                        this.LLF.LJII(26, 1);
                                    }
                                    C79433VFl c79433VFl2 = this.LLFF;
                                    if (c79433VFl2 == null) {
                                        return;
                                    }
                                    c79433VFl2.LJII(30, 0);
                                    this.LLFF.LJII(31, 0);
                                    this.LLFF.LJII(29, 0);
                                    this.LLFF.LJII(26, 1);
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    C79445VFx c79445VFx = (C79445VFx) message.obj;
                    if (c79445VFx != null) {
                        c79445VFx.handleUpdateVideoState(message.arg1);
                    }
                    this.LJZL.LJII(1, message.arg1);
                    return;
                }
            } else {
                Bundle data2 = message.getData();
                Surface surface = (Surface) data2.getParcelable("surface");
                C79445VFx c79445VFx2 = (C79445VFx) data2.getSerializable("texture");
                int i4 = message.arg1;
                if (i4 == 1) {
                    c79445VFx2.initExtraSurface(surface);
                    return;
                } else if (i4 == 2) {
                    c79445VFx2.releaseExtraSurface(surface);
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    c79445VFx2.releaseAllExtraSurface();
                    return;
                }
            }
        }
        int i5 = this.LJLZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setEffect bundle:");
        LIZ2.append(message.getData());
        LIZ2.append(" surfacetexture:");
        LIZ2.append(message.obj);
        C48284IxE.LIZ(2, i5, "TextureRenderer", X1D.LIZIZ(LIZ2));
        LJIJI(message.getData(), (C79445VFx) message.obj);
    }

    @Override // X.VG0
    public final void LJIIJ(Message message) {
        boolean z;
        Bundle data = message.getData();
        if (data != null) {
            C79445VFx c79445VFx = (C79445VFx) data.getSerializable("texture");
            if (c79445VFx != null) {
                long j = this.LJLLLLLL;
                if (j != 0 && !c79445VFx.isCurrentObject(j)) {
                    z = false;
                } else {
                    z = true;
                }
                if (c79445VFx.handleSurfaceChange(z, this.LJLJJI, message.arg1)) {
                    this.LJLLLLLL = c79445VFx.getOjbectId();
                    int i = this.LJLZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("texture switch surface & playing ");
                    LIZ.append(this.LJLLLLLL);
                    C48284IxE.LIZ(2, i, "TextureRenderer", X1D.LIZIZ(LIZ));
                }
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        obj.notify();
                    }
                }
                C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", "set surface done");
                return;
            }
            throw new RuntimeException("update surface but missing texture");
        }
        throw new RuntimeException("update surface but missing bundle?");
    }

    public final boolean LJIILL(AbstractC79424VFc abstractC79424VFc) {
        int LIZ;
        AbstractC79424VFc LJIIZILJ;
        if (abstractC79424VFc == null) {
            return false;
        }
        AbstractC79424VFc abstractC79424VFc2 = this.LJZL.LJIIIIZZ;
        if (abstractC79424VFc2 != null && abstractC79424VFc2 != abstractC79424VFc) {
            if (abstractC79424VFc.LIZ(10011) >= abstractC79424VFc2.LIZ(10011)) {
                if (abstractC79424VFc2.LIZ(10004) == 36197 && (LJIIZILJ = LJIIZILJ((LIZ = abstractC79424VFc2.LIZ(10005)))) != null && LJIIZILJ.LIZ(10004) != 3553) {
                    Bundle bundle = LJIIZILJ.LJFF;
                    if (bundle != null) {
                        bundle.putInt("texture_type", 3553);
                    }
                    int LIZIZ = LJIIZILJ.LIZIZ(bundle);
                    C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", C012403c.LIZLLL("reInit, effectType:", LIZ, ",texTarget:", "texture_2d"));
                    if (LIZIZ != 0) {
                        LJIIZILJ.LJ();
                        if (LIZ == 5) {
                            ((LinkedList) this.LLD).offer(1);
                        } else if (LIZ == 1) {
                            ((LinkedList) this.LLD).offer(3);
                        } else {
                            ((LinkedList) this.LLD).offer(6);
                        }
                    }
                }
            }
            return false;
        }
        if (abstractC79424VFc.LIZ(10014) != 1 || this.LJZ.LIZ(11)) {
            return false;
        }
        return true;
    }

    public final AbstractC79424VFc LJIIZILJ(int i) {
        for (AbstractC79424VFc abstractC79424VFc = this.LJZL.LJIIIIZZ; abstractC79424VFc != null; abstractC79424VFc = abstractC79424VFc.LJIIIIZZ) {
            if (abstractC79424VFc.LIZ(10005) == i) {
                return abstractC79424VFc;
            }
        }
        return null;
    }

    public C79444VFw(C48262Iws c48262Iws, int i) {
        super(c48262Iws, i);
        this.LLD = new LinkedList();
        this.LLFII = null;
        this.LLFZ = null;
        this.LLI = -1;
        this.LLIFFJFJJ = -1;
        this.LLII = -1;
        this.LJZL = new C79423VFb(i);
    }

    public final void LJIJI(Bundle bundle, C79445VFx c79445VFx) {
        AbstractC79424VFc LJIIZILJ;
        int i;
        if (bundle == null) {
            C48284IxE.LIZ(6, this.LJLZ, "TextureRenderer", "set effect but missing bundle?");
            return;
        }
        int i2 = bundle.getInt("action");
        if (i2 != 21) {
            if (i2 != 32) {
                AbstractC79424VFc LJIIZILJ2 = LJIIZILJ(bundle.getInt("effect_type"));
                if (LJIIZILJ2 != null) {
                    LJIIZILJ2.LJIIIZ(bundle);
                    return;
                }
                return;
            }
            int i3 = bundle.getInt("effect_type");
            if (i3 == 13) {
                if (c79445VFx != null) {
                    for (AbstractC79424VFc abstractC79424VFc = this.LJZL.LJIIIIZZ; abstractC79424VFc != null; abstractC79424VFc = abstractC79424VFc.LJIIIIZZ) {
                        c79445VFx.setOption(19, abstractC79424VFc.LIZ(10005), 0);
                    }
                }
                LIZJ();
            } else {
                AbstractC79424VFc LJIIZILJ3 = LJIIZILJ(i3);
                if (LJIIZILJ3 != null) {
                    LJIIZILJ3.LJ();
                }
                this.LJZ.LIZJ(i3, 0);
                if (c79445VFx != null) {
                    c79445VFx.setOption(19, i3, 0);
                }
            }
            C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", "releaseEffect render:" + this + " type:" + i3 + " chain:" + this.LJZL);
            return;
        }
        int i4 = bundle.getInt("effect_type");
        int i5 = 36197;
        if (i4 != 1 && i4 != 5) {
            if (i4 != 11) {
                LJIIZILJ = LJIIZILJ(i4);
                if (LJIIZILJ == null && (LJIIZILJ = C44384HbQ.LJIL(this.LJLZ, i4)) == null) {
                    return;
                }
                LJIIZILJ.LJIIJ(c79445VFx);
                LJIIZILJ.LJI = this;
                if (!LJIILL(LJIIZILJ)) {
                    i5 = 3553;
                }
                bundle.putInt("texture_type", i5);
                LJIIZILJ.LIZIZ(bundle);
            } else {
                this.LLF.LJIIIZ(bundle);
                LJIJ();
                LJIILL(this.LLF);
                this.LJZ.LIZJ(i4, 1);
                return;
            }
        } else {
            LJIIZILJ = LJIIZILJ(i4);
            if (LJIIZILJ == null && (LJIIZILJ = C44384HbQ.LJIL(this.LJLZ, i4)) == null) {
                C48284IxE.LIZ(6, this.LJLZ, "TextureRenderer", "create effect failed");
                return;
            }
            if (!LJIILL(LJIIZILJ) || C56509MFt.LJIIJJI()) {
                LJIJ();
                bundle.putInt("texture_type", 3553);
            } else {
                bundle.putInt("texture_type", 36197);
            }
            LJIIZILJ.LJIIJ(c79445VFx);
            if (LJIIZILJ.LIZIZ(bundle) < 0) {
                LJIIZILJ.LJ();
                Queue<Integer> queue = this.LLD;
                if (i4 == 5) {
                    i = 1;
                } else {
                    i = 3;
                }
                ((LinkedList) queue).offer(Integer.valueOf(i));
                int i6 = this.LJLZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("initEffect render:");
                LIZ.append(this);
                LIZ.append(",chain:");
                LIZ.append(this.LJZL.toString());
                C48284IxE.LIZ(2, i6, "TextureRenderer", X1D.LIZIZ(LIZ));
            }
        }
        this.LJZ.LIZJ(i4, 1);
        if (this.LLFF == null) {
            LJIJJ();
        }
        if (bundle.containsKey("effect_order")) {
            LJIIZILJ.LJII(10011, bundle.getInt("effect_order"));
        }
        if (LJIIZILJ(i4) == null) {
            this.LJZL.LIZJ(LJIIZILJ);
        }
        if (i4 != 1 && i4 != 5) {
            LJIJ();
        }
        if (c79445VFx != null && bundle.containsKey("use_effect")) {
            c79445VFx.setEffectOpen(i4, bundle.getInt("use_effect"), bundle);
        }
        int i62 = this.LJLZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initEffect render:");
        LIZ2.append(this);
        LIZ2.append(",chain:");
        LIZ2.append(this.LJZL.toString());
        C48284IxE.LIZ(2, i62, "TextureRenderer", X1D.LIZIZ(LIZ2));
    }

    public final int LJIILLIIL(VFZ vfz, C79445VFx c79445VFx, int i, int i2, boolean z) {
        C79433VFl c79433VFl;
        if (vfz.LJ == 3553) {
            c79433VFl = this.LLFF;
        } else {
            c79433VFl = this.LLF;
        }
        this.LLFFF = c79433VFl;
        if (c79433VFl == null) {
            return -1;
        }
        c79433VFl.LJIIJ(c79445VFx);
        c79433VFl.LJII(26, c79445VFx.mLayoutMode);
        c79433VFl.LJI(27, c79445VFx.mLayoutRatio);
        if (c79445VFx.getIntOption(146) == 1) {
            c79433VFl.LJII(30, c79445VFx.mIsMirrorHorizontal);
            c79433VFl.LJII(31, c79445VFx.mIsMirrorVertical);
            c79433VFl.LJII(29, c79445VFx.mRotationType);
        } else {
            c79433VFl.LJII(29, c79445VFx.mRotationType);
            c79433VFl.LJII(30, c79445VFx.mIsMirrorHorizontal);
            c79433VFl.LJII(31, c79445VFx.mIsMirrorVertical);
        }
        c79433VFl.LJII(10006, i2);
        c79433VFl.LJII(10007, i);
        if (this.LJLZ == 1) {
            c79433VFl.LJIIIZ(c79445VFx.getCropParamsBundle(z));
        }
        c79433VFl.LIZLLL(vfz, null);
        return c79433VFl.LIZ(20005);
    }
}
