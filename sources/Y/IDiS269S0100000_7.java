package Y;

import X.AbstractC43973HNp;
import X.C0C3;
import X.C173636rf;
import X.C42053Gev;
import X.C43198GxO;
import X.C43213Gxd;
import X.C43222Gxm;
import X.C43542H7a;
import X.C45628HvU;
import X.C45635Hvb;
import X.C45644Hvk;
import X.C45649Hvp;
import X.InterfaceC45633HvZ;
import X.InterfaceC45640Hvg;
import X.KUP;
import X.KUR;
import X.ORZ;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.KidsDraftVideoFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDiS269S0100000_7 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
    }

    public static final void onPageScrollStateChanged$1(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
    }

    public static final void onPageScrollStateChanged$3(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
    }

    public static final void onPageScrolled$1(IDiS269S0100000_7 iDiS269S0100000_7, int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            case 2:
                onPageScrollStateChanged$2(this, i);
                return;
            case 3:
                onPageScrollStateChanged$3(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                return;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            case 2:
                onPageSelected$2(this, i);
                return;
            case 3:
                onPageSelected$3(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS269S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$2(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
        if (i == 1) {
            C45628HvU c45628HvU = (C45628HvU) iDiS269S0100000_7.l0;
            C45644Hvk c45644Hvk = c45628HvU.LJLJJL;
            if (c45644Hvk != null) {
                c45628HvU.LJLJJI = c45644Hvk.getCurrentItem();
                return;
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        C45644Hvk c45644Hvk2 = ((C45628HvU) iDiS269S0100000_7.l0).LJLJJL;
        if (c45644Hvk2 != null) {
            int currentItem = c45644Hvk2.getCurrentItem();
            C45628HvU c45628HvU2 = (C45628HvU) iDiS269S0100000_7.l0;
            int i2 = c45628HvU2.LJLJJI;
            if (currentItem != i2 || i != 0) {
                return;
            }
            C45635Hvb c45635Hvb = c45628HvU2.LJLJJLL;
            if (c45635Hvb != null) {
                InterfaceC45640Hvg LJJIIJ = c45635Hvb.LJJIIJ(i2);
                if (LJJIIJ == null) {
                    return;
                }
                LJJIIJ.LJJIJLIJ();
                return;
            }
            o.LJIJI("viewPagerAdapter");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public static final void onPageSelected$0(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
        ((C45649Hvp) iDiS269S0100000_7.l0).setPageSelected(i);
    }

    public static final void onPageSelected$1(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
        C42053Gev c42053Gev = C42053Gev.LIZIZ;
        Object obj = ListProtector.get(((MentionVideoActivity) iDiS269S0100000_7.l0).LJLJL, i);
        o.LJIIIIZZ(obj, "fragmentLists[position]");
        c42053Gev.LJIIJ((Fragment) obj);
    }

    public static final void onPageSelected$2(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
        AbstractC43973HNp abstractC43973HNp;
        Integer LLII;
        C45628HvU c45628HvU = (C45628HvU) iDiS269S0100000_7.l0;
        c45628HvU.LLII = i;
        C45635Hvb c45635Hvb = c45628HvU.LJLJJLL;
        if (c45635Hvb != null) {
            List<MyMediaModel> list = c45635Hvb.LJLJLJ;
            C45644Hvk c45644Hvk = c45628HvU.LJLJJL;
            if (c45644Hvk != null) {
                MyMediaModel myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(c45644Hvk.getCurrentItem(), list);
                if (myMediaModel == null) {
                    return;
                }
                C45628HvU c45628HvU2 = (C45628HvU) iDiS269S0100000_7.l0;
                ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = c45628HvU2.LLIIIL;
                if (choosePhotoPreviewPageConfig.isUgcTemplate || choosePhotoPreviewPageConfig.isEditorProReplace) {
                    C45635Hvb c45635Hvb2 = c45628HvU2.LJLJJLL;
                    if (c45635Hvb2 != null) {
                        c45628HvU2.LLJLL(c45635Hvb2.LJLJLJ);
                        ((C45628HvU) iDiS269S0100000_7.l0).LLJLLL();
                    } else {
                        o.LJIJI("viewPagerAdapter");
                        throw null;
                    }
                }
                if (myMediaModel.libraryState != null) {
                    ((C45628HvU) iDiS269S0100000_7.l0).LJJJJZ(myMediaModel);
                }
                C45628HvU c45628HvU3 = (C45628HvU) iDiS269S0100000_7.l0;
                C45635Hvb c45635Hvb3 = c45628HvU3.LJLJJLL;
                if (c45635Hvb3 != null) {
                    InterfaceC45640Hvg LJJIIJ = c45635Hvb3.LJJIIJ(c45628HvU3.LLII);
                    if (LJJIIJ != null) {
                        LJJIIJ.LJJIJL();
                    }
                    if (((float) myMediaModel.duration) >= ((Number) ((C45628HvU) iDiS269S0100000_7.l0).LLIIJI.getValue()).floatValue()) {
                        C45628HvU c45628HvU4 = (C45628HvU) iDiS269S0100000_7.l0;
                        InterfaceC45633HvZ interfaceC45633HvZ = c45628HvU4.LLILIL;
                        if (interfaceC45633HvZ != null) {
                            if (myMediaModel.LJI()) {
                                interfaceC45633HvZ.xq(myMediaModel);
                            }
                            if (c45628HvU4.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                                interfaceC45633HvZ.show(myMediaModel.LJI());
                            }
                        }
                    } else {
                        C45628HvU c45628HvU5 = (C45628HvU) iDiS269S0100000_7.l0;
                        InterfaceC45633HvZ interfaceC45633HvZ2 = c45628HvU5.LLILIL;
                        if (interfaceC45633HvZ2 != null && c45628HvU5.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                            interfaceC45633HvZ2.show(false);
                        }
                    }
                    C45628HvU c45628HvU6 = (C45628HvU) iDiS269S0100000_7.l0;
                    ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = c45628HvU6.LLIIIL;
                    if (!choosePhotoPreviewPageConfig2.isUgcTemplate && !choosePhotoPreviewPageConfig2.isEditorProReplace) {
                        C45635Hvb c45635Hvb4 = c45628HvU6.LJLJJLL;
                        if (c45635Hvb4 != null) {
                            c45628HvU6.LLJLL(c45635Hvb4.LJLJLJ);
                        } else {
                            o.LJIJI("viewPagerAdapter");
                            throw null;
                        }
                    }
                    C45628HvU c45628HvU7 = (C45628HvU) iDiS269S0100000_7.l0;
                    if (!c45628HvU7.LJLIL) {
                        C45635Hvb c45635Hvb5 = c45628HvU7.LJLJJLL;
                        if (c45635Hvb5 != null) {
                            c45628HvU7.LLJILJILJ(new AqS173S0100000_7(c45628HvU7, 132), c45635Hvb5.LJLJLJ);
                            C45635Hvb c45635Hvb6 = ((C45628HvU) iDiS269S0100000_7.l0).LJLJJLL;
                            if (c45635Hvb6 != null) {
                                MyMediaModel myMediaModel2 = (MyMediaModel) ORZ.LJLLLLLL(i, c45635Hvb6.LJLJLJ);
                                if (myMediaModel2 != null) {
                                    C45628HvU c45628HvU8 = (C45628HvU) iDiS269S0100000_7.l0;
                                    ChooseMediaViewModel chooseMediaViewModel = c45628HvU8.LJLLI;
                                    if (chooseMediaViewModel != null) {
                                        chooseMediaViewModel.setState(new AqS173S0100000_7(myMediaModel2, 263));
                                        if (c45628HvU8.LLIIIL.showDockInPreviewPage && (abstractC43973HNp = c45628HvU8.LLIFFJFJJ) != null && (LLII = abstractC43973HNp.LLII(myMediaModel2)) != null) {
                                            c45628HvU8.LLJILJIL(LLII.intValue() + 1);
                                        }
                                    } else {
                                        o.LJIJI("chooseMediaViewModel");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("viewPagerAdapter");
                                throw null;
                            }
                        } else {
                            o.LJIJI("viewPagerAdapter");
                            throw null;
                        }
                    }
                    ((C45628HvU) iDiS269S0100000_7.l0).LLJJJJ();
                    return;
                }
                o.LJIJI("viewPagerAdapter");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPagerAdapter");
        throw null;
    }

    public static final void onPageSelected$3(IDiS269S0100000_7 iDiS269S0100000_7, int i) {
        AwemeDraft awemeDraft;
        int count = ((KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0).vl().getCount();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= count) {
                break;
            }
            C43222Gxm LJJIII = ((KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0).vl().LJJIII(i2);
            if (LJJIII != null) {
                if (i2 != i) {
                    z = false;
                }
                LJJIII.LIZJ(z);
            }
            i2++;
        }
        KidsDraftVideoFeedFragment kidsDraftVideoFeedFragment = (KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0;
        kidsDraftVideoFeedFragment.LJLIL = (VideoPublishEditModel) ListProtector.get(kidsDraftVideoFeedFragment.vl().LJLJJLL, i);
        KidsDraftVideoFeedFragment kidsDraftVideoFeedFragment2 = (KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0;
        VideoPublishEditModel videoPublishEditModel = kidsDraftVideoFeedFragment2.LJLIL;
        if (videoPublishEditModel != null) {
            new C43542H7a("VideoPublishFragment");
            awemeDraft = C43542H7a.LJ(videoPublishEditModel, "KidsEdit");
        } else {
            awemeDraft = null;
        }
        kidsDraftVideoFeedFragment2.LJLILLLLZI = awemeDraft;
        KidsDraftVideoFeedFragment kidsDraftVideoFeedFragment3 = (KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0;
        kidsDraftVideoFeedFragment3.LJLJI = i + 1;
        if (C43213Gxd.LIZJ) {
            kidsDraftVideoFeedFragment3.xl(true);
            if (kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_) != null) {
                C43198GxO download_video_progress_bar = (C43198GxO) kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_);
                o.LJIIIIZZ(download_video_progress_bar, "download_video_progress_bar");
                download_video_progress_bar.LIZLLL(C43198GxO.LJLLILLLL);
            }
        } else {
            if (kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_) != null) {
                kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_).getClass();
                if (C43198GxO.LJLLI.hasMessages(1)) {
                    kidsDraftVideoFeedFragment3.xl(true);
                    ((C43198GxO) kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_)).LIZIZ();
                }
            }
            if (kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_) != null) {
                kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_).getClass();
                if (C43198GxO.LJLLI.hasMessages(2)) {
                    kidsDraftVideoFeedFragment3.xl(true);
                    ((C43198GxO) kidsDraftVideoFeedFragment3._$_findCachedViewById(R.id.cg_)).LIZ();
                }
            }
            kidsDraftVideoFeedFragment3.xl(false);
        }
        if (i == ((KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0).vl().getCount() - 1) {
            KUP kup = (KUP) ((KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0)._$_findCachedViewById(R.id.g99);
            KUR LIZIZ = kup.LIZIZ(true);
            if (LIZIZ != null) {
                LIZIZ.LJII();
            }
            kup.LJLJLJ = 1;
            if (kup.LJLILLLLZI != null) {
                kup.LIZ();
            }
            if (kup.LJLLILLLL != -1 && !TextUtils.isEmpty(kup.LJLLJ)) {
                kup.LJLLILLLL = -1L;
            }
        }
    }

    public static final void onPageScrolled$0(IDiS269S0100000_7 iDiS269S0100000_7, int i, float f, int i2) {
        float tabIndicatorWidth = (i + f) * ((C45649Hvp) iDiS269S0100000_7.l0).getTabIndicatorWidth();
        if (C173636rf.LIZIZ(((C45649Hvp) iDiS269S0100000_7.l0).getContext())) {
            tabIndicatorWidth = -tabIndicatorWidth;
        }
        ((C45649Hvp) iDiS269S0100000_7.l0).LJLILLLLZI.setTranslationX(tabIndicatorWidth);
    }

    public static final void onPageScrolled$2(IDiS269S0100000_7 iDiS269S0100000_7, int i, float f, int i2) {
        C45644Hvk c45644Hvk = ((C45628HvU) iDiS269S0100000_7.l0).LJLJJL;
        if (c45644Hvk != null) {
            int currentItem = c45644Hvk.getCurrentItem();
            C45628HvU c45628HvU = (C45628HvU) iDiS269S0100000_7.l0;
            int i3 = c45628HvU.LJLJJI;
            if (currentItem == i3 && i2 > 0) {
                C45635Hvb c45635Hvb = c45628HvU.LJLJJLL;
                if (c45635Hvb != null) {
                    InterfaceC45640Hvg LJJIIJ = c45635Hvb.LJJIIJ(i3);
                    if (LJJIIJ != null) {
                        LJJIIJ.LLIIJI();
                        return;
                    }
                    return;
                }
                o.LJIJI("viewPagerAdapter");
                throw null;
            }
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public static final void onPageScrolled$3(IDiS269S0100000_7 iDiS269S0100000_7, int i, float f, int i2) {
        if (((KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0).LJLJJI && f == 0.0f && i2 == 0) {
            iDiS269S0100000_7.onPageSelected(i);
            ((KidsDraftVideoFeedFragment) iDiS269S0100000_7.l0).LJLJJI = false;
        }
    }
}
