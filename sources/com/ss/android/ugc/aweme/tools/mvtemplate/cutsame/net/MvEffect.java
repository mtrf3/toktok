package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.HUT;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MvEffect extends Effect {
    public static final HUT CREATOR = new HUT();
    public final com.ss.ugc.effectplatform.model.Effect kEffect;

    @InterfaceC65349Pkn("md5")
    public String md5;

    /* JADX WARN: Multi-variable type inference failed */
    public MvEffect() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public com.ss.ugc.effectplatform.model.Effect getKEffect() {
        return this.kEffect;
    }

    public final String getMd5() {
        return this.md5;
    }

    public MvEffect(com.ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.kEffect = effect;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        if (getKEffect() != null) {
            getKEffect().writeToParcel(parcel, i);
        } else {
            super.writeToParcel(parcel, i);
        }
        parcel.writeString(this.md5);
    }

    public /* synthetic */ MvEffect(com.ss.ugc.effectplatform.model.Effect effect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect);
    }
}
