package com.ss.android.ugc.aweme.ug.brand;

import X.InterfaceC58304MuS;
import android.app.Activity;
import android.content.Context;

/* loaded from: classes11.dex */
public interface ITranssonicService {
    void applicationOnCreate(Context context, String str);

    InterfaceC58304MuS getSmartNetworkService();

    void mainOnCreate(Activity activity);

    void onVideoPlayBlock();

    void openCamera();

    void startNewPage(String str);

    void videoPlayStart();

    void waterMarkEnd();

    void waterMarkStart();
}
