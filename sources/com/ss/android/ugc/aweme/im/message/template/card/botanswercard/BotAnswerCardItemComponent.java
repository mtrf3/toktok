package com.ss.android.ugc.aweme.im.message.template.card.botanswercard;

import X.F9E;
import X.SG2;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BotAnswerCardItemComponent extends F9E implements BaseComponent {
    public static final Parcelable.Creator<BotAnswerCardItemComponent> CREATOR = new SG2();
    public final ImageComponent cover;
    public final long diggCount;
    public final ImageComponent fallback;
    public final long itemId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.itemId), Long.valueOf(this.diggCount), this.cover, this.fallback};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.itemId);
        out.writeLong(this.diggCount);
        this.cover.writeToParcel(out, i);
        this.fallback.writeToParcel(out, i);
    }

    public BotAnswerCardItemComponent(long j, long j2, ImageComponent cover, ImageComponent fallback) {
        o.LJIIIZ(cover, "cover");
        o.LJIIIZ(fallback, "fallback");
        this.itemId = j;
        this.diggCount = j2;
        this.cover = cover;
        this.fallback = fallback;
    }
}
