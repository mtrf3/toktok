package com.ss.android.ugc.aweme.miniapp_api.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MiniAppCard extends F9E implements Serializable {

    @InterfaceC65349Pkn("image_url")
    public String imageUrl;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("wait_time")
    public int waitTime;

    public MiniAppCard() {
    }

    public static /* synthetic */ MiniAppCard copy$default(MiniAppCard miniAppCard, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = miniAppCard.imageUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = miniAppCard.text;
        }
        if ((i2 & 4) != 0) {
            i = miniAppCard.waitTime;
        }
        return miniAppCard.copy(str, str2, i);
    }

    public final MiniAppCard copy(String imageUrl, String text, int i) {
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(text, "text");
        return new MiniAppCard(imageUrl, text, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.imageUrl, this.text, Integer.valueOf(this.waitTime)};
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final void setImageUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.text = str;
    }

    public final void setWaitTime(int i) {
        this.waitTime = i;
    }

    public MiniAppCard(String imageUrl, String text, int i) {
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(text, "text");
        this.imageUrl = imageUrl;
        this.text = text;
        this.waitTime = i;
    }
}
