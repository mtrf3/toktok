package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C47261Igj;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpPreviewInfo {

    @InterfaceC65349Pkn("cover")
    public final String cover;

    @InterfaceC65349Pkn("cover_index")
    public final int coverIndex;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("price")
    public final String price;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpPreviewInfo)) {
            return false;
        }
        PdpPreviewInfo pdpPreviewInfo = (PdpPreviewInfo) obj;
        return o.LJ(this.title, pdpPreviewInfo.title) && o.LJ(this.price, pdpPreviewInfo.price) && o.LJ(this.cover, pdpPreviewInfo.cover) && o.LJ(this.id, pdpPreviewInfo.id) && this.coverIndex == pdpPreviewInfo.coverIndex;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.price;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cover;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.coverIndex;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpPreviewInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", coverIndex=");
        return b0.LIZJ(LIZ, this.coverIndex, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProductPackStruct LIZ(int i, int i2) {
        List LJJIJ;
        String str;
        String str2 = this.title;
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        Object[] objArr59 = 0;
        Object[] objArr60 = 0;
        Object[] objArr61 = 0;
        Object[] objArr62 = 0;
        Object[] objArr63 = 0;
        Object[] objArr64 = 0;
        Object[] objArr65 = 0;
        Object[] objArr66 = 0;
        Object[] objArr67 = 0;
        Object[] objArr68 = 0;
        Object[] objArr69 = 0;
        Object[] objArr70 = 0;
        Object[] objArr71 = 0;
        Object[] objArr72 = 0;
        Object[] objArr73 = 0;
        Object[] objArr74 = 0;
        Object[] objArr75 = 0;
        Object[] objArr76 = 0;
        Object[] objArr77 = 0;
        Object[] objArr78 = 0;
        Object[] objArr79 = 0;
        Object[] objArr80 = 0;
        Object[] objArr81 = 0;
        Object[] objArr82 = 0;
        Object[] objArr83 = 0;
        Object[] objArr84 = 0;
        Object[] objArr85 = 0;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        String str4 = this.cover;
        if (str4 == null) {
            LJJIJ = C61878OQg.INSTANCE;
        } else {
            LJJIJ = C47261Igj.LJJIJ(str4);
        }
        List LJJIJ2 = C47261Igj.LJJIJ(new Image(valueOf, valueOf2, null, null, LJJIJ, null, null));
        if (o.LJ(this.price, "null")) {
            str = null;
        } else {
            str = this.price;
        }
        String str5 = str;
        return new ProductPackStruct(str3, objArr85 == true ? 1 : 0, objArr84 == true ? 1 : 0, objArr83 == true ? 1 : 0, new ProductBase(str2, null, null, null, LJJIJ2, null, null, null, new ProductPrice(null, str5, null, Boolean.FALSE, null, null, null, null, 128, null), null, null, null, null, null, null, null, null, null, null, 98304, null), objArr82 == true ? 1 : 0, objArr81 == true ? 1 : 0, objArr80 == true ? 1 : 0, objArr79 == true ? 1 : 0, objArr78 == true ? 1 : 0, objArr77 == true ? 1 : 0, objArr76 == true ? 1 : 0, objArr75 == true ? 1 : 0, objArr74 == true ? 1 : 0, objArr73 == true ? 1 : 0, objArr72 == true ? 1 : 0, objArr71 == true ? 1 : 0, objArr70 == true ? 1 : 0, objArr69 == true ? 1 : 0, objArr68 == true ? 1 : 0, objArr67 == true ? 1 : 0, objArr66 == true ? 1 : 0, objArr65 == true ? 1 : 0, objArr64 == true ? 1 : 0, objArr63 == true ? 1 : 0, objArr62 == true ? 1 : 0, objArr61 == true ? 1 : 0, objArr60 == true ? 1 : 0, objArr59 == true ? 1 : 0, objArr58 == true ? 1 : 0, objArr57 == true ? 1 : 0, objArr56 == true ? 1 : 0, objArr55 == true ? 1 : 0, objArr54 == true ? 1 : 0, objArr53 == true ? 1 : 0, objArr52 == true ? 1 : 0, objArr51 == true ? 1 : 0, objArr50 == true ? 1 : 0, objArr49 == true ? 1 : 0, objArr48 == true ? 1 : 0, objArr47 == true ? 1 : 0, objArr46 == true ? 1 : 0, objArr45 == true ? 1 : 0, objArr44 == true ? 1 : 0, objArr43 == true ? 1 : 0, objArr42 == true ? 1 : 0, objArr41 == true ? 1 : 0, objArr40 == true ? 1 : 0, objArr39 == true ? 1 : 0, objArr38 == true ? 1 : 0, objArr37 == true ? 1 : 0, objArr36 == true ? 1 : 0, objArr35 == true ? 1 : 0, objArr34 == true ? 1 : 0, objArr33 == true ? 1 : 0, objArr32 == true ? 1 : 0, objArr31 == true ? 1 : 0, objArr30 == true ? 1 : 0, objArr29 == true ? 1 : 0, objArr28 == true ? 1 : 0, objArr27 == true ? 1 : 0, objArr26 == true ? 1 : 0, objArr25 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr23 == true ? 1 : 0, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, objArr20 == true ? 1 : 0, objArr19 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, -17, -1, 4194303, objArr == true ? 1 : 0);
    }

    public PdpPreviewInfo(String str, String str2, String str3, String str4, int i) {
        this.title = str;
        this.price = str2;
        this.cover = str3;
        this.id = str4;
        this.coverIndex = i;
    }

    public /* synthetic */ PdpPreviewInfo(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? 0 : i);
    }
}
