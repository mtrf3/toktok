package com.ss.bytenn;

import X.EnumC48550J3q;
import Y.IDCreatorS52S0000000_8;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class ByteNNConfig implements Parcelable {
    public static final Parcelable.Creator<ByteNNConfig> CREATOR = new IDCreatorS52S0000000_8(2);
    public EnumC48550J3q forwardType;
    public String[] inputNames;
    public ByteBuffer model;
    public String modelName;
    public int numThread;
    public String oclKernelBinPath;
    public String[] outputNames;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getModelBufferSize() {
        return this.model.capacity();
    }

    public int getOrdinalOfForwardType() {
        return this.forwardType.ordinal();
    }

    public ByteNNConfig() {
        this.numThread = 1;
        this.forwardType = EnumC48550J3q.CPU;
        this.oclKernelBinPath = "";
        this.modelName = "";
    }

    public ByteNNConfig(Parcel parcel) {
        this.numThread = 1;
        this.forwardType = EnumC48550J3q.values()[parcel.readInt()];
        parcel.readByteArray(null);
        this.model = ByteBuffer.wrap(null);
        parcel.readStringArray(this.inputNames);
        this.oclKernelBinPath = parcel.readString();
        this.modelName = parcel.readString();
        parcel.readStringArray(this.outputNames);
    }

    public void setThreadNum(int i) {
        this.numThread = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.forwardType.ordinal());
        parcel.writeByteArray(new byte[this.model.remaining()]);
        parcel.writeStringArray(this.inputNames);
        parcel.writeString(this.oclKernelBinPath);
        parcel.writeString(this.modelName);
        parcel.writeStringArray(this.outputNames);
    }

    public void init(EnumC48550J3q enumC48550J3q, ByteBuffer byteBuffer, String[] strArr, String str, String str2) {
        this.forwardType = enumC48550J3q;
        if (strArr != null) {
            this.inputNames = strArr;
        } else {
            this.inputNames = new String[0];
        }
        if (byteBuffer.isDirect()) {
            this.model = byteBuffer;
            this.oclKernelBinPath = str;
            this.modelName = str2;
            return;
        }
        throw new Exception("ByteBuffer must be direct");
    }

    public void init(EnumC48550J3q enumC48550J3q, ByteBuffer byteBuffer, String[] strArr, String[] strArr2, String str, String str2) {
        this.forwardType = enumC48550J3q;
        if (strArr != null) {
            this.inputNames = strArr;
        } else {
            this.inputNames = new String[0];
        }
        if (strArr2 != null) {
            this.outputNames = strArr2;
        } else {
            this.outputNames = new String[0];
        }
        if (byteBuffer.isDirect()) {
            this.model = byteBuffer;
            this.oclKernelBinPath = str;
            this.modelName = str2;
            return;
        }
        throw new Exception("ByteBuffer must be direct");
    }
}
