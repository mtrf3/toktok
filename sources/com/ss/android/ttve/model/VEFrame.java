package com.ss.android.ttve.model;

import X.C0ON;
import X.C16880lQ;
import X.C63900P6a;
import X.C63907P6h;
import X.EnumC46487IMh;
import X.InterfaceC63909P6j;
import X.P4M;
import X.P4Q;
import X.P6Z;
import X.Q7K;
import X.QC5;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.graphics.Bitmap;
import android.media.Image;
import android.opengl.EGLContext;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.i0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class VEFrame implements Parcelable {
    public static final Parcelable.Creator<VEFrame> CREATOR = new IDCreatorS54S0000000_11(57);
    public P6Z format;
    public boolean fromFrontCamera;
    public int height;
    public FrameBase mInternalFrame;
    public HashMap<String, String> mMetaDataMap;
    public int rotation;
    public long timeStamp;
    public int width;

    /* loaded from: classes12.dex */
    public static class ByteBufferFrame extends FrameBase {
        public InterfaceC63909P6j allocator;
        public ByteBuffer byteBuffer;

        @Override // com.ss.android.ttve.model.VEFrame.FrameBase
        public void recycle() {
            InterfaceC63909P6j interfaceC63909P6j = this.allocator;
            if (interfaceC63909P6j != null) {
                ByteBuffer byteBuffer = this.byteBuffer;
                QC5 qc5 = (QC5) interfaceC63909P6j;
                synchronized (qc5) {
                    if (byteBuffer != null) {
                        if (!((List) qc5.LIZ).contains(byteBuffer)) {
                            ((List) qc5.LIZ).add(byteBuffer);
                        }
                    }
                }
            }
        }

        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public ByteBufferFrame(ByteBuffer byteBuffer) {
            this.byteBuffer = byteBuffer;
        }

        public ByteBufferFrame(ByteBuffer byteBuffer, InterfaceC63909P6j interfaceC63909P6j) {
            this(byteBuffer);
            this.allocator = interfaceC63909P6j;
        }
    }

    /* loaded from: classes12.dex */
    public static class CacheableByteBufferFrame extends ByteBufferFrame {
        public InterfaceC63909P6j allocator;

        @Override // com.ss.android.ttve.model.VEFrame.ByteBufferFrame, com.ss.android.ttve.model.VEFrame.FrameBase
        public final void recycle() {
            InterfaceC63909P6j interfaceC63909P6j = this.allocator;
            if (interfaceC63909P6j != null) {
                ByteBuffer byteBuffer = this.byteBuffer;
                QC5 qc5 = (QC5) interfaceC63909P6j;
                synchronized (qc5) {
                    if (byteBuffer != null) {
                        if (!((List) qc5.LIZ).contains(byteBuffer)) {
                            ((List) qc5.LIZ).add(byteBuffer);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public static class YUVPlansFrame extends FrameBase {
        public P4M planes;

        public Image.Plane[] getPlanes() {
            return this.planes.LIZ;
        }

        public YUVPlansFrame(P4M p4m) {
            this.planes = p4m;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes12.dex */
    public static class TextureDescFrame extends FrameBase {
        public String texDesc;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(super.toString());
            LIZ.append(", texDesc:");
            LIZ.append(this.texDesc);
            return X1D.LIZIZ(LIZ);
        }

        public TextureDescFrame(String str) {
            this.texDesc = str;
        }
    }

    public int getFormatOrdinal() {
        return this.format.ordinal();
    }

    public byte[] getJpegData() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            P4Q.LIZJ("VEFrame", "get jpeg data failed, no internal frame!");
            return null;
        }
        if (this.format != P6Z.TEPIXEL_FORMAT_JPEG) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get jpeg data failed, internal frame format: ");
            LIZ.append(this.format);
            P4Q.LIZJ("VEFrame", X1D.LIZIZ(LIZ));
            return null;
        }
        if (!(frameBase instanceof ByteArrayFrame)) {
            return null;
        }
        return ((ByteArrayFrame) frameBase).getByteArray();
    }

    public VERenderContext getRenderContext() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            P4Q.LIZJ("VEFrame", "get render context failed, no internal frame!");
            return null;
        }
        if (!(frameBase instanceof TextureFrame)) {
            return null;
        }
        C63907P6h c63907P6h = new C63907P6h();
        EnumC46487IMh enumC46487IMh = EnumC46487IMh.VE_RENDER_ENV_OPENGL;
        VERenderContext vERenderContext = c63907P6h.LIZ;
        vERenderContext.envType = enumC46487IMh;
        vERenderContext.eglContext = ((TextureFrame) frameBase).context;
        return vERenderContext;
    }

    public int getTextureID() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            P4Q.LIZJ("VEFrame", "get texture id failed, no internal frame!");
            return -1;
        }
        if (!(frameBase instanceof TextureFrame)) {
            return -1;
        }
        return ((TextureFrame) frameBase).texID;
    }

    public float[] getTextureTransformMatrix() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            P4Q.LIZJ("VEFrame", "get texture transform matrix failed, no internal frame!");
            return null;
        }
        if (!(frameBase instanceof TextureFrame)) {
            return null;
        }
        float[] fArr = ((TextureFrame) frameBase).transformMatrix;
        if (fArr == null) {
            P4Q.LJII("VEFrame", "transform matrix data is null!");
        }
        return fArr;
    }

    public Image.Plane[] getYUVPlanes() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            P4Q.LIZJ("VEFrame", "get yuv data failed, no internal frame!");
            return null;
        }
        if (!(frameBase instanceof YUVPlansFrame)) {
            return null;
        }
        return ((YUVPlansFrame) frameBase).getPlanes();
    }

    public void recycle() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase != null) {
            frameBase.recycle();
        }
    }

    public Bitmap toBitmap() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            return null;
        }
        if (frameBase instanceof ByteBufferFrame) {
            if (this.format == P6Z.TEPixFmt_RGBA8 && this.rotation == 0) {
                ByteBuffer byteBuffer = ((ByteBufferFrame) frameBase).byteBuffer;
                byteBuffer.rewind();
                Bitmap createBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(byteBuffer);
                return createBitmap;
            }
        } else if (frameBase instanceof IntArrayFrame) {
            if (this.format == P6Z.TEPixFmt_RGBA8 && this.rotation == 0) {
                return Bitmap.createBitmap(((IntArrayFrame) frameBase).intArray, this.width, this.height, Bitmap.Config.ARGB_8888);
            }
        } else if ((frameBase instanceof ByteArrayFrame) && this.format == P6Z.TEPixFmt_RGBA8 && this.rotation == 0) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            createBitmap2.copyPixelsFromBuffer(ByteBuffer.wrap(((ByteArrayFrame) this.mInternalFrame).byteArray));
            return createBitmap2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toBitmap failed. Invalid mInternalFrame: ");
        LIZ.append(this.mInternalFrame.getClass().getName());
        P4Q.LIZJ("VEFrame", X1D.LIZIZ(LIZ));
        throw new UnsupportedOperationException("Conversion to bitmap is not supported!!!");
    }

    /* loaded from: classes12.dex */
    public static class ByteArrayFrame extends FrameBase {
        public byte[] byteArray;

        public byte[] getByteArray() {
            return this.byteArray;
        }

        public ByteArrayFrame(byte[] bArr) {
            this.byteArray = bArr;
        }
    }

    /* loaded from: classes12.dex */
    public static class FrameBase implements Parcelable {
        public static final Parcelable.Creator<FrameBase> CREATOR = new IDCreatorS54S0000000_11(56);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void recycle() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public FrameBase() {
        }

        public FrameBase(Parcel parcel) {
        }
    }

    /* loaded from: classes12.dex */
    public static class IntArrayFrame extends FrameBase {
        public int[] intArray;

        public int[] getIntArray() {
            return this.intArray;
        }

        public IntArrayFrame(int[] iArr) {
            this.intArray = iArr;
        }
    }

    public P6Z getFormat() {
        return this.format;
    }

    public FrameBase getFrame() {
        return this.mInternalFrame;
    }

    public int getHeight() {
        return this.height;
    }

    public HashMap<String, String> getMetaData() {
        return this.mMetaDataMap;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFromFrontCamera() {
        return this.fromFrontCamera;
    }

    public VEFrame(Parcel parcel) {
        P6Z p6z;
        boolean z;
        this.format = P6Z.TEPixFmt_Count;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            p6z = null;
        } else {
            p6z = P6Z.values()[readInt];
        }
        this.format = p6z;
        this.mInternalFrame = (FrameBase) parcel.readParcelable(FrameBase.class.getClassLoader());
        this.rotation = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.timeStamp = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.fromFrontCamera = z;
    }

    public static ByteBuffer allocateFrame(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b2 -> B:22:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0142 -> B:61:0x006e). Please report as a decompilation issue!!! */
    public void dumpImageToPath(String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (this.mInternalFrame == null) {
            P4Q.LIZJ("VEFrame", "dump image failed! internal frame is null!");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_");
        LIZ.append(this.width);
        LIZ.append("x");
        LIZ.append(this.height);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("_");
        LIZ2.append(System.currentTimeMillis());
        String LIZJ = C0ON.LIZJ(str, "_VEFrame", LIZIZ, X1D.LIZIZ(LIZ2));
        int i = C63900P6a.LIZ[this.format.ordinal()];
        FileOutputStream fileOutputStream3 = null;
        if (i != 1) {
            if (i != 2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("unexpected dump image format: ");
                LIZ3.append(this.format);
                P4Q.LIZJ("VEFrame", X1D.LIZIZ(LIZ3));
                return;
            }
            String LJFF = i0.LJFF(LIZJ, "_JPEG.jpeg");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Start to dump VEFrame to ");
            LIZ4.append(LJFF);
            P4Q.LJFF("VEFrame", X1D.LIZIZ(LIZ4));
            byte[] jpegData = getJpegData();
            try {
                try {
                } finally {
                    th = th;
                    if (fileOutputStream3 == null) {
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        P4Q.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                        C16880lQ.LLLLIIL(e);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                P4Q.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                C16880lQ.LLLLIIL(e2);
            }
            if (jpegData == null) {
                P4Q.LIZJ("VEImageUtils", "Input null data, failed to save jpeg!");
                return;
            }
            try {
                fileOutputStream2 = new FileOutputStream(LJFF);
            } catch (IOException e3) {
                e = e3;
            }
            try {
                fileOutputStream2.write(jpegData, 0, jpegData.length);
                fileOutputStream2.close();
            } catch (IOException e4) {
                e = e4;
                fileOutputStream3 = fileOutputStream2;
                P4Q.LIZJ("VEImageUtils", "save jpeg failed！");
                C16880lQ.LLLLIIL(e);
                if (fileOutputStream3 != null) {
                    fileOutputStream3.close();
                }
                return;
            }
            return;
        }
        String LJFF2 = i0.LJFF(LIZJ, "_YUV420.yuv");
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Start to dump VEFrame to ");
        LIZ5.append(LJFF2);
        P4Q.LJFF("VEFrame", X1D.LIZIZ(LIZ5));
        Image.Plane[] yUVPlanes = getYUVPlanes();
        int i2 = this.width;
        int i3 = this.height;
        if (yUVPlanes == null) {
            P4Q.LIZJ("VEImageUtils", "Input null plane, failed to save yuv!");
            return;
        }
        if (yUVPlanes[0] != null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(i2);
            allocate.putInt(i3);
            allocate.putInt(yUVPlanes[0].getPixelStride());
            allocate.putInt(yUVPlanes[0].getRowStride());
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(LJFF2);
                    } finally {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        if (fileOutputStream3 == null) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            P4Q.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                            C16880lQ.LLLLIIL(e5);
                            throw th;
                        }
                    }
                } catch (IOException e6) {
                    e = e6;
                }
            } catch (IOException e7) {
                P4Q.LIZJ("VEImageUtils", "close FileOutputStream failed!");
                C16880lQ.LLLLIIL(e7);
            }
            try {
                fileOutputStream.write(allocate.array());
                for (Image.Plane plane : yUVPlanes) {
                    ByteBuffer buffer = plane.getBuffer();
                    byte[] bArr = new byte[buffer.remaining()];
                    buffer.get(bArr);
                    fileOutputStream.write(bArr);
                    buffer.rewind();
                }
                fileOutputStream.close();
            } catch (IOException e8) {
                e = e8;
                fileOutputStream3 = fileOutputStream;
                P4Q.LIZJ("VEImageUtils", "save yuv failed!");
                C16880lQ.LLLLIIL(e);
                if (fileOutputStream3 != null) {
                    fileOutputStream3.close();
                }
                return;
            }
            return;
        }
        P4Q.LIZJ("VEImageUtils", "save yuv failed, plane is null");
    }

    public void setFromFrontCamera(boolean z) {
        this.fromFrontCamera = z;
    }

    public void setMetaData(HashMap<String, String> hashMap) {
        this.mMetaDataMap = hashMap;
    }

    /* loaded from: classes12.dex */
    public static class TextureFrame extends FrameBase {
        public EGLContext context;
        public int texID;
        public float[] transformMatrix;

        public TextureFrame(EGLContext eGLContext, int i) {
            this.context = eGLContext;
            this.texID = i;
        }

        public TextureFrame(EGLContext eGLContext, int i, float[] fArr) {
            this.context = eGLContext;
            this.texID = i;
            this.transformMatrix = fArr;
        }
    }

    public static VEFrame createByteBufferFrame(Bitmap bitmap, long j) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocateDirect(bitmap.getByteCount()).order(ByteOrder.LITTLE_ENDIAN);
        bitmap.copyPixelsToBuffer(order);
        VEFrame vEFrame = new VEFrame(bitmap.getWidth(), bitmap.getHeight(), 0, j, P6Z.TEPixFmt_RGBA8);
        vEFrame.mInternalFrame = new ByteBufferFrame(order);
        return vEFrame;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        P6Z p6z = this.format;
        if (p6z == null) {
            ordinal = -1;
        } else {
            ordinal = p6z.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeParcelable(this.mInternalFrame, i);
        parcel.writeInt(this.rotation);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.timeStamp);
        parcel.writeByte(this.fromFrontCamera ? (byte) 1 : (byte) 0);
    }

    public VEFrame(int i, int i2, int i3, long j, P6Z p6z) {
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.timeStamp = j;
        this.format = p6z;
    }

    public static VEFrame createByteArrayFrame(byte[] bArr, int i, int i2, int i3, long j, P6Z p6z) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, p6z);
        vEFrame.mInternalFrame = new ByteArrayFrame(bArr);
        return vEFrame;
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, int i4) {
        if (i4 < 0 || i4 >= P6Z.values().length) {
            Q7K.LJ("createByteBufferFrame failed. Invalid order: ", i4, "VEFrame");
            return null;
        }
        return createByteBufferFrame(byteBuffer, i, i2, i3, j, P6Z.values()[i4]);
    }

    public static VEFrame createIntArrayFrame(int[] iArr, int i, int i2, int i3, long j, P6Z p6z) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, p6z);
        vEFrame.mInternalFrame = new IntArrayFrame(iArr);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(String str, int i, int i2, int i3, long j, P6Z p6z) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, p6z);
        vEFrame.mInternalFrame = new TextureDescFrame(str);
        return vEFrame;
    }

    public static VEFrame createYUVPlanFrame(P4M p4m, int i, int i2, int i3, long j, P6Z p6z) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, p6z);
        vEFrame.mInternalFrame = new YUVPlansFrame(p4m);
        return vEFrame;
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, P6Z p6z) {
        return createByteBufferFrame(byteBuffer, i, i2, i3, j, p6z, null);
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, P6Z p6z, InterfaceC63909P6j interfaceC63909P6j) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, p6z);
        vEFrame.mInternalFrame = new ByteBufferFrame(byteBuffer, interfaceC63909P6j);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, P6Z p6z) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j, p6z);
        vEFrame.mInternalFrame = new TextureFrame(eGLContext, i);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(EGLContext eGLContext, int i, float[] fArr, int i2, int i3, int i4, long j, P6Z p6z) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j, p6z);
        vEFrame.mInternalFrame = new TextureFrame(eGLContext, i, fArr);
        return vEFrame;
    }
}
