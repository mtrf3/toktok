package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TaT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74901TaT extends AbstractC76214Tve<LinkPlayerInfo> {
    public final DataChannel LJLIL;
    public final TVD LJLILLLLZI;
    public final C31597Caf LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final ImageView LJLJJLL;

    public final void M() {
        TVD tvd = this.LJLILLLLZI;
        if (tvd == null) {
            return;
        }
        if (tvd.LJIIIIZZ) {
            C15490jB.LJ(this.LJLJJLL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_mic_normal.png");
        } else {
            C15490jB.LJ(this.LJLJJLL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_mic_baned.png");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (X.C78609UtB.LJJJZ(false) != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC76214Tve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74901TaT.L(int, java.lang.Object):void");
    }

    public C74901TaT(View view, DataChannel dataChannel, TVD tvd) {
        super(view);
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = tvd;
        View findViewById = view.findViewById(R.id.f67);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_list_user_avatar)");
        this.LJLJI = (C31597Caf) findViewById;
        View findViewById2 = view.findViewById(R.id.mpz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_user_name)");
        this.LJLJJI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.mgz);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_relationship)");
        this.LJLJJL = (C47121t6) findViewById3;
        o.LJIIIIZZ(view.findViewById(R.id.fnj), "itemView.findViewById(R.…yout_user_info_container)");
        View findViewById4 = view.findViewById(R.id.f4y);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_ic_mic)");
        this.LJLJJLL = (ImageView) findViewById4;
    }
}
