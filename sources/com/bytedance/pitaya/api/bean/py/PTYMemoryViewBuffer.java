package com.bytedance.pitaya.api.bean.py;

import com.bytedance.pitaya.api.bean.PTYClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PTYMemoryViewBuffer extends PTYClass {
    public final String customInfoStr;
    public final byte[] rawBytes;
    public final int rawDataType;
    public final float[] rawFloats;
    public final boolean readOnly;
    public final int[] shape;
    public final long size;

    /* JADX WARN: Multi-variable type inference failed */
    public PTYMemoryViewBuffer() {
        this((byte[]) null, (float[]) (0 == true ? 1 : 0), false, (int[]) (0 == true ? 1 : 0), (JSONObject) (0 == true ? 1 : 0), 31, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ void rawDataType$annotations() {
    }

    public final String getCustomInfoStr() {
        return this.customInfoStr;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final float[] getRawFloats() {
        return this.rawFloats;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final int[] getShape() {
        return this.shape;
    }

    public final long getSize() {
        return this.size;
    }

    public PTYMemoryViewBuffer(byte[] bArr, float[] fArr, boolean z, int[] iArr, JSONObject jSONObject) {
        super(1);
        long j;
        String str;
        int i;
        this.rawBytes = bArr;
        this.rawFloats = fArr;
        this.readOnly = z;
        this.shape = iArr;
        if (bArr != null) {
            j = bArr.length;
        } else if (fArr != null) {
            j = fArr.length * 4;
        } else {
            j = 0;
        }
        this.size = j;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        this.customInfoStr = str;
        if (z) {
            if (bArr != null) {
                i = 2;
            } else if (fArr != null) {
                i = 3;
            } else {
                throw new IllegalArgumentException("Tensor has no data!");
            }
            this.rawDataType = i;
            return;
        }
        throw new IllegalArgumentException("Only READ_ONLY MemoryViewBuffer is supported since Pitaya 2.7,More information please contact with mabenteng");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PTYMemoryViewBuffer(byte[] r7, float[] r8, boolean r9, java.lang.String r10, java.lang.String r11) {
        /*
            r6 = this;
            r5 = 0
            if (r10 == 0) goto L1a
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1c
            r3.<init>(r10)     // Catch: java.lang.Exception -> L1c
            int r2 = r3.length()     // Catch: java.lang.Exception -> L1c
            int[] r4 = new int[r2]     // Catch: java.lang.Exception -> L1c
            r1 = 0
        Lf:
            if (r1 >= r2) goto L1d
            int r0 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getInt(r3, r1)     // Catch: java.lang.Exception -> L1c
            r4[r1] = r0     // Catch: java.lang.Exception -> L1c
            int r1 = r1 + 1
            goto Lf
        L1a:
            r4 = r5
            goto L1d
        L1c:
            r4 = r5
        L1d:
            if (r11 == 0) goto L25
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L25
            r0.<init>(r11)     // Catch: java.lang.Exception -> L25
            r5 = r0
        L25:
            r1 = r7
            r0 = r6
            r3 = r9
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.api.bean.py.PTYMemoryViewBuffer.<init>(byte[], float[], boolean, java.lang.String, java.lang.String):void");
    }

    public /* synthetic */ PTYMemoryViewBuffer(byte[] bArr, float[] fArr, boolean z, int[] iArr, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bArr, (i & 2) != 0 ? null : fArr, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : iArr, (i & 16) == 0 ? jSONObject : null);
    }

    public /* synthetic */ PTYMemoryViewBuffer(byte[] bArr, float[] fArr, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, fArr, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str, (i & 16) == 0 ? str2 : null);
    }
}
