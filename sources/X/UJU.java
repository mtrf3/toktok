package X;

import android.content.res.Resources;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJU extends DataChannelSceneObserver<C32208CkW, LinkCrossRoomStateChangeEvent> {
    public final /* synthetic */ UJX LIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<LinkCrossRoomStateChangeEvent> getType() {
        return LinkCrossRoomStateChangeEvent.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJU(UJX ujx) {
        super(false, 1, null);
        this.LIZ = ujx;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C32208CkW c32208CkW) {
        int i;
        int dimensionPixelSize;
        C32208CkW value = c32208CkW;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        o.LJIIIZ(value, "value");
        int i2 = value.LIZ;
        if (i2 == 0) {
            if (C76128TuG.LIZIZ(layeredElementContext.getDataChannel(), false, 6)) {
                IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                if (iInteractService.yr() == 1) {
                    UJX ujx = this.LIZ;
                    if (C15380j0.LJIIZILJ()) {
                        dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a9l);
                    } else {
                        dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a9k);
                    }
                    ujx.LLF = dimensionPixelSize;
                } else if (iInteractService.yr() == 2) {
                    UJX ujx2 = this.LIZ;
                    boolean LJIIZILJ = C15380j0.LJIIZILJ();
                    Resources resources = layeredElementContext.getContext().getResources();
                    if (LJIIZILJ) {
                        i = R.dimen.a9n;
                    } else {
                        i = R.dimen.a9m;
                    }
                    ujx2.LLF = resources.getDimensionPixelSize(i);
                } else {
                    this.LIZ.LLF = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a9j);
                }
            } else {
                this.LIZ.LLF = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a9j);
            }
        } else if (i2 == 1) {
            this.LIZ.LLF = 0;
        }
        UJX.LIZLLL(this.LIZ, false, false, 3);
    }
}
