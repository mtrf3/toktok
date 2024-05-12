package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component;

import X.AbstractC90763hI;
import X.C118274kZ;
import X.C118444kq;
import X.C118464ks;
import X.C34B;
import X.C3Q9;
import X.C47778Ip4;
import X.C4WC;
import X.C63120Opw;
import X.C75782yE;
import X.C79146V4k;
import X.C81273Gx;
import X.C84673XKz;
import X.C99163uq;
import X.C99423vG;
import X.InterfaceC1032943p;
import X.InterfaceC118454kr;
import X.InterfaceC36571c5;
import X.InterfaceC70422pa;
import X.MBA;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatRoomAlphaVideoComponent implements GenericLifecycleObserver, InterfaceC70422pa {
    public final Fragment LJLIL;
    public final ViewStub LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public C118444kq LJLJLJ;
    public final C118464ks LJLJLLL;
    public final C84673XKz LJLL;
    public final boolean LJLLI;
    public boolean LJLLILLLL;
    public C118274kZ LJLLJ;
    public String LJLLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$im_base_release() {
        this.LJLJL = true;
        C118274kZ c118274kZ = this.LJLLJ;
        if (c118274kZ != null) {
            ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = c118274kZ.LJLJJI;
            if (chatRoomAlphaVideoComponent.LJLLILLLL && (c118274kZ.LJLIL & 2) > 0) {
                chatRoomAlphaVideoComponent.LJLLILLLL = false;
                c118274kZ.LJIIZILJ(c118274kZ.LJLILLLLZI, true);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$im_base_release();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume$im_base_release();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause$im_base_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$im_base_release();
        }
    }

    public final void LJII() {
        PlayerController playerController;
        try {
            C118444kq c118444kq = this.LJLJLJ;
            if (c118444kq != null) {
                c118444kq.setVisibility(8);
                C118444kq c118444kq2 = this.LJLJLJ;
                if (c118444kq2 != null && (playerController = c118444kq2.LJLIL) != null) {
                    playerController.cancel();
                }
            }
            this.LJLJJL = false;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopPlayAlphaVideo exception ");
            LIZ.append(e);
            C34B.LJI("AlphaVideoView", X1D.LIZIZ(LIZ));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$im_base_release() {
        InterfaceC118454kr interfaceC118454kr;
        int i;
        if (this.LJLLI) {
            InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
            if ((interfaceC36571c5 instanceof InterfaceC118454kr) && (interfaceC118454kr = (InterfaceC118454kr) interfaceC36571c5) != null) {
                int i2 = 0;
                if (C99423vG.LIZ()) {
                    i = 4;
                } else {
                    i = 0;
                }
                if (C99163uq.LIZ()) {
                    i2 = 2;
                }
                C118274kZ c118274kZ = new C118274kZ(this, i | i2);
                interfaceC118454kr.setUpAnimatedEmojiCheck(c118274kZ);
                this.LJLLJ = c118274kZ;
                interfaceC118454kr.addOnPanelChangeListener(new InterfaceC1032943p() { // from class: X.4S8
                    @Override // X.InterfaceC1032943p
                    public final void LJIIL(View view, int i3, int i4, boolean z) {
                        int i5;
                        ViewGroup.LayoutParams layoutParams;
                        boolean z2 = true;
                        if (i4 != 1 && i4 != -2) {
                            z2 = false;
                        }
                        int LIZ = C99583vW.LIZ(0);
                        int LJIIIZ = KL2.LJIIIZ(EF7.LIZIZ());
                        if (z2) {
                            i5 = LJIIIZ - LIZ;
                        } else {
                            i5 = -1;
                        }
                        C118444kq c118444kq = ChatRoomAlphaVideoComponent.this.LJLJLJ;
                        if (c118444kq == null || (layoutParams = c118444kq.getLayoutParams()) == null || layoutParams.height == i5) {
                            return;
                        }
                        layoutParams.height = i5;
                        C118444kq c118444kq2 = ChatRoomAlphaVideoComponent.this.LJLJLJ;
                        if (c118444kq2 == null) {
                            return;
                        }
                        c118444kq2.setLayoutParams(layoutParams);
                    }
                });
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$im_base_release() {
        this.LJLL.LIZIZ(null);
        C118444kq c118444kq = this.LJLJLJ;
        if (c118444kq != null) {
            PlayerController playerController = c118444kq.LJLIL;
            if (playerController != null) {
                playerController.detachAlphaView(c118444kq);
            }
            PlayerController playerController2 = c118444kq.LJLIL;
            if (playerController2 != null) {
                playerController2.release();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause$im_base_release() {
        LJII();
        this.LJLJL = false;
        if (this.LJLLILLLL) {
            this.LJLLILLLL = false;
        }
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLL;
    }

    public final void LJFF(long j) {
        long j2;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLJI);
        AbstractC90763hI conversationModel = C81273Gx.LIZ(this.LJLJI);
        o.LJIIIZ(conversationModel, "conversationModel");
        if (LIZ != null) {
            Map<String, String> localExt = LIZ.getLocalExt();
            if (localExt == null) {
                localExt = new LinkedHashMap<>();
            }
            String str = localExt.get("a:animated_emoji_checked_index");
            if (str != null) {
                j2 = CastLongProtector.parseLong(str);
            } else {
                j2 = 0;
            }
            if (j > j2) {
                localExt.put("a:animated_emoji_checked_index", String.valueOf(j));
                LIZ.setLocalExt(localExt);
                conversationModel.LJIJJ(localExt, null);
            }
        }
    }

    public final void LJI(DataSource dataSource, boolean z) {
        C118444kq c118444kq;
        this.LJLJJL = true;
        C118444kq c118444kq2 = this.LJLJLJ;
        if (c118444kq2 == null || z) {
            if (this.LJLILLLLZI.getParent() != null) {
                View inflate = this.LJLILLLLZI.inflate();
                if (inflate instanceof C118444kq) {
                    c118444kq = (C118444kq) inflate;
                } else {
                    c118444kq = null;
                }
                this.LJLJLJ = c118444kq;
            }
            C118444kq c118444kq3 = this.LJLJLJ;
            if (c118444kq3 != null) {
                c118444kq3.setVisibility(0);
                Context context = c118444kq3.getContext();
                Fragment fragment = this.LJLIL;
                C118464ks action = this.LJLJLLL;
                o.LJIIIZ(action, "action");
                Configuration configuration = new Configuration();
                configuration.setContext(context);
                configuration.setLifecycleOwner(fragment);
                configuration.setAlphaVideoViewType(1);
                o.LJIIIIZZ(configuration, "Configuration()\n        …guration.GL_TEXTURE_VIEW)");
                try {
                    c118444kq3.LJLIL = PlayerController.get(configuration, new C47778Ip4(context));
                    C34B.LJI("AlphaVideoView", "use TTPlayerImpl");
                } catch (Exception e) {
                    c118444kq3.LJLIL = PlayerController.get(configuration, new DefaultSystemPlayer());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("use DefaultSystemPlayer, error: ");
                    LIZ.append(e);
                    C34B.LIZJ("AlphaVideoView", X1D.LIZIZ(LIZ));
                }
                PlayerController playerController = c118444kq3.LJLIL;
                if (playerController != null) {
                    playerController.withVideoAction(action);
                }
                PlayerController playerController2 = c118444kq3.LJLIL;
                if (playerController2 != null) {
                    playerController2.attachAlphaView(c118444kq3);
                }
                o.LJIIIZ(dataSource, "dataSource");
                PlayerController playerController3 = c118444kq3.LJLIL;
                if (playerController3 != null) {
                    playerController3.start(dataSource);
                    return;
                }
                return;
            }
            return;
        }
        c118444kq2.setVisibility(0);
        C118444kq c118444kq4 = this.LJLJLJ;
        if (c118444kq4 != null) {
            o.LJIIIZ(dataSource, "dataSource");
            PlayerController playerController4 = c118444kq4.LJLIL;
            if (playerController4 != null) {
                playerController4.start(dataSource);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r13, X.InterfaceC67352kd r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent.LIZ(java.util.List, X.2kd, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r22, X.InterfaceC67352kd r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent.LIZIZ(java.util.List, X.2kd, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bc -> B:10:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<? extends X.C109544Rq> r11, long r12, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C118394kl
            if (r0 == 0) goto Lbf
            r5 = r14
            X.4kl r5 = (X.C118394kl) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbf
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L12:
            java.lang.Object r7 = r5.LJLJJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJLL
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto Lc6
            java.lang.Object r1 = r5.LJLJI
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r11 = r5.LJLILLLLZI
            java.util.List r11 = (java.util.List) r11
            com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent r3 = r5.LJLIL
            X.C141335gf.LIZJ(r7)
        L2b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto La4
            r2 = 1
        L34:
            androidx.fragment.app.Fragment r1 = r3.LJLIL
            boolean r0 = r1 instanceof X.InterfaceC118454kr
            if (r0 == 0) goto L41
            X.4kr r1 = (X.InterfaceC118454kr) r1
            if (r1 == 0) goto L41
            r1.onAnimatedEmojiCheckCompleted(r2)
        L41:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L44:
            java.util.ArrayList r7 = X.C1JX.LJFF(r7)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.Iterator r9 = r11.iterator()
        L4e:
            boolean r3 = r9.hasNext()
            r0 = 0
            if (r3 == 0) goto L6b
            java.lang.Object r8 = r9.next()
            r3 = r8
            X.4Rq r3 = (X.C109544Rq) r3
            if (r3 == 0) goto L63
            long r0 = r3.getOrderIndex()
        L63:
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L4e
            r7.add(r8)
            goto L4e
        L6b:
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r11, r2)
            X.4Rq r3 = (X.C109544Rq) r3
            if (r3 == 0) goto L77
            long r0 = r3.getOrderIndex()
        L77:
            r10.LJFF(r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L97
            java.lang.String r1 = "ChatRoomAlphaVideoComponent"
            java.lang.String r0 = "already checked on first screen"
            X.C34B.LIZIZ(r1, r0)
            androidx.fragment.app.Fragment r1 = r10.LJLIL
            boolean r0 = r1 instanceof X.InterfaceC118454kr
            if (r0 == 0) goto L94
            X.4kr r1 = (X.InterfaceC118454kr) r1
            if (r1 == 0) goto L94
            r1.onAnimatedEmojiCheckCompleted(r2)
        L94:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L97:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L9f
            r3 = r10
            goto L34
        L9f:
            java.util.Iterator r1 = r7.iterator()
            r3 = r10
        La4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            X.4Rq r0 = (X.C109544Rq) r0
            r5.LJLIL = r3
            r5.LJLILLLLZI = r11
            r5.LJLJI = r1
            r5.LJLJJLL = r4
            java.lang.Object r7 = r3.LJ(r0, r11, r5)
            if (r7 != r6) goto L2b
            return r6
        Lbf:
            X.4kl r5 = new X.4kl
            r5.<init>(r10, r14)
            goto L12
        Lc6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent.LIZJ(java.util.List, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C109544Rq r13, java.util.List<? extends X.C109544Rq> r14, X.InterfaceC67352kd<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent.LJ(X.4Rq, java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4ks] */
    public ChatRoomAlphaVideoComponent(Fragment fragment, ViewStub viewStub, String conversationId, String enterFrom) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = fragment;
        this.LJLILLLLZI = viewStub;
        this.LJLJI = conversationId;
        this.LJLJJI = enterFrom;
        boolean z = true;
        this.LJLJJLL = true;
        this.LJLJLLL = new AlphaPlayerAction() { // from class: X.4ks
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void startAction() {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void endAction() {
                ChatRoomAlphaVideoComponent.this.LJII();
            }
        };
        this.LJLL = C79146V4k.LJIILIIL();
        if (!C99423vG.LIZ() && !C99163uq.LIZ()) {
            z = false;
        }
        this.LJLLI = z;
        this.LJLLL = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        r6 = X.C38485F8n.LLLFFI(r13, X.PVC.LIZ);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, boolean r27, X.InterfaceC67352kd<? super X.C76800UCe> r28) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent.LIZLLL(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, X.2kd):java.lang.Object");
    }
}
