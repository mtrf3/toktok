package X;

import com.ss.android.ugc.aweme.effect.EffectModel;

/* renamed from: X.5Lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133365Lg extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ C5LN LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ EffectModel LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C133365Lg(Boolean bool, C5LN c5ln, long j, EffectModel effectModel, boolean z) {
        super(0);
        this.LJLIL = bool;
        this.LJLILLLLZI = c5ln;
        this.LJLJI = j;
        this.LJLJJI = effectModel;
        this.LJLJJL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        if (this.LJLIL.booleanValue()) {
            return this.LJLILLLLZI.LLIIIL(this.LJLJI, this.LJLJJI, false, this.LJLJJL);
        }
        return null;
    }
}
