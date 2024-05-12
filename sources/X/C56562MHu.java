package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.MHu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56562MHu<T> implements InterfaceC66992k3 {
    public final /* synthetic */ CopyOnWriteArraySet<String> LJLIL;

    public C56562MHu(CopyOnWriteArraySet<String> copyOnWriteArraySet) {
        this.LJLIL = copyOnWriteArraySet;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Aweme> interfaceC65052gv) {
        C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
        c73578SuE.onSuccess(JG5.LIZ().LIZ((String) ORZ.LJLLILLLL(this.LJLIL), null));
    }
}
