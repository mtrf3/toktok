package com.ss.mediakit.medialoader;

/* loaded from: classes9.dex */
public class AVMDLCopyOperation {
    public String mCustomDir;
    public String mDestPath;
    public String mFileKey;
    public boolean mForceCopyUnfinished;
    public final AVMDLCopyOperationListener mListener;
    public boolean mWaitIfCaching;

    public AVMDLCopyOperation(String str, String str2, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
    }

    public AVMDLCopyOperation(String str, String str2, boolean z, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
        this.mWaitIfCaching = z;
    }

    public AVMDLCopyOperation(String str, String str2, boolean z, boolean z2, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = aVMDLCopyOperationListener;
        this.mWaitIfCaching = z2;
        this.mForceCopyUnfinished = z;
        if (z) {
            this.mWaitIfCaching = false;
        }
    }
}
