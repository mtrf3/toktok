package X;

import android.app.Activity;
import android.content.Intent;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.ac5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94133ac5 implements HPI {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ File LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Activity activity = this.LIZ;
        File file = this.LIZIZ;
        int i = this.LIZJ;
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(activity.getPackageName());
            LIZ.append("_cke.provider");
            android.net.Uri androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(activity, X1D.LIZIZ(LIZ), file);
            o.LJIIIIZZ(androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, "getUriForFile(\n         …                        )");
            intent.putExtra("output", androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
            intent.addFlags(1);
            intent.addFlags(2);
            intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
            C16880lQ.LJFF(activity, i, intent);
        }
    }

    public C94133ac5(Activity activity, File file, int i) {
        this.LIZ = activity;
        this.LIZIZ = file;
        this.LIZJ = i;
    }
}
