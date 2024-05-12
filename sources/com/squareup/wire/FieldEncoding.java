package com.squareup.wire;

import X.V0N;

/* loaded from: classes12.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    public final int LJLIL;

    /* renamed from: com.squareup.wire.FieldEncoding$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] LIZ;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            LIZ = iArr;
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZ[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ProtoAdapter<?> rawProtoAdapter() {
        int i = AnonymousClass1.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return ProtoAdapter.BYTES;
                    }
                    throw new AssertionError();
                }
                return ProtoAdapter.FIXED64;
            }
            return ProtoAdapter.FIXED32;
        }
        return ProtoAdapter.UINT64;
    }

    public static FieldEncoding valueOf(String str) {
        return (FieldEncoding) V0N.LJJJ(FieldEncoding.class, str);
    }

    FieldEncoding(int i) {
        this.LJLIL = i;
    }
}
