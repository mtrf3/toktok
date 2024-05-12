package com.ss.ugc.effectplatform.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class CategoryEffectModel {
    public List<? extends Effect> bind_effects;
    public String category_key;
    public List<? extends Effect> collection;
    public int cursor;
    public List<? extends Effect> effects;
    public boolean has_more;
    public boolean isCache;
    public int sorting_position;
    public String version;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CategoryEffectModel() {
        /*
            r11 = this;
            r1 = 0
            r3 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r1
            r7 = r1
            r8 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.CategoryEffectModel.<init>():void");
    }

    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCategory_effects() {
        return this.effects;
    }

    public String getCategory_key() {
        return this.category_key;
    }

    public List<Effect> getCollection() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public int getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public void setBind_effects(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setCategory_effects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.effects = value;
    }

    public void setCategory_key(String str) {
        o.LJIIJ(str, "<set-?>");
        this.category_key = str;
    }

    public void setCollection(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.collection = list;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSorting_position(int i) {
        this.sorting_position = i;
    }

    public void setVersion(String str) {
        o.LJIIJ(str, "<set-?>");
        this.version = str;
    }

    public CategoryEffectModel(String category_key, String version, boolean z, int i, int i2, List<? extends Effect> collection, List<? extends Effect> effects, List<? extends Effect> bind_effects) {
        o.LJIIJ(category_key, "category_key");
        o.LJIIJ(version, "version");
        o.LJIIJ(collection, "collection");
        o.LJIIJ(effects, "effects");
        o.LJIIJ(bind_effects, "bind_effects");
        this.category_key = category_key;
        this.version = version;
        this.has_more = z;
        this.cursor = i;
        this.sorting_position = i2;
        this.collection = collection;
        this.effects = effects;
        this.bind_effects = bind_effects;
    }

    public /* synthetic */ CategoryEffectModel(String str, String str2, boolean z, int i, int i2, List list, List list2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? new ArrayList() : list, (i3 & 64) != 0 ? new ArrayList() : list2, (i3 & 128) != 0 ? new ArrayList() : list3);
    }
}
