package X;

import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ThB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75317ThB implements InterfaceC76112Tu0 {
    public final /* synthetic */ VoiceChatMaskAssem LJLIL;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
        C76696U8e LJJIII;
        List<InterfaceC75179Tex> allLayoutWindows;
        TZM tzm;
        VoiceChatMaskAssem voiceChatMaskAssem = this.LJLIL;
        voiceChatMaskAssem.getClass();
        InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
        if (LJJJIL != null && (LJJIII = ((U8H) LJJJIL).LJJIII()) != null && (allLayoutWindows = LJJIII.getAllLayoutWindows()) != null) {
            C75329ThN filter = C75329ThN.LJLIL;
            C75341ThZ valueMap = C75341ThZ.LJLIL;
            o.LJIIIZ(filter, "filter");
            o.LJIIIZ(valueMap, "valueMap");
            ArrayList arrayList = new ArrayList();
            for (InterfaceC75179Tex interfaceC75179Tex : allLayoutWindows) {
                if (((Boolean) filter.invoke(interfaceC75179Tex)).booleanValue()) {
                    arrayList.add(valueMap.invoke(interfaceC75179Tex));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, C75324ThI> entry : voiceChatMaskAssem.N3().entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    arrayList2.add(entry.getKey());
                    entry.getValue().LJIIIZ();
                    ((LinkedList) voiceChatMaskAssem.LJLZ.getValue()).add(entry.getValue());
                }
            }
            DataChannel dataChannel = voiceChatMaskAssem.LJLL;
            if (dataChannel != null) {
                tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class);
            } else {
                tzm = null;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (tzm != null) {
                    tzm.remove(str);
                }
                voiceChatMaskAssem.N3().remove(str);
                AbstractC75323ThH remove = voiceChatMaskAssem.M3().remove(str);
                if (remove != null) {
                    remove.LJIILIIL();
                }
            }
        }
    }

    public C75317ThB(VoiceChatMaskAssem voiceChatMaskAssem) {
        this.LJLIL = voiceChatMaskAssem;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
        VoiceChatMaskAssem voiceChatMaskAssem = this.LJLIL;
        Iterator it = windows.iterator();
        while (it.hasNext()) {
            voiceChatMaskAssem.O3((InterfaceC75179Tex) it.next());
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        C76696U8e LJJIII;
        Rect containerActualRange;
        o.LJIIIZ(layout, "layout");
        VoiceChatMaskAssem voiceChatMaskAssem = this.LJLIL;
        voiceChatMaskAssem.getClass();
        InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
        if (LJJJIL != null && (LJJIII = ((U8H) LJJJIL).LJJIII()) != null && (containerActualRange = LJJIII.getContainerActualRange()) != null) {
            C75345Thd c75345Thd = new C75345Thd(voiceChatMaskAssem.x3().getHeight() - containerActualRange.bottom);
            DataChannel dataChannel = voiceChatMaskAssem.LJLL;
            if (dataChannel != null) {
                dataChannel.rv0(VoiceChatLayoutChannel.class, c75345Thd);
            }
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        C75240Tfw.LIZ(window, oldState, newState, actionType);
        this.LJLIL.O3(window);
    }
}
