package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardImagesFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardTemplateFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.S6a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71544S6a extends FragmentStateAdapter {
    public static final ArrayList<Integer> LJLLI = C47261Igj.LJII(Integer.valueOf(R.string.a0x), Integer.valueOf(R.string.fa4));
    public final List<Fragment> LJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return LJLLI.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        return (Fragment) ListProtector.get(this.LJLL, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71544S6a(Fragment ft, S6R dialogAction) {
        super(ft);
        o.LJIIIZ(ft, "ft");
        o.LJIIIZ(dialogAction, "dialogAction");
        BillboardTemplateFragment billboardTemplateFragment = new BillboardTemplateFragment();
        billboardTemplateFragment.LJLIL = dialogAction;
        BillboardImagesFragment billboardImagesFragment = new BillboardImagesFragment();
        billboardImagesFragment.LJLIL = dialogAction;
        this.LJLL = C47261Igj.LJII(billboardTemplateFragment, billboardImagesFragment);
    }
}
