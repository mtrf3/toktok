package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Tkv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75549Tkv<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ java.util.Map<String, Object> LJLIL;
    public final /* synthetic */ C75550Tkw LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C75549Tkv(java.util.Map<String, Object> map, C75550Tkw c75550Tkw, int i) {
        this.LJLIL = map;
        this.LJLILLLLZI = c75550Tkw;
        this.LJLJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        LinkReplyResult linkReplyResult;
        C75513TkL c75513TkL = (C75513TkL) obj;
        Throwable th = (Throwable) obj2;
        if (c75513TkL != null) {
            this.LJLIL.put("response", c75513TkL);
            InterfaceC75555Tl1 interfaceC75555Tl1 = this.LJLILLLLZI.mLinkLogger;
            if (interfaceC75555Tl1 != null) {
                ((C75551Tkx) interfaceC75555Tl1).LIZJ(this.LJLIL);
            }
            LinkCrossRoomDataHolder LIZJ = this.LJLILLLLZI.LIZJ();
            EnumC75636TmK enumC75636TmK = EnumC75636TmK.CONNECTION_FINISH;
            if (LIZJ.LIZ(enumC75636TmK)) {
                return;
            }
            Object obj3 = c75513TkL.LIZ;
            if (obj3 instanceof C28467BFf) {
                if (obj3 != null) {
                    BaseResponse baseResponse = (BaseResponse) obj3;
                    if (baseResponse != null && (linkReplyResult = (LinkReplyResult) baseResponse.data) != null) {
                        int i = this.LJLJI;
                        C75550Tkw c75550Tkw = this.LJLILLLLZI;
                        if (i != 1) {
                            if (i == 2 || i == 5) {
                                c75550Tkw.LIZJ().getClass();
                                c75550Tkw.LIZLLL();
                            }
                        } else {
                            c75550Tkw.getClass();
                            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkReplyResult);
                            o.LJIIIIZZ(json, "get().toJson(replyResult)");
                            TYQ.LIZLLL("LinkCross_Reply_Success", json);
                            if (!c75550Tkw.LIZJ().LIZ(enumC75636TmK)) {
                                c75550Tkw.LIZJ().LJJIJIIJI = linkReplyResult.linkMicIdStr;
                                c75550Tkw.LIZJ().LJJIJIIJIL = linkReplyResult.rivalLinkmicIdStr;
                                c75550Tkw.LIZJ();
                                c75550Tkw.LIZJ().LJ = true;
                                if (!TextUtils.isEmpty(linkReplyResult.rtcExtInfo)) {
                                    c75550Tkw.LIZJ().LJIIJ(linkReplyResult.rtcExtInfo);
                                }
                                DataChannel dataChannel = c75550Tkw.LIZ;
                                if (dataChannel != null) {
                                    dataChannel.rv0(LinkCrossRoomStateChangeEvent.class, new C32208CkW(4));
                                }
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult?>");
                }
            }
        }
        if (th == null) {
            return;
        }
        InterfaceC75555Tl1 interfaceC75555Tl12 = this.LJLILLLLZI.mLinkLogger;
        if (interfaceC75555Tl12 != null) {
            ((C75551Tkx) interfaceC75555Tl12).LIZIZ(th, this.LJLIL);
        }
        this.LJLILLLLZI.LIZLLL();
    }
}
