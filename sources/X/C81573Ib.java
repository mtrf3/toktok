package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81573Ib {
    public static final IMUser LIZ(IMContact contact) {
        o.LJIIIZ(contact, "contact");
        if (contact instanceof IMUser) {
            return (IMUser) contact;
        }
        if (contact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) contact;
            if (iMConversation.getConversationType() == AbstractC63505Ow9.LIZ) {
                return C80533Eb.LJIIJ(String.valueOf(C81273Gx.LIZLLL(iMConversation.getConversationId())), C79004UzY.LJIILIIL(iMConversation.getConversationId()));
            }
        }
        return null;
    }
}
