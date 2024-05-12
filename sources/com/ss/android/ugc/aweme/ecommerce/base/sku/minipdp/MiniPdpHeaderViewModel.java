package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C78685UuP;
import X.InterfaceC61312at;
import X.InterfaceC69848RbA;
import X.OPB;
import X.X1D;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MiniPdpHeaderViewModel extends JediViewModel<MiniPdpHeaderState> {
    public ProductPackStruct LJLJJLL;
    public InterfaceC69848RbA LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final MiniPdpHeaderState kv0() {
        return new MiniPdpHeaderState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* loaded from: classes13.dex */
    public static final class MiniPdpHeaderState implements InterfaceC61312at {
        public final List<Image> images;
        public final OPB openGalleryEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public MiniPdpHeaderState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MiniPdpHeaderState copy$default(MiniPdpHeaderState miniPdpHeaderState, List list, OPB opb, int i, Object obj) {
            if ((i & 1) != 0) {
                list = miniPdpHeaderState.images;
            }
            if ((i & 2) != 0) {
                opb = miniPdpHeaderState.openGalleryEvent;
            }
            return miniPdpHeaderState.copy(list, opb);
        }

        public final MiniPdpHeaderState copy(List<Image> list, OPB opb) {
            return new MiniPdpHeaderState(list, opb);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MiniPdpHeaderState)) {
                return false;
            }
            MiniPdpHeaderState miniPdpHeaderState = (MiniPdpHeaderState) obj;
            return o.LJ(this.images, miniPdpHeaderState.images) && o.LJ(this.openGalleryEvent, miniPdpHeaderState.openGalleryEvent);
        }

        public int hashCode() {
            List<Image> list = this.images;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            OPB opb = this.openGalleryEvent;
            return hashCode + (opb != null ? opb.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MiniPdpHeaderState(images=");
            LIZ.append(this.images);
            LIZ.append(", openGalleryEvent=");
            LIZ.append(this.openGalleryEvent);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final List<Image> getImages() {
            return this.images;
        }

        public final OPB getOpenGalleryEvent() {
            return this.openGalleryEvent;
        }

        public MiniPdpHeaderState(List<Image> list, OPB opb) {
            this.images = list;
            this.openGalleryEvent = opb;
        }

        public /* synthetic */ MiniPdpHeaderState(List list, OPB opb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : opb);
        }
    }

    public final void Hv0(List<String> list) {
        ProductBase productBase;
        List<SaleProp> list2;
        List<SalePropValue> list3;
        ProductBase productBase2;
        List<Image> list4;
        ProductPackStruct productPackStruct;
        SkcInfo skcInfo;
        List<Skc> list5;
        Skc skc;
        List<Image> list6;
        ProductPackStruct productPackStruct2 = this.LJLJJLL;
        List<Image> list7 = null;
        if (productPackStruct2 != null) {
            if (productPackStruct2.skcInfo != null) {
                if (list != null) {
                    for (String str : list) {
                        if (C78685UuP.LJJJZ(str) && (productPackStruct = this.LJLJJLL) != null && (skcInfo = productPackStruct.skcInfo) != null && (list5 = skcInfo.skcList) != null) {
                            Iterator<Skc> it = list5.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    skc = it.next();
                                    if (o.LJ(skc.skcId, str)) {
                                        break;
                                    }
                                } else {
                                    skc = null;
                                    break;
                                }
                            }
                            Skc skc2 = skc;
                            if (skc2 != null && (list6 = skc2.skcImages) != null && (!list6.isEmpty())) {
                                setState(new AqS178S0100000_12(list6, (List<Tab>) 346));
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (productPackStruct2 != null) {
                if (productPackStruct2.saleProps != null) {
                    ArrayList arrayList = new ArrayList();
                    ProductPackStruct productPackStruct3 = this.LJLJJLL;
                    if (productPackStruct3 != null && (productBase2 = productPackStruct3.baseInfo) != null && (list4 = productBase2.images) != null) {
                        arrayList.addAll(list4);
                    }
                    ProductPackStruct productPackStruct4 = this.LJLJJLL;
                    if (productPackStruct4 != null && (list2 = productPackStruct4.saleProps) != null) {
                        for (SaleProp saleProp : list2) {
                            if (o.LJ(saleProp.hasImage, Boolean.TRUE) && (list3 = saleProp.salePropValueList) != null) {
                                Iterator<SalePropValue> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    Image image = it2.next().image;
                                    if (image != null) {
                                        arrayList.add(image);
                                    }
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        setState(new AqS178S0100000_12(arrayList, (List<Tab>) 346));
                        return;
                    }
                    return;
                }
                if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null) {
                    list7 = productBase.images;
                }
            }
        }
        setState(new AqS178S0100000_12(list7, (List<Tab>) 346));
    }
}
