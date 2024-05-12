package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.animation.Animation;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.PlayAddress;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.ShareRespSendServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Ut7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78605Ut7 implements InterfaceC48038ItG, InterfaceC62736Ojk, InterfaceC51347KDf, InterfaceC78595Usx, V04, GVF, InterfaceC31694CcE, C0K7 {
    public static final C78605Ut7 LJLIL = new C78605Ut7();
    public static final C78605Ut7 LJLILLLLZI = new C78605Ut7();
    public static final C78605Ut7 LJLJI = new C78605Ut7();

    @Override // X.InterfaceC31694CcE
    public void LIZ() {
        DJ1.LIZ.storeBoolean("need_show_ec_tip_in_living_room", false);
    }

    public static final boolean LIZLLL() {
        if (Build.VERSION.SDK_INT < 33) {
            return LJFF("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return LIZJ(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
    }

    public static List LJIIZILJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ShareRespSendServiceImpl.LJ().LIZLLL());
        arrayList.add(new GTI());
        arrayList.add(MixFeedService.LJJIJIIJIL().LJIJ());
        return arrayList;
    }

    public /* synthetic */ C78605Ut7() {
    }

    public /* synthetic */ C78605Ut7(int i) {
    }

    public static final boolean LIZIZ(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final boolean LIZJ(String[] strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        return LIZIZ(LJI(strArr));
    }

    public static final boolean LJFF(String str) {
        return LIZJ(new String[]{str});
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final int[] LJI(String[] strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        Context LIZ = C5L7.LIZ();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C04330Ez.LIZ(LIZ, str)));
        }
        return ORZ.LLJ(arrayList);
    }

    public static final C25600zU LJIIIIZZ(Context context) {
        o.LJIIIZ(context, "<this>");
        return LJII(context, AnonymousClass636.LJIILJJIL(context));
    }

    public static String LJIIL(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C16880lQ.LLLZI(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C16880lQ.LLLZI(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final String[] LJIILL(String[] strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        return LJIIJJI(LJI(strArr), strArr);
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        TrendingTopic it = (TrendingTopic) obj;
        o.LJIIIZ(it, "it");
        List<Aweme> items = it.getItems();
        if (items != null) {
            List LLJILJILJ = ORZ.LLJILJILJ(items);
            if (!C79004UzY.LJJIFFI(LLJILJILJ)) {
                for (int i = 0; i < ((ArrayList) LLJILJILJ).size(); i++) {
                    Aweme R1 = AwemeService.LIZ().R1((Aweme) ListProtector.get(LLJILJILJ, i));
                    o.LJI(R1);
                    ListProtector.set(LLJILJILJ, i, R1);
                }
            }
        }
        if (it.isPicAd()) {
            return new TrendingTopicOrAd(it.getAdData());
        }
        return new TrendingTopicOrAd(it);
    }

    @Override // X.InterfaceC51347KDf
    public void i2(String str) {
        C2U8.LIZ(new C178686zo(str));
    }

    public static final C25600zU LJII(Context context, boolean z) {
        int i;
        o.LJIIIZ(context, "<this>");
        if (z) {
            i = R.style.ux;
        } else {
            i = R.style.ul;
        }
        return new C25600zU(context, i);
    }

    public static final void LJIIIZ(C38494F8w c38494F8w, Throwable th) {
        if (th == null) {
            c38494F8w.close();
            return;
        }
        try {
            c38494F8w.close();
        } catch (Throwable th2) {
            V0N.LJFF(th, th2);
        }
    }

    public static final Object LJIIJ(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return obj;
        }
        return obj2;
    }

    public static final String[] LJIIJJI(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (iArr != null && strArr != null) {
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = iArr[i];
                int i4 = i2 + 1;
                if (i2 <= strArr.length && i3 == -1) {
                    arrayList.add(strArr[i2]);
                }
                i++;
                i2 = i4;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean LJIJ(Aweme aweme, String languageCode) {
        List<TtsInfos> ttsInfos;
        PlayAddress playAddress;
        List<String> urlList;
        o.LJIIIZ(aweme, "<this>");
        o.LJIIIZ(languageCode, "languageCode");
        Audio audio = aweme.getAudio();
        if (audio != null && (ttsInfos = audio.getTtsInfos()) != null) {
            Iterator<TtsInfos> it = ttsInfos.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TtsInfos next = it.next();
                TtsInfos ttsInfos2 = next;
                if (o.LJ(ttsInfos2.getLanguageCode(), languageCode) && ttsInfos2.getPlayAddress() != null && (playAddress = ttsInfos2.getPlayAddress()) != null && (urlList = playAddress.getUrlList()) != null && !urlList.isEmpty()) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final boolean LJIL(Activity activity, String[] strArr) {
        boolean z;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = strArr[i];
                if (C04330Ez.LIZ(activity, str) != 0 && !C1AR.LJI(activity, str)) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!C44172HVg.LJJI.LJ().LJFF() || !z) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62736Ojk
    public void d(String tag, String str) {
        o.LJIIIZ(tag, "tag");
        C221018lt.LIZ(tag, str);
    }

    @Override // X.InterfaceC62736Ojk
    public void e(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C221018lt.LIZIZ(tag, msg);
    }

    @Override // X.InterfaceC62736Ojk
    public void i(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C221018lt.LJFF(tag, msg);
    }

    public static Animation LJIILIIL(long j, float f, float f2) {
        return C62850Ola.LIZIZ(f, f2, j);
    }

    public static boolean LJIJJLI(ActivityC45651qj activityC45651qj, Intent intent, Boolean bool) {
        String currentPublishTaskId;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishServiceImpl process publish intent:");
        LIZ.append(C16880lQ.LLJJIJI(intent));
        C36922EeM.LIZLLL(4, "Tools-Client", X1D.LIZIZ(LIZ));
        if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
            C36922EeM.LJ("processPublish. EXTRA_AWEME_DRAFT ");
            return true;
        }
        if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH")) {
            if (!intent.hasExtra("multi_publish_id")) {
                return true;
            }
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "multi_publish_id");
            intent.removeExtra("multi_publish_id");
            intent.getBooleanExtra("is_notification_retry", false);
            return new MainActivityCallback(activityC45651qj, LLJJIJIIJIL, false, bool).LJLJJL;
        }
        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("insert_now_post_without_landing", false));
        if (intent.hasExtra("multi_publish_id")) {
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "multi_publish_id");
            intent.removeExtra("multi_publish_id");
            return new MainActivityCallback(activityC45651qj, LLJJIJIIJIL2, valueOf.booleanValue(), bool).LJLJJL;
        }
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        PublishModel publishModel = publishService.getPublishModel(null);
        if (publishModel == null || publishModel.publishType != 0 || !publishService.isPublishing() || (currentPublishTaskId = publishService.getCurrentPublishTaskId()) == null) {
            return false;
        }
        return new MainActivityCallback(activityC45651qj, currentPublishTaskId, valueOf.booleanValue(), bool).LJLJJL;
    }

    @Override // X.InterfaceC78595Usx
    public byte[] LJIILJJIL(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public static final void LJIJI(String str, long j, Aweme aweme, String str2) {
        int i;
        String str3;
        o.LJIIIZ(aweme, "<this>");
        if (aweme.getStatistics() == null) {
            return;
        }
        int LJIIL = o.LJIIL(j, aweme.getStatistics().getCommentCount());
        if (LJIIL == 0) {
            i = 0;
        } else if (LJIIL > 0) {
            i = 1;
        } else {
            i = 2;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        int LJIIL2 = o.LJIIL(j, aweme.getStatistics().getCommentCount());
        long commentCount = aweme.getStatistics().getCommentCount();
        long createTime = aweme.getCreateTime() * 1000;
        long currentTimeMillis = System.currentTimeMillis() - (aweme.getCreateTime() * 1000);
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean == null || (str3 = logPbBean.getImprId()) == null) {
            str3 = "";
        }
        C175206uC.LIZ(i, aid, LJIIL2, commentCount, j, "comment", createTime, currentTimeMillis, str, str3, str2);
    }

    public static final void LJIJJ(String str, long j, Aweme aweme, String str2) {
        int i;
        String str3;
        if (aweme.getStatistics() == null) {
            return;
        }
        int LJIIL = o.LJIIL(j, aweme.getStatistics().getDiggCount());
        if (LJIIL == 0) {
            i = 0;
        } else if (LJIIL > 0) {
            i = 1;
        } else {
            i = 2;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        int LJIIL2 = o.LJIIL(j, aweme.getStatistics().getDiggCount());
        long diggCount = aweme.getStatistics().getDiggCount();
        long createTime = aweme.getCreateTime() * 1000;
        long currentTimeMillis = System.currentTimeMillis() - (aweme.getCreateTime() * 1000);
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean == null || (str3 = logPbBean.getImprId()) == null) {
            str3 = "";
        }
        C175206uC.LIZ(i, aid, LJIIL2, diggCount, j, "reaction", createTime, currentTimeMillis, str, str3, str2);
    }

    @Override // X.V04
    public C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map map) {
        C73952vH c73952vH;
        int i3;
        int i4;
        C79007Uzb c79007Uzb;
        boolean z;
        boolean z2;
        boolean z3;
        if (!str.isEmpty()) {
            if (v0b == V0B.DATA_MATRIX) {
                if (i >= 0 && i2 >= 0) {
                    EnumC46485IMf enumC46485IMf = EnumC46485IMf.FORCE_NONE;
                    C73952vH c73952vH2 = null;
                    if (map != null) {
                        EnumMap enumMap = (EnumMap) map;
                        EnumC46485IMf enumC46485IMf2 = (EnumC46485IMf) enumMap.get(EnumC79013Uzh.DATA_MATRIX_SHAPE);
                        if (enumC46485IMf2 != null) {
                            enumC46485IMf = enumC46485IMf2;
                        }
                        C73952vH c73952vH3 = (C73952vH) enumMap.get(EnumC79013Uzh.MIN_SIZE);
                        if (c73952vH3 == null) {
                            c73952vH3 = null;
                        }
                        c73952vH = (C73952vH) enumMap.get(EnumC79013Uzh.MAX_SIZE);
                        if (c73952vH == null) {
                            c73952vH = null;
                        }
                        c73952vH2 = c73952vH3;
                    } else {
                        c73952vH = null;
                    }
                    InterfaceC78568UsW[] interfaceC78568UsWArr = {new C78565UsT(), new C78588Usq(), new C78590Uss(), new C78589Usr(), new C1M9(), new C78598Ut0()};
                    C78593Usv c78593Usv = new C78593Usv(str);
                    c78593Usv.LIZIZ = enumC46485IMf;
                    c78593Usv.LIZJ = c73952vH2;
                    c78593Usv.LIZLLL = c73952vH;
                    if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
                        c78593Usv.LJ((char) 236);
                        c78593Usv.LJIIIIZZ = 2;
                        c78593Usv.LJFF += 7;
                    } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
                        c78593Usv.LJ((char) 237);
                        c78593Usv.LJIIIIZZ = 2;
                        c78593Usv.LJFF += 7;
                    }
                    int i5 = 0;
                    while (c78593Usv.LIZJ()) {
                        interfaceC78568UsWArr[i5].LJJIFFI(c78593Usv);
                        int i6 = c78593Usv.LJI;
                        if (i6 >= 0) {
                            c78593Usv.LJI = -1;
                            i5 = i6;
                        }
                    }
                    int LIZ = c78593Usv.LIZ();
                    c78593Usv.LIZLLL(c78593Usv.LIZ());
                    int i7 = c78593Usv.LJII.LIZIZ;
                    if (LIZ < i7 && i5 != 0 && i5 != 5 && i5 != 4) {
                        c78593Usv.LJ((char) 254);
                    }
                    StringBuilder sb = c78593Usv.LJ;
                    if (sb.length() < i7) {
                        sb.append((char) 129);
                    }
                    while (sb.length() < i7) {
                        int length = (((sb.length() + 1) * 149) % 253) + 1 + 129;
                        if (length > 254) {
                            length -= 254;
                        }
                        sb.append((char) length);
                    }
                    String sb2 = c78593Usv.LJ.toString();
                    C78606Ut8 LJFF = C78606Ut8.LJFF(sb2.length(), enumC46485IMf, c73952vH2, c73952vH);
                    int length2 = sb2.length();
                    int i8 = LJFF.LIZIZ;
                    if (length2 == i8) {
                        StringBuilder sb3 = new StringBuilder(i8 + LJFF.LIZJ);
                        sb3.append(sb2);
                        int LIZJ = LJFF.LIZJ();
                        if (LIZJ == 1) {
                            sb3.append(C8FO.LIZ(LJFF.LIZJ, sb2));
                        } else {
                            sb3.setLength(sb3.capacity());
                            int[] iArr = new int[LIZJ];
                            int[] iArr2 = new int[LIZJ];
                            int i9 = 0;
                            while (i9 < LIZJ) {
                                int i10 = i9 + 1;
                                iArr[i9] = LJFF.LIZ(i10);
                                iArr2[i9] = LJFF.LJII;
                                i9 = i10;
                            }
                            for (int i11 = 0; i11 < LIZJ; i11++) {
                                StringBuilder sb4 = new StringBuilder(iArr[i11]);
                                for (int i12 = i11; i12 < LJFF.LIZIZ; i12 += LIZJ) {
                                    sb4.append(sb2.charAt(i12));
                                }
                                String LIZ2 = C8FO.LIZ(iArr2[i11], sb4.toString());
                                int i13 = i11;
                                int i14 = 0;
                                while (i13 < iArr2[i11] * LIZJ) {
                                    sb3.setCharAt(LJFF.LIZIZ + i13, LIZ2.charAt(i14));
                                    i13 += LIZJ;
                                    i14++;
                                }
                            }
                        }
                        C78607Ut9 c78607Ut9 = new C78607Ut9(LJFF.LIZIZ() * LJFF.LIZLLL, LJFF.LJ() * LJFF.LJ, sb3.toString());
                        int i15 = 4;
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            int i18 = c78607Ut9.LIZIZ;
                            if (i15 == i18 && i16 == 0) {
                                c78607Ut9.LIZ(i18 - 1, 0, i17, 1);
                                c78607Ut9.LIZ(c78607Ut9.LIZIZ - 1, 1, i17, 2);
                                c78607Ut9.LIZ(c78607Ut9.LIZIZ - 1, 2, i17, 3);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 2, i17, 4);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 1, i17, 5);
                                c78607Ut9.LIZ(1, c78607Ut9.LIZJ - 1, i17, 6);
                                c78607Ut9.LIZ(2, c78607Ut9.LIZJ - 1, i17, 7);
                                c78607Ut9.LIZ(3, c78607Ut9.LIZJ - 1, i17, 8);
                                i17++;
                            }
                            int i19 = c78607Ut9.LIZIZ;
                            if (i15 == i19 - 2 && i16 == 0 && c78607Ut9.LIZJ % 4 != 0) {
                                c78607Ut9.LIZ(i19 - 3, 0, i17, 1);
                                c78607Ut9.LIZ(c78607Ut9.LIZIZ - 2, 0, i17, 2);
                                c78607Ut9.LIZ(c78607Ut9.LIZIZ - 1, 0, i17, 3);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 4, i17, 4);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 3, i17, 5);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 2, i17, 6);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 1, i17, 7);
                                c78607Ut9.LIZ(1, c78607Ut9.LIZJ - 1, i17, 8);
                                i17++;
                            }
                            int i20 = c78607Ut9.LIZIZ;
                            if (i15 == i20 - 2 && i16 == 0 && c78607Ut9.LIZJ % 8 == 4) {
                                c78607Ut9.LIZ(i20 - 3, 0, i17, 1);
                                c78607Ut9.LIZ(c78607Ut9.LIZIZ - 2, 0, i17, 2);
                                c78607Ut9.LIZ(c78607Ut9.LIZIZ - 1, 0, i17, 3);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 2, i17, 4);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 1, i17, 5);
                                c78607Ut9.LIZ(1, c78607Ut9.LIZJ - 1, i17, 6);
                                c78607Ut9.LIZ(2, c78607Ut9.LIZJ - 1, i17, 7);
                                c78607Ut9.LIZ(3, c78607Ut9.LIZJ - 1, i17, 8);
                                i17++;
                            }
                            int i21 = c78607Ut9.LIZIZ;
                            if (i15 == i21 + 4 && i16 == 2 && c78607Ut9.LIZJ % 8 == 0) {
                                c78607Ut9.LIZ(i21 - 1, 0, i17, 1);
                                c78607Ut9.LIZ(c78607Ut9.LIZIZ - 1, c78607Ut9.LIZJ - 1, i17, 2);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 3, i17, 3);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 2, i17, 4);
                                c78607Ut9.LIZ(0, c78607Ut9.LIZJ - 1, i17, 5);
                                c78607Ut9.LIZ(1, c78607Ut9.LIZJ - 3, i17, 6);
                                c78607Ut9.LIZ(1, c78607Ut9.LIZJ - 2, i17, 7);
                                c78607Ut9.LIZ(1, c78607Ut9.LIZJ - 1, i17, 8);
                                i17++;
                            }
                            do {
                                if (i15 < c78607Ut9.LIZIZ && i16 >= 0 && c78607Ut9.LIZLLL[(c78607Ut9.LIZJ * i15) + i16] < 0) {
                                    c78607Ut9.LIZIZ(i15, i16, i17);
                                    i17++;
                                }
                                i15 -= 2;
                                i16 += 2;
                                if (i15 < 0) {
                                    break;
                                }
                            } while (i16 < c78607Ut9.LIZJ);
                            int i22 = i15 + 1;
                            int i23 = i16 + 3;
                            do {
                                if (i22 >= 0) {
                                    int i24 = c78607Ut9.LIZJ;
                                    if (i23 < i24 && c78607Ut9.LIZLLL[(i24 * i22) + i23] < 0) {
                                        c78607Ut9.LIZIZ(i22, i23, i17);
                                        i17++;
                                    }
                                }
                                i22 += 2;
                                i23 -= 2;
                                i3 = c78607Ut9.LIZIZ;
                                if (i22 >= i3) {
                                    break;
                                }
                            } while (i23 >= 0);
                            i15 = i22 + 3;
                            i16 = i23 + 1;
                            if (i15 >= i3 && i16 >= (i4 = c78607Ut9.LIZJ)) {
                                break;
                            }
                        }
                        byte[] bArr = c78607Ut9.LIZLLL;
                        if (bArr[((i3 - 1) * i4) + (i4 - 1)] < 0) {
                            byte b = (byte) 1;
                            bArr[((i3 - 1) * i4) + (i4 - 1)] = b;
                            bArr[((i3 - 2) * i4) + (i4 - 2)] = b;
                        }
                        int LIZIZ = LJFF.LIZIZ() * LJFF.LIZLLL;
                        int LJ = LJFF.LJ() * LJFF.LJ;
                        C78753UvV c78753UvV = new C78753UvV(LJFF.LIZLLL(), (LJFF.LJ() * LJFF.LJ) + (LJFF.LJ() << 1));
                        int i25 = 0;
                        for (int i26 = 0; i26 < LJ; i26++) {
                            if (i26 % LJFF.LJ == 0) {
                                int i27 = 0;
                                for (int i28 = 0; i28 < LJFF.LIZLLL(); i28++) {
                                    if (i28 % 2 == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c78753UvV.LIZJ(i27, i25, z3);
                                    i27++;
                                }
                                i25++;
                            }
                            int i29 = 0;
                            for (int i30 = 0; i30 < LIZIZ; i30++) {
                                if (i30 % LJFF.LIZLLL == 0) {
                                    c78753UvV.LIZJ(i29, i25, true);
                                    i29++;
                                }
                                if (c78607Ut9.LIZLLL[(c78607Ut9.LIZJ * i26) + i30] == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c78753UvV.LIZJ(i29, i25, z);
                                i29++;
                                int i31 = LJFF.LIZLLL;
                                if (i30 % i31 == i31 - 1) {
                                    if (i26 % 2 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c78753UvV.LIZJ(i29, i25, z2);
                                    i29++;
                                }
                            }
                            i25++;
                            int i32 = LJFF.LJ;
                            if (i26 % i32 == i32 - 1) {
                                int i33 = 0;
                                for (int i34 = 0; i34 < LJFF.LIZLLL(); i34++) {
                                    c78753UvV.LIZJ(i33, i25, true);
                                    i33++;
                                }
                                i25++;
                            }
                        }
                        int i35 = c78753UvV.LIZIZ;
                        int i36 = c78753UvV.LIZJ;
                        int max = Math.max(i, i35);
                        int max2 = Math.max(i2, i36);
                        int min = Math.min(max / i35, max2 / i36);
                        int i37 = (max - (i35 * min)) / 2;
                        int i38 = (max2 - (i36 * min)) / 2;
                        if (i2 < i36 || i < i35) {
                            c79007Uzb = new C79007Uzb(i35, i36);
                            i37 = 0;
                            i38 = 0;
                        } else {
                            c79007Uzb = new C79007Uzb(i, i2);
                        }
                        int length3 = c79007Uzb.LJLJJI.length;
                        for (int i39 = 0; i39 < length3; i39++) {
                            c79007Uzb.LJLJJI[i39] = 0;
                        }
                        int i40 = 0;
                        while (i40 < i36) {
                            int i41 = i37;
                            int i42 = 0;
                            while (i42 < i35) {
                                if (c78753UvV.LIZ(i42, i40) == 1) {
                                    c79007Uzb.LIZJ(i41, i38, min, min);
                                }
                                i42++;
                                i41 += min;
                            }
                            i40++;
                            i38 += min;
                        }
                        return c79007Uzb;
                    }
                    throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
                }
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(v0b)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
