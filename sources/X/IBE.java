package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class IBE extends C46215IBv {
    public final /* synthetic */ IBD LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ JSONArray LJLJI;
    public final /* synthetic */ ICT LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            IBD ibd = this.LJLIL;
            int i = this.LJLILLLLZI;
            JSONArray jSONArray = this.LJLJI;
            ICT ict = this.LJLJJI;
            ICA ica = ibd.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(downloadInfo.getSavePath());
            LIZ.append(downloadInfo.getName());
            X1D.LIZIZ(LIZ);
            ica.LIZ();
            if (i == jSONArray.length() - 1 && ict != null) {
                ict.onSuccess();
            }
        }
    }

    public IBE(IBD ibd, String str, int i, JSONArray jSONArray, ICT ict) {
        this.LJLIL = ibd;
        this.LJLILLLLZI = i;
        this.LJLJI = jSONArray;
        this.LJLJJI = ict;
    }
}
