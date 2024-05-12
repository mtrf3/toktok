package com.ss.android.ugc.aweme.im.sdk.chat.feature.top;

import X.C99033ud;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BottomNoticeViewModel extends SessionListTopNoticeViewModel {
    public final Context LLF;
    public C99033ud LLFF;
    public String LLFFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNoticeViewModel(Context context) {
        super(null, null, null, 1023);
        o.LJIIIZ(context, "context");
        this.LLF = context;
        this.LLFFF = "notice_code";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pv0(int r12, java.lang.String r13, boolean r14) {
        /*
            r11 = this;
            X.3ud r3 = r11.LLFF
            boolean r0 = r3 instanceof X.C98563ts
            if (r0 == 0) goto Lc9
            java.lang.String r2 = "group_chat"
        L8:
            java.lang.String r1 = r11.LLFFF
            if (r3 == 0) goto Lc6
            java.lang.String r0 = r3.getConversationId()
        L10:
            r11.ov0(r12, r1, r2, r0)
            java.lang.String r7 = "chat"
            java.lang.String r6 = "enter_from"
            java.lang.String r5 = "eventSender"
            r4 = 3
            if (r14 == 0) goto L37
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            X.3ud r0 = r11.LLFF
            boolean r8 = r0 instanceof X.C98563ts
            if (r0 == 0) goto L2c
            java.lang.String r3 = r0.getConversationId()
            if (r3 != 0) goto L2e
        L2c:
            java.lang.String r3 = ""
        L2e:
            X.3Wm r2 = X.C772831o.LIZ()
            kotlin.jvm.internal.o.LJIIIZ(r2, r5)
            if (r9 != 0) goto L55
        L37:
            if (r12 != r4) goto L54
            X.3Wm r3 = X.C772831o.LIZ()
            kotlin.jvm.internal.o.LJIIIZ(r3, r5)
            X.1HQ r2 = new X.1HQ
            r2.<init>()
            r2.put(r6, r7)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "pop_up"
            r2.put(r1, r0)
            java.lang.String r0 = "click_report"
            r3.LIZIZ(r0, r2)
        L54:
            return
        L55:
            int r1 = r9.intValue()
            r0 = 1
            if (r1 != r0) goto Lb3
            java.lang.String r1 = "close"
        L5e:
            if (r13 == 0) goto L73
            int r9 = r13.hashCode()
            r0 = -2140634290(0xffffffff8068834e, float:-9.597995E-39)
            if (r9 == r0) goto La7
            r0 = -1495853829(0xffffffffa6d714fb, float:-1.4924309E-15)
            if (r9 == r0) goto L9b
            r0 = -318810992(0xffffffffecff5490, float:-2.4694034E27)
            if (r9 == r0) goto L90
        L73:
            java.lang.String r10 = "new chat"
        L75:
            java.lang.String r0 = "action_type"
            X.1HQ r9 = X.HXX.LIZJ(r0, r1, r6, r7)
            java.lang.String r0 = "conversation_id"
            r9.put(r0, r3)
            if (r8 == 0) goto L8d
            java.lang.String r1 = "report_group_notice_click"
        L84:
            java.lang.String r0 = "safety_flag_source"
            r9.put(r0, r10)
            r2.LIZIZ(r1, r9)
            goto L37
        L8d:
            java.lang.String r1 = "report_notice_click"
            goto L84
        L90:
            java.lang.String r0 = "high_risk_report_notice"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L73
            java.lang.String r10 = "high_risk_model"
            goto L75
        L9b:
            java.lang.String r0 = "predator_report_notice"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto La4
            goto L73
        La4:
            java.lang.String r10 = "predator_model"
            goto L75
        La7:
            java.lang.String r0 = "high_risk_predator_report_notice"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto Lb0
            goto L73
        Lb0:
            java.lang.String r10 = "high_risk_model,predator_model"
            goto L75
        Lb3:
            int r1 = r9.intValue()
            r0 = 2
            if (r1 != r0) goto Lbd
            java.lang.String r1 = "make_safe"
            goto L5e
        Lbd:
            int r0 = r9.intValue()
            if (r0 != r4) goto L37
            java.lang.String r1 = "report"
            goto L5e
        Lc6:
            r0 = 0
            goto L10
        Lc9:
            java.lang.String r2 = "dm_chat"
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel.pv0(int, java.lang.String, boolean):void");
    }
}
