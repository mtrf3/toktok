package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* renamed from: X.8jY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219568jY extends AbstractC208678Gx {
    public final MH9 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public C73411SrX LJLLLL;
    public AddYoursTopic LJLLLLLL;
    public final C5H3 LJLZ;
    public final InterfaceC70422pa LJZ;

    @Override // X.MFR
    public final void LLZLLLL() {
    }

    @Override // X.AbstractC208678Gx
    public final void Y() {
    }

    public final View a0() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-bigInviteButton>(...)");
        return (View) value;
    }

    public final void c0(AddYoursTopic addYoursTopic) {
        long j;
        o.LJIIIZ(addYoursTopic, "addYoursTopic");
        C221018lt.LIZ("HeaderHolder", addYoursTopic.toString());
        this.LJLLLLLL = addYoursTopic;
        String str = null;
        if (((RBX) HG3.LJIILL()).getCurUser().getFollowingCount() <= 0) {
            Object value = this.LJLLI.getValue();
            o.LJIIIIZZ(value, "<get-linkInviteGroup>(...)");
            C17N.LJJIIJZLJL((View) value);
            C17N.LJJIIJZLJL(a0());
        } else if (((Boolean) C219928k8.LIZ.getValue()).booleanValue()) {
            Object value2 = this.LJLLI.getValue();
            o.LJIIIIZZ(value2, "<get-linkInviteGroup>(...)");
            C17N.LJJLIIIJJI((View) value2);
            C17N.LJJIIJZLJL(a0());
        } else {
            Object value3 = this.LJLLI.getValue();
            o.LJIIIIZZ(value3, "<get-linkInviteGroup>(...)");
            C17N.LJJIIJZLJL((View) value3);
            C17N.LJJLIIIJJI(a0());
            C73411SrX c73411SrX = this.LJLLLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            XKX.LIZLLL(this.LJZ, C78613UtF.LIZ, null, new C219548jW(this, addYoursTopic, null), 2);
        }
        Object value4 = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value4, "<get-title>(...)");
        ((TextView) value4).setText(addYoursTopic.getText());
        Long videoCount = addYoursTopic.getVideoCount();
        if (videoCount != null) {
            j = videoCount.longValue();
        } else {
            j = 0;
        }
        String LJJIIJ = C77123UOp.LJJIIJ(j);
        Object value5 = this.LJLL.getValue();
        o.LJIIIIZZ(value5, "<get-videoCount>(...)");
        C17N.LJJLIIIJJI((View) value5);
        Object value6 = this.LJLL.getValue();
        o.LJIIIIZZ(value6, "<get-videoCount>(...)");
        TextView textView = (TextView) value6;
        Resources resources = this.itemView.getContext().getResources();
        if (resources != null) {
            str = resources.getQuantityString(R.plurals.r4, (int) j, LJJIIJ);
        }
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219568jY(View view, AddYoursTopic topic, MH9 mh9) {
        super(view);
        InterfaceC70422pa lifecycleScope;
        o.LJIIIZ(topic, "topic");
        this.LJLJLJ = mh9;
        this.LJLJLLL = C221118m3.LIZ(new AqS153S0100000_3(view, 1529));
        this.LJLL = C221118m3.LIZ(new AqS153S0100000_3(view, 1530));
        this.LJLLI = C221118m3.LIZ(new AqS153S0100000_3(view, 1528));
        this.LJLLILLLL = C221118m3.LIZ(new AqS153S0100000_3(view, 1526));
        C5H3 LIZ = C221118m3.LIZ(new AqS153S0100000_3(view, 1527));
        this.LJLLJ = LIZ;
        this.LJLLL = C221118m3.LIZ(new AqS153S0100000_3(view, 1525));
        this.LJLZ = C221118m3.LIZ(new AqS152S0100000_2(view, 794));
        ActivityC45651qj LJ = C1DG.LJ(view, "itemView.context");
        this.LJZ = (LJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJ)) == null) ? C48841JEv.LIZ(EXV.LIZ) : lifecycleScope;
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 31, 42, 42), a0());
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-linkInvite>(...)");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 32, 42, 42), (View) value);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_plus_fill;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        c2068389v.LJ = Integer.valueOf(R.attr.eb);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C8FR LIZIZ = c2068389v.LIZIZ(2, context);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("+ ");
        LIZ2.append(this.itemView.getContext().getResources().getString(R.string.bd0));
        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ2));
        spannableString.setSpan(LIZIZ, 0, 1, 33);
        Object value2 = LIZ.getValue();
        o.LJIIIIZZ(value2, "<get-linkInvite>(...)");
        ((TextView) value2).setText(spannableString);
        c0(topic);
    }

    @Override // X.AbstractC208678Gx
    public final void X(Aweme aweme, int i, boolean z, Bundle bundle) {
        this.LJLIL = aweme;
        if (bundle != null) {
            bundle.getString("detail_aweme_from");
        }
        AddYoursTopic addYoursTopic = this.LJLLLLLL;
        if (addYoursTopic != null) {
            c0(addYoursTopic);
        }
    }
}
