package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OW0 implements InterfaceC61107NyZ {
    public final /* synthetic */ OW1 LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ Aweme LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            if (c164906da.LIZIZ != EnumC61598OFm.GRANTED) {
                OW1 ow1 = this.LIZ;
                if (ow1 != null) {
                    ow1.LIZ();
                    return;
                }
                return;
            }
        }
        OW1 ow12 = this.LIZ;
        if (ow12 == null) {
            return;
        }
        ow12.LIZIZ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public OW0(OW1 ow1, Activity activity, Aweme aweme, String str, String str2) {
        this.LIZ = ow1;
        this.LIZIZ = activity;
        this.LIZJ = aweme;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
