package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.3sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97773sb {
    public final Fragment LIZ;
    public TuxSheet LIZIZ;

    public C97773sb(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
    }

    public final void LIZ(int i) {
        AbstractC73430Srq LJI;
        C73428Sro LJJL;
        TuxSheet tuxSheet = this.LIZIZ;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        InterfaceC101453yX LJFF = PrivacyServiceImpl.LJIIIIZZ().LJFF();
        if (LJFF != null && (LJI = LJFF.LJI(i)) != null && (LJJL = LJI.LJIIZILJ(new InterfaceC29937Boz() { // from class: X.3Op
            @Override // X.InterfaceC29937Boz
            public final void run() {
                PrivacyServiceImpl.LJIIIIZZ().LJ();
                C82233Kp.LIZ();
                C106774Gz.LJ();
            }
        }).LJJL(T16.LIZ())) != null) {
            C73542Ste.LJIIIIZZ(LJJL, new C97783sc(C34B.LIZ), null, null, 6);
        }
    }
}
