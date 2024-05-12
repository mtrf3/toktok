package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.AbstractC177926ya;
import X.C177886yW;
import X.C177896yX;
import X.C177906yY;
import X.C177916yZ;
import X.C177996yh;
import X.C178336zF;
import X.C70X;
import X.C71Y;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS46S1200000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowKeyboardVM extends AssemViewModel<C178336zF> {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C178336zF defaultState() {
        return new C178336zF(0);
    }

    public final void hv0(Aweme aweme) {
        String str;
        Aweme aweme2 = getVmDispatcher().getState().LJLIL;
        String str2 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        o.LJ(str, str2);
        setState(new AqS169S0100000_3(aweme, 68));
    }

    public final void iv0(AbstractC177926ya panel, boolean z) {
        boolean z2;
        o.LJIIIZ(panel, "panel");
        if (o.LJ(panel, C177906yY.LIZ) || o.LJ(panel, C177916yZ.LIZ)) {
            z2 = true;
        } else {
            z2 = false;
        }
        setStateImmediate(new AqS8S0010000_3(z2, 10));
        C178336zF state = getVmDispatcher().getState();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchPanel current:");
        LIZ.append(state.LJLJJI);
        LIZ.append("  to:");
        LIZ.append(panel);
        C71Y.LIZ("xjccccccc", X1D.LIZIZ(LIZ));
        if (o.LJ(panel, C177916yZ.LIZ) && (o.LJ(state.LJLJJI, C177886yW.LIZ) || o.LJ(state.LJLJJI, C177896yX.LIZ))) {
            setState(C70X.LJLIL);
        }
        if (z) {
            setStateImmediate(new AqS169S0100000_3(panel, 69));
        } else {
            setState(new AqS169S0100000_3(panel, 70));
        }
    }

    public final void jv0(Comment comment, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryReply ");
        LIZ.append(str);
        C177996yh.LIZIZ("xjcccc", X1D.LIZIZ(LIZ));
        withState(new AqS46S1200000_3(this, comment, str, 1));
    }

    public final void kv0(int i, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSoftKeyboardState ");
        LIZ.append(z);
        LIZ.append("  ");
        LIZ.append(i);
        LIZ.append(' ');
        C71Y.LIZLLL("xjccccc", X1D.LIZIZ(LIZ));
        if (!z) {
            withState(new AqS93S0101000_3(this, i, 4));
        } else {
            setState(new AqS28S0001000_3(i, 7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(java.lang.String r10, java.lang.String r11, java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct> r12, com.ss.android.ugc.aweme.comment.model.Comment r13) {
        /*
            r9 = this;
            java.lang.String r0 = "aid"
            r3 = r10
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "text"
            r4 = r11
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            if (r12 == 0) goto L7e
            com.google.gson.Gson r0 = X.C70Y.LIZ
            java.lang.String r5 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r12)
            java.lang.String r0 = "INSTANCE.toJson(o)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
        L19:
            com.ss.android.ugc.now.interaction.api.InteractionApiService r2 = com.ss.android.ugc.now.interaction.api.InteractionApiService.LIZIZ
            r7 = 0
            if (r13 == 0) goto L7c
            java.lang.String r0 = r13.getReplyId()
        L22:
            java.lang.String r1 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L32
            if (r13 == 0) goto L79
            java.lang.String r0 = r13.getReplyId()
            if (r0 != 0) goto L74
        L32:
            if (r13 == 0) goto L79
            java.lang.String r6 = r13.getCid()
        L38:
            java.lang.String r0 = r13.getReplyId()
        L3c:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L4a
            if (r13 == 0) goto L4a
            java.lang.String r0 = r13.getReplyId()
            if (r0 != 0) goto L6f
        L4a:
            r8 = 2
            X.Svk r1 = r2.publishComment(r3, r4, r5, r6, r7, r8)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r3 = r1.LJJJ(r0)
            Y.AfS55S0100000_3 r2 = new Y.AfS55S0100000_3
            r0 = 3
            r2.<init>(r9, r0)
            Y.AfS55S0100000_3 r1 = new Y.AfS55S0100000_3
            r0 = 4
            r1.<init>(r9, r0)
            r3.LJJJLIIL(r2, r1)
            return
        L6f:
            java.lang.String r7 = r13.getCid()
            goto L4a
        L74:
            java.lang.String r6 = r13.getReplyId()
            goto L38
        L79:
            r6 = r7
            r0 = r7
            goto L3c
        L7c:
            r0 = r7
            goto L22
        L7e:
            java.lang.String r5 = "[]"
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM.gv0(java.lang.String, java.lang.String, java.util.List, com.ss.android.ugc.aweme.comment.model.Comment):void");
    }
}
