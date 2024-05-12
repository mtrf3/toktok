package X;

import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.chatroom.interact.model.RandomLinkMicExtra;

/* renamed from: X.Tkb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75529Tkb extends AbstractC75563Tl9 {
    public final /* synthetic */ C75525TkX LIZ;

    @Override // X.AbstractC75563Tl9
    public final void LIZIZ() {
        String str;
        C75525TkX.LIZJ();
        C75525TkX c75525TkX = this.LIZ;
        RandomLinkMicManager.LJLIL.getClass();
        RandomLinkMicExtra randomLinkMicExtra = RandomLinkMicManager.LJLLL;
        if (randomLinkMicExtra == null || (str = randomLinkMicExtra.bubbleTextConnecting) == null) {
            str = "";
        }
        c75525TkX.LJIIZILJ(str, C75541Tkn.LJLIL, true);
    }

    @Override // X.AbstractC75563Tl9
    public final void LIZ() {
        C75525TkX.LIZJ();
    }

    public C75529Tkb(C75525TkX c75525TkX) {
        this.LIZ = c75525TkX;
    }

    @Override // X.AbstractC75563Tl9
    public final void LIZJ(OSZ<? extends EnumC75535Tkh, Long> osz) {
        String str;
        long j;
        String str2;
        String str3 = this.LIZ.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWaitingPairChange, linkCrossRoomState = ");
        LIZ.append(this.LIZ.LLIIIJ);
        LIZ.append(", first = ");
        LIZ.append(osz.getFirst());
        LIZ.append("  second = ");
        LIZ.append(osz.getSecond().longValue());
        C0NB.LIZIZ(str3, X1D.LIZIZ(LIZ));
        if (this.LIZ.LLIIIJ != 1) {
            return;
        }
        String str4 = "";
        String str5 = null;
        long j2 = 16;
        if (osz.getFirst() == EnumC75535Tkh.COUNTDOWN_WAITING) {
            ImageView imageView = this.LIZ.LJLJLLL;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C47121t6 c47121t6 = this.LIZ.LJLJLJ;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            RandomLinkMicManager.LJLIL.getClass();
            RandomLinkMicExtra randomLinkMicExtra = RandomLinkMicManager.LJLLL;
            if (randomLinkMicExtra != null) {
                j2 = randomLinkMicExtra.expectMatchTime;
                j = randomLinkMicExtra.expectMatchTime - randomLinkMicExtra.roundTime;
            } else {
                j = 12;
            }
            long longValue = osz.getSecond().longValue();
            if (longValue == j2) {
                this.LIZ.LJIJ(EnumC75537Tkj.QUICK_LINKMIC);
            } else if (longValue == j && RandomLinkMicManager.LJIIJJI()) {
                C75525TkX c75525TkX = this.LIZ;
                RandomLinkMicExtra randomLinkMicExtra2 = RandomLinkMicManager.LJLLL;
                if (randomLinkMicExtra2 != null) {
                    str5 = randomLinkMicExtra2.bubbleTextFirstRound;
                }
                c75525TkX.getClass();
                if (C75525TkX.LJIILLIIL(str5)) {
                    C75525TkX.LIZJ();
                    C75525TkX c75525TkX2 = this.LIZ;
                    RandomLinkMicExtra randomLinkMicExtra3 = RandomLinkMicManager.LJLLL;
                    if (randomLinkMicExtra3 != null && (str2 = randomLinkMicExtra3.bubbleTextFirstRound) != null) {
                        str4 = str2;
                    }
                    c75525TkX2.LJIIZILJ(str4, C75539Tkl.LJLIL, false);
                }
            }
            C47121t6 c47121t62 = this.LIZ.LJLJLJ;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setText(String.valueOf(osz.getSecond().longValue()));
            return;
        }
        if (osz.getFirst() != EnumC75535Tkh.TIMEOUT_WAITING) {
            return;
        }
        C47121t6 c47121t63 = this.LIZ.LJLJLJ;
        if (c47121t63 != null) {
            c47121t63.setVisibility(8);
        }
        ImageView imageView2 = this.LIZ.LJLJLLL;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        RandomLinkMicManager.LJLIL.getClass();
        RandomLinkMicExtra randomLinkMicExtra4 = RandomLinkMicManager.LJLLL;
        if (randomLinkMicExtra4 != null) {
            j2 = randomLinkMicExtra4.expectMatchTime;
        }
        if (osz.getSecond().longValue() != j2 + 1 || !RandomLinkMicManager.LJIIJJI()) {
            return;
        }
        C75525TkX c75525TkX3 = this.LIZ;
        RandomLinkMicExtra randomLinkMicExtra5 = RandomLinkMicManager.LJLLL;
        if (randomLinkMicExtra5 != null) {
            str5 = randomLinkMicExtra5.bubbleTextSecondRound;
        }
        c75525TkX3.getClass();
        if (!C75525TkX.LJIILLIIL(str5)) {
            return;
        }
        C75525TkX.LIZJ();
        C75525TkX c75525TkX4 = this.LIZ;
        RandomLinkMicExtra randomLinkMicExtra6 = RandomLinkMicManager.LJLLL;
        if (randomLinkMicExtra6 != null && (str = randomLinkMicExtra6.bubbleTextSecondRound) != null) {
            str4 = str;
        }
        c75525TkX4.LJIIZILJ(str4, C75540Tkm.LJLIL, false);
    }
}
