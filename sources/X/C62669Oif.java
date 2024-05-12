package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oif, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62669Oif extends AbstractC62304Ocm {
    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.vkontakte.android";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "vk";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "VK";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.gb, LJJL);
            if (LJIIIZ != null) {
                i = LJIIIZ.intValue();
            } else {
                i = 0;
            }
            c2068389v.LIZ = i;
            return c2068389v.LIZ(LJJL);
        }
        return null;
    }

    @Override // X.AbstractC62223ObT
    public final boolean LJIJJ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            if (C62494Ofq.LJ.LIZJ(LJIJJ)) {
                Activity LIZ = C62494Ofq.LJ.LIZ();
                if (LIZ == null || C62494Ofq.LJ.LIZJ(LIZ)) {
                    C62670Oig.LIZ(new AqS157S0200000_10(this, intent, 41));
                    return true;
                }
                return super.LJIJJ(LIZ, intent);
            }
            return super.LJIJJ(LJIJJ, intent);
        }
        return super.LJIJJ(context, intent);
    }

    public static final /* synthetic */ void LJJIFFI(C62669Oif c62669Oif, Context context, Intent intent) {
        super.LJIJJ(context, intent);
    }
}
