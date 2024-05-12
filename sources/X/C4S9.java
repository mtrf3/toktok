package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.4S9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4S9 extends C4SB {
    public final IMContact LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("QuickShareContactData:%s", this.LIZ);
    }

    @Override // X.C4SB
    public final String LIZ() {
        String displayName = this.LIZ.getDisplayName();
        o.LJIIIIZZ(displayName, "contact.displayName");
        return displayName;
    }

    public C4S9(IMContact contact) {
        o.LJIIIZ(contact, "contact");
        this.LIZ = contact;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4S9)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C4S9) obj).LIZ}, new Object[]{this.LIZ});
    }
}
