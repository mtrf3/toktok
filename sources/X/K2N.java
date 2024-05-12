package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K2N implements InterfaceC57784Mm4 {
    public final Word LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof K2N) {
            K2N k2n = (K2N) interfaceC57784Mm4;
            if (o.LJ(k2n.LJLIL.getWord(), this.LJLIL.getWord()) && k2n.LJLILLLLZI == this.LJLILLLLZI) {
                return true;
            }
        }
        return false;
    }

    public K2N(Word word, int i) {
        o.LJIIIZ(word, "word");
        this.LJLIL = word;
        this.LJLILLLLZI = i;
    }
}
