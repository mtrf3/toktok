package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C2d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30675C2d extends C31073CHl {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLJL;

    public C30675C2d(VoiceChatBroadcastFragment voiceChatBroadcastFragment) {
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
