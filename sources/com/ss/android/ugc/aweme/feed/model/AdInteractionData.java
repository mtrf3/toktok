package com.ss.android.ugc.aweme.feed.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdInteractionData implements Serializable {

    @InterfaceC65349Pkn("gesture_guidance")
    public AdGestureGuidance gestureGuidance;

    @InterfaceC65349Pkn("interaction_type")
    public int interactionType;

    @InterfaceC65349Pkn("music")
    public UrlModel music;

    @InterfaceC65349Pkn("popup_image")
    public UrlModel popupImage;

    public static /* synthetic */ AdInteractionData copy$default(AdInteractionData adInteractionData, int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adInteractionData.interactionType;
        }
        if ((i2 & 2) != 0) {
            adGestureGuidance = adInteractionData.gestureGuidance;
        }
        if ((i2 & 4) != 0) {
            urlModel = adInteractionData.popupImage;
        }
        if ((i2 & 8) != 0) {
            urlModel2 = adInteractionData.music;
        }
        return adInteractionData.copy(i, adGestureGuidance, urlModel, urlModel2);
    }

    public final AdInteractionData copy(int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2) {
        return new AdInteractionData(i, adGestureGuidance, urlModel, urlModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdInteractionData)) {
            return false;
        }
        AdInteractionData adInteractionData = (AdInteractionData) obj;
        return this.interactionType == adInteractionData.interactionType && o.LJ(this.gestureGuidance, adInteractionData.gestureGuidance) && o.LJ(this.popupImage, adInteractionData.popupImage) && o.LJ(this.music, adInteractionData.music);
    }

    public int hashCode() {
        int i = this.interactionType * 31;
        AdGestureGuidance adGestureGuidance = this.gestureGuidance;
        int hashCode = (i + (adGestureGuidance == null ? 0 : adGestureGuidance.hashCode())) * 31;
        UrlModel urlModel = this.popupImage;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.music;
        return hashCode2 + (urlModel2 != null ? urlModel2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdInteractionData(interactionType=");
        LIZ.append(this.interactionType);
        LIZ.append(", gestureGuidance=");
        LIZ.append(this.gestureGuidance);
        LIZ.append(", popupImage=");
        LIZ.append(this.popupImage);
        LIZ.append(", music=");
        return C31461Li.LIZLLL(LIZ, this.music, ')', LIZ);
    }

    public final AdGestureGuidance getGestureGuidance() {
        return this.gestureGuidance;
    }

    public final int getInteractionType() {
        return this.interactionType;
    }

    public final UrlModel getMusic() {
        return this.music;
    }

    public final UrlModel getPopupImage() {
        return this.popupImage;
    }

    public final void setGestureGuidance(AdGestureGuidance adGestureGuidance) {
        this.gestureGuidance = adGestureGuidance;
    }

    public final void setInteractionType(int i) {
        this.interactionType = i;
    }

    public final void setMusic(UrlModel urlModel) {
        this.music = urlModel;
    }

    public final void setPopupImage(UrlModel urlModel) {
        this.popupImage = urlModel;
    }

    public AdInteractionData(int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2) {
        this.interactionType = i;
        this.gestureGuidance = adGestureGuidance;
        this.popupImage = urlModel;
        this.music = urlModel2;
    }

    public /* synthetic */ AdInteractionData(int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : adGestureGuidance, (i2 & 4) != 0 ? null : urlModel, (i2 & 8) != 0 ? null : urlModel2);
    }
}
