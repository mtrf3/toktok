package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217638gR implements C8K4 {
    @Override // X.C8K4
    public final void LIZ(BaseFeedPageParams params, Assembler assembler, FeedVideoAssem feedVideoAssem) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(assembler, "assembler");
        new AqS169S0100000_3(feedVideoAssem, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT).invoke(assembler);
    }
}
