package X;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.ss.android.ugc.aweme.web.utils.UploadFileFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Ndy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59830Ndy implements InterfaceC61118Nyk {
    public final /* synthetic */ UploadFileFragment LIZ;
    public final /* synthetic */ ValueCallback<android.net.Uri[]> LIZIZ;
    public final /* synthetic */ WebChromeClient.FileChooserParams LIZJ;

    public C59830Ndy(UploadFileFragment uploadFileFragment, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.LIZ = uploadFileFragment;
        this.LIZIZ = valueCallback;
        this.LIZJ = fileChooserParams;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] grantResults, String[] strArr) {
        boolean z;
        String str;
        o.LJIIIIZZ(grantResults, "grantResults");
        for (int i : grantResults) {
            if (i != 0) {
                return;
            }
        }
        UploadFileFragment uploadFileFragment = this.LIZ;
        uploadFileFragment.LJLILLLLZI = this.LIZIZ;
        String[] acceptTypes = this.LIZJ.getAcceptTypes();
        o.LJIIIIZZ(acceptTypes, "fileChooserParams.acceptTypes");
        if (acceptTypes.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            str = "";
        } else {
            str = this.LIZJ.getAcceptTypes()[0];
        }
        uploadFileFragment.Dl(str, "");
    }
}
