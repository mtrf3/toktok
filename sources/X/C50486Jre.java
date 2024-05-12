package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jre, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50486Jre implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Word LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C50486Jre() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C50486Jre copy$default(C50486Jre c50486Jre, String str, String str2, Word word, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50486Jre.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c50486Jre.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            word = c50486Jre.LJLJI;
        }
        return c50486Jre.copy(str, str2, word);
    }

    public final C50486Jre copy(String str, String str2, Word word) {
        return new C50486Jre(str, str2, word);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50486Jre)) {
            return false;
        }
        C50486Jre c50486Jre = (C50486Jre) obj;
        return o.LJ(this.LJLIL, c50486Jre.LJLIL) && o.LJ(this.LJLILLLLZI, c50486Jre.LJLILLLLZI) && o.LJ(this.LJLJI, c50486Jre.LJLJI);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Word word = this.LJLJI;
        return hashCode2 + (word != null ? word.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchInputModel(hintWord=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hintWordId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", inboxWord=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getHintWord() {
        return this.LJLIL;
    }

    public final String getHintWordId() {
        return this.LJLILLLLZI;
    }

    public final Word getInboxWord() {
        return this.LJLJI;
    }

    public C50486Jre(String str, String str2, Word word) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = word;
    }

    public /* synthetic */ C50486Jre(String str, String str2, Word word, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : word);
    }
}
