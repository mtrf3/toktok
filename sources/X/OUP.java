package X;

import Y.IDCListenerS253S0100000_3;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import defpackage.i0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS22S0000100_1;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes11.dex */
public class OUP implements InterfaceC005200i, InterfaceC80606VkI, InterfaceC48038ItG, InterfaceC38133Ext {
    public static /* synthetic */ boolean LJJLIIIJJI(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Override // X.InterfaceC80606VkI
    public void LIZ(YS4 ys4) {
    }

    @Override // X.InterfaceC005200i
    public void LIZIZ() {
    }

    @Override // X.InterfaceC005200i
    public void LIZLLL() {
    }

    @Override // X.InterfaceC005200i
    public void onDismiss() {
    }

    @Override // X.InterfaceC005200i
    public void onHide() {
    }

    @Override // X.InterfaceC005200i
    public void onShow() {
    }

    public static final boolean LJIIJ(List list) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!C1KJ.LIZ.LIZ((LiveEffect) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final Long LJIIL(String str) {
        if (!o.LJJJLIIL(str, "#", false)) {
            return null;
        }
        String LJJJJZ = o.LJJJJZ(str, "#", "", false);
        if (LJJJJZ.length() != 8 && LJJJJZ.length() != 6) {
            return null;
        }
        if (LJJJJZ.length() == 6) {
            LJJJJZ = i0.LJFF(LJJJJZ, "FF");
        }
        try {
            C17N.LJIIJ(16);
            long parseLong = CastLongProtector.parseLong(LJJJJZ, 16);
            return Long.valueOf(((parseLong >> 8) & 16777215) | ((parseLong << 24) & 4278190080L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String LJIILL(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("creator_user_id", "");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "jsonObj.optString(\"creator_user_id\", \"\")");
                return optString;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static final String LJIILLIIL(LiveGoalInfo liveGoalInfo) {
        if (liveGoalInfo == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(C09650Zl.LIZIZ, liveGoalInfo);
    }

    public static final String LJIJ(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("from_tag");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "jsonObj.optString(\"from_tag\")");
                return optString;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String LJIJI(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("svc_from");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "JSONObject(it).optString(\"svc_from\")");
                return optString;
            }
            return "";
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LJIJJ(VNU vnu) {
        Object LLILL;
        WindowManager windowManager;
        Display defaultDisplay;
        if (vnu instanceof Activity) {
            windowManager = ((Activity) vnu).getWindowManager();
        } else if (vnu != 0 && (LLILL = C16880lQ.LLILL(vnu, "window")) != null) {
            windowManager = (WindowManager) LLILL;
        } else {
            throw new C37692Eqm("null cannot be cast to non-null type android.view.WindowManager");
        }
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            try {
                Point point = new Point();
                defaultDisplay.getSize(point);
                return point.x;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static final void LJIJJLI(View view) {
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        KL2.LJIILLIIL(8, view);
    }

    public static final void LJJ(View view) {
        KL2.LJIILLIIL(4, view);
    }

    public static final boolean LJJI(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                if (new JSONObject(extra).optInt("voice_use_commercial", 0) == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean LJJIII(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        kotlin.jvm.internal.o.LJIIIZ(aweme, "<this>");
        if (aweme.getAwemeType() != 150 || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || !(!imageList.isEmpty()) || ((Boolean) C53115Ksx.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(Effect effect) {
        return kotlin.jvm.internal.o.LJ(effect.getEffectId(), "speech2song");
    }

    public static final boolean LJJIIJZLJL(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                if (new JSONObject(extra).optBoolean("is_voice_clone")) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean LJJIIZ(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                if (new JSONObject(extra).optBoolean("is_voice_conversion")) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void LJJJJZ(TuxTextView tuxTextView) {
        tuxTextView.getPaint().setFlags(tuxTextView.getPaint().getFlags() | 16);
    }

    public static final String LJJJLIIL(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("speakerID", "");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "JSONObject(it).optString(\"speakerID\", \"\")");
                return optString;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static final m LJJJLL(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (m) C09650Zl.LIZIZ.LJI(str, m.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String LJJJLZIJ(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("StreamVCSpkID", "");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "JSONObject(it).optString(\"StreamVCSpkID\", \"\")");
                return optString;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static final Locale LJJJZ(C16030k3 c16030k3) {
        kotlin.jvm.internal.o.LJIIIZ(c16030k3, "<this>");
        InterfaceC16050k5 interfaceC16050k5 = c16030k3.LIZ;
        kotlin.jvm.internal.o.LJII(interfaceC16050k5, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((C33851Un) interfaceC16050k5).LIZ;
    }

    public static final String LJJL(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("vc_anchor_name", "");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "jsonObj.optString(\"vc_anchor_name\", \"\")");
                return optString;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static final String LJJLI(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("vc_creator_user_id", "");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "jsonObj.optString(\"vc_creator_user_id\", \"\")");
                return optString;
            }
        } catch (JSONException unused) {
        }
        return "";
    }

    public static final String LJJLIIIIJ(Effect effect) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("vc_creator_name", "");
                kotlin.jvm.internal.o.LJIIIIZZ(optString, "jsonObj.optString(\"vc_creator_name\", \"\")");
                return optString;
            }
        } catch (JSONException unused) {
        }
        return "";
    }

    public static final void LJJLIIIJ(View view) {
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        KL2.LJIILLIIL(0, view);
    }

    @Override // X.InterfaceC38133Ext
    public String LIZJ(Object obj) {
        return GsonProtectorUtils.toJson(C09650Zl.LIZIZ, obj);
    }

    @Override // X.InterfaceC80606VkI
    public void LJII(YS4 ys4) {
        if (!ys4.LIZLLL()) {
            C48672J8i.LIZIZ(ys4.getPlayEntity(), "scroll_out");
            ys4.LJII();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("detachCurrent release simpleMediaView:");
            LIZ.append(hashCode());
            X1D.LIZIZ(LIZ);
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Long it = (Long) obj;
        kotlin.jvm.internal.o.LJIIIZ(it, "it");
        return Long.valueOf(10 - (it.longValue() + 1));
    }

    public static final int LJIILJJIL(VNU vnu, String str) {
        float parseFloat;
        try {
            if (o.LJJJJ(str, "rpx", false)) {
                try {
                    parseFloat = (CastFloatProtector.parseFloat(o.LJJJJZ(str, "rpx", "", false)) * LJIJJ(vnu)) / 750;
                } catch (Exception unused) {
                    return 0;
                }
            } else {
                if (!o.LJJJJ(str, "px", false)) {
                    return 0;
                }
                String LJJJJZ = o.LJJJJZ(str, "px", "", false);
                if (vnu != null) {
                    Resources resources = vnu.getResources();
                    kotlin.jvm.internal.o.LJFF(resources, "context.resources");
                    parseFloat = CastFloatProtector.parseFloat(LJJJJZ) * resources.getDisplayMetrics().density;
                } else {
                    kotlin.jvm.internal.o.LJIIZILJ();
                    throw null;
                }
            }
            return (int) parseFloat;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void LJIIZILJ(TuxTextView tuxTextView, SmartImageView smartImageView) {
        smartImageView.setVisibility(0);
        smartImageView.addOnLayoutChangeListener(new IDCListenerS253S0100000_3(tuxTextView, 2));
    }

    public static final Object LJJIIZI(j jVar, Class cls) {
        if (jVar == null) {
            return null;
        }
        try {
            return C09650Zl.LIZIZ.LIZJ(jVar, cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void LJJIJ(String previousDefinition, String str) {
        kotlin.jvm.internal.o.LJIIIZ(previousDefinition, "previousDefinition");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_definition_selection_select_success");
        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", previousDefinition, "previous_definition");
        LIZ.LJIJJ(str, "current_definition");
        LIZ.LJIJJ("auto_speedtest", "switch_type");
        LIZ.LJIJ("screen_share");
        LIZ.LJJIIJZLJL();
    }

    public static final float LJJIJIIJI(TextView textView, String string) {
        kotlin.jvm.internal.o.LJIIIZ(textView, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(string, "string");
        return textView.getPaint().measureText(string);
    }

    public static final Bitmap LJJIJIL(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint = new Paint(2);
        Paint paint2 = new Paint();
        paint2.setColor(-16777216);
        Bitmap bitmap3 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), bitmap2.getConfig());
        Canvas canvas = new Canvas(bitmap3);
        Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        canvas.drawRect(rect, paint2);
        if (bitmap.getHeight() < bitmap2.getHeight()) {
            int height = (bitmap2.getHeight() - ((int) ((bitmap.getHeight() / bitmap.getWidth()) * bitmap2.getWidth()))) / 2;
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, height, bitmap2.getWidth(), bitmap2.getHeight() - height), paint);
        }
        canvas.drawBitmap(bitmap2, rect, rect, paint);
        kotlin.jvm.internal.o.LJIIIIZZ(bitmap3, "bitmap");
        return bitmap3;
    }

    public static final Bitmap LJJIJL(Bitmap coverBitmap, CoverPublishModel coverPublishModel) {
        kotlin.jvm.internal.o.LJIIIZ(coverBitmap, "coverBitmap");
        if (coverPublishModel != null) {
            return coverPublishModel.getEffectTextModel().mergeCoverText(coverBitmap);
        }
        return coverBitmap;
    }

    public static final void LJJJI(SmartImageView smartImageView, Image image) {
        W5F LIZLLL = C70759Rpr.LIZLLL(image.toImageUrlModel());
        LIZLLL.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LIZLLL);
    }

    public static final void LJJJIL(int i, SmartImageView smartImageView) {
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            smartImageView.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void LJJJJ(SmartImageView smartImageView, Number value) {
        kotlin.jvm.internal.o.LJIIIZ(value, "value");
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(value));
            marginLayoutParams.leftMargin = LJJIIZ;
            marginLayoutParams.rightMargin = LJJIIZ;
            marginLayoutParams.topMargin = LJJIIZ;
            marginLayoutParams.bottomMargin = LJJIIZ;
            smartImageView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void LJJJJI(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void LJJJJIZL(int i, View view) {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void LJJJJJ(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void LJJJJJL(int i, View view) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void LJJJJLL(Effect effect, String str) {
        kotlin.jvm.internal.o.LJIIIZ(effect, "<this>");
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                JSONObject jSONObject = new JSONObject(extra);
                jSONObject.put("svc_from", str);
                effect.setExtra(jSONObject.toString());
            }
        } catch (JSONException unused) {
        }
    }

    public static final void LJJLIIIJILLIZJL(TextView textView, CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(textView, "<this>");
        textView.setText(charSequence);
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // X.InterfaceC80606VkI
    public void LJI(YS4 ys4, boolean z) {
        StringBuilder LJI = JBR.LJI("onScrollVisibilityChange visible:", z, " simpleMediaView:");
        LJI.append(hashCode());
        X1D.LIZIZ(LJI);
        if (!z && !ys4.LIZLLL()) {
            Rect rect = new Rect();
            ys4.getGlobalVisibleRect(rect);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onScrollVisibilityChange release simpleMediaView show:");
            LIZ.append(ys4.isShown());
            LIZ.append(" globalrect:");
            LIZ.append(rect.toShortString());
            X1D.LIZIZ(LIZ);
            C48672J8i.LIZIZ(ys4.getPlayEntity(), "scroll_out");
            ys4.LJII();
        }
    }

    @Override // X.InterfaceC38133Ext
    public Object LJIIIZ(String str, Type type) {
        return GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, str, type);
    }

    public static final OHW LJIIJJI(int i, Cert cert, String str) {
        return new OHW(cert, str, new String[]{"video"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static final View LJIL(int i, View view, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(view.getContext()), i, (ViewGroup) view, z);
        kotlin.jvm.internal.o.LJI(LLLLIILL);
        return LLLLIILL;
    }

    public static final boolean LJJIFFI(ActivityStatus activityStatus, InterfaceC65784Pro timeNow, ActivityStatusConfig config) {
        boolean z;
        long j;
        long j2;
        kotlin.jvm.internal.o.LJIIIZ(activityStatus, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(timeNow, "timeNow");
        kotlin.jvm.internal.o.LJIIIZ(config, "config");
        boolean z2 = true;
        if (AccountService.LJIJ().LJFF().isMe(activityStatus.userID)) {
            return true;
        }
        long longValue = ((Number) timeNow.invoke()).longValue();
        if (C117504jK.LIZ && activityStatus.inactiveTime > activityStatus.activeTime) {
            z = true;
        } else {
            z = false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (z) {
            j = activityStatus.inactiveTime;
        } else {
            j = activityStatus.activeTime;
        }
        long millis = timeUnit.toMillis(j);
        if (z) {
            j2 = config.inactive_threshold;
        } else {
            j2 = config.active_threshold;
        }
        if (millis > longValue || longValue > millis + j2) {
            z2 = false;
        }
        ((Number) C52711KmR.LIZ.getValue()).intValue();
        return z2;
    }

    public static final Object LJJIJLIJ(View view, InterfaceC67352kd interfaceC67352kd, boolean z) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        OUQ ouq = new OUQ(view, z, xks);
        xks.LJIILIIL(new AqS141S0200000_10(view, ouq, 12));
        view.addOnLayoutChangeListener(ouq);
        Object LJIIJJI = xks.LJIIJJI();
        if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    public static final void LJJJ(KUK kuk, String str, Object obj) {
        kotlin.jvm.internal.o.LJIIIZ(kuk, "<this>");
        EventCenter eventCenter = ((C8O3) kuk).getEventCenter();
        if (eventCenter != null) {
            eventCenter.lv0(kuk, str, obj);
            return;
        }
        throw new IllegalStateException("EventCenter must not null !");
    }

    public static final void LJJJJL(C8FR c8fr, String str, TextView textView) {
        SpannableStringBuilder spannableStringBuilder;
        if (C26338AVi.LIZLLL(textView)) {
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(c8fr, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(c8fr, 0, 1, 17);
            spannableStringBuilder.append((CharSequence) str);
        }
        textView.setText(spannableStringBuilder);
    }

    public static final void LJJJJZI(TuxTextView tuxTextView, CharSequence charSequence, String str) {
        if (charSequence == null || ((String) charSequence).length() == 0) {
            charSequence = str;
        }
        tuxTextView.setText(charSequence);
    }

    public static float LJIILIIL(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    public static /* synthetic */ boolean LJJII(ActivityStatus activityStatus, AqS22S0000100_1 aqS22S0000100_1, ActivityStatusConfig activityStatusConfig, int i) {
        InterfaceC65784Pro interfaceC65784Pro = aqS22S0000100_1;
        if ((i & 1) != 0) {
            interfaceC65784Pro = C3AI.LJLIL;
        }
        if ((i & 2) != 0) {
            C3AL.LIZ.getClass();
            activityStatusConfig = C3AL.LIZ();
        }
        return LJJIFFI(activityStatus, interfaceC65784Pro, activityStatusConfig);
    }

    public static final void LJJIL(long j, String str, String str2, String str3, String str4) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_definition_auto_speedtest_result");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        LIZ.LJIJJ(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        LIZ.LJIJJ(Long.valueOf(j / 1000), "duration");
        LIZ.LJIJJ(Long.valueOf(j), "duration_ms");
        LIZ.LJIJJ(str, "test_result");
        LIZ.LJIJJ(str2, "cancel_reason");
        C06490Nh.LIZLLL(LIZ, str3, "previous_definition", str4, "current_definition");
    }

    public static final void LJJIZ(long j, String str, String str2, String previousDefinition, String str3) {
        kotlin.jvm.internal.o.LJIIIZ(previousDefinition, "previousDefinition");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_definition_manual_speedtest_result");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        C06530Nl.LIZLLL(LIZ, LiveMode.SCREEN_RECORD.logStreamingType, "live_type", j, "duration");
        LIZ.LJIJJ(str, "test_result");
        LIZ.LJIJJ(str2, "cancel_reason");
        C06490Nh.LIZLLL(LIZ, previousDefinition, "previous_definition", str3, "current_definition");
    }

    public static void LJJJJLI(View view, Float f, Float f2, Float f3, int i) {
        Float f4 = f3;
        Float f5 = f;
        Float f6 = f2;
        if ((i & 1) != 0) {
            f5 = null;
        }
        if ((i & 2) != 0) {
            f6 = null;
        }
        if ((i & 4) != 0) {
            f4 = null;
        }
        if (view != null) {
            view.setOutlineProvider(new C42503GmB(f5, f6, f4, null, null));
            view.setClipToOutline(true);
        }
    }
}
