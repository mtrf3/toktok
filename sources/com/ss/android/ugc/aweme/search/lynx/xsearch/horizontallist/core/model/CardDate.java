package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class CardDate extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("aweme_index")
    public final int awemeIndex;

    @InterfaceC65349Pkn("tab_index")
    public final int tabIndex;

    public static /* synthetic */ CardDate copy$default(CardDate cardDate, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardDate.tabIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = cardDate.awemeIndex;
        }
        return cardDate.copy(i, i2);
    }

    public final CardDate copy(int i, int i2) {
        return new CardDate(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.tabIndex), Integer.valueOf(this.awemeIndex)};
    }

    public final int getAwemeIndex() {
        return this.awemeIndex;
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }

    public CardDate(int i, int i2) {
        this.tabIndex = i;
        this.awemeIndex = i2;
    }
}
