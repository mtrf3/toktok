package com.ss.android.ugc.aweme.commercialize.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShakeModel implements Serializable {
    public boolean LJLIL;

    @InterfaceC65349Pkn("frontend_data")
    public final Object frontendData;

    @InterfaceC65349Pkn("gecko_channel")
    public final List<String> geckoChannel;

    @InterfaceC65349Pkn("lynx_url")
    public final String lynxUrl;

    @InterfaceC65349Pkn("show_time")
    public final int showTime;

    @InterfaceC65349Pkn("speed")
    public final float speed;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShakeModel copy$default(ShakeModel shakeModel, float f, int i, List list, String str, Object obj, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            f = shakeModel.speed;
        }
        if ((i2 & 2) != 0) {
            i = shakeModel.showTime;
        }
        if ((i2 & 4) != 0) {
            list = shakeModel.geckoChannel;
        }
        if ((i2 & 8) != 0) {
            str = shakeModel.lynxUrl;
        }
        if ((i2 & 16) != 0) {
            obj = shakeModel.frontendData;
        }
        if ((i2 & 32) != 0) {
            z = shakeModel.LJLIL;
        }
        return shakeModel.copy(f, i, list, str, obj, z);
    }

    public final ShakeModel copy(float f, int i, List<String> list, String str, Object obj, boolean z) {
        return new ShakeModel(f, i, list, str, obj, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShakeModel)) {
            return false;
        }
        ShakeModel shakeModel = (ShakeModel) obj;
        return Float.compare(this.speed, shakeModel.speed) == 0 && this.showTime == shakeModel.showTime && o.LJ(this.geckoChannel, shakeModel.geckoChannel) && o.LJ(this.lynxUrl, shakeModel.lynxUrl) && o.LJ(this.frontendData, shakeModel.frontendData) && this.LJLIL == shakeModel.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int floatToIntBits = ((Float.floatToIntBits(this.speed) * 31) + this.showTime) * 31;
        List<String> list = this.geckoChannel;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (floatToIntBits + hashCode) * 31;
        String str = this.lynxUrl;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj = this.frontendData;
        if (obj != null) {
            i = obj.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LJLIL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShakeModel(speed=");
        LIZ.append(this.speed);
        LIZ.append(", showTime=");
        LIZ.append(this.showTime);
        LIZ.append(", geckoChannel=");
        LIZ.append(this.geckoChannel);
        LIZ.append(", lynxUrl=");
        LIZ.append(this.lynxUrl);
        LIZ.append(", frontendData=");
        LIZ.append(this.frontendData);
        LIZ.append(", shaken=");
        return C48339Iy7.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final Object getFrontendData() {
        return this.frontendData;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxUrl() {
        return this.lynxUrl;
    }

    public final boolean getShaken() {
        return this.LJLIL;
    }

    public final int getShowTime() {
        return this.showTime;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final void setShaken(boolean z) {
        this.LJLIL = z;
    }

    public ShakeModel(float f, int i, List<String> list, String str, Object obj, boolean z) {
        this.speed = f;
        this.showTime = i;
        this.geckoChannel = list;
        this.lynxUrl = str;
        this.frontendData = obj;
        this.LJLIL = z;
    }

    public /* synthetic */ ShakeModel(float f, int i, List list, String str, Object obj, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, list, str, obj, (i2 & 32) != 0 ? false : z);
    }
}
