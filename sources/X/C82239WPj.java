package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WPj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82239WPj implements InterfaceC81327Vvv {
    public final java.util.Map<Integer, C81287VvH> LIZ;
    public final java.util.Map<Integer, C81287VvH> LIZIZ;
    public final List<OSZ<EffectCategoryResponse, List<C79155V4t>>> LIZJ;
    public final C81288VvI LIZLLL;
    public final InterfaceC82236WPg LJ;
    public final TPO LJFF;

    @Override // X.InterfaceC81327Vvv
    public final void g6() {
        if (!this.LIZ.isEmpty()) {
            this.LJFF.LIZLLL(((LinkedHashMap) this.LIZ).keySet());
        }
        if (!this.LIZIZ.isEmpty()) {
            this.LJFF.LJ(((LinkedHashMap) this.LIZIZ).keySet());
        }
    }

    @Override // X.InterfaceC81327Vvv
    public final C81288VvI i6() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC81327Vvv
    public final void h6(C81287VvH filter) {
        o.LJIIIZ(filter, "filter");
        if (!filter.LJLJI) {
            this.LIZIZ.put(Integer.valueOf(filter.LJLIL.LIZ), filter);
            this.LIZ.remove(Integer.valueOf(filter.LJLIL.LIZ));
            this.LJ.LJIIZILJ(filter.LJLIL);
        }
    }

    @Override // X.InterfaceC81327Vvv
    public final void j6(C81287VvH filter) {
        o.LJIIIZ(filter, "filter");
        if (!filter.LJLJI) {
            this.LIZIZ.remove(Integer.valueOf(filter.LJLIL.LIZ));
            this.LIZ.put(Integer.valueOf(filter.LJLIL.LIZ), filter);
        }
        this.LJ.LJJJ(filter.LJLIL, this.LIZJ);
    }

    public C82239WPj(C81288VvI data, InterfaceC82236WPg filterRepository, TPO filterBoxDataSource) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(filterRepository, "filterRepository");
        o.LJIIIZ(filterBoxDataSource, "filterBoxDataSource");
        this.LIZLLL = data;
        this.LJ = filterRepository;
        this.LJFF = filterBoxDataSource;
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
        List<OSZ<EffectCategoryModel, List<C81287VvH>>> list = data.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (OSZ<EffectCategoryModel, List<C81287VvH>> osz : list) {
            EffectCategoryModel convertToEffectCategoryResponse = osz.getFirst();
            o.LJIIIZ(convertToEffectCategoryResponse, "$this$convertToEffectCategoryResponse");
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, 1, null);
            effectCategoryResponse.setId(convertToEffectCategoryResponse.getId());
            effectCategoryResponse.setName(convertToEffectCategoryResponse.getName());
            effectCategoryResponse.setKey(convertToEffectCategoryResponse.getKey());
            List<C81287VvH> second = osz.getSecond();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(second, 10));
            Iterator<T> it = second.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C81287VvH) it.next()).LJLIL);
            }
            arrayList.add(new OSZ(effectCategoryResponse, arrayList2));
        }
        this.LIZJ = arrayList;
    }
}
