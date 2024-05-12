package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NFv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59059NFv implements InterfaceC48720JAe {
    public static final /* synthetic */ int LIZJ = 0;
    public C39289FbR LIZ;
    public AbstractC59064NGa LIZIZ;

    @Override // X.InterfaceC48720JAe
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC48720JAe
    public final boolean LIZJ(Aweme aweme) {
        AdDescriptiveCTAStruct adDescriptiveCTA;
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && adDescriptiveCTA.getLeftContainer() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC48720JAe
    public final void LIZ(Context context, Aweme aweme) {
        if (LIZJ(aweme)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("remove cache ,cache key = ");
            LIZ.append(C59057NFt.LIZ(aweme));
            C58582Rq.LIZ(X1D.LIZIZ(LIZ), "feed_fyp_descriptive_left_container");
            if (this.LIZIZ == null) {
                this.LIZIZ = AdHybridContainerManager.LIZLLL().LIZJ(C59057NFt.LIZJ(context, aweme), C59057NFt.LIZIZ(context, aweme));
            }
            AbstractC59064NGa abstractC59064NGa = this.LIZIZ;
            if (abstractC59064NGa != null) {
                abstractC59064NGa.LJIJI(C59057NFt.LIZ(aweme));
            }
        }
    }

    @Override // X.InterfaceC48720JAe
    public final void LIZIZ(Context context, Aweme aweme) {
        C48721JAf.LIZJ(context, this, aweme);
    }

    @Override // X.InterfaceC48720JAe
    public final void LIZLLL(Context context, Aweme aweme) {
        C48721JAf.LIZ(context, this, aweme);
    }

    @Override // X.InterfaceC48720JAe
    public final void LJFF(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        if (this.LIZ == null) {
            this.LIZ = new C39289FbR();
        }
        C39289FbR c39289FbR = this.LIZ;
        if (c39289FbR != null) {
            c39289FbR.LIZIZ();
        }
        this.LIZIZ = AdHybridContainerManager.LIZLLL().LIZIZ(C59057NFt.LIZJ(context, aweme), C59057NFt.LIZIZ(context, aweme));
    }

    @Override // X.InterfaceC48720JAe
    public final void LJI(int i, Context context, List list) {
        C48721JAf.LIZIZ(this, context, list, i);
    }

    public final void LJII(int i, Context context, List items) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(items, "items");
        if (i < 0 || i >= items.size() || ((Aweme) ListProtector.get(items, i)).isAd()) {
            return;
        }
        Iterator it = items.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (LIZJ(aweme) && i2 + 6 < i) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("remove cache ,cache key = ");
                LIZ.append(C59057NFt.LIZ(aweme));
                C58582Rq.LIZ(X1D.LIZIZ(LIZ), "feed_fyp_descriptive_left_container");
                if (this.LIZIZ == null) {
                    this.LIZIZ = AdHybridContainerManager.LIZLLL().LIZJ(C59057NFt.LIZJ(context, aweme), C59057NFt.LIZIZ(context, aweme));
                }
                AbstractC59064NGa abstractC59064NGa = this.LIZIZ;
                if (abstractC59064NGa != null) {
                    abstractC59064NGa.LJIJI(C59057NFt.LIZ(aweme));
                }
            }
            i2++;
        }
    }
}
