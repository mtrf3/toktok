package X;

import android.view.View;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.C9t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30873C9t extends AbstractC60811Ntn {
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        Long l;
        String str;
        o.LJIIIZ(view, "view");
        View LIZJ = view.LIZJ();
        if (LIZJ != null) {
            if (LIZJ.isAttachedToWindow()) {
                BPI.LIZ(view);
            } else {
                LIZJ.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC30625C0f(view));
            }
        }
        C60737Nsb hybridContext = view.getHybridContext();
        C60728NsS c60728NsS = (C60728NsS) hybridContext.LIZIZ(C60728NsS.class);
        if (c60728NsS != null && (l = c60728NsS.LIZIZ) != null) {
            long longValue = l.longValue();
            String str2 = hybridContext.url;
            BZI LIZ = C28787BRn.LIZ("spark_hybrid_container_load_finish");
            LIZ.LJIJJ(str2, "schema");
            LIZ.LJIJJ(C78946Uyc.LJIJJ(str2), "url");
            android.net.Uri parse = UriProtector.parse(str2);
            o.LJIIIIZZ(parse, "Uri.parse(this)");
            EnumC60689Nrp LJJIZ = C86793Y4n.LJJIZ(parse);
            o.LJIIIZ(LJJIZ, "<this>");
            int i = C60690Nrq.LIZ[LJJIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "lynx";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str = "web";
                }
            } else {
                str = "unknown";
            }
            LIZ.LJIJJ(str, "type");
            LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - longValue), "duration");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
        if (sparkContext != null) {
            String containerId = sparkContext.containerId;
            o.LJIIIZ(containerId, "containerId");
            C30874C9u.LIZ.put(containerId, new WeakReference<>(sparkContext));
        }
        DataChannelGlobal.LJLJJI.tv0(SparkOpenChannel.class, Boolean.TRUE);
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
        if (sparkContext != null) {
            String containerId = sparkContext.containerId;
            o.LJIIIZ(containerId, "containerId");
            C30874C9u.LIZ.remove(containerId);
        }
        DataChannelGlobal.LJLJJI.tv0(SparkOpenChannel.class, Boolean.FALSE);
    }
}
