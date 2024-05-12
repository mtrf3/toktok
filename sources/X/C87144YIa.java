package X;

import java.io.IOException;

/* renamed from: X.YIa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87144YIa extends IOException {
    public static final /* synthetic */ int LJLIL = 0;

    public static C87144YIa LIZ() {
        return new C87144YIa("Protocol message had invalid UTF-8.");
    }

    public static C87144YIa LIZIZ() {
        return new C87144YIa("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C87144YIa LIZJ() {
        return new C87144YIa("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C87144YIa(String str) {
        super(str);
    }
}
