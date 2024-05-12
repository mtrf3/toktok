package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.46d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1039546d extends AbstractC1039846g {
    public final List<SuggestedReply> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1039546d) && o.LJ(this.LIZ, ((C1039546d) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success(data=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1039546d(List<SuggestedReply> list) {
        this.LIZ = list;
    }
}
