package com.ss.android.ugc.aweme.feed.landscape;

import X.ALX;
import X.AbstractC51687KQh;
import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.C00F;
import X.C16880lQ;
import X.C176276vv;
import X.C188577af;
import X.C188727au;
import X.C200417tl;
import X.C2043180d;
import X.C208088Eq;
import X.C214348b8;
import X.C218678i7;
import X.C220488l2;
import X.C221108m2;
import X.C222578oP;
import X.C222688oa;
import X.C223338pd;
import X.C227768wm;
import X.C2308494e;
import X.C241249dQ;
import X.C27740Aue;
import X.C2KM;
import X.C2L4;
import X.C2M9;
import X.C2MA;
import X.C2NU;
import X.C2TT;
import X.C2U8;
import X.C31633CbF;
import X.C35168DrA;
import X.C36922EeM;
import X.C38450F7e;
import X.C40883G2t;
import X.C46319IFv;
import X.C46361IHl;
import X.C46416IJo;
import X.C47242IgQ;
import X.C48229IwL;
import X.C48231IwN;
import X.C48662J7y;
import X.C48796JDc;
import X.C50420Jqa;
import X.C51684KQe;
import X.C51686KQg;
import X.C51689KQj;
import X.C51690KQk;
import X.C51692KQm;
import X.C51693KQn;
import X.C51694KQo;
import X.C55083Ljb;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56202M3y;
import X.C56462Jm;
import X.C56742Ko;
import X.C57285Me1;
import X.C57293Me9;
import X.C57362MfG;
import X.C5S1;
import X.C5WY;
import X.C60392Yp;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72083SQt;
import X.C76965UIn;
import X.C77266UUc;
import X.C78450Uqc;
import X.C78451Uqd;
import X.C78866UxK;
import X.C78996UzQ;
import X.C79004UzY;
import X.C7ZZ;
import X.C80796VnM;
import X.C80S;
import X.C81334Vw2;
import X.C8L9;
import X.C9K4;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.FMX;
import X.FRW;
import X.HG3;
import X.IDR;
import X.IWF;
import X.InterfaceC222708oc;
import X.InterfaceC222998p5;
import X.InterfaceC2302191t;
import X.InterfaceC46330IGg;
import X.InterfaceC47101Ie9;
import X.InterfaceC51691KQl;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.InterfaceC57288Me4;
import X.InterfaceC65895Ptb;
import X.InterfaceC72642tA;
import X.J9P;
import X.JHM;
import X.K02;
import X.LNH;
import X.M89;
import X.QD3;
import X.RBX;
import X.V16;
import X.VPK;
import X.ViewOnTouchListenerC51695KQp;
import X.WM7;
import X.X1D;
import X.Z9N;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS27S0200000_8;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.adapter.PanelScope;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.LandscapeCellAssem;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.experiments.LandscapeRefactorExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class LandscapeFragmentPanel extends AbstractC51687KQh implements InterfaceC2302191t, IDR, InterfaceC47101Ie9, InterfaceC72642tA<C50420Jqa>, InterfaceC55100Ljs, InterfaceC57288Me4, DisplayManager.DisplayListener, C2L4 {
    public C80796VnM LJLIL;
    public C5WY LJLILLLLZI;
    public C223338pd LJLJI;
    public ImageView LJLJJI;
    public C55083Ljb LJLJJL;
    public C48662J7y LJLJJLL;
    public InterfaceC51691KQl LJLJL;
    public boolean LJLJLJ;
    public Aweme LJLJLLL;
    public boolean LJLLILLLL;
    public DisplayManager LJLLJ;
    public long LJLLL;
    public boolean LJLLLL;
    public M89 LJLLLLLL;
    public InterfaceC46330IGg LJZI;
    public C2MA LLD;
    public long LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public InterfaceC55235Lm3 LLFII;
    public C51693KQn LLFZ;
    public boolean LJLL = true;
    public final VPK LJLLI = new VPK();
    public boolean LJLZ = true;
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 81));
    public boolean LJZL = true;
    public final ViewOnTouchListenerC51695KQp LL = new ViewOnTouchListenerC51695KQp();
    public final ViewModelStore LLI = new ViewModelStore();

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void G1() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void N2() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void S1() {
    }

    @Override // X.IDR
    public final /* synthetic */ void deleteUserStory(int i) {
    }

    @Override // X.IDR
    public final /* synthetic */ void disableHotComment(String str) {
    }

    @Override // X.IDR
    public final /* synthetic */ IFeedPanelPlatformAbility getFeedPanelPlatformAbility() {
        return null;
    }

    @Override // X.IDR
    public final Aweme getNextAweme(Aweme aweme) {
        return null;
    }

    @Override // X.IDR
    public final String getOmSdkContentUrl(Aweme aweme) {
        return "";
    }

    @Override // X.IDR
    public final InterfaceC222998p5 getPinchListener() {
        return null;
    }

    @Override // X.IDR
    public final /* synthetic */ String getPlayListIdKey() {
        return "";
    }

    @Override // X.IDR
    public final /* synthetic */ String getPlayListIdValue() {
        return "";
    }

    @Override // X.IDR
    public final /* synthetic */ String getPlayListType() {
        return "";
    }

    @Override // X.IDR
    public final Aweme getPrevAweme(Aweme aweme) {
        return null;
    }

    @Override // X.IDR
    public final /* synthetic */ String getSimKitSceneID() {
        return null;
    }

    @Override // X.IDR
    public final String getTabName() {
        return "";
    }

    @Override // X.IDR
    public final void handleMobShowEvent() {
    }

    @Override // X.InterfaceC2302191t
    public final void handlePause(boolean z) {
    }

    @Override // X.IDR
    public final boolean hasSlideOperation() {
        return false;
    }

    @Override // X.IDR
    public final /* synthetic */ void hideShareStayHomeGuide(long j, long j2) {
    }

    @Override // X.AbstractC51687KQh
    public final void initPanel() {
    }

    @Override // X.IDR
    public final boolean isAdHasClickRefresh() {
        return false;
    }

    @Override // X.IDR
    public final boolean isDetail() {
        return false;
    }

    @Override // X.AbstractC51687KQh
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.IDR
    public final boolean isScrollDragging() {
        return false;
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void j1() {
    }

    @Override // X.IDR
    public final /* synthetic */ void makeCurrentPlayScene() {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    @Override // X.IDR
    public final void onPlayCompletedToShowShareGuide(String str) {
    }

    @Override // X.IDR
    public final void onPlayCompletedToShowSwipeUpGuide() {
    }

    @Override // X.IDR
    public final /* synthetic */ void onPlayProgressChange(String str, float f) {
        throw null;
    }

    @Override // X.IDR
    public final void onPlaying(String str) {
    }

    @Override // X.IDR
    public final /* synthetic */ void onPreparePlay(String str) {
    }

    @Override // X.IDR
    public final /* synthetic */ void onProgressUpdated(String str, int i) {
    }

    @Override // X.IDR
    public final void onRenderFirstFrame(String str) {
    }

    @Override // X.InterfaceC57288Me4
    public final void onResponseSuccess(FollowStatus followStatus) {
    }

    @Override // X.IDR
    public final void onStoryPageSelected() {
    }

    @Override // X.IDR
    public final /* synthetic */ void onVideoPaused(String str) {
    }

    @Override // X.InterfaceC47101Ie9
    public final void p3(long j, long j2, String str) {
    }

    @Override // X.InterfaceC2302191t
    public final void playAdStoryVideo() {
    }

    @Override // X.IDR
    public final boolean postDelayed(Runnable runnable, long j) {
        return false;
    }

    @Override // X.IDR
    public final void postRequestId() {
    }

    @Override // X.IDR
    public final /* synthetic */ void resetShareButtonStatus() {
    }

    @Override // X.IDR
    public final void setVideoAppLogDuration(long j) {
    }

    @Override // X.IDR
    public final /* synthetic */ boolean shouldShowSeekBar() {
        return true;
    }

    @Override // X.IDR
    public final void showFollowGuide() {
    }

    @Override // X.IDR
    public final void showNotInterestedTutorialInternal() {
    }

    @Override // X.IDR
    public final void showScrollToFeedFollowGuide() {
    }

    @Override // X.IDR
    public final /* synthetic */ boolean showShareStayHomeGuide() {
        return false;
    }

    @Override // X.IDR
    public final void showStrengthenGuide() {
    }

    @Override // X.IDR
    public final void showStrengthenGuideInternal() {
    }

    @Override // X.IDR
    public final void trackLivePlay(String str) {
    }

    @Override // X.IDR
    public final boolean tryMoveToNext(boolean z) {
        return false;
    }

    @Override // X.IDR
    public final boolean tryMoveToPrevInBg() {
        return false;
    }

    public final Aweme LJIIJJI() {
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return null;
            }
            return landscapeFeedViewPagerAbility.getCurrentPlayAweme();
        }
        return this.LJLJLLL;
    }

    public final ImageView LJIIL() {
        ImageView imageView;
        if (this.LJLJJI == null && this.LJLJLJ) {
            C2MA curViewHolder = getCurViewHolder();
            if (curViewHolder != null) {
                imageView = curViewHolder.s7();
            } else {
                imageView = null;
            }
            this.LJLJJI = imageView;
            if (imageView != null) {
                C16880lQ.LJIILLIIL(imageView, new ACListenerS28S0100000_8(this, 13));
            }
        }
        return this.LJLJJI;
    }

    public final void LJIILIIL() {
        C2MA c2ma;
        C2MA c2ma2;
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility != null) {
                c2ma = landscapeFeedViewPagerAbility.getPreViewHolder();
            }
            c2ma = null;
        } else {
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM != null) {
                if (c80796VnM.getCurrentItem() >= 1) {
                    C80796VnM c80796VnM2 = this.LJLIL;
                    if (c80796VnM2 != null) {
                        for (int childCount = c80796VnM2.getChildCount() - 1; -1 < childCount; childCount--) {
                            C80796VnM c80796VnM3 = this.LJLIL;
                            if (c80796VnM3 != null) {
                                Object tag = c80796VnM3.getChildAt(childCount).getTag(R.id.d87);
                                if (tag instanceof C2MA) {
                                    C80796VnM c80796VnM4 = this.LJLIL;
                                    if (c80796VnM4 != null) {
                                        c2ma = (C2MA) tag;
                                        if (LJIIIZ(c80796VnM4.getCurrentItem() - 1, c2ma)) {
                                            break;
                                        }
                                    } else {
                                        o.LJIJI("viewPager");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("viewPager");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("viewPager");
                        throw null;
                    }
                }
                c2ma = null;
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        if (c2ma != null && c2ma.s7() != null) {
            c2ma.s7().setVisibility(8);
        }
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility2 = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility2 != null) {
                c2ma2 = landscapeFeedViewPagerAbility2.getNextViewHolder();
            } else {
                return;
            }
        } else {
            C80796VnM c80796VnM5 = this.LJLIL;
            if (c80796VnM5 != null) {
                for (int childCount2 = c80796VnM5.getChildCount() - 1; -1 < childCount2; childCount2--) {
                    C80796VnM c80796VnM6 = this.LJLIL;
                    if (c80796VnM6 != null) {
                        Object tag2 = c80796VnM6.getChildAt(childCount2).getTag(R.id.d87);
                        if (tag2 instanceof C2MA) {
                            C80796VnM c80796VnM7 = this.LJLIL;
                            if (c80796VnM7 != null) {
                                c2ma2 = (C2MA) tag2;
                                if (LJIIIZ(c80796VnM7.getCurrentItem() + 1, c2ma2)) {
                                }
                            } else {
                                o.LJIJI("viewPager");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("viewPager");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        if (c2ma2 != null && c2ma2.s7() != null) {
            c2ma2.s7().setVisibility(8);
        }
    }

    @Override // X.IDR
    public final String getContentSource() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            String contentSource = m89.getContentSource();
            if (contentSource == null) {
                return "";
            }
            return contentSource;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.InterfaceC46246IDa
    public final int getCurIndex() {
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility != null) {
                return landscapeFeedViewPagerAbility.getCurIndex();
            }
            return 0;
        }
        C80796VnM c80796VnM = this.LJLIL;
        if (c80796VnM != null) {
            return c80796VnM.getCurrentItem();
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.IDR
    public final C2MA getCurViewHolder() {
        Object obj;
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return null;
            }
            return landscapeFeedViewPagerAbility.getCurViewHolder();
        }
        C80796VnM c80796VnM = this.LJLIL;
        if (c80796VnM != null) {
            for (int childCount = c80796VnM.getChildCount() - 1; -1 < childCount; childCount--) {
                C80796VnM c80796VnM2 = this.LJLIL;
                if (c80796VnM2 != null) {
                    View childAt = c80796VnM2.getChildAt(childCount);
                    if (childAt != null) {
                        obj = childAt.getTag(R.id.d87);
                    } else {
                        obj = null;
                    }
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
                    C2MA c2ma = (C2MA) obj;
                    C80796VnM c80796VnM3 = this.LJLIL;
                    if (c80796VnM3 != null) {
                        if (LJIIIZ(c80796VnM3.getCurrentItem(), c2ma)) {
                            return c2ma;
                        }
                    } else {
                        o.LJIJI("viewPager");
                        throw null;
                    }
                } else {
                    o.LJIJI("viewPager");
                    throw null;
                }
            }
            return null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.InterfaceC46246IDa
    public final Aweme getCurrentAweme() {
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            C2MA c2ma = null;
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility != null) {
                c2ma = landscapeFeedViewPagerAbility.getCurViewHolder();
            }
            return C72083SQt.LJJLIIIJJIZ(c2ma);
        }
        return C72083SQt.LJJLIIIJJIZ(getCurViewHolder());
    }

    @Override // X.InterfaceC2302191t
    public final String getCurrentAwemeId() {
        String aid;
        Aweme currentPlayAweme;
        String aid2;
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null || (currentPlayAweme = landscapeFeedViewPagerAbility.getCurrentPlayAweme()) == null || (aid2 = currentPlayAweme.getAid()) == null) {
                return "";
            }
            return aid2;
        }
        Aweme LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (aid = LJIIJJI.getAid()) == null) {
            return "";
        }
        return aid;
    }

    @Override // X.IDR
    public final Aweme getCurrentPlayAweme() {
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return null;
            }
            return landscapeFeedViewPagerAbility.getCurrentPlayAweme();
        }
        C55083Ljb c55083Ljb = this.LJLJJL;
        if (c55083Ljb == null) {
            return null;
        }
        C80796VnM c80796VnM = this.LJLIL;
        if (c80796VnM != null) {
            return c55083Ljb.getItem(c80796VnM.getCurrentItem());
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.InterfaceC2302191t
    public final C46319IFv getDynamicOnUIPlayDelegate() {
        C48662J7y c48662J7y = this.LJLJJLL;
        if (c48662J7y != null) {
            if (c48662J7y.LLLJ == null) {
                c48662J7y.LLLJ = new C46319IFv(c48662J7y);
            }
            return c48662J7y.LLLJ;
        }
        return null;
    }

    @Override // X.IDR
    public final String getEnterFromRequestId() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            String enterFromRequestId = m89.getEnterFromRequestId();
            if (enterFromRequestId == null) {
                return "";
            }
            return enterFromRequestId;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.IDR
    public final String getEventType() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            String eventType = m89.getEventType();
            if (eventType == null) {
                return "";
            }
            return eventType;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.InterfaceC46246IDa
    public final int getItemCount() {
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return 0;
            }
            return landscapeFeedViewPagerAbility.getItemCount();
        }
        C55083Ljb c55083Ljb = this.LJLJJL;
        if (c55083Ljb == null) {
            return 0;
        }
        return c55083Ljb.getCount();
    }

    @Override // X.IDR
    public final String getLikeEnterMethod() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            String likeEnterMethod = m89.getLikeEnterMethod();
            if (likeEnterMethod == null) {
                return "";
            }
            return likeEnterMethod;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.IDR
    public final JSONObject getMobBaseJsonObject() {
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility;
        C80796VnM lH;
        AbstractC55082Lja abstractC55082Lja;
        LandscapeRefactorExperiment.LIZ.getClass();
        Aweme aweme = null;
        if (LandscapeRefactorExperiment.LJ() && (landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null)) != null && (lH = landscapeFeedViewPagerAbility.lH()) != null) {
            PagerAdapter adapter = lH.getAdapter();
            if ((adapter instanceof C55083Ljb) && (abstractC55082Lja = (AbstractC55082Lja) adapter) != null) {
                return V16.LJIJJ(abstractC55082Lja.getItem(lH.getCurrentItem()), "", getEventType(), getPageType());
            }
        }
        C55083Ljb c55083Ljb = this.LJLJJL;
        if (c55083Ljb != null) {
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM != null) {
                aweme = c55083Ljb.getItem(c80796VnM.getCurrentItem());
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        return V16.LJIJJ(aweme, "", getEventType(), getPageType());
    }

    public final int getPageType() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            return m89.getPageType();
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.IDR
    public final M89 getParam() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            return m89;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LLFII;
        if (interfaceC55235Lm3 == null) {
            Fragment fragment = getFragment();
            o.LJIIIIZZ(fragment, "fragment");
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(fragment, null);
            this.LLFII = LIZJ;
            return LIZJ;
        }
        return interfaceC55235Lm3;
    }

    @Override // X.IDR
    public final InterfaceC46330IGg getPlayerManager() {
        if (this.LJZI == null) {
            this.LJZI = IWF.LJJLIIIIJ();
        }
        return this.LJZI;
    }

    @Override // X.IDR
    public final String getPreviousPage() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            String previousPage = m89.getPreviousPage();
            if (previousPage == null) {
                return "";
            }
            return previousPage;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(PanelScope.class);
    }

    @Override // X.IDR
    public final String getSearchKeyword() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            String searchKeyword = m89.getSearchKeyword();
            if (searchKeyword == null) {
                return "";
            }
            return searchKeyword;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.IDR
    public final String getTracker() {
        M89 m89 = this.LJLLLLLL;
        if (m89 != null) {
            String tracker = m89.getTracker();
            if (tracker == null) {
                return "";
            }
            return tracker;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        if (this.LLFZ == null) {
            this.LLFZ = new C51693KQn(this);
        }
        C51693KQn c51693KQn = this.LLFZ;
        if (c51693KQn == null) {
            return new C51694KQo(this);
        }
        return c51693KQn;
    }

    @Override // X.IDR
    public final C80796VnM getViewPager() {
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return null;
            }
            return landscapeFeedViewPagerAbility.lH();
        }
        C80796VnM c80796VnM = this.LJLIL;
        if (c80796VnM != null) {
            return c80796VnM;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.IDR
    public final void startLineProgressBarAnimation() {
        long j;
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility;
        C2308494e.LIZ.getClass();
        if (!C2308494e.LIZIZ) {
            return;
        }
        C48662J7y c48662J7y = this.LJLJJLL;
        if (c48662J7y != null) {
            j = c48662J7y.LJJIJIL();
        } else {
            Fragment fragment = getFragment();
            if (fragment != null && (landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), LandscapeFeedPlayerAbility.class, null)) != null) {
                j = landscapeFeedPlayerAbility.ss0();
            } else {
                j = this.LLF;
            }
        }
        this.LLF = j;
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null) {
            c223338pd.setVisibility(0);
            c223338pd.LIZIZ();
        }
    }

    @Override // X.IDR
    public final void stopLineProgressBarAnimation() {
        C223338pd c223338pd;
        C2308494e.LIZ.getClass();
        if (C2308494e.LIZIZ && (c223338pd = this.LJLJI) != null) {
            c223338pd.LIZJ();
            c223338pd.setVisibility(8);
        }
    }

    @Override // X.InterfaceC46246IDa
    public final C2MA getCurFeedViewHolder() {
        return getCurViewHolder();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = getFragment().getLifecycle();
        o.LJIIIIZZ(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @Override // X.IDR
    public final void hideIvPlay() {
        boolean z;
        InterfaceC222708oc LLLJ;
        ImageView LJIIL = LJIIL();
        if (LJIIL != null) {
            C2MA curViewHolder = getCurViewHolder();
            if (curViewHolder != null && (LLLJ = curViewHolder.LLLJ()) != null && LLLJ.Jk0()) {
                z = true;
            } else {
                z = false;
            }
            if (z || C208088Eq.LIZ() || LandscapeOptExperiment.LIZIZ()) {
                LJIIL.setVisibility(8);
                LJIILIIL();
            } else {
                LJIIL.setVisibility(0);
                LJIIL.animate().alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS27S0200000_8(this, LJIIL, 22)).start();
            }
            Context context = getContext();
            if (context != null) {
                String string = context.getString(R.string.a65);
                o.LJIIIIZZ(string, "context.getString(R.string.a11y_vo_playvideo)");
                this.LJLLI.getClass();
                VPK.LIZ(context, string, 100L, true);
            }
        }
    }

    @Override // X.IDR
    public final boolean isIvPlayVisible() {
        ImageView LJIIL = LJIIL();
        if (LJIIL == null || LJIIL.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC51687KQh, X.IDR
    public final boolean isResumed() {
        return super.isResumed();
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJLL = null;
        DisplayManager displayManager = this.LJLLJ;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this);
        }
        LandscapeRefactorExperiment.LIZ.getClass();
        if (!LandscapeRefactorExperiment.LIZIZ() && EarphonePlayerControl.LJII().LIZIZ()) {
            C16880lQ.LJJLIIIJL(getContext(), (BroadcastReceiver) this.LJZ.getValue());
        }
    }

    @Override // X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onDestroyView() {
        String str;
        String str2;
        User author;
        OnUIPlayListener onUIPlayListener;
        super.onDestroyView();
        LandscapeRefactorExperiment.LIZ.getClass();
        if (!LandscapeRefactorExperiment.LIZJ()) {
            C48662J7y c48662J7y = this.LJLJJLL;
            if (c48662J7y != null) {
                c48662J7y.LJIJ(false);
                C222688oa.LJJIII(c48662J7y, c48662J7y.LLJLLIL);
                c48662J7y.onDestroyView();
            }
            InterfaceC46330IGg interfaceC46330IGg = this.LJZI;
            String str3 = null;
            if (interfaceC46330IGg != null) {
                C48662J7y c48662J7y2 = this.LJLJJLL;
                if (c48662J7y2 != null) {
                    onUIPlayListener = c48662J7y2.LJJJJ();
                } else {
                    onUIPlayListener = null;
                }
                if (interfaceC46330IGg.LJJLIIIJLJLI(onUIPlayListener)) {
                    interfaceC46330IGg.LJJJLL(null);
                }
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJLLL;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", getEventType());
            Aweme LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                str = LJIIJJI.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            Aweme LJIIJJI2 = LJIIJJI();
            if (LJIIJJI2 != null && (author = LJIIJJI2.getAuthor()) != null) {
                str3 = author.getUid();
            }
            c188727au.LJIIIZ("author_id", str3);
            c188727au.LJ(currentTimeMillis, "duration");
            Aweme LJIIJJI3 = LJIIJJI();
            if (LJIIJJI3 != null && LJIIJJI3.isPaidContent) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_collection_item", str2);
            FMX.LJIIL("landscape_screen_stay_time", c188727au.LIZ);
        }
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onDetach() {
        super.onDetach();
        C48662J7y c48662J7y = this.LJLJJLL;
        if (c48662J7y != null) {
            c48662J7y.LJIIIZ();
        }
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onPause() {
        OnUIPlayListener onUIPlayListener;
        C48662J7y c48662J7y;
        super.onPause();
        this.LJLL = false;
        boolean LIZIZ = C46416IJo.LIZIZ();
        C48662J7y c48662J7y2 = this.LJLJJLL;
        if (c48662J7y2 != null) {
            c48662J7y2.LL(true);
        }
        if (!LIZIZ && (c48662J7y = this.LJLJJLL) != null) {
            c48662J7y.LJL();
        }
        C2MA curViewHolder = getCurViewHolder();
        if (curViewHolder == null) {
            return;
        }
        if (C72083SQt.LJLILLLLZI(curViewHolder)) {
            LandscapeRefactorExperiment.LIZ.getClass();
            if (!LandscapeRefactorExperiment.LIZJ()) {
                C48662J7y c48662J7y3 = this.LJLJJLL;
                if (c48662J7y3 != null) {
                    onUIPlayListener = c48662J7y3.LJJJJ();
                } else {
                    onUIPlayListener = null;
                }
                InterfaceC46330IGg interfaceC46330IGg = this.LJZI;
                if (interfaceC46330IGg != null) {
                    interfaceC46330IGg.LJJIII(onUIPlayListener);
                }
            }
            if (getUserVisibleHint() && C00F.LIZ(31744, 1, "player_surfacetexture_keep", true) == 1) {
                curViewHolder.LLLJ().eg(true);
            }
        }
        curViewHolder.onPause();
        if (getUserVisibleHint()) {
            curViewHolder.LJJIII(2);
        }
        if (getUserVisibleHint()) {
            C47242IgQ.LIZ().cancelAll();
        }
        C48662J7y c48662J7y4 = this.LJLJJLL;
        if (c48662J7y4 != null) {
            c48662J7y4.LLIIIZ(System.currentTimeMillis(), null, true);
        }
        LandscapeRefactorExperiment.LIZ.getClass();
        if (!LandscapeRefactorExperiment.LIZJ()) {
            C218678i7.LIZ();
        }
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onResume() {
        C55083Ljb c55083Ljb;
        Boolean bool;
        Aweme aweme;
        InterfaceC222708oc LLLJ;
        super.onResume();
        this.LJLL = true;
        LandscapeRefactorExperiment.LIZ.getClass();
        if (!LandscapeRefactorExperiment.LIZJ()) {
            C48662J7y c48662J7y = this.LJLJJLL;
            if (c48662J7y != null) {
                c48662J7y.LJLILLLLZI();
                c48662J7y.LL(false);
            }
            if (getUserVisibleHint() && (c55083Ljb = this.LJLJJL) != null && c55083Ljb.getCount() > 0) {
                InterfaceC46330IGg interfaceC46330IGg = this.LJZI;
                OnUIPlayListener onUIPlayListener = null;
                if (interfaceC46330IGg != null) {
                    bool = Boolean.valueOf(interfaceC46330IGg.LJJLIIIJLJLI(this.LJLJJLL));
                } else {
                    bool = null;
                }
                InterfaceC46330IGg interfaceC46330IGg2 = this.LJZI;
                if (interfaceC46330IGg2 != null) {
                    interfaceC46330IGg2.LJJJLL(this.LJLJJLL);
                }
                if (o.LJ(bool, Boolean.TRUE)) {
                    if (isIvPlayVisible()) {
                        C48662J7y c48662J7y2 = this.LJLJJLL;
                        if (c48662J7y2 != null) {
                            onUIPlayListener = c48662J7y2.LJJJJ();
                        }
                        InterfaceC46330IGg interfaceC46330IGg3 = this.LJZI;
                        if (interfaceC46330IGg3 != null) {
                            interfaceC46330IGg3.LJJIII(onUIPlayListener);
                        }
                    } else {
                        Aweme currentPlayAweme = getCurrentPlayAweme();
                        if (!C80S.LJ(currentPlayAweme) && getContext() != null && currentPlayAweme != null) {
                            C2MA curViewHolder = getCurViewHolder();
                            if (C38450F7e.LIZIZ && curViewHolder != null) {
                                curViewHolder.LJJIJIIJIL(1);
                            }
                            Activity activity = this.activity;
                            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            if (LNH.LIZIZ((ActivityC45651qj) activity) != currentPlayAweme) {
                                Activity activity2 = this.activity;
                                o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                LNH.LIZLLL((ActivityC45651qj) activity2, currentPlayAweme);
                            }
                            C48662J7y c48662J7y3 = this.LJLJJLL;
                            if (c48662J7y3 != null) {
                                c48662J7y3.LJLLLL(0, currentPlayAweme);
                            }
                            IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
                            if (LJII.LIZIZ()) {
                                LJII.LJ("landscape_feed", false);
                            }
                        }
                        ImageView LJIIL = LJIIL();
                        if (LJIIL != null) {
                            LJIIL.setAlpha(0.0f);
                        }
                    }
                } else {
                    C2MA curViewHolder2 = getCurViewHolder();
                    if (C72083SQt.LJLILLLLZI(curViewHolder2)) {
                        if (curViewHolder2 == null || (LLLJ = curViewHolder2.LLLJ()) == null || !LLLJ.d4()) {
                            if (C38450F7e.LIZIZ) {
                                if (curViewHolder2 == null) {
                                    aweme = null;
                                    LJIIZILJ(null, aweme, true);
                                }
                            }
                        }
                        aweme = curViewHolder2.getAweme();
                        LJIIZILJ(null, aweme, true);
                    }
                }
            }
            C218678i7.LIZIZ(1, getEventType(), LJIIJJI());
        }
    }

    @Override // X.IDR
    public final void showIvPlay() {
        ImageView LJIIL = LJIIL();
        if (LJIIL == null) {
            return;
        }
        LJIIL.setVisibility(0);
        LJIIL.setScaleX(2.5f);
        LJIIL.setScaleY(2.5f);
        LJIIL.animate().alpha(0.25f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        LJIIL.setSelected(false);
        String string = getContext().getString(R.string.a65);
        o.LJIIIIZZ(string, "context.getString(R.string.a11y_vo_playvideo)");
        VPK vpk = this.LJLLI;
        Context context = getContext();
        vpk.getClass();
        VPK.LIZ(context, string, 0L, false);
    }

    @Override // X.IDR
    public final boolean getPageResumed() {
        return this.LJLL;
    }

    public final void LJIILLIIL(long j) {
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null && c223338pd.getVisibility() == 0) {
            if (this.LLFFF) {
                this.LLFFF = false;
                return;
            } else {
                if (Math.abs(this.LLF - j) > 100) {
                    stopLineProgressBarAnimation();
                    this.LLF = j;
                    return;
                }
                return;
            }
        }
        this.LLF = j;
    }

    @Override // X.InterfaceC46246IDa
    public final Aweme getAwemeByIndex(int i) {
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return null;
            }
            return landscapeFeedViewPagerAbility.getAwemeByIndex(i);
        }
        C55083Ljb c55083Ljb = this.LJLJJL;
        if (c55083Ljb == null) {
            return null;
        }
        return c55083Ljb.getItem(i);
    }

    @Override // X.IDR
    public final String getEnterFrom(boolean z) {
        String LJIILIIL = C62819Ol5.LJIILIIL(getPageType(), getEventType(), z);
        o.LJIIIIZZ(LJIILIIL, "getEnterFrom(pageType, eventType, eventV3)");
        return LJIILIIL;
    }

    @Override // X.InterfaceC46246IDa
    public final int getIndexByAweme(Aweme aweme) {
        List<Aweme> Q8;
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return -1;
            }
            return landscapeFeedViewPagerAbility.getIndexByAweme(aweme);
        }
        C55083Ljb c55083Ljb = this.LJLJJL;
        if (c55083Ljb != null && (Q8 = c55083Ljb.Q8()) != null) {
            int size = Q8.size();
            for (int i = 0; i < size; i++) {
                if (aweme != null && TextUtils.equals(((Aweme) ListProtector.get(Q8, i)).getAid(), aweme.getAid())) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC46246IDa
    public final C2MA getViewHolderByAwemeId(String str) {
        Object obj;
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LJ()) {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedViewPagerAbility.class, null);
            if (landscapeFeedViewPagerAbility == null) {
                return null;
            }
            return landscapeFeedViewPagerAbility.getViewHolderByAwemeId(str);
        }
        C80796VnM c80796VnM = this.LJLIL;
        if (c80796VnM != null) {
            int childCount = c80796VnM.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C80796VnM c80796VnM2 = this.LJLIL;
                if (c80796VnM2 != null) {
                    View childAt = c80796VnM2.getChildAt(i);
                    if (childAt != null) {
                        obj = childAt.getTag(R.id.d87);
                    } else {
                        obj = null;
                    }
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
                    C2MA c2ma = (C2MA) obj;
                    if (o.LJ(c2ma.getAweme().getAid(), str)) {
                        return c2ma;
                    }
                } else {
                    o.LJIJI("viewPager");
                    throw null;
                }
            }
            return null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.InterfaceC2302191t
    public final void handleDoubleClick(MotionEvent curDownEvent) {
        LandscapeVideoViewCell landscapeVideoViewCell;
        LandscapeCellAssem landscapeCellAssem;
        C2MA curViewHolder;
        o.LJIIIZ(curDownEvent, "curDownEvent");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Aweme LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = this.activity;
                c78450Uqc.LIZIZ = getEventType();
                c78450Uqc.LIZJ = "click_double_like";
                C40883G2t c40883G2t = new C40883G2t();
                c40883G2t.LIZLLL("login_title", "");
                c40883G2t.LIZLLL("group_id", LJIIJJI.getAid());
                c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(LJIIJJI.getAid()));
                c78450Uqc.LIZLLL = (Bundle) c40883G2t.LIZ;
                LJIIIIZZ.showLoginView(new C78451Uqd(c78450Uqc));
                C200417tl c200417tl = new C200417tl();
                c200417tl.LIZLLL = getEventType();
                c200417tl.LJJLIIIJJIZ = getPageType();
                c200417tl.LJJL = LJIIJJI.getAid();
                c200417tl.LJJIIZ(LJIIJJI);
                c200417tl.LJJLIIIJ = "click_double_like";
                c200417tl.LJJLIIIJILLIZJL = !C2043180d.LIZIZ() ? 1 : 0;
                c200417tl.LJJLIIIJJI = 0;
                c200417tl.LJIILIIL();
                if (!C2043180d.LIZIZ()) {
                    C2043180d.LIZJ();
                    return;
                }
                return;
            }
            return;
        }
        if (C2NU.LIZ.LIZIZ() && (curViewHolder = getCurViewHolder()) != null) {
            curViewHolder.m6(LJIIJJI());
        }
        C2MA curViewHolder2 = getCurViewHolder();
        if ((curViewHolder2 instanceof LandscapeVideoViewCell) && (landscapeVideoViewCell = (LandscapeVideoViewCell) curViewHolder2) != null && (landscapeCellAssem = landscapeVideoViewCell.LLJJI) != null) {
            C241249dQ c241249dQ = C241249dQ.LIZ;
            C65776Prg LIZ = C65352Pkq.LIZ(VideoDiggVM.class);
            VideoDiggVM videoDiggVM = (VideoDiggVM) C214348b8.LIZ(landscapeCellAssem, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 12), null, C51692KQm.INSTANCE, null, null).LIZ(null, LandscapeVideoViewCell.LLJJL[0]);
            if (videoDiggVM != null && videoDiggVM.LJLLI) {
                return;
            }
        }
        C5WY c5wy = this.LJLILLLLZI;
        if (c5wy == null) {
            return;
        }
        c5wy.LIZ(curDownEvent.getRawX(), curDownEvent.getRawY());
    }

    @Override // X.IDR
    public final void handlePlay(Aweme aweme) {
        handlePlay(aweme, true, false);
    }

    public final void handleVideoEvent(C50420Jqa c50420Jqa) {
        Integer num;
        int LIZ;
        C48662J7y c48662J7y;
        if (c50420Jqa != null) {
            num = Integer.valueOf(c50420Jqa.LJLIL);
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            Object obj = c50420Jqa.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme = (Aweme) obj;
            if (C80S.LJ(aweme)) {
                return;
            }
            LandscapeRefactorExperiment.LIZ.getClass();
            if (LandscapeRefactorExperiment.LIZJ() || (c48662J7y = this.LJLJJLL) == null) {
                return;
            }
            M89 m89 = this.LJLLLLLL;
            if (m89 != null) {
                c48662J7y.LJLJI((int) m89.getVideoCurrentPosition(), aweme);
                return;
            } else {
                o.LJIJI("param");
                throw null;
            }
        }
        if (num.intValue() != 12) {
            return;
        }
        Object obj2 = c50420Jqa.LJLILLLLZI;
        o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        Aweme aweme2 = (Aweme) obj2;
        if (aweme2.getAuthor() == null) {
            return;
        }
        String uid = aweme2.getAuthor().getUid();
        o.LJIIIIZZ(uid, "aweme.author.uid");
        String secUid = aweme2.getAuthor().getSecUid();
        o.LJIIIIZZ(secUid, "aweme.author.secUid");
        int followerStatus = aweme2.getAuthor().getFollowerStatus();
        boolean isSecret = aweme2.getAuthor().isSecret();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            LJIILL(aweme2, uid, false, isSecret ? 1 : 0, c50420Jqa);
            Activity activity = this.activity;
            String eventType = getEventType();
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", aweme2.getAid());
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aweme2.getAid()));
            J9P.LIZIZ(activity, eventType, "click_follow", (Bundle) c40883G2t.LIZ, new C51686KQg(this, aweme2, uid, isSecret ? 1 : 0, c50420Jqa, secUid, followerStatus));
            return;
        }
        LJIILL(aweme2, uid, true, isSecret ? 1 : 0, c50420Jqa);
        InterfaceC51691KQl interfaceC51691KQl = this.LJLJL;
        if (interfaceC51691KQl == null) {
            return;
        }
        ALX alx = new ALX();
        alx.LIZJ(uid);
        alx.LIZIZ(secUid);
        boolean isSecret2 = aweme2.getAuthor().isSecret();
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LJIIL = isSecret2;
        c57285Me1.LIZJ = 1;
        alx.LIZ.LJFF = getEventType();
        String LJIIL = C78996UzQ.LJIIL(getCurrentAweme());
        C57285Me1 c57285Me12 = alx.LIZ;
        c57285Me12.LJI = LJIIL;
        c57285Me12.LJII = aweme2;
        c57285Me12.LJIIIIZZ = c50420Jqa.LJLJJI;
        if (TextUtils.equals(getEventType(), "homepage_hot")) {
            LIZ = -1;
        } else {
            M89 m892 = this.LJLLLLLL;
            if (m892 != null) {
                LIZ = C56202M3y.LIZ(m892.getEventType());
            } else {
                o.LJIJI("param");
                throw null;
            }
        }
        alx.LIZ.LJ = LIZ;
        M89 m893 = this.LJLLLLLL;
        if (m893 != null) {
            int LIZIZ = C56202M3y.LIZIZ(aweme2, m893.getEventType());
            C57285Me1 c57285Me13 = alx.LIZ;
            c57285Me13.LIZLLL = LIZIZ;
            c57285Me13.LJIIJ = followerStatus;
            alx.LIZ.LJIILL = aweme2.getAuthor().getAccurateRecType();
            interfaceC51691KQl.LJIJJ(alx.LIZ());
            return;
        }
        o.LJIJI("param");
        throw null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        C2MA curViewHolder = getCurViewHolder();
        if (curViewHolder != null) {
            curViewHolder.e9(true);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        C2MA curViewHolder = getCurViewHolder();
        if (curViewHolder != null) {
            curViewHolder.e9(false);
        }
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowFail(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C57293Me9.LIZ(C27740Aue.LIZ(getContext()), exc);
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        User author;
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || (author = currentAweme.getAuthor()) == null || author.getUid() == null) {
            return;
        }
        if (o.LJ(author.getUid(), followStatus.userId)) {
            author.setFollowStatus(followStatus.followStatus);
        }
        C2U8.LIZ(new C31633CbF(followStatus.followStatus, author));
    }

    @Override // X.InterfaceC72642tA
    public final void onInternalEvent(C50420Jqa c50420Jqa) {
        handleVideoEvent(c50420Jqa);
    }

    @QD3
    public final void onPlayerControllerVideoPlayProgressChange(C46361IHl event) {
        o.LJIIIZ(event, "event");
        LJIILLIIL(event.LJLJJL);
        this.LLFF = true;
    }

    @Override // X.IDR
    public final void onResumePlay4Landscape(String str) {
        if (this.LJLZ) {
            this.LJLZ = false;
            FRW.LIZ("landscape_performance_created_to_video_first_frame");
            FRW.LIZ("landscape_performance_click_to_video_first_frame");
            FMX.onEventV3("landscape_business_on_video_first_resumed");
        }
    }

    @QD3
    public void onSeekChangeEvent(C51690KQk event) {
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility;
        o.LJIIIZ(event, "event");
        if (!o.LJ(this.activity, event.LJLIL)) {
            return;
        }
        C48662J7y c48662J7y = this.LJLJJLL;
        if (c48662J7y == null) {
            Fragment fragment = getFragment();
            if (fragment != null && (landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), LandscapeFeedPlayerAbility.class, null)) != null) {
                landscapeFeedPlayerAbility.LJJIIJ(event.LJLILLLLZI);
                C223338pd c223338pd = this.LJLJI;
                if (c223338pd != null && c223338pd.getVisibility() == 0) {
                    this.LLF = (event.LJLILLLLZI * ((float) landscapeFeedPlayerAbility.Qp())) / 100;
                    this.LLFFF = true;
                    return;
                }
                return;
            }
            return;
        }
        c48662J7y.LJJJJIZL().LJI(event.LJLILLLLZI);
        C223338pd c223338pd2 = this.LJLJI;
        if (c223338pd2 == null || c223338pd2.getVisibility() != 0) {
            return;
        }
        this.LLF = (event.LJLILLLLZI * ((float) c48662J7y.LJJIJ(null))) / 100;
        this.LLFFF = true;
    }

    @QD3
    public void onSpeedChangeEvent(C8L9 event) {
        C48662J7y c48662J7y;
        o.LJIIIZ(event, "event");
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LIZJ() || (c48662J7y = this.LJLJJLL) == null) {
            return;
        }
        c48662J7y.LJJJJIZL().LJFF(event.LJLIL);
        if (IWF.LJJLIIIIJ().isPlaying()) {
            C2TT.LIZ(getCurrentAweme(), getEnterFrom(false), event.LJLIL, System.currentTimeMillis());
        }
    }

    @QD3
    public void onVideoCleanModeEvent(C51689KQj event) {
        C2MA curViewHolder;
        String str;
        o.LJIIIZ(event, "event");
        if (this != event.LJLJI || (curViewHolder = getCurViewHolder()) == null || event.LJLILLLLZI == null || curViewHolder.getAweme() == null) {
            return;
        }
        Aweme aweme = event.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(str, curViewHolder.getAweme().getAid())) {
            return;
        }
        curViewHolder.b2(event.LJLIL);
    }

    @Override // X.IDR
    public final void setPageResumed(boolean z) {
        this.LJLL = true;
    }

    public final boolean LJIIIZ(int i, C2MA c2ma) {
        C55083Ljb c55083Ljb;
        if (c2ma == null || (c55083Ljb = this.LJLJJL) == null || c55083Ljb.getItem(i) != c2ma.O1()) {
            return false;
        }
        return true;
    }

    @Override // X.IDR
    public final void handlePlay(Aweme aweme, boolean z) {
        handlePlay(aweme, true, false);
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onAttach(Activity activity, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        super.onAttach(activity, fragment);
        C48662J7y c48662J7y = this.LJLJJLL;
        if (c48662J7y != null) {
            c48662J7y.LJIIIIZZ(activity, fragment);
        }
    }

    @Override // X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        C81334Vw2 c81334Vw2;
        C55083Ljb c55083Ljb;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.viewpager)");
        this.LJLIL = (C80796VnM) findViewById;
        View findViewById2 = view.findViewById(R.id.itq);
        if (findViewById2 instanceof FeedSwipeRefreshLayout) {
            c81334Vw2 = (C81334Vw2) findViewById2;
        } else {
            c81334Vw2 = null;
        }
        if (c81334Vw2 != null) {
            c81334Vw2.setEnabled(false);
        }
        this.LJLILLLLZI = (C5WY) view.findViewById(R.id.c_y);
        this.LJLJI = (C223338pd) view.findViewById(R.id.b0u);
        ArrayList arrayList = new ArrayList();
        Aweme LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            arrayList.add(LJIIJJI);
        }
        LandscapeRefactorExperiment.LIZ.getClass();
        if (!LandscapeRefactorExperiment.LJ()) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LayoutInflater LLZIL = C16880lQ.LLZIL(this.activity);
            Fragment fragment = getFragment();
            o.LJIIIIZZ(fragment, "fragment");
            ViewOnTouchListenerC51695KQp viewOnTouchListenerC51695KQp = this.LL;
            BaseFeedPageParams newBuilder = BaseFeedPageParams.Companion.newBuilder();
            newBuilder.setAwemeFromPage(1);
            newBuilder.setEventType(getEventType());
            M89 m89 = this.LJLLLLLL;
            if (m89 != null) {
                newBuilder.setParam(m89);
                newBuilder.setMyProfile(false);
                newBuilder.setFromPostList(false);
                newBuilder.setPageType(getPageType());
                newBuilder.setShowVote(false);
                M89 m892 = this.LJLLLLLL;
                if (m892 != null) {
                    String cid = m892.getCid();
                    String str = "";
                    if (cid == null) {
                        cid = "";
                    }
                    newBuilder.setCid(cid);
                    M89 m893 = this.LJLLLLLL;
                    if (m893 != null) {
                        String challengeId = m893.getChallengeId();
                        if (challengeId != null) {
                            str = challengeId;
                        }
                        newBuilder.setChallengeId(str);
                        newBuilder.setIsOriginalCaption(this.LJLLLL);
                        C55083Ljb c55083Ljb2 = new C55083Ljb(context, LLZIL, this, fragment, viewOnTouchListenerC51695KQp, newBuilder, this);
                        this.LJLJJL = c55083Ljb2;
                        c55083Ljb2.LJLLJ = this;
                        C80796VnM c80796VnM = this.LJLIL;
                        if (c80796VnM != null) {
                            c80796VnM.setAdapter(c55083Ljb2);
                        } else {
                            o.LJIJI("viewPager");
                            throw null;
                        }
                    } else {
                        o.LJIJI("param");
                        throw null;
                    }
                } else {
                    o.LJIJI("param");
                    throw null;
                }
            } else {
                o.LJIJI("param");
                throw null;
            }
        } else {
            LandscapeFeedVideoEventDispatcherAbility landscapeFeedVideoEventDispatcherAbility = (LandscapeFeedVideoEventDispatcherAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), LandscapeFeedVideoEventDispatcherAbility.class, null);
            if (landscapeFeedVideoEventDispatcherAbility != null) {
                landscapeFeedVideoEventDispatcherAbility.nt0(this, new AqS174S0100000_8(this, 9));
            }
        }
        if (!LandscapeRefactorExperiment.LIZ() && (c55083Ljb = this.LJLJJL) != null) {
            c55083Ljb.setData(arrayList);
        }
        this.LJLJLJ = true;
        if (!LandscapeRefactorExperiment.LIZIZ()) {
            IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
            if (LJII.LIZIZ()) {
                C16880lQ.LJJLIIIJJI(getContext(), (BroadcastReceiver) this.LJZ.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), null);
                LJII.LJI(this, new C48796JDc(this));
            }
        }
        if (!LandscapeRefactorExperiment.LJ()) {
            C80796VnM c80796VnM2 = this.LJLIL;
            if (c80796VnM2 != null) {
                c80796VnM2.LJI(new C51684KQe(this));
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        InterfaceC51691KQl followPresenter = C77266UUc.LIZIZ.getFollowPresenter();
        this.LJLJL = followPresenter;
        if (followPresenter != null) {
            followPresenter.LJIIIIZZ(this);
        }
        if (!LandscapeRefactorExperiment.LIZJ()) {
            C56462Jm c56462Jm = new C56462Jm();
            C48662J7y c48662J7y = this.LJLJJLL;
            if (c48662J7y == null) {
                return;
            }
            c48662J7y.LLILLIZIL = c56462Jm;
        }
    }

    public final String LJIIZILJ(C2MA c2ma, Aweme aweme, boolean z) {
        String str;
        if (C35168DrA.LIZ()) {
            C9K4 c9k4 = C9K4.LIZ;
            C56742Ko c56742Ko = new C56742Ko();
            c56742Ko.LIZ(C78996UzQ.LJIIL(aweme), "aid");
            c56742Ko.LIZ(getEventType(), WM7.SCENE_SERVICE);
            c56742Ko.LIZ(Integer.valueOf(!z ? 1 : 0), "isRenderReady");
            c56742Ko.LIZ("tryPlay", "source");
            c56742Ko.LIZ("LandscapeFragmentPanel", "caller");
            C9K4.LJ(c9k4, c56742Ko.LIZ, C78996UzQ.LJIIL(aweme), null, 28);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryPlay,aid:");
            if (aweme == null) {
                str = "";
            } else {
                str = aweme.getAid();
            }
            LIZ.append(str);
            C60392Yp.LIZIZ("LFeedPlayer", X1D.LIZIZ(LIZ));
        }
        C48662J7y c48662J7y = this.LJLJJLL;
        if (c48662J7y == null) {
            return "";
        }
        return c48662J7y.LLIIJI(aweme, z, c2ma, 0);
    }

    @Override // X.InterfaceC2302191t
    public final void handlePlay(Aweme aweme, boolean z, boolean z2) {
        if (C80S.LJ(aweme)) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.txs);
            c5s1.LJ();
            return;
        }
        if ((!this.LJLL || !isViewValid()) && !C2M9.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("try to handlePlay,but can't meet the conditions,pageResume:");
            LIZ.append(this.LJLL);
            LIZ.append(",isViewValid:");
            LIZ.append(isViewValid());
            LIZ.append("BgPlayState.INSTANCE.isMediaNotificationActiveAndInBackground():");
            LIZ.append(C2M9.LIZ());
            C36922EeM.LIZLLL(4, "LandscapeFragmentPanel", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("the stacktrace:");
            LIZ2.append(Log.getStackTraceString(new Throwable()));
            C36922EeM.LIZLLL(4, "LandscapeFragmentPanel", X1D.LIZIZ(LIZ2));
            return;
        }
        LandscapeRefactorExperiment.LIZ.getClass();
        if (LandscapeRefactorExperiment.LIZJ()) {
            Fragment fragment = getFragment();
            o.LJIIIIZZ(fragment, "fragment");
            LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), LandscapeFeedPlayerAbility.class, null);
            if (landscapeFeedPlayerAbility == null) {
                return;
            }
            if (aweme != null) {
                landscapeFeedPlayerAbility.handlePlay(aweme, z);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C48662J7y c48662J7y = this.LJLJJLL;
        if (c48662J7y == null) {
            return;
        }
        c48662J7y.LJJJJZI(aweme, z, z2, false);
    }

    @Override // X.IDR
    public final void onPlayProgressChange(String str, float f, long j) {
        if (f > 0.0f && !this.LJLLILLLL) {
            this.LJLLILLLL = true;
            try {
                Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLL(getContext()), "display");
                o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
                DisplayManager displayManager = (DisplayManager) LLILL;
                this.LJLLJ = displayManager;
                displayManager.registerDisplayListener(this, null);
            } catch (Exception unused) {
            }
        }
        if (this.LLFF) {
            this.LLFF = false;
        } else {
            LJIILLIIL(j);
        }
    }

    public final void LJIILL(Aweme aweme, String str, boolean z, int i, C50420Jqa c50420Jqa) {
        String previousPage;
        String previousPagePosition;
        String str2;
        User user;
        boolean z2;
        String str3;
        String previousPage2;
        String aid;
        String str4;
        if (z && !TextUtils.isEmpty(getEventType()) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            String aid2 = aweme.getAid();
            o.LJIIIIZZ(aid2, "aweme.aid");
            C48231IwN c48231IwN = new C48231IwN(4, aid2, getEventType(), System.currentTimeMillis());
            c48231IwN.LJLJJL = aweme.getAuthorUid();
            C48229IwL.LIZ(c48231IwN);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", aweme.getAuthorUid());
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", getEventType());
            jSONObject.put("impr_type", C227768wm.LJFF(aweme));
            jSONObject.put("compilation_id", aweme.getMixId());
            jSONObject.put("request_id", getMobBaseJsonObject().optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            jSONObject.put("is_landscape_screen", String.valueOf(C79004UzY.LJJJIL(getContext(), aweme)));
            if (!o.LJ("homepage_hot", getEventType())) {
                M89 m89 = this.LJLLLLLL;
                if (m89 != null) {
                    jSONObject.put("previous_page", m89.getEnterMethodValue());
                } else {
                    o.LJIJI("param");
                    throw null;
                }
            }
            jSONObject.put("request_id", C227768wm.LJIILL(getPageType(), aweme));
            jSONObject.put("is_photo", C227768wm.LIZLLL(aweme));
            if (aweme.isAd()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_ad", str4);
            C222578oP.LIZJ(C220488l2.LIZIZ.LJII(aweme, jSONObject), aweme, null, null, 14);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        getContext();
        FMX.LJIIJ("follow", getEventType(), str, C227768wm.LIZIZ(aweme), jSONObject);
        String str5 = "follow_button";
        if (z) {
            if (c50420Jqa != null && !TextUtils.isEmpty(c50420Jqa.LJLLL) && (o.LJ("card_button", c50420Jqa.LJLLL) || o.LJ("expand_card", c50420Jqa.LJLLL) || o.LJ("small_card", c50420Jqa.LJLLL))) {
                str2 = c50420Jqa.LJLLL;
            } else {
                str2 = "main_head";
            }
            M89 m892 = this.LJLLLLLL;
            if (m892 != null) {
                String searchResultId = m892.getSearchResultId();
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                String str6 = "";
                if (TextUtils.isEmpty(searchResultId)) {
                    if (aweme == null) {
                        searchResultId = "";
                    } else {
                        searchResultId = aweme.getAid();
                    }
                }
                M89 m893 = this.LJLLLLLL;
                if (m893 != null) {
                    if (!m893.isCard()) {
                        C220488l2 c220488l2 = C220488l2.LIZIZ;
                        C57362MfG c57362MfG = new C57362MfG();
                        c57362MfG.LJJIIZI(getEventType());
                        c57362MfG.LJJLI = EnumC57366MfK.ITEM;
                        c57362MfG.LJJJJI();
                        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.FOLLOW;
                        c57362MfG.LJJIJ(str2);
                        c57362MfG.LJJIIZ(aweme);
                        c57362MfG.LJJJJIZL(user);
                        c57362MfG.LJLJI = C79004UzY.LJJJIL(getContext(), aweme);
                        Object LJII = c220488l2.LJII(aweme, c57362MfG);
                        C222578oP.LIZJ(LJII, aweme, null, null, 14);
                        ((C57362MfG) LJII).LJJIZ();
                    }
                    if (aweme != null && aweme.getBottomBarModel() != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (user != null && user.getFollowerStatus() == 1) {
                        str3 = "mutual";
                    } else {
                        str3 = "single";
                    }
                    Z9N z9n = Z9N.LIZIZ;
                    String eventType = getEventType();
                    M89 m894 = this.LJLLLLLL;
                    if (m894 != null) {
                        Map<String, String> LLJLLIL = z9n.LLJLLIL(eventType, m894.getPreviousPage());
                        C220488l2 c220488l22 = C220488l2.LIZIZ;
                        C188577af c188577af = new C188577af();
                        c188577af.LIZLLL = getEnterFrom(true);
                        if (TextUtils.isEmpty(getPreviousPage())) {
                            previousPage2 = getEventType();
                        } else {
                            previousPage2 = getPreviousPage();
                        }
                        c188577af.LJJL = previousPage2;
                        if (!TextUtils.isEmpty(getPreviousPage())) {
                            M89 m895 = this.LJLLLLLL;
                            if (m895 != null) {
                                str5 = m895.getPreviousPagePosition();
                                o.LJI(str5);
                            } else {
                                o.LJIJI("param");
                                throw null;
                            }
                        }
                        c188577af.LJJLI = str5;
                        c188577af.LJJLIIIIJ = z2;
                        c188577af.LJJLIIIJL = str2;
                        c188577af.LJJLIIIJ = str;
                        c188577af.LJJIIZ(getPageType(), aweme);
                        M89 m896 = this.LJLLLLLL;
                        if (m896 != null) {
                            c188577af.LJJIL = m896.getSearchId();
                            c188577af.LJJIFFI = searchResultId;
                            c188577af.LJJZZIII = i;
                            M89 m897 = this.LJLLLLLL;
                            if (m897 != null) {
                                c188577af.LJJLJLI = m897.getChallengeId();
                                M89 m898 = this.LJLLLLLL;
                                if (m898 != null) {
                                    c188577af.LJJLL = m898.getParentTagId();
                                    o.LJI(aweme);
                                    c188577af.LJLIIL = aweme.isHighlighted();
                                    c188577af.LJLIL = aweme.getOriginalPos();
                                    c188577af.LJLJI = getParam().getCategoryName();
                                    C78866UxK.LJIIZILJ(c188577af, aweme.getAuthor());
                                    c188577af.LJJJJZ = C222578oP.LJFF(aweme.getAuthor());
                                    c188577af.LJJLJ = str3;
                                    String previousPage3 = getPreviousPage();
                                    Aweme LJIIJJI = LJIIJJI();
                                    if (LJIIJJI != null && (aid = LJIIJJI.getAid()) != null) {
                                        str6 = aid;
                                    }
                                    c188577af.LJJJZ = C2KM.LIZ(previousPage3, str6);
                                    c188577af.LJIJJLI(C176276vv.LIZ(aweme, LLJLLIL));
                                    c188577af.LJLJJL = C79004UzY.LJJJIL(getContext(), aweme);
                                    c188577af.LIZ(K02.LIZIZ("follow", aweme, getEventType()));
                                    Object LJII2 = c220488l22.LJII(aweme, c188577af);
                                    C222578oP.LIZJ(LJII2, aweme, null, null, 14);
                                    ((JHM) LJII2).LJIILIIL();
                                    return;
                                }
                                o.LJIJI("param");
                                throw null;
                            }
                            o.LJIJI("param");
                            throw null;
                        }
                        o.LJIJI("param");
                        throw null;
                    }
                    o.LJIJI("param");
                    throw null;
                }
                o.LJIJI("param");
                throw null;
            }
            o.LJIJI("param");
            throw null;
        }
        C7ZZ c7zz = new C7ZZ();
        c7zz.LIZLLL = getEnterFrom(true);
        if (TextUtils.isEmpty(getPreviousPage())) {
            previousPage = getEventType();
        } else {
            previousPage = getPreviousPage();
        }
        c7zz.LJJL = previousPage;
        if (TextUtils.isEmpty(getPreviousPage())) {
            previousPagePosition = "follow_button";
        } else {
            M89 m899 = this.LJLLLLLL;
            if (m899 != null) {
                previousPagePosition = m899.getPreviousPagePosition();
                o.LJI(previousPagePosition);
            } else {
                o.LJIJI("param");
                throw null;
            }
        }
        c7zz.LJJLI = previousPagePosition;
        c7zz.LJJLIIIJJI = "follow_button";
        c7zz.LJJLIIIIJ = str;
        c7zz.LJJIIZ(getPageType(), aweme);
        c7zz.LJIILIIL();
    }
}
