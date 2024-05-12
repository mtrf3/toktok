package X;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceResponse;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CommonBlock;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Config;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Module;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.PageData;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Uyc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78946Uyc implements InterfaceC81635W2d, R6I {
    public static Boolean LJJIL(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC81635W2d
    public void LIZLLL(C8HR c8hr, C74365TGn c74365TGn) {
    }

    public static final boolean LJJ() {
        try {
            if (FCD.LJFF(EF7.LIZIZ(), "com.ss.android.ugc.now")) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void LIZIZ(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", exc.toString());
            jSONObject.put("success", 1);
            jSONObject.put("errorResponse", jSONObject2.toString());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FUA.LIZJ("aweme_profile_recyclerview_crash_log", jSONObject);
    }

    public static final Parcelable LIZJ(Parcelable cloneFromParcel) {
        o.LJIIIZ(cloneFromParcel, "$this$cloneFromParcel");
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "Parcel.obtain()");
        obtain.writeValue(cloneFromParcel);
        obtain.setDataPosition(0);
        Object readValue = obtain.readValue(cloneFromParcel.getClass().getClassLoader());
        if (readValue != null) {
            Parcelable parcelable = (Parcelable) readValue;
            obtain.recycle();
            return parcelable;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    public static final C0Q9 LJIIIZ(C0Q9 c0q9) {
        o.LJIIIZ(c0q9, "<this>");
        C0Q9 LIZJ = c0q9.LIZJ();
        int LIZIZ = LIZJ.LIZIZ();
        for (int i = 0; i < LIZIZ; i++) {
            LIZJ.LJ(c0q9.LIZ(i), i);
        }
        return LIZJ;
    }

    public static String LJIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C38352F3k.LJFF(bytes, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    public static final int LJIILIIL(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final Paint.Style LJIILJJIL(int i) {
        if (i == Paint.Style.FILL.ordinal()) {
            return Paint.Style.FILL;
        }
        if (i == Paint.Style.STROKE.ordinal()) {
            return Paint.Style.STROKE;
        }
        if (i == Paint.Style.FILL_AND_STROKE.ordinal()) {
            return Paint.Style.FILL_AND_STROKE;
        }
        return Paint.Style.FILL;
    }

    public static final boolean LJIILL(I61 i61) {
        o.LJIIIZ(i61, "<this>");
        if (LJIJJLI(i61) && C45771Hxn.LIZIZ) {
            return true;
        }
        return false;
    }

    public static final CommonBlock LJIIZILJ(PageData pageData) {
        List<CommonBlock> list;
        Config LJIJ = LJIJ(pageData);
        CommonBlock commonBlock = null;
        if (LJIJ == null || (list = LJIJ.componentList) == null) {
            return null;
        }
        Iterator<CommonBlock> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CommonBlock next = it.next();
            if (o.LJ(next.getId(), EnumC35500DwW.COMMON_BLOCK_MALL_EXPOSED_TOOL_PANEL.getValue())) {
                commonBlock = next;
                break;
            }
        }
        return commonBlock;
    }

    public static final Config LJIJ(PageData pageData) {
        Module module;
        List<Module> module2 = pageData.getModule();
        if (module2 == null) {
            return null;
        }
        Iterator<Module> it = module2.iterator();
        while (true) {
            if (it.hasNext()) {
                module = it.next();
                if (o.LJ(module.getType(), "tool_panel")) {
                    break;
                }
            } else {
                module = null;
                break;
            }
        }
        Module module3 = module;
        if (module3 == null) {
            return null;
        }
        return module3.getConfig();
    }

    public static final CommonBlock LJIJI(PageData pageData) {
        List<CommonBlock> list;
        Config LJIJ = LJIJ(pageData);
        CommonBlock commonBlock = null;
        if (LJIJ == null || (list = LJIJ.componentList) == null) {
            return null;
        }
        for (CommonBlock commonBlock2 : list) {
            CommonBlock commonBlock3 = commonBlock2;
            if (o.LJ(commonBlock3.getId(), EnumC35500DwW.COMMON_BLOCK_MALL_HOME_TOOL_OLD_USER.getValue()) || o.LJ(commonBlock3.getId(), EnumC35500DwW.COMMON_BLOCK_MALL_HOME_TOOL_NEW_USER.getValue())) {
                commonBlock = commonBlock2;
                break;
            }
        }
        return commonBlock;
    }

    public static final String LJIJJ(String str) {
        o.LJIIIZ(str, "<this>");
        android.net.Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        String queryParameter = UriProtector.getQueryParameter(parse, "url");
        if (queryParameter != null) {
            android.net.Uri parse2 = UriProtector.parse(queryParameter);
            o.LJIIIIZZ(parse2, "Uri.parse(this)");
            return parse2.buildUpon().clearQuery().build().toString();
        }
        return null;
    }

    public static final boolean LJIJJLI(I61 i61) {
        o.LJIIIZ(i61, "<this>");
        if (i61.LIZ == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIL(PageData pageData) {
        List<CommonBlock> list;
        Config LJIJ = LJIJ(pageData);
        if (LJIJ == null || (list = LJIJ.componentList) == null) {
            return false;
        }
        for (CommonBlock commonBlock : list) {
            if (o.LJ(commonBlock.getId(), EnumC35500DwW.COMMON_BLOCK_MALL_HOME_TOOL_NEW_USER.getValue())) {
                if (commonBlock == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJJI(DownloadInfo downloadInfo) {
        if (downloadInfo == null || X4H.LJFF(downloadInfo.getId(), null).LJIIIIZZ("optimize_head_request", 0) != 1) {
            return false;
        }
        return true;
    }

    public static void LJJIFFI(String str) {
        C36922EeM.LIZLLL(4, "WsLancet", str);
    }

    public static final WebResourceResponse LJJIJ(F4I f4i) {
        return new WebResourceResponse(f4i.getMimeType(), f4i.LJI(), f4i.LJII(), f4i.LJIIIIZZ(), f4i.LJFF(), f4i.getData());
    }

    public static final void LJJIJIIJIL(C107724Kq builder) {
        o.LJIIIZ(builder, "builder");
        String str = builder.LIZJ;
        if (str == null || str.length() == 0) {
            return;
        }
        C107434Jn.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics(), builder, false, 6);
    }

    public static final void LJJIJL(C107724Kq c107724Kq) {
        if (c107724Kq == null) {
            return;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LJFF(c107724Kq);
    }

    public static byte LJJIJLIJ(Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                return (byte) 0;
            }
            return (byte) 1;
        }
        return (byte) -1;
    }

    public static final InnerEffectTextShadowConfig LJ(OuterEffectTextShadowConfig outerEffectTextShadowConfig, Context context) {
        return new InnerEffectTextShadowConfig(C74275TDb.LIZIZ(context, outerEffectTextShadowConfig.getRadius()), C74275TDb.LIZIZ(context, outerEffectTextShadowConfig.getOffsetX()), C74275TDb.LIZIZ(context, outerEffectTextShadowConfig.getOffsetY()), ColorProtector.parseColor(outerEffectTextShadowConfig.getColor()));
    }

    public static final InnerEffectTextStrokeConfig LJIIIIZZ(OuterEffectTextStrokeConfig outerEffectTextStrokeConfig, Context context) {
        Paint.Join join;
        o.LJIIIZ(outerEffectTextStrokeConfig, "<this>");
        float LIZIZ = C74275TDb.LIZIZ(context, outerEffectTextStrokeConfig.getStrokeWidth());
        int parseColor = ColorProtector.parseColor(outerEffectTextStrokeConfig.getStrokeColor());
        int strokeJoin = outerEffectTextStrokeConfig.getStrokeJoin();
        if (strokeJoin == Paint.Join.ROUND.ordinal()) {
            join = Paint.Join.ROUND;
        } else if (strokeJoin == Paint.Join.BEVEL.ordinal()) {
            join = Paint.Join.BEVEL;
        } else if (strokeJoin == Paint.Join.MITER.ordinal()) {
            join = Paint.Join.MITER;
        } else {
            join = Paint.Join.ROUND;
        }
        return new InnerEffectTextStrokeConfig(LIZIZ, parseColor, join);
    }

    public static final boolean LJJIIZ(ShortVideoContext shortVideoContext, List list) {
        StickerPreviewResolutionConfig LIZ;
        if (InterfaceC44963Hkl.LJIIL.enableUseDynamicEffectLabel() || C44961Hkj.LIZ() == null || (LIZ = C44961Hkj.LIZ()) == null || !LIZ.enable) {
            return false;
        }
        if (!C78685UuP.LJJJZ(shortVideoContext.fromPropId) && !C78685UuP.LJJJZ(shortVideoContext.presetEffectId) && (list == null || !(!list.isEmpty()))) {
            return false;
        }
        return true;
    }

    public static final void LJJIIZI(int i, RecyclerView recyclerView) {
        C78947Uyd c78947Uyd = new C78947Uyd(recyclerView.getContext());
        c78947Uyd.LIZ = i;
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.LLIIIILZ(c78947Uyd);
        }
    }

    public static final void LJJIJIIJI(PowerCell powerCell, C107724Kq builder) {
        o.LJIIIZ(powerCell, "<this>");
        o.LJIIIZ(builder, "builder");
        String str = builder.LIZJ;
        if (str == null || str.length() == 0) {
            return;
        }
        if (builder.LJFF == null) {
            builder.LJFF = Integer.valueOf(powerCell.getLayoutPosition());
        }
        C107434Jn.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics(), builder, false, 6);
    }

    @Override // X.InterfaceC81635W2d
    public void LJI(BottomSheetBehavior bottomSheetBehavior, C8HR c8hr) {
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() == 5) {
                return;
            } else {
                bottomSheetBehavior.setState(5);
            }
        }
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(0);
    }

    public static final void LJJII(InterfaceC71003Rtn interfaceC71003Rtn, AbstractC70995Rtf abstractC70995Rtf, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(interfaceC71003Rtn, "<this>");
        abstractC70995Rtf.LJFF = interfaceC71003Rtn;
        AbstractC70995Rtf.LIZLLL(abstractC70995Rtf);
        abstractC70995Rtf.LJII(interfaceC88472Yns);
        abstractC70995Rtf.LIZJ(false);
    }

    public static final void LJJIII(String str, AbstractC70875Rrj abstractC70875Rrj, InterfaceC88472Yns interfaceC88472Yns) {
        C68212m1 c68212m1 = TrackNodeStore.LIZ.get(str);
        if (c68212m1 != null) {
            LJJII(c68212m1, abstractC70875Rrj, interfaceC88472Yns);
        }
    }

    public static final void LJJIIJ(View view, AbstractC70995Rtf event, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(event, "event");
        if (view.getParent() == null) {
        }
        InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(view);
        if (LJIILIIL == null) {
            C78983UzD.LJIILL("slark, event " + event.LIZ + ", node is null");
        }
        event.LJFF = LJIILIIL;
        event.LJI = view;
        AbstractC70995Rtf.LIZLLL(event);
        event.LJII(interfaceC88472Yns);
        event.LIZJ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // X.InterfaceC81635W2d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJII(com.google.android.material.bottomsheet.BottomSheetBehavior r4, X.C8HR r5, X.C74365TGn r6) {
        /*
            r3 = this;
            r2 = 5
            r1 = 0
            if (r4 == 0) goto L14
            int r0 = r4.getState()
            if (r0 != r2) goto L11
        La:
            if (r5 != 0) goto Ld
        Lc:
            return
        Ld:
            r5.setVisibility(r1)
            goto Lc
        L11:
            r4.setState(r2)
        L14:
            if (r6 == 0) goto La
            r6.hide()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78946Uyc.LJII(com.google.android.material.bottomsheet.BottomSheetBehavior, X.8HR, X.TGn):void");
    }

    @Override // X.R6I
    public void LJIILLIIL(AuthResult authResult, int i, C69008R6m c69008R6m) {
        String str;
        int i2;
        C69008R6m LIZIZ = C69007R6l.LIZIZ(this, authResult, c69008R6m, "line");
        if (LIZIZ == null) {
            return;
        }
        o.LJI(authResult);
        if (authResult.mIsSuccessful) {
            if (!TextUtils.isEmpty(authResult.mToken)) {
                C69009R6n.LIZLLL(LIZIZ);
                return;
            } else {
                C69009R6n.LIZJ(LIZIZ, "token = null", 0, null);
                return;
            }
        }
        C66504Q8e c66504Q8e = authResult.mErrorCause;
        if (c66504Q8e != null) {
            i2 = c66504Q8e.getErrorCode();
            str = c66504Q8e.getMessage();
        } else {
            str = null;
            i2 = 0;
        }
        if (authResult.mIsCancelled) {
            C69009R6n.LIZIZ(LIZIZ, null, i2, str);
            C69007R6l.LIZ(i, 2, "line", i2, str);
            return;
        }
        int i3 = authResult.mBundle.getInt("line_response_ordinal", 0);
        V16.LJJJJZI(i3, str, "line");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Internal error {code = ");
        LIZ.append(i3);
        LIZ.append(", desc = ");
        LIZ.append(str);
        LIZ.append('}');
        C69009R6n.LIZJ(LIZIZ, X1D.LIZIZ(LIZ), i3, str);
        C69007R6l.LIZ(i, 1, "line", i3, str);
        V16.LJJJJZI(i3, str, "line");
    }

    public static final OHW LIZ(Cert cert, String[] strArr, String str, int i) {
        return new OHW(cert, str, strArr, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static final StateListDrawable LJIIJ(float f, float f2, int i, int i2) {
        GradientDrawable LJIIJJI = LJIIJJI(f2, f, i, i);
        GradientDrawable LJIIJJI2 = LJIIJJI(f2, f, i2, i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, LJIIJJI2);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, LJIIJJI);
        stateListDrawable.addState(new int[0], LJIIJJI);
        return stateListDrawable;
    }

    public static final GradientDrawable LJIIJJI(float f, float f2, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(1, i2);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f2, f2});
        return gradientDrawable;
    }

    public static final void LJJIIJZLJL(View view, AbstractC70875Rrj abstractC70875Rrj, InterfaceC65784Pro id, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(id, "id");
        X6V.LIZIZ(view, id, new AqS116S0300000_12(view, abstractC70875Rrj, interfaceC88472Yns, 18));
    }

    public static final void LJJIJIL(PowerCell powerCell, User user, ActivityStatus activityStatus, EnumC112364b2 entrance) {
        o.LJIIIZ(powerCell, "<this>");
        o.LJIIIZ(entrance, "entrance");
        if (user == null) {
            return;
        }
        boolean z = false;
        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
        C107724Kq c107724Kq = new C107724Kq(powerCell.getCurrentLifecycleOwner());
        if (activityStatus != null) {
            z = OUP.LJJII(activityStatus, null, null, 3);
        }
        c107724Kq.LJI = Boolean.valueOf(z);
        c107724Kq.LIZIZ = entrance;
        c107724Kq.LIZJ = user.getUid();
        c107724Kq.LJFF = Integer.valueOf(powerCell.getBindingAdapterPosition());
        activityStatusAnalytics.LJFF(c107724Kq);
    }

    @Override // X.InterfaceC81635W2d
    public void LJFF(BottomSheetBehavior bottomSheetBehavior, C8HR c8hr, C74365TGn c74365TGn, Boolean bool) {
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() == 5) {
                return;
            } else {
                bottomSheetBehavior.setState(5);
            }
        }
        if (c8hr != null) {
            c8hr.setVisibility(0);
        }
        if (c74365TGn == null) {
            return;
        }
        c74365TGn.hide();
    }
}
