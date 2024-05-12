package Y;

import X.AbstractC030109x;
import X.AbstractC37571dh;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnimationAnimationListenerC027708z;
import X.AnonymousClass122;
import X.AnonymousClass143;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.AnonymousClass291;
import X.B9K;
import X.BD3;
import X.BFR;
import X.C005000g;
import X.C005800o;
import X.C011902x;
import X.C024107p;
import X.C026808q;
import X.C03970Dp;
import X.C03H;
import X.C04740Go;
import X.C05880Ky;
import X.C05900La;
import X.C05960Lg;
import X.C08780Wc;
import X.C09650Zl;
import X.C09970aH;
import X.C09O;
import X.C0BP;
import X.C0BQ;
import X.C0BR;
import X.C0CM;
import X.C0GQ;
import X.C0GU;
import X.C0IT;
import X.C0M2;
import X.C0N7;
import X.C0NB;
import X.C0PS;
import X.C0PX;
import X.C0VW;
import X.C0WB;
import X.C10060aQ;
import X.C10610bJ;
import X.C12U;
import X.C141335gf;
import X.C14520hc;
import X.C14560hg;
import X.C15380j0;
import X.C15600jM;
import X.C15610jN;
import X.C15750jb;
import X.C16330kX;
import X.C16650l3;
import X.C16880lQ;
import X.C17130lp;
import X.C17250m1;
import X.C17N;
import X.C19380pS;
import X.C19500pe;
import X.C19620pq;
import X.C1BI;
import X.C1D9;
import X.C1DD;
import X.C1G2;
import X.C1OU;
import X.C1VS;
import X.C1X1;
import X.C1Y1;
import X.C20550rL;
import X.C20990s3;
import X.C21260sU;
import X.C21270sV;
import X.C21320sa;
import X.C22560ua;
import X.C22810uz;
import X.C22820v0;
import X.C22830v1;
import X.C23770wX;
import X.C25140yk;
import X.C25150yl;
import X.C25270yx;
import X.C26338AVi;
import X.C270714l;
import X.C277116x;
import X.C278117h;
import X.C280418e;
import X.C281318n;
import X.C28771Az;
import X.C29031Bz;
import X.C29241Cu;
import X.C29251Cv;
import X.C29306Beo;
import X.C29701Eo;
import X.C29921Fk;
import X.C2H2;
import X.C30061Fy;
import X.C30868C9o;
import X.C31309CQn;
import X.C31691Mf;
import X.C32251Oj;
import X.C33091Rp;
import X.C33731Ub;
import X.C34981Yw;
import X.C35201Zs;
import X.C35641aa;
import X.C36381bm;
import X.C36801cS;
import X.C37581di;
import X.C37621dm;
import X.C37811e5;
import X.C39223FaN;
import X.C3C5;
import X.C40891j3;
import X.C40901j4;
import X.C42681lw;
import X.C43391n5;
import X.C43731nd;
import X.C44061oA;
import X.C44151oJ;
import X.C45101pq;
import X.C45161pw;
import X.C45211q1;
import X.C46701sQ;
import X.C48459J0d;
import X.C54232Ax;
import X.C55792Gx;
import X.C61447O9r;
import X.C62705OjF;
import X.C72868Sim;
import X.C73411SrX;
import X.C76800UCe;
import X.C78983UzD;
import X.C87277YNd;
import X.CCJ;
import X.CL0;
import X.DIX;
import X.IRT;
import X.InterfaceC026608o;
import X.InterfaceC08210Tx;
import X.InterfaceC22790ux;
import X.InterfaceC22840v2;
import X.InterfaceC262211e;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterpolatorC22990vH;
import X.OSZ;
import X.OUP;
import X.PFB;
import X.PH3;
import X.RunnableC14040gq;
import X.RunnableC31065CHd;
import X.ViewOnAttachStateChangeListenerC023807m;
import X.ViewOnClickListenerC45171px;
import X.X1D;
import Y.IDRunnableS85S0100000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Property;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.room.RoomTrackingLiveData;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.android.live.broadcast.fragment.GameDualDevicePositionPreviewFragment;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudienceEntranceWidget;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;
import com.bytedance.android.live.broadcast.highlight.DownloadProgressDialog;
import com.bytedance.android.live.broadcast.mirror.GameCastFragment;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.effect.livegoal.LiveGoalEffectWidget;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.bytedance.android.live.effect.navi.ui.LiveNaviSkinToneContainerDialog;
import com.bytedance.android.live.room.CopyRightDialogShowOrDismissEvent;
import com.bytedance.android.live.room.GuestCopyrightViolationEvent;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.dataChannel.ShortCutPanelShowChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;
import o3.h0;
import org.json.JSONObject;
import ujb.s;
import v5.n;

/* loaded from: classes.dex */
public class IDRunnableS85S0100000 implements Runnable {
    public final int $t;
    public Object l0;

