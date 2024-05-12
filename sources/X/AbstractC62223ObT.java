package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.ObT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62223ObT implements InterfaceC62225ObV {
    @Override // X.InterfaceC62225ObV
    public boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final void LJFF(View itemView) {
        o.LJIIIZ(itemView, "itemView");
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final void LJIIJJI(int i) {
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIILJJIL() {
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public float LJIILLIIL() {
        return 0.34f;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIZILJ() {
        return true;
    }

    public static String LJIJI(C62224ObU content) {
        String str;
        OYP oyp;
        String str2;
        o.LJIIIZ(content, "content");
        if ((content instanceof OYP) && (str2 = (oyp = (OYP) content).LJ) != null && str2.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            str = q.LIZIZ(LIZ, oyp.LJ, ' ', LIZ);
        } else {
            str = "";
        }
        String str3 = content.LIZJ;
        if (str3 == null || str3.length() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(content.LIZIZ);
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        Q89.LIZIZ(LIZ3, content.LIZJ, ' ', str);
        LIZ3.append(content.LIZIZ);
        return X1D.LIZIZ(LIZ3);
    }

    @Override // X.InterfaceC62225ObV
    public void LJ(C119604mi imageView, boolean z) {
        o.LJIIIZ(imageView, "imageView");
        imageView.setImageDrawable(LIZJ(imageView.getContext()));
    }

    public boolean LJIJJ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        String channelKey = key();
        o.LJIIIZ(channelKey, "channelKey");
        Integer num = C62276OcK.LIZ.get(channelKey);
        if (num == null) {
            num = -1;
        }
        o.LJIIIIZZ(num, "dataflowIdMap[channelKey] ?: -1");
        intent.putExtra("pns.sandbox.dataflow_id", num.intValue());
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        C16880lQ.LIZJ(context, intent);
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        try {
            if (content instanceof OYP) {
                return LJIJ((OYP) content, context, interfaceC62573Oh7);
            }
            if (content instanceof C62224ObU) {
                return LJI((C62224ObU) content, context, interfaceC62573Oh7);
            }
            if (content instanceof C62313Ocv) {
                return LJII((C62313Ocv) content, context, interfaceC62573Oh7);
            }
            if (content instanceof C62314Ocw) {
                return LJIILIIL((C62314Ocw) content, context, interfaceC62573Oh7);
            }
            throw new C162476Zf();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC62225ObV
    public boolean LJIJ(OYP content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return LJI(content, context, interfaceC62573Oh7);
    }
}
