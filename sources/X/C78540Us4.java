package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.aweme.service.PostModeServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Us4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78540Us4 implements X5O, InterfaceC64517PTt, InterfaceC48038ItG, UW1 {
    public static final C78540Us4 LJLIL = new C78540Us4();
    public static final C78540Us4 LJLILLLLZI = new C78540Us4();

    @Override // X.X5O
    public void onStart(int i) {
    }

    public static final boolean LJIIJJI() {
        C30553Byv c30553Byv;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C30553Byv c30553Byv2 = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class);
        if (c30553Byv2 != null && c30553Byv2.LJLIL == 1 && ((c30553Byv = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class)) == null || c30553Byv.LJLJI != 0)) {
            return true;
        }
        return false;
    }

    public static final String LJIIZILJ() {
        C30553Byv c30553Byv = (C30553Byv) DataChannelGlobal.LJLJJI.mv0(C30386BwE.class);
        if (c30553Byv != null && c30553Byv.LJLIL == 0) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final boolean LJJIII() {
        C30553Byv c30553Byv;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C30553Byv c30553Byv2 = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class);
        if (c30553Byv2 != null && c30553Byv2.LJLIL == 0 && ((c30553Byv = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class)) == null || c30553Byv.LJLJI != 0)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJ() {
        C30553Byv c30553Byv;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C30553Byv c30553Byv2 = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class);
        if (c30553Byv2 != null && c30553Byv2.LJLIL == 0 && (c30553Byv = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class)) != null && c30553Byv.LJLJI == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJZLJL() {
        C30553Byv c30553Byv;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C30553Byv c30553Byv2 = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class);
        if (c30553Byv2 != null && c30553Byv2.LJLIL == 0 && (c30553Byv = (C30553Byv) dataChannelGlobal.mv0(C30386BwE.class)) != null && c30553Byv.LJLJI == 2) {
            return true;
        }
        return false;
    }

    public static void LJIJI() {
        C09970aH.LJII();
    }

    public static final void LIZLLL(InterfaceC65784Pro interfaceC65784Pro) {
        if (!e1.LIZ(31744, "import_video_optimization", true, false) || ((Number) C52768KnM.LIZ.getValue()).intValue() != 0) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(X.KRA r3) {
        /*
            if (r3 == 0) goto L18
            X.M89 r0 = r3.LIZJ
            if (r0 == 0) goto L18
            int r2 = r0.getPageType()
        La:
            X.M89 r0 = r3.LIZJ
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.getEventType()
        L12:
            r0 = 1
            java.lang.String r0 = X.C62819Ol5.LJIILIIL(r2, r1, r0)
            return r0
        L18:
            r2 = 0
            if (r3 == 0) goto L1c
            goto La
        L1c:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78540Us4.LJFF(X.KRA):java.lang.String");
    }

    public static final IFeedPanelPlatformAbility LJI(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        InterfaceC55235Lm3 LJFF = KR8.LJFF(fragment);
        if (LJFF == null) {
            return null;
        }
        return (IFeedPanelPlatformAbility) C55096Ljo.LIZ(LJFF, IFeedPanelPlatformAbility.class, null);
    }

    public static final C37039EgF LJIIIIZZ(WebView runtimeTag) {
        o.LJIIIZ(runtimeTag, "$this$runtimeTag");
        Object tag = runtimeTag.getTag(R.id.ni5);
        if (!(tag instanceof C37039EgF)) {
            tag = null;
        }
        return (C37039EgF) tag;
    }

    public static final IViewPagerComponentAbility LJIIIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        IFeedPanelPlatformAbility LJI = LJI(fragment);
        if (LJI != null) {
            return LJI.getViewPagerComponentAbility();
        }
        return null;
    }

    public static final boolean LJIILIIL(Aweme aweme) {
        if (aweme != null && (aweme.isAd() || C63081OpJ.LLIIII(aweme))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILLIIL(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        IPostModeService LJJIIJ = PostModeServiceImpl.LJJIIJ();
        o.LJIIIIZZ(LJJIIJ, "get().getService<IPostMo…ervice::class.java,\n    )");
        if (aweme == null || aweme.getAwemeType() != 150 || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 0 || ((Boolean) C53115Ksx.LIZ.getValue()).booleanValue() || !LJJIIJ.LJIIJ() || aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJLI(Effect effect) {
        if (effect == null || effect.getUnzipPath() == null) {
            return false;
        }
        String unzipPath = effect.getUnzipPath();
        if (!C39579Fg7.LIZIZ(unzipPath) || TEVideoUtils.nativeCheckMVResourceIntegrity(unzipPath) != 0) {
            return false;
        }
        return true;
    }

    public static final C60880Nuu LJIL(InputStream inputStream) {
        JSONObject optJSONObject;
        JSONArray jSONArray = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String LJIILJJIL = C77321UWf.LJIILJJIL(bufferedReader);
                AnonymousClass636.LJFF(bufferedReader, null);
                JSONObject jSONObject = new JSONObject(LJIILJJIL);
                String groupVersion = jSONObject.optString("version", "");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("android");
                if (optJSONObject2 != null) {
                    jSONArray = optJSONObject2.optJSONArray("card_list");
                }
                HashMap hashMap = new HashMap();
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        if (jSONArray != null && (optJSONObject = jSONArray.optJSONObject(i)) != null) {
                            String cardVersion = optJSONObject.optString("card_version", "");
                            String id = optJSONObject.optString("card_id", "");
                            String path = optJSONObject.optString("card_template_path", "");
                            optJSONObject.optString("desc");
                            optJSONObject.optBoolean("fetch_res", false);
                            ArrayList arrayList = new ArrayList();
                            JSONArray optJSONArray = optJSONObject.optJSONArray("res_http_prefix");
                            if (optJSONArray != null) {
                                int length2 = optJSONArray.length();
                                for (int i2 = 0; i2 < length2; i2++) {
                                    String optString = optJSONArray.optString(i2);
                                    if (optString != null) {
                                        arrayList.add(optString);
                                    }
                                }
                            }
                            optJSONObject.optJSONObject("extra");
                            o.LJFF(id, "id");
                            o.LJFF(cardVersion, "cardVersion");
                            o.LJFF(path, "path");
                            hashMap.put(id, new C40697Fy9(cardVersion, id, path, arrayList));
                        }
                    }
                }
                o.LJFF(groupVersion, "groupVersion");
                return new C60880Nuu(0, groupVersion, hashMap);
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void LJJ(C78542Us6 c78542Us6) {
        Long l;
        if (c78542Us6.LJIIZILJ == null && ((l = c78542Us6.LJIJJ) == null || l.longValue() == 0)) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", c78542Us6.LIZ);
        c145995oB.LJI("enter_from", c78542Us6.LIZIZ);
        c145995oB.LJI("content_source", c78542Us6.LIZJ);
        c145995oB.LJI("content_type", c78542Us6.LIZLLL);
        c145995oB.LIZJ(c78542Us6.LJ, "is_multi_content");
        c145995oB.LJI("shoot_way", c78542Us6.LJFF);
        c145995oB.LJI("effect_list", c78542Us6.LJI);
        c145995oB.LIZJ(c78542Us6.LJII, "beautify_used");
        c145995oB.LIZJ(c78542Us6.LJIIIIZZ, "is_quality_improve");
        c145995oB.LJI("filter_list", c78542Us6.LJIIIZ);
        c145995oB.LJI("sticker_list", c78542Us6.LJIIJ);
        c145995oB.LJI("prop_list", c78542Us6.LJIIJJI);
        c145995oB.LJI("music_id", c78542Us6.LJIIL);
        c145995oB.LJI(WM7.SCENE_SERVICE, c78542Us6.LJIILJJIL);
        c145995oB.LIZJ(c78542Us6.LJIILLIIL, "duration");
        c145995oB.LIZJ(c78542Us6.LJIIZILJ, "fps");
        c145995oB.LIZJ(c78542Us6.LJIJ, "drop_max");
        c145995oB.LIZJ(c78542Us6.LJIJI, "weighted_drop_count");
        c145995oB.LIZJ(c78542Us6.LJIJJ, "block_duration");
        c145995oB.LIZJ(c78542Us6.LJIJJLI, "block_count");
        c145995oB.LIZJ(c78542Us6.LJIL, "level_1");
        c145995oB.LIZJ(c78542Us6.LJJ, "level_2");
        c145995oB.LIZJ(c78542Us6.LJJI, "level_3");
        c145995oB.LIZJ(c78542Us6.LJJIFFI, "level_4");
        Integer num = c78542Us6.LJIILL;
        if (num != null) {
            num.intValue();
            c145995oB.LIZJ(c78542Us6.LJIILL, "creation_duration");
        }
        GXR.LIZ("tool_performance_fps_info", c145995oB.LIZ);
    }

    public static final boolean LJJII(Effect effect) {
        boolean z;
        o.LJIIIZ(effect, "effect");
        try {
            z = o.LJ(new JSONObject(effect.getSdk_extra()).optString("amazing_mv"), "1");
        } catch (JSONException unused) {
            z = false;
        }
        if (((Boolean) C52871Kp1.LIZ.getValue()).booleanValue()) {
            return z;
        }
        return !z;
    }

    public static final C73454SsE LJJIIZ(AbstractC73672Svk abstractC73672Svk) {
        o.LJIIIZ(abstractC73672Svk, "<this>");
        return abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String galleryPath = (String) obj;
        o.LJIIIZ(galleryPath, "galleryPath");
        return new OSZ(Boolean.valueOf(C39579Fg7.LIZIZ(galleryPath)), galleryPath);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r1 & r3) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0010, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if ((r2.LJLJI & r3) == 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        r1 = r2.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if ((r1 & 2) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1M3 LIZJ(X.InterfaceC03740Cs r2, int r3) {
        /*
            X.1M3 r0 = r2.LJIIIIZZ()
            X.1M3 r2 = r0.LJLJJL
            if (r2 != 0) goto La
        L8:
            r2 = 0
        L9:
            return r2
        La:
            int r0 = r2.LJLJI
            r0 = r0 & r3
            if (r0 != 0) goto L12
            goto L8
        L10:
            if (r2 == 0) goto L8
        L12:
            int r1 = r2.LJLILLLLZI
            r0 = r1 & 2
            if (r0 == 0) goto L19
            goto L8
        L19:
            r1 = r1 & r3
            if (r1 == 0) goto L1d
            goto L9
        L1d:
            X.1M3 r2 = r2.LJLJJL
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78540Us4.LIZJ(X.0Cs, int):X.1M3");
    }

    public static final void LJIIJ(MBA mba, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) mba.get(CoroutineExceptionHandler.LJJJJIZL);
            if (coroutineExceptionHandler == null) {
                C36868EdU.LIZ(mba, th);
            } else {
                coroutineExceptionHandler.handleException(mba, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                V0N.LJFF(runtimeException, th);
                th = runtimeException;
            }
            C36868EdU.LIZ(mba, th);
        }
    }

    public static final void LJIJJ(M89 m89, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (m89 != null) {
            str2 = m89.getFrom();
            str6 = m89.getHotEnterMethod();
        } else {
            str2 = null;
        }
        try {
            if (C55312LnI.LIZIZ(str2, str6, "", "") && !C55312LnI.LJIIIIZZ) {
                long currentTimeMillis = System.currentTimeMillis();
                C188727au c188727au = new C188727au();
                c188727au.LJ(currentTimeMillis - C55312LnI.LIZ, "duration");
                c188727au.LIZLLL(C55312LnI.LIZIZ, "page_size");
                c188727au.LJIIIZ("card_status", C55312LnI.LIZJ);
                c188727au.LJIIIZ("click_area", C55312LnI.LIZLLL);
                String str7 = "1";
                if (C55312LnI.LJFF) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("detail_page_created", str3);
                if (C55312LnI.LJII) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("video_view_cell_created", str4);
                if (C55312LnI.LJI) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("try_play", str5);
                if (!C55312LnI.LJIIIZ) {
                    str7 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("render_first_frame", str7);
                c188727au.LIZLLL(C55312LnI.LJ, "single_player");
                c188727au.LJIIIZ("enter_from", str6);
                c188727au.LJIIIZ("error_msg", str);
                FMX.LJIIL("rd_tiktokec_mall_video_page_exited", c188727au.LIZ);
                C55312LnI.LJIIIIZZ = true;
            }
        } catch (Exception unused) {
        }
    }

    public static final void LJJI(DataChannel dataChannel, boolean z) {
        String str;
        Object kv0;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_studio_detail_click");
        if (dataChannel != null && (kv0 = dataChannel.kv0(C0X.class)) != null && kv0 == LiveMode.LIVE_STUDIO) {
            String str2 = (String) dataChannel.kv0(C0W.class);
            if (!TextUtils.isEmpty(str2)) {
                LIZ.LJIJJ(str2, "convert_from");
            }
        }
        LIZ.LJIJJ(C0DC.LIZ(), "anchor_id");
        LIZ.LJIJJ(str, "from_message");
        LIZ.LJJIIJZLJL();
    }

    public static final Object LJJIFFI(Object obj, java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        if ((obj != null && map.containsKey(obj)) || (0 != 0 && map != null)) {
            return map.get(obj);
        }
        return null;
    }

    public static String LJJIJ(Context context, String str) {
        QH7.LJIIIIZZ(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = C68053QnJ.LIZ(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    @Override // X.InterfaceC64517PTt
    public InterfaceC64510PTm LIZIZ(C32420Cnw request, C32287Cln config) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(config, "config");
        InterfaceC32418Cnu interfaceC32418Cnu = config.LIZ;
        o.LJIIIIZZ(interfaceC32418Cnu, "config.fileCacheFactory");
        return new C64520PTw(interfaceC32418Cnu);
    }

    public static String LJJIIZI(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if (str == null) {
                if (str2 == null) {
                    return strArr2[i];
                }
            } else {
                if (str.equals(str2)) {
                    return strArr2[i];
                }
            }
        }
        return null;
    }

    public static JSONObject LJII(boolean z, int i, Exception exc, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("success", z);
            jSONObject.put("code", i);
            if (exc != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(exc.getMessage());
                LIZ.append(C39016FSy.LIZ(30, exc));
                jSONObject.put("exception", X1D.LIZIZ(LIZ));
                jSONObject.put("exception_object", exc);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIIL(X.C79953Bv r5, X.InterfaceC88473Ynt r6, java.lang.Throwable r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.C77424Ua4
            if (r0 == 0) goto L22
            r4 = r8
            X.Ua4 r4 = (X.C77424Ua4) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            java.lang.Object r7 = r4.LJLIL
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            goto L28
        L22:
            X.Ua4 r4 = new X.Ua4
            r4.<init>(r8)
            goto L12
        L28:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L45
            goto L42
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r7     // Catch: java.lang.Throwable -> L45
            r4.LJLJI = r0     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r6.invoke(r5, r7, r4)     // Catch: java.lang.Throwable -> L45
            if (r0 != r2) goto L42
            return r2
        L42:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L45:
            r0 = move-exception
            if (r7 == 0) goto L4d
            if (r7 == r0) goto L4d
            X.V0N.LJFF(r0, r7)
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78540Us4.LJIIL(X.3Bv, X.Ynt, java.lang.Throwable, X.2kd):java.lang.Object");
    }

    public static final boolean LJIILJJIL(String str, String str2, String str3, String str4) {
        if (o.LJ("goods_search", str) && o.LJ("goods_search", str2) && TextUtils.equals(str3, str4)) {
            return true;
        }
        return false;
    }

    @Override // X.UW1
    public boolean LIZ(C32816CuK c32816CuK, C32816CuK c32816CuK2, int i, int i2) {
        C32804Cu8 LJJII;
        C32804Cu8 LJJII2 = V16.LJJII(c32816CuK);
        if (LJJII2 == null || LJJII2.LJJIFFI || (LJJII = V16.LJJII(c32816CuK2)) == null || !V16.LJJLI(c32816CuK, c32816CuK2) || LJJII2.LIZJ != LJJII.LIZJ || LJJII2.LIZ != LJJII.LIZ) {
            return false;
        }
        c32816CuK2.LIZ.addAll(c32816CuK.LIZ);
        return true;
    }
}
