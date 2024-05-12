package com.bytedance.effectcreatormobile.behaviour.view.card.extra;

import java.util.HashMap;

/* loaded from: classes34.dex */
public final class CardObjectOffset implements ICardObjectOffset {
    public final HashMap<Integer, Integer> offsetMap = new HashMap<>();

    @Override // com.bytedance.effectcreatormobile.behaviour.view.card.extra.ICardObjectOffset
    public int getScrollOffset(int i) {
        Integer num = this.offsetMap.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.view.card.extra.ICardObjectOffset
    public void updateScrollOffset(int i, int i2) {
        this.offsetMap.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
