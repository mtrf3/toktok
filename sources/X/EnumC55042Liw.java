package X;

import com.ss.android.ugc.aweme.PreloadApiServiceImpl;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Liw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC55042Liw {
    POST(new InterfaceC176886wu() { // from class: X.Lix
        @Override // X.InterfaceC176886wu
        public final void LIZ(Object[] objArr) {
            Aweme aweme = (Aweme) objArr[0];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preloadPostList ");
            LIZ.append(aweme.getAuthorUid());
            X1D.LIZIZ(LIZ);
            PreloadApiServiceImpl.LIZJ().LIZ(aweme.getAuthorUid(), aweme.getAuthor().getSecUid(), C176876wt.LIZ(aweme.getAid(), EnumC55042Liw.POST));
        }
    }),
    PROFILE(new InterfaceC176886wu() { // from class: X.Liy
        @Override // X.InterfaceC176886wu
        public final void LIZ(Object[] objArr) {
            Aweme aweme = (Aweme) objArr[0];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preloadProfile ");
            LIZ.append(aweme.getAuthorUid());
            X1D.LIZIZ(LIZ);
            PreloadApiServiceImpl.LIZJ().LIZIZ(aweme, C176876wt.LIZ(aweme.getAid(), EnumC55042Liw.PROFILE));
        }
    }),
    COMMENT(new InterfaceC176886wu() { // from class: X.6ws
        @Override // X.InterfaceC176886wu
        public final void LIZ(Object[] objArr) {
            String str;
            Aweme aweme = (Aweme) objArr[0];
            String str2 = (String) objArr[1];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preloadComment ");
            LIZ.append(aweme.getAuthorUid());
            X1D.LIZIZ(LIZ);
            if (C176026vW.LIZ()) {
                str = aweme.getCommentSuggestWordList().jsonStringToServer();
            } else {
                str = "";
            }
            CommentService.LIZ.getClass();
            CommentService LJJL = CommentServiceImpl.LJJL();
            String aid = aweme.getAid();
            C176876wt.LIZ(aweme.getAid(), EnumC55042Liw.COMMENT);
            LJJL.LJJIJL(C76D.LIZ(aweme.getAuthor(), str2), aid, str2, str);
        }
    });

    public final InterfaceC176886wu LJLIL;

    public InterfaceC176886wu getPreloader() {
        return this.LJLIL;
    }

    public static EnumC55042Liw valueOf(String str) {
        return (EnumC55042Liw) V0N.LJJJ(EnumC55042Liw.class, str);
    }

    EnumC55042Liw(InterfaceC176886wu interfaceC176886wu) {
        this.LJLIL = interfaceC176886wu;
    }
}
