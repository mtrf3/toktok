package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3TQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TQ implements C3TU {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public final EnumC96553qd LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final CharSequence LJLJJLL;
    public final Object LJLJL;
    public final AbstractC82843My LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final String LJLLJ;
    public final int LJLLL;
    public final long LJLLLL;
    public final long LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3TQ() {
        /*
            r21 = this;
            r1 = 0
            r3 = 0
            r15 = 0
            r19 = 65535(0xffff, float:9.1834E-41)
            r0 = r21
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r3
            r14 = r1
            r17 = r15
            r20 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TQ.<init>():void");
    }

    public static /* synthetic */ C3TQ copy$default(C3TQ c3tq, boolean z, boolean z2, EnumC96553qd enumC96553qd, String str, String str2, CharSequence charSequence, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i, long j, long j2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = c3tq.LJLIL;
        }
        if ((i2 & 2) != 0) {
            z2 = c3tq.getShowReadStatus();
        }
        if ((i2 & 4) != 0) {
            enumC96553qd = c3tq.getReadStatus();
        }
        if ((i2 & 8) != 0) {
            str = c3tq.getSessionId();
        }
        if ((i2 & 16) != 0) {
            str2 = c3tq.getName();
        }
        if ((i2 & 32) != 0) {
            charSequence = c3tq.getContent();
        }
        if ((i2 & 64) != 0) {
            obj = c3tq.getAvatar();
        }
        if ((i2 & 128) != 0) {
            abstractC82843My = c3tq.getSessionUnreadViewState();
        }
        if ((i2 & 256) != 0) {
            z3 = c3tq.isBlock();
        }
        if ((i2 & 512) != 0) {
            z4 = c3tq.isSupportMute();
        }
        if ((i2 & 1024) != 0) {
            z5 = c3tq.isMute();
        }
        if ((i2 & 2048) != 0) {
            z6 = c3tq.isCheckEmoji();
        }
        if ((i2 & 4096) != 0) {
            str3 = c3tq.getTimeForDisplay();
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            i = c3tq.getPriority();
        }
        if ((i2 & 16384) != 0) {
            j = c3tq.getSortOrder();
        }
        if ((i2 & 32768) != 0) {
            j2 = c3tq.getConversationUpdatedAt();
        }
        return c3tq.copy(z, z2, enumC96553qd, str, str2, charSequence, obj, abstractC82843My, z3, z4, z5, z6, str3, i, j, j2);
    }

    public final boolean component10() {
        return isSupportMute();
    }

    public final boolean component11() {
        return isMute();
    }

    public final boolean component12() {
        return isCheckEmoji();
    }

    public final String component13() {
        return getTimeForDisplay();
    }

    public final int component14() {
        return getPriority();
    }

    public final long component15() {
        return getSortOrder();
    }

    public final long component16() {
        return getConversationUpdatedAt();
    }

    public final boolean component2() {
        return getShowReadStatus();
    }

    public final EnumC96553qd component3() {
        return getReadStatus();
    }

    public final String component4() {
        return getSessionId();
    }

    public final String component5() {
        return getName();
    }

    public final CharSequence component6() {
        return getContent();
    }

    public final Object component7() {
        return getAvatar();
    }

    public final AbstractC82843My component8() {
        return getSessionUnreadViewState();
    }

    public final boolean component9() {
        return isBlock();
    }

    public final C3TQ copy(boolean z, boolean z2, EnumC96553qd enumC96553qd, String sessionId, String name, CharSequence content, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String timeForDisplay, int i, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        return new C3TQ(z, z2, enumC96553qd, sessionId, name, content, obj, abstractC82843My, z3, z4, z5, z6, timeForDisplay, i, j, j2);
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public C3TQ copyData() {
        return copy$default(this, false, false, null, null, null, null, null, null, false, false, false, false, null, 0, 0L, 0L, 65535, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3TQ)) {
            return false;
        }
        C3TQ c3tq = (C3TQ) obj;
        return this.LJLIL == c3tq.LJLIL && getShowReadStatus() == c3tq.getShowReadStatus() && getReadStatus() == c3tq.getReadStatus() && o.LJ(getSessionId(), c3tq.getSessionId()) && o.LJ(getName(), c3tq.getName()) && o.LJ(getContent(), c3tq.getContent()) && o.LJ(getAvatar(), c3tq.getAvatar()) && o.LJ(getSessionUnreadViewState(), c3tq.getSessionUnreadViewState()) && isBlock() == c3tq.isBlock() && isSupportMute() == c3tq.isSupportMute() && isMute() == c3tq.isMute() && isCheckEmoji() == c3tq.isCheckEmoji() && o.LJ(getTimeForDisplay(), c3tq.getTimeForDisplay()) && getPriority() == c3tq.getPriority() && getSortOrder() == c3tq.getSortOrder() && getConversationUpdatedAt() == c3tq.getConversationUpdatedAt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z = this.LJLIL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean showReadStatus = getShowReadStatus();
        int i3 = showReadStatus;
        if (showReadStatus) {
            i3 = 1;
        }
        int hashCode = (((((getContent().hashCode() + ((getName().hashCode() + ((getSessionId().hashCode() + ((((i2 + i3) * 31) + (getReadStatus() == null ? 0 : getReadStatus().hashCode())) * 31)) * 31)) * 31)) * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode())) * 31) + (getSessionUnreadViewState() != null ? getSessionUnreadViewState().hashCode() : 0)) * 31;
        boolean isBlock = isBlock();
        int i4 = isBlock;
        if (isBlock) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
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
        return "GroupChatSessionVO(hasUnreadMention=" + this.LJLIL + ", showReadStatus=" + getShowReadStatus() + ", readStatus=" + getReadStatus() + ", sessionId=" + getSessionId() + ", name=" + getName() + ", content=" + ((Object) getContent()) + ", avatar=" + getAvatar() + ", sessionUnreadViewState=" + getSessionUnreadViewState() + ", isBlock=" + isBlock() + ", isSupportMute=" + isSupportMute() + ", isMute=" + isMute() + ", isCheckEmoji=" + isCheckEmoji() + ", timeForDisplay=" + getTimeForDisplay() + ", priority=" + getPriority() + ", sortOrder=" + getSortOrder() + ", conversationUpdatedAt=" + getConversationUpdatedAt() + ')';
    }

    @Override // X.C3TU
    public boolean getHasUnreadMsg() {
        return C3TT.LIZ(this);
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public Object getAvatar() {
        return this.LJLJL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public CharSequence getContent() {
        return this.LJLJJLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public long getConversationUpdatedAt() {
        return this.LJLLLLLL;
    }

    public final boolean getHasUnreadMention() {
        return this.LJLIL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getName() {
        return this.LJLJJL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getPriority() {
        return this.LJLLL;
    }

    @Override // X.C3TU
    public EnumC96553qd getReadStatus() {
        return this.LJLJI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getSessionId() {
        return this.LJLJJI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getSessionType() {
        return this.LJLZ;
    }

    @Override // X.C3TU
    public AbstractC82843My getSessionUnreadViewState() {
        return this.LJLJLJ;
    }

    @Override // X.C3TU
    public boolean getShowReadStatus() {
        return this.LJLILLLLZI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public long getSortOrder() {
        return this.LJLLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public String getTimeForDisplay() {
        return this.LJLLJ;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public int getViewHolderType() {
        return this.LJZ;
    }

    @Override // X.C3TU
    public boolean isBlock() {
        return this.LJLJLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isCheckEmoji() {
        return this.LJLLILLLL;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isMute() {
        return this.LJLLI;
    }

    @Override // X.C3TU, X.InterfaceC82723Mm
    public boolean isSupportMute() {
        return this.LJLL;
    }

    @Override // X.C3TU
    public void setShowReadStatus(boolean z) {
        this.LJLILLLLZI = z;
    }

    public C3TQ(boolean z, boolean z2, EnumC96553qd enumC96553qd, String sessionId, String name, CharSequence content, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String timeForDisplay, int i, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = enumC96553qd;
        this.LJLJJI = sessionId;
        this.LJLJJL = name;
        this.LJLJJLL = content;
        this.LJLJL = obj;
        this.LJLJLJ = abstractC82843My;
        this.LJLJLLL = z3;
        this.LJLL = z4;
        this.LJLLI = z5;
        this.LJLLILLLL = z6;
        this.LJLLJ = timeForDisplay;
        this.LJLLL = i;
        this.LJLLLL = j;
        this.LJLLLLLL = j2;
        this.LJLZ = 20;
        this.LJZ = 105;
    }

    public /* synthetic */ C3TQ(boolean z, boolean z2, EnumC96553qd enumC96553qd, String str, String str2, CharSequence charSequence, Object obj, AbstractC82843My abstractC82843My, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : enumC96553qd, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : charSequence, (i2 & 64) != 0 ? null : obj, (i2 & 128) == 0 ? abstractC82843My : null, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? false : z5, (i2 & 2048) != 0 ? false : z6, (i2 & 4096) == 0 ? str3 : "", (i2 & FileUtils.BUFFER_SIZE) == 0 ? i : 0, (i2 & 16384) != 0 ? 0L : j, (i2 & 32768) == 0 ? j2 : 0L);
    }
}
