package com.ss.android.ugc.aweme.live.alphaplayer.model;

import X.C0JT;
import X.V0N;
import X.VGU;
import X.X1D;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes15.dex */
public class DataSource {
    public boolean autoRelease = true;
    public String errorInfo;
    public boolean isValid;
    public DataInfo landscapeDataInfo;
    public boolean loop;
    public long messageId;
    public DataInfo portraitDataInfo;

    /* loaded from: classes15.dex */
    public static class DataInfo {
        public int actualHeight;
        public int actualWidth;
        public VGU alphaArea;
        public Map<String, Map<String, Element>> masks;
        public String path;
        public VGU rgbArea;
        public ScaleType scaleType = ScaleType.ScaleAspectFill;
        public int totalFrame;
        public int version;
        public int videoHeight;
        public int videoWidth;

        public boolean isSupportMask() {
            Map<String, Map<String, Element>> map;
            if (this.version == 1 && (map = this.masks) != null && !map.isEmpty()) {
                return true;
            }
            return false;
        }

        public boolean isSupportZip() {
            if (this.version == 1 && this.rgbArea != null && this.alphaArea != null) {
                return true;
            }
            return false;
        }

        public DataInfo() {
        }

        public int getActualHeight() {
            return this.actualHeight;
        }

        public int getActualWidth() {
            return this.actualWidth;
        }

        public VGU getAlphaArea() {
            return this.alphaArea;
        }

        public Map<String, Map<String, Element>> getMasks() {
            return this.masks;
        }

        public String getPath() {
            return this.path;
        }

        public VGU getRgbArea() {
            return this.rgbArea;
        }

        public ScaleType getScaleType() {
            return this.scaleType;
        }

        public int getTotalFrame() {
            return this.totalFrame;
        }

        public int getVersion() {
            return this.version;
        }

        public int getVideoHeight() {
            return this.videoHeight;
        }

        public int getVideoWidth() {
            return this.videoWidth;
        }

        public DataInfo(String str) {
            this.path = str;
        }

        public static DataInfo copy(DataInfo dataInfo) {
            VGU vgu;
            VGU vgu2 = null;
            if (dataInfo == null) {
                return null;
            }
            DataInfo dataInfo2 = new DataInfo();
            dataInfo2.path = dataInfo.path;
            dataInfo2.scaleType = dataInfo.scaleType;
            dataInfo2.totalFrame = dataInfo.totalFrame;
            VGU vgu3 = dataInfo.alphaArea;
            if (vgu3 == null) {
                vgu = null;
            } else {
                vgu = new VGU();
                vgu.LIZ = vgu3.LIZ;
                vgu.LIZIZ = vgu3.LIZIZ;
                vgu.LIZJ = vgu3.LIZJ;
                vgu.LIZLLL = vgu3.LIZLLL;
            }
            dataInfo2.alphaArea = vgu;
            VGU vgu4 = dataInfo.rgbArea;
            if (vgu4 != null) {
                vgu2 = new VGU();
                vgu2.LIZ = vgu4.LIZ;
                vgu2.LIZIZ = vgu4.LIZIZ;
                vgu2.LIZJ = vgu4.LIZJ;
                vgu2.LIZLLL = vgu4.LIZLLL;
            }
            dataInfo2.rgbArea = vgu2;
            dataInfo2.videoWidth = dataInfo.videoWidth;
            dataInfo2.videoHeight = dataInfo.videoHeight;
            dataInfo2.actualWidth = dataInfo.actualWidth;
            dataInfo2.actualHeight = dataInfo.actualHeight;
            dataInfo2.version = dataInfo.version;
            dataInfo2.masks = dataInfo.masks;
            return dataInfo2;
        }

        public DataInfo setActualHeight(int i) {
            this.actualHeight = i;
            return this;
        }

        public DataInfo setActualWidth(int i) {
            this.actualWidth = i;
            return this;
        }

        public DataInfo setAlphaArea(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.alphaArea = new VGU(iArr);
            }
            return this;
        }

        public DataInfo setMasks(Map<String, Map<String, Element>> map) {
            this.masks = map;
            return this;
        }

