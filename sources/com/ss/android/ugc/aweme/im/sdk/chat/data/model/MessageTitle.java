package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageTitle extends F9E {
    public final boolean bold;

    @InterfaceC65349Pkn("color_type")
    public final int colorType;
    public final String title;

    public static /* synthetic */ MessageTitle copy$default(MessageTitle messageTitle, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = messageTitle.bold;
        }
        if ((i2 & 2) != 0) {
            str = messageTitle.title;
        }
        if ((i2 & 4) != 0) {
            i = messageTitle.colorType;
        }
        return messageTitle.copy(z, str, i);
    }

    public final MessageTitle copy(boolean z, String title, int i) {
        o.LJIIIZ(title, "title");
        return new MessageTitle(z, title, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.bold), this.title, Integer.valueOf(this.colorType)};
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final int getColorType() {
        return this.colorType;
    }

    public final String getTitle() {
        return this.title;
    }

    public MessageTitle(boolean z, String title, int i) {
        o.LJIIIZ(title, "title");
        this.bold = z;
        this.title = title;
        this.colorType = i;
    }

    public /* synthetic */ MessageTitle(boolean z, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i2 & 4) != 0 ? 0 : i);
    }
}
