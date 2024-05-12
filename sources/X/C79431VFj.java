package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VFj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79431VFj extends C79433VFl {
    public int LJJJIL;
    public int LJJJJ;
    public final HashMap<Integer, C79432VFk> LJJJJI;
    public int LJJJJIZL;

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final AbstractC79424VFc LJ() {
        Iterator<C79432VFk> it = this.LJJJJI.values().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ = false;
        }
        LJJ();
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
        return super.LJ();
    }

    @Override // X.C79433VFl
    public final void LJIILL() {
        C79432VFk c79432VFk = this.LJJJJI.get(Integer.valueOf(this.LJJJJIZL));
        if (c79432VFk == null) {
            return;
        }
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, c79432VFk.LIZ);
        GLES20.glUniform1i(this.LJJJJ, 1);
        GLES20.glUniform1f(this.LJJJIL, c79432VFk.LIZJ);
    }

    public final void LJJ() {
        Iterator<Map.Entry<Integer, C79432VFk>> it = this.LJJJJI.entrySet().iterator();
        while (it.hasNext()) {
            C79432VFk value = it.next().getValue();
            if (!value.LIZIZ) {
                C78966Uyw.LJIJ(value.LIZ);
                it.remove();
            }
        }
    }

    public C79431VFj(int i) {
        super(i, 2);
        this.LJJJJI = new HashMap<>();
        this.LIZLLL = 15;
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new GLLutFilter,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i2, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        HashMap hashMap;
        if (super.LIZIZ(bundle) != 0) {
            C79445VFx c79445VFx = this.LJ;
            if (c79445VFx != null) {
                c79445VFx.notifyError(10, this.LIZ, "super.init(bundle) != TR_OK");
            }
            return -1;
        }
        this.LJJJIL = GLES20.glGetUniformLocation(this.LJIILJJIL, "strength");
        this.LJJJJ = GLES20.glGetUniformLocation(this.LJIILJJIL, "lutTexture");
        Iterator<C79432VFk> it = this.LJJJJI.values().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ = false;
        }
        if (bundle.containsKey("lut_bitmap")) {
            if (bundle.getParcelable("lut_bitmap") != null) {
                LJIL(0, (Bitmap) bundle.getParcelable("lut_bitmap"));
            }
        } else if (bundle.containsKey("lut_bitmap_multi")) {
            HashMap hashMap2 = (HashMap) bundle.getSerializable("lut_bitmap_multi");
            if (hashMap2 != null) {
                for (Map.Entry entry : hashMap2.entrySet()) {
                    LJIL(((Integer) entry.getKey()).intValue(), (Bitmap) entry.getValue());
                }
            }
        } else {
            int i = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init no bitmap,this:");
            LIZ.append(this);
            C48284IxE.LIZ(6, i, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
            return -1;
        }
        LJJ();
        if (bundle.containsKey("strength")) {
            LJJI(bundle.getFloat("strength"));
        } else if (bundle.containsKey("strength_multi") && (hashMap = (HashMap) bundle.getSerializable("strength_multi")) != null) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                LJJII(((Float) entry2.getValue()).floatValue(), ((Integer) entry2.getKey()).intValue());
            }
        }
        int i2 = this.LJIIIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init:");
        LIZ2.append(bundle.toString());
        LIZ2.append(",this:");
        LIZ2.append(this);
        LIZ2.append(" LutMap:");
        LIZ2.append(this.LJJJJI);
        C48284IxE.LIZ(2, i2, "TR_GLLutFilter", X1D.LIZIZ(LIZ2));
        return 0;
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJIIIZ(Bundle bundle) {
        if (bundle != null && this.LIZ == bundle.getInt("effect_type")) {
            int i = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setOption:");
            LIZ.append(bundle.toString());
            LIZ.append(",this:");
            LIZ.append(this);
            C48284IxE.LIZ(2, i, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
            int i2 = bundle.getInt("action");
            if (i2 != 20) {
                if (i2 != 22 || this.LJJJJI.isEmpty()) {
                    return;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable("lut_bitmap");
                if (bundle.containsKey("index")) {
                    C79432VFk c79432VFk = this.LJJJJI.get(Integer.valueOf(bundle.getInt("index")));
                    if (c79432VFk == null) {
                        return;
                    }
                    LJJIFFI(c79432VFk.LIZ, bitmap);
                    return;
                }
                C79432VFk c79432VFk2 = this.LJJJJI.get(0);
                if (c79432VFk2 == null) {
                    return;
                }
                LJJIFFI(c79432VFk2.LIZ, bitmap);
                return;
            }
            if (bundle.containsKey("index")) {
                LJJII(bundle.getFloat("float_value", -1.0f), bundle.getInt("index", 0));
                return;
            } else {
                LJJI(bundle.getFloat("float_value", -1.0f));
                return;
            }
        }
        super.LJIIIZ(bundle);
    }

    @Override // X.C79433VFl
    public final String LJIIL(int i) {
        if (i != 11001) {
            return super.LJIIL(i);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nuniform sampler2D lutTexture;\nvarying vec2 vTextureCoord;\nuniform float strength;\nvoid main() {\n    vec4 inputTexColor = texture2D(sTexture, vTextureCoord);\n    float blueColor = inputTexColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 7.999);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texturePos1;\n    texturePos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec2 texturePos2;\n    texturePos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec4 newColor1 = texture2D(lutTexture, texturePos1);\n    vec4 newColor2 = texture2D(lutTexture, texturePos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(inputTexColor, vec4(newColor.rgb, inputTexColor.w), strength);\n}";
    }

    public final void LJJI(float f) {
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        Iterator<C79432VFk> it = this.LJJJJI.values().iterator();
        while (it.hasNext()) {
            it.next().LIZJ = f;
        }
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final VFZ LIZLLL(VFZ vfz, VG6 vg6) {
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx != null) {
            c79445VFx.currentEffectProcessBegin(this.LIZ);
        }
        int i = 0;
        while (true) {
            this.LJJJJIZL = i;
            if (this.LJJJJIZL >= this.LJJJJI.size()) {
                break;
            }
            C79432VFk c79432VFk = this.LJJJJI.get(Integer.valueOf(this.LJJJJIZL));
            if (c79432VFk != null && c79432VFk.LIZJ > 0.0f) {
                vfz = super.LIZLLL(vfz, vg6);
            }
            i = this.LJJJJIZL + 1;
        }
        C79445VFx c79445VFx2 = this.LJ;
        if (c79445VFx2 != null) {
            c79445VFx2.currentEffectProcessEnd(this.LIZ);
        }
        return vfz;
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJI(int i, float f) {
        if (i != 20) {
            super.LJI(i, f);
            return;
        }
        LJJI(f);
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set strength:");
        LIZ.append(f);
        LIZ.append(",this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i2, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
    }

    public final void LJIL(int i, Bitmap bitmap) {
        C79432VFk c79432VFk = this.LJJJJI.get(Integer.valueOf(i));
        if (c79432VFk == null) {
            for (Map.Entry<Integer, C79432VFk> entry : this.LJJJJI.entrySet()) {
                C79432VFk value = entry.getValue();
                if (!value.LIZIZ) {
                    this.LJJJJI.remove(entry.getKey());
                    this.LJJJJI.put(Integer.valueOf(i), value);
                    LJJIFFI(value.LIZ, bitmap);
                    return;
                }
            }
            int LJJIFFI = C78966Uyw.LJJIFFI();
            C79432VFk c79432VFk2 = new C79432VFk(LJJIFFI);
            LJJIFFI(LJJIFFI, bitmap);
            this.LJJJJI.put(Integer.valueOf(i), c79432VFk2);
            return;
        }
        LJJIFFI(c79432VFk.LIZ, bitmap);
        c79432VFk.LIZIZ = true;
    }

    public final void LJJIFFI(int i, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        GLES20.glBindTexture(3553, i);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setBitmap:");
        LIZ.append(bitmap);
        LIZ.append(",this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i2, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
    }

    public final void LJJII(float f, int i) {
        C79432VFk c79432VFk;
        if (f < 0.0f || f > 1.0f || (c79432VFk = this.LJJJJI.get(Integer.valueOf(i))) == null) {
            return;
        }
        c79432VFk.LIZJ = f;
    }
}
