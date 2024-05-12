package com.squareup.wire;

import X.C64537PUn;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes12.dex */
public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes12.dex */
    public static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {
        public final ProtoAdapter<M> LIZ;

        public ProtoAdapterCreator(ProtoAdapter<M> protoAdapter) {
            this.LIZ = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(Parcel parcel) {
            try {
                return this.LIZ.decode(parcel.createByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public M[] newArray(int i) {
            return (M[]) ((Object[]) Array.newInstance(this.LIZ.LIZIZ, i));
        }
    }

    public static <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return new ProtoAdapterCreator(protoAdapter);
    }

    public AndroidMessage(ProtoAdapter<M> protoAdapter, C64537PUn c64537PUn) {
        super(protoAdapter, c64537PUn);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(encode());
    }
}
