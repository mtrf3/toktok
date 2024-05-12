package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Ba5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29013Ba5 extends C31073CHl {
    public final /* synthetic */ PreviewLiveCenterWidget LJLJL;
    public final /* synthetic */ C15540jG LJLJLJ;

    @Override // X.C31073CHl
    public final void LJFF() {
        this.LJLJLJ.LJ();
        C0N7.LJFF(this.LJLJL.dataChannel, "first_entry");
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        if ((!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && !InterfaceC30442Bx8.f66Y.LIZJ().booleanValue()) || this.LJLJL.LLIIIILZ()) {
            C30444BxA.LIZLLL(EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE, this.LJLJL.LJLJJL);
        }
    }

    public C29013Ba5(PreviewLiveCenterWidget previewLiveCenterWidget, C15540jG c15540jG) {
        this.LJLJL = previewLiveCenterWidget;
        this.LJLJLJ = c15540jG;
    }
}
