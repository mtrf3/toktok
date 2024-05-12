package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C1p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30661C1p extends C31073CHl {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLJL;
    public final /* synthetic */ C15540jG LJLJLJ;
    public final /* synthetic */ C76732zl LJLJLLL;
    public final /* synthetic */ C15540jG LJLL;

    @Override // X.C31073CHl
    public final void LJFF() {
        C76732zl c76732zl = this.LJLJLLL;
        C15540jG c15540jG = this.LJLL;
        C15540jG c15540jG2 = this.LJLJLJ;
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
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setClickable(false);
        }
        this.LJLJL._$_findCachedViewById(R.id.epj).setVisibility(8);
        this.LJLJLJ.LIZ();
        this.LJLJL.sm();
    }

    public C30661C1p(C15540jG c15540jG, C15540jG c15540jG2, VoiceChatBroadcastFragment voiceChatBroadcastFragment, C76732zl c76732zl) {
        this.LJLJL = voiceChatBroadcastFragment;
        this.LJLJLJ = c15540jG;
        this.LJLJLLL = c76732zl;
        this.LJLL = c15540jG2;
    }
}
