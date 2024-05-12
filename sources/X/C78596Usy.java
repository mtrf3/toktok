package X;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.giftlimitnotification.api.GiftLimitNotificationApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.EnableCoHostDetailedDisableReasonSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.follow.LastViewData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusinessHelper;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.t1;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Usy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78596Usy implements InterfaceC48038ItG, C0K7, MR6, InterfaceC47527Il1, InterfaceC31922Cfu, InterfaceC46111I7v {
    public static long LJLIL = -1;
    public static String LJLJJI;
    public static File LJLJJL;
    public static File LJLJJLL;
    public static File LJLJL;
    public static File LJLJLJ;
    public static File LJLJLLL;
    public static final C78596Usy LJLILLLLZI = new C78596Usy();
    public static final C78596Usy LJLJI = new C78596Usy();
    public static final C78596Usy LJLL = new C78596Usy();

    public static final String LJIIL(int i) {
        return i != 1 ? i != 2 ? "normal" : "channel" : "official";
    }

    @Override // X.InterfaceC47527Il1
    public void LJ() {
    }

    public static final C194667kU LJJIFFI() {
        ConcurrentHashMap<InterfaceC65350Pko<?>, Object> concurrentHashMap = C62834OlK.LIZIZ;
        Object obj = concurrentHashMap.get(C65352Pkq.LIZ(C194667kU.class));
        if (!(obj instanceof C194667kU)) {
            obj = null;
        }
        C194667kU c194667kU = (C194667kU) obj;
        if (c194667kU == null) {
            C194667kU c194667kU2 = new C194667kU();
            concurrentHashMap.put(C65352Pkq.LIZ(C194667kU.class), c194667kU2);
            return c194667kU2;
        }
        return c194667kU;
    }

    public static File LJJIIZI() {
        if (LJLJLLL == null) {
            File LJIIZILJ = LJIIZILJ(PK0.LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("anr_");
            LIZ.append(PK0.LJ());
            File file = new File(new File(LJIIZILJ, X1D.LIZIZ(LIZ)), "trace");
            LJLJLLL = file;
            file.getParentFile().mkdirs();
        }
        return LJLJLLL;
    }

    public static boolean LJJIJ() {
        return e1.LIZ(31744, "optimize_assemhandler", true, false);
    }

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        TTLSPreInitBusinessHelper.preInitLiveCore(RunnableC30505By9.LJLIL);
    }

    public static String LJIILL() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
    }

    public static final boolean LJIIIZ(RivalExtraInfo rivalExtraInfo) {
        if (rivalExtraInfo == null || rivalExtraInfo.inviteBlockReason > 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r0 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r1 < X.IJ5.LIZIZ) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIJJI(android.content.Context r7) {
        /*
            X.KoY r0 = X.C52842KoY.LIZ
            r0.getClass()
            X.Ol8 r0 = X.C52842KoY.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 31744(0x7c00, float:4.4483E-41)
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L42
            float r2 = X.IJO.LIZ()
            X.J5l r1 = X.IJN.LIZ()
            java.lang.String r0 = "publish_intention_score"
            float r1 = r1.LIZLLL(r0)
            float r0 = X.IJ5.LIZ
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L31
            float r0 = X.IJ5.LIZIZ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L7e
        L31:
            X.HQ7 r0 = X.C44172HVg.LJIJ
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L41
            java.lang.String r0 = "studio_not_request_authkey"
            boolean r0 = defpackage.e1.LIZ(r5, r0, r4, r3)
            if (r0 != 0) goto L7e
        L41:
            return r4
        L42:
            r6 = -1
            java.lang.String r2 = "publish_type_bytebench_memory_downgrade"
            int r0 = X.C00F.LIZ(r5, r6, r2, r4)
            if (r0 != r4) goto L52
        L4b:
            boolean r0 = X.C45043Hm3.LIZ()
        L4f:
            if (r0 != 0) goto L7e
            goto L31
        L52:
            int r1 = X.C00F.LIZ(r5, r6, r2, r4)
            r0 = 2
            if (r1 != r0) goto L5a
            goto L4b
        L5a:
            int r1 = X.C00F.LIZ(r5, r6, r2, r4)
            r0 = 4
            if (r1 != r0) goto L62
            goto L4b
        L62:
            X.Usz r2 = LJJJIL(r7)     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "PreSyntheticMachinePerformanceLimitLevel1 "
            r1.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L80
            r1.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L80
            X.H7B.LIZ(r0)     // Catch: java.lang.Throwable -> L80
            boolean r0 = r2.LIZ     // Catch: java.lang.Throwable -> L80
            goto L4f
        L7e:
            r4 = 0
            goto L41
        L80:
            r0 = move-exception
            X.H7B.LIZLLL(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78596Usy.LJIIJJI(android.content.Context):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIILIIL(com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo r7) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78596Usy.LJIILIIL(com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo):java.lang.String");
    }

    public static File LJIILJJIL(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIIJ(context));
        LIZ.append('/');
        LIZ.append("issueCrashTimes");
        LIZ.append('/');
        LIZ.append("current.times");
        return new File(X1D.LIZIZ(LIZ));
    }

    public static File LJIIZILJ(Context context) {
        return new File(LJJIIJ(context), "npth/CrashCommonLog");
    }

    public static File LJIJ(Context context) {
        if (LJLJL == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJJIIJ(context));
            LIZ.append('/');
            LIZ.append("npth/CrashCommonLog");
            LIZ.append('/');
            LIZ.append(PK0.LIZJ());
            LJLJL = new File(X1D.LIZIZ(LIZ));
        }
        return LJLJL;
    }

    public static File LJIJJ(Context context) {
        if (context == null) {
            context = PK0.LIZ;
        }
        return new File(LJJIIJ(context), "npth/GwpReport");
    }

    public static File LJIJJLI(Context context) {
        return new File(LJJIIJ(context), "npth/CrashLogJava");
    }

    public static File LJIL(Context context) {
        if (LJLJJLL == null) {
            if (context == null) {
                context = PK0.LIZ;
            }
            LJLJJLL = new File(LJJIIJ(context), "npth/CrashLogNative");
        }
        return LJLJJLL;
    }

    public static File LJJ(String str) {
        return new File(LJIJI(PK0.LIZ, str), "fds.txt");
    }

    public static final OSZ LJJI(Context context) {
        OSZ osz;
        o.LJIIIZ(context, "context");
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        boolean LJI = c74216TAu.LJI();
        Integer valueOf = Integer.valueOf(R.string.dte);
        if (LJI) {
            return new OSZ(context.getString(R.string.dte), context.getString(R.string.dtk));
        }
        int i = T38.LIZ[c74216TAu.LJII().ordinal()];
        if (i != 1) {
            if (i != 2) {
                osz = new OSZ(Integer.valueOf(R.string.jcp), Integer.valueOf(R.string.jco));
            } else {
                osz = new OSZ(valueOf, Integer.valueOf(R.string.jcn));
            }
        } else {
            osz = new OSZ(valueOf, Integer.valueOf(R.string.dtb));
        }
        return new OSZ(context.getString(((Number) osz.getFirst()).intValue()), context.getString(((Number) osz.getSecond()).intValue()));
    }

    public static File LJJII(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIIJ(context));
        LIZ.append('/');
        LIZ.append("npth/predump");
        return new File(X1D.LIZIZ(LIZ));
    }

    public static String LJJIIJ(Context context) {
        if (context == null) {
            C78685UuP.LJJI();
            return "";
        }
        if (TextUtils.isEmpty(LJLJJI)) {
            try {
                LJLJJI = C16880lQ.LLIIJLIL(context).getAbsolutePath();
            } catch (Exception e) {
                LJLJJI = "";
                C16880lQ.LLLLIIL(e);
            }
        }
        return LJLJJI;
    }

    public static final String LJJIIZ(M89 m89) {
        o.LJIIIZ(m89, "<this>");
        String str = m89.getExtra().get("enter_position");
        if (str == null) {
            return C222578oP.LJII(null, m89.getEventType(), m89.getFrom());
        }
        return str;
    }

    public static boolean LJJIL(InterfaceC65784Pro condition) {
        boolean LIZIZ = DPB.LIZIZ();
        o.LJIIIZ(condition, "condition");
        if (DPI.LIZ()) {
            if (!C35478DwA.LIZIZ() && LIZIZ) {
                return true;
            }
            return false;
        }
        return ((Boolean) condition.invoke()).booleanValue();
    }

    public static final boolean LJJJ(RivalExtraInfo rivalExtraInfo) {
        if (EnableCoHostDetailedDisableReasonSetting.INSTANCE.getValue()) {
            int i = rivalExtraInfo.detailBlockReason;
            if (i >= 100 && i <= 104) {
                return true;
            }
        } else if (rivalExtraInfo.inviteBlockReason == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJI(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C79234V7u.LJIIIIZZ(H7R.LJJJJI(videoPublishEditModel))) {
            return false;
        }
        boolean LIZ = C44674Hg6.LIZ();
        if ((videoPublishEditModel.isUploadVideo() && C44745HhF.LIZ()) || (videoPublishEditModel.mOrigin == 1 && C44746HhG.LIZ())) {
            z = true;
        } else {
            z = false;
        }
        if (!LIZ || !z) {
            return false;
        }
        return true;
    }

    public static final C78597Usz LJJJIL(Context context) {
        o.LJIIIZ(context, "context");
        long j = 1024;
        int LIZ = (int) ((C48340Iy8.LIZ(context) / j) / j);
        if (LIZ > 0 && LIZ < 1600) {
            return new C78597Usz(true, C48263Iwt.LIZLLL("TotalMemory min:", 1600, " current:", LIZ));
        }
        return new C78597Usz(false, "allow");
    }

    public static final boolean LJJJJ(Context context) {
        o.LJIIIZ(context, "context");
        C52842KoY.LIZ.getClass();
        boolean z = false;
        if (((Boolean) C52842KoY.LIZIZ.getValue()).booleanValue()) {
            float LIZ = IJO.LIZ();
            float LIZLLL = IJN.LIZ().LIZLLL("publish_intention_score");
            if (LIZ <= IJ5.LIZ || LIZLLL >= IJ5.LIZIZ) {
                z = true;
            }
            return !z;
        }
        if (C00F.LIZ(31744, -1, "publish_type_bytebench_memory_downgrade", true) == 1 || C00F.LIZ(31744, -1, "publish_type_bytebench_memory_downgrade", true) == 2 || C00F.LIZ(31744, -1, "publish_type_bytebench_memory_downgrade", true) == 4) {
            return C45043Hm3.LIZ();
        }
        try {
            C78597Usz LJJJIL = LJJJIL(context);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PreSyntheticMachinePerformanceLimitLevel2 ");
            LIZ2.append(LJJJIL.LIZIZ);
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            z = LJJJIL.LIZ;
            return z;
        } catch (Throwable th) {
            H7B.LIZLLL(th);
            return z;
        }
    }

    public static final boolean LJJJJI(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        if (NLESegmentVideo.LJJ(nLETrackSlot.LJI()) != null) {
            return true;
        }
        return false;
    }

    public static final void LJJJJLI(C44428Hc8 c44428Hc8) {
        if (c44428Hc8.LIZIZ) {
            c44428Hc8.LJ();
        }
    }

    public static final String LJJJLL(Aweme aweme) {
        Music music;
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        o.LJIIIZ(aweme, "<this>");
        if (!C54838Lfe.LJJI(aweme)) {
            return "";
        }
        if (aweme.getMusic() == null || (((music = aweme.getMusic()) != null && music.getMusicStatus() == 0) || ((status = aweme.getStatus()) != null && (videoMuteInfo = status.getVideoMuteInfo()) != null && videoMuteInfo.isMute()))) {
            return "no_music";
        }
        return "with_music";
    }

    @Override // X.MR6
    public void LIZIZ(Context context) {
        UgAllServiceImpl.LIZ().LIZIZ(context);
    }

    @Override // X.MR6
    public boolean LIZJ(Context context) {
        return UgAllServiceImpl.LIZ().LIZJ(context);
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        BEA.LIZ.getClass();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            C1EW.LIZ(((GiftLimitNotificationApi) Q7L.LIZIZ(GiftLimitNotificationApi.class)).giftLimitNotificationSetNotificationFrequency(room.getId(), BEA.LJIIJ)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9DY
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9DZ
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        BE9.LIZJ(BEA.LJ() ? 1 : 0, "dont_show");
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIJ(it, "it");
        return C1XY.LJJIIJ(it.getSecond());
    }

    public static final void LJI(Aweme aweme, Object obj) {
        String str;
        Music music;
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (!C54838Lfe.LJJI(aweme)) {
            return;
        }
        if (aweme.getMusic() == null || (((music = aweme.getMusic()) != null && music.getMusicStatus() == 0) || ((status = aweme.getStatus()) != null && (videoMuteInfo = status.getVideoMuteInfo()) != null && videoMuteInfo.isMute()))) {
            str = "no_music";
        } else {
            str = "with_music";
        }
        LJFF("story_music_with_mute", obj, str);
    }

    public static final void LJII(Aweme aweme, Object obj) {
        String str;
        String batchId;
        if (C1DF.LJJIII(aweme)) {
            if (aweme == null || (batchId = aweme.getBatchId()) == null || batchId.length() == 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            LJFF("is_batch_sub", obj, str);
        }
    }

    public static long LJIIIIZZ(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        Date date2 = new Date();
        try {
            date = simpleDateFormat.parse(str);
            date2 = simpleDateFormat.parse(str2);
        } catch (ParseException e) {
            C16880lQ.LLLLIIL(e);
        }
        return date2.getTime() - date.getTime();
    }

    public static final boolean LJIIJ(LastViewData lastViewData, int i) {
        int i2;
        if (lastViewData == null || (i2 = lastViewData.index) < 0 || i2 > i) {
            return false;
        }
        return true;
    }

    public static File LJIJI(Context context, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIIJ(context));
        LIZ.append('/');
        LIZ.append("npth/CrashCommonLog");
        LIZ.append('/');
        LIZ.append(str);
        return new File(X1D.LIZIZ(LIZ));
    }

    public static File LJJIII(Context context, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJIIJ(context));
        LIZ.append('/');
        LIZ.append("npth/predump");
        LIZ.append("/");
        LIZ.append(str);
        return new File(X1D.LIZIZ(LIZ));
    }

    public static final NLETrackSlot LJJIIJZLJL(NLEModel nLEModel, String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator LIZJ = t1.LIZJ(nLEModel, "tracks");
        while (LIZJ.hasNext()) {
            Iterator<NLETrackSlot> it = ((NLETrack) LIZJ.next()).LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                if (next.getUUID().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static final boolean LJJIJL(InterfaceC65784Pro condition, boolean z) {
        o.LJIIIZ(condition, "condition");
        if (DPI.LIZ()) {
            if (C35478DwA.LIZIZ() && z) {
                return true;
            }
            return false;
        }
        return ((Boolean) condition.invoke()).booleanValue();
    }

    public static final boolean LJJIZ(InterfaceC65784Pro condition, boolean z) {
        o.LJIIIZ(condition, "condition");
        if (DPI.LIZ()) {
            return z;
        }
        return ((Boolean) condition.invoke()).booleanValue();
    }

    public static final boolean LJJJJIZL(Aweme aweme, String str) {
        if (o.LJ(str, "live_center")) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            if (((HashMap) C47699Inn.LJIIIZ).containsKey(aid)) {
                return true;
            }
        }
        return false;
    }

    public static final void LJJJJLL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJJJJZ(int i, T5T t5t) {
        t5t.setPadding(i, t5t.getPaddingTop(), t5t.getPaddingRight(), t5t.getPaddingBottom());
    }

    public static final void LJJJJZI(int i, T5T t5t) {
        t5t.setPadding(t5t.getPaddingLeft(), t5t.getPaddingTop(), i, t5t.getPaddingBottom());
    }

    public static final void LJJJLIIL(Context context, boolean z) {
        long LJIIIIZZ;
        int i;
        String string;
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (c74216TAu.LIZIZ() && context != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                LJIIIIZZ = 3500;
            } else {
                LJIIIIZZ = c74216TAu.LJIIIIZZ();
            }
            if (currentTimeMillis - LJLIL < LJIIIIZZ) {
                return;
            }
            LJLIL = currentTimeMillis;
            if (c74216TAu.LJI()) {
                string = context.getString(R.string.dtk);
                o.LJIIIIZZ(string, "context.getString(R.stri…ction_toast_airplanemode)");
            } else {
                int i2 = T38.LIZJ[c74216TAu.LJII().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        i = R.string.dto;
                    } else {
                        i = R.string.dtd;
                    }
                } else {
                    i = R.string.dtf;
                }
                string = context.getString(i);
                o.LJIIIIZZ(string, "context.getString(strID)");
            }
            C82890Wg2.LJFF.getClass();
            new C82890Wg2(context, string, 0, 2).LIZ();
        }
    }

    public static String LJJJZ(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder LIZIZ = C07780Sg.LIZIZ("<", str2, " threw ");
                    LIZIZ.append(e.getClass().getName());
                    LIZIZ.append(">");
                    sb = LIZIZ.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    @Override // X.InterfaceC47527Il1
    public void LIZLLL(java.util.Map map, Object obj) {
        ((java.util.Map) obj).putAll(map);
    }

    public static final void LJFF(String str, Object obj, String str2) {
        Object obj2;
        try {
            if (obj instanceof JHM) {
                JHM jhm = (JHM) obj;
                jhm.getClass();
                jhm.LJ(str, str2, InterfaceC1798974f.LIZ);
                obj2 = jhm;
            } else if (obj instanceof C198517qh) {
                C198517qh c198517qh = (C198517qh) obj;
                c198517qh.LIZ.put(str, str2);
                obj2 = c198517qh;
            } else if (obj instanceof C188727au) {
                C188727au c188727au = (C188727au) obj;
                c188727au.getClass();
                c188727au.LJIIIZ(str, str2);
                obj2 = c188727au;
            } else if (obj instanceof JSONObject) {
                obj2 = ((JSONObject) obj).put(str, str2);
            } else {
                obj2 = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(obj2);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final Object LJJIJIIJI(Object optValue, InterfaceC65784Pro condition, boolean z) {
        o.LJIIIZ(optValue, "optValue");
        o.LJIIIZ(condition, "condition");
        if (C2NW.LIZ().isNewUser()) {
            if (z) {
                if (C35478DwA.LIZIZ()) {
                    return optValue;
                }
                return condition.invoke();
            }
            return condition.invoke();
        }
        return condition.invoke();
    }

    public static final Object LJJIJIL(Object optValue, InterfaceC65784Pro condition, boolean z) {
        o.LJIIIZ(optValue, "optValue");
        o.LJIIIZ(condition, "condition");
        if (C2NW.LIZ().isNewUser()) {
            if (z) {
                return optValue;
            }
            return condition.invoke();
        }
        return condition.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r13 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJJJJL(java.lang.String r16, java.lang.String[] r17, java.util.List r18) {
        /*
            r6 = r18
            X.VD1 r2 = X.VD1.LJLIL
            r0 = -1
            if (r2 == 0) goto L92
            r4 = r17
            int r2 = r4.length
            if (r2 <= 0) goto L92
            r7 = 0
            java.lang.String r11 = ""
            r5 = 0
        L11:
            int r2 = r4.length
            if (r5 >= r2) goto L27
            r3 = r4[r5]
            if (r5 == 0) goto L1e
            java.lang.String r2 = " and "
            java.lang.String r11 = defpackage.i0.LJFF(r11, r2)
        L1e:
            java.lang.String r2 = "=?"
            java.lang.String r11 = defpackage.a1.LJ(r11, r3, r2)
            int r5 = r5 + 1
            goto L11
        L27:
            r13 = 0
            X.VD1 r2 = X.VD1.LJLIL     // Catch: java.lang.Throwable -> L8d
            android.database.sqlite.SQLiteDatabase r8 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L8d
            r8.beginTransaction()     // Catch: java.lang.Throwable -> L8c
            int r2 = r4.length     // Catch: java.lang.Throwable -> L8c
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L8c
            r0 = -1
        L3c:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L83
            java.lang.Object r5 = r6.next()     // Catch: java.lang.Throwable -> L8a
            android.content.ContentValues r5 = (android.content.ContentValues) r5     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L81
            r3 = 0
        L4b:
            int r2 = r4.length     // Catch: java.lang.Throwable -> L8a
            if (r3 >= r2) goto L5d
            r2 = r4[r3]     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L8a
            r12[r3] = r2     // Catch: java.lang.Throwable -> L8a
            int r3 = r3 + 1
            goto L4b
        L5d:
            r2 = 1
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L8a
            r2 = r4[r7]     // Catch: java.lang.Throwable -> L8a
            r10[r7] = r2     // Catch: java.lang.Throwable -> L8a
            r9 = r16
            r14 = r13
            r15 = r13
            android.database.Cursor r3 = r8.query(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L81
            int r2 = r3.getCount()     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L79
            long r0 = r8.insert(r9, r13, r5)     // Catch: java.lang.Throwable -> L8a
            goto L7e
        L79:
            int r0 = r8.update(r9, r5, r11, r12)     // Catch: java.lang.Throwable -> L8a
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L8a
        L7e:
            r3.close()     // Catch: java.lang.Throwable -> L8c
        L81:
            r7 = 0
            goto L3c
        L83:
            r8.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L8a
            r8.endTransaction()     // Catch: java.lang.Throwable -> L92
            goto L92
        L8a:
            r13 = r8
            goto L8f
        L8c:
            r13 = r8
        L8d:
            if (r13 == 0) goto L92
        L8f:
            r13.endTransaction()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L92
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78596Usy.LJJJJL(java.lang.String, java.lang.String[], java.util.List):long");
    }

    public static final void LJJJLZIJ(RivalExtraInfo rivalExtraInfo, int i, int i2) {
        rivalExtraInfo.detailBlockReason = i2;
        rivalExtraInfo.inviteBlockReason = i;
    }

    public static final Object LJJIJIIJIL(boolean z, Object optValue, boolean z2, InterfaceC65784Pro condition) {
        o.LJIIIZ(optValue, "optValue");
        o.LJIIIZ(condition, "condition");
        if (C2NW.LIZ().isNewUser()) {
            if (z) {
                if (z2) {
                    return optValue;
                }
                return condition.invoke();
            }
            return condition.invoke();
        }
        return condition.invoke();
    }

    public static Cursor LJJJJJL(String str, String[] strArr, String str2, String[] strArr2) {
        if (VD1.LJLIL != null) {
            try {
                return VD1.LJLIL.getReadableDatabase().query(str, strArr, str2, strArr2, null, null, null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static InterfaceC07790Sh LJJJJJ(InterfaceC07790Sh interfaceC07790Sh, AbstractC16010k1 painter, InterfaceC07760Se interfaceC07760Se, InterfaceC273615o interfaceC273615o, float f, C11890dN c11890dN, int i) {
        boolean z;
        C11890dN c11890dN2 = c11890dN;
        float f2 = f;
        InterfaceC07760Se alignment = interfaceC07760Se;
        InterfaceC273615o contentScale = interfaceC273615o;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            InterfaceC07760Se.LJJJ.getClass();
            alignment = C07730Sb.LJFF;
        }
        if ((i & 8) != 0) {
            InterfaceC273615o.LJLIIIL.getClass();
            contentScale = C273415m.LJ;
        }
        if ((i & 16) != 0) {
            f2 = 1.0f;
        }
        if ((i & 32) != 0) {
            c11890dN2 = null;
        }
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(painter, "painter");
        o.LJIIIZ(alignment, "alignment");
        o.LJIIIZ(contentScale, "contentScale");
        return interfaceC07790Sh.LLLIIIL(new C50551yd(painter, z, alignment, contentScale, f2, c11890dN2));
    }
}
