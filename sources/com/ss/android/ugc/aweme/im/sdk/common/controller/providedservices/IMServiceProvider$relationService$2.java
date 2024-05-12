package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C83083Nw;
import X.InterfaceC65784Pro;
import X.InterfaceC98123tA;
import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.FetchIMFollowListRequest;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.FetchMAFListRequest;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMServiceProvider$relationService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C83083Nw> {
    public static final IMServiceProvider$relationService$2 INSTANCE = new IMServiceProvider$relationService$2();

    public IMServiceProvider$relationService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Nw] */
    @Override // X.InterfaceC65784Pro
    public final C83083Nw invoke() {
        return new InterfaceC98123tA() { // from class: X.3Nw
            @Override // X.InterfaceC98123tA
            public final FetchIMFollowListRequest LJ() {
                return new FetchIMFollowListRequest();
            }

            @Override // X.InterfaceC98123tA
            public final void LIZ() {
                String str;
                C85323Wm onEventV3 = C772831o.LIZ();
                o.LJIIIZ(onEventV3, "onEventV3");
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("enter_from", "notification_page");
                int LIZ = C00F.LIZ(31744, 0, "im_group_chat_creation_inbox_page_optimization", false);
                if (LIZ != 0) {
                    if (LIZ != 1) {
                        if (LIZ != 2) {
                            if (LIZ == 3) {
                                str = "3";
                            }
                        } else {
                            str = "2";
                        }
                    } else {
                        str = "1";
                    }
                    arrayMap.put("icon_version", str);
                    onEventV3.LIZIZ("show_create_group", arrayMap);
                }
                str = CardStruct.IStatusCode.DEFAULT;
                arrayMap.put("icon_version", str);
                onEventV3.LIZIZ("show_create_group", arrayMap);
            }

            @Override // X.InterfaceC98123tA
            public final FetchMAFListRequest LIZJ() {
                if (C3UE.LIZ()) {
                    return new FetchMAFListRequest();
                }
                return null;
            }

            @Override // X.InterfaceC98123tA
            public final void LIZIZ(Context context, Bundle bundle) {
                if (!BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
                    J9P.LIZIZ(C45804HyK.LJIJJ(context), "chat_list", "button", null, null);
                } else {
                    C100433wt.LIZ(context, bundle);
                }
            }

            @Override // X.InterfaceC98123tA
            public final void LJFF(Context context, Bundle bundle) {
                C90643h6.LIZIZ = "notification_page";
                C90643h6.LIZJ(true);
                LIZIZ(context, bundle);
            }

            @Override // X.InterfaceC98123tA
            public final void LJI(Context context, Bundle bundle) {
                C90643h6.LIZIZ = "notification_page";
                C90643h6.LIZJ(true);
                bundle.putSerializable("init_config", new C91633ih(null, null, "inbox_top_bar", null, null, bundle.getBoolean("is_from_chat_list"), 27, null));
                C88663du.LIZ(context, bundle);
            }

            @Override // X.InterfaceC98123tA
            public final void LIZLLL(C57174McE c57174McE, C83093Nx c83093Nx, boolean z) {
                C3R9 c3r9 = new C3R9(c83093Nx.LIZ, c83093Nx.LIZIZ);
                c3r9.LJ = true;
                c3r9.LJFF = c83093Nx.LIZJ;
                c3r9.LJI = false;
                C3R0 c3r0 = new C3R0(c3r9, 15);
                AbstractC82553Lv.LJI(c3r0, new C80163Cq(c57174McE, z), new AqS167S0100000_1(c57174McE, 450));
                c3r0.LIZLLL();
            }

            @Override // X.InterfaceC98123tA
            public final void LJII(int i, InterfaceC80183Cs interfaceC80183Cs, C83093Nx c83093Nx) {
                C3R0 c3r0;
                if (c83093Nx == null) {
                    C3R9 c3r9 = new C3R9(1, false);
                    c3r9.LJ = false;
                    c3r9.LJFF = true;
                    c3r9.LJI = true;
                    c3r0 = new C3R0(c3r9, 15);
                } else {
                    C3R9 c3r92 = new C3R9(c83093Nx.LIZ, c83093Nx.LIZIZ);
                    c3r92.LJ = true;
                    c3r92.LJFF = c83093Nx.LIZJ;
                    c3r92.LJI = false;
                    c3r0 = new C3R0(c3r92, 15);
                }
                AbstractC82553Lv.LJI(c3r0, new C80173Cr(i, interfaceC80183Cs), new AqS167S0100000_1(interfaceC80183Cs, 451));
                c3r0.LIZLLL();
            }
        };
    }
}
