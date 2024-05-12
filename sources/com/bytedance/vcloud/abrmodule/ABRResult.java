package com.bytedance.vcloud.abrmodule;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class ABRResult {
    public List<ABRResultElement> elements = new ArrayList();

    public int size() {
        return this.elements.size();
    }

    public void add(ABRResultElement aBRResultElement) {
        this.elements.add(aBRResultElement);
    }

    public ABRResultElement get(int i) {
        return (ABRResultElement) ListProtector.get(this.elements, i);
    }
}
