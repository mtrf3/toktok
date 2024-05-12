package com.ss.android.ugc.aweme.music.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class NewReleaseMusicConfigModel extends F9E {

    @InterfaceC65349Pkn("feed_music_title_new_tag_show_times_per_day")
    public final int feedMusicTitleShowTimes;

    @InterfaceC65349Pkn("feed_record_expand_animation_show_times_per_day")
    public final int feedRecordAnimationShowTimes;

    @InterfaceC65349Pkn("feed_record_expand_animation_start_time")
    public final int feedRecordAnimationStartTimes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NewReleaseMusicConfigModel() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ab.NewReleaseMusicConfigModel.<init>():void");
    }

    public static /* synthetic */ NewReleaseMusicConfigModel copy$default(NewReleaseMusicConfigModel newReleaseMusicConfigModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = newReleaseMusicConfigModel.feedMusicTitleShowTimes;
        }
        if ((i4 & 2) != 0) {
            i2 = newReleaseMusicConfigModel.feedRecordAnimationShowTimes;
        }
        if ((i4 & 4) != 0) {
            i3 = newReleaseMusicConfigModel.feedRecordAnimationStartTimes;
        }
        return newReleaseMusicConfigModel.copy(i, i2, i3);
    }

    public final NewReleaseMusicConfigModel copy(int i, int i2, int i3) {
        return new NewReleaseMusicConfigModel(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.feedMusicTitleShowTimes), Integer.valueOf(this.feedRecordAnimationShowTimes), Integer.valueOf(this.feedRecordAnimationStartTimes)};
    }

    public final int getFeedMusicTitleShowTimes() {
        return this.feedMusicTitleShowTimes;
    }

    public final int getFeedRecordAnimationShowTimes() {
        return this.feedRecordAnimationShowTimes;
    }

    public final int getFeedRecordAnimationStartTimes() {
        return this.feedRecordAnimationStartTimes;
    }

    public NewReleaseMusicConfigModel(int i, int i2, int i3) {
        this.feedMusicTitleShowTimes = i;
        this.feedRecordAnimationShowTimes = i2;
        this.feedRecordAnimationStartTimes = i3;
    }

    public /* synthetic */ NewReleaseMusicConfigModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
