package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C60737Nsb;
import X.EnumC38014Evy;
import X.F3T;
import X.InterfaceC60761Nsz;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShareMethod extends BaseBridgeMethod {
    public final InterfaceC60761Nsz LJLIL;
    public final ArrayList<String> LJLILLLLZI;
    public final String LJLJI;
    public EnumC38014Evy LJLJJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        InterfaceC60761Nsz interfaceC60761Nsz;
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        C60737Nsb c60737Nsb = contextProviderFactory.LIZIZ;
        if (c60737Nsb != null) {
            interfaceC60761Nsz = c60737Nsb.LJI();
        } else {
            interfaceC60761Nsz = null;
        }
        this.LJLIL = interfaceC60761Nsz;
        this.LJLILLLLZI = new ArrayList<>(Arrays.asList("qrcode", "browser", "refresh"));
        this.LJLJI = "share";
        this.LJLJJI = EnumC38014Evy.PRIVATE;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLJJI = enumC38014Evy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x046a, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x047d, code lost:
    
        r1 = r4.LJIIL(r5).LJIIJ(new Y.IDhS65S0200000_1(r5, r0, 3)).LIZLLL();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "channel: Channel, contex…}\n        }.blockingGet()");
        r1 = ((java.lang.Boolean) r1).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0479, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v169, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r56, X.InterfaceC37146Ehy r57) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
