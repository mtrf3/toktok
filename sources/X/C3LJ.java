package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3LJ, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3LJ extends AbstractC38521fE {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C3NZ LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3LJ(C3R9 parameters) {
        super(parameters);
        o.LJIIIZ(parameters, "parameters");
        this.LJLJI = new C3NZ(parameters);
    }

    public boolean LJIIL(IMContact obj) {
        o.LJIIIZ(obj, "obj");
        if (!this.LJLJI.LJIIL(obj)) {
            return false;
        }
        if (obj instanceof IMUser) {
            IMUser iMUser = (IMUser) obj;
            int followStatus = iMUser.getFollowStatus();
            if (((C3R9) this.LJLILLLLZI).LJII && !AV1.LJIJI(iMUser.getUid()) && followStatus != 2) {
                return false;
            }
            C3R9 c3r9 = (C3R9) this.LJLILLLLZI;
            if (c3r9.LIZIZ && followStatus != 2) {
                return false;
            }
            if (c3r9.LJFF && iMUser.isBlock()) {
                return false;
            }
            this.LJLILLLLZI.getClass();
        } else {
            if (!(obj instanceof IMConversation)) {
                return false;
            }
            C3R9 c3r92 = (C3R9) this.LJLILLLLZI;
            if (c3r92.LIZIZ && c3r92.LIZ != 3) {
                return false;
            }
        }
        return true;
    }
}
