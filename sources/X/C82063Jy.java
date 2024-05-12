package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C82063Jy extends TBS implements InterfaceC88472Yns<C3L4, IMContact> {
    public C82063Jy(AbstractC113374cf abstractC113374cf) {
        super(1, abstractC113374cf, C81993Jr.class, "convert", "convert(Lcom/ss/android/ugc/aweme/im/service/session/BaseSession;)Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final IMContact invoke(C3L4 c3l4) {
        String str;
        IMConversation iMConversation;
        C3L4 p0 = c3l4;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        UrlModel urlModel = null;
        if (p0 instanceof C3L3) {
            C3L3 c3l3 = (C3L3) p0;
            long LIZLLL = C81273Gx.LIZLLL(c3l3.LJFF());
            if (LIZLLL <= 0) {
                return null;
            }
            if (c3l3.LJIJI() != null) {
                IMUser LJIJI = c3l3.LJIJI();
                o.LJI(LJIJI);
                C82073Jz.LIZ(LJIJI, c3l3);
                return LJIJI;
            }
            IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(LIZLLL), null);
            if (LJIIJ == 0) {
                return null;
            }
            C82073Jz.LIZ(LJIIJ, c3l3);
            iMConversation = LJIIJ;
        } else {
            if (!(p0 instanceof C3MY)) {
                return null;
            }
            C3MY c3my = (C3MY) p0;
            IMConversation iMConversation2 = new IMConversation();
            iMConversation2.setConversationId(c3my.LJLILLLLZI);
            iMConversation2.setConversationType(AbstractC63505Ow9.LIZIZ);
            iMConversation2.setConversationMemberCount(c3my.LLIIIILZ);
            iMConversation2.setStickTop(c3my.LJLLLL);
            Object obj = c3my.LJLJI;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                urlModel = new UrlModel();
                urlModel.setUrlList(C47261Igj.LJJIJ(str));
            }
            iMConversation2.setConversationAvatar(urlModel);
            iMConversation2.setConversationName(c3my.LJLJJI);
            iMConversation2.setType(1);
            iMConversation2.setIsRecentContact(1);
            iMConversation = iMConversation2;
        }
        return iMConversation;
    }
}
