package X;

import Y.ACListenerS31S0300000_5;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Bf2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29320Bf2 implements InterfaceC29321Bf3 {
    public final ImageView LIZ;
    public final C47121t6 LIZIZ;
    public final C47121t6 LIZJ;

    public C29320Bf2(View view) {
        View findViewById = view.findViewById(R.id.brd);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.connect)");
        this.LIZ = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.e0n);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.guide_content)");
        this.LIZIZ = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.erq);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.invite)");
        this.LIZJ = (C47121t6) findViewById3;
    }

    @Override // X.InterfaceC29321Bf3
    public final void LIZ(CQQ cqq, C29326Bf8 model) {
        ImageModel imageModel;
        o.LJIIIZ(model, "model");
        User user = ((LinkMicAnchorGuideMessage) model.LJIJJLI).user;
        BQO LIZ = C15650jR.LIZ();
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        C78720Uuy LJIIIZ = LIZ.LJIIIZ(imageModel);
        LJIIIZ.LJIIL = Boolean.TRUE;
        LJIIIZ.LJIIIIZZ = R.drawable.cul;
        LJIIIZ.LJIIJJI(this.LIZ);
        C47121t6 c47121t6 = this.LIZIZ;
        String str = ((LinkMicAnchorGuideMessage) model.LJIJJLI).guideContent;
        o.LJIIIIZZ(str, "model.message.guideContent");
        String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(new Object[]{C05170If.LIZ(user)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c47121t6.setText(LLLZ);
        this.LIZJ.setText(cqq.LIZ.getString(R.string.sr0));
        C16880lQ.LJJIIZ(this.LIZJ, new ACListenerS31S0300000_5(user, this, cqq, 30));
        if (model.LJIIL.LIZ == 1) {
            C29319Bf1.LIZIZ(cqq.LJIIIIZZ, String.valueOf(cqq.LIZLLL()), ((LinkMicAnchorGuideMessage) model.LJIJJLI).isFollowRival);
        }
    }
}
