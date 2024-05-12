package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C27 extends C31073CHl {
    public final /* synthetic */ LiveBroadcastFragment LJLJL;

    public C27(LiveBroadcastFragment liveBroadcastFragment) {
        this.LJLJL = liveBroadcastFragment;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        View _$_findCachedViewById = this.LJLJL._$_findCachedViewById(R.id.epj);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setClickable(false);
    }
}
