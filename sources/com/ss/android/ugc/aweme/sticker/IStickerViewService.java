package com.ss.android.ugc.aweme.sticker;

import X.I2Y;
import X.InterfaceC139745e6;
import X.InterfaceC45328Hqe;
import android.app.Activity;

/* loaded from: classes8.dex */
public interface IStickerViewService {
    void hideStickerView();

    void initGalleryModule(Activity activity, I2Y i2y);

    boolean isGalleryModuleInitialized();

    boolean isShowStickerView();

    void release();

    void releaseGalleryModule();

    void removeScanPhotoListListener(I2Y i2y);

    void resizePhoto(String str, String str2);

    void scanPhotoList();

    void selectFromGallery();

    void setPixelLoopStickerPresenterSupplier(InterfaceC139745e6<InterfaceC45328Hqe> interfaceC139745e6);
}
