package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UIq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76968UIq extends DataChannelSceneObserver<C75233Tfp, MultiLiveRTCLayoutChannel> {
    public final /* synthetic */ C76973UIv LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<MultiLiveRTCLayoutChannel> getType() {
        return MultiLiveRTCLayoutChannel.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76968UIq(C76973UIv c76973UIv) {
        super(false, 1, null);
        this.LIZ = c76973UIv;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C75233Tfp c75233Tfp) {
        boolean z;
        C75233Tfp value = c75233Tfp;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        C76973UIv c76973UIv = this.LIZ;
        c76973UIv.LJLJJLL = value;
        EnumC74778TWk enumC74778TWk = value.LJLIL;
        int i = 0;
        if (enumC74778TWk == EnumC74778TWk.FLOATING_FIX || (enumC74778TWk == EnumC74778TWk.FLOATING && value.LJLILLLLZI > 0)) {
            z = true;
        } else {
            z = false;
        }
        c76973UIv.LJLJI = z;
        if (((IInteractService) CN1.LIZ(IInteractService.class)).Y40()) {
            C76973UIv c76973UIv2 = this.LIZ;
            if (value.LJLILLLLZI > 0) {
                i = value.LJLJJI;
            }
            c76973UIv2.LJLJJL = i;
        }
        C76973UIv c76973UIv3 = this.LIZ;
        c76973UIv3.LJLILLLLZI.invoke(Boolean.valueOf(c76973UIv3.LJLJI));
        this.LIZ.LIZIZ(constraintProperty);
    }
}
