package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.FcU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39354FcU extends AbstractC39356FcW {
    public final void LJII(Context context) {
        Object LIZ;
        String str;
        String str2;
        Activity LIZLLL;
        InterfaceC38263Ezz interfaceC38263Ezz;
        InterfaceC37790EsM interfaceC37790EsM;
        try {
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            str = "";
            if (interfaceC38263Ezz2 == null || (str2 = interfaceC38263Ezz2.LIZIZ()) == null) {
                str2 = "";
            }
            if (str2.length() != 0 || ((interfaceC38263Ezz = this.LJLIL) != null && (interfaceC37790EsM = (InterfaceC37790EsM) interfaceC38263Ezz.LJ(InterfaceC37790EsM.class)) != null && (str2 = interfaceC37790EsM.LIZ()) != null)) {
                str = str2;
            }
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (BulletService.LIZ().LJIIIZ(context, str)) {
            return;
        }
        SparkContext.Companion.getClass();
        InterfaceC40159FpT LIZ2 = C39359FcZ.LIZ(str);
        if (LIZ2 != null) {
            LIZ2.close();
            String str3 = C75252xN.LIZJ(str).get("__spark_session_id");
            if (str3 != null) {
                C40101FoX.LIZIZ(str3);
                return;
            }
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz3 = this.LJLIL;
        if (interfaceC38263Ezz3 != null && (LIZLLL = interfaceC38263Ezz3.LIZLLL()) != null) {
            LIZLLL.finish();
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && !LJIJJ.isFinishing()) {
            LJIJJ.finish();
        }
        LIZ = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ);
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    public static OSZ LJIIIIZZ(Context context, String str, int i) {
        Class<? extends Activity> LJIIZILJ;
        try {
            android.net.Uri parse = UriProtector.parse(str);
            IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
            if (LIZ != null && (LJIIZILJ = LIZ.LJIIZILJ()) != null) {
                Intent intent = new Intent(context, LJIIZILJ);
                intent.setData(parse);
                intent.putExtra("is_from_self", true);
                intent.putExtra("dataflowId", i);
                C16880lQ.LIZJ(context, intent);
                return new OSZ(Boolean.TRUE, "");
            }
            return new OSZ(Boolean.FALSE, "get deeplink class failed!");
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return new OSZ(Boolean.FALSE, i0.LJFF("Invaild schema: ", str));
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        String str;
        OSZ osz;
        String uri;
        boolean LJIIJ;
        String LIZIZ;
        android.net.Uri parse;
        String scheme;
        InterfaceC39355FcV interfaceC39355FcV = (InterfaceC39355FcV) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C37990Eva c37990Eva = C37990Eva.LIZ;
        String jsbSecureDataflowId = interfaceC39355FcV.getJsbSecureDataflowId();
        String str2 = this.LJLILLLLZI;
        c37990Eva.getClass();
        OSJ LIZ = C37990Eva.LIZ(jsbSecureDataflowId, str2);
        Integer num = (Integer) LIZ.getSecond();
        if (num == null) {
            C31626Cb8.LIZ(c37356ElM, 0, (String) LIZ.getThird(), 4);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "Context not provided in host", 4);
            return;
        }
        int intValue = interfaceC39355FcV.getAction().intValue();
        Boolean replace = interfaceC39355FcV.getReplace();
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(replace, bool)) {
            str = "";
        } else {
            str = interfaceC39355FcV.getReplaceType();
        }
        String schema = interfaceC39355FcV.getSchema();
        if (o.LJ(str, "alwaysCloseBeforeOpen")) {
            LJII(context);
        }
        int intValue2 = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    osz = new OSZ(Boolean.FALSE, i0.LJFF("Failed to open schema: ", schema));
                } else {
                    try {
                        parse = UriProtector.parse(schema);
                        scheme = parse.getScheme();
                        if (scheme == null) {
                            scheme = "";
                        }
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    if (o.LJ("http", scheme) || o.LJ("https", scheme)) {
                        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
                        intent.setData(parse);
                        intent.putExtra("swipe_mode", 2);
                        intent.putExtra("dataflowId", intValue2);
                        C16880lQ.LIZJ(context, intent);
                        osz = new OSZ(bool, "");
                    } else if (o.LJ(scheme, "aweme") | M66.LIZIZ.LIZJ(scheme)) {
                        if (o.LJ("webview", parse.getHost())) {
                            Intent LIZ2 = C57423MgF.LIZ(context, parse);
                            if (LIZ2 == null) {
                                Boolean bool2 = Boolean.FALSE;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("ad jump dispatch failed. schema: ");
                                LIZ3.append(schema);
                                osz = new OSZ(bool2, X1D.LIZIZ(LIZ3));
                            } else {
                                LIZ2.putExtra("swipe_mode", 2);
                                LIZ2.putExtra("dataflowId", intValue2);
                                if (C45804HyK.LJIJJ(context) == null) {
                                    LIZ2.addFlags(268435456);
                                }
                                C16880lQ.LIZJ(context, LIZ2);
                                osz = new OSZ(bool, "");
                            }
                        } else {
                            osz = LJIIIIZZ(context, schema, intValue2);
                        }
                    } else {
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                        osz = new OSZ(Boolean.FALSE, "Invaild schema: " + schema);
                    }
                }
            } else {
                osz = LJIIIIZZ(context, schema, intValue2);
            }
        } else {
            try {
                android.net.Uri parse2 = UriProtector.parse(schema);
                if (C35546DxG.LIZLLL(schema)) {
                    uri = parse2.buildUpon().appendQueryParameter("use_spark", "1").build().toString();
                    o.LJIIIIZZ(uri, "{\n                uri.bu….toString()\n            }");
                } else {
                    uri = parse2.toString();
                    o.LJIIIIZZ(uri, "{\n                uri.toString()\n            }");
                }
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                Bundle bundle = new Bundle();
                bundle.putInt("dataflowId", intValue2);
                if (LJIJJ != null) {
                    LJIIJ = C61200O0e.LIZLLL().LJIIIZ(LJIJJ, uri, bundle);
                } else {
                    LJIIJ = C61200O0e.LIZLLL().LJIIJ(bundle, uri);
                }
                if (LJIIJ) {
                    LIZIZ = "";
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Failed to open by router. schema:");
                    LIZ4.append(schema);
                    LIZIZ = X1D.LIZIZ(LIZ4);
                }
                osz = new OSZ(Boolean.valueOf(LJIIJ), LIZIZ);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                osz = new OSZ(Boolean.FALSE, i0.LJFF("Invaild schema: ", schema));
            }
        }
        if (o.LJ(str, "alwaysCloseAfterOpen")) {
            LJII(context);
        }
        if (((Boolean) osz.getFirst()).booleanValue()) {
            if (o.LJ(str, "onlyCloseAfterOpenSucceed")) {
                LJII(context);
            }
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC39357FcX.class, null);
            ((InterfaceC39357FcX) LIZJ).setCode(1);
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, (String) osz.getSecond(), 4);
    }
}
