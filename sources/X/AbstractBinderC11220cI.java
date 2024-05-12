package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.service.notification.StatusBarNotification;
import androidx.browser.trusted.TrustedWebActivityService;

/* renamed from: X.0cI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC11220cI extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC11220cI() {
        attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface queryLocalInterface;
        Bundle bundle;
        NotificationChannel notificationChannel;
        boolean z = false;
        Notification notification = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        if (i != 9) {
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        BinderC282619a binderC282619a = (BinderC282619a) this;
                        binderC282619a.LJLJI();
                        AnonymousClass043.LIZ(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
                        AnonymousClass043.LIZ(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
                        AnonymousClass043.LIZ(bundle, "android.support.customtabs.trusted.NOTIFICATION");
                        AnonymousClass043.LIZ(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
                        String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                        int i3 = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                        Notification notification2 = (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION");
                        String string2 = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                        TrustedWebActivityService trustedWebActivityService = binderC282619a.LJLIL;
                        trustedWebActivityService.LIZIZ();
                        if (new AnonymousClass078(trustedWebActivityService).LIZIZ()) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                String LIZ = TrustedWebActivityService.LIZ(string2);
                                NotificationManager notificationManager = trustedWebActivityService.LJLIL;
                                notificationManager.createNotificationChannel(new NotificationChannel(LIZ, string2, 3));
                                if (notificationManager.getNotificationChannel(LIZ).getImportance() != 0) {
                                    Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification2);
                                    recoverBuilder.setChannelId(LIZ);
                                    notification = recoverBuilder.build();
                                }
                                NotificationChannel notificationChannel2 = trustedWebActivityService.LJLIL.getNotificationChannel(LIZ);
                                if (notificationChannel2 == null || notificationChannel2.getImportance() != 0) {
                                    notification2 = notification;
                                }
                            }
                            trustedWebActivityService.LJLIL.notify(string, i3, notification2);
                            z = true;
                        }
                        Bundle bundle4 = new Bundle();
                        bundle4.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                        bundle4.writeToParcel(parcel2, 1);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        BinderC282619a binderC282619a2 = (BinderC282619a) this;
                        binderC282619a2.LJLJI();
                        AnonymousClass043.LIZ(bundle3, "android.support.customtabs.trusted.PLATFORM_TAG");
                        AnonymousClass043.LIZ(bundle3, "android.support.customtabs.trusted.PLATFORM_ID");
                        String string3 = bundle3.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                        int i4 = bundle3.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                        TrustedWebActivityService trustedWebActivityService2 = binderC282619a2.LJLIL;
                        trustedWebActivityService2.LIZIZ();
                        trustedWebActivityService2.LJLIL.cancel(string3, i4);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        BinderC282619a binderC282619a3 = (BinderC282619a) this;
                        binderC282619a3.LJLJI();
                        int LIZLLL = binderC282619a3.LJLIL.LIZLLL();
                        parcel2.writeNoException();
                        parcel2.writeInt(LIZLLL);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        BinderC282619a binderC282619a4 = (BinderC282619a) this;
                        binderC282619a4.LJLJI();
                        TrustedWebActivityService trustedWebActivityService3 = binderC282619a4.LJLIL;
                        trustedWebActivityService3.LIZIZ();
                        if (Build.VERSION.SDK_INT >= 23) {
                            StatusBarNotification[] activeNotifications = trustedWebActivityService3.LJLIL.getActiveNotifications();
                            Bundle bundle5 = new Bundle();
                            bundle5.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
                            parcel2.writeNoException();
                            parcel2.writeInt(1);
                            bundle5.writeToParcel(parcel2, 1);
                            return true;
                        }
                        throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
                    case 6:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        BinderC282619a binderC282619a5 = (BinderC282619a) this;
                        binderC282619a5.LJLJI();
                        AnonymousClass043.LIZ(bundle2, "android.support.customtabs.trusted.CHANNEL_NAME");
                        String string4 = bundle2.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                        TrustedWebActivityService trustedWebActivityService4 = binderC282619a5.LJLIL;
                        trustedWebActivityService4.LIZIZ();
                        if (new AnonymousClass078(trustedWebActivityService4).LIZIZ() && (Build.VERSION.SDK_INT < 26 || (notificationChannel = trustedWebActivityService4.LJLIL.getNotificationChannel(TrustedWebActivityService.LIZ(string4))) == null || notificationChannel.getImportance() != 0)) {
                            z = true;
                        }
                        Bundle bundle6 = new Bundle();
                        bundle6.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                        bundle6.writeToParcel(parcel2, 1);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                        BinderC282619a binderC282619a6 = (BinderC282619a) this;
                        binderC282619a6.LJLJI();
                        TrustedWebActivityService trustedWebActivityService5 = binderC282619a6.LJLIL;
                        int LIZLLL2 = trustedWebActivityService5.LIZLLL();
                        Bundle bundle7 = new Bundle();
                        if (LIZLLL2 != -1) {
                            bundle7.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService5.getResources(), LIZLLL2));
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(1);
                        bundle7.writeToParcel(parcel2, 1);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
        parcel.readString();
        if (parcel.readInt() != 0) {
            Bundle.CREATOR.createFromParcel(parcel);
        }
        final IBinder readStrongBinder = parcel.readStrongBinder();
        BinderC282619a binderC282619a7 = (BinderC282619a) this;
        binderC282619a7.LJLJI();
        TrustedWebActivityService trustedWebActivityService6 = binderC282619a7.LJLIL;
        if (readStrongBinder != null && ((queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback")) == null || !(queryLocalInterface instanceof InterfaceC11210cH))) {
            new InterfaceC11210cH(readStrongBinder) { // from class: X.1QD
                public final IBinder LJLIL;

                @Override // android.os.IInterface
                public final IBinder asBinder() {
                    return this.LJLIL;
                }

                {
                    this.LJLIL = readStrongBinder;
                }
            };
        }
        trustedWebActivityService6.getClass();
        parcel2.writeNoException();
        parcel2.writeInt(0);
        return true;
    }
}
