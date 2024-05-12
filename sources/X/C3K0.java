package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3K0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K0 {
    public static final /* synthetic */ int LIZ = 0;

    public static final IMContact LIZ(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        if (conversation.getConversationType() == AbstractC63505Ow9.LIZ) {
            long LIZLLL = C81273Gx.LIZLLL(conversation.getConversationId());
            return C80533Eb.LJIIJ(String.valueOf(LIZLLL), C79004UzY.LJIILJJIL(conversation));
        }
        return LIZIZ(conversation);
    }

    public static final IMConversation LIZIZ(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationType(conversation.getConversationType());
        iMConversation.setConversationId(conversation.getConversationId());
        iMConversation.setConversationMemberCount(conversation.getMemberCount());
        C63088OpQ coreInfo = conversation.getCoreInfo();
        if (coreInfo != null) {
            iMConversation.setConversationName(coreInfo.getName());
        }
        C81093Gf.LIZ().getClass();
        iMConversation.setConversationAvatar(C3IY.LIZJ(conversation));
        iMConversation.setInitialLetter(C86970YBi.LIZIZ.LIZIZ(iMConversation.getDisplayName()));
        return iMConversation;
    }

    public static final String LIZJ(IMContact contact) {
        o.LJIIIZ(contact, "contact");
        if (contact instanceof IMConversation) {
            return ((IMConversation) contact).getConversationId();
        }
        if (contact instanceof IMUser) {
            String uid = ((IMUser) contact).getUid();
            o.LJIIIIZZ(uid, "contact.uid");
            return C81273Gx.LIZIZ(CastLongProtector.parseLong(uid));
        }
        return null;
    }

    public static final List<String> LIZLLL(IMContact[] contactArray) {
        o.LJIIIZ(contactArray, "contactArray");
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : contactArray) {
            if (iMContact instanceof IMConversation) {
                arrayList.add(((IMConversation) iMContact).getConversationId());
            } else if (iMContact instanceof IMUser) {
                String uid = ((IMUser) iMContact).getUid();
                o.LJIIIIZZ(uid, "contact.uid");
                arrayList.add(C81273Gx.LIZIZ(CastLongProtector.parseLong(uid)));
            }
        }
        return arrayList;
    }

    public static final void LJ(Context context, IMContact iMContact, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == AbstractC63505Ow9.LIZIZ) {
                InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                C98593tv c98593tv = new C98593tv(context, 3, iMConversation.getConversationId());
                c98593tv.setEnterFrom(6);
                c98593tv.setEnterMethodForMob("share_toast");
                c98593tv.setEnterFromForMob("");
                imChatService.LJFF(c98593tv);
                return;
            }
        }
        interfaceC65784Pro.invoke();
    }
}
