package com.ss.bytertc.engine.audio;

import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.PositionInfo;

/* loaded from: classes33.dex */
public interface ISpatialAudio {
    void disableRemoteOrientation();

    void enableSpatialAudio(boolean z);

    int removeAllRemotePosition();

    int removeRemotePosition(String str);

    int updateListenerOrientation(HumanOrientation humanOrientation);

    int updateListenerPosition(Position position);

    int updatePosition(Position position);

    int updateRemotePosition(String str, PositionInfo positionInfo);

    int updateSelfOrientation(HumanOrientation humanOrientation);

    int updateSelfPosition(PositionInfo positionInfo);
}
