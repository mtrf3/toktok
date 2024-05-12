package X;

import Y.IDRunnableS0S1200000;
import android.view.View;
import com.bytedance.android.live.broadcast.mirror.GameCastWiredFragment;

/* renamed from: X.1su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47001su extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ GameCastWiredFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47001su(int i, GameCastWiredFragment gameCastWiredFragment, String str, View view) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = gameCastWiredFragment;
        this.LJLJI = str;
        this.LJLJJI = view;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                C47121t6 c47121t6 = this.LJLILLLLZI.LJLJL;
                if (c47121t6 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(this.LJLJI);
                    LIZ.append("...");
                    c47121t6.setText(X1D.LIZIZ(LIZ));
                }
                View view = this.LJLJJI;
                view.postDelayed(new IDRunnableS0S1200000(view, this.LJLJI, this.LJLILLLLZI, 4), 500L);
            } else {
                C47121t6 c47121t62 = this.LJLILLLLZI.LJLJL;
                if (c47121t62 != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(this.LJLJI);
                    LIZ2.append("..");
                    c47121t62.setText(X1D.LIZIZ(LIZ2));
                }
                View view2 = this.LJLJJI;
                view2.postDelayed(new IDRunnableS0S1200000(view2, this.LJLJI, this.LJLILLLLZI, 3), 500L);
            }
        } else {
            C47121t6 c47121t63 = this.LJLILLLLZI.LJLJL;
            if (c47121t63 != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(this.LJLJI);
                LIZ3.append('.');
                c47121t63.setText(X1D.LIZIZ(LIZ3));
            }
            View view3 = this.LJLJJI;
            view3.postDelayed(new IDRunnableS0S1200000(view3, this.LJLJI, this.LJLILLLLZI, 2), 500L);
        }
        return C76800UCe.LIZ;
    }
}
