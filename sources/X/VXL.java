package X;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;

/* loaded from: classes15.dex */
public /* synthetic */ class VXL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DataSource.ScaleType.values().length];
        LIZ = iArr;
        try {
            iArr[DataSource.ScaleType.ScaleToFill.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[DataSource.ScaleType.ScaleAspectFitCenter.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[DataSource.ScaleType.ScaleAspectFill.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[DataSource.ScaleType.TopFill.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[DataSource.ScaleType.BottomFill.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[DataSource.ScaleType.LeftFill.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[DataSource.ScaleType.RightFill.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[DataSource.ScaleType.TopFit.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZ[DataSource.ScaleType.BottomFit.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            LIZ[DataSource.ScaleType.LeftFit.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            LIZ[DataSource.ScaleType.RightFit.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
