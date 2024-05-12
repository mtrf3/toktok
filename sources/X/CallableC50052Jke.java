package X;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Jke, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC50052Jke<V> implements Callable {
    public final /* synthetic */ SearchJediMixFeedFragment LJLIL;
    public final /* synthetic */ C49825Jgz LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public CallableC50052Jke(SearchJediMixFeedFragment searchJediMixFeedFragment, C49825Jgz c49825Jgz, boolean z) {
        this.LJLIL = searchJediMixFeedFragment;
        this.LJLILLLLZI = c49825Jgz;
        this.LJLJI = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        String str3;
        String str4;
        DynamicPatch dynamicPatch;
        String rawData;
        boolean z;
        long LJIJJ;
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        SearchHubEntityCard searchHubEntityCard = this.LJLILLLLZI.LL;
        if (mo49getActivity != null) {
            SearchHubVM searchHubVM = (SearchHubVM) ViewModelProviders.of(mo49getActivity).get(SearchHubVM.class);
            if (searchHubEntityCard == null) {
                searchHubVM.LJLJJI = 0L;
                searchHubVM.LJLILLLLZI = null;
                searchHubVM.LJLJI = null;
            } else {
                searchHubVM.getClass();
                EntityCardTitle entityCardTitle = searchHubEntityCard.topCardInfo;
                String str5 = "";
                if (entityCardTitle != null && (dynamicPatch = entityCardTitle.dynamicPatch) != null && (rawData = dynamicPatch.getRawData()) != null) {
                    Long valueOf = Long.valueOf(searchHubVM.LJLJJI);
                    if (valueOf.longValue() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Boolean.valueOf(z).booleanValue()) {
                        LJIJJ = valueOf.longValue();
                    } else {
                        LJIJJ = O5Y.LJIJJ();
                    }
                    searchHubVM.LJLJJI = LJIJJ;
                    try {
                        EntityCardTitle entityCardTitle2 = (EntityCardTitle) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), rawData, EntityCardTitle.class);
                        long j = searchHubVM.LJLJJI;
                        String str6 = entityCardTitle2.entityName;
                        if (str6 != null) {
                            str5 = str6;
                        }
                        searchHubVM.LJLILLLLZI = new C50053Jkf(j, str5);
                    } catch (s unused) {
                    }
                } else {
                    SearchLabel searchLabel = searchHubVM.LJLJI;
                    if (searchLabel != null) {
                        str = searchLabel.jumpQuery;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, ((C50322Jp0) KNV.LIZ()).LJLJJI)) {
                        long j2 = searchHubVM.LJLJJI;
                        EntityCardTitle entityCardTitle3 = searchHubEntityCard.topCardInfo;
                        if (entityCardTitle3 == null || (str3 = entityCardTitle3.entityName) == null) {
                            str3 = "";
                        }
                        SearchLabel searchLabel2 = searchHubVM.LJLJI;
                        if (searchLabel2 != null && (str4 = searchLabel2.labelText) != null) {
                            str5 = str4;
                        }
                        searchHubVM.LJLILLLLZI = new C50054Jkg(j2, str3, str5);
                        searchHubVM.LJLJI = null;
                    } else {
                        long LJIJJ2 = O5Y.LJIJJ();
                        searchHubVM.LJLJJI = LJIJJ2;
                        EntityCardTitle entityCardTitle4 = searchHubEntityCard.topCardInfo;
                        if (entityCardTitle4 != null && (str2 = entityCardTitle4.entityName) != null) {
                            str5 = str2;
                        }
                        searchHubVM.LJLILLLLZI = new C50053Jkf(LJIJJ2, str5);
                    }
                }
            }
        }
        SearchJediMixFeedFragment searchJediMixFeedFragment = this.LJLIL;
        searchJediMixFeedFragment.hn("general_search", ((AbstractC49793JgT) searchJediMixFeedFragment.LLJZ.LJLIL).LJLLI, searchJediMixFeedFragment.Kl(), this.LJLIL.LJLLL, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
