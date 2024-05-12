package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.HashMap;

/* renamed from: X.Qpo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68208Qpo extends BinderC68226Qq6 implements InterfaceC68207Qpn {
    public AbstractBinderC68208Qpo() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC68207Qpn asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof InterfaceC68207Qpn) {
            return (InterfaceC68207Qpn) queryLocalInterface;
        }
        return new C68211Qpr(iBinder);
    }

    @Override // X.BinderC68226Qq6
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        InterfaceC68139Qoh interfaceC68139Qoh = null;
        InterfaceC68139Qoh c68225Qq5 = null;
        InterfaceC68139Qoh c68225Qq52 = null;
        InterfaceC68137Qof c68213Qpt = null;
        InterfaceC68137Qof c68213Qpt2 = null;
        InterfaceC68137Qof c68213Qpt3 = null;
        InterfaceC68139Qoh c68225Qq53 = null;
        InterfaceC68139Qoh c68225Qq54 = null;
        InterfaceC68139Qoh c68225Qq55 = null;
        InterfaceC68139Qoh c68225Qq56 = null;
        InterfaceC68139Qoh c68225Qq57 = null;
        InterfaceC68139Qoh c68225Qq58 = null;
        InterfaceC68145Qon c68228Qq8 = null;
        InterfaceC68139Qoh c68225Qq59 = null;
        InterfaceC68139Qoh c68225Qq510 = null;
        InterfaceC68139Qoh c68225Qq511 = null;
        InterfaceC68139Qoh c68225Qq512 = null;
        InterfaceC68139Qoh c68225Qq513 = null;
        switch (i) {
            case 1:
                InterfaceC68163Qp5 LLJI = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) C68209Qpp.LIZ(parcel, zzcl.CREATOR);
                long readLong = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                initialize(LLJI, zzclVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long readLong2 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                logEvent(readString, readString2, bundle, z, z2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof InterfaceC68139Qoh) {
                        interfaceC68139Qoh = (InterfaceC68139Qoh) queryLocalInterface;
                    } else {
                        interfaceC68139Qoh = new C68225Qq5(readStrongBinder);
                    }
                }
                long readLong3 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                logEventAndBundle(readString3, readString4, bundle2, interfaceC68139Qoh, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                long readLong4 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setUserProperty(readString5, readString6, LLJI2, z3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof InterfaceC68139Qoh) {
                        c68225Qq513 = (InterfaceC68139Qoh) queryLocalInterface2;
                    } else {
                        c68225Qq513 = new C68225Qq5(readStrongBinder2);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getUserProperties(readString7, readString8, z4, c68225Qq513);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof InterfaceC68139Qoh) {
                        c68225Qq512 = (InterfaceC68139Qoh) queryLocalInterface3;
                    } else {
                        c68225Qq512 = new C68225Qq5(readStrongBinder3);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getMaxUserProperties(readString9, c68225Qq512);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof InterfaceC68139Qoh) {
                        c68225Qq511 = (InterfaceC68139Qoh) queryLocalInterface4;
                    } else {
                        c68225Qq511 = new C68225Qq5(readStrongBinder4);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getConditionalUserProperties(readString13, readString14, c68225Qq511);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                long readLong7 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setMeasurementEnabled(z4, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                resetAnalyticsData(readLong8);
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                long readLong9 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                InterfaceC68163Qp5 LLJI3 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setCurrentScreen(LLJI3, readString15, readString16, readLong11);
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof InterfaceC68139Qoh) {
                        c68225Qq510 = (InterfaceC68139Qoh) queryLocalInterface5;
                    } else {
                        c68225Qq510 = new C68225Qq5(readStrongBinder5);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getCurrentScreenName(c68225Qq510);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof InterfaceC68139Qoh) {
                        c68225Qq59 = (InterfaceC68139Qoh) queryLocalInterface6;
                    } else {
                        c68225Qq59 = new C68225Qq5(readStrongBinder6);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getCurrentScreenClass(c68225Qq59);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof InterfaceC68145Qon) {
                        c68228Qq8 = (InterfaceC68145Qon) queryLocalInterface7;
                    } else {
                        c68228Qq8 = new C68228Qq8(readStrongBinder7);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                setInstanceIdProvider(c68228Qq8);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof InterfaceC68139Qoh) {
                        c68225Qq58 = (InterfaceC68139Qoh) queryLocalInterface8;
                    } else {
                        c68225Qq58 = new C68225Qq5(readStrongBinder8);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getCachedAppInstanceId(c68225Qq58);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof InterfaceC68139Qoh) {
                        c68225Qq57 = (InterfaceC68139Qoh) queryLocalInterface9;
                    } else {
                        c68225Qq57 = new C68225Qq5(readStrongBinder9);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getAppInstanceId(c68225Qq57);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof InterfaceC68139Qoh) {
                        c68225Qq56 = (InterfaceC68139Qoh) queryLocalInterface10;
                    } else {
                        c68225Qq56 = new C68225Qq5(readStrongBinder10);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                getGmpAppId(c68225Qq56);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof InterfaceC68139Qoh) {
                        c68225Qq55 = (InterfaceC68139Qoh) queryLocalInterface11;
                    } else {
                        c68225Qq55 = new C68225Qq5(readStrongBinder11);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                generateEventId(c68225Qq55);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                InterfaceC68163Qp5 LLJI4 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                onActivityStarted(LLJI4, readLong14);
                break;
            case 26:
                InterfaceC68163Qp5 LLJI5 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                onActivityStopped(LLJI5, readLong15);
                break;
            case 27:
                InterfaceC68163Qp5 LLJI6 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                onActivityCreated(LLJI6, bundle5, readLong16);
                break;
            case 28:
                InterfaceC68163Qp5 LLJI7 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                onActivityDestroyed(LLJI7, readLong17);
                break;
            case 29:
                InterfaceC68163Qp5 LLJI8 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                onActivityPaused(LLJI8, readLong18);
                break;
            case 30:
                InterfaceC68163Qp5 LLJI9 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                onActivityResumed(LLJI9, readLong19);
                break;
            case 31:
                InterfaceC68163Qp5 LLJI10 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof InterfaceC68139Qoh) {
                        c68225Qq54 = (InterfaceC68139Qoh) queryLocalInterface12;
                    } else {
                        c68225Qq54 = new C68225Qq5(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                onActivitySaveInstanceState(LLJI10, c68225Qq54, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof InterfaceC68139Qoh) {
                        c68225Qq53 = (InterfaceC68139Qoh) queryLocalInterface13;
                    } else {
                        c68225Qq53 = new C68225Qq5(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                performAction(bundle6, c68225Qq53, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC68163Qp5 LLJI11 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                InterfaceC68163Qp5 LLJI12 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                InterfaceC68163Qp5 LLJI13 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                C68209Qpp.LIZIZ(parcel);
                logHealthData(readInt, readString19, LLJI11, LLJI12, LLJI13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof InterfaceC68137Qof) {
                        c68213Qpt3 = (InterfaceC68137Qof) queryLocalInterface14;
                    } else {
                        c68213Qpt3 = new C68213Qpt(readStrongBinder14);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                setEventInterceptor(c68213Qpt3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof InterfaceC68137Qof) {
                        c68213Qpt2 = (InterfaceC68137Qof) queryLocalInterface15;
                    } else {
                        c68213Qpt2 = new C68213Qpt(readStrongBinder15);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                registerOnMeasurementEventListener(c68213Qpt2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof InterfaceC68137Qof) {
                        c68213Qpt = (InterfaceC68137Qof) queryLocalInterface16;
                    } else {
                        c68213Qpt = new C68213Qpt(readStrongBinder16);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                unregisterOnMeasurementEventListener(c68213Qpt);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(C68209Qpp.LIZ);
                C68209Qpp.LIZIZ(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof InterfaceC68139Qoh) {
                        c68225Qq52 = (InterfaceC68139Qoh) queryLocalInterface17;
                    } else {
                        c68225Qq52 = new C68225Qq5(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                C68209Qpp.LIZIZ(parcel);
                getTestFlag(c68225Qq52, readInt2);
                break;
            case 39:
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                C68209Qpp.LIZIZ(parcel);
                setDataCollectionEnabled(z4);
                break;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof InterfaceC68139Qoh) {
                        c68225Qq5 = (InterfaceC68139Qoh) queryLocalInterface18;
                    } else {
                        c68225Qq5 = new C68225Qq5(readStrongBinder18);
                    }
                }
                C68209Qpp.LIZIZ(parcel);
                isDataCollectionEnabled(c68225Qq5);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                long readLong22 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                C68209Qpp.LIZIZ(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
