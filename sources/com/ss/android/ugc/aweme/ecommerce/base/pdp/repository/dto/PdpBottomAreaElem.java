package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C279017q;
import X.EnumC70033Re9;
import X.InterfaceC65349Pkn;
import X.RW5;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpBottomAreaElem implements Parcelable {
    public static final Parcelable.Creator<PdpBottomAreaElem> CREATOR = new RW5();

    @InterfaceC65349Pkn("buttons")
    public final List<PdpButton> buttons;

    @InterfaceC65349Pkn("status_notice")
    public final LinkRichText statusNotice;

    @InterfaceC65349Pkn("status_sub_notice")
    public final LinkRichText statusSubNotice;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpBottomAreaElem)) {
            return false;
        }
        PdpBottomAreaElem pdpBottomAreaElem = (PdpBottomAreaElem) obj;
        return o.LJ(this.statusNotice, pdpBottomAreaElem.statusNotice) && o.LJ(this.statusSubNotice, pdpBottomAreaElem.statusSubNotice) && o.LJ(this.buttons, pdpBottomAreaElem.buttons);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.statusNotice;
        int hashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        LinkRichText linkRichText2 = this.statusSubNotice;
        int hashCode2 = (hashCode + (linkRichText2 == null ? 0 : linkRichText2.hashCode())) * 31;
        List<PdpButton> list = this.buttons;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpBottomAreaElem(statusNotice=");
        LIZ.append(this.statusNotice);
        LIZ.append(", statusSubNotice=");
        LIZ.append(this.statusSubNotice);
        LIZ.append(", buttons=");
        return C1NE.LIZIZ(LIZ, this.buttons, ')', LIZ);
    }

    public final PdpBottomAreaElem LIZ(String str) {
        List<PdpButton> list = this.buttons;
        if (list == null || list.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (PdpButton pdpButton : this.buttons) {
            Integer num = pdpButton.buttonAction;
            int value = EnumC70033Re9.ADD_TO_CART.getValue();
            if (num == null || num.intValue() != value) {
                arrayList.add(pdpButton);
            } else {
                arrayList.add(PdpButton.LIZ(pdpButton, str, null, 251));
            }
        }
        return new PdpBottomAreaElem(this.statusNotice, this.statusSubNotice, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        LinkRichText linkRichText = this.statusNotice;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        LinkRichText linkRichText2 = this.statusSubNotice;
        if (linkRichText2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText2.writeToParcel(out, i);
        }
        List<PdpButton> list = this.buttons;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((PdpButton) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public PdpBottomAreaElem(LinkRichText linkRichText, LinkRichText linkRichText2, List<PdpButton> list) {
        this.statusNotice = linkRichText;
        this.statusSubNotice = linkRichText2;
        this.buttons = list;
    }
}
