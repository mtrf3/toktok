package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class Body {

    @InterfaceC65349Pkn("command")
    public final Command command;

    @InterfaceC65349Pkn("style")
    public final Style style;

    /* JADX WARN: Multi-variable type inference failed */
    public Body() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Body)) {
            return false;
        }
        Body body = (Body) obj;
        return this.command == body.command && this.style == body.style;
    }

    public final int hashCode() {
        Command command = this.command;
        int hashCode = (command == null ? 0 : command.hashCode()) * 31;
        Style style = this.style;
        return hashCode + (style != null ? style.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Body(command=");
        LIZ.append(this.command);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Body(Command command, Style style) {
        this.command = command;
        this.style = style;
    }

    public /* synthetic */ Body(Command command, Style style, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : command, (i & 2) != 0 ? null : style);
    }
}
