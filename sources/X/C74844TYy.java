package X;

import com.bytedance.android.live.liveinteract.api.LinkAnchorPermitGuestSuccessEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TYy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74844TYy implements InterfaceC75414Tik<PermitResult> {
    public final /* synthetic */ C74843TYx LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(PermitResult value) {
        int i;
        Object obj;
        AbstractC74727TUl LIZ;
        o.LJIIIZ(value, "value");
        this.LJLIL.LJLJJI.pv0(LinkAnchorPermitGuestSuccessEvent.class);
        int i2 = this.LJLILLLLZI;
        if (i2 == 2) {
            C74987Tbr.LIZ("VoiceChatAnchorPresenter", "reject apply from guest succ");
            C74843TYx c74843TYx = this.LJLIL;
            long j = this.LJLJI;
            c74843TYx.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRejectApplySuccess userId:");
            LIZ2.append(j);
            C0NB.LIZIZ("VoiceChatAnchorPresenter", X1D.LIZIZ(LIZ2));
            TZK tzk = c74843TYx.LJLJL;
            if (tzk != null) {
                tzk.LJI(j);
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        C74987Tbr.LIZ("VoiceChatAnchorPresenter", "permit apply from guest succ");
        C74843TYx c74843TYx2 = this.LJLIL;
        long j2 = this.LJLJI;
        String str = this.LJLJJI;
        c74843TYx2.getClass();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onPermitApplySuccess userId:");
        LIZ3.append(j2);
        LIZ3.append(", interactId:");
        LIZ3.append(str);
        C0NB.LIZIZ("VoiceChatAnchorPresenter", X1D.LIZIZ(LIZ3));
        if (RandomLinkMicManager.LJIIIIZZ()) {
            RandomLinkMicManager.LJIILIIL();
        }
        C74987Tbr.LIZ("VoiceChatAnchorPresenter", "permit apply from guest succ");
        TS8.LIZ.LJ(j2, str);
        InterfaceC31805Ce1 interfaceC31805Ce1 = c74843TYx2.LJLILLLLZI;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LJIIIZ(j2, "guest_apply_anchor");
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = c74843TYx2.getMultiGuestDataHolder().LJIIJ;
        int i3 = -1;
        if (multiLiveAnchorPanelSettings != null) {
            i = multiLiveAnchorPanelSettings.layoutType;
        } else {
            i = -1;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = c74843TYx2.getMultiGuestDataHolder().LJIIJ;
        if (multiLiveAnchorPanelSettings2 != null) {
            i3 = multiLiveAnchorPanelSettings2.fixMicNumAction;
        }
        EnumC74778TWk LIZJ = CL8.LIZJ(i, i3);
        TZK tzk2 = c74843TYx2.LJLJL;
        if (tzk2 != null) {
            tzk2.LJJIII(j2, false);
        }
        String valueOf = String.valueOf(j2);
        DataChannel dataChannel = c74843TYx2.dataChannel;
        LinkPlayerInfo linkPlayerInfo = null;
        if (dataChannel != null) {
            obj = dataChannel.kv0(C74966TbW.class);
        } else {
            obj = null;
        }
        boolean LJ = o.LJ(valueOf, obj);
        List LIZIZ = C74896TaO.LIZIZ(j2);
        InterfaceC31805Ce1 interfaceC31805Ce12 = c74843TYx2.LJLILLLLZI;
        if (interfaceC31805Ce12 != null && (LIZ = interfaceC31805Ce12.LIZ()) != null) {
            linkPlayerInfo = C76917UGr.LJJIJL(LIZ, j2);
        }
        String LJJJLL = C78886Uxe.LJJJLL(C8E.LJ());
        String LJJJJZ = C74843TYx.LJJJJZ(linkPlayerInfo);
        Gson gson = C09650Zl.LIZJ;
        C75017TcL.LJI(j2, LIZJ, LJ, str, LJJJLL, LJJJJZ, GsonProtectorUtils.toJson(gson, C74896TaO.LIZJ(j2)), GsonProtectorUtils.toJson(gson, LIZIZ), LIZIZ.size(), C74947TbD.LJIIJ(linkPlayerInfo), -1L, -1, -1, null);
        if (LJ) {
            C74830TYk.LIZLLL.add(Long.valueOf(j2));
        }
        C30868C9o.LIZJ(R.string.n9c);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        int i = this.LJLILLLLZI;
        if (i == 2) {
            this.LJLIL.getClass();
            C0NB.LIZIZ("VoiceChatAnchorPresenter", "onRejectApplyFail");
            return;
        }
        if (i != 1) {
            return;
        }
        C74843TYx c74843TYx = this.LJLIL;
        long j = this.LJLJI;
        String str = this.LJLJJI;
        c74843TYx.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPermitApplyFail userId:");
        LIZ.append(j);
        LIZ.append(", interactId:");
        LIZ.append(str);
        LIZ.append(", error:");
        LIZ.append(error.getErrorMsg());
        C0NB.LIZIZ("VoiceChatAnchorPresenter", X1D.LIZIZ(LIZ));
        Throwable th2 = new Throwable(error.getErrorMsg());
        c74843TYx.logThrowable(th2);
        c74843TYx.LJLJJLL.remove(str);
        TZK tzk = c74843TYx.LJLJL;
        if (tzk == null) {
            return;
        }
        tzk.LJIIZILJ(j, th2);
    }

    public C74844TYy(C74843TYx c74843TYx, int i, long j, String str) {
        this.LJLIL = c74843TYx;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = str;
    }
}
