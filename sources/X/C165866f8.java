package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6f8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165866f8 {
    public final int LIZ;
    public final Context LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C166246fk LIZLLL;
    public final ConcurrentHashMap<String, Boolean> LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;

    public final void LIZIZ(String voiceChangeTaskId) {
        o.LJIIIZ(voiceChangeTaskId, "voiceChangeTaskId");
        if (o.LJ(this.LJ.get(voiceChangeTaskId), Boolean.TRUE) && ((C165966fI) this.LJFF.getValue()).LIZJ != null) {
            C166396fz c166396fz = ((C165966fI) this.LJFF.getValue()).LIZJ;
            if (c166396fz != null) {
                int i = c166396fz.LIZ.LIZIZ;
                C166146fa.LIZ(-1, "pipeline_state_code");
                C166146fa.LIZ(i, "pipeline_error_stage");
                C166146fa.LJFF();
                this.LJ.remove(voiceChangeTaskId);
                return;
            }
            o.LJIJI("dataContext");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZ(List<C166116fX> models, InterfaceC166046fQ listener) {
        o.LJIIIZ(models, "models");
        o.LJIIIZ(listener, "listener");
        String valueOf = String.valueOf(System.nanoTime());
        this.LJ.put(valueOf, Boolean.TRUE);
        if (models.isEmpty()) {
            listener.LIZJ(valueOf, -2, new C59722Wa(null, 11, null));
            return valueOf;
        }
        boolean z = false;
        boolean LJJIIZ = OUP.LJJIIZ(((C166116fX) ListProtector.get(models, 0)).LIZJ);
        Iterator<C166116fX> it = models.iterator();
        while (true) {
            if (it.hasNext()) {
                if (LJJIIZ != OUP.LJJIIZ(it.next().LIZJ)) {
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        int i = LJJIIZ;
        if (!z) {
            i = -1;
        }
        C166866gk c166866gk = new C166866gk();
        listener.LIZ(i, valueOf);
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    return valueOf;
                }
                C165966fI c165966fI = (C165966fI) this.LJFF.getValue();
                Context context = this.LIZIZ;
                C165786f0 c165786f0 = new C165786f0(this.LIZJ);
                c165966fI.getClass();
                o.LJIIIZ(context, "context");
                C166396fz c166396fz = new C166396fz(context, models, c165786f0);
                c165966fI.LIZJ = c166396fz;
                c166396fz.LJIIIZ = c165966fI.LIZIZ;
                XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C165826f4(this, valueOf, c166866gk, listener, 1, null), 3);
                return valueOf;
            }
            C165876f9 c165876f9 = (C165876f9) this.LJI.getValue();
            c165876f9.getClass();
            c165876f9.LIZIZ = new C165906fC(models);
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C165846f6(this, listener, valueOf, 0, null), 3);
            return valueOf;
        }
        listener.LIZJ(valueOf, i, new C59722Wa(null, 10, null));
        return valueOf;
    }

    public C165866f8(int i, Context context, VideoPublishEditModel publishEditModel, C166246fk cacheManager) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(cacheManager, "cacheManager");
        this.LIZ = i;
        this.LIZIZ = context;
        this.LIZJ = publishEditModel;
        this.LIZLLL = cacheManager;
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 37));
        this.LJI = C221108m2.LIZIZ(C165996fL.LJLIL);
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 38));
    }
}
