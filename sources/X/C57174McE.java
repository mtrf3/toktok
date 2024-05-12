package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.McE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57174McE implements InterfaceC80183Cs {
    public final /* synthetic */ ViewOnClickListenerC57173McD LJLIL;

    @Override // X.InterfaceC80183Cs
    public final void Y8(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public C57174McE(ViewOnClickListenerC57173McD viewOnClickListenerC57173McD) {
        this.LJLIL = viewOnClickListenerC57173McD;
    }

    @Override // X.InterfaceC80183Cs
    public final void LIZ(List<IMContact> list) {
        int size = ((ArrayList) list).size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            IMContact iMContact = (IMContact) ORZ.LJLLLLLL(i, list);
            UrlModel urlModel = null;
            if (!z) {
                C72433Sbl c72433Sbl = this.LJLIL.LJLJJI;
                if (c72433Sbl != null) {
                    if (iMContact != null) {
                        urlModel = iMContact.getDisplayAvatar();
                    }
                    C78765Uvh.LJFF(c72433Sbl, urlModel);
                    z = true;
                } else {
                    o.LJIJI("headAvatar1");
                    throw null;
                }
            } else {
                C72433Sbl c72433Sbl2 = this.LJLIL.LJLJJL;
                if (c72433Sbl2 != null) {
                    if (iMContact != null) {
                        urlModel = iMContact.getDisplayAvatar();
                    }
                    C78765Uvh.LJFF(c72433Sbl2, urlModel);
                    return;
                }
                o.LJIJI("headAvatar2");
                throw null;
            }
        }
    }
}
