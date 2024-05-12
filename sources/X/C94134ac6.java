package X;

import android.content.Intent;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.ac6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94134ac6 implements HPI {
    public final /* synthetic */ Fragment LIZ;
    public final /* synthetic */ File LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Fragment fragment = this.LIZ;
        File file = this.LIZIZ;
        int i = this.LIZJ;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null && intent.resolveActivity(mo49getActivity.getPackageManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(mo49getActivity.getPackageName());
            LIZ.append("_cke.provider");
            android.net.Uri androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(mo49getActivity, X1D.LIZIZ(LIZ), file);
            o.LJIIIIZZ(androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, "getUriForFile(\n         …                        )");
            intent.putExtra("output", androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
            intent.addFlags(1);
            intent.addFlags(2);
            intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
            C16880lQ.LJII(fragment, intent, i);
        }
    }

    public C94134ac6(Fragment fragment, File file, int i) {
        this.LIZ = fragment;
        this.LIZIZ = file;
        this.LIZJ = i;
    }
}
