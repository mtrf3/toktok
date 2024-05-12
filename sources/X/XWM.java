package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseChooseMusicFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XWM {
    public final FrameLayout LIZ;
    public final FrameLayout LIZIZ;

    public XWM(View view, BaseChooseMusicFragment fragment, TextWatcher textWatcher) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(textWatcher, "textWatcher");
        this.LIZ = (FrameLayout) view.findViewById(R.id.btu);
        view.findViewById(R.id.f0d);
        this.LIZIZ = (FrameLayout) view.findViewById(R.id.cwq);
    }
}
