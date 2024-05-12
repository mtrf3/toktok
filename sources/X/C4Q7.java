package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Q7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Q7 extends IMContact {
    public List<IMContact> LJLIL;

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getDisplayName() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getNickName() {
        return null;
    }

    public final List<IMContact> getMafUsers() {
        return this.LJLIL;
    }

    public C4Q7(List<IMContact> mafUsers) {
        o.LJIIIZ(mafUsers, "mafUsers");
        this.LJLIL = mafUsers;
    }

    public final void setMafUsers(List<IMContact> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLIL = list;
    }
}
