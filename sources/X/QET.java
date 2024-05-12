package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ttnet.org.chromium.net.impl.JavaCronetEngine;
import defpackage.i0;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class QET extends AbstractC66659QEd {
    public final java.util.Map<String, String> LIZ = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List<String> LIZIZ = new ArrayList();
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public String LJ;
    public C66663QEh LJFF;
    public Executor LJI;
    public String LJII;
    public ReadableByteChannel LJIIIIZZ;
    public C61460OAe LJIIIZ;
    public String LJIIJ;
    public HttpURLConnection LJIIJJI;
    public QEZ LJIIL;

    @Override // X.QEE
    public final void LIZ(String str, String str2) {
    }

    @Override // X.QEE
    public final void LIZIZ() {
    }

    @Override // X.QEE
    public final String LJFF() {
        return "";
    }

    @Override // X.QEE
    public final void LJII(String str, String str2) {
    }

    @Override // X.QEE
    public final void LJIIIZ(int i) {
    }

    @Override // X.QEE
    public final void LJIIJ(long j) {
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILJJIL(int i) {
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILL(int i) {
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILLIIL(int i) {
    }

    @Override // X.AbstractC66659QEd
    public final void LJIIZILJ(int i) {
    }

    static {
        C16880lQ.LJLLJ(QET.class);
    }

    @Override // X.QEE
    public final void LIZLLL() {
        int andSet = this.LIZJ.getAndSet(8);
        if (andSet != 1 && andSet != 2 && andSet != 3 && andSet != 4 && andSet != 5) {
            return;
        }
        new ARunnableS47S0100000_11(this, 78);
        throw null;
    }

    @Override // X.QEE
    public final void LJ() {
        LJIL(3, 1, new ARunnableS47S0100000_11(this, 77));
    }

    @Override // X.QEE
    public final void LJIIJJI() {
        LJIL(0, 1, new ARunnableS47S0100000_11(this, 76));
    }

    public final void LJIJI() {
        int i = this.LIZJ.get();
        if (i == 0) {
        } else {
            throw new IllegalStateException(KMP.LJ("Request is already started. State is: ", i));
        }
    }

    public final void LJIJJLI() {
        if (this.LJFF != null && this.LIZLLL.compareAndSet(false, true)) {
            try {
                this.LJI.execute(new ARunnableS30S0200000_11(this, new C66667QEl(this), 27));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // X.QEE
    public final void LJI(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (byteBuffer.hasRemaining()) {
                LJIL(4, 5, new ARunnableS30S0200000_11(this, byteBuffer, 28));
                return;
            }
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }

    @Override // X.AbstractC66659QEd
    public final void LJIILIIL(String str) {
        LJIJI();
        if (str != null) {
            if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
                this.LJ = str;
                return;
            }
            throw new IllegalArgumentException(i0.LJFF("Invalid http method ", str));
        }
        throw new NullPointerException("Method is required.");
    }

    public final void LJIJJ(AbstractC66673QEr abstractC66673QEr) {
        int i;
        do {
            i = this.LIZJ.get();
            if (i != 0) {
                if (i == 6 || i == 7 || i == 8) {
                    return;
                }
            } else {
                throw new IllegalStateException("Can't enter error state before start");
            }
        } while (!this.LIZJ.compareAndSet(i, 6));
        new ARunnableS47S0100000_11(this, 78);
        throw null;
    }

    @Override // X.AbstractC66659QEd
    public final void LJIIL(String str, String str2) {
        LJIJI();
        int i = 0;
        while (true) {
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                    switch (charAt) {
                        case '\'':
                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        case ')':
                            break;
                        default:
                            switch (charAt) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case BaseNotice.CREATOR /* 62 */:
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (charAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                i++;
                                            }
                                            break;
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (((TreeMap) this.LIZ).containsKey(str)) {
                    ((TreeMap) this.LIZ).remove(str);
                }
                ((TreeMap) this.LIZ).put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException(C0ON.LIZJ("Invalid header ", str, "=", str2));
    }

    @Override // X.AbstractC66659QEd
    public final void LJIJ(AbstractC66664QEi abstractC66664QEi, Executor executor) {
        if (abstractC66664QEi != null) {
            if (((TreeMap) this.LIZ).containsKey("Content-Type")) {
                LJIJI();
                if (this.LJ == null) {
                    this.LJ = "POST";
                }
                this.LJFF = new C66663QEh(abstractC66664QEi);
                this.LJI = new ExecutorC66679QEx(executor);
                return;
            }
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    public final void LJIL(int i, int i2, Runnable runnable) {
        if (!this.LIZJ.compareAndSet(i, i2)) {
            int i3 = this.LIZJ.get();
            if (i3 == 8 || i3 == 6) {
                return;
            } else {
                throw new IllegalStateException(C48263Iwt.LIZLLL("Invalid state transition - expected ", i, " but was ", i3));
            }
        }
        runnable.run();
    }

    public QET(JavaCronetEngine javaCronetEngine, QER qer, Executor executor, String str, boolean z, int i, boolean z2, int i2) {
        if (str != null) {
            if (qer != null) {
                throw new NullPointerException("Executor is required");
            }
            throw new NullPointerException("Listener is required");
        }
        throw new NullPointerException("URL is required");
    }
}
