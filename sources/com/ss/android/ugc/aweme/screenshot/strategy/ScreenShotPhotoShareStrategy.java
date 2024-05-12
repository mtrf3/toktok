package com.ss.android.ugc.aweme.screenshot.strategy;

import X.C62330OdC;
import X.C62358Ode;
import X.InterfaceC62225ObV;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotPhotoShareStrategy;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class ScreenShotPhotoShareStrategy<T extends SharePackage> extends ScreenshotPhotoShareStrategy<T> {
    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LIZ(InterfaceC62225ObV channel, SharePackage sharePackage) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(sharePackage, "sharePackage");
        String string = sharePackage.extras.getString("panel_source");
        if (string == null) {
            string = "";
        }
        if (TextUtils.equals("screenshot_popup", string) && !TextUtils.isEmpty(sharePackage.extras.getString("screenshot_image_path")) && !C62330OdC.LIZIZ.contains(channel.key())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final String LJII(InterfaceC62225ObV channel, SharePackage sharePackage) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(sharePackage, "sharePackage");
        String string = sharePackage.extras.getString("screenshot_image_path");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LIZJ(InterfaceC62225ObV channel, String str, int i) {
        o.LJIIIZ(channel, "channel");
        return C62358Ode.LIZIZ(channel, str, i);
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LIZLLL(InterfaceC62225ObV channel, String str, int i) {
        o.LJIIIZ(channel, "channel");
        if (C62358Ode.LIZIZ(channel, str, i) || TextUtils.equals(channel.key(), "email")) {
            return true;
        }
        return false;
    }
}
