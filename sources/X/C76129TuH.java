package X;

import Y.AfS29S0110000_13;
import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.multilive.model.ChannelMessage;
import com.bytedance.android.live.liveinteract.multilive.model.GuestClientList;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.WaitUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableLinkmicMessageReporterSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBusinessServerReporterIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBusinessServerReporterOptSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.TuH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76129TuH {
    public static int LIZIZ;
    public static C73411SrX LIZLLL;
    public static C73495Sst LJ;
    public static boolean LJII;
    public static long LIZ = -1;
    public static int LIZJ = 4;
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(B8J.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(B8L.LJLIL);

    public static void LIZJ() {
        if (EnableLinkmicMessageReporterSetting.INSTANCE.isReportV2()) {
            C73411SrX c73411SrX = LIZLLL;
            if (c73411SrX == null) {
                if (LJ == null) {
                    return;
                }
            } else {
                c73411SrX.dispose();
            }
            C73495Sst c73495Sst = LJ;
            if (c73495Sst != null) {
                c73495Sst.dispose();
            }
            LIZLLL = null;
            LJ = null;
            C0NB.LIZIZ("BusinessServerReporter dispose", "disPose");
        }
    }

    public static long LJ() {
        return ((Number) LJI.getValue()).longValue();
    }

    public static CopyOnWriteArrayList LIZIZ(List list) {
        long j;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LinkUser linkUser = (LinkUser) it.next();
                Long userId = linkUser.getUserId();
                if (userId != null) {
                    j = userId.longValue();
                } else {
                    j = 0;
                }
                copyOnWriteArrayList.add(new WaitUser(j, linkUser.getLinkMicId()));
            }
        } catch (Exception e) {
            C0NB.LIZIZ("BusinessServerReporter", e.getMessage());
        }
        return copyOnWriteArrayList;
    }

    public static LinkCommon LIZLLL(int i) {
        LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, null, 31, null);
        linkCommon.scene = i;
        linkCommon.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        linkCommon.live_id = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        linkCommon.extraMap = null;
        return linkCommon;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if (r4 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.U66 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76129TuH.LIZ(X.U66, boolean):void");
    }

    public static void LJFF(int i, U66 linker, String str, boolean z, int i2) {
        int i3;
        String str2 = str;
        boolean z2 = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) == 0) {
            z2 = z;
        }
        o.LJIIIZ(linker, "linker");
        if (!EnableLinkmicMessageReporterSetting.INSTANCE.isReportV2()) {
            return;
        }
        LIZJ();
        if (i != 0) {
            LIZIZ = i;
        }
        int i4 = 1;
        if (C74740TUy.LIZLLL().LJ()) {
            i3 = 3;
        } else if (LJII) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        ReportLinkMessageReq reportLinkMessageReq = new ReportLinkMessageReq(null, null, null, null, null, 31, null);
        if (str2 == null && (str2 = linker.LLZLL()) == null) {
            str2 = linker.LLZL().getLinkMicId();
        }
        if (linker.LLLLZLL().LIZ) {
            i4 = 2;
        }
        if (z2) {
            i4 = 2;
        }
        reportLinkMessageReq.common = LIZLLL(linker.getScene());
        reportLinkMessageReq.mySelf = new Player(((Number) LJFF.getValue()).longValue(), LJ());
        long LJJLI = linker.LJJLI();
        LayoutInfo LLLZI = linker.LLLZI();
        reportLinkMessageReq.channelMessage = new ChannelMessage(LJJLI, 2, LLLZI.getLayoutId(), LLLZI.getVersion());
        reportLinkMessageReq.anchorClientList = null;
        reportLinkMessageReq.guestClientList = new GuestClientList(LJ(), str2, i3, LIZIZ, i4);
        C0NB.LIZIZ("BusinessServerReporter", reportLinkMessageReq.toString());
        C65814PsI.LIZ().getClass();
        LJ = (C73495Sst) T28.LIZLLL(((LinkMicApi) C65814PsI.LIZJ(LinkMicApi.class)).reportLinkMsg(reportLinkMessageReq)).LJJII(new AfS29S0110000_13(linker, z2, 20), C28219B5r.LJLIL);
        if (!MultiGuestBusinessServerReporterOptSetting.INSTANCE.isOpt() || z2) {
            return;
        }
        long interval = MultiGuestBusinessServerReporterIntervalSetting.INSTANCE.interval();
        LIZ = interval;
        if (interval <= 0) {
            return;
        }
        LIZLLL = (C73411SrX) TMC.LJJI(interval, TimeUnit.SECONDS).LJJJ(T16.LIZ()).LJJJLIIL(new AfS65S0100000_13(linker, 252), new InterfaceC64592gB() { // from class: X.9Dk
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
