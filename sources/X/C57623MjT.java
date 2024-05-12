package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.MjT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57623MjT extends AbstractC65781Prl implements InterfaceC88471Ynr<RecSwipeCardListAssem, C43I<? extends String>, C76800UCe> {
    public static final C57623MjT LJLIL = new C57623MjT();

    public C57623MjT() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(RecSwipeCardListAssem recSwipeCardListAssem, C43I<? extends String> c43i) {
        RecSwipeCardListAssem selectSubscribe = recSwipeCardListAssem;
        C43I<? extends String> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        T t = it.LIZ;
        if (t != 0) {
            String str = selectSubscribe.LLFZ;
            if (str != null) {
                if (o.LJ(t, str)) {
                    selectSubscribe.LLIIII = true;
                    if (selectSubscribe.a4().LJZL != -1) {
                        C57586Mis c57586Mis = selectSubscribe.LL;
                        if (c57586Mis != null) {
                            c57586Mis.clearData();
                            C57586Mis c57586Mis2 = selectSubscribe.LL;
                            if (c57586Mis2 != null) {
                                RecSwipeViewModel c4 = selectSubscribe.c4();
                                String str2 = selectSubscribe.LLFZ;
                                if (str2 != null) {
                                    c57586Mis2.addData(c4.kv0(str2));
                                } else {
                                    o.LJIJI("ownEventType");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("adapter");
                                throw null;
                            }
                        } else {
                            o.LJIJI("adapter");
                            throw null;
                        }
                    }
                }
            } else {
                o.LJIJI("ownEventType");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
