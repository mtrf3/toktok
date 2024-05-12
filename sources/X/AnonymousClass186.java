package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.186, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass186 extends Binder implements InterfaceC007601g {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass186() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i != 1598968902) {
            Bundle bundle = null;
            ParcelableVolumeInfo parcelableVolumeInfo = null;
            Bundle bundle2 = null;
            CharSequence charSequence = null;
            MediaMetadataCompat mediaMetadataCompat = null;
            PlaybackStateCompat playbackStateCompat = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    C01U c01u = ((BinderC39701h8) this).LJLILLLLZI.get();
                    if (c01u != null) {
                        c01u.LIZLLL(1, readString, bundle);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    LLLILZJ();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC39701h8) this).LLJLLL(playbackStateCompat);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    LLILII(mediaMetadataCompat);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    LLLIIIIL(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    j0(charSequence);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLJJI(bundle2);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    LLJIJIL(parcelableVolumeInfo);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int readInt = parcel.readInt();
                    C01U c01u2 = ((BinderC39701h8) this).LJLILLLLZI.get();
                    if (c01u2 != null) {
                        c01u2.LIZLLL(9, Integer.valueOf(readInt), null);
                    }
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C01U c01u3 = ((BinderC39701h8) this).LJLILLLLZI.get();
                    if (c01u3 != null) {
                        c01u3.LIZLLL(11, Boolean.valueOf(z), null);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int readInt2 = parcel.readInt();
                    C01U c01u4 = ((BinderC39701h8) this).LJLILLLLZI.get();
                    if (c01u4 != null) {
                        c01u4.LIZLLL(12, Integer.valueOf(readInt2), null);
                    }
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    C01U c01u5 = ((BinderC39701h8) this).LJLILLLLZI.get();
                    if (c01u5 != null) {
                        c01u5.LIZLLL(13, null, null);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }
}
