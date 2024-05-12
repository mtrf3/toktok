package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera;

import X.C16880lQ;
import X.C42625Go9;
import X.C47704Ins;
import X.C55749LuL;
import X.C84653Tx;
import X.C88963eO;
import X.C89333ez;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRoomCameraAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public TuxIconView LJLILLLLZI;
    public TuxIconView LJLJI;

    public ChatRoomCameraAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C84653Tx c84653Tx = C84653Tx.LIZ;
        if (C42625Go9.LIZ(c84653Tx)) {
            return;
        }
        C42625Go9.LIZIZ(c84653Tx);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLILLLLZI = (TuxIconView) view.findViewById(R.id.dq1);
        this.LJLJI = (TuxIconView) view.findViewById(R.id.av7);
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(0);
        }
        TuxIconView tuxIconView3 = this.LJLILLLLZI;
        if (tuxIconView3 != null) {
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS21S0100000_1(this, 73));
        }
        if (C88963eO.LJFF()) {
            TuxIconView tuxIconView4 = this.LJLILLLLZI;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconRes(R.raw.icon_image_square);
            }
            TuxIconView tuxIconView5 = this.LJLILLLLZI;
            if (tuxIconView5 != null) {
                tuxIconView5.setTintColorRes(R.attr.go);
            }
        }
        TuxIconView tuxIconView6 = this.LJLJI;
        if (tuxIconView6 != null) {
            C16880lQ.LJJJ(tuxIconView6, new ACListenerS21S0100000_1(this, 74));
        }
    }
}
