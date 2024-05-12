package com.ss.android.ugc.aweme.net.model;

import X.C1NE;
import X.C79062V1e;
import X.OJD;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class UnexpectedConfig {
    public final String id;
    public final String pattern;
    public OJD regex;
    public final int scope;
    public List<String> targets;
    public final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnexpectedConfig copy$default(UnexpectedConfig unexpectedConfig, String str, int i, int i2, String str2, OJD ojd, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = unexpectedConfig.pattern;
        }
        if ((i3 & 2) != 0) {
            i = unexpectedConfig.scope;
        }
        if ((i3 & 4) != 0) {
            i2 = unexpectedConfig.type;
        }
        if ((i3 & 8) != 0) {
            str2 = unexpectedConfig.id;
        }
        if ((i3 & 16) != 0) {
            ojd = unexpectedConfig.regex;
        }
        if ((i3 & 32) != 0) {
            list = unexpectedConfig.targets;
        }
        return unexpectedConfig.copy(str, i, i2, str2, ojd, list);
    }

    public final UnexpectedConfig copy(String pattern, int i, int i2, String id, OJD ojd, List<String> list) {
        o.LJIIIZ(pattern, "pattern");
        o.LJIIIZ(id, "id");
        return new UnexpectedConfig(pattern, i, i2, id, ojd, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnexpectedConfig)) {
            return false;
        }
        UnexpectedConfig unexpectedConfig = (UnexpectedConfig) obj;
        return o.LJ(this.pattern, unexpectedConfig.pattern) && this.scope == unexpectedConfig.scope && this.type == unexpectedConfig.type && o.LJ(this.id, unexpectedConfig.id) && o.LJ(this.regex, unexpectedConfig.regex) && o.LJ(this.targets, unexpectedConfig.targets);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.id, ((((this.pattern.hashCode() * 31) + this.scope) * 31) + this.type) * 31, 31);
        OJD ojd = this.regex;
        int i = 0;
        if (ojd == null) {
            hashCode = 0;
        } else {
            hashCode = ojd.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        List<String> list = this.targets;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnexpectedConfig(pattern=");
        LIZ.append(this.pattern);
        LIZ.append(", scope=");
        LIZ.append(this.scope);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", regex=");
        LIZ.append(this.regex);
        LIZ.append(", targets=");
        return C1NE.LIZIZ(LIZ, this.targets, ')', LIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final OJD getRegex() {
        return this.regex;
    }

    public final int getScope() {
        return this.scope;
    }

    public final List<String> getTargets() {
        return this.targets;
    }

    public final int getType() {
        return this.type;
    }

    public final void setRegex(OJD ojd) {
        this.regex = ojd;
    }

    public final void setTargets(List<String> list) {
        this.targets = list;
    }

    public UnexpectedConfig(String pattern, int i, int i2, String id, OJD ojd, List<String> list) {
        o.LJIIIZ(pattern, "pattern");
        o.LJIIIZ(id, "id");
        this.pattern = pattern;
        this.scope = i;
        this.type = i2;
        this.id = id;
        this.regex = ojd;
        this.targets = list;
    }

    public /* synthetic */ UnexpectedConfig(String str, int i, int i2, String str2, OJD ojd, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, (i3 & 16) != 0 ? null : ojd, (i3 & 32) == 0 ? list : null);
    }
}
