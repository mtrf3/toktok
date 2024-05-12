package X;

import Y.ACListenerS32S0100000_12;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.AqS72S0201000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class THE implements TH6<THN, Fragment> {
    @Override // X.TH6
    public InterfaceC74377TGz<Fragment> LIZIZ(int i, TF5 requiredDependency, TEJ optionalDependency, RecyclerView.RecycledViewPool viewPool) {
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        o.LJIIIZ(viewPool, "viewPool");
        StickerCategoryFragment stickerCategoryFragment = new StickerCategoryFragment();
        stickerCategoryFragment.Ll(i, requiredDependency, optionalDependency, viewPool);
        return stickerCategoryFragment;
    }

    @Override // X.TH6
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public THN LIZ(ActivityC45651qj activity, EffectCategoryModel model, C80695Vlj tabLayout, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
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
        C16880lQ.LJJ(LIZ, new ACListenerS32S0100000_12((AqS72S0201000_12) interfaceC65784Pro, 182));
        return LIZ;
    }
}
