package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import defpackage.i0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final class VGR {
    public final Context LIZ;
    public FloatBuffer LJ;
    public FloatBuffer LJFF;
    public FloatBuffer LJI;
    public final List<MaskSrc> LJIILLIIL;
    public final float[] LIZIZ = new float[8];
    public final float[] LIZJ = new float[8];
    public final float[] LIZLLL = new float[8];
    public final VGU LJII = new VGU();
    public int LJIIIIZZ = 0;
    public int LJIIIZ = 0;
    public int LJIIJ = 0;
    public int LJIIJJI = 0;
    public int LJIIL = 0;
    public int LJIILIIL = 0;
    public final java.util.Map<String, MaskSrc> LJIILJJIL = new HashMap();
    public final java.util.Map<String, Integer> LJIILL = new HashMap();

    public final void LIZIZ() {
        int i;
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(this.LIZIZ.length * 4));
        LJI.put(this.LIZIZ);
        this.LJ = LJI;
        LJI.position(0);
        FloatBuffer LJI2 = i0.LJI(ByteBuffer.allocateDirect(this.LIZJ.length * 4));
        LJI2.put(this.LIZJ);
        this.LJFF = LJI2;
        LJI2.position(0);
        FloatBuffer LJI3 = i0.LJI(ByteBuffer.allocateDirect(this.LIZLLL.length * 4));
        LJI3.put(this.LIZLLL);
        this.LJI = LJI3;
        LJI3.position(0);
        int LJII = V16.LJII(V16.LJJJJI("mask/mask_vertex.sh", this.LIZ.getResources()), V16.LJJJJI("mask/mask_frag.sh", this.LIZ.getResources()));
        this.LJIIIIZZ = LJII;
        if (LJII != 0) {
            this.LJIIIZ = GLES20.glGetAttribLocation(LJII, "aPosition");
            V16.LJI();
            if (this.LJIIIZ != -1) {
                this.LJIIJ = GLES20.glGetAttribLocation(this.LJIIIIZZ, "aTextureCoord");
                V16.LJI();
                if (this.LJIIJ != -1) {
                    this.LJIIJJI = GLES20.glGetAttribLocation(this.LJIIIIZZ, "aMaskTextureCoord");
                    V16.LJI();
                    if (this.LJIIJJI != -1) {
                        this.LJIIL = GLES20.glGetUniformLocation(this.LJIIIIZZ, "sTexture");
                        V16.LJI();
                        if (this.LJIIL != -1) {
                            this.LJIILIIL = GLES20.glGetUniformLocation(this.LJIIIIZZ, "sMaskTexture");
                            V16.LJI();
                            if (this.LJIILIIL == -1) {
                                throw new RuntimeException("Could not get attrib location for sMaskTexture");
                            }
                        } else {
                            throw new RuntimeException("Could not get attrib location for sTexture");
                        }
                    } else {
                        throw new RuntimeException("Could not get attrib location for aMaskTextureCoord");
                    }
                } else {
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
            } else {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
        }
        List<MaskSrc> list = this.LJIILLIIL;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        ((HashMap) this.LJIILL).clear();
        ((HashMap) this.LJIILJJIL).clear();
        for (int i2 = 0; i2 < ((ArrayList) this.LJIILLIIL).size(); i2++) {
            MaskSrc maskSrc = (MaskSrc) ListProtector.get(this.LJIILLIIL, i2);
            ((HashMap) this.LJIILJJIL).put(maskSrc.getName(), maskSrc);
            java.util.Map<String, Integer> map = this.LJIILL;
            String name = maskSrc.getName();
            Bitmap bitmap = maskSrc.getBitmap();
            if (bitmap != null && !bitmap.isRecycled()) {
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                int i3 = iArr[0];
                if (i3 != 0) {
                    GLES20.glBindTexture(3553, i3);
                    GLES20.glTexParameteri(3553, 10241, 9987);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    GLES20.glGenerateMipmap(3553);
                    GLES20.glBindTexture(3553, 0);
                    i = iArr[0];
                    ((HashMap) map).put(name, Integer.valueOf(i));
                }
            }
            i = 0;
            ((HashMap) map).put(name, Integer.valueOf(i));
        }
    }

    public final void LIZJ() {
        Iterator it = ((HashMap) this.LJIILL).entrySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
            if (intValue != 0) {
                GLES20.glDeleteTextures(1, new int[]{intValue}, 0);
            }
        }
        Iterator it2 = ((HashMap) this.LJIILJJIL).entrySet().iterator();
        while (it2.hasNext()) {
            ((MaskSrc) ((Map.Entry) it2.next()).getValue()).getBitmap();
        }
        ((HashMap) this.LJIILJJIL).clear();
        ((HashMap) this.LJIILL).clear();
        ((ArrayList) this.LJIILLIIL).clear();
    }

    public VGR(Context context, List<MaskSrc> list) {
        this.LIZ = context;
        this.LJIILLIIL = new ArrayList(list);
    }

    public final void LIZ(int i, int i2, int i3, int i4, int i5, VGS vgs, String str, DataSource.Element element) {
        float f;
        int i6;
        if (!element.isValid()) {
            return;
        }
        GLES20.glUseProgram(this.LJIIIIZZ);
        V16.LJI();
        MaskSrc maskSrc = (MaskSrc) ((HashMap) this.LJIILJJIL).get(str);
        if (maskSrc == null) {
            return;
        }
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        float f5 = i5;
        float width = maskSrc.getWidth();
        float height = maskSrc.getHeight();
        if (element.type == 0) {
            VGU vgu = this.LJII;
            int[] iArr = element.renderFrame;
            if (iArr.length < 4) {
                i6 = 0;
                f = 2.0f;
            } else {
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iArr[2];
                int i10 = iArr[3];
                f = 2.0f;
                float LIZ = C1I0.LIZ(i9, width, 2.0f, i7);
                float LIZ2 = C1I0.LIZ(i10, height, 2.0f, i8);
                vgu.LIZIZ(LIZ, LIZ2, LIZ + width, LIZ2 + height, f4, f5);
                i6 = 0;
            }
        } else {
            f = 2.0f;
            i6 = 0;
            this.LJII.LIZJ(f4, f5, element.renderFrame);
        }
        VGU vgu2 = this.LJII;
        float f6 = vgs.LIZ;
        if (f6 == 0.0f || vgs.LIZIZ == 0.0f || vgs.LIZJ == 0.0f || vgs.LIZLLL == 0.0f) {
            float f7 = 1.0f - (f6 + vgs.LIZJ);
            float f8 = 1.0f - (vgs.LIZIZ + vgs.LIZLLL);
            if (f7 != 1.0f) {
                vgu2.LIZ *= f7;
                vgu2.LIZJ *= f7;
            } else {
                vgu2.getClass();
            }
            if (f8 != 1.0f) {
                vgu2.LIZIZ *= f8;
                vgu2.LIZLLL *= f8;
            }
            float f9 = vgs.LIZ;
            float f10 = vgs.LIZIZ;
            vgu2.LIZ += f9;
            vgu2.LIZIZ += f10;
            vgu2.LIZJ += f9;
            vgu2.LIZLLL += f10;
        }
        VGT.LIZ(this.LJII);
        float[] fArr = this.LIZIZ;
        VGU vgu3 = this.LJII;
        VGT.LIZIZ(fArr, vgu3.LIZ, vgu3.LIZIZ, vgu3.LIZJ, vgu3.LIZLLL);
        this.LJ.position(i6);
        this.LJ.put(this.LIZIZ);
        VGU vgu4 = this.LJII;
        if (element.fitType != 1) {
            int[] iArr2 = element.renderFrame;
            vgu4.getClass();
            int i11 = iArr2[i6];
            float f11 = i11;
            vgu4.LIZ = f11;
            int i12 = iArr2[1];
            float f12 = i12;
            vgu4.LIZIZ = f12;
            float f13 = i11 + iArr2[2];
            vgu4.LIZJ = f13;
            float f14 = i12 + iArr2[3];
            vgu4.LIZLLL = f14;
            float f15 = f13 - f11;
            float f16 = f14 - f12;
            vgu4.LIZIZ(0.0f, 0.0f, f15, f16, f15, f16);
        } else {
            int[] iArr3 = element.renderFrame;
            vgu4.getClass();
            int i13 = iArr3[i6];
            float f17 = i13;
            vgu4.LIZ = f17;
            int i14 = iArr3[1];
            float f18 = i14;
            vgu4.LIZIZ = f18;
            float f19 = i13 + iArr3[2];
            vgu4.LIZJ = f19;
            float f20 = i14 + iArr3[3];
            vgu4.LIZLLL = f20;
            float f21 = f19 - f17;
            float f22 = f20 - f18;
            if (element.type == 0) {
                vgu4.LIZIZ(0.0f, 0.0f, width, height, width, height);
            } else if (f21 <= width && f22 <= height) {
                float f23 = (width - f21) / f;
                float f24 = (height - f22) / f;
                vgu4.LIZIZ(f23, f24, f21 + f23, f22 + f24, width, height);
            } else {
                float f25 = f21 / f22;
                if (f25 > width / height) {
                    float f26 = width / f25;
                    float f27 = (height - f26) / f;
                    vgu4.LIZIZ(0.0f, f27, width, f26 + f27, width, height);
                } else {
                    float f28 = f25 * height;
                    float f29 = (width - f28) / f;
                    vgu4.LIZIZ(f29, 0.0f, f28 + f29, height, width, height);
                }
            }
        }
        float[] fArr2 = this.LIZJ;
        VGU vgu5 = this.LJII;
        VGT.LIZIZ(fArr2, vgu5.LIZ, vgu5.LIZIZ, vgu5.LIZJ, vgu5.LIZLLL);
        this.LJFF.position(0);
        this.LJFF.put(this.LIZJ);
        this.LJII.LIZJ(f2, f3, element.sourceFrame);
        float[] fArr3 = this.LIZLLL;
        VGU vgu6 = this.LJII;
        VGT.LIZIZ(fArr3, vgu6.LIZ, vgu6.LIZIZ, vgu6.LIZJ, vgu6.LIZLLL);
        this.LJI.position(0);
        this.LJI.put(this.LIZLLL);
        this.LJ.position(0);
        GLES20.glVertexAttribPointer(this.LJIIIZ, 2, 5126, false, 0, (Buffer) this.LJ);
        V16.LJI();
        GLES20.glEnableVertexAttribArray(this.LJIIIZ);
        V16.LJI();
        this.LJFF.position(0);
        GLES20.glVertexAttribPointer(this.LJIIJ, 2, 5126, false, 0, (Buffer) this.LJFF);
        V16.LJI();
        GLES20.glEnableVertexAttribArray(this.LJIIJ);
        V16.LJI();
        GLES20.glActiveTexture(33984);
        Integer num = (Integer) ((HashMap) this.LJIILL).get(str);
        if (num == null || num.intValue() == 0) {
            return;
        }
        GLES20.glBindTexture(3553, num.intValue());
        GLES20.glUniform1i(this.LJIIL, 0);
        this.LJI.position(0);
        GLES20.glVertexAttribPointer(this.LJIIJJI, 2, 5126, false, 0, (Buffer) this.LJI);
        V16.LJI();
        GLES20.glEnableVertexAttribArray(this.LJIIJJI);
        V16.LJI();
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.LJIILIIL, 1);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glDrawArrays(5, 0, 4);
        V16.LJI();
        GLES20.glDisable(3042);
    }
}
