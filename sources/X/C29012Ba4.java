package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Ba4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29012Ba4 extends C31073CHl {
    public final /* synthetic */ PreviewLiveCenterWidget LJLJL;
    public final /* synthetic */ C15540jG LJLJLJ;

    @Override // X.C31073CHl
    public final void LJFF() {
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.f67n;
        Long LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_CENTER_PROMOTE_ON_PREVIEW_TIME_POINT.value");
        if (!C15500jC.LIZ(LIZJ.longValue())) {
            this.LJLJLJ.LJ();
            c48459J0d.LIZ(Long.valueOf(System.currentTimeMillis()));
            C0N7.LJFF(this.LJLJL.dataChannel, "course_progress");
        }
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        if ((!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && !InterfaceC30442Bx8.f66Y.LIZJ().booleanValue()) || this.LJLJL.LLIIIILZ()) {
            C30444BxA.LIZLLL(EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE, this.LJLJL.LJLJJL);
        }
    }

    public C29012Ba4(PreviewLiveCenterWidget previewLiveCenterWidget, C15540jG c15540jG) {
        this.LJLJL = previewLiveCenterWidget;
        this.LJLJLJ = c15540jG;
    }
}
