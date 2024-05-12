package X;

import com.lynx.react.bridge.ReadableType;

/* loaded from: classes7.dex */
public final /* synthetic */ class F4Y {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[ReadableType.values().length];
        LIZ = iArr;
        ReadableType readableType = ReadableType.Array;
        iArr[readableType.ordinal()] = 1;
        ReadableType readableType2 = ReadableType.Map;
        iArr[readableType2.ordinal()] = 2;
        ReadableType readableType3 = ReadableType.Number;
        iArr[readableType3.ordinal()] = 3;
        int[] iArr2 = new int[ReadableType.values().length];
        LIZIZ = iArr2;
        iArr2[readableType2.ordinal()] = 1;
        iArr2[readableType.ordinal()] = 2;
        iArr2[readableType3.ordinal()] = 3;
    }
}
