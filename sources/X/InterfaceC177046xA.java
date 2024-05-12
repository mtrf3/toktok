package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.6xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC177046xA {
    boolean checkCommentInputable();

    Aweme getCommentInputAweme();

    Comment getCommentInputReplyComment();

    int getCommentInputViewType();

    String getEnterMethod();

    String getEventType();

    String getFromPage();

    boolean hasUpvoteOption();

    boolean isLandscapeMode();

    void onClickCloseUpvotePanel();

    void onCommentInputClick();

    void onCommentInputKeyboardDismiss(boolean z, C177156xL c177156xL);

    void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL);

    void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C177156xL c177156xL);

    void onCommentInputPublishFailed(Exception exc, int i, Comment comment);

    void onCommentInputPublishOnlyGiftSuccess(Comment comment);

    void onCommentInputPublishStart(Comment comment);

    void onCommentInputPublishSuccess(Comment comment);

    void onEmojiClick(String str, int i, int i2);

    void onEmojiToKeyboard(String str);

    void onEvent(C174266sg c174266sg);

    void onImageUploadProgress(String str, int i);

    void onUpvotePublishProcessChanged(boolean z);

    boolean upvoteWhenComment();
}
