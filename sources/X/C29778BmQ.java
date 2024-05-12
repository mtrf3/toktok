package X;

import Y.AfS0S0101100_5;
import Y.AfS36S0101000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.like.LikeApi;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.BmQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29778BmQ implements InterfaceC29499Bhv {
    public static final int LJIILJJIL = C15380j0.LIZ(85.0f);
    public final DataChannel LIZ;
    public final Context LIZIZ;
    public final Room LIZJ;
    public final ViewGroup LIZLLL;
    public boolean LJ;
    public long LJFF;
    public final C5H3 LJI;
    public final C5H3 LJII;
    public final C5H3 LJIIIIZZ;
    public Bitmap LJIIIZ;
    public final long LJIIJ;
    public final int LJIIJJI;
    public final C73318Sq2 LJIIL;
    public C73411SrX LJIILIIL;

    public final void LIZ(int i, long j) {
        LikeHelper likeHelper;
        InterfaceC29980Bpg interfaceC29980Bpg = (InterfaceC29980Bpg) this.LJI.getValue();
        if ((interfaceC29980Bpg instanceof LikeHelper) && (likeHelper = (LikeHelper) interfaceC29980Bpg) != null) {
            ((InterfaceC29856Bng) ((LikeApi) Q7L.LIZIZ(LikeApi.class)).like(likeHelper.LJLJI.getId(), i, (String) DataChannelGlobal.LJLJJI.mv0(C29038BaU.class), Long.valueOf(j)).LJII(BTJ.LIZJ(LikeApi.class)).LIZJ(C73933Szx.LJ(likeHelper.LJLIL))).LIZJ(new AfS0S0101100_5(i, likeHelper, SystemClock.uptimeMillis(), 2), new AfS36S0101000_5(i, likeHelper, 67));
            likeHelper.LJJIJIIJI();
            likeHelper.LJJIJ(i, j, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (r3 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C29778BmQ(com.bytedance.ies.sdk.datachannel.DataChannel r7, android.content.Context r8, com.bytedance.android.livesdkapi.depend.model.live.Room r9, android.view.ViewGroup r10) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "room"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "tapLottieContainer"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r6.<init>()
            r6.LIZ = r7
            r6.LIZIZ = r8
            r6.LIZJ = r9
            r6.LIZLLL = r10
            kotlin.jvm.internal.AqS155S0100000_5 r1 = new kotlin.jvm.internal.AqS155S0100000_5
            r0 = 408(0x198, float:5.72E-43)
            r1.<init>(r6, r0)
            X.5H3 r0 = X.C78996UzQ.LJJIJIIJI(r1)
            r6.LJI = r0
            kotlin.jvm.internal.AqS155S0100000_5 r1 = new kotlin.jvm.internal.AqS155S0100000_5
            r0 = 407(0x197, float:5.7E-43)
            r1.<init>(r6, r0)
            X.5H3 r0 = X.C78996UzQ.LJJIJIIJI(r1)
            r6.LJII = r0
            kotlin.jvm.internal.AqS155S0100000_5 r1 = new kotlin.jvm.internal.AqS155S0100000_5
            r0 = 406(0x196, float:5.69E-43)
            r1.<init>(r6, r0)
            X.5H3 r0 = X.C78996UzQ.LJJIJIIJI(r1)
            r6.LJIIIIZZ = r0
            X.Sq2 r0 = new X.Sq2
            r0.<init>()
            r6.LJIIL = r0
            com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting r0 = com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting.INSTANCE
            com.bytedance.android.livesdk.chatroom.model.LikeConfig r5 = r0.getValue()
            if (r5 == 0) goto L58
            long r3 = r5.tapInterval
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L5a
        L58:
            r3 = 500(0x1f4, double:2.47E-321)
        L5a:
            r6.LJIIJ = r3
            com.bytedance.android.livesdk.model.LikeInfo r0 = r9.likeInfo
            if (r0 == 0) goto L7d
            java.lang.Integer r1 = r0.clickCnt
            java.lang.String r0 = "room.likeInfo.clickCnt"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L7d
            com.bytedance.android.livesdk.model.LikeInfo r0 = r9.likeInfo
            java.lang.Integer r1 = r0.clickCnt
            java.lang.String r0 = "{\n            room.likeInfo.clickCnt\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.intValue()
        L7a:
            r6.LJIIJJI = r0
            return
        L7d:
            if (r5 == 0) goto L84
            int r0 = r5.showProgressTapCount
            if (r0 <= 0) goto L84
            goto L7a
        L84:
            r0 = 15
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29778BmQ.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room, android.view.ViewGroup):void");
    }
}
