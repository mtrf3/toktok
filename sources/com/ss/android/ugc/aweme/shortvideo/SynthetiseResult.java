package com.ss.android.ugc.aweme.shortvideo;

import X.AbstractC44565HeL;
import X.C0JT;
import X.C43236Gy0;
import X.C78929UyL;
import X.Q89;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import defpackage.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class SynthetiseResult implements Cloneable {
    public float audioLength;
    public String cpuName;
    public int draftHardEncode;
    public EditPreviewInfo editPreviewInfo;
    public int effect;
    public int[] effectArray;
    public int filterIndex;
    public int flags;
    public String gpuName;
    public boolean hasSubtitle;
    public List<PublishImageModel> imageSynthesisResult;
    public boolean isEnableFpsSet;
    public boolean isFastImport;
    public boolean isFastImportForLog;
    public boolean isFromDraft;
    public boolean isImageMode;
    public int isMusic;
    public boolean isTTStory;
    public int musicType;
    public boolean needSaveLocal;
    public String outputFile;
    public VideoFileInfo outputVideoFileInfo;
    public int ret;
    public String reverseFile;
    public int segmentCount;
    public int specialPoints;
    public int synthetiseCPUEncode;
    public List<String> texts;
    public int unableRemuxCode;
    public String vesdkErrorCode;
    public int videoHeight;
    public float videoLength;
    public int videoWidth;
    public boolean needRecode = true;
    public List<String> skipFrameLogList = new ArrayList();
    public C43236Gy0 syntheticStartTime = new C43236Gy0();
    public C43236Gy0 syntheticEndTime = new C43236Gy0();
    public List<AbstractC44565HeL> smartCompileSettings = null;

    public int getFps() {
        VideoFileInfo videoFileInfo = this.outputVideoFileInfo;
        if (videoFileInfo == null) {
            return 0;
        }
        return videoFileInfo.getFps();
    }

    public int getReportHardEncode() {
        return ((this.synthetiseCPUEncode ^ 1) * 10) + this.draftHardEncode;
    }

    public C43236Gy0 getSyntheticEndTime() {
        C43236Gy0 c43236Gy0 = this.syntheticEndTime;
        Objects.requireNonNull(c43236Gy0);
        return c43236Gy0;
    }

    public C43236Gy0 getSyntheticStartTime() {
        C43236Gy0 c43236Gy0 = this.syntheticStartTime;
        Objects.requireNonNull(c43236Gy0);
        return c43236Gy0;
    }

    public String toString() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SynthetiseResult{ret=");
            LIZ.append(this.ret);
            LIZ.append(", draftHardEncode=");
            LIZ.append(this.draftHardEncode);
            LIZ.append(", synthetiseCPUEncode=");
            LIZ.append(this.synthetiseCPUEncode);
            LIZ.append(", inputVideoFile='");
            LIZ.append(C78929UyL.LJJIIJ(this.editPreviewInfo));
            LIZ.append('\'');
            LIZ.append(",length=");
            EditPreviewInfo editPreviewInfo = this.editPreviewInfo;
            long j = 0;
            if (editPreviewInfo != null) {
                Iterator<EditVideoSegment> it = editPreviewInfo.getVideoList().iterator();
                while (it.hasNext()) {
                    j += new File(it.next().getVideoPath()).length();
                }
            }
            LIZ.append(j);
            LIZ.append(", reverseFile='");
            LIZ.append(this.reverseFile);
            LIZ.append('\'');
            LIZ.append(",length=");
            LIZ.append(new File(this.reverseFile).length());
            LIZ.append(", outputWavFile='");
            LIZ.append(C78929UyL.LJJIII(this.editPreviewInfo));
            LIZ.append('\'');
            LIZ.append(",length=");
            EditPreviewInfo editPreviewInfo2 = this.editPreviewInfo;
            long j2 = 0;
            if (editPreviewInfo2 != null) {
                Iterator<EditVideoSegment> it2 = editPreviewInfo2.getVideoList().iterator();
                while (it2.hasNext()) {
                    j2 += new File(it2.next().getAudioPath()).length();
                }
            }
            LIZ.append(j2);
            LIZ.append(", isMusic=");
            LIZ.append(this.isMusic);
            LIZ.append(", outputFile='");
            LIZ.append(this.outputFile);
            LIZ.append('\'');
            LIZ.append(",length=");
            LIZ.append(new File(this.outputFile).length());
            LIZ.append(", effect=");
            LIZ.append(this.effect);
            LIZ.append(", specialPoints=");
            LIZ.append(this.specialPoints);
            LIZ.append(", filterIndex=");
            LIZ.append(this.filterIndex);
            LIZ.append(", musicType=");
            LIZ.append(this.musicType);
            LIZ.append(", videoWidth=");
            LIZ.append(this.videoWidth);
            LIZ.append(", videoHeight=");
            LIZ.append(this.videoHeight);
            LIZ.append(", effectArray=");
            LIZ.append(Arrays.toString(this.effectArray));
            LIZ.append(", isFromDraft=");
            LIZ.append(this.isFromDraft);
            LIZ.append(", cpuName=");
            LIZ.append(this.cpuName);
            LIZ.append(", gpuName=");
            LIZ.append(this.gpuName);
            LIZ.append(", fileFps=");
            LIZ.append(getFps());
            LIZ.append(", flags=");
            LIZ.append(this.flags);
            LIZ.append(", isEnableFpsSet=");
            LIZ.append(this.isEnableFpsSet);
            LIZ.append(", audioLength=");
            LIZ.append(this.audioLength);
            LIZ.append(", videoLength=");
            LIZ.append(this.videoLength);
            LIZ.append(", texts=");
            LIZ.append(this.texts);
            LIZ.append(", isFastImport");
            LIZ.append(this.isFastImport);
            LIZ.append(", isFastImportForLog");
            LIZ.append(this.isFastImportForLog);
            LIZ.append(", isTTStory");
            LIZ.append(this.isTTStory);
            LIZ.append(", hasSubtitle");
            LIZ.append(this.hasSubtitle);
            LIZ.append(", unableRemuxCode");
            LIZ.append(this.unableRemuxCode);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        } catch (NullPointerException unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SynthetiseResult{ret=");
            LIZ2.append(this.ret);
            LIZ2.append(", draftHardEncode=");
            LIZ2.append(this.draftHardEncode);
            LIZ2.append(", synthetiseCPUEncode=");
            LIZ2.append(this.synthetiseCPUEncode);
            LIZ2.append(", inputVideoFile='");
            LIZ2.append(C78929UyL.LJJIIJ(this.editPreviewInfo));
            LIZ2.append('\'');
            LIZ2.append(", reverseFile='");
            Q89.LIZIZ(LIZ2, this.reverseFile, '\'', ", outputWavFile='");
            LIZ2.append(C78929UyL.LJJIII(this.editPreviewInfo));
            LIZ2.append('\'');
            LIZ2.append(", isMusic=");
            LIZ2.append(this.isMusic);
            LIZ2.append(", outputFile='");
            Q89.LIZIZ(LIZ2, this.outputFile, '\'', ", effect=");
            LIZ2.append(this.effect);
            LIZ2.append(", specialPoints=");
            LIZ2.append(this.specialPoints);
            LIZ2.append(", filterIndex=");
            LIZ2.append(this.filterIndex);
            LIZ2.append(", musicType=");
            LIZ2.append(this.musicType);
            LIZ2.append(", videoWidth=");
            LIZ2.append(this.videoWidth);
            LIZ2.append(", videoHeight=");
            LIZ2.append(this.videoHeight);
            LIZ2.append(", effectArray=");
            C0JT.LIZLLL(this.effectArray, LIZ2, ", isFromDraft=");
            LIZ2.append(this.isFromDraft);
            LIZ2.append(", cpuName=");
            LIZ2.append(this.cpuName);
            LIZ2.append(", gpuName=");
            LIZ2.append(this.gpuName);
            LIZ2.append(", fileFps=");
            LIZ2.append(getFps());
            LIZ2.append(", flags=");
            LIZ2.append(this.flags);
            LIZ2.append(", isEnableFpsSet=");
            LIZ2.append(this.isEnableFpsSet);
            LIZ2.append(", audioLength=");
            LIZ2.append(this.audioLength);
            LIZ2.append(", videoLength=");
            LIZ2.append(this.videoLength);
            LIZ2.append(", texts=");
            LIZ2.append(this.texts);
            LIZ2.append(", isFastImport");
            LIZ2.append(this.isFastImport);
            LIZ2.append(", isFastImportForLog");
            LIZ2.append(this.isFastImportForLog);
            LIZ2.append(", hasSubtitle");
            LIZ2.append(this.hasSubtitle);
            LIZ2.append(", unableRemuxCode");
            return b0.LIZJ(LIZ2, this.unableRemuxCode, '}', LIZ2);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SynthetiseResult m157clone() {
        try {
            return (SynthetiseResult) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public List<String> getSkipFrameLogList() {
        return this.skipFrameLogList;
    }

    public String getVESDKErrorCode() {
        return this.vesdkErrorCode;
    }

    public boolean isNeedSaveLocal() {
        return this.needSaveLocal;
    }

    public void setNeedSaveLocal(boolean z) {
        this.needSaveLocal = z;
    }

    public void setSkipFrameLogList(List<String> list) {
        this.skipFrameLogList.clear();
        this.skipFrameLogList.addAll(list);
    }

    public void setSyntheticEndTime(C43236Gy0 c43236Gy0) {
        Objects.requireNonNull(c43236Gy0);
        this.syntheticEndTime = c43236Gy0;
    }

    public void setSyntheticStartTime(C43236Gy0 c43236Gy0) {
        Objects.requireNonNull(c43236Gy0);
        this.syntheticStartTime = c43236Gy0;
    }

    public void setVESDKErrorCode(String str) {
        this.vesdkErrorCode = str;
    }
}
