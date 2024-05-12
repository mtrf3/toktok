package X;

import android.app.Dialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_recover_shooting_segment_tips")
/* renamed from: X.HJo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43868HJo extends AbstractC56325M8r<Dialog> {
    public final String LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final int LJLJJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        ((IExternalService) this.LJLJI.getValue()).abnormalExitLogService().logRestoreDialogShow();
        return ((IExternalService) this.LJLJI.getValue()).publishService().showRestoreWorkDialog(this.LJLILLLLZI, this.LJLIL);
    }

    public C43868HJo(ActivityC45651qj activityC45651qj, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = C221108m2.LIZIZ(C43869HJp.LJLIL);
        this.LJLJJI = LiveCoverMinSizeSetting.DEFAULT;
    }
}
