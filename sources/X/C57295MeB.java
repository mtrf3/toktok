package X;

import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.MeB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57295MeB implements InterfaceC199367s4 {
    public final UserStoriesResponse LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C57295MeB) && o.LJ(this.LIZ, ((C57295MeB) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserStoryData(response=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C57295MeB(UserStoriesResponse userStoriesResponse) {
        this.LIZ = userStoriesResponse;
    }
}
