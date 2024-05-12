package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.7FK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7FK implements Serializable, InterfaceC87283bg {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;
    public final int LJLJI;
    public final Collection<IMUser> LJLJJI;
    public final InterfaceC88473Ynt<List<InteractionTagUserInfo>, Boolean, Boolean, C76800UCe> LJLJJL;

    public C7FK() {
        this(null, null, 0, null, null, 31, null);
    }

    public final Aweme getAweme() {
        return this.LJLILLLLZI;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final int getPermission() {
        return this.LJLJI;
    }

    public final InterfaceC88473Ynt<List<InteractionTagUserInfo>, Boolean, Boolean, C76800UCe> getTagPanelOnDismiss() {
        return this.LJLJJL;
    }

    public final Collection<IMUser> getTagged() {
        return this.LJLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7FK(String enterFrom, Aweme aweme, int i, Collection<? extends IMUser> tagged, InterfaceC88473Ynt<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(tagged, "tagged");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = aweme;
        this.LJLJI = i;
        this.LJLJJI = tagged;
        this.LJLJJL = interfaceC88473Ynt;
    }

    public C7FK(String str, Aweme aweme, int i, Collection collection, InterfaceC88473Ynt interfaceC88473Ynt, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : aweme, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? C61878OQg.INSTANCE : collection, (i2 & 16) == 0 ? interfaceC88473Ynt : null);
    }
}
