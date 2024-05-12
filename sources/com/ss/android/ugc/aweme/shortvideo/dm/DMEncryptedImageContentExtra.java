package com.ss.android.ugc.aweme.shortvideo.dm;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class DMEncryptedImageContentExtra extends F9E implements Serializable {

    @InterfaceC65349Pkn("img_height")
    public final int height;

    @InterfaceC65349Pkn("img_width")
    public final int width;

    public static /* synthetic */ DMEncryptedImageContentExtra copy$default(DMEncryptedImageContentExtra dMEncryptedImageContentExtra, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dMEncryptedImageContentExtra.width;
        }
        if ((i3 & 2) != 0) {
            i2 = dMEncryptedImageContentExtra.height;
        }
        return dMEncryptedImageContentExtra.copy(i, i2);
    }

    public final DMEncryptedImageContentExtra copy(int i, int i2) {
        return new DMEncryptedImageContentExtra(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)};
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public DMEncryptedImageContentExtra(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
