package com.google.android.gms.wallet.callback;

import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.QXX;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes12.dex */
public abstract class BasePaymentDataCallbacksService extends zzd {
    public abstract QXX LIZIZ();

    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.google.android.gms.wallet.callback.zzd
    public final void LIZ(CallbackInput callbackInput) {
        if (callbackInput.zza != 0) {
            LIZIZ();
            int i = callbackInput.zza;
            if (i != 1) {
                if (i == 2) {
                    Parcelable.Creator<IntermediatePaymentData> creator = IntermediatePaymentData.CREATOR;
                    byte[] bArr = callbackInput.LJLIL;
                    if (bArr == null) {
                        throw null;
                    }
                    throw null;
                }
                throw new IllegalStateException("Unknown Callback Types");
            }
            Parcelable.Creator<PaymentData> creator2 = PaymentData.CREATOR;
            byte[] bArr2 = callbackInput.LJLIL;
            if (bArr2 == null) {
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Callback Types must be set");
    }

    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service
    public final IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
