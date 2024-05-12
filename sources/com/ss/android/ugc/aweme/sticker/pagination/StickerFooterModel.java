package com.ss.android.ugc.aweme.sticker.pagination;

import X.TEN;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StickerFooterModel extends Effect {
    public TEN status;
    public Integer textRes;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerFooterModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final TEN getStatus() {
        return this.status;
    }

    public final Integer getTextRes() {
        return this.textRes;
    }

    public final void setStatus(TEN ten) {
        o.LJIIIZ(ten, "<set-?>");
        this.status = ten;
    }

    public final void setTextRes(Integer num) {
        this.textRes = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerFooterModel(TEN status, Integer num) {
        super(null);
        o.LJIIIZ(status, "status");
        this.status = status;
        this.textRes = num;
    }

    public /* synthetic */ StickerFooterModel(TEN ten, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TEN.LOADING : ten, (i & 2) != 0 ? null : num);
    }
}
