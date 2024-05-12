package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y87 {
    public static boolean LIZJ() {
        CommentImageUploadAuth commentImageUploadAuth;
        boolean z = false;
        if (Y88.LIZLLL == null) {
            C71Y.LIZLLL("CommentImageUploadController", "authConfig is null");
            C71Y.LIZLLL("CommentImageUploadController", "get local authConfig");
            String key = Y88.LIZJ;
            o.LJIIIZ(key, "key");
            String string = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "comment_sp", 0).getString(key, "");
            o.LJIIIIZZ(string, "keva.getString(key, default ?: \"\")");
            if (C78857UxB.LJJJIL(string)) {
                try {
                    commentImageUploadAuth = (CommentImageUploadAuth) C75792yF.LIZIZ().LJI(string, CommentImageUploadAuth.class);
                } catch (Throwable unused) {
                    C71Y.LIZIZ("CommentImageUploadController", "local authConfig parse error");
                }
                Y88.LIZLLL = commentImageUploadAuth;
            } else {
                C71Y.LIZLLL("CommentImageUploadController", "local authConfig is null");
            }
            commentImageUploadAuth = null;
            Y88.LIZLLL = commentImageUploadAuth;
        }
        CommentImageUploadAuth commentImageUploadAuth2 = Y88.LIZLLL;
        if (commentImageUploadAuth2 == null || System.currentTimeMillis() > commentImageUploadAuth2.getExpiredTime() * 1000) {
            z = true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("authConfig is expired: ");
        LIZ.append(z);
        C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ));
        return !z;
    }

    public static void LJII() {
        if (LIZJ()) {
            C71Y.LIZLLL("CommentImageUploadController", "has valid authConfig, need not prefetch");
        } else {
            C71Y.LIZLLL("CommentImageUploadController", "invalid authConfig, prefetch auth");
            ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).fetchCommentImageUploadAuth().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new Y8E());
        }
    }

    public static void LIZ(CommentImageModel commentImageModel) {
        List<String> urlList;
        if (commentImageModel == null || (urlList = commentImageModel.getUrlList()) == null || urlList.isEmpty()) {
            C71Y.LIZLLL("CommentImageUploadController", "delete image is null!");
        } else if (commentImageModel.isCompressed() && commentImageModel.getCompressedStatus() == 2) {
            C71Y.LIZLLL("CommentImageUploadController", "delete pre-compress image file");
            LJIIIIZZ(commentImageModel.getCompressedFilePath());
        } else {
            C71Y.LIZLLL("CommentImageUploadController", "not need delete pre-compress image file");
        }
    }

    public static String LIZIZ(CommentImageModel commentImageModel) {
        String str;
        Context LIZIZ = EF7.LIZIZ();
        List<String> urlList = commentImageModel.getUrlList();
        if (urlList != null) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        String LIZIZ2 = C00S.LIZIZ(LIZIZ, UriProtector.parse(str));
        o.LJIIIIZZ(LIZIZ2, "convertUriToPath(\n      …t?.get(0)),\n            )");
        return LIZIZ2;
    }

    public static boolean LIZLLL(CommentImageModel commentImageModel) {
        String str;
        String format = commentImageModel.getFormat();
        if (format != null) {
            str = format.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isJpeg format:");
        LIZ.append(str);
        C71Y.LIZ("CommentImageUploadController", X1D.LIZIZ(LIZ));
        if (TextUtils.equals("jpeg", str) || TextUtils.equals("jpg", str)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(CommentImageModel commentImageModel) {
        boolean z;
        if (commentImageModel.getSize() > Y88.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("needCompressed: ");
        LIZ.append(z);
        C71Y.LIZ("CommentImageUploadController", X1D.LIZIZ(LIZ));
        return z;
    }

    public static void LJFF(CommentImageModel commentImageModel) {
        Y8G remove = Y88.LJ.remove(Integer.valueOf(commentImageModel.hashCode()));
        if (remove != null) {
            C71Y.LIZLLL("CommentImageUploadController", "find pendingInfo and start upload");
            Y88 y88 = remove.LJLIL;
            if (y88 != null) {
                y88.LIZJ(commentImageModel, remove.LJLILLLLZI);
                return;
            }
            return;
        }
        C71Y.LIZLLL("CommentImageUploadController", "no PendingInfo");
    }

    public static void LJI(CommentImageModel commentImageModel) {
        List<String> urlList;
        String str;
        if (commentImageModel == null || (urlList = commentImageModel.getUrlList()) == null || urlList.isEmpty()) {
            C71Y.LIZLLL("CommentImageUploadController", "pre-compress upload image is null!");
            return;
        }
        if (!LIZLLL(commentImageModel) || LJ(commentImageModel)) {
            if (commentImageModel.getCompressedStatus() != 0 && commentImageModel.getCompressedStatus() != 3) {
                if (commentImageModel.getCompressedStatus() == 2) {
                    String compressedFilePath = commentImageModel.getCompressedFilePath();
                    if (!TextUtils.isEmpty(compressedFilePath) && C1B6.LIZIZ(compressedFilePath)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pre-compress image.size: ");
            LIZ.append(commentImageModel.getSize());
            LIZ.append(", try to compress");
            C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ));
            String LIZIZ = LIZIZ(commentImageModel);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("pre-compress upload file: ");
            LIZ2.append(LIZIZ);
            C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ2));
            String format = commentImageModel.getFormat();
            if (format != null) {
                str = format.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                str = "";
            }
            commentImageModel.setCompressedStatus(1);
            C77115UOh.LIZ(LIZIZ, commentImageModel.getWidth(), commentImageModel.getHeight(), ((float) commentImageModel.getSize()) / Y88.LIZIZ, new Y8C(commentImageModel, str));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("pre-compress image.size: ");
        LIZ3.append(commentImageModel.getSize());
        LIZ3.append(", no need to compress");
        C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ3));
    }

    public static void LJIIIIZZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C71Y.LIZLLL("CommentImageUploadController", "delete file is null");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delete file ");
        LIZ.append(str);
        C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ));
        C38891fp.LJIILL(str);
    }
}
