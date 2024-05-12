package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TUL extends AbstractC74727TUl<LinkListUser, LinkMessage> {
    @Override // X.TZX
    public final int LIZJ(long j) {
        int i;
        LinkListUser linkListUser;
        synchronized (this) {
            Iterator<LinkListUser> it = LJIJI().iterator();
            while (true) {
                i = 0;
                if (it.hasNext()) {
                    linkListUser = it.next();
                    User user = linkListUser.user;
                    if (user != null && user.getId() == j) {
                        break;
                    }
                } else {
                    linkListUser = null;
                    break;
                }
            }
            LinkListUser linkListUser2 = linkListUser;
            if (linkListUser2 != null) {
                i = linkListUser2.LIZ;
            }
        }
        return i;
    }

    @Override // X.TZX
    public final Object LIZLLL(long j) {
        LinkListUser linkListUser;
        LinkListUser linkListUser2;
        synchronized (this) {
            Iterator<LinkListUser> it = LJJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkListUser = it.next();
                    User user = linkListUser.user;
                    if (user != null && user.getId() == j) {
                        break;
                    }
                } else {
                    linkListUser = null;
                    break;
                }
            }
            linkListUser2 = linkListUser;
        }
        return linkListUser2;
    }

    @Override // X.TZX
    public final Object LJII(String linkMicId) {
        LinkListUser linkListUser;
        LinkListUser linkListUser2;
        o.LJIIIZ(linkMicId, "linkMicId");
        synchronized (this) {
            Iterator<LinkListUser> it = LJIJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkListUser = it.next();
                    if (TextUtils.equals(linkMicId, linkListUser.linkMicId)) {
                        break;
                    }
                } else {
                    linkListUser = null;
                    break;
                }
            }
            linkListUser2 = linkListUser;
        }
        return linkListUser2;
    }

    @Override // X.TZX
    public final Object LJIIIZ(long j) {
        LinkListUser linkListUser;
        LinkListUser linkListUser2;
        synchronized (this) {
            Iterator<LinkListUser> it = LJIJJLI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkListUser = it.next();
                    User user = linkListUser.user;
                    if (user != null && user.getId() == j) {
                        break;
                    }
                } else {
                    linkListUser = null;
                    break;
                }
            }
            linkListUser2 = linkListUser;
        }
        return linkListUser2;
    }

    @Override // X.TZX
    public final Object LJIIJJI(String linkMicId) {
        LinkListUser linkListUser;
        LinkListUser linkListUser2;
        o.LJIIIZ(linkMicId, "linkMicId");
        synchronized (this) {
            Iterator<LinkListUser> it = LJJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkListUser = it.next();
                    if (TextUtils.equals(linkMicId, linkListUser.linkMicId)) {
                        break;
                    }
                } else {
                    linkListUser = null;
                    break;
                }
            }
            linkListUser2 = linkListUser;
        }
        return linkListUser2;
    }

    @Override // X.TZX
    public final Object LJIIL(long j) {
        LinkListUser linkListUser;
        LinkListUser linkListUser2;
        synchronized (this) {
            Iterator<LinkListUser> it = LJIJI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkListUser = it.next();
                    User user = linkListUser.user;
                    if (user != null && user.getId() == j) {
                        break;
                    }
                } else {
                    linkListUser = null;
                    break;
                }
            }
            linkListUser2 = linkListUser;
        }
        return linkListUser2;
    }

    @Override // X.AbstractC74727TUl
    public final void LJJIII(LinkMessage linkMessage) {
        LinkMessage linkMessage2 = linkMessage;
        for (LinkListUser linkListUser : linkMessage2.mListChangeContent.onLineUsers) {
            linkListUser.LIZ = 2;
            LJJI().add(linkListUser);
        }
        for (LinkListUser linkListUser2 : linkMessage2.mListChangeContent.waitingUsers) {
            linkListUser2.LIZ = 1;
            LJIJJLI().add(linkListUser2);
        }
    }
}
