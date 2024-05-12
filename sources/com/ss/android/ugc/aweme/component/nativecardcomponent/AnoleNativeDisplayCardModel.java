package com.ss.android.ugc.aweme.component.nativecardcomponent;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class AnoleNativeDisplayCardModel implements Serializable {

    @InterfaceC65349Pkn("log_info")
    public final AnoleLogInfo anoleLogInfo;

    @InterfaceC65349Pkn("image_url")
    public final String cardImageUrl;

    public final AnoleLogInfo getAnoleLogInfo() {
        return this.anoleLogInfo;
    }

    public final String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public AnoleNativeDisplayCardModel(AnoleLogInfo anoleLogInfo, String str) {
        this.anoleLogInfo = anoleLogInfo;
        this.cardImageUrl = str;
    }
}
