package X;

import android.content.Context;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS128S0300000_12;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Sqj */
/* loaded from: classes13.dex */
public final class C73361Sqj extends C73359Sqh {
    public final Context LJLJJLL;
    public final J0G<C61259O2l> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73361Sqj(Context context, C60789NtR c60789NtR) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLJJLL = context;
        this.LJLJL = c60789NtR;
    }

    @Override // X.C73340SqO, X.InterfaceC79974Va6
    public final /* bridge */ /* synthetic */ void LIZ(XAudioSrc xAudioSrc, AqS180S0100000_14 aqS180S0100000_14) {
        LIZ(xAudioSrc, aqS180S0100000_14);
    }

    @Override // X.C73359Sqh, X.C73340SqO
    /* renamed from: LJJIJLIJ */
    public final void LIZ(XAudioSrc xAudioSrc, InterfaceC88472Yns<? super C73362Sqk, C76800UCe> interfaceC88472Yns) {
        String playUrl;
        String playUrl2;
        String str = null;
        if (xAudioSrc == null || (playUrl = xAudioSrc.getPlayUrl()) == null || playUrl.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("origin=");
            LIZ.append(xAudioSrc);
            LIZ.append(", origin.playUrl=");
            if (xAudioSrc != null) {
                str = xAudioSrc.getPlayUrl();
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            if (xAudioSrc != null && xAudioSrc.getPlayModel() != null) {
                xAudioSrc.getPlayModel();
                return;
            }
            return;
        }
        J0G<C61259O2l> j0g = this.LJLJL;
        if (j0g == null) {
            super.LIZ(xAudioSrc, interfaceC88472Yns);
        } else if (xAudioSrc != null && (playUrl2 = xAudioSrc.getPlayUrl()) != null) {
            AqS180S0100000_14 aqS180S0100000_14 = (AqS180S0100000_14) interfaceC88472Yns;
            j0g.LIZ(playUrl2, new AqS116S0300000_12(this, xAudioSrc, aqS180S0100000_14, 20), new AqS128S0300000_12(this, xAudioSrc, aqS180S0100000_14, 4));
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }
}
