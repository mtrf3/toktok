package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hse, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45452Hse extends AbstractC48314Ixi {
    public final Context LIZ;

    public C45452Hse(Context context) {
        this.LIZ = context;
    }

    @Override // X.AbstractC48314Ixi
    public final void LIZJ(I1Z i1z, String str, String destFilePath) {
        OSZ osz;
        o.LJIIIZ(destFilePath, "destFilePath");
        String str2 = File.separator;
        o.LJIIIIZZ(str2, "File.separator");
        int LJJLIIJ = s.LJJLIIJ(destFilePath, str2, 6);
        if (LJJLIIJ > 0 && LJJLIIJ < destFilePath.length()) {
            String substring = destFilePath.substring(0, LJJLIIJ);
            o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring2 = destFilePath.substring(LJJLIIJ + 1);
            o.LJIIIIZZ(substring2, "(this as java.lang.String).substring(startIndex)");
            osz = new OSZ(substring, substring2);
        } else {
            osz = new OSZ(destFilePath, "");
        }
        DownloadTask with = C84261X5d.with(this.LIZ);
        with.url(str);
        with.savePath((String) osz.getFirst());
        with.name((String) osz.getSecond());
        with.monitorScene("creativex_file_resource");
        with.subThreadListener(new C45453Hsf(i1z, str, destFilePath));
        with.download();
    }
}
