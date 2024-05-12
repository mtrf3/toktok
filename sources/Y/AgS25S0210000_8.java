package Y;

import X.C10I;
import X.C10K;
import X.C76800UCe;
import X.C82544WaS;
import X.FMX;
import X.KAH;
import X.KBQ;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AgS25S0210000_8 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS25S0210000_8 agS25S0210000_8, C10K c10k) {
        String str;
        if (C82544WaS.LJ(c10k)) {
            if (((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).LJLJLLL == 2) {
                if (((List) c10k.LJIIJJI()).isEmpty()) {
                    if (FMX.LIZJ("ttk_sug_success_rate")) {
                        KAH kah = new KAH();
                        kah.LJIILL("type", "no_data");
                        kah.LJIILLIIL(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Kl());
                        String Ll = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Ll();
                        if (Ll == null) {
                            Ll = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Kl();
                        }
                        kah.LJIILL("search_position", Ll);
                        kah.LJIIZILJ(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Jl());
                        kah.LJIJ(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).vl());
                        kah.LJIILIIL();
                    }
                } else if (FMX.LIZJ("ttk_sug_success_rate")) {
                    if (agS25S0210000_8.z2) {
                        str = "sug_show_success_cache";
                    } else {
                        str = "sug_show_success";
                    }
                    KAH kah2 = new KAH();
                    kah2.LJIILL("type", str);
                    kah2.LJIILLIIL(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Kl());
                    String Ll2 = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Ll();
                    if (Ll2 == null) {
                        Ll2 = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Kl();
                    }
                    kah2.LJIILL("search_position", Ll2);
                    kah2.LJIIZILJ(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Jl());
                    kah2.LJIJ(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).vl());
                    kah2.LJIILIIL();
                }
                boolean z = true;
                if (((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).LJLL.equals(((EcSearchSugResponse) agS25S0210000_8.l1).LJLJI)) {
                    ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Al().LJLJJI = true;
                }
                if (o.LJ("1", ((EcSearchSugResponse) agS25S0210000_8.l1).sugVirtualEnable)) {
                    List<SearchSugEntity> list = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Ml().LJLIL;
                    if (list != null) {
                        ((ArrayList) list).clear();
                    }
                } else {
                    KBQ Ml = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Ml();
                    Object obj = (Collection) c10k.LJIIJJI();
                    if (obj == null) {
                        Ml.getClass();
                        obj = new ArrayList();
                    }
                    if (Ml.LJLIL == null) {
                        Ml.LJLIL = new ArrayList();
                    }
                    ((ArrayList) Ml.LJLIL).clear();
                    ((ArrayList) Ml.LJLIL).addAll(obj);
                }
                KBQ Ml2 = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Ml();
                EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew = (EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0;
                EcSearchSugResponse ecSearchSugResponse = (EcSearchSugResponse) agS25S0210000_8.l1;
                ecAbstractSearchIntermediateFragmentNew.getClass();
                List list2 = ecSearchSugResponse.sugList;
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!((SearchSugEntity) obj2).LIZ()) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() < 5 || o.LJ("1", ecSearchSugResponse.sugVirtualEnable)) {
                    z = false;
                }
                if (Ml2.LJLIL != null) {
                    if (Ml2.LJLL == null) {
                        SearchSugEntity searchSugEntity = new SearchSugEntity();
                        Ml2.LJLL = searchSugEntity;
                        searchSugEntity.LIZ = 3;
                    }
                    if (z) {
                        ((ArrayList) Ml2.LJLIL).add(Ml2.LJLL);
                    } else {
                        ((ArrayList) Ml2.LJLIL).remove(Ml2.LJLL);
                    }
                }
                ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Ml().notifyDataSetChanged();
            } else if (FMX.LIZJ("ttk_sug_success_rate")) {
                KAH kah3 = new KAH();
                kah3.LJIILL("type", "has_left");
                kah3.LJIILLIIL(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Kl());
                String Ll3 = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Ll();
                if (Ll3 == null) {
                    Ll3 = ((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Kl();
                }
                kah3.LJIILL("search_position", Ll3);
                kah3.LJIIZILJ(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).Jl());
                kah3.LJIJ(((EcAbstractSearchIntermediateFragmentNew) agS25S0210000_8.l0).vl());
                kah3.LJIILIIL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS25S0210000_8 agS25S0210000_8, C10K c10k) {
        String str;
        if (o.LJ(((EcSearchSugAssemVM) agS25S0210000_8.l0).LJLJJI, ((EcSearchSugResponse) agS25S0210000_8.l1).LJLJI)) {
            ((EcSearchSugAssemVM) agS25S0210000_8.l0).LJLILLLLZI.wO(true);
        }
        if (((List) c10k.LJIIJJI()).isEmpty()) {
            str = "no_data";
        } else if (agS25S0210000_8.z2) {
            str = "sug_show_success_cache";
        } else {
            str = "sug_show_success";
        }
        ((EcSearchSugAssemVM) agS25S0210000_8.l0).gv0(str);
        ((EcSearchSugAssemVM) agS25S0210000_8.l0).setState(new AqS139S0200000_8((EcSearchSugResponse) agS25S0210000_8.l1, (EcSearchSugResponse) c10k, (C10K<List<SearchSugEntity>>) 31));
        return C76800UCe.LIZ;
    }

    public AgS25S0210000_8(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
