package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JV9 implements InterfaceC57784Mm4 {
    public final ClickSearchWord LJLIL;
    public final JP4 LJLILLLLZI;
    public final JQA LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JV9)) {
            return false;
        }
        JV9 jv9 = (JV9) obj;
        return o.LJ(this.LJLIL, jv9.LJLIL) && o.LJ(this.LJLILLLLZI, jv9.LJLILLLLZI) && o.LJ(this.LJLJI, jv9.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + ((this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WordItem(word=");
        LIZ.append(this.LJLIL);
        LIZ.append(", fullData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mobParam=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public JV9(ClickSearchWord word, JP4 jp4, JQA jqa) {
        o.LJIIIZ(word, "word");
        this.LJLIL = word;
        this.LJLILLLLZI = jp4;
        this.LJLJI = jqa;
    }
}
