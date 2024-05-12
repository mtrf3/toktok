package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.ENY;
import X.InterfaceC64977Pen;
import com.bytedance.retrofit2.mime.TypedFile;

/* loaded from: classes7.dex */
public interface CustomStickerApi {
    @ENY
    @E8M("/media/api/pic/iss")
    AbstractC73672Svk<CutoutResponse> cutoutSticker(@InterfaceC64977Pen("file") TypedFile typedFile);
}
