package X;

import com.ss.android.ugc.aweme.search.source.neo.model.SearchResult;
import defpackage.s;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Jr9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50455Jr9 extends AbstractC65781Prl implements InterfaceC88471Ynr<C50449Jr3, C50456JrA, C50449Jr3> {
    public static final C50455Jr9 LJLIL = new C50455Jr9();

    public C50455Jr9() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50449Jr3 invoke(C50449Jr3 c50449Jr3, C50456JrA c50456JrA) {
        C50449Jr3 lastState = c50449Jr3;
        C50456JrA action = c50456JrA;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        SearchResult searchResult = (SearchResult) ORZ.LLFII(lastState.LJLIL);
        if (searchResult == null || !o.LJ(action.LJLILLLLZI, searchResult.LJLILLLLZI)) {
            return lastState;
        }
        List<String> list = searchResult.gidList;
        if (list instanceof s) {
            if (list.contains(action.LJLIL)) {
                ((CopyOnWriteArrayList) list).remove(action.LJLIL);
            }
            ((s) list).add(action.LJLIL);
        }
        return C50449Jr3.LIZ(lastState, System.currentTimeMillis());
    }
}
