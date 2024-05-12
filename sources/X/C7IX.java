package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7IX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IX extends AbstractC65781Prl implements InterfaceC88473Ynt<C119624mk, C119624mk, C119624mk, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C183937Jt LJLILLLLZI;
    public final /* synthetic */ List<UpvoteStruct> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7IX(long j, C183937Jt c183937Jt, List<UpvoteStruct> list) {
        super(3);
        this.LJLIL = j;
        this.LJLILLLLZI = c183937Jt;
        this.LJLJI = list;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(C119624mk c119624mk, C119624mk c119624mk2, C119624mk c119624mk3) {
        User user;
        UrlModel urlModel;
        User user2;
        UrlModel urlModel2;
        User user3;
        C119624mk avatarStart = c119624mk;
        C119624mk avatarMiddle = c119624mk2;
        C119624mk avatarEnd = c119624mk3;
        o.LJIIIZ(avatarStart, "avatarStart");
        o.LJIIIZ(avatarMiddle, "avatarMiddle");
        o.LJIIIZ(avatarEnd, "avatarEnd");
        if (this.LJLIL < 3) {
            avatarEnd.setVisibility(8);
        }
        if (this.LJLIL < 2) {
            avatarMiddle.setVisibility(8);
        }
        if (this.LJLIL < 1) {
            avatarStart.setVisibility(8);
        }
        UrlModel urlModel3 = null;
        if (this.LJLIL > 0) {
            C7IW c7iw = C7IW.LIZ;
            Context context = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context, "bubble.context");
            UpvoteStruct upvoteStruct = (UpvoteStruct) ORZ.LJLLLLLL(0, this.LJLJI);
            if (upvoteStruct != null && (user3 = upvoteStruct.getUser()) != null) {
                urlModel2 = user3.getAvatarThumb();
            } else {
                urlModel2 = null;
            }
            c7iw.getClass();
            C7IW.LIZ(context, avatarStart, urlModel2);
        }
        if (this.LJLIL > 1) {
            C7IW c7iw2 = C7IW.LIZ;
            Context context2 = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context2, "bubble.context");
            UpvoteStruct upvoteStruct2 = (UpvoteStruct) ORZ.LJLLLLLL(1, this.LJLJI);
            if (upvoteStruct2 != null && (user2 = upvoteStruct2.getUser()) != null) {
                urlModel = user2.getAvatarThumb();
            } else {
                urlModel = null;
            }
            c7iw2.getClass();
            C7IW.LIZ(context2, avatarMiddle, urlModel);
        }
        if (this.LJLIL > 2) {
            C7IW c7iw3 = C7IW.LIZ;
            Context context3 = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context3, "bubble.context");
            UpvoteStruct upvoteStruct3 = (UpvoteStruct) ORZ.LJLLLLLL(2, this.LJLJI);
            if (upvoteStruct3 != null && (user = upvoteStruct3.getUser()) != null) {
                urlModel3 = user.getAvatarThumb();
            }
            c7iw3.getClass();
            C7IW.LIZ(context3, avatarEnd, urlModel3);
        }
        return C76800UCe.LIZ;
    }
}
