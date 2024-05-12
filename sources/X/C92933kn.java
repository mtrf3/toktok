package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment;

/* renamed from: X.3kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92933kn {
    public static DetailFeedKeyboardDialogFragment LIZ(FragmentManager fragmentManager) {
        Fragment LJJJIL = fragmentManager.LJJJIL("ReplyKeyboardDialogFragment");
        if (LJJJIL != null) {
            return (DetailFeedKeyboardDialogFragment) LJJJIL;
        }
        return new DetailFeedKeyboardDialogFragment();
    }
}
