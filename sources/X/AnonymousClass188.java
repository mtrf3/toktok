package X;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.188, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass188 extends Binder implements InterfaceC007701h {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass188() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        android.net.Uri uri;
        android.net.Uri uri2;
        RatingCompat ratingCompat;
        if (i != 1598968902) {
            MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
            Bundle bundle2 = null;
            MediaDescriptionCompat mediaDescriptionCompat = null;
            MediaDescriptionCompat mediaDescriptionCompat2 = null;
            MediaDescriptionCompat mediaDescriptionCompat3 = null;
            Bundle bundle3 = null;
            Bundle bundle4 = null;
            Bundle bundle5 = null;
            Bundle bundle6 = null;
            RatingCompat ratingCompat2 = null;
            Bundle bundle7 = null;
            Bundle bundle8 = null;
            Bundle bundle9 = null;
            InterfaceC007601g interfaceC007601g = null;
            InterfaceC007601g interfaceC007601g2 = null;
            KeyEvent keyEvent = null;
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    if (parcel.readInt() != 0) {
                        resultReceiverWrapper = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                    }
                    LLZ(readString, bundle, resultReceiverWrapper);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    boolean LLLLZLL = LLLLZLL(keyEvent);
                    parcel2.writeNoException();
                    parcel2.writeInt(LLLLZLL ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC007601g)) {
                            interfaceC007601g2 = (InterfaceC007601g) queryLocalInterface;
                        } else {
                            interfaceC007601g2 = new InterfaceC007601g(readStrongBinder) { // from class: X.185
                                public final IBinder LJLIL;

                                @Override // X.InterfaceC007601g
                                public final void LLLILZJ() {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        this.LJLIL.transact(2, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LJLIL;
                                }

                                {
                                    this.LJLIL = readStrongBinder;
                                }

                                @Override // X.InterfaceC007601g
                                public final void LLILII(MediaMetadataCompat mediaMetadataCompat) {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (mediaMetadataCompat == null) {
                                            obtain.writeInt(0);
                                        } else {
                                            obtain.writeInt(1);
                                            obtain.writeBundle(mediaMetadataCompat.LJLIL);
                                        }
                                        this.LJLIL.transact(4, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007601g
                                public final void LLJIJIL(ParcelableVolumeInfo parcelableVolumeInfo) {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (parcelableVolumeInfo == null) {
                                            obtain.writeInt(0);
                                        } else {
                                            obtain.writeInt(1);
                                            parcelableVolumeInfo.writeToParcel(obtain, 0);
                                        }
                                        this.LJLIL.transact(8, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007601g
                                public final void LLJLLL(PlaybackStateCompat playbackStateCompat) {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (playbackStateCompat == null) {
                                            obtain.writeInt(0);
                                        } else {
                                            obtain.writeInt(1);
                                            playbackStateCompat.writeToParcel(obtain, 0);
                                        }
                                        this.LJLIL.transact(3, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }
                            };
                        }
                    }
                    LLZIL(interfaceC007601g2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC007601g)) {
                            interfaceC007601g = (InterfaceC007601g) queryLocalInterface2;
                        } else {
                            interfaceC007601g = new InterfaceC007601g(readStrongBinder2) { // from class: X.185
                                public final IBinder LJLIL;

                                @Override // X.InterfaceC007601g
                                public final void LLLILZJ() {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        this.LJLIL.transact(2, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LJLIL;
                                }

                                {
                                    this.LJLIL = readStrongBinder2;
                                }

                                @Override // X.InterfaceC007601g
                                public final void LLILII(MediaMetadataCompat mediaMetadataCompat) {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (mediaMetadataCompat == null) {
                                            obtain.writeInt(0);
                                        } else {
                                            obtain.writeInt(1);
                                            obtain.writeBundle(mediaMetadataCompat.LJLIL);
                                        }
                                        this.LJLIL.transact(4, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007601g
                                public final void LLJIJIL(ParcelableVolumeInfo parcelableVolumeInfo) {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (parcelableVolumeInfo == null) {
                                            obtain.writeInt(0);
                                        } else {
                                            obtain.writeInt(1);
                                            parcelableVolumeInfo.writeToParcel(obtain, 0);
                                        }
                                        this.LJLIL.transact(8, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007601g
                                public final void LLJLLL(PlaybackStateCompat playbackStateCompat) {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (playbackStateCompat == null) {
                                            obtain.writeInt(0);
                                        } else {
                                            obtain.writeInt(1);
                                            playbackStateCompat.writeToParcel(obtain, 0);
                                        }
                                        this.LJLIL.transact(3, obtain, null, 1);
                                    } finally {
                                        obtain.recycle();
                                    }
                                }
                            };
                        }
                    }
                    LLZILL(interfaceC007601g);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean LLLLLZ = LLLLLZ();
                    parcel2.writeNoException();
                    parcel2.writeInt(LLLLLZ ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent LLLZZ = LLLZZ();
                    parcel2.writeNoException();
                    if (LLLZZ != null) {
                        parcel2.writeInt(1);
                        LLLZZ.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long LLLLLLLLL = LLLLLLLLL();
                    parcel2.writeNoException();
                    parcel2.writeLong(LLLLLLLLL);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo LLLLZ = LLLLZ();
                    parcel2.writeNoException();
                    if (LLLLZ != null) {
                        parcel2.writeInt(1);
                        LLLLZ.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    parcel.readString();
                    Y(readInt, readInt2);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    parcel.readString();
                    LLZL(readInt3, readInt4);
                    parcel2.writeNoException();
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    w(bundle9, readString2);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    t0(bundle8, readString3);
                    parcel2.writeNoException();
                    return true;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        uri = (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    x(uri, bundle7);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLZI(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    c0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLLLLZZ();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        ratingCompat2 = RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    LLLZIL(ratingCompat2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLLLZI(bundle6, readString4);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    if (metadata != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(metadata.LJLIL);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat LJIIZILJ = LJIIZILJ();
                    parcel2.writeNoException();
                    if (LJIIZILJ != null) {
                        parcel2.writeInt(1);
                        LJIIZILJ.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLLLLL();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(null);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence LLLLLZIL = LLLLLZIL();
                    parcel2.writeNoException();
                    if (LLLLLZIL != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(LLLLLZIL, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLLZIL();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLLZ(bundle5, readString5);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString6 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    r(bundle4, readString6);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        uri2 = (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri2 = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLLLLLLLLL(uri2, bundle3);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    k();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLZLL();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    r0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    LLLZLZ();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    U(mediaDescriptionCompat3);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    LLLLZLLIL(mediaDescriptionCompat2, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    S(mediaDescriptionCompat);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLLLLLZIL(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLLLLZ();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    LLLLLZL(z);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLLZLLLI();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLZIIL(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case C61447O9r.LJIIJ:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLZL(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle LLLLLLJ = LLLLLLJ();
                    parcel2.writeNoException();
                    if (LLLLLLJ != null) {
                        parcel2.writeInt(1);
                        LLLLLLJ.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
                    } else {
                        ratingCompat = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLLZZIL(ratingCompat, bundle2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.v4.media.session.IMediaSession");
        return true;
    }
}
