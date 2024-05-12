package com.ss.android.ugc.aweme.feed.model.live;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Text extends F9E implements Serializable {

    @InterfaceC65349Pkn("default_format")
    @InterfaceC65404Plg(RawStringJsonAdapter.class)
    public String defaultFormat;

    @InterfaceC65349Pkn("default_pattern")
    public String defaultPattern;

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("pieces")
    @InterfaceC65404Plg(RawStringJsonAdapter.class)
    public String pieces;

    /* JADX WARN: Multi-variable type inference failed */
    public Text() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Text copy$default(Text text, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = text.key;
        }
        if ((i & 2) != 0) {
            str2 = text.defaultPattern;
        }
        if ((i & 4) != 0) {
            str3 = text.defaultFormat;
        }
        if ((i & 8) != 0) {
            str4 = text.pieces;
        }
        return text.copy(str, str2, str3, str4);
    }

    public final Text copy(String key, String defaultPattern, String defaultFormat, String pieces) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(defaultPattern, "defaultPattern");
        o.LJIIIZ(defaultFormat, "defaultFormat");
        o.LJIIIZ(pieces, "pieces");
        return new Text(key, defaultPattern, defaultFormat, pieces);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.key, this.defaultPattern, this.defaultFormat, this.pieces};
    }

    public final String getDefaultFormat() {
        return this.defaultFormat;
    }

    public final String getDefaultPattern() {
        return this.defaultPattern;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPieces() {
        return this.pieces;
    }

    public final void setDefaultFormat(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.defaultFormat = str;
    }

    public final void setDefaultPattern(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.defaultPattern = str;
    }

    public final void setKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.key = str;
    }

    public final void setPieces(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.pieces = str;
    }

    public Text(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "key", str2, "defaultPattern", str3, "defaultFormat", str4, "pieces");
        this.key = str;
        this.defaultPattern = str2;
        this.defaultFormat = str3;
        this.pieces = str4;
    }

    public /* synthetic */ Text(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
