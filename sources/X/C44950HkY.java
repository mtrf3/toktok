package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* renamed from: X.HkY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44950HkY extends C44951HkZ {
    public final /* synthetic */ Aweme LJ;
    public final /* synthetic */ SharePackage LJFF;
    public final /* synthetic */ InterfaceC62225ObV LJI;
    public final /* synthetic */ Context LJII;
    public final /* synthetic */ int LJIIIIZZ;

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
        String str;
        Bundle bundle;
        Aweme aweme = this.LJ;
        if (aweme != null) {
            SharePackage sharePackage = this.LJFF;
            C44906Hjq.LIZ(new Bundle(), aweme, sharePackage);
            if (sharePackage == null || (bundle = sharePackage.extras) == null || (str = bundle.getString("enter_from")) == null) {
                str = "";
            }
            C225298sn.LIZ(0, 1, aweme, str);
        }
    }

    @Override // X.C44951HkZ, X.InterfaceC43172Gwy
    public final void LIZJ(String str) {
        String str2;
        super.LIZJ(str);
        if (str != null) {
            InterfaceC62225ObV interfaceC62225ObV = this.LJI;
            Context context = this.LJII;
            SharePackage sharePackage = this.LJFF;
            int i = this.LJIIIIZZ;
            Aweme aweme = this.LJ;
            C62233Obd.LIZLLL(interfaceC62225ObV, str, context, sharePackage, i);
            if (aweme != null) {
                C44906Hjq.LIZ(new Bundle(), aweme, sharePackage);
                Bundle bundle = sharePackage.extras;
                if (bundle == null || (str2 = bundle.getString("enter_from")) == null) {
                    str2 = "";
                }
                C225298sn.LIZ(1, 1, aweme, str2);
            }
        }
    }

    @Override // X.C44951HkZ, X.InterfaceC43172Gwy
    public final void LIZLLL(DownloadInfo downloadInfo) {
        String str;
        Bundle bundle;
        super.LIZLLL(downloadInfo);
        Aweme aweme = this.LJ;
        if (aweme != null) {
            SharePackage sharePackage = this.LJFF;
            Bundle bundle2 = new Bundle();
            C44906Hjq.LIZ(bundle2, aweme, sharePackage);
            if (sharePackage == null || (bundle = sharePackage.extras) == null || (str = bundle.getString("enter_from")) == null) {
                str = "";
            }
            C193657ir.LIZJ(aweme, str, "download_to_share", "", "", "", bundle2, null, null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44950HkY(Activity activity, Aweme aweme, PhotoSharePackage photoSharePackage, InterfaceC62225ObV interfaceC62225ObV, Context context, int i) {
        super(activity, aweme, photoSharePackage);
        this.LJ = aweme;
        this.LJFF = photoSharePackage;
        this.LJI = interfaceC62225ObV;
        this.LJII = context;
        this.LJIIIIZZ = i;
    }
}
