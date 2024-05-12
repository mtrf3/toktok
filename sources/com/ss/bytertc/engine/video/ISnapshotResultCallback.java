package com.ss.bytertc.engine.video;

import android.graphics.Bitmap;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;

/* loaded from: classes33.dex */
public interface ISnapshotResultCallback {
    void onTakeLocalSnapshotResult(long j, StreamIndex streamIndex, Bitmap bitmap, int i);

    void onTakeRemoteSnapshotResult(long j, RemoteStreamKey remoteStreamKey, Bitmap bitmap, int i);
}
