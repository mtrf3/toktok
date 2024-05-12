package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.StickerInfo;

/* loaded from: classes8.dex */
public interface HJ4 {
    StickerInfo buildStickerInfo(C82622Wbi c82622Wbi);

    boolean enablePhotoTab(ShortVideoContext shortVideoContext);

    boolean enlargeEffectAndUploadEntrance();

    int getSurfaceTopMargin(Context context);

    String getTabName();

    void mobTakePhoto(ShortVideoContext shortVideoContext, long j, long j2, C82622Wbi c82622Wbi, InterfaceC88472Yns<? super C145995oB, C76800UCe> interfaceC88472Yns);

    void resetSurface(View view, Context context);
}
