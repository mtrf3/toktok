package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3TP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TP implements C3TU {
    public boolean LJLIL;
    public final IMUser LJLILLLLZI;
    public final EnumC96553qd LJLJI;
    public boolean LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final CharSequence LJLJL;
    public final Object LJLJLJ;
    public final AbstractC82843My LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final String LJLLL;
    public final int LJLLLL;
    public final long LJLLLLLL;
    public final long LJLZ;
    public final int LJZ;

    public static /* synthetic */ C3TP copy$default(C3TP c3tp, boolean z, IMUser iMUser, EnumC96553qd enumC96553qd, boolean z2, String str, String str2, CharSequence charSequence, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i, long j, long j2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = c3tp.LJLIL;
        }
        if ((i2 & 2) != 0) {
            iMUser = c3tp.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            enumC96553qd = c3tp.getReadStatus();
        }
        if ((i2 & 8) != 0) {
            z2 = c3tp.getShowReadStatus();
        }
        if ((i2 & 16) != 0) {
            str = c3tp.getSessionId();
        }
        if ((i2 & 32) != 0) {
            str2 = c3tp.getName();
        }
        if ((i2 & 64) != 0) {
            charSequence = c3tp.getContent();
        }
        if ((i2 & 128) != 0) {
            obj = c3tp.getAvatar();
        }
        if ((i2 & 256) != 0) {
            abstractC82843My = c3tp.getSessionUnreadViewState();
        }
        if ((i2 & 512) != 0) {
            z3 = c3tp.isBlock();
        }
        if ((i2 & 1024) != 0) {
            z4 = c3tp.isSupportMute();
        }
        if ((i2 & 2048) != 0) {
            z5 = c3tp.isMute();
        }
        if ((i2 & 4096) != 0) {
            z6 = c3tp.isCheckEmoji();
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str3 = c3tp.getTimeForDisplay();
        }
        if ((i2 & 16384) != 0) {
            i = c3tp.getPriority();
        }
        if ((32768 & i2) != 0) {
            j = c3tp.getSortOrder();
        }
        if ((i2 & 65536) != 0) {
            j2 = c3tp.getConversationUpdatedAt();
        }
        return c3tp.copy(z, iMUser, enumC96553qd, z2, str, str2, charSequence, obj, abstractC82843My, z3, z4, z5, z6, str3, i, j, j2);
    }

    public final boolean component10() {
        return isBlock();
    }

    public final boolean component11() {
        return isSupportMute();
    }

    public final boolean component12() {
        return isMute();
    }

    public final boolean component13() {
        return isCheckEmoji();
    }

    public final String component14() {
        return getTimeForDisplay();
    }

    public final int component15() {
        return getPriority();
    }

    public final long component16() {
        return getSortOrder();
    }

    public final long component17() {
        return getConversationUpdatedAt();
    }

    public final EnumC96553qd component3() {
        return getReadStatus();
    }

    public final boolean component4() {
        return getShowReadStatus();
    }

    public final String component5() {
        return getSessionId();
    }

    public final String component6() {
        return getName();
    }

    public final CharSequence component7() {
        return getContent();
    }

    public final Object component8() {
        return getAvatar();
    }

    public final AbstractC82843My component9() {
        return getSessionUnreadViewState();
    }

    public final C3TP copy(boolean z, IMUser iMUser, EnumC96553qd enumC96553qd, boolean z2, String sessionId, String name, CharSequence content, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String timeForDisplay, int i, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        return new C3TP(z, iMUser, enumC96553qd, z2, sessionId, name, content, obj, abstractC82843My, z3, z4, z5, z6, timeForDisplay, i, j, j2);
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public C3TP copyData() {
        return copy$default(this, false, null, null, false, null, null, null, null, null, false, false, false, false, null, 0, 0L, 0L, 131071, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3TP)) {
            return false;
        }
        C3TP c3tp = (C3TP) obj;
        return this.LJLIL == c3tp.LJLIL && o.LJ(this.LJLILLLLZI, c3tp.LJLILLLLZI) && getReadStatus() == c3tp.getReadStatus() && getShowReadStatus() == c3tp.getShowReadStatus() && o.LJ(getSessionId(), c3tp.getSessionId()) && o.LJ(getName(), c3tp.getName()) && o.LJ(getContent(), c3tp.getContent()) && o.LJ(getAvatar(), c3tp.getAvatar()) && o.LJ(getSessionUnreadViewState(), c3tp.getSessionUnreadViewState()) && isBlock() == c3tp.isBlock() && isSupportMute() == c3tp.isSupportMute() && isMute() == c3tp.isMute() && isCheckEmoji() == c3tp.isCheckEmoji() && o.LJ(getTimeForDisplay(), c3tp.getTimeForDisplay()) && getPriority() == c3tp.getPriority() && getSortOrder() == c3tp.getSortOrder() && getConversationUpdatedAt() == c3tp.getConversationUpdatedAt();
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getSessionType() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z = this.LJLIL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        IMUser iMUser = this.LJLILLLLZI;
        int hashCode = (((i2 + (iMUser == null ? 0 : iMUser.hashCode())) * 31) + (getReadStatus() == null ? 0 : getReadStatus().hashCode())) * 31;
        boolean showReadStatus = getShowReadStatus();
        int i3 = showReadStatus;
        if (showReadStatus) {
            i3 = 1;
        }
        int hashCode2 = (((((getContent().hashCode() + ((getName().hashCode() + ((getSessionId().hashCode() + ((hashCode + i3) * 31)) * 31)) * 31)) * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode())) * 31) + (getSessionUnreadViewState() != null ? getSessionUnreadViewState().hashCode() : 0)) * 31;
        boolean isBlock = isBlock();
        int i4 = isBlock;
        if (isBlock) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean isSupportMute = isSupportMute();
        int i6 = isSupportMute;
        if (isSupportMute) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean isMute = isMute();
        int i8 = isMute;
        if (isMute) {
            i8 = 1;
        }
        return C16880lQ.LLJIJIL(getConversationUpdatedAt()) + ((C16880lQ.LLJIJIL(getSortOrder()) + ((getPriority() + ((getTimeForDisplay().hashCode() + ((((i7 + i8) * 31) + (isCheckEmoji() ? 1 : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TakoChatSessionVO(isShowingTypingStatus=" + this.LJLIL + ", imUser=" + this.LJLILLLLZI + ", readStatus=" + getReadStatus() + ", showReadStatus=" + getShowReadStatus() + ", sessionId=" + getSessionId() + ", name=" + getName() + ", content=" + ((Object) getContent()) + ", avatar=" + getAvatar() + ", sessionUnreadViewState=" + getSessionUnreadViewState() + ", isBlock=" + isBlock() + ", isSupportMute=" + isSupportMute() + ", isMute=" + isMute() + ", isCheckEmoji=" + isCheckEmoji() + ", timeForDisplay=" + getTimeForDisplay() + ", priority=" + getPriority() + ", sortOrder=" + getSortOrder() + ", conversationUpdatedAt=" + getConversationUpdatedAt() + ')';
    }

    public final String getUid() {
        String uid;
        IMUser iMUser = this.LJLILLLLZI;
        if (iMUser == null || (uid = iMUser.getUid()) == null) {
            return "";
        }
        return uid;
    }

    @Override // X.C3TU
    public boolean getHasUnreadMsg() {
        return C3TT.LIZ(this);
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public Object getAvatar() {
        return this.LJLJLJ;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public CharSequence getContent() {
        return this.LJLJL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public long getConversationUpdatedAt() {
        return this.LJLZ;
    }

    public final IMUser getImUser() {
        return this.LJLILLLLZI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getName() {
        return this.LJLJJLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getPriority() {
        return this.LJLLLL;
    }

    @Override // X.C3TU
    public EnumC96553qd getReadStatus() {
        return this.LJLJI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getSessionId() {
        return this.LJLJJL;
    }

    @Override // X.C3TU
    public AbstractC82843My getSessionUnreadViewState() {
        return this.LJLJLLL;
    }

    @Override // X.C3TU
    public boolean getShowReadStatus() {
        return this.LJLJJI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public long getSortOrder() {
        return this.LJLLLLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getTimeForDisplay() {
        return this.LJLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getViewHolderType() {
        return this.LJZ;
    }

    @Override // X.C3TU
    public boolean isBlock() {
        return this.LJLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isCheckEmoji() {
        return this.LJLLJ;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isMute() {
        return this.LJLLILLLL;
    }

    public final boolean isShowingTypingStatus() {
        return this.LJLIL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isSupportMute() {
        return this.LJLLI;
    }

    @Override // X.C3TU
    public void setShowReadStatus(boolean z) {
        this.LJLJJI = z;
    }

    public final void setShowingTypingStatus(boolean z) {
        this.LJLIL = z;
    }

    public C3TP(boolean z, IMUser iMUser, EnumC96553qd enumC96553qd, boolean z2, String sessionId, String name, CharSequence content, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String timeForDisplay, int i, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        this.LJLIL = z;
        this.LJLILLLLZI = iMUser;
        this.LJLJI = enumC96553qd;
        this.LJLJJI = z2;
        this.LJLJJL = sessionId;
        this.LJLJJLL = name;
        this.LJLJL = content;
        this.LJLJLJ = obj;
        this.LJLJLLL = abstractC82843My;
        this.LJLL = z3;
        this.LJLLI = z4;
        this.LJLLILLLL = z5;
        this.LJLLJ = z6;
        this.LJLLL = timeForDisplay;
        this.LJLLLL = i;
        this.LJLLLLLL = j;
        this.LJLZ = j2;
        this.LJZ = 108;
    }

    public /* synthetic */ C3TP(boolean z, IMUser iMUser, EnumC96553qd enumC96553qd, boolean z2, String str, String str2, CharSequence charSequence, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : iMUser, (i2 & 4) != 0 ? null : enumC96553qd, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : charSequence, (i2 & 128) == 0 ? obj : null, abstractC82843My, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? false : z4, (i2 & 2048) != 0 ? false : z5, (i2 & 4096) != 0 ? false : z6, (i2 & FileUtils.BUFFER_SIZE) == 0 ? str3 : "", (i2 & 16384) != 0 ? 0 : i, (32768 & i2) != 0 ? 0L : j, (i2 & 65536) != 0 ? 0L : j2);
    }
}
