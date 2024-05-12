package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ExtAppLogConfig extends F9E {

    @InterfaceC65349Pkn("play_end_attr_num")
    public final int playEndAttrNum;

    @InterfaceC65349Pkn("play_end_num")
    public final int playEndNum;

    @InterfaceC65349Pkn("playing_attr_num")
    public final int playingAttrNum;

    @InterfaceC65349Pkn("playing_num")
    public final int playingNum;

    @InterfaceC65349Pkn("pre_play_attr_num")
    public final int prePlayAttrNum;

    @InterfaceC65349Pkn("pre_play_num")
    public final int prePlayNum;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtAppLogConfig() {
        /*
            r9 = this;
            r1 = 0
            r7 = 63
            r8 = 0
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.ExtAppLogConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.prePlayNum), Integer.valueOf(this.playingNum), Integer.valueOf(this.playEndNum), Integer.valueOf(this.prePlayAttrNum), Integer.valueOf(this.playingAttrNum), Integer.valueOf(this.playEndAttrNum)};
    }

    public ExtAppLogConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.prePlayNum = i;
        this.playingNum = i2;
        this.playEndNum = i3;
        this.prePlayAttrNum = i4;
        this.playingAttrNum = i5;
        this.playEndAttrNum = i6;
    }

    public /* synthetic */ ExtAppLogConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) == 0 ? i3 : 0, (i7 & 8) != 0 ? 1 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 1 : i6);
    }
}
