package X;

import Y.ACListenerS42S0200000_7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.HvY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45632HvY extends FrameLayout {
    public View LJLIL;
    public SY4 LJLILLLLZI;
    public View LJLJI;

    public final SY4 getSureTextView() {
        SY4 sy4 = this.LJLILLLLZI;
        if (sy4 != null) {
            return sy4;
        }
        o.LJIJI("extractMusicBtn");
        throw null;
    }

    public final void LIZ(boolean z) {
        SY4 sy4 = this.LJLILLLLZI;
        if (sy4 != null) {
            sy4.setEnabled(z);
        } else {
            o.LJIJI("extractMusicBtn");
            throw null;
        }
    }

    public final void setBackGroundColor(int i) {
        View view = this.LJLJI;
        if (view != null) {
            view.setBackgroundColor(i);
        } else {
            o.LJIJI("extractMusicRoot");
            throw null;
        }
    }

    public final void setOnExtractClick(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        SY4 sy4 = this.LJLILLLLZI;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, listener);
        } else {
            o.LJIJI("extractMusicBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45632HvY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bjg, C16880lQ.LLZIL(context), this);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…extract_music_view, this)");
        this.LJLIL = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.d2m);
        o.LJIIIIZZ(findViewById, "contentRootView.findView…(R.id.extract_music_root)");
        this.LJLJI = findViewById;
        View view = this.LJLIL;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.m6h);
            o.LJIIIIZZ(findViewById2, "contentRootView.findView…Id(R.id.tv_extract_music)");
            SY4 sy4 = (SY4) findViewById2;
            this.LJLILLLLZI = sy4;
            sy4.setSupportClickWhenDisable(true);
            SY4 sy42 = this.LJLILLLLZI;
            if (sy42 != null) {
                C16880lQ.LJJIZ(sy42, new ACListenerS42S0200000_7(this, context, 14));
                setOutlineProvider(new C45639Hvf());
                setClipToOutline(true);
                setElevation(C170576mj.LIZ(context, 16.0f));
                return;
            }
            o.LJIJI("extractMusicBtn");
            throw null;
        }
        o.LJIJI("contentRootView");
        throw null;
    }
}
