package com.ss.android.ugc.aweme.mvtheme;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BirthdayEffectTemplate extends F9E implements Serializable {

    @InterfaceC65349Pkn("effect_id")
    public final String effectId;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("name")
    public final String name;

    public static /* synthetic */ BirthdayEffectTemplate copy$default(BirthdayEffectTemplate birthdayEffectTemplate, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birthdayEffectTemplate.effectId;
        }
        if ((i & 2) != 0) {
            str2 = birthdayEffectTemplate.name;
        }
        if ((i & 4) != 0) {
            str3 = birthdayEffectTemplate.iconUrl;
        }
        return birthdayEffectTemplate.copy(str, str2, str3);
    }

    public final BirthdayEffectTemplate copy(String effectId, String name, String iconUrl) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(iconUrl, "iconUrl");
        return new BirthdayEffectTemplate(effectId, name, iconUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.effectId, this.name, this.iconUrl};
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public BirthdayEffectTemplate(String str, String str2, String str3) {
        HH1.LIZ(str, "effectId", str2, "name", str3, "iconUrl");
        this.effectId = str;
        this.name = str2;
        this.iconUrl = str3;
    }
}
