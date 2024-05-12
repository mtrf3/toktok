package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LnH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55311LnH implements C0C3 {
    public final /* synthetic */ ReplyMessagePanel LJLIL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C55311LnH(ReplyMessagePanel replyMessagePanel) {
        this.LJLIL = replyMessagePanel;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        List<Aweme> list;
        Aweme aweme;
        Bundle bundle;
        long parseLong;
        if (this.LJLIL.LLIIJLIL()) {
            return;
        }
        ReplyMessagePanel replyMessagePanel = this.LJLIL;
        InterfaceC51679KPz interfaceC51679KPz = replyMessagePanel.LJLL;
        if (interfaceC51679KPz instanceof C87497YVp) {
            o.LJII(interfaceC51679KPz, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.operators.ExtDetailChatOperator2");
            C87497YVp c87497YVp = (C87497YVp) interfaceC51679KPz;
            if (i >= c87497YVp.LJLL.size()) {
                StringBuilder LJ = C7MY.LJ("getMessageIndexAt at position ", i, " but list size is ");
                LJ.append(c87497YVp.LJLL.size());
                C36922EeM.LIZLLL(6, "ExtDetailChatOperator2", X1D.LIZIZ(LJ));
            } else {
                if (IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZJ() && !c87497YVp.LJLIL.LIZJ()) {
                    try {
                        String imItemId = ((Aweme) ListProtector.get(c87497YVp.LJLL, i)).getImItemId();
                        o.LJIIIIZZ(imItemId, "globalAwemeList[position].imItemId");
                        parseLong = CastLongProtector.parseLong(imItemId);
                    } catch (NumberFormatException e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("getMessageIndexAt imItemId is ");
                        LIZ.append(((Aweme) ListProtector.get(c87497YVp.LJLL, i)).getImItemId());
                        LIZ.append(": ");
                        LIZ.append(e);
                        C36922EeM.LIZLLL(6, "ExtDetailChatOperator2", X1D.LIZIZ(LIZ));
                    }
                } else {
                    String aid = ((Aweme) ListProtector.get(c87497YVp.LJLL, i)).getAid();
                    o.LJIIIIZZ(aid, "globalAwemeList[position].aid");
                    parseLong = CastLongProtector.parseLong(aid);
                }
                str = String.valueOf(parseLong);
            }
            parseLong = -1;
            str = String.valueOf(parseLong);
        } else {
            List<Aweme> list2 = replyMessagePanel.LLJJJJ;
            if (list2 != null && i < list2.size() && (list = replyMessagePanel.LLJJJJ) != null && (aweme = (Aweme) ORZ.LJLLLLLL(i, list)) != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
        }
        if (IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZ() && (bundle = this.LJLIL.LLJJJIL) != null && bundle.getBoolean("key_from_quoted_video")) {
            this.LJLIL.LLIIL(null);
        } else {
            this.LJLIL.LLIIL(str);
        }
    }
}
