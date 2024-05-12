package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageWsReuseSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.IMessageService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B3X implements B4Z {
    public static final C5H3<B3X> LJIIJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C28160B3k.LJLIL);
    public EnterRoomConfig LIZJ;
    public C28461BEz LIZLLL;
    public C28163B3n LJ;
    public B3W LJFF;
    public InterfaceC28152B3c LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final int LIZ = 1;
    public final int LIZIZ = 2;
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(B3Y.LJLIL);

    public final void LIZIZ() {
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        C28163B3n c28163B3n = this.LJ;
        if (c28163B3n != null) {
            c28163B3n.LIZLLL = false;
            C73411SrX c73411SrX = c28163B3n.LIZ;
            if (c73411SrX != null && !c73411SrX.isDisposed()) {
                c28163B3n.LIZ.dispose();
            }
        }
        C28461BEz c28461BEz = this.LIZLLL;
        if (c28461BEz != null) {
            c28461BEz.LIZJ();
        }
        this.LJ = null;
        this.LIZLLL = null;
        this.LJI = null;
        this.LJFF = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    @Override // X.B4Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r7, com.bytedance.android.livesdkapi.session.EnterRoomConfig r8) {
        /*
            r6 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.FirstScreenOptSwitcher r0 = com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.FirstScreenOptSwitcher.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r0 = r8.mStreamData
            boolean r0 = r0.isWithPush
            r2 = 1
            if (r0 == 0) goto L64
        L15:
            r0 = 0
        L16:
            r3 = 0
            r4 = 0
            if (r0 != 0) goto Lb2
            r6.LIZIZ()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r0 = r0.userId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La5
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r1 = r0.userId
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto La5
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            r0.isPreFetchUserRoom = r2
            r6.LIZJ = r8
            java.lang.String r0 = r0.userId
            kotlin.jvm.internal.o.LJI(r0)
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r4 = r0.secUid
            X.Ol8 r0 = r6.LJIIIZ
            java.lang.Object r1 = r0.getValue()
            X.B5j r1 = (X.InterfaceC28211B5j) r1
            java.lang.String r0 = "before_request_info_by_user"
            r1.LIZIZ(r0)
            X.B3n r1 = new X.B3n
            X.B3S r0 = new X.B3S
            r0.<init>(r6)
            r1.<init>(r0, r2, r4)
            r6.LJ = r1
            r1.LIZIZ()
            goto Ld
        L64:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r0 = (com.bytedance.android.livesdkapi.host.IHostAction) r0
            X.B4D r0 = r0.getLivePreloadService()
            r0.getClass()
            X.Ol8 r0 = X.C52567Kk7.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L8e
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            java.lang.String r1 = r0.enterFromMerge
            java.lang.String r0 = "push"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L8e
            goto L15
        L8e:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r0 = r8.mStreamData
            java.lang.String r0 = r0.pullStreamData
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La2
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r0 = r8.mStreamData
            java.lang.String r0 = r0.pullStreamUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
        La2:
            r0 = 1
            goto L16
        La5:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            long r1 = r0.roomId
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r6.LIZJ(r8, r7, r3)
            goto Ld
        Lb2:
            r6.LIZIZ()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            long r1 = r0.roomId
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r6.LIZJ(r8, r7, r3)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B3X.LIZ(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public final void LIZJ(EnterRoomConfig config, Context context, List list) {
        String str;
        o.LJIIIZ(config, "config");
        ((InterfaceC28211B5j) this.LJIIIZ.getValue()).LIZIZ("before_request_room_enter");
        this.LIZJ = config;
        if (!TextUtils.isEmpty(config.mRoomsData.enterFromMergeRecommend)) {
            str = config.mRoomsData.enterFromMergeRecommend;
        } else if (!TextUtils.isEmpty(config.mRoomsData.enterFromMerge)) {
            if (TextUtils.isEmpty(config.mRoomsData.enterMethod)) {
                str = config.mRoomsData.enterFromMerge;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(config.mRoomsData.enterFromMerge);
                LIZ.append('-');
                LIZ.append(config.mRoomsData.enterMethod);
                str = X1D.LIZIZ(LIZ);
            }
        } else {
            str = "";
        }
        HashMap<String, String> LJI = C28835BTj.LJI(C28835BTj.LJIIIIZZ(config));
        if (C28655BMl.LIZ(B4T.LIZ(), Long.valueOf(config.mRoomsData.roomId), false, 2) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("commerce_flow_banner-");
            LIZ2.append(C28655BMl.LIZ(B4T.LIZ(), Long.valueOf(config.mRoomsData.roomId), false, 2));
            LJI.put("enter_method", X1D.LIZIZ(LIZ2));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ecommerce_use_async_load", String.valueOf(config.mECData.isPrefetchPinEnabled));
        B3Z b3z = new B3Z(this);
        EnterRoomConfig.RoomsData roomsData = config.mRoomsData;
        long j = roomsData.roomId;
        EnterRoomConfig.LogData logData = config.mLogData;
        C28461BEz c28461BEz = new C28461BEz(b3z, j, list, logData.requestId, roomsData.enterType, roomsData.roomLabels, str, logData.liveReason, roomsData.shareFromUserId, LJI, roomsData.enterFromMerge, roomsData.enterMethod, hashMap, C78847Ux1.LJJJI(config));
        this.LIZLLL = c28461BEz;
        long j2 = config.mLogData.fromPortalId;
        if (j2 > 0) {
            c28461BEz.LJLLL = j2;
        }
        c28461BEz.LIZIZ(true);
        if (!LiveWatchPreloadSettings.INSTANCE.messageManagerDisable() && context != null && LiveMessageWsReuseSetting.webSocketReuse && ((IMessageService) CN1.LIZ(IMessageService.class)).getReuse() == null) {
            ((IMessageService) CN1.LIZ(IMessageService.class)).messageManagerProvider(config.mRoomsData.roomId, false, context, true);
        }
    }
}
