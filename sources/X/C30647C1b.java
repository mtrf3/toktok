package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* renamed from: X.C1b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30647C1b implements C0K7 {
    public final /* synthetic */ PerceptionDialogInfo LJLIL;
    public final /* synthetic */ PerceptionMessage LJLILLLLZI;
    public final /* synthetic */ C68322mC<LiveDialog> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C30647C1b(PerceptionDialogInfo perceptionDialogInfo, PerceptionMessage perceptionMessage, C68322mC<LiveDialog> c68322mC, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = perceptionDialogInfo;
        this.LJLILLLLZI = perceptionMessage;
        this.LJLJI = c68322mC;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        PerceptionDialogInfo perceptionDialogInfo = this.LJLIL;
        C1Z.LIZ("click", perceptionDialogInfo.scene, "default_tab", this.LJLILLLLZI.publicEventInfo, perceptionDialogInfo);
        LiveDialog liveDialog2 = this.LJLJI.element;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
        }
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(this.LJLIL.scene));
        }
    }
}
