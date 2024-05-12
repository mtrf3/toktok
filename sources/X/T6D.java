package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6D implements T67 {
    public final ViewPager LIZ;
    public final C80675VlP LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final Context LJ;
    public Challenge LJFF;
    public NewFaceStickerBean LJI;
    public final ChallengeDetailFragment LJII;

    @Override // X.T67
    public final void LJ() {
        this.LIZIZ.LLFF.clear();
    }

    public final T6H<AmeBaseFragment> LJFF() {
        PagerAdapter adapter = this.LIZ.getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter<com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment>");
        return (T6H) adapter;
    }

    @Override // X.T67
    public final void LIZ(int i) {
        Fragment LJJIII = LJFF().LJJIII(this.LIZ.getCurrentItem());
        o.LJIIIIZZ(LJJIII, "mPagerAdapter.getItem(mViewPager.currentItem)");
        if ((LJJIII instanceof CommerceChallengeFragment) && i != 0) {
            ((CommerceChallengeFragment) LJJIII).wl();
        }
    }

    @Override // X.T67
    public final void LIZIZ(float f) {
        Fragment LJJIII = LJFF().LJJIII(this.LIZ.getCurrentItem());
        o.LJIIIIZZ(LJJIII, "mPagerAdapter.getItem(mViewPager.currentItem)");
        if (!(LJJIII instanceof CommerceChallengeFragment) || f == 0.0f) {
            return;
        }
        ((CommerceChallengeFragment) LJJIII).wl();
    }

    @Override // X.T67
    public final boolean LIZLLL(int i) {
        if (i == R.id.kdb) {
            ICommerceLockStickerService LIZJ = CommerceLockStickerServiceImpl.LIZJ();
            NewFaceStickerBean newFaceStickerBean = this.LJI;
            if (newFaceStickerBean != null && LIZJ.LIZ(newFaceStickerBean)) {
                LIZJ.LIZIZ(this.LJ, this.LJI, "challenge");
                return true;
            }
        }
        return false;
    }

    public T6D(View viewRoot, Fragment parent) {
        o.LJIIIZ(viewRoot, "viewRoot");
        o.LJIIIZ(parent, "parent");
        View findViewById = viewRoot.findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById, "viewRoot.findViewById(R.id.viewpager)");
        this.LIZ = (ViewPager) findViewById;
        View findViewById2 = viewRoot.findViewById(R.id.kyt);
        o.LJIIIIZZ(findViewById2, "viewRoot.findViewById(R.id.tab_layout)");
        this.LIZIZ = (C80675VlP) findViewById2;
        View findViewById3 = viewRoot.findViewById(R.id.gye);
        o.LJIIIIZZ(findViewById3, "viewRoot.findViewById(R.id.navigator_div)");
        this.LIZJ = findViewById3;
        this.LIZLLL = (ImageView) viewRoot.findViewById(R.id.kdh);
        Context context = viewRoot.getContext();
        o.LJIIIIZZ(context, "viewRoot.context");
        this.LJ = context;
        this.LJII = (ChallengeDetailFragment) parent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.T67
    public final void LIZJ(ChallengeDetail data, int i) {
        ImageView imageView;
        List<ShowItemsStruct> list;
        List<ShowItemsStruct> list2;
        String str;
        String str2;
        o.LJIIIZ(data, "data");
        this.LJFF = data.challenge;
        try {
            Gson gson = new Gson();
            Challenge challenge = this.LJFF;
            if (challenge != null) {
                str2 = challenge.getChallengeStickerDetail();
            } else {
                str2 = null;
            }
            this.LJI = (NewFaceStickerBean) gson.LJII(str2, new T6G().getType());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LJI != null && CommerceLockStickerServiceImpl.LIZJ().LIZ(this.LJI) && (imageView = this.LIZLLL) != null) {
            imageView.setImageResource(R.drawable.c71);
        }
        Challenge challenge2 = this.LJFF;
        if (challenge2 != null) {
            list = challenge2.showItems;
        } else {
            list = null;
        }
        if (C79004UzY.LJJIFFI(list)) {
            this.LIZIZ.setVisibility(8);
            return;
        }
        ViewPager viewPager = this.LIZ;
        o.LJII(viewPager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ChallengeViewPager");
        ((VW7) viewPager).setPagingEnable(true);
        this.LIZ.setOffscreenPageLimit(2);
        this.LIZIZ.setVisibility(0);
        this.LIZJ.setVisibility(0);
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = this.LIZ.getCurrentItem();
        Object obj = ListProtector.get(this.LJII.Gl(), 0);
        Object obj2 = ListProtector.get(LJFF().LJLJL, 0);
        AmeBaseFragment ameBaseFragment = (AmeBaseFragment) ListProtector.get(LJFF().LJLJJLL, 0);
        ameBaseFragment.isCommerce = true;
        List<T6F> Gl = this.LJII.Gl();
        Gl.clear();
        Gl.add(obj);
        List<AmeBaseFragment> list3 = LJFF().LJLJJLL;
        list3.clear();
        list3.add(ameBaseFragment);
        List<Integer> list4 = LJFF().LJLJL;
        list4.clear();
        list4.add(obj2);
        Challenge challenge3 = this.LJFF;
        if (challenge3 != null && (list2 = challenge3.showItems) != null) {
            for (ShowItemsStruct showItemsStruct : list2) {
                CommerceChallengeFragment commerceChallengeFragment = new CommerceChallengeFragment();
                commerceChallengeFragment.LJLJJI = showItemsStruct.getDesc();
                commerceChallengeFragment.LJLJJLL = showItemsStruct.getSchema();
                Challenge challenge4 = this.LJFF;
                if (challenge4 != null) {
                    str = challenge4.getCid();
                } else {
                    str = null;
                }
                commerceChallengeFragment.LJLJI = str;
                this.LJII.Gl().add(commerceChallengeFragment);
                LJFF().LJLJJLL.add(commerceChallengeFragment);
                LJFF().LJLJL.add(Integer.valueOf(commerceChallengeFragment.hashCode()));
            }
        }
        Iterator<T6F> it = this.LJII.Gl().iterator();
        while (it.hasNext()) {
            it.next().ai(true);
        }
        LJFF().notifyDataSetChanged();
        if (i >= 0 && i < LJFF().LJLJJLL.size()) {
            c76732zl.element = i;
        }
        this.LIZIZ.setupWithViewPager(this.LIZ);
        this.LIZIZ.setOnTabClickListener(new T6E(this));
        this.LIZIZ.LIZIZ(new C72823Si3(this));
        this.LIZ.setCurrentItem(c76732zl.element);
        this.LIZ.addOnPageChangeListener(new C60143Nj1(c76732zl, this));
        this.LJII.onPageSelected(c76732zl.element);
    }
}
