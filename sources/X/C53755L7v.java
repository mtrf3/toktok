package X;

import com.ss.android.ugc.aweme.inbox.lego.PreloadInboxTask;
import com.zhiliaoapp.musically.R;

/* renamed from: X.L7v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53755L7v extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C53755L7v LJLIL = new C53755L7v();

    public C53755L7v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Object obj;
        int i;
        if (!PreloadInboxTask.LJLIL) {
            M9Q.LIZIZ();
        }
        if (C114304eA.LIZLLL()) {
            M9Q.LIZ(Boolean.valueOf(IRI.LIZ()));
        }
        if (C54362LVe.LJIIZILJ(12)) {
            Object LJIIIIZZ = C84763XOl.LJIIIIZZ();
            ActivityC45651qj activityC45651qj = null;
            if (LJIIIIZZ instanceof InterfaceC55058LjC) {
                obj = (InterfaceC55058LjC) LJIIIIZZ;
            } else {
                obj = null;
            }
            if (obj instanceof ActivityC45651qj) {
                activityC45651qj = (ActivityC45651qj) obj;
            }
            int[] iArr = new int[1];
            if (((Boolean) C53349Kwj.LIZIZ.getValue()).booleanValue()) {
                i = R.layout.s4;
            } else {
                i = R.layout.s3;
            }
            iArr[0] = i;
            C114304eA.LJ(activityC45651qj, iArr);
        }
        return C76800UCe.LIZ;
    }
}
