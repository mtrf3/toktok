package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;

/* loaded from: classes6.dex */
public final class CA1 implements C0K7 {
    public final /* synthetic */ ScreenRecordStatusWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public CA1(ScreenRecordStatusWidget screenRecordStatusWidget, String str) {
        this.LJLIL = screenRecordStatusWidget;
        this.LJLILLLLZI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        ScreenRecordStatusWidget screenRecordStatusWidget = this.LJLIL;
        String str = this.LJLILLLLZI;
        screenRecordStatusWidget.getClass();
        ScreenRecordStatusWidget.LJLZ(2, str);
    }
}
