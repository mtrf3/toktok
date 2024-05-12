package com.ss.android.ugc.aweme.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GreenScreenKitEffectsSettings {
    public static final GreenScreenKitEffectsSettings LIZ = new GreenScreenKitEffectsSettings();

    /* loaded from: classes8.dex */
    public static final class GreenScreenEffect {

        @InterfaceC65349Pkn("effect_name")
        public final String effectName;

        @InterfaceC65349Pkn("resource_id")
        public final String resourceID;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GreenScreenEffect)) {
                return false;
            }
            GreenScreenEffect greenScreenEffect = (GreenScreenEffect) obj;
            return o.LJ(this.effectName, greenScreenEffect.effectName) && o.LJ(this.resourceID, greenScreenEffect.resourceID);
        }

        public final int hashCode() {
            return this.resourceID.hashCode() + (this.effectName.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GreenScreenEffect(effectName=");
            LIZ.append(this.effectName);
            LIZ.append(", resourceID=");
            return q.LIZIZ(LIZ, this.resourceID, ')', LIZ);
        }

        public GreenScreenEffect(String effectName, String resourceID) {
            o.LJIIIZ(effectName, "effectName");
            o.LJIIIZ(resourceID, "resourceID");
            this.effectName = effectName;
            this.resourceID = resourceID;
        }
    }

    /* loaded from: classes2.dex */
    public static final class GreenScreenKitEffectsModel {

        @InterfaceC65349Pkn("green_screen_image_effects")
        public final List<GreenScreenEffect> greenScreenImageEffects;

        @InterfaceC65349Pkn("green_screen_video_effects")
        public final List<GreenScreenEffect> greenScreenVideoEffects;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GreenScreenKitEffectsModel)) {
                return false;
            }
            GreenScreenKitEffectsModel greenScreenKitEffectsModel = (GreenScreenKitEffectsModel) obj;
            return o.LJ(this.greenScreenVideoEffects, greenScreenKitEffectsModel.greenScreenVideoEffects) && o.LJ(this.greenScreenImageEffects, greenScreenKitEffectsModel.greenScreenImageEffects);
        }

        public final int hashCode() {
            return this.greenScreenImageEffects.hashCode() + (this.greenScreenVideoEffects.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GreenScreenKitEffectsModel(greenScreenVideoEffects=");
            LIZ.append(this.greenScreenVideoEffects);
            LIZ.append(", greenScreenImageEffects=");
            return C1NE.LIZIZ(LIZ, this.greenScreenImageEffects, ')', LIZ);
        }

        public GreenScreenKitEffectsModel(List<GreenScreenEffect> greenScreenVideoEffects, List<GreenScreenEffect> greenScreenImageEffects) {
            o.LJIIIZ(greenScreenVideoEffects, "greenScreenVideoEffects");
            o.LJIIIZ(greenScreenImageEffects, "greenScreenImageEffects");
            this.greenScreenVideoEffects = greenScreenVideoEffects;
            this.greenScreenImageEffects = greenScreenImageEffects;
        }
    }
}
