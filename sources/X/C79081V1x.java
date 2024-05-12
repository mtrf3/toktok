package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.effect.SoloBgEffectSelectChannel;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.express.command.Instruction;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lynx.hybrid.webkit.image.StreamRetrofitApi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import defpackage.b1;
import defpackage.i0;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.V1x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79081V1x implements X0H, InterfaceC121044p2, InterfaceC162186Yc, InterfaceC73459SsJ, InterfaceC61323O4x, X7E, InterfaceC40148FpI {
    public static boolean LJLIL;
    public static volatile String LJLILLLLZI;
    public static final C79081V1x LJLJI = new C79081V1x();
    public static final C79081V1x LJLJJI = new C79081V1x();
    public static Boolean LJLJJL;

    public static Object LJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7541627492083576859"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static void LJIJ() {
        C78765Uvh.LIZ = true;
        if (((Number) C35238DsI.LIZ.getValue()).intValue() > 0) {
            C81249Vuf.LIZJ = false;
        }
        W58.LIZ = C36744EbU.LJLILLLLZI;
        W58.LIZ.LJIIIZ(C79082V1y.LIZIZ);
        if (((Number) C35240DsK.LIZ.getValue()).intValue() > 0) {
            C79083V1z.LIZ = true;
            FrescoImageLoaderImpl.setIsRemoveLog(true);
            SmartImageView.setIsRemoveLog(true);
        }
        C79083V1z.LIZIZ = new C17N();
        if (!DMN.LIZ()) {
            Context LIZIZ = EF7.LIZIZ();
            C81815W9b c81815W9b = new C81815W9b();
            if (!W5U.LIZLLL) {
                W5U.LIZLLL = true;
                W5U.LIZJ = c81815W9b;
                W5U.LJ = LIZIZ.getPackageName();
                W5U.LIZ.init(c81815W9b);
            }
        }
        W5I.LJ = false;
        if (C81814W9a.LJIIJ().LIZ()) {
            W7V.LIZLLL = new UPJ();
        }
        if (C81814W9a.LJIIJ().LIZIZ()) {
            W6X.LJLJLJ = true;
        }
        QGI.LIZLLL = true;
        if (C19N.LJ("tt_lighten_enable_auto_biz_tag", true)) {
            C61843OOx c61843OOx = new C61843OOx();
            List<InterfaceC61844OOy> list = QGG.LIZIZ;
            synchronized (list) {
                ((ArrayList) list).add(c61843OOx);
            }
        }
    }

    @Override // X.X7E
    public void LIZ(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // X.X0H
    public void LIZIZ(String[] strArr) {
    }

    @Override // X.InterfaceC40148FpI
    public void LIZLLL(InterfaceC60761Nsz kitView, List list) {
        o.LJIIJ(kitView, "kitView");
    }

    @Override // X.InterfaceC40148FpI
    public void LJFF(InterfaceC60761Nsz kitView, java.util.Map map) {
        o.LJIIJ(kitView, "kitView");
    }

    @Override // X.InterfaceC40148FpI
    public void LJI(InterfaceC60761Nsz kitView, java.util.Map map) {
        o.LJIIJ(kitView, "kitView");
    }

    public static LiveEffect LJIIJJI() {
        Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
        if (LIZJ == null || LIZJ.intValue() != 0) {
            return null;
        }
        List<LiveEffect> LIZ = C12890ez.LIZ().LIZ("livebackground");
        o.LJIIIIZZ(LIZ, "LiveComposerManagerProvi…el.LIVE_BACKGROUND_PANEL)");
        return (LiveEffect) ORZ.LJLLLL(LIZ);
    }

    public static String LJIILJJIL() {
        if (TextUtils.isEmpty(LJLILLLLZI)) {
            try {
                Object obj = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread").call("getProcessName").get();
                if (obj != null && (obj instanceof String)) {
                    LJLILLLLZI = (String) obj;
                    return LJLILLLLZI;
                }
            } catch (Throwable unused) {
            }
        }
        return LJLILLLLZI;
    }

    public static LiveEffect LJIIIZ() {
        C42681lw LIZ = C12890ez.LIZ();
        List<LiveEffect> LIZ2 = LIZ.LIZ(C0TY.LIZIZ);
        o.LJIIIIZZ(LIZ2, "composerManager.getCurre…cker(EffectPanel.STICKER)");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ2);
        if (liveEffect != null) {
            return liveEffect;
        }
        Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
        if (LIZJ == null || LIZJ.intValue() != 0) {
            return null;
        }
        List<LiveEffect> LIZ3 = LIZ.LIZ("livebackground");
        o.LJIIIIZZ(LIZ3, "composerManager.getCurre…el.LIVE_BACKGROUND_PANEL)");
        LiveEffect liveEffect2 = (LiveEffect) ORZ.LJLLLL(LIZ3);
        if (liveEffect2 == null) {
            return null;
        }
        return liveEffect2;
    }

    public static boolean LJJI() {
        Integer LIZJ;
        List<LiveEffect> LIZ = C12890ez.LIZ().LIZ("livebackground");
        o.LJIIIIZZ(LIZ, "LiveComposerManagerProvi…el.LIVE_BACKGROUND_PANEL)");
        if (ORZ.LJLLLL(LIZ) != null && ((LIZJ = InterfaceC30442Bx8.i2.LIZJ()) == null || LIZJ.intValue() != 0)) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI() {
        Integer LIZJ;
        List<LiveEffect> LIZ = C12890ez.LIZ().LIZ("livebackground");
        o.LJIIIIZZ(LIZ, "LiveComposerManagerProvi…el.LIVE_BACKGROUND_PANEL)");
        if (ORZ.LJLLLL(LIZ) == null || (LIZJ = InterfaceC30442Bx8.i2.LIZJ()) == null || LIZJ.intValue() != 0) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C79081V1x() {
    }

    public /* synthetic */ C79081V1x(C83590WrK c83590WrK) {
    }

    public static final int LJII(int i) {
        return C17N.LJIILL(i);
    }

    public static final String LJIIIIZZ(MediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "<this>");
        String str = mediaModel.fileLocalUriPath;
        str.toString();
        String nativeGetMimeType = TEVideoUtils.nativeGetMimeType(str);
        o.LJIIIIZZ(nativeGetMimeType, "getMimeType(fileLocalUriPath.toString())");
        return nativeGetMimeType;
    }

    public static final List LJIIL(ImageComponent imageComponent) {
        o.LJIIIZ(imageComponent, "<this>");
        String str = imageComponent.decryptKey;
        if (str == null || str.length() == 0) {
            return imageComponent.urls;
        }
        List<String> list = imageComponent.urls;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            StringBuilder LIZJ = b1.LIZJ(it.next(), "%%secretKey=");
            LIZJ.append(imageComponent.decryptKey);
            arrayList.add(X1D.LIZIZ(LIZJ));
        }
        return arrayList;
    }

    public static String LJIILIIL(Throwable th) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            if (th instanceof C38138Exy) {
                i = ((C38138Exy) th).LJLIL;
            } else {
                i = 0;
            }
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static final OML LJIILLIIL(Aweme aweme) {
        boolean isLive;
        boolean isPhotoMode;
        if (aweme != null) {
            if (aweme.getIsSubAweme()) {
                isLive = o.LJ("live_sub_aweme_type", aweme.getLiveType());
            } else {
                isLive = aweme.isLive();
            }
            if (isLive) {
                return OML.LIVE_TYPE;
            }
            if (aweme != null) {
                if (aweme.getIsSubAweme()) {
                    isPhotoMode = o.LJ("photo_sub_aweme_type", aweme.getExtra());
                } else {
                    isPhotoMode = aweme.isPhotoMode();
                }
                if (isPhotoMode) {
                    return OML.PHOTO_TYPE;
                }
            }
        }
        return OML.FEED_TYPE;
    }

    public static final boolean LJIIZILJ(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (LJJIJL((MediaModel) next)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJIJJ(Aweme aweme) {
        if (aweme == null || OMU.LIZIZ(aweme) != OBQ.BACKGROUND.getType()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJLI(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        int LIZIZ = OMU.LIZIZ(aweme);
        if (LIZIZ != OBQ.FORCE_VIDEO.getType() && LIZIZ != OBQ.FORCE_VIDEO_NO_COVER.getType()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(Aweme aweme) {
        if (aweme == null || OMU.LIZIZ(aweme) != OBQ.GREY_CARD.getType()) {
            return false;
        }
        return true;
    }

    public static final C72441Sbt LJJII(InterfaceC65784Pro initializer) {
        o.LJIIJ(initializer, "initializer");
        return new C72441Sbt(initializer);
    }

    public static final int LJJIIZI(Number number) {
        o.LJIIIZ(number, "<this>");
        return C17N.LJJJJI(number.doubleValue());
    }

    public static LiveEffect LJJIJIIJIL(DataChannel dataChannel) {
        List<LiveEffect> LIZ;
        LiveEffect liveEffect;
        InterfaceC28989BZh interfaceC28989BZh;
        Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
        if (LIZJ == null || LIZJ.intValue() != 0 || (LIZ = C12890ez.LIZ().LIZ("livebackground")) == null || (liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ)) == null) {
            return null;
        }
        InterfaceC30594Bza interfaceC30594Bza = C07510Rf.LIZLLL;
        if (interfaceC30594Bza != null) {
            interfaceC30594Bza.LJI(null);
        }
        InterfaceC30594Bza interfaceC30594Bza2 = C07510Rf.LIZLLL;
        if (interfaceC30594Bza2 != null) {
            interfaceC30594Bza2.LIZIZ();
        }
        if (dataChannel != null) {
            dataChannel.rv0(SoloBgEffectSelectChannel.class, new LiveEffect());
        }
        WeakReference<InterfaceC28989BZh> weakReference = C11020by.LIZIZ;
        if (weakReference != null && (interfaceC28989BZh = weakReference.get()) != null) {
            interfaceC28989BZh.LIZ(liveEffect, null);
        }
        return liveEffect;
    }

    public static LiveEffect LJJIJIL(DataChannel dataChannel) {
        LiveEffect liveEffect;
        C0PQ c0pq;
        C42681lw LIZ = C12890ez.LIZ();
        String str = C0TY.LIZIZ;
        List<LiveEffect> LIZ2 = LIZ.LIZ(str);
        if (LIZ2 == null || (liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ2)) == null) {
            return null;
        }
        if (dataChannel != null) {
            dataChannel.rv0(StickerSelectChannel.class, new LiveEffect());
        }
        C31691Mf.LJI.LIZLLL(str);
        WeakReference<C0PQ> weakReference = C11020by.LIZ;
        if (weakReference != null && (c0pq = weakReference.get()) != null) {
            c0pq.LIZ(liveEffect, null);
        }
        return liveEffect;
    }

    public static final boolean LJJIJL(MediaModel mediaModel) {
        VEUtils.VEVideoFileInfo videoFileInfo;
        Boolean valueOf;
        if (mediaModel != null && (videoFileInfo = VEUtils.getVideoFileInfo(mediaModel.fileLocalUriPath)) != null && (valueOf = Boolean.valueOf(videoFileInfo.bHDR)) != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public static final IconTypeComponent LJJIL(EnumC79091V2h enumC79091V2h) {
        if (enumC79091V2h == null) {
            return IconTypeComponent.DEFAULT;
        }
        for (IconTypeComponent iconTypeComponent : IconTypeComponent.values()) {
            if (iconTypeComponent.getValue() == enumC79091V2h.getValue()) {
                return iconTypeComponent;
            }
        }
        return IconTypeComponent.DEFAULT;
    }

    public static final ImageComponent LJJIZ(C79135V3z c79135V3z) {
        ResolutionComponent resolutionComponent;
        List<String> url_list = c79135V3z.url_list;
        o.LJIIIIZZ(url_list, "url_list");
        String str = c79135V3z.image_id;
        String str2 = c79135V3z.display_name;
        C79143V4h c79143V4h = c79135V3z.resolution;
        if (c79143V4h != null) {
            resolutionComponent = C1E4.LJJIJIIJI(c79143V4h);
        } else {
            resolutionComponent = null;
        }
        return new ImageComponent(url_list, str, str2, resolutionComponent, c79135V3z.decrypt_key, LJJIL(c79135V3z.fallback_icon_type));
    }

    public static final void LJJJIL(InterfaceC88472Yns block) {
        o.LJIIIZ(block, "block");
        if (INB.LIZIZ()) {
            block.invoke(IR8.LIZIZ());
        }
    }

    public static final void LJJJJ(InterfaceC88472Yns block) {
        o.LJIIIZ(block, "block");
        if (INB.LIZJ()) {
            block.invoke(IR8.LIZIZ());
        }
    }

    public void LJJIIJZLJL(JSONObject jSONObject) {
        FMX.LJIILJJIL("aweme_publish_task_timeout", jSONObject);
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    @Override // X.InterfaceC61323O4x
    public O48 request(String path) {
        C64797Pbt<TypedInput> execute;
        C36910EeA c36910EeA;
        TypedInput typedInput;
        o.LJIIJ(path, "path");
        O48 o48 = null;
        InterfaceC37276Ek4<TypedInput> streamRequest = ((StreamRetrofitApi) C65083PgV.LJIIIIZZ(StreamRetrofitApi.class, path)).streamRequest(path, null);
        if (streamRequest != null && (execute = streamRequest.execute()) != null && (c36910EeA = execute.LIZ) != null && (typedInput = c36910EeA.LJ) != null) {
            InputStream in = typedInput.in();
            o.LJFF(in, "it.`in`()");
            List<EJ6> list = execute.LIZ.LIZLLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list != null) {
                for (EJ6 ej6 : list) {
                    if (linkedHashMap.get(ej6.LIZ) == null) {
                        String str = ej6.LIZ;
                        o.LJFF(str, "header.name");
                        String str2 = ej6.LIZIZ;
                        o.LJFF(str2, "header.value");
                        linkedHashMap.put(str, str2);
                    } else {
                        String str3 = ej6.LIZ;
                        o.LJFF(str3, "header.name");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append((String) linkedHashMap.get(ej6.LIZ));
                        LIZ.append(" ,");
                        LIZ.append(ej6.LIZIZ);
                        linkedHashMap.put(str3, X1D.LIZIZ(LIZ));
                    }
                }
            }
            o48 = new O48(in, linkedHashMap, false);
        }
        return o48;
    }

    public static String LJIILL(C38126Exm c38126Exm, Object obj) {
        String str;
        if ((obj instanceof JSONObject) && LJLIL && c38126Exm.LIZIZ) {
            JSONObject jSONObject = (JSONObject) obj;
            try {
                jSONObject.put("code", 1);
                return jSONObject.toString();
            } catch (JSONException unused) {
            }
        }
        String LIZIZ = c38126Exm.LIZIZ(obj);
        if (TextUtils.isEmpty(LIZIZ)) {
            return "{\"code\":1}";
        }
        if (LJLIL) {
            str = C79061V1d.LJ(LIZIZ, 1, 1);
        } else {
            str = "";
        }
        String LJFF = i0.LJFF("{\"code\":1,\"__data\":", LIZIZ);
        if (!str.isEmpty()) {
            return C0ON.LIZJ(LJFF, ",", str, "}");
        }
        return i0.LJFF(LJFF, "}");
    }

    public static boolean LJJ(List list, List list2) {
        if (list == null) {
            if (list2 == null) {
                return true;
            }
        } else if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = ListProtector.get(list, i);
            Object obj2 = ListProtector.get(list2, i);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else {
                if (obj2 != null && obj.equals(obj2)) {
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x04bf, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC16010k1 LJJIIZ(final int r32, X.InterfaceC24520xk r33) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79081V1x.LJJIIZ(int, X.0xk):X.0k1");
    }

    public static final void LJJIJ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C38236EzY c38236EzY) {
        C37942Euo c37942Euo;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        if (sparkContext != null && (c37942Euo = (C37942Euo) sparkContext.LIZIZ(C37942Euo.class)) != null) {
            c37942Euo.LJIILJJIL(c38236EzY);
        }
    }

    public static void LJJIJIIJI(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, Class cls) {
        C37942Euo c37942Euo;
        EnumC37844EtE scope = EnumC37844EtE.ALL;
        o.LJIIIZ(scope, "scope");
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        if (sparkContext != null && (c37942Euo = (C37942Euo) sparkContext.LIZIZ(C37942Euo.class)) != null) {
            c37942Euo.LJIIL(cls, scope);
        }
    }

    public static final Q2L LJJIJLIJ(Instruction toCommand, C38521F9x exprContext) {
        o.LJIIJ(toCommand, "$this$toCommand");
        o.LJIIJ(exprContext, "exprContext");
        int i = (toCommand.getI() << 14) >> 28;
        Q2J LJFF = C70657RoD.LJFF((toCommand.getI() << 18) >> 28);
        int i2 = toCommand.getI() % 1024;
        if (i == Q2F.ValueCommand.getCode()) {
            return new Q2G(toCommand.getV(), LJFF);
        }
        if (i == Q2F.IdentifierCommand.getCode()) {
            Object v = toCommand.getV();
            if (v != null) {
                return new Q2E((String) v);
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        }
        if (i == Q2F.FunctionCommand.getCode()) {
            C61689OIz c61689OIz = (C61689OIz) exprContext.LIZIZ;
            Object v2 = toCommand.getV();
            if (v2 != null) {
                PQ5 LIZ = c61689OIz.LIZ((String) v2);
                if (LIZ == null) {
                    return new Q2C((String) toCommand.getV(), i2, (C61689OIz) exprContext.LIZIZ);
                }
                return new Q2D(LIZ, i2);
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        }
        if (i == Q2F.OperateCommand.getCode()) {
            C03880Dg c03880Dg = (C03880Dg) exprContext.LIZ;
            Object v3 = toCommand.getV();
            if (v3 != null) {
                Q2V q2v = (Q2V) ((java.util.Map) c03880Dg.LIZ).get(v3);
                if (q2v != null) {
                    return new Q2H(q2v, i2);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("operator = ");
                LIZ2.append(toCommand.getV());
                throw new C61596OFk(110, X1D.LIZIZ(LIZ2));
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        }
        throw new C61596OFk(108, KMP.LJ("commandType = ", i));
    }

    @Override // X.InterfaceC73459SsJ
    public void accept(Object obj, Object simpleMusic) {
        List list = (List) obj;
        o.LJIIIZ(list, "list");
        o.LJIIIZ(simpleMusic, "simpleMusic");
        list.add(simpleMusic);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C26566Abi LJJJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r27, boolean r28, X.EnumC28020AzA r29) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79081V1x.LJJJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, boolean, X.AzA):X.Abi");
    }

    public static final void LJJJI(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, String str, Object value) {
        C38518F9u c38518F9u;
        java.util.Map map;
        o.LJIIIZ(value, "value");
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        if (sparkContext == null || (c38518F9u = sparkContext.runtimeInfo) == null) {
            return;
        }
        Object obj = c38518F9u.get((Object) "queryItems");
        if (C65777Prh.LJII(obj) && (map = (java.util.Map) obj) != null) {
            map.put(str, String.valueOf(value));
        }
        InterfaceC60761Nsz interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLIL;
        if (interfaceC60761Nsz == null) {
            return;
        }
        interfaceC60761Nsz.LIZ(c38518F9u);
    }

    @Override // X.InterfaceC121044p2
    public boolean LIZJ(String eventType, List actionTypes, java.util.Map contextMap) {
        boolean z;
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(actionTypes, "actionTypes");
        o.LJIIIZ(contextMap, "contextMap");
        Iterator it = actionTypes.iterator();
        while (true) {
            boolean z2 = true;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (z2) {
                    if (intValue != 0) {
                        if (intValue == 1) {
                            break;
                        }
                        if (intValue != 2) {
                            if (intValue != 3) {
                            }
                        } else {
                            while (true) {
                                z = true;
                                for (Map.Entry entry : ((LinkedHashMap) contextMap).entrySet()) {
                                    if (!z || ((C46519INn) entry.getValue()).LIZIZ != EnumC46518INm.ALLOW_OPEN_MIC) {
                                        z = false;
                                    }
                                }
                            }
                        }
                    } else {
                        while (true) {
                            z = true;
                            for (Map.Entry entry2 : ((LinkedHashMap) contextMap).entrySet()) {
                                if (!z || ((C46519INn) entry2.getValue()).LIZ != EnumC46517INl.ALLOW_OPEN_CAMERA) {
                                    z = false;
                                }
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                }
                z2 = false;
            }
            return z2;
        }
    }

    public static final Bitmap LJIIJ(float f, int i, int i2, View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(C82891Wg3.LIZ().getResources().getDisplayMetrics().densityDpi);
            if (view.getDrawingCacheBackgroundColor() != 0) {
                createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(f, f);
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(view, canvas);
            view.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            C82891Wg3.LIZLLL().LIZIZ(e);
            return null;
        }
    }

    public static final void LJJIIJ(EnumC61143Nz9 step, String materialId, String detail, String str) {
        o.LJIIIZ(step, "step");
        o.LJIIIZ(materialId, "materialId");
        o.LJIIIZ(detail, "detail");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("step", step.getValue());
        jSONObject.put("material_id", materialId);
        jSONObject.put("detail", detail);
        if (str != null) {
            jSONObject.put("code", str);
        }
        C58106MrG.LIZIZ.LIZ.LIZ("dev_lingo_detail", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIJI(java.lang.Class r4, java.lang.String r5, java.lang.Class[] r6, java.lang.Object[] r7, java.lang.Object... r8) {
        /*
            boolean r0 = X.C38354F3m.LJ(r5)
            r3 = 0
            if (r0 == 0) goto L8
        L7:
            return r3
        L8:
            r2 = 0
            if (r6 != 0) goto Ld
            java.lang.Class[] r6 = new java.lang.Class[r2]
        Ld:
            if (r7 != 0) goto L11
            java.lang.Object[] r7 = new java.lang.Object[r2]
        L11:
            boolean r0 = X.C38354F3m.LJ(r5)     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L18
            goto L22
        L18:
            java.lang.reflect.Method r1 = r4.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L1d:
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r1 = r3
        L23:
            if (r1 != 0) goto L26
            return r3
        L26:
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L7
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7
            if (r0 <= 0) goto L34
            r0 = r8[r2]     // Catch: java.lang.Throwable -> L7
            java.lang.Object r0 = LJ(r0, r1, r7)     // Catch: java.lang.Throwable -> L7
            return r0
        L34:
            java.lang.Object r0 = LJ(r3, r1, r7)     // Catch: java.lang.Throwable -> L7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79081V1x.LJIJI(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Object[], java.lang.Object[]):java.lang.Object");
    }

    public static void LJJIII(EnumC61143Nz9 step, String materialId, boolean z, long j, String str, String str2, String str3, String str4, int i) {
        Object obj;
        boolean z2 = true;
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) == 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        o.LJIIIZ(step, "step");
        o.LJIIIZ(materialId, "materialId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("step", step.getValue());
        jSONObject.put("material_id", materialId);
        String str5 = "1";
        jSONObject.put("from_native", "1");
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("step_state", obj);
        jSONObject.put("stay_time", String.valueOf(j));
        if (!z2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("has_lynx_view", str5);
        jSONObject.put("lingo_time_ms", String.valueOf(System.currentTimeMillis()));
        if (str != null) {
            jSONObject.put("gecko_url", str);
        }
        if (str2 != null) {
            jSONObject.put("error_code", str2);
        }
        if (str3 != null) {
            jSONObject.put("error_tips", str3);
        }
        if (str4 != null) {
            jSONObject.put("gecko_version", str4);
        }
        C58106MrG.LIZIZ.LIZ.LIZ("dev_lingo_caption", jSONObject);
    }
}
