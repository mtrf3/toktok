package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.3TR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TR implements InterfaceC82723Mm {
    public final boolean LJLIL;
    public final AbstractC82843My LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final CharSequence LJLJJLL;
    public final Object LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final String LJLLI;
    public final int LJLLILLLL;
    public final long LJLLJ;
    public final long LJLLL;
    public final int LJLLLL;
    public final int LJLLLLLL;

    public static /* synthetic */ C3TR copy$default(C3TR c3tr, boolean z, AbstractC82843My abstractC82843My, boolean z2, String str, String str2, CharSequence charSequence, Object obj, boolean z3, boolean z4, boolean z5, String str3, int i, long j, long j2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = c3tr.LJLIL;
        }
        if ((i2 & 2) != 0) {
            abstractC82843My = c3tr.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z2 = c3tr.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str = c3tr.getSessionId();
        }
        if ((i2 & 16) != 0) {
            str2 = c3tr.getName();
        }
        if ((i2 & 32) != 0) {
            charSequence = c3tr.getContent();
        }
        if ((i2 & 64) != 0) {
            obj = c3tr.getAvatar();
        }
        if ((i2 & 128) != 0) {
            z3 = c3tr.isSupportMute();
        }
        if ((i2 & 256) != 0) {
            z4 = c3tr.isMute();
        }
        if ((i2 & 512) != 0) {
            z5 = c3tr.isCheckEmoji();
        }
        if ((i2 & 1024) != 0) {
            str3 = c3tr.getTimeForDisplay();
        }
        if ((i2 & 2048) != 0) {
            i = c3tr.getPriority();
        }
        if ((i2 & 4096) != 0) {
            j = c3tr.getSortOrder();
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            j2 = c3tr.getConversationUpdatedAt();
        }
        return c3tr.copy(z, abstractC82843My, z2, str, str2, charSequence, obj, z3, z4, z5, str3, i, j, j2);
    }

    public final boolean component10() {
        return isCheckEmoji();
    }

    public final String component11() {
        return getTimeForDisplay();
    }

    public final int component12() {
        return getPriority();
    }

    public final long component13() {
        return getSortOrder();
    }

    public final long component14() {
        return getConversationUpdatedAt();
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

    public final boolean component8() {
        return isSupportMute();
    }

    public final boolean component9() {
        return isMute();
    }

    public final C3TR copy(boolean z, AbstractC82843My abstractC82843My, boolean z2, String sessionId, String name, CharSequence content, Object obj, boolean z3, boolean z4, boolean z5, String timeForDisplay, int i, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        return new C3TR(z, abstractC82843My, z2, sessionId, name, content, obj, z3, z4, z5, timeForDisplay, i, j, j2);
    }

    @Override // X.InterfaceC82723Mm
    public C3TR copyData() {
        return copy$default(this, false, null, false, null, null, null, null, false, false, false, null, 0, 0L, 0L, 16383, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3TR)) {
            return false;
        }
        C3TR c3tr = (C3TR) obj;
        return this.LJLIL == c3tr.LJLIL && o.LJ(this.LJLILLLLZI, c3tr.LJLILLLLZI) && this.LJLJI == c3tr.LJLJI && o.LJ(getSessionId(), c3tr.getSessionId()) && o.LJ(getName(), c3tr.getName()) && o.LJ(getContent(), c3tr.getContent()) && o.LJ(getAvatar(), c3tr.getAvatar()) && isSupportMute() == c3tr.isSupportMute() && isMute() == c3tr.isMute() && isCheckEmoji() == c3tr.isCheckEmoji() && o.LJ(getTimeForDisplay(), c3tr.getTimeForDisplay()) && getPriority() == c3tr.getPriority() && getSortOrder() == c3tr.getSortOrder() && getConversationUpdatedAt() == c3tr.getConversationUpdatedAt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z = this.LJLIL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        AbstractC82843My abstractC82843My = this.LJLILLLLZI;
        int hashCode = (i2 + (abstractC82843My == null ? 0 : abstractC82843My.hashCode())) * 31;
        boolean z2 = this.LJLJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode2 = (((getContent().hashCode() + ((getName().hashCode() + ((getSessionId().hashCode() + ((hashCode + i3) * 31)) * 31)) * 31)) * 31) + (getAvatar() != null ? getAvatar().hashCode() : 0)) * 31;
        boolean isSupportMute = isSupportMute();
        int i4 = isSupportMute;
        if (isSupportMute) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean isMute = isMute();
        int i6 = isMute;
        if (isMute) {
            i6 = 1;
        }
        return C16880lQ.LLJIJIL(getConversationUpdatedAt()) + ((C16880lQ.LLJIJIL(getSortOrder()) + ((getPriority() + ((getTimeForDisplay().hashCode() + ((((i5 + i6) * 31) + (isCheckEmoji() ? 1 : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MessageRequestCellVO(showRightArrow=" + this.LJLIL + ", sessionUnreadViewState=" + this.LJLILLLLZI + ", hasUnreadMsg=" + this.LJLJI + ", sessionId=" + getSessionId() + ", name=" + getName() + ", content=" + ((Object) getContent()) + ", avatar=" + getAvatar() + ", isSupportMute=" + isSupportMute() + ", isMute=" + isMute() + ", isCheckEmoji=" + isCheckEmoji() + ", timeForDisplay=" + getTimeForDisplay() + ", priority=" + getPriority() + ", sortOrder=" + getSortOrder() + ", conversationUpdatedAt=" + getConversationUpdatedAt() + ')';
    }

    @Override // X.InterfaceC82723Mm
    public Object getAvatar() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC82723Mm
    public CharSequence getContent() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC82723Mm
    public long getConversationUpdatedAt() {
        return this.LJLLL;
    }

    public final boolean getHasUnreadMsg() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC82723Mm
    public String getName() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC82723Mm
    public int getPriority() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC82723Mm
    public String getSessionId() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC82723Mm
    public int getSessionType() {
        return this.LJLLLL;
    }

    public final AbstractC82843My getSessionUnreadViewState() {
        return this.LJLILLLLZI;
    }

    public final boolean getShowRightArrow() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC82723Mm
    public long getSortOrder() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC82723Mm
    public String getTimeForDisplay() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82723Mm
    public int getViewHolderType() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC82723Mm
    public boolean isCheckEmoji() {
        return this.LJLL;
    }

    @Override // X.InterfaceC82723Mm
    public boolean isMute() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC82723Mm
    public boolean isSupportMute() {
        return this.LJLJLJ;
    }

    public C3TR(boolean z, AbstractC82843My abstractC82843My, boolean z2, String sessionId, String name, CharSequence content, Object obj, boolean z3, boolean z4, boolean z5, String timeForDisplay, int i, long j, long j2) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(timeForDisplay, "timeForDisplay");
        this.LJLIL = z;
        this.LJLILLLLZI = abstractC82843My;
        this.LJLJI = z2;
        this.LJLJJI = sessionId;
        this.LJLJJL = name;
        this.LJLJJLL = content;
        this.LJLJL = obj;
        this.LJLJLJ = z3;
        this.LJLJLLL = z4;
        this.LJLL = z5;
        this.LJLLI = timeForDisplay;
        this.LJLLILLLL = i;
        this.LJLLJ = j;
        this.LJLLL = j2;
        this.LJLLLL = 2;
        this.LJLLLLLL = 107;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C3TR(boolean r19, X.AbstractC82843My r20, boolean r21, java.lang.String r22, java.lang.String r23, java.lang.CharSequence r24, java.lang.Object r25, boolean r26, boolean r27, boolean r28, java.lang.String r29, int r30, long r31, long r33, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r18 = this;
            r1 = r35
            r14 = r31
            r13 = r30
            r11 = r28
            r10 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r2 = r19
            r9 = r26
            r0 = r1 & 1
            r4 = 1
            if (r0 == 0) goto L1c
            r2 = 1
        L1c:
            r0 = r1 & 4
            r3 = r20
            if (r0 == 0) goto L72
            boolean r0 = r3 instanceof X.C82483Lo
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof X.C82493Lp
            if (r0 == 0) goto L70
        L2a:
            r0 = r1 & 8
            java.lang.String r12 = ""
            if (r0 == 0) goto L31
            r5 = r12
        L31:
            r0 = r1 & 16
            if (r0 == 0) goto L36
            r6 = r12
        L36:
            r0 = r1 & 32
            if (r0 == 0) goto L3b
            r7 = r12
        L3b:
            r0 = r1 & 64
            if (r0 == 0) goto L40
            r8 = 0
        L40:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L45
            r9 = 0
        L45:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4a
            r10 = 0
        L4a:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L4f
            r11 = 0
        L4f:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6d
        L53:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L58
            r13 = 0
        L58:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            r16 = 0
            if (r0 == 0) goto L60
            r14 = 0
        L60:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L6a
        L64:
            r1 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16)
            return
        L6a:
            r16 = r33
            goto L64
        L6d:
            r12 = r29
            goto L53
        L70:
            r4 = 0
            goto L2a
        L72:
            r4 = r21
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TR.<init>(boolean, X.3My, boolean, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.Object, boolean, boolean, boolean, java.lang.String, int, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
