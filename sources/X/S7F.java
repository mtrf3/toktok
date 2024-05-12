package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.TemplateEditFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.BaseTemplateCell;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S7F {
    public static void LIZ(LifecycleOwner lifecycleOwner, TemplateItem item, BaseTemplateCell baseTemplateCell, S6R s6r) {
        FragmentManager fragmentManager;
        o.LJIIIZ(item, "item");
        if (!(lifecycleOwner instanceof Fragment) || (fragmentManager = ((Fragment) lifecycleOwner).getFragmentManager()) == null) {
            return;
        }
        int i = C60996Nwm.LJI(EF7.LIZIZ())[1];
        ASL asl = new ASL();
        TemplateEditFragment templateEditFragment = new TemplateEditFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extras_template_item", item);
        bundle.putLong("start_click_time", System.currentTimeMillis());
        templateEditFragment.setArguments(bundle);
        templateEditFragment.LJLILLLLZI = baseTemplateCell;
        templateEditFragment.LJLJI = s6r;
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = templateEditFragment;
        tuxSheet.LJZI = false;
        tuxSheet.LLD = false;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = (int) (i * 0.9f);
        tuxSheet2.LJZL = true;
        tuxSheet2.show(fragmentManager, TemplateEditFragment.class.getName());
    }
}
