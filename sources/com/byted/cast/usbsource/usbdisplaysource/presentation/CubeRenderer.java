package com.byted.cast.usbsource.usbdisplaysource.presentation;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes29.dex */
public class CubeRenderer implements GLSurfaceView.Renderer {
    public float mAngle;
    public boolean mExploding;
    public boolean mTranslucentBackground;
    public float mScale = 1.0f;
    public Cube mCube = new Cube();

    public void explode() {
        this.mExploding = true;
    }

    public CubeRenderer(boolean z) {
        this.mTranslucentBackground = z;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        gl10.glClear(16640);
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        gl10.glTranslatef(0.0f, 0.0f, -3.0f);
        gl10.glRotatef(this.mAngle, 0.0f, 1.0f, 0.0f);
        gl10.glRotatef(this.mAngle * 0.25f, 1.0f, 0.0f, 0.0f);
        gl10.glEnableClientState(32884);
        gl10.glEnableClientState(32886);
        float f = this.mScale;
        gl10.glScalef(f, f, f);
        this.mCube.draw(gl10);
        gl10.glRotatef(this.mAngle * 2.0f, 0.0f, 1.0f, 1.0f);
        gl10.glTranslatef(0.5f, 0.5f, 0.5f);
        this.mCube.draw(gl10);
        this.mAngle += 1.2f;
        if (this.mExploding) {
            float f2 = this.mScale * 1.02f;
            this.mScale = f2;
            if (f2 > 4.0f) {
                this.mScale = 1.0f;
                this.mExploding = false;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        gl10.glDisable(3024);
        gl10.glHint(3152, 4353);
        if (this.mTranslucentBackground) {
            gl10.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            gl10.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        }
        gl10.glEnable(2884);
        gl10.glShadeModel(7425);
        gl10.glEnable(2929);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        gl10.glViewport(0, 0, i, i2);
        float f = i / i2;
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        gl10.glFrustumf(-f, f, -1.0f, 1.0f, 1.0f, 10.0f);
    }
}
