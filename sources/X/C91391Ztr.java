package X;

import Y.IDfS293S0100000_29;
import Y.IDhS109S0100000_29;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztr, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91391Ztr extends AbstractC91187ZqZ {
    public boolean LIZIZ;
    public boolean LIZJ = true;
    public boolean LIZLLL;
    public final /* synthetic */ C91495ZvX LJ;

    @Override // X.AbstractC91187ZqZ
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    public C91391Ztr(C91495ZvX c91495ZvX) {
        this.LJ = c91495ZvX;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Long] */
    @Override // X.AbstractC91187ZqZ
    public final AbstractC73672Svk<List<InterfaceC91296ZsK>> LIZIZ(String str) {
        List<String> expiredPreviewFullClipIds;
        AbstractC73672Svk LJJIII;
        String unPlayedClipIds = str;
        o.LJIIIZ(unPlayedClipIds, "unPlayedClipIds");
        String str2 = this.LJ.LJLJLLL.LJLJJLL;
        boolean z = true;
        if (str2.length() > 0 && this.LIZJ) {
            this.LIZLLL = true;
            DspDetailListResponse LIZIZ = C91208Zqu.LIZ.LIZIZ(str2);
            if (LIZIZ != null) {
                this.LJ.LIZJ(LIZIZ);
                return AbstractC73672Svk.LJJIJIL(this.LJ.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new IDhS109S0100000_29(this, 5));
            }
        }
        this.LIZIZ = true;
        C68322mC c68322mC = new C68322mC();
        YBM.LIZ.getClass();
        if (YBM.LIZIZ()) {
            expiredPreviewFullClipIds = ExpiredPlayableManager.INSTANCE.getExpiredFullClipIds();
        } else {
            ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
            expiredPreviewFullClipIds = expiredPlayableManager.getExpiredPreviewFullClipIds();
            if (expiredPreviewFullClipIds.isEmpty()) {
                expiredPreviewFullClipIds = expiredPlayableManager.getExpiredFullClipIds();
            }
        }
        if (expiredPreviewFullClipIds.size() > 1000) {
            expiredPreviewFullClipIds = expiredPreviewFullClipIds.subList(0, 1000);
        }
        String LLD = ORZ.LLD(expiredPreviewFullClipIds, ",", null, null, null, 62);
        C34K c34k = new C34K();
        if (this.LJ.LJLILLLLZI == 0) {
            c68322mC.element = Long.valueOf(SystemClock.elapsedRealtime());
            if (this.LJ.LJLJJL.length() <= 0 || ExpiredPlayableManager.INSTANCE.isPlayableExpiredTodayByClipId(this.LJ.LJLJJL)) {
                z = false;
            }
            c34k.element = z;
            if (this.LIZJ) {
                unPlayedClipIds = "";
            }
            LJJIII = C91207Zqt.LIZ().LJJIII(new C91389Ztp(LLD, this.LJ, this, str2, unPlayedClipIds), false);
        } else {
            LJJIII = C91207Zqt.LIZ().LJJIII(new C91390Ztq(LLD, this.LJ, this, str2, unPlayedClipIds), false);
        }
        this.LJ.LJLJJLL = false;
        return LJJIII.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new C91387Ztn(c68322mC, this, this.LJ, c34k)).LJJJJ(C91388Zto.LJLIL).LJIJJLI(new IDfS293S0100000_29(this, 4)).LJIJJ(new IDfS293S0100000_29(this, 5));
    }
}
