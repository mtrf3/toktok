package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3TS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TS implements InterfaceC82723Mm {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final CharSequence LJLJJI;
    public final Object LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final String LJLJLLL;
    public final int LJLL;
    public final long LJLLI;
    public final long LJLLILLLL;
    public final int LJLLJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3TS() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r11 = 0
            r15 = 4095(0xfff, float:5.738E-42)
            r0 = r17
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r2
            r10 = r1
            r13 = r11
            r16 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TS.<init>():void");
    }

    public static /* synthetic */ C3TS copy$default(C3TS c3ts, int i, String str, String str2, CharSequence charSequence, Object obj, boolean z, boolean z2, boolean z3, String str3, int i2, long j, long j2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = c3ts.getSessionType();
        }
        if ((i3 & 2) != 0) {
            str = c3ts.getSessionId();
        }
        if ((i3 & 4) != 0) {
            str2 = c3ts.getName();
        }
        if ((i3 & 8) != 0) {
            charSequence = c3ts.getContent();
        }
        if ((i3 & 16) != 0) {
            obj = c3ts.getAvatar();
        }
        if ((i3 & 32) != 0) {
            z = c3ts.isSupportMute();
        }
        if ((i3 & 64) != 0) {
            z2 = c3ts.isMute();
        }
        if ((i3 & 128) != 0) {
            z3 = c3ts.isCheckEmoji();
        }
        if ((i3 & 256) != 0) {
            str3 = c3ts.getTimeForDisplay();
        }
        if ((i3 & 512) != 0) {
            i2 = c3ts.getPriority();
        }
        if ((i3 & 1024) != 0) {
            j = c3ts.getSortOrder();
        }
        if ((i3 & 2048) != 0) {
            j2 = c3ts.getConversationUpdatedAt();
        }
        return c3ts.copy(i, str, str2, charSequence, obj, z, z2, z3, str3, i2, j, j2);
    }

    public final int component1() {
        return getSessionType();
    }

    public final int component10() {
        return getPriority();
    }

    public final long component11() {
        return getSortOrder();
    }

    public final long component12() {
        return getConversationUpdatedAt();
    }

    public final String component2() {
        return getSessionId();
    }

    public final String component3() {
        return getName();
    }

    public final CharSequence component4() {
        return getContent();
    }

    public final Object component5() {
        return getAvatar();
    }

    public final boolean component6() {
        return isSupportMute();
    }

    public final boolean component7() {
        return isMute();
    }

    public final boolean component8() {
        return isCheckEmoji();
    }

    public final String component9() {
        return getTimeForDisplay();
    }

    public final C3TS copy(int i, String sessionId, String name, CharSequence content, Object obj, boolean z, boolean z2, boolean z3, String timeForDisplay, int i2, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        return new C3TS(i, sessionId, name, content, obj, z, z2, z3, timeForDisplay, i2, j, j2);
    }

    @Override // X.InterfaceC82723Mm
    public C3TS copyData() {
        return copy$default(this, 0, null, null, null, null, false, false, false, null, 0, 0L, 0L, 4095, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3TS)) {
            return false;
        }
        C3TS c3ts = (C3TS) obj;
        return getSessionType() == c3ts.getSessionType() && o.LJ(getSessionId(), c3ts.getSessionId()) && o.LJ(getName(), c3ts.getName()) && o.LJ(getContent(), c3ts.getContent()) && o.LJ(getAvatar(), c3ts.getAvatar()) && isSupportMute() == c3ts.isSupportMute() && isMute() == c3ts.isMute() && isCheckEmoji() == c3ts.isCheckEmoji() && o.LJ(getTimeForDisplay(), c3ts.getTimeForDisplay()) && getPriority() == c3ts.getPriority() && getSortOrder() == c3ts.getSortOrder() && getConversationUpdatedAt() == c3ts.getConversationUpdatedAt();
    }

    public int hashCode() {
        int hashCode = (((getContent().hashCode() + ((getName().hashCode() + ((getSessionId().hashCode() + (getSessionType() * 31)) * 31)) * 31)) * 31) + (getAvatar() == null ? 0 : getAvatar().hashCode())) * 31;
        boolean isSupportMute = isSupportMute();
        int i = isSupportMute;
        if (isSupportMute) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean isMute = isMute();
        int i3 = isMute;
        if (isMute) {
            i3 = 1;
        }
        return C16880lQ.LLJIJIL(getConversationUpdatedAt()) + ((C16880lQ.LLJIJIL(getSortOrder()) + ((getPriority() + ((getTimeForDisplay().hashCode() + ((((i2 + i3) * 31) + (isCheckEmoji() ? 1 : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DefaultSessionVO(sessionType=" + getSessionType() + ", sessionId=" + getSessionId() + ", name=" + getName() + ", content=" + ((Object) getContent()) + ", avatar=" + getAvatar() + ", isSupportMute=" + isSupportMute() + ", isMute=" + isMute() + ", isCheckEmoji=" + isCheckEmoji() + ", timeForDisplay=" + getTimeForDisplay() + ", priority=" + getPriority() + ", sortOrder=" + getSortOrder() + ", conversationUpdatedAt=" + getConversationUpdatedAt() + ')';
    }

    @Override // X.InterfaceC82723Mm
    public Object getAvatar() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC82723Mm
    public CharSequence getContent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC82723Mm
    public long getConversationUpdatedAt() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC82723Mm
    public String getName() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC82723Mm
    public int getPriority() {
        return this.LJLL;
    }

    @Override // X.InterfaceC82723Mm
    public String getSessionId() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC82723Mm
    public int getSessionType() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC82723Mm
    public long getSortOrder() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82723Mm
    public String getTimeForDisplay() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC82723Mm
    public int getViewHolderType() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC82723Mm
    public boolean isCheckEmoji() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC82723Mm
    public boolean isMute() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC82723Mm
    public boolean isSupportMute() {
        return this.LJLJJLL;
    }

    public C3TS(int i, String sessionId, String name, CharSequence content, Object obj, boolean z, boolean z2, boolean z3, String timeForDisplay, int i2, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        this.LJLIL = i;
        this.LJLILLLLZI = sessionId;
        this.LJLJI = name;
        this.LJLJJI = content;
        this.LJLJJL = obj;
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJLJ = z3;
        this.LJLJLLL = timeForDisplay;
        this.LJLL = i2;
        this.LJLLI = j;
        this.LJLLILLLL = j2;
        this.LJLLJ = 100;
    }

    public /* synthetic */ C3TS(int i, String str, String str2, CharSequence charSequence, Object obj, boolean z, boolean z2, boolean z3, String str3, int i2, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 99 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : charSequence, (i3 & 16) != 0 ? null : obj, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) == 0 ? str3 : "", (i3 & 512) == 0 ? i2 : 0, (i3 & 1024) != 0 ? 0L : j, (i3 & 2048) == 0 ? j2 : 0L);
    }
}
