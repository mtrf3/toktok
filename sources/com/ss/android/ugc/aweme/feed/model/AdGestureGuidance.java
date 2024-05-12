package com.ss.android.ugc.aweme.feed.model;

import X.C31461Li;
import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdGestureGuidance implements Serializable {

    @InterfaceC65349Pkn("height")
    public float height;

    @InterfaceC65349Pkn("image")
    public UrlModel image;

    @InterfaceC65349Pkn("position_x")
    public float positionX;

    @InterfaceC65349Pkn("position_y")
    public float positionY;

    @InterfaceC65349Pkn("show_time")
    public float showTime;

    @InterfaceC65349Pkn("width")
    public float width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdGestureGuidance() {
        /*
            r9 = this;
            r1 = 0
            r6 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.AdGestureGuidance.<init>():void");
    }

    public static /* synthetic */ AdGestureGuidance copy$default(AdGestureGuidance adGestureGuidance, float f, float f2, float f3, float f4, float f5, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            f = adGestureGuidance.showTime;
        }
        if ((i & 2) != 0) {
            f2 = adGestureGuidance.positionX;
        }
        if ((i & 4) != 0) {
            f3 = adGestureGuidance.positionY;
        }
        if ((i & 8) != 0) {
            f4 = adGestureGuidance.width;
        }
        if ((i & 16) != 0) {
            f5 = adGestureGuidance.height;
        }
        if ((i & 32) != 0) {
            urlModel = adGestureGuidance.image;
        }
        return adGestureGuidance.copy(f, f2, f3, f4, f5, urlModel);
    }

    public final AdGestureGuidance copy(float f, float f2, float f3, float f4, float f5, UrlModel urlModel) {
        return new AdGestureGuidance(f, f2, f3, f4, f5, urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdGestureGuidance)) {
            return false;
        }
        AdGestureGuidance adGestureGuidance = (AdGestureGuidance) obj;
        return Float.compare(this.showTime, adGestureGuidance.showTime) == 0 && Float.compare(this.positionX, adGestureGuidance.positionX) == 0 && Float.compare(this.positionY, adGestureGuidance.positionY) == 0 && Float.compare(this.width, adGestureGuidance.width) == 0 && Float.compare(this.height, adGestureGuidance.height) == 0 && o.LJ(this.image, adGestureGuidance.image);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.height, C47959Irz.LIZIZ(this.width, C47959Irz.LIZIZ(this.positionY, C47959Irz.LIZIZ(this.positionX, Float.floatToIntBits(this.showTime) * 31, 31), 31), 31), 31);
        UrlModel urlModel = this.image;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdGestureGuidance(showTime=");
        LIZ.append(this.showTime);
        LIZ.append(", positionX=");
        LIZ.append(this.positionX);
        LIZ.append(", positionY=");
        LIZ.append(this.positionY);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", image=");
        return C31461Li.LIZLLL(LIZ, this.image, ')', LIZ);
    }

    public final float getHeight() {
        return this.height;
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final float getShowTime() {
        return this.showTime;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setImage(UrlModel urlModel) {
        this.image = urlModel;
    }

    public final void setPositionX(float f) {
        this.positionX = f;
    }

    public final void setPositionY(float f) {
        this.positionY = f;
    }

    public final void setShowTime(float f) {
        this.showTime = f;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public AdGestureGuidance(float f, float f2, float f3, float f4, float f5, UrlModel urlModel) {
        this.showTime = f;
        this.positionX = f2;
        this.positionY = f3;
        this.width = f4;
        this.height = f5;
        this.image = urlModel;
    }

    public /* synthetic */ AdGestureGuidance(float f, float f2, float f3, float f4, float f5, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) == 0 ? f5 : 0.0f, (i & 32) != 0 ? null : urlModel);
    }
}
