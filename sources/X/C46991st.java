package X;

import android.view.View;
import com.bytedance.android.live.broadcast.mirror.GameCastWiredFragment;

/* renamed from: X.1st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46991st extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ GameCastWiredFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46991st(boolean z, GameCastWiredFragment gameCastWiredFragment) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = gameCastWiredFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL) {
            C47061t0 c47061t0 = this.LJLILLLLZI.LJLJJLL;
            if (c47061t0 != null) {
                c47061t0.setVisibility(0);
            }
            View view = this.LJLILLLLZI.LJLJLJ;
            if (view != null) {
                view.setVisibility(0);
            }
            C47121t6 c47121t6 = this.LJLILLLLZI.LJLJLLL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            C47121t6 c47121t62 = this.LJLILLLLZI.LJLL;
            if (c47121t62 != null) {
                c47121t62.setVisibility(0);
            }
        } else {
            C47061t0 c47061t02 = this.LJLILLLLZI.LJLJJLL;
            if (c47061t02 != null) {
                c47061t02.setVisibility(8);
            }
            View view2 = this.LJLILLLLZI.LJLJLJ;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            C47121t6 c47121t63 = this.LJLILLLLZI.LJLJLLL;
            if (c47121t63 != null) {
                c47121t63.setVisibility(4);
            }
            C47121t6 c47121t64 = this.LJLILLLLZI.LJLL;
            if (c47121t64 != null) {
                c47121t64.setVisibility(4);
            }
        }
        return C76800UCe.LIZ;
    }
}
