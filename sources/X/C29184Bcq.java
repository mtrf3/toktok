package X;

import com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import webcast.api.creator.PreScheduleStream;
import webcast.api.creator.StreamResolution;

/* renamed from: X.Bcq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29184Bcq {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r0 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r1) {
        /*
            if (r1 == 0) goto L3f
            java.lang.Class<com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel> r0 = com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L11
        Lc:
            int r0 = r0.intValue()
        L10:
            return r0
        L11:
            if (r1 == 0) goto L3f
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreScheduleResultChannel> r0 = com.bytedance.android.livesdk.broadcast.PreScheduleResultChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            X.OSZ r0 = (X.OSZ) r0
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.getFirst()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L2a
            int r0 = r0.intValue()
            goto L10
        L2a:
            if (r1 == 0) goto L3f
        L2c:
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel> r0 = com.bytedance.android.livesdk.broadcast.PreScheduleStreamChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            webcast.api.creator.PreScheduleStream r0 = (webcast.api.creator.PreScheduleStream) r0
            if (r0 == 0) goto L3f
            int r0 = r0.recommendStreamResolution
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L3f
            goto Lc
        L3f:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29184Bcq.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel):int");
    }

    public static String LIZIZ(DataChannel dataChannel, Integer num) {
        PreScheduleStream preScheduleStream;
        List<StreamResolution> list;
        StreamResolution streamResolution;
        if (dataChannel == null || (preScheduleStream = (PreScheduleStream) dataChannel.kv0(PreScheduleStreamChannel.class)) == null || (list = preScheduleStream.streamResolutionList) == null) {
            return null;
        }
        Iterator<StreamResolution> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                streamResolution = it.next();
                int i = streamResolution.streamResolution;
                if (num != null && i == num.intValue()) {
                    break;
                }
            } else {
                streamResolution = null;
                break;
            }
        }
        StreamResolution streamResolution2 = streamResolution;
        if (streamResolution2 == null) {
            return null;
        }
        return streamResolution2.resolutionText;
    }
}
