package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3NZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NZ extends AbstractC38521fE {
    public static final /* synthetic */ int LJLJI = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3NZ(C3R9 parameters) {
        super(parameters);
        o.LJIIIZ(parameters, "parameters");
    }

    public final boolean LJIIL(IMContact obj) {
        o.LJIIIZ(obj, "obj");
        Object obj2 = this.LJLILLLLZI;
        if (((C3R9) obj2).LIZ == 1 || ((C3R9) obj2).LJI) {
            if ((C83693Qf.LIZ() == 2 || C83693Qf.LIZ() == 3) && (obj instanceof IMUser) && !AV1.LJIILIIL(((IMUser) obj).getFollowStatus())) {
                return false;
            }
            if (obj instanceof IMUser) {
                IMUser iMUser = (IMUser) obj;
                if (iMUser.getShareStatus() == 2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("user has been filter ");
                    LIZ.append(iMUser.getUid());
                    LIZ.append(" shareStatus:");
                    LIZ.append(iMUser.getShareStatus());
                    C34B.LJI("CannotMessageFilter", X1D.LIZIZ(LIZ));
                    return false;
                }
            }
            if ((obj instanceof IMConversation) && ((IMConversation) obj).getConversationMemberCount() == 0) {
                return false;
            }
        }
        return true;
    }
}
