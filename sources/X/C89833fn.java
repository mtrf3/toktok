package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.3fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89833fn extends C89843fo<IMUser> {
    public final View LJLIL;
    public final InterfaceC88472Yns<IMUser, C76800UCe> LJLILLLLZI;

    @Override // X.C89843fo
    public final void L(IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        if (iMUser2 == null) {
            return;
        }
        ((TextView) this.itemView.findViewById(R.id.gw7)).setText(C90173gL.LJI(iMUser2));
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(iMUser2, this, 43), this.itemView);
        C78765Uvh.LJFF((C62846OlW) this.itemView.findViewById(R.id.abt), iMUser2.getDisplayAvatar());
    }

    public C89833fn(View view, AqS167S0100000_1 aqS167S0100000_1) {
        super(view);
        this.LJLIL = view;
        this.LJLILLLLZI = aqS167S0100000_1;
    }
}
