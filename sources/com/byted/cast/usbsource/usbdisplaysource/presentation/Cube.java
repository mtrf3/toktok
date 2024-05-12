package com.byted.cast.usbsource.usbdisplaysource.presentation;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes29.dex */
public class Cube {
    public IntBuffer mColorBuffer;
    public ByteBuffer mIndexBuffer;
    public IntBuffer mVertexBuffer;

    public Cube() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(96);
        allocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        this.mVertexBuffer = asIntBuffer;
        asIntBuffer.put(new int[]{-65536, -65536, -65536, 65536, -65536, -65536, 65536, 65536, -65536, -65536, 65536, -65536, -65536, -65536, 65536, 65536, -65536, 65536, 65536, 65536, 65536, -65536, 65536, 65536});
        this.mVertexBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(128);
        allocateDirect2.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer2 = allocateDirect2.asIntBuffer();
        this.mColorBuffer = asIntBuffer2;
        asIntBuffer2.put(new int[]{0, 0, 0, 65536, 65536, 0, 0, 65536, 65536, 65536, 0, 65536, 0, 65536, 0, 65536, 0, 0, 65536, 65536, 65536, 0, 65536, 65536, 65536, 65536, 65536, 65536, 0, 65536, 65536, 65536});
        this.mColorBuffer.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(36);
        this.mIndexBuffer = allocateDirect3;
        allocateDirect3.put(new byte[]{0, 4, 5, 0, 5, 1, 1, 5, 6, 1, 6, 2, 2, 6, 7, 2, 7, 3, 3, 7, 4, 3, 4, 0, 4, 7, 6, 4, 6, 5, 3, 0, 1, 3, 1, 2});
        this.mIndexBuffer.position(0);
    }

    public void draw(GL10 gl10) {
        gl10.glFrontFace(2304);
        gl10.glVertexPointer(3, 5132, 0, this.mVertexBuffer);
        gl10.glColorPointer(4, 5132, 0, this.mColorBuffer);
        gl10.glDrawElements(4, 36, 5121, this.mIndexBuffer);
    }
}
