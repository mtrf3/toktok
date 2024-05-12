package X;

import android.hardware.Camera;

/* loaded from: classes16.dex */
public final class YQ2 implements Camera.PictureCallback {
    public final /* synthetic */ PZA LIZ;
    public final /* synthetic */ YQ4 LIZIZ;

    public YQ2(YQ4 yq42, PZA pza) {
        this.LIZIZ = yq42;
        this.LIZ = pza;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        int i;
        if (this.LIZ != null) {
            int pictureFormat = this.LIZIZ.LJJIL.getPictureFormat();
            Camera.Size pictureSize = this.LIZIZ.LJJIL.getPictureSize();
            int i2 = pictureSize.width;
            int i3 = pictureSize.height;
            StringBuilder LIZJ = C06460Ne.LIZJ("take picture format: ", pictureFormat, ", w: ", i2, ", h: ");
            LIZJ.append(i3);
            C63922P6w.LIZLLL("TECamera1", X1D.LIZIZ(LIZJ));
            EnumC63901P6b enumC63901P6b = EnumC63901P6b.PIXEL_FORMAT_JPEG;
            if (this.LIZIZ.LJIIIIZZ == 1) {
                i = 270;
            } else {
                i = 90;
            }
            if (pictureFormat == 17) {
                enumC63901P6b = EnumC63901P6b.PIXEL_FORMAT_NV21;
            }
            ((C63973P8v) this.LIZ).LIZ(new P6E(bArr, enumC63901P6b, i2, i3, i));
        }
    }
}
