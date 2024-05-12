package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C1t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30665C1t extends C31073CHl {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLJL;
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
        this.LJLJL.sm();
    }

    public C30665C1t(VoiceChatBroadcastFragment voiceChatBroadcastFragment, C15540jG c15540jG) {
        this.LJLJL = voiceChatBroadcastFragment;
        this.LJLJLJ = c15540jG;
    }
}
