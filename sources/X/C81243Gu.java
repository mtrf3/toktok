package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81243Gu extends IMContact {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public C63089OpR LJLJI;

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        IMUser LJLIIIL = C44384HbQ.LJLIIIL(this);
        if (LJLIIIL != null) {
            return LJLIIIL.getDisplayAvatar();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getDisplayName() {
        IMUser LJLIIIL = C44384HbQ.LJLIIIL(this);
        if (LJLIIIL != null) {
            return LJLIIIL.getDisplayName();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getNickName() {
        IMUser LJLIIIL = C44384HbQ.LJLIIIL(this);
        if (LJLIIIL != null) {
            return LJLIIIL.getNickName();
        }
        return null;
    }

    public final C63089OpR getMember() {
        return this.LJLJI;
    }

    public final String getSecUid() {
        return this.LJLILLLLZI;
    }

    public final String getUid() {
        return this.LJLIL;
    }

    public final void setMember(C63089OpR c63089OpR) {
        this.LJLJI = c63089OpR;
    }

    public C81243Gu(String uid, String str) {
        o.LJIIIZ(uid, "uid");
        this.LJLIL = uid;
        this.LJLILLLLZI = str;
    }
}
