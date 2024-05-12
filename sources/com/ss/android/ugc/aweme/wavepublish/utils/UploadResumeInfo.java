package com.ss.android.ugc.aweme.wavepublish.utils;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UploadResumeInfo extends F9E {

    @InterfaceC65349Pkn("is_compile_finished")
    public final boolean isCompileFinished;

    @InterfaceC65349Pkn("output_file_path")
    public final String outputFilePath;

    @InterfaceC65349Pkn("synthesis_file_hash")
    public final String synthesisFileHash;

    @InterfaceC65349Pkn("synthesis_file_path")
    public final String synthesisFilePath;

    public static /* synthetic */ UploadResumeInfo copy$default(UploadResumeInfo uploadResumeInfo, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uploadResumeInfo.isCompileFinished;
        }
        if ((i & 2) != 0) {
            str = uploadResumeInfo.outputFilePath;
        }
        if ((i & 4) != 0) {
            str2 = uploadResumeInfo.synthesisFilePath;
        }
        if ((i & 8) != 0) {
            str3 = uploadResumeInfo.synthesisFileHash;
        }
        return uploadResumeInfo.copy(z, str, str2, str3);
    }

    public final UploadResumeInfo copy(boolean z, String outputFilePath, String synthesisFilePath, String synthesisFileHash) {
        o.LJIIIZ(outputFilePath, "outputFilePath");
        o.LJIIIZ(synthesisFilePath, "synthesisFilePath");
        o.LJIIIZ(synthesisFileHash, "synthesisFileHash");
        return new UploadResumeInfo(z, outputFilePath, synthesisFilePath, synthesisFileHash);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isCompileFinished), this.outputFilePath, this.synthesisFilePath, this.synthesisFileHash};
    }

    public final String getOutputFilePath() {
        return this.outputFilePath;
    }

    public final String getSynthesisFileHash() {
        return this.synthesisFileHash;
    }

    public final String getSynthesisFilePath() {
        return this.synthesisFilePath;
    }

    public final boolean isCompileFinished() {
        return this.isCompileFinished;
    }

    public UploadResumeInfo(boolean z, String str, String str2, String str3) {
        HH1.LIZ(str, "outputFilePath", str2, "synthesisFilePath", str3, "synthesisFileHash");
        this.isCompileFinished = z;
        this.outputFilePath = str;
        this.synthesisFilePath = str2;
        this.synthesisFileHash = str3;
    }
}
