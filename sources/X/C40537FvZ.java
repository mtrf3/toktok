package X;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.FvZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40537FvZ extends AbsDownloadListener {
    public final /* synthetic */ DialogC25756A8y LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Context LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onCanceled(entity);
        this.LJLIL.dismiss();
        C5S1 c5s1 = new C5S1(this.LJLJJI);
        c5s1.LIZJ(R.string.rf3);
        c5s1.LJ();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onStart(entity);
        DialogC25756A8y dialogC25756A8y = this.LJLIL;
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "2395923257504307780")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onSuccessed(entity);
        this.LJLIL.dismiss();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(File.separator);
        LIZ.append(this.LJLJI);
        File file = new File(X1D.LIZIZ(LIZ));
        Context context = this.LJLJJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLJJI.getPackageName());
        LIZ2.append(".fileprovider");
        android.net.Uri androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, X1D.LIZIZ(LIZ2), file);
        String type = this.LJLJJI.getContentResolver().getType(androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, type);
        intent.addFlags(1);
        C16880lQ.LIZJ(this.LJLJJI, Intent.createChooser(intent, ""));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo entity, BaseException e) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(e, "e");
        super.onFailed(entity, e);
        this.LJLIL.dismiss();
        C5S1 c5s1 = new C5S1(this.LJLJJI);
        c5s1.LIZJ(R.string.rf3);
        c5s1.LJ();
    }

    public C40537FvZ(DialogC25756A8y dialogC25756A8y, String str, String str2, Context context) {
        this.LJLIL = dialogC25756A8y;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = context;
    }
}