    public final void LIZ$1() {
        synchronized (this) {
            ((ViewDataBinding) this.l0).LJLILLLLZI = false;
        }
        while (true) {
            Reference<? extends ViewDataBinding> poll = ViewDataBinding.LJZI.poll();
            if (poll == null) {
                break;
            } else if (poll instanceof C024107p) {
                ((C024107p) poll).LIZ();
            }
        }
        if (!((ViewDataBinding) this.l0).LJLJJI.isAttachedToWindow()) {
            View view = ((ViewDataBinding) this.l0).LJLJJI;
            ViewOnAttachStateChangeListenerC023807m viewOnAttachStateChangeListenerC023807m = ViewDataBinding.LJZL;
            view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC023807m);
            ((ViewDataBinding) this.l0).LJLJJI.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC023807m);
            return;
        }
        ((ViewDataBinding) this.l0).LJI();
    }

    public final void LIZ$19() {
        if (C15750jb.LIZ.LJIIJ()) {
            int size = ((ArrayList) ((C33731Ub) this.l0).LJFF).size();
            for (int i = 0; i < size; i++) {
                if (((LiveEffect) ListProtector.get(((C33731Ub) this.l0).LJFF, i)).isNew) {
                    ((C33731Ub) this.l0).LIZIZ.LJLI(i);
                    C15750jb.LIZ.LJIILL();
                    return;
                }
            }
        }
        RunnableC31065CHd runnableC31065CHd = ((C33731Ub) this.l0).LIZIZ;
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
        runnableC31065CHd.LJLI(LIZJ.intValue());
    }

    public final void LIZ$20() {
        if (C17250m1.LIZ().LJIIIIZZ()) {
            int size = ((ArrayList) ((C1VS) this.l0).LJII).size();
            for (int i = 0; i < size; i++) {
                if (((LiveEffect) ListProtector.get(((C1VS) this.l0).LJII, i)).isNew) {
                    ((C1VS) this.l0).LIZIZ.LJLI(i);
                    C17250m1.LIZ().LJIIJJI();
                    return;
                }
            }
        }
        RunnableC31065CHd runnableC31065CHd = ((C1VS) this.l0).LIZIZ;
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
        runnableC31065CHd.LJLI(LIZJ.intValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                run$47(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                run$48(this);
                return;
            case C61447O9r.LJIIJ:
                run$49(this);
                return;
            case 50:
                run$50(this);
                return;
            case 51:
                run$51(this);
                return;
            case 52:
                run$52(this);
                return;
            case 53:
                run$53(this);
                return;
            case 54:
                run$54(this);
                return;
            case 55:
                run$55(this);
                return;
            case 56:
                run$56(this);
                return;
            case 57:
                run$57(this);
                return;
            case 58:
                run$58(this);
                return;
            case 59:
                run$59(this);
                return;
            case 60:
                run$60(this);
                return;
            case 61:
                run$61(this);
                return;
            case BaseNotice.CREATOR /* 62 */:
                run$62(this);
                return;
            case 63:
                run$63(this);
                return;
            case 64:
                run$64(this);
                return;
            case 65:
                run$65(this);
                return;
            case 66:
                run$66(this);
                return;
            case 67:
                run$67(this);
                return;
            case 68:
                run$68(this);
                return;
            case 69:
                run$69(this);
                return;
            case 70:
                run$70(this);
                return;
            case 71:
                run$71(this);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                run$72(this);
                return;
            case 73:
                run$73(this);
                return;
            case 74:
                run$74(this);
                return;
            case 75:
                run$75(this);
                return;
            case 76:
                run$76(this);
                return;
            case 77:
                run$77(this);
                return;
            case 78:
                run$78(this);
                return;
            case 79:
                run$79(this);
                return;
            case 80:
                run$80(this);
                return;
            case 81:
                run$81(this);
                return;
            case 82:
                run$82(this);
                return;
            case 83:
                run$83(this);
                return;
            case 84:
                run$84(this);
                return;
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                run$85(this);
                return;
            case 86:
                run$86(this);
                return;
            case 87:
                run$87(this);
                return;
            case 88:
                run$88(this);
                return;
            case 89:
                run$89(this);
                return;
            case 90:
                run$90(this);
                return;
            case 91:
                run$91(this);
                return;
            case 92:
                run$92(this);
                return;
            case 93:
                run$93(this);
                return;
            case 94:
                run$94(this);
                return;
            case 95:
                run$95(this);
                return;
            case 96:
                run$96(this);
                return;
            case 97:
                run$97(this);
                return;
            case 98:
                run$98(this);
                return;
            case 99:
                run$99(this);
                return;
            case 100:
                run$100(this);
                return;
            case 101:
                run$101(this);
                return;
            case 102:
                run$102(this);
                return;
            case 103:
                run$103(this);
                return;
            case 104:
                run$104(this);
                return;
            case 105:
                run$105(this);
                return;
            case 106:
                run$106(this);
                return;
            case 107:
                run$107(this);
                return;
            case 108:
                run$108(this);
                return;
            case 109:
                run$109(this);
                return;
            case 110:
                run$110(this);
                return;
            case 111:
                run$111(this);
                return;
            case 112:
                run$112(this);
                return;
            case 113:
                run$113(this);
                return;
            case 114:
                run$114(this);
                return;
            case 115:
                run$115(this);
                return;
            case 116:
                run$116(this);
                return;
            case 117:
                run$117(this);
                return;
            case 118:
                run$118(this);
                return;
            case 119:
                run$119(this);
                return;
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                run$120(this);
                return;
            case 121:
                run$121(this);
                return;
            case 122:
                run$122(this);
                return;
            case 123:
                run$123(this);
                return;
            case 124:
                run$124(this);
                return;
            case 125:
                run$125(this);
                return;
            case 126:
                run$126(this);
                return;
            case 127:
                run$127(this);
                return;
            case 128:
                run$128(this);
                return;
            case 129:
                run$129(this);
                return;
            case 130:
                run$130(this);
                return;
            case 131:
                run$131(this);
                return;
            case 132:
                run$132(this);
                return;
            case 133:
                run$133(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) this.l0;
        C16880lQ.LLJLLIL(appCompatDelegateImpl.LJLZ, appCompatDelegateImpl.LJLLLLLL, 55, 0, 0);
        C16650l3 c16650l3 = ((AppCompatDelegateImpl) this.l0).LJZI;
        if (c16650l3 != null) {
            c16650l3.LIZIZ();
        }
        AppCompatDelegateImpl appCompatDelegateImpl2 = (AppCompatDelegateImpl) this.l0;
        if (appCompatDelegateImpl2.LL && (viewGroup = appCompatDelegateImpl2.LLD) != null && C16330kX.LIZJ(viewGroup)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((AppCompatDelegateImpl) this.l0).LJLLLLLL.setAlpha(0.0f);
            AppCompatDelegateImpl appCompatDelegateImpl3 = (AppCompatDelegateImpl) this.l0;
            C16650l3 LIZ = h0.LIZ(appCompatDelegateImpl3.LJLLLLLL);
            LIZ.LIZ(1.0f);
            appCompatDelegateImpl3.LJZI = LIZ;
            ((AppCompatDelegateImpl) this.l0).LJZI.LIZLLL(new C31309CQn() { // from class: X.1hG
                @Override // X.InterfaceC16660l4
                public final void LIZ() {
                    ((AppCompatDelegateImpl) IDRunnableS85S0100000.this.l0).LJLLLLLL.setAlpha(1.0f);
                    ((AppCompatDelegateImpl) IDRunnableS85S0100000.this.l0).LJZI.LIZLLL(null);
                    ((AppCompatDelegateImpl) IDRunnableS85S0100000.this.l0).LJZI = null;
                }

                @Override // X.C31309CQn, X.InterfaceC16660l4
                public final void LJIIJ() {
                    ((AppCompatDelegateImpl) IDRunnableS85S0100000.this.l0).LJLLLLLL.setVisibility(0);
                }
            });
            return;
        }
        ((AppCompatDelegateImpl) this.l0).LJLLLLLL.setAlpha(1.0f);
        ((AppCompatDelegateImpl) this.l0).LJLLLLLL.setVisibility(0);
    }

    public final void LIZ$10() {
        if (!((C40901j4) this.l0).getHasSheet$livebroadcast_api_release()) {
            C40901j4 c40901j4 = (C40901j4) this.l0;
            EditText editText = (EditText) c40901j4.LJFF(R.id.amo);
            if (editText != null) {
                editText.postDelayed(new RunnableC14040gq(c40901j4, editText, 200L, 1, 5), 200L);
            }
        }
        ((C40901j4) this.l0).LJFF(R.id.amo).requestFocus();
        EditText block_word_edit_text = (EditText) ((C40901j4) this.l0).LJFF(R.id.amo);
        o.LJIIIIZZ(block_word_edit_text, "block_word_edit_text");
        C29306Beo.LJJLIIIJL(block_word_edit_text);
    }

    public final void LIZ$11() {
        C005800o c005800o = ((GameDualDeviceSourceFragment) this.l0).LLF;
        if (c005800o != null) {
            c005800o.LIZJ();
        }
        ((GameDualDeviceSourceFragment) this.l0).LJZL++;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reConnect times: ");
        C1DD.LJFF(LIZ, ((GameDualDeviceSourceFragment) this.l0).LJZL, LIZ, "GameDualDeviceSource");
    }

    public final void LIZ$12() {
        int LIZ;
        ViewGroup.LayoutParams layoutParams;
        int LIZ2;
        ViewGroup.LayoutParams layoutParams2;
        GamePartnershipAudienceEntranceWidget gamePartnershipAudienceEntranceWidget = (GamePartnershipAudienceEntranceWidget) this.l0;
        if (gamePartnershipAudienceEntranceWidget.LJLJLJ <= 0) {
            ImageView imageView = gamePartnershipAudienceEntranceWidget.LJLJJLL;
            if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
                LIZ2 = layoutParams2.width;
            } else {
                LIZ2 = (int) B9K.LIZ(((GamePartnershipAudienceEntranceWidget) this.l0).context, 24.0f);
            }
            gamePartnershipAudienceEntranceWidget.LJLJLJ = LIZ2;
        }
        GamePartnershipAudienceEntranceWidget gamePartnershipAudienceEntranceWidget2 = (GamePartnershipAudienceEntranceWidget) this.l0;
        if (gamePartnershipAudienceEntranceWidget2.LJLJLLL <= 0) {
            ImageView imageView2 = gamePartnershipAudienceEntranceWidget2.LJLJJLL;
            if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
                LIZ = layoutParams.height;
            } else {
                LIZ = (int) B9K.LIZ(((GamePartnershipAudienceEntranceWidget) this.l0).context, 24.0f);
            }
            gamePartnershipAudienceEntranceWidget2.LJLJLLL = LIZ;
        }
    }

    public final void LIZ$13() {
        GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog = (GamePreparationNetworkSpeedDetectionDialog) this.l0;
        gamePreparationNetworkSpeedDetectionDialog.Ol(10L, false);
        C73411SrX c73411SrX = gamePreparationNetworkSpeedDetectionDialog.LLFF;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        gamePreparationNetworkSpeedDetectionDialog.LLFF = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(1L, TimeUnit.SECONDS).LJJLIIIJ(10L).LJJIJL(new OUP()).LJII(new C62705OjF()).LJIIZILJ(new IDaS211S0100000(gamePreparationNetworkSpeedDetectionDialog, 1)).LJJJJZI(new IDfS292S0100000(gamePreparationNetworkSpeedDetectionDialog, 15));
        GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog2 = (GamePreparationNetworkSpeedDetectionDialog) this.l0;
        if (gamePreparationNetworkSpeedDetectionDialog2.LLD == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gamePreparationNetworkSpeedDetectionDialog2.LLFII, (Property<AppCompatImageView, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new InterpolatorC22990vH(0.33f, 0.0f, 0.35f, 1.0f));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gamePreparationNetworkSpeedDetectionDialog2.LLFII, (Property<AppCompatImageView, Float>) View.ROTATION, 6.0f, 38.0f);
            ofFloat2.setStartDelay(100L);
            ofFloat2.setDuration(400L);
            ofFloat2.setInterpolator(new InterpolatorC22990vH(0.33f, 0.0f, 0.35f, 1.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            gamePreparationNetworkSpeedDetectionDialog2.LLD = animatorSet;
            animatorSet.playTogether(ofFloat);
            AnimatorSet animatorSet2 = gamePreparationNetworkSpeedDetectionDialog2.LLD;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(ofFloat2);
            }
            AnimatorSet animatorSet3 = gamePreparationNetworkSpeedDetectionDialog2.LLD;
            if (animatorSet3 != null) {
                animatorSet3.setDuration(500L);
            }
        }
        if (gamePreparationNetworkSpeedDetectionDialog2.LLF == null) {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gamePreparationNetworkSpeedDetectionDialog2.LLFII, (Property<AppCompatImageView, Float>) View.ROTATION, 38.0f, 30.0f, 38.0f, 30.0f, 38.0f);
            gamePreparationNetworkSpeedDetectionDialog2.LLF = ofFloat3;
            if (ofFloat3 != null) {
                ofFloat3.setStartDelay(1000L);
            }
            Animator animator = gamePreparationNetworkSpeedDetectionDialog2.LLF;
            if (animator != null) {
                animator.setDuration(800L);
            }
            Animator animator2 = gamePreparationNetworkSpeedDetectionDialog2.LLF;
            if (animator2 != null) {
                animator2.setInterpolator(new InterpolatorC22990vH(0.33f, 0.0f, 0.35f, 1.0f));
            }
            Animator animator3 = gamePreparationNetworkSpeedDetectionDialog2.LLF;
            if (animator3 != null) {
                animator3.addListener(new IDAListenerS69S0100000(gamePreparationNetworkSpeedDetectionDialog2, 8));
            }
        }
        gamePreparationNetworkSpeedDetectionDialog2.LLIIIJ = false;
        AnimatorSet animatorSet4 = gamePreparationNetworkSpeedDetectionDialog2.LLD;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        Animator animator4 = gamePreparationNetworkSpeedDetectionDialog2.LLF;
        if (animator4 != null) {
            animator4.start();
        }
    }

    public final void LIZ$15() {
        C05960Lg c05960Lg = (C05960Lg) this.l0;
        if (c05960Lg.LJLJLLL == 0) {
            c05960Lg.getFavoriteTextView().measure(0, 0);
            int measuredWidth = c05960Lg.getFavoriteTextView().getMeasuredWidth();
            if (measuredWidth == 0) {
                return;
            } else {
                c05960Lg.LJLJLLL = C15380j0.LIZ(8.0f) + measuredWidth + c05960Lg.LJLIL;
            }
        }
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.LLLLLLZZ;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        c48459J0d.LIZ(Long.valueOf(calendar.getTimeInMillis()));
        C48459J0d<Integer> c48459J0d2 = InterfaceC30442Bx8.LLLLLZ;
        c48459J0d2.LIZ(Integer.valueOf(c48459J0d2.LIZJ().intValue() + 1));
        ValueAnimator duration = ValueAnimator.ofInt(c05960Lg.LJLIL, c05960Lg.LJLJLLL).setDuration(300L);
        duration.addUpdateListener(new IDUListenerS263S0100000(c05960Lg, 13));
        duration.addListener(new IDAListenerS69S0100000(c05960Lg, 5));
        duration.start();
        ValueAnimator duration2 = ValueAnimator.ofInt(c05960Lg.LJLJLLL, c05960Lg.LJLIL).setDuration(300L);
        duration2.addUpdateListener(new IDUListenerS263S0100000(c05960Lg, 14));
        duration2.addListener(new IDAListenerS69S0100000(c05960Lg, 6));
        duration2.setStartDelay(2300L);
        duration2.start();
    }

    public final void LIZ$16() {
        ((C0M2) this.l0).getClass();
    }

    public final void LIZ$17() {
        try {
            ((C0M2) this.l0).getClass();
        } catch (Throwable th) {
            C10060aQ.LIZ.LIZIZ(th, "serious_block_deal_exception");
        }
    }

    public final void LIZ$18() {
        int LIZ;
        View view = ((LiveGoalEffectWidget) this.l0).getView();
        if (view != null) {
            view.getWidth();
            LiveGoalEffectWidget liveGoalEffectWidget = (LiveGoalEffectWidget) this.l0;
            m mVar = C31691Mf.LJ;
            if (mVar == null) {
                mVar = InterfaceC30442Bx8.g2.LIZJ();
            }
            LiveGoalInfo liveGoalInfo = (LiveGoalInfo) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, (j) mVar, LiveGoalInfo.class);
            View view2 = liveGoalEffectWidget.LJLIL;
            Integer num = liveGoalInfo.safeAreaHeight;
            if (num != null) {
                LIZ = num.intValue();
            } else {
                LIZ = C15380j0.LIZ(347.0f);
            }
            C29306Beo.LJJJJLI(LIZ, view2);
        }
    }

    public final void LIZ$2() {
        C29031Bz c29031Bz = (C29031Bz) this.l0;
        int i = c29031Bz.LLFZ;
        if (i != 1) {
            if (i != 2) {
                return;
            }
        } else {
            c29031Bz.LLFII.cancel();
        }
        c29031Bz.LLFZ = 3;
        ValueAnimator valueAnimator = c29031Bz.LLFII;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        c29031Bz.LLFII.setDuration(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        c29031Bz.LLFII.start();
    }

    public final void LIZ$21() {
        String str;
        OSZ osz;
        C34981Yw c34981Yw = (C34981Yw) this.l0;
        if (c34981Yw.LJLJLJ) {
            return;
        }
        DataChannel dataChannel = c34981Yw.LJLILLLLZI;
        if (dataChannel == null || (osz = (OSZ) dataChannel.kv0(BD3.class)) == null || (str = (String) osz.getSecond()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            String exampleString = C15380j0.LJIILJJIL(R.string.lam);
            o.LJIIIIZZ(exampleString, "exampleString");
            int LJJLIIIJJIZ = s.LJJLIIIJJIZ(exampleString, '{', 0, false, 6);
            String substring = exampleString.substring(LJJLIIIJJIZ, s.LJJLIIIJJIZ(exampleString, '}', LJJLIIIJJIZ, false, 4) + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C30868C9o.LJI(ujb.o.LJJJJZ(exampleString, substring, str, false));
            ((C34981Yw) this.l0).LJLJLJ = true;
        }
    }

    public final void LIZ$22() {
        LinkedList linkedList;
        boolean z;
        C21260sU c21260sU = (C21260sU) this.l0;
        c21260sU.getClass();
        if (C09970aH.LJIIIIZZ()) {
            C21270sV c21270sV = new C21270sV();
            List LIZ = c21260sU.LIZ(0L, true);
            if (!C17N.LJJIIZI(LIZ)) {
                try {
                    z = C21260sU.LIZLLL(c21270sV, LIZ);
                } catch (Exception unused) {
                    z = false;
                }
                IRT irt = (IRT) DIX.LIZJ(LIZ, 1, LIZ);
                long j = irt.LIZ;
                long j2 = irt.LIZJ;
                try {
                    if (!z) {
                        C09970aH.LJII();
                        c21260sU.LIZIZ().LJI(j);
                    } else {
                        C09970aH.LJII();
                        List<IRT> LIZ2 = c21260sU.LIZ(j2, false);
                        HashMap hashMap = new HashMap(4);
                        for (IRT irt2 : LIZ2) {
                            String str = irt2.LJIIIZ;
                            List list = (List) hashMap.get(str);
                            if (list != null) {
                                list.add(irt2);
                            } else {
                                LinkedList linkedList2 = new LinkedList();
                                linkedList2.add(irt2);
                                hashMap.put(str, linkedList2);
                            }
                        }
                        try {
                            Iterator it = hashMap.values().iterator();
                            while (it.hasNext()) {
                                C21260sU.LIZLLL(c21270sV, (List) it.next());
                            }
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        c21270sV.LJFF = c21270sV.LJIIZILJ;
                        c21270sV.LIZJ = c21270sV.LJIJJ;
                        c21270sV.LIZLLL = c21270sV.LJIJ;
                        c21270sV.LJI = c21270sV.LJIJJLI;
                        c21270sV.LJ = c21270sV.LJIJI;
                        c21270sV.LIZ = c21270sV.LJIILL;
                        c21270sV.LJIIJ = c21270sV.LJIL;
                        c21270sV.LJII = c21270sV.LJJIFFI;
                        c21270sV.LJIIIIZZ = c21270sV.LJJ;
                        c21270sV.LJIIJJI = c21270sV.LJJII;
                        c21270sV.LJIIIZ = c21270sV.LJJI;
                        c21270sV.LIZIZ = c21270sV.LJIILLIIL;
                        c21270sV.LJIIL = false;
                        c21270sV.LJIILIIL = "all_process";
                        try {
                            c21270sV.LIZIZ(false);
                        } catch (Exception unused2) {
                        }
                        c21260sU.LIZIZ().LJI(j);
                    }
                } catch (Exception unused3) {
                }
            }
        }
        ((C21260sU) this.l0).LIZ = true;
        synchronized (((C21260sU) this.l0).LJ) {
            linkedList = new LinkedList(((C21260sU) this.l0).LJ);
            ((C21260sU) this.l0).LJ.clear();
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            ((C21260sU) this.l0).LIZJ((IRT) it2.next());
        }
    }

    public final void LIZ$23() {
        C23770wX c23770wX = (C23770wX) this.l0;
        Handler handler = c23770wX.LIZJ;
        if (handler != null) {
            handler.removeCallbacks(c23770wX.LJ);
        }
        C23770wX c23770wX2 = (C23770wX) this.l0;
        Float f = c23770wX2.LIZLLL;
        C04740Go c04740Go = c23770wX2.LIZ;
        AnonymousClass291 anonymousClass291 = c04740Go.LJLLL;
        if (f != null && anonymousClass291 != null) {
            synchronized (c04740Go.LLD) {
                anonymousClass291.LJIIZILJ(f.floatValue());
                try {
                    if (((C23770wX) this.l0).LIZ.LIZLLL()) {
                        C23770wX c23770wX3 = (C23770wX) this.l0;
                        C25150yl.LIZ(c23770wX3.LIZ, c23770wX3.LIZIZ);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void LIZ$24() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.l0;
        String LIZJ = constraintTrackingWorker.LJLILLLLZI.LIZIZ.LIZJ("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(LIZJ)) {
            C0VW.LIZ().getClass();
            constraintTrackingWorker.LJLJLLL.LJIIIIZZ(new C29241Cu());
            return;
        }
        ListenableWorker LIZ = constraintTrackingWorker.LJLILLLLZI.LJ.LIZ(constraintTrackingWorker.LJLIL, LIZJ, constraintTrackingWorker.LJLJJLL);
        constraintTrackingWorker.LJLL = LIZ;
        if (LIZ == null) {
            C0VW.LIZ().getClass();
            constraintTrackingWorker.LJLJLLL.LJIIIIZZ(new C29241Cu());
            return;
        }
        C19380pS LJIIIIZZ = ((C1Y1) C1OU.LJ(constraintTrackingWorker.LJLIL).LIZJ.LJJ()).LJIIIIZZ(constraintTrackingWorker.LJLILLLLZI.LIZ.toString());
        if (LJIIIIZZ == null) {
            constraintTrackingWorker.LJLJLLL.LJIIIIZZ(new C29241Cu());
            return;
        }
        Context context = constraintTrackingWorker.LJLIL;
        C33091Rp c33091Rp = new C33091Rp(context, C1OU.LJ(context).LIZLLL, constraintTrackingWorker);
        c33091Rp.LIZJ(Collections.singletonList(LJIIIIZZ));
        if (c33091Rp.LIZ(constraintTrackingWorker.LJLILLLLZI.LIZ.toString())) {
            C0VW LIZ2 = C0VW.LIZ();
            C16880lQ.LLLZ("Constraints met for delegate %s", new Object[]{LIZJ});
            LIZ2.getClass();
            try {
                C43731nd LJ = constraintTrackingWorker.LJLL.LJ();
                LJ.LJFF(new IDRunnableS29S0200000(LJ, constraintTrackingWorker, 40), constraintTrackingWorker.LJLILLLLZI.LIZJ);
                return;
            } catch (Throwable unused) {
                C0VW LIZ3 = C0VW.LIZ();
                C16880lQ.LLLZ("Delegated worker %s threw exception in startWork.", new Object[]{LIZJ});
                LIZ3.getClass();
                synchronized (constraintTrackingWorker.LJLJL) {
                    if (constraintTrackingWorker.LJLJLJ) {
                        C0VW.LIZ().getClass();
                        constraintTrackingWorker.LJLJLLL.LJIIIIZZ(new C29251Cv());
                    } else {
                        constraintTrackingWorker.LJLJLLL.LJIIIIZZ(new C29241Cu());
                    }
                    return;
                }
            }
        }
        C0VW LIZ4 = C0VW.LIZ();
        C16880lQ.LLLZ("Constraints not met for delegate %s. Requesting retry.", new Object[]{LIZJ});
        LIZ4.getClass();
        constraintTrackingWorker.LJLJLLL.LJIIIIZZ(new C29251Cv());
    }

    public final void LIZ$25() {
        ((C44061oA) this.l0).LJLJJI.getClass();
        for (int i = 0; i < ((C44061oA) this.l0).LJLILLLLZI.size(); i++) {
            ((PH3) ListProtector.get(((C44061oA) this.l0).LJLILLLLZI, i)).LIZJ.getClass();
        }
    }

    public final void LIZ$26() {
        try {
            C36381bm c36381bm = (C36381bm) ((IDRunnableS85S0100000) this.l0).l0;
            c36381bm.getClass();
            try {
                if (Build.VERSION.SDK_INT > 22) {
                    long[] jArr = c36381bm.LJIIIZ;
                    if (jArr == null) {
                        c36381bm.LJIJJ = PFB.LIZIZ;
                    } else {
                        c36381bm.LJIJJ = jArr[1] / 1000000;
                    }
                } else {
                    c36381bm.LJIJJ = PFB.LIZIZ;
                }
                c36381bm.LJFF = true;
                c36381bm.LJIIL = false;
            } catch (Throwable th) {
                c36381bm.LJIIL = false;
                throw th;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$27() {
        Method method;
        try {
            C36381bm c36381bm = (C36381bm) this.l0;
            c36381bm.LJIILJJIL = new IDRunnableS85S0100000(this, 110);
            c36381bm.LJII = C36381bm.LJIIJJI(c36381bm.LJIIJJI, "mLock");
            C36381bm c36381bm2 = (C36381bm) this.l0;
            if (c36381bm2.LJII == null) {
                c36381bm2.LJII = C36381bm.LJIIJ(c36381bm2.LJIIJJI, "mLock");
            }
            C36381bm c36381bm3 = (C36381bm) this.l0;
            c36381bm3.LJIIIIZZ = (Object[]) C36381bm.LJIIJJI(c36381bm3.LJIIJJI, "mCallbackQueues");
            C36381bm c36381bm4 = (C36381bm) this.l0;
            if (c36381bm4.LJIIIIZZ == null) {
                c36381bm4.LJIIIIZZ = (Object[]) C36381bm.LJIIJ(c36381bm4.LJIIJJI, "mCallbackQueues");
            }
            int i = Build.VERSION.SDK_INT;
            if (i != 28) {
                if (i > 28) {
                    C36381bm c36381bm5 = (C36381bm) this.l0;
                    c36381bm5.LJIIIZ = (long[]) C36381bm.LJIIJ(C36381bm.LJIIJ(c36381bm5.LJIIJJI, "mFrameInfo"), "frameInfo");
                } else if (i > 22) {
                    C36381bm c36381bm6 = (C36381bm) this.l0;
                    c36381bm6.LJIIIZ = (long[]) C36381bm.LJIIJJI(C36381bm.LJIIJJI(c36381bm6.LJIIJJI, "mFrameInfo"), "mFrameInfo");
                }
            } else {
                C36381bm c36381bm7 = (C36381bm) this.l0;
                c36381bm7.LJIIIZ = (long[]) C36381bm.LJIIJ(C36381bm.LJIIJ(c36381bm7.LJIIJJI, "mFrameInfo"), "mFrameInfo");
            }
            if (((C36381bm) this.l0).LJIIIZ == null && i > 22) {
                C78983UzD.LJIILL("FrameInfoIsNull");
            }
            if (((C36381bm) this.l0).LJII == null) {
                C78983UzD.LJIILL("CallbackQueueLockIsNull");
            }
            if (((C36381bm) this.l0).LJIIIIZZ == null) {
                C78983UzD.LJIILL("callbackQueuesIsNull");
            }
            C36381bm c36381bm8 = (C36381bm) this.l0;
            try {
                method = c36381bm8.LJIIIIZZ[0].getClass().getDeclaredMethod("addCallbackLocked", Long.TYPE, Object.class, Object.class);
                method.setAccessible(true);
            } catch (Exception unused) {
                method = null;
            }
            c36381bm8.LJIIJ = method;
            C36381bm c36381bm9 = (C36381bm) this.l0;
            c36381bm9.LIZIZ(c36381bm9.LJIILJJIL);
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "MainThreadMonitor_fullFps");
        }
    }

    public final void LIZ$28() {
        Object LIZ;
        C37621dm c37621dm = (C37621dm) this.l0;
        c37621dm.getClass();
        final long LIZ2 = C17130lp.LIZ();
        String str = c37621dm.LIZIZ.LJLJJI;
        if (str.length() == 0) {
            AnonymousClass122.LIZ(c37621dm.LIZIZ, c37621dm.LIZ, null, LIZ2);
            return;
        }
        final String str2 = c37621dm.LIZ;
        final BFR bfr = c37621dm.LIZIZ;
        Map<String, Object> map = c37621dm.LIZJ;
        Room LJJIL = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
        if (LJJIL == null) {
            return;
        }
        InterfaceC22790ux LJFF = C0IT.LJFF();
        try {
            LIZ = new JSONObject().putOpt("trigger_type", bfr.LJLIL).putOpt("room_id", Long.valueOf(LJJIL.getId())).putOpt("ab_params", new JSONObject(map));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LIZ = new JSONObject();
        }
        ((C29921Fk) LJFF).LIZJ(new C22810uz(str, new C22820v0(false, (JSONObject) LIZ), new InterfaceC22840v2(str2, bfr, LIZ2) { // from class: X.1dn
            public final String LJLIL;
            public final BFR LJLILLLLZI;
            public final long LJLJI;

            @Override // X.InterfaceC22840v2
            public final void LJIILIIL(C22830v1 outputData) {
                Object LIZ3;
                int i;
                JSONObject jSONObject;
                o.LJIIIZ(outputData, "outputData");
                if (!outputData.LIZ()) {
                    String str3 = this.LJLIL;
                    BFR bfr2 = this.LJLILLLLZI;
                    long j = this.LJLJI;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("[error code == ");
                    LIZ4.append(outputData.LIZ);
                    LIZ4.append("] [raw error == ");
                    LIZ4.append(outputData.LIZJ);
                    LIZ4.append(']');
                    AnonymousClass126.LIZ(false, str3, bfr2, j, X1D.LIZIZ(LIZ4));
                    return;
                }
                try {
                    JSONObject jSONObject2 = outputData.LIZIZ;
                    if (jSONObject2 != null) {
                        i = jSONObject2.optInt("trigger_filter_result");
                    } else {
                        i = 0;
                    }
                    JSONObject jSONObject3 = outputData.LIZIZ;
                    if (jSONObject3 != null) {
                        jSONObject = jSONObject3.optJSONObject("features");
                    } else {
                        jSONObject = null;
                    }
                } catch (Throwable th2) {
                    LIZ3 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ3);
                }
                if (i <= 0) {
                    return;
                }
                AnonymousClass122.LIZ(this.LJLILLLLZI, this.LJLIL, jSONObject, this.LJLJI);
                LIZ3 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ3);
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ3);
                if (m10exceptionOrNullimpl != null) {
                    String str4 = this.LJLIL;
                    BFR bfr3 = this.LJLILLLLZI;
                    long j2 = this.LJLJI;
                    String message = m10exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    AnonymousClass126.LIZ(false, str4, bfr3, j2, message);
                }
            }

            {
                o.LJIIIZ(str2, "triggerBusinessName");
                o.LJIIIZ(bfr, "singleTriggerConfig");
                this.LJLIL = str2;
                this.LJLILLLLZI = bfr;
                this.LJLJI = LIZ2;
            }
        }, (C35201Zs) null, 24));
    }

    public final void LIZ$29() {
        if (((C12U) this.l0).LJIIJ.getWidth() > 0 && ((C12U) this.l0).LJIIJ.getHeight() > 0) {
            C12U c12u = (C12U) this.l0;
            C45101pq c45101pq = c12u.LIZ.LIZ;
            if (c45101pq != null) {
                c45101pq.LLLLZIL(c12u.LJIIJ.getWidth(), ((C12U) this.l0).LJIIJ.getHeight());
                return;
            }
            return;
        }
        String LLLZ = C16880lQ.LLLZ("ctrlView size is wrong, width=%d, height=%d", Arrays.copyOf(new Object[]{Integer.valueOf(((C12U) this.l0).LJIIJ.getWidth()), Integer.valueOf(((C12U) this.l0).LJIIJ.getHeight())}, 2));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        C0NB.LJ("GameUiStateMachine", LLLZ);
        ((C12U) this.l0).LJIIJ.measure(0, 0);
        C12U c12u2 = (C12U) this.l0;
        c12u2.LIZ.LIZ.LLLLZIL(c12u2.LJIIJ.getMeasuredWidth(), ((C12U) this.l0).LJIIJ.getMeasuredHeight());
        String LLLZ2 = C16880lQ.LLLZ("ctrlView size after measured, measuredWidth=%d, measuredHeight=%d", Arrays.copyOf(new Object[]{Integer.valueOf(((C12U) this.l0).LJIIJ.getMeasuredWidth()), Integer.valueOf(((C12U) this.l0).LJIIJ.getMeasuredHeight())}, 2));
        o.LJIIIIZZ(LLLZ2, "format(format, *args)");
        C0NB.LJ("GameUiStateMachine", LLLZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r12 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r2 < 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (r2 > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        if (r12 > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDRunnableS85S0100000.LIZ$3():void");
    }

    public final void LIZ$30() {
        int i;
        int i2;
        int i3;
        int i4;
        Rect rect = new Rect();
        C55792Gx c55792Gx = (C55792Gx) this.l0;
        int i5 = c55792Gx.LJLLL;
        int i6 = c55792Gx.LJLLLL;
        rect.top = i5 - i6;
        rect.bottom = i5 + c55792Gx.LJLLILLLL + i6;
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            C55792Gx c55792Gx2 = (C55792Gx) this.l0;
            i = c55792Gx2.LJLLJ;
            i2 = c55792Gx2.LJLLLL;
        } else {
            C55792Gx c55792Gx3 = (C55792Gx) this.l0;
            i = (c55792Gx3.LJLL - c55792Gx3.LJLLJ) - c55792Gx3.LJLLILLLL;
            i2 = c55792Gx3.LJLLLL;
        }
        rect.left = i - i2;
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            C55792Gx c55792Gx4 = (C55792Gx) this.l0;
            i3 = c55792Gx4.LJLLJ + c55792Gx4.LJLLILLLL;
            i4 = c55792Gx4.LJLLLL;
        } else {
            C55792Gx c55792Gx5 = (C55792Gx) this.l0;
            i3 = c55792Gx5.LJLL - c55792Gx5.LJLLJ;
            i4 = c55792Gx5.LJLLLL;
        }
        rect.right = i3 + i4;
        View view = ((C55792Gx) this.l0).LJLJJI;
        if (view == null) {
            return;
        }
        view.setTouchDelegate(new TouchDelegate(rect, ((C55792Gx) this.l0).LLI));
    }

    public final void LIZ$31() {
        int i;
        int i2;
        Rect rect = new Rect();
        C37811e5 c37811e5 = (C37811e5) this.l0;
        int i3 = c37811e5.LJLJL;
        int i4 = c37811e5.LJLJLJ;
        rect.top = i3 - i4;
        rect.bottom = i3 + c37811e5.LJLJJL + i4;
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            C37811e5 c37811e52 = (C37811e5) this.l0;
            i = c37811e52.LJLJJLL - c37811e52.LJLJLJ;
        } else {
            int width = ((C37811e5) this.l0).getWidth();
            C37811e5 c37811e53 = (C37811e5) this.l0;
            i = ((width - c37811e53.LJLJJLL) - c37811e53.LJLJJL) - c37811e53.LJLJLJ;
        }
        rect.left = i;
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            C37811e5 c37811e54 = (C37811e5) this.l0;
            i2 = c37811e54.LJLJJLL + c37811e54.LJLJJL + c37811e54.LJLJLJ;
        } else {
            int width2 = ((C37811e5) this.l0).getWidth();
            C37811e5 c37811e55 = (C37811e5) this.l0;
            i2 = c37811e55.LJLJLJ + (width2 - c37811e55.LJLJJLL);
        }
        rect.right = i2;
        ((C37811e5) this.l0).setTouchDelegate(new TouchDelegate(rect, ((C37811e5) this.l0).LJLL));
    }

    public final void LIZ$32() {
        C277116x c277116x = (C277116x) this.l0;
        if (!c277116x.LJ) {
            c277116x.LIZJ.qv0(CopyRightDialogShowOrDismissEvent.class, Boolean.FALSE);
            if (o.LJ(((C277116x) this.l0).LIZJ.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                ((C277116x) this.l0).LIZJ(103);
            } else {
                ((C277116x) this.l0).LIZJ(203);
            }
        }
    }

    public final void LIZ$4() {
        if (((RoomTrackingLiveData) this.l0).mRegisteredObserver.compareAndSet(false, true)) {
            RoomTrackingLiveData roomTrackingLiveData = (RoomTrackingLiveData) this.l0;
            final C0BR c0br = roomTrackingLiveData.mDatabase.LJ;
            final C0BP c0bp = roomTrackingLiveData.mObserver;
            c0br.getClass();
            c0br.LIZ(new C0BP(c0br, c0bp) { // from class: X.1CK
                public final C0BR LIZIZ;
                public final WeakReference<C0BP> LIZJ;

                @Override // X.C0BP
                public final void LIZ(java.util.Set<String> set) {
                    C0BP c0bp2 = this.LIZJ.get();
                    if (c0bp2 == null) {
                        this.LIZIZ.LIZJ(this);
                    } else {
                        c0bp2.LIZ(set);
                    }
                }

                {
                    super(c0bp.LIZ);
                    this.LIZIZ = c0br;
                    this.LIZJ = new WeakReference<>(c0bp);
                }
            });
        }
        while (((RoomTrackingLiveData) this.l0).mComputing.compareAndSet(false, true)) {
            Object obj = null;
            boolean z = false;
            while (((RoomTrackingLiveData) this.l0).mInvalid.compareAndSet(true, false)) {
                try {
                    try {
                        obj = ((RoomTrackingLiveData) this.l0).mComputeFunction.call();
                        z = true;
                    } catch (Exception e) {
                        throw new RuntimeException("Exception while computing database live data.", e);
                    }
                } finally {
                    ((RoomTrackingLiveData) this.l0).mComputing.set(false);
                }
            }
            if (z) {
                ((RoomTrackingLiveData) this.l0).postValue(obj);
            }
            if (!z || !((RoomTrackingLiveData) this.l0).mInvalid.get()) {
                return;
            }
        }
    }

    public final void LIZ$5() {
        Set<Integer> set;
        InterfaceC262211e LJLJLLL;
        ReentrantReadWriteLock.ReadLock readLock = ((C0BR) this.l0).LIZLLL.LJIIIIZZ.readLock();
        readLock.lock();
        try {
            try {
            } finally {
                readLock.unlock();
                ((C0BR) this.l0).getClass();
            }
        } catch (SQLiteException | IllegalStateException unused) {
            set = null;
        }
        if (((C0BR) this.l0).LIZIZ() && ((C0BR) this.l0).LJ.compareAndSet(true, false) && !((C0BR) this.l0).LIZLLL.LJIIJ()) {
            try {
                LJLJLLL = ((C0BR) this.l0).LIZLLL.LIZLLL.LJLJLLL();
                LJLJLLL.LJIL();
            } catch (SQLiteException | IllegalStateException unused2) {
            }
            try {
                set = LIZIZ$6();
                try {
                    LJLJLLL.LJJIJL();
                    LJLJLLL.LJJIJLIJ();
                    if (set != null && !set.isEmpty()) {
                        synchronized (((C0BR) this.l0).LJIIIIZZ) {
                            Iterator<Map.Entry<C0BP, C0BQ>> it = ((C0BR) this.l0).LJIIIIZZ.iterator();
                            while (it.hasNext()) {
                                C0BQ value = it.next().getValue();
                                int length = value.LIZ.length;
                                Set<String> set2 = null;
                                for (int i = 0; i < length; i++) {
                                    if (set.contains(Integer.valueOf(value.LIZ[i]))) {
                                        if (length == 1) {
                                            set2 = value.LIZLLL;
                                        } else {
                                            if (set2 == null) {
                                                set2 = new HashSet<>(length);
                                            }
                                            set2.add(value.LIZIZ[i]);
                                        }
                                    }
                                }
                                if (set2 != null) {
                                    value.LIZJ.LIZ(set2);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    LJLJLLL.LJJIJLIJ();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void LIZ$7() {
        final C1D9 c1d9;
        Runnable runnable;
        synchronized (((C1D9) this.l0).LJLJLJ) {
            C1D9 c1d92 = (C1D9) this.l0;
            c1d92.LJLJLLL = (Intent) ((ArrayList) c1d92.LJLJLJ).get(0);
        }
        Intent intent = ((C1D9) this.l0).LJLJLLL;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = ((C1D9) this.l0).LJLJLLL.getIntExtra("KEY_START_ID", 0);
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Processing command %s, %s", new Object[]{((C1D9) this.l0).LJLJLLL, Integer.valueOf(intExtra)});
            LIZ.getClass();
            PowerManager.WakeLock LIZ2 = C20550rL.LIZ(((C1D9) this.l0).LJLIL, C16880lQ.LLLZ("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
            try {
                try {
                    C0VW LIZ3 = C0VW.LIZ();
                    C16880lQ.LLLZ("Acquiring operation wake lock (%s) %s", new Object[]{action, LIZ2});
                    LIZ3.getClass();
                    LIZ2.acquire();
                    C1D9 c1d93 = (C1D9) this.l0;
                    c1d93.LJLJJLL.LIZLLL(intExtra, c1d93.LJLJLLL, c1d93);
                    C0VW LIZ4 = C0VW.LIZ();
                    C16880lQ.LLLZ("Releasing operation wake lock (%s) %s", new Object[]{action, LIZ2});
                    LIZ4.getClass();
                    LIZ2.release();
                    c1d9 = (C1D9) this.l0;
                    runnable = new Runnable(c1d9) { // from class: X.0Cd
                        public final C1D9 LJLIL;

                        public final void LIZ() {
                            C1D9 c1d94 = this.LJLIL;
                            c1d94.getClass();
                            C0VW.LIZ().getClass();
                            c1d94.LIZIZ();
                            synchronized (c1d94.LJLJLJ) {
                                if (c1d94.LJLJLLL != null) {
                                    C0VW LIZ5 = C0VW.LIZ();
                                    C16880lQ.LLLZ("Removing command %s", new Object[]{c1d94.LJLJLLL});
                                    LIZ5.getClass();
                                    if (((Intent) ((ArrayList) c1d94.LJLJLJ).remove(0)).equals(c1d94.LJLJLLL)) {
                                        c1d94.LJLJLLL = null;
                                    } else {
                                        throw new IllegalStateException("Dequeue-d command is not the first.");
                                    }
                                }
                                ExecutorC20520rI executorC20520rI = ((C35591aV) c1d94.LJLILLLLZI).LIZ;
                                if (!c1d94.LJLJJLL.LIZJ() && ((ArrayList) c1d94.LJLJLJ).isEmpty() && !executorC20520rI.LIZ()) {
                                    C0VW.LIZ().getClass();
                                    InterfaceC03580Cc interfaceC03580Cc = c1d94.LJLL;
                                    if (interfaceC03580Cc != null) {
                                        ((SystemAlarmService) interfaceC03580Cc).LIZ();
                                    }
                                } else if (!((ArrayList) c1d94.LJLJLJ).isEmpty()) {
                                    c1d94.LJI();
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ5;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ5) {
                                }
                            }
                        }

                        {
                            this.LJLIL = c1d9;
                        }
                    };
                } catch (Throwable th) {
                    C0VW LIZ5 = C0VW.LIZ();
                    C16880lQ.LLLZ("Releasing operation wake lock (%s) %s", new Object[]{action, LIZ2});
                    LIZ5.getClass();
                    LIZ2.release();
                    final C1D9 c1d94 = (C1D9) this.l0;
                    c1d94.LJFF(new Runnable(c1d94) { // from class: X.0Cd
                        public final C1D9 LJLIL;

                        public final void LIZ() {
                            C1D9 c1d942 = this.LJLIL;
                            c1d942.getClass();
                            C0VW.LIZ().getClass();
                            c1d942.LIZIZ();
                            synchronized (c1d942.LJLJLJ) {
                                if (c1d942.LJLJLLL != null) {
                                    C0VW LIZ52 = C0VW.LIZ();
                                    C16880lQ.LLLZ("Removing command %s", new Object[]{c1d942.LJLJLLL});
                                    LIZ52.getClass();
                                    if (((Intent) ((ArrayList) c1d942.LJLJLJ).remove(0)).equals(c1d942.LJLJLLL)) {
                                        c1d942.LJLJLLL = null;
                                    } else {
                                        throw new IllegalStateException("Dequeue-d command is not the first.");
                                    }
                                }
                                ExecutorC20520rI executorC20520rI = ((C35591aV) c1d942.LJLILLLLZI).LIZ;
                                if (!c1d942.LJLJJLL.LIZJ() && ((ArrayList) c1d942.LJLJLJ).isEmpty() && !executorC20520rI.LIZ()) {
                                    C0VW.LIZ().getClass();
                                    InterfaceC03580Cc interfaceC03580Cc = c1d942.LJLL;
                                    if (interfaceC03580Cc != null) {
                                        ((SystemAlarmService) interfaceC03580Cc).LIZ();
                                    }
                                } else if (!((ArrayList) c1d942.LJLJLJ).isEmpty()) {
                                    c1d942.LJI();
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ52;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ52) {
                                }
                            }
                        }

                        {
                            this.LJLIL = c1d94;
                        }
                    });
                    throw th;
                }
            } catch (Throwable unused) {
                C0VW.LIZ().getClass();
                C0VW LIZ6 = C0VW.LIZ();
                C16880lQ.LLLZ("Releasing operation wake lock (%s) %s", new Object[]{action, LIZ2});
                LIZ6.getClass();
                LIZ2.release();
                c1d9 = (C1D9) this.l0;
                runnable = new Runnable(c1d9) { // from class: X.0Cd
                    public final C1D9 LJLIL;

                    public final void LIZ() {
                        C1D9 c1d942 = this.LJLIL;
                        c1d942.getClass();
                        C0VW.LIZ().getClass();
                        c1d942.LIZIZ();
                        synchronized (c1d942.LJLJLJ) {
                            if (c1d942.LJLJLLL != null) {
                                C0VW LIZ52 = C0VW.LIZ();
                                C16880lQ.LLLZ("Removing command %s", new Object[]{c1d942.LJLJLLL});
                                LIZ52.getClass();
                                if (((Intent) ((ArrayList) c1d942.LJLJLJ).remove(0)).equals(c1d942.LJLJLLL)) {
                                    c1d942.LJLJLLL = null;
                                } else {
                                    throw new IllegalStateException("Dequeue-d command is not the first.");
                                }
                            }
                            ExecutorC20520rI executorC20520rI = ((C35591aV) c1d942.LJLILLLLZI).LIZ;
                            if (!c1d942.LJLJJLL.LIZJ() && ((ArrayList) c1d942.LJLJLJ).isEmpty() && !executorC20520rI.LIZ()) {
                                C0VW.LIZ().getClass();
                                InterfaceC03580Cc interfaceC03580Cc = c1d942.LJLL;
                                if (interfaceC03580Cc != null) {
                                    ((SystemAlarmService) interfaceC03580Cc).LIZ();
                                }
                            } else if (!((ArrayList) c1d942.LJLJLJ).isEmpty()) {
                                c1d942.LJI();
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ52;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ52) {
                            }
                        }
                    }

                    {
                        this.LJLIL = c1d9;
                    }
                };
            }
            c1d9.LJFF(runnable);
        }
    }

    public final void LIZ$8() {
        FutureTask<C0GQ<T>> futureTask;
        if (((C0GU) this.l0).LJFF != null) {
            if (!C03970Dp.LIZ && (futureTask = ((C0GU) this.l0).LJ) != 0 && futureTask.isCancelled()) {
                return;
            }
            C0GQ<T> c0gq = ((C0GU) this.l0).LJFF;
            Object obj = c0gq.LIZ;
            if (obj != null) {
                ((C0GU) this.l0).LJFF(obj);
                return;
            }
            C0GU c0gu = (C0GU) this.l0;
            Throwable th = c0gq.LIZIZ;
            synchronized (c0gu) {
                C0GU.LIZLLL(c0gu, th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$9() {
        C22810uz poll = ((C29921Fk) this.l0).LIZLLL.poll();
        if (poll != null) {
            C29921Fk c29921Fk = (C29921Fk) this.l0;
            String str = poll.LIZ;
            C22820v0 c22820v0 = poll.LIZIZ;
            IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000(poll, c29921Fk, 7);
            IDqS172S0200000 iDqS172S02000002 = new IDqS172S0200000(poll, c29921Fk, 8);
            if (c29921Fk.LJFF.get()) {
                iDqS172S02000002.invoke(new C22830v1(-5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
            }
            C0IT.LIZIZ(new C46701sQ(c29921Fk, str, c22820v0, iDqS172S0200000, iDqS172S02000002), new IDqS443S0100000(iDqS172S02000002, 4));
        }
    }

    public final Set<Integer> LIZIZ$6() {
        HashSet hashSet = new HashSet();
        Cursor LJIILIIL = ((C0BR) this.l0).LIZLLL.LJIILIIL(new C37581di("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (LJIILIIL.moveToNext()) {
            try {
                try {
                    hashSet.add(Integer.valueOf(LJIILIIL.getInt(0)));
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                LJIILIIL.close();
                throw th;
            }
        }
        LJIILIIL.close();
        if (!hashSet.isEmpty()) {
            ((C0BR) this.l0).LJI.LJIJJLI();
        }
        return hashSet;
    }

    public final void LIZ$14() {
        LiveEffect liveEffect;
        if (!C31691Mf.LJIIIZ()) {
            List<? extends LiveEffect> list = C31691Mf.LIZIZ;
            if (list != null) {
                Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_GOAL_EFFECT_POSITION.value");
                liveEffect = (LiveEffect) ListProtector.get(list, LIZJ.intValue());
            } else {
                liveEffect = null;
            }
            C31691Mf.LIZ(liveEffect);
        }
        C42681lw c42681lw = C31691Mf.LJI;
        String LJIILLIIL = OUP.LJIILLIIL((LiveGoalInfo) this.l0);
        if (LJIILLIIL == null) {
            LJIILLIIL = "";
        }
        c42681lw.setRenderCacheString("LiveGoal", LJIILLIIL);
    }

    public static final void run$0(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C005000g c005000g = (C005000g) iDRunnableS85S0100000.l0;
            if (c005000g.LJLJJLL == 0) {
                c005000g.LJLJL = true;
                ((C278117h) c005000g.LJLJI).LIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            try {
                super/*android.app.Activity*/.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        ActionMenuPresenter actionMenuPresenter;
        try {
            AnonymousClass191 anonymousClass191 = ((C011902x) iDRunnableS85S0100000.l0).LJLIL;
            if (anonymousClass191 != null && (actionMenuPresenter = anonymousClass191.LJZL) != null) {
                actionMenuPresenter.LJIILIIL();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$100(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        View findViewById;
        try {
            View view = ((GameDualDevicePositionPreviewFragment) iDRunnableS85S0100000.l0).getView();
            if (view != null && (findViewById = view.findViewById(R.id.lr2)) != null) {
                C26338AVi.LJI(findViewById, Integer.valueOf(C87277YNd.LJIIJJI(6)), Integer.valueOf(C87277YNd.LJIIJJI(42)), Integer.valueOf(C87277YNd.LJIIJJI(6)), Integer.valueOf(C87277YNd.LJIIJJI(33)), false, 16);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$101(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$23();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$102(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C25140yk.LIZIZ(((C23770wX) iDRunnableS85S0100000.l0).LIZ);
            C04740Go lottieDrawable = ((C23770wX) iDRunnableS85S0100000.l0).LIZ;
            o.LJIIJ(lottieDrawable, "lottieDrawable");
            C25150yl.LIZ.remove(Integer.valueOf(lottieDrawable.hashCode()));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$103(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        int LIZ2;
        ViewGroup.LayoutParams layoutParams;
        int LIZ3;
        ViewGroup.LayoutParams layoutParams2;
        try {
            C35641aa c35641aa = (C35641aa) iDRunnableS85S0100000.l0;
            if (c35641aa.LJLJJLL <= 0) {
                ImageView imageView = c35641aa.LJLJLJ;
                if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
                    LIZ3 = layoutParams2.width;
                } else {
                    LIZ3 = C15380j0.LIZ(24.0f);
                }
                c35641aa.LJLJJLL = LIZ3;
            }
            C35641aa c35641aa2 = (C35641aa) iDRunnableS85S0100000.l0;
            if (c35641aa2.LJLJL <= 0) {
                ImageView imageView2 = c35641aa2.LJLJLJ;
                if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
                    LIZ2 = layoutParams.height;
                } else {
                    LIZ2 = C15380j0.LIZ(24.0f);
                }
                c35641aa2.LJLJL = LIZ2;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$104(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C29701Eo c29701Eo = ((C35641aa) iDRunnableS85S0100000.l0).LJLL;
            if (c29701Eo != null) {
                c29701Eo.playAnimation();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$105(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C29701Eo c29701Eo = ((C35641aa) iDRunnableS85S0100000.l0).LJLLI;
            if (c29701Eo != null) {
                c29701Eo.playAnimation();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$106(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$24();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$107(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C29701Eo c29701Eo = ((GamePartnershipAudienceEntranceWidget) iDRunnableS85S0100000.l0).LJLIL;
            if (c29701Eo != null) {
                c29701Eo.playAnimation();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$108(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C29701Eo c29701Eo = ((GamePartnershipAudienceEntranceWidget) iDRunnableS85S0100000.l0).LJLILLLLZI;
            if (c29701Eo != null) {
                c29701Eo.playAnimation();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$109(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$25();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C03H) iDRunnableS85S0100000.l0).LIZJ(false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$110(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$26();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$111(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$27();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$112(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((n) iDRunnableS85S0100000.l0).LJ(null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$113(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            DownloadProgressDialog downloadProgressDialog = ((C36801cS) iDRunnableS85S0100000.l0).LIZJ;
            if (downloadProgressDialog != null) {
                downloadProgressDialog.dismiss();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$114(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C44151oJ) iDRunnableS85S0100000.l0).notifyDataSetChanged();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$115(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$28();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$116(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            try {
                ((Runnable) iDRunnableS85S0100000.l0).run();
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$117(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C45101pq c45101pq = ((C12U) iDRunnableS85S0100000.l0).LIZ.LIZ;
            C12U.LJIJJ(c45101pq.LJLJJL, c45101pq.LJLJJLL, 1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$118(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C12U c12u = (C12U) iDRunnableS85S0100000.l0;
            C45101pq c45101pq = c12u.LIZ.LIZ;
            c12u.LJJIIJ(c45101pq.LJLJJL, c45101pq.LJLJJLL, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$119(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$29();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C03H) iDRunnableS85S0100000.l0).LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$120(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((InterfaceC65784Pro) iDRunnableS85S0100000.l0).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$121(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C45101pq c45101pq = ((C12U) iDRunnableS85S0100000.l0).LJ.LIZ;
            C12U.LJIJJ(c45101pq.LJLJJL, c45101pq.LJLJJLL, 6);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$122(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C12U.LJIJJLI((C12U) iDRunnableS85S0100000.l0, null, 3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$123(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        int height;
        try {
            C12U c12u = (C12U) iDRunnableS85S0100000.l0;
            C2H2 c2h2 = c12u.LIZJ;
            if (c2h2 != null && 1 <= (height = c12u.LJIIJ.getHeight()) && height < c2h2.LJLJLJ) {
                c2h2.LJLLI = (c2h2.LJLJLJ - height) / 2;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$124(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$30();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$125(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$31();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$126(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((AnonymousClass143) iDRunnableS85S0100000.l0).LIZJ(true);
            ((AnonymousClass143) iDRunnableS85S0100000.l0).LIZIZ(true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$127(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((AnonymousClass143) iDRunnableS85S0100000.l0).LIZJ(false);
            ((AnonymousClass143) iDRunnableS85S0100000.l0).LIZIZ(false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$128(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C1G2 c1g2 = (C1G2) iDRunnableS85S0100000.l0;
            c1g2.setTranslationX(c1g2.LJLJI);
            C29306Beo.LJJLJLI((C1G2) iDRunnableS85S0100000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$129(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C270714l) iDRunnableS85S0100000.l0).LJIJ(0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        boolean z;
        int i;
        try {
            ((C45211q1) iDRunnableS85S0100000.l0).removeCallbacks(iDRunnableS85S0100000);
            MotionEvent motionEvent = ((C45211q1) iDRunnableS85S0100000.l0).LLJIJIL;
            if (motionEvent != null) {
                if (motionEvent.getToolType(0) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (!z) {
                    if (actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                } else {
                    i = 7;
                }
                C45211q1 c45211q1 = (C45211q1) iDRunnableS85S0100000.l0;
                c45211q1.LJJIJ(motionEvent, i, c45211q1.LLJILJIL, false);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$130(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ValueAnimator valueAnimator = ((MeasureLinearLayout) iDRunnableS85S0100000.l0).LJLJJLL;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$131(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$32();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$132(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C277116x) iDRunnableS85S0100000.l0).LIZJ.pv0(GuestCopyrightViolationEvent.class);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$133(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C277116x) iDRunnableS85S0100000.l0).LIZJ.qv0(CopyRightDialogShowOrDismissEvent.class, Boolean.TRUE);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((View) iDRunnableS85S0100000.l0).setNestedScrollingEnabled(true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            DialogFragment dialogFragment = (DialogFragment) iDRunnableS85S0100000.l0;
            dialogFragment.mOnDismissListener.onDismiss(dialogFragment.mDialog);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((Fragment) iDRunnableS85S0100000.l0).startPostponedEnterTransition();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((Fragment) iDRunnableS85S0100000.l0).callStartTransitionListener();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((FragmentManager) iDRunnableS85S0100000.l0).LJJIJIL(true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) iDRunnableS85S0100000.l0;
            if ((appCompatDelegateImpl.LLILLJJLI & 1) != 0) {
                appCompatDelegateImpl.LJJIZ(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = (AppCompatDelegateImpl) iDRunnableS85S0100000.l0;
            if ((appCompatDelegateImpl2.LLILLJJLI & 4096) != 0) {
                appCompatDelegateImpl2.LJJIZ(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = (AppCompatDelegateImpl) iDRunnableS85S0100000.l0;
            appCompatDelegateImpl3.LLILLIZIL = false;
            appCompatDelegateImpl3.LLILLJJLI = 0;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ListView listView = ((ListFragment) iDRunnableS85S0100000.l0).LJLJJL;
            listView.focusableViewAvailable(listView);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C026808q.LJIIIZ(4, (ArrayList) iDRunnableS85S0100000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        boolean z;
        try {
            if (((AnimationAnimationListenerC027708z) iDRunnableS85S0100000.l0).LIZIZ.getAnimatingAway() != null) {
                ((AnimationAnimationListenerC027708z) iDRunnableS85S0100000.l0).LIZIZ.setAnimatingAway(null);
                AnimationAnimationListenerC027708z animationAnimationListenerC027708z = (AnimationAnimationListenerC027708z) iDRunnableS85S0100000.l0;
                InterfaceC026608o interfaceC026608o = animationAnimationListenerC027708z.LIZJ;
                Fragment fragment = animationAnimationListenerC027708z.LIZIZ;
                C10610bJ c10610bJ = animationAnimationListenerC027708z.LIZLLL;
                C28771Az c28771Az = (C28771Az) interfaceC026608o;
                c28771Az.getClass();
                synchronized (c10610bJ) {
                    z = c10610bJ.LIZ;
                }
                if (!z) {
                    c28771Az.LIZ.LJJLJ(fragment, c10610bJ);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C09O c09o = (C09O) iDRunnableS85S0100000.l0;
            c09o.LJLJJLL.LJLJJI.remove(((C1BI) c09o.LJLJJI).LIZ());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            RecyclerView recyclerView = (RecyclerView) iDRunnableS85S0100000.l0;
            if (recyclerView.LL && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = (RecyclerView) iDRunnableS85S0100000.l0;
                if (!recyclerView2.LJZI) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.LLFF) {
                    recyclerView2.LLF = true;
                } else {
                    recyclerView2.LJIILLIIL();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            AbstractC030109x abstractC030109x = ((RecyclerView) iDRunnableS85S0100000.l0).LLIIL;
            if (abstractC030109x != null) {
                abstractC030109x.LJIIZILJ();
            }
            ((RecyclerView) iDRunnableS85S0100000.l0).LLJJIII = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((StaggeredGridLayoutManager) iDRunnableS85S0100000.l0).LLIIIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            boolean hasActiveObservers = ((RoomTrackingLiveData) iDRunnableS85S0100000.l0).hasActiveObservers();
            if (((RoomTrackingLiveData) iDRunnableS85S0100000.l0).mInvalid.compareAndSet(false, true) && hasActiveObservers) {
                ((RoomTrackingLiveData) iDRunnableS85S0100000.l0).getQueryExecutor().execute(((RoomTrackingLiveData) iDRunnableS85S0100000.l0).mRefreshRunnable);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((ViewPager) iDRunnableS85S0100000.l0).setScrollState(0);
            ((ViewPager) iDRunnableS85S0100000.l0).populate();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            FragmentStateAdapter fragmentStateAdapter = (FragmentStateAdapter) iDRunnableS85S0100000.l0;
            fragmentStateAdapter.LJLJLJ = false;
            fragmentStateAdapter.LJZI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            if (((CoroutineWorker) iDRunnableS85S0100000.l0).LJLJL.LJLIL instanceof C22560ua) {
                ((CoroutineWorker) iDRunnableS85S0100000.l0).LJLJJLL.LIZIZ(null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((Worker) iDRunnableS85S0100000.l0).LJLJJLL.LJIIIIZZ(((Worker) iDRunnableS85S0100000.l0).LJII());
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static final void run$36(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            if (((C29701Eo) iDRunnableS85S0100000.l0).isShown()) {
                C29701Eo c29701Eo = (C29701Eo) iDRunnableS85S0100000.l0;
                c29701Eo.forceMarkViewShown = true;
                if (c29701Eo.playAnimationWhenShown) {
                    c29701Eo.playAnimation();
                } else if (c29701Eo.wasAnimatingWhenNotShown) {
                    c29701Eo.resumeAnimation();
                }
                ((C29701Eo) iDRunnableS85S0100000.l0).forceMarkViewShown = false;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((LifecycleOwner) ((Activity) iDRunnableS85S0100000.l0)).getLifecycle().removeObserver(C20990s3.LIZ());
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void run$4(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        C281318n c281318n;
        try {
            C280418e c280418e = (C280418e) iDRunnableS85S0100000.l0;
            Menu LJIJ = c280418e.LJIJ();
            if (LJIJ instanceof C281318n) {
                c281318n = (C281318n) LJIJ;
                if (c281318n != null) {
                    c281318n.LJJI();
                }
            } else {
                c281318n = null;
            }
            try {
                LJIJ.clear();
                if (!c280418e.LIZIZ.onCreatePanelMenu(0, LJIJ) || !c280418e.LIZIZ.onPreparePanel(0, null, LJIJ)) {
                    LJIJ.clear();
                }
                if (c281318n != null) {
                    c281318n.LJJ();
                }
            } catch (Throwable th) {
                if (c281318n != null) {
                    c281318n.LJJ();
                }
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((InterfaceC65784Pro) iDRunnableS85S0100000.l0).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$41(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C22810uz) iDRunnableS85S0100000.l0).LIZJ.LJIILIIL(new C22830v1(-5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$42(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C22810uz) iDRunnableS85S0100000.l0).LIZJ.LJIILIIL(new C22830v1(-7, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$44(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((LiveEditText) ((C40891j3) iDRunnableS85S0100000.l0).LJFF(R.id.amo)).requestFocus();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$46(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            LiveEditText block_word_edit_text = (LiveEditText) ((C40891j3) iDRunnableS85S0100000.l0).LJFF(R.id.amo);
            o.LJIIIIZZ(block_word_edit_text, "block_word_edit_text");
            C29306Beo.LJJLIIIJL(block_word_edit_text);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$47(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        float f;
        try {
            C30061Fy c30061Fy = (C30061Fy) iDRunnableS85S0100000.l0;
            if (c30061Fy.LJLILLLLZI) {
                f = c30061Fy.LJLJI;
            } else {
                f = -c30061Fy.LJLJI;
            }
            c30061Fy.setTranslationX(f);
            ((C30061Fy) iDRunnableS85S0100000.l0).setClickable(true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$48(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$49(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((GameDualDeviceSourceFragment) iDRunnableS85S0100000.l0).vl();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C45161pw) iDRunnableS85S0100000.l0).LJIIJ();
            C45161pw c45161pw = (C45161pw) iDRunnableS85S0100000.l0;
            c45161pw.LLF = c45161pw.LJLJJI.animate().translationY(0.0f).setListener(((C45161pw) iDRunnableS85S0100000.l0).LLFF);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$50(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((GameDualDeviceSourceFragment) iDRunnableS85S0100000.l0).Dl();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$51(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$52(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C25270yx LJZ = ((GamePartnershipAudiencePromoteGameCardWidget) iDRunnableS85S0100000.l0).LJZ();
            if (LJZ != null) {
                GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget = (GamePartnershipAudiencePromoteGameCardWidget) iDRunnableS85S0100000.l0;
                C0NB.LIZIZ("PartnershipAudience", "onLoad preload playAnimation");
                gamePartnershipAudiencePromoteGameCardWidget.LLF(gamePartnershipAudiencePromoteGameCardWidget.LJZI(LJZ.LIZ, LJZ.LJFF));
                gamePartnershipAudiencePromoteGameCardWidget.LJZL(true, LJZ.LIZ, "rotate", LJZ.LJFF);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$53(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((InterfaceC65784Pro) iDRunnableS85S0100000.l0).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$54(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C1G2) iDRunnableS85S0100000.l0).LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$55(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((GameCastFragment) iDRunnableS85S0100000.l0).xl();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$57(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        int i;
        try {
            BaseSubShortCutPanelWidget baseSubShortCutPanelWidget = (BaseSubShortCutPanelWidget) iDRunnableS85S0100000.l0;
            DataChannel dataChannel = baseSubShortCutPanelWidget.dataChannel;
            if (dataChannel != null) {
                View view = baseSubShortCutPanelWidget.getView();
                if (view != null) {
                    i = view.getHeight();
                } else {
                    i = 0;
                }
                dataChannel.rv0(ShortCutPanelShowChannel.class, Integer.valueOf(i));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$58(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$59(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((PersistenceReporter) iDRunnableS85S0100000.l0).LJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C45161pw) iDRunnableS85S0100000.l0).LJIIJ();
            C45161pw c45161pw = (C45161pw) iDRunnableS85S0100000.l0;
            c45161pw.LLF = c45161pw.LJLJJI.animate().translationY(-((C45161pw) iDRunnableS85S0100000.l0).LJLJJI.getHeight()).setListener(((C45161pw) iDRunnableS85S0100000.l0).LLFF);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$60(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((KaraokeSearchSongListFragment) iDRunnableS85S0100000.l0).Dl().LJLI(0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$61(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$62(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((LiveGoalBackgroundDialogFragment) iDRunnableS85S0100000.l0).dismiss();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$63(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((LiveGoalBackgroundDialogFragment) iDRunnableS85S0100000.l0).dismiss();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$64(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            LiveNaviSkinToneContainerDialog liveNaviSkinToneContainerDialog = ((NaviAvatarListPresenter) iDRunnableS85S0100000.l0).LJLLLLLL;
            if (liveNaviSkinToneContainerDialog != null) {
                liveNaviSkinToneContainerDialog.dismiss();
            }
            ((NaviAvatarListPresenter) iDRunnableS85S0100000.l0).LJLZ = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$65(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$66(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$67(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$68(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C0M2) iDRunnableS85S0100000.l0).getClass();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$69(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C0M2) iDRunnableS85S0100000.l0).getClass();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            AnonymousClass194 anonymousClass194 = (AnonymousClass194) iDRunnableS85S0100000.l0;
            if (anonymousClass194.LJLJL) {
                ((InputMethodManager) C16880lQ.LLILL(anonymousClass194.getContext(), "input_method")).showSoftInput(anonymousClass194, 0);
                anonymousClass194.LJLJL = false;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$70(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C0N7.LJIIZILJ((LatestBanRecordInfo) iDRunnableS85S0100000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$71(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        int i;
        try {
            KaraokeViewModel karaokeViewModel = ((KaraokePageFragment) iDRunnableS85S0100000.l0).LJLJJLL;
            if (karaokeViewModel != null) {
                i = karaokeViewModel.LJLJLLL;
            } else {
                i = 1;
            }
            C0CM c0cm = ((KaraokePageFragment) iDRunnableS85S0100000.l0).LJLILLLLZI;
            if (c0cm != null) {
                c0cm.LIZLLL(i, false);
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$72(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            OcrActivity ocrActivity = (OcrActivity) iDRunnableS85S0100000.l0;
            C72868Sim c72868Sim = ocrActivity.LJZ;
            if (c72868Sim != null) {
                ocrActivity.LJLLJ = c72868Sim.getHeight();
            } else {
                o.LJIJI("mOcrTitleView");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$73(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C05900La c05900La = (C05900La) iDRunnableS85S0100000.l0;
            c05900La.LJLJJLL = true;
            c05900La.LIZLLL();
            ((CL0) ((C05900La) iDRunnableS85S0100000.l0).LIZ(R.id.cse)).setText(R.string.kzg);
            ((C05900La) iDRunnableS85S0100000.l0).LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$74(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C0PS c0ps = (C0PS) iDRunnableS85S0100000.l0;
            c0ps.LIZ.LJIILL(c0ps.LIZLLL, 0.0f, false, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$75(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(((C0PX) iDRunnableS85S0100000.l0).LIZ);
            if (LIZIZ != null && C29306Beo.LJJIII(LIZIZ)) {
                LIZIZ.finish();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$76(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C0PX) iDRunnableS85S0100000.l0).LJIJI.hide();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$77(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C0PX) iDRunnableS85S0100000.l0).LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$78(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        try {
            ((InterfaceC65784Pro) iDRunnableS85S0100000.l0).invoke();
        } catch (Throwable unused) {
        }
    }

    public static final void run$79(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            InterfaceC08210Tx listener = ((C05880Ky) iDRunnableS85S0100000.l0).getListener();
            if (listener != null) {
                listener.LIZIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((AnonymousClass195) iDRunnableS85S0100000.l0).LJIJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$80(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$81(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        try {
            throw ((Throwable) iDRunnableS85S0100000.l0);
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$82(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C32251Oj c32251Oj = (C32251Oj) iDRunnableS85S0100000.l0;
            C16880lQ.LJLLL(c32251Oj.LJIIIZ, c32251Oj.LIZ);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$83(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        C0WB c0wb;
        try {
            C08780Wc c08780Wc = ((C42681lw) iDRunnableS85S0100000.l0).LJ;
            if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
                c0wb.LJJIJLIJ(false);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$84(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        C0WB c0wb;
        try {
            C15610jN.LIZ().removeCallbacks(((C42681lw) iDRunnableS85S0100000.l0).LJIILLIIL);
            C08780Wc c08780Wc = ((C42681lw) iDRunnableS85S0100000.l0).LJ;
            if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
                c0wb.LJJIJLIJ(true);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$85(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C14520hc) iDRunnableS85S0100000.l0).LJI = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$86(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C29306Beo.LJJIJIIJIL((ImageView) iDRunnableS85S0100000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$87(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C14560hg c14560hg = (C14560hg) iDRunnableS85S0100000.l0;
            View view = c14560hg.LJ;
            if (view != null) {
                List<Rect> LIZ2 = c14560hg.LIZ(c14560hg.LJFF);
                if (view instanceof C54232Ax) {
                    ((C54232Ax) view).LIZ(LIZ2, c14560hg.LJI);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$88(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            AnimatedDrawable2 animatedDrawable2 = ((C15600jM) iDRunnableS85S0100000.l0).LJIIIZ;
            if (animatedDrawable2 != null) {
                animatedDrawable2.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$89(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            AnimatedDrawable2 animatedDrawable2 = ((C15600jM) iDRunnableS85S0100000.l0).LJIIIZ;
            if (animatedDrawable2 != null) {
                animatedDrawable2.start();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            AbstractC37571dh abstractC37571dh = ((AnonymousClass195) iDRunnableS85S0100000.l0).LLIIZ;
            if (abstractC37571dh instanceof ViewOnClickListenerC45171px) {
                abstractC37571dh.LIZJ(null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$90(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$19();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$91(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$20();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$92(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C43391n5 c43391n5 = (C43391n5) iDRunnableS85S0100000.l0;
            c43391n5.LIZIZ--;
            ((C43391n5) iDRunnableS85S0100000.l0).LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$93(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            InterfaceC88471Ynr<? super String, ? super Map<String, String>, C76800UCe> interfaceC88471Ynr = C19500pe.LIZJ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke("btm_page_show", (Map) iDRunnableS85S0100000.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$94(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            InterfaceC88471Ynr<? super String, ? super Map<String, String>, C76800UCe> interfaceC88471Ynr = C19500pe.LIZJ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke("activity", (HashMap) iDRunnableS85S0100000.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$95(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            InterfaceC88471Ynr<? super String, ? super Map<String, String>, C76800UCe> interfaceC88471Ynr = C19620pq.LIZ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke("btm_page_start", (Map) iDRunnableS85S0100000.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$96(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            C30868C9o.LJI(((C1X1) iDRunnableS85S0100000.l0).LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$97(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$21();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$98(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            iDRunnableS85S0100000.LIZ$22();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$99(IDRunnableS85S0100000 iDRunnableS85S0100000) {
        boolean LIZ;
        try {
            ((C21320sa) iDRunnableS85S0100000.l0).LIZ(true);
            ((C21320sa) iDRunnableS85S0100000.l0).invalidateSelf();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$56(IDRunnableS85S0100000 iDRunnableS85S0100000) {
    }

    public IDRunnableS85S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public IDRunnableS85S0100000(C44061oA c44061oA, long j, boolean z, int i) {
        this.$t = i;
        this.l0 = c44061oA;
    }
}
