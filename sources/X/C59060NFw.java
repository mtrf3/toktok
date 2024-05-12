package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NFw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59060NFw implements InterfaceC48720JAe {
    public C39289FbR LIZ;
    public AbstractC59064NGa LIZIZ;

    @Override // X.InterfaceC48720JAe
    public final boolean LJ() {
        return C58562Ro.LIZ();
    }

    @Override // X.InterfaceC48720JAe
    public final boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C63081OpJ.LJLLL(aweme);
    }

    @Override // X.InterfaceC48720JAe
    public final void LIZ(Context context, Aweme aweme) {
        if (C63081OpJ.LJLLL(aweme)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("remove cache ,cache key = ");
            LIZ.append(aweme.getAid());
            C58582Rq.LIZ(X1D.LIZIZ(LIZ), "AdHybridSuperLikePreRender");
            if (this.LIZIZ == null) {
                this.LIZIZ = AdHybridContainerManager.LIZLLL().LIZJ(C59052NFo.LIZ(context, aweme), C59052NFo.LIZIZ(context, aweme));
            }
            AbstractC59064NGa abstractC59064NGa = this.LIZIZ;
            if (abstractC59064NGa != null) {
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                abstractC59064NGa.LJIJI(aid);
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
        this.LIZIZ = AdHybridContainerManager.LIZLLL().LIZIZ(C59052NFo.LIZ(context, aweme), C59052NFo.LIZIZ(context, aweme));
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
                LIZ.append(aweme.getAid());
                C58582Rq.LIZ(X1D.LIZIZ(LIZ), "AdHybridSuperLikePreRender");
                if (this.LIZIZ == null) {
                    this.LIZIZ = AdHybridContainerManager.LIZLLL().LIZJ(C59052NFo.LIZ(context, aweme), C59052NFo.LIZIZ(context, aweme));
                }
                AbstractC59064NGa abstractC59064NGa = this.LIZIZ;
                if (abstractC59064NGa != null) {
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "it.aid");
                    abstractC59064NGa.LJIJI(aid);
                }
            }
            i2++;
        }
    }
}
