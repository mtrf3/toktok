package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30261Gs implements C0TW {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final WeakReference<DataChannel> LIZ;
    public String LIZIZ;
    public String LIZJ;
    public LiveEffect LIZLLL;
    public WeakReference<ViewGroup> LJ;
    public InterfaceC88471Ynr<? super String, ? super String, Integer> LJFF;
    public C1XH LJI;
    public final C0PO LJII;
    public final C0PR LJIIIIZZ;

    @Override // X.C0TW
    public final void LIZLLL() {
        C1XH c1xh = this.LJI;
        if (c1xh != null) {
            c1xh.LIZLLL();
        }
        C0PR c0pr = this.LJIIIIZZ;
        if (c0pr != null) {
            c0pr.LJLJL = null;
            c0pr.LJLJJL.LJLJI = null;
            C30691Ij.LJLJJI = null;
            C29306Beo.LJI(c0pr);
        }
        C0PO c0po = this.LJII;
        if (c0po != null) {
            C29306Beo.LJI(c0po);
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C2BW.class)).LIZ = null;
            C30711Il c30711Il = c0po.LJLILLLLZI;
            c30711Il.LJLJJI = null;
            c30711Il.LJLJJL = null;
        }
    }

    public final void LJIIIIZZ() {
        ViewGroup viewGroup;
        C0PO c0po = this.LJII;
        if (c0po == null) {
            return;
        }
        try {
            ViewParent parent = c0po.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(this.LJII, (ViewGroup) parent);
        } catch (Exception unused) {
        }
        WeakReference<ViewGroup> weakReference = this.LJ;
        if (weakReference != null && (viewGroup = weakReference.get()) != null) {
            C0PO c0po2 = this.LJII;
            C018905p c018905p = new C018905p(-1, C15380j0.LIZ(66.0f));
            c018905p.bottomToBottom = viewGroup.getId();
            viewGroup.addView(c0po2, c018905p);
        }
    }

    public final void LJIIIZ() {
        ViewGroup viewGroup;
        C0PR c0pr = this.LJIIIIZZ;
        if (c0pr == null) {
            return;
        }
        try {
            ViewParent parent = c0pr.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(this.LJIIIIZZ, (ViewGroup) parent);
        } catch (Exception unused) {
        }
        WeakReference<ViewGroup> weakReference = this.LJ;
        if (weakReference != null && (viewGroup = weakReference.get()) != null) {
            C0PR c0pr2 = this.LJIIIIZZ;
            C018905p c018905p = new C018905p(-1, C15380j0.LIZ(66.0f));
            c018905p.bottomToBottom = viewGroup.getId();
            viewGroup.addView(c0pr2, c018905p);
        }
    }

    @Override // X.C0TW
    public final void onDestroy() {
        C0PO c0po = this.LJII;
        if (c0po != null) {
            C29306Beo.LJI(c0po);
            C30711Il c30711Il = c0po.LJLILLLLZI;
            c30711Il.LJLJJI = null;
            c30711Il.LJLJJL = null;
        }
        C0PR c0pr = this.LJIIIIZZ;
        if (c0pr != null) {
            boolean LJIILJJIL = C29306Beo.LJIILJJIL();
            if (C29306Beo.LJJI()) {
                C12890ez.LIZ().LIZLLL = C30691Ij.LJLJJI;
            }
            c0pr.LJLJJL.getClass();
            if (LJIILJJIL) {
                C30691Ij.LJLJJI = null;
            }
            c0pr.LJLJI.lh(c0pr.LJLL);
            c0pr.LJLJLJ = null;
        }
    }

    public static final C0RT LJIIJ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return C0RT.NORMAL;
        }
        if (C77412UZs.LJJI(liveEffect)) {
            return C0RT.GREEN_SCREEN;
        }
        if (C77412UZs.LJIL(liveEffect) || C77412UZs.LJJ(liveEffect)) {
            return C0RT.ALBUM;
        }
        if (C78880UxY.LJJJZ(liveEffect)) {
            return C0RT.AVATAR;
        }
        return C0RT.NORMAL;
    }

    @Override // X.C0TW
    public final void LIZ(String panel) {
        o.LJIIIZ(panel, "panel");
        C0PR c0pr = this.LJIIIIZZ;
        if (c0pr != null) {
            c0pr.LJLJI.lh(c0pr.LJLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0TW
    public final void LIZIZ(LiveEffect liveEffect) {
        C23120vU c23120vU;
        List<? extends LiveEffect> list;
        C1XH c1xh = this.LJI;
        if (c1xh != null) {
            c23120vU = c1xh.LJIIIZ();
        } else {
            c23120vU = null;
        }
        C29306Beo.LJI(c23120vU);
        C29306Beo.LJI(this.LJII);
        C29306Beo.LJI(this.LJIIIIZZ);
        int i = C05640Ka.LIZ[LJIIJ(liveEffect).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJIIIZ();
                if (liveEffect != 0) {
                    C29306Beo.LJJLJLI(this.LJIIIIZZ);
                }
                C0PR c0pr = this.LJIIIIZZ;
                if (c0pr == null) {
                    return;
                }
                c0pr.LIZIZ(liveEffect, false);
                return;
            }
            LJIIIIZZ();
            if (liveEffect != 0) {
                C29306Beo.LJJLJLI(this.LJII);
            }
            C0PO c0po = this.LJII;
            if (c0po == null || !C77412UZs.LJIL(liveEffect) || liveEffect == 0 || (list = liveEffect.subStickers) == null) {
                return;
            }
            int i2 = 0;
            for (LiveEffect liveEffect2 : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    LiveEffect liveEffect3 = liveEffect2;
                    liveEffect3.impressionPos = Integer.valueOf(i2);
                    liveEffect3.parentImpressionPos = liveEffect.parentImpressionPos;
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((C32537Cpp) dataChannelGlobal.gv0(C2BW.class)).LIZ = liveEffect;
            ((C32537Cpp) dataChannelGlobal.gv0(C2BX.class)).LIZ = "1";
            C30711Il c30711Il = c0po.LJLILLLLZI;
            ((ArrayList) c30711Il.LJLJJLL).clear();
            ((ArrayList) c30711Il.LJLJJLL).addAll(list);
            c30711Il.notifyDataSetChanged();
            C30711Il c30711Il2 = c0po.LJLILLLLZI;
            LiveEffect liveEffect4 = (LiveEffect) ListProtector.get(c30711Il2.LJLJJLL, 0);
            c30711Il2.LJLLLLLL(liveEffect4);
            String str = c30711Il2.LJLIL;
            String STICKER_INTERACT = C0TY.LIZJ;
            if (o.LJ(str, STICKER_INTERACT)) {
                C42681lw LIZ = C12880ey.LIZ();
                o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
                Object LJLLLL = ORZ.LJLLLL(LIZ.LIZ(STICKER_INTERACT));
                if (!o.LJ(liveEffect4, LJLLLL) && LJLLLL != null) {
                    C12880ey.LIZ().LIZLLL(STICKER_INTERACT);
                }
            } else {
                LiveEffect LJIIIZ2 = C79081V1x.LJIIIZ();
                if (!o.LJ(liveEffect4, LJIIIZ2) && LJIIIZ2 != null) {
                    C42681lw LIZ2 = C12890ez.LIZ();
                    LIZ2.LIZLLL(C0TY.LIZIZ);
                    LIZ2.LIZLLL("livebackground");
                }
            }
            C0WF c0wf = c30711Il2.LJLJI;
            if (c0wf != null) {
                c0wf.LIZIZ(liveEffect4, c30711Il2.LJLIL);
            }
            c30711Il2.LJLZ(liveEffect4);
            c30711Il2.LJLJJI = liveEffect4;
            c30711Il2.notifyDataSetChanged();
            RecyclerView recyclerView = c0po.LJLJI;
            if (recyclerView == null) {
                return;
            }
            recyclerView.LJLI(0);
            return;
        }
        C1XH c1xh2 = this.LJI;
        if (c1xh2 == null) {
            return;
        }
        c1xh2.LIZIZ(liveEffect);
    }

    @Override // X.C0TW
    public final void LIZJ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.C0TW
    public final boolean LJFF(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (!C77412UZs.LJJI(liveEffect) && !C77412UZs.LJIL(liveEffect) && !C77412UZs.LJJ(liveEffect) && !C78880UxY.LJJJZ(liveEffect)) {
            return false;
        }
        return true;
    }

    @Override // X.C0TW
    public final void LJII(InterfaceC88471Ynr<? super String, ? super String, Integer> interfaceC88471Ynr) {
        this.LJFF = interfaceC88471Ynr;
    }

    @Override // X.C0TW
    public final void LJ(LiveEffect liveEffect, String panel) {
        String str;
        o.LJIIIZ(panel, "panel");
        this.LIZJ = panel;
        C0PO c0po = this.LJII;
        if (c0po != null) {
            WeakReference<DataChannel> dataChannel = this.LIZ;
            o.LJIIIZ(dataChannel, "dataChannel");
            c0po.LJLIL = panel;
            C30711Il c30711Il = c0po.LJLILLLLZI;
            c30711Il.getClass();
            c30711Il.LJLIL = panel;
            c0po.LJLILLLLZI.LJLILLLLZI = dataChannel;
        }
        C0PR c0pr = this.LJIIIIZZ;
        if (c0pr != null) {
            WeakReference<DataChannel> dataChannel2 = this.LIZ;
            InterfaceC88471Ynr<? super String, ? super String, Integer> interfaceC88471Ynr = this.LJFF;
            o.LJIIIZ(dataChannel2, "dataChannel");
            c0pr.LJLJJI = panel;
            c0pr.LJLJJL.getClass();
            c0pr.LJLJJLL = dataChannel2;
            c0pr.LJLJLJ = interfaceC88471Ynr;
        }
        String str2 = C0TY.LIZJ;
        if (o.LJ(panel, str2)) {
            this.LIZLLL = liveEffect;
        } else {
            this.LIZLLL = C79081V1x.LJIIIZ();
        }
        C1XH c1xh = this.LJI;
        if (c1xh != null) {
            c1xh.LJ(this.LIZLLL, panel);
        }
        C0PO c0po2 = this.LJII;
        if (c0po2 != null) {
            LiveEffect liveEffect2 = this.LIZLLL;
            if (!o.LJ(c0po2.LJLIL, "livebackground")) {
                if (o.LJ(c0po2.LJLIL, str2)) {
                    c0po2.LIZ(liveEffect2);
                } else {
                    List<LiveEffect> LIZ = C12890ez.LIZ().LIZ(C0TY.LIZIZ);
                    o.LJIIIIZZ(LIZ, "LiveComposerManagerProvi…cker(EffectPanel.STICKER)");
                    c0po2.LIZ((LiveEffect) ORZ.LJLLLL(LIZ));
                }
            }
        }
        C0PR c0pr2 = this.LJIIIIZZ;
        if (c0pr2 != null) {
            LiveEffect liveEffect3 = this.LIZLLL;
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(c0pr2.getContext());
            if (LIZIZ != null) {
                c0pr2.LJLJI.Ku0(LIZIZ, c0pr2.LJLL);
                c0pr2.LIZIZ(liveEffect3, true);
            }
        }
        if (o.LJ(panel, C0TY.LIZIZ) && (str = this.LIZIZ) != null) {
            C0PR c0pr3 = this.LJIIIIZZ;
            if (c0pr3 != null) {
                LiveEffect liveEffect4 = this.LIZLLL;
                c0pr3.LJLJJL.getClass();
                C30691Ij.LJLJJI = str;
                c0pr3.LJLJJL.LJLJI = liveEffect4;
            }
            this.LIZIZ = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x005a, code lost:
    
        if (r3 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    @Override // X.C0TW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r5.LJ = r0
            X.1XH r0 = r5.LJI
            if (r0 == 0) goto L12
            r0.LIZJ = r6
        L12:
            java.lang.String r0 = r5.LIZJ
            java.lang.String r4 = X.C0TY.LIZJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L53
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r3 = r5.LIZLLL
        L1e:
            r0 = 0
            r2 = 1
            if (r3 == 0) goto L35
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.getEffect()
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.getPanel()
            if (r0 == 0) goto L5c
            int r0 = r0.length()
            if (r0 <= 0) goto L5c
            r0 = 1
        L35:
            r1 = 0
            if (r0 == 0) goto L5a
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.getEffect()
            if (r0 == 0) goto L42
            java.lang.String r1 = r0.getPanel()
        L42:
            java.lang.String r0 = r5.LIZJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L5c
            java.lang.String r0 = r5.LIZJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 != 0) goto L5c
            return
        L53:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r3 = X.C79081V1x.LJIIIZ()
            if (r3 != 0) goto L1e
            return
        L5a:
            if (r3 == 0) goto L5e
        L5c:
            java.lang.String r1 = r3.effectPanelName
        L5e:
            java.lang.String r0 = "favorite"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L71
            java.lang.String r1 = r5.LIZJ
            java.lang.String r0 = "livebackground"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L71
            return
        L71:
            X.0RT r0 = LJIIJ(r3)
            int[] r1 = X.C05640Ka.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L98
            r0 = 2
            if (r1 == r0) goto L8f
            r0 = 3
            if (r1 == r0) goto L86
        L85:
            return
        L86:
            r5.LJIIIZ()
            X.0PR r0 = r5.LJIIIIZZ
            X.C29306Beo.LJJLJLI(r0)
            goto L85
        L8f:
            r5.LJIIIIZZ()
            X.0PO r0 = r5.LJII
            X.C29306Beo.LJJLJLI(r0)
            goto L85
        L98:
            X.1XH r0 = r5.LJI
            if (r0 == 0) goto L85
            r0.LJI(r6, r7)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30261Gs.LJI(android.view.ViewGroup, boolean):void");
    }

    public C30261Gs(WeakReference weakReference, WeakReference weakReference2, InterfaceC08020Te interfaceC08020Te) {
        Fragment fragment;
        C0PO c0po;
        C0PR c0pr;
        Fragment fragment2;
        Fragment fragment3;
        Fragment fragment4;
        Context context;
        Fragment fragment5;
        Context context2;
        this.LIZ = weakReference;
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        this.LIZJ = STICKER;
        DataChannel dataChannel = (DataChannel) weakReference.get();
        if (dataChannel != null && weakReference2 != null && (fragment = (Fragment) weakReference2.get()) != null && interfaceC08020Te != null) {
            this.LJI = new C1XH(dataChannel, fragment, interfaceC08020Te);
        }
        if (weakReference2 == null || (fragment5 = (Fragment) weakReference2.get()) == null || (context2 = fragment5.getContext()) == null) {
            c0po = null;
        } else {
            c0po = new C0PO(context2);
            c0po.setComposerManager(C12890ez.LIZ());
        }
        this.LJII = c0po;
        if (weakReference2 == null || (fragment4 = (Fragment) weakReference2.get()) == null || (context = fragment4.getContext()) == null) {
            c0pr = null;
        } else {
            c0pr = new C0PR(context);
        }
        this.LJIIIIZZ = c0pr;
        DataChannel dataChannel2 = (DataChannel) weakReference.get();
        if (dataChannel2 != null) {
            if (weakReference2 != null) {
                fragment2 = (Fragment) weakReference2.get();
            } else {
                fragment2 = null;
            }
            dataChannel2.ov0(fragment2, StickerPanelShowEvent.class, new IDqS416S0100000(this, 49));
            if (weakReference2 != null) {
                fragment3 = (Fragment) weakReference2.get();
            } else {
                fragment3 = null;
            }
            dataChannel2.ov0(fragment3, StickerPanelHideEvent.class, new IDqS416S0100000(this, 50));
            dataChannel2.ov0(weakReference2 != null ? (Fragment) weakReference2.get() : null, StickerShortcutPanelChannel.class, new IDqS416S0100000(this, 51));
        }
    }
}
