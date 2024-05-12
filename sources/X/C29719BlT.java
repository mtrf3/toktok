package X;

import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* renamed from: X.BlT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29719BlT extends C78983UzD {
    public final /* synthetic */ LiveRoomUserInfoWidget LJZL;

    public C29719BlT(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.LJZL = liveRoomUserInfoWidget;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        DataChannel dataChannel = this.LJZL.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C29722BlW.class)).LIZ = Boolean.FALSE;
        }
    }
}
