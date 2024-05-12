package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.AbstractC65781Prl;
import X.C101283yG;
import X.C101303yI;
import X.C109544Rq;
import X.C76800UCe;
import X.C772831o;
import X.C78977Uz7;
import X.C84763XOl;
import X.C85323Wm;
import X.C91453iP;
import X.C98793uF;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupSystemContent$getNoticeText$3 extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ C109544Rq $message;
    public final /* synthetic */ boolean $needClickSpan;
    public final /* synthetic */ boolean $needTrackEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSystemContent$getNoticeText$3(boolean z, C109544Rq c109544Rq, boolean z2) {
        super(1);
        this.$needClickSpan = z;
        this.$message = c109544Rq;
        this.$needTrackEvent = z2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Activity LJIIIIZZ;
        o.LJIIIZ(it, "it");
        if (!this.$needClickSpan || this.$message == null || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
            return;
        }
        C98793uF.LIZLLL(new C91453iP(this.$message, "group_chat_notice_group_name", 4), LJIIIIZZ, "5", null, 8);
        if (this.$needTrackEvent) {
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            onEventV3.LIZIZ("click_report", C78977Uz7.LJJII(new OSZ("enter_from", "chat"), new OSZ("enter_method", "dm_inline")));
            C101283yG.LIZ(C101303yI.LIZJ);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(View view) {
        invoke2(view);
        return C76800UCe.LIZ;
    }
}
