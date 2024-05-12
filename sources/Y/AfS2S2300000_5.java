package Y;

import X.BZI;
import X.C05630Jz;
import X.C0TL;
import X.C141335gf;
import X.C28787BRn;
import X.C30929CBx;
import X.C3C5;
import X.C72242sW;
import X.C76800UCe;
import X.CC2;
import X.EnumC30931CBz;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.X1D;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AfS2S2300000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS2S2300000_5 r12, java.lang.Object r13) {
        /*
            com.bytedance.android.live.network.response.BaseResponse r13 = (com.bytedance.android.live.network.response.BaseResponse) r13
            java.lang.Object r0 = r12.l2
            X.Pro r0 = (X.InterfaceC65784Pro) r0
            r0.invoke()
            T r0 = r13.data
            com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse r0 = (com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse) r0
            r3 = 0
            r10 = 0
            if (r0 == 0) goto L5b
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo> r8 = r0.pictionaryList
            if (r8 == 0) goto L5b
            java.lang.Object r7 = r12.l4
            com.bytedance.ies.sdk.datachannel.DataChannel r7 = (com.bytedance.ies.sdk.datachannel.DataChannel) r7
            java.lang.String r6 = r12.s1
            java.util.Iterator r11 = r8.iterator()
        L1f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r9 = r11.next()
            r0 = r9
            com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo r0 = (com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo) r0
            com.bytedance.android.livesdk.model.message.PictionaryInfo r0 = r0.pictionaryInfo
            long r4 = r0.id
            java.lang.Long r0 = X.BAF.LJIJJ(r7)
            if (r0 != 0) goto L37
            goto L1f
        L37:
            long r1 = r0.longValue()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            r10 = r9
        L40:
            com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo r10 = (com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo) r10
            if (r10 == 0) goto L74
            com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics r0 = r10.pictionaryStatistics
            if (r0 == 0) goto L74
            long r0 = r0.guessCorrectUv
        L4a:
            X.BAF.LJJII(r0, r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.BAI.LJIIIZ(r7, r0, r6)
            X.BAF.LJIILL(r7, r8)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L6a
        L5b:
            java.lang.Object r2 = r12.l3
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r12.l4
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = (com.bytedance.ies.sdk.datachannel.DataChannel) r1
            java.lang.Long r0 = X.BAF.LJJ(r1)
            X.BAF.LJIJI(r2, r1, r0)
        L6a:
            java.lang.Object r1 = r12.l4
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = (com.bytedance.ies.sdk.datachannel.DataChannel) r1
            java.lang.String r0 = r12.s0
            X.BAF.LJIILJJIL(r1, r0, r3)
            return
        L74:
            r0 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S2300000_5.accept$0(Y.AfS2S2300000_5, java.lang.Object):void");
    }

    public static final void accept$1(AfS2S2300000_5 afS2S2300000_5, Object obj) {
        BaseResponse it = (BaseResponse) obj;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS2S2300000_5.l2;
        o.LJIIIIZZ(it, "it");
        String str = "";
        if (((Boolean) interfaceC88472Yns.invoke(it)).booleanValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("livesdk_subscription_");
            LIZ.append(afS2S2300000_5.s0);
            LIZ.append("_succeed_new");
            BZI LIZ2 = C28787BRn.LIZ(X1D.LIZIZ(LIZ));
            C30929CBx.LJIIL(LIZ2, (C72242sW) afS2S2300000_5.l4, afS2S2300000_5.s1);
            LIZ2.LJIJJ(it.LIZIZ, "logid");
            LIZ2.LJJIIJZLJL();
            int i = CC2.LIZ[((EnumC30931CBz) afS2S2300000_5.l3).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    long j = ((C72242sW) afS2S2300000_5.l4).element;
                    String str2 = it.LIZIZ;
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    JSONObject jSONObject = new JSONObject();
                    if (str2 != null) {
                        str = str2;
                    }
                    C05630Jz.LJI(jSONObject, "response", str);
                    C05630Jz.LJFF(jSONObject, "cost", currentTimeMillis);
                    C30929CBx.LJIIZILJ("subscription_privilege_all_detail_succeed", jSONObject);
                    return;
                }
                long j2 = ((C72242sW) afS2S2300000_5.l4).element;
                String str3 = it.LIZIZ;
                long currentTimeMillis2 = System.currentTimeMillis() - j2;
                JSONObject jSONObject2 = new JSONObject();
                if (str3 != null) {
                    str = str3;
                }
                C05630Jz.LJI(jSONObject2, "response", str);
                C05630Jz.LJFF(jSONObject2, "cost", currentTimeMillis2);
                C30929CBx.LJIIZILJ("subscription_get_emotes_succeed", jSONObject2);
                return;
            }
            long j3 = ((C72242sW) afS2S2300000_5.l4).element;
            String str4 = it.LIZIZ;
            long currentTimeMillis3 = System.currentTimeMillis() - j3;
            JSONObject jSONObject3 = new JSONObject();
            if (str4 != null) {
                str = str4;
            }
            C05630Jz.LJI(jSONObject3, "response", str);
            C05630Jz.LJFF(jSONObject3, "cost", currentTimeMillis3);
            C30929CBx.LJIJ("subscription_get_sub_info_succeed", jSONObject3);
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("livesdk_subscription_");
        LIZ3.append(afS2S2300000_5.s0);
        LIZ3.append("_failed_new");
        BZI LIZ4 = C28787BRn.LIZ(X1D.LIZIZ(LIZ3));
        C30929CBx.LJIIL(LIZ4, (C72242sW) afS2S2300000_5.l4, afS2S2300000_5.s1);
        LIZ4.LJIJJ(it.LIZIZ, "logid");
        C0TL c0tl = new C0TL(100010001, 0, "");
        JSONObject jSONObject4 = new JSONObject();
        C30929CBx.LIZ.LJIIIZ(c0tl, jSONObject4);
        Iterator<String> keys = jSONObject4.keys();
        o.LJIIIIZZ(keys, "keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            try {
                o.LJIIIIZZ(key, "key");
                LIZ4.LJIJJ(jSONObject4.get(key), key);
                C3C5.m7constructorimpl(LIZ4);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        LIZ4.LJJIIJZLJL();
        int i2 = CC2.LIZ[((EnumC30931CBz) afS2S2300000_5.l3).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                C30929CBx.LJIILJJIL(((C72242sW) afS2S2300000_5.l4).element, c0tl);
                return;
            }
            C30929CBx.LJIILIIL(((C72242sW) afS2S2300000_5.l4).element, c0tl);
            return;
        }
        C30929CBx.LJIIJ(((C72242sW) afS2S2300000_5.l4).element, c0tl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS2S2300000_5(Object obj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Fragment fragment, DataChannel dataChannel, String str, String str2) {
        this.$t = str2;
        this.l2 = obj;
        this.l3 = interfaceC65784Pro;
        this.l4 = fragment;
        this.s0 = dataChannel;
        this.s1 = str;
    }
}
