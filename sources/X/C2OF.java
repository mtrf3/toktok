package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.ProgressBarExpirySetting;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$ProgressBarInfo;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$Stage;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2OF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2OF {
    public static int LIZ() {
        EnumC61772bd enumC61772bd = C2OE.LJIILJJIL;
        if (enumC61772bd != null) {
            if (enumC61772bd == EnumC61772bd.PERCENTAGE) {
                return C2OE.LJIIJJI;
            }
            return C2OE.LJIIL;
        }
        return 0;
    }

    public static Integer LIZIZ() {
        if (C2OE.LJIILJJIL == EnumC61772bd.PERCENTAGE) {
            return null;
        }
        Keva keva = C2OE.LIZLLL;
        if (keva.contains("progress_time_left_key")) {
            LJIIIZ(new JSONObject(keva.getString("progress_time_left_key", "")), C2OE.LJI);
        }
        HashMap<String, Object> hashMap = C2OE.LJI;
        if (hashMap.containsKey(C2OE.LJIIJ)) {
            Object obj = hashMap.get(C2OE.LJIIJ);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }
        List<NewUserProgressModel$Stage> list = C2OE.LJIILL;
        if (list == null) {
            return null;
        }
        return Integer.valueOf(((Number) ListProtector.get(((NewUserProgressModel$Stage) ListProtector.get(list, 0)).range, 0)).intValue());
    }

    public static int LIZJ() {
        List<NewUserProgressModel$Stage> list = C2OE.LJIILL;
        if (list == null) {
            return 0;
        }
        return ((Number) ListProtector.get(((NewUserProgressModel$Stage) ListProtector.get(list, 0)).range, 0)).intValue() + 15;
    }

    public static void LIZLLL() {
        if (C2OE.LJIJJLI.LJLILLLLZI) {
            C2OE.LJIJJLI = new C73318Sq2();
        } else {
            C2OE.LJIJJLI.LIZLLL();
        }
        C73318Sq2 c73318Sq2 = C2OE.LJIJJLI;
        C73422Sri LJIJJLI = C2OE.LJIJI.LJIJJLI(new InterfaceC64592gB() { // from class: X.2O3
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C2O2 c2o2 = (C2O2) obj;
                long currentTimeMillis = System.currentTimeMillis();
                if (C2OE.LJIL != -1) {
                    c2o2.LIZIZ = (currentTimeMillis - r3) / 1000;
                }
                C2OE.LJIL = currentTimeMillis;
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c73318Sq2.LIZ(LJIJJLI.LJIIJJI(200L, timeUnit).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.2O1
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C57602Nw c57602Nw;
                C57602Nw c57602Nw2;
                String str;
                C57602Nw c57602Nw3;
                C2O2 it = (C2O2) obj;
                o.LJIIIIZZ(it, "it");
                C2OF.LJIIJ(false);
                if (it.LIZ < C2OE.LJIILIIL || C2OE.LJIIJJI > 100) {
                    if (C2OE.LJIIJJI <= 100) {
                        C2OF.LJII(it.LIZIZ);
                    }
                    C2OE.LJIILIIL = it.LIZ;
                    return;
                }
                C2OF.LJII(it.LIZIZ);
                C2OE.LJIILIIL = it.LIZ;
                if (C2OE.LJIILJJIL != EnumC61772bd.PERCENTAGE) {
                    return;
                }
                if (it.LIZIZ > C2OE.LJIIZILJ) {
                    HashSet<Integer> hashSet = C2OE.LJIIIIZZ;
                    if (!hashSet.contains(Integer.valueOf(C2OE.LJIILIIL))) {
                        hashSet.add(Integer.valueOf(C2OE.LJIILIIL));
                        int i = C2OE.LJIIJJI;
                        if (i <= 100) {
                            C2OE.LJIIJJI = i + 5;
                        }
                        HashMap<String, Object> hashMap = C2OE.LJ;
                        hashMap.put(C2OE.LJIIJ, Integer.valueOf(C2OE.LJIIJJI));
                        C2OE.LIZLLL.storeString("progress_map_key", new JSONObject(hashMap).toString());
                        WeakReference<C57602Nw> weakReference = C2OE.LIZIZ;
                        if (weakReference != null && (c57602Nw3 = weakReference.get()) != null) {
                            c57602Nw3.LJ(C2OF.LIZ(), -1);
                        }
                        if (C2OE.LJIJ != 3) {
                            return;
                        }
                        C2OE.LJIJ = 0;
                        return;
                    }
                }
                Keva keva = C2OE.LIZLLL;
                if (!keva.getBoolean("video_skipped_text_shown", false)) {
                    C2OE.LJIJ++;
                }
                if (C2OE.LJIJ != 3) {
                    return;
                }
                WeakReference<C57602Nw> weakReference2 = C2OE.LIZIZ;
                if (weakReference2 != null && (c57602Nw2 = weakReference2.get()) != null) {
                    int LIZ = C2OF.LIZ();
                    int i2 = C2OE.LJIIZILJ;
                    NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo = C2OE.LJIIIZ;
                    c57602Nw2.LJLJJL = newUserProgressModel$ProgressBarInfo;
                    TextView textView = c57602Nw2.LJLJI;
                    String str2 = null;
                    if (textView != null) {
                        if (newUserProgressModel$ProgressBarInfo != null && (str = newUserProgressModel$ProgressBarInfo.textSkipVideoReminder) != null) {
                            str2 = Q8U.LIZIZ(new Object[]{C72972SkS.LIZLLL(LIZ, "%, "), Integer.valueOf(i2)}, 2, str, "format(this, *args)");
                        }
                        textView.setText(str2);
                    } else {
                        o.LJIJI("progressStatus");
                        throw null;
                    }
                }
                WeakReference<C57602Nw> weakReference3 = C2OE.LIZIZ;
                if (weakReference3 == null || (c57602Nw = weakReference3.get()) == null || c57602Nw.getProgressViewRoot().getVisibility() != 0) {
                    return;
                }
                keva.storeBoolean("video_skipped_text_shown", true);
            }
        }));
        C2OE.LJIJJLI.LIZ(C2OE.LJIJJ.LJIIL(200L, timeUnit).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.2OD
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                if (C2OF.LJFF()) {
                    CountDownTimer countDownTimer = C2OE.LJIILLIIL;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                        return;
                    }
                    return;
                }
                CountDownTimer countDownTimer2 = C2OE.LJIILLIIL;
                if ((countDownTimer2 == null || countDownTimer2.isCancelled()) && C2OE.LJIILJJIL == EnumC61772bd.DURATION && C2OE.LJIIL < 100) {
                    C2OF.LJIIJ(false);
                    if (C2OF.LIZIZ() == null) {
                        return;
                    }
                    CountDownTimer countDownTimer3 = new CountDownTimer(1000 * r0.intValue(), LivePlayEnforceIntervalSetting.DEFAULT, new JC4() { // from class: X.2Nx
                        @Override // X.JC4
                        public final void onStart() {
                        }

                        @Override // X.JC4
                        public final void LIZ() {
                            C57602Nw c57602Nw;
                            WeakReference<C57602Nw> weakReference = C2OE.LIZIZ;
                            if (weakReference != null && (c57602Nw = weakReference.get()) != null) {
                                c57602Nw.LIZ();
                            }
                        }

                        @Override // X.JC4
                        public final void LJIILIIL(long j) {
                            String str;
                            C57602Nw c57602Nw;
                            if (C2OF.LJFF()) {
                                return;
                            }
                            int i = (int) (j / 1000);
                            C2OE.LJIIL = ((C2OF.LIZJ() - i) * 100) / C2OF.LIZJ();
                            HashMap<String, Object> hashMap = C2OE.LJ;
                            hashMap.put(C2OE.LJIIJ, Integer.valueOf(C2OE.LJIIL));
                            Keva keva = C2OE.LIZLLL;
                            keva.storeString("progress_map_key", new JSONObject(hashMap).toString());
                            keva.storeInt("tick_count", keva.getInt("tick_count", 0) + 1);
                            int i2 = keva.getInt("tick_count", 1);
                            if (i2 == 3 || i2 % 12 == 0) {
                                int LIZ = C2OF.LIZ();
                                if (C2OE.LJJ) {
                                    boolean z = keva.getBoolean("first_init", false);
                                    if (z) {
                                        keva.storeBoolean("first_init", false);
                                    }
                                    if (keva.contains("progress_milestone_key")) {
                                        C2OF.LJIIIZ(new JSONObject(keva.getString("progress_milestone_key", "")), C2OE.LJII);
                                    }
                                    keva.storeInt("milestone_progress_reported", LIZ);
                                    Integer valueOf = Integer.valueOf(LIZ);
                                    HashMap<String, Object> hashMap2 = C2OE.LJII;
                                    hashMap2.put(C2OE.LJIIJ, valueOf);
                                    keva.storeString("progress_milestone_key", new JSONObject(hashMap2).toString());
                                    C188727au c188727au = new C188727au();
                                    String str2 = C2OE.LIZ;
                                    if (str2 != null) {
                                        c188727au.LJIIIZ("enter_from", str2);
                                        c188727au.LIZLLL(LIZ, "progress_pct");
                                        c188727au.LIZLLL(z ? 1 : 0, "is_init_first_show");
                                        c188727au.LIZLLL(keva.getInt("video_watched_cnt", -1), "video_watched_cnt");
                                        c188727au.LIZJ("play_time_duration", keva.getDouble("play_time_duration", -1.0d));
                                        if (C2OE.LJIILJJIL == EnumC61772bd.PERCENTAGE) {
                                            str = "video_count";
                                        } else {
                                            str = "duration";
                                        }
                                        c188727au.LJIIIZ("bar_type", str);
                                        c188727au.LIZLLL(C2OE.LJIILIIL + 1, "video_position");
                                        FMX.LJIIL("show_nuf_progress_bar", c188727au.LIZ);
                                    } else {
                                        o.LJIJI("enterFrom");
                                        throw null;
                                    }
                                }
                            }
                            C2OF.LJIIIIZZ(i);
                            WeakReference<C57602Nw> weakReference = C2OE.LIZIZ;
                            if (weakReference != null && (c57602Nw = weakReference.get()) != null) {
                                c57602Nw.LJ(C2OF.LIZ(), i);
                            }
                        }
                    });
                    C2OE.LJIILLIIL = countDownTimer3;
                    countDownTimer3.cancel();
                    CountDownTimer countDownTimer4 = C2OE.LJIILLIIL;
                    if (countDownTimer4 == null) {
                        return;
                    }
                    countDownTimer4.start();
                    return;
                }
                CountDownTimer countDownTimer5 = C2OE.LJIILLIIL;
                if (countDownTimer5 == null) {
                    return;
                }
                countDownTimer5.resume();
            }
        }));
    }

    public static boolean LJFF() {
        long expiry;
        C57602Nw c57602Nw;
        Long l;
        boolean z = false;
        if (!C2OE.LJJ) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ProgressBarExpirySetting progressBarExpirySetting = ProgressBarExpirySetting.INSTANCE;
        if (progressBarExpirySetting.getExpiry() == -1) {
            NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo = C2OE.LJIIIZ;
            if (newUserProgressModel$ProgressBarInfo != null && (l = newUserProgressModel$ProgressBarInfo.showUntil) != null) {
                expiry = l.longValue();
            } else {
                expiry = Long.MAX_VALUE;
            }
        } else {
            expiry = progressBarExpirySetting.getExpiry();
        }
        if (currentTimeMillis > Long.MAX_VALUE + expiry) {
            C2OE.LIZLLL.erase("progress_bar_data_v3");
            C2OE.LJIIIZ = null;
            WeakReference<C57602Nw> weakReference = C2OE.LIZIZ;
            z = true;
            if (weakReference != null && (c57602Nw = weakReference.get()) != null) {
                c57602Nw.LIZJ(true);
            }
        }
        return z;
    }

    public static void LJ(boolean z) {
        Keva keva = C2OE.LIZLLL;
        keva.erase("progress_bar_data");
        keva.erase("progress_bar_data_v2");
        if (keva.contains("progress_map_key")) {
            String jsonMap = keva.getString("progress_map_key", "");
            o.LJIIIIZZ(jsonMap, "jsonMap");
            if (jsonMap.length() > 0) {
                LJIIIZ(new JSONObject(jsonMap), C2OE.LJ);
            }
        }
        if (keva.contains("progress_dismiss_key")) {
            String jsonMap2 = keva.getString("progress_dismiss_key", "");
            o.LJIIIIZZ(jsonMap2, "jsonMap");
            if (jsonMap2.length() > 0) {
                LJIIIZ(new JSONObject(jsonMap2), C2OE.LJFF);
            }
        }
        if (keva.contains("progress_milestone_key")) {
            String jsonMap3 = keva.getString("progress_milestone_key", "");
            o.LJIIIIZZ(jsonMap3, "jsonMap");
            if (jsonMap3.length() > 0) {
                LJIIIZ(new JSONObject(jsonMap3), C2OE.LJII);
            }
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        C2OE.LJIIJ = curUserId;
        HashMap<String, Object> hashMap = C2OE.LJFF;
        if (hashMap.containsKey(C2OE.LJIIJ)) {
            Object obj = hashMap.get(C2OE.LJIIJ);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
            keva.storeBoolean("progress_dismissed_by_user", ((Boolean) obj).booleanValue());
        } else {
            keva.storeBoolean("progress_dismissed_by_user", false);
        }
        HashMap<String, Object> hashMap2 = C2OE.LJII;
        if (hashMap2.containsKey(C2OE.LJIIJ)) {
            Object obj2 = hashMap2.get(C2OE.LJIIJ);
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
            keva.storeInt("milestone_progress_reported", ((Integer) obj2).intValue());
        } else {
            keva.storeInt("milestone_progress_reported", -1);
        }
        if (keva.contains("progress_bar_data_v3") || z) {
            String string = keva.getString("progress_bar_data_v3", "");
            if (!z) {
                try {
                    C2OE.LJIIIZ = (NewUserProgressModel$ProgressBarInfo) new Gson().LJII(string, new TypeToken<NewUserProgressModel$ProgressBarInfo>() { // from class: X.2OI
                    }.getType());
                } catch (Exception e) {
                    String message = e.getMessage();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("parse_error_msg", message);
                    FMX.LJIIL("issue_parsing_progress_data", c188727au.LIZ);
                }
            }
            LJIIJ(z);
        }
    }

    public static void LJII(double d) {
        if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        Keva keva = C2OE.LIZLLL;
        if (keva.contains("video_watched_cnt")) {
            C19N.LIZJ(keva, "video_watched_cnt", 0, 1, "video_watched_cnt");
        } else {
            keva.storeInt("video_watched_cnt", 1);
        }
        if (keva.contains("play_time_duration")) {
            keva.storeDouble("play_time_duration", keva.getDouble("play_time_duration", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) + d);
        } else {
            keva.storeDouble("play_time_duration", d);
        }
    }

    public static void LJIIIIZZ(int i) {
        Keva keva = C2OE.LIZLLL;
        if (keva.contains("progress_time_left_key")) {
            LJIIIZ(new JSONObject(keva.getString("progress_time_left_key", "")), C2OE.LJI);
        }
        Integer valueOf = Integer.valueOf(i);
        HashMap<String, Object> hashMap = C2OE.LJI;
        hashMap.put(C2OE.LJIIJ, valueOf);
        keva.storeString("progress_time_left_key", new JSONObject(hashMap).toString());
    }

    public static void LJIIJ(boolean z) {
        WeakReference<C57602Nw> weakReference;
        C57602Nw c57602Nw;
        int i;
        Integer num;
        Integer num2;
        List<NewUserProgressModel$Stage> list;
        NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo = C2OE.LJIIIZ;
        int i2 = 0;
        if (newUserProgressModel$ProgressBarInfo != null && (num2 = newUserProgressModel$ProgressBarInfo.style) != null) {
            int intValue = num2.intValue();
            EnumC61772bd.Companion.getClass();
            C2OE.LJIILJJIL = C61892bp.LIZ(intValue);
            NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo2 = C2OE.LJIIIZ;
            if (newUserProgressModel$ProgressBarInfo2 != null) {
                list = newUserProgressModel$ProgressBarInfo2.stages;
            } else {
                list = null;
            }
            C2OE.LJIILL = list;
            EnumC61772bd enumC61772bd = C2OE.LJIILJJIL;
            o.LJI(enumC61772bd);
            if (enumC61772bd == EnumC61772bd.PERCENTAGE) {
                HashMap<String, Object> hashMap = C2OE.LJ;
                if (hashMap.containsKey(C2OE.LJIIJ)) {
                    Object obj = hashMap.get(C2OE.LJIIJ);
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                    C2OE.LJIIJJI = ((Integer) obj).intValue();
                } else if (!z) {
                    hashMap.put(C2OE.LJIIJ, 5);
                    C2OE.LJIIJJI = 5;
                } else {
                    hashMap.put(C2OE.LJIIJ, Integer.valueOf(C2OE.LJIIJJI));
                }
            } else {
                HashMap<String, Object> hashMap2 = C2OE.LJ;
                if (hashMap2.containsKey(C2OE.LJIIJ)) {
                    Object obj2 = hashMap2.get(C2OE.LJIIJ);
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
                    C2OE.LJIIL = ((Integer) obj2).intValue();
                } else {
                    List<NewUserProgressModel$Stage> list2 = C2OE.LJIILL;
                    if (list2 != null) {
                        if (!z) {
                            int intValue2 = ((Number) ListProtector.get(((NewUserProgressModel$Stage) ListProtector.get(list2, 0)).range, 0)).intValue();
                            C2OE.LJIIL = 100 / (intValue2 / 15);
                            hashMap2.put(C2OE.LJIIJ, Integer.valueOf(C2OE.LJIIL));
                            LJIIIIZZ(intValue2);
                        } else {
                            hashMap2.put(C2OE.LJIIJ, Integer.valueOf(C2OE.LJIIL));
                        }
                    }
                }
            }
            C2OE.LIZLLL.storeString("progress_map_key", new JSONObject(C2OE.LJ).toString());
        }
        NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo3 = C2OE.LJIIIZ;
        if (newUserProgressModel$ProgressBarInfo3 != null && (num = newUserProgressModel$ProgressBarInfo3.videoSkipDuration) != null) {
            i2 = num.intValue();
        }
        C2OE.LJIIZILJ = i2;
        if (C2OE.LJIJ != 3 && (weakReference = C2OE.LIZIZ) != null && (c57602Nw = weakReference.get()) != null) {
            int LIZ = LIZ();
            Integer LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            } else {
                i = -1;
            }
            c57602Nw.LJ(LIZ, i);
        }
    }

    public static void LJIIIZ(JSONObject jSONObject, HashMap hashMap) {
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "myObj.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (android.text.TextUtils.equals(r2, r1) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.ref.WeakReference r7) {
        /*
            if (r6 != 0) goto L4
            java.lang.String r6 = ""
        L4:
            X.C2OE.LIZ = r6
            X.C2OE.LIZJ = r7
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L50
            boolean r0 = r5.isAd()
            if (r0 != 0) goto L50
            boolean r0 = r5.isRelieve()
            if (r0 != 0) goto L50
            boolean r0 = X.C78996UzQ.LJJIJIL(r5)
            if (r0 != 0) goto L50
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r0 = r5.getRoomFeedCellStruct()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r0.getNewLiveRoomData()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.live.WarningTag r0 = r0.warningTag
            if (r0 != 0) goto L50
        L2e:
            com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService r0 = yq4.a.LIZLLL()
            boolean r0 = r0.LJIIIIZZ()
            if (r0 != r4) goto L65
            com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService r0 = yq4.a.LIZLLL()
            java.lang.String r2 = r0.LJII()
            java.lang.String r1 = r5.getAid()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L65
            boolean r0 = android.text.TextUtils.equals(r2, r1)
            if (r0 == 0) goto L65
        L50:
            int r1 = X.C2OE.LJIJ
            if (r1 <= 0) goto L5b
            r0 = 3
            if (r1 == r0) goto L5b
            int r0 = r1 + (-1)
            X.C2OE.LJIJ = r0
        L5b:
            com.ss.android.ugc.aweme.util.CountDownTimer r0 = X.C2OE.LJIILLIIL
            if (r0 == 0) goto L62
            r0.cancel()
        L62:
            X.C2OE.LJJI = r4
            return r3
        L65:
            java.lang.Object r0 = r7.get()
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = (com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel) r0
            if (r0 == 0) goto L74
            boolean r0 = r0.isRecommendFeed()
            if (r0 != 0) goto L74
            goto L50
        L74:
            boolean r0 = X.C220858ld.LJIIIIZZ(r5)
            if (r0 == 0) goto L7b
            goto L50
        L7b:
            com.bytedance.keva.Keva r1 = X.C2OE.LIZLLL
            java.lang.String r0 = "progress_dismissed_by_user"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L8b
        L85:
            X.Sq2 r0 = X.C2OE.LJIJJLI
            r0.dispose()
            return r3
        L8b:
            X.2bd r2 = X.C2OE.LJIILJJIL
            X.2bd r0 = X.EnumC61772bd.PERCENTAGE
            r1 = 100
            if (r2 != r0) goto L98
            int r0 = X.C2OE.LJIIJJI
            if (r0 <= r1) goto L9d
            goto L85
        L98:
            int r0 = X.C2OE.LJIIL
            if (r0 <= r1) goto L9d
            goto L85
        L9d:
            boolean r0 = LJFF()
            if (r0 == 0) goto La4
            return r3
        La4:
            X.C2OE.LJJI = r3
            com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$ProgressBarInfo r0 = X.C2OE.LJIIIZ
            if (r0 == 0) goto Lab
        Laa:
            return r4
        Lab:
            r4 = 0
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2OF.LJI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.ref.WeakReference):boolean");
    }
}
