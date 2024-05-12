package X;

import android.os.AsyncTask;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.hybrid.WebviewNativeImageLoadingSetting;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class COZ implements InterfaceC31244COa {
    @Override // X.InterfaceC31244COa
    public final WebResourceResponse LIZ(android.net.Uri uri, WebView webView) {
        String path;
        String str;
        PipedInputStream pipedInputStream;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(webView, "webView");
        if (!WebviewNativeImageLoadingSetting.INSTANCE.getValue() || (path = uri.getPath()) == null) {
            return null;
        }
        if (ujb.o.LJJJJ(path, "jpg", false) || ujb.o.LJJJJ(path, "jpeg", false)) {
            str = "image/jpeg";
        } else if (ujb.o.LJJJJ(path, "png", false)) {
            str = "image/png";
        } else if (ujb.o.LJJJJ(path, "gif", false)) {
            str = "image/gif";
        } else {
            if (!ujb.o.LJJJJ(path, "ico", false)) {
                return null;
            }
            str = "image/x-icon";
        }
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            pipedInputStream = new PipedInputStream(pipedOutputStream);
            W5I.LIZ().LJFF(W5P.LIZLLL(uri).LIZ(), null).LJ(new IHD<C81392Vwy<InterfaceC81378Vwk>>() { // from class: X.1UP
                @Override // X.IHD
                public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
                }

                @Override // X.IHD
                public final void LIZ(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        w4w.close();
                        throw th;
                    }
                    w4w.close();
                }

                @Override // X.IHD
                public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        abstractC48384Iyq.close();
                        throw th;
                    }
                    abstractC48384Iyq.close();
                }

                @Override // X.IHD
                public final void LIZLLL(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
                    C81392Vwy<InterfaceC81378Vwk> result = w4w.getResult();
                    if (result != null) {
                        InterfaceC81378Vwk LJI = result.LJI();
                        byte[] bArr = new byte[LJI.size()];
                        LJI.read(0, bArr, 0, LJI.size());
                        try {
                            pipedOutputStream.write(bArr);
                            pipedOutputStream.close();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            w4w.close();
                            throw th;
                        }
                        w4w.close();
                    }
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
        } catch (IOException unused) {
            pipedInputStream = null;
        }
        if (pipedInputStream == null) {
            return null;
        }
        return new WebResourceResponse(str, "", pipedInputStream);
    }
}
