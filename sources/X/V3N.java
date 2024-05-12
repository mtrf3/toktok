package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes14.dex */
public final class V3N implements InterfaceC38831FLv, InterfaceC170946nK, C57Q, InterfaceC53832LAu, InterfaceC006400u {
    public static Context LJLIL;
    public static boolean LJLILLLLZI;
    public static HashMap LJLJI;

    public /* synthetic */ V3N(long j) {
    }

    @Override // X.C57Q
    public void LIZLLL(View view) {
    }

    @Override // X.InterfaceC53832LAu
    public void onFailed(Exception exc) {
    }

    public static boolean LJJIIJ() {
        PJK LIZ = PJK.LIZ();
        if (LIZ.LIZ != -1 && SystemClock.uptimeMillis() - LIZ.LIZ > 5000) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC53832LAu
    public void onSuccess() {
        a.LJIILL().LJIIJJI();
    }

    public /* synthetic */ V3N() {
    }

    public static final Bundle LJ(OSZ... pairs) {
        o.LJIIIZ(pairs, "pairs");
        Bundle bundle = new Bundle(pairs.length);
        for (OSZ osz : pairs) {
            String str = (String) osz.getFirst();
            Object second = osz.getSecond();
            if (second == null) {
                bundle.putString(str, null);
            } else if (second instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) second).booleanValue());
            } else if (second instanceof Byte) {
                bundle.putByte(str, ((Number) second).byteValue());
            } else if (second instanceof Character) {
                bundle.putChar(str, ((Character) second).charValue());
            } else if (second instanceof Double) {
                bundle.putDouble(str, ((Number) second).doubleValue());
            } else if (second instanceof Float) {
                bundle.putFloat(str, ((Number) second).floatValue());
            } else if (second instanceof Integer) {
                bundle.putInt(str, ((Number) second).intValue());
            } else if (second instanceof Long) {
                bundle.putLong(str, ((Number) second).longValue());
            } else if (second instanceof Short) {
                bundle.putShort(str, ((Number) second).shortValue());
            } else if (second instanceof Bundle) {
                bundle.putBundle(str, (Bundle) second);
            } else if (second instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) second);
            } else if (second instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) second);
            } else if (second instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) second);
            } else if (second instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) second);
            } else if (second instanceof char[]) {
                bundle.putCharArray(str, (char[]) second);
            } else if (second instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) second);
            } else if (second instanceof float[]) {
                bundle.putFloatArray(str, (float[]) second);
            } else if (second instanceof int[]) {
                bundle.putIntArray(str, (int[]) second);
            } else if (second instanceof long[]) {
                bundle.putLongArray(str, (long[]) second);
            } else if (second instanceof short[]) {
                bundle.putShortArray(str, (short[]) second);
            } else if (second instanceof Object[]) {
                Class<?> componentType = second.getClass().getComponentType();
                o.LJI(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) second);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) second);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) second);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) second);
                } else {
                    String LJLLILLLL = C16880lQ.LJLLILLLL(componentType);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Illegal value array type ");
                    LIZ.append(LJLLILLLL);
                    LIZ.append(" for key \"");
                    LIZ.append(str);
                    LIZ.append('\"');
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
            } else if (second instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) second);
            } else if (second instanceof IBinder) {
                bundle.putBinder(str, (IBinder) second);
            } else if (second instanceof Size) {
                bundle.putSize(str, (Size) second);
            } else if (second instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) second);
            } else {
                String LJLLILLLL2 = C16880lQ.LJLLILLLL(second.getClass());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Illegal value type ");
                LIZ2.append(LJLLILLLL2);
                LIZ2.append(" for key \"");
                LIZ2.append(str);
                LIZ2.append('\"');
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            }
        }
        return bundle;
    }

    public static final ReachCfg LJIIIIZZ(CustomDotResponse customDotResponse) {
        o.LJIIIZ(customDotResponse, "<this>");
        List<ReachCfg> reachConfigList = customDotResponse.getReachConfigList();
        if (reachConfigList != null) {
            return (ReachCfg) ORZ.LJLLLL(reachConfigList);
        }
        return null;
    }

    public static final String LJIIIZ(Comment comment) {
        if (comment == null || TextUtils.isEmpty(comment.getCid())) {
            return "";
        }
        if (comment.getUser() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(MVR.LIZIZ(comment.getUser(), true));
            LIZ.append(": ");
            LIZ.append(NoticeCommentHelperServiceImpl.LIZIZ().LIZ(comment));
            return X1D.LIZIZ(LIZ);
        }
        return NoticeCommentHelperServiceImpl.LIZIZ().LIZ(comment);
    }

    public static String LJIIJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(PK0.LIZ));
        LIZ.append("/npth/selflib/");
        LIZ.append("lib");
        LIZ.append(str);
        LIZ.append(".so");
        return X1D.LIZIZ(LIZ);
    }

    public static final int LJIIL(KEI kei) {
        C70519Rlz c70519Rlz;
        o.LJIIIZ(kei, "<this>");
        Object obj = kei.LIZ;
        if ((obj instanceof C70519Rlz) && (c70519Rlz = (C70519Rlz) obj) != null) {
            return c70519Rlz.LJLIL;
        }
        return 0;
    }

    public static boolean LJIILIIL(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("audio_effect");
    }

    public static boolean LJIILJJIL(Effect effect) {
        String extra;
        if (effect == null || (extra = effect.getExtra()) == null || TextUtils.isEmpty(extra) || !extra.contains("lock_type")) {
            return false;
        }
        try {
            if (JSONObjectProtectorUtils.getInt(new JSONObject(extra), "lock_type") != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean LJIILL(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || TextUtils.isEmpty(faceStickerBean.getSdkExtra())) {
            return false;
        }
        return LJIIZILJ(faceStickerBean.getSdkExtra());
    }

    public static boolean LJIILLIIL(Effect effect) {
        if (effect == null) {
            return false;
        }
        return LJIIZILJ(effect.getSdkExtra());
    }

    public static boolean LJIIZILJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return "effectControlGame".equals(new JSONObject(str).optString("type"));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean LJIJI(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        if (!effect.getTags().contains("instrument") && !effect.getTypes().contains("Instrument")) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        Iterator<String> it = effect.getTags().iterator();
        while (it.hasNext()) {
            if (it.next().contains("lock")) {
                return true;
            }
        }
        return LJIILJJIL(effect);
    }

    public static boolean LJIL(Effect effect) {
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return false;
        }
        return LJIJ(effect.getSdkExtra(), "use_multi_camera", false);
    }

    public static boolean LJJ(FaceStickerBean faceStickerBean) {
        String LJII;
        if (faceStickerBean == null) {
            return false;
        }
        if (!LJIJ(faceStickerBean.getExtra(), "is_music_beat", false) && ((LJII = LJII(faceStickerBean.getSdkExtra(), "audio_graph")) == null || LJII.length() == 0)) {
            return false;
        }
        return true;
    }

    public static boolean LJJI(Effect effect) {
        String LJII;
        if (effect == null) {
            return false;
        }
        if (!LJIJ(effect.getExtra(), "is_music_beat", false) && ((LJII = LJII(effect.getSdkExtra(), "audio_graph")) == null || LJII.length() == 0)) {
            return false;
        }
        return true;
    }

    public static boolean LJJIFFI(Effect effect) {
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return false;
        }
        return LJIJ(effect.getSdkExtra(), "triggered_slow_motion", false);
    }

    public static boolean LJJII(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (LJJI(effect)) {
            return true;
        }
        return LJIJ(effect.getExtra(), "music_is_force_bind", false);
    }

    public static boolean LJJIII(Effect effect) {
        if (effect != null && !TextUtils.isEmpty(LJIIJJI(effect.getExtra(), "template_id"))) {
            return true;
        }
        return false;
    }

    public static final void LJJIIZI(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        KeyboardUtils.LIZIZ(C16880lQ.LLLLJI(C60903NvH.LJ), editText);
        editText.setSelection(editText.getText().length());
    }

    public static final boolean LJJIJ(FaceStickerBean faceStickerBean) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        if (!faceStickerBean.isBusi() || faceStickerBean.getFaceStickerCommerceBean() == null || (faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean()) == null || faceStickerCommerceBean.commerceStickerType != 1) {
            return false;
        }
        FaceStickerCommerceBean faceStickerCommerceBean2 = faceStickerBean.getFaceStickerCommerceBean();
        if (faceStickerCommerceBean2 != null) {
            str = faceStickerCommerceBean2.commerceStickerBuyText;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }

    public static final void LJJIJIIJI(Activity activity) {
        if (activity != null && C73340SqO.LJJIJ(activity)) {
            AnonymousClass114.LIZ(activity, R.string.h6x);
        }
    }

    public static final VideoCoverComponent LJJIJIIJIL(V43 v43) {
        VideoCoverType videoCoverType;
        ImageComponent imageComponent;
        ActionLinkComponent LIZ;
        String str = v43.video_id;
        if (str == null) {
            str = "";
        }
        V3O v3o = v43.video_type;
        ResolutionComponent resolutionComponent = null;
        if (v3o == null) {
            videoCoverType = VideoCoverType.INVALID;
        } else {
            VideoCoverType[] values = VideoCoverType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    videoCoverType = values[i];
                    if (videoCoverType.getValue() == v3o.getValue()) {
                        break;
                    }
                    i++;
                } else {
                    videoCoverType = VideoCoverType.VIDEO;
                    break;
                }
            }
        }
        String str2 = v43.video_model;
        C79135V3z c79135V3z = v43.cover;
        if (c79135V3z != null) {
            imageComponent = C79081V1x.LJJIZ(c79135V3z);
        } else {
            imageComponent = null;
        }
        C63714OzW c63714OzW = v43.linkInfo;
        if (c63714OzW != null) {
            LIZ = C62814Ol0.LJJIIZI(c63714OzW);
        } else {
            ActionLinkComponent.Companion.getClass();
            LIZ = C63715OzX.LIZ();
        }
        C79143V4h c79143V4h = v43.resolution;
        if (c79143V4h != null) {
            resolutionComponent = C1E4.LJJIJIIJI(c79143V4h);
        }
        return new VideoCoverComponent(imageComponent, str, str2, videoCoverType, LIZ, resolutionComponent, 16);
    }

    @Override // X.C57Q
    public void LIZ(View view) {
        TDU tdu;
        if ((view instanceof TDV) && (tdu = (TDU) view) != null) {
            tdu.setProgress(100);
        }
    }

    @Override // X.InterfaceC006400u
    public boolean LIZJ(InterfaceC31355CSh it) {
        o.LJIIIZ(it, "it");
        return it.LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0001, B:5:0x0008, B:12:0x0015, B:14:0x0020, B:16:0x002a, B:18:0x002d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = 0
            org.json.JSONArray r5 = r8.optJSONArray(r7)     // Catch: java.lang.Exception -> L31
            r4 = 0
            if (r5 == 0) goto L11
            int r0 = r5.length()     // Catch: java.lang.Exception -> L31
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            if (r0 == 0) goto L15
            return r6
        L15:
            int r3 = r5.length()     // Catch: java.lang.Exception -> L31
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L31
            r2.<init>(r3)     // Catch: java.lang.Exception -> L31
        L1e:
            if (r4 >= r3) goto L30
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r5, r4)     // Catch: java.lang.Exception -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L31
            if (r0 != 0) goto L2d
            r2.add(r1)     // Catch: java.lang.Exception -> L31
        L2d:
            int r4 = r4 + 1
            goto L1e
        L30:
            return r2
        L31:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V3N.LJFF(java.lang.String, org.json.JSONObject):java.util.List");
    }

    public static final boolean LJI(Aweme aweme, List list) {
        if (list != null && !list.isEmpty() && aweme != null) {
            String aid = aweme.getAid();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (o.LJ(((Aweme) it.next()).getAid(), aid)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String LJII(String str, String str2) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                return null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str2);
    }

    public static String LJIIJJI(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString(str2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List LJJIIJZLJL(String str, JSONObject jSONObject) {
        if (!TextUtils.equals("api_block_list", str) || !C35044DpA.LIZIZ()) {
            return LJFF(str, jSONObject);
        }
        ArrayList arrayList = (ArrayList) LJFF(str, jSONObject);
        if (arrayList.contains("/monitor/collect/")) {
            return arrayList;
        }
        arrayList.add("/monitor/collect/");
        return arrayList;
    }

    public static List LJJIIZ(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.equals("api_allow_list", str) && C35044DpA.LIZIZ()) {
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                if (!C43001GuD.LJIILIIL(optJSONObject)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (optJSONObject.optInt(next) == 1 && (C38540FAq.LIZ.contains(next) || !C38540FAq.LIZ(next))) {
                            arrayList.add(next);
                        }
                    }
                    return arrayList;
                }
            } else {
                JSONObject optJSONObject2 = jSONObject.optJSONObject(str);
                if (!C64055PBz.LIZIZ(optJSONObject2)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> keys2 = optJSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (optJSONObject2.optInt(next2) == 1) {
                            arrayList2.add(next2);
                        }
                    }
                    return arrayList2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // X.C57Q
    public void LIZIZ(int i, View view) {
        TDU tdu;
        if ((view instanceof TDV) && (tdu = (TDU) view) != null) {
            tdu.setProgress(i);
        }
    }

    public static boolean LJIJ(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "{}")) {
            try {
                return new JSONObject(str).optBoolean(str2, z);
            } catch (JSONException unused) {
                return false;
            }
        }
        return z;
    }

    public static boolean LJIJJLI(String str, List list, List list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C78915Uy7.LJIJJ(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (str.contains((String) it.next())) {
                    return true;
                }
            }
        }
        try {
            String path = new java.net.URI(str).getPath();
            if (!C78915Uy7.LJIJJ(list2)) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((Pattern) it2.next()).matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final void LJJIJL(C83146WkA c83146WkA, View view, int i) {
        o.LJIIIZ(c83146WkA, "<this>");
        o.LJIIIZ(view, "view");
        view.setVisibility(i);
    }

    public static final int[] LJJIJLIJ(int i, int i2, View view) {
        boolean z;
        int i3;
        int i4;
        o.LJIIIZ(view, "view");
        if (i / i2 == 0.75f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            HJ4 nowUIService = C60903NvH.LJIIJJI().LJJIII().getNowUIService();
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            nowUIService.resetSurface(view, application);
            HJ4 nowUIService2 = C60903NvH.LJIIJJI().LJJIII().getNowUIService();
            Application application2 = C60903NvH.LJ;
            o.LJIIIIZZ(application2, "getApplication()");
            return new int[]{0, nowUIService2.getSurfaceTopMargin(application2)};
        }
        C6FB c6fb = AnonymousClass699.LIZJ;
        if (c6fb != null) {
            c6fb.LJII(i, i2, view);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C6FB c6fb2 = AnonymousClass699.LIZJ;
        if (c6fb2 != null) {
            i3 = c6fb2.getBottomMargin();
        } else {
            i3 = 0;
        }
        C6FB c6fb3 = AnonymousClass699.LIZJ;
        if (c6fb3 != null) {
            i4 = c6fb3.LIZ();
        } else {
            i4 = 0;
        }
        if (AnonymousClass699.LIZJ instanceof C157226Fa) {
            return new int[]{(C81184Vtc.LJ(view.getContext()) - layoutParams.width) >> 1, i4};
        }
        if (i * 16 > i2 * 9.01d) {
            return new int[]{0, AnonymousClass030.LIZJ(C81184Vtc.LIZIZ(view.getContext()) - i3, layoutParams.height, 2, i4)};
        }
        return new int[]{(C81184Vtc.LJ(view.getContext()) - layoutParams.width) >> 1, i4};
    }

    public static final void LJJIJIL(C11H c11h, long j, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        MotionEvent LIZ = c11h.LIZ();
        if (LIZ != null) {
            int action = LIZ.getAction();
            if (z) {
                LIZ.setAction(3);
            }
            LIZ.offsetLocation(-C10370av.LIZLLL(j), -C10370av.LJ(j));
            interfaceC88472Yns.invoke(LIZ);
            LIZ.offsetLocation(C10370av.LIZLLL(j), C10370av.LJ(j));
            LIZ.setAction(action);
            return;
        }
        "The PointerEvent receiver cannot have a null MotionEvent.".toString();
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
