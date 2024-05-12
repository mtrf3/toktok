package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SettingMessage implements Serializable {

    @InterfaceC65349Pkn("message")
    public final String content;

    @InterfaceC65349Pkn("expire_seconds")
    public final long expireSeconds;

    @InterfaceC65349Pkn("type")
    public final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingMessage() {
        this(0, null, 0L, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SettingMessage copy$default(SettingMessage settingMessage, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = settingMessage.type;
        }
        if ((i2 & 2) != 0) {
            str = settingMessage.content;
        }
        if ((i2 & 4) != 0) {
            j = settingMessage.expireSeconds;
        }
        return settingMessage.copy(i, str, j);
    }

    public final SettingMessage copy(int i, String str, long j) {
        return new SettingMessage(i, str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingMessage)) {
            return false;
        }
        SettingMessage settingMessage = (SettingMessage) obj;
        return this.type == settingMessage.type && o.LJ(this.content, settingMessage.content) && this.expireSeconds == settingMessage.expireSeconds;
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.content;
        return C16880lQ.LLJIJIL(this.expireSeconds) + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SettingMessage(type=");
        LIZ.append(this.type);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", expireSeconds=");
        return C47135Ieh.LIZIZ(LIZ, this.expireSeconds, ')', LIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getExpireSeconds() {
        return this.expireSeconds;
    }

    public final int getType() {
        return this.type;
    }

    public SettingMessage(int i, String str, long j) {
        this.type = i;
        this.content = str;
        this.expireSeconds = j;
    }

    public /* synthetic */ SettingMessage(int i, String str, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0L : j);
    }
}
