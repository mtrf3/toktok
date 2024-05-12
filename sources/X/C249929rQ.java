package X;

import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;

/* renamed from: X.9rQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249929rQ extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ SpecActPendantManager LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = true;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C249929rQ(SpecActPendantManager specActPendantManager, boolean z, int i, String str) {
        super(1);
        this.LJLIL = specActPendantManager;
        this.LJLILLLLZI = z;
        this.LJLJJI = i;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        String str;
        String LJIL;
        C250209rs LIZ;
        boolean booleanValue = bool.booleanValue();
        this.LJLIL.LJJI().LJJIFFI(this.LJLIL.LJJJJ(), false);
        if (!this.LJLILLLLZI && booleanValue) {
            C249939rR c249939rR = C250079rf.LIZ;
            c249939rR.LIZLLL().storeInt("today_showed_time", c249939rR.LIZJ() + 1);
        }
        if (this.LJLILLLLZI) {
            str = "tracker";
        } else {
            str = "non_tracker";
        }
        if (this.LJLIL.LJJI().LJJIJ() && this.LJLJI && booleanValue && ((LIZ = C95J.LIZ(1)) == null || !(LIZ instanceof C250659sb))) {
            this.LJLIL.LJJJ(this.LJLJJI, str, this.LJLJJL);
        }
        if (!this.LJLIL.LJJI().LJIJ() && (LJIL = this.LJLIL.LJIL()) != null) {
            C247779nx.LIZ(LJIL, "pendant");
        }
        return C76800UCe.LIZ;
    }
}
