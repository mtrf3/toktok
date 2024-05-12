package X;

import Y.IDCListenerS277S0100000_1;
import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.share.sendto.SendToSheetFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4cN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113194cN extends AbstractC113244cS {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        ActivityC45651qj activityC45651qj;
        Object LIZ;
        Object LIZ2;
        InterfaceC113204cO interfaceC113204cO = (InterfaceC113204cO) xBaseParamModel;
        o.LJIIIZ(type, "type");
        Object obj = null;
        if (!((RBX) HG3.LJIILL()).isLogin() || C78966Uyw.LJJIJ().LIZIZ() || ((RBY) HG3.LJIILL()).isChildrenMode()) {
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC113214cP.class, null);
            ((InterfaceC113214cP) LIZJ).setButton("fail");
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
            return;
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
            return;
        }
        if (C4LY.LIZ()) {
            C85773Yf.LIZJ(EnumC100693xJ.SEND_TO_DIALOG);
        }
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(c37356ElM, 429);
        SendToSheetFragment sendToSheetFragment = new SendToSheetFragment();
        ASL asl = new ASL();
        asl.LJFF(16);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = sendToSheetFragment;
        tuxSheet.LJLIL = new IDCListenerS277S0100000_1(aqS167S0100000_1, 0);
        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.4cQ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C34B.LIZIZ("showSendToSheet", "dismiss");
            }
        };
        try {
            LIZ = Integer.valueOf(interfaceC113204cO.getSendMessageScene().intValue());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num = (Integer) LIZ;
        String uid = interfaceC113204cO.getUid();
        String nickName = interfaceC113204cO.getNickName();
        String conversationId = interfaceC113204cO.getConversationId();
        try {
            LIZ2 = Integer.valueOf(interfaceC113204cO.getMessageType().intValue());
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        sendToSheetFragment.LJLILLLLZI = new C113154cJ(uid, nickName, conversationId, interfaceC113204cO.getMessageToSend(), interfaceC113204cO.getCoverUrl(), interfaceC113204cO.getContent(), interfaceC113204cO.getSendScene(), num, (Integer) obj);
        sendToSheetFragment.LJLJI = new AqS151S0100000_1(tuxSheet, 17);
        sendToSheetFragment.LJLJJI = new AqS167S0100000_1(aqS167S0100000_1, 17);
        C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "SendToSheetFragment");
    }
}
