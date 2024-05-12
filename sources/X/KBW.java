package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBW implements C33Q {
    public final Word LJLIL;
    public final TemplateData LJLILLLLZI;

    public KBW() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KBW)) {
            return false;
        }
        KBW kbw = (KBW) obj;
        return o.LJ(this.LJLIL, kbw.LJLIL) && o.LJ(this.LJLILLLLZI, kbw.LJLILLLLZI);
    }

    public final int hashCode() {
        Word word = this.LJLIL;
        int hashCode = (word == null ? 0 : word.hashCode()) * 31;
        TemplateData templateData = this.LJLILLLLZI;
        return hashCode + (templateData != null ? templateData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestVMState(firstGuessWord=");
        LIZ.append(this.LJLIL);
        LIZ.append(", guessTemplateData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public KBW(Word word, TemplateData templateData) {
        this.LJLIL = word;
        this.LJLILLLLZI = templateData;
    }

    public static KBW LIZ(KBW kbw, Word word, TemplateData templateData, int i) {
        if ((i & 1) != 0) {
            word = kbw.LJLIL;
        }
        if ((i & 2) != 0) {
            templateData = kbw.LJLILLLLZI;
        }
        kbw.getClass();
        return new KBW(word, templateData);
    }
}
