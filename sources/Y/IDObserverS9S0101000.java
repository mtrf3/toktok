package Y;

import X.AbstractC029409q;
import X.AbstractC19190p9;
import X.AbstractC34621Xm;
import X.AbstractC42141l4;
import X.AbstractC45018Hle;
import X.C06900Ow;
import X.C10K;
import X.C145995oB;
import X.C15070iV;
import X.C164996dj;
import X.C169786lS;
import X.C170596ml;
import X.C31689Cc9;
import X.C43910HLe;
import X.C47121t6;
import X.C48331Ixz;
import X.C50240Jng;
import X.C52243Ket;
import X.C5MM;
import X.C5RT;
import X.C62819Ol5;
import X.C66Y;
import X.C6FS;
import X.C74413TIj;
import X.C77413UZt;
import X.C78594Usw;
import X.C86793Y4n;
import X.EnumC74323TEx;
import X.FMX;
import X.H78;
import X.HC7;
import X.HK7;
import X.HQ5;
import X.InterfaceC35811ar;
import X.OSZ;
import X.ProgressDialogC43239Gy3;
import X.ViewOnTouchListenerC82857WfV;
import X.WRP;
import X.X1D;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDObserverS9S0101000 implements Observer {
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
            default:
                return;
        }
    }

    public static final void onChanged$0(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        switch (iDObserverS9S0101000.i1) {
            case 0:
                InterfaceC35811ar state = (InterfaceC35811ar) iDObserverS9S0101000.l0;
                o.LJIIIZ(state, "$state");
                state.setValue(obj);
                return;
            default:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) iDObserverS9S0101000.l0;
                ((AbstractC45018Hle) videoEditContainerScene.LLIIL.gv0(videoEditContainerScene.LJZL)).Y7();
                C6FS LLLIILIL = videoEditContainerScene.LLLIILIL();
                if (LLLIILIL == null) {
                    return;
                }
                LLLIILIL.rj0();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        ShortVideoContext shortVideoContext;
        switch (iDObserverS9S0101000.i1) {
            case 0:
                Observer observer = (Observer) iDObserverS9S0101000.l0;
                if (obj != null) {
                    observer.onChanged(obj);
                    return;
                }
                return;
            default:
                TTEPEffectPreviewActivity tTEPEffectPreviewActivity = (TTEPEffectPreviewActivity) iDObserverS9S0101000.l0;
                C74413TIj c74413TIj = (C74413TIj) obj;
                if (c74413TIj == null) {
                    ShortVideoContext shortVideoContext2 = tTEPEffectPreviewActivity.LJLLILLLL;
                    if (shortVideoContext2 != null) {
                        C77413UZt.LJIL(shortVideoContext2.shootWay);
                        return;
                    }
                } else {
                    tTEPEffectPreviewActivity.getClass();
                }
                if ((c74413TIj.LIZIZ != EnumC74323TEx.SUCCESS || c74413TIj.LIZ == 0) && (shortVideoContext = tTEPEffectPreviewActivity.LJLLILLLL) != null) {
                    C77413UZt.LJIL(shortVideoContext.shootWay);
                    return;
                }
                boolean booleanValue = ((Boolean) ((OSZ) c74413TIj.LIZ).getFirst()).booleanValue();
                int intValue = ((Integer) ((OSZ) c74413TIj.LIZ).getSecond()).intValue();
                if (booleanValue) {
                    if (tTEPEffectPreviewActivity.LLFZ == null) {
                        return;
                    }
                    tTEPEffectPreviewActivity.LLILLIZIL().setLiveTagState(intValue);
                    return;
                }
                C77413UZt.LJIL(tTEPEffectPreviewActivity.LJLLILLLL.shootWay);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.6lp, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.6le, java.lang.Runnable] */
    public static final void onChanged$10(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        boolean z;
        final String str;
        switch (iDObserverS9S0101000.i1) {
            case 0:
                ((PagingViewModel) iDObserverS9S0101000.l0).LJLJLJ.setValue(obj);
                return;
            case 1:
                final C169786lS c169786lS = (C169786lS) iDObserverS9S0101000.l0;
                C5MM c5mm = (C5MM) obj;
                c169786lS.getClass();
                if (c5mm == null) {
                    return;
                }
                if (c5mm.LIZ == 0) {
                    c169786lS.LJIILIIL();
                    C5RT c5rt = (C5RT) c169786lS.LIZJ.getValue();
                    if (c5rt != null && c5rt.LJI == 0 && !C164996dj.LIZLLL(c5rt.LJIILLIIL)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c169786lS.LJIL.getVisibility() == 0 && !c169786lS.LJJJJZ) {
                        c169786lS.LJJJJJ.post(c169786lS.LJJJZ);
                        return;
                    }
                    if (z) {
                        String[] strArr = c5rt.LIZIZ;
                        if (strArr != null && strArr.length > 0) {
                            str = strArr[0];
                        } else {
                            str = "";
                        }
                        ?? r1 = new Runnable(str) { // from class: X.6le
                            public final String LJLIL;

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ;
                                try {
                                    long LIZJ = C169786lS.this.LJJII.LIZJ();
                                    C169796lT c169796lT = C169786lS.this.LJIIIIZZ;
                                    String str2 = this.LJLIL;
                                    int i = (int) LIZJ;
                                    if (!c169796lT.LJLJJLL.isEmpty()) {
                                        EffectPointModel LIZJ2 = c169796lT.LIZJ(str2);
                                        if (LIZJ2 != null) {
                                            LIZJ2.setUiEndPoint(i);
                                        }
                                        c169796lT.LJLIL.postInvalidate();
                                    }
                                    c169796lT.LJII(i);
                                    C169786lS.this.LJI.post(this);
                                } finally {
                                    if (LIZ) {
                                    }
                                }
                            }

                            {
                                this.LJLIL = str;
                            }
                        };
                        c169786lS.LJJIIZ = r1;
                        c169786lS.LJI.post(r1);
                        return;
                    }
                    ?? r12 = new Runnable() { // from class: X.6lp
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                C169786lS.this.LJJ((int) C169786lS.this.LJJII.LIZJ(), false);
                                if (!C169786lS.this.LIZ()) {
                                    C169786lS.this.LJI.postDelayed(this, 0L);
                                }
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    };
                    c169786lS.LJJIIZI = r12;
                    c169786lS.LJI.post(r12);
                    return;
                }
                c169786lS.LJIILIIL();
                return;
            default:
                SearchContainerFragment.xl((SearchContainerFragment) iDObserverS9S0101000.l0, (C50240Jng) obj);
                return;
        }
    }

    public static final void onChanged$2(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        switch (iDObserverS9S0101000.i1) {
            case 0:
                ((AbstractC34621Xm) iDObserverS9S0101000.l0).LJLLLLLL((AbstractC19190p9) obj);
                return;
            default:
                C66Y c66y = (C66Y) iDObserverS9S0101000.l0;
                Boolean bool = (Boolean) obj;
                c66y.getClass();
                if (bool != null && bool.booleanValue() && c66y.LLFZ) {
                    c66y.LJIJ();
                    return;
                }
                return;
        }
    }

    public static final void onChanged$3(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        switch (iDObserverS9S0101000.i1) {
            case 0:
                AbstractC42141l4 abstractC42141l4 = (AbstractC42141l4) iDObserverS9S0101000.l0;
                C06900Ow c06900Ow = (C06900Ow) obj;
                abstractC42141l4.getClass();
                if (c06900Ow == null) {
                    return;
                }
                abstractC42141l4.LLIIIILZ(c06900Ow.LIZ);
                return;
            default:
                C66Y c66y = (C66Y) iDObserverS9S0101000.l0;
                if (!c66y.LLILIL || c66y.LJZI == null || c66y.LJLJLJ == null) {
                    return;
                }
                if (c66y.LLFZ) {
                    c66y.LJIJ();
                }
                c66y.LJIL(0, c66y.LJZI.LLIZLLLIL(), false, false);
                c66y.LJZL.DM().setValue(C5MM.LIZIZ(c66y.LJZI.LLFZ(c66y.LJLJLJ.getPlayBoundary().LIZIZ.intValue())));
                return;
        }
    }

    public static final void onChanged$4(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV;
        boolean z = false;
        switch (iDObserverS9S0101000.i1) {
            case 0:
                AbstractC42141l4 abstractC42141l4 = (AbstractC42141l4) iDObserverS9S0101000.l0;
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    abstractC42141l4.getClass();
                    if (!bool.booleanValue()) {
                        z = true;
                    }
                }
                if (abstractC42141l4.LJLLILLLL == z || abstractC42141l4.LJLLJ) {
                    abstractC42141l4.LJLLILLLL = z;
                    return;
                } else {
                    abstractC42141l4.LJLLILLLL = z;
                    abstractC42141l4.notifyDataSetChanged();
                    return;
                }
            default:
                C66Y c66y = (C66Y) iDObserverS9S0101000.l0;
                if (!c66y.LLILIL || c66y.LJZI == null || (viewOnTouchListenerC82857WfV = c66y.LJLJLJ) == null) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = viewOnTouchListenerC82857WfV.getPlayBoundary();
                c66y.LJZL.DM().setValue(C5MM.LIZIZ(c66y.LJZI.LLFZ(playBoundary.LIZIZ.intValue())));
                c66y.LJIL(Math.max(playBoundary.LIZ.intValue(), 0), Math.min(playBoundary.LIZIZ.intValue(), c66y.LJZI.getDuration()), false, false);
                c66y.LJI();
                return;
        }
    }

    public static final void onChanged$5(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        String str;
        String str2;
        boolean z;
        int i;
        boolean booleanValue;
        switch (iDObserverS9S0101000.i1) {
            case 0:
                AbstractC42141l4 abstractC42141l4 = (AbstractC42141l4) iDObserverS9S0101000.l0;
                Boolean bool = (Boolean) obj;
                abstractC42141l4.getClass();
                if (bool == null || abstractC42141l4.LJLLJ == (booleanValue = bool.booleanValue())) {
                    return;
                }
                abstractC42141l4.LJLLJ = booleanValue;
                abstractC42141l4.notifyDataSetChanged();
                return;
            case 1:
                FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) iDObserverS9S0101000.l0;
                HK7 hk7 = (HK7) obj;
                if (fTCVideoRecordNewActivity.LLIIIL) {
                    return;
                }
                long j = hk7.LJLIL;
                long j2 = hk7.LJLILLLLZI;
                fTCVideoRecordNewActivity.LLIIIL = true;
                FilterBean LIZ = ((WRP) fTCVideoRecordNewActivity.LJLLI.LJ(WRP.class, null)).getCurSelectedFilter().LIZ();
                Effect effect = fTCVideoRecordNewActivity.LJLLILLLL.enterMvThemeEffect;
                String str3 = "";
                if (effect == null) {
                    str = "";
                    str2 = "";
                } else {
                    str2 = effect.getEffectId();
                    str = effect.getName();
                }
                long longExtra = fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_start_record_time", 0L);
                long j3 = j - longExtra;
                int intExtra = fTCVideoRecordNewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
                long longExtra2 = fTCVideoRecordNewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1L);
                int intExtra2 = fTCVideoRecordNewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
                long longExtra3 = fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_decompress_time", -10086L);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("So decompress: VideoRecordNewActivity, decompress time:");
                LIZ2.append(longExtra3);
                H78.LIZ(X1D.LIZIZ(LIZ2));
                if (HQ5.LIZ) {
                    HQ5.LIZ = false;
                    z = true;
                } else {
                    z = false;
                }
                long longExtra4 = fTCVideoRecordNewActivity.getIntent().getLongExtra("effect_download_duration", -1L);
                long longExtra5 = fTCVideoRecordNewActivity.getIntent().getLongExtra("music_download_duration", -1L);
                long longExtra6 = fTCVideoRecordNewActivity.getIntent().getLongExtra("video_download_duration", -1L);
                C145995oB c145995oB = new C145995oB();
                c145995oB.LIZ(intExtra, "sdk_load_ve_so_status");
                c145995oB.LIZ(intExtra2, "preload_ve_so_task_status");
                c145995oB.LIZIZ(longExtra2, "preload_ve_so_cost_time");
                c145995oB.LIZIZ(longExtra3, "extra_decompress_time");
                c145995oB.LIZIZ(j3, "first_frame_duration");
                c145995oB.LIZIZ(j2 - j, "effect_first_frame_duration");
                c145995oB.LIZIZ(j2 - longExtra, "total_first_frame_duration");
                c145995oB.LJI("shoot_way", fTCVideoRecordNewActivity.LJLLILLLL.shootWay);
                c145995oB.LJI("enter_from", fTCVideoRecordNewActivity.LJLLILLLL.enterFrom);
                c145995oB.LJI("creation_id", fTCVideoRecordNewActivity.LJLLILLLL.LJI());
                c145995oB.LJ("cold_start", z);
                c145995oB.LIZIZ(longExtra4, "effect_download_duration");
                c145995oB.LIZIZ(longExtra5, "music_download_duration");
                c145995oB.LIZIZ(longExtra6, "video_download_duration");
                c145995oB.LJI("camera_type", C78594Usw.LIZJ(fTCVideoRecordNewActivity.LLIIJI.e8().getCurrentCameraType()));
                if (HC7.LIZ()) {
                    C10K.LIZJ(new ACallableS56S0300000_7(new C43910HLe(null, null, fTCVideoRecordNewActivity.LJLLI, null, fTCVideoRecordNewActivity.LLIIJI), c145995oB, new AObjectS52S0101000_7(0, c145995oB, 18), 16));
                } else {
                    FMX.LJIIL("tool_performance_record_first_frame", c145995oB.LIZ);
                }
                C145995oB c145995oB2 = new C145995oB();
                c145995oB2.LJI("creation_id", fTCVideoRecordNewActivity.LJLLILLLL.LJI());
                c145995oB2.LJI("shoot_way", fTCVideoRecordNewActivity.LJLLILLLL.shootWay);
                c145995oB2.LIZ(fTCVideoRecordNewActivity.LJLLILLLL.draftId, "draft_id");
                if (LIZ != null) {
                    str3 = LIZ.getEnName();
                }
                c145995oB2.LJI("filter_list", str3);
                if (LIZ != null) {
                    i = LIZ.getId();
                } else {
                    i = 0;
                }
                c145995oB2.LIZ(i, "filter_id_list");
                c145995oB2.LJI("enter_from", fTCVideoRecordNewActivity.LJLLILLLL.enterFrom);
                c145995oB2.LJI("prop_id", fTCVideoRecordNewActivity.LLILLIZIL().oa0().LJ());
                c145995oB2.LJI("mv_id", str2);
                c145995oB2.LJI("mv_name", str);
                c145995oB2.LJ("cold_start", z);
                c145995oB2.LIZIZ(fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0L), "download_res_time");
                c145995oB2.LJI("camera_type", C78594Usw.LIZJ(fTCVideoRecordNewActivity.LLIIJI.e8().getCurrentCameraType()));
                c145995oB2.LIZ(C62819Ol5.LJIJ(fTCVideoRecordNewActivity), "brightness");
                if (longExtra > 0 && j3 > 0) {
                    c145995oB2.LIZIZ(j3, "duration");
                }
                c145995oB2.LIZLLL("action_originated_from", fTCVideoRecordNewActivity.LJLLILLLL.creativeModel.commerceModel.getMusicContext().getActionOriginatedFrom().toString());
                FMX.LJIIL("enter_video_shoot_page", c145995oB2.LIZ);
                if (!C48331Ixz.LJ() && !C48331Ixz.LIZJ()) {
                    return;
                }
                C145995oB c145995oB3 = new C145995oB();
                c145995oB3.LJ("is_4k_enable", C52243Ket.LIZ());
                FMX.LJIIL("tool_performance_4k_video_import", c145995oB3.LIZ);
                return;
            case 2:
                ((C66Y) iDObserverS9S0101000.l0).LJIIIZ();
                return;
            default:
                ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) iDObserverS9S0101000.l0;
                exteriorVideoRecordScene.getClass();
                if (((Boolean) obj).booleanValue()) {
                    exteriorVideoRecordScene.LLLLL();
                    return;
                }
                ProgressDialogC43239Gy3 progressDialogC43239Gy3 = exteriorVideoRecordScene.LLF;
                if (progressDialogC43239Gy3 == null || !progressDialogC43239Gy3.isShowing()) {
                    return;
                }
                exteriorVideoRecordScene.LLF.dismiss();
                exteriorVideoRecordScene.LLF = null;
                return;
        }
    }

    public static final void onChanged$6(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        switch (iDObserverS9S0101000.i1) {
            case 0:
                AbstractC029409q abstractC029409q = (AbstractC029409q) iDObserverS9S0101000.l0;
                Integer num = (Integer) obj;
                abstractC029409q.getClass();
                if (num == null || num.intValue() < 0 || num.intValue() >= abstractC029409q.getItemCount()) {
                    return;
                }
                abstractC029409q.notifyItemChanged(num.intValue());
                return;
            default:
                ((C66Y) iDObserverS9S0101000.l0).LJII();
                return;
        }
    }

    public static final void onChanged$7(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        switch (iDObserverS9S0101000.i1) {
            case 0:
                ((PagingViewModel) iDObserverS9S0101000.l0).LJLJJL.postValue(obj);
                return;
            case 1:
                String str = (String) obj;
                C47121t6 c47121t6 = ((C31689Cc9) iDObserverS9S0101000.l0).LJLL;
                if (c47121t6 != null) {
                    c47121t6.setText(str);
                    return;
                }
                return;
            default:
                C169786lS c169786lS = (C169786lS) iDObserverS9S0101000.l0;
                C170596ml c170596ml = (C170596ml) obj;
                c169786lS.getClass();
                if (c170596ml == null || c170596ml.LIZ != 0 || TextUtils.isEmpty(c170596ml.LIZIZ)) {
                    return;
                }
                long j = c170596ml.LIZJ;
                if (j <= 0) {
                    return;
                }
                CharSequence charSequence = c170596ml.LIZIZ;
                RelativeLayout relativeLayout = c169786lS.LJIIL;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                    c169786lS.LJIIL.postDelayed(new IDRunnableS6S0101000(3, c169786lS, 27), j);
                }
                TextView textView = c169786lS.LJIILIIL;
                if (textView == null) {
                    return;
                }
                textView.setText(charSequence);
                return;
        }
    }

    public static final void onChanged$8(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        switch (iDObserverS9S0101000.i1) {
            case 0:
                ((PagingViewModel) iDObserverS9S0101000.l0).LJLJJLL.postValue(obj);
                return;
            default:
                DataChannel dataChannel = ((C31689Cc9) iDObserverS9S0101000.l0).LJLLL;
                if (dataChannel != null) {
                    dataChannel.rv0(EcLiveBarrageEnable.class, obj);
                    return;
                }
                return;
        }
    }

    public static final void onChanged$9(IDObserverS9S0101000 iDObserverS9S0101000, Object obj) {
        switch (iDObserverS9S0101000.i1) {
            case 0:
                ((PagingViewModel) iDObserverS9S0101000.l0).LJLJL.postValue(obj);
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) iDObserverS9S0101000.l0;
                videoRecordNewScene.LLIILZL = true;
                C86793Y4n.LJIIIZ(videoRecordNewScene);
                videoRecordNewScene.LLLLILI((HK7) obj);
                if (videoRecordNewScene.LJLZ.duetVideoDuration > 0 && e1.LIZ(31744, "enable_set_client_photo_video_mode", true, false)) {
                    videoRecordNewScene.LLJI.rX().LJ().LIZIZ.setClientState(7);
                    return;
                }
                return;
        }
    }

    public IDObserverS9S0101000(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
