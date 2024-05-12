package X;

import Y.AObjectS41S0101000_2;
import Y.ARunnableS0S0202000_2;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.google.android.play.core.assetpacks.z;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153135zh extends AbstractC29891Fh<InterfaceC147905rG> implements InterfaceC147905rG, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final FrameLayout LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final C5H3 LJLJJLL;
    public final LiveEvent<C76800UCe> LJLJL;
    public final LiveEvent<OSZ<Integer, Integer>> LJLJLJ;
    public final LiveEvent<StickerItemModel> LJLJLLL;
    public final LiveEvent<C145425nG> LJLL;
    public final LiveEvent<OSZ<Float, Long>> LJLLI;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLLILLLL;
    public final LiveEvent<C76800UCe> LJLLJ;
    public final C5H3 LJLLL;

    static {
        TBT tbt = new TBT(C153135zh.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC147905rG LJJLI() {
        return this;
    }

    private final InterfaceC142515iZ LJJLIIIIJ() {
        return (InterfaceC142515iZ) this.LJLJJL.LIZ(this, LJLLLL[0]);
    }

    public final C66Y LJJLIIIJILLIZJL() {
        return (C66Y) this.LJLLL.getValue();
    }

    public final C1548165t LJJLIIIJJI() {
        return (C1548165t) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC147905rG
    public void show() {
        if (!this.LJLILLLLZI.isAdded(LJJLIIIJJI())) {
            this.LJLILLLLZI.add(this.LJLJI, LJJLIIIJJI(), "EditInfoStickerScene");
        }
    }

    @Override // X.InterfaceC147905rG
    public InterfaceC147435qV LIZ() {
        return LJJLIIIJJI().LLJJJJ();
    }

    @Override // X.InterfaceC147905rG
    public void LIZLLL() {
        LiveEvent<C76800UCe> To = To();
        o.LJII(To, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) To).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147905rG
    public void LLZIL() {
        LiveEvent<C76800UCe> v52 = v5();
        o.LJII(v52, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) v52).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147905rG
    public void Pf() {
        LiveEvent<C145425nG> Oi = Oi();
        o.LJII(Oi, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.bytedance.jedi.arch.JediUnitEvent>");
        ((C29901Fi) Oi).LJII(new C145425nG());
    }

    @Override // X.InterfaceC147905rG
    public Object V1() {
        return LJJLIIIJJI().LLJJJJ().LLIL;
    }

    @Override // X.InterfaceC147905rG
    public boolean W4() {
        C1548265u c1548265u = LJJLIIIJJI().LLJJJJ().LJLJI;
        if (c1548265u != null) {
            return c1548265u.LLIFFJFJJ;
        }
        return false;
    }

    @Override // X.InterfaceC147905rG
    public void k() {
        C66Y LLJJJJ = LJJLIIIJJI().LLJJJJ();
        if (LLJJJJ.LLFZ) {
            LLJJJJ.LJIJ();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        InterfaceC142515iZ LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            LJJLIIIIJ.yx(this);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        InterfaceC142515iZ LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            LJJLIIIIJ.yx(null);
        }
    }

    @Override // X.InterfaceC147905rG
    public boolean p2() {
        C1548265u c1548265u = LJJLIIIJJI().LLJJJJ().LJLJI;
        if (c1548265u != null) {
            return c1548265u.LLI;
        }
        return false;
    }

    @Override // X.InterfaceC147905rG
    public void y2() {
        LJJLIIIJJI().LLJJ(true);
    }

    @Override // X.InterfaceC147905rG
    public LiveEvent<StickerItemModel> Cr0() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC147905rG
    public LiveEvent<C145425nG> Oi() {
        return this.LJLL;
    }

    @Override // X.InterfaceC147905rG
    public LiveEvent<OSZ<Integer, Integer>> Ou0() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC147905rG
    public LiveEvent<C76800UCe> To() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC147905rG
    public LiveEvent<OSZ<Float, Long>> bP() {
        return this.LJLLI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC147905rG getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC147905rG
    public LiveEvent<C76800UCe> v5() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC147905rG
    public LiveEvent<OSJ<Float, Float, Float>> zm0() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC147905rG
    public void Ae(boolean z) {
        final C153065za c153065za;
        C1548265u c1548265u = LJJLIIIJJI().LLJJJJ().LJLJI;
        if (c1548265u != null && (c153065za = c1548265u.LJLJLJ) != null) {
            if (!z) {
                if (c153065za.LJ != null) {
                    Iterator it = ((ArrayList) c153065za.LIZ).iterator();
                    while (it.hasNext()) {
                        final C153075zb c153075zb = (C153075zb) it.next();
                        GX5.LIZ("infosep#setAlpha", new InterfaceC65784Pro() { // from class: X.5zf
                            public final /* synthetic */ float LJLJI = 0.0f;

                            @Override // X.InterfaceC65784Pro
                            public final Object invoke() {
                                C153065za c153065za2 = C153065za.this;
                                C153075zb c153075zb2 = c153075zb;
                                c153065za2.LJ.setInfoStickerAlpha(c153075zb2.LJLJI.getId(), this.LJLJI);
                                return null;
                            }
                        });
                        C78841Uwv.LJJIIJZLJL("infosep#setAlpha", c153065za.LJ, new InterfaceC88472Yns() { // from class: X.5zi
                            public final /* synthetic */ float LJLILLLLZI = 0.0f;

                            @Override // X.InterfaceC88472Yns
                            public final Object invoke(Object obj) {
                                C153075zb c153075zb2 = C153075zb.this;
                                float f = this.LJLILLLLZI;
                                C122034qd c122034qd = (C122034qd) obj;
                                C122024qc LJJJJLI = c122034qd.LJIIIIZZ().LJJJJLI(c153075zb2.LJLJI.uuid);
                                if (LJJJJLI != null) {
                                    LJJJJLI.LJII = f;
                                    c122034qd.LJIIIIZZ().LJIIJ(LJJJJLI);
                                    return null;
                                }
                                return null;
                            }
                        });
                    }
                }
            } else {
                c153065za.LJIIL();
            }
            c1548265u.invalidate();
        }
    }

    @Override // X.InterfaceC147905rG
    public void Eo(C66F listener) {
        o.LJIIIZ(listener, "listener");
        C1548165t LJJLIIIJJI = LJJLIIIJJI();
        LJJLIIIJJI.getClass();
        LJJLIIIJJI.LJZI = listener;
    }

    @Override // X.InterfaceC147905rG
    public void I9(InterfaceC1549166d<?> interfaceC1549166d) {
        LJJLIIIJJI().LLJJJJ().LJIILJJIL(interfaceC1549166d);
    }

    @Override // X.InterfaceC147905rG
    public void K2(InterfaceC1549166d<?> interfaceC1549166d) {
        C66Y LLJJJJ = LJJLIIIJJI().LLJJJJ();
        if (SceneExtensionsKt.LIZ(LLJJJJ.LJLILLLLZI)) {
            return;
        }
        if (LLJJJJ.LLIZLLLIL) {
            LLJJJJ.LJIILIIL(true, interfaceC1549166d);
        } else {
            LLJJJJ.LJIIL(true, interfaceC1549166d);
        }
    }

    @Override // X.InterfaceC147905rG
    public void LLLLIIIILLL(OSZ<Integer, Integer> value) {
        o.LJIIIZ(value, "value");
        LiveEvent<OSZ<Integer, Integer>> Ou0 = Ou0();
        o.LJII(Ou0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<kotlin.Int, kotlin.Int>>");
        ((C29901Fi) Ou0).LJII(value);
    }

    @Override // X.InterfaceC147905rG
    public void gg(StickerItemModel item) {
        o.LJIIIZ(item, "item");
        LiveEvent<StickerItemModel> Cr0 = Cr0();
        o.LJII(Cr0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel>");
        ((C29901Fi) Cr0).LJII(item);
    }

    @Override // X.InterfaceC147905rG
    public void k1(boolean z) {
        C1548265u c1548265u = LJJLIIIJJI().LLJJJJ().LJLJI;
        if (c1548265u != null) {
            c1548265u.LJIIIZ(z);
        }
    }

    @Override // X.InterfaceC147905rG
    public boolean wD(int i) {
        C66Y LLJJJJ = LJJLIIIJJI().LLJJJJ();
        C1548265u c1548265u = LLJJJJ.LJLJI;
        if (c1548265u != null && c1548265u.getStickNumber() + i >= LLJJJJ.LJZ) {
            C5S1 c5s1 = new C5S1(LLJJJJ.LJLJI.getContext());
            c5s1.LIZJ(R.string.hhd);
            c5s1.LJ();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC147905rG
    public void xM(int i) {
        C153065za c153065za;
        C1548265u c1548265u = LJJLIIIJJI().LLJJJJ().LJLJI;
        if (c1548265u != null && (c153065za = c1548265u.LJLJLJ) != null) {
            c153065za.LJIIJJI(i);
        }
    }

    @Override // X.InterfaceC147905rG
    public void Ey(String effectId, int i) {
        InfoStickerModel infoStickerModel;
        InterfaceC153045zY interfaceC153045zY;
        o.LJIIIZ(effectId, "effectId");
        C66Y LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        VideoPublishEditModel videoPublishEditModel = LJJLIIIJILLIZJL.LL;
        if (videoPublishEditModel != null && (infoStickerModel = videoPublishEditModel.infoStickerModel) != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            for (StickerItemModel stickerItemModel : LJJLIIIJILLIZJL.LL.infoStickerModel.stickers) {
                if (Objects.equals(stickerItemModel.stickerId, effectId) && (interfaceC153045zY = LJJLIIIJILLIZJL.LJZI) != null) {
                    C78841Uwv.LJJIIJZLJL("", interfaceC153045zY, new AObjectS41S0101000_2(i, stickerItemModel, 1));
                }
            }
        }
    }

    @Override // X.InterfaceC147905rG
    public void LLZILL(int i, boolean z) {
        C1548265u c1548265u;
        C153065za c153065za;
        InfoStickerModel infoStickerModel;
        C66Y LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        VideoPublishEditModel videoPublishEditModel = LJJLIIIJILLIZJL.LL;
        if (videoPublishEditModel != null && (infoStickerModel = videoPublishEditModel.infoStickerModel) != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            for (StickerItemModel stickerItemModel : LJJLIIIJILLIZJL.LL.infoStickerModel.stickers) {
                OSZ<Integer, Integer> LIZ = C139555dn.LIZ(stickerItemModel.uiStartTime, stickerItemModel.uiEndTime, i);
                stickerItemModel.uiStartTime = LIZ.getFirst().intValue();
                stickerItemModel.uiEndTime = LIZ.getSecond().intValue();
                InterfaceC153045zY interfaceC153045zY = LJJLIIIJILLIZJL.LJZI;
                if (interfaceC153045zY != null) {
                    stickerItemModel.startTime = interfaceC153045zY.LLFZ(LIZ.getFirst().intValue());
                    stickerItemModel.endTime = LJJLIIIJILLIZJL.LJZI.LLFZ(LIZ.getSecond().intValue());
                }
            }
        }
        if (z && (c1548265u = LJJLIIIJILLIZJL().LJLJI) != null && (c153065za = c1548265u.LJLJLJ) != null) {
            Iterator it = ((ArrayList) c153065za.LIZ).iterator();
            while (it.hasNext()) {
                C153075zb c153075zb = (C153075zb) it.next();
                if (c153075zb.LJLJI.isPin) {
                    C66T c66t = c1548265u.LLIIL;
                    if (c66t != null) {
                        c66t.LIZ(c153075zb);
                    }
                    c1548265u.LJIIIIZZ(c153075zb);
                    c153075zb.LJLJI.setPin(false);
                    C44687HgJ.LJIILJJIL(c153075zb.LJLJI.pinAlgorithmFile);
                    c153075zb.LJLJI.setPinAlgorithmFile(null);
                    C66F c66f = c1548265u.LLFZ;
                    if (c66f != null) {
                        c66f.LIZJ();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC147905rG
    public void c50(float f, long j) {
        LiveEvent<OSZ<Float, Long>> bP = bP();
        o.LJII(bP, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<kotlin.Float, kotlin.Long>>");
        ((C29901Fi) bP).LJII(new OSZ(Float.valueOf(f), Long.valueOf(j)));
    }

    @Override // X.InterfaceC147905rG
    public void je0(Effect effect, String str) {
        o.LJIIIZ(effect, "effect");
        LJJLIIIJJI().LLJILJILJ(effect, str);
    }

    @Override // X.InterfaceC147905rG
    public void IL(C121514pn param, String[] strArr, int i) {
        String str;
        o.LJIIIZ(param, "param");
        C1548165t LJJLIIIJJI = LJJLIIIJJI();
        LJJLIIIJJI.getClass();
        C66Y LLJJJJ = LJJLIIIJJI.LLJJJJ();
        C1548265u c1548265u = LLJJJJ.LJLJI;
        if (c1548265u != null) {
            if (c1548265u.getStickNumber() >= LLJJJJ.LJZ) {
                C5S1 c5s1 = new C5S1(LLJJJJ.LJLJI.getContext());
                c5s1.LIZJ(R.string.hhd);
                c5s1.LJ();
                return;
            }
            C1548265u c1548265u2 = LLJJJJ.LJLJI;
            C153065za c153065za = c1548265u2.LJLJLJ;
            if (c153065za == null) {
                return;
            }
            C153075zb c153075zb = c153065za.LIZIZ;
            if (c153075zb != null && c153075zb.LJLJJL) {
                c153075zb.LJLJJL = false;
            }
            if (strArr != null && strArr.length > 0) {
                str = strArr[0];
            } else {
                str = null;
            }
            z zVar = c153065za.LJFF;
            if (zVar.LJLILLLLZI != null) {
                c153065za.LIZLLL(i, zVar.LIZIZ(param.LJIIJJI, str, true), param.LJIILJJIL, param.LJIIJJI, str, null);
            } else {
                C121514pn c121514pn = new C121514pn();
                c121514pn.LJIIJJI = param.LJIIJJI;
                c121514pn.LJ = param.LJ;
                c121514pn.LJFF = param.LJFF;
                c121514pn.LJIILJJIL = param.LJIILJJIL;
                c121514pn.LJIILLIIL = param.LJIILLIIL;
                c121514pn.LJIILL = param.LJIILL;
                c121514pn.LJIIL = strArr;
                if (i == 27) {
                    c121514pn.LIZLLL = param.LIZLLL;
                    c121514pn.LJIIIIZZ = 1.2f;
                } else {
                    c121514pn.LIZLLL = c153065za.LJ.getDuration();
                }
                C17N.LJJI(c153065za.LJ).LJIIIIZZ().LJIJI(c121514pn);
                float f = 2;
                c153065za.LJ(param.LJIILJJIL, param.LJIIJJI, str, i, 1, c121514pn.LIZ, (param.LJ - 0.5f) * f, f * (0.5f - param.LJFF), 1.0f, 1.0f, false).LJLJI.scale = c121514pn.LJIIIIZZ;
            }
            c1548265u2.invalidate();
        }
    }

    @Override // X.InterfaceC147905rG
    public void a0(int i, int i2, int[] margins) {
        FrameLayout frameLayout;
        o.LJIIIZ(margins, "margins");
        C1548165t LJJLIIIJJI = LJJLIIIJJI();
        LJJLIIIJJI.getClass();
        C66Y LLJJJJ = LJJLIIIJJI.LLJJJJ();
        if (LLJJJJ.LJZI == null || (frameLayout = LLJJJJ.LLII) == null) {
            return;
        }
        frameLayout.post(new ARunnableS0S0202000_2(LLJJJJ, i, i2, margins, 1));
    }

    @Override // X.InterfaceC147905rG
    public void j30(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> zm0 = zm0();
        o.LJII(zm0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) zm0).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    public C153135zh(C82622Wbi diContainer, WMH parentScene, int i, FrameLayout borderLayout) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(borderLayout, "borderLayout");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = borderLayout;
        this.LJLJJL = UCI.LJII(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 476));
        this.LJLJL = new C29901Fi();
        this.LJLJLJ = new C29901Fi();
        this.LJLJLLL = new C29901Fi();
        this.LJLL = new C29901Fi();
        this.LJLLI = new C29901Fi();
        this.LJLLILLLL = new C29901Fi();
        this.LJLLJ = new C29901Fi();
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 477));
    }

    @Override // X.InterfaceC147905rG
    public void Ys(int i, final int i2, final int i3, final int i4, final int i5) {
        InfoStickerModel infoStickerModel;
        InterfaceC153045zY interfaceC153045zY;
        C66Y LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        VideoPublishEditModel videoPublishEditModel = LJJLIIIJILLIZJL.LL;
        if (videoPublishEditModel != null && (infoStickerModel = videoPublishEditModel.infoStickerModel) != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            for (final StickerItemModel stickerItemModel : LJJLIIIJILLIZJL.LL.infoStickerModel.stickers) {
                if (Objects.equals(Integer.valueOf(stickerItemModel.getId()), Integer.valueOf(i)) && (interfaceC153045zY = LJJLIIIJILLIZJL.LJZI) != null) {
                    C78841Uwv.LJJIIJZLJL("", interfaceC153045zY, new InterfaceC88472Yns() { // from class: X.5Su
                        @Override // X.InterfaceC88472Yns
                        public final Object invoke(Object obj) {
                            StickerItemModel stickerItemModel2 = StickerItemModel.this;
                            int i6 = i2;
                            int i7 = i3;
                            int i8 = i4;
                            int i9 = i5;
                            C122034qd c122034qd = (C122034qd) obj;
                            C122024qc LJJJJLI = c122034qd.LJIIIIZZ().LJJJJLI(stickerItemModel2.uuid);
                            if (LJJJJLI != null) {
                                stickerItemModel2.startTime = i6;
                                stickerItemModel2.endTime = i7;
                                stickerItemModel2.uiStartTime = i8;
                                stickerItemModel2.uiEndTime = i9;
                                LJJJJLI.LIZJ = i6;
                                LJJJJLI.LIZLLL = i7;
                                c122034qd.LJIIIIZZ().LJIIJ(LJJJJLI);
                                return null;
                            }
                            return null;
                        }
                    });
                }
            }
        }
    }

    @Override // X.InterfaceC147905rG
    public void ps(String stickerId, String path, int i, int i2, boolean z) {
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(path, "path");
        LJJLIIIJJI().LLJILJIL(stickerId, path, i, i2, z);
    }
}
