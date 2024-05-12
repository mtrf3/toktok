package X;

import com.ss.android.ugc.aweme.share.ShareService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.Ux0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78846Ux0 implements RTU, InterfaceC39656FhM, InterfaceC29074Bb4 {
    public static final C78846Ux0 LJLIL = new C78846Ux0();
    public static final C78846Ux0 LJLILLLLZI = new C78846Ux0();

    @Override // X.InterfaceC39656FhM
    public void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        C78857UxB.LJIILJJIL(classLoader, set, new TPP());
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        Collection groups = (Collection) obj;
        Collection users = (Collection) obj2;
        o.LJIIIZ(groups, "groups");
        o.LJIIIZ(users, "users");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(groups);
        arrayList.addAll(users);
        return arrayList;
    }

    @Override // X.InterfaceC29074Bb4
    public void LIZ(ActivityC45651qj activity, C29930Bos c29930Bos, BNE bne) {
        if (C4LD.LIZIZ.LJJIJL()) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(activity, "activity");
            shareService.LJIIJ(activity, c29930Bos, bne);
        } else {
            ShareService shareService2 = C4LD.LIZ;
            o.LJIIIIZZ(activity, "activity");
            DialogC62475OfX LJI = shareService2.LJI(activity, c29930Bos, bne);
            if (LJI == null) {
                return;
            }
            C16880lQ.LIZ(LJI);
        }
    }

    @Override // X.InterfaceC39656FhM
    public boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return C54840Lfg.LJIJJ(classLoader, file, file2, z, new C78866UxK(), "path", new C79156V4u());
    }
}
