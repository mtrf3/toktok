package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.comment.commentpage.viewmodel.CommentColorModeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6t9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174556t9 {
    public static CommentColorModeViewModel LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (fragment.isAdded()) {
            return (CommentColorModeViewModel) ViewModelProviders.of(fragment).get("CommentColorModeViewModel", CommentColorModeViewModel.class);
        }
        return null;
    }
}
