package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NFx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59061NFx implements InterfaceC48720JAe {
    public static final /* synthetic */ int LIZJ = 0;
    public C39289FbR LIZ;
    public final AbstractC59064NGa[] LIZIZ = new AbstractC59064NGa[3];

    @Override // X.InterfaceC48720JAe
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC48720JAe
    public final boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C63081OpJ.LJJZZI(aweme);
    }

    @Override // X.InterfaceC48720JAe
    public final void LIZ(Context context, Aweme aweme) {
        if (C63081OpJ.LJJZZI(aweme)) {
            LJII(context, aweme);
            Iterator it = ((ArrayList) ORY.LJJIJLIJ(this.LIZIZ)).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "aweme.aid");
                    ((AbstractC59064NGa) next).LJIJI(NG0.LIZ(i, aid));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
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
        int length = this.LIZIZ.length;
        for (int i = 0; i < length; i++) {
            this.LIZIZ[i] = AdHybridContainerManager.LIZLLL().LIZIZ(NG0.LIZJ(context, aweme), NG0.LIZIZ(context, aweme, i));
        }
    }

    public final void LJII(Context context, Aweme aweme) {
        int length = this.LIZIZ.length;
        for (int i = 0; i < length; i++) {
            AbstractC59064NGa[] abstractC59064NGaArr = this.LIZIZ;
            if (abstractC59064NGaArr[i] == null) {
                abstractC59064NGaArr[i] = AdHybridContainerManager.LIZLLL().LIZIZ(NG0.LIZJ(context, aweme), NG0.LIZIZ(context, aweme, i));
            }
        }
    }

    @Override // X.InterfaceC48720JAe
    public final void LJI(int i, Context context, List list) {
        C48721JAf.LIZIZ(this, context, list, i);
    }

    public final void LJIIIIZZ(int i, Context context, List items) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(items, "items");
        if (i < 0 || i >= items.size() || ((Aweme) ListProtector.get(items, i)).isAd()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : items) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (LIZJ((Aweme) obj) && i2 + 6 < i) {
                    arrayList.add(obj);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            LJII(context, aweme);
            Iterator it2 = ((ArrayList) ORY.LJJIJLIJ(this.LIZIZ)).iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "it.aid");
                    ((AbstractC59064NGa) next).LJIJI(NG0.LIZ(i4, aid));
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }
}
