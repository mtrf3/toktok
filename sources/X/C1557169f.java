package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.69f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1557169f extends LinearLayout implements InterfaceC1549166d<C67E>, InterfaceC1549266e {
    public C67E LJLIL;
    public long LJLILLLLZI;
    public C1556769b LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final OPX LJLJJLL;
    public final TextView LJLJL;
    public final TextView LJLJLJ;

    private final SafeHandler getHandler() {
        return (SafeHandler) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC1549166d
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C67E LJIJ() {
        C67E c67e = this.LJLIL;
        if (c67e != null) {
            c67e.LJLILLLLZI = getStickerController().getInteractStickerStruct();
        } else {
            c67e = new C67E(null, 15);
        }
        return new C67E(c67e.LJLIL, c67e.LJLILLLLZI, c67e.LJLJI, c67e.LJLJJI);
    }

    public final boolean LIZIZ() {
        C67E c67e = this.LJLIL;
        if (c67e != null) {
            o.LJI(c67e);
            if (c67e.LJLJJI != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r3 <= r0.LJLJJI) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (4 == getVisibility()) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            r7 = this;
            X.67E r0 = r7.LJLIL
            r5 = 0
            if (r0 == 0) goto L4b
            X.69b r0 = r7.getStickerController()
            boolean r0 = r0.LJIL()
            if (r0 != 0) goto L4b
            boolean r0 = r7.LJLJJI
            if (r0 != 0) goto L4b
            boolean r0 = r7.LIZIZ()
            r6 = 1
            if (r0 == 0) goto L36
            long r3 = r7.LJLILLLLZI
            X.67E r0 = r7.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.LJLJI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L44
            long r3 = r7.LJLILLLLZI
            X.67E r0 = r7.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.LJLJJI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L44
        L36:
            r2 = 1
            r1 = 4
            if (r6 == 0) goto L45
            int r0 = r7.getVisibility()
            if (r1 != r0) goto L45
        L40:
            X.C162696a1.LJ(r5, r7)
            return r6
        L44:
            r2 = 0
        L45:
            r6 = 0
            if (r2 == 0) goto L49
            goto L40
        L49:
            r5 = 4
            goto L40
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1557169f.LIZJ():boolean");
    }

    public int getEndTime() {
        C67E c67e = this.LJLIL;
        if (c67e != null) {
            return c67e.LJLJJI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549266e
    public Integer getInteractStickerType() {
        if (this.LJLJI != null) {
            getStickerController().getClass();
            return 6;
        }
        return null;
    }

    public int getStartTime() {
        C67E c67e = this.LJLIL;
        if (c67e != null) {
            return c67e.LJLJI;
        }
        return 0;
    }

    public final C1556769b getStickerController() {
        C1556769b c1556769b = this.LJLJI;
        if (c1556769b != null) {
            return c1556769b;
        }
        o.LJIJI("stickerController");
        throw null;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        if (LIZIZ()) {
            C67E c67e = this.LJLIL;
            o.LJI(c67e);
            return c67e.LJLJI;
        }
        return 0;
    }

    public final long getPlayPosition() {
        return this.LJLILLLLZI;
    }

    public final void LIZLLL(C6J6 org2) {
        o.LJIIIZ(org2, "org");
        UrlModel icon = org2.getIcon();
        if (icon != null) {
            C78764Uvg.LJFF(this.LJLJJLL, icon);
        }
        TextView textView = this.LJLJL;
        String string = getContext().getString(R.string.ex6);
        o.LJIIIIZZ(string, "context.getString(R.string.donation_sticker_title)");
        C67981Qm9.LIZIZ(new Object[]{org2.getName()}, 1, string, "format(format, *args)", textView);
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        if (LIZIZ()) {
            C67E c67e = this.LJLIL;
            o.LJI(c67e);
            return c67e.LJLJJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        if (LIZIZ()) {
            C67E c67e = this.LJLIL;
            o.LJI(c67e);
            return c67e.LJLJI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        if (LIZIZ()) {
            C67E c67e = this.LJLIL;
            o.LJI(c67e);
            return c67e.LJLJJI;
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

    public final void setDonationStickerData(C67E data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
        C6J6 c6j6 = data.LJLIL;
        if (c6j6 != null) {
            LIZLLL(c6j6);
        }
        this.LJLJLJ.setText(Keva.getRepo("donation_sticker").getString("donation_match_text", ""));
    }

    @Override // X.InterfaceC1549266e
    public void setEndTime(int i) {
        C67E c67e = this.LJLIL;
        if (c67e == null) {
            return;
        }
        c67e.LJLJJI = i;
    }

    public final void setPlayPosition(long j) {
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC1549266e
    public void setStartTime(int i) {
        C67E c67e = this.LJLIL;
        if (c67e == null) {
            return;
        }
        c67e.LJLJI = i;
    }

    public final void setStickerController(C1556769b c1556769b) {
        o.LJIIIZ(c1556769b, "<set-?>");
        this.LJLJI = c1556769b;
    }

    public final void setTouching(boolean z) {
        if (z == this.LJLJJI) {
            return;
        }
        this.LJLJJI = z;
        if (!z) {
            SystemClock.elapsedRealtime();
            getHandler().postDelayed(new ARunnableS38S0100000_2(this, 165), 1000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1557169f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJL = C221108m2.LIZIZ(new AqS149S0200000_2(this, context, 92));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.anf, this, true);
        View findViewById = findViewById(R.id.hda);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.org_icon)");
        OPX opx = (OPX) findViewById;
        this.LJLJJLL = opx;
        View findViewById2 = findViewById(R.id.ku5);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.support_org)");
        this.LJLJL = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.avv);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.btn_donate)");
        View findViewById4 = findViewById(R.id.cer);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.donation_match_text)");
        this.LJLJLJ = (TextView) findViewById4;
        V8L v8l = opx.getHierarchy().LIZJ;
        if (v8l != null) {
            v8l.LIZLLL(KL2.LIZJ(context, 0.5f));
        }
        V8L v8l2 = opx.getHierarchy().LIZJ;
        if (v8l2 != null) {
            v8l2.LJFF = AnonymousClass636.LJIIIIZZ(R.attr.dv, context);
        }
        findViewById3.setClickable(false);
    }

    @Override // X.InterfaceC1549266e
    public final void LJIIIZ(float f, boolean z) {
        setAlpha(f);
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(C67E c67e, int i, int i2) {
        C67E c67e2 = c67e;
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(c67e2.LJLILLLLZI);
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(getStickerController().getInteractStickerStruct());
        C67E c67e3 = this.LJLIL;
        if (c67e3 != null) {
            c67e3.LJLJI = c67e2.LJLJI;
            c67e3.LJLJJI = c67e2.LJLJJI;
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
            InteractStickerStruct interactStickerStruct = c67e2.LJLILLLLZI;
            if (interactStickerStruct != null) {
                interactStickerStruct.setTrackList(json);
            }
            getStickerController().LJJIIZ(false);
            getStickerController().LJJIIJZLJL(c67e2.LJLILLLLZI, Boolean.FALSE);
            getStickerController().LJJIIZ(true);
        }
    }
}
