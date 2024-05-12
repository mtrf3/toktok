package com.ss.android.ugc.aweme.search.ecommerce.lynx.core.ui;

import X.C48929JIf;
import X.C48932JIi;
import X.EWS;
import X.InterfaceC86353Xun;
import X.JS1;
import X.QD3;
import X.VNU;
import X.VPD;
import X.X1D;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes9.dex */
public final class LynxEcomSearchLive extends LynxSearchLive {
    public static final /* synthetic */ int LJLJI = 0;
    public volatile int LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    @VPD(name = "soundControl")
    public void setSoundControl(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        EventBus.LIZJ().LJIJ(this);
        C48929JIf c48929JIf = (C48929JIf) this.mView;
        if (c48929JIf != null) {
            c48929JIf.LJIILLIIL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxEcomSearchLive(VNU context) {
        super(context);
        o.LJIIIZ(context, "context");
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    public final C48929JIf LJIJJLI(Context context) {
        o.LJIIIZ(context, "context");
        C48929JIf c48929JIf = new C48929JIf(context);
        c48929JIf.setEventChangeListener(new AqS190S0100000_8(this, 54));
        c48929JIf.setFirstFrameHandler(new AqS158S0100000_8(this, 486));
        return c48929JIf;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    @EWS
    public void getPlayerTag(Callback callback) {
        String str;
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        InterfaceC86353Xun interfaceC86353Xun = ((C48929JIf) this.mView).getDataProvider().LJIIIIZZ;
        if (interfaceC86353Xun == null || (str = interfaceC86353Xun.getPlayerTag()) == null) {
            str = "";
        }
        javaOnlyMap.putString("player_tag", str);
        callback.invoke(0, javaOnlyMap);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onWindowVisibilityChanged(C48932JIi event) {
        String str;
        String roomId;
        o.LJIIIZ(event, "event");
        C48929JIf c48929JIf = (C48929JIf) this.mView;
        if (c48929JIf != null) {
            str = c48929JIf.getRoomId();
        } else {
            str = null;
        }
        if (o.LJ(str, event.LJLIL)) {
            C48929JIf c48929JIf2 = (C48929JIf) this.mView;
            if (c48929JIf2 != null && (roomId = c48929JIf2.getRoomId()) != null) {
                CastLongProtector.parseLong(roomId);
            }
            if (event.LJLJI && event.LJLILLLLZI == 0) {
                C48929JIf c48929JIf3 = (C48929JIf) this.mView;
                if (c48929JIf3 != null) {
                    c48929JIf3.play();
                    return;
                }
                return;
            }
            C48929JIf c48929JIf4 = (C48929JIf) this.mView;
            if (c48929JIf4 == null) {
                return;
            }
            c48929JIf4.LJIILLIIL();
        }
    }

    @VPD(name = "aweme")
    public final void setAweme(String str) {
        if (str != null) {
            Aweme _aweme = (Aweme) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, new JS1().getType());
            ((C48929JIf) this.mView).setIsECommerce(true);
            C48929JIf c48929JIf = (C48929JIf) this.mView;
            o.LJIIIIZZ(_aweme, "_aweme");
            c48929JIf.LJIIJ(_aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive
    @VPD(name = "muted")
    public void setMuted(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LJLILLLLZI = i;
    }

    @VPD(name = "sessionid")
    public final void setSessionId(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sessionid -> ");
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ C48929JIf createView(Context context, Object obj) {
        return LJIJJLI(context);
    }
}
