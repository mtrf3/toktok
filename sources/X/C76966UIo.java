package X;

import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76966UIo extends DataChannelSceneObserver<C75233Tfp, MultiLiveRTCLayoutChannel> {
    public final /* synthetic */ UJP LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<MultiLiveRTCLayoutChannel> getType() {
        return MultiLiveRTCLayoutChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76966UIo(UJP ujp) {
        super(false, 1, null);
        this.LIZ = ujp;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C75233Tfp c75233Tfp) {
        int LJI;
        boolean z;
        C75233Tfp value = c75233Tfp;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        UJP ujp = this.LIZ;
        EnumC74778TWk enumC74778TWk = value.LJLIL;
        boolean z2 = true;
        if (enumC74778TWk == EnumC74778TWk.GRID_FIX || ((enumC74778TWk == EnumC74778TWk.GRID && value.LJLILLLLZI > 0) || C21090sD.LIZIZ())) {
            UJP ujp2 = this.LIZ;
            int i = value.LJLILLLLZI;
            ujp2.getClass();
            if (C21090sD.LIZIZ()) {
                LJI = 240;
            } else {
                int i2 = TX4.LIZ[value.LJLIL.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 && value.LJLILLLLZI > 0) {
                        LJI = UJP.LJI(value.LJLJI);
                    }
                    LJI = 220;
                } else {
                    if (i > 0) {
                        LJI = UJP.LJI(value.LJLJI);
                    }
                    LJI = 220;
                }
            }
            ujp2.LJZI = (int) KL2.LIZJ(C15380j0.LIZLLL(), LJI);
            z = true;
        } else {
            z = false;
        }
        ujp.LJLLILLLL = z;
        UJP ujp3 = this.LIZ;
        EnumC74778TWk enumC74778TWk2 = value.LJLIL;
        if (enumC74778TWk2 != EnumC74778TWk.FLOATING_FIX && (enumC74778TWk2 != EnumC74778TWk.FLOATING || value.LJLILLLLZI <= 0)) {
            z2 = false;
        }
        ujp3.LJLLJ = z2;
        ujp3.LJIIJ(constraintProperty, false);
    }
}
