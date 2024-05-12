package com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer;

import X.C106674Gp;
import X.C109544Rq;
import X.C111784a6;
import X.C3Q9;
import X.C45243HpH;
import X.C4WC;
import X.C63120Opw;
import X.C75782yE;
import X.C80763Ey;
import X.C84893Uv;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMReactionViewModel extends ViewModel {
    public final List<C111784a6> LJLIL = new ArrayList();
    public C109544Rq LJLILLLLZI;
    public String LJLJI;
    public final String LJLJJI;

    public IMReactionViewModel() {
        String LIZ = C80763Ey.LIZ(false);
        LIZ.toString();
        this.LJLJJI = LIZ;
    }

    public final void hv0(String str) {
        C109544Rq c109544Rq = this.LJLILLLLZI;
        if (c109544Rq != null) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(c109544Rq.getConversationId());
            if (LIZ != null) {
                if ((LIZ.isGroupChat() && (!LIZ.isMember() || LIZ.isDissolved())) || o.LJ(this.LJLJI, "❤️")) {
                    return;
                } else {
                    C106674Gp.LJIILL(c109544Rq, this.LJLJJI, LIZ, this.LJLJI, "❤️");
                }
            }
            C84893Uv.LIZIZ(c109544Rq, c109544Rq.isSelf(), C45243HpH.LIZ("like_method", str, "emoji_name", "❤️"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C111814a9 gv0(com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer.IMReactionViewModel r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer.IMReactionViewModel.gv0(com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer.IMReactionViewModel, java.lang.String):X.4a9");
    }
}
