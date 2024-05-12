package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91633ih implements Serializable, InterfaceC87283bg {
    public final Collection<IMUser> LJLIL;
    public final Collection<IMUser> LJLILLLLZI;
    public final String LJLJI;
    public final EnumC91783iw LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;

    public C91633ih() {
        this(null, null, null, null, null, false, 63, null);
    }

    public final String getConversationId() {
        return this.LJLJJL;
    }

    public final String getCreateChannel() {
        return this.LJLJI;
    }

    public final EnumC91783iw getEntry() {
        return this.LJLJJI;
    }

    public final Collection<IMUser> getGroupMembers() {
        return this.LJLILLLLZI;
    }

    public final Collection<IMUser> getSelectedContacts() {
        return this.LJLIL;
    }

    public final boolean isFromChatList() {
        return this.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91633ih(Collection<? extends IMUser> selectedContacts, Collection<? extends IMUser> groupMembers, String createChannel, EnumC91783iw entry, String conversationId, boolean z) {
        o.LJIIIZ(selectedContacts, "selectedContacts");
        o.LJIIIZ(groupMembers, "groupMembers");
        o.LJIIIZ(createChannel, "createChannel");
        o.LJIIIZ(entry, "entry");
        o.LJIIIZ(conversationId, "conversationId");
        this.LJLIL = selectedContacts;
        this.LJLILLLLZI = groupMembers;
        this.LJLJI = createChannel;
        this.LJLJJI = entry;
        this.LJLJJL = conversationId;
        this.LJLJJLL = z;
    }

    public C91633ih(Collection collection, Collection collection2, String str, EnumC91783iw enumC91783iw, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : collection, (i & 2) != 0 ? C61878OQg.INSTANCE : collection2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? EnumC91783iw.CREATE_GROUP : enumC91783iw, (i & 16) == 0 ? str2 : "", (i & 32) != 0 ? false : z);
    }
}
