package X;

import android.opengl.Matrix;
import android.os.Bundle;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.VFo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79436VFo extends GestureDetector.SimpleOnGestureListener implements InterfaceC79442VFu {
    public float[] LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public boolean LJLJJL = true;
    public EnumC79440VFs LJLJJLL;
    public final Display LJLJL;
    public EnumC79440VFs LJLJLJ;

    @Override // X.InterfaceC79442VFu
    public final void LIZ(Bundle bundle) {
    }

    @Override // X.InterfaceC79442VFu
    public final void reset() {
        this.LJLJI = 0.0f;
        this.LJLJJI = 0.0f;
    }

    @Override // X.InterfaceC79442VFu
    public final void stop() {
    }

    @Override // X.InterfaceC79442VFu
    public final void start() {
        float[] fArr = new float[16];
        this.LJLIL = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public C79436VFo(Display display) {
        EnumC79440VFs enumC79440VFs = EnumC79440VFs.PORTRAIT;
        this.LJLJJLL = enumC79440VFs;
        this.LJLJLJ = enumC79440VFs;
        this.LJLJL = display;
    }

    @Override // X.InterfaceC79442VFu
    public final void LIZIZ(float[] fArr) {
        System.arraycopy(this.LJLIL, 0, fArr, 0, fArr.length);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3 = this.LJLILLLLZI;
        float f4 = (float) (((f / f3) / 3.141592653589793d) * 180.0d);
        float f5 = (float) (((f2 / f3) / 3.141592653589793d) * 180.0d);
        if (!this.LJLJJL) {
            this.LJLJI += f5;
            this.LJLJJI += f4;
            return true;
        }
        int i = C79441VFt.LIZ[this.LJLJLJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LJLJI -= f4;
                        this.LJLJJI += f5;
                    }
                } else {
                    this.LJLJI -= f5;
                    this.LJLJJI -= f4;
                }
            } else {
                this.LJLJI += f4;
                this.LJLJJI -= f5;
            }
        } else {
            this.LJLJI += f5;
            this.LJLJJI += f4;
        }
        return true;
    }
}
