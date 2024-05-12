package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.A90;
import X.APM;
import X.APN;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.C03880Dg;
import X.C113554cx;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C26227ARb;
import X.C36636EZk;
import X.C3C5;
import X.C43370H0k;
import X.C43371H0l;
import X.C43493H5d;
import X.C43858HJe;
import X.C43861HJh;
import X.C44172HVg;
import X.C52977Kqj;
import X.C5H3;
import X.C60903NvH;
import X.C65232Piu;
import X.C65300Pk0;
import X.C68322mC;
import X.C72121SSf;
import X.C72164STw;
import X.C72404SbI;
import X.C72406SbK;
import X.C72410SbO;
import X.C72411SbP;
import X.C72413SbR;
import X.C76800UCe;
import X.C76L;
import X.C780334l;
import X.C78555UsJ;
import X.C78613UtF;
import X.C84654XKg;
import X.EnumC169566l6;
import X.EnumC244439iZ;
import X.EnumC72154STm;
import X.EnumC72156STo;
import X.EnumC72412SbQ;
import X.FMX;
import X.H8C;
import X.H90;
import X.InterfaceC41948GdE;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.RunnableC65751PrH;
import X.SSF;
import X.UC0;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCServiceImpl;
import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class AIGCPictureHandler implements InterfaceC41948GdE, OnActivityResultCallback {
    public static AIGCAvatarAuthConfig LJLL;
    public static boolean hasDownloadModel;
    public final EnumC244439iZ LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public Activity LJLJJL;
    public List<String> LJLJJLL;
    public InterfaceC88472Yns<? super List<String>, C76800UCe> LJLJL;
    public String LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final Map<String, HandleResult> cacheCropResultMap;
    public final boolean isFastPath;
    public final int minCount;
    public final Map<String, String> tokenMap;
    public static final H90 Companion = new H90();
    public static final C5H3<H8C> pathService$delegate = C221108m2.LIZIZ(C43371H0l.LJLIL);

    /* loaded from: classes13.dex */
    public static final class HandleResult {
        public final String bingoPath;
        public final VEFaceDetectCropResult cropResult;
        public final String slowPath;
        public final String smashPath;

        public static /* synthetic */ HandleResult copy$default(HandleResult handleResult, VEFaceDetectCropResult vEFaceDetectCropResult, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                vEFaceDetectCropResult = handleResult.cropResult;
            }
            if ((i & 2) != 0) {
                str = handleResult.bingoPath;
            }
            if ((i & 4) != 0) {
                str2 = handleResult.smashPath;
            }
            if ((i & 8) != 0) {
                str3 = handleResult.slowPath;
            }
            return handleResult.copy(vEFaceDetectCropResult, str, str2, str3);
        }

        public final HandleResult copy(VEFaceDetectCropResult cropResult, String str, String str2, String str3) {
            o.LJIIIZ(cropResult, "cropResult");
            return new HandleResult(cropResult, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleResult)) {
                return false;
            }
            HandleResult handleResult = (HandleResult) obj;
            return o.LJ(this.cropResult, handleResult.cropResult) && o.LJ(this.bingoPath, handleResult.bingoPath) && o.LJ(this.smashPath, handleResult.smashPath) && o.LJ(this.slowPath, handleResult.slowPath);
        }

        public int hashCode() {
            int hashCode = this.cropResult.hashCode() * 31;
            String str = this.bingoPath;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.smashPath;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.slowPath;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HandleResult(cropResult=");
            LIZ.append(this.cropResult);
            LIZ.append(", bingoPath=");
            LIZ.append(this.bingoPath);
            LIZ.append(", smashPath=");
            LIZ.append(this.smashPath);
            LIZ.append(", slowPath=");
            return q.LIZIZ(LIZ, this.slowPath, ')', LIZ);
        }

        public final String getBingoPath() {
            return this.bingoPath;
        }

        public final VEFaceDetectCropResult getCropResult() {
            return this.cropResult;
        }

        public final String getSlowPath() {
            return this.slowPath;
        }

        public final String getSmashPath() {
            return this.smashPath;
        }

        public HandleResult(VEFaceDetectCropResult cropResult, String str, String str2, String str3) {
            o.LJIIIZ(cropResult, "cropResult");
            this.cropResult = cropResult;
            this.bingoPath = str;
            this.smashPath = str2;
            this.slowPath = str3;
        }

        public /* synthetic */ HandleResult(VEFaceDetectCropResult vEFaceDetectCropResult, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(vEFaceDetectCropResult, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    public final String getAigcType() {
        if (this.isFastPath) {
            return "fast";
        }
        return "slow";
    }

    public final Object downloadModel(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (hasDownloadModel) {
            Boolean bool = Boolean.TRUE;
            C3C5.m7constructorimpl(bool);
            c84654XKg.resumeWith(bool);
        } else {
            List list = (List) C52977Kqj.LIZ.getValue();
            if (list.isEmpty()) {
                Boolean bool2 = Boolean.FALSE;
                C3C5.m7constructorimpl(bool2);
                c84654XKg.resumeWith(bool2);
            } else {
                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"TikTokAIGC"}, C113554cx.LJJLIIIIJ(new OSZ("TikTokAIGC", list)), new C72410SbO(c84654XKg));
            }
        }
        return c84654XKg.LIZ();
    }

    public final String getGenerateParam(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            HandleResult handleResult = this.cacheCropResultMap.get(it.next());
            if (handleResult != null) {
                if (this.isFastPath) {
                    String str = this.tokenMap.get(handleResult.getBingoPath());
                    if (str != null) {
                        jSONArray.put(LIZ(handleResult.getCropResult().getBoyProb(), str, handleResult.getCropResult().getSkinTone()));
                    }
                    String str2 = this.tokenMap.get(handleResult.getSmashPath());
                    if (str2 != null) {
                        jSONArray.put(LIZ(handleResult.getCropResult().getBoyProb(), str2, handleResult.getCropResult().getSkinTone()));
                    }
                } else {
                    String str3 = this.tokenMap.get(handleResult.getSlowPath());
                    if (str3 != null) {
                        jSONArray.put(LIZ(handleResult.getCropResult().getBoyProb(), str3, handleResult.getCropResult().getSkinTone()));
                    }
                }
            }
        }
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "requestParam.toString()");
        return jSONArray2;
    }

    public final Object getUploadAuthKeyConfig(InterfaceC67352kd<? super AIGCAvatarAuthConfig> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C76L<VideoCreation> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().LIZJ(C113554cx.LJJJZ(new OSZ("purpose", "aigc_avatar")));
        LIZJ.LJFF(new RunnableC65751PrH(LIZJ, new C43493H5d(c84654XKg)), EnumC169566l6.LJLIL);
        return c84654XKg.LIZ();
    }

    public final void setFinishFlowCallback(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJLLL = callback;
    }

    public static final JSONObject LIZ(float f, String str, int i) {
        JSONObject LIZJ = C65232Piu.LIZJ("uri", str);
        LIZJ.put("gender", Float.valueOf(f));
        if (((Boolean) C52977Kqj.LIZIZ.getValue()).booleanValue()) {
            LIZJ.put("skin_color", String.valueOf(i));
        }
        return LIZJ;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        String str3;
        Bundle LLJJIJI;
        String str4 = null;
        r9 = null;
        Object obj = null;
        String str5 = null;
        Serializable serializable = null;
        String str6 = null;
        if (i != 101) {
            if (i != 102 || i2 != 301 || this.LJLJJL == null || this.LJLJJLL == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            if (intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
                obj = C16880lQ.LLJJIII(LLJJIJI, "aigc_profile_style_result_list");
            }
            String[] strArr = (String[]) obj;
            if (strArr != null) {
                for (String str7 : strArr) {
                    jSONArray.put(str7);
                }
            }
            Activity activity = this.LJLJJL;
            if (activity != null) {
                List<String> list = this.LJLJJLL;
                if (list != null) {
                    openProgressPage(activity, getGenerateParam(list), jSONArray.toString());
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        String str8 = "";
        switch (i2) {
            case 201:
                if (this.LJLJJL == null) {
                    return;
                }
                if (intent != null) {
                    serializable = intent.getSerializableExtra("key_avatar_result");
                }
                C72121SSf c72121SSf = (C72121SSf) serializable;
                if (c72121SSf == null) {
                    return;
                }
                IProfileAIGCService LJFF = ProfileAIGCServiceImpl.LJFF();
                Activity activity2 = this.LJLJJL;
                if (activity2 != null) {
                    LJFF.LIZLLL(activity2, APM.TOOLS_CREATION_FLOW, APN.AI_AVATAR_CREATING_PAGE, null, c72121SSf);
                    Activity activity3 = this.LJLJJL;
                    if (activity3 != null) {
                        activity3.finish();
                    }
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLLL;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            case 202:
            default:
                return;
            case 203:
                if (!this.LJLJI) {
                    if (intent != null) {
                        str2 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
                        str6 = C16880lQ.LLJJIJIIJIL(intent, "enter_method");
                    } else {
                        str2 = null;
                    }
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLJJL, "//aivatar/intro/v2");
                    buildRoute.withParam("enter_from", str2);
                    buildRoute.withParam("enter_method", str6);
                    buildRoute.withParam("intro_page_nav_bar", true);
                    buildRoute.open();
                }
                Activity activity4 = this.LJLJJL;
                if (activity4 != null) {
                    activity4.finish();
                    return;
                }
                return;
            case 204:
                if (intent != null) {
                    str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
                    str4 = C16880lQ.LLJJIJIIJIL(intent, "enter_method");
                } else {
                    str = null;
                }
                IAIGCAvatarService LJIILL = AIGCAvatarServiceImpl.LJIILL();
                o.LJIIIIZZ(LJIILL, "get().getService(IAIGCAvatarService::class.java)");
                EnumC244439iZ enumC244439iZ = this.LJLIL;
                Activity activity5 = this.LJLJJL;
                o.LJII(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity5;
                if (str == null) {
                    str = "";
                }
                if (str4 != null) {
                    str8 = str4;
                }
                SSF.LIZ(LJIILL, enumC244439iZ, activityC45651qj, false, str, str8, 28);
                Activity activity6 = this.LJLJJL;
                if (activity6 != null) {
                    activity6.finish();
                    return;
                }
                return;
            case 205:
                if (this.LJLJJL == null) {
                    return;
                }
                if (intent != null) {
                    str3 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
                    str5 = C16880lQ.LLJJIJIIJIL(intent, "enter_method");
                } else {
                    str3 = null;
                }
                if (this.isFastPath) {
                    IAIGCAvatarService LJIILL2 = AIGCAvatarServiceImpl.LJIILL();
                    o.LJIIIIZZ(LJIILL2, "get().getService(IAIGCAvatarService::class.java)");
                    EnumC244439iZ enumC244439iZ2 = this.LJLIL;
                    Activity activity7 = this.LJLJJL;
                    o.LJII(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) activity7;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (str5 != null) {
                        str8 = str5;
                    }
                    LJIILL2.LJIILJJIL(activityC45651qj2, enumC244439iZ2, str3, str8, false);
                } else {
                    IAIGCAvatarService LJIILL3 = AIGCAvatarServiceImpl.LJIILL();
                    o.LJIIIIZZ(LJIILL3, "get().getService(IAIGCAvatarService::class.java)");
                    EnumC244439iZ enumC244439iZ3 = this.LJLIL;
                    Activity activity8 = this.LJLJJL;
                    o.LJII(activity8, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ActivityC45651qj activityC45651qj3 = (ActivityC45651qj) activity8;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (str5 != null) {
                        str8 = str5;
                    }
                    SSF.LIZ(LJIILL3, enumC244439iZ3, activityC45651qj3, false, str3, str8, 28);
                }
                Activity activity9 = this.LJLJJL;
                if (activity9 != null) {
                    activity9.finish();
                }
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJLLL;
                if (interfaceC65784Pro2 == null) {
                    return;
                }
                interfaceC65784Pro2.invoke();
                return;
            case 206:
                Activity activity10 = this.LJLJJL;
                if (activity10 != null) {
                    AnonymousClass114.LIZ(activity10, R.string.ep);
                    return;
                }
                return;
        }
    }

    public final void openProgressPage(Activity activity, String str, String str2) {
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//aivatar/progress");
        buildRoute.withParam("path_mode", this.isFastPath);
        buildRoute.withParam("aigc_generate_param", str);
        buildRoute.withParam("enter_from_for_progress", this.LJLJLJ);
        if (str2 != null) {
            buildRoute.withParam("aigc_style_param", str2);
        }
        buildRoute.open(101, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.XKQ] */
    public static final void checkValidAndUpload$continueRun(AIGCPictureHandler aIGCPictureHandler, Activity activity, List<String> list, InterfaceC88472Yns<? super List<String>, C76800UCe> interfaceC88472Yns) {
        aIGCPictureHandler.LJLJJL = activity;
        aIGCPictureHandler.LJLJJLL = list;
        aIGCPictureHandler.LJLJL = interfaceC88472Yns;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C72164STw.LIZ(EnumC72154STm.TOTAL, EnumC72156STo.START, null, aIGCPictureHandler.getAigcType(), null, null, 52);
        C68322mC c68322mC = new C68322mC();
        A90 a90 = new A90(activity);
        a90.LIZJ(activity.getResources().getString(R.string.ej));
        a90.LIZIZ(false);
        a90.LJLJJLL = new C72406SbK(c68322mC, aIGCPictureHandler, elapsedRealtime);
        a90.LIZLLL(0.0f);
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a90, new Object[0], "void", new C65300Pk0(false, "()V", "5453812829317343448")).LIZ) {
            a90.show();
        }
        c68322mC.element = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C72404SbI(aIGCPictureHandler, elapsedRealtime, activity, a90, list, interfaceC88472Yns, null), 2);
    }

    @Override // X.InterfaceC41948GdE
    public void checkValidAndUpload(Activity activity, List<String> mediaList, String enterFrom, InterfaceC88472Yns<? super List<String>, C76800UCe> invalidCallback) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(mediaList, "mediaList");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(invalidCallback, "invalidCallback");
        if (!C44172HVg.LJIJ.isLogin()) {
            return;
        }
        String shootWay = this.LJLILLLLZI;
        String enterMethod = this.LJLJJI;
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterMethod, "enterMethod");
        String value = EnumC72412SbQ.UPLOAD_CONTENT_NEXT.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("content_type", "photo");
        c188727au.LJIIIZ("content_source", "upload");
        c188727au.LJIIIZ("shoot_way", shootWay);
        c188727au.LJIIIZ("enter_method", enterMethod);
        FMX.LJIIL(value, c188727au.LIZ);
        this.LJLJLJ = enterFrom;
        if (this.isFastPath) {
            C26227ARb c26227ARb = new C26227ARb(activity);
            c26227ARb.LIZIZ(activity.getResources().getQuantityString(R.plurals.f, 3, 3));
            UC0.LIZJ(c26227ARb, new AqS57S0400000_12(this, activity, mediaList, invalidCallback, 5));
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
            if (this.isFastPath) {
                str = "fast";
            } else {
                str = "slow";
            }
            C72413SbR.LIZJ("show", str);
            return;
        }
        checkValidAndUpload$continueRun(this, activity, mediaList, invalidCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadImage(java.util.List<java.lang.String> r16, java.util.Map<java.lang.String, java.lang.String> r17, X.InterfaceC88472Yns<? super java.lang.Float, X.C76800UCe> r18, X.InterfaceC67352kd<? super java.lang.Boolean> r19) {
        /*
            r15 = this;
            r3 = r19
            r10 = r16
            r13 = r18
            r11 = r17
            boolean r0 = r3 instanceof X.C72409SbN
            if (r0 == 0) goto L9e
            r14 = r3
            X.SbN r14 = (X.C72409SbN) r14
            int r2 = r14.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r14.LJLJL = r2
        L1a:
            java.lang.Object r12 = r14.LJLJJL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLJL
            r7 = 1
            r5 = 2
            r4 = 0
            if (r0 == 0) goto L3d
            if (r0 == r7) goto L2d
            if (r0 != r5) goto La5
            X.C141335gf.LIZJ(r12)
        L2c:
            return r12
        L2d:
            X.Yns r13 = r14.LJLJJI
            java.lang.Object r11 = r14.LJLJI
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r10 = r14.LJLILLLLZI
            java.util.List r10 = (java.util.List) r10
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler r9 = r14.LJLIL
            X.C141335gf.LIZJ(r12)
            goto L61
        L3d:
            X.C141335gf.LIZJ(r12)
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r0 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.LJLL
            if (r0 != 0) goto L66
        L44:
            r0 = 0
        L45:
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r12 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.LJLL
            r9 = r15
        L4a:
            if (r12 != 0) goto L8d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L4f:
            r14.LJLIL = r15
            r14.LJLILLLLZI = r10
            r14.LJLJI = r11
            r14.LJLJJI = r13
            r14.LJLJL = r7
            java.lang.Object r12 = r15.getUploadAuthKeyConfig(r14)
            if (r12 != r6) goto L60
            return r6
        L60:
            r9 = r15
        L61:
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r12 = (com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig) r12
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.LJLL = r12
            goto L4a
        L66:
            java.lang.String r2 = r0.expireTime
            if (r2 != 0) goto L6b
            goto L44
        L6b:
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss'Z'"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L44
            r0.<init>(r1)     // Catch: java.lang.Exception -> L44
            java.util.Date r0 = r0.parse(r2)     // Catch: java.lang.Exception -> L44 java.text.ParseException -> L77
            goto L78
        L77:
            r0 = r4
        L78:
            if (r0 != 0) goto L7b
            goto L44
        L7b:
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L44
            long r2 = r0.getTime()     // Catch: java.lang.Exception -> L44
            r0 = 10000(0x2710, float:1.4013E-41)
            long r0 = (long) r0     // Catch: java.lang.Exception -> L44
            long r2 = r2 - r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L44
            r0 = 1
            goto L45
        L8d:
            r14.LJLIL = r4
            r14.LJLILLLLZI = r4
            r14.LJLJI = r4
            r14.LJLJJI = r4
            r14.LJLJL = r5
            java.lang.Object r12 = r9.uploadImage(r10, r11, r12, r13, r14)
            if (r12 != r6) goto L2c
            return r6
        L9e:
            X.SbN r14 = new X.SbN
            r14.<init>(r15, r3)
            goto L1a
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.uploadImage(java.util.List, java.util.Map, X.Yns, X.2kd):java.lang.Object");
    }

    public final Object cropAndGetInformation(String str, String str2, String str3, String str4, InterfaceC67352kd<? super VEFaceDetectCropResult> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C72411SbP(str, this, str2, str3, str4, null), interfaceC67352kd);
    }

    public final Object uploadImage(List<String> list, Map<String, String> map, AIGCAvatarAuthConfig aIGCAvatarAuthConfig, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C43858HJe c43858HJe = new C43858HJe(aIGCAvatarAuthConfig);
        int size = list.size();
        String[] filePaths = (String[]) list.toArray(new String[0]);
        o.LJIIIZ(filePaths, "filePaths");
        c43858HJe.LIZ.setFilePath(size, filePaths);
        c43858HJe.LIZ.setListener(new C43861HJh(new C43370H0k(map, list, c84654XKg, c43858HJe, interfaceC88472Yns)));
        c43858HJe.LIZ.start();
        return c84654XKg.LIZ();
    }

    public AIGCPictureHandler(boolean z, EnumC244439iZ business, int i, String shootWay, boolean z2, String enterMethod) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.isFastPath = z;
        this.LJLIL = business;
        this.minCount = i;
        this.LJLILLLLZI = shootWay;
        this.LJLJI = z2;
        this.LJLJJI = enterMethod;
        this.cacheCropResultMap = new LinkedHashMap();
        this.tokenMap = new LinkedHashMap();
    }
}
