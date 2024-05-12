package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: X.Ja5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49397Ja5 implements Serializable {
    public String LJLIL = "";
    public boolean LJLILLLLZI = true;
    public int LJLJI = -1;
    public String LJLJJI = "";
    public String LJLJJL = "";
    public User LJLJJLL;
    public static final C49415JaN Companion = new C49415JaN();
    public static final int $stable = 8;

    public static final C49407JaF newBuilder() {
        Companion.getClass();
        return new C49407JaF();
    }

    public final int getRank() {
        return this.LJLJI;
    }

    public final String getSearchKeyWord() {
        return this.LJLJJL;
    }

    public final String getSearchResultId() {
        return this.LJLIL;
    }

    public final String getTokenType() {
        return this.LJLJJI;
    }

    public final User getUser() {
        return this.LJLJJLL;
    }

    public final boolean isAladdin() {
        return this.LJLILLLLZI;
    }

    public final void setAladdin(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setRank(int i) {
        this.LJLJI = i;
    }

    public final void setSearchKeyWord(String str) {
        this.LJLJJL = str;
    }

    public final void setSearchResultId(String str) {
        this.LJLIL = str;
    }

    public final void setTokenType(String str) {
        this.LJLJJI = str;
    }

    public final void setUser(User user) {
        this.LJLJJLL = user;
    }
}
