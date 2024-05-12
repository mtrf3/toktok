package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.viewmodel;

import X.AbstractC78621UtN;
import X.C00F;
import X.C106184Es;
import X.C1HQ;
import X.C36636EZk;
import X.C76800UCe;
import X.C772831o;
import X.C77800Ug8;
import X.C78613UtF;
import X.C85323Wm;
import X.C99033ud;
import X.XIA;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarConf;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionBarViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJI = 0;
    public final MutableLiveData<List<ActionBarButtonConf>> LJLIL = new MutableLiveData<>();
    public C99033ud LJLILLLLZI;

    public static void gv0(ActionBarViewModel actionBarViewModel) {
        boolean z;
        String str;
        AbstractC78621UtN mainCoroutineDispatcher = C36636EZk.LIZ;
        XIA ioCoroutineDispatcher = C78613UtF.LIZJ;
        actionBarViewModel.getClass();
        o.LJIIIZ(mainCoroutineDispatcher, "mainCoroutineDispatcher");
        o.LJIIIZ(ioCoroutineDispatcher, "ioCoroutineDispatcher");
        ActionBarConf LIZIZ = C106184Es.LIZIZ();
        if (C00F.LIZ(31744, 0, "tt_im_actionbar_v", true) != 0) {
            if (LIZIZ != null) {
                z = true;
            } else {
                z = false;
            }
            C85323Wm LIZ = C772831o.LIZ();
            C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.put("is_action_bar_config_exist", str);
            LIZ.LIZIZ("check_action_bar_config", LIZ2);
        }
        if (LIZIZ != null) {
            actionBarViewModel.LJLIL.setValue(actionBarViewModel.hv0(LIZIZ.getActionBarButtonConf()));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C106184Es.LIZ(false, mainCoroutineDispatcher, ioCoroutineDispatcher, new AqS167S0100000_1(actionBarViewModel, 413), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf> hv0(java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf> r30) {
        /*
            r29 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r30 == 0) goto L87
            java.util.Iterator r6 = r30.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r7 = r6.next()
            com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf r7 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf) r7
            java.lang.String r0 = r7.getActionSchema()
            java.lang.String r5 = "CONVERSATION_ID"
            r4 = 0
            if (r0 == 0) goto L85
            boolean r1 = ujb.s.LJJJLZIJ(r0, r5, r4)
            r0 = 1
            if (r1 != r0) goto L85
        L27:
            r2 = 0
            if (r0 == 0) goto L42
            java.lang.String r1 = r7.getActionSchema()
            if (r1 == 0) goto L42
            r0 = r29
            X.3ud r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L3c
            java.lang.String r0 = r0.getConversationId()
            if (r0 != 0) goto L3e
        L3c:
            java.lang.String r0 = ""
        L3e:
            java.lang.String r2 = ujb.o.LJJJJZ(r1, r5, r0, r4)
        L42:
            java.lang.String r0 = "&title="
            java.lang.StringBuilder r1 = defpackage.b1.LIZJ(r2, r0)
            java.lang.String r0 = r7.getTitle()
            r1.append(r0)
            java.lang.String r9 = X.X1D.LIZIZ(r1)
            r8 = 0
            r24 = 0
            r27 = 524285(0x7fffd, float:7.3468E-40)
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r25 = r24
            r26 = r8
            r28 = r8
            com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf r0 = com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 != 0) goto L81
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L81:
            r3.add(r0)
            goto Lb
        L85:
            r0 = 0
            goto L27
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.viewmodel.ActionBarViewModel.hv0(java.util.List):java.util.List");
    }
}
