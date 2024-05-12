package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;

/* renamed from: X.Tzb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76459Tzb implements InterfaceC15710jX {
    public final /* synthetic */ ItemInfo4FE LJLIL;
    public final /* synthetic */ MatchItemAssem LJLILLLLZI;
    public final /* synthetic */ C72242sW LJLJI;

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        if (z) {
            C0NB.LJIIIZ("MatchItemAssem", "show Self Use Card Animation first step load finish success");
            int i = this.LJLIL.itemType;
            if (i == 1) {
                C15610jN.LIZJ(this.LJLILLLLZI.LLF, 3100 - this.LJLJI.element);
            } else {
                if (i != 2) {
                    return;
                }
                C15610jN.LIZJ(this.LJLILLLLZI.LLFF, 3300 - this.LJLJI.element);
            }
        }
    }

    public C76459Tzb(ItemInfo4FE itemInfo4FE, MatchItemAssem matchItemAssem, C72242sW c72242sW) {
        this.LJLIL = itemInfo4FE;
        this.LJLILLLLZI = matchItemAssem;
        this.LJLJI = c72242sW;
    }
}
