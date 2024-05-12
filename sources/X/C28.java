package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C28 extends C31073CHl {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLJL;

    public C28(VoiceChatBroadcastFragment voiceChatBroadcastFragment) {
        this.LJLJL = voiceChatBroadcastFragment;
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
