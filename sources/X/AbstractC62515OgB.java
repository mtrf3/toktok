package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OgB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62515OgB implements InterfaceC113814dN {
    public final Context LJLIL;
    public final BaseSharePackage LJLILLLLZI;

    public abstract void LIZ(InterfaceC62225ObV interfaceC62225ObV, View view);

    public AbstractC62515OgB(Context context, BaseSharePackage baseSharePackage) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = baseSharePackage;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        BaseSharePackage baseSharePackage = this.LJLILLLLZI;
        if (baseSharePackage != null) {
            baseSharePackage.LJI(this.LJLIL, channel, view, new AqS99S0300000_10(this, channel, view, 6));
        } else {
            LIZ(channel, view);
        }
    }
}
