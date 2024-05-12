package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bsp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30175Bsp implements InterfaceC80183Cs {
    public final /* synthetic */ InterfaceC29340BfM LJLIL;

    public C30175Bsp(InterfaceC29340BfM interfaceC29340BfM) {
        this.LJLIL = interfaceC29340BfM;
    }

    @Override // X.InterfaceC80183Cs
    public final void LIZ(List<IMContact> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            IMContact iMContact = (IMContact) it.next();
            if (iMContact != null && iMContact.getDisplayAvatar() != null) {
                UrlModel urlModel = new UrlModel();
                urlModel.uri = iMContact.getDisplayAvatar().getUri();
                urlModel.urlList = iMContact.getDisplayAvatar().getUrlList();
                arrayList.add(urlModel);
            }
        }
        C29876Bo0 c29876Bo0 = (C29876Bo0) this.LJLIL;
        c29876Bo0.getClass();
        if (C79004UzY.LJJIFFI(arrayList)) {
            return;
        }
        C29917Bof.LIZ().LIZ(new C29871Bnv(c29876Bo0, arrayList));
    }

    @Override // X.InterfaceC80183Cs
    public final void Y8(Throwable th) {
        this.LJLIL.getClass();
    }
}
