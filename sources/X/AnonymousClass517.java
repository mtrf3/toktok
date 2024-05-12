package X;

import com.ss.android.ugc.gamora.editorpro.crop.VideoCropService;
import com.ss.ugc.android.editor.core.EditorProContext;

/* renamed from: X.517, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass517 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ EditorProContext LJLIL;
    public final /* synthetic */ VideoCropService LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass517(EditorProContext editorProContext, VideoCropService videoCropService, long j) {
        super(0);
        this.LJLIL = editorProContext;
        this.LJLILLLLZI = videoCropService;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.getNleSession().V8().stop();
        this.LJLIL.getNleSession().V8().prepare();
        final VideoCropService videoCropService = this.LJLILLLLZI;
        final EditorProContext editorProContext = this.LJLIL;
        VideoCropService.seek$default(videoCropService, editorProContext, this.LJLJI, 0L, new AnonymousClass519() { // from class: X.50w
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                VideoCropService.this.isCropPanelShowing = false;
                int[] t5 = editorProContext.getPlayer().t5();
                if (t5 != null) {
                    editorProContext.getPlayer().LIZ(t5[0], t5[1], t5[2], t5[3]);
                }
                C79057V0z.LJJJJL(editorProContext, "show_preview_placeholder", Boolean.FALSE);
            }
        }, 4, null);
        return C76800UCe.LIZ;
    }
}
