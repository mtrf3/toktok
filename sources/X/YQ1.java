package X;

import android.hardware.Camera;

/* loaded from: classes16.dex */
public final class YQ1 implements Camera.PictureCallback {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ PZA LIZIZ;
    public final /* synthetic */ YQ4 LIZJ;

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("capture data arrive consume: ");
        LIZ.append(System.currentTimeMillis() - this.LIZ);
        C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZ));
        Camera camera2 = this.LIZJ.LJJIJLIJ;
        if (camera2 != null) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "3958460556082944801");
            if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera2, objArr, "void", c65300Pk0).LIZ) {
                c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera2, c65300Pk0, false);
            } else {
                camera2.stopPreview();
                c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera2, c65300Pk0, true);
            }
        }
        if (this.LIZIZ != null) {
            int pictureFormat = this.LIZJ.LJJIL.getPictureFormat();
            Camera.Size pictureSize = this.LIZJ.LJJIL.getPictureSize();
            int i2 = pictureSize.width;
            int i3 = pictureSize.height;
            StringBuilder LIZJ = C06460Ne.LIZJ("take picture format: ", pictureFormat, ", w: ", i2, ", h: ");
            LIZJ.append(i3);
            C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZJ));
            EnumC63901P6b enumC63901P6b = EnumC63901P6b.PIXEL_FORMAT_JPEG;
            if (this.LIZJ.LJIIIIZZ == 1) {
                i = 270;
            } else {
                i = 90;
            }
            if (pictureFormat == 17) {
                enumC63901P6b = EnumC63901P6b.PIXEL_FORMAT_NV21;
            }
            ((C63973P8v) this.LIZIZ).LIZ(new P6E(bArr, enumC63901P6b, i2, i3, i));
        }
    }

    public YQ1(YQ4 yq42, long j, PZA pza) {
        this.LIZJ = yq42;
        this.LIZ = j;
        this.LIZIZ = pza;
    }
}
