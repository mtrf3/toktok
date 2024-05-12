package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Fs8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC40324Fs8<V> implements Callable {
    public final /* synthetic */ C68322mC<File> LJLIL;
    public final /* synthetic */ android.net.Uri LJLILLLLZI;
    public final /* synthetic */ DownloadFileMethod LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public CallableC40324Fs8(C68322mC<File> c68322mC, android.net.Uri uri, DownloadFileMethod downloadFileMethod, List<String> list, String str) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = uri;
        this.LJLJI = downloadFileMethod;
        this.LJLJJI = list;
        this.LJLJJL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileOutputStream fileOutputStream;
        Context context;
        ContentResolver contentResolver;
        ParcelFileDescriptor openFileDescriptor;
        if (this.LJLIL.element != null) {
            fileOutputStream = new FileOutputStream(this.LJLIL.element);
        } else {
            fileOutputStream = null;
            if (this.LJLILLLLZI != null && (context = this.LJLJI.mContextRef.get()) != null && (contentResolver = context.getContentResolver()) != null && (openFileDescriptor = contentResolver.openFileDescriptor(this.LJLILLLLZI, "w")) != null) {
                fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
            }
        }
        try {
            try {
                byte[] decode = Base64.decode(this.LJLJJI.get(1), 0);
                if (fileOutputStream != null) {
                    fileOutputStream.write(decode);
                }
                C38891fp.LJIIJJI(fileOutputStream);
                DownloadFileMethod downloadFileMethod = this.LJLJI;
                JSONObject jSONObject = new JSONObject();
                DownloadFileMethod downloadFileMethod2 = this.LJLJI;
                String str = this.LJLJJL;
                JSONObject LIZJ = C65232Piu.LIZJ("type", "success");
                if (str != null) {
                    LIZJ.put("path", str);
                }
                jSONObject.put("data", LIZJ);
                jSONObject.put("id", downloadFileMethod2.LJLJJLL);
                jSONObject.put("eventName", "download_status_change");
                downloadFileMethod.LJ(jSONObject);
                String str2 = this.LJLJJL;
                if (str2 != null) {
                    this.LJLJI.LIZJ(str2);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C38891fp.LJIIJJI(fileOutputStream);
            }
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            C38891fp.LJIIJJI(fileOutputStream);
            throw th;
        }
    }
}
