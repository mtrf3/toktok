package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumProfileBannerResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E86 implements C33Q {
    public final AbstractC72932td<TiktokV1ForumProfileBannerResponse> LJLIL;
    public final Long LJLILLLLZI;
    public final Long LJLJI;
    public final Boolean LJLJJI;
    public final boolean LJLJJL;
    public final C43I<C76800UCe> LJLJJLL;
    public final User LJLJL;

    public E86() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E86)) {
            return false;
        }
        E86 e86 = (E86) obj;
        return o.LJ(this.LJLIL, e86.LJLIL) && o.LJ(this.LJLILLLLZI, e86.LJLILLLLZI) && o.LJ(this.LJLJI, e86.LJLJI) && o.LJ(this.LJLJJI, e86.LJLJJI) && this.LJLJJL == e86.LJLJJL && o.LJ(this.LJLJJLL, e86.LJLJJLL) && o.LJ(this.LJLJL, e86.LJLJL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaBannerState(response=");
        LIZ.append(this.LJLIL);
        LIZ.append(", answersCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", questionsCount=");
        LIZ.append(this.LJLJI);
        LIZ.append(", allowAskQuestion=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", requestDisableQuestions=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", removeSearchBarEditTextFocus=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", user=");
        LIZ.append(this.LJLJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.LJLIL.hashCode() * 31;
        Long l = this.LJLILLLLZI;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        Long l2 = this.LJLJI;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.LJLJJI;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LJLJJL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJJLL, (i4 + i5) * 31, 31);
        User user = this.LJLJL;
        if (user != null) {
            i = user.hashCode();
        }
        return LIZIZ + i;
    }

    public /* synthetic */ E86(int i) {
        this(C33X.LIZ, 0L, 0L, null, false, new C43I(C76800UCe.LIZ), null);
    }

    public E86(AbstractC72932td<TiktokV1ForumProfileBannerResponse> response, Long l, Long l2, Boolean bool, boolean z, C43I<C76800UCe> removeSearchBarEditTextFocus, User user) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(removeSearchBarEditTextFocus, "removeSearchBarEditTextFocus");
        this.LJLIL = response;
        this.LJLILLLLZI = l;
        this.LJLJI = l2;
        this.LJLJJI = bool;
        this.LJLJJL = z;
        this.LJLJJLL = removeSearchBarEditTextFocus;
        this.LJLJL = user;
    }

    public static E86 LIZ(E86 e86, AbstractC72932td abstractC72932td, Long l, Long l2, Boolean bool, boolean z, C43I c43i, User user, int i) {
        User user2 = user;
        Long l3 = l;
        AbstractC72932td response = abstractC72932td;
        Long l4 = l2;
        Boolean bool2 = bool;
        boolean z2 = z;
        C43I removeSearchBarEditTextFocus = c43i;
        if ((i & 1) != 0) {
            response = e86.LJLIL;
        }
        if ((i & 2) != 0) {
            l3 = e86.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            l4 = e86.LJLJI;
        }
        if ((i & 8) != 0) {
            bool2 = e86.LJLJJI;
        }
        if ((i & 16) != 0) {
            z2 = e86.LJLJJL;
        }
        if ((i & 32) != 0) {
            removeSearchBarEditTextFocus = e86.LJLJJLL;
        }
        if ((i & 64) != 0) {
            user2 = e86.LJLJL;
        }
        e86.getClass();
        o.LJIIIZ(response, "response");
        o.LJIIIZ(removeSearchBarEditTextFocus, "removeSearchBarEditTextFocus");
        return new E86(response, l3, l4, bool2, z2, removeSearchBarEditTextFocus, user2);
    }
}
