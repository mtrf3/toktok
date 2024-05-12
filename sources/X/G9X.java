package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9X implements InterfaceC187177Wf {
    public final /* synthetic */ C41051G9f LJLIL;

    @Override // X.InterfaceC187177Wf
    public final void LLLLLILLIL() {
        View view;
        EditPostedVideoPublishActivity editPostedVideoPublishActivity;
        Activity activity = this.LJLIL.mActivity;
        if ((activity instanceof EditPostedVideoPublishActivity) && (editPostedVideoPublishActivity = (EditPostedVideoPublishActivity) activity) != null) {
            editPostedVideoPublishActivity.LLIIIILZ(true);
        }
        C41051G9f c41051G9f = this.LJLIL;
        if (c41051G9f.LJLJJLL != null) {
            ViewGroup viewGroup = c41051G9f.LJLLLL;
            if (viewGroup != null) {
                if (viewGroup.getVisibility() == 0) {
                    View view2 = this.LJLIL.LJLJJLL;
                    if (view2 == null) {
                        return;
                    }
                    view2.setVisibility(8);
                    return;
                }
                C41051G9f c41051G9f2 = this.LJLIL;
                GS5 gs5 = c41051G9f2.LLIIIILZ;
                if (gs5 != null) {
                    ExpandedTitleModule expandedTitleModule = gs5.LJIIIZ;
                    if ((expandedTitleModule != null && expandedTitleModule.LLILLJJLI) || (view = c41051G9f2.LJLJJLL) == null) {
                        return;
                    }
                    view.setVisibility(0);
                    return;
                }
                o.LJIJI("imageHeaderModule");
                throw null;
            }
            o.LJIJI("hashTagContent");
            throw null;
        }
    }

    @Override // X.InterfaceC187177Wf
    public final void S2() {
        EditPostedVideoPublishActivity editPostedVideoPublishActivity;
        Activity activity = this.LJLIL.mActivity;
        if ((activity instanceof EditPostedVideoPublishActivity) && (editPostedVideoPublishActivity = (EditPostedVideoPublishActivity) activity) != null) {
            editPostedVideoPublishActivity.LLIIIILZ(false);
        }
        View view = this.LJLIL.LJLJJLL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public G9X(C41051G9f c41051G9f) {
        this.LJLIL = c41051G9f;
    }
}
