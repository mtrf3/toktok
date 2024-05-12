package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3TO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TO implements C3TU {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public CharSequence LJLJL;
    public boolean LJLJLJ;
    public final IMUser LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final EnumC96553qd LJLLILLLL;
    public boolean LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public final CharSequence LJLLLLLL;
    public final Object LJLZ;
    public final AbstractC82843My LJZ;
    public final boolean LJZI;
    public final boolean LJZL;
    public final boolean LL;
    public final boolean LLD;
    public final String LLF;
    public final int LLFF;
    public final long LLFFF;
    public final long LLFII;
    public final int LLFZ;

    public static /* synthetic */ C3TO copy$default(C3TO c3to, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, CharSequence charSequence, boolean z6, IMUser iMUser, boolean z7, boolean z8, EnumC96553qd enumC96553qd, boolean z9, String str, String str2, CharSequence charSequence2, Object obj, AbstractC82843My abstractC82843My, boolean z10, boolean z11, boolean z12, boolean z13, String str3, int i2, long j, long j2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            z = c3to.LJLIL;
        }
        if ((i3 & 2) != 0) {
            z2 = c3to.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            z3 = c3to.LJLJI;
        }
        if ((i3 & 8) != 0) {
            i = c3to.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            z4 = c3to.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            z5 = c3to.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            charSequence = c3to.LJLJL;
        }
        if ((i3 & 128) != 0) {
            z6 = c3to.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            iMUser = c3to.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            z7 = c3to.LJLL;
        }
        if ((i3 & 1024) != 0) {
            z8 = c3to.LJLLI;
        }
        if ((i3 & 2048) != 0) {
            enumC96553qd = c3to.getReadStatus();
        }
        if ((i3 & 4096) != 0) {
            z9 = c3to.getShowReadStatus();
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            str = c3to.getSessionId();
        }
        if ((i3 & 16384) != 0) {
            str2 = c3to.getName();
        }
        if ((32768 & i3) != 0) {
            charSequence2 = c3to.getContent();
        }
        if ((65536 & i3) != 0) {
            obj = c3to.getAvatar();
        }
        if ((131072 & i3) != 0) {
            abstractC82843My = c3to.getSessionUnreadViewState();
        }
        if ((262144 & i3) != 0) {
            z10 = c3to.isBlock();
        }
        if ((524288 & i3) != 0) {
            z11 = c3to.isSupportMute();
        }
        if ((1048576 & i3) != 0) {
            z12 = c3to.isMute();
        }
        if ((2097152 & i3) != 0) {
            z13 = c3to.isCheckEmoji();
        }
        if ((4194304 & i3) != 0) {
            str3 = c3to.getTimeForDisplay();
        }
        if ((8388608 & i3) != 0) {
            i2 = c3to.getPriority();
        }
        if ((16777216 & i3) != 0) {
            j = c3to.getSortOrder();
        }
        if ((i3 & 33554432) != 0) {
            j2 = c3to.getConversationUpdatedAt();
        }
        return c3to.copy(z, z2, z3, i, z4, z5, charSequence, z6, iMUser, z7, z8, enumC96553qd, z9, str, str2, charSequence2, obj, abstractC82843My, z10, z11, z12, z13, str3, i2, j, j2);
    }

    public final EnumC96553qd component12() {
        return getReadStatus();
    }

    public final boolean component13() {
        return getShowReadStatus();
    }

    public final String component14() {
        return getSessionId();
    }

    public final String component15() {
        return getName();
    }

    public final CharSequence component16() {
        return getContent();
    }

    public final Object component17() {
        return getAvatar();
    }

    public final AbstractC82843My component18() {
        return getSessionUnreadViewState();
    }

    public final boolean component19() {
        return isBlock();
    }

    public final boolean component20() {
        return isSupportMute();
    }

    public final boolean component21() {
        return isMute();
    }

    public final boolean component22() {
        return isCheckEmoji();
    }

    public final String component23() {
        return getTimeForDisplay();
    }

    public final int component24() {
        return getPriority();
    }

    public final long component25() {
        return getSortOrder();
    }

    public final long component26() {
        return getConversationUpdatedAt();
    }

    public final C3TO copy(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, CharSequence charSequence, boolean z6, IMUser iMUser, boolean z7, boolean z8, EnumC96553qd enumC96553qd, boolean z9, String sessionId, String name, CharSequence content, Object obj, AbstractC82843My abstractC82843My, boolean z10, boolean z11, boolean z12, boolean z13, String timeForDisplay, int i2, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        return new C3TO(z, z2, z3, i, z4, z5, charSequence, z6, iMUser, z7, z8, enumC96553qd, z9, sessionId, name, content, obj, abstractC82843My, z10, z11, z12, z13, timeForDisplay, i2, j, j2);
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public C3TO copyData() {
        return copy$default(this, false, false, false, 0, false, false, null, false, null, false, false, null, false, null, null, null, null, null, false, false, false, false, null, 0, 0L, 0L, 67108863, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3TO)) {
            return false;
        }
        C3TO c3to = (C3TO) obj;
        return this.LJLIL == c3to.LJLIL && this.LJLILLLLZI == c3to.LJLILLLLZI && this.LJLJI == c3to.LJLJI && this.LJLJJI == c3to.LJLJJI && this.LJLJJL == c3to.LJLJJL && this.LJLJJLL == c3to.LJLJJLL && o.LJ(this.LJLJL, c3to.LJLJL) && this.LJLJLJ == c3to.LJLJLJ && o.LJ(this.LJLJLLL, c3to.LJLJLLL) && this.LJLL == c3to.LJLL && this.LJLLI == c3to.LJLLI && getReadStatus() == c3to.getReadStatus() && getShowReadStatus() == c3to.getShowReadStatus() && o.LJ(getSessionId(), c3to.getSessionId()) && o.LJ(getName(), c3to.getName()) && o.LJ(getContent(), c3to.getContent()) && o.LJ(getAvatar(), c3to.getAvatar()) && o.LJ(getSessionUnreadViewState(), c3to.getSessionUnreadViewState()) && isBlock() == c3to.isBlock() && isSupportMute() == c3to.isSupportMute() && isMute() == c3to.isMute() && isCheckEmoji() == c3to.isCheckEmoji() && o.LJ(getTimeForDisplay(), c3to.getTimeForDisplay()) && getPriority() == c3to.getPriority() && getSortOrder() == c3to.getSortOrder() && getConversationUpdatedAt() == c3to.getConversationUpdatedAt();
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
        boolean z2 = this.LJLILLLLZI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJLJI;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (((i4 + i5) * 31) + this.LJLJJI) * 31;
        boolean z4 = this.LJLJJL;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.LJLJJLL;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        CharSequence charSequence = this.LJLJL;
        int hashCode = (i10 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        boolean z6 = this.LJLJLJ;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        IMUser iMUser = this.LJLJLLL;
        int hashCode2 = (i12 + (iMUser == null ? 0 : iMUser.hashCode())) * 31;
        boolean z7 = this.LJLL;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode2 + i13) * 31;
        boolean z8 = this.LJLLI;
        int i15 = z8;
        if (z8 != 0) {
            i15 = 1;
        }
        int hashCode3 = (((i14 + i15) * 31) + (getReadStatus() == null ? 0 : getReadStatus().hashCode())) * 31;
        boolean showReadStatus = getShowReadStatus();
        int i16 = showReadStatus;
        if (showReadStatus) {
            i16 = 1;
        }
        int hashCode4 = (((((getContent().hashCode() + ((getName().hashCode() + ((getSessionId().hashCode() + ((hashCode3 + i16) * 31)) * 31)) * 31)) * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode())) * 31) + (getSessionUnreadViewState() != null ? getSessionUnreadViewState().hashCode() : 0)) * 31;
        boolean isBlock = isBlock();
        int i17 = isBlock;
        if (isBlock) {
            i17 = 1;
        }
        int i18 = (hashCode4 + i17) * 31;
        boolean isSupportMute = isSupportMute();
        int i19 = isSupportMute;
        if (isSupportMute) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        boolean isMute = isMute();
        int i21 = isMute;
        if (isMute) {
            i21 = 1;
        }
        return C16880lQ.LLJIJIL(getConversationUpdatedAt()) + ((C16880lQ.LLJIJIL(getSortOrder()) + ((getPriority() + ((getTimeForDisplay().hashCode() + ((((i20 + i21) * 31) + (isCheckEmoji() ? 1 : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SingleChatSessionVO(isActive=" + this.LJLIL + ", displayActiveText=" + this.LJLILLLLZI + ", showVerifyIcon=" + this.LJLJI + ", lastMessageMsgType=" + this.LJLJJI + ", showSayHiButton=" + this.LJLJJL + ", showCameraIcon=" + this.LJLJJLL + ", typingStatusText=" + ((Object) this.LJLJL) + ", isShowingTypingStatus=" + this.LJLJLJ + ", imUser=" + this.LJLJLLL + ", isTCM=" + this.LJLL + ", isRecommendedChat=" + this.LJLLI + ", readStatus=" + getReadStatus() + ", showReadStatus=" + getShowReadStatus() + ", sessionId=" + getSessionId() + ", name=" + getName() + ", content=" + ((Object) getContent()) + ", avatar=" + getAvatar() + ", sessionUnreadViewState=" + getSessionUnreadViewState() + ", isBlock=" + isBlock() + ", isSupportMute=" + isSupportMute() + ", isMute=" + isMute() + ", isCheckEmoji=" + isCheckEmoji() + ", timeForDisplay=" + getTimeForDisplay() + ", priority=" + getPriority() + ", sortOrder=" + getSortOrder() + ", conversationUpdatedAt=" + getConversationUpdatedAt() + ')';
    }

    public final String getUid() {
        String uid;
        IMUser iMUser = this.LJLJLLL;
        if (iMUser == null || (uid = iMUser.getUid()) == null) {
            return String.valueOf(C81273Gx.LIZLLL(getSessionId()));
        }
        return uid;
    }

    @Override // X.C3TU
    public boolean getHasUnreadMsg() {
        return C3TT.LIZ(this);
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public Object getAvatar() {
        return this.LJLZ;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public CharSequence getContent() {
        return this.LJLLLLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public long getConversationUpdatedAt() {
        return this.LLFII;
    }

    public final boolean getDisplayActiveText() {
        return this.LJLILLLLZI;
    }

    public final IMUser getImUser() {
        return this.LJLJLLL;
    }

    public final int getLastMessageMsgType() {
        return this.LJLJJI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getName() {
        return this.LJLLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getPriority() {
        return this.LLFF;
    }

    @Override // X.C3TU
    public EnumC96553qd getReadStatus() {
        return this.LJLLILLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getSessionId() {
        return this.LJLLL;
    }

    @Override // X.C3TU
    public AbstractC82843My getSessionUnreadViewState() {
        return this.LJZ;
    }

    public final boolean getShowCameraIcon() {
        return this.LJLJJLL;
    }

    @Override // X.C3TU
    public boolean getShowReadStatus() {
        return this.LJLLJ;
    }

    public final boolean getShowSayHiButton() {
        return this.LJLJJL;
    }

    public final boolean getShowVerifyIcon() {
        return this.LJLJI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public long getSortOrder() {
        return this.LLFFF;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getTimeForDisplay() {
        return this.LLF;
    }

    public final CharSequence getTypingStatusText() {
        return this.LJLJL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getViewHolderType() {
        return this.LLFZ;
    }

    public final boolean isActive() {
        return this.LJLIL;
    }

    @Override // X.C3TU
    public boolean isBlock() {
        return this.LJZI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isCheckEmoji() {
        return this.LLD;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isMute() {
        return this.LL;
    }

    public final boolean isRecommendedChat() {
        return this.LJLLI;
    }

    public final boolean isShowingTypingStatus() {
        return this.LJLJLJ;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isSupportMute() {
        return this.LJZL;
    }

    public final boolean isTCM() {
        return this.LJLL;
    }

    public final void setShowCameraIcon(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // X.C3TU
    public void setShowReadStatus(boolean z) {
        this.LJLLJ = z;
    }

    public final void setShowSayHiButton(boolean z) {
        this.LJLJJL = z;
    }

    public final void setShowingTypingStatus(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setTypingStatusText(CharSequence charSequence) {
        this.LJLJL = charSequence;
    }

    public C3TO(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, CharSequence charSequence, boolean z6, IMUser iMUser, boolean z7, boolean z8, EnumC96553qd enumC96553qd, boolean z9, String sessionId, String name, CharSequence content, Object obj, AbstractC82843My abstractC82843My, boolean z10, boolean z11, boolean z12, boolean z13, String timeForDisplay, int i2, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = i;
        this.LJLJJL = z4;
        this.LJLJJLL = z5;
        this.LJLJL = charSequence;
        this.LJLJLJ = z6;
        this.LJLJLLL = iMUser;
        this.LJLL = z7;
        this.LJLLI = z8;
        this.LJLLILLLL = enumC96553qd;
        this.LJLLJ = z9;
        this.LJLLL = sessionId;
        this.LJLLLL = name;
        this.LJLLLLLL = content;
        this.LJLZ = obj;
        this.LJZ = abstractC82843My;
        this.LJZI = z10;
        this.LJZL = z11;
        this.LL = z12;
        this.LLD = z13;
        this.LLF = timeForDisplay;
        this.LLFF = i2;
        this.LLFFF = j;
        this.LLFII = j2;
        this.LLFZ = 104;
    }

    public /* synthetic */ C3TO(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, CharSequence charSequence, boolean z6, IMUser iMUser, boolean z7, boolean z8, EnumC96553qd enumC96553qd, boolean z9, String str, String str2, CharSequence charSequence2, Object obj, AbstractC82843My abstractC82843My, boolean z10, boolean z11, boolean z12, boolean z13, String str3, int i2, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? false : z4, (i3 & 32) != 0 ? false : z5, (i3 & 64) != 0 ? null : charSequence, (i3 & 128) != 0 ? false : z6, (i3 & 256) != 0 ? null : iMUser, (i3 & 512) != 0 ? false : z7, (i3 & 1024) != 0 ? false : z8, (i3 & 2048) != 0 ? null : enumC96553qd, (i3 & 4096) != 0 ? false : z9, (i3 & FileUtils.BUFFER_SIZE) != 0 ? "" : str, (i3 & 16384) != 0 ? "" : str2, (32768 & i3) != 0 ? "" : charSequence2, (65536 & i3) == 0 ? obj : null, abstractC82843My, (262144 & i3) != 0 ? false : z10, (524288 & i3) != 0 ? false : z11, (1048576 & i3) != 0 ? false : z12, (2097152 & i3) != 0 ? false : z13, (4194304 & i3) == 0 ? str3 : "", (8388608 & i3) != 0 ? 0 : i2, (16777216 & i3) != 0 ? 0L : j, (i3 & 33554432) != 0 ? 0L : j2);
    }
}
