package X;

import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HUM implements InterfaceC45547HuB {
    public Activity albumActivity;
    public final AIGCPictureHandler handler;
    public final String shootWay;

    @Override // X.InterfaceC45547HuB
    public int layoutRes() {
        return R.layout.bee;
    }

    @Override // X.InterfaceC45547HuB
    public View.OnClickListener getClickListener() {
        return new ACListenerS27S0100000_7(this, 157);
    }

    @Override // X.InterfaceC45547HuB
    public void setAlbumActivity(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.albumActivity = activity;
        this.handler.setFinishFlowCallback(new AqS157S0100000_7(this, 620));
    }

    public HUM(AIGCPictureHandler handler, String shootWay) {
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(shootWay, "shootWay");
        this.handler = handler;
        this.shootWay = shootWay;
    }
}
