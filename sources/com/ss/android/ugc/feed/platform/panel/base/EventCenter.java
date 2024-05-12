package com.ss.android.ugc.feed.platform.panel.base;

import X.C16880lQ;
import X.KUK;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class EventCenter extends DataCenter {
    public static final /* synthetic */ int LJLJL = 0;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter
    public final void jv0(Object obj, String str) {
    }

    public final void lv0(final KUK target, final String key, final Object obj) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(key, "key");
        if (this.LJLJJI == null) {
            this.LJLJJI = C16880lQ.LLJJJJ().getThread();
        }
        if (C16880lQ.LLLLIIIILLL() == this.LJLJJI) {
            super.jv0(obj, key);
        } else {
            this.LJLJJL.post(new Runnable() { // from class: X.8Db
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        EventCenter.this.lv0(target, key, obj);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }
}
