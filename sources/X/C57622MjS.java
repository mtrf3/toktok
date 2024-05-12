package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MjS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57622MjS extends AbstractC65781Prl implements InterfaceC88471Ynr<RecSwipeCardListAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C57622MjS LJLIL = new C57622MjS();

    public C57622MjS() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(RecSwipeCardListAssem recSwipeCardListAssem, C43I<? extends Integer> c43i) {
        Integer num;
        RecSwipeCardListAssem selectSubscribe = recSwipeCardListAssem;
        C43I<? extends Integer> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        String str = selectSubscribe.c4().LJLJJLL;
        String str2 = selectSubscribe.LLFZ;
        if (str2 != null) {
            if (o.LJ(str, str2) && !selectSubscribe.b4().LJJJLIIL() && (num = (Integer) it.LIZ) != null) {
                num.intValue();
                if (num.intValue() >= 0) {
                    int intValue = num.intValue();
                    C57586Mis c57586Mis = selectSubscribe.LL;
                    if (c57586Mis != null) {
                        if (intValue < c57586Mis.getItemCount()) {
                            C57586Mis c57586Mis2 = selectSubscribe.LL;
                            if (c57586Mis2 != null) {
                                List<RecUser> data = c57586Mis2.getData();
                                if (data != null) {
                                    ListProtector.remove(data, num.intValue());
                                }
                                C57586Mis c57586Mis3 = selectSubscribe.LL;
                                if (c57586Mis3 != null) {
                                    c57586Mis3.notifyItemRemoved(num.intValue());
                                } else {
                                    o.LJIJI("adapter");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("adapter");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("adapter");
                        throw null;
                    }
                }
                C57586Mis c57586Mis4 = selectSubscribe.LL;
                if (c57586Mis4 != null) {
                    if (c57586Mis4.getItemCount() == 0) {
                        C2U8.LIZ(new C55206Lla());
                    }
                } else {
                    o.LJIJI("adapter");
                    throw null;
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("ownEventType");
        throw null;
    }
}
