package com.ss.android.ugc.aweme.commercialize.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DisclaimerText extends F9E implements Serializable {

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("url")
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public DisclaimerText() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DisclaimerText copy$default(DisclaimerText disclaimerText, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = disclaimerText.text;
        }
        if ((i2 & 2) != 0) {
            str2 = disclaimerText.url;
        }
        if ((i2 & 4) != 0) {
            str3 = disclaimerText.id;
        }
        if ((i2 & 8) != 0) {
            i = disclaimerText.type;
        }
        return disclaimerText.copy(str, str2, str3, i);
    }

    public final DisclaimerText copy(String text, String url, String id, int i) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(id, "id");
        return new DisclaimerText(text, url, id, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.text, this.url, this.id, Integer.valueOf(this.type)};
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.id = str;
    }

    public final void setText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.text = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }

    public DisclaimerText(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "text", str2, "url", str3, "id");
        this.text = str;
        this.url = str2;
        this.id = str3;
        this.type = i;
    }

    public /* synthetic */ DisclaimerText(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i);
    }
}
