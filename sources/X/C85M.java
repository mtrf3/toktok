package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* renamed from: X.85M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85M {
    public final TextExtraStruct LIZ;

    public final boolean LIZ() {
        if (this.LIZ.getStart() >= 0 && this.LIZ.getEnd() >= 0 && this.LIZ.getStart() <= this.LIZ.getEnd()) {
            return true;
        }
        return false;
    }

    public C85M(TextExtraStruct textExtraStruct) {
        this.LIZ = textExtraStruct;
    }
}
