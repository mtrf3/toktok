package com.ss.android.ugc.aweme.actionai.config;

import X.C221108m2;
import X.C62822Ol8;
import X.C83443Wox;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class ActionAITopKConfig {
    public static final ActionAITopK LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C83443Wox.LJLIL);

    static {
        int i = 0;
        LIZ = new ActionAITopK(i, i, i, 7, null);
    }

    /* loaded from: classes15.dex */
    public static final class ActionAITopK {

        @InterfaceC65349Pkn("music")
        public final int musicTopK;

        @InterfaceC65349Pkn("template")
        public final int templateTopK;

        @InterfaceC65349Pkn("text_sticker")
        public final int textStickerTopK;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ActionAITopK() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.actionai.config.ActionAITopKConfig.ActionAITopK.<init>():void");
        }

        public ActionAITopK(int i, int i2, int i3) {
            this.musicTopK = i;
            this.templateTopK = i2;
            this.textStickerTopK = i3;
        }

        public /* synthetic */ ActionAITopK(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 5 : i, (i4 & 2) != 0 ? 5 : i2, (i4 & 4) != 0 ? 5 : i3);
        }
    }
}
