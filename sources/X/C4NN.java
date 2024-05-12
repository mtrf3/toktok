package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4NN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NN extends IMContact {
    public final UrlModel LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final List<IMUser> LJLJJI;
    public final String LJLJJL;

    public final List<IMUser> getBatchContacts() {
        return this.LJLJJI;
    }

    public final String getBatchGroupType() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getDisplayName() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getNickName() {
        return this.LJLILLLLZI;
    }

    public final String getPanelTitle() {
        return this.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4NN(UrlModel batchAvatar, String batchName, String panelTitle, List<? extends IMUser> batchContacts, String batchGroupType) {
        o.LJIIIZ(batchAvatar, "batchAvatar");
        o.LJIIIZ(batchName, "batchName");
        o.LJIIIZ(panelTitle, "panelTitle");
        o.LJIIIZ(batchContacts, "batchContacts");
        o.LJIIIZ(batchGroupType, "batchGroupType");
        this.LJLIL = batchAvatar;
        this.LJLILLLLZI = batchName;
        this.LJLJI = panelTitle;
        this.LJLJJI = batchContacts;
        this.LJLJJL = batchGroupType;
        this.relationListItemType = 15;
    }
}
