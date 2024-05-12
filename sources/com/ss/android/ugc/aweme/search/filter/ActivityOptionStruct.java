package com.ss.android.ugc.aweme.search.filter;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* loaded from: classes9.dex */
public final class ActivityOptionStruct implements Serializable {

    @InterfaceC65349Pkn("option_list")
    public List<SubSwitchStruct> optionStructList;

    @InterfaceC65349Pkn("title")
    public String title;

    public final List<SubSwitchStruct> getDefaultOptionStruct() {
        ArrayList arrayList = new ArrayList();
        List<SubSwitchStruct> list = this.optionStructList;
        if (list != null) {
            for (SubSwitchStruct subSwitchStruct : list) {
                SubSwitchStruct subSwitchStruct2 = new SubSwitchStruct();
                subSwitchStruct2.setDescription(subSwitchStruct.getDescription());
                subSwitchStruct2.setActivityOptionStruct(subSwitchStruct.getActivityOptionStruct());
                subSwitchStruct2.setSelected(false);
                subSwitchStruct2.setLogInfo(subSwitchStruct.getLogInfo());
                subSwitchStruct2.setName(subSwitchStruct.getName());
                subSwitchStruct2.setRequestKey(subSwitchStruct.getRequestKey());
                arrayList.add(subSwitchStruct2);
            }
        }
        return arrayList;
    }

    public final List<SubSwitchStruct> getOptionStuct() {
        List<SubSwitchStruct> list = this.optionStructList;
        if (list != null) {
            Iterator<SubSwitchStruct> it = list.iterator();
            while (it.hasNext()) {
                it.next().setActivityOptionStruct(this);
            }
        }
        return this.optionStructList;
    }

    public final boolean isDefault() {
        List<SubSwitchStruct> list = this.optionStructList;
        if (list == null) {
            return false;
        }
        Iterator<SubSwitchStruct> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        List<SubSwitchStruct> list = this.optionStructList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void reset() {
        List<SubSwitchStruct> list = this.optionStructList;
        if (list != null) {
            int i = 0;
            for (SubSwitchStruct subSwitchStruct : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SubSwitchStruct subSwitchStruct2 = subSwitchStruct;
                    if (subSwitchStruct2 != null) {
                        subSwitchStruct2.setSelected(false);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final List<SubSwitchStruct> getActivitySelectOption() {
        return this.optionStructList;
    }

    public final List<SubSwitchStruct> getOptionStructList() {
        return this.optionStructList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setLastOptionData(List<SubSwitchStruct> list) {
        SubSwitchStruct subSwitchStruct;
        if (list != null) {
            int i = 0;
            for (SubSwitchStruct subSwitchStruct2 : list) {
                int i2 = i + 1;
                String str = null;
                if (i >= 0) {
                    SubSwitchStruct subSwitchStruct3 = subSwitchStruct2;
                    String requestKey = subSwitchStruct3.getRequestKey();
                    List<SubSwitchStruct> list2 = this.optionStructList;
                    if (list2 != null && (subSwitchStruct = (SubSwitchStruct) ListProtector.get(list2, i)) != null) {
                        str = subSwitchStruct.getRequestKey();
                    }
                    if (o.LJJJJIZL(requestKey, str, false)) {
                        List<SubSwitchStruct> list3 = this.optionStructList;
                        kotlin.jvm.internal.o.LJI(list3);
                        ((SubSwitchStruct) ListProtector.get(list3, i)).setSelected(subSwitchStruct3.isSelected());
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void setOptionStructList(List<SubSwitchStruct> list) {
        this.optionStructList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void selectOption(SubSwitchStruct subSwitchStruct, boolean z) {
        List<SubSwitchStruct> list;
        if (subSwitchStruct != null && (list = this.optionStructList) != null) {
            for (SubSwitchStruct subSwitchStruct2 : list) {
                if (o.LJJJJIZL(subSwitchStruct2.getRequestKey(), subSwitchStruct.getRequestKey(), false)) {
                    subSwitchStruct2.setSelected(z);
                    return;
                }
            }
        }
    }
}
