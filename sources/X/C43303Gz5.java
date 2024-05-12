package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gz5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43303Gz5 extends FrameLayout {
    public final int LJLIL;
    public final View LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final ViewPager getInviteCardViewPager() {
        return (ViewPager) this.LJLJI.getValue();
    }

    public final float getDesignHeightInPixel() {
        return getContext().getResources().getDimension(R.dimen.a7f);
    }

    public final int getSharePanelHeight() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        View findViewById = findViewById(R.id.erz);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.invite_card_view_pager)");
        setLayoutParams(C43302Gz4.LIZ(context, findViewById, this.LJLIL, getDesignHeightInPixel()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43303Gz5(Context context, int i) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = i;
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 541));
        C62037OWj c62037OWj = new C62037OWj();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.clw, C16880lQ.LLZIL(context), this);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…ut_now_invite_card, this)");
        this.LJLILLLLZI = LLLZIIL;
        getInviteCardViewPager().setAdapter(c62037OWj);
    }
}
