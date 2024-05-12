package com.facebook.login;

import X.ActivityC45651qj;
import X.C66418Q4w;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static ScheduledThreadPoolExecutor backgroundExecutor;
    public final String nameForLogging;
    public static final C66418Q4w Companion = new C66418Q4w();
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new IDCreatorS54S0000000_11(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJI() {
        return this.nameForLogging;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        o.LJIIIZ(parcel, "parcel");
        this.nameForLogging = "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIL(LoginClient.Request request) {
        ActivityC45651qj LJII = LJ().LJII();
        if (LJII == null || LJII.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(LJII.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.Jl(request);
        return 1;
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "device_auth";
    }
}
