package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THG implements TH6<THN, Fragment> {
    public final THH LIZ;
    public final LifecycleOwner LIZIZ;
    public final THX LIZJ;
    public final TEZ LIZLLL;

    public THG(LifecycleOwner lifecycleOwner, THX thx, TEZ stickerDataManager, InterfaceC78118UlG interfaceC78118UlG) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = thx;
        this.LIZLLL = stickerDataManager;
        this.LIZ = new THH(lifecycleOwner, thx, stickerDataManager, interfaceC78118UlG);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // X.TH6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.THN LIZ(X.ActivityC45651qj r8, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r9, X.C80695Vlj r10, kotlin.jvm.internal.AqS72S0201000_12 r11) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "tabLayout"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.THN r3 = X.C163486bI.LIZ(r8)
            com.ss.ugc.effectplatform.model.UrlModel r1 = r9.getIcon()
            if (r1 == 0) goto L26
            java.lang.String r0 = r1.getUri()
            r6 = 0
            if (r0 == 0) goto L26
            int r0 = r0.length()
            if (r0 != 0) goto L59
        L26:
            java.lang.String r0 = r9.getName()
            r3.setText(r0)
        L2d:
            Y.ACListenerS37S0300000_12 r1 = new Y.ACListenerS37S0300000_12
            r0 = 12
            r1.<init>(r11, r7, r8, r0)
            X.C16880lQ.LJJ(r3, r1)
            X.THH r2 = r7.LIZ
            r2.getClass()
            X.Vlj r0 = r2.LJLIL
            if (r0 == 0) goto L41
        L40:
            return r3
        L41:
            r2.LJLIL = r10
            X.TEZ r0 = r2.LJLJJI
            X.THp r0 = r0.LJJJJLL()
            X.TJn r0 = r0.LJIJ()
            X.TJZ r0 = r0.LJJJJ()
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LJLJJL
            androidx.lifecycle.LifecycleOwner r0 = r2.LJLILLLLZI
            r1.observe(r0, r2)
            goto L40
        L59:
            r0 = r6 ^ 1
            r5 = 0
            if (r0 == 0) goto L26
            java.lang.String r2 = r1.getUri()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131101097(0x7f0605a9, float:1.7814594E38)
            int r4 = r1.getColor(r0)
            if (r2 == 0) goto L2d
            int r0 = r2.length()
            if (r0 != 0) goto L76
            goto L2d
        L76:
            android.widget.TextView r1 = r3.LJLILLLLZI
            r0 = 8
            r1.setVisibility(r0)
            X.W5G r0 = r3.LJLIL
            r0.setVisibility(r6)
            java.lang.String r0 = "res://"
            boolean r0 = ujb.o.LJJJLIIL(r2, r0, r6)
            if (r0 == 0) goto La6
            X.W5G r2 = r3.LJLIL
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L96
        L92:
            r2.setImageDrawable(r5)
            goto L2d
        L96:
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131232803(0x7f080823, float:1.8081726E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.Drawable r5 = X.C78880UxY.LJLIL(r0, r4)
            goto L92
        La6:
            X.W5G r1 = r3.LJLIL
            r0 = -1
            X.C78764Uvg.LJIIIZ(r1, r2, r0, r0)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.THG.LIZ(X.1qj, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, X.Vlj, kotlin.jvm.internal.AqS72S0201000_12):X.THN");
    }

    @Override // X.TH6
    public final InterfaceC74377TGz<Fragment> LIZIZ(int i, TF5 requiredDependency, TEJ optionalDependency, RecyclerView.RecycledViewPool viewPool) {
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        o.LJIIIZ(viewPool, "viewPool");
        FavoriteFragment favoriteFragment = new FavoriteFragment();
        favoriteFragment.Ll(i, requiredDependency, optionalDependency, viewPool);
        return favoriteFragment;
    }
}
