package X;

import Y.ARunnableS45S0100000_9;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ1 implements InterfaceC53908LDs {
    public final View LJLIL;
    public final String LJLILLLLZI;
    public final /* synthetic */ C54042LIw LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public RoamingLocationInfo LJLJL;
    public final RoamingLocationInfo LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    public final TextView LIZIZ() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-textView>(...)");
        return (TextView) value;
    }

    public final void LIZJ() {
        if (!this.LJLJJI) {
            return;
        }
        this.LJLJJI = false;
        this.LJLJJL = false;
        LIZIZ().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void LIZ() {
        LIZIZ().post(new ARunnableS45S0100000_9(this, 106));
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJJLIIIJ(new M3Z("create_nearby_tab_view"));
    }

    @Override // X.InterfaceC53908LDs
    public final float getTextWidth() {
        TextPaint paint = LIZIZ().getPaint();
        if (paint != null) {
            return paint.measureText(this.LJLILLLLZI);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC53908LDs
    public final View getView() {
        return this.LJLIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L43;
     */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRegionChange(com.ss.android.ugc.aweme.roaming.RoamingLocationInfo r10) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJ1.onRegionChange(com.ss.android.ugc.aweme.roaming.RoamingLocationInfo):void");
    }

    @Override // X.InterfaceC53908LDs
    public final void setText(String text) {
        o.LJIIIZ(text, "text");
    }

    @Override // X.InterfaceC53908LDs
    public final void setTextSize(float f) {
        LIZIZ().setTextSize(1, f);
    }

    public LJ1(View view, String title) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(title, "title");
        this.LJLIL = view;
        this.LJLILLLLZI = title;
        this.LJLJI = new C54042LIw();
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 695));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 694));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 696));
        C42625Go9.LIZIZ(this);
        this.LJLJLJ = LJ5.LJFF();
        SettingsManager.LIZLLL().LJIIIZ(new LJ4(this));
    }
}
