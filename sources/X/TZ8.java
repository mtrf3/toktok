package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class TZ8 extends AbstractC75411Tih<TZC> implements InterfaceC74852TZg {
    public final Room LJLIL;
    public InterfaceC31805Ce1 LJLILLLLZI;

    public void LJJJI(int i, String str, long j, String str2, String str3, boolean z) {
    }

    public void LJJJJ(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
    }

    public void LJJJJJL(long j, String str, String str2) {
    }

    public void LJJJJL(TZJ source, C78862UxG c78862UxG) {
        o.LJIIIZ(source, "source");
    }

    public void gg0() {
    }

    public InterfaceC31805Ce1 LJJJJJ() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJJJI(java.lang.String r1) {
        /*
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1372966201: goto L2d;
                case -520746559: goto L22;
                case -325227317: goto L19;
                case 1917515391: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            java.lang.String r0 = "kickout_with_timeout"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L17
            goto Lc
        L17:
            r0 = 1
            goto Ld
        L19:
            java.lang.String r0 = "kickout_with_popup_confirm"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L36
            goto Lc
        L22:
            java.lang.String r0 = "kickout_with_rtc_user_leaved"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            goto Lc
        L2b:
            r0 = 3
            goto Ld
        L2d:
            java.lang.String r0 = "kickout_with_profile"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L36
            goto Lc
        L36:
            r0 = 2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TZ8.LJJJJI(java.lang.String):int");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TZ8(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = room;
    }

    public C75100Tdg LJJJJIZL(DataChannel dataChannel, InterfaceC75119Tdz interfaceC75119Tdz, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i, InterfaceC88472Yns<? super Long, Long> interfaceC88472Yns, InterfaceC88472Yns<? super Long, Integer> interfaceC88472Yns2, String str, C75066Td8 c75066Td8) {
        return new C75100Tdg(dataChannel, interfaceC75119Tdz, multiGuestDataHolder, linkControlDataHolder, i, interfaceC88472Yns, interfaceC88472Yns2, str, c75066Td8);
    }
}
