package X;

import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.CodecType;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.IMirrorListener;
import com.byted.cast.common.sink.Statistics;
import java.util.HashMap;

/* renamed from: X.Zl9, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90851Zl9 implements IMirrorListener {
    public final /* synthetic */ IMirrorListener LIZ;

    public C90851Zl9(IMirrorListener iMirrorListener) {
        this.LIZ = iMirrorListener;
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onInviteResult(boolean z) {
        this.LIZ.onInviteResult(z);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onStatistics(Statistics statistics) {
        this.LIZ.onStatistics(statistics);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onCast(int i, CastInfo castInfo) {
        this.LIZ.onCast(i, castInfo);
        if (castInfo != null && castInfo.castType == 2 && castInfo.infoType == 100) {
            TeaEventTrack.getInstance().trackSinkReceiverCast(Boolean.FALSE, castInfo.protocol);
        }
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onVolume(String str, int i) {
        this.LIZ.onVolume(str, i);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onError(String str, int i, String str2) {
        this.LIZ.onError(str, i, str2);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap) {
        this.LIZ.onNotifyLatency(str, l, hashMap);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onSinkLatencyStat(int i, String str, String str2) {
        this.LIZ.onSinkStuckStat(i, str, str2);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onSinkStuckStat(int i, String str, String str2) {
        this.LIZ.onSinkStuckStat(i, str, str2);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onVideoOutput(String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j, int i3) {
        this.LIZ.onVideoOutput(str, vcodec_id, bArr, i, i2, j, i3);
    }

    @Override // com.byted.cast.common.sink.IMirrorListener
    public final void onAudioOutput(String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j) {
        this.LIZ.onAudioOutput(str, acodec_id, bArr, i, i2, i3, i4, j);
    }
}
