package X;

import android.opengl.GLES20;
import android.os.Bundle;
import defpackage.i0;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: X.VFl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79433VFl extends AbstractC79424VFc {
    public static final float[] LJJJ = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public static final float[] LJJJI = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public FloatBuffer LJIIZILJ;
    public FloatBuffer LJIJ;
    public ShortBuffer LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public float LJJIIJZLJL;
    public float LJJIIZ;
    public float LJJIIZI;
    public float LJJIJ;
    public float LJJIJIIJI;
    public float[] LJJIJIIJIL;
    public int LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;

    public C79433VFl() {
        throw null;
    }

    public String LJIIL(int i) {
        return i != 11000 ? i != 11001 ? "" : "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n" : "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position =  aPosition;\n  vTextureCoord = aTextureCoord.xy;\n}\n";
    }

    public void LJIILJJIL() {
    }

    public void LJIILL() {
    }

    public int LJIJJLI(VFZ vfz, VG6 vg6) {
        return -1;
    }

    @Override // X.AbstractC79424VFc
    public AbstractC79424VFc LJ() {
        int i = this.LJIILJJIL;
        if (i > 0) {
            GLES20.glDeleteProgram(i);
        }
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        LJFF();
        return abstractC79424VFc;
    }

    public final VFZ LJIIJJI() {
        C79422VFa c79422VFa;
        VG0 vg0 = this.LJI;
        if (vg0 == null || (c79422VFa = vg0.LJLLJ) == null) {
            return null;
        }
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx != null) {
            int i = this.LJJII;
            int i2 = this.LJJIII;
            if (c79445VFx.getIntOption(130) >= 10) {
                return c79422VFa.LIZ(i, i2, 32857, 33640);
            }
            return c79422VFa.LIZ(i, i2, 6408, 5121);
        }
        return c79422VFa.LIZ(this.LJJII, this.LJJIII, 6408, 5121);
    }

    public final void LJIILLIIL() {
        int i;
        int i2;
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx != null && c79445VFx.getIntOption(146) == 0 && (i2 = this.LJJIJIL) != 0) {
            LJIJI(i2, this.LJIJ);
        }
        if (this.LJJIJL) {
            LJIILIIL(30, this.LJIJ);
        }
        if (this.LJJIJLIJ) {
            LJIILIIL(31, this.LJIJ);
        }
        C79445VFx c79445VFx2 = this.LJ;
        if (c79445VFx2 != null && c79445VFx2.getIntOption(146) == 1 && (i = this.LJJIJIL) != 0) {
            LJIJI(i, this.LJIJ);
        }
    }

    public final void LJIIZILJ() {
        Bundle LIZLLL = C1DG.LIZLLL("action", 21, "effect_type", 11);
        LIZLLL.putFloat("width", 1.0f);
        LIZLLL.putFloat("height", 1.0f);
        LIZLLL.putFloat("x", 0.0f);
        LIZLLL.putFloat("y", 0.0f);
        LJIIIZ(LIZLLL);
    }

    public final void LJIJ() {
        FloatBuffer floatBuffer = this.LJIJ;
        if (floatBuffer != null) {
            floatBuffer.position(0);
            FloatBuffer floatBuffer2 = this.LJIJ;
            floatBuffer2.put(LJJJI);
            floatBuffer2.position(0);
        }
    }

    @Override // X.AbstractC79424VFc
    public final int LIZ(int i) {
        switch (i) {
            case 20001:
                return this.LJIJJ;
            case 20002:
                return this.LJIJJLI;
            case 20003:
                return this.LJIL;
            case 20004:
                return this.LJJ;
            case 20005:
                return this.LJJIL;
            default:
                return super.LIZ(i);
        }
    }

    @Override // X.AbstractC79424VFc
    public int LIZIZ(Bundle bundle) {
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx != null && c79445VFx.getIntOption(126, this.LIZ) == -1) {
            this.LJ.setOption(126, this.LIZ, 0);
        }
        int LIZJ = C78687UuR.LIZJ(35633, LJIIL(11000));
        int LIZJ2 = C78687UuR.LIZJ(35632, LJIIL(11001));
        if (LIZJ == 0 || LIZJ2 == 0) {
            this.LJJIL = -1;
            C79445VFx c79445VFx2 = this.LJ;
            if (c79445VFx2 != null) {
                c79445VFx2.notifyError(8, this.LIZ, "compile shader error");
            }
            return -1;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            int[] iArr = new int[1];
            GLES20.glAttachShader(glCreateProgram, LIZJ2);
            GLES20.glAttachShader(glCreateProgram, LIZJ);
            GLES20.glLinkProgram(glCreateProgram);
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to compile program: ");
                LIZ.append(GLES20.glGetProgramInfoLog(glCreateProgram));
                C48284IxE.LIZ(6, -1, "ShaderHelper", X1D.LIZIZ(LIZ));
                GLES20.glDeleteProgram(glCreateProgram);
                glCreateProgram = 0;
            }
        }
        this.LJIILJJIL = glCreateProgram;
        if (glCreateProgram == 0) {
            int i = this.LJIIIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create program error,filter:");
            C79062V1e.LJII(LIZ2, this.LIZ, LIZ2, 2, i, "TR_GLDefaultFilter");
            this.LJJIL = -1;
            C79445VFx c79445VFx3 = this.LJ;
            if (c79445VFx3 != null) {
                c79445VFx3.notifyError(9, this.LIZ, "create program error");
            }
            return -1;
        }
        this.LJJIFFI = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(8 * this.LJIILIIL));
        this.LJIJ = LJI;
        LJI.put(LJJJI);
        LJI.position(0);
        FloatBuffer LJI2 = i0.LJI(ByteBuffer.allocateDirect(this.LJIILIIL * 12));
        this.LJIIZILJ = LJI2;
        LJI2.put(LJJJ);
        LJI2.position(0);
        this.LJIILL = GLES20.glGetAttribLocation(this.LJIILJJIL, "aPosition");
        this.LJIILLIIL = GLES20.glGetAttribLocation(this.LJIILJJIL, "aTextureCoord");
        this.LJJIL = 0;
        return 0;
    }

    @Override // X.AbstractC79424VFc
    public void LJIIIZ(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("action", -1);
        if (bundle.getInt("effect_type", -1) == 11) {
            if (i == 21 || i == 28 || i == 35) {
                float f = bundle.getFloat("width", 1.0f);
                float f2 = bundle.getFloat("height", 1.0f);
                float f3 = 0.0f;
                float f4 = bundle.getFloat("x", 0.0f);
                float f5 = bundle.getFloat("y", 0.0f);
                if (f4 <= 1.0f && f4 >= 0.0f && f5 <= 1.0f && f5 >= 0.0f && f > 0.0f && f2 > 0.0f) {
                    if (f5 == this.LJJIIZI && f4 == this.LJJIIZ && f == this.LJJIJ && f2 == this.LJJIJIIJI) {
                        return;
                    }
                    this.LJJIJ = f;
                    this.LJJIJIIJI = f2;
                    this.LJJIIZ = f4;
                    this.LJJIIZI = f5;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    this.LJJIIZ = f4;
                    if (f5 >= 0.0f) {
                        f3 = f5;
                    }
                    this.LJJIIZI = f3;
                    if (f4 + f > 1.0f) {
                        f = 1.0f - f4;
                    }
                    this.LJJIJ = f;
                    if (f3 + f2 > 1.0f) {
                        f2 = 1.0f - f3;
                    }
                    this.LJJIJIIJI = f2;
                    this.LJJIJIIJIL = new float[]{f4, f3, f4 + f, f3, f4, f3 + f2, f4 + f, f3 + f2};
                    int i2 = this.LJIIIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("param set success, bundle:");
                    LIZ.append(bundle);
                    C48284IxE.LIZ(2, i2, "TR_GLDefaultFilter", X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public final void LJIJJ(float[] fArr) {
        if (fArr != null) {
            this.LJIJ.position(0);
            this.LJIJ.put(fArr);
        }
    }

    public C79433VFl(int i, int i2) {
        super(i, i2);
        this.LJIIJJI = 12;
        this.LJIIL = 8;
        this.LJIILIIL = 4;
        this.LJIJJ = -1;
        this.LJIJJLI = -1;
        this.LJJI = true;
        this.LJJIIJ = 1;
        this.LJJIIJZLJL = 0.5f;
        this.LJJIJ = 1.0f;
        this.LJJIJIIJI = 1.0f;
        this.LJJIZ = 1;
        this.LIZIZ = 3553;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x014d, code lost:
    
        if (r21 != null) goto L33;
     */
    @Override // X.AbstractC79424VFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.VFZ LIZLLL(X.VFZ r20, X.VG6 r21) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79433VFl.LIZLLL(X.VFZ, X.VG6):X.VFZ");
    }

    @Override // X.AbstractC79424VFc
    public void LJI(int i, float f) {
        if (i != 27) {
            return;
        }
        this.LJJIIJZLJL = f;
    }

    @Override // X.AbstractC79424VFc
    public void LJII(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i != 26) {
            if (i != 20006) {
                switch (i) {
                    case 29:
                        C79445VFx c79445VFx = this.LJ;
                        if (c79445VFx != null && c79445VFx.getIntOption(144) == 1) {
                            if (this.LJJIJIL == i2 && i2 == 0) {
                                return;
                            }
                            this.LJJIJIL = i2;
                            if (i2 != 0) {
                                if (this.LJJIJLIJ || this.LJJIJL) {
                                    LJIJI(i2, this.LJIJ);
                                    return;
                                } else {
                                    LJIJI(i2, null);
                                    return;
                                }
                            }
                            LJIJ();
                            return;
                        }
                        int i3 = this.LJJIJIL;
                        if (i3 == i2) {
                            return;
                        }
                        LJIJI(i2 - i3, this.LJIJ);
                        this.LJJIJIL = i2;
                        return;
                    case 30:
                        C79445VFx c79445VFx2 = this.LJ;
                        if (c79445VFx2 != null && c79445VFx2.getIntOption(144) == 1) {
                            boolean z6 = this.LJJIJL;
                            if (i2 > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z6 == z2 && !z6) {
                                return;
                            }
                            if (i2 > 0) {
                                z5 = true;
                            }
                            this.LJJIJL = z5;
                            if (z5) {
                                LJIILIIL(30, null);
                                return;
                            } else {
                                LJIJ();
                                return;
                            }
                        }
                        boolean z7 = this.LJJIJL;
                        if (i2 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z7 == z) {
                            return;
                        }
                        if (i2 > 0) {
                            z5 = true;
                        }
                        this.LJJIJL = z5;
                        LJIILIIL(30, this.LJIJ);
                        return;
                    case 31:
                        C79445VFx c79445VFx3 = this.LJ;
                        if (c79445VFx3 != null && c79445VFx3.getIntOption(144) == 1) {
                            boolean z8 = this.LJJIJLIJ;
                            if (i2 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z8 == z4 && !z8) {
                                return;
                            }
                            if (i2 > 0) {
                                z5 = true;
                            }
                            this.LJJIJLIJ = z5;
                            if (z5) {
                                LJIILIIL(31, null);
                                return;
                            } else {
                                LJIJ();
                                return;
                            }
                        }
                        boolean z9 = this.LJJIJLIJ;
                        if (i2 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z9 == z3) {
                            return;
                        }
                        if (i2 > 0) {
                            z5 = true;
                        }
                        this.LJJIJLIJ = z5;
                        LJIILIIL(31, this.LJIJ);
                        return;
                    default:
                        switch (i) {
                            case 10006:
                                this.LJIJJ = i2;
                                return;
                            case 10007:
                                this.LJIJJLI = i2;
                                return;
                            case 10008:
                                this.LJIL = i2;
                                return;
                            case 10009:
                                this.LJJ = i2;
                                return;
                            case 10010:
                                if (i2 == 1) {
                                    z5 = true;
                                }
                                this.LJJI = z5;
                                return;
                            default:
                                super.LJII(i, i2);
                                return;
                        }
                }
            }
            this.LJJIZ = i2;
            return;
        }
        if (this.LJJIIJ == i2) {
            return;
        }
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(this.LJIILIIL * 8));
        this.LJIJ = LJI;
        if (LJI != null) {
            LJI.put(LJJJI);
            LJI.position(0);
        }
        this.LJJIIJ = i2;
        LJIILLIIL();
    }

    public final void LJIILIIL(int i, FloatBuffer floatBuffer) {
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(this.LJIILIIL * 8));
        if (floatBuffer != null) {
            floatBuffer.rewind();
            LJI.put(floatBuffer);
            floatBuffer.rewind();
            LJI.flip();
        } else {
            LJI.put(LJJJI);
        }
        if (i == 30) {
            this.LJIJ.put(0, LJI.get(2));
            this.LJIJ.put(1, LJI.get(3));
            this.LJIJ.put(2, LJI.get(0));
            this.LJIJ.put(3, LJI.get(1));
            this.LJIJ.put(4, LJI.get(6));
            this.LJIJ.put(5, LJI.get(7));
            this.LJIJ.put(6, LJI.get(4));
            this.LJIJ.put(7, LJI.get(5));
        } else if (i == 31) {
            this.LJIJ.put(0, LJI.get(4));
            this.LJIJ.put(1, LJI.get(5));
            this.LJIJ.put(2, LJI.get(6));
            this.LJIJ.put(3, LJI.get(7));
            this.LJIJ.put(4, LJI.get(0));
            this.LJIJ.put(5, LJI.get(1));
            this.LJIJ.put(6, LJI.get(2));
            this.LJIJ.put(7, LJI.get(3));
        } else {
            FloatBuffer floatBuffer2 = this.LJIJ;
            floatBuffer2.put(LJI);
            floatBuffer2.position(0);
        }
        LJI.clear();
    }

    public final void LJIJI(int i, FloatBuffer floatBuffer) {
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(this.LJIILIIL * 8));
        if (floatBuffer != null) {
            floatBuffer.rewind();
            LJI.put(floatBuffer);
            floatBuffer.rewind();
            LJI.flip();
        } else {
            LJI.put(LJJJI);
        }
        if (i < 0) {
            i += 360;
        }
        if (i == 90) {
            this.LJIJ.put(0, LJI.get(2));
            this.LJIJ.put(1, LJI.get(3));
            this.LJIJ.put(2, LJI.get(6));
            this.LJIJ.put(3, LJI.get(7));
            this.LJIJ.put(4, LJI.get(0));
            this.LJIJ.put(5, LJI.get(1));
            this.LJIJ.put(6, LJI.get(4));
            this.LJIJ.put(7, LJI.get(5));
        } else if (i == 180) {
            this.LJIJ.put(0, LJI.get(6));
            this.LJIJ.put(1, LJI.get(7));
            this.LJIJ.put(2, LJI.get(4));
            this.LJIJ.put(3, LJI.get(5));
            this.LJIJ.put(4, LJI.get(2));
            this.LJIJ.put(5, LJI.get(3));
            this.LJIJ.put(6, LJI.get(0));
            this.LJIJ.put(7, LJI.get(1));
        } else if (i == 270) {
            this.LJIJ.put(0, LJI.get(4));
            this.LJIJ.put(1, LJI.get(5));
            this.LJIJ.put(2, LJI.get(0));
            this.LJIJ.put(3, LJI.get(1));
            this.LJIJ.put(4, LJI.get(6));
            this.LJIJ.put(5, LJI.get(7));
            this.LJIJ.put(6, LJI.get(2));
            this.LJIJ.put(7, LJI.get(3));
        } else {
            FloatBuffer floatBuffer2 = this.LJIJ;
            floatBuffer2.put(LJI);
            floatBuffer2.position(0);
        }
        LJI.clear();
    }
}
