package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.RTCRoomEventHandler;
import java.util.List;

/* loaded from: classes33.dex */
public class NativeRTCRoomFunctions {
    public static native void nativeDestory(long j);

    public static native int nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native long nativeGetPanoramicVideo(long j);

    public static native long nativeGetRangeAudio(long j);

    public static native String nativeGetRoomId(long j);

    public static native long nativeGetSpatialAudio(long j);

    public static native int nativeJoinRoomWithRoomConfig(long j, String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    public static native int nativeLeaveRoom(long j);

    public static native int nativePauseAllSubscribedStream(long j, int i);

    public static native int nativePauseForwardStreamToAllRooms(long j);

    public static native int nativePublishScreenWithMediaStreamType(long j, int i);

    public static native int nativePublishStream(long j, int i);

    public static native void nativeReleaseRTCRoomEventHandler(long j);

    public static native int nativeResumeAllSubscribedStream(long j, int i);

    public static native int nativeResumeForwardStreamToAllRooms(long j);

    public static native long nativeSendRoomBinaryMessage(long j, byte[] bArr);

    public static native long nativeSendRoomMessage(long j, String str);

    public static native long nativeSendUserBinaryMessage(long j, String str, byte[] bArr, int i);

    public static native long nativeSendUserMessage(long j, String str, String str2, int i);

    public static native int nativeSetAudioSelectionConfig(long j, int i);

    public static native int nativeSetMultiDeviceAVSync(long j, String str);

    public static native long nativeSetRTCRoomEventHandler(long j, RTCRoomEventHandler rTCRoomEventHandler);

    public static native int nativeSetRemoteRoomAudioPlaybackVolume(long j, int i);

    public static native int nativeSetRemoteVideoConfig(long j, String str, int i, int i2, int i3);

    public static native long nativeSetRoomExtraInfo(long j, String str, String str2);

    public static native int nativeSetUserVisibility(long j, boolean z);

    public static native int nativeStartForwardStreamToRooms(long j, List<InternalForwardStreamInfo> list);

    public static native int nativeStartSubtitle(long j, int i, String str);

    public static native int nativeStopForwardStreamToRooms(long j);

    public static native int nativeStopSubtitle(long j);

    public static native int nativeSubscribeAllStreamsWithMediaStreamType(long j, int i);

    public static native int nativeSubscribeScreenWithMediaStreamType(long j, String str, int i);

    public static native int nativeSubscribeStreamWithMediaStreamType(long j, String str, int i);

    public static native int nativeSubscribeUserStream(long j, String str, boolean z, int i, int i2, int i3);

    public static native int nativeUnpublishScreenWithMediaStreamType(long j, int i);

    public static native int nativeUnpublishStream(long j, int i);

    public static native int nativeUnsubscribeAllStreamsWithMediaStreamType(long j, int i);

    public static native int nativeUnsubscribeScreenWithMediaStreamType(long j, String str, int i);

    public static native int nativeUnsubscribeStreamWithMediaStreamType(long j, String str, int i);

    public static native int nativeUpdateCloudRending(long j, String str);

    public static native int nativeUpdateForwardStreamToRooms(long j, List<InternalForwardStreamInfo> list);

    public static native int nativeUpdateToken(long j, String str);
}
