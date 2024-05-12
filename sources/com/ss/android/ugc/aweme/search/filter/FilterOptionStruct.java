package com.ss.android.ugc.aweme.search.filter;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.ORZ;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FilterOptionStruct implements Serializable {

    @InterfaceC65349Pkn("collapsed")
    public String collapsed;

    @InterfaceC65349Pkn("option_list")
    public List<SubFilterOptionStruct> optionStructList;

    @InterfaceC65349Pkn("title")
    public String title;

    public final SubFilterOptionStruct getDefaultOption() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list != null) {
            return (SubFilterOptionStruct) ORZ.LJLLLL(list);
        }
        return null;
    }

    public final List<SubFilterOptionStruct> getOptionStuct() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list != null) {
            Iterator<SubFilterOptionStruct> it = list.iterator();
            while (it.hasNext()) {
                it.next().setFilterOptionStruct(this);
            }
        }
        return this.optionStructList;
    }

    public final SubFilterOptionStruct getSelectOption() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        SubFilterOptionStruct subFilterOptionStruct = null;
        if (list == null) {
            return null;
        }
        Iterator<SubFilterOptionStruct> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubFilterOptionStruct next = it.next();
            if (next.isSelected()) {
                subFilterOptionStruct = next;
                break;
            }
        }
        return subFilterOptionStruct;
    }

    public final boolean isEmpty() {
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void reset() {
        boolean z;
        List<SubFilterOptionStruct> list = this.optionStructList;
        if (list != null) {
            int i = 0;
            for (SubFilterOptionStruct subFilterOptionStruct : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SubFilterOptionStruct subFilterOptionStruct2 = subFilterOptionStruct;
                    boolean z2 = true;
                    if (subFilterOptionStruct2 != null) {
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        subFilterOptionStruct2.setSelected(z);
                        if (i != 0) {
                            z2 = false;
                        }
                        subFilterOptionStruct2.setDefaultOption(z2);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final String getCollapsed() {
        return this.collapsed;
    }

    public final List<SubFilterOptionStruct> getOptionStructList() {
        return this.optionStructList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void selectOption(SubFilterOptionStruct subFilterOptionStruct) {
        List<SubFilterOptionStruct> list;
        if (subFilterOptionStruct != null && (list = this.optionStructList) != null) {
            int i = 0;
            for (SubFilterOptionStruct subFilterOptionStruct2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SubFilterOptionStruct subFilterOptionStruct3 = subFilterOptionStruct2;
                    if (subFilterOptionStruct3 != null) {
                        subFilterOptionStruct3.setSelected(o.LJ(subFilterOptionStruct3, subFilterOptionStruct));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void setCollapsed(String str) {
        this.collapsed = str;
    }

    public final void setOptionStructList(List<SubFilterOptionStruct> list) {
        this.optionStructList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
