package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.4O5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4O5 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C4O8.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C4O7.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C4O9.LJLIL);

    public final LinkedHashSet<IMContact> LIZ() {
        return (LinkedHashSet) this.LIZIZ.getValue();
    }

    public final java.util.Set<IMContact> LIZIZ() {
        return (java.util.Set) this.LIZ.getValue();
    }

    public final java.util.Set<IMContact> LIZJ() {
        return (java.util.Set) this.LIZJ.getValue();
    }

    public final boolean LJ() {
        if (LIZJ().size() + LIZ().size() + LIZIZ().size() < 2) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(IMContact contact, boolean z) {
        IMConversation iMConversation;
        o.LJIIIZ(contact, "contact");
        if (contact instanceof IMConversation) {
            iMConversation = (IMConversation) contact;
        } else {
            iMConversation = null;
        }
        if (iMConversation != null && AbstractC63505Ow9.LIZIZ == iMConversation.getConversationType()) {
            C4O6.LIZ(contact, LIZIZ(), z);
            return;
        }
        if ((contact instanceof IMUser) && ((IMUser) contact).getFollowStatus() == 2) {
            if (IMUser.isSelf(((IMUser) contact).getUid())) {
                return;
            }
            C4O6.LIZ(contact, LIZ(), z);
            return;
        }
        C4O6.LIZ(contact, LIZJ(), z);
    }
}
