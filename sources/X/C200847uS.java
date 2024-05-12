package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.7uS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200847uS {
    public final Fragment LIZ;
    public final ActivityC45651qj LIZIZ;
    public final Aweme LIZJ;
    public final ViewGroup LIZLLL;
    public ViewGroup LJ;
    public ViewGroup LJFF;
    public final PostModeDetailParams LJI;
    public final PostModeContainerViewModel LJII;
    public final PostModeFullPageViewModel LJIIIIZZ;
    public final PostModeTimeLoggerViewModel LJIIIZ;
    public final ViewGroup LJIIJ;
    public final InterfaceC201357vH LJIIJJI;

    public C200847uS(Fragment fragment, ActivityC45651qj activityC45651qj, Aweme aweme, ViewGroup viewGroup, PostModeDetailParams postModeDetailParams, PostModeContainerViewModel postModeContainerViewModel, PostModeFullPageViewModel postModeFullPageViewModel, PostModeTimeLoggerViewModel postModeTimeLoggerViewModel, ViewGroup viewGroup2, PhotoSharedViewModel photoSharedProvider) {
        o.LJIIIZ(postModeContainerViewModel, "postModeContainerViewModel");
        o.LJIIIZ(postModeTimeLoggerViewModel, "postModeTimeLoggerViewModel");
        o.LJIIIZ(photoSharedProvider, "photoSharedProvider");
        this.LIZ = fragment;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = aweme;
        this.LIZLLL = viewGroup;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = postModeDetailParams;
        this.LJII = postModeContainerViewModel;
        this.LJIIIIZZ = postModeFullPageViewModel;
        this.LJIIIZ = postModeTimeLoggerViewModel;
        this.LJIIJ = viewGroup2;
        this.LJIIJJI = photoSharedProvider;
    }
}
