package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.C1r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30663C1r extends C31073CHl {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLJL;

    public C30663C1r(VoiceChatBroadcastFragment voiceChatBroadcastFragment) {
        this.LJLJL = voiceChatBroadcastFragment;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        View findViewById;
        o.LJIIIZ(anim, "anim");
        View _$_findCachedViewById = this.LJLJL._$_findCachedViewById(R.id.epj);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setClickable(false);
        }
        View _$_findCachedViewById2 = this.LJLJL._$_findCachedViewById(R.id.epj);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(8);
        }
        View view = this.LJLJL.getView();
        if (view == null || (findViewById = view.findViewById(R.id.fva)) == null) {
            return;
        }
        findViewById.setAlpha(1.0f);
    }
}
