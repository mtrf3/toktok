package X;

import Y.ACallableS8S1000000_10;
import Y.ARunnableS16S0110000_10;
import Y.AgS1S1112000_10;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.CQrcodeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigma;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;

/* loaded from: classes11.dex */
public class OX2 implements IQRCodeScanner.OnEnigmaScanListener {
    public final /* synthetic */ ScanQRCodeActivityV2 LIZ;

    public OX2(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.LIZ = scanQRCodeActivityV2;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener
    public final void onFail(int i) {
        IQRCodeScanner iQRCodeScanner;
        OX5 ox5;
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
        if (scanQRCodeActivityV2.LJLJJLL != 5) {
            if (scanQRCodeActivityV2.LJZI && (ox5 = scanQRCodeActivityV2.LJLL) != null) {
                boolean z = scanQRCodeActivityV2.LJLLJ;
                C62114OZi c62114OZi = (C62114OZi) ox5;
                ActivityC86117Xqz activityC86117Xqz = c62114OZi.LIZ;
                if (activityC86117Xqz != null && !activityC86117Xqz.isDestroyed()) {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS16S0110000_10(c62114OZi, z, 0));
                    if (z) {
                        ((ScanQRCodeActivityV2) c62114OZi.LIZIZ).LLIIIZ();
                    }
                }
            }
            ScanQRCodeActivityV2 scanQRCodeActivityV22 = this.LIZ;
            if (scanQRCodeActivityV22.LJLLJ && (iQRCodeScanner = scanQRCodeActivityV22.LJLJLLL) != null) {
                iQRCodeScanner.stopPicScan();
            }
            this.LIZ.LJLLJ = false;
            return;
        }
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener
    public final void onSuccess(AVEnigmaResult aVEnigmaResult) {
        InterfaceC36907Ee7 LIZ;
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LIZ;
        if (scanQRCodeActivityV2.LJZI && !scanQRCodeActivityV2.LJLZ && scanQRCodeActivityV2.LJLL != null && aVEnigmaResult != null) {
            if (aVEnigmaResult.getResult() != null && aVEnigmaResult.getResult().length > 0) {
                this.LIZ.LJLZ = true;
                AVEnigma[] result = aVEnigmaResult.getResult();
                ScanQRCodeActivityV2 scanQRCodeActivityV22 = this.LIZ;
                if (scanQRCodeActivityV22.LJLJL) {
                    if (scanQRCodeActivityV22.LJLJJLL != 5) {
                        Intent intent = new Intent();
                        intent.putExtra("scan_code_result", result[0].getText());
                        intent.putExtra("scan_code_type", result[0].getType());
                        this.LIZ.setResult(-1, intent);
                        this.LIZ.finish();
                        return;
                    }
                    UriProtector.parse(result[0].getText());
                    throw null;
                }
                OX5 ox5 = scanQRCodeActivityV22.LJLL;
                boolean z = scanQRCodeActivityV22.LJLLJ;
                int type = result[0].getType();
                String text = result[0].getText();
                int i = this.LIZ.LJLJJLL;
                C62114OZi c62114OZi = (C62114OZi) ox5;
                if (!c62114OZi.LIZ.isDestroyed()) {
                    IEtDebugService iEtDebugService = (IEtDebugService) ServiceManager.get().getService(IEtDebugService.class);
                    if (i == 2) {
                        iEtDebugService.LIZJ(c62114OZi.LIZ, text);
                    } else {
                        iEtDebugService.LIZ();
                        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
                        if (localTestApi == null || !(true ^ (localTestApi instanceof DefaultLocalTestImpl)) || (LIZ = C36906Ee6.LIZ()) == null || !LIZ.LIZ()) {
                            if (CQrcodeService.LIZLLL().LIZIZ() && !TextUtils.isEmpty(text) && URLUtil.isValidUrl(text)) {
                                android.net.Uri parse = UriProtector.parse(text);
                                if (TextUtils.equals(UriProtector.getQueryParameter(parse, "ttam_open_outside"), "true")) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                                    ActivityC86117Xqz activityC86117Xqz = c62114OZi.LIZ;
                                    C78598Ut0.LJIJJ(intent2, activityC86117Xqz);
                                    activityC86117Xqz.startActivity(intent2);
                                }
                            }
                            if (CQrcodeService.LIZLLL().LIZJ()) {
                                C10K.LIZIZ(new ACallableS8S1000000_10(text, 0), C10K.LJI, null).LJ(new AgS1S1112000_10(type, i, c62114OZi, text, z, 0), C10K.LJIIIIZZ, null);
                            } else {
                                c62114OZi.LIZ(type, i, text, "", z);
                            }
                        } else {
                            c62114OZi.LIZ.finish();
                        }
                    }
                }
            } else {
                IQRCodeScanner iQRCodeScanner = this.LIZ.LJLJLLL;
                if (iQRCodeScanner != null) {
                    iQRCodeScanner.zoomByRatio(aVEnigmaResult.zoomFactor);
                }
            }
        }
        this.LIZ.LJLLJ = false;
    }
}
