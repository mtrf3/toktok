package com.ss.android.ugc.aweme.services;

import java.util.List;

/* loaded from: classes8.dex */
public interface IShortVideoConfig {

    /* loaded from: classes8.dex */
    public interface MusicWaveDataListener {
    }

    String cutsameSdkVersion();

    void enableHookLibrary(boolean z);

    long extendedDuetOrStitchTime();

    List<String> getBOEBypassHostList();

    List<String> getBOEBypassPathList();

    String getErrorHintWhenDisableDuetOrStitch(int i);

    boolean getUsingOnline();

    boolean isHookLibrary();

    boolean isRecording();

    long maxConsumerDuetOrStitchVideoTime();

    long maxCreatorDuetOrStitchVideoTime();
}
