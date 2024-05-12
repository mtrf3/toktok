package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C1s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30664C1s extends C31073CHl {
    public final /* synthetic */ LiveBroadcastFragment LJLJL;
    public final /* synthetic */ C15540jG LJLJLJ;

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        View _$_findCachedViewById = this.LJLJL._$_findCachedViewById(R.id.epj);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setClickable(false);
        }
        this.LJLJL._$_findCachedViewById(R.id.epj).setVisibility(8);
        this.LJLJLJ.LIZ();
        this.LJLJL.Hm();
    }

    public C30664C1s(LiveBroadcastFragment liveBroadcastFragment, C15540jG c15540jG) {
        this.LJLJL = liveBroadcastFragment;
        this.LJLJLJ = c15540jG;
    }
}
