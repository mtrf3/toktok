package com.ss.ugc.effectplatform.model;

import X.F9E;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PlatformEffect extends F9E {
    public String file_uri;
    public String hint;
    public String hint_uri;
    public String icon_uri;
    public String name;
    public List<String> requirements;
    public List<String> types;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformEffect() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformEffect copy$default(PlatformEffect platformEffect, String str, String str2, String str3, String str4, List list, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformEffect.name;
        }
        if ((i & 2) != 0) {
            str2 = platformEffect.hint;
        }
        if ((i & 4) != 0) {
            str3 = platformEffect.file_uri;
        }
        if ((i & 8) != 0) {
            str4 = platformEffect.icon_uri;
        }
        if ((i & 16) != 0) {
            list = platformEffect.types;
        }
        if ((i & 32) != 0) {
            str5 = platformEffect.hint_uri;
        }
        if ((i & 64) != 0) {
            list2 = platformEffect.requirements;
        }
        return platformEffect.copy(str, str2, str3, str4, list, str5, list2);
    }

    public final PlatformEffect copy(String str, String str2, String file_uri, String icon_uri, List<String> list, String hint_uri, List<String> list2) {
        o.LJIIJ(file_uri, "file_uri");
        o.LJIIJ(icon_uri, "icon_uri");
        o.LJIIJ(hint_uri, "hint_uri");
        return new PlatformEffect(str, str2, file_uri, icon_uri, list, hint_uri, list2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, this.hint, this.file_uri, this.icon_uri, this.types, this.hint_uri, this.requirements};
    }

    public final String getFile_uri() {
        return this.file_uri;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getHint_uri() {
        return this.hint_uri;
    }

    public final String getIcon_uri() {
        return this.icon_uri;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getRequirements() {
        return this.requirements;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setFile_uri(String str) {
        o.LJIIJ(str, "<set-?>");
        this.file_uri = str;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final void setHint_uri(String str) {
        o.LJIIJ(str, "<set-?>");
        this.hint_uri = str;
    }

    public final void setIcon_uri(String str) {
        o.LJIIJ(str, "<set-?>");
        this.icon_uri = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public final Effect toEffect(List<String> list) {
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, -1, 33554431, null);
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        effect.setName(str);
        String str3 = this.hint;
        if (str3 == null) {
            str3 = "";
        }
        effect.setHint(str3);
        effect.setFile_url(concatPrefixWithUri(list, this.file_uri));
        List<String> list2 = this.types;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        effect.setTypes(list2);
        effect.setHint_icon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIcon_url(concatPrefixWithUri(list, this.icon_uri));
        List<String> list3 = this.requirements;
        if (list3 == null) {
            list3 = new ArrayList<>();
        }
        effect.setRequirements(list3);
        String str4 = this.file_uri;
        if (str4 != null) {
            str2 = str4;
        }
        effect.setId(str2);
        return effect;
    }

    private final UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel(null, null, null, null, null, 31, null);
        urlModel.setUri(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) ListProtector.get(list, i);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(str);
                arrayList.add(X1D.LIZIZ(LIZ));
            }
            urlModel.setUrl_list(arrayList);
        }
        return urlModel;
    }

    public PlatformEffect(String str, String str2, String file_uri, String icon_uri, List<String> list, String hint_uri, List<String> list2) {
        o.LJIIJ(file_uri, "file_uri");
        o.LJIIJ(icon_uri, "icon_uri");
        o.LJIIJ(hint_uri, "hint_uri");
        this.name = str;
        this.hint = str2;
        this.file_uri = file_uri;
        this.icon_uri = icon_uri;
        this.types = list;
        this.hint_uri = hint_uri;
        this.requirements = list2;
    }

    public /* synthetic */ PlatformEffect(String str, String str2, String str3, String str4, List list, String str5, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : list, (i & 32) == 0 ? str5 : "", (i & 64) == 0 ? list2 : null);
    }
}
