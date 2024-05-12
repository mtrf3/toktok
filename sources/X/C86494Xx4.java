package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xx4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86494Xx4 {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC86511XxL LIZ(EnumC86510XxK enumC86510XxK) {
        o.LJIIIZ(enumC86510XxK, "<this>");
        switch (C86517XxR.LIZ[enumC86510XxK.ordinal()]) {
            case 1:
                return EnumC86511XxL.DROP_BY_PERMISSION;
            case 2:
                return EnumC86511XxL.DROP_BY_EXPIRATION;
            case 3:
                return EnumC86511XxL.DROP_BY_DUPLICATION;
            case 4:
                return EnumC86511XxL.DROP_BY_FREQUENCY;
            case 5:
                return EnumC86511XxL.DROP_BY_NOTICE_READ;
            case 6:
                return EnumC86511XxL.DROP_BY_BUSINESS;
            default:
                return null;
        }
    }

    public static EnumC86510XxK LIZIZ(InnerPushMessage innerPushMessage) {
        if (LJI(innerPushMessage)) {
            return EnumC86510XxK.BY_PERMISSION;
        }
        if (LIZLLL(innerPushMessage)) {
            return EnumC86510XxK.BY_DUPLICATION;
        }
        if (LJFF(innerPushMessage)) {
            return EnumC86510XxK.BY_FREQUENCY;
        }
        if (innerPushMessage.getUiTemplate() == null) {
            return EnumC86510XxK.BY_UITEMPLATENULL;
        }
        if (LJII(innerPushMessage) != EnumC86515XxP.NONE) {
            return EnumC86510XxK.BY_AVOIDANCE;
        }
        if (LJ(innerPushMessage)) {
            return EnumC86510XxK.BY_EXPIRATION;
        }
        InterfaceC86486Xww LIZ2 = C58242MtS.LIZ(innerPushMessage.getType());
        if (LIZ2 != null && !LIZ2.LJFF(innerPushMessage)) {
            return EnumC86510XxK.BY_BUSINESS;
        }
        return EnumC86510XxK.PASS;
    }

    public static EnumC86510XxK LIZJ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        if (!C86512XxM.LIZ(message)) {
            return EnumC86510XxK.BY_INVALID;
        }
        int commandType = message.getCommandType();
        if (commandType <= 0) {
            InterfaceC86486Xww LIZ2 = C58242MtS.LIZ(message.getType());
            if (LIZ2 != null && !LIZ2.LJIIIIZZ(message)) {
                return EnumC86510XxK.BY_BUSINESS;
            }
            if (LJI(message)) {
                return EnumC86510XxK.BY_PERMISSION;
            }
            if (LIZLLL(message)) {
                return EnumC86510XxK.BY_DUPLICATION;
            }
            if (LJFF(message)) {
                return EnumC86510XxK.BY_FREQUENCY;
            }
            if (message.getUiTemplate() == null) {
                return EnumC86510XxK.BY_UITEMPLATENULL;
            }
            if (LJ(message)) {
                return EnumC86510XxK.BY_EXPIRATION;
            }
            return EnumC86510XxK.PASS;
        }
        if (commandType == 1 && message.getTracker().LIZ == EnumC86508XxI.FROM_FRONTIER) {
            C86499Xx9.LIZ(EnumC86518XxS.FRONTIER);
        }
        return EnumC86510XxK.BY_COMMAND;
    }

    public static boolean LIZLLL(InnerPushMessage message) {
        List arrayList;
        List arrayList2;
        String string = C86497Xx7.LJ().getString("record_for_displayed_id_list", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = C75792yF.LIZLLL(Object[].class, string);
        } else {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next(), String.valueOf(message.getId()))) {
                    return true;
                }
            }
        }
        o.LJIIIZ(message, "message");
        String string2 = C86497Xx7.LJ().getString("record_for_external_displayed_id_list", "");
        if (!TextUtils.isEmpty(string2)) {
            arrayList2 = C75792yF.LIZLLL(Object[].class, string2);
        } else {
            arrayList2 = new ArrayList();
        }
        if (!arrayList2.contains(String.valueOf(message.getId()))) {
            return false;
        }
        return true;
    }

    public static boolean LJ(InnerPushMessage innerPushMessage) {
        InnerPushConfig config = innerPushMessage.getConfig();
        if (config != null) {
            long ttlSeconds = config.getTtlSeconds() * 1000;
            if (ttlSeconds > 0 && System.currentTimeMillis() > innerPushMessage.getCreateTime() + ttlSeconds) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(InnerPushMessage innerPushMessage) {
        List<InnerPushPopupLimitStrategy> list;
        InnerPushFreqControlStrategy freqControlStrategy;
        InnerPushFreqControlStrategy freqControlStrategy2;
        InnerPushConfig config = innerPushMessage.getConfig();
        InnerPushBanStrategy innerPushBanStrategy = null;
        if (config != null && (freqControlStrategy2 = config.getFreqControlStrategy()) != null) {
            list = freqControlStrategy2.getPopupLimitStrategies();
        } else {
            list = null;
        }
        InnerPushConfig config2 = innerPushMessage.getConfig();
        if (config2 != null && (freqControlStrategy = config2.getFreqControlStrategy()) != null) {
            innerPushBanStrategy = freqControlStrategy.getBanStrategy();
        }
        if (list != null) {
            Iterator<InnerPushPopupLimitStrategy> it = list.iterator();
            while (it.hasNext()) {
                if (LJIIJ(it.next())) {
                    break;
                }
            }
        }
        if (!LJIIIZ(innerPushBanStrategy)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r0.getInAppOtherPush() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r0.getInAppFollowPush() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r0.getInAppMentionPush() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        if (r0.getInAppCommentPush() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        if (r0.getInAppDiggPush() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        if (X.AnonymousClass304.LIZ() != 7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
    
        if (r0.intValue() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (X.C85940Xo8.LIZIZ.LIZ.LIZIZ(r1) != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f7, code lost:
    
        if (r0.intValue() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ff, code lost:
    
        if (r3.liveInnerPush == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010d, code lost:
    
        if (r0.getInAppImPush() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r5) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86494Xx4.LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EnumC86515XxP LJII(InnerPushMessage innerPushMessage) {
        Activity topActivity;
        String localClassName;
        Fragment LJIILIIL;
        String LJLLILLLL;
        int hashCode;
        int hashCode2;
        ComponentCallbacks2 LJIIIIZZ;
        Aweme LIZIZ;
        Activity LJIIIIZZ2;
        ViewGroup LJ;
        Activity LJIIIIZZ3;
        Activity topActivity2;
        Activity LJIIIIZZ4;
        InterfaceC118544l0 interfaceC118544l0;
        Activity LJIIIIZZ5 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ5 != null && C78886Uxe.LJJIJLIJ(LJIIIIZZ5)) {
            return EnumC86515XxP.AVOID_BY_LANDSCAPE_ORIENTATION;
        }
        InnerPushConfig config = innerPushMessage.getConfig();
        List<Integer> list = null;
        if (config != null) {
            list = config.getAvoidScenarios();
        }
        if (list == null || list.isEmpty()) {
            InterfaceC86486Xww LIZ2 = C58242MtS.LIZ(innerPushMessage.getType());
            if (LIZ2 != null && LIZ2.LIZLLL(innerPushMessage)) {
                return EnumC86515XxP.AVOID_BY_EXTERNAL_HANDLER;
            }
            return EnumC86515XxP.NONE;
        }
        if (list.contains(1) && (LJIIIIZZ4 = C84763XOl.LJIIIIZZ()) != 0 && (TextUtils.equals(LJIIIIZZ4.getLocalClassName(), "com.ss.android.ugc.aweme.live.LivePlayActivity") || (((LJIIIIZZ4 instanceof InterfaceC118544l0) && (interfaceC118544l0 = (InterfaceC118544l0) LJIIIIZZ4) != null && interfaceC118544l0.LJJIJL()) || TextUtils.equals(LJIIIIZZ4.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBroadcastActivity")))) {
            return EnumC86515XxP.AVOID_BY_LIVE;
        }
        if (!list.contains(2) || (topActivity2 = ActivityStack.getTopActivity()) == null || (!AVExternalServiceImpl.LIZ().configService().shortVideoConfig().isRecording() && !TextUtils.equals(topActivity2.getLocalClassName(), "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity") && !o.LJ("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", topActivity2.getLocalClassName()) && !TextUtils.equals(topActivity2.getLocalClassName(), "com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity"))) {
            if (list.contains(3) && (LJIIIIZZ3 = C84763XOl.LJIIIIZZ()) != null && TextUtils.equals(LJIIIIZZ3.getLocalClassName(), "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity")) {
                return EnumC86515XxP.AVOID_BY_ALBUM;
            }
            if (list.contains(4) && (LJIIIIZZ2 = C84763XOl.LJIIIIZZ()) != null && (LJ = C57419MgB.LJ(LJIIIIZZ2)) != null) {
                Rect rect = new Rect();
                C62822Ol8 c62822Ol8 = C52337KgP.LIZ;
                if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
                    if (Build.VERSION.SDK_INT > 30) {
                        LJ.getWindowVisibleDisplayFrame(rect);
                    } else if (!((Boolean) c62822Ol8.getValue()).booleanValue()) {
                        LJ.getWindowVisibleDisplayFrame(rect);
                    } else {
                        try {
                            C61034NxO.LIZIZ(rect, LJ);
                        } catch (Throwable unused) {
                            LJ.getWindowVisibleDisplayFrame(rect);
                        }
                    }
                } else {
                    LJ.getWindowVisibleDisplayFrame(rect);
                }
                if (rect.bottom < LJ.getHeight() * 0.75d) {
                    return EnumC86515XxP.AVOID_BY_KEYBOARD;
                }
            }
            if (list.contains(5) && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null && (LJIIIIZZ instanceof InterfaceC55058LjC) && (((InterfaceC55058LjC) LJIIIIZZ).getCurFragment() instanceof InterfaceC54054LJi) && (LIZIZ = LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ)) != null && LIZIZ.isAd()) {
                return EnumC86515XxP.AVOID_BY_COMMERCEAD;
            }
            if (list.contains(6) && (PopupManager.LJFF() || (C53765L8f.LJIILIIL("NOTIFICATION") && LRP.LIZIZ.isShowing()))) {
                return EnumC86515XxP.AVOID_BY_POPUP_WINDOW;
            }
            if (!list.contains(7) || (topActivity = ActivityStack.getTopActivity()) == null || (((localClassName = topActivity.getLocalClassName()) == null || ((hashCode2 = localClassName.hashCode()) == -1098644057 ? !localClassName.equals("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity") : !(hashCode2 == -221984295 && localClassName.equals("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.BaseChatDetailActivity")))) && (topActivity == null || (LJIILIIL = C70657RoD.LJIILIIL(topActivity)) == null || (LJLLILLLL = C16880lQ.LJLLILLLL(LJIILIIL.getClass())) == null || ((hashCode = LJLLILLLL.hashCode()) == -1837006389 ? !LJLLILLLL.equals("com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment") : !(hashCode == -1429674178 ? LJLLILLLL.equals("com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2") : hashCode == 708499493 && LJLLILLLL.equals("com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgFragment")))))) {
                InterfaceC86486Xww LIZ3 = C58242MtS.LIZ(innerPushMessage.getType());
                if (LIZ3 != null && LIZ3.LIZLLL(innerPushMessage)) {
                    return EnumC86515XxP.AVOID_BY_EXTERNAL_HANDLER;
                }
                return EnumC86515XxP.NONE;
            }
            return EnumC86515XxP.AVOID_BY_IM_PAGE;
        }
        return EnumC86515XxP.AVOID_BY_SHOOTING;
    }

    public static boolean LJIIIZ(InnerPushBanStrategy innerPushBanStrategy) {
        List<Long> list;
        if (innerPushBanStrategy == null) {
            return false;
        }
        int banByCancelTimes = innerPushBanStrategy.getBanByCancelTimes();
        long currentTimeMillis = System.currentTimeMillis() - (innerPushBanStrategy.getBanSecondsByCancel() * 1000);
        InnerPushBanStrategy LIZIZ = C86497Xx7.LIZIZ(innerPushBanStrategy.getId());
        if (LIZIZ != null) {
            list = LIZIZ.getRecords();
        } else {
            list = null;
        }
        return LJIIIIZZ(banByCancelTimes, list, currentTimeMillis);
    }

    public static boolean LJIIJ(InnerPushPopupLimitStrategy innerPushPopupLimitStrategy) {
        List<Long> list;
        int maxPopupTimes = innerPushPopupLimitStrategy.getMaxPopupTimes();
        long currentTimeMillis = System.currentTimeMillis() - (innerPushPopupLimitStrategy.getPeriodInSeconds() * 1000);
        InnerPushPopupLimitStrategy LIZLLL = C86497Xx7.LIZLLL(innerPushPopupLimitStrategy.getId());
        if (LIZLLL != null) {
            list = LIZLLL.getRecords();
        } else {
            list = null;
        }
        return LJIIIIZZ(maxPopupTimes, list, currentTimeMillis);
    }

    public static boolean LJIIIIZZ(int i, List list, long j) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            i2 = list.indexOf(Long.valueOf(longValue));
            if (longValue >= j) {
                break;
            }
        }
        if (i > list.size() - i2) {
            return false;
        }
        return true;
    }
}
