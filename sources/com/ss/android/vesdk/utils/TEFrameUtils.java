package com.ss.android.vesdk.utils;

import X.EnumC63901P6b;
import X.P3Y;
import X.P4M;
import X.P6E;
import X.P6W;
import X.P6X;
import X.P6Z;
import android.media.Image;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VECameraSettings;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class TEFrameUtils {
    public static int TEFormat2ImageFormat(EnumC63901P6b enumC63901P6b) {
        int i = P6W.LIZ[enumC63901P6b.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            if (i != 3) {
                return -1;
            }
            return -2;
        }
        return -3;
    }

    public static ImageFrame TEImageFrame2ImageFrame(P6E p6e) {
        ByteBuffer byteBuffer = null;
        if (p6e == null) {
            return null;
        }
        EnumC63901P6b enumC63901P6b = p6e.LJII.LIZIZ;
        if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_YUV420) {
            P6X convert = TEPlanUtils.convert(p6e.LIZJ());
            int TEFormat2ImageFormat = TEFormat2ImageFormat(p6e.LJII.LIZIZ);
            TEFrameSizei tEFrameSizei = p6e.LJII.LIZ;
            return new ImageFrame(convert, TEFormat2ImageFormat, tEFrameSizei.width, tEFrameSizei.height);
        }
        if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_JPEG) {
            if (p6e.LIZ() != null) {
                byte[] LIZ = p6e.LIZ();
                int TEFormat2ImageFormat2 = TEFormat2ImageFormat(p6e.LJII.LIZIZ);
                TEFrameSizei tEFrameSizei2 = p6e.LJII.LIZ;
                return new ImageFrame(LIZ, TEFormat2ImageFormat2, tEFrameSizei2.width, tEFrameSizei2.height);
            }
            Image.Plane[] planeArr = p6e.LIZJ().LIZ;
            if (planeArr != null && planeArr.length > 0) {
                byteBuffer = planeArr[0].getBuffer();
            }
            byteBuffer.rewind();
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            int TEFormat2ImageFormat3 = TEFormat2ImageFormat(p6e.LJII.LIZIZ);
            TEFrameSizei tEFrameSizei3 = p6e.LJII.LIZ;
            return new ImageFrame(bArr, TEFormat2ImageFormat3, tEFrameSizei3.width, tEFrameSizei3.height);
        }
        if (enumC63901P6b != EnumC63901P6b.PIXEL_FORMAT_NV21) {
            return null;
        }
        byte[] LIZ2 = p6e.LIZ();
        int TEFormat2ImageFormat4 = TEFormat2ImageFormat(p6e.LJII.LIZIZ);
        TEFrameSizei tEFrameSizei4 = p6e.LJII.LIZ;
        return new ImageFrame(LIZ2, TEFormat2ImageFormat4, tEFrameSizei4.width, tEFrameSizei4.height);
    }

    public static VEFrame TEImageFrame2VEFrame(P6E p6e) {
        VEFrame vEFrame = null;
        r3 = null;
        ByteBuffer byteBuffer = null;
        if (p6e == null) {
            return null;
        }
        EnumC63901P6b enumC63901P6b = p6e.LJII.LIZIZ;
        boolean z = false;
        if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_YUV420) {
            P4M p4m = new P4M(p6e.LIZJ().LIZ);
            P3Y p3y = p6e.LJII;
            TEFrameSizei tEFrameSizei = p3y.LIZ;
            vEFrame = VEFrame.createYUVPlanFrame(p4m, tEFrameSizei.width, tEFrameSizei.height, p3y.LIZLLL, p6e.LIZJ, P6Z.TEPIXEL_FORMAT_YUV420);
        } else if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_JPEG) {
            if (p6e.LIZ() != null) {
                byte[] LIZ = p6e.LIZ();
                P3Y p3y2 = p6e.LJII;
                TEFrameSizei tEFrameSizei2 = p3y2.LIZ;
                vEFrame = VEFrame.createByteArrayFrame(LIZ, tEFrameSizei2.width, tEFrameSizei2.height, p3y2.LIZLLL, p6e.LIZJ, P6Z.TEPIXEL_FORMAT_JPEG);
            } else {
                Image.Plane[] planeArr = p6e.LIZJ().LIZ;
                if (planeArr != null && planeArr.length > 0) {
                    byteBuffer = planeArr[0].getBuffer();
                }
                byteBuffer.rewind();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                P3Y p3y3 = p6e.LJII;
                TEFrameSizei tEFrameSizei3 = p3y3.LIZ;
                vEFrame = VEFrame.createByteArrayFrame(bArr, tEFrameSizei3.width, tEFrameSizei3.height, p3y3.LIZLLL, p6e.LIZJ, P6Z.TEPIXEL_FORMAT_JPEG);
            }
        } else {
            if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_NV21) {
                byte[] LIZ2 = p6e.LIZ();
                P3Y p3y4 = p6e.LJII;
                TEFrameSizei tEFrameSizei4 = p3y4.LIZ;
                vEFrame = VEFrame.createByteArrayFrame(LIZ2, tEFrameSizei4.width, tEFrameSizei4.height, p3y4.LIZLLL, p6e.LIZJ, P6Z.TEPixFmt_NV21);
            }
            return vEFrame;
        }
        if (vEFrame != null) {
            if (p6e.LJII.LJ == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()) {
                z = true;
            }
            vEFrame.setFromFrontCamera(z);
        }
        return vEFrame;
    }

    public static ImageFrame VEFrame2ImageFrame(VEFrame vEFrame) {
        if (vEFrame == null) {
            return null;
        }
        if (vEFrame.getFormat() == P6Z.TEPIXEL_FORMAT_YUV420) {
            return new ImageFrame(new P6X(((VEFrame.YUVPlansFrame) vEFrame.getFrame()).getPlanes()), -2, vEFrame.getWidth(), vEFrame.getHeight());
        }
        if (vEFrame.getFormat() == P6Z.TEPIXEL_FORMAT_JPEG) {
            if (!(vEFrame.getFrame() instanceof VEFrame.ByteArrayFrame)) {
                return null;
            }
            return new ImageFrame(((VEFrame.ByteArrayFrame) vEFrame.getFrame()).getByteArray(), 1, vEFrame.getWidth(), vEFrame.getHeight());
        }
        if (vEFrame.getFormat() != P6Z.TEPixFmt_NV21 || !(vEFrame.getFrame() instanceof VEFrame.ByteArrayFrame)) {
            return null;
        }
        return new ImageFrame(((VEFrame.ByteArrayFrame) vEFrame.getFrame()).getByteArray(), -3, vEFrame.getWidth(), vEFrame.getHeight());
    }
}
