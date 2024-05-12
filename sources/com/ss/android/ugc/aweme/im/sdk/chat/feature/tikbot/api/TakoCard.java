package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoCard {

    @InterfaceC65349Pkn("card_type")
    public final Integer cardType;

    @InterfaceC65349Pkn("content_pb")
    public final String contentPB;

    @InterfaceC65349Pkn("message_type")
    public final Integer msgType;

    @InterfaceC65349Pkn("uuid")
    public final String uuid;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoCard() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoCard)) {
            return false;
        }
        TakoCard takoCard = (TakoCard) obj;
        return o.LJ(this.cardType, takoCard.cardType) && o.LJ(this.contentPB, takoCard.contentPB) && o.LJ(this.msgType, takoCard.msgType) && o.LJ(this.uuid, takoCard.uuid);
    }

    public final int hashCode() {
        Integer num = this.cardType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.contentPB;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.msgType;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.uuid;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoCard(cardType=");
        LIZ.append(this.cardType);
        LIZ.append(", contentPB=");
        LIZ.append(this.contentPB);
        LIZ.append(", msgType=");
        LIZ.append(this.msgType);
        LIZ.append(", uuid=");
        return q.LIZIZ(LIZ, this.uuid, ')', LIZ);
    }

    public TakoCard(Integer num, String str, Integer num2, String str2) {
        this.cardType = num;
        this.contentPB = str;
        this.msgType = num2;
        this.uuid = str2;
    }

    public /* synthetic */ TakoCard(Integer num, String str, Integer num2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2);
    }
}
