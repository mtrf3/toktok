package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes12.dex */
public final class P4S {
    public static final P4R[] LIZ = {new P4R(128, 20250, LivePlayerResourceReleaseSetting.ENABLE), new P4R(256, 40500, 10000), new P4R(512, 108000, 14000), new P4R(1024, 216000, 20000), new P4R(2048, 245760, 20000), new P4R(4096, 245760, LiveExchangeConfirmThreshold.DEFAULT), new P4R(FileUtils.BUFFER_SIZE, 522240, LiveExchangeConfirmThreshold.DEFAULT), new P4R(16384, 589824, 135000), new P4R(32768, 983040, 240000), new P4R(65536, 2073600, 240000), new P4R(131072, 4177920, 240000), new P4R(262144, 8355840, 480000), new P4R(524288, 16711680, 800000)};
}
