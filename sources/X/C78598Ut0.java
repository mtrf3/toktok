package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.xtrace.Interceptor;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.b1;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ut0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78598Ut0 implements InterfaceC78839Uwt, InterfaceC78568UsW, Interceptor, R6I, W6H {
    public static int LJLIL = 400;
    public static int LJLILLLLZI = 800;
    public static boolean LJLJI;

    public static final Context LJIIJ() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.context();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        if ((r1.LJLJI & 8) == 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0033, code lost:
    
        if ((r1.LJLILLLLZI & 8) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0036, code lost:
    
        r1 = r1.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x002d, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1JY LIZLLL(X.C1DT r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.1M3 r0 = r8.LJIIIIZZ()
            X.1M3 r1 = r0.LJLJJL
            r3 = 0
            if (r1 != 0) goto L26
        Le:
            r1 = r3
        Lf:
            boolean r0 = r1 instanceof X.C1DT
            if (r0 != 0) goto L24
        L13:
            X.1DT r3 = (X.C1DT) r3
            if (r3 == 0) goto L1f
            X.1JY r0 = r8.LJJJJ()
            boolean r0 = r0.LJLJI
            if (r0 == 0) goto L39
        L1f:
            X.1JY r0 = r8.LJJJJ()
            return r0
        L24:
            r3 = r1
            goto L13
        L26:
            int r0 = r1.LJLJI
            r0 = r0 & 8
            if (r0 != 0) goto L2f
            goto Le
        L2d:
            if (r1 == 0) goto Le
        L2f:
            int r0 = r1.LJLILLLLZI
            r0 = r0 & 8
            if (r0 == 0) goto L36
            goto Lf
        L36:
            X.1M3 r1 = r1.LJLJJL
            goto L2d
        L39:
            X.1JY r2 = r8.LJJJJ()
            r2.getClass()
            X.1JY r7 = new X.1JY
            r7.<init>()
            boolean r0 = r2.LJLILLLLZI
            r7.LJLILLLLZI = r0
            boolean r0 = r2.LJLJI
            r7.LJLJI = r0
            java.util.Map<X.0Qh<?>, java.lang.Object> r1 = r7.LJLIL
            java.util.Map<X.0Qh<?>, java.lang.Object> r0 = r2.LJLIL
            r1.putAll(r0)
            X.1JY r2 = LIZLLL(r3)
            java.lang.String r0 = "peer"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            boolean r0 = r2.LJLILLLLZI
            r1 = 1
            if (r0 == 0) goto L64
            r7.LJLILLLLZI = r1
        L64:
            boolean r0 = r2.LJLJI
            if (r0 == 0) goto L6a
            r7.LJLJI = r1
        L6a:
            java.util.Map<X.0Qh<?>, java.lang.Object> r0 = r2.LJLIL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L76:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.lang.Object r5 = r0.getValue()
            java.util.Map<X.0Qh<?>, java.lang.Object> r0 = r7.LJLIL
            boolean r0 = r0.containsKey(r6)
            if (r0 != 0) goto L98
            java.util.Map<X.0Qh<?>, java.lang.Object> r0 = r7.LJLIL
            r0.put(r6, r5)
            goto L76
        L98:
            boolean r0 = r5 instanceof X.C0QK
            if (r0 == 0) goto L76
            java.util.Map<X.0Qh<?>, java.lang.Object> r0 = r7.LJLIL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r4 = r0.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            kotlin.jvm.internal.o.LJII(r4, r0)
            X.0QK r4 = (X.C0QK) r4
            java.util.Map<X.0Qh<?>, java.lang.Object> r3 = r7.LJLIL
            X.0QK r2 = new X.0QK
            java.lang.String r1 = r4.LIZ
            if (r1 != 0) goto Lb8
            r0 = r5
            X.0QK r0 = (X.C0QK) r0
            java.lang.String r1 = r0.LIZ
        Lb8:
            T extends X.4Fh<? extends java.lang.Boolean> r0 = r4.LIZIZ
            if (r0 != 0) goto Lc0
            X.0QK r5 = (X.C0QK) r5
            T extends X.4Fh<? extends java.lang.Boolean> r0 = r5.LIZIZ
        Lc0:
            r2.<init>(r1, r0)
            r3.put(r6, r2)
            goto L76
        Lc7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78598Ut0.LIZLLL(X.1DT):X.1JY");
    }

    public static WM7 LJI(View view) {
        while (view != null) {
            WM7 wm7 = (WM7) view.getTag(R.id.b2r);
            if (wm7 != null) {
                return wm7;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final boolean LJII(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        o.LJIIIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "<this>");
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getOptimization() & 2) == 2 || (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getOptimization() & 4) == 4) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(android.net.Uri uri) {
        String str;
        if (uri == null || !"aweme".equals(uri.getHost())) {
            return false;
        }
        try {
            str = UriProtector.getQueryParameter(uri, "gd_label");
        } catch (Throwable unused) {
            str = "";
        }
        if (!"click_push_recommend".equals(str) && !"click_push_newvideo".equals(str) && !"click_push_videoat".equals(str)) {
            return false;
        }
        return true;
    }

    public static final AbstractC220518l5 LJIIIZ(Aweme aweme) {
        InteractStickerStruct interactStickerStruct;
        QaStruct qaStruct;
        InteractStickerStruct interactStickerStruct2;
        AddYoursStickerStruct addYoursStickerStruct;
        Long topicId;
        if (aweme.getInteractStickerStructs() == null) {
            return null;
        }
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            while (true) {
                if (it.hasNext()) {
                    interactStickerStruct2 = it.next();
                    if (interactStickerStruct2.getAddYoursStickerStruct() != null) {
                        break;
                    }
                } else {
                    interactStickerStruct2 = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct3 = interactStickerStruct2;
            if (interactStickerStruct3 != null && (addYoursStickerStruct = interactStickerStruct3.getAddYoursStickerStruct()) != null && (topicId = addYoursStickerStruct.getTopicId()) != null) {
                return new C220498l3(topicId.longValue(), addYoursStickerStruct, addYoursStickerStruct.getText());
            }
        }
        List<InteractStickerStruct> interactStickerStructs2 = aweme.getInteractStickerStructs();
        if (interactStickerStructs2 != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    interactStickerStruct = it2.next();
                    if (interactStickerStruct.getQaStruct() != null) {
                        break;
                    }
                } else {
                    interactStickerStruct = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct4 = interactStickerStruct;
            if (interactStickerStruct4 != null && (qaStruct = interactStickerStruct4.getQaStruct()) != null) {
                return new C220508l4(qaStruct.getQuestionId(), qaStruct, qaStruct.getQuestionContent());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJIIJJI(int r3) {
        /*
            int r2 = X.C226388uY.LIZLLL()
            X.6UU r0 = X.C6UU.ADD_YOURS
            int r0 = r0.getValue()
            r1 = 1
            if (r2 != r0) goto L13
            if (r3 != r1) goto L28
        Lf:
            r0 = 2131823393(0x7f110b21, float:1.9279584E38)
        L12:
            return r0
        L13:
            X.6UU r0 = X.C6UU.POST_YOURS
            int r0 = r0.getValue()
            if (r2 != r0) goto L25
            if (r3 != r1) goto L21
            r0 = 2131823406(0x7f110b2e, float:1.927961E38)
            goto L12
        L21:
            r0 = 2131823411(0x7f110b33, float:1.927962E38)
            goto L12
        L25:
            if (r3 != r1) goto L28
            goto Lf
        L28:
            r0 = 2131823409(0x7f110b31, float:1.9279617E38)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78598Ut0.LJIIJJI(int):int");
    }

    public static final boolean LJIIL(InterfaceC82086WJm interfaceC82086WJm) {
        o.LJIIIZ(interfaceC82086WJm, "<this>");
        if (interfaceC82086WJm.zZ().isRetakeMode && interfaceC82086WJm.zZ().LIZLLL() >= interfaceC82086WJm.zZ().LJ()) {
            TMB.LIZIZ(C82890Wg2.LJFF, C60903NvH.LJ, R.string.tmn).LIZ();
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(Boolean bool) {
        return o.LJ(bool, Boolean.TRUE);
    }

    public static final void LJIJ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        SparkSchemaParam sparkSchemaParam;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        if (sparkContext != null) {
            sparkSchemaParam = sparkContext.LJIIZILJ(-1);
        } else {
            sparkSchemaParam = null;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILIIL(sparkContext, sparkSchemaParam);
    }

    @Override // X.W6H
    public int LIZIZ(Object obj) {
        return ((W5A) obj).getSizeInBytes();
    }

    @Override // X.InterfaceC78568UsW
    public void LJJIFFI(C78593Usv c78593Usv) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c78593Usv.LIZJ()) {
                break;
            }
            sb.append(c78593Usv.LIZIZ());
            int i = c78593Usv.LJFF + 1;
            c78593Usv.LJFF = i;
            if (C78939UyV.LJJJI(i, 5, c78593Usv.LIZ) != 5) {
                c78593Usv.LJI = 0;
                break;
            }
        }
        int length = sb.length() - 1;
        int LIZ = c78593Usv.LIZ() + length + 1;
        c78593Usv.LIZLLL(LIZ);
        if (c78593Usv.LJII.LIZIZ - LIZ > 0) {
            z = true;
        } else {
            z = false;
        }
        if (c78593Usv.LIZJ() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / LiveCoverMinSizeSetting.DEFAULT) + 249));
                sb.insert(1, (char) (length % LiveCoverMinSizeSetting.DEFAULT));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            int LIZ2 = (((c78593Usv.LIZ() + 1) * 149) % 255) + 1 + sb.charAt(i2);
            if (LIZ2 > 255) {
                LIZ2 -= 256;
            }
            c78593Usv.LJ((char) LIZ2);
        }
    }

    public static final C0Q9 LJFF(C0QC c0qc, Object obj) {
        o.LJIIIZ(c0qc, "<this>");
        C0Q9 c0q9 = (C0Q9) c0qc.LIZ().invoke(obj);
        o.LJIIIZ(c0q9, "<this>");
        return c0q9.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILIIL(long r34, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78598Ut0.LJIILIIL(long, java.lang.String):boolean");
    }

    public static void LJIIZILJ(String str, String str2) {
        EF7.LIZIZ();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("errorDesc", String.valueOf(str));
                c198517qh.LIZ.put("action", str2);
                FUA.LIZJ("aweme_change_user_profile", c198517qh.LJ());
            }
        } catch (Exception unused) {
        }
    }

    public static void LJIJJ(Intent intent, Object obj) {
        try {
            C17970nB.LIZ.getClass();
            try {
                C17970nB.LIZ(intent, obj);
                C18080nM.LIZ.getClass();
                C18080nM.LIZLLL = null;
            } catch (Throwable th) {
                C18080nM.LIZ.getClass();
                C18080nM.LIZLLL = null;
                throw th;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC78839Uwt
    public Intent LIZ(ActivityC45651qj activity, Intent intent) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        intent.setClass(activity, VECutVideoActivity.class);
        return intent;
    }

    public static void LJ(SmartImageView smartImageView, String str, String str2) {
        boolean z;
        String str3;
        C47052IdM c47052IdM;
        String substring;
        if (smartImageView.getVisibility() == 0) {
            z = true;
            str3 = "showCover";
        } else {
            z = false;
            str3 = "hideCover:";
        }
        ITQ traceGroup = SimRadar.traceGroup("Cover");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cover:");
        LIZ.append(str3);
        traceGroup.LIZIZ(X1D.LIZIZ(LIZ));
        SimRadar.analyzer().getClass();
        C46894Iao LIZ2 = IVN.LIZ(str2);
        if (LIZ2 != null && (c47052IdM = LIZ2.LJI) != null) {
            WeakReference<View> weakReference = c47052IdM.LIZ;
            if (weakReference == null || weakReference.get() == null) {
                c47052IdM.LIZ = new WeakReference<>(smartImageView);
            }
            c47052IdM.LIZIZ = false;
        }
        if (TextUtils.isEmpty(str)) {
            substring = "";
        } else {
            substring = str.substring(0, Math.min(6, str.length()));
        }
        if (TextUtils.isEmpty(str2)) {
            SimRadar.keyScan(a1.LJ("ISimRadar(", "VideoViewCell", ")"), str3, substring);
            return;
        }
        SimRadar.analyzer().getClass();
        C46894Iao LIZ3 = IVN.LIZ(str2);
        if (LIZ3 != null) {
            if (z) {
                LIZ3.LJIJJLI();
            } else {
                LIZ3.LJJ();
            }
        }
        SimRadar.keyScan(a1.LJ("ISimRadar(", "VideoViewCell", ")"), str3, substring, str2);
    }

    public static final void LJIJI(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, String str, JSONObject jSONObject) {
        InterfaceC60761Nsz kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
        if (kitView != null) {
            kitView.LJIIIZ(str, jSONObject);
        }
    }

    @Override // X.InterfaceC78839Uwt
    public Intent LIZJ(Activity activity, Bundle bundle, int i) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i);
        return intent;
    }

    @Override // X.R6I
    public void LJIILLIIL(AuthResult authResult, int i, C69008R6m c69008R6m) {
        String str;
        int i2;
        C69008R6m LIZIZ = C69007R6l.LIZIZ(this, authResult, c69008R6m, "kakaotalk");
        if (LIZIZ == null) {
            return;
        }
        o.LJI(authResult);
        C66504Q8e c66504Q8e = authResult.mErrorCause;
        if (c66504Q8e != null) {
            i2 = c66504Q8e.getErrorCode();
            str = c66504Q8e.getMessage();
        } else {
            str = null;
            i2 = 0;
        }
        if (authResult.mIsSuccessful) {
            C69009R6n.LIZLLL(LIZIZ);
            return;
        }
        if (authResult.mIsCancelled) {
            StringBuilder LIZJ = b1.LIZJ(str, " | ");
            LIZJ.append(android.util.Log.getStackTraceString(authResult.mErrorCause));
            String LIZIZ2 = X1D.LIZIZ(LIZJ);
            o.LJIIIIZZ(LIZIZ2, "StringBuilder()\n        …              .toString()");
            C69009R6n.LIZIZ(LIZIZ, LIZIZ2, i2, str);
            C69007R6l.LIZ(i, 2, "kakaotalk", 0, "");
            return;
        }
        C69007R6l.LIZ(i, 1, "kakaotalk", i2, str);
        V16.LJJJJZI(i2, str, "kakaotalk");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error code = ");
        LIZ.append(i2);
        LIZ.append(", desc = ");
        LIZ.append(str);
        String LIZIZ3 = X1D.LIZIZ(LIZ);
        o.LJIIIIZZ(LIZIZ3, "StringBuilder()\n        …              .toString()");
        C69009R6n.LIZJ(LIZIZ, LIZIZ3, i2, str);
    }

    @Override // com.bytedance.xtrace.Interceptor
    public boolean intercept(Member member, Object obj, Object[] objArr) {
        if (member != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dynamic trace method name:");
            LIZ.append(member.getName());
            LIZ.append(" called stack:");
            LIZ.append(android.util.Log.getStackTraceString(new Throwable("DynamicTrace")));
            LIZ.append("\n");
            printStream.println(X1D.LIZIZ(LIZ));
            return false;
        }
        return false;
    }

    public static void LJIJJLI(JHM jhm, String str, String str2, String str3) {
        jhm.LIZLLL("process_id", str);
        jhm.LIZLLL("tag_id", str3);
        jhm.LIZLLL("rank_index", str2);
    }

    public static void LJIILL(int i, SparseArray sparseArray, boolean z, DownloadInfo downloadInfo, BaseException baseException, EnumC84256X4y enumC84256X4y, DownloadTask downloadTask) {
        SparseArray clone;
        if (z && sparseArray != null) {
            try {
                if (sparseArray.size() > 0) {
                    synchronized (sparseArray) {
                        clone = sparseArray.clone();
                    }
                    for (int i2 = 0; i2 < clone.size(); i2++) {
                        IDownloadListener iDownloadListener = (IDownloadListener) clone.get(clone.keyAt(i2));
                        if (iDownloadListener != null) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 4) {
                                        if (i != 5) {
                                            if (i != 6) {
                                                if (i != 7) {
                                                    if (i != 11) {
                                                        switch (i) {
                                                            case -7:
                                                                if (iDownloadListener instanceof AbsDownloadListener) {
                                                                    ((AbsDownloadListener) iDownloadListener).onIntercept(downloadInfo);
                                                                    if (downloadTask != null) {
                                                                        downloadTask.removeCallback(enumC84256X4y, iDownloadListener);
                                                                        break;
                                                                    } else {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    break;
                                                                }
                                                            case -6:
                                                                iDownloadListener.onFirstSuccess(downloadInfo);
                                                                break;
                                                            case -5:
                                                            case -2:
                                                                iDownloadListener.onPause(downloadInfo);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(enumC84256X4y, iDownloadListener);
                                                                    break;
                                                                } else {
                                                                    break;
                                                                }
                                                            case -4:
                                                                iDownloadListener.onCanceled(downloadInfo);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(enumC84256X4y, iDownloadListener);
                                                                    break;
                                                                } else {
                                                                    break;
                                                                }
                                                            case -3:
                                                                iDownloadListener.onSuccessed(downloadInfo);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(enumC84256X4y, iDownloadListener);
                                                                    break;
                                                                } else {
                                                                    break;
                                                                }
                                                            case -1:
                                                                iDownloadListener.onFailed(downloadInfo, baseException);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(enumC84256X4y, iDownloadListener);
                                                                    break;
                                                                } else {
                                                                    break;
                                                                }
                                                        }
                                                    } else if (iDownloadListener instanceof InterfaceC78603Ut5) {
                                                        ((InterfaceC78603Ut5) iDownloadListener).LJJJJL(downloadInfo);
                                                    }
                                                } else {
                                                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                                                }
                                            } else {
                                                iDownloadListener.onFirstStart(downloadInfo);
                                            }
                                        } else {
                                            iDownloadListener.onRetry(downloadInfo, baseException);
                                        }
                                    } else {
                                        iDownloadListener.onProgress(downloadInfo);
                                    }
                                } else {
                                    iDownloadListener.onStart(downloadInfo);
                                }
                            } else {
                                iDownloadListener.onPrepare(downloadInfo);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
