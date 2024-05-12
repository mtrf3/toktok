package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.Jid, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractCallableC49927Jid implements InterfaceC49794JgU, Callable {
    public boolean LJLIL;
    public SearchResultParam LJLILLLLZI;

    public abstract Object LIZIZ();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.LJLIL) {
            Object LIZIZ = LIZIZ();
            if (!this.LJLIL) {
                return LIZIZ;
            }
            throw new CancellationException();
        }
        throw new CancellationException();
    }

    @Override // X.InterfaceC49794JgU
    public final void LIZ(int i, String str) {
        this.LJLIL = true;
        SearchResultParam searchResultParam = this.LJLILLLLZI;
        if (searchResultParam != null) {
            C49920JiW LJ = C49921JiX.LJ(searchResultParam);
            LJ.LJI();
            LJ.LJIIJJI(2);
            LJ.LIZLLL();
            C49923JiZ LIZLLL = C49922JiY.LIZLLL(this.LJLILLLLZI);
            LIZLLL.LIZJ();
            LIZLLL.LJI(2);
            if (!o.LJ(LIZLLL, C49936Jim.LIZ)) {
                LIZLLL.LJIILIIL = i;
            }
            LIZLLL.LIZIZ();
            C49950Jj0.LJFF.LIZJ();
            C49950Jj0.LJ.LIZJ(2, str);
        }
    }
}
