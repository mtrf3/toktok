package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.5Hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132275Hb extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C132265Ha LJLILLLLZI;
    public final /* synthetic */ NLETrackSlot LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C132275Hb(boolean z, C132265Ha c132265Ha, NLETrackSlot nLETrackSlot, long j) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = c132265Ha;
        this.LJLJI = nLETrackSlot;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL) {
            C79057V0z.LJJJJL(this.LJLILLLLZI.LLF(), "select_slot_event", new C127594zb(this.LJLJI, Long.valueOf(this.LJLJJI), 6));
        } else {
            this.LJLILLLLZI.LLF().getPlayer().M9(this.LJLJJI);
        }
        this.LJLILLLLZI.LLIIZ(this.LJLJJI);
        this.LJLILLLLZI.LJLLI = false;
        return C76800UCe.LIZ;
    }
}
