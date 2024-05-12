package X;

import Y.IDCListenerS83S0200000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.dataChannel.PreviewBroadcastBlockChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1u9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47771u9 extends AbstractC65781Prl implements InterfaceC88472Yns<LatestBanRecordInfo, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47771u9(Context context, DataChannel dataChannel) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LatestBanRecordInfo latestBanRecordInfo) {
        long j;
        LatestBanRecordInfo latestBanRecordInfo2 = latestBanRecordInfo;
        if (latestBanRecordInfo2 != null) {
            Context context = this.LJLIL;
            DataChannel dataChannel = this.LJLILLLLZI;
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                C38995FSd.LIZIZ().submit(new IDRunnableS85S0100000(latestBanRecordInfo2, 70));
            } else {
                C0N7.LJIIZILJ(latestBanRecordInfo2);
            }
            if (latestBanRecordInfo2.isBannedForever) {
                j = -1;
            } else {
                j = latestBanRecordInfo2.banTime + latestBanRecordInfo2.banDuration;
            }
            if (dataChannel != null) {
                C28907BWd c28907BWd = new C28907BWd(latestBanRecordInfo2.banSource, j, latestBanRecordInfo2.logId, latestBanRecordInfo2.detailUrl);
                c28907BWd.LIZ(dataChannel);
                dataChannel.rv0(PreviewBroadcastBlockChannel.class, Boolean.TRUE);
                String str = latestBanRecordInfo2.detailUrl;
                o.LJIIIIZZ(str, "record.detailUrl");
                C29702BlC LIZ = C18230nb.LIZ("ttlive_blocked_detail_url");
                LIZ.LJ("preview");
                LIZ.LIZLLL("url", str);
                LIZ.LJIIIZ();
                if (context != null) {
                    SpannableString spannableString = new SpannableString(C15380j0.LJIILJJIL(R.string.mot));
                    spannableString.setSpan(new ForegroundColorSpan(-119723), 0, spannableString.length(), 33);
                    C77437UaH c77437UaH = new C77437UaH(context);
                    String str2 = c28907BWd.LJ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c77437UaH.LJI = str2;
                    c77437UaH.LIZJ = C15380j0.LJIILJJIL(R.string.mos);
                    c77437UaH.LJ(R.string.lv7, new DialogInterface.OnClickListener() { // from class: X.0N2
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialog, int i) {
                            o.LJIIIZ(dialog, "dialog");
                            dialog.dismiss();
                        }
                    }, false);
                    IDCListenerS83S0200000 iDCListenerS83S0200000 = new IDCListenerS83S0200000(context, c28907BWd, 3);
                    c77437UaH.LIZLLL = spannableString;
                    c77437UaH.LJIIZILJ = iDCListenerS83S0200000;
                    DialogC77438UaI LIZ2 = c77437UaH.LIZ();
                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "5723194304656714945")).LIZ) {
                        LIZ2.show();
                    }
                    BZI LIZ3 = C28787BRn.LIZ("livesdk_live_appeal_popup_show");
                    LIZ3.LJIIZILJ();
                    LIZ3.LJIIL("show");
                    LIZ3.LJJIIJZLJL();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
