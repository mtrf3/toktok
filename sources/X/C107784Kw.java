package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C107784Kw extends TBS implements InterfaceC88472Yns<IMContact, C76800UCe> {
    public C107784Kw(C4L2 c4l2) {
        super(1, c4l2, C4L2.class, "sendMessage", "sendMessage(Lcom/ss/android/ugc/aweme/im/service/model/IMContact;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(IMContact p0) {
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        SharePackage sharePackage = C4L2.LJLJJI;
        if (sharePackage != null) {
            List singletonList = Collections.singletonList(p0);
            o.LJIIIIZZ(singletonList, "singletonList(imContact)");
            C101243yC.LIZJ(sharePackage, null, singletonList, null, null, null, null, 112);
        }
        return C76800UCe.LIZ;
    }
}
