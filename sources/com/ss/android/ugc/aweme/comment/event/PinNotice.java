package com.ss.android.ugc.aweme.comment.event;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PinNotice extends F9E {

    @InterfaceC65349Pkn("body")
    public final String body;

    @InterfaceC65349Pkn("pin")
    public final String pin;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("unpin")
    public final String unpin;

    /* JADX WARN: Multi-variable type inference failed */
    public PinNotice() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), this.title, this.body, this.pin, this.unpin};
    }

    public PinNotice(int i, String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "title", str2, "body", str3, "pin", str4, "unpin");
        this.type = i;
        this.title = str;
        this.body = str2;
        this.pin = str3;
        this.unpin = str4;
    }

    public /* synthetic */ PinNotice(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "");
    }
}
