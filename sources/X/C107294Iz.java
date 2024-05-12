package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4Iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C107294Iz {
    public final /* synthetic */ C107284Iy LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ SharePackage LJ;
    public final /* synthetic */ IMContact LJFF;

    public /* synthetic */ C107294Iz(C107284Iy c107284Iy, boolean z, boolean z2, String str, SharePackage sharePackage, IMContact iMContact) {
        this.LIZ = c107284Iy;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = sharePackage;
        this.LJFF = iMContact;
    }

    public final void LIZ() {
        C107284Iy c107284Iy = this.LIZ;
        boolean z = this.LIZIZ;
        boolean z2 = this.LIZJ;
        String str = this.LIZLLL;
        SharePackage sharePackage = this.LJ;
        IMContact iMContact = this.LJFF;
        if (c107284Iy.LIZ == C4J0.SENDING) {
            C107274Ix.LIZIZ.removeMessages(100);
            C4J0 c4j0 = C4J0.UNDO;
            o.LJIIIZ(c4j0, "<set-?>");
            c107284Iy.LIZ = c4j0;
            C2U8.LIZ(new C232629Ba(c107284Iy.LIZJ, c107284Iy.LIZIZ, str, z, z2));
            C107274Ix.LIZJ(sharePackage, iMContact, c107284Iy.LJIIIZ);
        }
    }
}
