package com.google.ar.core;

import X.C94118abq;
import X.C94122abu;
import X.C94123abv;
import X.C94124abw;
import X.C94125abx;
import X.C94126aby;
import X.C94127abz;
import X.V0N;
import android.app.Activity;
import android.content.Context;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public class ArCoreApk {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes34.dex */
    public static class Availability {
        public final int nativeCode;
        public static final Availability UNKNOWN_ERROR = new C94122abu();
        public static final Availability UNKNOWN_CHECKING = new C94123abv();
        public static final Availability UNKNOWN_TIMED_OUT = new C94124abw();
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE = new C94125abx();
        public static final Availability SUPPORTED_NOT_INSTALLED = new C94126aby();
        public static final Availability SUPPORTED_APK_TOO_OLD = new C94127abz();
        public static final Availability SUPPORTED_INSTALLED = new C94118abq();
        public static final /* synthetic */ Availability[] $VALUES = $values();

        public static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        public static Availability forNumber(int i) {
            for (Availability availability : values()) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("Unexpected value for native Availability, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static Availability valueOf(String str) {
            return (Availability) V0N.LJJJ(Availability.class, str);
        }

        public Availability(String str, int i, int i2) {
            this.nativeCode = i2;
        }
    }

    public static ArCoreApk getInstance() {
        return k.a();
    }

    /* loaded from: classes34.dex */
    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);

        public final int nativeCode;

        public static InstallBehavior forNumber(int i) {
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i) {
                    return installBehavior;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native InstallBehavior, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static InstallBehavior valueOf(String str) {
            return (InstallBehavior) V0N.LJJJ(InstallBehavior.class, str);
        }

        InstallBehavior(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);

        public final int nativeCode;

        public static InstallStatus forNumber(int i) {
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i) {
                    return installStatus;
                }
            }
            StringBuilder sb = new StringBuilder(60);
            sb.append("Unexpected value for native InstallStatus, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static InstallStatus valueOf(String str) {
            return (InstallStatus) V0N.LJJJ(InstallStatus.class, str);
        }

        InstallStatus(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);

        public final int nativeCode;

        public static UserMessageType forNumber(int i) {
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i) {
                    return userMessageType;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native UserMessageType, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static UserMessageType valueOf(String str) {
            return (UserMessageType) V0N.LJJJ(UserMessageType.class, str);
        }

        UserMessageType(int i) {
            this.nativeCode = i;
        }
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) {
        throw new UnsupportedOperationException("Stub");
    }
}
