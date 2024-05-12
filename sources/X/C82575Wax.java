package X;

import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import java.io.File;
import java.util.List;

/* renamed from: X.Wax, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82575Wax implements LDK {
    public final /* synthetic */ C82573Wav LIZ;
    public final /* synthetic */ File LIZIZ;
    public final /* synthetic */ Location LIZJ;
    public final /* synthetic */ List<List<Coordinate>> LIZLLL;

    @Override // X.LDK
    public final void onComplete() {
        C82573Wav c82573Wav = this.LIZ;
        if (c82573Wav.LLIILII) {
            return;
        }
        c82573Wav.LLIILII = true;
        c82573Wav.LLJJIJI(this.LIZIZ, this.LIZLLL, this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82575Wax(C82573Wav c82573Wav, File file, Location location, List<? extends List<Coordinate>> list) {
        this.LIZ = c82573Wav;
        this.LIZIZ = file;
        this.LIZJ = location;
        this.LIZLLL = list;
    }
}
