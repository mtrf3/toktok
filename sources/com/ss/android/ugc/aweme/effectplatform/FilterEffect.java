package com.ss.android.ugc.aweme.effectplatform;

import X.InterfaceC65349Pkn;
import X.WSZ;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FilterEffect extends Effect {

    @InterfaceC65349Pkn("is_buildin")
    public boolean buildIn;

    @InterfaceC65349Pkn("is_checked")
    public boolean checked;
    public final com.ss.ugc.effectplatform.model.Effect kEffect;
    public static final WSZ Companion = new WSZ();
    public static final Parcelable.Creator<FilterEffect> CREATOR = new IDCreatorS56S0000000_14(8);

    /* JADX WARN: Multi-variable type inference failed */
    public FilterEffect() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getInt(boolean z) {
        return z ? 1 : 0;
    }

    public final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public final boolean getBuildIn() {
        return this.buildIn;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public com.ss.ugc.effectplatform.model.Effect getKEffect() {
        return this.kEffect;
    }

    public FilterEffect(com.ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.kEffect = effect;
    }

    public final void setBuildIn(boolean z) {
        this.buildIn = z;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        if (getKEffect() != null) {
            getKEffect().writeToParcel(dest, i);
        } else {
            super.writeToParcel(dest, i);
        }
        dest.writeByte((byte) getInt(this.checked));
        dest.writeByte((byte) getInt(this.checked));
    }

    public /* synthetic */ FilterEffect(com.ss.ugc.effectplatform.model.Effect effect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect);
    }
}
