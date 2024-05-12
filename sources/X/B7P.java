package X;

import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveLandscapeEnterOp;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B7P {
    public static final boolean LJ(Room room) {
        String str;
        StreamUrl streamUrl;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        if (room != null && (streamUrl = room.getStreamUrl()) != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
            str = pullData.getStreamData();
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        String streamData = room.getStreamUrl().liveCoreSDKData.getPullData().getStreamData();
        o.LJIIIIZZ(streamData, "room.streamUrl.liveCoreSDKData.pullData.streamData");
        if (streamData.length() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[Catch: JSONException -> 0x00c6, TRY_ENTER, TryCatch #0 {JSONException -> 0x00c6, blocks: (B:39:0x0006, B:6:0x0015, B:9:0x001b, B:11:0x001f, B:12:0x003a, B:13:0x004e, B:15:0x0052, B:18:0x0059, B:20:0x005f, B:23:0x0068, B:25:0x007d, B:27:0x0089, B:30:0x0096, B:32:0x0090), top: B:38:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[Catch: JSONException -> 0x00c6, TryCatch #0 {JSONException -> 0x00c6, blocks: (B:39:0x0006, B:6:0x0015, B:9:0x001b, B:11:0x001f, B:12:0x003a, B:13:0x004e, B:15:0x0052, B:18:0x0059, B:20:0x005f, B:23:0x0068, B:25:0x007d, B:27:0x0089, B:30:0x0096, B:32:0x0090), top: B:38:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.OSZ<java.lang.Integer, java.lang.Integer> LIZJ(java.lang.String r12, boolean r13) {
        /*
            java.lang.String r6 = "resolution"
            r5 = 0
            r11 = 1
            if (r12 == 0) goto Lf
            int r0 = r12.length()     // Catch: org.json.JSONException -> Lc6
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            java.lang.String r4 = "EnterRoomByLandscapeHelp"
            r10 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = "streamData is null when get video resolution"
            X.C0NB.LJ(r4, r0)     // Catch: org.json.JSONException -> Lc6
            return r10
        L1b:
            boolean r0 = X.C30922CBq.LIZIZ     // Catch: org.json.JSONException -> Lc6
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: org.json.JSONException -> Lc6
            java.lang.String r0 = "visible: "
            r1.append(r0)     // Catch: org.json.JSONException -> Lc6
            r1.append(r13)     // Catch: org.json.JSONException -> Lc6
            java.lang.String r0 = " ,streamData is not null ："
            r1.append(r0)     // Catch: org.json.JSONException -> Lc6
            r1.append(r12)     // Catch: org.json.JSONException -> Lc6
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: org.json.JSONException -> Lc6
            X.C0NB.LJIIIZ(r4, r0)     // Catch: org.json.JSONException -> Lc6
        L3a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc6
            r1.<init>(r12)     // Catch: org.json.JSONException -> Lc6
            java.lang.String r0 = "data"
            org.json.JSONObject r8 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> Lc6
            java.lang.String r1 = "origin"
            java.lang.String r0 = "ld"
            java.lang.String[] r9 = new java.lang.String[]{r1, r0}     // Catch: org.json.JSONException -> Lc6
            r7 = 0
        L4e:
            r1 = r9[r7]     // Catch: org.json.JSONException -> Lc6
            if (r8 == 0) goto L90
            org.json.JSONObject r0 = r8.optJSONObject(r1)     // Catch: org.json.JSONException -> Lc6
            if (r0 != 0) goto L59
            goto L90
        L59:
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch: org.json.JSONException -> Lc6
            if (r1 == 0) goto L90
            java.lang.String r0 = "main"
            org.json.JSONObject r2 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> Lc6
            if (r2 != 0) goto L68
            goto L90
        L68:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc6
            java.lang.String r0 = "sdk_params"
            java.lang.String r0 = r2.optString(r0)     // Catch: org.json.JSONException -> Lc6
            r1.<init>(r0)     // Catch: org.json.JSONException -> Lc6
            java.lang.String r3 = r1.optString(r6)     // Catch: org.json.JSONException -> Lc6
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Lc6
            if (r0 != 0) goto L90
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r6)     // Catch: org.json.JSONException -> Lc6
            r1 = 120(0x78, float:1.68E-43)
            r0 = 6
            int r2 = ujb.s.LJJLIIIJJIZ(r3, r1, r5, r5, r0)     // Catch: org.json.JSONException -> Lc6
            if (r2 <= 0) goto L90
            int r0 = r3.length()     // Catch: org.json.JSONException -> Lc6
            int r0 = r0 - r11
            if (r2 < r0) goto L96
        L90:
            int r7 = r7 + 1
            r0 = 2
            if (r7 >= r0) goto Lc0
            goto L4e
        L96:
            java.lang.String r1 = r3.substring(r5, r2)     // Catch: org.json.JSONException -> Lc6
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: org.json.JSONException -> Lc6
            int r0 = r2 + 1
            java.lang.String r3 = r3.substring(r0)     // Catch: org.json.JSONException -> Lc6
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)     // Catch: org.json.JSONException -> Lc6
            X.OSZ r2 = new X.OSZ     // Catch: org.json.JSONException -> Lc6
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)     // Catch: org.json.JSONException -> Lc6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> Lc6
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r3)     // Catch: org.json.JSONException -> Lc6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> Lc6
            r2.<init>(r1, r0)     // Catch: org.json.JSONException -> Lc6
            return r2
        Lc0:
            java.lang.String r0 = "return video resolution is null"
            X.C0NB.LJ(r4, r0)
            return r10
        Lc6:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7P.LIZJ(java.lang.String, boolean):X.OSZ");
    }

    public static final OSZ LIZLLL(boolean z, Room room) {
        String str;
        StreamUrl streamUrl;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        if (room != null && (streamUrl = room.getStreamUrl()) != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
            str = pullData.getStreamData();
        } else {
            str = null;
        }
        return LIZJ(str, z);
    }

    public static final boolean LIZ(ActivityC45651qj activityC45651qj, EnterRoomConfig enterRoomConfig, OSZ osz, String str, boolean z) {
        if (activityC45651qj == null || osz == null) {
            C0NB.LJ("EnterRoomByLandscapeHelp", "return false, activity or pair is null");
            return false;
        }
        if (enterRoomConfig == null) {
            C0NB.LJ("EnterRoomByLandscapeHelp", "return false, config is null");
            return false;
        }
        if (!GameLiveLandscapeEnterOp.INSTANCE.getValue()) {
            return false;
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("from: ", str, " ,o: ");
            LIZIZ.append(activityC45651qj.getRequestedOrientation());
            LIZIZ.append(", need: ");
            LIZIZ.append(enterRoomConfig.mRoomsData.needLandInteractFragment);
            LIZIZ.append(" first: ");
            LIZIZ.append(((Number) osz.getFirst()).intValue());
            LIZIZ.append(" sec: ");
            LIZIZ.append(((Number) osz.getSecond()).intValue());
            LIZIZ.append(" visible: ");
            LIZIZ.append(z);
            C0NB.LJIIIZ("enter_room_by_landscape", X1D.LIZIZ(LIZIZ));
        }
        if (!C29306Beo.LJIIZILJ(activityC45651qj.getRequestedOrientation()) || !enterRoomConfig.mRoomsData.needLandInteractFragment || ((Number) osz.getFirst()).intValue() <= ((Number) osz.getSecond()).intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (((java.lang.Number) r5.getFirst()).intValue() > ((java.lang.Number) r5.getSecond()).intValue()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZIZ(X.ActivityC45651qj r3, com.bytedance.android.livesdkapi.session.EnterRoomConfig r4, X.OSZ r5, java.lang.String r6, boolean r7) {
        /*
            r2 = 0
            java.lang.String r1 = "EnterRoomByLandscapeHelp"
            if (r3 == 0) goto L7
            if (r5 != 0) goto Le
        L7:
            java.lang.String r0 = "return false, activity or pair is null"
            X.C0NB.LJ(r1, r0)
        Lc:
            r2 = 1
        Ld:
            return r2
        Le:
            if (r4 != 0) goto L16
            java.lang.String r0 = "return false, config is null"
            X.C0NB.LJ(r1, r0)
            goto Lc
        L16:
            com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting r0 = com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L43
            int r0 = r3.getRequestedOrientation()
            boolean r0 = X.C29306Beo.LJIIZILJ(r0)
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r5.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r5.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 <= r0) goto Lc
        L3e:
            int r2 = r3.getRequestedOrientation()
            goto Ld
        L43:
            boolean r0 = LIZ(r3, r4, r5, r6, r7)
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Ld
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7P.LIZIZ(X.1qj, com.bytedance.android.livesdkapi.session.EnterRoomConfig, X.OSZ, java.lang.String, boolean):int");
    }
}
