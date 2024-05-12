package X;

import Y.ACListenerS16S0301000_1;
import Y.ARunnableS4S0201000_1;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity;
import com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.nows.ui.NowsEditActivity;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS57S0201000_8;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UsT */
/* loaded from: classes14.dex */
public class C78565UsT implements InterfaceC19890qH, InterfaceC41645GWb, InterfaceC26189APp, InterfaceC78568UsW, MR6, InterfaceC48038ItG, InterfaceC63605Oxl, R6I {
    public static final C78565UsT LJLIL = new C78565UsT();
    public static final C78565UsT LJLILLLLZI = new C78565UsT();

    @Override // X.InterfaceC26189APp
    public void FI(boolean z) {
    }

    public void Xa(Exception exc, int i) {
    }

    @Override // X.InterfaceC26189APp
    public void vb0(String str, boolean z) {
    }

    @Override // X.InterfaceC19890qH
    public void onShow() {
        String str;
        C32569CqL.LIZJ.storeBoolean(C32569CqL.LIZIZ(), true);
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        c32785Ctp.getClass();
        BZI LIZIZ = C0N3.LIZIZ("gift_panel_price_sorting_guide_popup_show", "live", "enter_from_method");
        String str2 = c32785Ctp.LJI;
        if (str2 == null) {
            str2 = "icon";
        }
        LIZIZ.LJIJJ(str2, "gift_enter_from");
        LIZIZ.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        String str3 = C32785Ctp.LJIILJJIL;
        if (C32785Ctp.LJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJIJJ(str, str3);
        LIZIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r1 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.lifecycle.LifecycleOwner LJJIIJZLJL(android.view.View r4) {
        /*
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r4, r3)
            r2 = 2131364775(0x7f0a0ba7, float:1.8349397E38)
            java.lang.Object r1 = r4.getTag(r2)
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 != 0) goto L19
            androidx.fragment.app.Fragment r1 = X.C79234V7u.LJIIIZ(r4)
            if (r1 == 0) goto L32
        L16:
            r4.setTag(r2, r1)
        L19:
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L31
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            kotlin.jvm.internal.o.LJIIIZ(r1, r3)
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L2c
            androidx.lifecycle.LifecycleOwner r1 = r1.getViewLifecycleOwner()
        L2c:
            java.lang.String r0 = "if (view != null) viewLifecycleOwner else this"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L31:
            return r1
        L32:
            java.lang.String r0 = "context"
            android.app.Activity r1 = X.FT5.LIZ(r4, r0)
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L41
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 == 0) goto L19
            goto L16
        L41:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78565UsT.LJJIIJZLJL(android.view.View):androidx.lifecycle.LifecycleOwner");
    }

    public static final boolean LJJIIZ(Aweme aweme) {
        Music music;
        boolean z;
        boolean z2;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        o.LJIIIZ(aweme, "<this>");
        Music music2 = aweme.getMusic();
        if ((music2 != null && music2.getId() == 0) || (music = aweme.getMusic()) == null || music.getMusicStatus() != 0) {
            z = false;
        } else {
            z = true;
        }
        AwemeStatus status = aweme.getStatus();
        if (status != null && (videoMuteInfo = status.getVideoMuteInfo()) != null && videoMuteInfo.isMute()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // X.MR6
    public void LIZIZ(Context context) {
        UgAllServiceImpl.LIZ().LIZIZ(context);
    }

    @Override // X.MR6
    public boolean LIZJ(Context context) {
        return UgAllServiceImpl.LIZ().LIZJ(context);
    }

    @Override // X.InterfaceC63605Oxl
    public C63597Oxd LJIIJ(Request request) {
        Pair<String, byte[]> LIZIZ = C63681Oyz.LIZIZ(request);
        return new C63597Oxd((String) LIZIZ.first, (byte[]) LIZIZ.second);
    }

    @Override // X.InterfaceC78568UsW
    public void LJJIFFI(C78593Usv c78593Usv) {
        int i;
        String str = c78593Usv.LIZ;
        int i2 = c78593Usv.LJFF;
        int length = str.length();
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (charAt >= '0' && charAt <= '9' && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = c78593Usv.LIZ.charAt(c78593Usv.LJFF);
            char charAt3 = c78593Usv.LIZ.charAt(c78593Usv.LJFF + 1);
            if (charAt2 >= '0' && charAt2 <= '9' && charAt3 >= '0' && charAt3 <= '9') {
                c78593Usv.LJ((char) AnonymousClass036.LIZIZ(charAt3, -48, (charAt2 - '0') * 10, 130));
                c78593Usv.LJFF += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
        }
        char LIZIZ = c78593Usv.LIZIZ();
        int LJJJI = C78939UyV.LJJJI(c78593Usv.LJFF, 0, c78593Usv.LIZ);
        if (LJJJI != 0) {
            if (LJJJI != 1) {
                if (LJJJI != 2) {
                    if (LJJJI != 3) {
                        if (LJJJI != 4) {
                            if (LJJJI == 5) {
                                c78593Usv.LJ((char) 231);
                                c78593Usv.LJI = 5;
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(LJJJI)));
                        }
                        c78593Usv.LJ((char) 240);
                        c78593Usv.LJI = 4;
                        return;
                    }
                    c78593Usv.LJ((char) 238);
                    c78593Usv.LJI = 3;
                    return;
                }
                c78593Usv.LJ((char) 239);
                c78593Usv.LJI = 2;
                return;
            }
            c78593Usv.LJ((char) 230);
            c78593Usv.LJI = 1;
            return;
        }
        if (C78939UyV.LJJIJIIJI(LIZIZ)) {
            c78593Usv.LJ((char) 235);
            c78593Usv.LJ((char) ((LIZIZ - 128) + 1));
            c78593Usv.LJFF++;
        } else {
            c78593Usv.LJ((char) (LIZIZ + 1));
            c78593Usv.LJFF++;
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C221018lt.LIZJ("TopDataSource", "refreshLive error", it);
        return Boolean.FALSE;
    }

    public static final WPA LJJIIJ(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        return new WPA(parentScene, diContainer, new WQI(C60903NvH.LJIIJJI().LJIILL().LIZIZ(), C60903NvH.LJIIJJI().LJIILL().LJI()), C60903NvH.LJIIJJI().LJIILL().LJII().create(), new AqS118S0300000_14(new C78569UsX(), parentScene, diContainer, 13));
    }

    public static XKQ LJJIJIIJIL(Fragment fragment, InterfaceC88471Ynr interfaceC88471Ynr) {
        MBB context = MBB.INSTANCE;
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(context, "context");
        View view = fragment.getView();
        LifecycleOwner lifecycleOwner = fragment;
        if (view != null) {
            lifecycleOwner = fragment.getViewLifecycleOwner();
        }
        o.LJIIIIZZ(lifecycleOwner, "if (view != null) viewLifecycleOwner else this");
        return LJJIIZI(lifecycleOwner, context, interfaceC88471Ynr);
    }

    public static /* synthetic */ XKQ LJJIJIL(ViewModel viewModel, InterfaceC88471Ynr interfaceC88471Ynr) {
        return LJJIJ(viewModel, MBB.INSTANCE, interfaceC88471Ynr);
    }

    public static void LJJIJLIJ(View view, InterfaceC88471Ynr interfaceC88471Ynr) {
        InterfaceC70422pa interfaceC70422pa;
        AbstractC78621UtN context = C36636EZk.LIZ.LJJIJIL();
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(context, "context");
        LifecycleOwner LJJIIJZLJL = LJJIIJZLJL(view);
        if (LJJIIJZLJL == null || (interfaceC70422pa = LifecycleOwnerKt.getLifecycleScope(LJJIIJZLJL)) == null) {
            interfaceC70422pa = C780334l.LJLIL;
        }
        XKX.LIZLLL(interfaceC70422pa, context, null, interfaceC88471Ynr, 2);
    }

    public static /* synthetic */ void LJJIL(LifecycleOwner lifecycleOwner, InterfaceC88471Ynr interfaceC88471Ynr) {
        LJJIIZI(lifecycleOwner, MBB.INSTANCE, interfaceC88471Ynr);
    }

    public static final void LJJJ(InterfaceC196737np interfaceC196737np, C197057oL c197057oL) {
        String str;
        InterfaceC46811IYt interfaceC46811IYt;
        InterfaceC46811IYt interfaceC46811IYt2 = c197057oL.LIZIZ;
        String str2 = null;
        if (interfaceC46811IYt2 != null) {
            str = interfaceC46811IYt2.getKey();
        } else {
            str = null;
        }
        C197057oL LJIIJ = interfaceC196737np.LJIIJ();
        if (LJIIJ != null && (interfaceC46811IYt = LJIIJ.LIZIZ) != null) {
            str2 = interfaceC46811IYt.getKey();
        }
        if (o.LJ(str2, str)) {
            interfaceC196737np.LJIILJJIL(EnumC196787nu.CELL);
        } else {
            interfaceC196737np.LJIIZILJ(c197057oL);
        }
    }

    public static final void LJJJI(Fragment fragment, Aweme aweme) {
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        String muteDesc;
        o.LJIIIZ(aweme, "<this>");
        if (LJJIIZ(aweme) && fragment != null && (status = aweme.getStatus()) != null && (videoMuteInfo = status.getVideoMuteInfo()) != null && (muteDesc = videoMuteInfo.getMuteDesc()) != null && C78685UuP.LJJJZ(muteDesc)) {
            C26045AKb c26045AKb = new C26045AKb(fragment);
            c26045AKb.LJIIIZ(muteDesc);
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC63605Oxl
    public Response LJFF(String encodeType, byte[] payload) {
        o.LJIIIZ(encodeType, "encodeType");
        o.LJIIIZ(payload, "payload");
        return C63681Oyz.LIZ(encodeType, payload);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIIIIZZ(Activity context, Intent intent) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        C44018HPi.LJIIJ(context, intent);
        String name = SAAActivity.class.getName();
        ComponentName component = intent.getComponent();
        if (component != null) {
            str = component.getClassName();
        } else {
            str = null;
        }
        if (o.LJ(name, str)) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            if (LLJJIJI.containsKey("exterior_record_model")) {
                str2 = "ExteriorVideoRecordScene";
            } else {
                str2 = "VideoRecordNewScene";
            }
            C42662Gok.LIZLLL(context, LLJJIJI, str2, null, 24);
            return;
        }
        C42326GjK.LIZ.getClass();
        C42326GjK.LJ(context, intent);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIIJJI(Context ctx, Intent it) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(it, "it");
        C163786bm.LIZ(ctx, it);
    }

    @Override // X.InterfaceC41645GWb
    public boolean LJIIL(Context context, Intent intent) {
        return C51029K0z.LJIL(intent).LIZ(context, null);
    }

    @Override // X.InterfaceC41645GWb
    public Intent LJIILJJIL(Activity activity, Bundle bundle) {
        return HJ9.LIZ(activity, bundle, 2, 1001);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIIZILJ(Context context, Intent intent) {
        Class<?> cls;
        Bundle LIZLLL;
        String string;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        boolean isChildrenMode = C60903NvH.LJIIJJI().getAccountService().isChildrenMode();
        if (!isChildrenMode) {
            FMX.LJIIL("performance_video_publish_enter", C113554cx.LJJJLIIL());
            C44591Hel.LIZ().init();
            C60903NvH.LJIIJJI().getPublishService().LIZIZ();
            C60903NvH.LJIIJJI().getPublishService().LJIL().LIZ();
        }
        if (isChildrenMode) {
            cls = FTCVideoPublishActivity.class;
        } else if (intent.getBooleanExtra("fromTTEPEffectPreview", false)) {
            cls = TTEPVideoSaveActivity.class;
        } else {
            cls = VideoPublishActivity.class;
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && (LIZLLL = C60903NvH.LJIIJJI().LJIL().LIZLLL(LJIJJ)) != null && (string = LIZLLL.getString("extra_edit_effect_uid")) != null) {
            intent.putExtra("extra_edit_effect_uid", string);
        }
        intent.setClass(context, cls);
        if (intent.getBooleanExtra("fromTTEPEffectPreview", false)) {
            if (o.LJ(cls, VideoPublishActivity.class) && C41030G8k.LIZ()) {
                C42662Gok.LIZJ(context, C16880lQ.LLJJIJI(intent), 1003);
                return;
            }
            C42326GjK c42326GjK = C42326GjK.LIZ;
            Activity LJIJJ2 = C45804HyK.LJIJJ(context);
            if (LJIJJ2 != null) {
                c42326GjK.getClass();
                C42326GjK.LJFF(LJIJJ2, 1003, intent);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (o.LJ(cls, VideoPublishActivity.class) && C41030G8k.LIZ()) {
            C42662Gok.LIZJ(context, C16880lQ.LLJJIJI(intent), null);
        } else {
            C42326GjK.LIZ.getClass();
            C42326GjK.LJ(context, intent);
        }
    }

    @Override // X.InterfaceC41645GWb
    public void LJIJJ(Activity context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        intent.setClass(context, VideoRecordPermissionActivity.class);
    }

    @Override // X.InterfaceC41645GWb
    public void LJJ(Activity ctx, Intent it) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(it, "it");
        C42662Gok.LJFF(ctx, C16880lQ.LLJJIJI(it));
    }

    @Override // X.InterfaceC41645GWb
    public void LJJI(Activity activity, Intent intent) {
        C42326GjK.LIZ.getClass();
        C42326GjK.LJ(activity, intent);
    }

    @Override // X.InterfaceC41645GWb
    public void LJJII(Context ctx, Intent it) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(it, "it");
        C42662Gok.LJ(ctx, C16880lQ.LLJJIJI(it));
    }

    public static final XKQ LJJIIZI(LifecycleOwner lifecycleOwner, MBA context, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(context, "context");
        return XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), context, null, interfaceC88471Ynr, 2);
    }

    public static final XKQ LJJIJ(ViewModel viewModel, MBA context, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(viewModel, "<this>");
        o.LJIIIZ(context, "context");
        return XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), context, null, interfaceC88471Ynr, 2);
    }

    public static final XKQ LJJIJIIJI(AssemViewModel assemViewModel, MBA context, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(context, "context");
        return XKX.LIZLLL(ViewModelKt.getViewModelScope(assemViewModel), context, null, interfaceC88471Ynr, 2);
    }

    @Override // X.InterfaceC41645GWb
    public void LIZLLL(Context context, Intent intent, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        C43550H7i.LIZIZ(context, -1, intent);
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC41645GWb
    public void LJ(Context context, int i, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        C43550H7i.LIZIZ(context, i, intent);
    }

    @Override // X.InterfaceC41645GWb
    public void LJI(Activity activity, StitchParams params, CreativeInfo creativeInfo) {
        o.LJIIIZ(params, "params");
        Intent intent = new Intent(activity, (Class<?>) StitchTrimmingActivity.class);
        intent.putExtra("stitch_params", (Parcelable) params);
        C77412UZs.LJJIJIL(intent, creativeInfo);
        C16880lQ.LIZJ(activity, intent);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIIIZ(Activity activity, int i, Intent it) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(it, "it");
        it.putExtra("edit_start_time", System.currentTimeMillis());
        it.setClass(activity, NowsEditActivity.class);
        C16880lQ.LJFF(activity, i, it);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIILIIL(Activity activity, Intent intent, CreativeInfo creativeInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClass(activity, StitchTrimmingActivity.class);
        C77412UZs.LJJIJIL(intent2, creativeInfo);
        C16880lQ.LIZJ(activity, intent2);
    }

    @Override // X.R6I
    public void LJIILLIIL(AuthResult authResult, int i, C69008R6m c69008R6m) {
        int i2;
        String str;
        C69008R6m LIZIZ = C69007R6l.LIZIZ(this, authResult, c69008R6m, "google_onetap");
        if (LIZIZ != null && authResult != null) {
            if (authResult.mIsSuccessful) {
                C69009R6n.LIZLLL(LIZIZ);
                return;
            }
            C66504Q8e c66504Q8e = authResult.mErrorCause;
            if (c66504Q8e != null) {
                i2 = c66504Q8e.getProviderErrorCode();
                c66504Q8e.getErrorCode();
                str = c66504Q8e.getMessage();
            } else {
                i2 = 0;
                str = null;
            }
            String LIZLLL = C012403c.LIZLLL("googleErrorCode: ", i2, ", errorDesc: ", str);
            if (authResult.mIsCancelled || C69006R6k.LJLIL.contains(Integer.valueOf(i2))) {
                C69007R6l.LIZ(i, 2, "google_onetap", i2, str);
                C69009R6n.LIZIZ(LIZIZ, LIZLLL, i2, str);
            } else {
                V16.LJJJJZI(i2, str, "google_onetap");
                C69007R6l.LIZ(i, 1, "google_onetap", i2, str);
                C69009R6n.LIZJ(LIZIZ, LIZLLL, i2, str);
            }
        }
    }

    @Override // X.InterfaceC41645GWb
    public void LJIJ(Activity context, int i, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        FMX.LJIIL("performance_video_publish_enter", C113554cx.LJJJLIIL());
        C44591Hel.LIZ().init();
        C60903NvH.LJIIJJI().getPublishService().LIZIZ();
        C60903NvH.LJIIJJI().getPublishService().LJIL().LIZ();
        if (C41030G8k.LIZ()) {
            C42662Gok.LIZJ(context, C16880lQ.LLJJIJI(intent), Integer.valueOf(i));
            return;
        }
        intent.setClass(context, VideoPublishActivity.class);
        C42326GjK.LIZ.getClass();
        C42326GjK.LJFF(context, i, intent);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIJI(Context context, Intent intent, InterfaceC65784Pro interfaceC65784Pro) {
        List<? extends MediaModel> LJJIJ;
        o.LJIIIZ(context, "context");
        if (intent.hasExtra("open_sdk_import_media_list")) {
            LJJIJ = intent.getParcelableArrayListExtra("open_sdk_import_media_list");
        } else {
            MediaModel LJII = C46104I7o.LJII(C16880lQ.LLJJIJIIJIL(intent, "file_path"));
            if (LJII != null) {
                LJJIJ = C47261Igj.LJJIJ(LJII);
            }
            H78.LIZJ(VideoEditContainerScene.LLJILJIL + ", mediaModelList is null or empty");
        }
        if (LJJIJ != null && !LJJIJ.isEmpty()) {
            if (!(context instanceof ActivityC45651qj)) {
                H78.LIZJ(VideoEditContainerScene.LLJILJIL + ", context is not FragmentActivity");
                return;
            }
            C60903NvH.LJIIJJI().LJJIJIL().LIZIZ((Activity) context, 1000L, 3600000L).LIZ(LJJIJ, intent, intent, interfaceC65784Pro);
            return;
        }
        H78.LIZJ(VideoEditContainerScene.LLJILJIL + ", mediaModelList is null or empty");
    }

    @Override // X.InterfaceC41645GWb
    public void LJIL(Activity activity, int i, Intent intent) {
        C44018HPi.LJIIJ(activity, intent);
        C42326GjK.LIZ.getClass();
        C42326GjK.LJFF(activity, i, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, kotlin.jvm.internal.AqS57S0201000_8] */
    public static final void LJJIII(SearchSugEntity searchSugEntity, TextView mSugView, View itemView, int i) {
        T t;
        o.LJIIIZ(searchSugEntity, "searchSugEntity");
        o.LJIIIZ(mSugView, "mSugView");
        o.LJIIIZ(itemView, "itemView");
        if (itemView.findViewById(R.id.mlx) != null) {
            itemView.findViewById(R.id.mlx).setVisibility(8);
        }
        if (itemView.findViewById(R.id.mlz) != null) {
            itemView.findViewById(R.id.mlz).setVisibility(8);
        }
        if (itemView.findViewById(R.id.bu7) != null) {
            itemView.findViewById(R.id.bu7).setVisibility(8);
        }
        if (itemView.findViewById(R.id.bst) != null) {
            itemView.findViewById(R.id.bst).setVisibility(0);
        }
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        CharSequence LJIILIIL = C78840Uwu.LJIILIIL(searchSugEntity, context);
        mSugView.setMaxLines(2);
        mSugView.setEllipsize(TextUtils.TruncateAt.END);
        if (searchSugEntity.LIZIZ()) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(LJIILIIL);
            o.LJIIIIZZ(valueOf, "valueOf(searchMatchSpan)");
            Context context2 = mSugView.getContext();
            o.LJIIIIZZ(context2, "mSugView.context");
            Drawable LIZIZ = C04270Et.LIZIZ(context2, R.drawable.ap9);
            if (LIZIZ != null) {
                LIZIZ.setBounds(new Rect(0, 0, C17N.LJIILL(16.0d), C17N.LJIILL(16.0d)));
            }
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = new AqS57S0201000_8(mSugView, LIZIZ, 3);
            C68322mC c68322mC2 = new C68322mC();
            if (valueOf.length() == 0 || LIZIZ == null || LIZIZ.getBounds().isEmpty()) {
                t = new SpannableStringBuilder(valueOf);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                T59 t59 = new T59(LIZIZ);
                t59.LJLIL = C7MY.LIZIZ(2);
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.setSpan(t59, s.LJJLIIIJ(spannableStringBuilder) - 1, s.LJJLIIIJ(spannableStringBuilder), 18);
                t = spannableStringBuilder;
            }
            c68322mC2.element = t;
            if (C16330kX.LIZJ(mSugView)) {
                mSugView.setText((CharSequence) c68322mC2.element);
                ((InterfaceC88472Yns) c68322mC.element).invoke(c68322mC2.element);
            } else {
                mSugView.setText((CharSequence) c68322mC2.element);
                JVD.LIZIZ(mSugView, new AqS156S0200000_9(c68322mC, (C68322mC<InterfaceC88472Yns<SpannableStringBuilder, C76800UCe>>) c68322mC2, (C68322mC<SpannableStringBuilder>) 61));
            }
        } else {
            mSugView.setText(LJIILIIL);
        }
        mSugView.post(new ARunnableS4S0201000_1(i, mSugView, itemView, 7));
    }

    public static void LJJIZ(View view, LifecycleOwner lifecycleOwner, InterfaceC88473Ynt interfaceC88473Ynt, int i) {
        int i2;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if ((i & 1) != 0) {
            lifecycleOwner2 = LJJIIJZLJL(view);
        }
        if ((i & 2) != 0) {
            i2 = 700;
        } else {
            i2 = 0;
        }
        C16880lQ.LJIIJ(new ACListenerS16S0301000_1(i2, view, interfaceC88473Ynt, lifecycleOwner2, 0), view);
    }

    @Override // X.InterfaceC41645GWb
    public void LIZ(Activity context, Intent intent, boolean z, boolean z2) {
        o.LJIIIZ(context, "context");
        StringBuilder LJI = JBR.LJI("isRefresh : ", z, ", trace : ");
        LJI.append(new RuntimeException());
        GPR.LIZJ(X1D.LIZIZ(LJI));
        intent.putExtra("need_finish_posted_draft_fragment", z2);
        if (GNH.LIZ()) {
            intent.putExtra("need_refresh_draft", z);
        } else {
            C60903NvH.LJIIJJI().LJJJI().LJIIIZ(z);
        }
        intent.setClass(context, DraftBoxActivity.class);
        C16880lQ.LIZIZ(context, intent);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIILL(Activity context, Bundle bundle, int i, int i2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bundle, "bundle");
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        HJ9.LJ(context, bundle, i, i2);
    }

    @Override // X.InterfaceC41645GWb
    public void LJIJJLI(ActivityC45651qj ctx, MediaModel mediaModel, CreativeInfo creativeInfo, Effect effect, ShortVideoCommonParams shortVideoCommonParams) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(mediaModel, "mediaModel");
        W5I.LIZ().LIZLLL.LIZIZ(C78566UsU.LJLIL);
        Intent intent = new Intent();
        intent.setClass(ctx, CustomStickerPreviewActivity.class);
        intent.putExtra("preview_sticker_params", mediaModel);
        if (!(effect instanceof Parcelable)) {
            effect = null;
        }
        intent.putExtra("custom_sticker", (Parcelable) effect);
        intent.putExtra("shoot_way", shortVideoCommonParams.shootWay);
        intent.putExtra("content_source", shortVideoCommonParams.contentSource);
        intent.putExtra("content_type", shortVideoCommonParams.contentType);
        C77412UZs.LJJIJIL(intent, creativeInfo);
        C16880lQ.LJFF(ctx, 10004, intent);
    }
}
