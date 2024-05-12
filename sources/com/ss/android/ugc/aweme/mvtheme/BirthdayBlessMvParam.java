package com.ss.android.ugc.aweme.mvtheme;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.ORZ;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BirthdayBlessMvParam extends F9E implements Serializable {

    @InterfaceC65349Pkn("template_items")
    public final List<BirthdayEffectTemplate> templateItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BirthdayBlessMvParam copy$default(BirthdayBlessMvParam birthdayBlessMvParam, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = birthdayBlessMvParam.templateItems;
        }
        return birthdayBlessMvParam.copy(list);
    }

    public final BirthdayBlessMvParam copy(List<BirthdayEffectTemplate> templateItems) {
        o.LJIIIZ(templateItems, "templateItems");
        return new BirthdayBlessMvParam(templateItems);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.templateItems};
    }

    public final int getTemplateCount() {
        return this.templateItems.size();
    }

    public final List<BirthdayEffectTemplate> getTemplateItems() {
        return this.templateItems;
    }

    public BirthdayBlessMvParam(List<BirthdayEffectTemplate> templateItems) {
        o.LJIIIZ(templateItems, "templateItems");
        this.templateItems = templateItems;
    }

    public final BirthdayEffectTemplate getCurrentTemplate(String str) {
        BirthdayEffectTemplate birthdayEffectTemplate;
        Iterator<BirthdayEffectTemplate> it = this.templateItems.iterator();
        while (true) {
            if (it.hasNext()) {
                birthdayEffectTemplate = it.next();
                if (o.LJ(birthdayEffectTemplate.getEffectId(), str)) {
                    break;
                }
            } else {
                birthdayEffectTemplate = null;
                break;
            }
        }
        return birthdayEffectTemplate;
    }

    public final BirthdayEffectTemplate getNextTemplate(String str) {
        int i;
        List<BirthdayEffectTemplate> list = this.templateItems;
        ListIterator<BirthdayEffectTemplate> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (o.LJ(listIterator.previous().getEffectId(), str)) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        BirthdayEffectTemplate birthdayEffectTemplate = (BirthdayEffectTemplate) ORZ.LJLLLLLL(i + 1, this.templateItems);
        if (birthdayEffectTemplate != null) {
            return birthdayEffectTemplate;
        }
        return (BirthdayEffectTemplate) ORZ.LJLLLL(this.templateItems);
    }
}
