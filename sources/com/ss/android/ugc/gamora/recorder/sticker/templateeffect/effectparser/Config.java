package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Config {

    @InterfaceC65349Pkn("bALG_BACH_CONFIG")
    public final Boolean bAlgBachConfig;

    @InterfaceC65349Pkn("effect")
    public final Effect effect;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("TiktokEffectHouse")
    public final TiktokEffectHouse tiktokEffectHouse;

    @InterfaceC65349Pkn("version")
    public final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public Config() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return o.LJ(this.bAlgBachConfig, config.bAlgBachConfig) && o.LJ(this.effect, config.effect) && o.LJ(this.name, config.name) && o.LJ(this.version, config.version) && o.LJ(this.tiktokEffectHouse, config.tiktokEffectHouse);
    }

    public final int hashCode() {
        Boolean bool = this.bAlgBachConfig;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Effect effect = this.effect;
        int hashCode2 = (hashCode + (effect == null ? 0 : effect.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TiktokEffectHouse tiktokEffectHouse = this.tiktokEffectHouse;
        return hashCode4 + (tiktokEffectHouse != null ? tiktokEffectHouse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(bAlgBachConfig=");
        LIZ.append(this.bAlgBachConfig);
        LIZ.append(", effect=");
        LIZ.append(this.effect);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", version=");
        LIZ.append(this.version);
        LIZ.append(", tiktokEffectHouse=");
        LIZ.append(this.tiktokEffectHouse);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Config(Boolean bool, Effect effect, String str, String str2, TiktokEffectHouse tiktokEffectHouse) {
        this.bAlgBachConfig = bool;
        this.effect = effect;
        this.name = str;
        this.version = str2;
        this.tiktokEffectHouse = tiktokEffectHouse;
    }

    public /* synthetic */ Config(Boolean bool, Effect effect, String str, String str2, TiktokEffectHouse tiktokEffectHouse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : effect, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? tiktokEffectHouse : null);
    }
}
