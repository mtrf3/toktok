package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: X.Qpr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68211Qpr extends C68224Qq4 implements InterfaceC68207Qpn {
    public C68211Qpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // X.InterfaceC68207Qpn
    public final void clearMeasurementEnabled(long j) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 43);
    }

    @Override // X.InterfaceC68207Qpn
    public final void generateEventId(InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 22);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getAppInstanceId(InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 20);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getCachedAppInstanceId(InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 19);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getCurrentScreenClass(InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 17);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getCurrentScreenName(InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 16);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getGmpAppId(InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 21);
    }

    @Override // X.InterfaceC68207Qpn
    public final void setDataCollectionEnabled(boolean z) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(z ? 1 : 0);
        LLJJIII(LJLJI, 39);
    }

    @Override // X.InterfaceC68207Qpn
    public final void beginAdUnitExposure(String str, long j) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 23);
    }

    @Override // X.InterfaceC68207Qpn
    public final void endAdUnitExposure(String str, long j) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 24);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getMaxUserProperties(String str, InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 6);
    }

    @Override // X.InterfaceC68207Qpn
    public final void onActivityDestroyed(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 28);
    }

    @Override // X.InterfaceC68207Qpn
    public final void onActivityPaused(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 29);
    }

    @Override // X.InterfaceC68207Qpn
    public final void onActivityResumed(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 30);
    }

    @Override // X.InterfaceC68207Qpn
    public final void onActivityStarted(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 25);
    }

    @Override // X.InterfaceC68207Qpn
    public final void onActivityStopped(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 26);
    }

    @Override // X.InterfaceC68207Qpn
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, bundle);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 8);
    }

    @Override // X.InterfaceC68207Qpn
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(z ? 1 : 0);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 11);
    }

    @Override // X.InterfaceC68207Qpn
    public final void setUserId(String str, long j) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 7);
    }

    @Override // X.InterfaceC68207Qpn
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        C68209Qpp.LIZJ(LJLJI, bundle);
        LLJJIII(LJLJI, 9);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getConditionalUserProperties(String str, String str2, InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 10);
    }

    @Override // X.InterfaceC68207Qpn
    public final void initialize(InterfaceC68163Qp5 interfaceC68163Qp5, zzcl zzclVar, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        C68209Qpp.LIZJ(LJLJI, zzclVar);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 1);
    }

    @Override // X.InterfaceC68207Qpn
    public final void onActivityCreated(InterfaceC68163Qp5 interfaceC68163Qp5, Bundle bundle, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        C68209Qpp.LIZJ(LJLJI, bundle);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 27);
    }

    @Override // X.InterfaceC68207Qpn
    public final void onActivitySaveInstanceState(InterfaceC68163Qp5 interfaceC68163Qp5, InterfaceC68139Qoh interfaceC68139Qoh, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 31);
    }

    @Override // X.InterfaceC68207Qpn
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC68139Qoh interfaceC68139Qoh) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(z ? 1 : 0);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68139Qoh);
        LLJJIII(LJLJI, 5);
    }

    @Override // X.InterfaceC68207Qpn
    public final void setCurrentScreen(InterfaceC68163Qp5 interfaceC68163Qp5, String str, String str2, long j) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 15);
    }

    @Override // X.InterfaceC68207Qpn
    public final void logHealthData(int i, String str, InterfaceC68163Qp5 interfaceC68163Qp5, InterfaceC68163Qp5 interfaceC68163Qp52, InterfaceC68163Qp5 interfaceC68163Qp53) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(5);
        LJLJI.writeString(str);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp52);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp53);
        LLJJIII(LJLJI, 33);
    }

    @Override // X.InterfaceC68207Qpn
    public final void setUserProperty(String str, String str2, InterfaceC68163Qp5 interfaceC68163Qp5, boolean z, long j) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        C68209Qpp.LIZLLL(LJLJI, interfaceC68163Qp5);
        LJLJI.writeInt(z ? 1 : 0);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 4);
    }

    @Override // X.InterfaceC68207Qpn
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        C68209Qpp.LIZJ(LJLJI, bundle);
        LJLJI.writeInt(z ? 1 : 0);
        LJLJI.writeInt(z2 ? 1 : 0);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 2);
    }
}
