package com.bytedance.android.livesdkapi.host;

import X.C31815CeB;
import X.C36781cQ;
import X.I2R;
import X.InterfaceC06390Mx;
import android.app.Activity;
import android.content.Context;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public interface IHostCreativeTool extends InterfaceC06390Mx {
    void Ab(ArrayList arrayList, C36781cQ c36781cQ);

    void BT();

    void Ku0(Activity activity, I2R i2r);

    void L50(String str, C31815CeB c31815CeB);

    EffectManager LJLJJLL();

    void Xl0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    String eB(String str);

    void hideStickerView();

    boolean isGalleryModuleInitialized();

    boolean isShowStickerView();

    void lh(I2R i2r);

    ResourceFinder rc(Context context, String str);

    void releaseGalleryModule();

    void resizePhoto(String str, String str2);

    void scanPhotoList();

    void selectFromGallery();
}
