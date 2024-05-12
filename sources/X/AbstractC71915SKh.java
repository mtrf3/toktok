package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SKh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71915SKh extends SKX implements InterfaceC71918SKk {
    public final AbstractC71913SKf LIZ;

    @Override // X.SKX
    public final int LJII() {
        return R.layout.aha;
    }

    public abstract void LJIIIIZZ(AI8 ai8);

    @Override // X.SKZ
    public final boolean LJI() {
        InterfaceC71919SKl interfaceC71919SKl = this.LIZ.LJII;
        if (interfaceC71919SKl != null) {
            return interfaceC71919SKl.isVisible();
        }
        return true;
    }

    public AbstractC71915SKh(AbstractC71913SKf builder) {
        o.LJIIIZ(builder, "builder");
        this.LIZ = builder;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        C2068389v c2068389v;
        AbstractC71913SKf abstractC71913SKf;
        CharSequence charSequence;
        boolean z;
        int i;
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        Context context = view.getContext();
        AI8 ai8 = (AI8) view.findViewById(R.id.et9);
        Integer num = this.LIZ.LIZ;
        String str = null;
        if (num != null) {
            int intValue = num.intValue();
            c2068389v = new C2068389v();
            c2068389v.LIZ = intValue;
        } else {
            c2068389v = null;
        }
        ai8.setIcon(c2068389v);
        AbstractC71913SKf abstractC71913SKf2 = this.LIZ;
        String str2 = abstractC71913SKf2.LIZJ;
        if (str2 == null) {
            Integer num2 = abstractC71913SKf2.LIZIZ;
            if (num2 != null) {
                str2 = context.getString(num2.intValue());
            } else {
                str2 = null;
            }
        }
        ai8.setTitle(str2);
        if (!this.LIZ.LIZLLL) {
            ((TuxTextView) ai8.findViewById(R.id.lao)).setTuxFont(101);
        }
        InterfaceC65784Pro<? extends CharSequence> interfaceC65784Pro = this.LIZ.LJI;
        if ((interfaceC65784Pro == null || (charSequence = interfaceC65784Pro.invoke()) == null) && (charSequence = (abstractC71913SKf = this.LIZ).LJFF) == null) {
            Integer num3 = abstractC71913SKf.LJ;
            if (num3 != null) {
                str = context.getString(num3.intValue());
            }
            charSequence = str;
        }
        ai8.setSubtitle(charSequence);
        if (charSequence instanceof Spannable) {
            ((TextView) ai8.findViewById(R.id.ks_)).setMovementMethod(AnonymousClass898.LIZ);
        }
        LJIIIIZZ(ai8);
        InterfaceC71919SKl interfaceC71919SKl = this.LIZ.LJII;
        if (interfaceC71919SKl != null) {
            z = interfaceC71919SKl.isEnabled();
        } else {
            z = true;
        }
        ai8.setCellEnabled(z);
        if (LJI()) {
            i = 0;
        } else {
            i = 8;
        }
        ai8.setVisibility(i);
    }

    @Override // X.InterfaceC71918SKk
    public final void LIZJ(SKV holder, boolean z, boolean z2) {
        LayerDrawable layerDrawable;
        Drawable drawable;
        o.LJIIIZ(holder, "holder");
        if (this.LIZ.LJIIJJI) {
            ((AI8) holder.itemView.findViewById(R.id.et9)).LJ(z, z2);
        }
        if (this.LIZ.LJIIL) {
            View findViewById = holder.itemView.findViewById(R.id.et9);
            o.LJIIIIZZ(findViewById, "holder.itemView.item_cell");
            Context context = findViewById.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dd, context);
            if (LJI != null) {
                int intValue = LJI.intValue();
                Drawable background = findViewById.getBackground();
                if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null && (drawable = layerDrawable.getDrawable(0)) != null) {
                    C07820Sk.LJI(C07840Sm.LJFF(drawable), intValue);
                }
            }
        }
    }

    @Override // X.SLP
    public final void LIZ(SKZ skz, SKZ skz2, SKV skv, int i) {
        C71916SKi.LIZ(this, skz, skz2, skv);
    }

    @Override // X.SLP
    public final void LIZIZ(SKZ skz, SKZ skz2, SKV holder, int i) {
        o.LJIIIZ(holder, "holder");
        C71916SKi.LIZ(this, skz, skz2, holder);
    }
}
