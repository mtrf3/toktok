package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.C86961YAz;
import X.InterfaceC86960YAy;
import X.YB2;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ARSenorPresenter extends BaseSenorPresenter {
    public C86961YAz LJLJL;
    public final YB2 LJLJLJ;
    public final boolean LJLJLLL;
    public final InterfaceC86960YAy LJLL;
    public final int LJLLI;

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(18:3|4|5|6|7|(15:9|10|11|12|13|(1:15)(9:32|33|34|35|17|(6:25|26|27|28|22|23)|21|22|23)|16|17|(1:19)|25|26|27|28|22|23)|42|13|(0)(0)|16|17|(0)|25|26|27|28|22|23)|46|7|(0)|42|13|(0)(0)|16|17|(0)|25|26|27|28|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        r6 = X.C82891Wg3.LIZLLL();
        r4 = X.X1D.LIZ();
        r4.append("BPEA-registerRotationVectorSenor: ");
        r4.append(X.V0N.LJJIJL(r7));
        r6.w(X.X1D.LIZIZ(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC84018WyE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void register() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter.register():void");
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC84018WyE
    public final void unRegister() {
        super.unRegister();
        C86961YAz c86961YAz = this.LJLJL;
        if (c86961YAz != null) {
            o.LJI(c86961YAz);
            c86961YAz.disable();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARSenorPresenter(Context context, LifecycleOwner lifecycleOwner, boolean z, InterfaceC86960YAy processor, Handler handler, int i) {
        super(context, lifecycleOwner, handler);
        o.LJIIIZ(processor, "processor");
        o.LJI(context);
        o.LJI(lifecycleOwner);
        this.LJLJLLL = z;
        this.LJLL = processor;
        this.LJLLI = i;
        this.LJLJLJ = processor.LIZIZ();
    }
}
