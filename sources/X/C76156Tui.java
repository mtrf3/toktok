package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tui, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76156Tui extends AbstractC31414CUo<C76149Tub, C76157Tuj> {
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C76163Tup.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C76164Tuq.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C76165Tur.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C76166Tus.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C76167Tut.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C76158Tuk.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C76159Tul.LJLIL);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C76160Tum.LJLIL);
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C76161Tun.LJLIL);
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C76162Tuo.LJLIL);

    public static int LJI(C47121t6 c47121t6) {
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(c47121t6.getText(), 0, c47121t6.getText().length(), c47121t6.getPaint(), C81185Vtd.LIZLLL() - C15380j0.LIZ((c47121t6.getCompoundPaddingStart() + 155.0f) + c47121t6.getCompoundPaddingEnd())).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build().getLineCount();
        }
        return new StaticLayout(c47121t6.getText(), c47121t6.getPaint(), C81185Vtd.LIZLLL() - C15380j0.LIZ((c47121t6.getCompoundPaddingStart() + 155.0f) + c47121t6.getCompoundPaddingEnd()), Layout.Alignment.ALIGN_NORMAL, c47121t6.getLineSpacingMultiplier(), c47121t6.getLineSpacingExtra(), true).getLineCount();
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76157Tuj c76157Tuj, C76149Tub c76149Tub) {
        C76157Tuj holder = c76157Tuj;
        C76149Tub item = c76149Tub;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        Object value = holder.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-topicBubble>(...)");
        C15490jB.LJ((View) value, "tiktok_live_interaction_normal_1", "ttlive_topic_roundtable_invite_list_banner.png");
        Object value2 = holder.LJLIL.getValue();
        o.LJIIIIZZ(value2, "<get-bannerLayout>(...)");
        C29306Beo.LJJJLL((View) value2, 500L, new AqS179S0100000_13(this, 687));
        Object value3 = holder.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value3, "<get-topicTitle>(...)");
        ((TextView) value3).setText(item.LJLILLLLZI);
        Object value4 = holder.LJLJI.getValue();
        o.LJIIIIZZ(value4, "<get-topicDesc>(...)");
        ((TextView) value4).setText(item.LJLJI);
        int i = item.LJLJJI;
        if (i == 0) {
            Object value5 = holder.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value5, "<get-topicTitle>(...)");
            i = LJI((C47121t6) value5);
        }
        item.LJLJJI = i;
        int i2 = item.LJLJJL;
        if (i2 == 0) {
            Object value6 = holder.LJLJI.getValue();
            o.LJIIIIZZ(value6, "<get-topicDesc>(...)");
            i2 = LJI((C47121t6) value6);
        }
        item.LJLJJL = i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("adjustTitleDescMargin, titleLineCount=");
        LIZ.append(i);
        LIZ.append(", descLineCount=");
        LIZ.append(i2);
        C0NB.LIZIZ("MultiCoHostTopicViewBinder", X1D.LIZIZ(LIZ));
        if (i == 1) {
            if (i2 == 1) {
                C29306Beo.LJJJJLI(((Number) this.LJIIJ.getValue()).intValue(), holder.P());
                C29306Beo.LJJJJLI(((Number) this.LJ.getValue()).intValue(), holder.N());
                C29306Beo.LJJJJLI(((Number) this.LJIIJ.getValue()).intValue(), holder.L());
                C29306Beo.LJJJJLI(((Number) this.LIZJ.getValue()).intValue(), holder.M());
                return;
            }
        } else if (i != 1) {
            if (i <= 1) {
                return;
            }
            if (i2 == 1) {
                C29306Beo.LJJJJLI(((Number) this.LJI.getValue()).intValue(), holder.P());
                C29306Beo.LJJJJLI(((Number) this.LIZLLL.getValue()).intValue(), holder.N());
                C29306Beo.LJJJJLI(((Number) this.LJI.getValue()).intValue(), holder.L());
                C29306Beo.LJJJJLI(((Number) this.LJ.getValue()).intValue(), holder.M());
                return;
            }
            if (i2 <= 1) {
                return;
            }
            C29306Beo.LJJJJLI(((Number) this.LJIIIIZZ.getValue()).intValue(), holder.P());
            C29306Beo.LJJJJLI(((Number) this.LIZIZ.getValue()).intValue(), holder.N());
            C29306Beo.LJJJJLI(((Number) this.LJFF.getValue()).intValue(), holder.L());
            C29306Beo.LJJJJLI(((Number) this.LJIIIZ.getValue()).intValue(), holder.M());
            return;
        }
        if (i2 <= 1) {
            return;
        }
        C29306Beo.LJJJJLI(((Number) this.LJII.getValue()).intValue(), holder.P());
        C29306Beo.LJJJJLI(((Number) this.LIZJ.getValue()).intValue(), holder.N());
        C29306Beo.LJJJJLI(((Number) this.LJII.getValue()).intValue(), holder.L());
        C29306Beo.LJJJJLI(((Number) this.LIZJ.getValue()).intValue(), holder.M());
    }

    @Override // X.AbstractC31414CUo
    public final C76157Tuj LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d8_, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C76157Tuj(LLLLIILL);
    }
}
