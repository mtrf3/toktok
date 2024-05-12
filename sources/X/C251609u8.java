package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.9u8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251609u8<T> implements InterfaceC86003Zc {
    public final /* synthetic */ C251629uA LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C251609u8(C251629uA c251629uA, String str, String str2, String str3) {
        this.LJLIL = c251629uA;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<String> interfaceC73573Su9) {
        C69022nK.LIZ(this.LJLIL.LIZ(this.LJLILLLLZI));
        String LIZJ = this.LJLIL.LIZJ(this.LJLILLLLZI, this.LJLJI);
        if (!TextUtils.isEmpty(LIZJ)) {
            File file = new File(LIZJ);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.9u9
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                C251609u8 c251609u8 = C251609u8.this;
                String LIZLLL = c251609u8.LJLIL.LIZLLL(c251609u8.LJLILLLLZI, c251609u8.LJLJI);
                File file2 = new File(LIZLLL);
                C251609u8 c251609u82 = C251609u8.this;
                C251629uA c251629uA = c251609u82.LJLIL;
                String str = c251609u82.LJLJI;
                c251629uA.getClass();
                if (!file2.exists() || !TextUtils.equals(C38352F3k.LIZIZ(file2), str)) {
                    InterfaceC73573Su9 interfaceC73573Su92 = c73433Srt;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("FIle in  ");
                    C251609u8.this.LJLIL.getClass();
                    LIZ.append(0);
                    LIZ.append(" doesnot match md5");
                    interfaceC73573Su92.onError(new Exception(X1D.LIZIZ(LIZ)));
                    return;
                }
                c73433Srt.onNext(LIZLLL);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException e) {
                o.LJIIIZ(e, "e");
                c73433Srt.onError(e);
            }
        };
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            String str = this.LJLJJI;
            String LIZ = this.LJLIL.LIZ(this.LJLILLLLZI);
            C251629uA c251629uA = this.LJLIL;
            String str2 = this.LJLJI;
            c251629uA.getClass();
            interfaceC247459nR.LJI(str, LIZ, C251629uA.LIZIZ(str2, true), "legacy_lottie_file", absDownloadListener, 0, false);
        }
    }
}
