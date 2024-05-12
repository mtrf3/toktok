package com.ss.android.ugc.awemepushlib.manager;

import X.C03660Ck;
import X.C08380Uo;
import X.C09900aA;
import X.C10K;
import X.C16880lQ;
import X.C173216qz;
import X.C198517qh;
import X.C33710DKw;
import X.C36917EeH;
import X.C38354F3m;
import X.C38995FSd;
import X.C40084FoG;
import X.C40322Fs6;
import X.C47704Ins;
import X.C48247Iwd;
import X.C51639KOl;
import X.C52567Kk7;
import X.C62822Ol8;
import X.C64131PEx;
import X.C67003QRj;
import X.C67228Qa0;
import X.C67229Qa1;
import X.C67230Qa2;
import X.C67233Qa5;
import X.C67234Qa6;
import X.C67237Qa9;
import X.C84763XOl;
import X.CallableC48245Iwb;
import X.E8L;
import X.F9J;
import X.FFL;
import X.FMX;
import X.IMH;
import X.InterfaceC173286r6;
import X.InterfaceC195747mE;
import X.InterfaceC37276Ek4;
import X.M4W;
import X.PFS;
import X.QRG;
import X.QRI;
import X.QSI;
import X.QSM;
import X.QSN;
import X.RunnableC67238QaA;
import X.V18;
import X.V1B;
import X.ViewOnClickListenerC81161VtF;
import X.X1D;
import Y.ARunnableS14S0201000_11;
import Y.ARunnableS16S0201000_13;
import Y.IDComparatorS39S0000000_11;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.awemepushlib.events.PushImgDownloadStatusEvent;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class MessageShowHandler {
    public static NotificationManager LIZIZ;
    public static DownloadImageApi LJ;
    public static final Object LIZ = new Object();
    public static final List<QSM> LIZJ = new ArrayList();
    public static volatile boolean LIZLLL = false;
    public static final List<String> LJFF = new ArrayList();
    public static final List<String> LJI = Arrays.asList("click_push_im", "click_push_im_private", "click_push_im_group");
    public static final WeakHandler LJII = new WeakHandler(C16880lQ.LLJJJJ(), new C67237Qa9());
    public static final IDComparatorS39S0000000_11 LJIIIIZZ = new IDComparatorS39S0000000_11(15);

    /* loaded from: classes7.dex */
    public interface DownloadImageApi {
        @E8L
        InterfaceC37276Ek4<TypedInput> downloadImageWithUrl(@InterfaceC195747mE String str);
    }

    public static Bitmap LIZ(String str) {
        if (LJ == null) {
            LJ = (DownloadImageApi) C40084FoG.LIZIZ(str).LIZ.LIZ(DownloadImageApi.class);
        }
        try {
            return BitmapFactory.decodeStream(LJ.downloadImageWithUrl(str).execute().LIZIZ.in());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static void LJ(Context context) {
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (LIZ) {
                string = F9J.LIZIZ(context, 0, "app_notify_info").getString("notify_list", null);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("local notify list: ");
            LIZ2.append(string);
            QSI.LIZ(X1D.LIZIZ(LIZ2));
            if (!C38354F3m.LJ(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    long optLong = jSONObject.optLong("time", 0L);
                    int optInt = jSONObject.optInt("id", 0);
                    if (optInt > 0) {
                        arrayList.add(new QSM(optInt, optLong));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!arrayList.isEmpty()) {
            try {
                List<QSM> list = LIZJ;
                ((ArrayList) list).clear();
                ((ArrayList) list).addAll(arrayList);
            } catch (Exception unused2) {
            }
        }
    }

    public static void LJIIIZ(Intent intent) {
        intent.putExtra("from_notification", true);
        String uuid = UUID.randomUUID().toString();
        ((ArrayList) LJFF).add(uuid);
        intent.putExtra("from_notification_uuid", uuid);
    }

    public static boolean LJIIJ(String str) {
        Uri parse;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (TextUtils.isEmpty(str) || (parse = UriProtector.parse(str)) == null) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(parse, "need_filter_uid");
        String queryParameter2 = UriProtector.getQueryParameter(parse, "ttpush_need_filter_uid");
        if (queryParameter != null && !queryParameter.equals(CardStruct.IStatusCode.DEFAULT)) {
            z = true;
        } else {
            z = false;
        }
        if (queryParameter2 != null && !queryParameter2.equals(CardStruct.IStatusCode.DEFAULT)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        try {
            String secUid = AccountService.LJIJ().LJFF().getCurUser().getSecUid();
            String queryParameter3 = UriProtector.getQueryParameter(parse, "sec_target_uid");
            String queryParameter4 = UriProtector.getQueryParameter(parse, "ttpush_sec_target_uid");
            if (!TextUtils.isEmpty(queryParameter3) && !TextUtils.equals(secUid, queryParameter3)) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z & z3;
            if (!TextUtils.isEmpty(queryParameter4) && !TextUtils.equals(secUid, queryParameter4)) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 & z2;
            if (!z5 && !z6) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
            return true;
        }
    }

    public static void LIZLLL(Context context, String str, int i) {
        C67230Qa2 from;
        ArrayList arrayList;
        InterfaceC173286r6 c173216qz;
        C67233Qa5 c67233Qa5;
        if (C38354F3m.LJ(str) || (from = C67230Qa2.from(str)) == null) {
            return;
        }
        HashMap LIZJ2 = C03660Ck.LIZJ("receive_notification", String.valueOf(from.rid64));
        if (PFS.LIZ != null && C64131PEx.LIZ != null) {
            Npth.addTags(LIZJ2);
        }
        ARunnableS14S0201000_11 aRunnableS14S0201000_11 = new ARunnableS14S0201000_11(i, context, from, 0);
        long millis = TimeUnit.DAYS.toMillis(1L);
        ArrayList arrayList2 = new ArrayList();
        if (C67234Qa6.LIZJ == null) {
            synchronized (C67234Qa6.class) {
                if (C67234Qa6.LIZJ == null) {
                    C67234Qa6.LIZJ = new C67234Qa6();
                }
            }
        }
        C67234Qa6 c67234Qa6 = C67234Qa6.LIZJ;
        Keva keva = c67234Qa6.LIZIZ;
        boolean z = false;
        if (keva != null && keva.contains("revoke_rid_list")) {
            String string = c67234Qa6.LIZIZ.getString("revoke_rid_list", "");
            c67234Qa6.LIZ.getClass();
            arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        arrayList.add(C67233Qa5.LIZIZ(optJSONObject));
                    }
                }
            } catch (Throwable unused) {
            }
        } else {
            c67234Qa6.LIZ.getClass();
            arrayList = new ArrayList();
        }
        long LIZIZ2 = C47704Ins.LIZIZ();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C67233Qa5 c67233Qa52 = (C67233Qa5) it.next();
            if (c67233Qa52 != null && c67233Qa52.LIZLLL + millis > LIZIZ2) {
                arrayList2.add(c67233Qa52);
            }
        }
        if (from.revokeId <= 0) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c67233Qa5 = (C67233Qa5) it2.next();
                    if (c67233Qa5 != null && c67233Qa5.LIZIZ == from.id) {
                        z = true;
                        break;
                    }
                } else {
                    c67233Qa5 = null;
                    break;
                }
            }
            if (Boolean.valueOf(z).booleanValue()) {
                FMX.LJIIL("push_withdraw_success", C67233Qa5.LIZ(c67233Qa5));
                return;
            } else {
                aRunnableS14S0201000_11.run();
                return;
            }
        }
        int i3 = from.revokeType;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    c173216qz = new C173216qz();
                } else {
                    c173216qz = new V18();
                }
            } else {
                c173216qz = new V1B();
            }
        } else {
            c173216qz = new C173216qz();
        }
        c173216qz.LIZIZ(context, from, arrayList2, aRunnableS14S0201000_11);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x025e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025f A[Catch: Exception -> 0x0279, TryCatch #1 {Exception -> 0x0279, blocks: (B:53:0x0146, B:55:0x0155, B:58:0x0160, B:60:0x0165, B:61:0x016a, B:63:0x017c, B:89:0x0258, B:92:0x025f, B:94:0x0267, B:96:0x0273), top: B:52:0x0146 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(int r16, android.content.Context r17, X.C67230Qa2 r18) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.LJI(int, android.content.Context, X.Qa2):void");
    }

    public static Intent LIZIZ(Context context, int i, C67230Qa2 c67230Qa2, int i2) {
        Intent intent = null;
        try {
            if (i2 == 2) {
                Intent intent2 = new Intent();
                try {
                    intent2.setPackage(context.getPackageName());
                    intent = intent2;
                } catch (Throwable unused) {
                    return intent2;
                }
            } else {
                Intent LIZ2 = C67228Qa0.LIZ(context, c67230Qa2);
                if (LIZ2 == null) {
                    return null;
                }
                try {
                    LIZ2.addFlags(268435456);
                    intent = LIZ2;
                } catch (Throwable unused2) {
                    return LIZ2;
                }
            }
            LJIIIZ(intent);
            boolean z = true;
            if (i2 == 0) {
                intent.putExtra("msg_from", 1);
            } else if (i2 == 1) {
                intent.putExtra("msg_from", 2);
            }
            intent.putExtra("msg_id", c67230Qa2.id);
            intent.putExtra("message_from", i);
            C67229Qa1 c67229Qa1 = c67230Qa2.extra;
            if (c67229Qa1 != null && !C38354F3m.LJ(c67229Qa1.toJsonString())) {
                intent.putExtra("message_extra", c67230Qa2.extra.toJsonString());
            }
            if (c67230Qa2.extra.activeClickValid != 1) {
                FFL.LJIIIZ().getClass();
                if (FFL.LJIIJ(31744, 0, "cancel_other_push", true) != 1) {
                    z = false;
                }
            }
            intent.putExtra("clear_all_notifications", z);
            intent.putExtra("imageType", c67230Qa2.imageType);
            return intent;
        } catch (Throwable unused3) {
            return intent;
        }
    }

    public static void LIZJ(Context context, int i, String str, int i2) {
        if (context == null || i != 1 || str == null) {
            return;
        }
        try {
            C67003QRj LJFF2 = C67003QRj.LJFF();
            if (!LJFF2.LIZ(context) || !LJFF2.LJIILL || TextUtils.isEmpty(str)) {
                return;
            }
            LIZLLL(context, str, i2);
        } catch (Throwable unused) {
        }
    }

    public static void LJFF(C67230Qa2 c67230Qa2, boolean z, M4W imgSource, String str) {
        IMH status;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("content", c67230Qa2.text);
        c198517qh.LIZ.put("title", c67230Qa2.title);
        c198517qh.LIZ.put("imageUrl", c67230Qa2.imageUrl);
        c198517qh.LIZ.put("errorMsg", str);
        StringBuilder LIZ2 = X1D.LIZ();
        String str2 = "";
        c198517qh.LIZ.put("imageType", C08380Uo.LIZ(LIZ2, c67230Qa2.imageType, "", LIZ2));
        JSONObject LJ2 = c198517qh.LJ();
        if (z) {
            C09900aA.LJIIJJI("aweme_push_image_load_error_rate", 0, LJ2);
        } else if (!TextUtils.isEmpty(str) && str.contains("network not available")) {
            return;
        } else {
            C09900aA.LJIIJJI("aweme_push_image_load_error_rate", 1, LJ2);
        }
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(c67230Qa2.openUrl), "gd_label");
        PushImgDownloadStatusEvent pushImgDownloadStatusEvent = new PushImgDownloadStatusEvent();
        String ruleId = String.valueOf(c67230Qa2.id);
        o.LJIIIZ(ruleId, "ruleId");
        pushImgDownloadStatusEvent.LIZLLL(ruleId, "rule_id");
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        pushImgDownloadStatusEvent.LIZLLL(str2, "push_type");
        String imgUrl = c67230Qa2.imageUrl;
        o.LJIIIZ(imgUrl, "imgUrl");
        pushImgDownloadStatusEvent.LIZLLL(imgUrl, "img_url");
        String imgType = String.valueOf(c67230Qa2.imageType);
        o.LJIIIZ(imgType, "imgType");
        pushImgDownloadStatusEvent.LIZLLL(imgType, "img_type");
        if (z) {
            status = IMH.DIGITAL_1;
        } else {
            status = IMH.DIGITAL_0;
        }
        o.LJIIIZ(status, "status");
        pushImgDownloadStatusEvent.LIZLLL(Integer.valueOf(status.getValue()), "status");
        o.LJIIIZ(imgSource, "imgSource");
        pushImgDownloadStatusEvent.LIZLLL(imgSource, "img_source");
        pushImgDownloadStatusEvent.LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(android.content.Context r17, X.C67230Qa2 r18, int r19, org.json.JSONObject r20) {
        /*
            java.lang.String r14 = "news_achieve"
            r7 = r18
            long r15 = r7.id
            r6 = r19
            long r0 = (long) r6
            r5 = 1
            org.json.JSONObject[] r2 = new org.json.JSONObject[r5]
            r4 = 0
            r2[r4] = r20
            r13 = r17
            r19 = r2
            r17 = r0
            X.QSN.LIZIZ(r13, r14, r15, r17, r19)
            int r0 = r7.isPing
            if (r0 != r5) goto L1d
            return r5
        L1d:
            java.lang.String r0 = r7.text
            boolean r0 = X.C38354F3m.LJ(r0)
            if (r0 == 0) goto L48
            int r0 = r7.pass_through
            if (r0 != 0) goto L2b
            if (r13 != 0) goto L31
        L2b:
            java.lang.String r0 = "push_text_empty"
            X.QSN.LJI(r7, r6, r0)
            return r5
        L31:
            java.lang.String r0 = r13.getPackageName()     // Catch: java.lang.Throwable -> L2b
            android.content.Intent r1 = X.FCD.LIZIZ(r13, r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L3c
            goto L2b
        L3c:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r0)     // Catch: java.lang.Throwable -> L2b
            LJIIIZ(r1)     // Catch: java.lang.Throwable -> L2b
            X.C16880lQ.LIZJ(r13, r1)     // Catch: java.lang.Throwable -> L2b
            goto L2b
        L48:
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r7.pass_through
            if (r2 == 0) goto Lca
            int r2 = r7.filter
            if (r2 == 0) goto Lca
            X.QRj r9 = X.C67003QRj.LJFF()
            long r2 = r7.id
            r9.getClass()
            X.QRl r8 = new X.QRl
            X.QRk r10 = r9.LJIIJ
            java.util.Objects.requireNonNull(r10)
            r8.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.LIZ = r2
            r8.LIZIZ = r0
            X.QRk r0 = r9.LJIIJ
            boolean r12 = r0.LIZIZ(r8)
            if (r12 == 0) goto La4
            X.QRk r2 = r9.LJIIJ
            monitor-enter(r2)
            java.util.TreeMap<X.QRl, X.QRl> r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8e
            java.lang.Object r1 = r0.get(r8)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8e
            X.QRl r1 = (X.C67005QRl) r1     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> L8e
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L8e
            goto L91
        L86:
            r0 = move-exception
            goto L8a
        L88:
            r0 = move-exception
            r1 = 0
        L8a:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L8e
            goto L91
        L8e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L91:
            monitor-exit(r2)
            if (r1 == 0) goto La4
            com.bytedance.common.utility.Logger.debug()
            long r2 = r8.LIZIZ
            long r0 = r1.LIZIZ
            long r2 = r2 - r0
            r10 = 43200000(0x2932e00, double:2.1343636E-316)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto La4
            r12 = 0
        La4:
            com.bytedance.common.utility.Logger.debug()
            X.QRk r0 = r9.LJIIJ
            r0.LIZ(r8)
            r9.LJIIIIZZ()
            if (r12 == 0) goto Lca
            com.bytedance.common.utility.Logger.debug()
            java.lang.String r0 = "push_msg_existed"
            X.QSN.LJI(r7, r6, r0)
            java.lang.String r14 = "news_forbid"
            long r15 = r7.id
            r17 = 2
            org.json.JSONObject[] r0 = new org.json.JSONObject[r4]
            r19 = r0
            X.QSN.LIZIZ(r13, r14, r15, r17, r19)
            X.QSA.LIZ()
            return r5
        Lca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.LJIIIIZZ(android.content.Context, X.Qa2, int, org.json.JSONObject):boolean");
    }

    public static void LJII(Context context, C67230Qa2 c67230Qa2, boolean z, int i, Notification notification) {
        boolean z2;
        Object obj;
        Object obj2;
        if (c67230Qa2 == null) {
            return;
        }
        int shortMsgID = C67230Qa2.getShortMsgID(c67230Qa2.id);
        if (C40322Fs6.LJFF(context)) {
            HashMap LIZJ2 = C03660Ck.LIZJ("show_notification", String.valueOf(c67230Qa2.rid64));
            if (PFS.LIZ != null && C64131PEx.LIZ != null) {
                Npth.addTags(LIZJ2);
            }
            if (c67230Qa2.extra != null) {
                if (C84763XOl.LJIIIIZZ() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Map<String, String> LIZIZ2 = C67228Qa0.LIZIZ(c67230Qa2, i, z2, z);
                String str = "1";
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                HashMap hashMap = (HashMap) LIZIZ2;
                hashMap.put("has_image", obj);
                if (c67230Qa2.extra.style == 5) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("mediastyle", obj2);
                if (TextUtils.isEmpty(c67230Qa2.extra.bg_color)) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("colorized", str);
                FMX.LJIILJJIL("push_show", new JSONObject(LIZIZ2));
                QSN.LIZ(c67230Qa2.extra.rawExtra, true);
            }
        } else {
            QSN.LJI(c67230Qa2, i, "no_permission");
        }
        QRI LIZLLL2 = QRI.LIZLLL(context);
        long j = shortMsgID;
        synchronized (LIZLLL2) {
            QRG.LIZIZ().getClass();
            if (QRG.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[markMessageAsShown] messageId is ");
                LIZ2.append(j);
                X1D.LIZIZ(LIZ2);
                SQLiteDatabase LJ2 = LIZLLL2.LJ();
                if (LJ2 != null) {
                    try {
                        if (LJ2.isOpen()) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("has_been_shown", (Integer) 1);
                            String[] strArr = {String.valueOf(j)};
                            try {
                                LJ2.update("message", contentValues, "message_id = ?", strArr);
                            } catch (IllegalStateException unused) {
                                SQLiteDatabase LJ3 = LIZLLL2.LJ();
                                if (LJ3 != null && LJ3.isOpen()) {
                                    LJ3.update("message", contentValues, "message_id = ?", strArr);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        LIZIZ.notify("app_notify_ame", shortMsgID, notification);
                        QSN.LIZIZ(context, "news_notify_show", c67230Qa2.id, -1L, new JSONObject[0]);
                        C38995FSd.LIZJ().submit(new RunnableC67238QaA(2, context, c67230Qa2, notification));
                    }
                }
            }
        }
        LIZIZ.notify("app_notify_ame", shortMsgID, notification);
        QSN.LIZIZ(context, "news_notify_show", c67230Qa2.id, -1L, new JSONObject[0]);
        C38995FSd.LIZJ().submit(new RunnableC67238QaA(2, context, c67230Qa2, notification));
    }

    public static void LJIILIIL(final int i, final Context context, final Bitmap bitmap, final Bitmap bitmap2, final C67230Qa2 c67230Qa2) {
        boolean z;
        String str;
        final Intent LIZIZ2 = LIZIZ(context, i, c67230Qa2, 0);
        if (LIZIZ2 == null) {
            QSN.LJI(c67230Qa2, i, "genIntent_error");
            return;
        }
        if (bitmap != null || bitmap2 != null) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ2.putExtra("log_data_extra_to_adsapp", (HashMap) C67228Qa0.LIZIZ(c67230Qa2, i, true, z));
        Uri data = LIZIZ2.getData();
        C62822Ol8 c62822Ol8 = C52567Kk7.LIZ;
        try {
            if (((Number) c62822Ol8.getValue()).intValue() != 0 && data != null && TextUtils.equals("live", data.getHost())) {
                final String queryParameter = UriProtector.getQueryParameter(data, "room_id");
                final String queryParameter2 = UriProtector.getQueryParameter(data, "user_id");
                String queryParameter3 = UriProtector.getQueryParameter(data, "gd_label");
                if (TextUtils.equals(queryParameter3, "click_push_live_steam") || TextUtils.equals(queryParameter3, "click_push_living")) {
                    if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                        C38995FSd.LIZJ().submit(new ARunnableS16S0201000_13(3, queryParameter2, queryParameter, 4));
                    } else {
                        C38995FSd.LIZJ().submit(new Runnable() { // from class: X.Qa8
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r3v0, types: [X.Qa7] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str2 = queryParameter2;
                                String str3 = queryParameter;
                                final Context context2 = context;
                                final Bitmap bitmap3 = bitmap;
                                final Bitmap bitmap4 = bitmap2;
                                final int i2 = i;
                                final C67230Qa2 c67230Qa22 = c67230Qa2;
                                final Intent intent = LIZIZ2;
                                LiveOuterService.LJJJLL().getLivePreloadService().LIZJ(str2, str3, new Runnable() { // from class: X.Qa7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Context context3 = context2;
                                        Bitmap bitmap5 = bitmap3;
                                        Bitmap bitmap6 = bitmap4;
                                        MessageShowHandler.LJIIL(i2, context3, intent, bitmap5, bitmap6, c67230Qa22);
                                    }
                                });
                            }
                        });
                        str = c67230Qa2.openUrl;
                        if (str != null && C48247Iwd.LIZLLL(str) && C33710DKw.LIZIZ()) {
                            C10K.LIZJ(new CallableC48245Iwb(str));
                            return;
                        }
                        return;
                    }
                }
            }
            str = c67230Qa2.openUrl;
            if (str != null) {
                C10K.LIZJ(new CallableC48245Iwb(str));
                return;
            }
            return;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return;
        }
        LJIIL(i, context, LIZIZ2, bitmap, bitmap2, c67230Qa2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(51:8|(1:10)(1:340)|11|(5:326|327|(1:338)|329|(1:334))|(5:13|14|(1:20)|21|(1:26))|28|(2:30|(41:35|36|(1:38)|39|(1:41)|42|(2:44|(2:46|(1:48)(2:49|(1:51))))|52|(1:54)(1:323)|55|(2:316|(1:318)(3:319|(1:321)|322))(2:58|(1:60)(2:208|(2:210|(1:212))(2:213|(2:215|(3:217|(3:219|(2:222|223)|224)|227))(2:228|(7:230|(1:232)|233|(1:235)(1:240)|236|(1:238)|239)(3:241|(9:243|(1:(1:246)(1:293))(1:294)|247|(2:251|(5:257|(1:261)|262|(1:264)|265))|267|(5:269|(1:279)(1:273)|274|(1:276)(1:278)|277)|280|(5:282|(1:291)(1:286)|287|(1:289)|290)|292)(1:(3:300|(3:301|(1:303)(2:309|(1:311)(2:312|(1:314)))|304)|307))|266)))))|61|(1:63)(1:207)|64|(1:206)|68|(1:70)|71|(1:73)|74|(2:76|(2:78|(1:80))(2:81|(1:83)))|84|(5:94|95|97|98|99)|(1:105)|106|107|(1:109)|110|111|(11:113|114|(3:187|188|(3:193|(1:195)(1:198)|196)(1:192))|116|(4:118|120|121|(1:123))|128|(1:130)|131|(1:133)(1:186)|134|(1:136)(11:137|(2:143|(2:145|(2:147|(1:149))))|150|(3:152|153|154)|158|159|(1:161)|162|(1:181)(1:166)|167|(3:(1:180)(1:177)|178|179)(2:173|174)))|200|114|(0)|116|(0)|128|(0)|131|(0)(0)|134|(0)(0)))|324|36|(0)|39|(0)|42|(0)|52|(0)(0)|55|(0)|316|(0)(0)|61|(0)(0)|64|(1:66)|206|68|(0)|71|(0)|74|(0)|84|(8:86|88|90|94|95|97|98|99)|(0)|106|107|(0)|110|111|(0)|200|114|(0)|116|(0)|128|(0)|131|(0)(0)|134|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x06bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x06bd, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06af A[Catch: Exception -> 0x072f, TRY_LEAVE, TryCatch #0 {Exception -> 0x072f, blocks: (B:107:0x06a6, B:109:0x06af, B:113:0x06b7, B:114:0x06c4, B:116:0x06e9, B:118:0x06f1, B:200:0x06c0, B:203:0x06bd, B:111:0x06b1), top: B:106:0x06a6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06b7 A[Catch: Exception -> 0x072f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x072f, blocks: (B:107:0x06a6, B:109:0x06af, B:113:0x06b7, B:114:0x06c4, B:116:0x06e9, B:118:0x06f1, B:200:0x06c0, B:203:0x06bd, B:111:0x06b1), top: B:106:0x06a6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x06f1 A[Catch: Exception -> 0x072f, TRY_LEAVE, TryCatch #0 {Exception -> 0x072f, blocks: (B:107:0x06a6, B:109:0x06af, B:113:0x06b7, B:114:0x06c4, B:116:0x06e9, B:118:0x06f1, B:200:0x06c0, B:203:0x06bd, B:111:0x06b1), top: B:106:0x06a6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0708 A[Catch: Exception -> 0x072d, TryCatch #2 {Exception -> 0x072d, blocks: (B:121:0x06f6, B:128:0x06fe, B:130:0x0708, B:131:0x070b, B:133:0x0711, B:134:0x071a, B:186:0x071f), top: B:120:0x06f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0711 A[Catch: Exception -> 0x072d, TryCatch #2 {Exception -> 0x072d, blocks: (B:121:0x06f6, B:128:0x06fe, B:130:0x0708, B:131:0x070b, B:133:0x0711, B:134:0x071a, B:186:0x071f), top: B:120:0x06f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x071f A[Catch: Exception -> 0x072d, TryCatch #2 {Exception -> 0x072d, blocks: (B:121:0x06f6, B:128:0x06fe, B:130:0x0708, B:131:0x070b, B:133:0x0711, B:134:0x071a, B:186:0x071f), top: B:120:0x06f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Type inference failed for: r0v115, types: [com.ss.android.ugc.awemepushapi.IPushApi] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.1AZ] */
    /* JADX WARN: Type inference failed for: r11v14, types: [X.1AY, X.070] */
    /* JADX WARN: Type inference failed for: r11v15, types: [X.1AW, X.070] */
    /* JADX WARN: Type inference failed for: r11v16, types: [X.1Ro] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.1AV, X.070] */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.070] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.06y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(int r18, android.content.Context r19, android.content.Intent r20, android.graphics.Bitmap r21, android.graphics.Bitmap r22, X.C67230Qa2 r23) {
        /*
            Method dump skipped, instructions count: 2178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.LJIIL(int, android.content.Context, android.content.Intent, android.graphics.Bitmap, android.graphics.Bitmap, X.Qa2):void");
    }

    public static void LJIIJJI(int i, int i2, long j, Context context, Intent intent, Bitmap bitmap, C67230Qa2 c67230Qa2) {
        int i3;
        int i4;
        if (intent == null) {
            return;
        }
        try {
            boolean equalsIgnoreCase = "oppo".equalsIgnoreCase(Build.BRAND);
            if (C36917EeH.LIZ(context)) {
                i3 = 2010;
                i4 = 264;
            } else if (equalsIgnoreCase) {
                i3 = 20005;
                i4 = 136;
            } else {
                i3 = 2005;
                i4 = 8;
            }
            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
            ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF = new ViewOnClickListenerC81161VtF(i, i2, j, context, intent, bitmap, c67230Qa2);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 0, 0, i3, i4, 1);
            layoutParams.gravity = 51;
            if (equalsIgnoreCase) {
                layoutParams.setTitle("Toast");
            }
            C51639KOl.LIZ(new Object[]{viewOnClickListenerC81161VtF, layoutParams});
            windowManager.addView(viewOnClickListenerC81161VtF, layoutParams);
            QSN.LIZIZ(context, "news_notify_anim_push_try_show", c67230Qa2.id, i, new JSONObject[0]);
        } catch (Throwable th) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("throwable", Log.getStackTraceString(th));
                QSN.LIZIZ(context, "news_notify_anim_push_try_show", c67230Qa2.id, i, jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
