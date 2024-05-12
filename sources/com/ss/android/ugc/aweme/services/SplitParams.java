package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.ss.android.ugc.aweme.services.ISDKService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SplitParams {
    public ISDKService.SplitCallback callback;
    public Context context;
    public int minDuration;
    public String targetAudioFile;
    public String targetVideoFile;
    public boolean useSplitVideo;
    public boolean usingVEEditor;
    public String videoPath;
    public String workspace;

    public final ISDKService.SplitCallback getCallback() {
        return this.callback;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getTargetAudioFile() {
        return this.targetAudioFile;
    }

    public final String getTargetVideoFile() {
        return this.targetVideoFile;
    }

    public final boolean getUseSplitVideo() {
        return this.useSplitVideo;
    }

    public final boolean getUsingVEEditor() {
        return this.usingVEEditor;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final String getWorkspace() {
        return this.workspace;
    }

    public final void setCallback(ISDKService.SplitCallback splitCallback) {
        o.LJIIIZ(splitCallback, "<set-?>");
        this.callback = splitCallback;
    }

    public final void setContext(Context context) {
        o.LJIIIZ(context, "<set-?>");
        this.context = context;
    }

    public final void setMinDuration(int i) {
        this.minDuration = i;
    }

    public final void setTargetAudioFile(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.targetAudioFile = str;
    }

    public final void setTargetVideoFile(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.targetVideoFile = str;
    }

    public final void setUseSplitVideo(boolean z) {
        this.useSplitVideo = z;
    }

    public final void setUsingVEEditor(boolean z) {
        this.usingVEEditor = z;
    }

    public final void setVideoPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.videoPath = str;
    }

    public final void setWorkspace(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.workspace = str;
    }

    public SplitParams(Context context, int i, String workspace, String videoPath, String targetAudioFile, String targetVideoFile, boolean z, boolean z2, ISDKService.SplitCallback callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(workspace, "workspace");
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(targetAudioFile, "targetAudioFile");
        o.LJIIIZ(targetVideoFile, "targetVideoFile");
        o.LJIIIZ(callback, "callback");
        this.context = context;
        this.minDuration = i;
        this.workspace = workspace;
        this.videoPath = videoPath;
        this.targetAudioFile = targetAudioFile;
        this.targetVideoFile = targetVideoFile;
        this.usingVEEditor = z;
        this.useSplitVideo = z2;
        this.callback = callback;
    }

    public /* synthetic */ SplitParams(Context context, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, ISDKService.SplitCallback splitCallback, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, str, str2, str3, str4, z, (i2 & 128) != 0 ? true : z2, splitCallback);
    }
}
