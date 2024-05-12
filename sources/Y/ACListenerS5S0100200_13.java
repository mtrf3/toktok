package Y;

import X.C03880Dg;
import X.C16880lQ;
import X.C41051jJ;
import X.C47071t1;
import X.C65300Pk0;
import X.C74746TVe;
import X.C74747TVf;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class ACListenerS5S0100200_13 implements View.OnClickListener {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS5S0100200_13 aCListenerS5S0100200_13, View view) {
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog = (GameLinkGuestBeInvitedDialog) aCListenerS5S0100200_13.l0;
        long j = aCListenerS5S0100200_13.j1;
        long j2 = aCListenerS5S0100200_13.j2;
        C41051jJ c41051jJ = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cx6, C16880lQ.LLZIL(gameLinkGuestBeInvitedDialog.getContext()), null);
        if (LLLZIIL != null) {
            c41051jJ = (C41051jJ) LLLZIIL.findViewById(R.id.b7u);
        }
        gameLinkGuestBeInvitedDialog.LJLLI = c41051jJ;
        C47071t1 c47071t1 = new C47071t1(gameLinkGuestBeInvitedDialog.getContext());
        c47071t1.LIZIZ = gameLinkGuestBeInvitedDialog;
        c47071t1.LJIILLIIL(R.string.n_a);
        c47071t1.LJI(LLLZIIL);
        c47071t1.LJIIL(R.string.n_5, new C74747TVf(gameLinkGuestBeInvitedDialog, j, j2));
        c47071t1.LJIIIZ(R.string.n_4, new IDcS172S0100000_13(gameLinkGuestBeInvitedDialog, 28));
        c47071t1.LJIILJJIL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        gameLinkGuestBeInvitedDialog.LJLLILLLL = LIZ;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "3452230276088147070")).LIZ) {
            LIZ.show();
        }
        C74746TVe.LJ("show", CardStruct.IStatusCode.DEFAULT);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS5S0100200_13 r15, android.view.View r16) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS5S0100200_13.onClick$1(Y.ACListenerS5S0100200_13, android.view.View):void");
    }

    public ACListenerS5S0100200_13(Object obj, long j, long j2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
        this.j2 = j2;
    }
}
