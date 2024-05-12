package com.ss.android.ugc.aweme.ug.brand;

import X.InterfaceC58304MuS;
import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TranssonicFakeService implements ITranssonicService {
    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void applicationOnCreate(Context context, String transsonicCode) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(transsonicCode, "transsonicCode");
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public InterfaceC58304MuS getSmartNetworkService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void mainOnCreate(Activity mainActivity) {
        o.LJIIIZ(mainActivity, "mainActivity");
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void onVideoPlayBlock() {
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void openCamera() {
    }

    public void recordEnd() {
    }

    public void recordStart() {
    }

    public void showGuideDialog() {
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void startNewPage(String pageName) {
        o.LJIIIZ(pageName, "pageName");
    }

    public void videoComposeEnd() {
    }

    public void videoComposeStart() {
    }

    public void videoPlayEnd() {
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void videoPlayStart() {
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void waterMarkEnd() {
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public void waterMarkStart() {
    }
}
