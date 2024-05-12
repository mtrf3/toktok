package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTB extends C75446TjG {
    public final long LJLIL;
    public final int LJLILLLLZI;
    public final MultiGuestDataHolder LJLJI;
    public final TQ8 LJLJJI;
    public final DataChannel LJLJJL;
    public final InterfaceC65784Pro<Context> LJLJJLL;
    public volatile WeakReference<LiveDialog> LJLJL;

    public static void LIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "4528645766831536592")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x04b7, code lost:
    
        if (r20 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    @Override // X.C75446TjG, X.InterfaceC75447TjH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLLL(com.bytedance.android.livesdk.model.message.LinkMessage r20) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTB.LLJLLL(com.bytedance.android.livesdk.model.message.LinkMessage):void");
    }

    public final void LIZIZ(LinkListUser linkListUser, boolean z, String str, boolean z2) {
        String str2;
        long j;
        User user;
        C74824TYe c74824TYe = C74824TYe.LIZ;
        TQ8 tq8 = this.LJLJJI;
        String str3 = null;
        if (tq8 != null) {
            if (linkListUser != null && (user = linkListUser.user) != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            str3 = tq8.LIZIZ(j);
        }
        int LIZLLL = C74947TbD.LIZLLL(linkListUser, this.LJLJI);
        int LIZIZ = C74947TbD.LIZIZ(linkListUser, this.LJLJI);
        if (z) {
            str2 = "check";
        } else {
            str2 = "normal";
        }
        c74824TYe.LJIJJLI(LIZLLL, LIZIZ, str3, str, str2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTB(long j, int i, MultiGuestDataHolder multiGuestDataHolder, TQ8 tq8, DataChannel dataChannel, InterfaceC65784Pro<? extends Context> interfaceC65784Pro) {
        o.LJIIIZ(multiGuestDataHolder, "multiGuestDataHolder");
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = multiGuestDataHolder;
        this.LJLJJI = tq8;
        this.LJLJJL = dataChannel;
        this.LJLJJLL = interfaceC65784Pro;
    }
}
