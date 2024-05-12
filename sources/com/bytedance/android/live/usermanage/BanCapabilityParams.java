package com.bytedance.android.live.usermanage;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BanCapabilityParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public final long anchorId;

    @InterfaceC65349Pkn("room_id")
    public final long roomId;

    @InterfaceC65349Pkn("scenes")
    public final List<Integer> scenes;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BanCapabilityParams() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 7
            r0 = r8
            r4 = r2
            r7 = r1
            r0.<init>(r1, r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.usermanage.BanCapabilityParams.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.scenes, Long.valueOf(this.roomId), Long.valueOf(this.anchorId)};
    }

    public BanCapabilityParams(List<Integer> scenes, long j, long j2) {
        o.LJIIIZ(scenes, "scenes");
        this.scenes = scenes;
        this.roomId = j;
        this.anchorId = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BanCapabilityParams(java.util.List r2, long r3, long r5, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r0 = r7 & 1
            if (r0 == 0) goto Ld
            java.util.List r2 = java.util.Collections.emptyList()
            java.lang.String r0 = "emptyList()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        Ld:
            r0 = r7 & 2
            if (r0 == 0) goto L13
            r3 = 0
        L13:
            r0 = r7 & 4
            if (r0 == 0) goto L19
            r5 = 0
        L19:
            r1.<init>(r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.usermanage.BanCapabilityParams.<init>(java.util.List, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
