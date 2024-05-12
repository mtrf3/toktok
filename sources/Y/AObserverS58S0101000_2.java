package Y;

import X.AbstractC45018Hle;
import X.AnonymousClass028;
import X.AnonymousClass636;
import X.AnonymousClass668;
import X.BO5;
import X.C0A2;
import X.C0JU;
import X.C110614Vt;
import X.C135005Ro;
import X.C140335f3;
import X.C140345f4;
import X.C15070iV;
import X.C161416Vd;
import X.C162626Zu;
import X.C164916db;
import X.C164996dj;
import X.C165016dl;
import X.C16880lQ;
import X.C169756lP;
import X.C169776lR;
import X.C169786lS;
import X.C169796lT;
import X.C169816lV;
import X.C169826lW;
import X.C169946li;
import X.C170006lo;
import X.C170036lr;
import X.C170046ls;
import X.C170056lt;
import X.C170346mM;
import X.C170576mj;
import X.C170596ml;
import X.C170606mm;
import X.C170696mv;
import X.C2068389v;
import X.C26338AVi;
import X.C31692CcC;
import X.C31735Cct;
import X.C36922EeM;
import X.C42303Gix;
import X.C43547H7f;
import X.C44236HXs;
import X.C44284HZo;
import X.C45848Hz2;
import X.C50240Jng;
import X.C53099Ksh;
import X.C5M2;
import X.C5MM;
import X.C5RT;
import X.C5RV;
import X.C63081OpJ;
import X.C74413TIj;
import X.C77413UZt;
import X.C78885Uxd;
import X.C78920UyC;
import X.C79004UzY;
import X.C81184Vtc;
import X.C86057Xq1;
import X.C8RO;
import X.EnumC42282Gic;
import X.EnumC42283Gid;
import X.EnumC42288Gii;
import X.EnumC74323TEx;
import X.GGO;
import X.H7R;
import X.InterfaceC133905Ni;
import X.InterfaceC15040iS;
import X.InterfaceC153045zY;
import X.InterfaceC170076lv;
import X.InterfaceC45540Hu4;
import X.InterfaceC45979I2t;
import X.LEJ;
import X.OSZ;
import X.ProgressDialogC43239Gy3;
import X.RunnableC169926lg;
import X.RunnableC51615KNn;
import X.SY9;
import X.ViewOnTouchListenerC141755hL;
import X.ViewOnTouchListenerC82857WfV;
import X.X1D;
import Y.ARunnableS14S0101000_10;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AObserverS58S0101000_2 implements Observer {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            case 23:
                onChanged$23(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                DataChannel dataChannel = ((LiveWidget) ((LifecycleOwner) aObserverS58S0101000_2.l0)).dataChannel;
                if (dataChannel != null) {
                    dataChannel.rv0(EcLiveBarrageEnable.class, obj);
                    return;
                }
                return;
            default:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) ((LifecycleOwner) aObserverS58S0101000_2.l0);
                videoEditContainerScene.LJZL.clickGoNextBtnTime = System.currentTimeMillis();
                videoEditContainerScene.LJLJJL();
                ((AbstractC45018Hle) videoEditContainerScene.LLIIL.gv0(videoEditContainerScene.LJZL)).Y7();
                videoEditContainerScene.LLFII = true;
                videoEditContainerScene.LLIILII.LLJJIJI(new RunnableC51615KNn(5, videoEditContainerScene), true);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        M m;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                C5RV c5rv = (C5RV) obj;
                if (c5rv == null) {
                    c169776lR.getClass();
                    return;
                }
                if (c169776lR.LIZ.editMusicSyncMode) {
                    c169776lR.LJJIIJZLJL.removeAllVideoSound();
                }
                EffectPointModel effectPointModel = c169776lR.LJJJIL;
                if (effectPointModel == null) {
                    return;
                }
                effectPointModel.setUuid(c5rv.LJLJJI);
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aObserverS58S0101000_2.l0;
                C74413TIj c74413TIj = (C74413TIj) obj;
                if (c74413TIj == null) {
                    C77413UZt.LJIL(videoRecordNewScene.LJLZ.shootWay);
                    return;
                }
                videoRecordNewScene.getClass();
                if (c74413TIj.LIZIZ != EnumC74323TEx.SUCCESS || (m = c74413TIj.LIZ) == 0) {
                    C77413UZt.LJIL(videoRecordNewScene.LJLZ.shootWay);
                    return;
                }
                boolean booleanValue = ((Boolean) ((OSZ) m).getFirst()).booleanValue();
                int intValue = ((Integer) ((OSZ) c74413TIj.LIZ).getSecond()).intValue();
                if (booleanValue) {
                    if (videoRecordNewScene.LLIIIILZ == null) {
                        return;
                    }
                    ((InterfaceC45979I2t) videoRecordNewScene.LLLLIIIILLL(InterfaceC45979I2t.class)).setLiveTagState(intValue);
                    return;
                }
                C77413UZt.LJIL(videoRecordNewScene.LJLZ.shootWay);
                return;
        }
    }

    public static final void onChanged$10(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        String str;
        Effect effect;
        int i = 4;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                FrameLayout frameLayout = ((C169776lR) aObserverS58S0101000_2.l0).LJIIL;
                if (!((Boolean) obj).booleanValue()) {
                    i = 0;
                }
                frameLayout.setVisibility(i);
                return;
            case 1:
                final C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                final C5RT c5rt = (C5RT) obj;
                c169786lS.getClass();
                if (c5rt == null) {
                    return;
                }
                final long j = c5rt.LIZJ;
                int i2 = c5rt.LJI;
                if (i2 == 0) {
                    try {
                        String[] strArr = c5rt.LIZIZ;
                        if (strArr != null && strArr.length > 0) {
                            str = strArr[0];
                        } else {
                            str = "";
                        }
                        c169786lS.LJIIIIZZ.LIZ(c5rt.LJIIIIZZ, str, c5rt.LJ, c5rt.LJIILLIIL, c5rt.LJIILIIL, c5rt.LJII);
                        return;
                    } catch (NullPointerException e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(e.getMessage());
                        LIZ.append(" ");
                        LIZ.append(c5rt.toString());
                        throw new NullPointerException(X1D.LIZIZ(LIZ));
                    }
                }
                if (i2 == 5) {
                    c169786lS.LJIJ(C169816lV.LJI(c5rt.LJ, c5rt.LJFF), true, true);
                    return;
                }
                if (i2 == 7) {
                    c169786lS.LJIL.LJJIIZ(false, true, null);
                    return;
                }
                if (i2 == 8) {
                    c169786lS.LJIIIIZZ.setVisibility(8);
                    if (c169786lS.LJJJJZ) {
                        c169786lS.LJIL.LJJIIJZLJL(true);
                    } else {
                        c169786lS.LJIL.setVisibility(0);
                    }
                    int i3 = (int) c5rt.LJ;
                    int i4 = (int) c5rt.LJFF;
                    if (i3 >= 0 && i4 >= 0 && !c169786lS.LJIL.LJJIJLIJ(i3, i4, false)) {
                        c169786lS.LJIL.postDelayed(new ARunnableS0S0102000_2(c169786lS, i3, i4, 1), 300L);
                    }
                    c169786lS.LJIL.LJJIIZ(false, true, new InterfaceC15040iS() { // from class: X.6lk
                        @Override // X.InterfaceC15040iS
                        public final void accept(Object obj2) {
                            String str2;
                            C169786lS c169786lS2 = C169786lS.this;
                            C5RT c5rt2 = c5rt;
                            long j2 = j;
                            c169786lS2.getClass();
                            String[] strArr2 = c5rt2.LIZIZ;
                            if (strArr2 != null && strArr2.length > 0) {
                                str2 = strArr2[0];
                            } else {
                                str2 = "";
                            }
                            c169786lS2.LJIIIIZZ.LIZ(c5rt2.LJIIIIZZ, str2, j2, c5rt2.LJIILLIIL, c5rt2.LJIILIIL, c5rt2.LJII);
                            c169786lS2.LJIL.LJJIIZ(true, true, null);
                        }
                    });
                    return;
                }
                ArrayList<EffectPointModel> effectPointModels = c169786lS.LJIIIIZZ.getEffectPointModels();
                int i5 = c5rt.LJI;
                if (i5 == 1) {
                    if (effectPointModels.isEmpty()) {
                        return;
                    }
                    EffectPointModel effectPointModel = (EffectPointModel) AnonymousClass028.LIZIZ(effectPointModels, 1, effectPointModels);
                    C169796lT c169796lT = c169786lS.LJIIIIZZ;
                    String uuid = effectPointModel.getUuid();
                    long j2 = c5rt.LJFF;
                    EffectPointModel LIZJ = c169796lT.LIZJ(uuid);
                    if (LIZJ == null) {
                        return;
                    }
                    LIZJ.setUiEndPoint((int) j2);
                    c169796lT.LJLIL.postInvalidate();
                    return;
                }
                if (i5 == 2) {
                    c169786lS.LJIILJJIL(c5rt.LIZIZ[0]);
                    return;
                }
                if (i5 == 3) {
                    MutableLiveData<C5MM> mutableLiveData = c169786lS.LIZLLL;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(C5MM.LIZLLL(0L));
                    }
                    c169786lS.LJJ((int) c169786lS.LJJII.LIZ(0L), false);
                    c169786lS.LJIIIIZZ.LJLJJLL.clear();
                    return;
                }
                if (i5 != 4 || c169786lS.LJJJIL == null) {
                    return;
                }
                for (int length = c5rt.LIZIZ.length - 1; length >= 0; length--) {
                    c169786lS.LJIILJJIL(c5rt.LIZIZ[length]);
                }
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aObserverS58S0101000_2.l0;
                C44236HXs c44236HXs = (C44236HXs) obj;
                videoRecordNewScene.getClass();
                if (c44236HXs == null || (effect = c44236HXs.LJLIL) == null || effect.isDownloaded()) {
                    return;
                }
                videoRecordNewScene.LLLLL(Boolean.TRUE);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$11(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        int i;
        C5RT c5rt;
        long LLIZLLLIL;
        C5RT LIZ;
        int i2 = 4;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                C170056lt c170056lt = (C170056lt) obj;
                TuxIconView tuxIconView = c169776lR.LJIILJJIL;
                if (c170056lt.LJLIL) {
                    i2 = 0;
                }
                tuxIconView.setVisibility(i2);
                if (c170056lt.LJLIL) {
                    TuxIconView tuxIconView2 = c169776lR.LJIILJJIL;
                    C169756lP c169756lP = c169776lR.LJJLJLI;
                    Context context = tuxIconView2.getContext();
                    boolean z = c170056lt.LJLILLLLZI;
                    c169756lP.getClass();
                    o.LJIIIZ(context, "context");
                    int LIZ2 = (int) C170576mj.LIZ(context, 16.0f);
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_arrow_turn_left;
                    if (z) {
                        i = R.attr.dj;
                    } else {
                        i = R.attr.dm;
                    }
                    c2068389v.LJ = Integer.valueOf(i);
                    c2068389v.LIZIZ = LIZ2;
                    c2068389v.LIZJ = LIZ2;
                    c2068389v.LJFF = false;
                    SY9 LIZ3 = c2068389v.LIZ(context);
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
                    c110614Vt.LIZJ = Float.valueOf(C170576mj.LIZ(context, 12.0f));
                    c110614Vt.LJII = (int) C170576mj.LIZ(context, 44.0f);
                    c110614Vt.LJI = (int) C170576mj.LIZ(context, 40.0f);
                    tuxIconView2.setImageDrawable(C26338AVi.LJIIJ(LIZ3, c110614Vt.LIZ(context)));
                    c169776lR.LJIILJJIL.setEnabled(c170056lt.LJLILLLLZI);
                    return;
                }
                return;
            default:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                VEEffectSelectOp vEEffectSelectOp = (VEEffectSelectOp) obj;
                c169786lS.getClass();
                if (vEEffectSelectOp == null) {
                    return;
                }
                int i3 = vEEffectSelectOp.mType;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                return;
                            }
                            EffectModel effectModel = vEEffectSelectOp.mEffectModel;
                            EffectPointModel effectPointModel = vEEffectSelectOp.mPreviousModel;
                            c169786lS.LIZLLL.setValue(C5MM.LIZLLL(0L));
                            VideoEditViewModel videoEditViewModel = c169786lS.LJIL.getVideoEditViewModel();
                            if (videoEditViewModel != null && !C79004UzY.LJJIFFI(videoEditViewModel.ov0()) && videoEditViewModel.ov0().size() == 1) {
                                LLIZLLLIL = ((VideoSegment) ListProtector.get(videoEditViewModel.ov0(), 0)).duration;
                            } else {
                                LLIZLLLIL = c169786lS.LJJIFFI.LLIZLLLIL();
                            }
                            long LIZ4 = c169786lS.LJJII.LIZ(LLIZLLLIL);
                            if (effectPointModel == null) {
                                String str = effectModel.resDir;
                                LIZ = new C5RT();
                                LIZ.LJI = 5;
                                LIZ.LJIIJJI = str;
                                LIZ.LIZJ = 0L;
                                LIZ.LIZLLL = LIZ4;
                            } else {
                                LIZ = C5RT.LIZ(effectPointModel.getIndex(), 0L, LIZ4, effectModel.resDir, effectPointModel.getUuid());
                            }
                            LIZ.LJ = 0L;
                            LIZ.LJFF = LLIZLLLIL;
                            LIZ.LJIIIIZZ = effectModel.color;
                            LIZ.LJIIL = effectModel.key;
                            LIZ.LJIILJJIL = effectModel.name;
                            LIZ.LJII = c169786lS.LJJII.LIZ;
                            LIZ.LJIILLIIL = effectModel.category;
                            LIZ.LJIIZILJ = effectModel.extra;
                            c169786lS.LIZJ.setValue(LIZ);
                            c169786lS.LJIIJJI();
                            return;
                        }
                        int i4 = vEEffectSelectOp.action;
                        EffectModel effectModel2 = vEEffectSelectOp.mEffectModel;
                        if (i4 == 0) {
                            if (c169786lS.LJJIFFI == null) {
                                C0JU.LIZLLL("VEEffectHelper selectFilterEffect mVEEditor is null");
                                return;
                            }
                            if (c169786lS.LJJII.LIZLLL()) {
                                return;
                            }
                            C5RT LIZIZ = C5RT.LIZIZ(c169786lS.LJJII.LIZIZ(), effectModel2.resDir);
                            LIZIZ.LJ = c169786lS.LJJII.LIZJ();
                            LIZIZ.LJIIIIZZ = effectModel2.color;
                            LIZIZ.LJIIL = effectModel2.key;
                            LIZIZ.LJIILJJIL = effectModel2.name;
                            LIZIZ.LJII = c169786lS.LJJII.LIZ;
                            LIZIZ.LJIILLIIL = effectModel2.category;
                            LIZIZ.LJIIZILJ = effectModel2.extra;
                            c169786lS.LIZJ.setValue(LIZIZ);
                            c169786lS.LJIIJJI();
                            return;
                        }
                        if (i4 != 1 || (c5rt = (C5RT) c169786lS.LIZJ.getValue()) == null || c5rt.LJI != 0) {
                            return;
                        }
                        C5RT LIZJ = C5RT.LIZJ(c169786lS.LJJII.LIZIZ());
                        LIZJ.LJFF = c169786lS.LJJII.LIZJ();
                        LIZJ.LJII = c169786lS.LJJII.LIZ;
                        c169786lS.LIZJ.setValue(LIZJ);
                        c169786lS.LJIIJ();
                        return;
                    }
                    EffectModel effectModel3 = vEEffectSelectOp.mEffectModel;
                    if (c169786lS.LJJII.LIZLLL()) {
                        return;
                    }
                    C5RT LIZIZ2 = C5RT.LIZIZ(c169786lS.LJJII.LIZIZ(), effectModel3.resDir);
                    LIZIZ2.LJ = c169786lS.LJJII.LIZJ();
                    LIZIZ2.LJIIIIZZ = effectModel3.color;
                    LIZIZ2.LJIIL = effectModel3.key;
                    LIZIZ2.LJIILJJIL = effectModel3.name;
                    LIZIZ2.LJII = c169786lS.LJJII.LIZ;
                    LIZIZ2.LJIILLIIL = effectModel3.category;
                    LIZIZ2.LJIILL = effectModel3.duration;
                    LIZIZ2.LJIIZILJ = effectModel3.extra;
                    c169786lS.LIZJ.setValue(LIZIZ2);
                    c169786lS.LJIIJJI();
                    long j = LIZIZ2.LJ + effectModel3.duration;
                    C5RT LIZJ2 = C5RT.LIZJ(c169786lS.LJJIFFI.LLFZ((int) j));
                    LIZJ2.LJFF = j;
                    LIZJ2.LJII = c169786lS.LJJII.LIZ;
                    c169786lS.LIZJ.setValue(LIZJ2);
                    return;
                }
                c169786lS.LJIIZILJ(vEEffectSelectOp.mTimePosition, false);
                return;
        }
    }

    public static final void onChanged$12(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        EffectCategoryResponse effectCategoryResponse;
        List<EffectPointModel> list;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                C5M2 c5m2 = (C5M2) obj;
                c169776lR.getClass();
                if (c5m2.LIZ < 0 || (effectCategoryResponse = c5m2.LIZIZ) == null) {
                    return;
                }
                c169776lR.LJJJJJ = effectCategoryResponse.getKey();
                String key = c5m2.LIZIZ.getKey();
                boolean LIZJ = C164996dj.LIZJ(key);
                c169776lR.LJIIJJI();
                C135005Ro.LIZLLL(c5m2.LIZIZ.getTotalEffects().size(), c169776lR.LIZ, c169776lR.LJJJJJ, c169776lR.LJJLIIIJJIZ, c169776lR.LJJLIIIIJ);
                if (c169776lR.LJJJI != null && !LIZJ) {
                    list = c5m2.LIZJ;
                    if (list == null) {
                        list = c169776lR.LJJLJLI.LIZ(key);
                    }
                } else {
                    list = null;
                }
                c169776lR.LJJLJLI.LIZJ(key, list);
                if (C164996dj.LIZJ(key)) {
                    c169776lR.LJIILIIL();
                    c169776lR.LJIJ();
                    return;
                } else {
                    if (list != null) {
                        c169776lR.LJIIIZ.LJI(list, c169776lR.LJJIIZ.LIZ);
                    }
                    c169776lR.LJIIIZ.LJIIIIZZ(false);
                    c169776lR.LJIJJLI(null, false, false);
                    return;
                }
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aObserverS58S0101000_2.l0;
                videoRecordNewScene.getClass();
                if (((Boolean) obj).booleanValue()) {
                    videoRecordNewScene.LLLLLILLIL(true, videoRecordNewScene.getString(R.string.r74), EnumC42288Gii.VISIBLE_AFTER_5S);
                    return;
                }
                ProgressDialogC43239Gy3 progressDialogC43239Gy3 = videoRecordNewScene.LLFF;
                if (progressDialogC43239Gy3 == null || !progressDialogC43239Gy3.isShowing()) {
                    return;
                }
                videoRecordNewScene.LLFF.dismiss();
                videoRecordNewScene.LLFF = null;
                C42303Gix.LIZ(1403, GGO.DISMISS, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$13(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        Effect effect;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                Boolean bool = (Boolean) obj;
                C170046ls c170046ls = c169776lR.LJJIIZ;
                if (c170046ls != null && bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    c170046ls.LIZ = booleanValue;
                    c170046ls.LIZIZ.LJJIIJZLJL.LLLIIIL(booleanValue);
                    C169776lR c169776lR2 = c170046ls.LIZIZ;
                    c169776lR2.LJJJLL.LJII(VEVolumeChangeOp.ofVoice(c169776lR2.LIZ.voiceVolume));
                    c169776lR.LJJJJIZL.LIZ(c169776lR.LIZJ(), c169776lR.LJFF());
                    c169776lR.LJJJLL.LJ();
                    return;
                }
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aObserverS58S0101000_2.l0;
                com.ss.ugc.effectplatform.model.Effect effect2 = (com.ss.ugc.effectplatform.model.Effect) obj;
                C44236HXs c44236HXs = (C44236HXs) videoRecordNewScene.LLLL().LLLLL().LJIIIIZZ().LJII().getValue();
                if (c44236HXs == null || (effect = c44236HXs.LJLIL) == null || effect != effect2) {
                    return;
                }
                if (effect2.isDownloaded()) {
                    videoRecordNewScene.LLLLL(Boolean.FALSE);
                    return;
                } else {
                    videoRecordNewScene.LLLLL(Boolean.TRUE);
                    return;
                }
        }
    }

    public static final void onChanged$14(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                ((BaseListFragmentPanel) ((LifecycleOwner) aObserverS58S0101000_2.l0)).lambda$observerEarPhoneUnplug$1((String) obj);
                return;
            default:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) ((LifecycleOwner) aObserverS58S0101000_2.l0);
                videoEditContainerScene.LLILLIZIL = (View) obj;
                videoEditContainerScene.LLLFFI();
                return;
        }
    }

    public static final void onChanged$15(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                DataChannel dataChannel = ((C31692CcC) aObserverS58S0101000_2.l0).LJLLLL;
                if (dataChannel != null) {
                    dataChannel.rv0(EcLiveBarrageEnable.class, obj);
                    return;
                }
                return;
            case 1:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                if (!c169776lR.LJJIL) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = c169776lR.LJJII.getPlayBoundary();
                Long l = playBoundary.LIZ;
                Long l2 = playBoundary.LIZIZ;
                if (l == null || l2 == null) {
                    return;
                }
                c169776lR.LJJII(l.intValue(), l2.intValue(), false);
                return;
            case 2:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                Boolean bool = (Boolean) obj;
                if (c169786lS.LJJIJIIJIL && bool != null && bool.booleanValue()) {
                    c169786lS.LJIIJ();
                    return;
                }
                return;
            case 3:
                Activity this$0 = (Activity) aObserverS58S0101000_2.l0;
                Boolean it = (Boolean) obj;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIIZZ(it, "it");
                if (it.booleanValue()) {
                    this$0.finish();
                    return;
                }
                return;
            default:
                ((ProfilePageFragment) aObserverS58S0101000_2.l0).LJLLJ = (String) obj;
                return;
        }
    }

    public static final void onChanged$16(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        PNSAgeGateBaseFragment LLFII;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                if (!c169786lS.LJJIJIIJIL) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = c169786lS.LJIL.getPlayBoundary();
                Long l = playBoundary.LIZ;
                Long l2 = playBoundary.LIZIZ;
                if (l == null || l2 == null) {
                    return;
                }
                c169786lS.LIZLLL.setValue(C5MM.LIZLLL(c169786lS.LJJII.LIZ(l.intValue())));
                c169786lS.LJJI(l.intValue(), l2.intValue());
                return;
            case 1:
                C31735Cct.LJ((C31735Cct) aObserverS58S0101000_2.l0, (Boolean) obj);
                return;
            case 2:
                PNSAgeGateActivity this$0 = (PNSAgeGateActivity) aObserverS58S0101000_2.l0;
                Boolean it = (Boolean) obj;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIIZZ(it, "it");
                if (!it.booleanValue() || (LLFII = this$0.LLFII()) == null) {
                    return;
                }
                LLFII.Gl();
                return;
            default:
                Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) aObserverS58S0101000_2.l0;
                ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = video2GifCutFragment.LJLJJI;
                if (viewOnTouchListenerC82857WfV != null && viewOnTouchListenerC82857WfV.getPlayBoundary() != null && video2GifCutFragment.LJLJJI.getPlayBoundary().LIZIZ != null) {
                    long longValue = video2GifCutFragment.LJLJJI.getPlayBoundary().LIZIZ.longValue();
                    C169946li c169946li = (C169946li) video2GifCutFragment.LJLJL.LJLILLLLZI;
                    c169946li.LIZ(c169946li.LIZIZ, longValue);
                    video2GifCutFragment.wl();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.5Ni, X.6ll] */
    public static final void onChanged$17(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL;
        M m;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                final C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                Boolean bool = (Boolean) obj;
                c169786lS.getClass();
                if (bool == null) {
                    return;
                }
                final boolean booleanValue = bool.booleanValue();
                c169786lS.LJJIJIIJIL = booleanValue;
                if (!booleanValue) {
                    c169786lS.LJIIZILJ.setVisibility(8);
                    c169786lS.LJIJ.setVisibility(8);
                }
                C170696mv.LIZJ(c169786lS.LJIIJ, booleanValue, c169786lS.LJ(), c169786lS.LJJIJ, new InterfaceC15040iS() { // from class: X.6ly
                    @Override // X.InterfaceC15040iS
                    public final void accept(Object obj2) {
                        C169786lS c169786lS2 = C169786lS.this;
                        if (booleanValue) {
                            c169786lS2.LJIIZILJ.setVisibility(0);
                            c169786lS2.LJIJ.setVisibility(0);
                        } else {
                            c169786lS2.getClass();
                        }
                    }
                });
                if (booleanValue) {
                    InterfaceC45540Hu4 interfaceC45540Hu4 = c169786lS.LJJJLL;
                    if (interfaceC45540Hu4 != null) {
                        interfaceC45540Hu4.registerActivityOnKeyDownListener(c169786lS.LJJJLZIJ);
                    }
                    if (c169786lS.LJIIIIZZ != null) {
                        c169786lS.LIZLLL.setValue(C5MM.LIZLLL(0L));
                        c169786lS.LJJ(0, false);
                        C170696mv.LIZ(c169786lS.LJIIJJI, true);
                        ImageView imageView = c169786lS.LJIIJJI;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                    }
                    c169786lS.LJIILLIIL();
                    if (c169786lS.LJJIIJ == null) {
                        ?? r1 = new InterfaceC133905Ni() { // from class: X.6ll
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC133905Ni
                            public final void LIZ(int i, int i2, float f, String str) {
                                C169786lS c169786lS2 = C169786lS.this;
                                if (i == 4098) {
                                    C5RT c5rt = (C5RT) c169786lS2.LIZJ.getValue();
                                    if (c169786lS2.LJJIJIIJIL) {
                                        if (c5rt == null || c5rt.LJI != 0) {
                                            c169786lS2.LJI.post(new IDRunnableS6S0101000(5, c169786lS2, 3));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                c169786lS2.getClass();
                            }
                        };
                        c169786lS.LJJIIJ = r1;
                        c169786lS.LJJIFFI.LLIIJLIL(r1);
                    }
                } else {
                    InterfaceC45540Hu4 interfaceC45540Hu42 = c169786lS.LJJJLL;
                    if (interfaceC45540Hu42 != null) {
                        interfaceC45540Hu42.unRegisterActivityOnKeyDownListener(c169786lS.LJJJLZIJ);
                    }
                }
                if (bool.booleanValue()) {
                    c169786lS.LJJJJL.LIZJ().setValue(C140335f3.LIZ(C78885Uxd.LIZIZ(true, false, false, false), C81184Vtc.LJFF(c169786lS.LJJIJIL) + c169786lS.LJFF(), c169786lS.LJ(), c169786lS.LJI(), AnonymousClass668.LIZIZ().LIZ()));
                    c169786lS.LJIL.LJJIJL();
                } else {
                    MutableLiveData<C140335f3> LIZJ = c169786lS.LJJJJL.LIZJ();
                    int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, c169786lS.LJJIJIL);
                    int LJFF = C81184Vtc.LJFF(c169786lS.LJJIJIL) + c169786lS.LJFF();
                    int LJ = c169786lS.LJ();
                    int LJI = c169786lS.LJI();
                    AnonymousClass668.LIZIZ().LIZ();
                    LIZJ.setValue(C140345f4.LIZ(LJIIIIZZ, LJFF, LJ, LJI));
                }
                if (!bool.booleanValue()) {
                    return;
                }
                if (c169786lS.LJJ != null && ((H7R.LJJJ(c169786lS.LIZ) && c169786lS.LJJJJZI) || c169786lS.LJJJLIIL)) {
                    c169786lS.LJJJLIIL = false;
                    ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = c169786lS.LJIL;
                    viewOnTouchListenerC82857WfV.LIZ(viewOnTouchListenerC82857WfV.getSlideX(), C43547H7f.LIZ(c169786lS.LIZ.getMediaModelList(), true, null, 12));
                    if (C169816lV.LIZJ(c169786lS.LJIJI, c169786lS.LJJIJIIJI, c169786lS.LJIL())) {
                        c169786lS.LJIILL();
                    }
                }
                if (!H7R.LJJJ(c169786lS.LIZ) || !c169786lS.LJJJJZI) {
                    return;
                }
                c169786lS.LJJJJZI = false;
                if (c169786lS.LJJIII == null) {
                    return;
                }
                if (!c169786lS.LJJJJZ && ((viewOnTouchListenerC141755hL = c169786lS.LJIJJLI) == null || viewOnTouchListenerC141755hL.getAdapter() == null)) {
                    return;
                }
                c169786lS.LJJ(0, false);
                int LLIZLLLIL = c169786lS.LJJIFFI.LLIZLLLIL();
                c169786lS.LJIIIIZZ.setVideoDuration(LLIZLLLIL);
                c169786lS.LJIL.LJJI(LLIZLLLIL);
                c169786lS.LJJIZ.LIZIZ(LLIZLLLIL);
                c169786lS.LJJIII.LIZIZ();
                ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL2 = c169786lS.LJIJJLI;
                if (viewOnTouchListenerC141755hL2 == null || !(viewOnTouchListenerC141755hL2.getAdapter() instanceof C162626Zu)) {
                    return;
                }
                ((C162626Zu) c169786lS.LJIJJLI.getAdapter()).LJLLLLLL();
                return;
            case 1:
                SearchContainerFragment.xl((SearchContainerFragment) aObserverS58S0101000_2.l0, (C50240Jng) obj);
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aObserverS58S0101000_2.l0;
                C74413TIj c74413TIj = (C74413TIj) obj;
                videoRecordNewScene.getClass();
                if (c74413TIj == null || c74413TIj.LIZIZ != EnumC74323TEx.SUCCESS || (m = c74413TIj.LIZ) == 0) {
                    return;
                }
                int intValue = ((Integer) ((OSZ) m).getSecond()).intValue();
                C45848Hz2 c45848Hz2 = videoRecordNewScene.LLIIIILZ;
                if (c45848Hz2 == null || c45848Hz2.getDiContainer().LJIIIIZZ(null, InterfaceC170076lv.class) == null) {
                    return;
                }
                ((InterfaceC170076lv) videoRecordNewScene.LLIIIILZ.getDiContainer().LJIIIIZZ(null, InterfaceC170076lv.class)).KP(C44284HZo.LIZJ.LIZIZ, intValue);
                return;
        }
    }

    public static final void onChanged$18(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                CommentListFragment.vl((CommentListFragment) aObserverS58S0101000_2.l0, (Integer) obj);
                return;
            default:
                ((C161416Vd) aObserverS58S0101000_2.l0).LJ();
                return;
        }
    }

    public static final void onChanged$19(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                BO5 bo5 = (BO5) aObserverS58S0101000_2.l0;
                Integer num = (Integer) obj;
                if (num != null) {
                    RecyclerView recyclerView = bo5.LIZIZ;
                    if (recyclerView == null) {
                        return;
                    }
                    C0A2 layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) layoutManager).LJFF(0, 0);
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        StaggeredGridLayoutManager.SavedState savedState = staggeredGridLayoutManager.LLIIIJ;
                        if (savedState != null) {
                            savedState.LJLJJI = null;
                            savedState.LJLJI = 0;
                            savedState.LJLIL = -1;
                            savedState.LJLILLLLZI = -1;
                        }
                        staggeredGridLayoutManager.LLFZ = 0;
                        staggeredGridLayoutManager.LLI = 0;
                        staggeredGridLayoutManager.LJZ();
                    }
                    bo5.LIZJ.getClass();
                    bo5.LIZIZ.LJLI(num.intValue());
                    return;
                }
                bo5.getClass();
                return;
            case 1:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                Boolean bool = (Boolean) obj;
                C170036lr c170036lr = c169786lS.LJJII;
                if (c170036lr != null && bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    c170036lr.LIZ = booleanValue;
                    c170036lr.LIZIZ.LJJIFFI.LLLIIIL(booleanValue);
                    VideoPublishEditModel videoPublishEditModel = c170036lr.LIZIZ.LIZ;
                    if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
                        C169786lS c169786lS2 = c170036lr.LIZIZ;
                        c169786lS2.LJJJJL.LJII(VEVolumeChangeOp.ofVoice(c169786lS2.LIZ.voiceVolume));
                    }
                    c169786lS.LJJIZ.LIZ(c169786lS.LJJIFFI.getDuration(), c169786lS.LJJIFFI.LLIZLLLIL());
                    c169786lS.LJJJJL.LJ();
                    return;
                }
                return;
            default:
                SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObserverS58S0101000_2.l0;
                searchContainerFragment.getClass();
                searchContainerFragment.LJZI = TextUtils.equals("dark", (String) obj);
                searchContainerFragment.Gl();
                searchContainerFragment.LJLLI.setTuxIcon(searchContainerFragment.wl());
                return;
        }
    }

    public static final void onChanged$2(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        MediaPlayerModule mediaPlayerModule;
        ImageView imageView;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                C170596ml c170596ml = (C170596ml) obj;
                c169776lR.getClass();
                if (c170596ml == null || c170596ml.LIZ != 0 || TextUtils.isEmpty(c170596ml.LIZIZ)) {
                    return;
                }
                long j = c170596ml.LIZJ;
                if (j <= 0) {
                    return;
                }
                CharSequence charSequence = c170596ml.LIZIZ;
                RelativeLayout relativeLayout = c169776lR.LJIILLIIL;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                    c169776lR.LJIILLIIL.postDelayed(new ARunnableS12S0101000_8(0, c169776lR, 9), j);
                }
                TextView textView = c169776lR.LJIIZILJ;
                if (textView == null) {
                    return;
                }
                textView.setText(charSequence);
                return;
            default:
                Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) aObserverS58S0101000_2.l0;
                C170606mm c170606mm = (C170606mm) obj;
                video2GifCutFragment.getClass();
                if (c170606mm == null) {
                    return;
                }
                switch (c170606mm.LIZIZ) {
                    case 1:
                        if (!c170606mm.LIZ) {
                            video2GifCutFragment.vl();
                            return;
                        }
                        VideoShare2GifEditContext videoShare2GifEditContext = video2GifCutFragment.LJLL;
                        if (videoShare2GifEditContext == null || (mediaPlayerModule = video2GifCutFragment.LJLJL) == null) {
                            return;
                        }
                        C169946li c169946li = (C169946li) mediaPlayerModule.LJLILLLLZI;
                        videoShare2GifEditContext.duration = (int) (c169946li.LIZ.getDuration() * c169946li.LIZLLL);
                        return;
                    case 2:
                    case 4:
                        ImageView imageView2 = video2GifCutFragment.LJLILLLLZI;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                        if (!c170606mm.LIZ) {
                            return;
                        }
                        video2GifCutFragment.LJLLILLLL.post(video2GifCutFragment.LJLLJ);
                        return;
                    case 3:
                    case 5:
                        if (!c170606mm.LIZ || video2GifCutFragment.LJLJJLL) {
                            return;
                        }
                        video2GifCutFragment.LJLLILLLL.removeCallbacks(video2GifCutFragment.LJLLJ);
                        ImageView imageView3 = video2GifCutFragment.LJLILLLLZI;
                        if (imageView3 == null) {
                            return;
                        }
                        imageView3.setVisibility(0);
                        return;
                    case 6:
                        if (!c170606mm.LIZ || (imageView = video2GifCutFragment.LJLILLLLZI) == null) {
                            return;
                        }
                        imageView.setVisibility(8);
                        return;
                    default:
                        return;
                }
        }
    }

    public static final void onChanged$20(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C161416Vd c161416Vd = (C161416Vd) aObserverS58S0101000_2.l0;
                if (!c161416Vd.LLIIL) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = c161416Vd.LJLJL.getPlayBoundary();
                InterfaceC153045zY interfaceC153045zY = c161416Vd.LJLZ;
                Objects.requireNonNull(playBoundary.LIZIZ);
                c161416Vd.LJZ.DM().setValue(C5MM.LIZIZ(interfaceC153045zY.LLFZ(r0.intValue())));
                Long l = playBoundary.LIZ;
                Objects.requireNonNull(l);
                c161416Vd.LJIILJJIL(Math.max(l.intValue(), 0), Math.min(playBoundary.LIZIZ.intValue(), c161416Vd.LJLZ.getDuration()));
                return;
            default:
                ((ViewOnTouchListenerC82857WfV) aObserverS58S0101000_2.l0).LJJIJIL((C15070iV) obj);
                return;
        }
    }

    public static final void onChanged$21(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                ((C161416Vd) aObserverS58S0101000_2.l0).LJFF();
                return;
            default:
                ((ViewOnTouchListenerC82857WfV) aObserverS58S0101000_2.l0).LJJIJ();
                return;
        }
    }

    public static final void onChanged$22(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                ((C161416Vd) aObserverS58S0101000_2.l0).LJ();
                return;
            default:
                ((ViewOnTouchListenerC82857WfV) aObserverS58S0101000_2.l0).LJJIJIIJI();
                return;
        }
    }

    public static final void onChanged$23(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObserverS58S0101000_2.l0;
                if (!feedFollowFragment.LLIIIJ) {
                    feedFollowFragment.ub(false);
                    return;
                } else {
                    feedFollowFragment.LLIIIJ = false;
                    return;
                }
            default:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aObserverS58S0101000_2.l0;
                Boolean bool = (Boolean) obj;
                videoEditContainerScene.getClass();
                if (C53099Ksh.LIZJ() && bool.booleanValue() && !videoEditContainerScene.LLIIZ && videoEditContainerScene.LLIL) {
                    videoEditContainerScene.LLIIZ = true;
                    videoEditContainerScene.LLLJ();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$3(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        C5RT c5rt;
        C164916db c164916db;
        C5RT LIZ;
        Long l;
        boolean z = false;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                VEEffectSelectOp vEEffectSelectOp = (VEEffectSelectOp) obj;
                c169776lR.getClass();
                if (vEEffectSelectOp == null) {
                    return;
                }
                int i = vEEffectSelectOp.mType;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return;
                            }
                            EffectModel effectModel = vEEffectSelectOp.mEffectModel;
                            EffectPointModel effectPointModel = vEEffectSelectOp.mPreviousModel;
                            c169776lR.LIZLLL.setValue(C5MM.LIZLLL(0L));
                            c169776lR.LJJII.getVideoEditViewModel();
                            long LIZJ = c169776lR.LIZJ();
                            long LIZ2 = c169776lR.LJJIIZ.LIZ(LIZJ);
                            if (effectPointModel == null) {
                                String str = effectModel.resDir;
                                LIZ = new C5RT();
                                LIZ.LJI = 5;
                                LIZ.LJIIJJI = str;
                                LIZ.LIZJ = 0L;
                                LIZ.LIZLLL = LIZ2;
                            } else {
                                LIZ = C5RT.LIZ(effectPointModel.getIndex(), 0L, LIZ2, effectModel.resDir, effectPointModel.getUuid());
                            }
                            LIZ.LJ = 0L;
                            LIZ.LJFF = LIZJ;
                            LIZ.LJIIIIZZ = effectModel.color;
                            LIZ.LJIIL = effectModel.key;
                            LIZ.LJIILJJIL = effectModel.name;
                            LIZ.LJII = c169776lR.LJJIIZ.LIZ;
                            LIZ.LJIILLIIL = effectModel.category;
                            LIZ.LJIIZILJ = effectModel.extra;
                            c169776lR.LIZJ.setValue(LIZ);
                            c169776lR.LJIIL();
                            return;
                        }
                        int i2 = vEEffectSelectOp.action;
                        EffectModel effectModel2 = vEEffectSelectOp.mEffectModel;
                        if (i2 == 0) {
                            if (c169776lR.LJJIIJZLJL == null) {
                                C0JU.LIZLLL("VEEffectHelper selectFilterEffect mVEEditor is null");
                                return;
                            }
                            long LIZIZ = c169776lR.LJJIIZ.LIZIZ();
                            C5RT LIZIZ2 = C5RT.LIZIZ(LIZIZ, effectModel2.resDir);
                            LIZIZ2.LJ = LIZIZ;
                            LIZIZ2.LJIIIIZZ = effectModel2.color;
                            LIZIZ2.LJIIL = effectModel2.key;
                            LIZIZ2.LJIILIIL = effectModel2.resId;
                            LIZIZ2.LJIILJJIL = effectModel2.name;
                            LIZIZ2.LJII = c169776lR.LJJIIZ.LIZ;
                            LIZIZ2.LJIILLIIL = effectModel2.category;
                            LIZIZ2.LJIIZILJ = effectModel2.extra;
                            LIZIZ2.LJIJ = effectModel2.adjustParams;
                            LIZIZ2.LJIJI = effectModel2.isNewEngineEffect;
                            LIZIZ2.LIZLLL = c169776lR.LIZJ();
                            c169776lR.LIZJ.setValue(LIZIZ2);
                            c169776lR.LJIIL();
                            C135005Ro.LJFF(c169776lR.LIZ, effectModel2, c169776lR.LJJJJJ, -1, false, false);
                            return;
                        }
                        if (i2 != 1 || (c5rt = (C5RT) c169776lR.LIZJ.getValue()) == null || c5rt.LJI != 0) {
                            return;
                        }
                        c169776lR.LJIIJJI();
                        long LIZIZ3 = c169776lR.LJJIIZ.LIZIZ();
                        ArrayList<EffectPointModel> effectPointModels = c169776lR.LJIIIZ.getEffectPointModels();
                        EffectPointModel effectPointModel2 = (EffectPointModel) AnonymousClass028.LIZIZ(effectPointModels, 1, effectPointModels);
                        if (!C165016dl.LIZ().getBoolean("has_long_pressed", false)) {
                            if (LIZIZ3 - effectPointModel2.getUiStartPoint() < 200 && LIZIZ3 >= effectPointModel2.getUiStartPoint() && (c164916db = c169776lR.LJJJI) != null && (c164916db.getCurrentPage() instanceof C170346mM)) {
                                ((C170346mM) c169776lR.LJJJI.getCurrentPage()).LJIILL(null, true);
                            } else {
                                C165016dl.LIZ().storeBoolean("has_long_pressed", true);
                            }
                        }
                        if (LIZIZ3 - effectPointModel2.getUiStartPoint() < 100) {
                            c169776lR.LIZJ.setValue(C5RT.LIZLLL(effectPointModel2.getIndex(), effectPointModel2.getUiStartPoint(), effectPointModel2.getUuid()));
                            return;
                        }
                        C5RT LIZJ2 = C5RT.LIZJ(LIZIZ3);
                        LIZJ2.LJFF = LIZIZ3;
                        LIZJ2.LJII = c169776lR.LJJIIZ.LIZ;
                        LIZJ2.LJIJI = effectModel2.isNewEngineEffect;
                        c169776lR.LIZJ.setValue(LIZJ2);
                        return;
                    }
                    EffectModel effectModel3 = vEEffectSelectOp.mEffectModel;
                    C5RT LIZIZ4 = C5RT.LIZIZ(c169776lR.LJJIIZ.LIZIZ(), effectModel3.resDir);
                    LIZIZ4.LJ = c169776lR.LJJIIZ.LIZIZ();
                    LIZIZ4.LJIIIIZZ = effectModel3.color;
                    LIZIZ4.LJIIL = effectModel3.key;
                    LIZIZ4.LJIILJJIL = effectModel3.name;
                    LIZIZ4.LJII = c169776lR.LJJIIZ.LIZ;
                    LIZIZ4.LJIILLIIL = effectModel3.category;
                    LIZIZ4.LJIILL = Math.min(effectModel3.duration, c169776lR.LJJIIJZLJL.LLIZLLLIL() - ((int) LIZIZ4.LJ));
                    LIZIZ4.LJIIZILJ = effectModel3.extra;
                    c169776lR.LIZJ.setValue(LIZIZ4);
                    c169776lR.LJIIL();
                    long j = LIZIZ4.LJ + LIZIZ4.LJIILL;
                    C5RT LIZJ3 = C5RT.LIZJ(c169776lR.LJJIIJZLJL.LLFZ((int) j));
                    LIZJ3.LJFF = j;
                    LIZJ3.LJII = c169776lR.LJJIIZ.LIZ;
                    c169776lR.LIZJ.setValue(LIZJ3);
                    C135005Ro.LJFF(c169776lR.LIZ, effectModel3, c169776lR.LJJJJJ, -1, false, false);
                    if (LIZIZ4.LJIILL >= 100) {
                        return;
                    }
                    C78920UyC.LIZLLL(R.string.fms, c169776lR.LJJIZ, 1015);
                    return;
                }
                c169776lR.LJIJJ(vEEffectSelectOp.mTimePosition, false, true);
                return;
            case 1:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                if (!c169786lS.LJJIJIIJIL || (l = c169786lS.LJIL.getPlayBoundary().LIZIZ) == null) {
                    return;
                }
                c169786lS.LIZLLL.setValue(C5MM.LIZIZ(c169786lS.LJJII.LIZ(l.intValue())));
                c169786lS.LJJIFFI();
                return;
            default:
                Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) aObserverS58S0101000_2.l0;
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    video2GifCutFragment.getClass();
                    if (bool.booleanValue()) {
                        z = true;
                    }
                }
                video2GifCutFragment.LJLJJLL = z;
                if (video2GifCutFragment.LJLJL != null) {
                    if (bool != null && bool.booleanValue()) {
                        video2GifCutFragment.LJLJL.LIZ();
                        return;
                    } else {
                        video2GifCutFragment.LJLJL.LIZIZ();
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.5Ni, X.6ln] */
    public static final void onChanged$4(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                final C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                Boolean bool = (Boolean) obj;
                c169776lR.getClass();
                if (bool == null) {
                    return;
                }
                final boolean booleanValue = bool.booleanValue();
                c169776lR.LJJIL = booleanValue;
                if (!booleanValue) {
                    c169776lR.LJIJJLI.setVisibility(8);
                    c169776lR.LJIL.setVisibility(8);
                    c169776lR.LJIILJJIL.setVisibility(8);
                }
                C170696mv.LIZJ(c169776lR.LJIIJJI, booleanValue, c169776lR.LJJLJ, c169776lR.LJJIJL, new InterfaceC15040iS() { // from class: X.6la
                    @Override // X.InterfaceC15040iS
                    public final void accept(Object obj2) {
                        InterfaceC36571c5 interfaceC36571c5;
                        InterfaceC36571c5 interfaceC36571c52;
                        C169776lR c169776lR2 = C169776lR.this;
                        if (booleanValue) {
                            c169776lR2.LJIJJLI.setVisibility(0);
                            c169776lR2.LJIL.setVisibility(0);
                            C164916db c164916db = c169776lR2.LJJJI;
                            if (c164916db != null && c164916db.getCurrentPage() != null) {
                                AbstractC170376mP currentPage = c169776lR2.LJJJI.getCurrentPage();
                                ArrayList<EffectPointModel> arrayList = new ArrayList<>();
                                if (currentPage instanceof C170346mM) {
                                    C170346mM c170346mM = (C170346mM) currentPage;
                                    c170346mM.LJIIL();
                                    arrayList = c170346mM.LL;
                                }
                                c169776lR2.LJJLJLI.LIZJ(currentPage.LJLIL, arrayList);
                                c169776lR2.LJIIIZ.LJI(arrayList, c169776lR2.LJJIIZ.LIZ);
                            }
                            C170216m9 c170216m9 = c169776lR2.LJJIJLIJ;
                            if (c170216m9 != null && (interfaceC36571c52 = c170216m9.LJLL) != null && (interfaceC36571c52 instanceof InterfaceC170126m0)) {
                                c169776lR2.LJIIIZ.LJI(((InterfaceC170126m0) interfaceC36571c52).LLJJIJIIJIL(), c169776lR2.LJJIIZ.LIZ);
                            }
                            C170216m9 c170216m92 = c169776lR2.LJJIJLIJ;
                            if (c170216m92 != null && (interfaceC36571c5 = c170216m92.LJLL) != null && (interfaceC36571c5 instanceof InterfaceC170126m0)) {
                                c169776lR2.LJIIIZ.LJI(((InterfaceC170126m0) interfaceC36571c5).LLJJIJIIJIL(), c169776lR2.LJJIIZ.LIZ);
                            }
                            if (c169776lR2.LJJLIL) {
                                c169776lR2.LJJLIL = false;
                                c169776lR2.LJIIL();
                                return;
                            }
                            return;
                        }
                        c169776lR2.getClass();
                    }
                });
                if (booleanValue) {
                    InterfaceC45540Hu4 interfaceC45540Hu4 = c169776lR.LJJLL;
                    if (interfaceC45540Hu4 != null) {
                        interfaceC45540Hu4.registerActivityOnKeyDownListener(c169776lR.LJJZ);
                    }
                    if (c169776lR.LJIIIZ != null) {
                        c169776lR.LIZLLL.setValue(C5MM.LIZLLL(0L));
                        c169776lR.LJJIFFI(0, false);
                        ImageView imageView = c169776lR.LJIILIIL;
                        if (imageView != null && imageView.getVisibility() != 0) {
                            C170696mv.LIZ(c169776lR.LJIILIIL, true);
                            c169776lR.LJIILIIL.setVisibility(0);
                        }
                    }
                    c169776lR.LJIJI();
                    if (c169776lR.LJJIJ == null) {
                        ?? r3 = new InterfaceC133905Ni() { // from class: X.6ln
                            public volatile boolean LJLIL;

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC133905Ni
                            public final void LIZ(int i, int i2, float f, String str) {
                                if (i == 4098) {
                                    C5RT c5rt = (C5RT) C169776lR.this.LIZJ.getValue();
                                    if (!this.LJLIL && C169776lR.this.LJJIL) {
                                        if (c5rt == null || c5rt.LJI != 0) {
                                            this.LJLIL = true;
                                            C169776lR c169776lR2 = C169776lR.this;
                                            c169776lR2.LJII.post(new ARunnableS14S0101000_10(3, c169776lR2, 8));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                this.LJLIL = false;
                            }
                        };
                        c169776lR.LJJIJ = r3;
                        c169776lR.LJJIIJZLJL.LLIIJLIL(r3);
                    }
                } else {
                    InterfaceC45540Hu4 interfaceC45540Hu42 = c169776lR.LJJLL;
                    if (interfaceC45540Hu42 != null) {
                        interfaceC45540Hu42.unRegisterActivityOnKeyDownListener(c169776lR.LJJZ);
                    }
                }
                if (bool.booleanValue()) {
                    c169776lR.LJJJLL.LIZJ().setValue(C140335f3.LIZ(C78885Uxd.LIZIZ(true, false, false, false), C63081OpJ.LJJJJLI(c169776lR.LJJIZ) + c169776lR.LIZLLL(), c169776lR.LJJLJ, c169776lR.LJ(), AnonymousClass668.LIZIZ().LIZ()));
                    c169776lR.LJJII.LJJIJL();
                } else {
                    MutableLiveData<C140335f3> LIZJ = c169776lR.LJJJLL.LIZJ();
                    int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, c169776lR.LJJIZ);
                    int LJJJJLI = C63081OpJ.LJJJJLI(c169776lR.LJJIZ) + c169776lR.LIZLLL();
                    int i = c169776lR.LJJLJ;
                    int LJ = c169776lR.LJ();
                    AnonymousClass668.LIZIZ().LIZ();
                    LIZJ.setValue(C140345f4.LIZ(LJIIIIZZ, LJJJJLI, i, LJ));
                }
                if (!bool.booleanValue()) {
                    return;
                }
                if (c169776lR.LJJIII != null && (((H7R.LJJJ(c169776lR.LIZ) || c169776lR.LIZ.getEditorProModel().isAdvancedEditDraft()) && c169776lR.LJJLIIIJ) || c169776lR.LJJLIIIJILLIZJL)) {
                    c169776lR.LJJLIIIJILLIZJL = false;
                    ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = c169776lR.LJJII;
                    viewOnTouchListenerC82857WfV.LIZ(viewOnTouchListenerC82857WfV.getSlideX(), C43547H7f.LIZ(c169776lR.LIZ.getMediaModelList(), true, null, 12));
                    if (!c169776lR.LJJLIIJ && C169816lV.LIZJ(c169776lR.LJJ, c169776lR.LJJIJLIJ, c169776lR.LJJLIIIJL)) {
                        c169776lR.LJIJ();
                    }
                }
                if ((!H7R.LJJJ(c169776lR.LIZ) && !c169776lR.LIZ.getEditorProModel().isAdvancedEditDraft()) || !c169776lR.LJJLIIIJ) {
                    return;
                }
                c169776lR.LJJLIIIJ = false;
                if (c169776lR.LJJIIZI == null) {
                    return;
                }
                if (!c169776lR.LJJLIIIJLLLLLLLZ && ((viewOnTouchListenerC141755hL = c169776lR.LJJIFFI) == null || viewOnTouchListenerC141755hL.getAdapter() == null)) {
                    return;
                }
                c169776lR.LJJIFFI(0, false);
                int LJFF = c169776lR.LJFF();
                c169776lR.LJIIIZ.setVideoDuration(LJFF);
                c169776lR.LJJII.LJJI(LJFF);
                c169776lR.LJJJJIZL.LIZIZ(LJFF);
                c169776lR.LJJIIZI.LIZIZ();
                ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL2 = c169776lR.LJJIFFI;
                if (viewOnTouchListenerC141755hL2 == null || !(viewOnTouchListenerC141755hL2.getAdapter() instanceof C162626Zu)) {
                    return;
                }
                ((C162626Zu) c169776lR.LJJIFFI.getAdapter()).LJLLLLLL();
                return;
            case 1:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                if (!c169786lS.LJJIJIIJIL) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = c169786lS.LJIL.getPlayBoundary();
                Long l = playBoundary.LIZ;
                Long l2 = playBoundary.LIZIZ;
                if (l == null || l2 == null) {
                    return;
                }
                c169786lS.LIZLLL.setValue(C5MM.LIZLLL(c169786lS.LJJII.LIZ(l.intValue())));
                c169786lS.LJJI(l.intValue(), l2.intValue());
                return;
            default:
                Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) aObserverS58S0101000_2.l0;
                if (((Long) obj) != null) {
                    MediaPlayerModule mediaPlayerModule = video2GifCutFragment.LJLJL;
                    if (mediaPlayerModule != null) {
                        C169946li c169946li = (C169946li) mediaPlayerModule.LJLILLLLZI;
                        c169946li.LIZ.LLJJJIL((int) (r9.longValue() / c169946li.LIZLLL), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
                        return;
                    }
                    return;
                }
                video2GifCutFragment.getClass();
                return;
        }
    }

    public static final void onChanged$5(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        Long l;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                final C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                final C5RT c5rt = (C5RT) obj;
                c169776lR.getClass();
                if (c5rt == null) {
                    return;
                }
                final long j = c5rt.LIZJ;
                int i = c5rt.LJI;
                String str = "";
                if (i == 0) {
                    try {
                        String[] strArr = c5rt.LIZIZ;
                        if (strArr != null && strArr.length > 0) {
                            str = strArr[0];
                        }
                        c169776lR.LJIIIZ.LIZ(c5rt.LJIIIIZZ, str, c5rt.LJ, c5rt.LJIILLIIL, c5rt.LJIILIIL, c5rt.LJII);
                        return;
                    } catch (NullPointerException e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(e.getMessage());
                        LIZ.append(" ");
                        LIZ.append(c5rt.toString());
                        throw new NullPointerException(X1D.LIZIZ(LIZ));
                    }
                }
                if (i == 5) {
                    c169776lR.LJIJJLI(C169816lV.LJI(c5rt.LJ, c5rt.LJFF), true, true);
                    return;
                }
                if (i == 7) {
                    c169776lR.LJJII.LJJIIZ(false, true, null);
                    return;
                }
                if (i == 8) {
                    c169776lR.LJIIIZ.setVisibility(8);
                    if (c169776lR.LJJLIIIJLLLLLLLZ) {
                        c169776lR.LJJII.LJJIIJZLJL(true);
                    } else {
                        c169776lR.LJJII.setVisibility(0);
                    }
                    int i2 = (int) c5rt.LJ;
                    int i3 = (int) c5rt.LJFF;
                    if (i2 >= 0 && i3 >= 0 && !c169776lR.LJJII.LJJIJLIJ(i2, i3, false)) {
                        c169776lR.LJJII.postDelayed(new ARunnableS0S0102000_2(c169776lR, i2, i3, 0), 300L);
                    }
                    c169776lR.LJJII.LJJIIZ(false, true, new InterfaceC15040iS() { // from class: X.6lj
                        @Override // X.InterfaceC15040iS
                        public final void accept(Object obj2) {
                            String str2;
                            C169776lR c169776lR2 = C169776lR.this;
                            C5RT c5rt2 = c5rt;
                            long j2 = j;
                            c169776lR2.getClass();
                            String[] strArr2 = c5rt2.LIZIZ;
                            if (strArr2 != null && strArr2.length > 0) {
                                str2 = strArr2[0];
                            } else {
                                str2 = "";
                            }
                            c169776lR2.LJIIIZ.LIZ(c5rt2.LJIIIIZZ, str2, j2, c5rt2.LJIILLIIL, c5rt2.LJIILIIL, c5rt2.LJII);
                            c169776lR2.LJJII.LJJIIZ(true, true, null);
                        }
                    });
                    return;
                }
                ArrayList<EffectPointModel> effectPointModels = c169776lR.LJIIIZ.getEffectPointModels();
                int i4 = c5rt.LJI;
                if (i4 == 1) {
                    if (effectPointModels.isEmpty()) {
                        return;
                    }
                    EffectPointModel effectPointModel = (EffectPointModel) AnonymousClass028.LIZIZ(effectPointModels, 1, effectPointModels);
                    C169796lT c169796lT = c169776lR.LJIIIZ;
                    String uuid = effectPointModel.getUuid();
                    long j2 = c5rt.LJFF;
                    EffectPointModel LIZJ = c169796lT.LIZJ(uuid);
                    if (LIZJ != null) {
                        LIZJ.setUiEndPoint((int) j2);
                        c169796lT.LJLIL.postInvalidate();
                    }
                    if (C164996dj.LIZLLL(effectPointModel.getCategory())) {
                        return;
                    }
                    c169776lR.LIZLLL.setValue(C5MM.LIZLLL(c5rt.LJFF));
                    return;
                }
                if (i4 == 2) {
                    c169776lR.LJIIZILJ(c5rt.LJ, c5rt.LIZIZ[0]);
                    return;
                }
                if (i4 == 3) {
                    MutableLiveData<C5MM> mutableLiveData = c169776lR.LIZLLL;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(C5MM.LIZLLL(0L));
                    }
                    c169776lR.LJJIFFI((int) c169776lR.LJJIIZ.LIZ(0L), false);
                    c169776lR.LJIIIZ.LJLJJLL.clear();
                    return;
                }
                if (i4 == 4) {
                    if (c169776lR.LJJJJL == null) {
                        return;
                    }
                    for (int length = c5rt.LIZIZ.length - 1; length >= 0; length--) {
                        c169776lR.LJIIZILJ(0L, c5rt.LIZIZ[length]);
                    }
                    return;
                }
                if (i4 != 10) {
                    return;
                }
                try {
                    String[] strArr2 = c5rt.LIZIZ;
                    if (strArr2 != null && strArr2.length > 0) {
                        str = strArr2[0];
                    }
                    C169796lT c169796lT2 = c169776lR.LJIIIZ;
                    long j3 = c5rt.LJ;
                    long j4 = c5rt.LJFF;
                    boolean z = c5rt.LJII;
                    EffectPointModel LIZJ2 = c169796lT2.LIZJ(str);
                    if (LIZJ2 == null) {
                        return;
                    }
                    LIZJ2.setUiStartPoint((int) j3);
                    LIZJ2.setUiEndPoint((int) j4);
                    C169826lW c169826lW = c169796lT2.LJLIL;
                    c169826lW.LJLJJLL = c169796lT2.LJLJJLL;
                    c169826lW.LJLJL = z;
                    c169826lW.postInvalidate();
                    return;
                } catch (NullPointerException e2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(e2.getMessage());
                    LIZ2.append(" ");
                    LIZ2.append(c5rt.toString());
                    throw new NullPointerException(X1D.LIZIZ(LIZ2));
                }
            case 1:
                FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) aObserverS58S0101000_2.l0;
                fullFeedFragmentPanel.getClass();
                fullFeedFragmentPanel.LLIFFJFJJ = ((Integer) obj).intValue();
                return;
            case 2:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                if (!c169786lS.LJJIJIIJIL || (l = c169786lS.LJIL.getPlayBoundary().LIZ) == null) {
                    return;
                }
                c169786lS.LIZLLL.setValue(C5MM.LIZIZ(c169786lS.LJJII.LIZ(l.intValue())));
                c169786lS.LJJIFFI();
                return;
            case 3:
                C31735Cct.LJ((C31735Cct) aObserverS58S0101000_2.l0, (Boolean) obj);
                return;
            default:
                ((Video2GifCutFragment) aObserverS58S0101000_2.l0).wl();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.6ld, java.lang.Runnable] */
    public static final void onChanged$6(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        Long l;
        boolean z;
        final String str;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                final C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                C5MM c5mm = (C5MM) obj;
                c169776lR.getClass();
                if (c5mm == null) {
                    return;
                }
                if (c5mm.LIZ == 0) {
                    c169776lR.LJIILL();
                    C5RT c5rt = (C5RT) c169776lR.LIZJ.getValue();
                    if (c5rt != null && c5rt.LJI == 0 && !C164996dj.LIZLLL(c5rt.LJIILLIIL)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c169776lR.LJJII.getVisibility() == 0 && !c169776lR.LJJLIIIJLLLLLLLZ) {
                        c169776lR.LJJJJZI.post(c169776lR.LJJZZI);
                        return;
                    }
                    if (z) {
                        String[] strArr = c5rt.LIZIZ;
                        if (strArr != null && strArr.length > 0) {
                            str = strArr[0];
                        } else {
                            str = "";
                        }
                        ?? r1 = new Runnable(str) { // from class: X.6ld
                            public final String LJLIL;

                            public final void LIZ() {
                                long LIZIZ = C169776lR.this.LJJIIZ.LIZIZ();
                                C169796lT c169796lT = C169776lR.this.LJIIIZ;
                                String str2 = this.LJLIL;
                                int i = (int) LIZIZ;
                                if (!c169796lT.LJLJJLL.isEmpty()) {
                                    EffectPointModel LIZJ = c169796lT.LIZJ(str2);
                                    if (LIZJ != null) {
                                        LIZJ.setUiEndPoint(i);
                                    }
                                    c169796lT.LJLIL.postInvalidate();
                                }
                                c169796lT.LJII(i);
                                C169776lR c169776lR2 = C169776lR.this;
                                if (!c169776lR2.LJJIL) {
                                    return;
                                }
                                if (!c169776lR2.LJJIIZ.LIZJ()) {
                                    C169776lR.this.LJII.post(this);
                                } else {
                                    C169776lR.this.LJIIJJI();
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ;
                                try {
                                    LIZ();
                                } finally {
                                    if (LIZ) {
                                    }
                                }
                            }

                            {
                                this.LJLIL = str;
                            }
                        };
                        c169776lR.LJJIJIIJIL = r1;
                        c169776lR.LJII.post(r1);
                        return;
                    }
                    RunnableC169926lg runnableC169926lg = new RunnableC169926lg(c169776lR);
                    c169776lR.LJJIJIL = runnableC169926lg;
                    c169776lR.LJII.post(runnableC169926lg);
                    return;
                }
                c169776lR.LJIILL();
                return;
            case 1:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                if (!c169786lS.LJJIJIIJIL || (l = c169786lS.LJIL.getPlayBoundary().LIZ) == null) {
                    return;
                }
                c169786lS.LIZLLL.setValue(C5MM.LIZIZ(c169786lS.LJJII.LIZ(l.intValue())));
                c169786lS.LJJIFFI();
                return;
            case 2:
                PNSAgeGateActivity this$0 = (PNSAgeGateActivity) aObserverS58S0101000_2.l0;
                o.LJIIIZ(this$0, "this$0");
                if (this$0.LLII().onBackPressed()) {
                    this$0.finish();
                    return;
                }
                return;
            default:
                Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) aObserverS58S0101000_2.l0;
                if (video2GifCutFragment.LJLJJI.getPlayBoundary() != null && video2GifCutFragment.LJLJJI.getPlayBoundary().LIZ != null) {
                    long longValue = video2GifCutFragment.LJLJJI.getPlayBoundary().LIZ.longValue();
                    C169946li c169946li = (C169946li) video2GifCutFragment.LJLJL.LJLILLLLZI;
                    c169946li.LIZ(longValue, c169946li.LIZJ);
                    video2GifCutFragment.wl();
                    return;
                }
                return;
        }
    }

    public static final void onChanged$7(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        Long l;
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                if (!c169776lR.LJJIL || (l = c169776lR.LJJII.getPlayBoundary().LIZ) == null) {
                    return;
                }
                c169776lR.LIZLLL.setValue(C5MM.LIZIZ(c169776lR.LJJIIZ.LIZ(l.intValue())));
                c169776lR.LJJIII();
                return;
            case 1:
                FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) aObserverS58S0101000_2.l0;
                Aweme aweme = (Aweme) obj;
                Integer insertIndex = LEJ.LIZ().getInsertIndex(fullFeedFragmentPanel.getCurIndex(), aweme);
                if (insertIndex != null) {
                    C8RO c8ro = fullFeedFragmentPanel.LJLIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("start to insert at ");
                    LIZ.append(insertIndex);
                    LIZ.append("thread: ");
                    LIZ.append(C16880lQ.LLLLIIIILLL());
                    c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
                    try {
                        fullFeedFragmentPanel.LJJLIIIJ(insertIndex.intValue(), aweme);
                        return;
                    } catch (Exception e) {
                        C36922EeM.LIZ(e);
                        return;
                    }
                }
                return;
            case 2:
                C169786lS c169786lS = (C169786lS) aObserverS58S0101000_2.l0;
                Long l2 = (Long) obj;
                if (c169786lS.LJJIJIIJIL && l2 != null) {
                    long LIZ2 = c169786lS.LJJII.LIZ(l2.longValue());
                    c169786lS.LIZLLL.setValue(C5MM.LIZIZ(LIZ2));
                    C170006lo c170006lo = c169786lS.LJJIZ;
                    c170006lo.LIZIZ = LIZ2;
                    c170006lo.LIZJ = l2.longValue();
                    c169786lS.LJJ(l2.intValue(), true);
                    return;
                }
                return;
            default:
                PNSAgeGateBaseFragment fragment = (PNSAgeGateBaseFragment) aObserverS58S0101000_2.l0;
                o.LJIIIZ(fragment, "$fragment");
                fragment.Dl((C86057Xq1) obj);
                return;
        }
    }

    public static final void onChanged$8(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                if (!c169776lR.LJJIL) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = c169776lR.LJJII.getPlayBoundary();
                Long l = playBoundary.LIZ;
                Long l2 = playBoundary.LIZIZ;
                if (l == null || l2 == null) {
                    return;
                }
                c169776lR.LJJII(l.intValue(), l2.intValue(), false);
                return;
            default:
                PNSAgeGateBaseFragment fragment = (PNSAgeGateBaseFragment) aObserverS58S0101000_2.l0;
                o.LJIIIZ(fragment, "$fragment");
                fragment.Il((String) obj);
                return;
        }
    }

    public static final void onChanged$9(AObserverS58S0101000_2 aObserverS58S0101000_2, Object obj) {
        switch (aObserverS58S0101000_2.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS58S0101000_2.l0;
                Long l = (Long) obj;
                if (c169776lR.LJJIL && l != null) {
                    long LIZ = c169776lR.LJJIIZ.LIZ(l.longValue());
                    c169776lR.LIZLLL.setValue(C5MM.LIZIZ(LIZ));
                    C170006lo c170006lo = c169776lR.LJJJJIZL;
                    c170006lo.LIZIZ = LIZ;
                    c170006lo.LIZJ = l.longValue();
                    c169776lR.LJJIFFI(l.intValue(), true);
                    return;
                }
                return;
            default:
                PNSAgeGateActivity this$0 = (PNSAgeGateActivity) aObserverS58S0101000_2.l0;
                Boolean it = (Boolean) obj;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIIZZ(it, "it");
                if (it.booleanValue()) {
                    this$0.LLII().mv0();
                    return;
                }
                return;
        }
    }

    public AObserverS58S0101000_2(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
