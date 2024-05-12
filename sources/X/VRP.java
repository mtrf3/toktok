package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public abstract class VRP extends VR1 {
    public Shader LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final Paint LJLJJL = new Paint(1);
    public int[] LJLJJLL = null;
    public float[] LJLJL = null;

    @Override // X.VR1
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.VR1
    public final void LIZLLL() {
    }

    @Override // X.VR1
    public final void LJ() {
    }

    @Override // X.VR1
    public final void LJFF(int i, int i2) {
    }

    @Override // X.VR1
    public final int LIZ() {
        return this.LJLJJI;
    }

    @Override // X.VR1
    public final int LIZIZ() {
        return this.LJLJI;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LJLILLLLZI == null) {
            LLog.LIZLLL(4, "gradient", "BackgroundGradientLayer.draw() must be called after setBounds()");
        }
        this.LJLJJL.setShader(this.LJLILLLLZI);
        Path path = this.LJLIL;
        if (path != null) {
            canvas.drawPath(path, this.LJLJJL);
        } else {
            canvas.drawRect(getBounds(), this.LJLJJL);
        }
    }

    public final void LJIIIIZZ(ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray2.size() != 0 && readableArray.size() != readableArray2.size()) {
            LLog.LIZLLL(4, "Gradient", "native parser error, color and stop must have same size");
            return;
        }
        this.LJLJJLL = new int[readableArray.size()];
        if (readableArray2.size() == readableArray.size()) {
            this.LJLJL = new float[readableArray2.size()];
        }
        int i = 0;
        while (true) {
            int[] iArr = this.LJLJJLL;
            if (i < iArr.length) {
                iArr[i] = readableArray.getInt(i);
                float[] fArr = this.LJLJL;
                if (fArr != null) {
                    fArr[i] = ((float) readableArray2.getDouble(i)) / 100.0f;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
