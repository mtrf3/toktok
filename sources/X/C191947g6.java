package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191947g6 extends AbstractC65781Prl implements InterfaceC88472Yns<C192027gE, C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ CollectionContentFragment LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191947g6(View view, CollectionContentFragment collectionContentFragment, Aweme aweme) {
        super(1);
        this.LJLIL = view;
        this.LJLILLLLZI = collectionContentFragment;
        this.LJLJI = aweme;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C192027gE c192027gE) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        C192027gE it = c192027gE;
        o.LJIIIZ(it, "it");
        List<C192217gX> LIZ = it.LJLILLLLZI.LIZ();
        Boolean bool = null;
        if (LIZ != null) {
            arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
            Iterator<C192217gX> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJLIL);
            }
        } else {
            arrayList = null;
        }
        List<C192217gX> LIZ2 = it.LJLILLLLZI.LIZ();
        if (LIZ2 != null) {
            if (!LIZ2.isEmpty()) {
                Iterator<C192217gX> it3 = LIZ2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().LJLILLLLZI != 0) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            bool = Boolean.valueOf(z2);
        }
        boolean z3 = it.LJLJJI;
        long j = it.LJLJI;
        AbstractC200747uI<?, ?> provideAwemeModel = Z8A.LIZIZ.provideAwemeModel();
        provideAwemeModel.LJIIIZ(this.LJLILLLLZI.LJLJJI, arrayList, j, z3);
        C55457Lpd.LJLJJLL = provideAwemeModel;
        View view = this.LJLIL;
        C020506f LIZ3 = C020506f.LIZ(view, view.getWidth(), this.LJLIL.getHeight());
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLILLLLZI.mo49getActivity(), "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        Aweme aweme = this.LJLJI;
        CollectionContentFragment collectionContentFragment = this.LJLILLLLZI;
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_profile_other");
        bundle.putString("userid", ((RBX) HG3.LJIILL()).getCurUserId());
        bundle.putString("sec_userid", ((RBX) HG3.LJIILL()).getCurSecUserId());
        bundle.putString("refer", collectionContentFragment.LJLJJL);
        bundle.putString("tab_name", "collection");
        bundle.putInt("video_type", 4);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        bundle.putBoolean("is_clean_mode", z);
        bundle.putString("collection_id", collectionContentFragment.Ml().id);
        bundle.putString("collection_name", collectionContentFragment.Ml().name);
        bundle.putString("enter_from", collectionContentFragment.LJLJJL);
        bundle.putBoolean("is_support_gesture_exit", false);
        buildRoute.withParam(bundle);
        buildRoute.withBundleAnimation(LIZ3.LIZLLL());
        buildRoute.withParam("activity_has_activity_options", true);
        buildRoute.open();
        return C76800UCe.LIZ;
    }
}
