package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* renamed from: X.C1a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30646C1a implements C0K7 {
    public final /* synthetic */ PerceptionDialogInfo LJLIL;
    public final /* synthetic */ PerceptionMessage LJLILLLLZI;
    public final /* synthetic */ PerceptionMessage LJLJI;
    public final /* synthetic */ C68322mC<LiveDialog> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C30646C1a(PerceptionDialogInfo perceptionDialogInfo, PerceptionMessage perceptionMessage, PerceptionMessage perceptionMessage2, C68322mC<LiveDialog> c68322mC, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = perceptionDialogInfo;
        this.LJLILLLLZI = perceptionMessage;
        this.LJLJI = perceptionMessage2;
        this.LJLJJI = c68322mC;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        C1Z.LIZ("click", this.LJLIL.scene, "suggest_tab", this.LJLILLLLZI.publicEventInfo, this.LJLJI.dialog);
        LiveDialog liveDialog2 = this.LJLJJI.element;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
        }
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(this.LJLIL.scene));
        }
    }
}
