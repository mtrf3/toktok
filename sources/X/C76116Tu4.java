package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tu4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76116Tu4 extends ConstraintLayout implements InterfaceC76717U8z {
    public final String LJLIL;
    public final DataChannel LJLILLLLZI;
    public final int LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public C75989Ts1 LJLLL;
    public EnumC75419Tip LJLLLL;
    public Rect LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;

    @Override // X.InterfaceC76717U8z
    public final boolean isEmpty() {
        return false;
    }

    private final C47121t6 getCrossArcTestTv() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-crossArcTestTv>(...)");
        return (C47121t6) value;
    }

    private final ConstraintLayout getProfileContainer() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-profileContainer>(...)");
        return (ConstraintLayout) value;
    }

    private final View getViewAnchorInfoLayout() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-viewAnchorInfoLayout>(...)");
        return (View) value;
    }

    private final View getViewContainerBg() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-viewContainerBg>(...)");
        return (View) value;
    }

    private final ConstraintLayout getViewContainerRoot() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-viewContainerRoot>(...)");
        return (ConstraintLayout) value;
    }

    private final C47121t6 getViewDisplayId() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-viewDisplayId>(...)");
        return (C47121t6) value;
    }

    private final AppCompatImageView getViewFollowStatus() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-viewFollowStatus>(...)");
        return (AppCompatImageView) value;
    }

    private final CVT getViewLoading() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-viewLoading>(...)");
        return (CVT) value;
    }

    private final AppCompatImageView getViewMuteAudienceStatus() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-viewMuteAudienceStatus>(...)");
        return (AppCompatImageView) value;
    }

    private final C75778Toc getViewPauseContainer() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-viewPauseContainer>(...)");
        return (C75778Toc) value;
    }

    public final void LJJZ() {
        if (!this.LJLZ) {
            getViewContainerBg().setVisibility(8);
            getViewLoading().setVisibility(8);
            getViewPauseContainer().LJ(new C75589TlZ(EnumC75775ToZ.NORMAL, getLinkMicId()), false);
        }
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getAudioMute() {
        return Boolean.valueOf(this.LJZ);
    }

    @Override // X.InterfaceC76717U8z
    public Integer getLogicPos() {
        return Integer.valueOf(this.LJLJI);
    }

    @Override // X.InterfaceC76717U8z
    public Integer getUiPos() {
        return Integer.valueOf(this.LJLJI);
    }

    @Override // X.InterfaceC76717U8z
    public Long getUid() {
        C75989Ts1 c75989Ts1 = this.LJLLL;
        if (c75989Ts1 != null) {
            return Long.valueOf(c75989Ts1.LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC76717U8z
    public int getH() {
        return getHeight();
    }

    @Override // X.InterfaceC76717U8z
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getX() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getLeft();
        }
        return -1;
    }

    @Override // android.view.View, X.InterfaceC76717U8z
    public int getY() {
        View view;
        Object parent = getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            return view.getTop();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttachedToWindow, linkMicId = ");
        LIZ.append(getLinkMicId());
        LIZ.append(", user = ");
        LIZ.append(this.LJLLL);
        LIZ.append(", ---------");
        C0NB.LJIIIZ("MultiHostFeedWindowView", X1D.LIZIZ(LIZ));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("detach from window, linkMicId=");
        LIZ.append(getLinkMicId());
        C0NB.LJIIIZ("MultiHostFeedWindowView", X1D.LIZIZ(LIZ));
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    public final EnumC75419Tip getCurrentWindowViewState() {
        return this.LJLLLL;
    }

    public final boolean getIsPauseUIShowing() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC76717U8z
    public String getLinkMicId() {
        return this.LJLIL;
    }

    public final Rect getLocation() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC76717U8z
    public Boolean getVideoMute() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0031, code lost:
    
        if (r5 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupAnchorInfo(int r8) {
        /*
            r7 = this;
            X.Ts1 r0 = r7.LJLLL
            r3 = 0
            if (r0 == 0) goto L9f
            boolean r0 = r0.LJIIJ
        L7:
            r7.LJJZZIII(r0)
            X.Tu6 r6 = X.C76118Tu6.LJLIL
            X.Ts1 r0 = r7.LJLLL
            r2 = 1
            if (r0 == 0) goto L88
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r0.LJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != r2) goto L88
        L1b:
            X.1t6 r0 = r7.getViewDisplayId()
            X.C29306Beo.LJJLIIIJJI(r0, r3)
        L22:
            X.Ts1 r5 = r7.LJLLL
            java.lang.String r4 = ""
            if (r5 == 0) goto L30
            X.ToS r0 = r5.LJI
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L33
        L30:
            r1 = r4
            if (r5 == 0) goto L3b
        L33:
            X.ToS r0 = r5.LJI
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.LIZIZ
            if (r0 != 0) goto L86
        L3b:
            java.lang.String r1 = X.C05170If.LIZIZ(r1, r4)
            java.lang.String r0 = "displayName"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L54
            X.1t6 r0 = r7.getViewDisplayId()
            r0.setText(r1)
            r6.getClass()
        L54:
            X.Ts1 r0 = r7.LJLLL
            if (r0 == 0) goto L6a
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r0.LJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != r2) goto L6a
        L62:
            android.view.View r0 = r7.getViewAnchorInfoLayout()
            X.C29306Beo.LJJLIIIJJI(r0, r3)
        L69:
            return
        L6a:
            X.Ts1 r0 = r7.LJLLL
            if (r0 == 0) goto L79
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r0.LJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != r2) goto L79
            goto L62
        L79:
            android.view.View r0 = r7.getViewAnchorInfoLayout()
            X.C29306Beo.LJJLIIIJJI(r0, r2)
            X.TmC r0 = X.RunnableC75628TmC.LJLIL
            r7.post(r0)
            goto L69
        L86:
            r4 = r0
            goto L3b
        L88:
            X.Ts1 r0 = r7.LJLLL
            if (r0 == 0) goto L97
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r0.LJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != r2) goto L97
            goto L1b
        L97:
            X.1t6 r0 = r7.getViewDisplayId()
            X.C29306Beo.LJJLIIIJJI(r0, r2)
            goto L22
        L9f:
            r0 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76116Tu4.setupAnchorInfo(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r3 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(float r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.getViewAnchorInfoLayout()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.05p r1 = (X.C018905p) r1
            r1.matchConstraintPercentWidth = r5
            android.view.View r0 = r4.getViewAnchorInfoLayout()
            r0.setLayoutParams(r1)
            X.Ts1 r3 = r4.LJLLL
            java.lang.String r2 = ""
            if (r3 == 0) goto L26
            X.ToS r0 = r3.LJI
            if (r0 == 0) goto L26
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L29
        L26:
            r1 = r2
            if (r3 == 0) goto L31
        L29:
            X.ToS r0 = r3.LJI
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.LIZIZ
            if (r0 != 0) goto L4c
        L31:
            java.lang.String r1 = X.C05170If.LIZIZ(r1, r2)
            if (r1 == 0) goto L44
            int r0 = r1.length()
            if (r0 <= 0) goto L44
            X.1t6 r0 = r4.getViewDisplayId()
            r0.setText(r1)
        L44:
            android.view.View r0 = r4.getViewAnchorInfoLayout()
            r0.requestLayout()
            return
        L4c:
            r2 = r0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76116Tu4.LJJLJLI(float):void");
    }

    public final void LJJLL(EnumC75419Tip state) {
        o.LJIIIZ(state, "state");
        if (state == this.LJLLLL) {
            return;
        }
        this.LJLLLL = state;
        int i = C75729Tnp.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJJZ();
                return;
            }
            LJJZ();
            return;
        }
        if (this.LJLZ) {
            return;
        }
        getViewContainerBg().setVisibility(0);
        getViewLoading().setVisibility(0);
        getViewPauseContainer().LJ(new C75589TlZ(EnumC75775ToZ.PULLING_STREAM, getLinkMicId()), false);
    }

    public final void LJJZZIII(boolean z) {
        this.LJZ = z;
        C75989Ts1 c75989Ts1 = this.LJLLL;
        boolean z2 = true;
        if (c75989Ts1 != null && o.LJ(c75989Ts1.LIZ, c75989Ts1.LJ)) {
            setAudienceMuteState(false);
        } else {
            setAudienceMuteState(z);
        }
        StringBuilder LJI = JBR.LJI("updateMuteIcon, muteStatus=", z, ", viewMuteAudienceStatus.isVisible=");
        if (getViewMuteAudienceStatus().getVisibility() != 0) {
            z2 = false;
        }
        FT5.LJ(LJI, z2, LJI, "MultiHostFeedWindowView");
    }

    public final void LJL(boolean z) {
        Long l;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePauseUIByStateManager, uid=");
        C75989Ts1 c75989Ts1 = this.LJLLL;
        if (c75989Ts1 != null) {
            l = Long.valueOf(c75989Ts1.LIZIZ);
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(", isShow=");
        LIZ.append(z);
        C0NB.LJIIIZ("MultiHostFeedWindowView", X1D.LIZIZ(LIZ));
        if (z) {
            if (!this.LJLZ) {
                this.LJLZ = true;
                getViewContainerBg().setVisibility(0);
                getViewLoading().setVisibility(8);
                getViewPauseContainer().LJ(new C75589TlZ(EnumC75775ToZ.PAUSE, getLinkMicId()), false);
                return;
            }
            return;
        }
        this.LJLZ = false;
        LJJZ();
    }

    public void setAudienceMuteState(boolean z) {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            return;
        }
        if (z) {
            LJJLJLI(0.5f);
            C29306Beo.LJJLIIIJJI(getViewMuteAudienceStatus(), true);
        } else {
            if (getViewMuteAudienceStatus().getVisibility() != 0) {
                return;
            }
            C29306Beo.LJJLIIIJJI(getViewMuteAudienceStatus(), false);
            LJJLJLI(0.43f);
        }
    }

    public final void setLocation(Rect rect) {
        this.LJLLLLLL = rect;
    }

    public final void LJJZZI(C75989Ts1 c75989Ts1, int i) {
        if (!TextUtils.equals(c75989Ts1.LIZ, getLinkMicId())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateCoHostUser, return, user.linkMicId != linkMicId, new_linkMicId=");
            LIZ.append(c75989Ts1.LIZ);
            LIZ.append(", old_linkMicId=");
            LIZ.append(getLinkMicId());
            LIZ.append(", user = ");
            LIZ.append(c75989Ts1);
            C0NB.LJIIIZ("MultiHostFeedWindowView", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateCoHostUser, linkMicId = ");
        LIZ2.append(getLinkMicId());
        LIZ2.append(", linkedUserSize = ");
        LIZ2.append(i);
        LIZ2.append(", user = ");
        LIZ2.append(c75989Ts1);
        C0NB.LJIIIZ("MultiHostFeedWindowView", X1D.LIZIZ(LIZ2));
        this.LJLLL = c75989Ts1;
        int i2 = c75989Ts1.LJII;
        if (C76117Tu5.LIZ()) {
            C47121t6 crossArcTestTv = getCrossArcTestTv();
            if (crossArcTestTv != null) {
                C29306Beo.LJJLIIIJJI(crossArcTestTv, true);
            }
            if (i2 == EnumC31946CgI.CROSS_ROOM_ARCH.getType()) {
                C47121t6 crossArcTestTv2 = getCrossArcTestTv();
                if (crossArcTestTv2 != null) {
                    crossArcTestTv2.setText(C15380j0.LJIILJJIL(R.string.soc));
                }
            } else {
                C47121t6 crossArcTestTv3 = getCrossArcTestTv();
                if (crossArcTestTv3 != null) {
                    crossArcTestTv3.setText(C15380j0.LJIILJJIL(R.string.sod));
                }
            }
        } else {
            C47121t6 crossArcTestTv4 = getCrossArcTestTv();
            if (crossArcTestTv4 != null) {
                C29306Beo.LJJLIIIJJI(crossArcTestTv4, false);
            }
        }
        setupAnchorInfo(0);
        getViewPauseContainer().LJLJI = i;
        getViewPauseContainer().LIZLLL();
        LJL(c75989Ts1.LJIIJJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76116Tu4(int i, Context context, DataChannel dataChannel, String str) {
        super(context);
        float f;
        new LinkedHashMap();
        this.LJLIL = str;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = i;
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 386));
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 385));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 376));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 378));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 384));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 383));
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 377));
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 387));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 374));
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 382));
        this.LJLLLL = EnumC75419Tip.StateInit;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dem, this, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, linkMicId = ");
        LIZ.append(getLinkMicId());
        C0NB.LJIIIZ("MultiHostFeedWindowView", X1D.LIZIZ(LIZ));
        setTag(getLinkMicId());
        if (C76117Tu5.LIZ()) {
            C47121t6 crossArcTestTv = getCrossArcTestTv();
            if (crossArcTestTv != null) {
                C29306Beo.LJJLIIIJJI(crossArcTestTv, true);
            }
            C47121t6 crossArcTestTv2 = getCrossArcTestTv();
            if (crossArcTestTv2 != null) {
                crossArcTestTv2.setText("default");
            }
        } else {
            C47121t6 crossArcTestTv3 = getCrossArcTestTv();
            if (crossArcTestTv3 != null) {
                C29306Beo.LJJLIIIJJI(crossArcTestTv3, false);
            }
        }
        ((C80955Vpv) findViewById(R.id.dcz)).setEnableSizeChange(true);
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.bcl);
        anonymousClass064.LJII(constraintLayout);
        anonymousClass064.LJIJJLI(R.id.dc6, 7, C15380j0.LIZ(12.0f));
        anonymousClass064.LIZIZ(constraintLayout);
        if (getViewMuteAudienceStatus().getVisibility() == 0) {
            f = 0.5f;
        } else {
            f = 0.43f;
        }
        LJJLJLI(f);
    }
}
