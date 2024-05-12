package X;

import Y.AObjectS51S0101000_6;
import com.bytedance.ies.foundation.base.BaseViewModel;
import java.util.Objects;

/* renamed from: X.1oX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C44291oX implements InterfaceC88472Yns {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C44291oX(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.LJLIL) {
            case 0:
                ((C29688Bky) obj).LJIIIZ("system_event_capture_first_frame", "");
                return null;
            default:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS51S0101000_6(0, ggt, 0));
                return null;
        }
    }
}
