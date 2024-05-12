package com.ss.android.ugc.aweme.common;

import X.C42788Gqm;
import X.H5D;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShareKitPanel implements Serializable, Parcelable {
    public static final long serialVersionUID = -9;

    @InterfaceC65349Pkn("clientKey")
    public String clientKey;

    @InterfaceC65349Pkn("effect_resource_id")
    public String effectResourceId;

    @InterfaceC65349Pkn("share_media_type")
    public Integer shareMediaType;

    @InterfaceC65349Pkn("share_panel_effect")
    public Effect sharePanelEffect;

    @InterfaceC65349Pkn("share_panel_option")
    public String sharePanelOption;
    public static final H5D Companion = new H5D();
    public static final Parcelable.Creator<ShareKitPanel> CREATOR = new C42788Gqm();

    /* JADX WARN: Multi-variable type inference failed */
    public ShareKitPanel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareKitPanel(Effect effect) {
        this(effect, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareKitPanel(Effect effect, String str) {
        this(effect, str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareKitPanel(Effect effect, String str, String str2) {
        this(effect, str, str2, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareKitPanel(Effect effect, String str, String str2, Integer num) {
        this(effect, str, str2, num, null, 16, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareKitPanel copy$default(ShareKitPanel shareKitPanel, Effect effect, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            effect = shareKitPanel.sharePanelEffect;
        }
        if ((i & 2) != 0) {
            str = shareKitPanel.sharePanelOption;
        }
        if ((i & 4) != 0) {
            str2 = shareKitPanel.effectResourceId;
        }
        if ((i & 8) != 0) {
            num = shareKitPanel.shareMediaType;
        }
        if ((i & 16) != 0) {
            str3 = shareKitPanel.clientKey;
        }
        return shareKitPanel.copy(effect, str, str2, num, str3);
    }

    public final ShareKitPanel copy(Effect effect, String str, String str2, Integer num, String str3) {
        return new ShareKitPanel(effect, str, str2, num, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareKitPanel)) {
            return false;
        }
        ShareKitPanel shareKitPanel = (ShareKitPanel) obj;
        return o.LJ(this.sharePanelEffect, shareKitPanel.sharePanelEffect) && o.LJ(this.sharePanelOption, shareKitPanel.sharePanelOption) && o.LJ(this.effectResourceId, shareKitPanel.effectResourceId) && o.LJ(this.shareMediaType, shareKitPanel.shareMediaType) && o.LJ(this.clientKey, shareKitPanel.clientKey);
    }

    public int hashCode() {
        Effect effect = this.sharePanelEffect;
        int hashCode = (effect == null ? 0 : effect.hashCode()) * 31;
        String str = this.sharePanelOption;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.effectResourceId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.shareMediaType;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.clientKey;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.sharePanelEffect, i);
        out.writeString(this.sharePanelOption);
        out.writeString(this.effectResourceId);
        Integer num = this.shareMediaType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.clientKey);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareKitPanel(sharePanelEffect=");
        LIZ.append(this.sharePanelEffect);
        LIZ.append(", sharePanelOption=");
        LIZ.append(this.sharePanelOption);
        LIZ.append(", effectResourceId=");
        LIZ.append(this.effectResourceId);
        LIZ.append(", shareMediaType=");
        LIZ.append(this.shareMediaType);
        LIZ.append(", clientKey=");
        return q.LIZIZ(LIZ, this.clientKey, ')', LIZ);
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getEffectResourceId() {
        return this.effectResourceId;
    }

    public final Integer getShareMediaType() {
        return this.shareMediaType;
    }

    public final Effect getSharePanelEffect() {
        return this.sharePanelEffect;
    }

    public final String getSharePanelOption() {
        return this.sharePanelOption;
    }

    public final void setClientKey(String str) {
        this.clientKey = str;
    }

    public final void setEffectResourceId(String str) {
        this.effectResourceId = str;
    }

    public final void setShareMediaType(Integer num) {
        this.shareMediaType = num;
    }

    public final void setSharePanelEffect(Effect effect) {
        this.sharePanelEffect = effect;
    }

    public final void setSharePanelOption(String str) {
        this.sharePanelOption = str;
    }

    public ShareKitPanel(Effect effect, String str, String str2, Integer num, String str3) {
        this.sharePanelEffect = effect;
        this.sharePanelOption = str;
        this.effectResourceId = str2;
        this.shareMediaType = num;
        this.clientKey = str3;
    }

    public /* synthetic */ ShareKitPanel(Effect effect, String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? num : null, (i & 16) == 0 ? str3 : "");
    }
}
