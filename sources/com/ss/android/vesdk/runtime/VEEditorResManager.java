package com.ss.android.vesdk.runtime;

import X.C16880lQ;
import X.C63878P5e;
import X.X1D;
import X.YE1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class VEEditorResManager {
    public String[] mAudioPaths;
    public String mComposedVideoPath;
    public String mCropedAudioPath;
    public String mCropedVideoPath;
    public int mOriginalSoundTrackIndex;
    public int mOriginalSoundTrackType;
    public boolean mReverseAudioDone;
    public String[] mReverseAudioPaths;
    public ArrayList<String> mReverseCacheFiles = new ArrayList<>();
    public boolean mReverseDone;
    public String[] mReverseVideoPath;
    public int mTimeMode;
    public String[] mTransitions;
    public String[] mVideoPaths;
    public String mWorkSpace;

    public void clearReverseCacheFiles() {
        ArrayList<String> arrayList = this.mReverseCacheFiles;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = this.mReverseCacheFiles.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    C16880lQ.LLLZZIL(file);
                }
            }
        }
    }

    public String genComposedVideoPath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C63878P5e.LIZIZ(this.mWorkSpace, "compose"));
        LIZ.append(File.separator);
        LIZ.append(System.currentTimeMillis());
        LIZ.append("_");
        LIZ.append("composed");
        LIZ.append(".mp4");
        return X1D.LIZIZ(LIZ);
    }

    public String getWorkspace() {
        return this.mWorkSpace;
    }

    public VEEditorResManager(String str) {
        this.mWorkSpace = str;
    }

    public String genReverseVideoPath(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C63878P5e.LIZIZ(this.mWorkSpace, "concat"));
        YE1.LIZLLL(LIZ, File.separator, str, "_", "reverse");
        LIZ.append(".mp4");
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.mReverseCacheFiles.add(LIZIZ);
        return LIZIZ;
    }

    public String genSeqAudioPath(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C63878P5e.LIZIZ(this.mWorkSpace, "concat"));
        YE1.LIZLLL(LIZ, File.separator, str, "_", "reverse");
        LIZ.append(".wav");
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.mReverseCacheFiles.add(LIZIZ);
        return LIZIZ;
    }
}
