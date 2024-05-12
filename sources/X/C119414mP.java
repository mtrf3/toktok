package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4mP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119414mP {
    public static CommentSharePackage LIZIZ(Aweme aweme, Comment comment, boolean z, C119424mQ c119424mQ) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle;
        String str5;
        String str6;
        UrlModel urlModel;
        boolean z2;
        String str7;
        String string;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(comment, "comment");
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "comment";
        UrlModel urlModel2 = null;
        if (c119424mQ != null) {
            str = c119424mQ.LIZ;
        } else {
            str = null;
        }
        String str8 = "";
        if (str == null) {
            str = "";
        }
        c62374Odu.LIZIZ = str;
        if (c119424mQ == null || (str2 = c119424mQ.LIZIZ) == null) {
            str2 = "";
        }
        c62374Odu.LIZLLL = str2;
        if (c119424mQ == null || (str3 = c119424mQ.LIZJ) == null) {
            str3 = "";
        }
        c62374Odu.LJ = str3;
        if (c119424mQ == null || (str4 = c119424mQ.LIZLLL) == null) {
            str4 = "";
        }
        String LJJI = C78609UtB.LJJI(C78609UtB.LJJ(str4));
        if (LJJI == null) {
            LJJI = "";
        }
        String LJIJI = C78609UtB.LJIJI(aweme, LJJI);
        if (LJIJI == null) {
            LJIJI = "";
        }
        c62374Odu.LJFF = LJIJI;
        CommentSharePackage commentSharePackage = new CommentSharePackage(c62374Odu);
        commentSharePackage.comment = comment;
        commentSharePackage.aweme = aweme;
        if (c119424mQ != null) {
            bundle = c119424mQ.LJ;
        } else {
            bundle = null;
        }
        Bundle bundle2 = commentSharePackage.extras;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        bundle2.putString("aweme_id", aid);
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        bundle2.putString("comment_text", text);
        String cid = comment.getCid();
        if (cid == null) {
            cid = "";
        }
        bundle2.putString("comment_id", cid);
        User user = comment.getUser();
        if (user == null || (str5 = user.getUniqueId()) == null) {
            str5 = "";
        }
        bundle2.putString("comment_author_name", str5);
        User user2 = comment.getUser();
        if (user2 == null || (str6 = user2.getUid()) == null) {
            str6 = "";
        }
        bundle2.putString("comment_author_id", str6);
        String replyToUserName = comment.getReplyToUserName();
        if (replyToUserName == null) {
            replyToUserName = "";
        }
        bundle2.putString("comment_reply_user_name", replyToUserName);
        String replyToUserId = comment.getReplyToUserId();
        if (replyToUserId == null) {
            replyToUserId = "";
        }
        bundle2.putString("comment_reply_user_id", replyToUserId);
        Video video = aweme.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        bundle2.putSerializable("video_cover", urlModel);
        User user3 = comment.getUser();
        if (user3 != null) {
            urlModel2 = user3.getAvatarThumb();
        }
        bundle2.putSerializable("comment_author_avatar_url", urlModel2);
        bundle2.putInt("aweme_type", aweme.getAwemeType());
        bundle2.putBoolean("comment_is_sub_comment", C78857UxB.LJJJIL(comment.getReplyToUserName()));
        int i = 1;
        if (comment.getAliasAweme() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle2.putBoolean("comment_is_reply_with_video", z2);
        User author = aweme.getAuthor();
        if (author == null || (str7 = author.getUniqueId()) == null) {
            str7 = "";
        }
        bundle2.putString("author_user_name", str7);
        CommentSharePackage.Companion.getClass();
        if (C80S.LJIIIIZZ(aweme)) {
            i = 3;
        } else if (C80S.LIZJ(aweme)) {
            i = 2;
        } else if (!aweme.getAuthor().isSecret()) {
            i = -1;
        }
        bundle2.putInt("share_im_limit_tip_type", i);
        bundle2.putBoolean("comment_direct_share", z);
        if (bundle != null && (string = bundle.getString("enter_method")) != null) {
            str8 = string;
        }
        bundle2.putString("enter_method", str8);
        bundle2.putInt("comment_media_type", comment.getCommentMediaType());
        return commentSharePackage;
    }

    public static C116714i3 LIZ(Context context, String creatorName, String replyToName, String commentContent, Bitmap bitmap, int i, int i2) {
        String str;
        String str2;
        int i3;
        Bitmap bitmap2 = bitmap;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(creatorName, "creatorName");
        o.LJIIIZ(replyToName, "replyToName");
        o.LJIIIZ(commentContent, "commentContent");
        C116724i4 c116724i4 = new C116724i4();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(context.getString(R.string.h1q, creatorName));
        LIZ.append(": ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (replyToName.length() > 0 && 1 != 0) {
            str = QZZ.LIZIZ('@', replyToName);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(context.getString(R.string.h1l, str));
            LIZ2.append(' ');
            str2 = X1D.LIZIZ(LIZ2);
        } else {
            str = "";
            str2 = "";
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ);
        LIZ3.append(str2);
        LIZ3.append(commentContent);
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        c116724i4.LIZLLL(LIZIZ);
        c116724i4.LIZLLL(str2);
        c116724i4.LIZLLL(commentContent);
        C116714i3 c116714i3 = c116724i4.LIZ;
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ2, LIZIZ, 0, false, 6);
        c116714i3.setSpan(new T5U(43, false), c116714i3.LIZIZ(LJJLIIIJL), c116714i3.LIZIZ(LIZIZ.length() + LJJLIIIJL), 33);
        int LJJLIIIJL2 = s.LJJLIIIJL(LIZIZ2, str, 0, false, 6);
        c116714i3.setSpan(new T5U(43, false), c116714i3.LIZIZ(LJJLIIIJL2), c116714i3.LIZIZ(str.length() + LJJLIIIJL2), 33);
        if (bitmap2 == null) {
            bitmap2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.b7n);
        }
        o.LJIIIIZZ(bitmap2, "bitmap");
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
        Integer LJI = C79045V0n.LJI(R.attr.dz, context);
        if (LJI != null) {
            i3 = LJI.intValue();
        } else {
            i3 = 0;
        }
        int width = bitmap2.getWidth();
        int i4 = width + LJJIIZ;
        Bitmap circleBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(circleBitmap);
        Paint LIZIZ3 = C6D8.LIZIZ(true);
        float f = LJJIIZ;
        LIZIZ3.setStrokeWidth(f);
        LIZIZ3.setStyle(Paint.Style.FILL);
        float f2 = 2;
        float f3 = i4 / f2;
        float f4 = LJJIIZ / 2;
        float f5 = (width / f2) - f4;
        canvas.drawCircle(f3, f3, f5, LIZIZ3);
        LIZIZ3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        float f6 = f4 + 0.0f;
        canvas.drawBitmap(bitmap2, f6, f6, LIZIZ3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i3);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        canvas.drawCircle(f3, f3, f5, paint);
        o.LJIIIIZZ(circleBitmap, "circleBitmap");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), circleBitmap);
        bitmapDrawable.setBounds(0, 0, i, i);
        C8FR c8fr = new C8FR(bitmapDrawable, 2);
        c8fr.LIZIZ(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), C90193gN.LIZ());
        c116714i3.setSpan(c8fr, 0, 1, 18);
        if (i2 == 1) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(' ');
            LIZ4.append(context.getResources().getString(R.string.dih));
            c116714i3.append((CharSequence) X1D.LIZIZ(LIZ4));
        }
        return c116714i3;
    }
}
