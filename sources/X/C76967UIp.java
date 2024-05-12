package X;

import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76967UIp extends DataChannelSceneObserver<C75345Thd, VoiceChatLayoutChannel> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<VoiceChatLayoutChannel> getType() {
        return VoiceChatLayoutChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76967UIp(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C75345Thd c75345Thd) {
        int LJI;
        C75345Thd value = c75345Thd;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        UJP ujp = this.LIZ;
        ujp.LJLLILLLL = true;
        int i = value.LJLIL;
        if (C21090sD.LIZIZ()) {
            LJI = 240;
        } else {
            LJI = UJP.LJI(i);
        }
        ujp.LJZI = (int) KL2.LIZJ(C15380j0.LIZLLL(), LJI);
        this.LIZ.LJIIJ(constraintProperty, false);
    }
}
