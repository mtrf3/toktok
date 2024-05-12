package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import X.ASQ;
import X.ASY;
import X.ActivityC45651qj;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C1810678s;
import X.C188727au;
import X.C221108m2;
import X.C227678wd;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C2U8;
import X.C3C5;
import X.C47261Igj;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C71945SLl;
import X.C71998SNm;
import X.C72037SOz;
import X.C76800UCe;
import X.C78966Uyw;
import X.C78983UzD;
import X.C7MY;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.InterfaceC219588ja;
import X.SHP;
import X.SK5;
import X.SK8;
import X.SKL;
import X.SKQ;
import X.SLJ;
import X.SLR;
import X.SP9;
import X.SPB;
import X.SPC;
import X.SPD;
import X.SPE;
import X.Z89;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.api.model.VideoItemRestriction;
import com.ss.android.ugc.aweme.compliance.api.model.VideoItemSettings;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.autocaption.AutoCaptionViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.comment.VideoCommentViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.duet.VideoDuetViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.geofencing.GeofencingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.NowVisibilityViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.VideoVisibilityViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.sticker.VideoStickerViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.stitch.VideoStitchViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.util.VideoPrivacySettingsDurationViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoPrivacySettingUnFoldFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LL = 0;
    public C72037SOz LJLIL;
    public SPC LJLILLLLZI;
    public SPD LJLJI;
    public SP9 LJLJJI;
    public SPE LJLJJL;
    public C71998SNm LJLJJLL;
    public SPB LJLJL;
    public SK5 LJLJLJ;
    public BaseVisibilityViewModel LJLJLLL;
    public VideoItemRestriction LJLLILLLL;
    public VideoItemSettings LJLLJ;
    public Aweme LJLLL;
    public final Map<Integer, View> LJZL = new LinkedHashMap();
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 178));
    public final SKL LJLLI = new SKL(this);
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 179));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 180));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 181));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 182));
    public final List<BaseVideoPrivacySettingViewModel> LJZI = new ArrayList();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        int i;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 177));
        c235119Kp.LIZIZ(LIZJ);
        C9KF c9kf = new C9KF();
        Aweme aweme = this.LJLLL;
        if (aweme != null && C54838Lfe.LJJI(aweme)) {
            i = R.string.ryv;
        } else {
            i = R.string.p_8;
        }
        String string = getString(i);
        o.LJIIIIZZ(string, "getString(\n             …  }\n                    )");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        return c235119Kp;
    }

    public final String getEnterFrom() {
        return (String) this.LJLLLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        long gv0 = ((VideoPrivacySettingsDurationViewModel) this.LJLL.getValue()).gv0();
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            boolean LJJIZ = C78983UzD.LJJIZ(aweme);
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
            if (LJJIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_allow_pugc_template", str);
            c188727au.LJ(gv0, "duration");
            FMX.LJIIL("exit_privacy_setting_video", c188727au.LIZ);
            return;
        }
        o.LJIJI("awemeItem");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            if (C78983UzD.LJJIZ(aweme)) {
                BaseVisibilityViewModel baseVisibilityViewModel = this.LJLJLLL;
                if (baseVisibilityViewModel != null) {
                    if ((baseVisibilityViewModel instanceof VideoVisibilityViewModel) && ((VideoVisibilityViewModel) baseVisibilityViewModel).LJLL) {
                        C2U8.LIZ(new C227678wd());
                        Aweme aweme2 = this.LJLLL;
                        if (aweme2 != null) {
                            C2U8.LIZ(new C1810678s(aweme2));
                            return;
                        } else {
                            o.LJIJI("awemeItem");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("visibilityPermissionViewModel");
                throw null;
            }
            return;
        }
        o.LJIJI("awemeItem");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Aweme aweme = C78966Uyw.LJLJJI;
        Serializable serializable2 = null;
        C78966Uyw.LJLJJI = null;
        if (aweme == null) {
            ASQ.LJ(this, ASY.LIZ);
            return;
        }
        this.LJLLL = aweme;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("restriction");
        } else {
            serializable = null;
        }
        this.LJLLILLLL = (VideoItemRestriction) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("settings");
        }
        this.LJLLJ = (VideoItemSettings) serializable2;
    }

    public static final <T extends BaseVideoPrivacySettingViewModel> T vl(VideoPrivacySettingUnFoldFragment videoPrivacySettingUnFoldFragment, Class<T> cls) {
        T t = (T) new ViewModelProvider(videoPrivacySettingUnFoldFragment).get(cls);
        Aweme aweme = videoPrivacySettingUnFoldFragment.LJLLL;
        if (aweme != null) {
            VideoItemSettings videoItemSettings = videoPrivacySettingUnFoldFragment.LJLLJ;
            t.LJLJJL = aweme;
            t.LJLJJLL = videoItemSettings;
            t.LJLJI.setValue(Integer.valueOf(t.ov0()));
            t.mv0(videoPrivacySettingUnFoldFragment.LJLLI);
            ((ArrayList) videoPrivacySettingUnFoldFragment.LJZI).add(t);
            return t;
        }
        o.LJIJI("awemeItem");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BaseVisibilityViewModel baseVisibilityViewModel;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem2;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem3;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem4;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.af_);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.c9);
        Context context = _$_findCachedViewById(R.id.af_).getContext();
        o.LJIIIIZZ(context, "background_ll.context");
        _$_findCachedViewById.setBackground(c110614Vt.LIZ(context));
        if (this.LJLLL == null) {
            return;
        }
        ((VideoPrivacySettingsDurationViewModel) this.LJLL.getValue()).LJLIL = System.currentTimeMillis();
        Z89 z89 = Z89.LIZIZ;
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            if (z89.LIZIZ(aweme)) {
                baseVisibilityViewModel = (BaseVisibilityViewModel) vl(this, NowVisibilityViewModel.class);
            } else {
                baseVisibilityViewModel = (BaseVisibilityViewModel) vl(this, VideoVisibilityViewModel.class);
            }
            baseVisibilityViewModel.LJLJL = true;
            baseVisibilityViewModel.LJLJLJ = new WeakReference<>(mo49getActivity());
            this.LJLJLLL = baseVisibilityViewModel;
            BaseVisibilityViewModel baseVisibilityViewModel2 = this.LJLJLLL;
            if (baseVisibilityViewModel2 != null) {
                String enterFrom = getEnterFrom();
                o.LJIIIIZZ(enterFrom, "enterFrom");
                String imprId = (String) this.LJLZ.getValue();
                o.LJIIIIZZ(imprId, "imprId");
                String tabName = (String) this.LJZ.getValue();
                o.LJIIIIZZ(tabName, "tabName");
                this.LJLIL = new C72037SOz(baseVisibilityViewModel2, this, enterFrom, imprId, tabName);
                VideoDuetViewModel videoDuetViewModel = (VideoDuetViewModel) vl(this, VideoDuetViewModel.class);
                VideoItemRestriction videoItemRestriction = this.LJLLILLLL;
                if (videoItemRestriction != null) {
                    privacySettingsRestrictionItem = videoItemRestriction.getDuet();
                } else {
                    privacySettingsRestrictionItem = null;
                }
                String enterFrom2 = getEnterFrom();
                o.LJIIIIZZ(enterFrom2, "enterFrom");
                this.LJLILLLLZI = new SPC(privacySettingsRestrictionItem, videoDuetViewModel, this, enterFrom2);
                VideoStitchViewModel videoStitchViewModel = (VideoStitchViewModel) vl(this, VideoStitchViewModel.class);
                VideoItemRestriction videoItemRestriction2 = this.LJLLILLLL;
                if (videoItemRestriction2 != null) {
                    privacySettingsRestrictionItem2 = videoItemRestriction2.getStitch();
                } else {
                    privacySettingsRestrictionItem2 = null;
                }
                String enterFrom3 = getEnterFrom();
                o.LJIIIIZZ(enterFrom3, "enterFrom");
                this.LJLJI = new SPD(privacySettingsRestrictionItem2, videoStitchViewModel, this, enterFrom3);
                VideoCommentViewModel videoCommentViewModel = (VideoCommentViewModel) vl(this, VideoCommentViewModel.class);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    videoCommentViewModel.LJLJL = Integer.valueOf(System.identityHashCode(mo49getActivity));
                }
                VideoItemRestriction videoItemRestriction3 = this.LJLLILLLL;
                if (videoItemRestriction3 != null) {
                    privacySettingsRestrictionItem3 = videoItemRestriction3.getComment();
                } else {
                    privacySettingsRestrictionItem3 = null;
                }
                this.LJLJJI = new SP9(privacySettingsRestrictionItem3, videoCommentViewModel, this);
                AutoCaptionViewModel autoCaptionViewModel = (AutoCaptionViewModel) vl(this, AutoCaptionViewModel.class);
                BaseVisibilityViewModel baseVisibilityViewModel3 = this.LJLJLLL;
                if (baseVisibilityViewModel3 != null) {
                    this.LJLJJL = new SPE(autoCaptionViewModel, baseVisibilityViewModel3, this);
                    GeofencingViewModel geofencingViewModel = (GeofencingViewModel) new ViewModelProvider(this).get(GeofencingViewModel.class);
                    Aweme aweme2 = this.LJLLL;
                    if (aweme2 != null) {
                        geofencingViewModel.getClass();
                        geofencingViewModel.LJLIL = aweme2;
                        this.LJLJJLL = new C71998SNm(geofencingViewModel, this);
                        VideoStickerViewModel videoStickerViewModel = (VideoStickerViewModel) vl(this, VideoStickerViewModel.class);
                        VideoItemRestriction videoItemRestriction4 = this.LJLLILLLL;
                        if (videoItemRestriction4 != null) {
                            privacySettingsRestrictionItem4 = videoItemRestriction4.getSticker();
                        } else {
                            privacySettingsRestrictionItem4 = null;
                        }
                        String enterFrom4 = getEnterFrom();
                        o.LJIIIIZZ(enterFrom4, "enterFrom");
                        this.LJLJL = new SPB(privacySettingsRestrictionItem4, videoStickerViewModel, this, enterFrom4);
                        Aweme aweme3 = this.LJLLL;
                        if (aweme3 != null) {
                            String enterFrom5 = getEnterFrom();
                            o.LJIIIIZZ(enterFrom5, "enterFrom");
                            this.LJLJLJ = new SK5(this, aweme3, enterFrom5);
                            getContext();
                            ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setLayoutManager(new WrapLinearLayoutManager(1));
                            ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setItemAnimator(null);
                            SLJ[] sljArr = new SLJ[9];
                            SK5 sk5 = this.LJLJLJ;
                            if (sk5 != null) {
                                sljArr[0] = sk5;
                                C72037SOz c72037SOz = this.LJLIL;
                                if (c72037SOz != null) {
                                    sljArr[1] = c72037SOz;
                                    C71998SNm c71998SNm = this.LJLJJLL;
                                    if (c71998SNm != null) {
                                        sljArr[2] = c71998SNm;
                                        SP9 sp9 = this.LJLJJI;
                                        if (sp9 != null) {
                                            sljArr[3] = sp9;
                                            SPC spc = this.LJLILLLLZI;
                                            if (spc != null) {
                                                sljArr[4] = spc;
                                                SPD spd = this.LJLJI;
                                                if (spd != null) {
                                                    sljArr[5] = spd;
                                                    SPB spb = this.LJLJL;
                                                    if (spb != null) {
                                                        sljArr[6] = spb;
                                                        SPE spe = this.LJLJJL;
                                                        if (spe != null) {
                                                            sljArr[7] = spe;
                                                            sljArr[8] = new SHP(new SKQ(C7MY.LIZIZ(16)), this);
                                                            ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setAdapter(SLR.LIZ(C47261Igj.LJJIJIIJI(sljArr)));
                                                            Aweme aweme4 = this.LJLLL;
                                                            if (aweme4 != null) {
                                                                String enterFrom6 = getEnterFrom();
                                                                o.LJIIIIZZ(enterFrom6, "enterFrom");
                                                                String enterMethod = (String) this.LJLLLLLL.getValue();
                                                                o.LJIIIIZZ(enterMethod, "enterMethod");
                                                                C188727au c188727au = new C188727au();
                                                                c188727au.LJIIIZ("group_id", aweme4.getAid());
                                                                c188727au.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
                                                                if (C54838Lfe.LJJI(aweme4)) {
                                                                    str = "story";
                                                                } else {
                                                                    str = "post";
                                                                }
                                                                c188727au.LJI("story type", str);
                                                                if (aweme4.getStatus() != null) {
                                                                    aweme4.getStatus().getPrivateStatus();
                                                                    c188727au.LJI("privacy_status", SK8.LIZ(aweme4.getStatus().getPrivateStatus()));
                                                                }
                                                                c188727au.LJIIIZ("enter_from", enterFrom6);
                                                                c188727au.LJIIIZ("enter_method", enterMethod);
                                                                FMX.LJIIL("video_privacy_setting_pop_up_show", c188727au.LIZ);
                                                                return;
                                                            }
                                                            o.LJIJI("awemeItem");
                                                            throw null;
                                                        }
                                                        o.LJIJI("autoCaptionAdapter");
                                                        throw null;
                                                    }
                                                    o.LJIJI("videoStickerAdapter");
                                                    throw null;
                                                }
                                                o.LJIJI("videoStitchAdapter");
                                                throw null;
                                            }
                                            o.LJIJI("videoDuetAdapter");
                                            throw null;
                                        }
                                        o.LJIJI("videoCommentAdapter");
                                        throw null;
                                    }
                                    o.LJIJI("geoFencingAdapter");
                                    throw null;
                                }
                                o.LJIJI("visibilitySelectAdapter");
                                throw null;
                            }
                            o.LJIJI("storyConvertToNormalAdapter");
                            throw null;
                        }
                        o.LJIJI("awemeItem");
                        throw null;
                    }
                    o.LJIJI("awemeItem");
                    throw null;
                }
                o.LJIJI("visibilityPermissionViewModel");
                throw null;
            }
            o.LJIJI("visibilityPermissionViewModel");
            throw null;
        }
        o.LJIJI("awemeItem");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahm, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
