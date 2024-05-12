package X;

import Y.AfS57S0100000_5;
import Y.IDCListenerS49S0200000_5;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.rank.impl.setting.RankOptOutTipsDialog;
import com.bytedance.android.livesdk.model.message.RankToastMessage;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BJf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28571BJf implements B5D, OnMessageListener {
    public FragmentManager LJLIL;

    public static final boolean LIZLLL() {
        Long l = (Long) DataChannelGlobal.LJLJJI.mv0(C29025BaH.class);
        if (l == null || l.longValue() <= BJW.RANK_SWITCH_STATUS_HIDE.getValue()) {
            return false;
        }
        return true;
    }

    public static final void LJI() {
        T28.LIZLLL(((UserApi) Q7L.LIZIZ(UserApi.class)).getUserAttr("6,12")).LJJII(C28581BJp.LJLIL, C28572BJg.LJLIL);
    }

    public static BZI LJ(String str) {
        String str2;
        BZI LIZIZ = C0N3.LIZIZ(str, "live_page", "enter_from");
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZIZ.LJIJJ(str2, "user_type");
        return LIZIZ;
    }

    @Override // X.B5D
    public final void LIZ(long j) {
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(j);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.RANK_TOAST_MESSAGE.getIntType(), this);
        }
        this.LJLIL = null;
    }

    @Override // X.B5D
    public final void LIZIZ(FragmentManager fragmentManager) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        this.LJLIL = fragmentManager;
    }

    @Override // X.B5D
    public final void LIZJ(long j) {
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(j);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.RANK_TOAST_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LOCAL_LIVE_PLAY_ORIENTATION_CHANGED_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        FragmentManager fragmentManager;
        Boolean bool;
        FragmentManager fragmentManager2;
        if (iMessage instanceof RankToastMessage) {
            RankToastMessage.RankToast rankToast = ((RankToastMessage) iMessage).toast;
            if (rankToast != null) {
                bool = Boolean.valueOf(rankToast.shouldToast);
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool) && (fragmentManager2 = this.LJLIL) != null) {
                if (C15380j0.LJIILLIIL()) {
                    new RankOptOutTipsDialog().show(fragmentManager2, RankOptOutTipsDialog.LJLILLLLZI);
                    return;
                } else {
                    B5D.LJJJJZI.getClass();
                    C28168B3s.LIZIZ = true;
                    return;
                }
            }
            return;
        }
        if (!(iMessage instanceof BAV) || !((BAV) iMessage).LJLIL) {
            return;
        }
        C28168B3s c28168B3s = B5D.LJJJJZI;
        c28168B3s.getClass();
        if (!C28168B3s.LIZIZ || (fragmentManager = this.LJLIL) == null) {
            return;
        }
        new RankOptOutTipsDialog().show(fragmentManager, RankOptOutTipsDialog.LJLILLLLZI);
        c28168B3s.getClass();
        C28168B3s.LIZIZ = false;
    }

    public static final void LJFF(long j, long j2, BJT listener) {
        o.LJIIIZ(listener, "listener");
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((UserApi) C65814PsI.LIZJ(UserApi.class)).updateSwitch(j, j2)).LJJJLIIL(new AfS57S0100000_5(listener, 279), new AfS57S0100000_5(listener, 280));
    }

    public final void LJII(Context context, long j, long j2, boolean z, BJT bjt) {
        int i;
        if (context != null && ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecret() == 1 && j2 == BJW.RANK_SWITCH_STATUS_ON.getValue()) {
            C77437UaH c77437UaH = new C77437UaH(context);
            c77437UaH.LJI(R.string.mdx);
            if (z) {
                i = R.string.nsg;
            } else {
                i = R.string.nsj;
            }
            c77437UaH.LIZIZ(i);
            c77437UaH.LJ(R.string.mo_, new DialogInterfaceOnClickListenerC28570BJe(this, j, j2, bjt), false);
            c77437UaH.LIZJ(R.string.mdy, new IDCListenerS49S0200000_5(bjt, this, 14), false);
            c77437UaH.LJJII = false;
            DialogC77438UaI LIZ = c77437UaH.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-981408558455369051")).LIZ) {
                LIZ.show();
            }
            LJ("livesdk_turn_on_ranking_popup_show").LJJIIJZLJL();
            return;
        }
        LJFF(j, j2, bjt);
    }
}
