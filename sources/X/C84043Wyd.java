package X;

import com.ss.android.medialib.model.Enigma;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.model.TdPoint;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigma;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVTdPoint;
import kotlin.jvm.internal.o;

/* renamed from: X.Wyd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84043Wyd implements InterfaceC84039WyZ {
    public final /* synthetic */ C83758Wu2 LIZ;

    public C84043Wyd(C83758Wu2 c83758Wu2) {
        this.LIZ = c83758Wu2;
    }

    @Override // X.InterfaceC84039WyZ
    public final void LIZ(EnigmaResult enigmaResult) {
        AVTdPoint[] aVTdPointArr;
        IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener = this.LIZ.LIZIZ;
        if (onEnigmaScanListener != null) {
            o.LJI(onEnigmaScanListener);
            AVEnigmaResult aVEnigmaResult = null;
            if (enigmaResult != null) {
                AVEnigmaResult aVEnigmaResult2 = new AVEnigmaResult();
                aVEnigmaResult2.zoomFactor = enigmaResult.zoomFactor;
                Enigma[] result = enigmaResult.getResult();
                if (result != null) {
                    AVEnigma[] aVEnigmaArr = new AVEnigma[result.length];
                    int length = result.length;
                    for (int i = 0; i < length; i++) {
                        AVEnigma aVEnigma = new AVEnigma();
                        aVEnigma.setText(result[i].getText());
                        aVEnigma.setType(result[i].getType());
                        TdPoint[] points = result[i].getPoints();
                        if (points == null) {
                            aVTdPointArr = null;
                        } else {
                            aVTdPointArr = new AVTdPoint[points.length];
                            int length2 = points.length;
                            for (int i2 = 0; i2 < length2; i2++) {
                                AVTdPoint aVTdPoint = new AVTdPoint();
                                aVTdPoint.setX(points[i2].getX());
                                aVTdPoint.setY(points[i2].getY());
                                aVTdPointArr[i2] = aVTdPoint;
                            }
                        }
                        aVEnigma.setPoints(aVTdPointArr);
                        aVEnigmaArr[i] = aVEnigma;
                    }
                    aVEnigmaResult2.setResult(aVEnigmaArr);
                }
                aVEnigmaResult = aVEnigmaResult2;
            }
            onEnigmaScanListener.onSuccess(aVEnigmaResult);
        }
    }

    @Override // X.InterfaceC84039WyZ
    public final void onFail(int i) {
        IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener = this.LIZ.LIZIZ;
        if (onEnigmaScanListener != null) {
            o.LJI(onEnigmaScanListener);
            onEnigmaScanListener.onFail(i);
        }
    }
}
