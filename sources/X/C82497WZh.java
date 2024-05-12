package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.structures.SAMICoreAudioBuffer;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WZh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82497WZh implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public static int LLIIIILZ;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C82495WZf LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;
    public String LJLJLJ;
    public SAMICoreBlock LJLJLLL;
    public SAMICoreAudioBuffer LJLL;
    public byte[] LJLLI;
    public float[] LJLLILLLL;
    public float[][] LJLLJ;
    public int LJLLL;
    public SAMICore LJLLLL;
    public boolean LJLLLLLL;
    public HandlerThread LJLZ;
    public HandlerC82496WZg LJZ;
    public boolean LJZI;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJZL;
    public final int LL;
    public final int LLD;
    public final long LLF;
    public final int LLFF;
    public final List<Integer> LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public final Handler LLI;
    public final ARunnableS50S0100000_14 LLIFFJFJJ;
    public volatile boolean LLII;

    static {
        TBT tbt = new TBT(C82497WZh.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    public final void LIZIZ() {
        if (this.LJZI) {
            return;
        }
        this.LJZI = true;
        this.LLII = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vc_stream_vad_");
        int i = LLIIIILZ;
        LLIIIILZ = i + 1;
        LIZ.append(i);
        HandlerThread handlerThread = new HandlerThread(X1D.LIZIZ(LIZ));
        this.LJLZ = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.LJLZ;
        if (handlerThread2 != null) {
            this.LJZ = new HandlerC82496WZg(this, handlerThread2.getLooper());
        } else {
            o.LJIJI("handlerThread");
            throw null;
        }
    }

    public final void LJ() {
        this.LLI.removeCallbacks(this.LLIFFJFJJ);
        this.LLFZ = false;
        this.LLII = false;
        LIZJ(3, null);
    }

    public final void LIZ() {
        LJ();
        LIZJ(6, null);
        if (!this.LJZI) {
            return;
        }
        HandlerC82496WZg handlerC82496WZg = this.LJZ;
        if (handlerC82496WZg != null) {
            handlerC82496WZg.post(new ARunnableS50S0100000_14(this, 166));
        } else {
            o.LJIJI("workerHandler");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public final void LIZLLL() {
        System.currentTimeMillis();
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 309);
        C68322mC c68322mC = new C68322mC();
        XBE.LJIIIIZZ.getClass();
        String findResourceUri = C84419XBf.LIZ().LIZLLL().findResourceUri(this.LJLJL);
        ?? r0 = findResourceUri;
        if (findResourceUri == null) {
            r0 = "";
        }
        c68322mC.element = r0;
        if (r0.length() == 0) {
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, new String[]{this.LJLJL}, new C82498WZi(this, aqS180S0100000_14, c68322mC));
            return;
        }
        try {
            String path = java.net.URI.create((String) c68322mC.element).getPath();
            if (path == null) {
                path = "";
            }
            this.LJLJLJ = path;
            aqS180S0100000_14.invoke(c68322mC.element);
        } catch (Throwable unused) {
            this.LJLJLJ = "";
            aqS180S0100000_14.invoke("");
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82497WZh(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJI = new C82495WZf(this);
        this.LJLJJI = 44100;
        this.LJLJJL = 2;
        this.LJLJJLL = 44100;
        this.LJLJL = "sami_vad";
        this.LJLJLJ = "";
        this.LJLLLL = new SAMICore();
        this.LJZL = C82499WZj.LJLIL;
        this.LL = 100;
        this.LLD = 1;
        this.LLF = 1000L;
        this.LLFF = 3;
        this.LLFFF = new ArrayList();
        this.LLFII = 0;
        this.LLI = new Handler(C16880lQ.LLJJJJ());
        this.LLIFFJFJJ = new ARunnableS50S0100000_14(this, 167);
    }

    public final void LIZJ(int i, Object obj) {
        if (!this.LJZI) {
            return;
        }
        HandlerC82496WZg handlerC82496WZg = this.LJZ;
        if (handlerC82496WZg != null) {
            Message obtain = Message.obtain();
            obtain.arg1 = i;
            if (obj != null) {
                obtain.obj = obj;
            }
            handlerC82496WZg.sendMessage(obtain);
            return;
        }
        o.LJIJI("workerHandler");
        throw null;
    }
}
