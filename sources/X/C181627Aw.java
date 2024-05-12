package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.7Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181627Aw implements C33Q {
    public final AbstractC72932td<BaseResponse> LJLIL;
    public final CommentRethinkPopup LJLILLLLZI;
    public final C43I<OSZ<Integer, String>> LJLJI;
    public final UpvoteStruct LJLJJI;
    public final Integer LJLJJL;
    public final Boolean LJLJJLL;

    public C181627Aw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C181627Aw)) {
            return false;
        }
        C181627Aw c181627Aw = (C181627Aw) obj;
        return o.LJ(this.LJLIL, c181627Aw.LJLIL) && o.LJ(this.LJLILLLLZI, c181627Aw.LJLILLLLZI) && o.LJ(this.LJLJI, c181627Aw.LJLJI) && o.LJ(this.LJLJJI, c181627Aw.LJLJJI) && o.LJ(this.LJLJJL, c181627Aw.LJLJJL) && o.LJ(this.LJLJJLL, c181627Aw.LJLJJLL);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        CommentRethinkPopup commentRethinkPopup = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (commentRethinkPopup == null ? 0 : commentRethinkPopup.hashCode())) * 31;
        C43I<OSZ<Integer, String>> c43i = this.LJLJI;
        int hashCode3 = (hashCode2 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        UpvoteStruct upvoteStruct = this.LJLJJI;
        int hashCode4 = (hashCode3 + (upvoteStruct == null ? 0 : upvoteStruct.hashCode())) * 31;
        Integer num = this.LJLJJL;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJLJJLL;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvotePublishState(request=");
        LIZ.append(this.LJLIL);
        LIZ.append(", rethinkPopup=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", publishEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", targetUpvote=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", upvotePublishPosition=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", onlyAddComment=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C181627Aw(int i) {
        this(C33X.LIZ, null, null, null, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C181627Aw(AbstractC72932td<? extends BaseResponse> request, CommentRethinkPopup commentRethinkPopup, C43I<OSZ<Integer, String>> c43i, UpvoteStruct upvoteStruct, Integer num, Boolean bool) {
        o.LJIIIZ(request, "request");
        this.LJLIL = request;
        this.LJLILLLLZI = commentRethinkPopup;
        this.LJLJI = c43i;
        this.LJLJJI = upvoteStruct;
        this.LJLJJL = num;
        this.LJLJJLL = bool;
    }

    public static C181627Aw LIZ(C181627Aw c181627Aw, AbstractC72932td abstractC72932td, CommentRethinkPopup commentRethinkPopup, C43I c43i, UpvoteStruct upvoteStruct, Integer num, Boolean bool, int i) {
        Boolean bool2 = bool;
        Integer num2 = num;
        UpvoteStruct upvoteStruct2 = upvoteStruct;
        C43I c43i2 = c43i;
        AbstractC72932td request = abstractC72932td;
        CommentRethinkPopup commentRethinkPopup2 = commentRethinkPopup;
        if ((i & 1) != 0) {
            request = c181627Aw.LJLIL;
        }
        if ((i & 2) != 0) {
            commentRethinkPopup2 = c181627Aw.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = c181627Aw.LJLJI;
        }
        if ((i & 8) != 0) {
            upvoteStruct2 = c181627Aw.LJLJJI;
        }
        if ((i & 16) != 0) {
            num2 = c181627Aw.LJLJJL;
        }
        if ((i & 32) != 0) {
            bool2 = c181627Aw.LJLJJLL;
        }
        c181627Aw.getClass();
        o.LJIIIZ(request, "request");
        return new C181627Aw(request, commentRethinkPopup2, c43i2, upvoteStruct2, num2, bool2);
    }
}
