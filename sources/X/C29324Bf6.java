package X;

import Y.ACListenerS31S0300000_5;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bf6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29324Bf6 implements InterfaceC29321Bf3 {
    public final View LIZ;
    public final ImageView LIZIZ;
    public final C47121t6 LIZJ;
    public final C47121t6 LIZLLL;

    public C29324Bf6(View view) {
        View findViewById = view.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content)");
        this.LIZ = findViewById;
        View findViewById2 = view.findViewById(R.id.brd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.connect)");
        this.LIZIZ = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.e0n);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.guide_content)");
        this.LIZJ = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.erq);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.invite)");
        this.LIZLLL = (C47121t6) findViewById4;
    }

    @Override // X.InterfaceC29321Bf3
    public final void LIZ(CQQ cqq, C29326Bf8 model) {
        long j;
        String str;
        o.LJIIIZ(model, "model");
        this.LIZIZ.setImageResource(R.drawable.cue);
        this.LIZJ.setText(((LinkMicAnchorGuideMessage) model.LJIJJLI).guideContent);
        this.LIZLLL.setText(((LinkMicAnchorGuideMessage) model.LJIJJLI).buttonContent);
        this.LIZ.setBackgroundResource(R.drawable.cg7);
        if (model.LJIIL.LIZ == 1) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            String valueOf = String.valueOf(j);
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            C75017TcL.LJIILLIIL(valueOf, str, "bubble_guide", String.valueOf(((LinkMicAnchorGuideMessage) model.LJIJJLI).availableFriendNumber), "");
        }
        C16880lQ.LJIIJ(new ACListenerS31S0300000_5(cqq, this, model, 31), this.LIZ);
    }
}
