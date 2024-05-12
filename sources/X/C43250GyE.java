package X;

import Y.ACallableS56S0300000_7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.external.ui.MusVideoChooseFragmentWrapper;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.GyE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43250GyE implements IVideo2GifUIService {
    @Override // com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService
    public final Fragment video2GifFragment(VideoShare2GifEditContext context) {
        o.LJIIIZ(context, "context");
        Video2GifCutFragment video2GifCutFragment = new Video2GifCutFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_edit_context", context);
        video2GifCutFragment.setArguments(bundle);
        return video2GifCutFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService
    public final IVideoChoose toMusVideoChooseFragment(ActivityC45651qj activity, Fragment fragment, IVideoChoose.Callback callback, Integer num) {
        o.LJIIIZ(activity, "activity");
        if (fragment instanceof MusVideoChooseFragmentWrapper) {
            return (IVideoChoose) fragment;
        }
        MusVideoChooseFragmentWrapper musVideoChooseFragmentWrapper = new MusVideoChooseFragmentWrapper();
        musVideoChooseFragmentWrapper.LJLILLLLZI.LJZ = callback;
        C10K.LIZIZ(new ACallableS56S0300000_7(activity, num, musVideoChooseFragmentWrapper, 0), ExecutorC149205tM.LJLILLLLZI, null);
        return musVideoChooseFragmentWrapper;
    }
}
