package com.ss.android.ugc.aweme.feed.model;

import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AwemePlayFunModel implements Serializable {

    @InterfaceC65349Pkn("angle")
    public final int angle;

    @InterfaceC65349Pkn("end_duration")
    public final float endDuration;

    @InterfaceC65349Pkn("image_info")
    public final UrlModel imageInfo;

    @InterfaceC65349Pkn("position_x")
    public final float positionX;

    @InterfaceC65349Pkn("position_y")
    public final float positionY;

    @InterfaceC65349Pkn("show_duration")
    public final float showDuration;

    @InterfaceC65349Pkn("show_time")
    public final float showTime;

    @InterfaceC65349Pkn("start_duration")
    public final float startDuration;

    @InterfaceC65349Pkn("tips")
    public final String tips;

    public static /* synthetic */ AwemePlayFunModel copy$default(AwemePlayFunModel awemePlayFunModel, UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = awemePlayFunModel.imageInfo;
        }
        if ((i2 & 2) != 0) {
            str = awemePlayFunModel.tips;
        }
        if ((i2 & 4) != 0) {
            f = awemePlayFunModel.startDuration;
        }
        if ((i2 & 8) != 0) {
            f2 = awemePlayFunModel.endDuration;
        }
        if ((i2 & 16) != 0) {
            f3 = awemePlayFunModel.showDuration;
        }
        if ((i2 & 32) != 0) {
            f4 = awemePlayFunModel.showTime;
        }
        if ((i2 & 64) != 0) {
            f5 = awemePlayFunModel.positionX;
        }
        if ((i2 & 128) != 0) {
            f6 = awemePlayFunModel.positionY;
        }
        if ((i2 & 256) != 0) {
            i = awemePlayFunModel.angle;
        }
        return awemePlayFunModel.copy(urlModel, str, f, f2, f3, f4, f5, f6, i);
    }

    public final AwemePlayFunModel copy(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        return new AwemePlayFunModel(urlModel, str, f, f2, f3, f4, f5, f6, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemePlayFunModel)) {
            return false;
        }
        AwemePlayFunModel awemePlayFunModel = (AwemePlayFunModel) obj;
        return o.LJ(this.imageInfo, awemePlayFunModel.imageInfo) && o.LJ(this.tips, awemePlayFunModel.tips) && Float.compare(this.startDuration, awemePlayFunModel.startDuration) == 0 && Float.compare(this.endDuration, awemePlayFunModel.endDuration) == 0 && Float.compare(this.showDuration, awemePlayFunModel.showDuration) == 0 && Float.compare(this.showTime, awemePlayFunModel.showTime) == 0 && Float.compare(this.positionX, awemePlayFunModel.positionX) == 0 && Float.compare(this.positionY, awemePlayFunModel.positionY) == 0 && this.angle == awemePlayFunModel.angle;
    }

    public int hashCode() {
        int hashCode;
        UrlModel urlModel = this.imageInfo;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.tips;
        if (str != null) {
            i = str.hashCode();
        }
        return C47959Irz.LIZIZ(this.positionY, C47959Irz.LIZIZ(this.positionX, C47959Irz.LIZIZ(this.showTime, C47959Irz.LIZIZ(this.showDuration, C47959Irz.LIZIZ(this.endDuration, C47959Irz.LIZIZ(this.startDuration, (i2 + i) * 31, 31), 31), 31), 31), 31), 31) + this.angle;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemePlayFunModel(imageInfo=");
        LIZ.append(this.imageInfo);
        LIZ.append(", tips=");
        LIZ.append(this.tips);
        LIZ.append(", startDuration=");
        LIZ.append(this.startDuration);
        LIZ.append(", endDuration=");
        LIZ.append(this.endDuration);
        LIZ.append(", showDuration=");
        LIZ.append(this.showDuration);
        LIZ.append(", showTime=");
        LIZ.append(this.showTime);
        LIZ.append(", positionX=");
        LIZ.append(this.positionX);
        LIZ.append(", positionY=");
        LIZ.append(this.positionY);
        LIZ.append(", angle=");
        return b0.LIZJ(LIZ, this.angle, ')', LIZ);
    }

    public final int getAngle() {
        return this.angle;
    }

    public final float getEndDuration() {
        return this.endDuration;
    }

    public final UrlModel getImageInfo() {
        return this.imageInfo;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final float getShowDuration() {
        return this.showDuration;
    }

    public final float getShowTime() {
        return this.showTime;
    }

    public final float getStartDuration() {
        return this.startDuration;
    }

    public final String getTips() {
        return this.tips;
    }

    public AwemePlayFunModel(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.imageInfo = urlModel;
        this.tips = str;
        this.startDuration = f;
        this.endDuration = f2;
        this.showDuration = f3;
        this.showTime = f4;
        this.positionX = f5;
        this.positionY = f6;
        this.angle = i;
    }

    public /* synthetic */ AwemePlayFunModel(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(urlModel, str, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f2, (i2 & 16) != 0 ? 0.0f : f3, (i2 & 32) != 0 ? 0.0f : f4, (i2 & 64) != 0 ? 0.0f : f5, (i2 & 128) != 0 ? 0.0f : f6, (i2 & 256) != 0 ? 0 : i);
    }
}
