package com.bytedance.android.livesdk.comp.impl.debug;

import X.C00F;
import X.C03880Dg;
import X.C0NB;
import X.C162476Zf;
import X.C30214BtS;
import X.C31200CMi;
import X.C38113ExZ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C76800UCe;
import X.CG4;
import X.CGC;
import X.CGD;
import X.CGE;
import X.CGF;
import X.CGG;
import X.CGH;
import X.CGQ;
import X.CN1;
import X.EnumC30213BtR;
import X.FT5;
import X.InterfaceC31194CMc;
import X.InterfaceC65784Pro;
import X.X1D;
import android.content.Context;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDebugToolsSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pitaya.api.IPitayaCore;
import com.google.android.play.core.appupdate.h;
import debugtool.DebugToolsHelper;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class DebugService implements IDebugService {
    public DebugToolsHelper LJLIL;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1245634017010183424"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void onDestroy() {
        this.LJLIL = null;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    static {
        new CGQ();
    }

    public static boolean LIZLLL() {
        String channel = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isTestChannel(). hostChannel=");
        LIZ.append(channel);
        LIZ.append(", buildConfigDebug=");
        LIZ.append(false);
        C0NB.LJIIIZ("DebugService", X1D.LIZIZ(LIZ));
        return o.LJ(channel, "local_test");
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void E3() {
        InterfaceC31194CMc interfaceC31194CMc;
        DebugToolsHelper debugToolsHelper = this.LJLIL;
        if (debugToolsHelper != null && (interfaceC31194CMc = debugToolsHelper.LJLJI) != null) {
            interfaceC31194CMc.E3();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final h ce0() {
        DebugToolsHelper debugToolsHelper = this.LJLIL;
        if (debugToolsHelper != null) {
            return debugToolsHelper.LJLJJL;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final boolean tL() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final InterfaceC65784Pro<C76800UCe> x3() {
        DebugToolsHelper debugToolsHelper = this.LJLIL;
        if (debugToolsHelper != null) {
            return debugToolsHelper.LIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void jg0(C38113ExZ jsBridge2) {
        o.LJIIIZ(jsBridge2, "jsBridge2");
        DebugToolsHelper debugToolsHelper = this.LJLIL;
        if (debugToolsHelper != null) {
            debugToolsHelper.LIZJ(jsBridge2);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void tl(C31200CMi c31200CMi) {
        DebugToolsHelper debugToolsHelper = this.LJLIL;
        if (debugToolsHelper != null) {
            debugToolsHelper.LIZLLL(c31200CMi);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void x50(DataChannel dataChannel) {
        CG4 fb;
        o.LJIIIZ(dataChannel, "dataChannel");
        if (!LIZLLL() || (fb = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).fb(dataChannel)) == null) {
            return;
        }
        fb.LJFF().LIZIZ(CGC.LJLIL);
        fb.LJI().LIZJ(new AqS171S0100000_5(fb, 372));
        fb.LIZ().LJ(CGD.LJLIL);
        fb.LIZ().LJI(MemberMessage.class, CGE.LJLIL);
        fb.LJII().LIZIZ(CGF.LJLIL);
        fb.LJ().LIZIZ(CGH.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getByteBenchScore: ");
        LIZ.append(fb.LIZIZ());
        C0NB.LJIIIZ("DebugService", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final Object D90(IPitayaCore realPitayaCore, Method method, Object[] objArr) {
        InterfaceC31194CMc interfaceC31194CMc;
        o.LJIIIZ(realPitayaCore, "realPitayaCore");
        if (method == null) {
            return null;
        }
        C0NB.LIZIZ("DebugService", "runPitayaCoreProxyInvoke: ");
        DebugToolsHelper debugToolsHelper = this.LJLIL;
        if (debugToolsHelper != null && (interfaceC31194CMc = debugToolsHelper.LJLJI) != null) {
            return interfaceC31194CMc.LJIIIIZZ();
        }
        if (objArr != null) {
            return LIZ(realPitayaCore, method, Arrays.copyOf(objArr, objArr.length));
        }
        return LIZ(realPitayaCore, method, new Object[0]);
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final DebugToolsHelper IC(Context context, DataChannel mDataChannel, EnumC30213BtR scene) {
        CGG cgg;
        o.LJIIIZ(mDataChannel, "mDataChannel");
        o.LJIIIZ(scene, "scene");
        boolean z = true;
        if (!LIZLLL() || !LiveGiftDebugToolsSetting.INSTANCE.getValue() || context == null) {
            boolean LIZLLL = LIZLLL();
            boolean value = LiveGiftDebugToolsSetting.INSTANCE.getValue();
            if (context != null) {
                z = false;
            }
            StringBuilder LIZLLL2 = C00F.LIZLLL("newFloatDebugTools(). return null. isTestChannel=", LIZLLL, ", settingValue=", value, ", contextIsNull=");
            FT5.LJ(LIZLLL2, z, LIZLLL2, "DebugService");
            return null;
        }
        int i = C30214BtS.LIZ[scene.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    cgg = CGG.AUDIENCE;
                } else {
                    throw new C162476Zf();
                }
            } else {
                cgg = CGG.PREVIEW;
            }
        } else {
            cgg = CGG.BROADCAST;
        }
        DebugToolsHelper debugToolsHelper = new DebugToolsHelper(context, mDataChannel, cgg);
        this.LJLIL = debugToolsHelper;
        return debugToolsHelper;
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void vl0(InterfaceC31194CMc interfaceC31194CMc, Context context, DataChannel dataChannel) {
        DebugToolsHelper.LIZIZ(interfaceC31194CMc, context, dataChannel);
    }
}
