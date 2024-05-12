package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C1v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30667C1v extends C31073CHl {
    public final /* synthetic */ LiveBroadcastFragment LJLJL;
    public final /* synthetic */ C76732zl LJLJLJ;
    public final /* synthetic */ C15540jG LJLJLLL;
    public final /* synthetic */ C15540jG LJLL;

    @Override // X.C31073CHl
    public final void LJFF() {
        C76732zl c76732zl = this.LJLJLJ;
        C15540jG c15540jG = this.LJLJLLL;
        C15540jG c15540jG2 = this.LJLL;
        int i = c76732zl.element - 1;
        c76732zl.element = i;
        if (i == 0) {
            c15540jG.LJ();
            c15540jG2.LJ();
        }
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

    public C30667C1v(C15540jG c15540jG, C15540jG c15540jG2, LiveBroadcastFragment liveBroadcastFragment, C76732zl c76732zl) {
        this.LJLJL = liveBroadcastFragment;
        this.LJLJLJ = c76732zl;
        this.LJLJLLL = c15540jG;
        this.LJLL = c15540jG2;
    }
}
