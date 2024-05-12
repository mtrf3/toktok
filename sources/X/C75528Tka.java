package X;

import android.widget.ImageView;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;

/* renamed from: X.Tka, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75528Tka implements InterfaceC75661Tmj {
    public final /* synthetic */ C75525TkX LIZ;

    public C75528Tka(C75525TkX c75525TkX) {
        this.LIZ = c75525TkX;
    }

    @Override // X.InterfaceC75661Tmj
    public final void LIZ(OSZ<? extends EnumC75534Tkg, Long> osz) {
        String str = this.LIZ.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Topic pair onWaitingPairChange, linkCrossRoomState=");
        LIZ.append(this.LIZ.LLIIIJ);
        LIZ.append(", first=");
        LIZ.append(osz.getFirst());
        LIZ.append(", second=");
        LIZ.append(osz.getSecond().longValue());
        TYQ.LIZLLL(str, X1D.LIZIZ(LIZ));
        if (osz.getFirst() == EnumC75534Tkg.COUNTDOWN_WAITING) {
            ImageView imageView = this.LIZ.LJLJLLL;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TopicPairResponse.ResponseData.Setting setting = C75650TmY.LJIIJ;
            if (setting != null && osz.getSecond().longValue() == setting.expectSuccSec) {
                C47121t6 c47121t6 = this.LIZ.LJLJLJ;
                if (c47121t6 != null) {
                    c47121t6.setVisibility(0);
                }
                this.LIZ.LJIJ(EnumC75537Tkj.TOPIC);
            }
            C47121t6 c47121t62 = this.LIZ.LJLJLJ;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setText(String.valueOf(osz.getSecond().longValue()));
            return;
        }
        if (osz.getFirst() != EnumC75534Tkg.TIMEOUT_WAITING) {
            return;
        }
        C47121t6 c47121t63 = this.LIZ.LJLJLJ;
        if (c47121t63 != null) {
            c47121t63.setVisibility(8);
        }
        ImageView imageView2 = this.LIZ.LJLJLLL;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    @Override // X.InterfaceC75661Tmj
    public final void LIZIZ(long j) {
        String str = this.LIZ.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Topic pair onLinkSuccess, waitingTime: ");
        LIZ.append(j);
        TYQ.LIZLLL(str, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC75661Tmj
    public final void LIZJ(long j) {
        String str = this.LIZ.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Topic pair onWaitingTime, waitingTime: ");
        LIZ.append(j);
        TYQ.LIZLLL(str, X1D.LIZIZ(LIZ));
    }
}
