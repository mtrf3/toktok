package X;

import Y.ACListenerS46S0200000_12;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.AqS72S0201000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class THF implements TH6<THN, Fragment> {
    public final C82622Wbi LIZ;
    public final C73849Syb<C76800UCe> LIZIZ;

    public THF(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = diContainer;
        this.LIZIZ = new C73849Syb<>();
    }

    @Override // X.TH6
    public final THN LIZ(ActivityC45651qj activity, EffectCategoryModel model, C80695Vlj tabLayout, AqS72S0201000_12 aqS72S0201000_12) {
        boolean z;
        List<String> list;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(tabLayout, "tabLayout");
        THN LIZ = C163486bI.LIZ(activity);
        String extra = model.getExtra();
        if (extra == null || ujb.o.LJJJJJL(extra)) {
            z = false;
        } else {
            z = new JSONObject(extra).optBoolean("is_show_icon_only");
        }
        UrlModel icon_selected = model.getIcon_selected();
        if (icon_selected != null) {
            list = icon_selected.getUrl_list();
        } else {
            list = null;
        }
        if (!C78886Uxe.LJJIJ(list)) {
            com.ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.ss.android.ugc.aweme.base.model.UrlModel();
            urlModel.setUrlList(list);
            LIZ.setImage(urlModel);
        } else {
            LIZ.setImageVisibility(false);
        }
        if (z) {
            LIZ.setTextVisibility(false);
        } else {
            LIZ.setText(model.getName());
        }
        C16880lQ.LJJ(LIZ, new ACListenerS46S0200000_12(aqS72S0201000_12, this, 51));
        return LIZ;
    }

    @Override // X.TH6
    public final InterfaceC74377TGz<Fragment> LIZIZ(int i, TF5 requiredDependency, TEJ optionalDependency, RecyclerView.RecycledViewPool viewPool) {
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        o.LJIIIZ(viewPool, "viewPool");
        ShortVideoContext shortVideoContext = (ShortVideoContext) this.LIZ.LJ(ShortVideoContext.class, null);
        IDH LLLF = ((I0N) this.LIZ.LJ(I0N.class, null)).LLLF();
        C73849Syb<C76800UCe> createEffectTabClickSubject = this.LIZIZ;
        o.LJIIIZ(createEffectTabClickSubject, "createEffectTabClickSubject");
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = new EffectTemplateCategoryFragment(shortVideoContext, createEffectTabClickSubject);
        effectTemplateCategoryFragment.Ol(i, requiredDependency, optionalDependency, null);
        effectTemplateCategoryFragment.LJLJI = LLLF;
        return effectTemplateCategoryFragment;
    }
}
