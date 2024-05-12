package X;

import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.common.bean.chromecast.MessageBean;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.GsonUtils;

/* renamed from: X.Zkt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90835Zkt implements ZYU<C90613ZhJ> {
    public final /* synthetic */ C90506Zfa LIZ;

    public C90835Zkt(C90506Zfa c90506Zfa) {
        this.LIZ = c90506Zfa;
    }

    public final void LIZIZ(C90613ZhJ c90613ZhJ) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onApplicationConnected");
        final C90506Zfa c90506Zfa = this.LIZ;
        c90506Zfa.LJIIIIZZ = c90613ZhJ;
        if (c90613ZhJ != null) {
            try {
                InterfaceC90219Zax interfaceC90219Zax = new InterfaceC90219Zax() { // from class: X.Zkr
                    @Override // X.InterfaceC90219Zax
                    public final void LIZ(String str) {
                        ISinkDeviceInfoListener iSinkDeviceInfoListener;
                        C90506Zfa c90506Zfa2 = C90506Zfa.this;
                        CastLogger castLogger = c90506Zfa2.LJIJJLI;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("onMessageReceived message:");
                        LIZ.append(str);
                        castLogger.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
                        if (!TextUtils.isEmpty(str) && !str.startsWith("get")) {
                            MessageBean messageBean = (MessageBean) GsonUtils.fromJsonIgnoreException(str, MessageBean.class);
                            CastLogger castLogger2 = c90506Zfa2.LJIJJLI;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("onMessageReceived messageBean:");
                            LIZ2.append(messageBean);
                            castLogger2.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
                            if (messageBean != null) {
                                int i = messageBean.type;
                                if (i != 1 && i != 2) {
                                    return;
                                }
                                SinkDeviceInfo sinkDeviceInfo = (SinkDeviceInfo) GsonUtils.fromJsonIgnoreException(messageBean.content, SinkDeviceInfo.class);
                                CastLogger castLogger3 = c90506Zfa2.LJIJJLI;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("onMessageReceived sinkDeviceInfo:");
                                LIZ3.append(sinkDeviceInfo);
                                castLogger3.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ3));
                                if (sinkDeviceInfo == null) {
                                    return;
                                }
                                ContextManager.getDeviceInfoManager(c90506Zfa2.LJIJJ).saveSinkDeviceInfo(sinkDeviceInfo);
                                ISinkDeviceInfoListener iSinkDeviceInfoListener2 = c90506Zfa2.LJJIIZ;
                                if (iSinkDeviceInfoListener2 == null || messageBean.type != 2) {
                                    return;
                                }
                                iSinkDeviceInfoListener2.onSuccess(sinkDeviceInfo);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.isEmpty(c90506Zfa2.LJJIIZI) || !str.contains(c90506Zfa2.LJJIIZI) || (iSinkDeviceInfoListener = c90506Zfa2.LJJIIZ) == null) {
                            return;
                        }
                        iSinkDeviceInfoListener.onFail(1702000001, "Unsupported Device");
                    }
                };
                QH7.LJ("Must be called from the main thread.");
                C90880Zlc c90880Zlc = c90613ZhJ.LJII;
                if (c90880Zlc != null) {
                    c90880Zlc.LJIIL("urn:x-cast:com.byted.cast.private.channel", interfaceC90219Zax);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LIZ.LJIIIIZZ(false);
        C90506Zfa c90506Zfa2 = this.LIZ;
        if (c90506Zfa2.LIZIZ != null && !c90506Zfa2.LJJIJ) {
            this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onConnect");
            this.LIZ.LJJIJ = true;
            C90506Zfa c90506Zfa3 = this.LIZ;
            InterfaceC90502ZfW interfaceC90502ZfW = c90506Zfa3.LIZIZ;
            ZY4 zy4 = c90506Zfa3.LIZLLL;
            C90779Zjz c90779Zjz = (C90779Zjz) interfaceC90502ZfW;
            c90779Zjz.getClass();
            ServiceInfo serviceInfo = new ServiceInfo();
            if (zy4 != null) {
                serviceInfo.castId = zy4.LIZJ;
                serviceInfo.name = zy4.LIZLLL;
                serviceInfo.port = -1;
                serviceInfo.portMirror = -1;
                serviceInfo.protocols = "ChromeCast";
                serviceInfo.types = "ChromeCast";
                serviceInfo.isSupportPlayList = true;
            }
            CastLogger castLogger = c90779Zjz.LIZIZ.LJII;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ChromeCast onConnect serviceInfo:");
            LIZ.append(serviceInfo);
            castLogger.d("ChromeCastSourceWrapper", X1D.LIZIZ(LIZ));
            c90779Zjz.LIZ.onConnect(serviceInfo, 0);
        }
    }

    @Override // X.ZYU
    public final void LIZJ(C90613ZhJ c90613ZhJ) {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onSessionStarting");
    }

    public final void LIZLLL(int i) {
        int i2;
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onApplicationDisconnected");
        C90506Zfa c90506Zfa = this.LIZ;
        c90506Zfa.LJIIIIZZ = null;
        c90506Zfa.getClass();
        C90506Zfa c90506Zfa2 = this.LIZ;
        c90506Zfa2.LJIIIZ = null;
        if (c90506Zfa2.LIZIZ != null) {
            c90506Zfa2.LJIJJLI.d("ChromeCastSourceImpl", "onDisConnect");
            if (i == 26200002) {
                i2 = 200;
            } else {
                i2 = 201;
            }
            C90506Zfa c90506Zfa3 = this.LIZ;
            ((C90779Zjz) c90506Zfa3.LIZIZ).LIZ(c90506Zfa3.LIZLLL, i2, i);
        }
        this.LIZ.LJ(null);
    }

    @Override // X.ZYU
    public final void LJFF(C90613ZhJ c90613ZhJ) {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onSessionEnding");
    }

    @Override // X.ZYU
    public final void LIZ(C90613ZhJ c90613ZhJ, int i) {
        CastLogger castLogger = this.LIZ.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionStartFailed, error: ");
        LIZ.append(i);
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        LIZLLL(26200001);
    }

    @Override // X.ZYU
    public final void LJII(C90613ZhJ c90613ZhJ, int i) {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onSessionEnded");
        LIZLLL(26200002);
    }

    @Override // X.ZYU
    public final void LJIIIIZZ(C90613ZhJ c90613ZhJ, int i) {
        CastLogger castLogger = this.LIZ.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionResumeFailed, error: ");
        LIZ.append(i);
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        LIZLLL(26200004);
    }

    @Override // X.ZYU
    public final void LJIIIZ(C90613ZhJ c90613ZhJ, String str) {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onSessionResuming");
    }

    @Override // X.ZYU
    public final void LJIIL(C90613ZhJ c90613ZhJ, boolean z) {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onSessionResumed");
        LIZIZ(c90613ZhJ);
    }

    @Override // X.ZYU
    public final void LJIILIIL(C90613ZhJ c90613ZhJ, String str) {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onSessionStarted");
        LIZIZ(c90613ZhJ);
    }

    @Override // X.ZYU
    public final void LJIILJJIL(C90613ZhJ c90613ZhJ, int i) {
        this.LIZ.LJIJJLI.d("ChromeCastSourceImpl", "onSessionSuspended");
    }
}
