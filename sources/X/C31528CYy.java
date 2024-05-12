package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedHashMap;

/* renamed from: X.CYy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31528CYy extends BY9<InterfaceC2301691o> implements OnMessageListener {
    public final DataChannel LJLIL;
    public final java.util.Map<String, C31529CYz> LJLILLLLZI = new LinkedHashMap();
    public IMessageManager LJLJI;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    @Override // X.BY9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void detachView() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31528CYy.detachView():void");
    }

    public C31528CYy(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    @Override // X.BY9
    public final void attachView(InterfaceC2301691o interfaceC2301691o) {
        java.util.Map<? extends String, ? extends C31529CYz> map;
        super.attachView(interfaceC2301691o);
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (map = (java.util.Map) dataChannel.kv0(CZ0.class)) != null) {
            this.LJLILLLLZI.putAll(map);
        }
        DataChannel dataChannel2 = this.LJLIL;
        IMessageManager iMessageManager = null;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(CZ0.class)).LIZ = null;
        }
        DataChannel dataChannel3 = this.LJLIL;
        if (dataChannel3 != null) {
            iMessageManager = (IMessageManager) dataChannel3.kv0(C29927Bop.class);
        }
        this.LJLJI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ANCHOR_TOOL_MODIFICATION_MESSAGE.getIntType(), this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r20) {
        /*
            r19 = this;
            r2 = r20
            if (r2 != 0) goto L5
            return
        L5:
            com.bytedance.android.livesdk.model.message.AnchorToolModificationMessage r2 = (com.bytedance.android.livesdk.model.message.AnchorToolModificationMessage) r2
            X.CYf r1 = r2.getMessageType()
            X.CYf r0 = X.EnumC31509CYf.ANCHOR_TOOL_MODIFICATION_MESSAGE
            if (r1 != r0) goto Lbf
            com.bytedance.android.livesdk.model.message.AnchorToolModification r8 = r2.modification
            long r10 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r10 = r10 / r0
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r0 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.watch.IWatchLiveService r0 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r0
            java.lang.String r12 = r0.zK()
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baf> r0 = X.C29049Baf.class
            java.lang.Object r0 = r1.mv0(r0)
            X.B6s r0 = (X.C28246B6s) r0
            if (r0 == 0) goto L37
            long r3 = r8.userId
            java.lang.Long r0 = r0.LIZJ
            if (r0 != 0) goto Ld8
        L37:
            java.lang.String r13 = "connection_user"
        L39:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r1 = r8.resourceId
            java.lang.String r0 = "resource_id"
            r4.put(r0, r1)
            long r0 = r8.effectId
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "sticker_id"
            r4.put(r0, r1)
            java.lang.String r1 = "sticker_name"
            java.lang.String r0 = r8.name
            r4.put(r1, r0)
            java.lang.String r0 = "watch_user_type"
            r4.put(r0, r13)
            long r0 = r8.effectId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r0.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            long r0 = r8.userId
            java.lang.String r1 = X.C0H1.LIZJ(r2, r0, r3, r2)
            long r2 = r8.endTime
            r6 = 0
            java.lang.String r5 = "watch_effect_scene"
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r6 = r19
            if (r0 <= 0) goto Lc4
            com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting r0 = com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting.INSTANCE
            java.lang.String r7 = "livesdk_audience_sticker_duration"
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            boolean r0 = r0.isReport(r7, r2)
            if (r0 == 0) goto Lba
            java.util.Map<java.lang.String, X.CYz> r0 = r6.LJLILLLLZI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            X.CYz r0 = (X.C31529CYz) r0
            if (r0 == 0) goto Lc2
            long r15 = r0.LIZJ
        L9c:
            java.lang.String r18 = "duration"
            r13 = r10
            r17 = r4
            X.C7MY.LJFF(r13, r15, r17, r18)
            java.util.Map<java.lang.String, X.CYz> r0 = r6.LJLILLLLZI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            X.CYz r0 = (X.C31529CYz) r0
            if (r0 == 0) goto Lb4
            java.lang.String r0 = r0.LIZLLL
            if (r0 != 0) goto Lc0
        Lb4:
            r4.put(r5, r12)
            X.C78977Uz7.LJJLIIIJ(r7, r4)
        Lba:
            java.util.Map<java.lang.String, X.CYz> r0 = r6.LJLILLLLZI
            r0.remove(r1)
        Lbf:
            return
        Lc0:
            r12 = r0
            goto Lb4
        Lc2:
            r15 = r10
            goto L9c
        Lc4:
            r4.put(r5, r12)
            java.lang.String r0 = "livesdk_audience_sticker_show"
            X.C78977Uz7.LJJLIIIJ(r0, r4)
            java.util.Map<java.lang.String, X.CYz> r0 = r6.LJLILLLLZI
            X.CYz r7 = new X.CYz
            r9 = 0
            r7.<init>(r8, r9, r10, r12, r13)
            r0.put(r1, r7)
            goto Lbf
        Ld8:
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L37
            java.lang.String r13 = "anchor"
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31528CYy.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
