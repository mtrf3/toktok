package com.bytedance.android.live.liveinteract.multihost.usercard;

import X.AbstractC29482Bhe;
import X.AbstractC73672Svk;
import X.B5G;
import X.C0K2;
import X.C16880lQ;
import X.C29457BhF;
import X.C29484Bhg;
import X.C29547Bih;
import X.C29548Bii;
import X.C2A7;
import X.C35331a5;
import X.C62822Ol8;
import X.C73805Sxt;
import X.C75648TmW;
import X.EnumC75636TmK;
import X.InterfaceC29444Bh2;
import X.Q7L;
import Y.ACListenerS25S0100000_5;
import Y.AUListenerS0S0200001_5;
import Y.IDaS216S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkCoHostInviteEntranceShowEvent;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.linkmic.GetUserLinkmicStatusResponse;

/* loaded from: classes6.dex */
public final class CoHostUserCardCell extends AbstractC29482Bhe<C29547Bih> implements GenericLifecycleObserver {
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public ViewGroup LJLJL;
    public C2A7 LJLJLJ;
    public InterfaceC29444Bh2 LJLJLLL;
    public final C62822Ol8 LJLL;
    public User LJLLI;
    public ValueAnimator LJLLILLLL;
    public final boolean LJLLJ;
    public C29547Bih LJLLL;
    public final long LJLLLL;
    public final Map<String, String> LJLLLLLL;
    public final String LJLZ;
    public long LJZ;
    public final int LJZI;
    public boolean LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public final int LLFF;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        ValueAnimator valueAnimator = this.LJLLILLLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            C16880lQ.LJLJL(valueAnimator);
            valueAnimator.cancel();
        }
    }

    public final C2A7 LJIIJJI() {
        return (C2A7) this.LJLL.getValue();
    }

    public final AbstractC73672Svk<C29547Bih> LJIILIIL() {
        LinkApi linkApi = (LinkApi) Q7L.LIZIZ(LinkApi.class);
        long id = this.LJLIL.LJFF.getId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        C73805Sxt LJJIJL = linkApi.checkPermissionV3(id, true, linkedHashMap).LJJIJL(C29457BhF.LJLIL);
        CoHostApi coHostApi = (CoHostApi) Q7L.LIZIZ(CoHostApi.class);
        long id2 = this.LJLIL.LJFF.getId();
        C29484Bhg c29484Bhg = this.LJLIL;
        return AbstractC73672Svk.LJJLL(LJJIJL, coHostApi.getLinkMicUserStatus(id2, c29484Bhg.LJIIIZ, c29484Bhg.LIZJ.LIZ.roomId).LJJIIJZLJL().LJIIZILJ(new IDaS216S0100000_5(this, 0)), C29548Bii.LJLIL);
    }

    @Override // X.AbstractC29482Bhe
    public final int LIZJ() {
        return this.LLFF;
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJ() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC29482Bhe
    public final int LJI() {
        return this.LLF;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CoHostUserCardCell(X.C29484Bhg r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            X.BhE r0 = r4.LIZJ
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L9a
            X.BhE r0 = r4.LIZJ
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto L9a
            X.BhE r1 = r4.LIZJ
            com.bytedance.android.livesdk.event.UserProfileEvent r0 = r1.LIZ
            boolean r0 = r0.coHostEnable
            if (r0 != 0) goto L21
            boolean r0 = r1.LJ()
            if (r0 == 0) goto L9a
        L21:
            r0 = 1
        L22:
            r3.LJLJJL = r0
            X.BhE r0 = r4.LIZJ
            boolean r0 = r0.LJ()
            r0 = r0 ^ 1
            r3.LJLJJLL = r0
            kotlin.jvm.internal.AqS155S0100000_5 r1 = new kotlin.jvm.internal.AqS155S0100000_5
            r0 = 36
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLL = r0
            X.BhE r0 = r4.LIZJ
            com.bytedance.android.livesdk.event.UserProfileEvent r2 = r0.LIZ
            boolean r0 = r2.currentHasMultiCoHostPermission
            r3.LJLLJ = r0
            long r0 = r2.roomId
            r3.LJLLLL = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.mRankInfo
            r3.LJLLLLLL = r0
            java.lang.String r0 = r4.LJI
            r3.LJLZ = r0
            android.content.Context r1 = r4.LIZ
            r0 = 2130970607(0x7f0407ef, float:1.7549929E38)
            int r0 = X.C259910h.LJ(r0, r1)
            r3.LJZI = r0
            com.bytedance.android.livesdk.livesetting.roomfunction.LiveNickNameFontOptSetting r1 = com.bytedance.android.livesdk.livesetting.roomfunction.LiveNickNameFontOptSetting.INSTANCE
            boolean r0 = r1.enableOptRoundCorner()
            if (r0 == 0) goto L96
            r0 = 2131887541(0x7f1205b5, float:1.9409692E38)
        L65:
            r3.LL = r0
            boolean r0 = r1.enableOptRoundCorner()
            if (r0 == 0) goto L92
            r0 = 2131887540(0x7f1205b4, float:1.940969E38)
        L70:
            r3.LLD = r0
            androidx.lifecycle.LifecycleOwner r0 = r4.LIZIZ
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r3)
            r1 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r3.LLF = r0
            int r0 = X.C7MY.LIZIZ(r1)
            r3.LLFF = r0
            return
        L92:
            r0 = 2131887156(0x7f120434, float:1.9408911E38)
            goto L70
        L96:
            r0 = 2131887159(0x7f120437, float:1.9408917E38)
            goto L65
        L9a:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell.<init>(X.Bhg):void");
    }

    public static void LJIIJ(C2A7 c2a7) {
        if (c2a7.getVisibility() != 0) {
            return;
        }
        c2a7.setIcon((Drawable) null);
        ViewGroup.LayoutParams layoutParams = c2a7.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = 4.7f;
        c2a7.setLayoutParams(layoutParams2);
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.djh, C16880lQ.LLZIL(context), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup = (ViewGroup) LLLZIIL;
        this.LJLJL = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.ftp);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.linkmic_button)");
        C2A7 c2a7 = (C2A7) findViewById;
        this.LJLJLJ = c2a7;
        c2a7.LJJLL(this.LL);
        C2A7 c2a72 = this.LJLJLJ;
        if (c2a72 != null) {
            c2a72.setIcon(this.LJZI);
            this.LJZ = SystemClock.uptimeMillis();
            ViewGroup viewGroup2 = this.LJLJL;
            if (viewGroup2 != null) {
                return viewGroup2;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("linkmicButton");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.AbstractC29482Bhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd<? super X.C29547Bih> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C29546Big
            if (r0 == 0) goto L1e
            r4 = r6
            X.Big r4 = (X.C29546Big) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L24
            goto L47
        L1e:
            X.Big r4 = new X.Big
            r4.<init>(r5, r6)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r1)
            android.os.SystemClock.uptimeMillis()
            X.Svk r1 = r5.LJIILIIL()     // Catch: java.lang.Throwable -> L4d
            X.T0k r0 = X.T16.LIZ()     // Catch: java.lang.Throwable -> L4d
            X.Sro r0 = r1.LJJL(r0)     // Catch: java.lang.Throwable -> L4d
            r4.LJLJI = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r1 = X.C29306Beo.LJJIIZ(r0, r4)     // Catch: java.lang.Throwable -> L4d
            if (r1 != r3) goto L4a
            return r3
        L47:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L4d
        L4a:
            X.Bih r1 = (X.C29547Bih) r1     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell.LJIIIZ(X.2kd):java.lang.Object");
    }

    public final void LJIILJJIL(boolean z) {
        ValueAnimator valueAnimator;
        String str;
        boolean z2;
        GetUserLinkmicStatusResponse.ResponseData responseData;
        String str2 = "";
        if (this.LJLLJ) {
            long uptimeMillis = this.LJZ - SystemClock.uptimeMillis();
            C2A7 c2a7 = this.LJLJLJ;
            if (c2a7 != null) {
                c2a7.setIcon(this.LJZI);
                C29547Bih c29547Bih = this.LJLLL;
                if (c29547Bih != null && c29547Bih.LIZIZ != null) {
                    LJIIL(0, uptimeMillis);
                    C29547Bih c29547Bih2 = this.LJLLL;
                    if (c29547Bih2 != null && (responseData = c29547Bih2.LIZIZ) != null && responseData.blockReason == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        User user = this.LJLLI;
                        if (user != null) {
                            if (!user.isBlock && user.isFollowing()) {
                                C2A7 c2a72 = this.LJLJLJ;
                                if (c2a72 != null) {
                                    c2a72.setText(R.string.n8l);
                                    C2A7 c2a73 = this.LJLJLJ;
                                    if (c2a73 != null) {
                                        c2a73.setVisibility(0);
                                    } else {
                                        o.LJIJI("linkmicButton");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                            } else {
                                LJIIJ(LJIIJJI());
                                C2A7 c2a74 = this.LJLJLJ;
                                if (c2a74 != null) {
                                    c2a74.setVisibility(0);
                                    C2A7 c2a75 = this.LJLJLJ;
                                    if (c2a75 != null) {
                                        c2a75.setText("");
                                    } else {
                                        o.LJIJI("linkmicButton");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("userInfo");
                            throw null;
                        }
                    } else {
                        User user2 = this.LJLLI;
                        if (user2 != null) {
                            if (!user2.isBlock && user2.isFollowing()) {
                                C2A7 c2a76 = this.LJLJLJ;
                                if (c2a76 != null) {
                                    c2a76.setText(R.string.n8l);
                                } else {
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                            } else {
                                C2A7 c2a77 = this.LJLJLJ;
                                if (c2a77 != null) {
                                    c2a77.setText("");
                                } else {
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                            }
                            LJIIJ(LJIIJJI());
                            C2A7 c2a78 = this.LJLJLJ;
                            if (c2a78 != null) {
                                c2a78.setVisibility(0);
                                C2A7 c2a79 = this.LJLJLJ;
                                if (c2a79 != null) {
                                    c2a79.setEnabled(false);
                                    C2A7 c2a710 = this.LJLJLJ;
                                    if (c2a710 != null) {
                                        c2a710.LJJLL(this.LLD);
                                    } else {
                                        o.LJIJI("linkmicButton");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("linkmicButton");
                                throw null;
                            }
                        } else {
                            o.LJIJI("userInfo");
                            throw null;
                        }
                    }
                } else {
                    LJIIL(1, uptimeMillis);
                    LJIIJ(LJIIJJI());
                    C2A7 c2a711 = this.LJLJLJ;
                    if (c2a711 != null) {
                        c2a711.setVisibility(8);
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("linkmicButton");
                throw null;
            }
        } else {
            LJIIJ(LJIIJJI());
            C2A7 c2a712 = this.LJLJLJ;
            if (c2a712 != null) {
                c2a712.setVisibility(0);
                C2A7 c2a713 = this.LJLJLJ;
                if (c2a713 != null) {
                    c2a713.setIcon(this.LJZI);
                    if (B5G.LIZIZ().LIZJ() == EnumC75636TmK.INVITING) {
                        C2A7 c2a714 = this.LJLJLJ;
                        if (c2a714 != null) {
                            c2a714.setEnabled(false);
                        } else {
                            o.LJIJI("linkmicButton");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("linkmicButton");
                    throw null;
                }
            } else {
                o.LJIJI("linkmicButton");
                throw null;
            }
        }
        C2A7 c2a715 = this.LJLJLJ;
        if (c2a715 != null) {
            if (c2a715.getVisibility() == 0 && !this.LJZL) {
                this.LJZL = true;
                if (B5G.LIZIZ().LJJJ != null) {
                    C75648TmW c75648TmW = B5G.LIZIZ().LJJJ;
                    if (c75648TmW != null && (str = c75648TmW.LIZ) != null) {
                        str2 = str;
                    }
                } else {
                    str2 = "rank";
                }
                this.LJLILLLLZI.qv0(LinkCoHostInviteEntranceShowEvent.class, str2);
            }
            C2A7 c2a716 = this.LJLJLJ;
            if (c2a716 != null) {
                C16880lQ.LJJIII(c2a716, new ACListenerS25S0100000_5(this, 31));
                C2A7 c2a717 = this.LJLJLJ;
                if (c2a717 != null) {
                    if (c2a717.getVisibility() == 0) {
                        ViewGroup.LayoutParams layoutParams = LJIIJJI().getLayoutParams();
                        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        C2A7 c2a718 = this.LJLJLJ;
                        if (c2a718 != null) {
                            o.LJII(c2a718.getLayoutParams(), "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            float f = (3.6999998f / 6) + 1.0f;
                            ValueAnimator valueAnimator2 = this.LJLLILLLL;
                            if (valueAnimator2 != null) {
                                valueAnimator2.removeAllUpdateListeners();
                                C16880lQ.LJLJL(valueAnimator2);
                                valueAnimator2.cancel();
                            }
                            if (z) {
                                valueAnimator = ValueAnimator.ofFloat(1.0f, 4.7f);
                                valueAnimator.setDuration(300L);
                                valueAnimator.setInterpolator(new C35331a5());
                            } else {
                                valueAnimator = null;
                            }
                            this.LJLLILLLL = valueAnimator;
                            User user3 = this.LJLLI;
                            if (user3 != null) {
                                if (!user3.isBlock && user3.isFollowing()) {
                                    if (!z || layoutParams2.weight == 1.0f) {
                                        layoutParams2.weight = 1.0f;
                                        LJIIJJI().setLayoutParams(layoutParams2);
                                        return;
                                    }
                                    ValueAnimator valueAnimator3 = this.LJLLILLLL;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.addUpdateListener(new AUListenerS0S0200001_5(f, this, layoutParams2, 2));
                                    }
                                    ValueAnimator valueAnimator4 = this.LJLLILLLL;
                                    if (valueAnimator4 == null) {
                                        return;
                                    }
                                    valueAnimator4.start();
                                    return;
                                }
                                if (!z || layoutParams2.weight == 4.7f) {
                                    C2A7 c2a719 = this.LJLJLJ;
                                    if (c2a719 != null) {
                                        if (c2a719.getVisibility() == 0) {
                                            layoutParams2.weight = 4.7f;
                                        } else {
                                            layoutParams2.weight = 1.0f;
                                        }
                                        LJIIJJI().setLayoutParams(layoutParams2);
                                        return;
                                    }
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                                ValueAnimator valueAnimator5 = this.LJLLILLLL;
                                if (valueAnimator5 != null) {
                                    valueAnimator5.addUpdateListener(new AUListenerS0S0200001_5(f, this, layoutParams2, 3));
                                }
                                ValueAnimator valueAnimator6 = this.LJLLILLLL;
                                if (valueAnimator6 == null) {
                                    return;
                                }
                                valueAnimator6.start();
                                return;
                            }
                            o.LJIJI("userInfo");
                            throw null;
                        }
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("linkmicButton");
                throw null;
            }
            o.LJIJI("linkmicButton");
            throw null;
        }
        o.LJIJI("linkmicButton");
        throw null;
    }

    public final void LJIIL(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("status_delay", i);
            jSONObject2.put("panel_cost", j);
            jSONObject3.put("status_delay", i);
            jSONObject3.put("panel_cost", j);
            jSONObject3.put("room_id", this.LJLLLL);
            jSONObject3.put("anchor_id", this.LJLIL.LJIIIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C0K2.LJI("ttlive_client_previewcard_linkmicstatus_delay", jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        if (r11.LIZ == true) goto L12;
     */
    @Override // X.AbstractC29482Bhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.live.base.model.user.User r8, boolean r9, boolean r10, X.C29547Bih r11) {
        /*
            r7 = this;
            X.Bih r11 = (X.C29547Bih) r11
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r7.LJLLI = r8
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r4 = 0
            r3 = -1
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r4, r3, r0)
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = X.C15380j0.LIZ(r0)
            r6.setMarginStart(r0)
            int r0 = r6.getMarginStart()
            r6.leftMargin = r0
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = X.C15380j0.LIZ(r0)
            r6.setMarginEnd(r0)
            int r0 = r6.getMarginEnd()
            r6.rightMargin = r0
            java.lang.Class<com.bytedance.android.live.usercard.IUserCardService> r0 = com.bytedance.android.live.usercard.IUserCardService.class
            X.0Mx r2 = X.CN1.LIZ(r0)
            com.bytedance.android.live.usercard.IUserCardService r2 = (com.bytedance.android.live.usercard.IUserCardService) r2
            X.Bhg r1 = r7.LJLIL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.LJLILLLLZI
            X.Bh6 r2 = r2.Ln0(r1, r8, r0)
            r7.LJLJLLL = r2
            r5 = 0
            java.lang.String r1 = "followButtonApi"
            if (r2 == 0) goto Le4
            android.view.ViewGroup r0 = r7.LJLJL
            if (r0 == 0) goto Lde
            r2.LIZJ(r3, r6, r0)
            X.Bh2 r0 = r7.LJLJLLL
            if (r0 == 0) goto Lda
            androidx.lifecycle.MutableLiveData r3 = r0.LIZIZ()
            X.Bhg r0 = r7.LJLIL
            androidx.lifecycle.LifecycleOwner r2 = r0.LIZIZ
            Y.AObserverS73S0100000_5 r1 = new Y.AObserverS73S0100000_5
            r0 = 51
            r1.<init>(r7, r0)
            r3.observe(r2, r1)
            r7.LJLLL = r11
            if (r11 == 0) goto Ld0
            boolean r1 = r11.LIZ
            r0 = 1
            if (r1 != r0) goto Ld0
        L6d:
            java.lang.String r2 = "linkmicButton"
            r1 = 8
            if (r0 == 0) goto Lc8
            r7.LJIILJJIL(r4)
        L76:
            X.2A7 r0 = r7.LJLJLJ
            if (r0 == 0) goto Ld2
            int r0 = r0.getVisibility()
            if (r0 != r1) goto La7
            X.2A7 r0 = r7.LJIIJJI()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La7
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto La7
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.setMarginStart(r0)
            int r0 = r1.getMarginStart()
            r1.leftMargin = r0
        La7:
            com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserPreviewOptPackageSetting r0 = com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserPreviewOptPackageSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto Lc7
            X.T0h r2 = X.C73943T0h.LIZ()
            X.Bhg r0 = r7.LJLIL
            androidx.lifecycle.LifecycleOwner r1 = r0.LIZIZ
            java.lang.Class<X.BEU> r0 = X.BEU.class
            X.Bng r2 = r2.LIZJ(r1, r0)
            Y.AfS54S0200000_5 r1 = new Y.AfS54S0200000_5
            r0 = 59
            r1.<init>(r7, r8, r0)
            r2.LIZIZ(r1)
        Lc7:
            return
        Lc8:
            X.2A7 r0 = r7.LJLJLJ
            if (r0 == 0) goto Ld6
            r0.setVisibility(r1)
            goto L76
        Ld0:
            r0 = 0
            goto L6d
        Ld2:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r5
        Ld6:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r5
        Lda:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        Lde:
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        Le4:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell.LJII(com.bytedance.android.live.base.model.user.User, boolean, boolean, java.lang.Object):void");
    }
}
