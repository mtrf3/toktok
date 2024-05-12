package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Parser extends F9E {
    public final String format;
    public final String type;

    public static /* synthetic */ Parser copy$default(Parser parser, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parser.type;
        }
        if ((i & 2) != 0) {
            str2 = parser.format;
        }
        return parser.copy(str, str2);
    }

    public final Parser copy(String type, String format) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(format, "format");
        return new Parser(type, format);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.type, this.format};
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getType() {
        return this.type;
    }

    public Parser(String type, String format) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(format, "format");
        this.type = type;
        this.format = format;
    }
}
