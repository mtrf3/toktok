package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ComponentData implements Serializable {

    @InterfaceC65349Pkn("card_info")
    public final CardStruct cardInfo;

    public static /* synthetic */ ComponentData copy$default(ComponentData componentData, CardStruct cardStruct, int i, Object obj) {
        if ((i & 1) != 0) {
            cardStruct = componentData.cardInfo;
        }
        return componentData.copy(cardStruct);
    }

    public final ComponentData copy(CardStruct cardStruct) {
        return new ComponentData(cardStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentData) && o.LJ(this.cardInfo, ((ComponentData) obj).cardInfo);
    }

    public int hashCode() {
        CardStruct cardStruct = this.cardInfo;
        if (cardStruct == null) {
            return 0;
        }
        return cardStruct.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComponentData(cardInfo=");
        LIZ.append(this.cardInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final CardStruct getCardInfo() {
        return this.cardInfo;
    }

    public ComponentData(CardStruct cardStruct) {
        this.cardInfo = cardStruct;
    }
}
