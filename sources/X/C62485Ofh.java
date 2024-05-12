package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62485Ofh {
    public static void LIZLLL(ImageView iconView, View itemView) {
        o.LJIIIZ(iconView, "iconView");
        o.LJIIIZ(itemView, "itemView");
    }

    public static int LIZIZ() {
        if (C62483Off.LIZJ() == EnumC62492Ofo.VERTICAL) {
            return R.attr.g6;
        }
        return R.attr.g7;
    }

    public static void LJ(InterfaceC62486Ofi interfaceC62486Ofi, TextView textView) {
        o.LJIIIZ(textView, "textView");
        if (interfaceC62486Ofi.LJJII() == 0) {
            textView.setText("");
            return;
        }
        try {
            textView.setText(textView.getResources().getString(interfaceC62486Ofi.LJJII()));
        } catch (Exception unused) {
            textView.setText("");
        }
    }

    public static void LIZ(InterfaceC62486Ofi interfaceC62486Ofi, View view, BaseSharePackage sharePackage) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(sharePackage, "sharePackage");
        int i = C41318GJm.LIZ[interfaceC62486Ofi.LJIILIIL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            interfaceC62486Ofi.onClick(view);
        } else {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            interfaceC62486Ofi.LJJ(context, sharePackage);
        }
    }

    public static void LIZJ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi interfaceC62486Ofi) {
        Activity activity;
        InterfaceC62484Ofg interfaceC62484Ofg;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
            activity = C45804HyK.LJIJJ(context2);
            if (activity != null) {
                break;
            } else {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
            }
        }
        activity = C62494Ofq.LJ.LIZ();
        if (activity == null) {
            return;
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (!interfaceC62486Ofi.LJIIJJI() || ((interfaceC62484Ofg = C62494Ofq.LIZ) != null && interfaceC62484Ofg.LJIIZILJ())) {
            interfaceC62486Ofi.LIZLLL(context, sharePackage);
            return;
        }
        InterfaceC62484Ofg interfaceC62484Ofg2 = C62494Ofq.LIZ;
        if (interfaceC62484Ofg2 == null) {
            return;
        }
        interfaceC62484Ofg2.LJ(activity);
    }
}
