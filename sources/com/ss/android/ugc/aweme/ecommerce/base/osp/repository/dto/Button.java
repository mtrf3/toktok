package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Button {

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    public static /* synthetic */ Button copy$default(Button button, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = button.type;
        }
        if ((i & 2) != 0) {
            str = button.text;
        }
        if ((i & 4) != 0) {
            str2 = button.link;
        }
        if ((i & 8) != 0) {
            str3 = button.name;
        }
        return button.copy(num, str, str2, str3);
    }

    public final Button copy(Integer num, String str, String str2, String str3) {
        return new Button(num, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return o.LJ(this.type, button.type) && o.LJ(this.text, button.text) && o.LJ(this.link, button.link) && o.LJ(this.name, button.name);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Button(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", name=");
        return q.LIZIZ(LIZ, this.name, ')', LIZ);
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getType() {
        return this.type;
    }

    public Button(Integer num, String str, String str2, String str3) {
        this.type = num;
        this.text = str;
        this.link = str2;
        this.name = str3;
    }
}
