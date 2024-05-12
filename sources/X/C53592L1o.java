package X;

import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.L1o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53592L1o implements AUS {
    public final EnumC53719L6l LIZ;
    public final InterfaceC88472Yns<C212068Ty, C76800UCe> LIZIZ;
    public final InterfaceC88471Ynr<SmartRoute, String, C76800UCe> LIZJ;
    public final String LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final int LJFF;
    public final Integer LJI;
    public final boolean LJII;
    public final Float LJIIIIZZ;
    public final C26308AUe LJIIIZ;
    public final APQ LJIIJ;
    public final boolean LJIIJJI;
    public final EnterStoryParam LJIIL;
    public final WeakReference<ActivityC45651qj> LJIILIIL;

    public C53592L1o() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, 16383);
    }

    public C53592L1o(EnumC53719L6l enumC53719L6l, InterfaceC88472Yns interfaceC88472Yns, AqS185S0100000_3 aqS185S0100000_3, String str, InterfaceC65784Pro interfaceC65784Pro, Integer num, Float f, C26308AUe c26308AUe, APQ apq, boolean z, EnterStoryParam enterStoryParam, WeakReference weakReference, int i) {
        boolean z2;
        EnumC53719L6l scene = enumC53719L6l;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        AqS185S0100000_3 aqS185S0100000_32 = aqS185S0100000_3;
        String str2 = str;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        Integer num2 = num;
        Float f2 = f;
        C26308AUe c26308AUe2 = c26308AUe;
        APQ apq2 = apq;
        boolean z3 = z;
        EnterStoryParam enterStoryParam2 = enterStoryParam;
        scene = (i & 1) != 0 ? EnumC53719L6l.PROFILE : scene;
        interfaceC88472Yns2 = (i & 2) != 0 ? null : interfaceC88472Yns2;
        aqS185S0100000_32 = (i & 4) != 0 ? null : aqS185S0100000_32;
        str2 = (i & 8) != 0 ? null : str2;
        interfaceC65784Pro2 = (i & 16) != 0 ? null : interfaceC65784Pro2;
        num2 = (i & 64) != 0 ? null : num2;
        if ((i & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f2 = (i & 256) != 0 ? null : f2;
        c26308AUe2 = (i & 512) != 0 ? null : c26308AUe2;
        apq2 = (i & 1024) != 0 ? null : apq2;
        z3 = (i & 2048) != 0 ? false : z3;
        enterStoryParam2 = (i & 4096) != 0 ? null : enterStoryParam2;
        WeakReference weakReference2 = (i & FileUtils.BUFFER_SIZE) == 0 ? weakReference : null;
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
        this.LIZIZ = interfaceC88472Yns2;
        this.LIZJ = aqS185S0100000_32;
        this.LIZLLL = str2;
        this.LJ = interfaceC65784Pro2;
        this.LJFF = 0;
        this.LJI = num2;
        this.LJII = z2;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = c26308AUe2;
        this.LJIIJ = apq2;
        this.LJIIJJI = z3;
        this.LJIIL = enterStoryParam2;
        this.LJIILIIL = weakReference2;
    }
}
