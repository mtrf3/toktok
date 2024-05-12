package X;

import android.view.ScaleGestureDetector;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLinkMicBlockOrientSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BDo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28424BDo extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final DataChannel LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        if (GameLinkMicBlockOrientSetting.INSTANCE.isDefault() && this.LJLILLLLZI && detector.getScaleFactor() > 1.2d && (C74740TUy.LIZLLL().LJFF() || C74740TUy.LIZLLL().LJ())) {
            C30868C9o.LIZJ(R.string.n9y);
            return false;
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            return false;
        }
        if (this.LJLILLLLZI && detector.getScaleFactor() > 1.2d) {
            C73943T0h.LIZ().LIZIZ(new B3N(2));
            BZI LIZ = C28787BRn.LIZ("screen_rotate");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ("portrait_to_landscape", "type");
            LIZ.LJJIIJZLJL();
            B9E.LIZJ(this.LJLIL, 0, 1, "gesture");
        } else {
            if (this.LJLILLLLZI || detector.getScaleFactor() >= 0.8d) {
                return false;
            }
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJI;
            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
                return false;
            }
            C73943T0h.LIZ().LIZIZ(new B3N(1));
            BZI LIZ2 = C28787BRn.LIZ("screen_rotate");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ("landscape_to_portrait", "type");
            LIZ2.LJJIIJZLJL();
            B9E.LIZJ(this.LJLIL, 1, 0, "gesture");
        }
        return true;
    }

    public C28424BDo(DataChannel dataChannel, boolean z, C64894PdS c64894PdS) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = z;
        this.LJLJI = c64894PdS;
    }
}