        public DataInfo setRgbArea(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.rgbArea = new VGU(iArr);
            }
            return this;
        }

        public DataInfo setScaleType(int i) {
            this.scaleType = ScaleType.convertFrom(i);
            return this;
        }

        public DataInfo setTotalFrame(int i) {
            this.totalFrame = i;
            return this;
        }

        public DataInfo setVersion(int i) {
            this.version = i;
            return this;
        }

        public DataInfo setVideoHeight(int i) {
            this.videoHeight = i;
            return this;
        }

        public DataInfo setVideoWidth(int i) {
            this.videoWidth = i;
            return this;
        }

        public DataInfo setScaleType(ScaleType scaleType) {
            this.scaleType = scaleType;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class Element {
        public int fitType;
        public int[] renderFrame;
        public int[] sourceFrame;
        public int type;

        public boolean isValid() {
            int[] iArr;
            int[] iArr2;
            int i = this.type;
            if (i != 0 && i != 1) {
                return false;
            }
            int i2 = this.fitType;
            if ((i2 == 0 || i2 == 1) && (iArr = this.sourceFrame) != null && iArr.length == 4 && (iArr2 = this.renderFrame) != null && iArr2.length == 4) {
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Element{type=");
            LIZ.append(this.type);
            LIZ.append(", fitType=");
            LIZ.append(this.fitType);
            LIZ.append(", sourceFrame=");
            C0JT.LIZLLL(this.sourceFrame, LIZ, ", renderFrame=");
            LIZ.append(Arrays.toString(this.renderFrame));
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    private void checkValid() {
        this.isValid = checkValid(this.portraitDataInfo);
    }

    public boolean getAutoRelease() {
        return this.autoRelease;
    }

    public String getErrorInfo() {
        return this.errorInfo;
    }

    public boolean getLoop() {
        return this.loop;
    }

    public long getMessageId() {
        return this.messageId;
    }

    public boolean isValid() {
        return this.isValid;
    }

    /* loaded from: classes15.dex */
    public enum ScaleType {
        ScaleToFill(0),
        ScaleAspectFitCenter(1),
        ScaleAspectFill(2),
        TopFill(3),
        BottomFill(4),
        LeftFill(5),
        RightFill(6),
        TopFit(7),
        BottomFit(8),
        LeftFit(9),
        RightFit(10);

        public int index;

        public static ScaleType convertFrom(int i) {
            switch (i) {
                case 0:
                    return ScaleToFill;
                case 1:
                    return ScaleAspectFitCenter;
                case 2:
                    return ScaleAspectFill;
                case 3:
                    return TopFill;
                case 4:
                    return BottomFill;
                case 5:
                    return LeftFill;
                case 6:
                    return RightFill;
                case 7:
                    return TopFit;
                case 8:
                    return BottomFit;
                case 9:
                    return LeftFit;
                case 10:
                    return RightFit;
                default:
                    return ScaleAspectFill;
            }
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) V0N.LJJJ(ScaleType.class, str);
        }

        ScaleType(int i) {
            this.index = i;
        }
    }

    private boolean checkValid(DataInfo dataInfo) {
        VGU vgu;
        int i;
        if (dataInfo == null) {
            this.errorInfo = "dataInfo is null.";
            return false;
        }
        if (TextUtils.isEmpty(dataInfo.path)) {
            this.errorInfo = "dataPath is empty.";
            return false;
        }
        if (!new File(dataInfo.path).exists()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dataPath is not exist, path: ");
            LIZ.append(dataInfo.path);
            this.errorInfo = X1D.LIZIZ(LIZ);
            return false;
        }
        if (dataInfo.version > 0) {
            VGU vgu2 = dataInfo.alphaArea;
            if (vgu2 == null || (vgu = dataInfo.rgbArea) == null) {
                this.errorInfo = "area is empty";
                return false;
            }
            if (vgu2.LIZ <= vgu2.LIZJ && vgu2.LIZIZ <= vgu2.LIZLLL) {
                float f = vgu.LIZ;
                float f2 = vgu.LIZJ;
                if (f <= f2 && vgu.LIZIZ <= vgu.LIZLLL) {
                    if (dataInfo.videoWidth <= 0 || dataInfo.videoHeight <= 0) {
                        this.errorInfo = "video size is wrong";
                        return false;
                    }
                    int i2 = dataInfo.actualWidth;
                    if (i2 <= 0 || (i = dataInfo.actualHeight) <= 0) {
                        this.errorInfo = "actual size is wrong";
                        return false;
                    }
                    if (f2 - f != i2 || vgu.LIZLLL - vgu.LIZIZ != i) {
                        this.errorInfo = "rgb area is not equal to actual size";
                        return false;
                    }
                }
            }
            this.errorInfo = "area is invalid";
            return false;
        }
        return true;
    }

    public static DataSource copy(DataSource dataSource) {
        if (dataSource == null) {
            return null;
        }
        DataSource dataSource2 = new DataSource();
        dataSource2.setPortraitDataInfo(DataInfo.copy(dataSource.portraitDataInfo));
        dataSource2.setLandscapeDataInfo(DataInfo.copy(dataSource.landscapeDataInfo));
        dataSource2.setLoop(dataSource.loop);
        dataSource2.setAutoRelease(dataSource.autoRelease);
        dataSource2.setMessageId(dataSource.messageId);
        dataSource2.isValid = dataSource.isValid;
        dataSource2.errorInfo = dataSource.errorInfo;
        return dataSource2;
    }

    public DataInfo getDataInfo(int i) {
        if (1 == i) {
            return this.portraitDataInfo;
        }
        return this.landscapeDataInfo;
    }

    public DataSource setAutoRelease(boolean z) {
        this.autoRelease = z;
        return this;
    }

    public DataSource setLandscapeDataInfo(DataInfo dataInfo) {
        this.landscapeDataInfo = dataInfo;
        checkValid();
        return this;
    }

    public DataSource setLoop(boolean z) {
        this.loop = z;
        return this;
    }

    public DataSource setMessageId(long j) {
        this.messageId = j;
        return this;
    }

    public DataSource setPortraitDataInfo(DataInfo dataInfo) {
        this.portraitDataInfo = dataInfo;
        checkValid();
        return this;
    }
}
