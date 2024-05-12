package X;

import X.C157816Hh;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83303Wmh<T extends C157816Hh> extends V8F {
    public final AbstractC83312Wmq<T, Void> LJLILLLLZI;
    public final InterfaceC88471Ynr<T, InterfaceC67352kd<? super C76800UCe>, Object> LJLJI;
    public final InterfaceC83286WmQ<T, Void> LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        XKX.LIZLLL((InterfaceC70422pa) this.LJLJJL.getValue(), null, null, new C83306Wmk(this, null), 3);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        InterfaceC83307Wml interfaceC83307Wml;
        this.LJLILLLLZI.LIZ(4);
        AbstractC83312Wmq<T, Void> abstractC83312Wmq = this.LJLILLLLZI;
        int i = -1;
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        new IZ3(baseException, i, str);
        abstractC83312Wmq.getClass();
        this.LJLJJI.LIZ(this.LJLILLLLZI);
        T t = this.LJLILLLLZI.LJ;
        if (t instanceof C157776Hd) {
            InterfaceC83307Wml interfaceC83307Wml2 = C69E.LIZJ;
            if (interfaceC83307Wml2 != null) {
                interfaceC83307Wml2.LIZ(t.effect.getEffectId(), baseException);
                return;
            }
            return;
        }
        if (!(t instanceof C157916Hr) || (interfaceC83307Wml = C69E.LIZJ) == null) {
            return;
        }
        interfaceC83307Wml.LIZLLL(t.effect.getEffectId(), baseException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83303Wmh(AbstractC83312Wmq task, InterfaceC88471Ynr interfaceC88471Ynr, C83310Wmo c83310Wmo) {
        super(0);
        o.LJIIIZ(task, "task");
        this.LJLILLLLZI = task;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = c83310Wmo;
        this.LJLJJL = C221108m2.LIZIZ(C78515Urf.LJLIL);
    }
}
