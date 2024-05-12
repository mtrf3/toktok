package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommercelive.business.player.audio.EcAudioPlayer;
import kotlin.jvm.internal.o;

/* renamed from: X.Fmn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39993Fmn extends AbstractC39995Fmp {
    public static final /* synthetic */ int LJLJJL = 0;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final void release() {
        Context context;
        ActivityC45651qj LJJIFFI;
        EcAudioPlayer ecAudioPlayer;
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (ecAudioPlayer = EcAudioPlayer.LJLJJL.get(LJJIFFI)) == null) {
            return;
        }
        ecAudioPlayer.LIZIZ();
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        boolean z;
        boolean z2;
        InterfaceC39997Fmr interfaceC39997Fmr = (InterfaceC39997Fmr) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (interfaceC39997Fmr.getAudioUrl().length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invalid audioUrl: '");
            LIZ.append(interfaceC39997Fmr.getAudioUrl());
            LIZ.append('\'');
            c37356ElM.onFailure(0, X1D.LIZIZ(LIZ), C39991Fml.LIZ(-11, interfaceC39997Fmr.getAudioUrl()));
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "spark context is null", 4);
            return;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "spark context must be lifecycleOwner", 4);
            return;
        }
        if (ujb.o.LJJJLIIL(interfaceC39997Fmr.getAudioUrl(), "http", false)) {
            String audioUrl = interfaceC39997Fmr.getAudioUrl();
            Boolean isLoop = interfaceC39997Fmr.isLoop();
            if (isLoop != null) {
                z2 = isLoop.booleanValue();
            } else {
                z2 = false;
            }
            Lifecycle lifecycle = LJJIFFI.getLifecycle();
            o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
            XKX.LIZLLL(LifecycleKt.getCoroutineScope(lifecycle), C78613UtF.LIZJ, null, new C39989Fmj(audioUrl, c37356ElM, LJJIFFI, z2, null), 2);
            return;
        }
        String localKey = interfaceC39997Fmr.getLocalKey();
        String channel = interfaceC39997Fmr.getChannel();
        Boolean isLoop2 = interfaceC39997Fmr.isLoop();
        if (isLoop2 != null) {
            z = isLoop2.booleanValue();
        } else {
            z = false;
        }
        if (localKey == null || localKey.length() == 0 || channel == null || channel.length() == 0) {
            return;
        }
        String audioUrl2 = interfaceC39997Fmr.getAudioUrl();
        Lifecycle lifecycle2 = LJJIFFI.getLifecycle();
        o.LJIIIIZZ(lifecycle2, "context.lifecycle");
        XKX.LIZLLL(LifecycleKt.getCoroutineScope(lifecycle2), C78613UtF.LIZJ, null, new C39986Fmg(audioUrl2, localKey, c37356ElM, channel, LJJIFFI, z, null), 2);
    }
}
