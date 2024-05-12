package X;

import Y.ARunnableS6S0400000_2;
import Y.IDObjectS175S0100000_2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutPrice;
import com.ss.android.ugc.aweme.utils.Au2S13S0100000_2;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163186ao extends AbstractC151235wd {
    public final VideoPublishEditModel LJLIL;
    public final ShoutOutsData LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public SY4 LJLJJLL;
    public W5G LJLJL;
    public SY4 LJLJLJ;
    public TextView LJLJLLL;
    public View LJLL;
    public ShoutOutsData LJLLI;
    public GSU LJLLILLLL;
    public ProgressDialogC43239Gy3 LJLLJ;
    public String LJLLL = "";
    public final Stack<String> LJLLLL = new Stack<>();

    public final W5G LLJILJIL() {
        W5G w5g = this.LJLJL;
        if (w5g != null) {
            return w5g;
        }
        o.LJIJI("coverView");
        throw null;
    }

    public final SY4 LLJILJILJ() {
        SY4 sy4 = this.LJLJLJ;
        if (sy4 != null) {
            return sy4;
        }
        o.LJIJI("postView");
        throw null;
    }

    public final ShoutOutsData LLJJ() {
        ShoutOutsData shoutOutsData = this.LJLLI;
        if (shoutOutsData != null) {
            return shoutOutsData;
        }
        o.LJIJI("shoutOutsData");
        throw null;
    }

    public final void LLJJI() {
        if (requireActivity().isFinishing()) {
            return;
        }
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJLLJ;
        if (progressDialogC43239Gy3 != null) {
            progressDialogC43239Gy3.dismiss();
        }
        C42303Gix.LIZ(1506, GGO.DISMISS, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    public final void LLJJIJI() {
        ShoutoutPrice price = LLJJ().getPrice();
        if (price != null) {
            int coin = price.getCoin();
            TextView textView = this.LJLJLLL;
            if (textView != null) {
                textView.setText(String.valueOf(coin));
                View view = this.LJLL;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("coinsIcon");
                    throw null;
                }
            }
            o.LJIJI("coinsText");
            throw null;
        }
    }

    public final void LLJJIJIIJIL() {
        if (requireActivity().isFinishing()) {
            return;
        }
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJLLJ;
        if (progressDialogC43239Gy3 != null) {
            progressDialogC43239Gy3.cancel();
        }
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        ProgressDialogC43239Gy3 LIZJ = C42034Gec.LIZJ(requireActivity, EnumC42288Gii.GONE, null);
        this.LJLLJ = LIZJ;
        LIZJ.setMessage(requireActivity().getString(R.string.rjz));
        ProgressDialogC43239Gy3 progressDialogC43239Gy32 = this.LJLLJ;
        o.LJI(progressDialogC43239Gy32);
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy32, new Object[0], "void", new C65300Pk0(false, "()V", "-5968247800238646630")).LIZ) {
            progressDialogC43239Gy32.show();
        }
        C42303Gix.LIZ(1506, GGO.SHOW, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        LLJJIII(false);
    }

    public final void LLJJIII(boolean z) {
        String str;
        Integer num;
        if (!z && this.LJLLLL.isEmpty()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        if (!this.LJLLLL.isEmpty()) {
            String pop = this.LJLLLL.pop();
            o.LJIIIIZZ(pop, "pvModStack.pop()");
            str = pop;
        } else {
            str = "video_edit_page";
        }
        c145995oB.LIZLLL("enter_from", str);
        c145995oB.LIZLLL("shoot_entrance", ShoutOutsData.shootWay);
        c145995oB.LIZLLL("shoot_way", ShoutOutsData.shootWay);
        c145995oB.LIZ(LLJJ().getReviewed(), "reviewed");
        if (LLJJ().getPrice() != null) {
            ShoutoutPrice price = LLJJ().getPrice();
            if (price != null) {
                num = Integer.valueOf(price.getCoin());
            } else {
                num = null;
            }
            c145995oB.LIZJ(num, "setting_price");
        }
        FMX.LJIIL("enter_shoutouts_post_page", c145995oB.LIZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        GSU gsu;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.by_);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.cover_view)");
        this.LJLJL = (W5G) requireViewById;
        View requireViewById2 = requireViewById(R.id.aeg);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.back)");
        this.LJLJI = requireViewById2;
        View requireViewById3 = requireViewById(R.id.gm2);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.more)");
        this.LJLJJL = requireViewById3;
        o.LJIIIIZZ(requireViewById(R.id.title), "requireViewById(R.id.title)");
        View requireViewById4 = requireViewById(R.id.mek);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.tv_post)");
        this.LJLJLJ = (SY4) requireViewById4;
        this.LJLLILLLL = (GSU) requireViewById(R.id.cnc);
        View requireViewById5 = requireViewById(R.id.bgn);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.coins)");
        this.LJLJLLL = (TextView) requireViewById5;
        View requireViewById6 = requireViewById(R.id.ifb);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.publish_button)");
        SY4 sy4 = (SY4) requireViewById6;
        this.LJLJJLL = sy4;
        sy4.setButtonVariant(1);
        LLJILJIL().setScaleType(ImageView.ScaleType.CENTER_CROP);
        View requireViewById7 = requireViewById(R.id.bgo);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.coins_layout)");
        this.LJLJJI = requireViewById7;
        View requireViewById8 = requireViewById(R.id.i41);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.price_icon)");
        this.LJLL = requireViewById8;
        GSU gsu2 = this.LJLLILLLL;
        if (gsu2 != null) {
            gsu2.setFilters(new GSW[]{new GSW(gsu2)});
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        if (videoPublishEditModel == null) {
            ShoutOutsData shoutOutsData = this.LJLILLLLZI;
            o.LJI(shoutOutsData);
            this.LJLLI = shoutOutsData;
            this.LJLLL = LLJJ().getDesc();
            LLJILJILJ().setEnabled(false);
            GSU gsu3 = this.LJLLILLLL;
            o.LJI(gsu3);
            gsu3.setText(LLJJ().getDesc());
            GSU gsu4 = this.LJLLILLLL;
            o.LJI(gsu4);
            gsu4.addTextChangedListener(new IDObjectS175S0100000_2(this, 13));
            if (!TextUtils.isEmpty(LLJJ().getCoverUrl())) {
                C78764Uvg.LJIIIZ(LLJILJIL(), LLJJ().getCoverUrl(), -1, -1);
            }
            LLJILJILJ().setText(R.string.ivl);
            View view = this.LJLJJL;
            if (view != null) {
                C16880lQ.LJIIJ(new Au2S13S0100000_2(this, 7), view);
                C16880lQ.LJJIZ(LLJILJILJ(), new Au2S13S0100000_2(this, 8));
                View view2 = this.LJLJI;
                if (view2 != null) {
                    C16880lQ.LJIIJ(new Au2S13S0100000_2(this, 9), view2);
                    SY4 sy42 = this.LJLJJLL;
                    if (sy42 != null) {
                        C16880lQ.LJJIZ(sy42, new Au2S13S0100000_2(this, 10));
                    } else {
                        o.LJIJI("reEditView");
                        throw null;
                    }
                } else {
                    o.LJIJI("backView");
                    throw null;
                }
            } else {
                o.LJIJI("moreView");
                throw null;
            }
        } else {
            ShoutOutsData shoutOutsData2 = videoPublishEditModel.mShoutOutsData;
            o.LJIIIIZZ(shoutOutsData2, "model.mShoutOutsData");
            this.LJLLI = shoutOutsData2;
            final VideoPublishEditModel videoPublishEditModel2 = this.LJLIL;
            if (videoPublishEditModel2.isMvThemeVideoType()) {
                String str = videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath;
                if (C39579Fg7.LIZIZ(str)) {
                    C78764Uvg.LJIIIZ(LLJILJIL(), android.net.Uri.fromFile(new File(str)).toString(), -1, -1);
                }
            } else if (videoPublishEditModel2.isMultiVideoEdit()) {
                MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel2.getCurMultiEditVideoRecordData();
                o.LJIIIIZZ(curMultiEditVideoRecordData, "mModel.curMultiEditVideoRecordData");
                VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
                Pair<Integer, Integer> playInOutTime = videoPublishEditModel2.getCurMultiEditVideoRecordData().getPlayInOutTime();
                LJIIJJI.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
                LLJILJIL().post(new ARunnableS6S0400000_2(videoPublishEditModel2, playInOutTime, this, LJIIJJI, 7));
            } else {
                ArrayList arrayList = new ArrayList();
                if (videoPublishEditModel2.getEffectList() != null) {
                    arrayList.addAll(videoPublishEditModel2.getEffectList());
                }
                EffectPointModel timeEffect = videoPublishEditModel2.getTimeEffect();
                if (timeEffect != null) {
                    arrayList.add(timeEffect);
                    z = o.LJ(timeEffect.getKey(), "1");
                } else {
                    z = false;
                }
                C43679HCh.LIZ(arrayList, H7R.LIZLLL(videoPublishEditModel2, C44172HVg.LJJ.LJIILL().LJI()).getFilterFolder(), videoPublishEditModel2.mSelectedFilterIntensity, (int) (videoPublishEditModel2.mVideoCoverStartTm * 1000), z, videoPublishEditModel2.getPreviewInfo(), videoPublishEditModel2.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() { // from class: X.6ZD
                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public final void onGetVideoCoverFailed(int i) {
                        W5G LLJILJIL = C163186ao.this.LLJILJIL();
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(R.string.jei);
                        C78915Uy7.LJJIJ(LLJILJIL, 2024, creativeToastBuilder);
                    }

                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                        o.LJIIIZ(bitmap, "bitmap");
                        C163186ao.this.LLJILJIL();
                        if (C163186ao.this.requireActivity() != null) {
                            Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel2, bitmap);
                            C163186ao.this.LLJILJIL().setImageDrawable(new C1M5(C163186ao.this.getResources(), LIZJ));
                            C43679HCh.LIZIZ(LIZJ, null, videoPublishEditModel2.getVideoCoverPath());
                        }
                    }
                });
            }
            if (LLJJ().getPrice() == null) {
                LLJILJILJ().setEnabled(false);
            }
            View view3 = this.LJLJJL;
            if (view3 != null) {
                view3.setVisibility(8);
                SY4 sy43 = this.LJLJJLL;
                if (sy43 != null) {
                    sy43.setVisibility(8);
                    if (!TextUtils.isEmpty(videoPublishEditModel2.mShoutOutsData.getDesc()) && (gsu = this.LJLLILLLL) != null) {
                        gsu.setText(videoPublishEditModel2.mShoutOutsData.getDesc());
                    }
                    View view4 = this.LJLJI;
                    if (view4 != null) {
                        C16880lQ.LJIIJ(new Au2S13S0100000_2(this, 12), view4);
                        C16880lQ.LJJIZ(LLJILJILJ(), new TAT() { // from class: X.6ar
                            @Override // X.TAT
                            public final void LIZ(View view5) {
                                if (o.LJ(ShoutOutsData.MODE_EDIT, C163186ao.this.LLJJ().getShoutOutsMode())) {
                                    C163186ao c163186ao = C163186ao.this;
                                    Activity activity = c163186ao.mActivity;
                                    if (activity == null || activity.isFinishing()) {
                                        return;
                                    }
                                    C26227ARb c26227ARb = new C26227ARb(activity);
                                    c26227ARb.LJ(R.string.hij);
                                    String string = c163186ao.getString(R.string.hii);
                                    o.LJIIIIZZ(string, "getString(R.string.intro_submit_popup_desc)");
                                    String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{AVExternalServiceImpl.LIZ().shoutOutsService().getShoutOutSettingsModel().LIZ()}, 1));
                                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                                    c26227ARb.LIZIZ(LLLZ);
                                    UC0.LIZJ(c26227ARb, new AqS168S0100000_2(c163186ao, 529));
                                    c26227ARb.LJI().LIZLLL();
                                    C145995oB c145995oB = new C145995oB();
                                    c145995oB.LIZLLL("enter_from", "shoutouts_post_page");
                                    c145995oB.LIZ(c163186ao.LLJJ().getReviewed(), "reviewed");
                                    FMX.LJIIL("show_review_intro_pop_up", c145995oB.LIZ);
                                    return;
                                }
                                ShoutOutsData shoutOutsData3 = videoPublishEditModel2.mShoutOutsData;
                                GSU gsu5 = C163186ao.this.LJLLILLLL;
                                o.LJI(gsu5);
                                shoutOutsData3.setDesc(String.valueOf(gsu5.getText()));
                                videoPublishEditModel2.mShoutOutsData = C163186ao.this.LLJJ();
                                AVExternalServiceImpl.LIZ().shoutOutsService().publishShoutOuts(SceneExtensionsKt.LIZLLL(C163186ao.this), videoPublishEditModel2, C16880lQ.LLJJIJI(C163186ao.this.requireActivity().getIntent()));
                            }
                        });
                    } else {
                        o.LJIJI("backView");
                        throw null;
                    }
                } else {
                    o.LJIJI("reEditView");
                    throw null;
                }
            } else {
                o.LJIJI("moreView");
                throw null;
            }
        }
        View view5 = this.LJLJJI;
        if (view5 != null) {
            C16880lQ.LJIIJ(new Au2S13S0100000_2(this, 11), view5);
            LLJJ().getPrice();
            LLJJIJI();
            LLJJIII(true);
            return;
        }
        o.LJIJI("coinsLayout");
        throw null;
    }

    public C163186ao(VideoPublishEditModel videoPublishEditModel, ShoutOutsData shoutOutsData) {
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = shoutOutsData;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.blx, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
