package com.ss.android.vesdk;

import X.C0NY;
import X.C16880lQ;
import X.EnumC122904s2;
import X.P4Q;
import X.V10;
import X.X1D;
import Y.IDCreatorS47S0000000_2;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class VERecordData implements Parcelable {
    public String concatAudio;
    public String concatVideo;
    public List<VERecordSegmentData> mSegmentDataList;
    public boolean mUseMusic;
    public static final Parcelable.Creator<VERecordData> CREATOR = new IDCreatorS51S0000000_7(25);
    public static final String TAG = C16880lQ.LJLLJ(VERecordData.class);
    public static final String[] DATAFIELD = {"counts", "audioLengths", "speeds", "musicStartTime", "encodeMode", "offset", "videoQuality", "random", "duatStartTime", "audioEffects", "newSync", "encodeMethod", "videoLengths"};
    public static final String[] suffixs = {"_frag_v", "_frag_a"};

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isSegmentOriginLenth() {
        for (VERecordSegmentData vERecordSegmentData : this.mSegmentDataList) {
            long j = (vERecordSegmentData.mTrimOut - vERecordSegmentData.mTrimIn) / 1000;
            long j2 = (vERecordSegmentData.mCutTrimOut - vERecordSegmentData.mCutTrimIn) / 1000;
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("segmentData.mTrimOut: ");
            LIZ.append(vERecordSegmentData.mTrimOut);
            LIZ.append(" segmentData.mTrimIn: ");
            LIZ.append(vERecordSegmentData.mTrimIn);
            LIZ.append(" segmentData.mVideoLength: ");
            LIZ.append(vERecordSegmentData.mVideoLength);
            P4Q.LIZ(str, X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("segmentData.mCutTrimOut: ");
            LIZ2.append(vERecordSegmentData.mCutTrimOut);
            LIZ2.append(" segmentData.mCutTrimIn: ");
            LIZ2.append(vERecordSegmentData.mCutTrimIn);
            LIZ2.append(" segmentData.mAudioLength: ");
            LIZ2.append(vERecordSegmentData.mAudioLength);
            P4Q.LIZ(str, X1D.LIZIZ(LIZ2));
            if (vERecordSegmentData.mEnable) {
                long j3 = vERecordSegmentData.mVideoLength;
                if (j >= j3 / 1000 && j2 >= j3 / 1000) {
                }
            }
            P4Q.LIZJ(str, "is not Segment Origin Lenth");
            return false;
        }
        return true;
    }

    /* loaded from: classes3.dex */
    public static final class VERecordSegmentData implements Parcelable {
        public static final Parcelable.Creator<VERecordSegmentData> CREATOR = new IDCreatorS47S0000000_2(6);
        public String mAudio;
        public long mAudioLength;
        public long mCutTrimIn;
        public long mCutTrimOut;
        public boolean mEnable;
        public ROTATE_DEGREE mRotate;
        public float mSpeed;
        public long mTrimIn;
        public long mTrimOut;
        public String mVideo;
        public long mVideoLength;
        public float mVideoSpeed;
        public boolean mWithNoSpeedBoth;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public long getCutTrimIn() {
            return this.mCutTrimIn;
        }

        public long getCutTrimOut() {
            return this.mCutTrimOut;
        }

        public VERecordSegmentData(Parcel parcel) {
            boolean z;
            this.mVideoSpeed = 1.0f;
            this.mVideo = parcel.readString();
            this.mAudio = parcel.readString();
            this.mVideoLength = parcel.readLong();
            this.mAudioLength = parcel.readLong();
            this.mVideoSpeed = parcel.readFloat();
            this.mSpeed = parcel.readFloat();
            this.mRotate = (ROTATE_DEGREE) parcel.readParcelable(ROTATE_DEGREE.class.getClassLoader());
            this.mTrimIn = parcel.readLong();
            this.mTrimOut = parcel.readLong();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.mEnable = z;
            this.mCutTrimIn = parcel.readLong();
            this.mCutTrimOut = parcel.readLong();
            this.mWithNoSpeedBoth = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mVideo);
            parcel.writeString(this.mAudio);
            parcel.writeLong(this.mVideoLength);
            parcel.writeLong(this.mAudioLength);
            parcel.writeFloat(this.mVideoSpeed);
            parcel.writeFloat(this.mSpeed);
            parcel.writeParcelable(this.mRotate, i);
            parcel.writeLong(this.mTrimIn);
            parcel.writeLong(this.mTrimOut);
            parcel.writeByte(this.mEnable ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.mCutTrimIn);
            parcel.writeLong(this.mCutTrimOut);
            parcel.writeByte(this.mWithNoSpeedBoth ? (byte) 1 : (byte) 0);
        }

        public VERecordSegmentData(String str, long j, String str2, long j2, float f, long j3, long j4, boolean z) {
            this.mVideoSpeed = 1.0f;
            this.mVideo = str;
            this.mAudio = str2;
            this.mVideoLength = j;
            this.mAudioLength = j2;
            this.mSpeed = f;
            this.mTrimIn = j3;
            this.mCutTrimIn = j3;
            this.mTrimOut = j4;
            this.mCutTrimOut = j4;
            this.mEnable = z;
        }

        public VERecordSegmentData(String str, long j, String str2, long j2, float f, float f2, ROTATE_DEGREE rotate_degree, long j3, long j4, boolean z) {
            this.mVideo = str;
            this.mAudio = str2;
            this.mVideoLength = j;
            this.mAudioLength = j2;
            this.mVideoSpeed = f;
            this.mSpeed = f2;
            this.mRotate = rotate_degree;
            this.mTrimIn = j3;
            this.mCutTrimIn = j3;
            this.mTrimOut = j4;
            this.mCutTrimOut = j4;
            this.mEnable = z;
        }
    }

    public VERecordData() {
    }

    public List<VERecordSegmentData> getSegmentData() {
        return this.mSegmentDataList;
    }

    public boolean isUseMusic() {
        return this.mUseMusic;
    }

    public VERecordData(Parcel parcel) {
        boolean z;
        this.mSegmentDataList = parcel.createTypedArrayList(VERecordSegmentData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mUseMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
    }

    public VERecordSegmentData removeSegmentData(int i) {
        String str = TAG;
        P4Q.LJFF(str, "removeSegmentData...");
        if (i < 0 || i >= this.mSegmentDataList.size()) {
            P4Q.LIZJ(str, "Parameter error");
            return null;
        }
        return (VERecordSegmentData) ListProtector.remove(this.mSegmentDataList, i);
    }

    public VERecordData(List<VERecordSegmentData> list, boolean z) {
        this.mSegmentDataList = list;
        this.mUseMusic = z;
    }

    public static int covertJsonToRecordData(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            P4Q.LIZJ(TAG, "Segmented video path is empty.");
            return -100;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(File.separatorChar);
        LIZ.append("");
        if (!str.endsWith(X1D.LIZIZ(LIZ))) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(File.separatorChar);
            str = X1D.LIZIZ(LIZ2);
        }
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append("data.txt");
            File file = new File(X1D.LIZIZ(LIZ3));
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            int i = 0;
            while (true) {
                String[] strArr = DATAFIELD;
                if (i < strArr.length) {
                    JSONArray jSONArray = (JSONArray) jSONObject.get(strArr[i]);
                    String str2 = "";
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(str2);
                        LIZ4.append(jSONArray.get(i2));
                        str2 = X1D.LIZIZ(LIZ4);
                        if (i2 != jSONArray.length() - 1) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append(str2);
                            LIZ5.append("\t");
                            str2 = X1D.LIZIZ(LIZ5);
                        }
                    }
                    bufferedWriter.write(str2);
                    bufferedWriter.write("\n");
                    i++;
                } else {
                    bufferedWriter.close();
                    return 0;
                }
            }
        } catch (Exception e) {
            P4Q.LIZJ(TAG, "Reading file contents error");
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public static JSONObject covertRecordDataToJson(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            P4Q.LIZJ(TAG, "Segmented video path is empty.");
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(File.separatorChar);
        LIZ.append("");
        if (!str.endsWith(X1D.LIZIZ(LIZ))) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(File.separatorChar);
            str = X1D.LIZIZ(LIZ2);
        }
        JSONObject jSONObject = new JSONObject();
        String LJFF = i0.LJFF(str, "data.txt");
        File file = new File(LJFF);
        if (!file.exists()) {
            String str2 = TAG;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJFF);
            LIZ3.append(" is not exist");
            P4Q.LIZJ(str2, X1D.LIZIZ(LIZ3));
            return null;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            for (String str3 : DATAFIELD) {
                String readLine = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine) && str3 != "offset") {
                    return null;
                }
                if (str3 == "counts") {
                    CastIntegerProtector.valueOf(readLine).intValue();
                }
                String[] split = readLine.split("\t");
                JSONArray jSONArray = new JSONArray();
                for (String str4 : split) {
                    jSONArray.put(str4);
                }
                jSONObject.put(str3, jSONArray);
            }
            bufferedReader.close();
            inputStreamReader.close();
            return jSONObject;
        } catch (Exception e) {
            P4Q.LIZJ(TAG, "Reading file contents error");
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        if (r0 <= 0) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.vesdk.VERecordData create(X.AbstractC84033WyT r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VERecordData.create(X.WyT, boolean):com.ss.android.vesdk.VERecordData");
    }

    public int addSegmentData(int i, VERecordSegmentData vERecordSegmentData) {
        String str = TAG;
        P4Q.LJFF(str, "addSegmentData...");
        if (i < 0 || i > this.mSegmentDataList.size()) {
            P4Q.LIZJ(str, "Parameter error");
            return -100;
        }
        ListProtector.add(this.mSegmentDataList, i, vERecordSegmentData);
        return 0;
    }

    public VERecordSegmentData replaceSegmentData(int i, VERecordData vERecordData) {
        List<VERecordSegmentData> list;
        String str = TAG;
        P4Q.LJFF(str, "replaceSegmentData...");
        if (i < 0 || i >= this.mSegmentDataList.size() || (list = vERecordData.mSegmentDataList) == null || list.size() == 0) {
            P4Q.LIZJ(str, "Parameter error");
            return null;
        }
        VERecordSegmentData vERecordSegmentData = (VERecordSegmentData) ListProtector.remove(this.mSegmentDataList, i);
        long j = vERecordSegmentData.mVideoLength;
        Iterator<VERecordSegmentData> it = vERecordData.mSegmentDataList.iterator();
        long j2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VERecordSegmentData next = it.next();
            if ((next.mVideoLength + j2) - j >= 0) {
                long j3 = j - j2;
                next.mAudioLength = j3;
                next.mVideoLength = j3;
                next.mCutTrimOut = j3;
                next.mTrimOut = j3;
                ListProtector.add(this.mSegmentDataList, i, next);
                break;
            }
            ListProtector.add(this.mSegmentDataList, i, next);
            j2 += next.mVideoLength;
            i++;
        }
        return vERecordSegmentData;
    }

    public int setTimeRange(long j, long j2) {
        String str = TAG;
        StringBuilder LIZJ = V10.LIZJ("setTimeRange, start: ", j, " end: ");
        LIZJ.append(j2);
        P4Q.LJFF(str, X1D.LIZIZ(LIZJ));
        if (j2 <= j) {
            return -100;
        }
        long j3 = 0;
        for (VERecordSegmentData vERecordSegmentData : this.mSegmentDataList) {
            long j4 = vERecordSegmentData.mTrimOut;
            long j5 = vERecordSegmentData.mTrimIn;
            long j6 = j4 - j5;
            if (j3 < j || j3 + j6 > j2) {
                if (j3 + j6 <= j || j3 >= j2) {
                    vERecordSegmentData.mCutTrimIn = 0L;
                    vERecordSegmentData.mCutTrimOut = 0L;
                    vERecordSegmentData.mEnable = false;
                } else {
                    long j7 = (j - j3) + j5;
                    long j8 = (j2 - j3) + j5;
                    if (j7 > j5) {
                        j5 = j7;
                    }
                    vERecordSegmentData.mCutTrimIn = j5;
                    if (j8 <= j4) {
                        j4 = j8;
                    }
                    vERecordSegmentData.mCutTrimOut = j4;
                }
            }
            j3 += j6;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mSegmentDataList);
        parcel.writeByte(this.mUseMusic ? (byte) 1 : (byte) 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
    }

    public static String getVideoRecordFilePath(String str, int i, EnumC122904s2 enumC122904s2) {
        String str2;
        if (enumC122904s2 == EnumC122904s2.VIDEO) {
            str2 = "_frag_v";
        } else {
            str2 = "_frag_a";
        }
        return C0NY.LIZIZ(str, i, str2);
    }
}
