package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.IResultListener;
import com.google.android.gms.cast.MediaError;

/* renamed from: X.Zkq, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final /* synthetic */ class C90832Zkq implements InterfaceC67740QiG {
    public final /* synthetic */ C90506Zfa LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ IResultListener LIZJ;

    public /* synthetic */ C90832Zkq(C90506Zfa c90506Zfa, String str, IResultListener iResultListener) {
        this.LIZ = c90506Zfa;
        this.LIZIZ = str;
        this.LIZJ = iResultListener;
    }

    @Override // X.InterfaceC67740QiG
    public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
        int intValue;
        C90506Zfa c90506Zfa = this.LIZ;
        String str = this.LIZIZ;
        IResultListener iResultListener = this.LIZJ;
        c90506Zfa.getClass();
        MediaError LJJJJI = ((InterfaceC90638Zhi) interfaceC67754QiU).LJJJJI();
        if (LJJJJI == null) {
            CastLogger castLogger = c90506Zfa.LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(", onSuccess");
            castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
            iResultListener.onSuccess();
            return;
        }
        Integer num = LJJJJI.zzd;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        CastLogger castLogger2 = c90506Zfa.LJIJJLI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(", onFail, errorCode: ");
        LIZ2.append(intValue);
        LIZ2.append(", reason: ");
        LIZ2.append(LJJJJI.zze);
        castLogger2.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
        if (intValue == 999) {
            iResultListener.onSuccess();
        } else {
            iResultListener.onFail(26300000, LJJJJI.zze);
        }
    }
}
