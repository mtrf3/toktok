package X;

import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HVK extends HVL {
    public final EnterStoryParam param;

    @Override // X.HVL, X.InterfaceC45547HuB
    public int layoutRes() {
        return R.layout.bee;
    }

    @Override // X.HVL, X.InterfaceC45547HuB
    public void setAlbumActivity(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.HVL, X.InterfaceC45547HuB
    public View.OnClickListener getClickListener() {
        return new ACListenerS27S0100000_7(this, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HVK(EnterStoryParam param) {
        super(param);
        o.LJIIIZ(param, "param");
        this.param = param;
    }
}
