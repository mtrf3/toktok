package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.MjU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57624MjU extends AbstractC65781Prl implements InterfaceC88471Ynr<RecSwipeCardListAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C57624MjU LJLIL = new C57624MjU();

    public C57624MjU() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(RecSwipeCardListAssem recSwipeCardListAssem, C43I<? extends Boolean> it) {
        RecSwipeCardListAssem selectSubscribe = recSwipeCardListAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        String str = selectSubscribe.c4().LJLJJLL;
        String str2 = selectSubscribe.LLFZ;
        if (str2 != null) {
            if (o.LJ(str, str2)) {
                if (selectSubscribe.LLII || !selectSubscribe.c4().LJLJLJ) {
                    selectSubscribe.LLIFFJFJJ = true;
                } else {
                    int i = selectSubscribe.a4().LJZL + 1;
                    C57586Mis c57586Mis = selectSubscribe.LL;
                    if (c57586Mis != null) {
                        if (i < c57586Mis.getItemCount()) {
                            selectSubscribe.b4().LJLIL(selectSubscribe.a4().LJZL + 1);
                        }
                    } else {
                        o.LJIJI("adapter");
                        throw null;
                    }
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("ownEventType");
        throw null;
    }
}
