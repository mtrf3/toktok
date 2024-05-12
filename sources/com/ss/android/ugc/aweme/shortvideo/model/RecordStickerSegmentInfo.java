package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.HBV;
import X.InterfaceC65349Pkn;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordStickerSegmentInfo extends F9E implements Parcelable, Serializable {

    @InterfaceC65349Pkn("is_use_voice_recognize_sticker")
    public boolean isUseVoiceRecognizeSticker;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RecordStickerSegmentInfo> CREATOR = new Creator();

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<RecordStickerSegmentInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordStickerSegmentInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new RecordStickerSegmentInfo(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordStickerSegmentInfo[] newArray(int i) {
            return new RecordStickerSegmentInfo[i];
        }
    }

    public RecordStickerSegmentInfo() {
        this(false, 1, null);
    }

    public static final byte[] bundleToBytes(Bundle bundle) {
        return Companion.bundleToBytes(bundle);
    }

    public static final Bundle bytesToBundle(byte[] bArr) {
        return Companion.bytesToBundle(bArr);
    }

    public static /* synthetic */ RecordStickerSegmentInfo copy$default(RecordStickerSegmentInfo recordStickerSegmentInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recordStickerSegmentInfo.isUseVoiceRecognizeSticker;
        }
        return recordStickerSegmentInfo.copy(z);
    }

    public static final void register(HBV hbv) {
        Companion.register(hbv);
    }

    public final RecordStickerSegmentInfo copy(boolean z) {
        return new RecordStickerSegmentInfo(z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isUseVoiceRecognizeSticker)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isUseVoiceRecognizeSticker ? 1 : 0);
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final byte[] bundleToBytes(Bundle bundle) {
            o.LJIIIZ(bundle, "bundle");
            Parcel obtain = Parcel.obtain();
            o.LJIIIIZZ(obtain, "obtain()");
            obtain.writeBundle(bundle);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        }

        public final Bundle bytesToBundle(byte[] bytes) {
            o.LJIIIZ(bytes, "bytes");
            Parcel obtain = Parcel.obtain();
            o.LJIIIIZZ(obtain, "obtain()");
            obtain.unmarshall(bytes, 0, bytes.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(RecordStickerSegmentInfo.class.getClassLoader());
            obtain.recycle();
            o.LJI(readBundle);
            return readBundle;
        }

        public final void register(HBV mapping) {
            o.LJIIIZ(mapping, "mapping");
            mapping.LIZ(RecordStickerSegmentInfo.class, "extra_key_record_sticker_info");
        }
    }

    public final boolean isUseVoiceRecognizeSticker() {
        return this.isUseVoiceRecognizeSticker;
    }

    public RecordStickerSegmentInfo(boolean z) {
        this.isUseVoiceRecognizeSticker = z;
    }

    public final void setUseVoiceRecognizeSticker(boolean z) {
        this.isUseVoiceRecognizeSticker = z;
    }

    public /* synthetic */ RecordStickerSegmentInfo(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
