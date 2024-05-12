package Y;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10I;
import X.C10K;
import X.C126494xp;
import X.C145995oB;
import X.C173156qt;
import X.C173166qu;
import X.C217818gj;
import X.C220858ld;
import X.C26284ATg;
import X.C31413CUn;
import X.C32151Nz;
import X.C34K;
import X.C41809Gaz;
import X.C41811Gb1;
import X.C42041Gej;
import X.C42111Gfr;
import X.C42622Go6;
import X.C43615H9v;
import X.C43618H9y;
import X.C43621HAb;
import X.C43622HAc;
import X.C43624HAe;
import X.C43761HFl;
import X.C43763HFn;
import X.C43764HFo;
import X.C43765HFp;
import X.C43767HFr;
import X.C43768HFs;
import X.C43769HFt;
import X.C43770HFu;
import X.C43976HNs;
import X.C44065HRd;
import X.C44172HVg;
import X.C44422Hc2;
import X.C45804HyK;
import X.C56509MFt;
import X.C59406NTe;
import X.C60903NvH;
import X.C61878OQg;
import X.C68322mC;
import X.C73411SrX;
import X.C73969T1h;
import X.C76732zl;
import X.C76800UCe;
import X.C78685UuP;
import X.C78855Ux9;
import X.DialogC42922Gsw;
import X.EnumC44070HRi;
import X.FMX;
import X.H78;
import X.H7R;
import X.HAQ;
import X.HDU;
import X.HG5;
import X.HG7;
import X.HG8;
import X.HGA;
import X.HGJ;
import X.HGQ;
import X.IBD;
import X.ICT;
import X.InterfaceC42726Gpm;
import X.InterfaceC44688HgK;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.T16;
import X.V1M;
import X.W5G;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.assetpacks.r2;
import com.google.gson.j;
import com.ss.android.ugc.aweme.AnchorRecentlyAddFragment;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.api.AnchorSearchResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commerce.tools.common.EventCenter;
import com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishDialogFragment;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMediaParser;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.q;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes8.dex */
public class AgS110S0200000_7 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final Object then$20(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        C43770HFu.LJI((C43770HFu) agS110S0200000_7.l0, (HGQ) agS110S0200000_7.l1, c10k);
        return null;
    }

    @Override // X.C10I
    public final Object then(C10K<Bitmap> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            case 12:
                return then$12(this, c10k);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return then$13(this, c10k);
            case 14:
                return then$14(this, c10k);
            case 15:
                return then$15(this, c10k);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return then$16(this, c10k);
            case 17:
                return then$17(this, c10k);
            case 18:
                return then$18(this, c10k);
            case 19:
                return then$19(this, c10k);
            case 20:
                return then$20(this, c10k);
            case 21:
                return then$21(this, c10k);
            case 22:
                return then$22(this, c10k);
            case 23:
                return then$23(this, c10k);
            case 24:
                return then$24(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS110S0200000_7 agS110S0200000_7, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIILIIL()) {
            Bitmap bitmap = (Bitmap) task.LJIIJJI();
            W5G w5g = ((C43976HNs) agS110S0200000_7.l0).LJLJJI;
            if (w5g != null) {
                w5g.setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (bitmap.getWidth() / bitmap.getHeight() == w5g.getWidth() / w5g.getHeight()) {
                    float LJIIZILJ = (C32151Nz.LJIIZILJ(Float.valueOf(2.0f)) / w5g.getWidth()) * bitmap.getWidth();
                    float LJIIZILJ2 = (C32151Nz.LJIIZILJ(Float.valueOf(2.0f)) / w5g.getHeight()) * bitmap.getHeight();
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    RectF rectF = new RectF(rect);
                    paint.setAntiAlias(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-12434878);
                    canvas.drawRoundRect(rectF, LJIIZILJ, LJIIZILJ2, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rect, paint);
                    w5g.setImageBitmap(createBitmap);
                } else {
                    w5g.setImageBitmap(bitmap);
                }
            }
        }
        ((VEMediaParser) agS110S0200000_7.l1).release();
        return null;
    }

    public static final Object then$1(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        TextView textView = ((ParallelPublishDialogFragment) agS110S0200000_7.l0).LJLJLLL;
        if (textView != null) {
            textView.startAnimation((AnimationSet) agS110S0200000_7.l1);
            return null;
        }
        o.LJIJI("autoUploadingText");
        throw null;
    }

    public static final Object then$10(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        boolean z;
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "isSuccess.result");
        if (((Boolean) LJIIJJI).booleanValue()) {
            ((IBD) agS110S0200000_7.l0).LIZ((ICT) agS110S0200000_7.l1);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object then$11(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        List<?> list;
        if (((BaseResponse) c10k.LJIIJJI()).status_code == 0) {
            C31413CUn c31413CUn = ((AnchorRecentlyAddFragment) agS110S0200000_7.l0).LJLJJL;
            if (c31413CUn != null && (list = c31413CUn.LJLIL) != null) {
                list.clear();
            }
            C31413CUn c31413CUn2 = ((AnchorRecentlyAddFragment) agS110S0200000_7.l0).LJLJJL;
            if (c31413CUn2 != null) {
                c31413CUn2.notifyDataSetChanged();
            }
            InterfaceC42726Gpm interfaceC42726Gpm = (InterfaceC42726Gpm) agS110S0200000_7.l1;
            if (interfaceC42726Gpm != null) {
                interfaceC42726Gpm.LJLLLL();
            }
            ((AnchorRecentlyAddFragment) agS110S0200000_7.l0).vl(false);
            ActivityC45651qj mo49getActivity = ((AnchorRecentlyAddFragment) agS110S0200000_7.l0).mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.onBackPressed();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$12(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        if (c10k == null || !((Boolean) c10k.LJIIJJI()).booleanValue()) {
            r2 r2Var = (r2) agS110S0200000_7.l0;
            if (r2Var != null) {
                r2Var.LIZ((AVMusic) agS110S0200000_7.l1, false);
                return null;
            }
            return null;
        }
        r2 r2Var2 = (r2) agS110S0200000_7.l0;
        if (r2Var2 == null) {
            return null;
        }
        r2Var2.LIZ((AVMusic) agS110S0200000_7.l1, true);
        return null;
    }

    public static final Object then$13(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        TextView textView = ((C42041Gej) agS110S0200000_7.l0).LJLL;
        if (textView != null) {
            textView.startAnimation((AnimationSet) agS110S0200000_7.l1);
            return null;
        }
        o.LJIJI("autoUploadingText");
        throw null;
    }

    public static final Object then$14(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        IDAListenerS233S0100000_7 iDAListenerS233S0100000_7 = (IDAListenerS233S0100000_7) agS110S0200000_7.l0;
        AnimationSet animationSet = (AnimationSet) agS110S0200000_7.l1;
        TextView textView = ((PublishDialogFragment) iDAListenerS233S0100000_7.l0).LJLJJI;
        Objects.requireNonNull(textView);
        textView.startAnimation(animationSet);
        return null;
    }

    public static final Object then$15(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        Activity LJIJJ;
        ICreativeSAAService LIZ;
        if (c10k.LJIILJJIL() || c10k.LJIIL()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("retry_scene", String.valueOf(((PromoteReplaceMusicRequest) agS110S0200000_7.l0).getRetryScene()));
            c145995oB.LJI("modify_music_id", ((PromoteReplaceMusicRequest) agS110S0200000_7.l0).getReplaceMusicRequest().getEditMusicStruct().getMusicID());
            c145995oB.LJI("pre_music_id", ((PromoteReplaceMusicRequest) agS110S0200000_7.l0).getOriginalMusicID());
            c145995oB.LJI("item_id", ((PromoteReplaceMusicRequest) agS110S0200000_7.l0).getItemID());
            FMX.LJIIL("Promote_modify_music_request_failed", c145995oB.LIZ);
        } else {
            Context context = (Context) agS110S0200000_7.l1;
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (LIZ = SAAService.LIZ()) != null) {
                LIZ.finishCurrentPage(LJIJJ);
            }
            Context context2 = (Context) agS110S0200000_7.l1;
            if (context2 != null) {
                if (C42622Go6.LJIILJJIL) {
                    String uri = UriProtector.parse(C59406NTe.LJFF(Long.valueOf(System.currentTimeMillis()), C42622Go6.LIZJ, "modify_setting")).buildUpon().appendQueryParameter("type", "change_music").build().toString();
                    o.LJIIIIZZ(uri, "parse(schema)\n          …      .build().toString()");
                    SmartRouter.buildRoute(context2, uri).open();
                    IEventCenter LIZIZ = EventCenter.LIZIZ();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("itemId", C42622Go6.LIZJ);
                    String jSONObject2 = jSONObject.toString();
                    o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                    LIZIZ.LIZ("promote_change_music_post", jSONObject2);
                } else {
                    SmartRoute buildRoute = SmartRouter.buildRoute(context2, (String) C42622Go6.LJII.getValue());
                    buildRoute.withParam("user_account_type", C42622Go6.LIZIZ);
                    buildRoute.withParam("item_id", C42622Go6.LIZJ);
                    buildRoute.withParam("new_user", C42622Go6.LIZLLL);
                    buildRoute.open();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$16(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        boolean z;
        int i;
        j jVar;
        j jVar2;
        String str;
        C43615H9v c43615H9v = (C43615H9v) agS110S0200000_7.l0;
        if (c43615H9v.LJII) {
            MvThemeData mvThemeData = c43615H9v.LIZJ;
            o.LJI(mvThemeData);
            String LJIIIZ = mvThemeData.LJIIIZ();
            o.LJI(LJIIIZ);
            ArrayList<String> arrayList = ((MvCreateVideoData) agS110S0200000_7.l1).selectMediaList;
            o.LJIIIIZZ(arrayList, "videoData.selectMediaList");
            MvCreateVideoData mvCreateVideoData = (MvCreateVideoData) agS110S0200000_7.l1;
            VEMVAlgorithmConfig mVAlgorithmConfigs = VEUtils.getMVAlgorithmConfigs(LJIIIZ, arrayList);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MvMediaProcessImpl serverExecute algorithmConfig is null ");
            if (mVAlgorithmConfigs == null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            H78.LJI(X1D.LIZIZ(LIZ));
            String str2 = "";
            if (mVAlgorithmConfigs == null) {
                c43615H9v.LJ().LIZLLL(new AqS157S0100000_7(c43615H9v, 644));
                C173166qu c173166qu = c43615H9v.LJFF;
                if (c173166qu != null) {
                    c173166qu.LIZLLL = System.currentTimeMillis() - c43615H9v.LJIIJJI;
                    c173166qu.LIZ = 1;
                    c173166qu.LIZIZ = 102;
                    c173166qu.LIZJ = "algorithmConfig is null";
                    C173166qu c173166qu2 = c43615H9v.LJFF;
                    if (c173166qu2 != null) {
                        MvThemeData mvThemeData2 = c43615H9v.LIZJ;
                        if (mvThemeData2 == null || (str = mvThemeData2.LJIIJ()) == null) {
                            str = "";
                        }
                        C173156qt.LJ(c173166qu2, str, "", C78855Ux9.LJLJL, "mv");
                        HAQ.LIZIZ(false, c43615H9v.LIZJ, new OSZ(102, "algorithmConfig is null"));
                    } else {
                        o.LJIJI("initMvMobParams");
                        throw null;
                    }
                } else {
                    o.LJIJI("initMvMobParams");
                    throw null;
                }
            } else {
                C43622HAc c43622HAc = (C43622HAc) c43615H9v.LJIILIIL.getValue();
                C43618H9y c43618H9y = new C43618H9y(c43615H9v, mvCreateVideoData);
                c43622HAc.getClass();
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = "";
                C76732zl c76732zl = new C76732zl();
                c43622HAc.LJ.clear();
                ArrayList arrayList2 = new ArrayList();
                VEMVAlgorithmConfig.AlgorithmInfo[] algorithmInfoArr = mVAlgorithmConfigs.infos;
                o.LJIIIIZZ(algorithmInfoArr, "config.infos");
                int length = algorithmInfoArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    VEMVAlgorithmConfig.AlgorithmInfo algorithmInfo = algorithmInfoArr[i2];
                    o.LJIIIIZZ(algorithmInfo, "config.infos");
                    String str3 = algorithmInfo.photoPath;
                    if (str3 == null) {
                        arrayList2.clear();
                        break;
                    }
                    String LIZIZ = c43622HAc.LIZ().LIZIZ(str3);
                    VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem[] algorithmItemArr = algorithmInfo.items;
                    o.LJIIIIZZ(algorithmItemArr, "algorithmInfo.items");
                    String str4 = str2;
                    String str5 = str2;
                    for (VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem algorithmItem : algorithmItemArr) {
                        VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE mv_reesult_out_type = algorithmItem.result_out_type;
                        if (mv_reesult_out_type == null) {
                            i = -1;
                        } else {
                            i = C43624HAe.LIZ[mv_reesult_out_type.ordinal()];
                        }
                        if (i != 1 && i != 2) {
                            if (i == 3 || i == 4) {
                                String LIZIZ2 = c43622HAc.LIZ().LIZIZ(str3);
                                if (algorithmItem.isNeedServerExecute) {
                                    String str6 = algorithmItem.algorithmName;
                                    o.LJIIIIZZ(str6, "item.algorithmName");
                                    if (str6.length() > 0) {
                                        C126494xp LIZ2 = c43622HAc.LIZ();
                                        String str7 = algorithmItem.algorithmName;
                                        o.LJIIIIZZ(str7, "item.algorithmName");
                                        MvNetFileBean LIZ3 = LIZ2.LIZ(LIZIZ2, str7);
                                        if (LIZ3 == null) {
                                            TypedFile typedFile = new TypedFile("image/*", new File(str3));
                                            new com.google.gson.o();
                                            String str8 = algorithmItem.algorithmParamJson;
                                            if (str8 != null && str8.length() != 0) {
                                                try {
                                                    jVar2 = com.google.gson.o.LIZ(algorithmItem.algorithmParamJson);
                                                } catch (Exception unused) {
                                                }
                                                if (!C44172HVg.LJIJ.isChildrenMode() && C44172HVg.LJIJ.isLogin()) {
                                                    AfrApi afrApi = (AfrApi) c43622HAc.LIZIZ.getValue();
                                                    String str9 = algorithmItem.algorithmName;
                                                    o.LJIIIIZZ(str9, "item.algorithmName");
                                                    arrayList2.add(afrApi.getVideoInfo(str9, LIZIZ2, algorithmItem.result_out_type.ordinal(), typedFile, jVar2).LJJJJ(C56509MFt.LJLIL).LJJL(T16.LIZ()));
                                                }
                                            }
                                            jVar2 = null;
                                            if (!C44172HVg.LJIJ.isChildrenMode()) {
                                                AfrApi afrApi2 = (AfrApi) c43622HAc.LIZIZ.getValue();
                                                String str92 = algorithmItem.algorithmName;
                                                o.LJIIIIZZ(str92, "item.algorithmName");
                                                arrayList2.add(afrApi2.getVideoInfo(str92, LIZIZ2, algorithmItem.result_out_type.ordinal(), typedFile, jVar2).LJJJJ(C56509MFt.LJLIL).LJJL(T16.LIZ()));
                                            }
                                        } else {
                                            c43622HAc.LJ.add(LIZ3);
                                        }
                                    }
                                }
                            }
                        } else if (algorithmItem.isNeedServerExecute) {
                            C126494xp LIZ4 = c43622HAc.LIZ();
                            String str10 = algorithmItem.algorithmName;
                            o.LJIIIIZZ(str10, "item.algorithmName");
                            MvNetFileBean LIZ5 = LIZ4.LIZ(LIZIZ, str10);
                            if (LIZ5 == null) {
                                String str11 = algorithmItem.algorithmParamJson;
                                if (str11 == null || str11.length() == 0) {
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    LIZ6.append(str4);
                                    str4 = q.LIZIZ(LIZ6, algorithmItem.algorithmName, ',', LIZ6);
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append(str2);
                                    LIZ7.append(algorithmItem.result_out_type.ordinal());
                                    LIZ7.append(',');
                                    str2 = X1D.LIZIZ(LIZ7);
                                } else {
                                    String LIZIZ3 = c43622HAc.LIZ().LIZIZ(str3);
                                    if (algorithmItem.isNeedServerExecute && C78685UuP.LJJJZ(algorithmItem.algorithmName)) {
                                        C126494xp LIZ8 = c43622HAc.LIZ();
                                        String str12 = algorithmItem.algorithmName;
                                        o.LJIIIIZZ(str12, "item.algorithmName");
                                        MvNetFileBean LIZ9 = LIZ8.LIZ(LIZIZ3, str12);
                                        if (LIZ9 == null) {
                                            TypedFile typedFile2 = new TypedFile("image/*", new File(str3));
                                            new com.google.gson.o();
                                            String str13 = algorithmItem.algorithmParamJson;
                                            if (str13 != null && str13.length() != 0) {
                                                try {
                                                    jVar = com.google.gson.o.LIZ(algorithmItem.algorithmParamJson);
                                                } catch (Exception unused2) {
                                                }
                                                if (!C44172HVg.LJIJ.isChildrenMode() && C44172HVg.LJIJ.isLogin()) {
                                                    AfrApi afrApi3 = (AfrApi) c43622HAc.LIZIZ.getValue();
                                                    String str14 = algorithmItem.algorithmName;
                                                    o.LJIIIIZZ(str14, "item.algorithmName");
                                                    arrayList2.add(afrApi3.getImageInfo(str14, LIZIZ3, String.valueOf(algorithmItem.result_out_type.ordinal()), typedFile2, jVar).LJJJJ(V1M.LJLJJLL).LJJL(T16.LIZ()));
                                                }
                                            }
                                            jVar = null;
                                            if (!C44172HVg.LJIJ.isChildrenMode()) {
                                                AfrApi afrApi32 = (AfrApi) c43622HAc.LIZIZ.getValue();
                                                String str142 = algorithmItem.algorithmName;
                                                o.LJIIIIZZ(str142, "item.algorithmName");
                                                arrayList2.add(afrApi32.getImageInfo(str142, LIZIZ3, String.valueOf(algorithmItem.result_out_type.ordinal()), typedFile2, jVar).LJJJJ(V1M.LJLJJLL).LJJL(T16.LIZ()));
                                            }
                                        } else {
                                            c43622HAc.LJ.add(LIZ9);
                                        }
                                    }
                                }
                            } else {
                                c43622HAc.LJ.add(LIZ5);
                            }
                        }
                    }
                    String LJJZZIII = s.LJJZZIII(",", str4);
                    String LJJZZIII2 = s.LJJZZIII(",", str2);
                    if (LJJZZIII.length() > 0 && !C44172HVg.LJIJ.isChildrenMode() && C44172HVg.LJIJ.isLogin()) {
                        arrayList2.add(((AfrApi) c43622HAc.LIZIZ.getValue()).getImageInfo(LJJZZIII, LIZIZ, LJJZZIII2, new TypedFile("image/*", new File(str3)), null).LJJJJ(C217818gj.LJLIL).LJJL(T16.LIZ()));
                    }
                    i2++;
                    str2 = str5;
                }
                if (arrayList2.isEmpty()) {
                    if (c43622HAc.LJ.isEmpty()) {
                        H78.LJII("MvNetModule submitRequest afrFileBeanList is empty");
                        c43618H9y.LIZIZ((String) c68322mC.element, c43622HAc.LJ);
                    } else {
                        c43618H9y.LIZ(c43622HAc.LJ);
                    }
                } else {
                    c43622HAc.LIZLLL = (C73411SrX) AbstractC73672Svk.LJJLJ(arrayList2, new IDhS66S0200000_2(c76732zl, c68322mC, 1)).LJJIJL(new HDU(c43622HAc, c76732zl)).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new C43621HAb(c76732zl, c43618H9y, c43622HAc, c68322mC), new AfS46S0300000_7(c68322mC, c43618H9y, c43622HAc, 0), new IDaS218S0100000_7(c43622HAc, 0));
                }
            }
        } else {
            c43615H9v.LJ().LIZLLL(new AqS154S0200000_7((C43615H9v) agS110S0200000_7.l0, (MvCreateVideoData) agS110S0200000_7.l1, 125));
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$17(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        ((HGQ) agS110S0200000_7.l0).onFinish(c10k.LJIILIIL());
        ((C43761HFl) agS110S0200000_7.l1).getClass();
        C44422Hc2.LIZJ();
        ((C43761HFl) agS110S0200000_7.l1).LJ();
        return C76800UCe.LIZ;
    }

    public static final Object then$18(AgS110S0200000_7 agS110S0200000_7, C10K task) {
        o.LJIIIZ(task, "task");
        ((HGQ) agS110S0200000_7.l0).onFinish(task.LJIILIIL());
        ((C43768HFs) agS110S0200000_7.l1).getClass();
        C44422Hc2.LIZJ();
        ((C43768HFs) agS110S0200000_7.l1).LJ();
        return null;
    }

    public static final Object then$19(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        ((HGQ) agS110S0200000_7.l0).onFinish(c10k.LJIILIIL());
        ((C43763HFn) agS110S0200000_7.l1).getClass();
        C44422Hc2.LIZJ();
        ((C43763HFn) agS110S0200000_7.l1).LJ();
        return null;
    }

    public static final Object then$2(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        C10K<BaseResponse> uploadAudio;
        if (!c10k.LJIILJJIL() && !c10k.LJIIL()) {
            HG5 hg5 = (HG5) agS110S0200000_7.l0;
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "it.result");
            hg5.getClass();
            Iterator it = ((ArrayList) ((HGJ) LJIIJJI).LIZ).iterator();
            while (it.hasNext()) {
                hg5.LIZ((OriginalSoundUploadTask) it.next());
            }
            OriginalSoundUploadService originalSoundUploadService = (OriginalSoundUploadService) agS110S0200000_7.l1;
            Object LJIIJJI2 = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI2, "it.result");
            HGJ hgj = (HGJ) LJIIJJI2;
            originalSoundUploadService.getClass();
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String LIZ = AVApiImpl.LIZJ().LIZ();
            o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
            OriginalSoundUploadService.AudioUploadApi audioUploadApi = (OriginalSoundUploadService.AudioUploadApi) LIZLLL.create(LIZ).create(OriginalSoundUploadService.AudioUploadApi.class);
            if (((ArrayList) hgj.LIZ).size() > 1) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = ((ArrayList) hgj.LIZ).iterator();
                while (it2.hasNext()) {
                    OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) it2.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aweme_id", originalSoundUploadTask.awemeId);
                    jSONObject.put("audiotrack_uri", originalSoundUploadTask.audioVid);
                    jSONArray.put(jSONObject);
                }
                uploadAudio = audioUploadApi.uploadMultiAudio(jSONArray);
                uploadAudio.LJIJI();
                Iterator it3 = ((ArrayList) hgj.LIZ).iterator();
                while (it3.hasNext()) {
                    OriginalSoundUploadTask originalSoundUploadTask2 = (OriginalSoundUploadTask) it3.next();
                    if (!uploadAudio.LJIILIIL()) {
                        String stackTraceString = Log.getStackTraceString(uploadAudio.LJIIJ());
                        o.LJIIIIZZ(stackTraceString, "getStackTraceString(responseTask.error)");
                        OriginalSoundUploadService.LIZ(originalSoundUploadTask2, stackTraceString, -3003, 0);
                    } else if (uploadAudio.LJIIJJI().error_code != 0) {
                        String baseResponse = uploadAudio.LJIIJJI().toString();
                        o.LJIIIIZZ(baseResponse, "responseTask.result.toString()");
                        OriginalSoundUploadService.LIZ(originalSoundUploadTask2, baseResponse, -3003, 0);
                    } else {
                        OriginalSoundUploadService.LIZ(originalSoundUploadTask2, "", 0, 1);
                    }
                }
            } else {
                OriginalSoundUploadTask originalSoundUploadTask3 = (OriginalSoundUploadTask) ListProtector.get(hgj.LIZ, 0);
                String str = originalSoundUploadTask3.awemeId;
                String str2 = originalSoundUploadTask3.audioVid;
                o.LJI(str2);
                uploadAudio = audioUploadApi.uploadAudio(str, str2);
                uploadAudio.LJIJI();
                if (!uploadAudio.LJIILIIL()) {
                    String stackTraceString2 = Log.getStackTraceString(uploadAudio.LJIIJ());
                    o.LJIIIIZZ(stackTraceString2, "getStackTraceString(responseTask.error)");
                    OriginalSoundUploadService.LIZ(originalSoundUploadTask3, stackTraceString2, -3003, 0);
                } else if (uploadAudio.LJIIJJI().error_code != 0) {
                    String baseResponse2 = uploadAudio.LJIIJJI().toString();
                    o.LJIIIIZZ(baseResponse2, "responseTask.result.toString()");
                    OriginalSoundUploadService.LIZ(originalSoundUploadTask3, baseResponse2, -3003, 0);
                } else {
                    OriginalSoundUploadService.LIZ(originalSoundUploadTask3, "", 0, 1);
                }
            }
            return uploadAudio;
        }
        Exception LJIIJ = c10k.LJIIJ();
        o.LJIIIIZZ(LJIIJ, "it.error");
        throw LJIIJ;
    }

    public static final Object then$21(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        ((HGQ) agS110S0200000_7.l0).onFinish(c10k.LJIILIIL());
        ((C43764HFo) agS110S0200000_7.l1).getClass();
        C44422Hc2.LIZJ();
        ((C43764HFo) agS110S0200000_7.l1).LJ();
        return null;
    }

    public static final Object then$22(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        ((HGQ) agS110S0200000_7.l0).onFinish(c10k.LJIILIIL());
        ((C43765HFp) agS110S0200000_7.l1).getClass();
        C44422Hc2.LIZJ();
        ((C43765HFp) agS110S0200000_7.l1).LJ();
        return C76800UCe.LIZ;
    }

    public static final Object then$23(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        C43769HFt c43769HFt = (C43769HFt) agS110S0200000_7.l0;
        HGQ hgq = (HGQ) agS110S0200000_7.l1;
        c43769HFt.getClass();
        hgq.onFinish(c10k.LJIILIIL());
        C44422Hc2.LIZJ();
        c43769HFt.LJ();
        return null;
    }

    public static final Object then$24(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        C43767HFr c43767HFr = (C43767HFr) agS110S0200000_7.l0;
        HGQ hgq = (HGQ) agS110S0200000_7.l1;
        c43767HFr.getClass();
        hgq.onFinish(c10k.LJIILIIL());
        C44422Hc2.LIZJ();
        c43767HFr.LJ();
        return null;
    }

    public static final Object then$3(AgS110S0200000_7 agS110S0200000_7, C10K it) {
        ((C34K) agS110S0200000_7.l0).element = true;
        InterfaceC44688HgK interfaceC44688HgK = (InterfaceC44688HgK) agS110S0200000_7.l1;
        o.LJIIIIZZ(it, "it");
        interfaceC44688HgK.LIZ(Boolean.valueOf(o.LJ(it.LJIIJJI(), Boolean.TRUE)));
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        C42111Gfr.LIZIZ((int) C42111Gfr.LIZ.LIZ("resize image", "success"), ((MvCreateVideoData) agS110S0200000_7.l0).selectMediaList.size());
        ((InterfaceC65784Pro) agS110S0200000_7.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS110S0200000_7 agS110S0200000_7, C10K task) {
        Resources resources;
        Resources resources2;
        o.LJIIIZ(task, "task");
        String str = null;
        if (task.LJIILJJIL() || task.LJIIL()) {
            C44065HRd c44065HRd = (C44065HRd) agS110S0200000_7.l0;
            Activity activity = c44065HRd.LIZ;
            if (activity != null && (resources = activity.getResources()) != null) {
                str = resources.getString(R.string.imh);
            }
            if (c44065HRd.LIZ != null) {
                c44065HRd.LJII(str, EnumC44070HRi.SERVER_CHECK_DENY);
                c44065HRd.LIZ();
            }
        } else if (!((CheckDuetReactPermissionResponse) task.LJIIJJI()).allowCurrent) {
            String str2 = ((CheckDuetReactPermissionResponse) task.LJIIJJI()).reason;
            if (TextUtils.isEmpty(str2)) {
                Activity activity2 = ((C44065HRd) agS110S0200000_7.l0).LIZ;
                if (activity2 != null && (resources2 = activity2.getResources()) != null) {
                    str = resources2.getString(R.string.rpm);
                }
                str2 = str;
            }
            IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
            if (((Aweme) agS110S0200000_7.l1).getVideo().getVideoLength() > shortVideoConfig.maxConsumerDuetOrStitchVideoTime()) {
                str2 = shortVideoConfig.getErrorHintWhenDisableDuetOrStitch(2);
            }
            C44065HRd c44065HRd2 = (C44065HRd) agS110S0200000_7.l0;
            if (c44065HRd2.LIZ != null) {
                c44065HRd2.LJII(str2, EnumC44070HRi.SERVER_CHECK_DENY);
                c44065HRd2.LIZ();
            }
        } else {
            C44065HRd c44065HRd3 = (C44065HRd) agS110S0200000_7.l0;
            Aweme aweme = c44065HRd3.LIZLLL;
            if (aweme != null) {
                if (!C220858ld.LIZLLL(aweme)) {
                    C10K.LIZJ(new ACallableS110S0100000_7(c44065HRd3, 35)).LJ(new AgS124S0100000_7(c44065HRd3, 21), C10K.LJIIIIZZ, null);
                } else {
                    c44065HRd3.LJIIIIZZ();
                }
            } else {
                o.LJIJI("mAweme");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$6(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        int i;
        if (!c10k.LJIIL() && !c10k.LJIILJJIL()) {
            C41809Gaz c41809Gaz = (C41809Gaz) agS110S0200000_7.l0;
            ExtractFramesModel extractFramesModel = (ExtractFramesModel) agS110S0200000_7.l1;
            if (extractFramesModel == null) {
                VideoPublishEditModel videoPublishEditModel = c41809Gaz.LJFF;
                if (videoPublishEditModel != null) {
                    extractFramesModel = videoPublishEditModel.extractFramesModel;
                    if (extractFramesModel == null) {
                        c41809Gaz.getClass();
                        throw new C41811Gb1(20006, "extract frames model is null", null, 4, null);
                    }
                } else {
                    o.LJIJI("editModel");
                    throw null;
                }
            }
            VideoPublishEditModel videoPublishEditModel2 = c41809Gaz.LJFF;
            if (videoPublishEditModel2 != null) {
                extractFramesModel.setStickerIds(videoPublishEditModel2.mStickerID);
                HG8 hg8 = new HG8();
                hg8.LJIILIIL = 3;
                VideoPublishEditModel videoPublishEditModel3 = c41809Gaz.LJFF;
                if (videoPublishEditModel3 != null) {
                    hg8.LIZIZ = H7R.LJI(videoPublishEditModel3);
                    hg8.LJFF = extractFramesModel;
                    VideoPublishEditModel videoPublishEditModel4 = c41809Gaz.LJFF;
                    if (videoPublishEditModel4 != null) {
                        hg8.LJIIIZ = videoPublishEditModel4.creativeModel.draftInfoModel.isDraft;
                        String cameraIds = videoPublishEditModel4.getCameraIds();
                        boolean z = false;
                        if (cameraIds == null || cameraIds.length() == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        hg8.LJIIJ = i ^ 1;
                        VideoPublishEditModel videoPublishEditModel5 = c41809Gaz.LJFF;
                        if (videoPublishEditModel5 != null) {
                            if (videoPublishEditModel5.mRestoreType == 2) {
                                z = true;
                            }
                            hg8.LJIIJJI = z;
                            hg8.LJI = System.currentTimeMillis();
                            HGA LIZ = hg8.LIZ();
                            c41809Gaz.LJII = LIZ;
                            return LIZ;
                        }
                        o.LJIJI("editModel");
                        throw null;
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("editModel");
            throw null;
        }
        throw new C41811Gb1(20004, null, c10k.LJIIJ(), 2, null);
    }

    public static final Object then$7(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            return C10K.LJIIIIZZ(c10k.LJIIJ());
        }
        VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) agS110S0200000_7.l0;
        HG7 hg7 = (HG7) agS110S0200000_7.l1;
        HGA hga = (HGA) c10k.LJIIJJI();
        videoFramesUploadService.getClass();
        return VideoFramesUploadService.LIZIZ(hg7, hga);
    }

    public static final Object then$8(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            return C10K.LJIIIIZZ(c10k.LJIIJ());
        }
        if (e1.LIZ(31744, "studio_original_frame_save_locally", true, false)) {
            C60903NvH.LJIIJJI().LJJIIJ();
        }
        if (new File(((HGA) c10k.LJIIJJI()).LJFF).exists()) {
            VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) agS110S0200000_7.l1;
            HGA hga = (HGA) c10k.LJIIJJI();
            UploadAuthKeyConfig uploadAuthKeyConfig = ((C41809Gaz) agS110S0200000_7.l0).LJI;
            if (uploadAuthKeyConfig != null) {
                return videoFramesUploadService.LIZJ(hga, uploadAuthKeyConfig);
            }
            o.LJIJI("authkey");
            throw null;
        }
        throw new C41811Gb1(20005, null, null, 6, null);
    }

    public static final Object then$9(AgS110S0200000_7 agS110S0200000_7, C10K c10k) {
        List<AnchorPublishStruct> list;
        ExtensionMisc extensionMisc;
        AnchorPublishStruct anchorPublishStruct;
        AnchorSearchResponse anchorSearchResponse = (AnchorSearchResponse) ((C10K) agS110S0200000_7.l0).LJIIJJI();
        if (anchorSearchResponse != null && anchorSearchResponse.statusCode == 0 && (list = anchorSearchResponse.rankedAnchorList) != null && (!list.isEmpty())) {
            List<AnchorPublishStruct> list2 = anchorSearchResponse.rankedAnchorList;
            DialogC42922Gsw dialogC42922Gsw = (DialogC42922Gsw) agS110S0200000_7.l1;
            for (AnchorPublishStruct anchorPublishStruct2 : list2) {
                anchorPublishStruct2.enable = true;
                HashMap<String, AnchorPublishStruct> hashMap = dialogC42922Gsw.LJZ;
                if (hashMap != null && (anchorPublishStruct = hashMap.get(DialogC42922Gsw.LJJI(anchorPublishStruct2))) != null) {
                    extensionMisc = anchorPublishStruct.extensionMisc;
                } else {
                    extensionMisc = null;
                }
                o.LJI(extensionMisc);
                anchorPublishStruct2.setExtensionMisc(extensionMisc);
                anchorPublishStruct2.setOnClickAction(new AqS154S0200000_7(dialogC42922Gsw, anchorPublishStruct2, 102));
            }
            C26284ATg c26284ATg = ((DialogC42922Gsw) agS110S0200000_7.l1).LJLLL;
            if (c26284ATg != null) {
                c26284ATg.LJLLLLLL(anchorSearchResponse.rankedAnchorList);
            }
            ((DialogC42922Gsw) agS110S0200000_7.l1).findViewById(R.id.h2f).setVisibility(8);
        } else {
            C26284ATg c26284ATg2 = ((DialogC42922Gsw) agS110S0200000_7.l1).LJLLL;
            if (c26284ATg2 != null) {
                c26284ATg2.LJLLLLLL(C61878OQg.INSTANCE);
            }
            ((DialogC42922Gsw) agS110S0200000_7.l1).findViewById(R.id.h2f).setVisibility(0);
        }
        return C76800UCe.LIZ;
    }

    public AgS110S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
