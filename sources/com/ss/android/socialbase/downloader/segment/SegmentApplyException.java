package com.ss.android.socialbase.downloader.segment;

import X.C012403c;
import com.ss.android.socialbase.downloader.exception.BaseException;

/* loaded from: classes16.dex */
public class SegmentApplyException extends BaseException {
    public int applyCode;

    public SegmentApplyException(int i, String str) {
        super(1072, C012403c.LIZLLL("applyCode=", i, ", ", str));
        this.applyCode = i;
    }
}
