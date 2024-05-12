package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Toc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75778Toc extends FrameLayout {
    public static final int LJLLI = C87277YNd.LJIIJJI(133);
    public static final int LJLLILLLL = C87277YNd.LJIIJJI(80);
    public static final int LJLLJ = C87277YNd.LJIIJJI(8);
    public static final int LJLLL = C87277YNd.LJIIJJI(86);
    public static final int LJLLLL = C87277YNd.LJIIJJI(52);
    public static final int LJLLLLLL = C87277YNd.LJIIJJI(4);
    public EnumC75775ToZ LJLIL;
    public String LJLILLLLZI;
    public int LJLJI;
    public C75883TqJ LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;

    private final C2A4 getViewPauseAnim() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseAnim>(...)");
        return (C2A4) value;
    }

    private final C47121t6 getViewPauseDescTv() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseDescTv>(...)");
        return (C47121t6) value;
    }

    private final ViewGroup getViewPauseLayout() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseLayout>(...)");
        return (ViewGroup) value;
    }

    private final C47121t6 getViewPauseStatusTv() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseStatusTv>(...)");
        return (C47121t6) value;
    }

    public final boolean LIZ() {
        Long l;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        C75883TqJ c75883TqJ = this.LJLJJI;
        if (c75883TqJ == null || !c75883TqJ.LIZLLL(l)) {
            return false;
        }
        return true;
    }

    public final void LIZIZ() {
        ViewGroup.LayoutParams layoutParams = getViewPauseAnim().getLayoutParams();
        layoutParams.width = LJLLI;
        layoutParams.height = LJLLILLLL;
        getViewPauseAnim().setLayoutParams(layoutParams);
        C29306Beo.LJJLIIIJILLIZJL(LJLLJ, getViewPauseStatusTv());
        getViewPauseStatusTv().setAutoSizeTextTypeUniformWithConfiguration(10, 15, 1, 1);
        getViewPauseDescTv().setTextSize(2, 12.0f);
    }

    public final void LIZJ() {
        ViewGroup.LayoutParams layoutParams = getViewPauseAnim().getLayoutParams();
        layoutParams.width = LJLLL;
        layoutParams.height = LJLLLL;
        getViewPauseAnim().setLayoutParams(layoutParams);
        C29306Beo.LJJLIIIJILLIZJL(LJLLLLLL, getViewPauseStatusTv());
        getViewPauseStatusTv().setTextSize(1, 13.0f);
        getViewPauseDescTv().setTextSize(1, 10.0f);
    }

    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setupPauseUISize, linkedUserSize=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isCurrentRoomAnchor=");
        LIZ.append(LIZ());
        C0NB.LJIIIZ("MultiCoHostResumeLayout", X1D.LIZIZ(LIZ));
        if (this.LJLJI == 2) {
            LIZIZ();
            return;
        }
        if (LIZ()) {
            if (this.LJLJI <= 3) {
                LIZIZ();
                return;
            } else {
                LIZJ();
                return;
            }
        }
        if (this.LJLJI < 3) {
            return;
        }
        LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupResumeUI(X.EnumC75775ToZ r4) {
        /*
            r3 = this;
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L7
            return
        L7:
            com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting.INSTANCE
            boolean r0 = r0.isEnableCoHostResume()
            if (r0 != 0) goto L10
            return
        L10:
            android.view.ViewGroup r1 = r3.getViewPauseLayout()
            r0 = 0
            r1.setVisibility(r0)
            X.1t6 r1 = r3.getViewPauseDescTv()
            r0 = 8
            r1.setVisibility(r0)
            r3.LIZLLL()
            int[] r1 = X.C75776Toa.LIZ
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 3
            if (r1 == r0) goto L37
        L32:
            boolean r0 = r3.LJLL
            if (r0 == 0) goto L50
            return
        L37:
            r0 = 2131839405(0x7f1149ad, float:1.931206E38)
            java.lang.String r1 = X.C15380j0.LJIILJJIL(r0)
            goto L46
        L3f:
            r0 = 2131839406(0x7f1149ae, float:1.9312063E38)
            java.lang.String r1 = X.C15380j0.LJIILJJIL(r0)
        L46:
            if (r1 == 0) goto L32
            X.1t6 r0 = r3.getViewPauseStatusTv()
            r0.setText(r1)
            goto L32
        L50:
            r2 = 1
            r3.LJLL = r2
            X.0jG r1 = new X.0jG
            r1.<init>()
            X.2A4 r0 = r3.getViewPauseAnim()
            r1.LIZLLL(r0)
            java.lang.String r0 = "tiktok_live_watch_resource_normal_1"
            r1.LIZIZ = r0
            java.lang.String r0 = "ttlive_pause_live_anim.webp"
            r1.LIZJ = r0
            r1.LJFF = r2
            X.C15490jB.LJI(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75778Toc.setupResumeUI(X.ToZ):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75778Toc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = EnumC75775ToZ.NORMAL;
        this.LJLILLLLZI = "";
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 37));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 35));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 38));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 36));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.den, this, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (r8 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C75589TlZ r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75778Toc.LJ(X.TlZ, boolean):void");
    }
}
