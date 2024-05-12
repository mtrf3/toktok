package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.LOz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54201LOz extends LP1 {
    public final E6F LJ;

    @Override // X.InterfaceC54194LOs
    public final void LIZJ() {
        LJFF("2002");
    }

    @Override // X.InterfaceC54194LOs
    public final boolean LIZLLL() {
        Integer num;
        C40517FvF c40517FvF = new C40517FvF(2, 3);
        FollowLiveBubbleConfig followLiveBubbleConfig = this.LJ.LIZ;
        if (followLiveBubbleConfig != null) {
            num = Integer.valueOf(followLiveBubbleConfig.expGroup);
        } else {
            num = null;
        }
        if (num != null && c40517FvF.LJIILJJIL(num.intValue())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54194LOs
    public final void LIZ(InterfaceC65784Pro<C76800UCe> shown) {
        InterfaceC54197LOv interfaceC54197LOv;
        InterfaceC54197LOv interfaceC54197LOv2;
        o.LJIIIZ(shown, "shown");
        E6F e6f = this.LJ;
        if (e6f.LIZJ) {
            WeakReference<InterfaceC54197LOv> weakReference = e6f.LIZIZ;
            if (weakReference != null && (interfaceC54197LOv2 = weakReference.get()) != null) {
                interfaceC54197LOv2.show(true);
                return;
            }
            return;
        }
        WeakReference<InterfaceC54197LOv> weakReference2 = e6f.LIZIZ;
        if (weakReference2 == null || (interfaceC54197LOv = weakReference2.get()) == null) {
            return;
        }
        interfaceC54197LOv.show(false);
    }

    public C54201LOz(E6F e6f, WeakReference<Context> weakReference) {
        super(e6f, weakReference);
        this.LJ = e6f;
    }
}
