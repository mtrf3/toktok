package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C28733BPl;
import X.C74994Tby;
import X.C74995Tbz;
import X.C75236Tfs;
import X.C76800UCe;
import X.EnumC35745E1d;
import X.InterfaceC75579TlP;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.TTD;
import com.bytedance.android.live.liveinteract.api.LinkGuestZoomEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes14.dex */
public class AqS35S1300000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS35S1300000_13 aqS35S1300000_13, Object obj) {
        String str;
        C75236Tfs setState = (C75236Tfs) obj;
        o.LJIIIZ(setState, "$this$setState");
        boolean gv0 = ((MultiGuestSharedBgAnchorViewModel) aqS35S1300000_13.l1).gv0(true);
        String str2 = aqS35S1300000_13.s0;
        String str3 = ((LiveEffect) aqS35S1300000_13.l2).shareImageUrl;
        DownloadInfo downloadInfo = (DownloadInfo) aqS35S1300000_13.l3;
        if (downloadInfo != null) {
            str = downloadInfo.getTargetFilePath();
        } else {
            str = null;
        }
        return C75236Tfs.LIZ(setState, false, gv0, str2, str3, str, 3);
    }

    public static final Object invoke$1(AqS35S1300000_13 aqS35S1300000_13, Object obj) {
        C74994Tby c74994Tby = (C74994Tby) aqS35S1300000_13.l1;
        c74994Tby.LIZIZ = (Layout) obj;
        DataChannel dataChannel = c74994Tby.LIZ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkGuestZoomEvent.class, new TTD(aqS35S1300000_13.s0, c74994Tby.LIZJ, EnumC35745E1d.ZOOM_MAX));
        }
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        C74995Tbz.LJII.getClass();
        LJIILIIL.LJIIIIZZ(C74995Tbz.LJIILJJIL, C113554cx.LJJLIIIIJ(new OSZ("action", "loadZoomDataFromSei"), new OSZ("linkMicId", ((SeiAppData) aqS35S1300000_13.l2).toString())));
        C74994Tby c74994Tby2 = (C74994Tby) aqS35S1300000_13.l1;
        String str = aqS35S1300000_13.s0;
        Layout LJ = c74994Tby2.LJ();
        ((C74994Tby) aqS35S1300000_13.l1).LJIIIIZZ(aqS35S1300000_13.s0, (InterfaceC75579TlP) aqS35S1300000_13.l3);
        c74994Tby2.LJIILIIL(str, LJ, 0, (InterfaceC75579TlP) aqS35S1300000_13.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S1300000_13(C74994Tby c74994Tby, String str, SeiAppData seiAppData, InterfaceC75579TlP interfaceC75579TlP, int i) {
        super(1);
        this.$t = i;
        this.l1 = c74994Tby;
        this.s0 = str;
        this.l2 = seiAppData;
        this.l3 = interfaceC75579TlP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S1300000_13(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, String str, LiveEffect liveEffect, DownloadInfo downloadInfo, int i) {
        super(1);
        this.$t = i;
        this.l1 = multiGuestSharedBgAnchorViewModel;
        this.s0 = str;
        this.l2 = liveEffect;
        this.l3 = downloadInfo;
    }
}
