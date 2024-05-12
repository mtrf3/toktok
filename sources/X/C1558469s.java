package X;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.69s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1558469s extends LinearLayout implements InterfaceC1549166d<C1558669u>, InterfaceC1549366f {
    public long LJLIL;
    public C1558169p LJLILLLLZI;
    public boolean LJLJI;
    public final TuxTextView LJLJJI;
    public C1558669u LJLJJL;

    public final boolean LIZ() {
        C1558669u c1558669u = this.LJLJJL;
        if (c1558669u == null || c1558669u.LJLJI == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1549166d
    public final C1558669u LJIJ() {
        int i;
        InteractStickerStruct interactStickerStruct = getStickerController().getInteractStickerStruct();
        C1558669u c1558669u = this.LJLJJL;
        int i2 = 0;
        if (c1558669u != null) {
            i = c1558669u.LJLILLLLZI;
            i2 = c1558669u.LJLJI;
        } else {
            i = 0;
        }
        return new C1558669u(interactStickerStruct, i, i2);
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        C1558669u c1558669u = this.LJLJJL;
        if (c1558669u != null && LIZ()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public final C1558169p getStickerController() {
        C1558169p c1558169p = this.LJLILLLLZI;
        if (c1558169p != null) {
            return c1558169p;
        }
        o.LJIJI("stickerController");
        throw null;
    }

    public final long getPlayPosition() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        C1558669u c1558669u = this.LJLJJL;
        if (c1558669u != null && LIZ()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        C1558669u c1558669u = this.LJLJJL;
        if (c1558669u != null && LIZ()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        C1558669u c1558669u = this.LJLJJL;
        if (c1558669u != null && LIZ()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJIIIZ(f, false);
    }

    @Override // X.InterfaceC1549366f
    public void setEndTime(int i) {
        C1558669u c1558669u = this.LJLJJL;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLJI = i;
    }

    public final void setPlayPosition(long j) {
        this.LJLIL = j;
    }

    @Override // X.InterfaceC1549366f
    public void setStartTime(int i) {
        C1558669u c1558669u = this.LJLJJL;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLILLLLZI = i;
    }

    public final void setStickerController(C1558169p c1558169p) {
        o.LJIIIZ(c1558169p, "<set-?>");
        this.LJLILLLLZI = c1558169p;
    }

    public final void setTouching(boolean z) {
        if (z == this.LJLJI) {
            return;
        }
        this.LJLJI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558469s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bvv, this, true);
        View findViewById = findViewById(R.id.title);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.title)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.LJLJJI = tuxTextView;
        View findViewById2 = findViewById(R.id.gwc);
        if (findViewById2 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.e9);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context2 = findViewById2.getContext();
            o.LJIIIIZZ(context2, "natureStickerView.context");
            findViewById2.setBackground(c110614Vt.LIZ(context2));
        }
        tuxTextView.setMinTextSize(18.0f);
        Typeface LJIILIIL = C68M.LJIIJ().LJIILIIL("Neon");
        if (LJIILIIL != null) {
            tuxTextView.setTypeface(LJIILIIL);
        }
    }

    public final void LIZIZ(C1558669u c1558669u, String natureSpecies) {
        o.LJIIIZ(natureSpecies, "natureSpecies");
        this.LJLJJL = c1558669u;
        this.LJLJJI.setText(natureSpecies);
    }

    @Override // X.InterfaceC1549366f
    public final void LJIIIZ(float f, boolean z) {
        setAlpha(f);
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(C1558669u c1558669u, int i, int i2) {
        C1558669u c1558669u2 = c1558669u;
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(c1558669u2.LJLIL);
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(getStickerController().getInteractStickerStruct());
        C1558669u c1558669u3 = this.LJLJJL;
        if (c1558669u3 != null) {
            c1558669u3.LJLILLLLZI = c1558669u2.LJLILLLLZI;
            c1558669u3.LJLJI = c1558669u2.LJLJI;
        }
        if (LIZIZ != null && LIZIZ2 != null) {
            LIZIZ.setRotation(LIZIZ.getRotation() - LIZIZ2.getRotation());
            if (!o.LIZJ(LIZIZ2.getScale(), 0.0f)) {
                float floatValue = LIZIZ.getScale().floatValue();
                Float scale = LIZIZ2.getScale();
                o.LJIIIIZZ(scale, "newLocation.scale");
                LIZIZ.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LIZIZ);
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), arrayList);
            InteractStickerStruct interactStickerStruct = c1558669u2.LJLIL;
            if (interactStickerStruct != null) {
                interactStickerStruct.setTrackList(json);
            }
            getStickerController().LJJIIZ(false);
            getStickerController().LJJIIJZLJL(c1558669u2.LJLIL, Boolean.FALSE);
            getStickerController().LJJIIZ(true);
        }
    }
}
