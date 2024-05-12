package com.ss.android.ugc.aweme.nows.archive.ui;

import X.C184557Md;
import X.InterfaceC87283bg;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowArchiveFeedParams implements Serializable, InterfaceC87283bg {
    public static final C184557Md Companion = new Object() { // from class: X.7Md
    };
    public final String aid;
    public final String enterFrom;
    public final String enterPosition;
    public final long landingPostTime;

    /* JADX WARN: Multi-variable type inference failed */
    public NowArchiveFeedParams() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final long getLandingPostTime() {
        return this.landingPostTime;
    }

    public NowArchiveFeedParams(long j, String aid, String str, String str2) {
        o.LJIIIZ(aid, "aid");
        this.landingPostTime = j;
        this.aid = aid;
        this.enterFrom = str;
        this.enterPosition = str2;
    }

    public /* synthetic */ NowArchiveFeedParams(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null);
    }
}
