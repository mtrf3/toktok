package com.ss.android.ugc.aweme.inbox;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class InboxCollapseMetas extends F9E {

    @InterfaceC65349Pkn("dm_max_threshold_hide_recommend")
    public final int dmMaxThresholdHideRecommend;

    @InterfaceC65349Pkn("dm_no_update_days")
    public final int dmNoUpdateDays;

    @InterfaceC65349Pkn("dm_no_update_display_count")
    public final int dmNoUpdateDisplayCount;

    @InterfaceC65349Pkn("enter_inbox_meta")
    public final InboxCollapseMeta enterInboxMeta;

    @InterfaceC65349Pkn("expand_meta")
    public final InboxCollapseMeta expandMeta;

    @InterfaceC65349Pkn("notice_display_count")
    public final int noticeDisplayCount;

    @InterfaceC65349Pkn("notice_display_recently")
    public final int noticeDisplayRecently;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InboxCollapseMetas() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.InboxCollapseMetas.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.enterInboxMeta, this.expandMeta, Integer.valueOf(this.noticeDisplayCount), Integer.valueOf(this.noticeDisplayRecently), Integer.valueOf(this.dmNoUpdateDays), Integer.valueOf(this.dmNoUpdateDisplayCount), Integer.valueOf(this.dmMaxThresholdHideRecommend)};
    }

    public InboxCollapseMetas(InboxCollapseMeta enterInboxMeta, InboxCollapseMeta expandMeta, int i, int i2, int i3, int i4, int i5) {
        o.LJIIIZ(enterInboxMeta, "enterInboxMeta");
        o.LJIIIZ(expandMeta, "expandMeta");
        this.enterInboxMeta = enterInboxMeta;
        this.expandMeta = expandMeta;
        this.noticeDisplayCount = i;
        this.noticeDisplayRecently = i2;
        this.dmNoUpdateDays = i3;
        this.dmNoUpdateDisplayCount = i4;
        this.dmMaxThresholdHideRecommend = i5;
    }

    public /* synthetic */ InboxCollapseMetas(InboxCollapseMeta inboxCollapseMeta, InboxCollapseMeta inboxCollapseMeta2, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? new InboxCollapseMeta(0, 0, 0, 7, null) : inboxCollapseMeta, (i6 & 2) != 0 ? new InboxCollapseMeta(0, 0, 0, 7, null) : inboxCollapseMeta2, (i6 & 4) != 0 ? 3 : i, (i6 & 8) != 0 ? 24 : i2, (i6 & 16) != 0 ? 14 : i3, (i6 & 32) != 0 ? 4 : i4, (i6 & 64) != 0 ? 5 : i5);
    }
}
