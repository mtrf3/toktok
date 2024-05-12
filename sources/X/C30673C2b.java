package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C2b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30673C2b extends C31073CHl {
    public final /* synthetic */ LiveBroadcastFragment LJLJL;

    public C30673C2b(LiveBroadcastFragment liveBroadcastFragment) {
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
