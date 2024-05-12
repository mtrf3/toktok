package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes17.dex */
public final class DeprecatedStruct6 extends F9E {

    @InterfaceC65349Pkn("deprecated1")
    public DeprecatedStruct7 deprecated1;

    @InterfaceC65349Pkn("deprecated10")
    public String deprecated10;

    @InterfaceC65349Pkn("deprecated11")
    public ImageModel deprecated11;

    @InterfaceC65349Pkn("deprecated2")
    public DeprecatedStruct7 deprecated2;

    @InterfaceC65349Pkn("deprecated3")
    public String deprecated3;

    @InterfaceC65349Pkn("deprecated4")
    public String deprecated4;

    @InterfaceC65349Pkn("deprecated5")
    public String deprecated5;

    @InterfaceC65349Pkn("deprecated6")
    public String deprecated6;

    @InterfaceC65349Pkn("deprecated7")
    public String deprecated7;

    @InterfaceC65349Pkn("deprecated8")
    public ImageModel deprecated8;

    @InterfaceC65349Pkn("deprecated9")
    public ImageModel deprecated9;

    /* loaded from: classes17.dex */
    public static final class DeprecatedStruct7 extends F9E {

        @InterfaceC65349Pkn("deprecated1")
        public String deprecated1;

        @InterfaceC65349Pkn("deprecated2")
        public String deprecated2;

        @InterfaceC65349Pkn("deprecated3")
        public String deprecated3;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.deprecated1;
            String str2 = this.deprecated2;
            String str3 = this.deprecated3;
            return new Object[]{str, str, str2, str2, str3, str3};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        DeprecatedStruct7 deprecatedStruct7 = this.deprecated1;
        DeprecatedStruct7 deprecatedStruct72 = this.deprecated2;
        String str = this.deprecated3;
        String str2 = this.deprecated4;
        String str3 = this.deprecated5;
        String str4 = this.deprecated6;
        String str5 = this.deprecated7;
        ImageModel imageModel = this.deprecated8;
        ImageModel imageModel2 = this.deprecated9;
        String str6 = this.deprecated10;
        ImageModel imageModel3 = this.deprecated11;
        return new Object[]{deprecatedStruct7, deprecatedStruct7, deprecatedStruct72, deprecatedStruct72, str, str, str2, str2, str3, str3, str4, str4, str5, str5, imageModel, imageModel, imageModel2, imageModel2, str6, str6, imageModel3, imageModel3};
    }
}
