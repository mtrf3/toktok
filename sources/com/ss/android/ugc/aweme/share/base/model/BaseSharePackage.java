package com.ss.android.ugc.aweme.share.base.model;

import X.AbstractC62625Ohx;
import X.AbstractC73635Sv9;
import X.C16880lQ;
import X.C62373Odt;
import X.C62375Odv;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC62486Ofi;
import X.InterfaceC62573Oh7;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OYJ;
import X.OYP;
import Y.IDCreatorS53S0000000_10;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class BaseSharePackage implements Parcelable {
    public final String description;
    public final Bundle extras;
    public final String identifier;
    public final String itemType;
    public final ShareContentType[] shareContentTypes;
    public final ShareModel shareModel;
    public final String title;
    public final String url;
    public static final C62375Odv Companion = new C62375Odv();
    public static final Parcelable.Creator<BaseSharePackage> CREATOR = new IDCreatorS53S0000000_10(2);

    public boolean LIZ(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        return true;
    }

    public boolean LIZIZ(Context context, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        return false;
    }

    public boolean LJIIIIZZ(InterfaceC62486Ofi action, Context context) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean LJIIJ() {
        if (this.extras.containsKey("is_portrait")) {
            return o.LJ(C16880lQ.LLJJIII(this.extras, "is_portrait"), Boolean.TRUE);
        }
        return true;
    }

    public final boolean LJIILJJIL() {
        if (!this.extras.containsKey("use_small_style_on_large_screen") || !this.extras.containsKey("enter_method") || !o.LJ(C16880lQ.LLJJIII(this.extras, "use_small_style_on_large_screen"), Boolean.TRUE) || !o.LJ(C16880lQ.LLJJIII(this.extras, "enter_method"), "share_panel")) {
            return false;
        }
        return true;
    }

    public BaseSharePackage(C62373Odt basePackageBuilder) {
        o.LJIIIZ(basePackageBuilder, "basePackageBuilder");
        Bundle bundle = new Bundle();
        this.extras = bundle;
        String str = basePackageBuilder.LIZ;
        this.itemType = str == null ? "" : str;
        String str2 = basePackageBuilder.LIZIZ;
        this.identifier = str2 == null ? "" : str2;
        this.shareContentTypes = basePackageBuilder.LIZJ;
        String str3 = basePackageBuilder.LIZLLL;
        this.title = str3 == null ? "" : str3;
        String str4 = basePackageBuilder.LJ;
        this.description = str4 == null ? "" : str4;
        String str5 = basePackageBuilder.LJFF;
        this.url = str5 != null ? str5 : "";
        this.shareModel = basePackageBuilder.LJI;
        bundle.putAll(basePackageBuilder.LJII);
    }

    public AbstractC62625Ohx LJIIJJI(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        return new OYP(this.url, (String) null, 6);
    }

    public AbstractC73635Sv9<AbstractC62625Ohx> LJIIL(InterfaceC62225ObV interfaceC62225ObV) {
        return AbstractC73635Sv9.LJ(new OYJ((SharePackage) this, interfaceC62225ObV));
    }

    public void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        interfaceC88472Yns.invoke(LJIIJJI(channel));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.itemType);
        dest.writeString(this.identifier);
        dest.writeArray(this.shareContentTypes);
        dest.writeParcelable(this.shareModel, i);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeBundle(this.extras);
    }

    public void LJIIIZ(Context context, InterfaceC62486Ofi action, AqS157S0200000_10 aqS157S0200000_10) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(action, "action");
        aqS157S0200000_10.invoke();
    }

    public void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LJII(SharePackage sharePackage, Context context, View view, InterfaceC65784Pro interfaceC65784Pro, int i) {
        if ((i & 4) != 0) {
            view = null;
        }
        if ((i & 8) != 0) {
            interfaceC65784Pro = null;
        }
        sharePackage.LJI(context, null, view, interfaceC65784Pro);
    }

    public boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        return LIZIZ(context, channel);
    }
}
