package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import fjb.a;
import java.io.File;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.handlers.MusicReplaceFileHandler$handleData$2", f = "MusicReplaceFileHandler.kt", l = {24}, m = "invokeSuspend")
/* renamed from: X.6Ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158896Ll extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C161876Wx LJLILLLLZI;
    public final /* synthetic */ C158886Lk LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158896Ll(C161876Wx c161876Wx, C158886Lk c158886Lk, InterfaceC67352kd<? super C158896Ll> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c161876Wx;
        this.LJLJI = c158886Lk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C158896Ll(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<String> urlList;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "JDW: MusicReplacePipeline: Start ");
            getClass();
            LIZIZ.append(4);
            LIZIZ.append(' ');
            LIZIZ.append(LIZ());
            LIZIZ.append(" time=");
            LIZIZ.append((System.currentTimeMillis() - this.LJLJI.LJI) / 1000);
            H78.LJI(X1D.LIZIZ(LIZIZ));
            UrlModel urlModel = this.LJLJI.LJIIJ;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) ORZ.LJLLJ(urlList)) == null) {
                return Boolean.FALSE;
            }
            String LIZ = C158886Lk.LIZ(this.LJLJI);
            Context context = this.LJLJI.LIZJ;
            this.LJLIL = 1;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            File file = new File(LIZ);
            String parent = file.getParent();
            if (parent == null) {
                parent = "";
            }
            if (parent.length() == 0) {
                C3C5.m7constructorimpl("");
                c84654XKg.resumeWith("");
            } else {
                DownloadTask with = C84261X5d.with(context);
                with.url(str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(parent);
                LIZ2.append(File.separator);
                with.savePath(X1D.LIZIZ(LIZ2));
                with.name(file.getName());
                with.subThreadListener(new AbstractC167316hT() { // from class: X.6hG
                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        String str2;
                        StringBuilder LIZ3 = X1D.LIZ();
                        String str3 = null;
                        if (downloadInfo != null) {
                            str2 = downloadInfo.getSavePath();
                        } else {
                            str2 = null;
                        }
                        LIZ3.append(str2);
                        if (downloadInfo != null) {
                            str3 = downloadInfo.getName();
                        }
                        LIZ3.append(str3);
                        String LIZIZ2 = X1D.LIZIZ(LIZ3);
                        InterfaceC67352kd<String> interfaceC67352kd = c84654XKg;
                        C3C5.m7constructorimpl(LIZIZ2);
                        interfaceC67352kd.resumeWith(LIZIZ2);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        InterfaceC67352kd<String> interfaceC67352kd = c84654XKg;
                        C3C5.m7constructorimpl("");
                        interfaceC67352kd.resumeWith("");
                    }
                });
                with.download();
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str2 = (String) obj;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("JDW: Downloaded audio file path ");
        LIZ3.append(str2);
        H78.LJI(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("JDW: MusicReplacePipeline: End ");
        getClass();
        LIZ4.append(4);
        LIZ4.append(' ');
        LIZ4.append(LIZ());
        LIZ4.append(" time=");
        LIZ4.append((System.currentTimeMillis() - this.LJLJI.LJI) / 1000);
        H78.LJI(X1D.LIZIZ(LIZ4));
        if (str2.length() > 0) {
            this.LJLJI.LJIIJJI = str2;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
