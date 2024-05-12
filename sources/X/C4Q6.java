package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Q6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Q6 {
    public static void LIZ(C4P0 adapter, final List oldList, final List list) {
        o.LJIIIZ(oldList, "oldList");
        o.LJIIIZ(adapter, "adapter");
        C03200Aq.LIZ(new AbstractC03120Ai(oldList, list) { // from class: X.4Pv
            public static final /* synthetic */ int LIZJ = 0;
            public final List<IMContact> LIZ;
            public final List<IMContact> LIZIZ;

            @Override // X.AbstractC03120Ai
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC03120Ai
            public final int LJ() {
                return this.LIZ.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(oldList, "oldList");
                this.LIZ = oldList;
                this.LIZIZ = list;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZ(int i, int i2) {
                Object obj = ListProtector.get(this.LIZIZ, i2);
                if ((obj instanceof C4QH) || (obj instanceof C4QE) || (obj instanceof C4QI) || (obj instanceof C4QC) || (obj instanceof C4QL) || (obj instanceof C4Q7) || (obj instanceof C108724Om) || (obj instanceof C4QN) || (obj instanceof C108734On) || (obj instanceof C4QM) || (obj instanceof C4QO)) {
                    return true;
                }
                if (!(obj instanceof C4NN) && !(obj instanceof IMConversation) && !(obj instanceof C81243Gu) && !(obj instanceof IMUser) && (obj instanceof IMUserBaseInfo)) {
                }
                return false;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZIZ(int i, int i2) {
                IMContact iMContact = (IMContact) ListProtector.get(this.LIZ, i);
                IMContact iMContact2 = (IMContact) ListProtector.get(this.LIZIZ, i2);
                if (iMContact instanceof C4QH) {
                    return iMContact2 instanceof C4QH;
                }
                if (iMContact instanceof C4QE) {
                    return iMContact2 instanceof C4QE;
                }
                if (iMContact instanceof C4QI) {
                    return iMContact2 instanceof C4QI;
                }
                if (iMContact instanceof C4QC) {
                    return iMContact2 instanceof C4QC;
                }
                if (iMContact instanceof C4QL) {
                    return iMContact2 instanceof C4QL;
                }
                if (iMContact instanceof C4Q7) {
                    return iMContact2 instanceof C4Q7;
                }
                if (iMContact instanceof C108724Om) {
                    return iMContact2 instanceof C108724Om;
                }
                if (iMContact instanceof C4QN) {
                    return iMContact2 instanceof C4QN;
                }
                if (iMContact instanceof C108734On) {
                    return iMContact2 instanceof C108734On;
                }
                if (iMContact instanceof C4QM) {
                    return iMContact2 instanceof C4QM;
                }
                if (iMContact instanceof C4QO) {
                    return iMContact2 instanceof C4QO;
                }
                if (iMContact instanceof C4NN) {
                    return iMContact2 instanceof C4NN;
                }
                if (!(iMContact instanceof IMConversation) ? !(!(iMContact instanceof C81243Gu) ? !(iMContact instanceof IMUser) ? !(iMContact instanceof IMUserBaseInfo) ? !(iMContact instanceof MAFIMUser) || !(iMContact2 instanceof MAFIMUser) || !o.LJ(((IMUser) iMContact).getUid(), ((IMUser) iMContact2).getUid()) : !(iMContact2 instanceof IMUserBaseInfo) || ((IMUserBaseInfo) iMContact).getUserId() != ((IMUserBaseInfo) iMContact2).getUserId() : !(iMContact2 instanceof IMUser) || !o.LJ(((IMUser) iMContact).getUid(), ((IMUser) iMContact2).getUid()) : !(iMContact2 instanceof C81243Gu) || !o.LJ(((C81243Gu) iMContact).getUid(), ((C81243Gu) iMContact2).getUid())) : !(!(iMContact2 instanceof IMConversation) || !o.LJ(((IMConversation) iMContact).getConversationId(), ((IMConversation) iMContact2).getConversationId()))) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC03120Ai
            public final Object LIZJ(int i, int i2) {
                Object obj = ListProtector.get(this.LIZIZ, i2);
                if ((obj instanceof C4NN) || (obj instanceof IMConversation) || (obj instanceof C81243Gu) || (obj instanceof IMUser) || (obj instanceof IMUserBaseInfo) || (obj instanceof MAFIMUser)) {
                    return C4QR.LIZ;
                }
                return null;
            }
        }, true).LIZJ(adapter);
    }
}
