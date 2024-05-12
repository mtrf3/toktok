package com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired;

import X.C16880lQ;
import X.C2IZ;
import X.C2U8;
import X.C44435HcF;
import X.C91351ZtD;
import X.InterfaceC91296ZsK;
import X.ORZ;
import X.RunnableC91096Zp6;
import X.SU4;
import X.YBK;
import X.YBM;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig;
import com.ss.android.ugc.aweme.dsp.playerservice.entity.DspExpiredPlayableRecord;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class ExpiredPlayableManager {
    public static final ExpiredPlayableManager INSTANCE;
    public static final C91351ZtD appBackgroundListener;
    public static final MusicDspConfig config;
    public static CopyOnWriteArraySet<String> expiredPreviewClipIds;
    public static CopyOnWriteArraySet<String> expiredPreviewPlayableIds;
    public static DspExpiredPlayableRecord expiredRecord;
    public static Gson gson;
    public static InterfaceC91296ZsK previewClipSongUpsellPlayable;
    public static CopyOnWriteArraySet<InterfaceC91296ZsK> previewClipSongUpsellUnshowSet;
    public static final RunnableC91096Zp6 resetAction;
    public static final Handler resetHandler;
    public static String whitePlayableId;
    public static CopyOnWriteArraySet<InterfaceC91296ZsK> whitePreviewPlayableSet;

    public final void clearPreviewUpsellInfo() {
        previewClipSongUpsellPlayable = null;
        previewClipSongUpsellUnshowSet.clear();
    }

    static {
        ExpiredPlayableManager expiredPlayableManager = new ExpiredPlayableManager();
        INSTANCE = expiredPlayableManager;
        expiredRecord = new DspExpiredPlayableRecord();
        expiredPreviewClipIds = new CopyOnWriteArraySet<>();
        expiredPreviewPlayableIds = new CopyOnWriteArraySet<>();
        previewClipSongUpsellUnshowSet = new CopyOnWriteArraySet<>();
        whitePlayableId = "";
        whitePreviewPlayableSet = new CopyOnWriteArraySet<>();
        gson = new Gson();
        config = YBK.LIZ();
        resetHandler = new Handler(C16880lQ.LLJJJJ());
        resetAction = new RunnableC91096Zp6();
        C91351ZtD c91351ZtD = new C91351ZtD();
        appBackgroundListener = c91351ZtD;
        expiredPlayableManager.readExpiredPlayable();
        expiredPlayableManager.configResetActionTrigger();
        ActivityStack.addAppBackGroundListener(c91351ZtD);
    }

    private final void readExpiredPlayable() {
        DspExpiredPlayableRecord dspExpiredPlayableRecord;
        try {
            dspExpiredPlayableRecord = (DspExpiredPlayableRecord) gson.LJI(Keva.getRepo("music_dsp_expired_repo").getString(getKey(), ""), DspExpiredPlayableRecord.class);
            if (dspExpiredPlayableRecord == null) {
                dspExpiredPlayableRecord = new DspExpiredPlayableRecord();
            }
        } catch (Exception unused) {
            dspExpiredPlayableRecord = new DspExpiredPlayableRecord();
        }
        if (!isToday(dspExpiredPlayableRecord.currentDate)) {
            dspExpiredPlayableRecord = new DspExpiredPlayableRecord();
        }
        expiredRecord = dspExpiredPlayableRecord;
        if (!dspExpiredPlayableRecord.expiredPreviewClipIds.isEmpty()) {
            DspExpiredPlayableRecord dspExpiredPlayableRecord2 = expiredRecord;
            expiredPreviewClipIds = dspExpiredPlayableRecord2.expiredPreviewClipIds;
            expiredPreviewPlayableIds = dspExpiredPlayableRecord2.expiredPlayable;
        }
    }

    public final void addShuffleToastCount() {
        expiredRecord.shuffleToastCount++;
        writeConfigToKeva();
    }

    public final void clearPlayRecordViaUpsellChanged() {
        expiredRecord = new DspExpiredPlayableRecord();
        clearPreviewUpsellInfo();
        writeConfigToKeva();
    }

    public final void clearPreviewPlayedInfo() {
        expiredPreviewClipIds.clear();
        expiredPreviewPlayableIds.clear();
    }

    public final void configResetActionTrigger() {
        Handler handler = resetHandler;
        RunnableC91096Zp6 runnableC91096Zp6 = resetAction;
        handler.removeCallbacks(runnableC91096Zp6);
        if (isToday(expiredRecord.currentDate)) {
            handler.postDelayed(runnableC91096Zp6, getTomorrowInterval());
        } else {
            runnableC91096Zp6.run();
        }
    }

    public final List<String> getExpiredFullClipIds() {
        return ORZ.LLJILJILJ(expiredRecord.expiredFullClipIds);
    }

    public final int getExpiredPlayableCount() {
        return expiredRecord.expiredPlayable.size();
    }

    public final List<String> getExpiredPreviewFullClipIds() {
        return ORZ.LLJILJILJ(expiredRecord.expiredPreviewClipIds);
    }

    public final int getMinDuration() {
        int minDuration = config.copyrightRestrictions.getMinDuration() * 1000;
        if (minDuration < 0) {
            return 30000;
        }
        return minDuration;
    }

    public final boolean isLandingPageShow() {
        if (previewClipSongUpsellPlayable != null) {
            return true;
        }
        return false;
    }

    public final boolean isLimitedNotificationPushed() {
        return expiredRecord.limitedNotificationPushed;
    }

    public final boolean isTodayPlayableLimited() {
        int size = expiredRecord.expiredPlayable.size();
        YBK.LIZ.getClass();
        if (size >= YBK.LIZIZ()) {
            return true;
        }
        return false;
    }

    public final void setLimitedNotificationPushed() {
        expiredRecord.limitedNotificationPushed = true;
        writeConfigToKeva();
    }

    public final boolean showShuffleToast() {
        if (expiredRecord.shuffleToastCount < 2) {
            return true;
        }
        return false;
    }

    public final void writeConfigToKeva() {
        Keva.getRepo("music_dsp_expired_repo").storeString(getKey(), GsonProtectorUtils.toJson(gson, expiredRecord, DspExpiredPlayableRecord.class));
    }

    private final String getKey() {
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) {
            com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        String LLLZ = C16880lQ.LLLZ("music_dsp_expired_playable_%s", Arrays.copyOf(new Object[]{com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        return LLLZ;
    }

    public final long getTomorrowInterval() {
        return (SU4.LIZJ().LIZ + SU4.LIZIZ()) - System.currentTimeMillis();
    }

    public final InterfaceC91296ZsK getPreviewClipSongUpsellPlayable() {
        return previewClipSongUpsellPlayable;
    }

    public final CopyOnWriteArraySet<InterfaceC91296ZsK> getPreviewClipSongUpsellUnshowSet() {
        return previewClipSongUpsellUnshowSet;
    }

    public final CopyOnWriteArraySet<InterfaceC91296ZsK> getWhitePreviewPlayableSet() {
        return whitePreviewPlayableSet;
    }

    public final boolean cancelLandingPage(InterfaceC91296ZsK interfaceC91296ZsK) {
        InterfaceC91296ZsK interfaceC91296ZsK2 = previewClipSongUpsellPlayable;
        if (interfaceC91296ZsK2 != null && !o.LJ(interfaceC91296ZsK2, interfaceC91296ZsK)) {
            return true;
        }
        return false;
    }

    public final boolean isLastExpiredPlayable(String id) {
        o.LJIIIZ(id, "id");
        return o.LJ(expiredRecord.lastExpiredPlayableId, id);
    }

    public final boolean isPlayableExpiredToday(String playableId) {
        o.LJIIIZ(playableId, "playableId");
        return expiredRecord.expiredPlayable.contains(playableId);
    }

    public final boolean isPlayableExpiredTodayByClipId(String fullClipId) {
        o.LJIIIZ(fullClipId, "fullClipId");
        return expiredRecord.expiredFullClipIds.contains(fullClipId);
    }

    public final boolean isPreviewPlayableExpiredToday(String playableId) {
        o.LJIIIZ(playableId, "playableId");
        return expiredPreviewPlayableIds.contains(playableId);
    }

    public final boolean isPreviewPlayableExpiredTodayByClipId(String fullClipId) {
        o.LJIIIZ(fullClipId, "fullClipId");
        return expiredRecord.expiredPreviewClipIds.contains(fullClipId);
    }

    public final boolean isToday(long j) {
        C44435HcF LIZJ = SU4.LIZJ();
        if (j >= LIZJ.LIZ && j <= LIZJ.LIZIZ) {
            return true;
        }
        return false;
    }

    public final boolean isWhitePlayable(String id) {
        o.LJIIIZ(id, "id");
        return o.LJ(whitePlayableId, id);
    }

    public final void playableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
        String str;
        if (interfaceC91296ZsK != null) {
            str = interfaceC91296ZsK.getId();
        } else {
            str = null;
        }
        if (!o.LJ(str, whitePlayableId)) {
            whitePlayableId = "";
        }
    }

    public final void setPreviewClipSongUpsellPlayable(InterfaceC91296ZsK interfaceC91296ZsK) {
        previewClipSongUpsellPlayable = interfaceC91296ZsK;
    }

    public final void setPreviewClipSongUpsellUnshowSet(CopyOnWriteArraySet<InterfaceC91296ZsK> copyOnWriteArraySet) {
        o.LJIIIZ(copyOnWriteArraySet, "<set-?>");
        previewClipSongUpsellUnshowSet = copyOnWriteArraySet;
    }

    public final void setWhitePreviewPlayableSet(CopyOnWriteArraySet<InterfaceC91296ZsK> copyOnWriteArraySet) {
        o.LJIIIZ(copyOnWriteArraySet, "<set-?>");
        whitePreviewPlayableSet = copyOnWriteArraySet;
    }

    public final void writeExpiredPlayable$music_dsp_release(String playableId, String str) {
        o.LJIIIZ(playableId, "playableId");
        if (!expiredRecord.expiredPlayable.add(playableId)) {
            return;
        }
        whitePlayableId = playableId;
        if (str != null) {
            expiredRecord.expiredFullClipIds.add(str);
        }
        DspExpiredPlayableRecord dspExpiredPlayableRecord = expiredRecord;
        dspExpiredPlayableRecord.getClass();
        dspExpiredPlayableRecord.lastExpiredPlayableId = playableId;
        writeConfigToKeva();
        C2U8.LIZ(new C2IZ(false));
    }

    public final void writeExpiredPreviewPlayable$music_dsp_release(String playableId, String str) {
        o.LJIIIZ(playableId, "playableId");
        if (expiredPreviewPlayableIds.contains(playableId)) {
            return;
        }
        expiredPreviewClipIds.add(str);
        expiredPreviewPlayableIds.add(playableId);
        YBM.LIZ.getClass();
        if (YBM.LIZ().getDspClipRecordStrategy() > 0) {
            int dspClipSongMax = YBM.LIZ().getDspClipSongMax();
            if (dspClipSongMax == 0) {
                YBK.LIZ.getClass();
                dspClipSongMax = YBK.LIZIZ();
            }
            if (expiredRecord.expiredPlayable.size() > dspClipSongMax) {
                expiredRecord.expiredPlayable.clear();
                expiredRecord.expiredPreviewClipIds.clear();
            }
            whitePlayableId = playableId;
            expiredRecord.expiredPlayable.add(playableId);
            if (str != null) {
                expiredRecord.expiredPreviewClipIds.add(str);
            }
            DspExpiredPlayableRecord dspExpiredPlayableRecord = expiredRecord;
            dspExpiredPlayableRecord.getClass();
            dspExpiredPlayableRecord.lastExpiredPlayableId = playableId;
            writeConfigToKeva();
            C2U8.LIZ(new C2IZ(false));
        }
    }
}
