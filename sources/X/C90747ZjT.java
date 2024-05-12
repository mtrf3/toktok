package X;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ZjT, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90747ZjT extends AbstractC90446Zec {
    public final TextView LIZIZ;
    public final List<String> LIZJ;

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        MediaMetadata mediaMetadata;
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ()) {
            return;
        }
        MediaStatus LJI = c90639Zhj.LJI();
        QH7.LJIIIIZZ(LJI);
        MediaInfo mediaInfo = LJI.zza;
        if (mediaInfo == null || (mediaMetadata = mediaInfo.zzf) == null) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaMetadata.LJJJJL(str)) {
                this.LIZIZ.setText(mediaMetadata.LJJJJZ(str));
                return;
            }
        }
        this.LIZIZ.setText("");
    }

    public C90747ZjT(TextView textView, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        this.LIZIZ = textView;
        arrayList.addAll(list);
    }
}
