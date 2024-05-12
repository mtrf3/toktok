package X;

import Y.AfS66S0100000_14;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.VqP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80985VqP {
    public final EmojiAnimPlayground LIZ;
    public final ArrayList<InterfaceC80984VqO> LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C5H3 LIZLLL;
    public C73666Sve LJ;
    public final C5H3 LJFF;
    public long LJI;
    public volatile long LJII;
    public String LJIIIIZZ;
    public int LJIIIZ;

    public final void LIZIZ() {
        this.LIZ.setVisibility(4);
        ((C73318Sq2) this.LJFF.getValue()).LIZLLL();
        if (C79488VHo.LIZIZ()) {
            LIZLLL().clear();
        }
    }

    public final List<C80972VqC> LIZLLL() {
        return (List) this.LIZJ.getValue();
    }

    public C80985VqP(EmojiAnimPlayground emojiAnimPlayground) {
        o.LJIIIZ(emojiAnimPlayground, "emojiAnimPlayground");
        this.LIZ = emojiAnimPlayground;
        ArrayList<InterfaceC80984VqO> arrayList = new ArrayList<>();
        this.LIZIZ = arrayList;
        this.LIZJ = C221108m2.LIZIZ(C182247Dg.LJLIL);
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LIZLLL = C221108m2.LIZ(enumC221088m0, C182857Fp.LJLIL);
        arrayList.add(new C80979VqJ());
        arrayList.add(new C80981VqL());
        arrayList.add(new C80980VqK());
        emojiAnimPlayground.setEmojiItemList(LIZLLL());
        this.LJFF = C221108m2.LIZ(enumC221088m0, C182847Fo.LJLIL);
        this.LJIIIIZZ = "";
    }

    public final void LIZJ(String emoji) {
        int intValue;
        o.LJIIIZ(emoji, "emoji");
        long j = this.LJII;
        long j2 = this.LJI;
        if (1 <= j2 && j2 <= j) {
            if (o.LJ(this.LJIIIIZZ, emoji)) {
                int i = this.LJIIIZ + 1;
                this.LJIIIZ = i;
                if (i <= 5) {
                    intValue = 3;
                } else {
                    intValue = 5;
                }
            } else {
                this.LJIIIIZZ = emoji;
                this.LJIIIZ = 1;
                intValue = ((Number) this.LIZLLL.getValue()).intValue();
            }
            if (C79488VHo.LIZIZ()) {
                ((C73318Sq2) this.LJFF.getValue()).LIZ(LIZ(intValue, this.LJI, emoji, false).LJJIFFI(new AfS66S0100000_14(this, 55)));
                return;
            } else {
                LJFF(LJ(intValue, this.LJI, emoji, false));
                return;
            }
        }
        this.LJIIIIZZ = emoji;
        this.LJIIIZ = 1;
        this.LJII = 0L;
        if (C79488VHo.LIZIZ()) {
            ((C73318Sq2) this.LJFF.getValue()).LIZ(LIZ(((Number) this.LIZLLL.getValue()).intValue(), 0L, emoji, true).LJJIFFI(new AfS66S0100000_14(this, 56)));
        } else {
            LJI(LJ(((Number) this.LIZLLL.getValue()).intValue(), 0L, emoji, true));
        }
    }

    public final void LJFF(List<C80972VqC> list) {
        if (C79488VHo.LIZIZ()) {
            LIZLLL().addAll(list);
            return;
        }
        synchronized (LIZLLL()) {
            LIZLLL().addAll(list);
        }
    }

    public final void LJI(List<C80972VqC> list) {
        this.LIZ.setVisibility(0);
        this.LJI = 0L;
        LIZLLL().clear();
        LIZLLL().addAll(list);
        C73666Sve c73666Sve = this.LJ;
        if (c73666Sve != null) {
            c73666Sve.dispose();
        }
        InterfaceC92693kP LJIIIZ = AbstractC73745Swv.LJ(0L, 16L, TimeUnit.MILLISECONDS, T16.LIZIZ).LJIIIZ(new AfS66S0100000_14(this, 57));
        ((C73318Sq2) this.LJFF.getValue()).LIZ(LJIIIZ);
        this.LJ = (C73666Sve) LJIIIZ;
    }

    public final C73470SsU LIZ(int i, long j, String str, boolean z) {
        return AbstractC73638SvC.LJIILLIIL(new CallableC80986VqQ(this, str, i, j, z)).LJJIIJ(T16.LIZ).LJIJJ(C73969T1h.LIZIZ());
    }

    public final ArrayList LJ(int i, long j, String str, boolean z) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C80972VqC c80972VqC = new C80972VqC(str);
            ArrayList<InterfaceC80984VqO> modifiers = this.LIZIZ;
            o.LJIIIZ(modifiers, "modifiers");
            c80972VqC.LJLLL = modifiers;
            c80972VqC.LJLJI = (i2 * 50) + j;
            long LJIJI = C78842Uww.LJIJI(V0Q.Default, new UIW(1000L, 1250L));
            c80972VqC.LJLJJI = LJIJI;
            c80972VqC.LJLJJL = c80972VqC.LJLJI + LJIJI;
            arrayList.add(c80972VqC);
        }
        Collections.shuffle(arrayList);
        float f = 28;
        float LJIJJLI = (C17N.LJIJJLI(f) * 3) + this.LIZ.getHeight();
        int width = this.LIZ.getWidth() / i;
        float LJIJJLI2 = C17N.LJIJJLI(f) / 2;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C80972VqC c80972VqC2 = (C80972VqC) next;
                if (z) {
                    c80972VqC2.LJLJJLL = (i3 * width) + LJIJJLI2;
                } else {
                    c80972VqC2.LJLJJLL = C78842Uww.LJIJ(V0Q.Default, new C40517FvF(0, this.LIZ.getWidth()));
                }
                c80972VqC2.LJLJL = LJIJJLI;
                if (c80972VqC2.LJLJJL > this.LJII) {
                    this.LJII = c80972VqC2.LJLJJL;
                }
                c80972VqC2.LJLJLLL = c80972VqC2.LJLJJLL;
                c80972VqC2.LJLL = c80972VqC2.LJLJL;
                C40517FvF c40517FvF = new C40517FvF(LiveCoverMinSizeSetting.DEFAULT, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                V0R v0r = V0Q.Default;
                c80972VqC2.LJLJLJ = C17N.LJIJJLI(C78842Uww.LJIJ(v0r, c40517FvF));
                c80972VqC2.LJLLILLLL = C78842Uww.LJIJ(v0r, new C40517FvF(5, 10)) / 10.0f;
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }
}
