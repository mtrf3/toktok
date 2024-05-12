package X;

import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.music.model.StickPointBeanUtil;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* renamed from: X.Hxu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45778Hxu implements InterfaceC142075hr {
    public final /* synthetic */ InterfaceC45785Hy1 LIZ;
    public final /* synthetic */ AVMusic LIZIZ;

    public C45778Hxu(C45783Hxz c45783Hxz, AVMusic aVMusic) {
        this.LIZ = c45783Hxz;
        this.LIZIZ = aVMusic;
    }

    @Override // X.InterfaceC142075hr
    public final void LIZ(StickPointMusicAlg stickPointMusicAlg, boolean z) {
        Boolean bool;
        if (z) {
            if (stickPointMusicAlg != null) {
                bool = Boolean.valueOf(StickPointBeanUtil.existOnSetAlgFile(stickPointMusicAlg));
            } else {
                bool = null;
            }
            o.LJI(bool);
            if (bool.booleanValue()) {
                InterfaceC45785Hy1 interfaceC45785Hy1 = this.LIZ;
                if (interfaceC45785Hy1 != null) {
                    interfaceC45785Hy1.LIZ(this.LIZIZ, true);
                    return;
                }
                return;
            }
            C45422HsA.LIZLLL(this.LIZIZ, new C45781Hxx(this.LIZ));
            return;
        }
        C45422HsA.LIZLLL(this.LIZIZ, new C45782Hxy(this.LIZ));
    }
}
