package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.List;

/* renamed from: X.Hy5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45789Hy5 implements InterfaceC45793Hy9 {
    public final /* synthetic */ InterfaceC45790Hy6 LIZ;
    public final /* synthetic */ C45774Hxq LIZIZ;
    public final /* synthetic */ Context LIZJ;

    @Override // X.InterfaceC45793Hy9
    public final void LIZ(List<? extends AVMusic> list) {
        AVMusic aVMusic = null;
        if (C77413UZt.LJIILL(list)) {
            InterfaceC45790Hy6 interfaceC45790Hy6 = this.LIZ;
            if (interfaceC45790Hy6 != null) {
                interfaceC45790Hy6.LIZIZ(null);
                return;
            }
            return;
        }
        InterfaceC45790Hy6 interfaceC45790Hy62 = this.LIZ;
        if (interfaceC45790Hy62 != null) {
            interfaceC45790Hy62.LIZJ(list);
        }
        C45774Hxq c45774Hxq = this.LIZIZ;
        Context context = this.LIZJ;
        if (list != null) {
            aVMusic = (AVMusic) ListProtector.get(list, 0);
        }
        C45792Hy8 c45792Hy8 = new C45792Hy8(this.LIZ);
        c45774Hxq.getClass();
        C45422HsA.LIZIZ(context, aVMusic, c45792Hy8);
    }

    @Override // X.InterfaceC45793Hy9
    public final void onFailed(Exception exc) {
        InterfaceC45790Hy6 interfaceC45790Hy6 = this.LIZ;
        if (interfaceC45790Hy6 != null) {
            interfaceC45790Hy6.LIZIZ(exc);
        }
    }

    public C45789Hy5(InterfaceC45790Hy6 interfaceC45790Hy6, C45774Hxq c45774Hxq, Context context) {
        this.LIZ = interfaceC45790Hy6;
        this.LIZIZ = c45774Hxq;
        this.LIZJ = context;
    }
}
