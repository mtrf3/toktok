package com.ss.android.ugc.aweme.tools.beauty.data;

import X.C83182Wkk;
import X.F9E;
import X.HH1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class NoneComposer extends F9E {
    public static final C83182Wkk Companion = new C83182Wkk();
    public final String effectId;
    public final int iconResId;
    public final String itemName;
    public final String resourceId;

    public static /* synthetic */ NoneComposer copy$default(NoneComposer noneComposer, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noneComposer.effectId;
        }
        if ((i2 & 2) != 0) {
            str2 = noneComposer.resourceId;
        }
        if ((i2 & 4) != 0) {
            i = noneComposer.iconResId;
        }
        if ((i2 & 8) != 0) {
            str3 = noneComposer.itemName;
        }
        return noneComposer.copy(str, str2, i, str3);
    }

    public final NoneComposer copy(String effectId, String resourceId, int i, String itemName) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(itemName, "itemName");
        return new NoneComposer(effectId, resourceId, i, itemName);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.effectId, this.resourceId, Integer.valueOf(this.iconResId), this.itemName};
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public NoneComposer(String str, String str2, int i, String str3) {
        HH1.LIZ(str, "effectId", str2, "resourceId", str3, "itemName");
        this.effectId = str;
        this.resourceId = str2;
        this.iconResId = i;
        this.itemName = str3;
    }
}
