package com.ttnet.org.chromium.net.impl;

import X.C61460OAe;
import X.C66672QEq;
import X.C66675QEt;
import X.QF6;
import defpackage.i0;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes12.dex */
public class CronetBidirectionalStream extends QF6 {
    public C61460OAe LIZ;

    private void onCanceled() {
        throw null;
    }

    public static ArrayList<Map.Entry<String, String>> LIZ(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private void onResponseTrailersReceived(String[] strArr) {
        LIZ(strArr);
        throw null;
    }

    private void onStreamReady(boolean z) {
        throw null;
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.LIZ = new C61460OAe(Arrays.asList(null), i, "", LIZ(strArr), false, str, null, j);
            throw null;
        } catch (Exception unused) {
            new C66675QEt("Cannot prepare ResponseInfo", null);
            throw null;
        }
    }

    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        throw null;
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        C61460OAe c61460OAe = this.LIZ;
        if (c61460OAe != null) {
            c61460OAe.LJI.set(j);
        }
        if (i == 10 || i == 3) {
            new o0(i0.LJFF("Exception in BidirectionalStream: ", str), i, i2, i3);
            throw null;
        }
        new C66672QEq(i0.LJFF("Exception in BidirectionalStream: ", str), i, i2);
        throw null;
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.LIZ.LJI.set(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (i >= 0 && (i4 = i2 + i) <= i3) {
                byteBuffer.position(i4);
                throw null;
            }
            new C66675QEt("Invalid number of bytes read", null);
            throw null;
        }
        new C66675QEt("ByteBuffer modified externally during read", null);
        throw null;
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16) {
        throw null;
    }
}
