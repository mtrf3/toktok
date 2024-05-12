package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BRw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28796BRw implements UOY {
    public final /* synthetic */ RedEnvelopeWidget LIZ;
    public final /* synthetic */ List<RedEnvelopeMessage4FE> LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.UOY
    public final void LIZIZ() {
    }

    @Override // X.UOY
    public final void LLLLZLL() {
    }

    @Override // X.UOY
    public final View LIZJ() {
        C47061t0 c47061t0 = this.LIZ.LJLIL;
        o.LJI(c47061t0);
        c47061t0.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(70.0f), C15380j0.LIZ(70.0f)));
        return c47061t0;
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        Animator Es0 = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).Es0(viewGroup);
        if (Es0 != null) {
            Es0.addListener(new C28795BRv(viewGroup, this.LIZIZ, this.LIZJ, this.LIZ));
        } else {
            Es0 = null;
        }
        return new BSQ(Es0);
    }

    public C28796BRw(RedEnvelopeWidget redEnvelopeWidget, List<RedEnvelopeMessage4FE> list, String str) {
        this.LIZ = redEnvelopeWidget;
        this.LIZIZ = list;
        this.LIZJ = str;
    }
}
