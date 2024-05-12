package Y;

import X.ASQ;
import X.ASX;
import X.C19K;
import X.C27162AlK;
import X.C45601qe;
import X.C47263Igl;
import X.C47264Igm;
import X.C48358IyQ;
import X.C48881JGj;
import X.C48892JGu;
import X.C51105K3x;
import X.C51596KMu;
import X.C51600KMy;
import X.C6ZT;
import X.C78688UuS;
import X.HJZ;
import X.InterfaceC51059K2d;
import X.InterfaceC65784Pro;
import X.JKB;
import X.JKG;
import X.JOA;
import X.JQ0;
import X.KN9;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoVideoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS32S0001000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDTListenerS117S0100000_8 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            case 10:
                return onTouch$10(this, view, motionEvent);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case 12:
                return onTouch$12(this, view, motionEvent);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return onTouch$16(this, view, motionEvent);
            case 17:
                return onTouch$17(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS117S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        C48881JGj v;
        if (motionEvent.getActionMasked() != 1 || C6ZT.LIZ(view)) {
            return false;
        }
        JKB jkb = (JKB) iDTListenerS117S0100000_8.l0;
        if (jkb.v() != null && jkb.LJLLI != null && (v = jkb.v()) != null && v.LIZJ != null) {
            C48881JGj v2 = jkb.v();
            o.LJI(v2);
            C48892JGu.LIZ(v2, true);
            View.OnClickListener onClickListener = jkb.LLFF;
            if (onClickListener != null) {
                onClickListener.onClick(jkb.LJLLI);
            }
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((SearchTakoVideoRootAssem) iDTListenerS117S0100000_8.l0).getContainerView().performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$10(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) iDTListenerS117S0100000_8.l0;
        baseDiscoverAndSearchFragmentNew.getClass();
        if (motionEvent.getAction() == 1) {
            SearchResultParam searchResultParam = baseDiscoverAndSearchFragmentNew.LLIIII;
            if (searchResultParam != null && searchResultParam.getCapsuleWords() != null && baseDiscoverAndSearchFragmentNew.LLIIII.getCapsuleWords().isVisible()) {
                return false;
            }
            baseDiscoverAndSearchFragmentNew.Sl();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$11(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            C48358IyQ c48358IyQ = (C48358IyQ) iDTListenerS117S0100000_8.l0;
            c48358IyQ.getClass();
            c48358IyQ.LIZ(C47263Igl.LJLIL);
            c48358IyQ.LIZIZ.clearAnimation();
            return false;
        }
        C48358IyQ c48358IyQ2 = (C48358IyQ) iDTListenerS117S0100000_8.l0;
        c48358IyQ2.getClass();
        c48358IyQ2.LIZIZ(C47264Igm.LJLIL);
        c48358IyQ2.LIZIZ.startAnimation(AnimationUtils.loadAnimation(c48358IyQ2.LIZ, R.anim.br));
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            view.performClick();
            SearchPhotoFeedbackAssem searchPhotoFeedbackAssem = (SearchPhotoFeedbackAssem) iDTListenerS117S0100000_8.l0;
            C78688UuS.LJJLIIIIJ(motionEvent, searchPhotoFeedbackAssem.LLD, ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LJZL.getValue()).LJLILLLLZI, ((SearchPhotoFeedbackAssem) iDTListenerS117S0100000_8.l0).LL);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$13(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        if (JQ0.LIZ() && motionEvent.getActionMasked() == 1) {
            ((SearchPhotoHolder) iDTListenerS117S0100000_8.l0).LLLIIL(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$14(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) iDTListenerS117S0100000_8.l0;
        ecBaseDiscoverAndSearchFragmentNew.getClass();
        if (motionEvent.getAction() == 1) {
            SearchResultParam searchResultParam = ecBaseDiscoverAndSearchFragmentNew.LLF;
            if (searchResultParam != null && searchResultParam.getCapsuleWords() != null && ecBaseDiscoverAndSearchFragmentNew.LLF.getCapsuleWords().isVisible()) {
                return false;
            }
            ecBaseDiscoverAndSearchFragmentNew.Nl();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$15(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((InterfaceC65784Pro) iDTListenerS117S0100000_8.l0).invoke();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$16(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        Integer valueOf;
        C45601qe c45601qe;
        Integer valueOf2;
        C45601qe c45601qe2;
        Integer valueOf3;
        C45601qe c45601qe3;
        Integer valueOf4;
        C45601qe c45601qe4;
        C45601qe c45601qe5 = ((KN9) iDTListenerS117S0100000_8.l0).LLJJJ;
        if (c45601qe5 != null) {
            c45601qe5.setInteractionEnabled(true);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (valueOf.intValue() == 0 || valueOf.intValue() == 5) {
                ((KN9) iDTListenerS117S0100000_8.l0).LLJJI = motionEvent.getX();
                ((KN9) iDTListenerS117S0100000_8.l0).LLJJIII = motionEvent.getY();
                ViewParent parent = ((KN9) iDTListenerS117S0100000_8.l0).getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if (valueOf.intValue() == 2) {
                ((KN9) iDTListenerS117S0100000_8.l0).LLJJIJI = motionEvent.getX();
                ((KN9) iDTListenerS117S0100000_8.l0).LLJJIJIIJIL = motionEvent.getY();
                KN9 kn9 = (KN9) iDTListenerS117S0100000_8.l0;
                float f = kn9.LLJJI - kn9.LLJJIJI;
                if (Math.abs(kn9.LLJJIII - kn9.LLJJIJIIJIL) >= 100.0f && Math.abs(f) < 50.0f) {
                    C45601qe c45601qe6 = ((KN9) iDTListenerS117S0100000_8.l0).LLJJJ;
                    if (c45601qe6 != null) {
                        c45601qe6.setInteractionEnabled(false);
                    }
                    ViewParent parent2 = ((KN9) iDTListenerS117S0100000_8.l0).getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                    return false;
                }
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                ((KN9) iDTListenerS117S0100000_8.l0).LLJJIJIL = motionEvent.getX();
                ViewParent parent3 = ((KN9) iDTListenerS117S0100000_8.l0).getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
                KN9 kn92 = (KN9) iDTListenerS117S0100000_8.l0;
                if (Math.abs(kn92.LLJJI - kn92.LLJJIJIL) <= 10.0f) {
                    KN9 kn93 = (KN9) iDTListenerS117S0100000_8.l0;
                    CardView cardOne = (CardView) kn93.findViewById(R.id.db7);
                    CardView cardTwo = (CardView) kn93.findViewById(R.id.jjl);
                    CardView cardThree = (CardView) kn93.findViewById(R.id.l6v);
                    o.LJIIIIZZ(cardOne, "cardOne");
                    if (KN9.LJLJJLL(motionEvent, cardOne)) {
                        C45601qe c45601qe7 = kn93.LLJJJ;
                        if (c45601qe7 != null && (valueOf4 = Integer.valueOf(c45601qe7.getCurrentState())) != null) {
                            if (valueOf4.intValue() == R.id.kdy) {
                                EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = kn93.LLJJ;
                                if (effectRecommendationCarouselViewModel != null) {
                                    Context context = kn93.getContext();
                                    o.LJIIIIZZ(context, "context");
                                    effectRecommendationCarouselViewModel.gv0(new C51596KMu(context));
                                }
                            } else if ((valueOf4.intValue() == R.id.ke3 || valueOf4.intValue() == R.id.ke1) && (c45601qe4 = kn93.LLJJJ) != null) {
                                c45601qe4.LJLJJL(R.id.kdy);
                            }
                        }
                    } else {
                        o.LJIIIIZZ(cardTwo, "cardTwo");
                        if (KN9.LJLJJLL(motionEvent, cardTwo)) {
                            C45601qe c45601qe8 = kn93.LLJJJ;
                            if (c45601qe8 != null && (valueOf3 = Integer.valueOf(c45601qe8.getCurrentState())) != null) {
                                if (valueOf3.intValue() == R.id.ke3) {
                                    EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel2 = kn93.LLJJ;
                                    if (effectRecommendationCarouselViewModel2 != null) {
                                        Context context2 = kn93.getContext();
                                        o.LJIIIIZZ(context2, "context");
                                        effectRecommendationCarouselViewModel2.gv0(new C51596KMu(context2));
                                    }
                                } else if ((valueOf3.intValue() == R.id.kdy || valueOf3.intValue() == R.id.ke1) && (c45601qe3 = kn93.LLJJJ) != null) {
                                    c45601qe3.LJLJJL(R.id.ke3);
                                }
                            }
                        } else {
                            o.LJIIIIZZ(cardThree, "cardThree");
                            if (KN9.LJLJJLL(motionEvent, cardThree) && (c45601qe = kn93.LLJJJ) != null && (valueOf2 = Integer.valueOf(c45601qe.getCurrentState())) != null) {
                                if (valueOf2.intValue() == R.id.ke1) {
                                    EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel3 = kn93.LLJJ;
                                    if (effectRecommendationCarouselViewModel3 != null) {
                                        Context context3 = kn93.getContext();
                                        o.LJIIIIZZ(context3, "context");
                                        effectRecommendationCarouselViewModel3.gv0(new C51596KMu(context3));
                                    }
                                } else if ((valueOf2.intValue() == R.id.kdy || valueOf2.intValue() == R.id.ke3) && (c45601qe2 = kn93.LLJJJ) != null) {
                                    c45601qe2.LJLJJL(R.id.ke1);
                                }
                            }
                        }
                    }
                    return false;
                }
            }
        }
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel4 = ((KN9) iDTListenerS117S0100000_8.l0).LLJJ;
        if (effectRecommendationCarouselViewModel4 != null) {
            effectRecommendationCarouselViewModel4.gv0(C51600KMy.LIZ);
        }
        C45601qe c45601qe9 = ((KN9) iDTListenerS117S0100000_8.l0).LLJJJ;
        if (c45601qe9 != null) {
            c45601qe9.onTouchEvent(motionEvent);
        }
        return true;
    }

    public static final boolean onTouch$17(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((JOA) iDTListenerS117S0100000_8.l0).LIZIZ.LLLIIL(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((View) iDTListenerS117S0100000_8.l0).performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            ChooseSearchMusicFragment chooseSearchMusicFragment = (ChooseSearchMusicFragment) iDTListenerS117S0100000_8.l0;
            chooseSearchMusicFragment.Il();
            String valueOf = String.valueOf(((C19K) chooseSearchMusicFragment._$_findCachedViewById(R.id.czt)).getText());
            if (chooseSearchMusicFragment.wl().getState().LJLIL != 0) {
                z = false;
            }
            chooseSearchMusicFragment.LJLL = z;
            if (!TextUtils.isEmpty(valueOf)) {
                ChooseSearchMusicViewModel wl = chooseSearchMusicFragment.wl();
                wl.getClass();
                wl.setState(new AqS32S0001000_8(2, 8));
                chooseSearchMusicFragment.Hl(false);
            } else {
                chooseSearchMusicFragment.Dl(false);
                chooseSearchMusicFragment.Hl(chooseSearchMusicFragment.xl());
            }
            chooseSearchMusicFragment.LJLJLJ = null;
            ((C51105K3x) chooseSearchMusicFragment.LLFF.getValue()).LIZJ();
            ((InterfaceC51059K2d) chooseSearchMusicFragment.LLF.getValue()).setLastSearchSoundPage(HJZ.SEARCH_SUG_PAGE);
        }
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((SearchUserViewHolder) iDTListenerS117S0100000_8.l0).onClick(view);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View view, MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
            return false;
        }
        if (valueOf.intValue() == 0) {
            ((HalfDynamicSearchShopFragment) iDTListenerS117S0100000_8.l0).LJLJJL = motionEvent.getX();
            ((HalfDynamicSearchShopFragment) iDTListenerS117S0100000_8.l0).LJLJJLL = motionEvent.getY();
            return true;
        }
        if (valueOf.intValue() != 2) {
            return false;
        }
        float abs = Math.abs(motionEvent.getY() - ((HalfDynamicSearchShopFragment) iDTListenerS117S0100000_8.l0).LJLJJLL);
        float abs2 = Math.abs(motionEvent.getX() - ((HalfDynamicSearchShopFragment) iDTListenerS117S0100000_8.l0).LJLJJL);
        float y = motionEvent.getY();
        HalfDynamicSearchShopFragment halfDynamicSearchShopFragment = (HalfDynamicSearchShopFragment) iDTListenerS117S0100000_8.l0;
        if (y > halfDynamicSearchShopFragment.LJLJJLL && abs > abs2 && abs > C27162AlK.LJIIJ) {
            ASQ.LJ(halfDynamicSearchShopFragment, ASX.LIZ);
            return true;
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View curView, MotionEvent event) {
        JKG jkg = (JKG) iDTListenerS117S0100000_8.l0;
        o.LJIIIIZZ(curView, "curView");
        o.LJIIIIZZ(event, "event");
        jkg.getClass();
        if (event.getActionMasked() == 1) {
            curView.performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$7(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View curView, MotionEvent event) {
        JKG jkg = (JKG) iDTListenerS117S0100000_8.l0;
        o.LJIIIIZZ(curView, "curView");
        o.LJIIIIZZ(event, "event");
        jkg.getClass();
        if (event.getActionMasked() == 1) {
            curView.performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$8(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View curView, MotionEvent event) {
        JKG jkg = (JKG) iDTListenerS117S0100000_8.l0;
        o.LJIIIIZZ(curView, "curView");
        o.LJIIIIZZ(event, "event");
        jkg.getClass();
        if (event.getActionMasked() == 1) {
            curView.performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS117S0100000_8 iDTListenerS117S0100000_8, View curView, MotionEvent event) {
        JKG jkg = (JKG) iDTListenerS117S0100000_8.l0;
        o.LJIIIIZZ(curView, "curView");
        o.LJIIIIZZ(event, "event");
        jkg.getClass();
        if (event.getActionMasked() == 1) {
            curView.performClick();
            return false;
        }
        return false;
    }
}
