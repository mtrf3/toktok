package com.ss.android.ugc.aweme.ecommerce.core.preloader;

import X.C221108m2;
import X.C53278Kva;
import X.C53279Kvb;
import X.C53281Kvd;
import X.C5H3;
import X.C62562cu;
import X.ORZ;
import android.util.SparseIntArray;
import androidx.lifecycle.Lifecycle;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloader;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImagePreloadExperiment {
    public static final int BIT_PDP_DETAIL = 4;
    public static final int BIT_PDP_HEADER = 2;
    public static final int BIT_SKU = 1;
    public static final int PRIORITY_DEFAULT = 100000;
    public static final int PRIORITY_START = 10;
    public static final int PRIORITY_STEP = 1000;
    public static final ImagePreloadExperiment INSTANCE = new ImagePreloadExperiment();
    public static final ImagePreloadConfig NONE = new ImagePreloadConfig(null, 0, 3, null);
    public static final C5H3 config$delegate = C221108m2.LIZIZ(C53279Kvb.LJLIL);
    public static final C5H3 priorities$delegate = C221108m2.LIZIZ(C53281Kvd.LJLIL);
    public static final C5H3 options$delegate = C221108m2.LIZIZ(C53278Kva.LJLIL);

    private final List<Integer> getOptions() {
        return (List) options$delegate.getValue();
    }

    private final SparseIntArray getPriorities() {
        return (SparseIntArray) priorities$delegate.getValue();
    }

    public final ImagePreloadConfig getConfig() {
        return (ImagePreloadConfig) config$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFirstHeaderImageReady(Lifecycle lifecycle, PdpViewModel viewModel) {
        List<SaleProp> list;
        C62562cu thumbFirstImageUrlModel;
        ImagePreloader.Queue queue;
        ImagePreloader.Queue queue2;
        ProductPackStruct productPackStruct;
        ProductBase productBase;
        List<Image> list2;
        List LJLJJLL;
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(viewModel, "viewModel");
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = getOptions().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue != 1) {
                if (intValue == 2 && (productPackStruct = viewModel.LJLJLLL) != null && (productBase = productPackStruct.baseInfo) != null && (list2 = productBase.images) != null && (LJLJJLL = ORZ.LJLJJLL(list2, 2)) != null) {
                    Iterator it2 = LJLJJLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
            } else {
                ProductPackStruct productPackStruct2 = viewModel.LJLJLLL;
                if (productPackStruct2 != null && (list = productPackStruct2.saleProps) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (SaleProp saleProp : list) {
                        if (o.LJ(saleProp.hasImage, Boolean.TRUE)) {
                            arrayList2.add(saleProp);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        List<SalePropValue> list3 = ((SaleProp) it3.next()).salePropValueList;
                        if (list3 != null) {
                            Iterator<SalePropValue> it4 = list3.iterator();
                            while (it4.hasNext()) {
                                Image image = it4.next().image;
                                if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                                    arrayList.addAll(thumbFirstImageUrlModel.LIZ);
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                if (!ImagePreloader.LIZIZ()) {
                    queue2 = new b();
                } else {
                    Iterator<ImagePreloader.Queue> it5 = ImagePreloader.LIZJ.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            queue = it5.next();
                            ImagePreloader.Queue queue3 = queue;
                            queue3.getClass();
                            if (queue3.LJLILLLLZI.get() == lifecycle) {
                                break;
                            }
                        } else {
                            queue = null;
                            break;
                        }
                    }
                    queue2 = queue;
                    if (queue2 == null) {
                        queue2 = new ImagePreloader.Queue(lifecycle);
                        ImagePreloader.LIZJ.addFirst(queue2);
                    }
                }
                queue2.LIZJ(INSTANCE.getPriorities().get(intValue, PRIORITY_DEFAULT), arrayList);
                arrayList.clear();
            }
        }
    }
}
