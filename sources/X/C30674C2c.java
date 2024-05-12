package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C2c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30674C2c extends C31073CHl {
    public final /* synthetic */ TryModeBroadcastFragment LJLJL;

    public C30674C2c(TryModeBroadcastFragment tryModeBroadcastFragment) {
        this.LJLJL = tryModeBroadcastFragment;
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
