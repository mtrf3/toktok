package com.ss.android.ugc.aweme.search.source.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ConsumptionInfoNum extends F9E {

    @InterfaceC65349Pkn("creation_effect_search_scene_num")
    public final int effectSceneNum;

    @InterfaceC65349Pkn("creation_effect_search_id_num")
    public final int effectSceneSearchIdNum;

    @InterfaceC65349Pkn("feed_scene_num")
    public final int feedSceneNum;

    @InterfaceC65349Pkn("creation_music_search_scene_num")
    public final int musicSceneNum;

    @InterfaceC65349Pkn("card_consumption_num_for_each_search")
    public final int searchCardNum;

    @InterfaceC65349Pkn("search_scene_num")
    public final int searchSceneNum;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConsumptionInfoNum() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.source.utils.ConsumptionInfoNum.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.feedSceneNum), Integer.valueOf(this.searchSceneNum), Integer.valueOf(this.searchCardNum), Integer.valueOf(this.musicSceneNum), Integer.valueOf(this.effectSceneNum), Integer.valueOf(this.effectSceneSearchIdNum)};
    }

    public ConsumptionInfoNum(int i, int i2, int i3, int i4, int i5, int i6) {
        this.feedSceneNum = i;
        this.searchSceneNum = i2;
        this.searchCardNum = i3;
        this.musicSceneNum = i4;
        this.effectSceneNum = i5;
        this.effectSceneSearchIdNum = i6;
    }

    public /* synthetic */ ConsumptionInfoNum(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 30 : i, (i7 & 2) != 0 ? 10 : i2, (i7 & 4) != 0 ? 20 : i3, (i7 & 8) == 0 ? i4 : 10, (i7 & 16) != 0 ? 3 : i5, (i7 & 32) == 0 ? i6 : 20);
    }
}
