package X;

import Y.ARunnableS37S0100000_1;
import Y.IDHandlerS6S0000000_1;
import android.app.Activity;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.2LH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2LH implements C2NO {
    public final BaseListFragmentPanel LJLIL;
    public C62828OlE LJLILLLLZI;
    public ViewStub LJLJI;
    public C2LI LJLJJI;
    public final C62822Ol8 LJLJJL;
    public AqS148S0200000_1 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;

    public final void LIZ() {
        LIZLLL(false);
        int i = this.LJLJLLL;
        if (i != 1 && i != 2) {
            if (i != 4 || this.LJLILLLLZI == null) {
                return;
            }
            C62828OlE.LJI();
            return;
        }
        this.LJLJLJ = true;
    }

    public static final void LIZJ() {
        Aweme aweme;
        if (!C2M7.LIZ() && (aweme = C44938HkM.LJFF) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
            FMX.LJIIL("download_failure_window_show", c188727au.LIZ);
        }
    }

    @Override // X.C2NO
    public final void LJLIIIL() {
        if (C2M7.LIZ()) {
            return;
        }
        LIZLLL(false);
    }

    public C2LH(BaseListFragmentPanel panel) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL = panel;
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 22));
        this.LJLJLLL = -1;
    }

    public final void LIZIZ(Aweme aweme) {
        boolean z;
        if (C2M7.LIZ()) {
            IDownloadBarAbility iDownloadBarAbility = (IDownloadBarAbility) this.LJLJJL.getValue();
            if (iDownloadBarAbility != null) {
                iDownloadBarAbility.us0(aweme);
                return;
            }
            return;
        }
        if (aweme != null && C78540Us4.LJIILIIL(aweme)) {
            LIZLLL(false);
            return;
        }
        if (C44938HkM.LIZIZ()) {
            LIZLLL(true);
            C62828OlE c62828OlE = this.LJLILLLLZI;
            if (c62828OlE == null) {
                return;
            }
            c62828OlE.LJIIJ(C62828OlE.LJLLL);
            return;
        }
        if (this.LJLILLLLZI != null && C62828OlE.LJ(1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZLLL(true);
            C62828OlE c62828OlE2 = this.LJLILLLLZI;
            if (c62828OlE2 == null) {
                return;
            }
            C62828OlE.LIZLLL(c62828OlE2, c62828OlE2.getIsDownloadingPhoto(), c62828OlE2.getSuccessDownloadMediaNumber(), null, 12);
            return;
        }
        if (this.LJLILLLLZI != null && C62828OlE.LJ(2) && C44938HkM.LJIIZILJ) {
            LIZLLL(true);
            C62828OlE c62828OlE3 = this.LJLILLLLZI;
            if (c62828OlE3 == null) {
                return;
            }
            C62828OlE.LIZIZ(c62828OlE3, c62828OlE3.getIsDownloadingPhoto(), null, 14);
            if (c62828OlE3.getIsDownloadingPhoto()) {
                return;
            }
            LIZJ();
            return;
        }
        LIZLLL(false);
    }

    public final void LIZLLL(boolean z) {
        if (C2M7.LIZ()) {
            return;
        }
        if (C35138Dqg.LIZIZ() && z && !C2M7.LIZ()) {
            FAJ.LJIIIIZZ(new ARunnableS37S0100000_1(this, 12));
        }
        C62828OlE c62828OlE = this.LJLILLLLZI;
        if (c62828OlE != null) {
            int i = 0;
            if (z) {
                c62828OlE.setVisibility(0);
                if (!C2M7.LIZ()) {
                    c62828OlE.measure(0, 0);
                    int measuredHeight = c62828OlE.getMeasuredHeight();
                    C57092Lx.LIZ.getClass();
                    int LIZ = C61447O9r.LIZ();
                    if (this.LJLJJI == null) {
                        LFH.LIZIZ.LIZLLL().LJIIZILJ();
                        this.LJLJJI = LEZ.LIZ.LIZJ(LIZ, c62828OlE);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    C2LI c2li = this.LJLJJI;
                    if (c2li != null) {
                        i = c2li.LJJIFFI(LIZ);
                    }
                    layoutParams.bottomMargin = i;
                    c62828OlE.setLayoutParams(layoutParams);
                    c62828OlE.requestLayout();
                    i = measuredHeight;
                }
                C2MA curFeedViewHolder = this.LJLIL.getCurFeedViewHolder();
                if (curFeedViewHolder instanceof InterfaceC55219Lln) {
                    ((InterfaceC55219Lln) curFeedViewHolder).l6(i, true);
                    return;
                }
                return;
            }
            c62828OlE.setVisibility(8);
            if (C2OF.LJI(this.LJLIL.getCurrentAweme(), this.LJLIL.getEventType(), new WeakReference(this.LJLIL))) {
                return;
            }
            C2MA curFeedViewHolder2 = this.LJLIL.getCurFeedViewHolder();
            if (!(curFeedViewHolder2 instanceof InterfaceC55219Lln)) {
                return;
            }
            ((InterfaceC55219Lln) curFeedViewHolder2).l6(c62828OlE.getHeight(), false);
        }
    }

    public final void LJ(C45382HrW c45382HrW) {
        boolean z;
        boolean z2;
        boolean z3;
        C62828OlE c62828OlE;
        boolean z4;
        boolean z5;
        String aid;
        if (!C2M7.LIZ()) {
            this.LJLJLJ = false;
            c45382HrW.getClass();
            boolean z6 = C45382HrW.LJ;
            if (this.LJLIL.getCurrentAweme() != null && C78540Us4.LJIILIIL(this.LJLIL.getCurrentAweme())) {
                z = true;
            } else {
                z = false;
            }
            Aweme currentAweme = this.LJLIL.getCurrentAweme();
            if (currentAweme == null || (aid = currentAweme.getAid()) == null) {
                z2 = false;
            } else {
                z2 = C95D.LJIIL.containsKey(aid);
            }
            if (!z && !z2 && C45382HrW.LIZIZ != 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            LIZLLL(z3);
            int i = C45382HrW.LIZIZ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    this.LJLIL.restoreStoryPlayMode();
                                    return;
                                }
                                LIZLLL(false);
                                if (this.LJLILLLLZI == null) {
                                    return;
                                }
                                C62828OlE.LJI();
                                return;
                            }
                            this.LJLIL.restoreStoryPlayMode();
                            if (this.LJLILLLLZI != null && C62828OlE.LJ(2)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5 && !z && !z2) {
                                C62828OlE c62828OlE2 = this.LJLILLLLZI;
                                if (c62828OlE2 != null) {
                                    C62828OlE.LIZIZ(c62828OlE2, z6, null, 14);
                                }
                                LIZLLL(true);
                                if (z6) {
                                    return;
                                }
                                LIZJ();
                                return;
                            }
                            if (C44938HkM.LIZLLL() && !C44938HkM.LIZJ()) {
                                if (!z && !z2) {
                                    C62828OlE c62828OlE3 = this.LJLILLLLZI;
                                    if (c62828OlE3 != null) {
                                        C62828OlE.LIZIZ(c62828OlE3, z6, null, 14);
                                    }
                                    LIZLLL(true);
                                    if (z6) {
                                        return;
                                    }
                                    LIZJ();
                                    return;
                                }
                                if (this.LJLILLLLZI != null) {
                                    IDHandlerS6S0000000_1 iDHandlerS6S0000000_1 = C62828OlE.LJLLJ;
                                    if (!iDHandlerS6S0000000_1.hasMessages(2)) {
                                        iDHandlerS6S0000000_1.sendEmptyMessageDelayed(2, 20000L);
                                    }
                                }
                                LIZLLL(false);
                                return;
                            }
                            LIZLLL(false);
                            return;
                        }
                        int i2 = C45382HrW.LJFF;
                        this.LJLIL.restoreStoryPlayMode();
                        if (this.LJLILLLLZI != null && C62828OlE.LJ(1)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 && !z) {
                            C62828OlE c62828OlE4 = this.LJLILLLLZI;
                            if (c62828OlE4 != null) {
                                C62828OlE.LIZLLL(c62828OlE4, z6, i2, null, 12);
                            }
                            LIZLLL(true);
                            return;
                        }
                        if (C44938HkM.LIZLLL() && !C44938HkM.LIZJ()) {
                            if (!z && !z2) {
                                C62828OlE c62828OlE5 = this.LJLILLLLZI;
                                if (c62828OlE5 != null) {
                                    C62828OlE.LIZLLL(c62828OlE5, z6, i2, null, 12);
                                }
                                LIZLLL(true);
                                return;
                            }
                            LIZLLL(false);
                            if (!C44938HkM.LIZLLL()) {
                                return;
                            }
                            ShareExtService shareExtService = C4LD.LIZIZ;
                            Activity activity = this.LJLIL.activity;
                            o.LJIIIIZZ(activity, "panel.getActivity()");
                            shareExtService.LJJJJI(activity, c45382HrW);
                            return;
                        }
                        LIZLLL(false);
                        return;
                    }
                    this.LJLIL.restoreStoryPlayMode();
                    return;
                }
                this.LJLIL.loopCurrentStory();
                if (!z && !z2 && (c62828OlE = this.LJLILLLLZI) != null) {
                    c62828OlE.LJIIJ(C45382HrW.LIZJ);
                }
                if (!this.LJLJL) {
                    return;
                }
                LIZ();
                return;
            }
            this.LJLIL.loopCurrentStory();
            if (!z && !z2) {
                C62828OlE c62828OlE6 = this.LJLILLLLZI;
                if (c62828OlE6 != null) {
                    c62828OlE6.LJII();
                }
                if (this.LJLJL) {
                    LIZ();
                    return;
                } else {
                    LIZLLL(true);
                    return;
                }
            }
            if (!C44938HkM.LIZLLL() || C44938HkM.LIZJ()) {
                return;
            }
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.q_k);
            c5s1.LJ();
        }
    }

    @Override // X.C2NO
    public final void LJLIIL(boolean z) {
        if (C2M7.LIZ()) {
            return;
        }
        if (z) {
            C57082Lw.LIZ.LIZJ("photo_click_try").postValue(C44938HkM.LJFF);
        } else {
            LIZLLL(false);
            C57082Lw.LIZ.LIZJ("video_click_retry").postValue(C44938HkM.LJFF);
        }
    }
}
