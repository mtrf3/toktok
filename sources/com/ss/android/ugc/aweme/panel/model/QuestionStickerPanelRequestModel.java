package com.ss.android.ugc.aweme.panel.model;

import X.EnumC61872bn;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuestionStickerPanelRequestModel {

    @InterfaceC65349Pkn("count")
    public final Integer count;

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("forum_recommend_scene")
    public final int scene;

    @InterfaceC65349Pkn("collection_category")
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QuestionStickerPanelRequestModel() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.panel.model.QuestionStickerPanelRequestModel.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionStickerPanelRequestModel)) {
            return false;
        }
        QuestionStickerPanelRequestModel questionStickerPanelRequestModel = (QuestionStickerPanelRequestModel) obj;
        return o.LJ(this.cursor, questionStickerPanelRequestModel.cursor) && o.LJ(this.count, questionStickerPanelRequestModel.count) && this.type == questionStickerPanelRequestModel.type && this.scene == questionStickerPanelRequestModel.scene;
    }

    public final int hashCode() {
        Integer num = this.cursor;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.count;
        return ((((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.type) * 31) + this.scene;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionStickerPanelRequestModel(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", scene=");
        return b0.LIZJ(LIZ, this.scene, ')', LIZ);
    }

    public QuestionStickerPanelRequestModel(Integer num, Integer num2, int i, int i2) {
        this.cursor = num;
        this.count = num2;
        this.type = i;
        this.scene = i2;
    }

    public /* synthetic */ QuestionStickerPanelRequestModel(Integer num, Integer num2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : num2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? EnumC61872bn.ForumRecommendSceneCAMERA.ordinal() : i2);
    }
}
