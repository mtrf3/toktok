package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80173Cr extends AbstractC65781Prl implements InterfaceC88471Ynr<List<IMContact>, Boolean, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC80183Cs LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80173Cr(int i, InterfaceC80183Cs interfaceC80183Cs) {
        super(2);
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC80183Cs;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(List<IMContact> list, Boolean bool) {
        String str;
        List<IMContact> list2 = list;
        bool.booleanValue();
        o.LJIIIZ(list2, "list");
        User LIZJ = C80763Ey.LIZJ();
        if (LIZJ != null) {
            str = LIZJ.getUid();
        } else {
            str = null;
        }
        int min = Math.min(list2.size(), this.LJLIL);
        InterfaceC80183Cs interfaceC80183Cs = this.LJLILLLLZI;
        if (interfaceC80183Cs != null) {
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list2) {
                if ((iMContact instanceof IMUser) && !o.LJ(((IMUser) iMContact).getUid(), str)) {
                    arrayList.add(iMContact);
                }
                if (arrayList.size() >= min) {
                    break;
                }
            }
            interfaceC80183Cs.LIZ(arrayList);
        }
        return C76800UCe.LIZ;
    }
}
