package X;

import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;

/* renamed from: X.7Ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182487Ee {
    public static final IAdCommentDepend LIZ;

    static {
        InterfaceC1803976d interfaceC1803976d;
        ICommercializeAdService LJ = CommercializeAdServiceImpl.LJ();
        if (LJ != null) {
            interfaceC1803976d = LJ.LIZLLL(5);
        } else {
            interfaceC1803976d = null;
        }
        LIZ = (IAdCommentDepend) interfaceC1803976d;
    }
}
