package X;

import com.ss.android.ugc.aweme.nows.feed.ui.userrow.NowPostUserRowAssem;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.7jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194337jx extends AbstractC65781Prl implements InterfaceC88471Ynr<NowPostUserRowAssem, RelationStatus, C76800UCe> {
    public static final C194337jx LJLIL = new C194337jx();

    public C194337jx() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowPostUserRowAssem nowPostUserRowAssem, RelationStatus relationStatus) {
        String str;
        NowPostUserRowAssem selectSubscribe = nowPostUserRowAssem;
        RelationStatus relationStatus2 = relationStatus;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (relationStatus2 != null) {
            str = relationStatus2.getUid();
        } else {
            str = null;
        }
        if (o.LJ(str, ((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAuthorUid())) {
            selectSubscribe.n4((InterfaceC194547kI) C51029K0z.LJIILLIIL(selectSubscribe));
        }
        return C76800UCe.LIZ;
    }
}
