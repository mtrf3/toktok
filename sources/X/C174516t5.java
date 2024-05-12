package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentViewModelImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.6t5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174516t5 {
    public static CommentViewModelImpl LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (fragment.isAdded()) {
            return (CommentViewModelImpl) ViewModelProviders.of(fragment).get(CommentViewModelImpl.class);
        }
        return null;
    }
}
