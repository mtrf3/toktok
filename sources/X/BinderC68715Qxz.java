package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzi;
import com.google.android.gms.internal.wallet.zzk;
import com.google.android.gms.internal.wallet.zzm;
import com.google.android.gms.internal.wallet.zzo;
import com.google.android.gms.internal.wallet.zzq;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzau;

/* renamed from: X.Qxz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class BinderC68715Qxz extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC68715Qxz() {
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC68714Qxy abstractBinderC68714Qxy = (AbstractBinderC68714Qxy) this;
        boolean z = false;
        switch (i) {
            case 1:
                parcel.readInt();
                C67943QlX.LIZ(parcel, MaskedWallet.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 2:
                parcel.readInt();
                C67943QlX.LIZ(parcel, FullWallet.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 3:
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                abstractBinderC68714Qxy.LLLLLL(readInt, z);
                return true;
            case 4:
                parcel.readInt();
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                parcel.readInt();
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 7:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, zzi.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 8:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 9:
                Status status = (Status) C67943QlX.LIZ(parcel, Status.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                abstractBinderC68714Qxy.LLILL(status, z);
                return true;
            case 10:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, zzk.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 12:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, zzau.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 14:
                Status status2 = (Status) C67943QlX.LIZ(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) C67943QlX.LIZ(parcel, PaymentData.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                abstractBinderC68714Qxy.LLIILZL(status2, paymentData);
                return true;
            case 15:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, zzq.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, zzm.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 17:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, zzo.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 18:
                parcel.readInt();
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
            case 19:
                C67943QlX.LIZ(parcel, Status.CREATOR);
                C67943QlX.LIZ(parcel, PaymentCardRecognitionIntentResponse.CREATOR);
                C67943QlX.LIZ(parcel, Bundle.CREATOR);
                return true;
        }
    }
}
